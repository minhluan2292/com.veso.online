package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.a;
import com.ironsource.environment.j;
import com.ironsource.mediationsdk.C0025j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.N;
import com.ironsource.mediationsdk.a.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.p;
import com.ironsource.mediationsdk.server.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.c;
import com.ironsource.mediationsdk.utils.n;
import com.veso.online.data.model.XosoConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

final class M extends C0034s implements j, D, O, ai, C0018c, C0022g {
    private long A;
    private Boolean B;
    private B C;
    P d;
    C0025j e;
    C0023h f;
    long g;
    final ConcurrentHashMap<String, N> h;
    n i;
    int j = 1;
    a k;
    final Object l = new Object();
    private ConcurrentHashMap<String, b> m;
    private ConcurrentHashMap<String, C0025j.a> n;
    private b o;
    private JSONObject p;
    private ah q;
    private boolean r;
    private String s = "";
    private int t;
    private NetworkStateReceiver u;
    private boolean v = false;
    private String w;
    private int x;
    private boolean y;
    private boolean z;

    enum a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public M(List<NetworkSettings> list, p pVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        p pVar2 = pVar;
        long time = new Date().getTime();
        a((int) IronSourceConstants.RV_MANAGER_INIT_STARTED);
        a(a.RV_STATE_INITIATING);
        this.B = null;
        this.x = pVar2.c;
        this.y = pVar2.d;
        this.w = "";
        this.p = null;
        c cVar = pVar2.l;
        this.z = false;
        this.d = new P(pVar2.l.p, pVar2.l.h);
        this.m = new ConcurrentHashMap<>();
        this.n = new ConcurrentHashMap<>();
        this.A = new Date().getTime();
        boolean z2 = cVar.f > 0;
        this.r = z2;
        if (z2) {
            this.f = new C0023h("rewardedVideo", cVar, this);
        }
        this.q = new ah(cVar, this);
        this.h = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a2 = C0019d.a().a(next, next.getRewardedVideoSettings(), false, false);
            if (a2 != null) {
                N n2 = r0;
                N n3 = new N(str, str2, next, this, pVar2.e, a2, this.j);
                String l2 = n2.l();
                this.h.put(l2, n2);
                arrayList.add(l2);
            }
        }
        this.e = new C0025j(arrayList, cVar.g);
        this.i = new n(new ArrayList(this.h.values()));
        a((int) IronSourceConstants.RV_MANAGER_INIT_ENDED, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        this.C = new B(pVar2.i, this);
        a(cVar.j);
    }

    private String a(b bVar) {
        N n2 = this.h.get(bVar.a());
        String num = n2 != null ? Integer.toString(n2.j()) : TextUtils.isEmpty(bVar.b()) ? XosoConfig.REGION_ID_SOUTH : XosoConfig.REGION_ID_NORTH;
        return num + bVar.a();
    }

