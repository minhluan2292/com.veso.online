package com.veso.online;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.veso.online.XosoApplication;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/veso/online/XosoApplication$AppOpenAdManager$showAdIfAvailable$2", "Lcom/google/android/gms/ads/FullScreenContentCallback;", "onAdDismissedFullScreenContent", "", "onAdFailedToShowFullScreenContent", "adError", "Lcom/google/android/gms/ads/AdError;", "onAdShowedFullScreenContent", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoApplication.kt */
public final class XosoApplication$AppOpenAdManager$showAdIfAvailable$2 extends FullScreenContentCallback {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ XosoApplication.OnShowAdCompleteListener $onShowAdCompleteListener;
    final /* synthetic */ XosoApplication.AppOpenAdManager this$0;

    XosoApplication$AppOpenAdManager$showAdIfAvailable$2(XosoApplication.AppOpenAdManager appOpenAdManager, XosoApplication.OnShowAdCompleteListener onShowAdCompleteListener, Activity activity) {
        this.this$0 = appOpenAdManager;
        this.$onShowAdCompleteListener = onShowAdCompleteListener;
        this.$activity = activity;
    }

    public void onAdDismissedFullScreenContent() {
        this.this$0.appOpenAd = null;
        this.this$0.setShowingAd(false);
        Log.d("XosoApplication", "onAdDismissedFullScreenContent.");
        this.$onShowAdCompleteListener.onShowAdComplete();
        XosoApplication.AppOpenAdManager.loadAd$default(this.this$0, this.$activity, (Function0) null, 2, (Object) null);
    }

    public void onAdFailedToShowFullScreenContent(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.this$0.appOpenAd = null;
        this.this$0.setShowingAd(false);
        Log.d("XosoApplication", Intrinsics.stringPlus("onAdFailedToShowFullScreenContent: ", adError.getMessage()));
        this.$onShowAdCompleteListener.onShowAdComplete();
        XosoApplication.AppOpenAdManager.loadAd$default(this.this$0, this.$activity, (Function0) null, 2, (Object) null);
    }

    public void onAdShowedFullScreenContent() {
        Log.d("XosoApplication", "onAdShowedFullScreenContent.");
    }
}
