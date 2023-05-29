package com.ironsource.mediationsdk.adunit.d.a;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0021f;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.a.b;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.b.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.f;
import com.ironsource.mediationsdk.utils.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class c<Listener extends b> implements AdapterAdListener, NetworkInitializationListener, com.ironsource.mediationsdk.adunit.b.c, c.a, n.a {
    protected com.ironsource.mediationsdk.adunit.d.a a;
    protected Listener b;
    protected d c;
    protected a d;
    protected Placement e;
    protected AdData f;
    protected Object g = new Object();
    private BaseAdAdapter<?, AdapterAdListener> h;
    private com.ironsource.mediationsdk.model.a i;
    private JSONObject j;
    private String k;
    private Long l;
    private f m;
    private com.ironsource.mediationsdk.b.c n = new com.ironsource.mediationsdk.b.c((long) (this.a.d * 1000));

    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    public c(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdAdapter<?, ?> baseAdAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        this.a = aVar;
        this.b = listener;
        this.c = new d(aVar.a, d.b.PROVIDER, this);
        this.i = aVar2;
        this.j = aVar2.b;
        this.h = baseAdAdapter;
        a(a.NONE);
    }

    private void a(AdapterErrorType adapterErrorType, int i2, String str, long j2) {
        if (this.c == null) {
            return;
        }
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.c.b.b(j2, i2);
        } else if (!TextUtils.isEmpty(str)) {
            this.c.b.a(j2, i2, str);
        } else {
            this.c.b.a(j2, i2);
        }
    }

    private boolean a() {
        return this.d == a.INIT_IN_PROGRESS;
    }

    public final Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter baseAdAdapter = this.h;
            String str = "";
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : str);
            BaseAdAdapter baseAdAdapter2 = this.h;
            if (baseAdAdapter2 != null) {
                str = baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str);
        } catch (Exception unused) {
            IronLog.INTERNAL.error(c("could not get adapter version for event data" + m()));
        }
        hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.i.a.getSubProviderId());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.i.a.getAdSourceNameForEvents());
        hashMap.put("instanceType", Integer.valueOf(j()));
        boolean z = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.k)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.k);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.a.e));
        if (this.a.f != null && this.a.f.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.a.f);
        }
        if (!TextUtils.isEmpty(this.a.g)) {
            hashMap.put("auctionId", this.a.g);
        }
        if (!(bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_NO_FILL || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_OPENED || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_CLOSED || bVar == com.ironsource.mediationsdk.adunit.b.b.SHOW_AD || bVar == com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_FAILED || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_CLICKED || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_REWARDED)) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.a.h));
            if (!TextUtils.isEmpty(this.a.i)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.a.i);
            }
        }
        if (!TextUtils.isEmpty(this.a.c.getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.a.c.getCustomNetwork());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("to " + aVar));
        this.d = aVar;
    }

    public final void a(String str) {
        try {
            IronLog.INTERNAL.verbose(c(""));
            boolean z = false;
            this.c.b.a(false);
            this.l = null;
            this.m = new f();
            HashMap hashMap = new HashMap();
            hashMap.put(DataKeys.USER_ID, this.a.b);
            hashMap.putAll(com.ironsource.mediationsdk.c.b.a(this.j));
            this.f = new AdData(str, hashMap);
            synchronized (this.g) {
                if (this.d != a.NONE) {
                    z = true;
                } else {
                    a(a.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str2 = "loadAd - incorrect state while loading, state = " + this.d;
                IronLog.INTERNAL.error(c(str2));
                this.c.e.m(str2);
                onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.a.a), str2);
                return;
            }
            this.n.a(this);
            AdapterBaseInterface networkAdapter = this.h.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str3 = "loadAd - network adapter not available " + m();
            IronLog.INTERNAL.error(c(str3));
            this.c.e.a(str3);
            onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.a.a), str3);
        } catch (Throwable th) {
            String str4 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(c(str4));
            d dVar = this.c;
            if (dVar != null) {
                dVar.e.m(str4);
            }
            onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.a.a), str4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        r0 = r6.b;
        r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("time out");
        com.ironsource.mediationsdk.utils.f.a(r6.m);
        r0.a(r1, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "state = "
            r1.<init>(r2)
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = r6.d
            r1.append(r2)
            java.lang.String r2 = ", isBidder = "
            r1.append(r2)
            boolean r2 = r6.i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r6.c(r1)
            r0.verbose(r1)
            com.ironsource.mediationsdk.utils.f r0 = r6.m
            long r0 = com.ironsource.mediationsdk.utils.f.a(r0)
            java.lang.String r2 = "time out"
            java.lang.Object r3 = r6.g
            monitor-enter(r3)
            boolean r4 = r6.d()     // Catch:{ all -> 0x0084 }
            r5 = 1025(0x401, float:1.436E-42)
            if (r4 == 0) goto L_0x005d
            com.ironsource.mediationsdk.adunit.d.a.c$a r4 = com.ironsource.mediationsdk.adunit.d.a.c.a.FAILED     // Catch:{ all -> 0x0084 }
            r6.a((com.ironsource.mediationsdk.adunit.d.a.c.a) r4)     // Catch:{ all -> 0x0084 }
            com.ironsource.mediationsdk.adunit.b.d r4 = r6.c     // Catch:{ all -> 0x0084 }
            if (r4 == 0) goto L_0x004d
            com.ironsource.mediationsdk.adunit.b.h r4 = r4.b     // Catch:{ all -> 0x0084 }
            r4.a((long) r0, (int) r5)     // Catch:{ all -> 0x0084 }
            com.ironsource.mediationsdk.adunit.b.d r4 = r6.c     // Catch:{ all -> 0x0084 }
            com.ironsource.mediationsdk.adunit.b.h r4 = r4.b     // Catch:{ all -> 0x0084 }
            r4.a((long) r0, (int) r5, (java.lang.String) r2)     // Catch:{ all -> 0x0084 }
        L_0x004d:
            monitor-exit(r3)     // Catch:{ all -> 0x0084 }
            Listener r0 = r6.b
            com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r2)
            com.ironsource.mediationsdk.utils.f r2 = r6.m
            com.ironsource.mediationsdk.utils.f.a(r2)
            r0.a(r1, r6)
            return
        L_0x005d:
            java.lang.String r0 = "unexpected timeout for %s, state - %s, error - %s"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0084 }
            r2 = 0
            java.lang.String r4 = r6.m()     // Catch:{ all -> 0x0084 }
            r1[r2] = r4     // Catch:{ all -> 0x0084 }
            r2 = 1
            com.ironsource.mediationsdk.adunit.d.a.c$a r4 = r6.d     // Catch:{ all -> 0x0084 }
            r1[r2] = r4     // Catch:{ all -> 0x0084 }
            r2 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0084 }
            r1[r2] = r4     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0084 }
            com.ironsource.mediationsdk.adunit.b.d r1 = r6.c     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x0082
            com.ironsource.mediationsdk.adunit.b.i r1 = r1.e     // Catch:{ all -> 0x0084 }
            r1.l(r0)     // Catch:{ all -> 0x0084 }
        L_0x0082:
            monitor-exit(r3)     // Catch:{ all -> 0x0084 }
            return
        L_0x0084:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0084 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.d.a.c.b():void");
    }

    public final void b(String str) {
        C0021f.a();
        this.k = C0021f.d(str);
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        String str2 = this.a.a.name() + " - " + m() + " - state = " + this.d;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    public void c() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.h;
        if (baseAdAdapter != null) {
            try {
                baseAdAdapter.releaseMemory();
                this.h = null;
            } catch (Exception e2) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.i.a.getProviderName() + " - " + e2.getLocalizedMessage();
                IronLog.INTERNAL.error(c(str));
                this.c.e.m(str);
            }
        }
        d dVar = this.c;
        if (dVar != null) {
            dVar.a();
            this.c = null;
        }
        com.ironsource.mediationsdk.b.c cVar = this.n;
        if (cVar != null) {
            cVar.c();
            this.n = null;
        }
    }

    public final boolean d() {
        return this.d == a.INIT_IN_PROGRESS || this.d == a.LOADING;
    }

    public final boolean e() {
        return this.d == a.LOADED;
    }

    public final boolean f() {
        return this.d != a.FAILED;
    }

    public final void g() {
        IronLog.INTERNAL.verbose(c(""));
        d dVar = this.c;
        if (dVar != null) {
            dVar.d.a();
        }
    }

    public final Long h() {
        return this.l;
    }

    public final boolean i() {
        return this.i.d;
    }

    public final int j() {
        return this.i.f;
    }

    public final int k() {
        return this.i.g;
    }

    public final String l() {
        return this.i.a.getProviderName();
    }

    public final String m() {
        return String.format("%s %s", new Object[]{l(), Integer.valueOf(hashCode())});
    }

    public final String n() {
        return this.i.a.getProviderTypeForReflection();
    }

    public final String o() {
        return this.a.g;
    }

    public void onAdClicked() {
        IronLog.INTERNAL.verbose(c(""));
        d dVar = this.c;
        if (dVar != null) {
            dVar.d.d(q());
        }
        this.b.b(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error = "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r7.c(r1)
            r0.verbose(r1)
            com.ironsource.mediationsdk.b.c r0 = r7.n
            if (r0 == 0) goto L_0x0026
            r0.d()
        L_0x0026:
            com.ironsource.mediationsdk.utils.f r0 = r7.m
            long r5 = com.ironsource.mediationsdk.utils.f.a(r0)
            java.lang.Object r0 = r7.g
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r7.d     // Catch:{ all -> 0x00b7 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.d.a.c.a.LOADING     // Catch:{ all -> 0x00b7 }
            if (r1 != r2) goto L_0x004d
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.a(r2, r3, r4, r5)     // Catch:{ all -> 0x00b7 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r8 = com.ironsource.mediationsdk.adunit.d.a.c.a.FAILED     // Catch:{ all -> 0x00b7 }
            r7.a((com.ironsource.mediationsdk.adunit.d.a.c.a) r8)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            Listener r8 = r7.b
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r0.<init>(r9, r10)
            r8.a(r0, r7)
            return
        L_0x004d:
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r7.d     // Catch:{ all -> 0x00b7 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.d.a.c.a.FAILED     // Catch:{ all -> 0x00b7 }
            if (r1 != r2) goto L_0x005c
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.a(r2, r3, r4, r5)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x005c:
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r7.d     // Catch:{ all -> 0x00b7 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.d.a.c.a.LOADED     // Catch:{ all -> 0x00b7 }
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x008f
            com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType r1 = com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED     // Catch:{ all -> 0x00b7 }
            if (r8 != r1) goto L_0x008f
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b7 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00b7 }
            r7.l = r8     // Catch:{ all -> 0x00b7 }
            com.ironsource.mediationsdk.adunit.b.d r8 = r7.c     // Catch:{ all -> 0x00b7 }
            if (r8 == 0) goto L_0x008d
            com.ironsource.mediationsdk.adunit.b.i r8 = r8.e     // Catch:{ all -> 0x00b7 }
            java.lang.String r9 = "ad expired for %s"
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b7 }
            com.ironsource.mediationsdk.model.a r1 = r7.i     // Catch:{ all -> 0x00b7 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r1.a     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = r1.getProviderName()     // Catch:{ all -> 0x00b7 }
            r10[r4] = r1     // Catch:{ all -> 0x00b7 }
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch:{ all -> 0x00b7 }
            r8.p(r9)     // Catch:{ all -> 0x00b7 }
        L_0x008d:
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x008f:
            java.lang.String r8 = "unexpected load failed for %s, state - %s, error - %s, %s"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = r7.m()     // Catch:{ all -> 0x00b7 }
            r1[r4] = r2     // Catch:{ all -> 0x00b7 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = r7.d     // Catch:{ all -> 0x00b7 }
            r1[r3] = r2     // Catch:{ all -> 0x00b7 }
            r2 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00b7 }
            r1[r2] = r9     // Catch:{ all -> 0x00b7 }
            r9 = 3
            r1[r9] = r10     // Catch:{ all -> 0x00b7 }
            java.lang.String r8 = java.lang.String.format(r8, r1)     // Catch:{ all -> 0x00b7 }
            com.ironsource.mediationsdk.adunit.b.d r9 = r7.c     // Catch:{ all -> 0x00b7 }
            if (r9 == 0) goto L_0x00b5
            com.ironsource.mediationsdk.adunit.b.i r9 = r9.e     // Catch:{ all -> 0x00b7 }
            r9.i(r8)     // Catch:{ all -> 0x00b7 }
        L_0x00b5:
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x00b7:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.d.a.c.onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType, int, java.lang.String):void");
    }

    public void onAdLoadSuccess() {
        IronLog.INTERNAL.verbose(c(""));
        com.ironsource.mediationsdk.b.c cVar = this.n;
        if (cVar != null) {
            cVar.d();
        }
        if (this.d == a.LOADING) {
            long a2 = f.a(this.m);
            d dVar = this.c;
            if (dVar != null) {
                dVar.b.a(a2, false);
            }
            a(a.LOADED);
            this.b.a(this);
        } else if (this.d != a.FAILED) {
            String format = String.format("unexpected load success for %s, state - %s", new Object[]{m(), this.d});
            d dVar2 = this.c;
            if (dVar2 != null) {
                dVar2.e.h(format);
            }
        }
    }

    public void onInitFailed(int i2, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("error = " + i2 + ", " + str));
        if (a()) {
            com.ironsource.mediationsdk.b.c cVar = this.n;
            if (cVar != null) {
                cVar.d();
            }
            a(a.FAILED);
            Listener listener = this.b;
            IronSourceError ironSourceError = new IronSourceError(i2, str);
            f.a(this.m);
            listener.a(ironSourceError, this);
        } else if (this.d != a.FAILED) {
            String format = String.format("unexpected init failed for %s, state - %s, error - %s, %s", new Object[]{m(), this.d, Integer.valueOf(i2), str});
            d dVar = this.c;
            if (dVar != null) {
                dVar.e.e(format);
            }
        }
    }

    public void onInitSuccess() {
        IronLog.INTERNAL.verbose(c(""));
        if (a()) {
            com.ironsource.mediationsdk.b.c cVar = this.n;
            if (cVar != null) {
                cVar.d();
            }
            a(a.READY_TO_LOAD);
            IronLog.INTERNAL.verbose(c(""));
            a(a.LOADING);
            try {
                this.n.a(this);
                this.h.loadAd(this.f, ContextProvider.getInstance().getCurrentActiveActivity(), this);
            } catch (Throwable th) {
                String str = "unexpected error while calling adapter.loadAd() - " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(c(str));
                d dVar = this.c;
                if (dVar != null) {
                    dVar.e.m(str);
                }
                onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
            }
        } else if (this.d != a.FAILED) {
            String format = String.format("unexpected init success for %s, state - %s", new Object[]{m(), this.d});
            d dVar2 = this.c;
            if (dVar2 != null) {
                dVar2.e.d(format);
            }
        }
    }

    public final boolean p() {
        return this.d == a.SHOWING;
    }

    /* access modifiers changed from: protected */
    public final String q() {
        Placement placement = this.e;
        return placement == null ? "" : placement.getPlacementName();
    }
}
