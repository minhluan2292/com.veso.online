package com.ironsource.adapters.admob;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.veso.online.data.model.XosoConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class AdMobAdapter extends AbstractAdapter implements INetworkInitCallbackListener {
    private static final String GitHash = "26489f8eb";
    private static final String VERSION = "4.3.32";
    private static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();
    private static Boolean mCCPAValue = null;
    private static Boolean mConsent = null;
    private static Integer mCoppaValue = null;
    private static Integer mEuValue = null;
    /* access modifiers changed from: private */
    public static InitState mInitState = InitState.INIT_STATE_NONE;
    private static String mRatingValue = "";
    private static AtomicBoolean mWasInitCalled = new AtomicBoolean(false);
    private final String AD_UNIT_ID = "adUnitId";
    private final String INIT_RESPONSE_REQUIRED = "initResponseRequired";
    private final String IRONSOURCE_REQUEST_AGENT = "ironSource";
    private final String NETWORK_ONLY_INIT = "networkOnlyInit";
    /* access modifiers changed from: private */
    public ConcurrentHashMap<String, AdView> mAdUnitIdToBannerAd;
    /* access modifiers changed from: private */
    public ConcurrentHashMap<String, BannerSmashListener> mAdUnitIdToBannerListener;
    public ConcurrentHashMap<String, InterstitialAd> mAdUnitIdToInterstitialAd;
    /* access modifiers changed from: private */
    public ConcurrentHashMap<String, InterstitialSmashListener> mAdUnitIdToInterstitialListener;
    public ConcurrentHashMap<String, RewardedAd> mAdUnitIdToRewardedVideoAd;
    private ConcurrentHashMap<String, RewardedVideoSmashListener> mAdUnitIdToRewardedVideoListener;
    public ConcurrentHashMap<String, Boolean> mInterstitialAdsAvailability;
    private CopyOnWriteArraySet<String> mRewardedVideoAdUnitIdsForInitCallbacks;
    public ConcurrentHashMap<String, Boolean> mRewardedVideoAdsAvailability;

    private interface AdMobMaxContentRating {
        public static final String ADMOB_MAX_AD_CONTENT_RATING_G = "max_ad_content_rating_g";
        public static final String ADMOB_MAX_AD_CONTENT_RATING_MA = "max_ad_content_rating_ma";
        public static final String ADMOB_MAX_AD_CONTENT_RATING_PG = "max_ad_content_rating_pg";
        public static final String ADMOB_MAX_AD_CONTENT_RATING_T = "max_ad_content_rating_t";
    }

    private interface AdMobMetaDataFlags {
        public static final String ADMOB_MAX_RATING_KEY = "admob_maxcontentrating";
        public static final String ADMOB_TFCD_KEY = "admob_tfcd";
        public static final String ADMOB_TFUA_KEY = "admob_tfua";
    }

    private enum InitState {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS,
        INIT_STATE_FAILED
    }

    public String getVersion() {
        return "4.3.32";
    }

    /* access modifiers changed from: protected */
    public boolean isNoFillError(int i) {
        return i == 3 || i == 9;
    }

    public void onNetworkInitCallbackLoadSuccess(String str) {
    }

    public static AdMobAdapter startAdapter(String str) {
        return new AdMobAdapter(str);
    }

    private AdMobAdapter(String str) {
        super(str);
        IronLog.INTERNAL.verbose("");
        this.mAdUnitIdToRewardedVideoListener = new ConcurrentHashMap<>();
        this.mAdUnitIdToRewardedVideoAd = new ConcurrentHashMap<>();
        this.mRewardedVideoAdsAvailability = new ConcurrentHashMap<>();
        this.mRewardedVideoAdUnitIdsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mAdUnitIdToInterstitialAd = new ConcurrentHashMap<>();
        this.mInterstitialAdsAvailability = new ConcurrentHashMap<>();
        this.mAdUnitIdToInterstitialListener = new ConcurrentHashMap<>();
        this.mAdUnitIdToBannerAd = new ConcurrentHashMap<>();
        this.mAdUnitIdToBannerListener = new ConcurrentHashMap<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    public static IntegrationData getIntegrationData(Activity activity) {
        IntegrationData integrationData = new IntegrationData("AdMob", "4.3.32");
        integrationData.activities = new String[]{AdActivity.CLASS_NAME};
        return integrationData;
    }

    public String getCoreSDKVersion() {
        return getAdapterSDKVersion();
    }

    public static String getAdapterSDKVersion() {
        return MobileAds.getVersion().toString();
    }

    /* access modifiers changed from: private */
    public void initSDK(JSONObject jSONObject) {
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            mInitState = InitState.INIT_STATE_IN_PROGRESS;
            IronLog.ADAPTER_API.verbose("");
            if (jSONObject.optBoolean("networkOnlyInit", true)) {
                IronLog.ADAPTER_API.verbose("disableMediationAdapterInitialization");
                MobileAds.disableMediationAdapterInitialization(ContextProvider.getInstance().getCurrentActiveActivity());
            }
            if (jSONObject.optBoolean("initResponseRequired", false)) {
                IronLog.ADAPTER_API.verbose("init and wait for callback");
                MobileAds.initialize(ContextProvider.getInstance().getApplicationContext(), new OnInitializationCompleteListener() {
                    public void onInitializationComplete(InitializationStatus initializationStatus) {
                        AdapterStatus adapterStatus = initializationStatus.getAdapterStatusMap().get("com.google.android.gms.ads.MobileAds");
                        if ((adapterStatus != null ? adapterStatus.getInitializationState() : null) == AdapterStatus.State.READY) {
                            IronLog.ADAPTER_API.verbose("initializationStatus = READY");
                            AdMobAdapter.this.initializationSuccess();
                            return;
                        }
                        IronLog.ADAPTER_API.verbose("initializationStatus = NOT READY");
                        AdMobAdapter.this.initializationFailure();
                    }
                });
                return;
            }
            IronLog.ADAPTER_API.verbose("init without callback");
            MobileAds.initialize(ContextProvider.getInstance().getApplicationContext());
            initializationSuccess();
        }
    }

    public void onNetworkInitCallbackSuccess() {
        for (String next : this.mAdUnitIdToRewardedVideoListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.mAdUnitIdToRewardedVideoListener.get(next);
            if (this.mRewardedVideoAdUnitIdsForInitCallbacks.contains(next)) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideoAdFromAdMob(next, rewardedVideoSmashListener);
            }
        }
        for (InterstitialSmashListener onInterstitialInitSuccess : this.mAdUnitIdToInterstitialListener.values()) {
            onInterstitialInitSuccess.onInterstitialInitSuccess();
        }
        for (BannerSmashListener onBannerInitSuccess : this.mAdUnitIdToBannerListener.values()) {
            onBannerInitSuccess.onBannerInitSuccess();
        }
    }

    public void onNetworkInitCallbackFailed(String str) {
        for (String next : this.mAdUnitIdToRewardedVideoListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.mAdUnitIdToRewardedVideoListener.get(next);
            if (this.mRewardedVideoAdUnitIdsForInitCallbacks.contains(next)) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        }
        for (InterstitialSmashListener onInterstitialInitFailed : this.mAdUnitIdToInterstitialListener.values()) {
            onInterstitialInitFailed.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        for (BannerSmashListener onBannerInitFailed : this.mAdUnitIdToBannerListener.values()) {
            onBannerInitFailed.onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.BANNER_AD_UNIT));
        }
    }

    /* access modifiers changed from: private */
    public void initializationSuccess() {
        mInitState = InitState.INIT_STATE_SUCCESS;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    /* access modifiers changed from: private */
    public void initializationFailure() {
        mInitState = InitState.INIT_STATE_FAILED;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed("AdMob sdk init failed");
        }
        initCallbackListeners.clear();
    }

    public void initRewardedVideoWithCallback(String str, String str2, final JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        final String optString = jSONObject.optString("adUnitId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + optString);
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("adUnitId is empty");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params - adUnitId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        this.mAdUnitIdToRewardedVideoListener.put(optString, rewardedVideoSmashListener);
        this.mRewardedVideoAdUnitIdsForInitCallbacks.add(optString);
        postOnUIThread(new Runnable() {
            public void run() {
                if (AdMobAdapter.mInitState == InitState.INIT_STATE_SUCCESS) {
                    rewardedVideoSmashListener.onRewardedVideoInitSuccess();
                } else if (AdMobAdapter.mInitState == InitState.INIT_STATE_FAILED) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("init failed - adUnitId = " + optString);
                    rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("AdMob sdk init failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else {
                    AdMobAdapter.this.initSDK(jSONObject);
                }
            }
        });
    }

    public void initAndLoadRewardedVideo(String str, String str2, final JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        final String optString = jSONObject.optString("adUnitId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + optString);
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("adUnitId is empty");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        this.mAdUnitIdToRewardedVideoListener.put(optString, rewardedVideoSmashListener);
        postOnUIThread(new Runnable() {
            public void run() {
                if (AdMobAdapter.mInitState == InitState.INIT_STATE_SUCCESS) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("loadVideo - adUnitId = " + optString);
                    AdMobAdapter.this.loadRewardedVideoAdFromAdMob(optString, rewardedVideoSmashListener);
                } else if (AdMobAdapter.mInitState == InitState.INIT_STATE_FAILED) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("onRewardedVideoAvailabilityChanged(false) - adUnitId = " + optString);
                    rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                } else {
                    AdMobAdapter.this.initSDK(jSONObject);
                }
            }
        });
    }

    public void fetchRewardedVideoForAutomaticLoad(final JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        postOnUIThread(new Runnable() {
            public void run() {
                AdMobAdapter.this.loadRewardedVideoAdFromAdMob(jSONObject.optString("adUnitId"), rewardedVideoSmashListener);
            }
        });
    }

    /* access modifiers changed from: private */
    public void loadRewardedVideoAdFromAdMob(String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + str);
        this.mRewardedVideoAdsAvailability.put(str, false);
        RewardedAd.load(ContextProvider.getInstance().getApplicationContext(), str, createAdRequest(), (RewardedAdLoadCallback) new AdMobRewardedVideoAdLoadListener(this, str, rewardedVideoSmashListener));
    }

    public void showRewardedVideo(final JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        postOnUIThread(new Runnable() {
            public void run() {
                String optString = jSONObject.optString("adUnitId");
                RewardedAd rewardedAd = AdMobAdapter.this.mAdUnitIdToRewardedVideoAd.get(optString);
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("adUnitId = " + optString);
                if (rewardedAd == null || !AdMobAdapter.this.isRewardedVideoAvailableForAdUnitId(optString)) {
                    rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else {
                    AdMobRewardedVideoAdShowListener adMobRewardedVideoAdShowListener = new AdMobRewardedVideoAdShowListener(AdMobAdapter.this, optString, rewardedVideoSmashListener);
                    rewardedAd.setFullScreenContentCallback(adMobRewardedVideoAdShowListener);
                    rewardedAd.show(ContextProvider.getInstance().getCurrentActiveActivity(), adMobRewardedVideoAdShowListener);
                }
                AdMobAdapter.this.mRewardedVideoAdsAvailability.put(optString, false);
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        });
    }

    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        return isRewardedVideoAvailableForAdUnitId(jSONObject.optString("adUnitId"));
    }

    /* access modifiers changed from: private */
    public boolean isRewardedVideoAvailableForAdUnitId(String str) {
        if (!TextUtils.isEmpty(str) && this.mRewardedVideoAdsAvailability.containsKey(str) && this.mRewardedVideoAdsAvailability.get(str).booleanValue()) {
            return true;
        }
        return false;
    }

    public void initInterstitial(String str, String str2, final JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        final String optString = jSONObject.optString("adUnitId");
        if (TextUtils.isEmpty(optString)) {
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params - adUnitId", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + optString);
        postOnUIThread(new Runnable() {
            public void run() {
                AdMobAdapter.this.mAdUnitIdToInterstitialListener.put(optString, interstitialSmashListener);
                if (AdMobAdapter.mInitState == InitState.INIT_STATE_SUCCESS) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("onInterstitialInitSuccess - adUnitId = " + optString);
                    interstitialSmashListener.onInterstitialInitSuccess();
                } else if (AdMobAdapter.mInitState == InitState.INIT_STATE_FAILED) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("onInterstitialInitFailed - adUnitId = " + optString);
                    interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("AdMob sdk init failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else {
                    AdMobAdapter.this.initSDK(jSONObject);
                }
            }
        });
    }

    public void loadInterstitial(final JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        postOnUIThread(new Runnable() {
            public void run() {
                String optString = jSONObject.optString("adUnitId");
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("adUnitId = " + optString);
                AdMobAdapter.this.mInterstitialAdsAvailability.put(optString, false);
                InterstitialAd.load(ContextProvider.getInstance().getApplicationContext(), optString, AdMobAdapter.this.createAdRequest(), new AdMobInterstitialAdLoadListener(AdMobAdapter.this, optString, interstitialSmashListener));
            }
        });
    }

    public void showInterstitial(final JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        postOnUIThread(new Runnable() {
            public void run() {
                String optString = jSONObject.optString("adUnitId");
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("adUnitId = " + optString);
                if (!AdMobAdapter.this.isInterstitialReadyForAdUnitId(optString)) {
                    IronLog.ADAPTER_API.error("Ad not ready to display");
                    interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    return;
                }
                InterstitialAd access$900 = AdMobAdapter.this.getInterstitialAd(optString);
                access$900.setFullScreenContentCallback(new AdMobInterstitialAdShowListener(AdMobAdapter.this, interstitialSmashListener, optString));
                access$900.show(ContextProvider.getInstance().getCurrentActiveActivity());
                AdMobAdapter.this.mInterstitialAdsAvailability.put(optString, false);
            }
        });
    }

    public final boolean isInterstitialReady(JSONObject jSONObject) {
        return isInterstitialReadyForAdUnitId(jSONObject.optString("adUnitId"));
    }

    /* access modifiers changed from: private */
    public boolean isInterstitialReadyForAdUnitId(String str) {
        if (!TextUtils.isEmpty(str) && this.mInterstitialAdsAvailability.containsKey(str) && this.mInterstitialAdsAvailability.get(str).booleanValue()) {
            return true;
        }
        return false;
    }

    public void initBanners(String str, String str2, final JSONObject jSONObject, final BannerSmashListener bannerSmashListener) {
        final String optString = jSONObject.optString("adUnitId");
        if (TextUtils.isEmpty(optString)) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params - adUnitId", IronSourceConstants.BANNER_AD_UNIT));
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + optString);
        postOnUIThread(new Runnable() {
            public void run() {
                AdMobAdapter.this.mAdUnitIdToBannerListener.put(optString, bannerSmashListener);
                if (AdMobAdapter.mInitState == InitState.INIT_STATE_SUCCESS) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("onBannerInitSuccess - adUnitId = " + optString);
                    bannerSmashListener.onBannerInitSuccess();
                } else if (AdMobAdapter.mInitState == InitState.INIT_STATE_FAILED) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("onBannerInitFailed - adUnitId = " + optString);
                    bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("AdMob sdk init failed", IronSourceConstants.BANNER_AD_UNIT));
                } else {
                    AdMobAdapter.this.initSDK(jSONObject);
                }
            }
        });
    }

    public void loadBanner(final IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, final BannerSmashListener bannerSmashListener) {
        if (ironSourceBannerLayout == null) {
            IronLog.ADAPTER_API.error("banner is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner is null"));
            return;
        }
        final String optString = jSONObject.optString("adUnitId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + optString);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    AdSize access$1100 = AdMobAdapter.this.getAdSize(ironSourceBannerLayout.getSize(), AdapterUtils.isLargeScreen(ironSourceBannerLayout.getActivity()));
                    if (access$1100 == null) {
                        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize("AdMob"));
                        return;
                    }
                    AdView adView = new AdView(ironSourceBannerLayout.getActivity());
                    adView.setAdSize(access$1100);
                    adView.setAdUnitId(optString);
                    adView.setAdListener(new AdMobBannerAdListener(AdMobAdapter.this, bannerSmashListener, optString, adView));
                    AdMobAdapter.this.mAdUnitIdToBannerAd.put(optString, adView);
                    AdRequest access$700 = AdMobAdapter.this.createAdRequest();
                    IronLog.ADAPTER_API.verbose("loadAd");
                    adView.loadAd(access$700);
                } catch (Exception e) {
                    bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("AdMobAdapter loadBanner exception " + e.getMessage()));
                }
            }
        });
    }

    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.INTERNAL.warning("Unsupported method");
    }

    public void destroyBanner(final JSONObject jSONObject) {
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    String optString = jSONObject.optString("adUnitId");
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose("adUnitId = " + optString);
                    if (AdMobAdapter.this.mAdUnitIdToBannerAd.containsKey(optString)) {
                        AdView adView = (AdView) AdMobAdapter.this.mAdUnitIdToBannerAd.get(optString);
                        if (adView != null) {
                            adView.destroy();
                        }
                        AdMobAdapter.this.mAdUnitIdToBannerAd.remove(optString);
                    }
                } catch (Exception e) {
                    IronLog ironLog2 = IronLog.ADAPTER_API;
                    ironLog2.error("e = " + e);
                }
            }
        });
    }

    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + ad_unit);
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            for (RewardedAd fullScreenContentCallback : this.mAdUnitIdToRewardedVideoAd.values()) {
                fullScreenContentCallback.setFullScreenContentCallback((FullScreenContentCallback) null);
            }
            this.mAdUnitIdToRewardedVideoAd.clear();
            this.mAdUnitIdToRewardedVideoListener.clear();
            this.mRewardedVideoAdsAvailability.clear();
            this.mRewardedVideoAdUnitIdsForInitCallbacks.clear();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            for (InterstitialAd fullScreenContentCallback2 : this.mAdUnitIdToInterstitialAd.values()) {
                fullScreenContentCallback2.setFullScreenContentCallback((FullScreenContentCallback) null);
            }
            this.mAdUnitIdToInterstitialAd.clear();
            this.mAdUnitIdToInterstitialListener.clear();
            this.mInterstitialAdsAvailability.clear();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            postOnUIThread(new Runnable() {
                public void run() {
                    for (AdView destroy : AdMobAdapter.this.mAdUnitIdToBannerAd.values()) {
                        destroy.destroy();
                    }
                    AdMobAdapter.this.mAdUnitIdToBannerAd.clear();
                    AdMobAdapter.this.mAdUnitIdToBannerListener.clear();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void setConsent(boolean z) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("consent = " + z);
        mConsent = Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public void setMetaData(String str, List<String> list) {
        if (!list.isEmpty()) {
            String str2 = list.get(0);
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("key = " + str + ", value = " + str2);
            if (MetaDataUtils.isValidCCPAMetaData(str, str2)) {
                setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str2));
            } else {
                setAdMobMetaDataValue(str.toLowerCase(Locale.ENGLISH), str2.toLowerCase(Locale.ENGLISH));
            }
        }
    }

    private void setCCPAValue(boolean z) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + z);
        mCCPAValue = Boolean.valueOf(z);
    }

    private void setAdMobMetaDataValue(String str, String str2) {
        if (AdMobMetaDataFlags.ADMOB_TFCD_KEY.equals(str) || AdMobMetaDataFlags.ADMOB_TFUA_KEY.equals(str)) {
            String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
            if (TextUtils.isEmpty(formatValueForType)) {
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("MetaData value for key " + str + " is invalid " + str2);
                return;
            }
            str2 = formatValueForType;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -139240332:
                if (str.equals(AdMobMetaDataFlags.ADMOB_MAX_RATING_KEY)) {
                    c = 0;
                    break;
                }
                break;
            case 1374613845:
                if (str.equals(AdMobMetaDataFlags.ADMOB_TFCD_KEY)) {
                    c = 1;
                    break;
                }
                break;
            case 1374614400:
                if (str.equals(AdMobMetaDataFlags.ADMOB_TFUA_KEY)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mRatingValue = getAdMobRatingValue(str2);
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.verbose("key = " + str + ", ratingValue = " + mRatingValue);
                break;
            case 1:
                mCoppaValue = Integer.valueOf(getAdMobCoppaValue(str2));
                IronLog ironLog3 = IronLog.ADAPTER_API;
                ironLog3.verbose("key = " + str + ", coppaValue = " + mCoppaValue);
                break;
            case 2:
                mEuValue = Integer.valueOf(getAdMobEuValue(str2));
                IronLog ironLog4 = IronLog.ADAPTER_API;
                ironLog4.verbose("key = " + str + ", euValue = " + mEuValue);
                break;
        }
        setRequestConfiguration();
    }

    private int getAdMobCoppaValue(String str) {
        return MetaDataUtils.getMetaDataBooleanValue(str) ? 1 : 0;
    }

    private int getAdMobEuValue(String str) {
        return MetaDataUtils.getMetaDataBooleanValue(str) ? 1 : 0;
    }

    private String getAdMobRatingValue(String str) {
        if (TextUtils.isEmpty(str)) {
            IronLog.INTERNAL.error("The ratingValue is null");
            return null;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1038878193:
                if (str.equals(AdMobMaxContentRating.ADMOB_MAX_AD_CONTENT_RATING_MA)) {
                    c = 0;
                    break;
                }
                break;
            case -1038878094:
                if (str.equals(AdMobMaxContentRating.ADMOB_MAX_AD_CONTENT_RATING_PG)) {
                    c = 1;
                    break;
                }
                break;
            case 936319116:
                if (str.equals(AdMobMaxContentRating.ADMOB_MAX_AD_CONTENT_RATING_G)) {
                    c = 2;
                    break;
                }
                break;
            case 936319129:
                if (str.equals(AdMobMaxContentRating.ADMOB_MAX_AD_CONTENT_RATING_T)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return RequestConfiguration.MAX_AD_CONTENT_RATING_MA;
            case 1:
                return RequestConfiguration.MAX_AD_CONTENT_RATING_PG;
            case 2:
                return RequestConfiguration.MAX_AD_CONTENT_RATING_G;
            case 3:
                return RequestConfiguration.MAX_AD_CONTENT_RATING_T;
            default:
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("The ratingValue = " + str + " is undefine");
                return "";
        }
    }

    /* access modifiers changed from: private */
    public AdRequest createAdRequest() {
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.setRequestAgent("ironSource");
        setRequestConfiguration();
        if (!(mConsent == null && mCCPAValue == null)) {
            Bundle bundle = new Bundle();
            Boolean bool = mConsent;
            if (bool != null && !bool.booleanValue()) {
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("mConsent = " + mConsent);
                bundle.putString("npa", XosoConfig.REGION_ID_SOUTH);
            }
            if (mCCPAValue != null) {
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.verbose("mCCPAValue = " + mCCPAValue);
                bundle.putInt("rdp", mCCPAValue.booleanValue() ? 1 : 0);
            }
            builder.addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle);
        }
        return builder.build();
    }

    private void setRequestConfiguration() {
        RequestConfiguration.Builder builder = MobileAds.getRequestConfiguration().toBuilder();
        Integer num = mCoppaValue;
        RequestConfiguration build = num != null ? builder.setTagForChildDirectedTreatment(num.intValue()).build() : null;
        Integer num2 = mEuValue;
        if (num2 != null) {
            build = builder.setTagForUnderAgeOfConsent(num2.intValue()).build();
        }
        if (!TextUtils.isEmpty(mRatingValue)) {
            build = builder.setMaxAdContentRating(mRatingValue).build();
        }
        if (build != null) {
            MobileAds.setRequestConfiguration(build);
        }
    }

    /* access modifiers changed from: private */
    public AdSize getAdSize(ISBannerSize iSBannerSize, boolean z) {
        AdSize adSize;
        String description = iSBannerSize.getDescription();
        description.hashCode();
        char c = 65535;
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals("RECTANGLE")) {
                    c = 0;
                    break;
                }
                break;
            case 72205083:
                if (description.equals("LARGE")) {
                    c = 1;
                    break;
                }
                break;
            case 79011241:
                if (description.equals("SMART")) {
                    c = 2;
                    break;
                }
                break;
            case 1951953708:
                if (description.equals("BANNER")) {
                    c = 3;
                    break;
                }
                break;
            case 1999208305:
                if (description.equals("CUSTOM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                adSize = AdSize.MEDIUM_RECTANGLE;
                break;
            case 1:
                adSize = AdSize.LARGE_BANNER;
                break;
            case 2:
                if (!z) {
                    adSize = AdSize.BANNER;
                    break;
                } else {
                    adSize = AdSize.LEADERBOARD;
                    break;
                }
            case 3:
                adSize = AdSize.BANNER;
                break;
            case 4:
                adSize = new AdSize(iSBannerSize.getWidth(), iSBannerSize.getHeight());
                break;
            default:
                adSize = null;
                break;
        }
        try {
            if (iSBannerSize.isAdaptive() && adSize != null) {
                AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(ContextProvider.getInstance().getApplicationContext(), adSize.getWidth());
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("original height - " + adSize.getHeight() + " adaptive height - " + currentOrientationAnchoredAdaptiveBannerAdSize.getHeight());
                return currentOrientationAnchoredAdaptiveBannerAdSize;
            }
        } catch (NoSuchMethodError unused) {
            IronLog.INTERNAL.verbose("adaptive banners are not supported on Ironsource sdk versions earlier than 7.1.14");
        }
        return adSize;
    }

    /* access modifiers changed from: private */
    public InterstitialAd getInterstitialAd(String str) {
        if (TextUtils.isEmpty(str) || !this.mAdUnitIdToInterstitialAd.containsKey(str)) {
            return null;
        }
        return this.mAdUnitIdToInterstitialAd.get(str);
    }
}
