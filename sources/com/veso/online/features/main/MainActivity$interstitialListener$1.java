package com.veso.online.features.main;

import android.content.Context;
import android.util.Log;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.veso.online.XosoApplication;
import com.veso.online.base.SimpleInterstitialListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/veso/online/features/main/MainActivity$interstitialListener$1", "Lcom/veso/online/base/SimpleInterstitialListener;", "onInterstitialAdClosed", "", "onInterstitialAdLoadFailed", "p0", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "onInterstitialAdShowSucceeded", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity$interstitialListener$1 extends SimpleInterstitialListener {
    final /* synthetic */ MainActivity this$0;

    MainActivity$interstitialListener$1(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    public void onInterstitialAdClosed() {
        IronSource.loadInterstitial();
        Context applicationContext = this.this$0.getApplicationContext();
        XosoApplication xosoApplication = applicationContext instanceof XosoApplication ? (XosoApplication) applicationContext : null;
        if (xosoApplication != null) {
            xosoApplication.setOtherFullScreenAdShowing(false);
        }
    }

    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        Log.e(IronSourceConstants.IRONSOURCE_CONFIG_NAME, Intrinsics.stringPlus("Failed to load ads: ", ironSourceError == null ? null : ironSourceError.getErrorMessage()));
    }

    public void onInterstitialAdShowSucceeded() {
        Context applicationContext = this.this$0.getApplicationContext();
        XosoApplication xosoApplication = applicationContext instanceof XosoApplication ? (XosoApplication) applicationContext : null;
        if (xosoApplication != null) {
            xosoApplication.setOtherFullScreenAdShowing(true);
        }
    }
}
