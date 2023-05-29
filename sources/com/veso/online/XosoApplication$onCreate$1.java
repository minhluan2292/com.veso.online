package com.veso.online;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoApplication.kt */
final class XosoApplication$onCreate$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ XosoApplication this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XosoApplication$onCreate$1(XosoApplication xosoApplication) {
        super(0);
        this.this$0 = xosoApplication;
    }

    /* access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m520invoke$lambda0(InitializationStatus initializationStatus) {
        Intrinsics.checkNotNullParameter(initializationStatus, "it");
    }

    public final void invoke() {
        try {
            MobileAds.initialize(this.this$0, XosoApplication$onCreate$1$$ExternalSyntheticLambda0.INSTANCE);
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
        } catch (Exception unused) {
        }
    }
}
