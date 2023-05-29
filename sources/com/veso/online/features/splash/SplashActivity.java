package com.veso.online.features.splash;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import com.veso.online.R;
import com.veso.online.XosoApplication;
import com.veso.online.features.main.MainActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/veso/online/features/splash/SplashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "handler", "Landroid/os/Handler;", "isAdShown", "", "wentToMain", "gotoMain", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: SplashActivity.kt */
public final class SplashActivity extends AppCompatActivity {
    private final Handler handler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public boolean isAdShown;
    /* access modifiers changed from: private */
    public boolean wentToMain;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_splash);
        Application application = getApplication();
        XosoApplication xosoApplication = application instanceof XosoApplication ? (XosoApplication) application : null;
        if (xosoApplication == null) {
            SplashActivity splashActivity = this;
            gotoMain();
            return;
        }
        xosoApplication.loadAd(new SplashActivity$onCreate$1(this, xosoApplication));
        this.handler.postDelayed(new SplashActivity$$ExternalSyntheticLambda0(this), 3000);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m588onCreate$lambda1(SplashActivity splashActivity) {
        Intrinsics.checkNotNullParameter(splashActivity, "this$0");
        if (!splashActivity.isAdShown) {
            splashActivity.gotoMain();
        }
    }

    /* access modifiers changed from: private */
    public final void gotoMain() {
        this.wentToMain = true;
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.handler.removeCallbacksAndMessages((Object) null);
        super.onDestroy();
    }
}
