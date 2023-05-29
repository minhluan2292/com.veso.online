package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.c;
import java.util.Timer;
import java.util.TimerTask;

public final class ah {
    ai a;
    private c b;
    private Timer c = null;

    public ah(c cVar, ai aiVar) {
        this.b = cVar;
        this.a = aiVar;
    }

    private void e() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c = null;
        }
    }

    public final synchronized void a() {
        if (this.b.n) {
            e();
            Timer timer = new Timer();
            this.c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    ah.this.a.e();
                }
            }, this.b.l);
        }
    }

    public final synchronized void b() {
        if (!this.b.n) {
            e();
            Timer timer = new Timer();
            this.c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    ah.this.a.e();
                }
            }, this.b.l);
        }
    }

    public final void c() {
        synchronized (this) {
            e();
        }
        this.a.e();
    }

    public final synchronized void d() {
        e();
        Timer timer = new Timer();
        this.c = timer;
        timer.schedule(new TimerTask() {
            public final void run() {
                ah.this.a.e();
            }
        }, this.b.k);
    }
}
