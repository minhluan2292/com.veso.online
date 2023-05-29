package com.ironsource.mediationsdk;

import com.ironsource.lifecycle.f;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public final class B {
    C0018c a;
    private Runnable b;
    private int c = 0;
    private f d;

    public B(int i, C0018c cVar) {
        this.a = cVar;
        this.c = i;
        this.b = new Runnable() {
            public final void run() {
                IronLog.INTERNAL.verbose("loaded ads are expired");
                if (B.this.a != null) {
                    B.this.a.c_();
                }
            }
        };
    }

    private boolean b() {
        return this.c > 0;
    }

    public final void a() {
        if (b() && this.d != null) {
            IronLog.INTERNAL.verbose("canceling expiration timer");
            this.d.c();
            this.d = null;
        }
    }

    public final void a(long j) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis((long) this.c) - Math.max(j, 0);
            if (millis > 0) {
                a();
                this.d = new f(millis, this.b, true);
                Calendar instance = Calendar.getInstance();
                instance.add(14, (int) millis);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("loaded ads will expire on: " + instance.getTime() + " in " + String.format("%.2f", new Object[]{Double.valueOf((((double) millis) / 1000.0d) / 60.0d)}) + " minutes");
                return;
            }
            IronLog.INTERNAL.verbose("no delay - onAdExpired called");
            this.a.c_();
        }
    }
}
