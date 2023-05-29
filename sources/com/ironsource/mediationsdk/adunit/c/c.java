package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.ai;
import java.util.Timer;
import java.util.TimerTask;

public final class c {
    a a;
    ai b;
    private Timer c;

    public c(a aVar, ai aiVar) {
        this.a = aVar;
        this.b = aiVar;
    }

    private void c() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c = null;
        }
    }

    public final void a() {
        if (this.a.a != a.C0009a.MANUAL) {
            a(this.a.c);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j) {
        c();
        Timer timer = new Timer();
        this.c = timer;
        timer.schedule(new TimerTask() {
            public final void run() {
                c.this.b.e();
            }
        }, j);
    }

    public final void b() {
        if (this.a.a != a.C0009a.MANUAL) {
            a(0);
        }
    }
}
