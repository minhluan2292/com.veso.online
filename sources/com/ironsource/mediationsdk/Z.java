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
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.c;
import com.ironsource.mediationsdk.utils.k;
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

final class Z extends C0034s implements j, D, aa, ai, C0018c, C0022g {
    private Boolean A;
    private a B;
    private int C;
    private String D = "";
    private boolean E = false;
    private NetworkStateReceiver F;
    private B G;
    final ConcurrentHashMap<String, ab> d;
    n e;
    C0023h f;
    C0025j g;
    String h;
    JSONObject i;
    int j = 1;
    long k;
    private CopyOnWriteArrayList<ab> l;
    private List<b> m;
    private ConcurrentHashMap<String, b> n;
    private ConcurrentHashMap<String, C0025j.a> o;
    private b p;
    private ah q;
    private boolean r;
    private boolean s;
    private boolean t;
    private String u;
    private long v;
    private long w;
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
    public Z(List<NetworkSettings> list, p pVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        p pVar2 = pVar;
        long time = new Date().getTime();
        a((int) IronSourceConstants.RV_MANAGER_INIT_STARTED);
        a(a.RV_STATE_INITIATING);
        this.A = null;
        this.x = pVar2.c;
        this.y = pVar2.d;
        this.u = "";
        c cVar = pVar2.l;
        this.z = false;
        this.l = new CopyOnWriteArrayList<>();
        this.m = new ArrayList();
        this.n = new ConcurrentHashMap<>();
        this.o = new ConcurrentHashMap<>();
        this.w = new Date().getTime();
        this.r = cVar.f > 0;
        this.s = cVar.n;
        this.t = !cVar.o;
        this.v = cVar.m;
        if (this.r) {
            this.f = new C0023h("rewardedVideo", cVar, this);
        }
        this.q = new ah(cVar, this);
        this.d = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a2 = C0019d.a().a(next, next.getRewardedVideoSettings(), false, false);
            if (a2 != null) {
                C0020e a3 = C0020e.a();
                if (a3.a(a2, a3.b, "rewarded video")) {
                    ab abVar = r0;
                    ab abVar2 = new ab(str, str2, next, this, pVar2.e, a2);
                    String l2 = abVar.l();
                    this.d.put(l2, abVar);
                    arrayList.add(l2);
                }
            }
        }
        this.g = new C0025j(arrayList, cVar.g);
        this.e = new n(new ArrayList(this.d.values()));
        for (ab next2 : this.d.values()) {
            if (next2.h() || next2.i()) {
                next2.b();
            }
        }
        a((int) IronSourceConstants.RV_MANAGER_INIT_ENDED, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        this.G = new B(pVar2.i, this);
        a(cVar.j);
    }

    private String a(b bVar) {
        ab abVar = this.d.get(bVar.a());
        String num = abVar != null ? Integer.toString(abVar.j()) : TextUtils.isEmpty(bVar.b()) ? XosoConfig.REGION_ID_SOUTH : XosoConfig.REGION_ID_NORTH;
        return num + bVar.a();
    }

