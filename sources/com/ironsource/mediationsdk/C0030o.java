package com.ironsource.mediationsdk;

import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.o  reason: case insensitive filesystem */
public final class C0030o {
    private static C0030o b;
    int a;
    private long c = 0;
    private boolean d = false;

    private C0030o() {
    }

    public static synchronized C0030o a() {
        C0030o oVar;
        synchronized (C0030o.class) {
            if (b == null) {
                b = new C0030o();
            }
            oVar = b;
        }
        return oVar;
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
        a(ironSourceBannerLayout, ironSourceError, false);
    }

    public final void a(final IronSourceBannerLayout ironSourceBannerLayout, final IronSourceError ironSourceError, final boolean z) {
        synchronized (this) {
            if (!this.d) {
                long currentTimeMillis = System.currentTimeMillis() - this.c;
                int i = this.a;
                if (currentTimeMillis > ((long) (i * 1000))) {
                    b(ironSourceBannerLayout, ironSourceError, z);
                    return;
                }
                this.d = true;
                long j = ((long) (i * 1000)) - currentTimeMillis;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("delaying callback by " + j);
                c cVar = c.a;
                c.b(new Runnable() {
                    public final void run() {
                        C0030o.this.b(ironSourceBannerLayout, ironSourceError, z);
                    }
                }, j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError, boolean z) {
        if (ironSourceBannerLayout != null) {
            this.c = System.currentTimeMillis();
            this.d = false;
            ironSourceBannerLayout.a(ironSourceError, z);
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        return z;
    }
}
