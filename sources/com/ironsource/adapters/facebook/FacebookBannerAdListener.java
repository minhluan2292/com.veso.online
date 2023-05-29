package com.ironsource.adapters.facebook;

import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.lang.ref.WeakReference;

public class FacebookBannerAdListener implements AdListener {
    private WeakReference<FacebookAdapter> mAdapter;
    private FrameLayout.LayoutParams mBannerLayoutParams;
    private BannerSmashListener mListener;
    private String mPlacementId;

    public FacebookBannerAdListener(FacebookAdapter facebookAdapter, BannerSmashListener bannerSmashListener, String str, FrameLayout.LayoutParams layoutParams) {
        this.mAdapter = new WeakReference<>(facebookAdapter);
        this.mListener = bannerSmashListener;
        this.mPlacementId = str;
        this.mBannerLayoutParams = layoutParams;
    }

    public void onAdLoaded(Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        AdView adView = ((FacebookAdapter) this.mAdapter.get()).mBannerPlacementIdToAd.get(this.mPlacementId);
        if (adView != null) {
            this.mListener.onBannerAdLoaded(adView, this.mBannerLayoutParams);
        }
    }

    public void onError(Ad ad, AdError adError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId + " error = " + adError.getErrorCode() + ", " + adError.getErrorMessage());
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            this.mListener.onBannerAdLoadFailed(new IronSourceError(adError.getErrorCode() == 1001 ? 606 : adError.getErrorCode(), adError.getErrorMessage()));
        }
    }

    public void onLoggingImpression(Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdShown();
        }
    }

    public void onAdClicked(Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdClicked();
        }
    }
}