    private void a(int i2, Map<String, Object> map, boolean z2, boolean z3) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (z3 && !TextUtils.isEmpty(this.h)) {
            hashMap.put("auctionId", this.h);
        }
        JSONObject jSONObject = this.i;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.i);
        }
        if (z2 && !TextUtils.isEmpty(this.u)) {
            hashMap.put("placement", this.u);
        }
        if (c(i2)) {
            h.d();
            h.a((Map<String, Object>) hashMap, this.C, this.D);
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
                logger.log(ironSourceTag, "ProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e2), 3);
            }
        }
        h.d().b(new com.ironsource.mediationsdk.a.c(i2, new JSONObject(hashMap)));
    }

    private void a(long j2) {
        if (this.e.a()) {
            b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            g();
            return;
        }
        a_();
        if (this.r) {
            if (!this.o.isEmpty()) {
                this.g.a(this.o);
                this.o.clear();
            }
            new Timer().schedule(new TimerTask() {
                public final void run() {
                    Z z = Z.this;
                    z.a(a.RV_STATE_AUCTION_IN_PROGRESS);
                    AsyncTask.execute(new Runnable() {
                        public final void run() {
                            StringBuilder sb;
                            Z.a("makeAuction()");
                            Z.this.h = "";
                            Z.this.i = null;
                            Z.this.a(IronSource.AD_UNIT.REWARDED_VIDEO);
                            Z.this.k = new Date().getTime();
                            HashMap hashMap = new HashMap();
                            ArrayList arrayList = new ArrayList();
                            StringBuilder sb2 = new StringBuilder();
                            for (ab next : Z.this.d.values()) {
                                if (next.h()) {
                                    next.b = false;
                                }
                                if (!Z.this.e.b(next)) {
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
                                Z.this.b((int) IronSourceConstants.RV_AUCTION_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
                                Z.a("makeAuction() failed - No candidates available for auctioning");
                                Z.this.g();
                                return;
                            }
                            Z.a("makeAuction() - request waterfall is: " + sb2);
                            Z.this.a(1000);
                            Z.this.a((int) IronSourceConstants.RV_AUCTION_REQUEST);
                            Z.this.a((int) IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
                            Z.this.f.a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, Z.this.g, Z.this.j, Z.this.b);
                        }
                    });
                }
            }, j2);
            return;
        }
        IronLog.INTERNAL.verbose("auction is disabled, fallback flow will occur");
        h();
        if (this.m.isEmpty()) {
            b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80002}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            g();
            return;
        }
        a(1000);
        if (!this.t || !this.z) {
            f();
        }
    }

    static void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 0);
    }

    private void a(List<b> list) {
        this.m = list;
        StringBuilder sb = new StringBuilder();
        for (b a2 : list) {
            sb.append(a(a2) + ",");
        }
        a("updateNextWaterfallToLoad() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            a("Updated waterfall is empty");
        }
        b((int) IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    private void a(boolean z2, Map<String, Object> map) {
        Boolean bool = this.A;
        if (bool == null || bool.booleanValue() != z2) {
            this.A = Boolean.valueOf(z2);
            long time = new Date().getTime() - this.w;
            this.w = new Date().getTime();
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("duration", Long.valueOf(time));
            b(z2 ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
            ae.a().a(z2, this.c);
        }
    }

    private void b(int i2) {
        a(i2, new HashMap(), true, true);
    }

    private static void b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 3);
    }

    private void b(List<b> list) {
        this.l.clear();
        this.n.clear();
        this.o.clear();
        for (b next : list) {
            ab abVar = this.d.get(next.a());
            if (abVar != null) {
                abVar.e = true;
                this.l.add(abVar);
                this.n.put(abVar.l(), next);
                this.o.put(next.a(), C0025j.a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                a("updateWaterfall() - could not find matching smash for auction response item " + next.a());
            }
        }
        this.m.clear();
    }

    private void b(boolean z2) {
        a(z2, (Map<String, Object>) new HashMap());
    }

    private void c(int i2, Map<String, Object> map) {
        a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    private static void c(ab abVar, String str) {
        String str2 = abVar.l() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager: " + str2, 0);
    }

    private static void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private static boolean c(int i2) {
        return i2 == 1003 || i2 == 1302 || i2 == 1301 || i2 == 1303;
    }

    private void e(ab abVar) {
        String b = this.n.get(abVar.l()).b();
        C0021f.a();
        ab abVar2 = abVar;
        abVar2.a(b, this.h, this.i, this.C, this.D, this.j, C0021f.d(b));
    }

    private void h() {
        this.h = d();
        a(i());
    }

    private List<b> i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (ab next : this.d.values()) {
            if (!next.h() && !this.e.b(next)) {
                copyOnWriteArrayList.add(new b(next.l()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void j() {
        if (this.l.isEmpty()) {
            b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            g();
            return;
        }
        a(a.RV_STATE_LOADING_SMASHES);
        int i2 = 0;
        for (int i3 = 0; i3 < this.l.size() && i2 < this.x; i3++) {
            ab abVar = this.l.get(i3);
            if (abVar.e) {
                if (!this.y || !abVar.h()) {
                    e(abVar);
                    i2++;
                } else if (i2 == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + abVar.l() + ". No other instances will be loaded at the same time.";
                    a(str);
                    IronSourceUtils.sendAutomationLog(str);
                    e(abVar);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + abVar.l() + " as a non bidder is being loaded";
                    a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        a(i2, new HashMap(), false, false);
    }

    public final void a(int i2, String str, int i3, String str2, long j2) {
        Map<String, Object> map;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i2 + " - " + str + ")";
        a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.C = i3;
        this.D = str2;
        this.i = null;
        h();
        if (TextUtils.isEmpty(str)) {
            map = a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"duration", Long.valueOf(j2)}});
        } else {
            map = a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j2)}});
        }
        b((int) IronSourceConstants.RV_AUCTION_FAILED, map);
        if (!this.t || !this.z) {
            f();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, Map<String, Object> map) {
        a(i2, map, false, false);
    }

    public final void a(Context context, boolean z2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager Should Track Network State: " + z2, 0);
        try {
            this.E = z2;
            if (z2) {
                if (this.F == null) {
                    this.F = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.F, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.F != null) {
                context.getApplicationContext().unregisterReceiver(this.F);
            }
        } catch (Exception e2) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        a("current state=" + this.B + ", new state=" + aVar);
        this.B = aVar;
    }

    public final void a(ab abVar) {
        synchronized (this) {
            this.j++;
            c(abVar, "onRewardedVideoAdOpened");
            if (this.r) {
                b bVar = this.n.get(abVar.l());
                if (bVar != null) {
                    a(bVar.a(this.u));
                    C0023h.a(bVar, abVar.j(), this.p, this.u);
                    this.o.put(abVar.l(), C0025j.a.ISAuctionPerformanceShowedSuccessfully);
                    a(bVar, this.u);
                } else {
                    String l2 = abVar.l();
                    b("onRewardedVideoAdOpened showing instance " + l2 + " missing from waterfall");
                    b((int) IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.B}, new Object[]{IronSourceConstants.EVENTS_EXT1, l2}}));
                }
            }
            ae.a().a(this.c);
            this.q.a();
        }
    }

    public final void a(ab abVar, Placement placement) {
        c(abVar, "onRewardedVideoAdRewarded");
        ae.a().a(placement, this.c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0146, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ironsource.mediationsdk.ab r12, java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "onLoadSuccess "
            c((com.ironsource.mediationsdk.ab) r12, (java.lang.String) r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r11.h     // Catch:{ all -> 0x0147 }
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0060
            boolean r0 = r13.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0147 }
            if (r0 != 0) goto L_0x0060
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            java.lang.String r4 = "onLoadSuccess was invoked with auctionId: "
            r0.<init>(r4)     // Catch:{ all -> 0x0147 }
            r0.append(r13)     // Catch:{ all -> 0x0147 }
            java.lang.String r13 = " and the current id is "
            r0.append(r13)     // Catch:{ all -> 0x0147 }
            java.lang.String r13 = r11.h     // Catch:{ all -> 0x0147 }
            r0.append(r13)     // Catch:{ all -> 0x0147 }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x0147 }
            a((java.lang.String) r13)     // Catch:{ all -> 0x0147 }
            r13 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r0 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0147 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0147 }
            java.lang.String r5 = "errorCode"
            r4[r1] = r5     // Catch:{ all -> 0x0147 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0147 }
            r4[r3] = r5     // Catch:{ all -> 0x0147 }
            r0[r1] = r4     // Catch:{ all -> 0x0147 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0147 }
            java.lang.String r4 = "reason"
            r2[r1] = r4     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            java.lang.String r4 = "onLoadSuccess wrong auction ID "
            r1.<init>(r4)     // Catch:{ all -> 0x0147 }
            com.ironsource.mediationsdk.Z$a r4 = r11.B     // Catch:{ all -> 0x0147 }
            r1.append(r4)     // Catch:{ all -> 0x0147 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0147 }
            r2[r3] = r1     // Catch:{ all -> 0x0147 }
            r0[r3] = r2     // Catch:{ all -> 0x0147 }
            r12.b(r13, r0)     // Catch:{ all -> 0x0147 }
            monitor-exit(r11)
            return
        L_0x0060:
            com.ironsource.mediationsdk.Z$a r0 = r11.B     // Catch:{ all -> 0x0147 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r4 = r11.o     // Catch:{ all -> 0x0147 }
            java.lang.String r5 = r12.l()     // Catch:{ all -> 0x0147 }
            com.ironsource.mediationsdk.j$a r6 = com.ironsource.mediationsdk.C0025j.a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x0147 }
            r4.put(r5, r6)     // Catch:{ all -> 0x0147 }
            com.ironsource.mediationsdk.Z$a r4 = r11.B     // Catch:{ all -> 0x0147 }
            com.ironsource.mediationsdk.Z$a r5 = com.ironsource.mediationsdk.Z.a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0147 }
            if (r4 != r5) goto L_0x0145
            com.ironsource.mediationsdk.Z$a r4 = com.ironsource.mediationsdk.Z.a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0147 }
            r11.a((com.ironsource.mediationsdk.Z.a) r4)     // Catch:{ all -> 0x0147 }
            java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x0147 }
            r4.<init>()     // Catch:{ all -> 0x0147 }
            long r4 = r4.getTime()     // Catch:{ all -> 0x0147 }
            long r6 = r11.k     // Catch:{ all -> 0x0147 }
            long r4 = r4 - r6
            r6 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r7 = new java.lang.Object[r3][]     // Catch:{ all -> 0x0147 }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0147 }
            java.lang.String r9 = "duration"
            r8[r1] = r9     // Catch:{ all -> 0x0147 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0147 }
            r8[r3] = r4     // Catch:{ all -> 0x0147 }
            r7[r1] = r8     // Catch:{ all -> 0x0147 }
            java.util.Map r4 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x0147 }
            r11.b((int) r6, (java.util.Map<java.lang.String, java.lang.Object>) r4)     // Catch:{ all -> 0x0147 }
            com.ironsource.mediationsdk.B r4 = r11.G     // Catch:{ all -> 0x0147 }
            r5 = 0
            r4.a(r5)     // Catch:{ all -> 0x0147 }
            boolean r4 = r11.r     // Catch:{ all -> 0x0147 }
            if (r4 == 0) goto L_0x0142
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r4 = r11.n     // Catch:{ all -> 0x0147 }
            java.lang.String r5 = r12.l()     // Catch:{ all -> 0x0147 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0147 }
            r10 = r4
            com.ironsource.mediationsdk.server.b r10 = (com.ironsource.mediationsdk.server.b) r10     // Catch:{ all -> 0x0147 }
            if (r10 == 0) goto L_0x00dc
            java.lang.String r13 = ""
            com.ironsource.mediationsdk.impressionData.ImpressionData r13 = r10.a(r13)     // Catch:{ all -> 0x0147 }
            r11.a((com.ironsource.mediationsdk.impressionData.ImpressionData) r13)     // Catch:{ all -> 0x0147 }
            int r13 = r12.j()     // Catch:{ all -> 0x0147 }
            com.ironsource.mediationsdk.server.b r0 = r11.p     // Catch:{ all -> 0x0147 }
            com.ironsource.mediationsdk.C0023h.a(r10, r13, r0)     // Catch:{ all -> 0x0147 }
            com.ironsource.mediationsdk.h r5 = r11.f     // Catch:{ all -> 0x0147 }
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.ab> r6 = r11.l     // Catch:{ all -> 0x0147 }
            r13 = r6
            java.util.concurrent.CopyOnWriteArrayList r13 = (java.util.concurrent.CopyOnWriteArrayList) r13     // Catch:{ all -> 0x0147 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r7 = r11.n     // Catch:{ all -> 0x0147 }
            int r8 = r12.j()     // Catch:{ all -> 0x0147 }
            com.ironsource.mediationsdk.server.b r9 = r11.p     // Catch:{ all -> 0x0147 }
            r5.a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.ac>) r6, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b>) r7, (int) r8, (com.ironsource.mediationsdk.server.b) r9, (com.ironsource.mediationsdk.server.b) r10)     // Catch:{ all -> 0x0147 }
            goto L_0x0142
        L_0x00dc:
            java.lang.String r12 = r12.l()     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            java.lang.String r5 = "onLoadSuccess winner instance "
            r4.<init>(r5)     // Catch:{ all -> 0x0147 }
            r4.append(r12)     // Catch:{ all -> 0x0147 }
            java.lang.String r5 = " missing from waterfall. auctionId: "
            r4.append(r5)     // Catch:{ all -> 0x0147 }
            r4.append(r13)     // Catch:{ all -> 0x0147 }
            java.lang.String r13 = " and the current id is "
            r4.append(r13)     // Catch:{ all -> 0x0147 }
            java.lang.String r13 = r11.h     // Catch:{ all -> 0x0147 }
            r4.append(r13)     // Catch:{ all -> 0x0147 }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x0147 }
            b((java.lang.String) r13)     // Catch:{ all -> 0x0147 }
            r13 = 81317(0x13da5, float:1.1395E-40)
            r4 = 3
            java.lang.Object[][] r4 = new java.lang.Object[r4][]     // Catch:{ all -> 0x0147 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0147 }
            java.lang.String r6 = "errorCode"
            r5[r1] = r6     // Catch:{ all -> 0x0147 }
            r6 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0147 }
            r5[r3] = r6     // Catch:{ all -> 0x0147 }
            r4[r1] = r5     // Catch:{ all -> 0x0147 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0147 }
            java.lang.String r6 = "reason"
            r5[r1] = r6     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            java.lang.String r7 = "Loaded missing "
            r6.<init>(r7)     // Catch:{ all -> 0x0147 }
            r6.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0147 }
            r5[r3] = r0     // Catch:{ all -> 0x0147 }
            r4[r3] = r5     // Catch:{ all -> 0x0147 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0147 }
            java.lang.String r5 = "ext1"
            r0[r1] = r5     // Catch:{ all -> 0x0147 }
            r0[r3] = r12     // Catch:{ all -> 0x0147 }
            r4[r2] = r0     // Catch:{ all -> 0x0147 }
            java.util.Map r12 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r4)     // Catch:{ all -> 0x0147 }
            r11.b((int) r13, (java.util.Map<java.lang.String, java.lang.Object>) r12)     // Catch:{ all -> 0x0147 }
        L_0x0142:
            r11.b((boolean) r3)     // Catch:{ all -> 0x0147 }
        L_0x0145:
            monitor-exit(r11)
            return
        L_0x0147:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.Z.a(com.ironsource.mediationsdk.ab, java.lang.String):void");
    }

    public final void a(IronSourceError ironSourceError, ab abVar) {
        b bVar;
        synchronized (this) {
            if (this.r && (bVar = this.n.get(abVar.l())) != null) {
                a(bVar.a(this.u));
            }
            c(abVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
            c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
            ae.a().a(ironSourceError, this.c);
            this.z = false;
            this.o.put(abVar.l(), C0025j.a.ISAuctionPerformanceFailedToShow);
            if (this.B != a.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
            this.q.c();
        }
    }

    public final synchronized void a(Placement placement) {
        if (placement == null) {
            c("showRewardedVideo error: empty default placement");
            ae.a().a(new IronSourceError(1021, "showRewardedVideo error: empty default placement"), this.c);
            a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: empty default placement"}}), false, true);
            return;
        }
        this.u = placement.getPlacementName();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo(" + placement + ")", 0);
        b((int) IronSourceConstants.RV_API_SHOW_CALLED);
        if (this.z) {
            c("showRewardedVideo error: can't show ad while an ad is already showing");
            ae.a().a(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing"), this.c);
            c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: can't show ad while an ad is already showing"}}));
        } else if (this.B != a.RV_STATE_READY_TO_SHOW) {
            c("showRewardedVideo error: show called while no ads are available");
            ae.a().a(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "showRewardedVideo error: show called while no ads are available"), this.c);
            c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: show called while no ads are available"}}));
        } else if (k.c(ContextProvider.getInstance().getApplicationContext(), this.u)) {
            String str = "showRewardedVideo error: placement " + this.u + " is capped";
            c(str);
            ae.a().a(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str), this.c);
            c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}}));
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<ab> it = this.l.iterator();
            while (it.hasNext()) {
                ab next = it.next();
                if (next.c()) {
                    this.z = true;
                    next.a(true, this.j);
                    a("showVideo()");
                    this.e.a(next);
                    if (this.e.b(next)) {
                        next.f();
                        IronSourceUtils.sendAutomationLog(next.l() + " rewarded video is now session capped");
                    }
                    k.e(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
                    if (k.c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
                        b((int) IronSourceConstants.RV_CAP_PLACEMENT);
                    }
                    this.G.a();
                    next.a(placement, this.j);
                    a(a.RV_STATE_NOT_LOADED);
                    return;
                }
                if (next.p() != null) {
                    stringBuffer.append(next.l() + ":" + next.p() + ",");
                }
                next.a(false, this.j);
            }
            a("showRewardedVideo(): No ads to show");
            ae.a().a(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT), this.c);
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, 509);
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo(): No ads to show");
            if (stringBuffer.length() != 0) {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
            }
            c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, (Map<String, Object>) hashMap);
            this.q.c();
        }
    }

    public final void a(List<b> list, String str, b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j2, int i3, String str2) {
        a("makeAuction(): success");
        this.h = str;
        this.p = bVar;
        this.i = jSONObject;
        this.C = i2;
        this.D = "";
        if (!TextUtils.isEmpty(str2)) {
            b((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i3)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        a(jSONObject2, IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.a.a(IronSource.AD_UNIT.REWARDED_VIDEO)) {
            b((int) IronSourceConstants.RV_AD_UNIT_CAPPED, a.AnonymousClass1.a(new Object[][]{new Object[]{"auctionId", str}}));
            g();
            return;
        }
        b((int) IronSourceConstants.RV_AUCTION_SUCCESS, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(j2)}}));
        a(list);
        if (!this.t || !this.z) {
            f();
        }
    }

    public final void a(boolean z2) {
        if (this.E) {
            boolean z3 = false;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z2, 0);
            Boolean bool = this.A;
            if (bool != null && ((z2 && !bool.booleanValue() && c()) || (!z2 && this.A.booleanValue()))) {
                z3 = true;
            }
            if (z3) {
                b(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, Map<String, Object> map) {
        a(i2, map, false, true);
    }

    public final void b(ab abVar) {
        synchronized (this) {
            abVar.a((int) IronSourceConstants.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "otherRVAvailable = false"}});
            c(abVar, "onRewardedVideoAdClosed, mediation state: " + this.B.name());
            ae.a().b(this.c);
            this.z = false;
            if (this.B != a.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
            if (this.s) {
                List<b> list = this.m;
                if (list != null && list.size() > 0) {
                    new Timer().schedule(new TimerTask() {
                        public final void run() {
                            Z.this.f();
                        }
                    }, this.v);
                }
            } else {
                this.q.b();
            }
        }
    }

    public final void b(ab abVar, Placement placement) {
        c(abVar, "onRewardedVideoAdClicked");
        ae.a().b(placement, this.c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015b, code lost:
        r9 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0163, code lost:
        if (r9.hasNext() == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0165, code lost:
        e((com.ironsource.mediationsdk.ab) r9.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016f, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.ironsource.mediationsdk.ab r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "onLoadError state="
            r1.<init>(r2)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r2 = r8.B     // Catch:{ all -> 0x0170 }
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0170 }
            c((com.ironsource.mediationsdk.ab) r9, (java.lang.String) r1)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r8.h     // Catch:{ all -> 0x0170 }
            boolean r1 = r10.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0170 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0072
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = "onLoadError was invoked with auctionId:"
            r0.<init>(r1)     // Catch:{ all -> 0x0170 }
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = " and the current id is "
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = r8.h     // Catch:{ all -> 0x0170 }
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x0170 }
            a((java.lang.String) r10)     // Catch:{ all -> 0x0170 }
            r10 = 81315(0x13da3, float:1.13947E-40)
            r0 = 2
            java.lang.Object[][] r1 = new java.lang.Object[r0][]     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0170 }
            java.lang.String r5 = "errorCode"
            r4[r3] = r5     // Catch:{ all -> 0x0170 }
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0170 }
            r4[r2] = r5     // Catch:{ all -> 0x0170 }
            r1[r3] = r4     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = "reason"
            r0[r3] = r4     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = "loadError wrong auction ID "
            r3.<init>(r4)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r4 = r8.B     // Catch:{ all -> 0x0170 }
            r3.append(r4)     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0170 }
            r0[r2] = r3     // Catch:{ all -> 0x0170 }
            r1[r2] = r0     // Catch:{ all -> 0x0170 }
            r9.b(r10, r1)     // Catch:{ all -> 0x0170 }
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            return
        L_0x0072:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r10 = r8.o     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r9.l()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.j$a r4 = com.ironsource.mediationsdk.C0025j.a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x0170 }
            r10.put(r1, r4)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r10 = r8.B     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r1 = com.ironsource.mediationsdk.Z.a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0170 }
            if (r10 == r1) goto L_0x008b
            com.ironsource.mediationsdk.Z$a r10 = r8.B     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r1 = com.ironsource.mediationsdk.Z.a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0170 }
            if (r10 == r1) goto L_0x008b
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            return
        L_0x008b:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.ab> r10 = r8.l     // Catch:{ all -> 0x0170 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0170 }
            r1 = r3
            r4 = r1
        L_0x0093:
            boolean r5 = r10.hasNext()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r10.next()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.ab r5 = (com.ironsource.mediationsdk.ab) r5     // Catch:{ all -> 0x0170 }
            boolean r6 = r5.e     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x0120
            boolean r6 = r8.y     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x00f8
            boolean r6 = r5.h()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x00f8
            if (r1 != 0) goto L_0x00d0
            if (r4 == 0) goto L_0x00b2
            goto L_0x00d0
        L_0x00b2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "Advanced Loading: Starting to load bidder "
            r6.<init>(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = r5.l()     // Catch:{ all -> 0x0170 }
            r6.append(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = ". No other instances will be loaded at the same time."
            r6.append(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0170 }
            a((java.lang.String) r6)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r6)     // Catch:{ all -> 0x0170 }
            goto L_0x00f8
        L_0x00d0:
            if (r1 == 0) goto L_0x00d5
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00d7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r5.l()     // Catch:{ all -> 0x0170 }
            r10.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = " as "
            r10.append(r2)     // Catch:{ all -> 0x0170 }
            r10.append(r9)     // Catch:{ all -> 0x0170 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x0170 }
            a((java.lang.String) r9)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x0170 }
            goto L_0x013e
        L_0x00f8:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r6 = r8.n     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = r5.l()     // Catch:{ all -> 0x0170 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x0093
            r0.add(r5)     // Catch:{ all -> 0x0170 }
            boolean r6 = r8.y     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x013e
            boolean r6 = r9.h()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x013e
            boolean r5 = r5.h()     // Catch:{ all -> 0x0170 }
            if (r5 != 0) goto L_0x013e
            int r5 = r0.size()     // Catch:{ all -> 0x0170 }
            int r6 = r8.x     // Catch:{ all -> 0x0170 }
            if (r5 >= r6) goto L_0x013e
            goto L_0x0132
        L_0x0120:
            com.ironsource.mediationsdk.ab$a r6 = r5.a     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.ab$a r7 = com.ironsource.mediationsdk.ab.a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0170 }
            if (r6 == r7) goto L_0x012f
            com.ironsource.mediationsdk.ab$a r6 = r5.a     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.ab$a r7 = com.ironsource.mediationsdk.ab.a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x0170 }
            if (r6 != r7) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r6 = r3
            goto L_0x0130
        L_0x012f:
            r6 = r2
        L_0x0130:
            if (r6 == 0) goto L_0x0135
        L_0x0132:
            r1 = r2
            goto L_0x0093
        L_0x0135:
            boolean r5 = r5.c()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x0093
            r4 = r2
            goto L_0x0093
        L_0x013e:
            int r9 = r0.size()     // Catch:{ all -> 0x0170 }
            if (r9 != 0) goto L_0x015a
            if (r4 != 0) goto L_0x015a
            if (r1 != 0) goto L_0x015a
            java.lang.String r9 = "onLoadError(): No other available smashes"
            a((java.lang.String) r9)     // Catch:{ all -> 0x0170 }
            r8.b((boolean) r3)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r9 = com.ironsource.mediationsdk.Z.a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0170 }
            r8.a((com.ironsource.mediationsdk.Z.a) r9)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.ah r9 = r8.q     // Catch:{ all -> 0x0170 }
            r9.d()     // Catch:{ all -> 0x0170 }
        L_0x015a:
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            java.util.Iterator r9 = r0.iterator()
        L_0x015f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x016f
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.ab r10 = (com.ironsource.mediationsdk.ab) r10
            r8.e(r10)
            goto L_0x015f
        L_0x016f:
            return
        L_0x0170:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.Z.b(com.ironsource.mediationsdk.ab, java.lang.String):void");
    }

    public final void c(ab abVar) {
        c(abVar, "onRewardedVideoAdStarted");
        ae.a().b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean c() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.E     // Catch:{ all -> 0x0040 }
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0040 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0040 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0016
            monitor-exit(r3)
            return r1
        L_0x0016:
            com.ironsource.mediationsdk.Z$a r0 = r3.B     // Catch:{ all -> 0x0040 }
            com.ironsource.mediationsdk.Z$a r2 = com.ironsource.mediationsdk.Z.a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0040 }
            if (r0 != r2) goto L_0x003e
            boolean r0 = r3.z     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0021
            goto L_0x003e
        L_0x0021:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.ab> r0 = r3.l     // Catch:{ all -> 0x0040 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0040 }
        L_0x0027:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0040 }
            com.ironsource.mediationsdk.ab r2 = (com.ironsource.mediationsdk.ab) r2     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.c()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0027
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x003c:
            monitor-exit(r3)
            return r1
        L_0x003e:
            monitor-exit(r3)
            return r1
        L_0x0040:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.Z.c():boolean");
    }

    public final void c_() {
        a(a.RV_STATE_NOT_LOADED);
        a(false, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        a(0);
    }

    public final void d(ab abVar) {
        c(abVar, "onRewardedVideoAdEnded");
        ae.a().c();
    }

    public final synchronized void e() {
        a("onLoadTriggered: RV load was triggered in " + this.B + " state");
        a(0);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        b(this.m);
        j();
    }

    /* access modifiers changed from: package-private */
    public void g() {
        a(a.RV_STATE_NOT_LOADED);
        b(false);
        this.q.d();
    }
}
