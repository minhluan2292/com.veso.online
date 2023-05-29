package com.veso.online.features.splash;

import com.veso.online.XosoApplication;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: SplashActivity.kt */
final class SplashActivity$onCreate$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ XosoApplication $app;
    final /* synthetic */ SplashActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SplashActivity$onCreate$1(SplashActivity splashActivity, XosoApplication xosoApplication) {
        super(0);
        this.this$0 = splashActivity;
        this.$app = xosoApplication;
    }

    public final void invoke() {
        if (!this.this$0.wentToMain) {
            this.this$0.isAdShown = true;
            final SplashActivity splashActivity = this.this$0;
            this.$app.showAdIfAvailable(this.this$0, new XosoApplication.OnShowAdCompleteListener() {
                public void onShowAdComplete() {
                    splashActivity.gotoMain();
                }
            });
        }
    }
}
