package com.ironsource.adapters.facebook;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
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
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class FacebookAdapter extends AbstractAdapter implements INetworkInitCallbackListener, AudienceNetworkAds.InitListener {
    private static final String GitHash = "4edd0f021";
    private static final String MEDIATION_NAME = "ironSource";
    protected static final String META_NETWORK_NAME = "Facebook";
    private static final String VERSION = "4.3.38";
    protected static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();
    protected static InitState mInitState = InitState.INIT_STATE_NONE;
    protected static EnumSet<CacheFlag> mInterstitialFacebookCacheFlags = EnumSet.allOf(CacheFlag.class);
    protected static AtomicBoolean mWasInitCalled = new AtomicBoolean(false);
    protected final String ALL_PLACEMENT_IDS = "placementIds";
    protected final String FACEBOOK_INTERSTITIAL_CACHE_FLAG = "facebook_is_cacheflag";
    protected final String META_INTERSTITIAL_CACHE_FLAG = "meta_is_cacheflag";
    protected final String META_MIXED_AUDIENCE = "meta_mixed_audience";
    protected final String PLACEMENT_ID = "placementId";
    protected ConcurrentHashMap<String, AdView> mBannerPlacementIdToAd;
    protected ConcurrentHashMap<String, BannerSmashListener> mBannerPlacementIdToSmashListener;
    protected ConcurrentHashMap<String, Boolean> mInterstitialAdsAvailability;
    protected ConcurrentHashMap<String, Boolean> mInterstitialPlacementIdShowCalled;
    protected ConcurrentHashMap<String, InterstitialAd> mInterstitialPlacementIdToAd;
    protected ConcurrentHashMap<String, FacebookInterstitialAdListener> mInterstitialPlacementIdToFacebookAdListener;
    protected ConcurrentHashMap<String, InterstitialSmashListener> mInterstitialPlacementIdToSmashListener;
    protected ConcurrentHashMap<String, Boolean> mRewardedVideoAdsAvailability;
    protected ConcurrentHashMap<String, Boolean> mRewardedVideoPlacementIdShowCalled;
    protected ConcurrentHashMap<String, RewardedVideoAd> mRewardedVideoPlacementIdToAd;
    protected ConcurrentHashMap<String, FacebookRewardedVideoAdListener> mRewardedVideoPlacementIdToFacebookAdListener;
    protected ConcurrentHashMap<String, RewardedVideoSmashListener> mRewardedVideoPlacementIdToSmashListener;
    protected CopyOnWriteArraySet<String> mRewardedVideoPlacementIdsForInitCallbacks;

    protected enum InitState {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS,
        INIT_STATE_FAILED
    }

    public static String getAdapterSDKVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public String getVersion() {
        return "4.3.38";
    }

    public void onNetworkInitCallbackLoadSuccess(String str) {
    }

    public static FacebookAdapter startAdapter(String str) {
        return new FacebookAdapter(str);
    }

    private FacebookAdapter(String str) {
        super(str);
        IronLog.INTERNAL.verbose("");
        this.mRewardedVideoPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementIdToAd = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementIdToFacebookAdListener = new ConcurrentHashMap<>();
        this.mRewardedVideoAdsAvailability = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementIdsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mRewardedVideoPlacementIdShowCalled = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdToAd = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdToFacebookAdListener = new ConcurrentHashMap<>();
        this.mInterstitialAdsAvailability = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdShowCalled = new ConcurrentHashMap<>();
        this.mBannerPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mBannerPlacementIdToAd = new ConcurrentHashMap<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    public static IntegrationData getIntegrationData(Activity activity) {
        return new IntegrationData(META_NETWORK_NAME, "4.3.38");
    }

    public String getCoreSDKVersion() {
        return getAdapterSDKVersion();
    }

    private void initSDK(String str) {
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            List asList = Arrays.asList(str.split(","));
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("Initialize Meta with placement ids = " + asList.toString());
            AudienceNetworkAds.buildInitSettings(ContextProvider.getInstance().getApplicationContext()).withInitListener(this).withMediationService(getMediationServiceInfo()).withPlacementIds(asList).initialize();
        }
    }

    public void onNetworkInitCallbackSuccess() {
        for (String next : this.mRewardedVideoPlacementIdToSmashListener.keySet()) {
            if (this.mRewardedVideoPlacementIdsForInitCallbacks.contains(next)) {
                this.mRewardedVideoPlacementIdToSmashListener.get(next).onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideoInternal(next, (String) null);
            }
        }
        for (InterstitialSmashListener onInterstitialInitSuccess : this.mInterstitialPlacementIdToSmashListener.values()) {
            onInterstitialInitSuccess.onInterstitialInitSuccess();
        }
        for (BannerSmashListener onBannerInitSuccess : this.mBannerPlacementIdToSmashListener.values()) {
            onBannerInitSuccess.onBannerInitSuccess();
        }
    }

    public void onNetworkInitCallbackFailed(String str) {
        for (String next : this.mRewardedVideoPlacementIdToSmashListener.keySet()) {
            if (this.mRewardedVideoPlacementIdsForInitCallbacks.contains(next)) {
                this.mRewardedVideoPlacementIdToSmashListener.get(next).onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                this.mRewardedVideoPlacementIdToSmashListener.get(next).onRewardedVideoAvailabilityChanged(false);
            }
        }
        for (InterstitialSmashListener onInterstitialInitFailed : this.mInterstitialPlacementIdToSmashListener.values()) {
            onInterstitialInitFailed.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        for (BannerSmashListener onBannerInitFailed : this.mBannerPlacementIdToSmashListener.values()) {
            onBannerInitFailed.onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.BANNER_AD_UNIT));
        }
    }

    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("init SDK is completed with status: " + initResult.isSuccess() + ", " + initResult.getMessage());
        if (initResult.isSuccess()) {
            mInitState = InitState.INIT_STATE_SUCCESS;
            Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
            while (it.hasNext()) {
                it.next().onNetworkInitCallbackSuccess();
            }
        } else {
            mInitState = InitState.INIT_STATE_FAILED;
            Iterator<INetworkInitCallbackListener> it2 = initCallbackListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onNetworkInitCallbackFailed(initResult.getMessage());
            }
        }
        initCallbackListeners.clear();
    }

    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("placementId");
        String optString2 = jSONObject.optString("placementIds");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("missing params - placementId");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params - placementId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("missing params - placementIds");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params - placementIds", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("placementId = " + optString);
            this.mRewardedVideoPlacementIdToFacebookAdListener.put(optString, new FacebookRewardedVideoAdListener(this, rewardedVideoSmashListener, optString));
            this.mRewardedVideoPlacementIdToSmashListener.put(optString, rewardedVideoSmashListener);
            this.mRewardedVideoPlacementIdsForInitCallbacks.add(optString);
            int i = AnonymousClass7.$SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState[mInitState.ordinal()];
            if (i == 1 || i == 2) {
                initSDK(optString2);
            } else if (i == 3) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else if (i == 4) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("init failed - placementId = " + optString);
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Meta SDK init failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
        }
    }

    /* renamed from: com.ironsource.adapters.facebook.FacebookAdapter$7  reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ironsource.adapters.facebook.FacebookAdapter$InitState[] r0 = com.ironsource.adapters.facebook.FacebookAdapter.InitState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState = r0
                com.ironsource.adapters.facebook.FacebookAdapter$InitState r1 = com.ironsource.adapters.facebook.FacebookAdapter.InitState.INIT_STATE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.adapters.facebook.FacebookAdapter$InitState r1 = com.ironsource.adapters.facebook.FacebookAdapter.InitState.INIT_STATE_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.adapters.facebook.FacebookAdapter$InitState r1 = com.ironsource.adapters.facebook.FacebookAdapter.InitState.INIT_STATE_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ironsource.adapters.facebook.FacebookAdapter$InitState r1 = com.ironsource.adapters.facebook.FacebookAdapter.InitState.INIT_STATE_FAILED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.facebook.FacebookAdapter.AnonymousClass7.<clinit>():void");
        }
    }

    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("placementId");
        String optString2 = jSONObject.optString("placementIds");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("missing params = placementId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        } else if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("missing params = placementIds");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("placementId = " + optString);
            this.mRewardedVideoPlacementIdToFacebookAdListener.put(optString, new FacebookRewardedVideoAdListener(this, rewardedVideoSmashListener, optString));
            this.mRewardedVideoPlacementIdToSmashListener.put(optString, rewardedVideoSmashListener);
            int i = AnonymousClass7.$SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState[mInitState.ordinal()];
            if (i == 1 || i == 2) {
                initSDK(optString2);
            } else if (i == 3) {
                loadRewardedVideoInternal(optString, (String) null);
            } else if (i == 4) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("init failed - placementId = " + optString);
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    public void loadRewardedVideoForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        String optString = jSONObject.optString("placementId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        loadRewardedVideoInternal(optString, str);
    }

    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("placementId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        loadRewardedVideoInternal(optString, (String) null);
    }

    private void loadRewardedVideoInternal(final String str, final String str2) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + str);
        this.mRewardedVideoAdsAvailability.put(str, false);
        this.mRewardedVideoPlacementIdShowCalled.put(str, false);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    if (FacebookAdapter.this.mRewardedVideoPlacementIdToAd.containsKey(str)) {
                        IronLog ironLog = IronLog.ADAPTER_API;
                        ironLog.verbose("destroying previous ad with placement id " + str);
                        FacebookAdapter.this.mRewardedVideoPlacementIdToAd.get(str).destroy();
                        FacebookAdapter.this.mRewardedVideoPlacementIdToAd.remove(str);
                    }
                    RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(ContextProvider.getInstance().getApplicationContext(), str);
                    RewardedVideoAd.RewardedVideoAdLoadConfigBuilder buildLoadAdConfig = rewardedVideoAd.buildLoadAdConfig();
                    buildLoadAdConfig.withAdListener(FacebookAdapter.this.mRewardedVideoPlacementIdToFacebookAdListener.get(str));
                    if (!TextUtils.isEmpty(str2)) {
                        buildLoadAdConfig.withBid(str2);
                    }
                    if (!TextUtils.isEmpty(FacebookAdapter.this.getDynamicUserId())) {
                        buildLoadAdConfig.withRewardData(new RewardData(FacebookAdapter.this.getDynamicUserId(), ""));
                    }
                    FacebookAdapter.this.mRewardedVideoPlacementIdToAd.put(str, rewardedVideoAd);
                    rewardedVideoAd.loadAd(buildLoadAdConfig.build());
                } catch (Exception unused) {
                    if (FacebookAdapter.this.mRewardedVideoPlacementIdToSmashListener.containsKey(str)) {
                        FacebookAdapter.this.mRewardedVideoPlacementIdToSmashListener.get(str).onRewardedVideoAvailabilityChanged(false);
                    }
                }
            }
        });
    }

    public void showRewardedVideo(JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        final String optString = jSONObject.optString("placementId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    FacebookAdapter.this.mRewardedVideoAdsAvailability.put(optString, false);
                    rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                    RewardedVideoAd rewardedVideoAd = FacebookAdapter.this.mRewardedVideoPlacementIdToAd.get(optString);
                    if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded() || rewardedVideoAd.isAdInvalidated()) {
                        rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                        return;
                    }
                    FacebookAdapter.this.mRewardedVideoPlacementIdShowCalled.put(optString, true);
                    rewardedVideoAd.show();
                } catch (Exception e) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("ex.getMessage() = " + e.getMessage());
                    rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, e.getMessage()));
                }
            }
        });
    }

    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        String optString = jSONObject.optString("placementId");
        return this.mRewardedVideoAdsAvailability.containsKey(optString) && this.mRewardedVideoAdsAvailability.get(optString).booleanValue();
    }

    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        initInterstitial(str, str2, jSONObject, interstitialSmashListener);
    }

    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String optString = jSONObject.optString("placementId");
        String optString2 = jSONObject.optString("placementIds");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("missing params = placementId");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params - placementId", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        } else if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("missing params = placementIds");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params - placementIds", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("placementId = " + optString);
            this.mInterstitialPlacementIdToFacebookAdListener.put(optString, new FacebookInterstitialAdListener(this, interstitialSmashListener, optString));
            this.mInterstitialPlacementIdToSmashListener.put(optString, interstitialSmashListener);
            int i = AnonymousClass7.$SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState[mInitState.ordinal()];
            if (i == 1 || i == 2) {
                initSDK(optString2);
            } else if (i == 3) {
                interstitialSmashListener.onInterstitialInitSuccess();
            } else if (i == 4) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("init failed - placementId = " + optString);
                interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Meta SDK init failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        }
    }

    public void loadInterstitialForBidding(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
        IronLog.ADAPTER_API.verbose("");
        loadInterstitialInternal(interstitialSmashListener, jSONObject, str);
    }

    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        loadInterstitialInternal(interstitialSmashListener, jSONObject, (String) null);
    }

    private void loadInterstitialInternal(final InterstitialSmashListener interstitialSmashListener, JSONObject jSONObject, final String str) {
        final String optString = jSONObject.optString("placementId");
        this.mInterstitialPlacementIdShowCalled.put(optString, false);
        this.mInterstitialAdsAvailability.put(optString, false);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    if (FacebookAdapter.this.mInterstitialPlacementIdToAd.containsKey(optString)) {
                        IronLog ironLog = IronLog.ADAPTER_API;
                        ironLog.verbose("destroying previous ad with placement id " + optString);
                        FacebookAdapter.this.mInterstitialPlacementIdToAd.get(optString).destroy();
                        FacebookAdapter.this.mInterstitialPlacementIdToAd.remove(optString);
                    }
                    InterstitialAd interstitialAd = new InterstitialAd(ContextProvider.getInstance().getApplicationContext(), optString);
                    InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig = interstitialAd.buildLoadAdConfig();
                    buildLoadAdConfig.withCacheFlags(FacebookAdapter.mInterstitialFacebookCacheFlags);
                    buildLoadAdConfig.withAdListener(FacebookAdapter.this.mInterstitialPlacementIdToFacebookAdListener.get(optString));
                    if (!TextUtils.isEmpty(str)) {
                        buildLoadAdConfig.withBid(str);
                    }
                    IronLog ironLog2 = IronLog.ADAPTER_API;
                    ironLog2.verbose("loading placementId = " + optString + " with facebook cache flags = " + FacebookAdapter.mInterstitialFacebookCacheFlags.toString());
                    interstitialAd.loadAd(buildLoadAdConfig.build());
                    FacebookAdapter.this.mInterstitialPlacementIdToAd.put(optString, interstitialAd);
                } catch (Exception e) {
                    interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(e.getLocalizedMessage()));
                }
            }
        });
    }

    public void showInterstitial(JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        final String optString = jSONObject.optString("placementId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        this.mInterstitialAdsAvailability.put(optString, false);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    InterstitialAd interstitialAd = FacebookAdapter.this.mInterstitialPlacementIdToAd.get(optString);
                    if (interstitialAd == null || !interstitialAd.isAdLoaded() || interstitialAd.isAdInvalidated()) {
                        interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    }
                    FacebookAdapter.this.mInterstitialPlacementIdShowCalled.put(optString, true);
                    interstitialAd.show();
                } catch (Exception e) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("ex.getMessage() = " + e.getMessage());
                    interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, e.getMessage()));
                }
            }
        });
    }

    public boolean isInterstitialReady(JSONObject jSONObject) {
        String optString = jSONObject.optString("placementId");
        return this.mInterstitialAdsAvailability.containsKey(optString) && this.mInterstitialAdsAvailability.get(optString).booleanValue();
    }

    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    private void initBannersInternal(JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String optString = jSONObject.optString("placementId");
        String optString2 = jSONObject.optString("placementIds");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("missing params = placementId");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params - placementId", IronSourceConstants.BANNER_AD_UNIT));
        } else if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("missing params = placementIds");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params - placementIds", IronSourceConstants.BANNER_AD_UNIT));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("placementId = " + optString);
            this.mBannerPlacementIdToSmashListener.put(optString, bannerSmashListener);
            int i = AnonymousClass7.$SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState[mInitState.ordinal()];
            if (i == 1 || i == 2) {
                initSDK(optString2);
            } else if (i == 3) {
                bannerSmashListener.onBannerInitSuccess();
            } else if (i == 4) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("init failed - placementId = " + optString);
                bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Meta SDK init failed", IronSourceConstants.BANNER_AD_UNIT));
            }
        }
    }

    public void loadBannerForBidding(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        IronLog.ADAPTER_API.verbose("");
        loadBannerInternal(ironSourceBannerLayout, jSONObject, bannerSmashListener, str);
    }

    public void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        loadBannerInternal(ironSourceBannerLayout, jSONObject, bannerSmashListener, (String) null);
    }

    private void loadBannerInternal(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        final String optString = jSONObject.optString("placementId");
        if (ironSourceBannerLayout == null) {
            IronLog.INTERNAL.error("banner is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner is null"));
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        final AdSize calculateBannerSize = calculateBannerSize(ironSourceBannerLayout.getSize(), ironSourceBannerLayout.getActivity());
        if (calculateBannerSize == null) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("loadBanner - size not supported, size = " + ironSourceBannerLayout.getSize().getDescription());
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
            return;
        }
        final IronSourceBannerLayout ironSourceBannerLayout2 = ironSourceBannerLayout;
        final BannerSmashListener bannerSmashListener2 = bannerSmashListener;
        final String str2 = str;
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    AdView adView = new AdView((Context) ironSourceBannerLayout2.getActivity(), optString, calculateBannerSize);
                    FacebookBannerAdListener facebookBannerAdListener = new FacebookBannerAdListener(FacebookAdapter.this, bannerSmashListener2, optString, FacebookAdapter.this.calcLayoutParams(ironSourceBannerLayout2.getSize(), ironSourceBannerLayout2.getActivity()));
                    AdView.AdViewLoadConfigBuilder buildLoadAdConfig = adView.buildLoadAdConfig();
                    buildLoadAdConfig.withAdListener(facebookBannerAdListener);
                    String str = str2;
                    if (str != null) {
                        buildLoadAdConfig.withBid(str);
                    }
                    FacebookAdapter.this.mBannerPlacementIdToAd.put(optString, adView);
                    adView.loadAd(buildLoadAdConfig.build());
                } catch (Exception e) {
                    bannerSmashListener2.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Meta loadBanner exception " + e.getMessage()));
                }
            }
        });
    }

    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.INTERNAL.warning("Unsupported method");
    }

    public void destroyBanner(JSONObject jSONObject) {
        final String optString = jSONObject.optString("placementId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    if (FacebookAdapter.this.mBannerPlacementIdToAd.containsKey(optString)) {
                        FacebookAdapter.this.mBannerPlacementIdToAd.get(optString).destroy();
                        FacebookAdapter.this.mBannerPlacementIdToAd.remove(optString);
                    }
                } catch (Exception e) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("destroyBanner failed for placementId - " + optString + " with an exception = " + e);
                }
            }
        });
    }

    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + ad_unit);
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            for (RewardedVideoAd destroy : this.mRewardedVideoPlacementIdToAd.values()) {
                destroy.destroy();
            }
            this.mRewardedVideoPlacementIdToAd.clear();
            this.mRewardedVideoPlacementIdToFacebookAdListener.clear();
            this.mRewardedVideoPlacementIdToSmashListener.clear();
            this.mRewardedVideoAdsAvailability.clear();
            this.mRewardedVideoPlacementIdsForInitCallbacks.clear();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            for (InterstitialAd destroy2 : this.mInterstitialPlacementIdToAd.values()) {
                destroy2.destroy();
            }
            this.mInterstitialPlacementIdToAd.clear();
            this.mInterstitialPlacementIdToFacebookAdListener.clear();
            this.mInterstitialPlacementIdToSmashListener.clear();
            this.mInterstitialAdsAvailability.clear();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            for (AdView destroy3 : this.mBannerPlacementIdToAd.values()) {
                destroy3.destroy();
            }
            this.mBannerPlacementIdToAd.clear();
            this.mBannerPlacementIdToSmashListener.clear();
        }
    }

    /* access modifiers changed from: protected */
    public void setMetaData(String str, List<String> list) {
        if (!list.isEmpty()) {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            lowerCase.hashCode();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -2119383230:
                    if (lowerCase.equals("meta_mixed_audience")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1227342573:
                    if (lowerCase.equals("meta_is_cacheflag")) {
                        c = 1;
                        break;
                    }
                    break;
                case 5585394:
                    if (lowerCase.equals("facebook_is_cacheflag")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    String str2 = list.get(0);
                    IronLog.ADAPTER_API.verbose("key = " + str + ", value = " + str2);
                    String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
                    if (isValidMixedAudienceMetaData(formatValueForType)) {
                        setMixedAudience(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
                        return;
                    }
                    return;
                case 1:
                case 2:
                    IronLog.ADAPTER_API.verbose("key = " + str + ", values = " + list);
                    mInterstitialFacebookCacheFlags.clear();
                    try {
                        for (String next : list) {
                            CacheFlag facebookCacheFlag = getFacebookCacheFlag(next);
                            IronLog.ADAPTER_API.verbose("flag for value " + next + " is " + facebookCacheFlag.name());
                            mInterstitialFacebookCacheFlags.add(facebookCacheFlag);
                        }
                        return;
                    } catch (Exception unused) {
                        IronLog.INTERNAL.error("flag is unknown or all, set all as default");
                        mInterstitialFacebookCacheFlags = getFacebookAllCacheFlags();
                        return;
                    }
                default:
                    return;
            }
        }
    }

    private CacheFlag getFacebookCacheFlag(String str) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + str);
        return CacheFlag.valueOf(str.toUpperCase(Locale.ENGLISH));
    }

    private EnumSet<CacheFlag> getFacebookAllCacheFlags() {
        IronLog.ADAPTER_API.verbose("");
        return EnumSet.allOf(CacheFlag.class);
    }

    private void setMixedAudience(boolean z) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("isMixedAudience = " + z);
        AdSettings.setMixedAudience(z);
    }

    private boolean isValidMixedAudienceMetaData(String str) {
        return !TextUtils.isEmpty(str);
    }

    private AdSize calculateBannerSize(ISBannerSize iSBannerSize, Activity activity) {
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
                return AdSize.RECTANGLE_HEIGHT_250;
            case 1:
                return AdSize.BANNER_HEIGHT_90;
            case 2:
                return AdapterUtils.isLargeScreen(activity) ? AdSize.BANNER_HEIGHT_90 : AdSize.BANNER_HEIGHT_50;
            case 3:
                return AdSize.BANNER_HEIGHT_50;
            case 4:
                if (iSBannerSize.getHeight() == 50) {
                    return AdSize.BANNER_HEIGHT_50;
                }
                if (iSBannerSize.getHeight() == 90) {
                    return AdSize.BANNER_HEIGHT_90;
                }
                if (iSBannerSize.getHeight() == 250) {
                    return AdSize.RECTANGLE_HEIGHT_250;
                }
                return null;
            default:
                return null;
        }
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams calcLayoutParams(ISBannerSize iSBannerSize, Activity activity) {
        int i;
        if (iSBannerSize.getDescription().equals("RECTANGLE")) {
            i = 300;
        } else {
            i = (!iSBannerSize.getDescription().equals("SMART") || !AdapterUtils.isLargeScreen(activity)) ? 320 : 728;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(activity, i), -2);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    private String getMediationServiceInfo() {
        String format = String.format("%s_%s:%s", new Object[]{MEDIATION_NAME, IronSourceUtils.getSDKVersion(), "4.3.38"});
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("mediationServiceInfo = " + format);
        return format;
    }

    private Map<String, Object> getBiddingData() {
        if (mInitState == InitState.INIT_STATE_FAILED) {
            IronLog.INTERNAL.verbose("returning null as token since init failed");
            return null;
        }
        String bidderToken = BidderTokenProvider.getBidderToken(ContextProvider.getInstance().getApplicationContext());
        if (TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("token = " + bidderToken);
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, bidderToken);
        return hashMap;
    }
}
