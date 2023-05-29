package com.ironsource.mediationsdk.adunit.d.a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.c.a.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

public abstract class a<Listener extends com.ironsource.mediationsdk.adunit.c.a.a> extends c<Listener> implements AdapterAdInteractionListener {
    private BaseAdInteractionAdapter<?, AdapterAdInteractionListener> h;

    public a(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdInteractionAdapter<?, ?> baseAdInteractionAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
        this.h = baseAdInteractionAdapter;
    }

    public final void a(Placement placement) {
        int i;
        IronLog.INTERNAL.verbose(c("placementName = " + placement.getPlacementName()));
        try {
            this.e = placement;
            a(c.a.SHOWING);
            this.c.d.a(q());
            this.h.showAd(this.f, this);
        } catch (Throwable th) {
            String str = "showAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(c(str));
            a(c.a.FAILED);
            if (this.c != null) {
                this.c.e.m(str);
            }
            IronSource.AD_UNIT ad_unit = this.a.a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = IronSourceError.ERROR_IS_SHOW_EXCEPTION;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = IronSourceError.ERROR_RV_SHOW_EXCEPTION;
            } else {
                IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
                i = 510;
            }
            onAdShowFailed(i, str);
        }
    }

    public final void a(boolean z) {
        if (this.c != null) {
            this.c.d.a(z);
        }
    }

    public final boolean a() {
        if (this.f != null) {
            try {
                return i() ? this.d == c.a.LOADED && this.h.isAdAvailable(this.f) : this.h.isAdAvailable(this.f);
            } catch (Throwable th) {
                String str = "isReadyToShow - exception = " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(c(str));
                if (this.c != null) {
                    this.c.e.m(str);
                }
            }
        }
        return false;
    }

    public final void c() {
        super.c();
        BaseAdInteractionAdapter<?, AdapterAdInteractionListener> baseAdInteractionAdapter = this.h;
        if (baseAdInteractionAdapter != null) {
            try {
                baseAdInteractionAdapter.releaseMemory();
            } catch (Exception e) {
                String format = String.format("releaseMemory - exception = ", new Object[]{e});
                IronLog.INTERNAL.verbose(c(format));
                if (this.c != null) {
                    this.c.e.m(format);
                }
            }
            this.h = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        ((com.ironsource.mediationsdk.adunit.c.a.a) r5.b).c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdClosed() {
        /*
            r5 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = ""
            java.lang.String r1 = r5.c(r1)
            r0.verbose(r1)
            java.lang.Object r0 = r5.g
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r5.d     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.d.a.c.a.SHOWING     // Catch:{ all -> 0x0087 }
            if (r1 != r2) goto L_0x0068
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = com.ironsource.mediationsdk.adunit.d.a.c.a.NONE     // Catch:{ all -> 0x0087 }
            r5.a((com.ironsource.mediationsdk.adunit.d.a.c.a) r1)     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.c     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = ""
            com.ironsource.mediationsdk.adunit.d.a r2 = r5.a     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = r2.a     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x0087 }
            if (r2 != r3) goto L_0x0054
            com.ironsource.mediationsdk.adunit.c.a.b r1 = r5.b     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.c.a.a r1 = (com.ironsource.mediationsdk.adunit.c.a.a) r1     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r1.c()     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "otherInstanceAvailable = "
            r2.<init>(r3)     // Catch:{ all -> 0x0087 }
            int r3 = r1.length()     // Catch:{ all -> 0x0087 }
            if (r3 <= 0) goto L_0x004b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            java.lang.String r4 = "true|"
            r3.<init>(r4)     // Catch:{ all -> 0x0087 }
            r3.append(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0087 }
            goto L_0x004d
        L_0x004b:
            java.lang.String r1 = "false"
        L_0x004d:
            r2.append(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0087 }
        L_0x0054:
            com.ironsource.mediationsdk.adunit.b.d r2 = r5.c     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.b.a r2 = r2.d     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = r5.q()     // Catch:{ all -> 0x0087 }
            r2.a(r3, r1)     // Catch:{ all -> 0x0087 }
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.c.a.b r0 = r5.b
            com.ironsource.mediationsdk.adunit.c.a.a r0 = (com.ironsource.mediationsdk.adunit.c.a.a) r0
            r0.c(r5)
            return
        L_0x0068:
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.c     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0085
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.c     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.b.i r1 = r1.e     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "unexpected closed for "
            r2.<init>(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = r5.m()     // Catch:{ all -> 0x0087 }
            r2.append(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0087 }
            r1.k(r2)     // Catch:{ all -> 0x0087 }
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            return
        L_0x0087:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.d.a.a.onAdClosed():void");
    }

    public void onAdEnded() {
        IronLog.INTERNAL.verbose(c(""));
        if (this.c != null) {
            this.c.d.f(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.b).e(this);
    }

    public void onAdOpened() {
        IronLog.INTERNAL.verbose(c(""));
        if (this.c != null) {
            this.c.d.c(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.b).b(this);
    }

    public void onAdShowFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("error = " + i + ", " + str));
        if (this.d == c.a.SHOWING) {
            a(c.a.FAILED);
            if (this.c != null) {
                this.c.d.a(q(), i, str, "");
            }
            ((com.ironsource.mediationsdk.adunit.c.a.a) this.b).a(new IronSourceError(i, str), this);
        } else if (this.c != null) {
            this.c.e.j(String.format("unexpected show failed for %s, error - %d, %s", new Object[]{m(), Integer.valueOf(i), str}));
        }
    }

    public void onAdShowSuccess() {
        IronLog.INTERNAL.verbose(c(""));
        if (this.c != null) {
            this.c.d.b(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.b).a(this);
    }

    public void onAdStarted() {
        IronLog.INTERNAL.verbose(c(""));
        if (this.c != null) {
            this.c.d.e(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.b).d(this);
    }

    public void onAdVisible() {
        IronLog.INTERNAL.verbose(c(""));
        if (this.c != null) {
            this.c.d.g(q());
        }
    }
}
