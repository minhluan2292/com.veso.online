package com.veso.online;

import android.util.Log;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.veso.online.XosoApplication;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/veso/online/XosoApplication$AppOpenAdManager$loadAd$1", "Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;", "onAdFailedToLoad", "", "loadAdError", "Lcom/google/android/gms/ads/LoadAdError;", "onAdLoaded", "ad", "Lcom/google/android/gms/ads/appopen/AppOpenAd;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoApplication.kt */
public final class XosoApplication$AppOpenAdManager$loadAd$1 extends AppOpenAd.AppOpenAdLoadCallback {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ XosoApplication.AppOpenAdManager this$0;

    XosoApplication$AppOpenAdManager$loadAd$1(XosoApplication.AppOpenAdManager appOpenAdManager, Function0<Unit> function0) {
        this.this$0 = appOpenAdManager;
        this.$callback = function0;
    }

    public void onAdLoaded(AppOpenAd appOpenAd) {
        Intrinsics.checkNotNullParameter(appOpenAd, "ad");
        this.this$0.appOpenAd = appOpenAd;
        this.this$0.isLoadingAd = false;
        this.this$0.loadTime = new Date().getTime();
        Function0<Unit> function0 = this.$callback;
        if (function0 != null) {
            function0.invoke();
        }
        Log.d("XosoApplication", "onAdLoaded.");
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
        this.this$0.isLoadingAd = false;
        Function0<Unit> function0 = this.$callback;
        if (function0 != null) {
            function0.invoke();
        }
        Log.d("XosoApplication", Intrinsics.stringPlus("onAdFailedToLoad: ", loadAdError.getMessage()));
    }
}