    private void a(int i2, Map<String, Object> map, boolean z2, boolean z3) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z3 && !TextUtils.isEmpty(this.d.b)) {
            hashMap.put("auctionId", this.d.b);
        }
        JSONObject jSONObject = this.p;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.p);
        }
        if (z2 && !TextUtils.isEmpty(this.w)) {
            hashMap.put("placement", this.w);
        }
        if (b(i2)) {
            h.d();
            h.a((Map<String, Object>) hashMap, this.t, this.s);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.j));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e2), 3);
            }
        }
        h.d().b(new com.ironsource.mediationsdk.a.c(i2, new JSONObject(hashMap)));
    }

    private void a(long j2) {
        if (this.i.a()) {
            a("all smashes are capped");
            b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            f();
            return;
        }
        a(IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.r) {
            if (!this.n.isEmpty()) {
                this.e.a(this.n);
                this.n.clear();
            }
            new Timer().schedule(new TimerTask() {
                public final void run() {
                    M m = M.this;
                    synchronized (m.l) {
                        if (m.k != a.RV_STATE_AUCTION_IN_PROGRESS) {
                            m.a(a.RV_STATE_AUCTION_IN_PROGRESS);
                            AsyncTask.execute(new Runnable() {
                                public final void run() {
                                    StringBuilder sb;
                                    M.a("makeAuction()");
                                    M.this.g = new Date().getTime();
                                    HashMap hashMap = new HashMap();
                                    ArrayList arrayList = new ArrayList();
                                    StringBuilder sb2 = new StringBuilder();
                                    for (N next : M.this.h.values()) {
                                        if (!M.this.i.b(next) && M.this.d.b(next)) {
                                            if (next.h()) {
                                                Map<String, Object> a2 = next.a();
                                                if (a2 != null) {
                                                    hashMap.put(next.l(), a2);
                                                    sb = new StringBuilder();
                                                } else {
                                                    next.b(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
                                                }
                                            } else {
                                                arrayList.add(next.l());
                                                sb = new StringBuilder();
                                            }
                                            sb.append(next.j());
                                            sb.append(next.l());
                                            sb.append(",");
                                            sb2.append(sb.toString());
                                        }
                                    }
                                    if (hashMap.keySet().size() == 0 && arrayList.size() == 0) {
                                        M.this.b((int) IronSourceConstants.RV_AUCTION_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
                                        M.a("makeAuction() failed - No candidates available for auctioning");
                                        M.this.f();
                                        return;
                                    }
                                    M.a("makeAuction() - request waterfall is: " + sb2);
                                    M.this.a(1000);
                                    M.this.a((int) IronSourceConstants.RV_AUCTION_REQUEST);
                                    M.this.a((int) IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
                                    M.this.f.a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, M.this.e, M.this.j, M.this.b);
                                }
                            });
                        }
                    }
                }
            }, j2);
            return;
        }
        a("auction fallback flow starting");
        g();
        if (this.d.a().isEmpty()) {
            a("loadSmashes -  waterfall is empty");
            b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            f();
            return;
        }
        a(1000);
        i();
    }

    private static void a(N n2, String str) {
        String str2 = n2.l() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    static void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 0);
    }

    private void a(List<b> list, String str, JSONObject jSONObject) {
        this.m.clear();
        this.n.clear();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        StringBuilder sb = new StringBuilder();
        for (b next : list) {
            sb.append(a(next) + ",");
            N n2 = this.h.get(next.a());
            if (n2 != null) {
                AbstractAdapter a2 = C0019d.a().a(n2.d.a);
                if (a2 != null) {
                    N n3 = new N(n2, this, a2, this.j, str, jSONObject, this.t, this.s);
                    n3.e = true;
                    copyOnWriteArrayList.add(n3);
                    this.m.put(n3.l(), next);
                    this.n.put(next.a(), C0025j.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                a("updateWaterfall() - could not find matching smash for auction response item " + next.a());
            }
        }
        this.d.a((CopyOnWriteArrayList<N>) copyOnWriteArrayList, str);
        if (this.d.b()) {
            b((int) IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfalls hold too many with size=" + this.d.a.size()}}));
        }
        a("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            a("Updated waterfall is empty");
        }
        b((int) IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    private void a(boolean z2, Map<String, Object> map) {
        synchronized (this.l) {
            Boolean bool = this.B;
            if (bool == null || bool.booleanValue() != z2) {
                this.B = Boolean.valueOf(z2);
                long time = new Date().getTime() - this.A;
                this.A = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("duration", Long.valueOf(time));
                b(z2 ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                ae a2 = ae.a();
                P p2 = this.d;
                a2.a(z2, p2.a(p2.b));
            }
        }
    }

    private static void b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 3);
    }

    private static boolean b(int i2) {
        return i2 == 1003 || i2 == 1302 || i2 == 1301 || i2 == 1303;
    }

    private void c(int i2) {
        a(i2, (Map<String, Object>) null, true, true);
    }

    private void c(int i2, Map<String, Object> map) {
        a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    private static void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void g() {
        List<b> h2 = h();
        a(h2, "fallback_" + System.currentTimeMillis(), this.p);
    }

    private void g(N n2) {
        String b = this.m.get(n2.l()).b();
        n2.b(b);
        n2.a(b);
    }

    private List<b> h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (N next : this.h.values()) {
            if (!next.h() && !this.i.b(next) && this.d.b(next)) {
                copyOnWriteArrayList.add(new b(next.l()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void i() {
        if (this.d.a().isEmpty()) {
            a("loadSmashes -  waterfall is empty");
            b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            f();
            return;
        }
        a(a.RV_STATE_LOADING_SMASHES);
        int i2 = 0;
        for (int i3 = 0; i3 < this.d.a().size() && i2 < this.x; i3++) {
            N n2 = this.d.a().get(i3);
            if (n2.e) {
                if (!this.y || !n2.h()) {
                    g(n2);
                    i2++;
                } else if (i2 == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + n2.l() + ". No other instances will be loaded at the same time.";
                    a(str);
                    IronSourceUtils.sendAutomationLog(str);
                    g(n2);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + n2.l() + " as a non bidder is being loaded";
                    a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        a(i2, (Map<String, Object>) null, false, false);
    }

    public final void a(int i2, String str, int i3, String str2, long j2) {
        Map<String, Object> map;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i2 + " - " + str + ")";
        a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.t = i3;
        this.s = str2;
        this.p = null;
        g();
        if (TextUtils.isEmpty(str)) {
            map = a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"duration", Long.valueOf(j2)}});
        } else {
            map = a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j2)}});
        }
        b((int) IronSourceConstants.RV_AUCTION_FAILED, map);
        i();
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, Map<String, Object> map) {
        a(i2, map, false, false);
    }

    public final void a(Context context, boolean z2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager Should Track Network State: " + z2, 0);
        try {
            this.v = z2;
            if (z2) {
                if (this.u == null) {
                    this.u = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.u, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.u != null) {
                context.getApplicationContext().unregisterReceiver(this.u);
            }
        } catch (Exception e2) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        a("current state=" + this.k + ", new state=" + aVar);
        this.k = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x011c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ironsource.mediationsdk.N r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.l
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            java.lang.String r2 = "onLoadSuccess mState="
            r1.<init>(r2)     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.M$a r2 = r12.k     // Catch:{ all -> 0x016e }
            r1.append(r2)     // Catch:{ all -> 0x016e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x016e }
            a((com.ironsource.mediationsdk.N) r13, (java.lang.String) r1)     // Catch:{ all -> 0x016e }
            java.lang.String r1 = r13.b     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.P r2 = r12.d     // Catch:{ all -> 0x016e }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x016e }
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 != r2) goto L_0x011d
            com.ironsource.mediationsdk.M$a r1 = r12.k     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.M$a r2 = com.ironsource.mediationsdk.M.a.RV_STATE_AUCTION_IN_PROGRESS     // Catch:{ all -> 0x016e }
            if (r1 != r2) goto L_0x0029
            goto L_0x011d
        L_0x0029:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r1 = r12.n     // Catch:{ all -> 0x016e }
            java.lang.String r2 = r13.l()     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.j$a r6 = com.ironsource.mediationsdk.C0025j.a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x016e }
            r1.put(r2, r6)     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.M$a r1 = r12.k     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.M$a r2 = com.ironsource.mediationsdk.M.a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x016e }
            if (r1 != r2) goto L_0x011b
            com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.M.a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x016e }
            r12.a((com.ironsource.mediationsdk.M.a) r1)     // Catch:{ all -> 0x016e }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x016e }
            r1.<init>()     // Catch:{ all -> 0x016e }
            long r1 = r1.getTime()     // Catch:{ all -> 0x016e }
            long r6 = r12.g     // Catch:{ all -> 0x016e }
            long r1 = r1 - r6
            r6 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r7 = new java.lang.Object[r5][]     // Catch:{ all -> 0x016e }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x016e }
            java.lang.String r9 = "duration"
            r8[r3] = r9     // Catch:{ all -> 0x016e }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x016e }
            r8[r5] = r1     // Catch:{ all -> 0x016e }
            r7[r3] = r8     // Catch:{ all -> 0x016e }
            java.util.Map r1 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x016e }
            r12.b((int) r6, (java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.B r1 = r12.C     // Catch:{ all -> 0x016e }
            r6 = 0
            r1.a(r6)     // Catch:{ all -> 0x016e }
            boolean r1 = r12.r     // Catch:{ all -> 0x016e }
            if (r1 == 0) goto L_0x0117
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r1 = r12.m     // Catch:{ all -> 0x016e }
            java.lang.String r2 = r13.l()     // Catch:{ all -> 0x016e }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x016e }
            r11 = r1
            com.ironsource.mediationsdk.server.b r11 = (com.ironsource.mediationsdk.server.b) r11     // Catch:{ all -> 0x016e }
            if (r11 == 0) goto L_0x00ab
            com.ironsource.mediationsdk.P r1 = r12.d     // Catch:{ all -> 0x016e }
            java.lang.String r2 = r1.b     // Catch:{ all -> 0x016e }
            java.lang.String r3 = ""
            com.ironsource.mediationsdk.impressionData.ImpressionData r3 = r11.a(r3)     // Catch:{ all -> 0x016e }
            r1.a((java.lang.String) r2, (com.ironsource.mediationsdk.impressionData.ImpressionData) r3)     // Catch:{ all -> 0x016e }
            int r1 = r13.j()     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.server.b r2 = r12.o     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.C0023h.a(r11, r1, r2)     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.h r6 = r12.f     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.P r1 = r12.d     // Catch:{ all -> 0x016e }
            java.util.concurrent.CopyOnWriteArrayList r7 = r1.a()     // Catch:{ all -> 0x016e }
            r1 = r7
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1     // Catch:{ all -> 0x016e }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r8 = r12.m     // Catch:{ all -> 0x016e }
            int r9 = r13.j()     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.server.b r10 = r12.o     // Catch:{ all -> 0x016e }
            r6.a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.ac>) r7, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b>) r8, (int) r9, (com.ironsource.mediationsdk.server.b) r10, (com.ironsource.mediationsdk.server.b) r11)     // Catch:{ all -> 0x016e }
            goto L_0x0117
        L_0x00ab:
            java.lang.String r1 = r13.l()     // Catch:{ all -> 0x016e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            java.lang.String r6 = "onLoadSuccess winner instance "
            r2.<init>(r6)     // Catch:{ all -> 0x016e }
            r2.append(r1)     // Catch:{ all -> 0x016e }
            java.lang.String r6 = " missing from waterfall. auctionId: "
            r2.append(r6)     // Catch:{ all -> 0x016e }
            java.lang.String r13 = r13.b     // Catch:{ all -> 0x016e }
            r2.append(r13)     // Catch:{ all -> 0x016e }
            java.lang.String r13 = " and the current id is "
            r2.append(r13)     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.P r13 = r12.d     // Catch:{ all -> 0x016e }
            java.lang.String r13 = r13.b     // Catch:{ all -> 0x016e }
            r2.append(r13)     // Catch:{ all -> 0x016e }
            java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x016e }
            b((java.lang.String) r13)     // Catch:{ all -> 0x016e }
            r13 = 81317(0x13da5, float:1.1395E-40)
            r2 = 3
            java.lang.Object[][] r2 = new java.lang.Object[r2][]     // Catch:{ all -> 0x016e }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x016e }
            java.lang.String r7 = "errorCode"
            r6[r3] = r7     // Catch:{ all -> 0x016e }
            r7 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x016e }
            r6[r5] = r7     // Catch:{ all -> 0x016e }
            r2[r3] = r6     // Catch:{ all -> 0x016e }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x016e }
            java.lang.String r7 = "reason"
            r6[r3] = r7     // Catch:{ all -> 0x016e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            java.lang.String r8 = "Loaded missing "
            r7.<init>(r8)     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.M$a r8 = com.ironsource.mediationsdk.M.a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x016e }
            r7.append(r8)     // Catch:{ all -> 0x016e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x016e }
            r6[r5] = r7     // Catch:{ all -> 0x016e }
            r2[r5] = r6     // Catch:{ all -> 0x016e }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x016e }
            java.lang.String r7 = "ext1"
            r6[r3] = r7     // Catch:{ all -> 0x016e }
            r6[r5] = r1     // Catch:{ all -> 0x016e }
            r2[r4] = r6     // Catch:{ all -> 0x016e }
            java.util.Map r1 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r2)     // Catch:{ all -> 0x016e }
            r12.b((int) r13, (java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ all -> 0x016e }
        L_0x0117:
            r13 = 0
            r12.a((boolean) r5, (java.util.Map<java.lang.String, java.lang.Object>) r13)     // Catch:{ all -> 0x016e }
        L_0x011b:
            monitor-exit(r0)     // Catch:{ all -> 0x016e }
            return
        L_0x011d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            java.lang.String r2 = "onLoadSuccess was invoked with auctionId: "
            r1.<init>(r2)     // Catch:{ all -> 0x016e }
            java.lang.String r2 = r13.b     // Catch:{ all -> 0x016e }
            r1.append(r2)     // Catch:{ all -> 0x016e }
            java.lang.String r2 = " and the current id is "
            r1.append(r2)     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.P r2 = r12.d     // Catch:{ all -> 0x016e }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x016e }
            r1.append(r2)     // Catch:{ all -> 0x016e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x016e }
            a((java.lang.String) r1)     // Catch:{ all -> 0x016e }
            r1 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r2 = new java.lang.Object[r4][]     // Catch:{ all -> 0x016e }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x016e }
            java.lang.String r7 = "errorCode"
            r6[r3] = r7     // Catch:{ all -> 0x016e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x016e }
            r6[r5] = r7     // Catch:{ all -> 0x016e }
            r2[r3] = r6     // Catch:{ all -> 0x016e }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x016e }
            java.lang.String r6 = "reason"
            r4[r3] = r6     // Catch:{ all -> 0x016e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            java.lang.String r6 = "onLoadSuccess wrong auction ID "
            r3.<init>(r6)     // Catch:{ all -> 0x016e }
            com.ironsource.mediationsdk.M$a r6 = r12.k     // Catch:{ all -> 0x016e }
            r3.append(r6)     // Catch:{ all -> 0x016e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x016e }
            r4[r5] = r3     // Catch:{ all -> 0x016e }
            r2[r5] = r4     // Catch:{ all -> 0x016e }
            r13.b(r1, r2)     // Catch:{ all -> 0x016e }
            monitor-exit(r0)     // Catch:{ all -> 0x016e }
            return
        L_0x016e:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x016e }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.M.a(com.ironsource.mediationsdk.N):void");
    }

    public final void a(N n2, Placement placement) {
        a(n2, "onRewardedVideoAdRewarded");
        ae.a().a(placement, this.d.a(n2.b));
    }

    public final void a(IronSourceError ironSourceError, N n2) {
        b bVar;
        if (this.r && (bVar = this.m.get(n2.l())) != null) {
            P p2 = this.d;
            p2.a(p2.b, bVar.a(this.w));
        }
        a(n2, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.z = false;
        c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
        ae.a().a(ironSourceError, this.d.a(n2.b));
        this.n.put(n2.l(), C0025j.a.ISAuctionPerformanceFailedToShow);
        if (this.k != a.RV_STATE_READY_TO_SHOW) {
            a(false, (Map<String, Object>) null);
        }
        this.q.c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01fc, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01fe, code lost:
        a("showVideo()");
        r10.i.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x020e, code lost:
        if (r10.i.b(r6) == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0210, code lost:
        r6.b_();
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r6.l() + " rewarded video is now session capped");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x022b, code lost:
        com.ironsource.mediationsdk.utils.k.e(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r11.getPlacementName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x024a, code lost:
        if (com.ironsource.mediationsdk.utils.k.c(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r11.getPlacementName()) == false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x024c, code lost:
        c((int) com.ironsource.mediationsdk.utils.IronSourceConstants.RV_CAP_PLACEMENT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0251, code lost:
        r10.C.a();
        r6.a(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ironsource.mediationsdk.model.Placement r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.l
            monitor-enter(r0)
            r1 = 1113(0x459, float:1.56E-42)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r11 != 0) goto L_0x0048
            java.lang.String r11 = "showRewardedVideo error: empty default placement"
            c((java.lang.String) r11)     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x025a }
            r6 = 1021(0x3fd, float:1.431E-42)
            r5.<init>(r6, r11)     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.ae r7 = com.ironsource.mediationsdk.ae.a()     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.P r8 = r10.d     // Catch:{ all -> 0x025a }
            java.lang.String r9 = r8.b     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r8 = r8.a((java.lang.String) r9)     // Catch:{ all -> 0x025a }
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r5, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r8)     // Catch:{ all -> 0x025a }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x025a }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x025a }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x025a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x025a }
            r7[r3] = r6     // Catch:{ all -> 0x025a }
            r5[r4] = r7     // Catch:{ all -> 0x025a }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x025a }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x025a }
            r2[r3] = r11     // Catch:{ all -> 0x025a }
            r5[r3] = r2     // Catch:{ all -> 0x025a }
            java.util.Map r11 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x025a }
            r10.a(r1, r11, r4, r3)     // Catch:{ all -> 0x025a }
            monitor-exit(r0)     // Catch:{ all -> 0x025a }
            return
        L_0x0048:
            java.lang.String r5 = r11.getPlacementName()     // Catch:{ all -> 0x025a }
            r10.w = r5     // Catch:{ all -> 0x025a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            java.lang.String r6 = "showRewardedVideo("
            r5.<init>(r6)     // Catch:{ all -> 0x025a }
            r5.append(r11)     // Catch:{ all -> 0x025a }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x025a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x025a }
            r6.log(r7, r5, r4)     // Catch:{ all -> 0x025a }
            r5 = 1100(0x44c, float:1.541E-42)
            r10.c((int) r5)     // Catch:{ all -> 0x025a }
            boolean r5 = r10.z     // Catch:{ all -> 0x025a }
            if (r5 == 0) goto L_0x00b1
            java.lang.String r11 = "showRewardedVideo error: can't show ad while an ad is already showing"
            c((java.lang.String) r11)     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x025a }
            r6 = 1022(0x3fe, float:1.432E-42)
            r5.<init>(r6, r11)     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.ae r7 = com.ironsource.mediationsdk.ae.a()     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.P r8 = r10.d     // Catch:{ all -> 0x025a }
            java.lang.String r9 = r8.b     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r8 = r8.a((java.lang.String) r9)     // Catch:{ all -> 0x025a }
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r5, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r8)     // Catch:{ all -> 0x025a }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x025a }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x025a }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x025a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x025a }
            r7[r3] = r6     // Catch:{ all -> 0x025a }
            r5[r4] = r7     // Catch:{ all -> 0x025a }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x025a }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x025a }
            r2[r3] = r11     // Catch:{ all -> 0x025a }
            r5[r3] = r2     // Catch:{ all -> 0x025a }
            java.util.Map r11 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x025a }
            r10.c(r1, r11)     // Catch:{ all -> 0x025a }
            monitor-exit(r0)     // Catch:{ all -> 0x025a }
            return
        L_0x00b1:
            com.ironsource.mediationsdk.M$a r5 = r10.k     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.M$a r6 = com.ironsource.mediationsdk.M.a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x025a }
            if (r5 == r6) goto L_0x00f5
            java.lang.String r11 = "showRewardedVideo error: show called while no ads are available"
            c((java.lang.String) r11)     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x025a }
            r6 = 1023(0x3ff, float:1.434E-42)
            r5.<init>(r6, r11)     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.ae r7 = com.ironsource.mediationsdk.ae.a()     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.P r8 = r10.d     // Catch:{ all -> 0x025a }
            java.lang.String r9 = r8.b     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r8 = r8.a((java.lang.String) r9)     // Catch:{ all -> 0x025a }
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r5, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r8)     // Catch:{ all -> 0x025a }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x025a }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x025a }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x025a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x025a }
            r7[r3] = r6     // Catch:{ all -> 0x025a }
            r5[r4] = r7     // Catch:{ all -> 0x025a }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x025a }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x025a }
            r2[r3] = r11     // Catch:{ all -> 0x025a }
            r5[r3] = r2     // Catch:{ all -> 0x025a }
            java.util.Map r11 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x025a }
            r10.c(r1, r11)     // Catch:{ all -> 0x025a }
            monitor-exit(r0)     // Catch:{ all -> 0x025a }
            return
        L_0x00f5:
            com.ironsource.environment.ContextProvider r5 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x025a }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x025a }
            java.lang.String r6 = r10.w     // Catch:{ all -> 0x025a }
            boolean r5 = com.ironsource.mediationsdk.utils.k.c((android.content.Context) r5, (java.lang.String) r6)     // Catch:{ all -> 0x025a }
            if (r5 == 0) goto L_0x0156
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            java.lang.String r5 = "showRewardedVideo error: placement "
            r11.<init>(r5)     // Catch:{ all -> 0x025a }
            java.lang.String r5 = r10.w     // Catch:{ all -> 0x025a }
            r11.append(r5)     // Catch:{ all -> 0x025a }
            java.lang.String r5 = " is capped"
            r11.append(r5)     // Catch:{ all -> 0x025a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x025a }
            c((java.lang.String) r11)     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x025a }
            r6 = 524(0x20c, float:7.34E-43)
            r5.<init>(r6, r11)     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.ae r7 = com.ironsource.mediationsdk.ae.a()     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.P r8 = r10.d     // Catch:{ all -> 0x025a }
            java.lang.String r9 = r8.b     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r8 = r8.a((java.lang.String) r9)     // Catch:{ all -> 0x025a }
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r5, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r8)     // Catch:{ all -> 0x025a }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x025a }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x025a }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x025a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x025a }
            r7[r3] = r6     // Catch:{ all -> 0x025a }
            r5[r4] = r7     // Catch:{ all -> 0x025a }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x025a }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x025a }
            r2[r3] = r11     // Catch:{ all -> 0x025a }
            r5[r3] = r2     // Catch:{ all -> 0x025a }
            java.util.Map r11 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x025a }
            r10.c(r1, r11)     // Catch:{ all -> 0x025a }
            monitor-exit(r0)     // Catch:{ all -> 0x025a }
            return
        L_0x0156:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ all -> 0x025a }
            r2.<init>()     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.P r5 = r10.d     // Catch:{ all -> 0x025a }
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.a()     // Catch:{ all -> 0x025a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x025a }
        L_0x0165:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x025a }
            if (r6 == 0) goto L_0x01b0
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.N r6 = (com.ironsource.mediationsdk.N) r6     // Catch:{ all -> 0x025a }
            boolean r7 = r6.b()     // Catch:{ all -> 0x025a }
            if (r7 == 0) goto L_0x0182
            r10.z = r3     // Catch:{ all -> 0x025a }
            r6.a((boolean) r3)     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.M$a r3 = com.ironsource.mediationsdk.M.a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x025a }
            r10.a((com.ironsource.mediationsdk.M.a) r3)     // Catch:{ all -> 0x025a }
            goto L_0x01b1
        L_0x0182:
            java.lang.Long r7 = r6.p()     // Catch:{ all -> 0x025a }
            if (r7 == 0) goto L_0x01ac
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            r7.<init>()     // Catch:{ all -> 0x025a }
            java.lang.String r8 = r6.l()     // Catch:{ all -> 0x025a }
            r7.append(r8)     // Catch:{ all -> 0x025a }
            java.lang.String r8 = ":"
            r7.append(r8)     // Catch:{ all -> 0x025a }
            java.lang.Long r8 = r6.p()     // Catch:{ all -> 0x025a }
            r7.append(r8)     // Catch:{ all -> 0x025a }
            java.lang.String r8 = ","
            r7.append(r8)     // Catch:{ all -> 0x025a }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x025a }
            r2.append(r7)     // Catch:{ all -> 0x025a }
        L_0x01ac:
            r6.a((boolean) r4)     // Catch:{ all -> 0x025a }
            goto L_0x0165
        L_0x01b0:
            r6 = 0
        L_0x01b1:
            if (r6 != 0) goto L_0x01fb
            java.lang.String r11 = "showRewardedVideo(): No ads to show"
            a((java.lang.String) r11)     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.ae r3 = com.ironsource.mediationsdk.ae.a()     // Catch:{ all -> 0x025a }
            java.lang.String r4 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r4 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r4)     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.P r5 = r10.d     // Catch:{ all -> 0x025a }
            java.lang.String r6 = r5.b     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r5 = r5.a((java.lang.String) r6)     // Catch:{ all -> 0x025a }
            r3.a((com.ironsource.mediationsdk.logger.IronSourceError) r4, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r5)     // Catch:{ all -> 0x025a }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x025a }
            r3.<init>()     // Catch:{ all -> 0x025a }
            java.lang.String r4 = "errorCode"
            r5 = 509(0x1fd, float:7.13E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x025a }
            r3.put(r4, r5)     // Catch:{ all -> 0x025a }
            java.lang.String r4 = "reason"
            r3.put(r4, r11)     // Catch:{ all -> 0x025a }
            int r11 = r2.length()     // Catch:{ all -> 0x025a }
            if (r11 == 0) goto L_0x01f1
            java.lang.String r11 = "ext1"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x025a }
            r3.put(r11, r2)     // Catch:{ all -> 0x025a }
        L_0x01f1:
            r10.c(r1, r3)     // Catch:{ all -> 0x025a }
            com.ironsource.mediationsdk.ah r11 = r10.q     // Catch:{ all -> 0x025a }
            r11.c()     // Catch:{ all -> 0x025a }
            monitor-exit(r0)     // Catch:{ all -> 0x025a }
            return
        L_0x01fb:
            monitor-exit(r0)     // Catch:{ all -> 0x025a }
            if (r6 == 0) goto L_0x0259
            java.lang.String r0 = "showVideo()"
            a((java.lang.String) r0)
            com.ironsource.mediationsdk.utils.n r0 = r10.i
            r0.a(r6)
            com.ironsource.mediationsdk.utils.n r0 = r10.i
            boolean r0 = r0.b(r6)
            if (r0 == 0) goto L_0x022b
            r6.b_()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.l()
            r0.append(r1)
            java.lang.String r1 = " rewarded video is now session capped"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)
        L_0x022b:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r11.getPlacementName()
            com.ironsource.mediationsdk.utils.k.e(r0, r1)
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r11.getPlacementName()
            boolean r0 = com.ironsource.mediationsdk.utils.k.c((android.content.Context) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x0251
            r0 = 1400(0x578, float:1.962E-42)
            r10.c((int) r0)
        L_0x0251:
            com.ironsource.mediationsdk.B r0 = r10.C
            r0.a()
            r6.a((com.ironsource.mediationsdk.model.Placement) r11)
        L_0x0259:
            return
        L_0x025a:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x025a }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.M.a(com.ironsource.mediationsdk.model.Placement):void");
    }

    public final void a(List<b> list, String str, b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j2, int i3, String str2) {
        a("makeAuction(): success");
        this.o = bVar;
        this.t = i2;
        this.p = jSONObject;
        this.s = "";
        if (!TextUtils.isEmpty(str2)) {
            b((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i3)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        a(jSONObject2, IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.a.a(IronSource.AD_UNIT.REWARDED_VIDEO)) {
            b((int) IronSourceConstants.RV_AD_UNIT_CAPPED, a.AnonymousClass1.a(new Object[][]{new Object[]{"auctionId", str}}));
            f();
            return;
        }
        a(list, str, this.p);
        b((int) IronSourceConstants.RV_AUCTION_SUCCESS, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(j2)}}));
        i();
    }

    public final void a(boolean z2) {
        if (this.v) {
            boolean z3 = false;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z2, 0);
            Boolean bool = this.B;
            if (bool != null && ((z2 && !bool.booleanValue() && c()) || (!z2 && this.B.booleanValue()))) {
                z3 = true;
            }
            if (z3) {
                a(z2, (Map<String, Object>) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, Map<String, Object> map) {
        a(i2, map, false, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011f, code lost:
        r11 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0127, code lost:
        if (r11.hasNext() == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0129, code lost:
        g((com.ironsource.mediationsdk.N) r11.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0133, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.ironsource.mediationsdk.N r11) {
        /*
            r10 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.Object r1 = r10.l
            monitor-enter(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = "onLoadError mState="
            r2.<init>(r3)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.M$a r3 = r10.k     // Catch:{ all -> 0x0187 }
            r2.append(r3)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0187 }
            a((com.ironsource.mediationsdk.N) r11, (java.lang.String) r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r11.b     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.P r3 = r10.d     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x0187 }
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x0134
            com.ironsource.mediationsdk.M$a r2 = r10.k     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.M$a r3 = com.ironsource.mediationsdk.M.a.RV_STATE_AUCTION_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r2 != r3) goto L_0x002d
            goto L_0x0134
        L_0x002d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r2 = r10.n     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = r11.l()     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.j$a r6 = com.ironsource.mediationsdk.C0025j.a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x0187 }
            r2.put(r3, r6)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.M$a r2 = r10.k     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.M$a r3 = com.ironsource.mediationsdk.M.a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0187 }
            if (r2 == r3) goto L_0x0046
            com.ironsource.mediationsdk.M$a r2 = r10.k     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.M$a r3 = com.ironsource.mediationsdk.M.a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0187 }
            if (r2 == r3) goto L_0x0046
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            return
        L_0x0046:
            com.ironsource.mediationsdk.P r2 = r10.d     // Catch:{ all -> 0x0187 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.a()     // Catch:{ all -> 0x0187 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0187 }
            r3 = r5
            r6 = r3
        L_0x0052:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x00fd
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.N r7 = (com.ironsource.mediationsdk.N) r7     // Catch:{ all -> 0x0187 }
            boolean r8 = r7.e     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00df
            boolean r8 = r10.y     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00b7
            boolean r8 = r7.h()     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00b7
            if (r3 != 0) goto L_0x008f
            if (r6 == 0) goto L_0x0071
            goto L_0x008f
        L_0x0071:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = "Advanced Loading: Starting to load bidder "
            r8.<init>(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = r7.l()     // Catch:{ all -> 0x0187 }
            r8.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = ". No other instances will be loaded at the same time."
            r8.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0187 }
            a((java.lang.String) r8)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r8)     // Catch:{ all -> 0x0187 }
            goto L_0x00b7
        L_0x008f:
            if (r3 == 0) goto L_0x0094
            java.lang.String r11 = "a non bidder is being loaded"
            goto L_0x0096
        L_0x0094:
            java.lang.String r11 = "a non bidder was already loaded successfully"
        L_0x0096:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = "Advanced Loading: Won't start loading bidder "
            r2.<init>(r4)     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = r7.l()     // Catch:{ all -> 0x0187 }
            r2.append(r4)     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = " as "
            r2.append(r4)     // Catch:{ all -> 0x0187 }
            r2.append(r11)     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x0187 }
            a((java.lang.String) r11)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r11)     // Catch:{ all -> 0x0187 }
            goto L_0x00fd
        L_0x00b7:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r8 = r10.m     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = r7.l()     // Catch:{ all -> 0x0187 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x0052
            r0.add(r7)     // Catch:{ all -> 0x0187 }
            boolean r8 = r10.y     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00fd
            boolean r8 = r11.h()     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00fd
            boolean r7 = r7.h()     // Catch:{ all -> 0x0187 }
            if (r7 != 0) goto L_0x00fd
            int r7 = r0.size()     // Catch:{ all -> 0x0187 }
            int r8 = r10.x     // Catch:{ all -> 0x0187 }
            if (r7 >= r8) goto L_0x00fd
            goto L_0x00f1
        L_0x00df:
            com.ironsource.mediationsdk.N$a r8 = r7.a     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.N$a r9 = com.ironsource.mediationsdk.N.a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r8 == r9) goto L_0x00ee
            com.ironsource.mediationsdk.N$a r8 = r7.a     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.N$a r9 = com.ironsource.mediationsdk.N.a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r8 != r9) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r8 = r5
            goto L_0x00ef
        L_0x00ee:
            r8 = r4
        L_0x00ef:
            if (r8 == 0) goto L_0x00f4
        L_0x00f1:
            r3 = r4
            goto L_0x0052
        L_0x00f4:
            boolean r7 = r7.b()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x0052
            r6 = r4
            goto L_0x0052
        L_0x00fd:
            int r11 = r0.size()     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x011e
            if (r6 != 0) goto L_0x011e
            if (r3 != 0) goto L_0x011e
            java.lang.String r11 = "onLoadError(): No other available smashes"
            a((java.lang.String) r11)     // Catch:{ all -> 0x0187 }
            boolean r11 = r10.z     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x0114
            r11 = 0
            r10.a((boolean) r5, (java.util.Map<java.lang.String, java.lang.Object>) r11)     // Catch:{ all -> 0x0187 }
        L_0x0114:
            com.ironsource.mediationsdk.M$a r11 = com.ironsource.mediationsdk.M.a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0187 }
            r10.a((com.ironsource.mediationsdk.M.a) r11)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.ah r11 = r10.q     // Catch:{ all -> 0x0187 }
            r11.d()     // Catch:{ all -> 0x0187 }
        L_0x011e:
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            java.util.Iterator r11 = r0.iterator()
        L_0x0123:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r11.next()
            com.ironsource.mediationsdk.N r0 = (com.ironsource.mediationsdk.N) r0
            r10.g(r0)
            goto L_0x0123
        L_0x0133:
            return
        L_0x0134:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = "onLoadError was invoked with auctionId:"
            r0.<init>(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r11.b     // Catch:{ all -> 0x0187 }
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = " and the current id is "
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.P r2 = r10.d     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x0187 }
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0187 }
            a((java.lang.String) r0)     // Catch:{ all -> 0x0187 }
            r0 = 81315(0x13da3, float:1.13947E-40)
            r2 = 2
            java.lang.Object[][] r3 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0187 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x0187 }
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0187 }
            r6[r4] = r7     // Catch:{ all -> 0x0187 }
            r3[r5] = r6     // Catch:{ all -> 0x0187 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = "reason"
            r2[r5] = r6     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = "loadError wrong auction ID "
            r5.<init>(r6)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.M$a r6 = r10.k     // Catch:{ all -> 0x0187 }
            r5.append(r6)     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0187 }
            r2[r4] = r5     // Catch:{ all -> 0x0187 }
            r3[r4] = r2     // Catch:{ all -> 0x0187 }
            r11.b(r0, r3)     // Catch:{ all -> 0x0187 }
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            return
        L_0x0187:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.M.b(com.ironsource.mediationsdk.N):void");
    }

    public final void b(N n2, Placement placement) {
        a(n2, "onRewardedVideoAdClicked");
        ae.a().b(placement, this.d.a(n2.b));
    }

    public final void c(N n2) {
        this.d.a(n2);
        this.j++;
        a(n2, "onRewardedVideoAdOpened");
        if (this.r) {
            b bVar = this.m.get(n2.l());
            if (bVar != null) {
                P p2 = this.d;
                p2.a(p2.b, bVar.a(this.w));
                C0023h.a(bVar, n2.j(), this.o, this.w);
                this.n.put(n2.l(), C0025j.a.ISAuctionPerformanceShowedSuccessfully);
                a(bVar, this.w);
            } else {
                String l2 = n2.l();
                b("onRewardedVideoAdOpened showing instance " + l2 + " missing from waterfall");
                b((int) IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.k}, new Object[]{IronSourceConstants.EVENTS_EXT1, l2}}));
            }
        }
        ae.a().a(this.d.a(n2.b));
        a(false, (Map<String, Object>) null);
        this.q.a();
    }

    public final boolean c() {
        if ((!this.v || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.k == a.RV_STATE_READY_TO_SHOW && !this.z) {
            Iterator<N> it = this.d.a().iterator();
            while (it.hasNext()) {
                if (it.next().b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c_() {
        a(a.RV_STATE_NOT_LOADED);
        a(false, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        a(0);
    }

    public final void d(N n2) {
        String str;
        a(n2, "onRewardedVideoAdClosed, mediation state: " + this.k.name());
        ae.a().b(this.d.a(n2.b));
        this.z = false;
        boolean z2 = this.k == a.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            Iterator<N> it = this.d.a().iterator();
            while (it.hasNext()) {
                N next = it.next();
                if (next.a == N.a.LOADED) {
                    sb.append(next.l() + ";");
                }
            }
        }
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb2 = new StringBuilder("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + sb;
        } else {
            str = "false";
        }
        sb2.append(str);
        objArr2[1] = sb2.toString();
        objArr[0] = objArr2;
        n2.a((int) IronSourceConstants.RV_INSTANCE_CLOSED, objArr);
        if (n2.equals(this.d.c)) {
            this.d.a((N) null);
            if (this.k != a.RV_STATE_READY_TO_SHOW) {
                a(false, (Map<String, Object>) null);
            }
        }
    }

    public final void e() {
        a("onLoadTriggered: RV load was triggered in " + this.k + " state");
        a(0);
    }

    public final void e(N n2) {
        a(n2, "onRewardedVideoAdStarted");
        ae.a().b();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        a(a.RV_STATE_NOT_LOADED);
        if (!this.z) {
            a(false, (Map<String, Object>) null);
        }
        this.q.d();
    }

    public final void f(N n2) {
        a(n2, "onRewardedVideoAdEnded");
        ae.a().c();
    }
}
