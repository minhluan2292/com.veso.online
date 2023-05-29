package com.ironsource.mediationsdk;

import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyBannerListener;

/* renamed from: com.ironsource.mediationsdk.m  reason: case insensitive filesystem */
public final class C0028m {
    private static final C0028m b = new C0028m();
    /* access modifiers changed from: package-private */
    public ISDemandOnlyBannerListener a = null;

    private C0028m() {
    }

    public static C0028m a() {
        return b;
    }

    static /* synthetic */ void a(C0028m mVar, String str, String str2) {
        IronLog ironLog = IronLog.CALLBACK;
        ironLog.info("Instance: " + str + " " + str2);
    }

    public final void a(final String str, final IronSourceError ironSourceError) {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0028m.this.a != null) {
                        C0028m.this.a.onBannerAdLoadFailed(str, ironSourceError);
                    }
                    C0028m mVar = C0028m.this;
                    String str = str;
                    C0028m.a(mVar, str, "onBannerAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                }
            });
        }
    }
}
