package com.ironsource.mediationsdk.adunit.e;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a<Smash extends c<?>> {
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> a = new ConcurrentHashMap<>();
    public String b = "";
    ConcurrentHashMap<String, AdInfo> c = new ConcurrentHashMap<>();
    private String d = "";
    private c<?> e;
    private final List<String> f;
    private final int g;
    private final Timer h = new Timer();
    private b i;
    private final int j = 5;

    public a(List<String> list, int i2, b bVar) {
        this.f = list;
        this.g = i2;
        this.i = bVar;
    }

    private synchronized void b() {
        c<?> cVar = this.e;
        if (cVar != null) {
            cVar.c();
        }
    }

    private synchronized boolean c() {
        c<?> cVar;
        cVar = this.e;
        return cVar != null && cVar.p() && this.e.o().equals(this.d);
    }

    private void d() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.equals(this.e)) {
                cVar.c();
            }
        }
    }

    public final AdInfo a(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public final CopyOnWriteArrayList<Smash> a() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.a.get(this.b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final void a(a.C0009a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        d();
        if (aVar == a.C0009a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.d)) {
                if (c()) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("ad from previous waterfall " + this.d + " is still showing - the current waterfall " + this.b + " will be deleted instead");
                    String str2 = this.b;
                    this.b = this.d;
                    this.d = str2;
                }
                final String str3 = this.d;
                this.h.schedule(new TimerTask() {
                    public final void run() {
                        try {
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("removing waterfall with id " + str3 + " from memory");
                            a.this.a.remove(str3);
                            IronLog ironLog2 = IronLog.INTERNAL;
                            ironLog2.verbose("waterfall size is currently " + a.this.a.size());
                            IronLog ironLog3 = IronLog.INTERNAL;
                            ironLog3.verbose("removing adInfo with id " + str3 + " from memory");
                            a.this.c.remove(str3);
                            IronLog ironLog4 = IronLog.INTERNAL;
                            ironLog4.verbose("adInfo size is currently " + a.this.c.size());
                        } finally {
                            cancel();
                        }
                    }
                }, (long) this.g);
            }
        } else {
            this.a.clear();
            this.a.put(str, copyOnWriteArrayList);
        }
        this.d = this.b;
        this.b = str;
        if (this.a.size() > 5) {
            this.i.a(this.a.size());
        }
    }

    public final synchronized void a(c<?> cVar) {
        IronLog.INTERNAL.verbose("");
        c<?> cVar2 = this.e;
        if (cVar2 != null && !cVar2.equals(cVar)) {
            b();
        }
        this.e = cVar;
    }

    public final void a(String str, ImpressionData impressionData) {
        if (!TextUtils.isEmpty(str) && impressionData != null) {
            this.c.put(str, new AdInfo(impressionData));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (r3.f.contains(r6) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r3.e.n().equals(r6) == false) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(com.ironsource.mediationsdk.adunit.c.b.a.C0009a r4, java.lang.String r5, java.lang.String r6, com.ironsource.mediationsdk.LoadWhileShowSupportState r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = com.ironsource.mediationsdk.adunit.c.b.a.C0009a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x0057 }
            r1 = 0
            r2 = 1
            if (r4 == r0) goto L_0x0009
        L_0x0007:
            r1 = r2
            goto L_0x003d
        L_0x0009:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.e     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0007
            boolean r4 = r4.p()     // Catch:{ all -> 0x0057 }
            if (r4 != 0) goto L_0x0014
            goto L_0x0007
        L_0x0014:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch:{ all -> 0x0057 }
            if (r7 != r4) goto L_0x0025
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.e     // Catch:{ all -> 0x0057 }
            java.lang.String r4 = r4.l()     // Catch:{ all -> 0x0057 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0025
            goto L_0x003d
        L_0x0025:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch:{ all -> 0x0057 }
            if (r7 == r4) goto L_0x0031
            java.util.List<java.lang.String> r4 = r3.f     // Catch:{ all -> 0x0057 }
            boolean r4 = r4.contains(r6)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0007
        L_0x0031:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.e     // Catch:{ all -> 0x0057 }
            java.lang.String r4 = r4.n()     // Catch:{ all -> 0x0057 }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0007
        L_0x003d:
            if (r1 != 0) goto L_0x0055
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0057 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            r6.<init>()     // Catch:{ all -> 0x0057 }
            r6.append(r5)     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = " does not support load while show and will not be added to the auction request"
            r6.append(r5)     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0057 }
            r4.verbose(r5)     // Catch:{ all -> 0x0057 }
        L_0x0055:
            monitor-exit(r3)
            return r1
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.e.a.a(com.ironsource.mediationsdk.adunit.c.b.a$a, java.lang.String, java.lang.String, com.ironsource.mediationsdk.LoadWhileShowSupportState):boolean");
    }
}
