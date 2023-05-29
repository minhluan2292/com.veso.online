package com.veso.online.features.splash;

import com.veso.online.XosoApplication;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/veso/online/features/splash/ComeBackActivity$showAd$1", "Lcom/veso/online/XosoApplication$OnShowAdCompleteListener;", "onShowAdComplete", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ComeBackActivity.kt */
public final class ComeBackActivity$showAd$1 implements XosoApplication.OnShowAdCompleteListener {
    final /* synthetic */ ComeBackActivity this$0;

    ComeBackActivity$showAd$1(ComeBackActivity comeBackActivity) {
        this.this$0 = comeBackActivity;
    }

    public void onShowAdComplete() {
        this.this$0.handler.postDelayed(new ComeBackActivity$showAd$1$$ExternalSyntheticLambda0(this.this$0), 500);
    }

    /* access modifiers changed from: private */
    /* renamed from: onShowAdComplete$lambda-0  reason: not valid java name */
    public static final void m586onShowAdComplete$lambda0(ComeBackActivity comeBackActivity) {
        Intrinsics.checkNotNullParameter(comeBackActivity, "this$0");
        comeBackActivity.finish();
    }
}
