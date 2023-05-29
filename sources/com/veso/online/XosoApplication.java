package com.veso.online;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.veso.online.data.model.ConstantsKt;
import com.veso.online.features.splash.ComeBackActivity;
import com.veso.online.features.splash.SplashActivity;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\"#B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\u0006\u0010\u001b\u001a\u00020\fJ\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010 \u001a\u00020!R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/veso/online/XosoApplication;", "Landroid/app/Application;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "appOpenAdManager", "Lcom/veso/online/XosoApplication$AppOpenAdManager;", "currentActivity", "Landroid/app/Activity;", "lifecycleEventObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "loadAd", "", "callback", "Lkotlin/Function0;", "onActivityCreated", "activity", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "onCreate", "onMoveToForeground", "setOtherFullScreenAdShowing", "isShowing", "", "showAdIfAvailable", "onShowAdCompleteListener", "Lcom/veso/online/XosoApplication$OnShowAdCompleteListener;", "AppOpenAdManager", "OnShowAdCompleteListener", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoApplication.kt */
public final class XosoApplication extends Application implements Application.ActivityLifecycleCallbacks, LifecycleObserver {
    private AppOpenAdManager appOpenAdManager;
    private Activity currentActivity;
    private final LifecycleEventObserver lifecycleEventObserver = new XosoApplication$$ExternalSyntheticLambda0(this);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/veso/online/XosoApplication$OnShowAdCompleteListener;", "", "onShowAdComplete", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: XosoApplication.kt */
    public interface OnShowAdCompleteListener {
        void onShowAdComplete();
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* compiled from: XosoApplication.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "outState");
    }

    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
        Log.d("XosoApplication", Intrinsics.stringPlus("Google Mobile Ads SDK Version: ", MobileAds.getVersion()));
        ConstantsKt.ensureBackgroundThread(new XosoApplication$onCreate$1(this));
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this.lifecycleEventObserver);
        this.appOpenAdManager = new AppOpenAdManager(this);
    }

    public final void loadAd(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "callback");
        AppOpenAdManager appOpenAdManager2 = this.appOpenAdManager;
        if (appOpenAdManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appOpenAdManager");
            appOpenAdManager2 = null;
        }
        appOpenAdManager2.loadAd(this, function0);
    }

    /* access modifiers changed from: private */
    /* renamed from: lifecycleEventObserver$lambda-0  reason: not valid java name */
    public static final void m519lifecycleEventObserver$lambda0(XosoApplication xosoApplication, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(xosoApplication, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$noName_0");
        Intrinsics.checkNotNullParameter(event, NotificationCompat.CATEGORY_EVENT);
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            xosoApplication.onMoveToForeground();
        }
    }

    public final void onMoveToForeground() {
        Activity activity = this.currentActivity;
        if (activity != null) {
            if (activity instanceof SplashActivity) {
                AppOpenAdManager appOpenAdManager2 = this.appOpenAdManager;
                if (appOpenAdManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appOpenAdManager");
                    appOpenAdManager2 = null;
                }
                appOpenAdManager2.showAdIfAvailable(activity);
                return;
            }
            activity.startActivity(new Intent(activity, ComeBackActivity.class));
        }
    }

    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AppOpenAdManager appOpenAdManager2 = this.appOpenAdManager;
        if (appOpenAdManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appOpenAdManager");
            appOpenAdManager2 = null;
        }
        if (!appOpenAdManager2.isShowingAd()) {
            this.currentActivity = activity;
        }
    }

    public final void showAdIfAvailable(Activity activity, OnShowAdCompleteListener onShowAdCompleteListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onShowAdCompleteListener, "onShowAdCompleteListener");
        AppOpenAdManager appOpenAdManager2 = this.appOpenAdManager;
        if (appOpenAdManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appOpenAdManager");
            appOpenAdManager2 = null;
        }
        appOpenAdManager2.showAdIfAvailable(activity, onShowAdCompleteListener);
    }

    public final void setOtherFullScreenAdShowing(boolean z) {
        AppOpenAdManager appOpenAdManager2 = this.appOpenAdManager;
        if (appOpenAdManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appOpenAdManager");
            appOpenAdManager2 = null;
        }
        appOpenAdManager2.setOtherFullScreenAdShowing(z);
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/veso/online/XosoApplication$AppOpenAdManager;", "", "(Lcom/veso/online/XosoApplication;)V", "appOpenAd", "Lcom/google/android/gms/ads/appopen/AppOpenAd;", "isLoadingAd", "", "isOtherFullScreenAdShowing", "()Z", "setOtherFullScreenAdShowing", "(Z)V", "isShowingAd", "setShowingAd", "loadTime", "", "isAdAvailable", "loadAd", "", "context", "Landroid/content/Context;", "callback", "Lkotlin/Function0;", "showAdIfAvailable", "activity", "Landroid/app/Activity;", "onShowAdCompleteListener", "Lcom/veso/online/XosoApplication$OnShowAdCompleteListener;", "wasLoadTimeLessThanNHoursAgo", "numHours", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: XosoApplication.kt */
    private final class AppOpenAdManager {
        /* access modifiers changed from: private */
        public AppOpenAd appOpenAd;
        /* access modifiers changed from: private */
        public boolean isLoadingAd;
        private boolean isOtherFullScreenAdShowing;
        private boolean isShowingAd;
        /* access modifiers changed from: private */
        public long loadTime;
        final /* synthetic */ XosoApplication this$0;

        public AppOpenAdManager(XosoApplication xosoApplication) {
            Intrinsics.checkNotNullParameter(xosoApplication, "this$0");
            this.this$0 = xosoApplication;
        }

        public final boolean isShowingAd() {
            return this.isShowingAd;
        }

        public final void setShowingAd(boolean z) {
            this.isShowingAd = z;
        }

        public final boolean isOtherFullScreenAdShowing() {
            return this.isOtherFullScreenAdShowing;
        }

        public final void setOtherFullScreenAdShowing(boolean z) {
            this.isOtherFullScreenAdShowing = z;
        }

        public static /* synthetic */ void loadAd$default(AppOpenAdManager appOpenAdManager, Context context, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            appOpenAdManager.loadAd(context, function0);
        }

        public final void loadAd(Context context, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!this.isLoadingAd && !isAdAvailable()) {
                this.isLoadingAd = true;
                AdRequest build = new AdRequest.Builder().build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
                AppOpenAd.load(context, BuildConfig.APP_OPEN_ADS_ID, build, 1, (AppOpenAd.AppOpenAdLoadCallback) new XosoApplication$AppOpenAdManager$loadAd$1(this, function0));
            }
        }

        private final boolean wasLoadTimeLessThanNHoursAgo(long j) {
            return new Date().getTime() - this.loadTime < j * 3600000;
        }

        private final boolean isAdAvailable() {
            return this.appOpenAd != null && wasLoadTimeLessThanNHoursAgo(4);
        }

        public final void showAdIfAvailable(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            showAdIfAvailable(activity, new XosoApplication$AppOpenAdManager$showAdIfAvailable$1());
        }

        public final void showAdIfAvailable(Activity activity, OnShowAdCompleteListener onShowAdCompleteListener) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(onShowAdCompleteListener, "onShowAdCompleteListener");
            if (!this.isOtherFullScreenAdShowing) {
                if (this.isShowingAd) {
                    Log.d("XosoApplication", "The app open ad is already showing.");
                } else if (!isAdAvailable()) {
                    Log.d("XosoApplication", "The app open ad is not ready yet.");
                    onShowAdCompleteListener.onShowAdComplete();
                    loadAd$default(this, activity, (Function0) null, 2, (Object) null);
                } else {
                    Log.d("XosoApplication", "Will show ad.");
                    AppOpenAd appOpenAd2 = this.appOpenAd;
                    Intrinsics.checkNotNull(appOpenAd2);
                    appOpenAd2.setFullScreenContentCallback(new XosoApplication$AppOpenAdManager$showAdIfAvailable$2(this, onShowAdCompleteListener, activity));
                    this.isShowingAd = true;
                    AppOpenAd appOpenAd3 = this.appOpenAd;
                    Intrinsics.checkNotNull(appOpenAd3);
                    appOpenAd3.show(activity);
                }
            }
        }
    }
}
