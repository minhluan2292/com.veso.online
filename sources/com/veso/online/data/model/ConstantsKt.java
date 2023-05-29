package com.veso.online.data.model;

import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"ensureBackgroundThread", "", "callback", "Lkotlin/Function0;", "isOnMainThread", "", "app_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* compiled from: Constants.kt */
public final class ConstantsKt {
    public static final boolean isOnMainThread() {
        return Intrinsics.areEqual((Object) Looper.myLooper(), (Object) Looper.getMainLooper());
    }

    public static final void ensureBackgroundThread(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "callback");
        if (isOnMainThread()) {
            new Thread(new ConstantsKt$$ExternalSyntheticLambda0(function0)).start();
        } else {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ensureBackgroundThread$lambda-0  reason: not valid java name */
    public static final void m521ensureBackgroundThread$lambda0(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$callback");
        function0.invoke();
    }
}
