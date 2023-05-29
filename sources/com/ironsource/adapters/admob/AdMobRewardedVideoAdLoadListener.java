package com.ironsource.adapters.admob;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.lang.ref.WeakReference;

public class AdMobRewardedVideoAdLoadListener extends RewardedAdLoadCallback {
    private String mAdUnitId;
    private WeakReference<AdMobAdapter> mAdapter;
    private RewardedVideoSmashListener mListener;

    AdMobRewardedVideoAdLoadListener(AdMobAdapter adMobAdapter, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mAdapter = new WeakReference<>(adMobAdapter);
        this.mAdUnitId = str;
        this.mListener = rewardedVideoSmashListener;
    }

    public void onAdLoaded(RewardedAd rewardedAd) {
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
        ((AdMobAdapter) this.mAdapter.get()).mAdUnitIdToRewardedVideoAd.put(this.mAdUnitId, rewardedAd);
        ((AdMobAdapter) this.mAdapter.get()).mRewardedVideoAdsAvailability.put(this.mAdUnitId, true);
        this.mListener.onRewardedVideoAvailabilityChanged(true);
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<AdMobAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        int code = loadAdError.getCode();
        String str = loadAdError.getMessage() + "( " + code + " )";
        IronLog.ADAPTER_CALLBACK.error("adapterError = " + str);
        if (((AdMobAdapter) this.mAdapter.get()).isNoFillError(code)) {
            code = IronSourceError.ERROR_RV_LOAD_NO_FILL;
            str = "No Fill";
        }
        if (loadAdError.getCause() != null) {
            str = str + "Caused by " + loadAdError.getCause();
        }
        IronLog.ADAPTER_CALLBACK.error("adapterError = " + str);
        this.mListener.onRewardedVideoAvailabilityChanged(false);
        this.mListener.onRewardedVideoLoadFailed(new IronSourceError(code, str));
    }
}
