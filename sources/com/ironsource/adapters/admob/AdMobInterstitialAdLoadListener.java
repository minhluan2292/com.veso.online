package com.ironsource.adapters.admob;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.lang.ref.WeakReference;

public class AdMobInterstitialAdLoadListener extends InterstitialAdLoadCallback {
    private String mAdUnitId;
    private WeakReference<AdMobAdapter> mAdapter;
    private InterstitialSmashListener mListener;

    AdMobInterstitialAdLoadListener(AdMobAdapter adMobAdapter, String str, InterstitialSmashListener interstitialSmashListener) {
        this.mAdapter = new WeakReference<>(adMobAdapter);
        this.mAdUnitId = str;
        this.mListener = interstitialSmashListener;
    }

    public void onAdLoaded(InterstitialAd interstitialAd) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<AdMobAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        ((AdMobAdapter) this.mAdapter.get()).mAdUnitIdToInterstitialAd.put(this.mAdUnitId, interstitialAd);
        ((AdMobAdapter) this.mAdapter.get()).mInterstitialAdsAvailability.put(this.mAdUnitId, true);
        this.mListener.onInterstitialAdReady();
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        int code = loadAdError.getCode();
        String str = loadAdError.getMessage() + "( " + code + " ) ";
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<AdMobAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        if (((AdMobAdapter) this.mAdapter.get()).isNoFillError(code)) {
            code = IronSourceError.ERROR_IS_LOAD_NO_FILL;
            str = "No Fill";
        }
        if (loadAdError.getCause() != null) {
            str = str + " Caused by - " + loadAdError.getCause();
        }
        IronLog.ADAPTER_CALLBACK.error("adapterError = " + str);
        this.mListener.onInterstitialAdLoadFailed(new IronSourceError(code, str));
    }
}
