package com.veso.online.features.splash;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import com.veso.online.R;
import com.veso.online.XosoApplication;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/veso/online/features/splash/ComeBackActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "handler", "Landroid/os/Handler;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showAd", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ComeBackActivity.kt */
public final class ComeBackActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    public final Handler handler = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_come_back);
        this.handler.postDelayed(new ComeBackActivity$$ExternalSyntheticLambda0(this), 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m585onCreate$lambda0(ComeBackActivity comeBackActivity) {
        Intrinsics.checkNotNullParameter(comeBackActivity, "this$0");
        comeBackActivity.showAd();
    }

    private final void showAd() {
        Application application = getApplication();
        XosoApplication xosoApplication = application instanceof XosoApplication ? (XosoApplication) application : null;
        if (xosoApplication != null) {
            xosoApplication.showAdIfAvailable(this, new ComeBackActivity$showAd$1(this));
        }
    }
}
