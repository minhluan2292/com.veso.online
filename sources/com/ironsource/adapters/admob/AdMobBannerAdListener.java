package com.ironsource.adapters.admob;

import android.widget.FrameLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.lang.ref.WeakReference;

public class AdMobBannerAdListener extends AdListener {
    private String mAdUnitId;
    private AdView mAdView;
    private WeakReference<AdMobAdapter> mAdapter;
    private BannerSmashListener mListener;

    AdMobBannerAdListener(AdMobAdapter adMobAdapter, BannerSmashListener bannerSmashListener, String str, AdView adView) {
        this.mAdapter = new WeakReference<>(adMobAdapter);
        this.mListener = bannerSmashListener;
        this.mAdUnitId = str;
        this.mAdView = adView;
    }

    public void onAdLoaded() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else if (this.mAdView == null) {
            IronLog.INTERNAL.verbose("adView is null");
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.mListener.onBannerAdLoaded(this.mAdView, layoutParams);
            this.mListener.onBannerAdShown();
        }
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        IronSourceError ironSourceError;
        String str;
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
        if (loadAdError != null) {
            str = loadAdError.getMessage() + "( " + loadAdError.getCode() + " ) ";
            if (loadAdError.getCause() != null) {
                str = str + " Caused by - " + loadAdError.getCause();
            }
            if (((AdMobAdapter) this.mAdapter.get()).isNoFillError(loadAdError.getCode())) {
                ironSourceError = new IronSourceError(606, str);
            } else {
                ironSourceError = ErrorBuilder.buildLoadFailedError(str);
            }
        } else {
            str = "Banner failed to load (loadAdError is null)";
            ironSourceError = ErrorBuilder.buildLoadFailedError(str);
        }
        IronLog.ADAPTER_CALLBACK.error(str + str);
        this.mListener.onBannerAdLoadFailed(ironSourceError);
    }

    public void onAdImpression() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
    }

    public void onAdClicked() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    public void onAdOpened() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdScreenPresented();
        }
    }

    public void onAdClosed() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdScreenDismissed();
        }
    }
}
