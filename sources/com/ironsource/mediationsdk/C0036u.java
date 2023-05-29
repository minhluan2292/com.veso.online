package com.ironsource.mediationsdk;

import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.u  reason: case insensitive filesystem */
public final class C0036u {
    private static final C0036u a = new C0036u();
    private Map<String, Long> b = new HashMap();
    /* access modifiers changed from: private */
    public Map<String, Boolean> c = new HashMap();
    private int d;
    private int e;

    private C0036u() {
    }

    public static synchronized C0036u a() {
        C0036u uVar;
        synchronized (C0036u.class) {
            uVar = a;
        }
        return uVar;
    }

    /* access modifiers changed from: private */
    public void b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.b.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().a(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    public final void a(IronSource.AD_UNIT ad_unit, int i) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.d = i;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.e = i;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    public final synchronized void a(final IronSource.AD_UNIT ad_unit, final IronSourceError ironSourceError) {
        int i;
        if (!a(ad_unit)) {
            final String ad_unit2 = ad_unit.toString();
            if (!this.b.containsKey(ad_unit2)) {
                b(ad_unit, ironSourceError);
                return;
            }
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = this.d;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = this.e;
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.warning("ad unit not supported - " + ad_unit);
                i = 0;
            }
            long j = (long) (i * 1000);
            long currentTimeMillis = System.currentTimeMillis() - this.b.get(ad_unit2).longValue();
            if (currentTimeMillis > j) {
                b(ad_unit, ironSourceError);
                return;
            }
            this.c.put(ad_unit2, Boolean.TRUE);
            long j2 = j - currentTimeMillis;
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("delaying callback by " + j2);
            c cVar = c.a;
            c.a(new Runnable() {
                public final void run() {
                    IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
                    C0036u.this.b(ad_unit, ironSourceError);
                    C0036u.this.c.put(ad_unit2, Boolean.FALSE);
                }
            }, j2);
        }
    }

    public final synchronized boolean a(IronSource.AD_UNIT ad_unit) {
        if (!this.c.containsKey(ad_unit.toString())) {
            return false;
        }
        return this.c.get(ad_unit.toString()).booleanValue();
    }
}
