package com.facebook.ads.internal.api;

import com.facebook.ads.ExtraHints;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.InterstitialAd;

public interface InterstitialAdApi extends FullScreenAd {

    /* renamed from: com.facebook.ads.internal.api.InterstitialAdApi$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig();

    InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig();

    boolean isAdLoaded();

    void loadAd(InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig);

    void registerAdCompanionView(AdCompanionView adCompanionView);

    @Deprecated
    void setExtraHints(ExtraHints extraHints);

    boolean show();

    boolean show(InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig);

    void unregisterAdCompanionView();
}
