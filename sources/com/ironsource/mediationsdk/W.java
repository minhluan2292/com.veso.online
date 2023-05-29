package com.ironsource.mediationsdk;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0025j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.a.d;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.i;
import com.ironsource.mediationsdk.server.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.c;
import com.ironsource.mediationsdk.utils.n;
import com.ironsource.mediationsdk.utils.o;
import com.veso.online.data.model.XosoConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

final class W extends C0034s implements C, X, C0022g {
    n d;
    final ConcurrentHashMap<String, Y> e;
    String f;
    JSONObject g;
    C0023h h;
    C0025j i;
    long j;
    long k;
    private a l;
    private CopyOnWriteArrayList<Y> m;
    private ConcurrentHashMap<String, b> n;
    private ConcurrentHashMap<String, C0025j.a> o;
    private b p;
    private String q;
    private int r;
    private boolean s;
    private boolean t;
    private long u;
    private int v;
    private String w = "";
    private boolean x = false;

    enum a {
        STATE_NOT_INITIALIZED,
        STATE_READY_TO_LOAD,
        STATE_AUCTION,
        STATE_LOADING_SMASHES,
        STATE_READY_TO_SHOW,
        STATE_SHOWING
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public W(List<NetworkSettings> list, i iVar, String str, String str2, int i2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        i iVar2 = iVar;
        long time = new Date().getTime();
        a((int) IronSourceConstants.IS_MANAGER_INIT_STARTED);
        a(a.STATE_NOT_INITIALIZED);
        this.e = new ConcurrentHashMap<>();
        this.m = new CopyOnWriteArrayList<>();
        this.n = new ConcurrentHashMap<>();
        this.o = new ConcurrentHashMap<>();
        this.q = "";
        this.f = "";
        this.g = null;
        this.r = iVar2.c;
        this.s = iVar2.d;
        C0036u.a().a(IronSource.AD_UNIT.INTERSTITIAL, i2);
        c cVar = iVar2.i;
        this.k = cVar.j;
        boolean z = cVar.f > 0;
        this.t = z;
        if (z) {
            this.h = new C0023h(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, cVar, this);
        }
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a2 = C0019d.a().a(next, next.getInterstitialSettings(), false, false);
            if (a2 != null) {
                C0020e a3 = C0020e.a();
                if (a3.a(a2, a3.a, IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE)) {
                    Y y = r0;
                    Y y2 = new Y(str, str2, next, this, iVar2.e, a2);
                    String l2 = y.l();
                    this.e.put(l2, y);
                    arrayList.add(l2);
                }
            }
        }
        this.i = new C0025j(arrayList, cVar.g);
        this.d = new n(new ArrayList(this.e.values()));
        for (Y next2 : this.e.values()) {
            if (next2.h() || next2.i()) {
                next2.b();
            }
        }
        this.j = new Date().getTime();
        a(a.STATE_READY_TO_LOAD);
        a((int) IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    private String a(b bVar) {
        Y y = this.e.get(bVar.a());
        String num = y != null ? Integer.toString(y.j()) : TextUtils.isEmpty(bVar.b()) ? XosoConfig.REGION_ID_SOUTH : XosoConfig.REGION_ID_NORTH;
        return num + bVar.a();
    }

    private void a(int i2) {
        a(i2, (Object[][]) null, false);
    }

    private void a(int i2, Y y) {
        a(i2, y, (Object[][]) null, false);
    }

    /* access modifiers changed from: private */
    public void a(int i2, Y y, Object[][] objArr) {
        a(i2, y, objArr, false);
    }

    private void a(int i2, Y y, Object[][] objArr, boolean z) {
        Map<String, Object> o2 = y.o();
        if (!TextUtils.isEmpty(this.f)) {
            o2.put("auctionId", this.f);
        }
        JSONObject jSONObject = this.g;
        if (jSONObject != null && jSONObject.length() > 0) {
            o2.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.g);
        }
        if (z && !TextUtils.isEmpty(this.q)) {
            o2.put("placement", this.q);
        }
        if (c(i2)) {
            d.d();
            d.a(o2, this.v, this.w);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    o2.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e2) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e2), 3);
            }
        }
        d.d().b(new com.ironsource.mediationsdk.a.c(i2, new JSONObject(o2)));
    }

    private void a(int i2, Object[][] objArr) {
        a(i2, objArr, false);
    }

    /* access modifiers changed from: private */
    public void a(int i2, Object[][] objArr, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f)) {
            hashMap.put("auctionId", this.f);
        }
        JSONObject jSONObject = this.g;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.g);
        }
        if (z && !TextUtils.isEmpty(this.q)) {
            hashMap.put("placement", this.q);
        }
        if (c(i2)) {
            d.d();
            d.a((Map<String, Object>) hashMap, this.v, this.w);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e2) {
                b("sendMediationEvent " + e2.getMessage());
            }
        }
        d.d().b(new com.ironsource.mediationsdk.a.c(i2, new JSONObject(hashMap)));
    }

    private static void a(Y y, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + y.l() + " : " + str, 0);
    }

    private void a(List<b> list) {
        this.m.clear();
        this.n.clear();
        this.o.clear();
        StringBuilder sb = new StringBuilder();
        for (b next : list) {
            sb.append(a(next) + ",");
            Y y = this.e.get(next.a());
            if (y != null) {
                y.e = true;
                this.m.add(y);
                this.n.put(y.l(), next);
                this.o.put(next.a(), C0025j.a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                b("updateWaterfall() - could not find matching smash for auction response item " + next.a());
            }
        }
        b("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            b("Updated waterfall is empty");
        }
        a((int) IronSourceConstants.IS_RESULT_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
    }

    private void b(int i2) {
        a(i2, (Object[][]) null, true);
    }

    private void b(int i2, Y y) {
        a(i2, y, (Object[][]) null, true);
    }

    private void b(int i2, Y y, Object[][] objArr) {
        a(i2, y, objArr, true);
    }

    private void b(int i2, Object[][] objArr) {
        a((int) IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, objArr, true);
    }

    static void b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgIsManager " + str, 0);
    }

    private static void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private static boolean c(int i2) {
        return i2 == 2002 || i2 == 2003 || i2 == 2200 || i2 == 2213 || i2 == 2005 || i2 == 2204 || i2 == 2201 || i2 == 2203 || i2 == 2006 || i2 == 2004 || i2 == 2110 || i2 == 2301 || i2 == 2300 || i2 == 2303;
    }

    private void g() {
        List<b> h2 = h();
        this.f = d();
        a(h2);
    }

    private void g(Y y) {
        String b = this.n.get(y.l()).b();
        y.b(b);
        a(2002, y);
        y.a(b);
    }

    private List<b> h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (Y next : this.e.values()) {
            if (!next.h() && !this.d.b(next)) {
                copyOnWriteArrayList.add(new b(next.l()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void i() {
        if (this.m.isEmpty()) {
            a(a.STATE_READY_TO_LOAD);
            a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Empty waterfall"}}, false);
            C0036u.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "Empty waterfall"));
            return;
        }
        a(a.STATE_LOADING_SMASHES);
        int i2 = 0;
        for (int i3 = 0; i3 < this.m.size() && i2 < this.r; i3++) {
            Y y = this.m.get(i3);
            if (y.e) {
                if (!this.s || !y.h()) {
                    g(y);
                    i2++;
                } else if (i2 == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + y.l() + ". No other instances will be loaded at the same time.";
                    b(str);
                    IronSourceUtils.sendAutomationLog(str);
                    g(y);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + y.l() + " as a non bidder is being loaded";
                    b(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        a(a.STATE_AUCTION);
        AsyncTask.execute(new Runnable() {
            public final void run() {
                StringBuilder sb;
                W.this.f = "";
                W.this.g = null;
                StringBuilder sb2 = new StringBuilder();
                long time = W.this.k - (new Date().getTime() - W.this.j);
                if (time > 0) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("delaying auction by " + time);
                    com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.a;
                    com.ironsource.environment.e.c.b(new Runnable() {
                        public final void run() {
                            W.this.a();
                        }
                    }, time);
                    return;
                }
                W.this.a(2000, (Object[][]) null, false);
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (Y next : W.this.e.values()) {
                    if (!W.this.d.b(next)) {
                        if (next.h()) {
                            Map<String, Object> a2 = next.a();
                            if (a2 != null) {
                                hashMap.put(next.l(), a2);
                                sb = new StringBuilder();
                            } else {
                                W.this.a((int) IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, next, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
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
                if (hashMap.size() == 0 && arrayList.size() == 0) {
                    W.this.a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}, false);
                    W.b("makeAuction() failed - No candidates available for auctioning");
                    C0036u.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1005, "No candidates available for auctioning"));
                    W.this.a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}}, false);
                    W.this.a(a.STATE_READY_TO_LOAD);
                    return;
                }
                W.this.a((int) IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}, false);
                int b = o.a().b(2);
                if (W.this.h != null) {
                    W.this.h.a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, W.this.i, b, W.this.b);
                }
            }
        });
    }

    public final void a(int i2, String str, int i3, String str2, long j2) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i2 + " - " + str + ")";
        b(str3);
        IronSourceUtils.sendAutomationLog("IS: " + str3);
        this.v = i3;
        this.w = str2;
        this.g = null;
        g();
        if (TextUtils.isEmpty(str)) {
            a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"duration", Long.valueOf(j2)}});
        } else {
            a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j2)}});
        }
        i();
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.l = aVar;
        b("state=" + aVar);
    }

    public final void a(Y y) {
        synchronized (this) {
            a(y, "onInterstitialAdOpened");
            b((int) IronSourceConstants.IS_INSTANCE_OPENED, y);
            if (this.t) {
                b bVar = this.n.get(y.l());
                if (bVar != null) {
                    a(bVar.a(this.q));
                    C0023h.a(bVar, y.j(), this.p, this.q);
                    this.o.put(y.l(), C0025j.a.ISAuctionPerformanceShowedSuccessfully);
                    a(bVar, this.q);
                } else {
                    String l2 = y.l();
                    b("onInterstitialAdOpened showing instance " + l2 + " missing from waterfall");
                    Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1011};
                    a((int) IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.l}, new Object[]{IronSourceConstants.EVENTS_EXT1, l2}});
                }
            }
            F.a().b(this.c);
        }
    }

    public final void a(Y y, long j2) {
        Y y2 = y;
        synchronized (this) {
            a(y2, "onInterstitialAdReady");
            a(2003, y2, new Object[][]{new Object[]{"duration", Long.valueOf(j2)}});
            if (this.o.containsKey(y.l())) {
                this.o.put(y.l(), C0025j.a.ISAuctionPerformanceLoadedSuccessfully);
            }
            if (this.l == a.STATE_LOADING_SMASHES) {
                a(a.STATE_READY_TO_SHOW);
                a(2004, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.u)}});
                if (this.t) {
                    b bVar = this.n.get(y.l());
                    if (bVar != null) {
                        a(bVar.a(""));
                        C0023h.a(bVar, y.j(), this.p);
                        C0023h hVar = this.h;
                        CopyOnWriteArrayList<Y> copyOnWriteArrayList = this.m;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = copyOnWriteArrayList;
                        hVar.a((CopyOnWriteArrayList<ac>) copyOnWriteArrayList, this.n, y.j(), this.p, bVar);
                    } else {
                        String l2 = y.l();
                        b("onInterstitialAdReady winner instance " + l2 + " missing from waterfall");
                        a((int) IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, l2}});
                    }
                }
                F.a().a(this.c);
            }
        }
    }

    public final void a(IronSourceError ironSourceError, Y y) {
        b bVar;
        synchronized (this) {
            if (this.t && (bVar = this.n.get(y.l())) != null) {
                a(bVar.a(this.q));
            }
            a(y, "onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
            F.a().a(ironSourceError, this.c);
            b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, y, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            this.o.put(y.l(), C0025j.a.ISAuctionPerformanceFailedToShow);
            a(a.STATE_READY_TO_LOAD);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f0, code lost:
        if (r11 == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f2, code lost:
        r9 = "a non bidder is being loaded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f5, code lost:
        r9 = "a non bidder was already loaded successfully";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f7, code lost:
        r9 = "Advanced Loading: Won't start loading bidder " + r1.l() + " as " + r9;
        b(r9);
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ironsource.mediationsdk.logger.IronSourceError r9, com.ironsource.mediationsdk.Y r10, long r11) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = "onInterstitialAdLoadFailed error="
            r1.<init>(r2)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = r9.getErrorMessage()     // Catch:{ all -> 0x01b9 }
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = " state="
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.W$a r2 = r8.l     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = r2.name()     // Catch:{ all -> 0x01b9 }
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01b9 }
            a((com.ironsource.mediationsdk.Y) r10, (java.lang.String) r1)     // Catch:{ all -> 0x01b9 }
            int r1 = r9.getErrorCode()     // Catch:{ all -> 0x01b9 }
            r2 = 1158(0x486, float:1.623E-42)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 != r2) goto L_0x005c
            r1 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x01b9 }
            int r9 = r9.getErrorCode()     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01b9 }
            r6[r5] = r9     // Catch:{ all -> 0x01b9 }
            r2[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01b9 }
            r9[r5] = r11     // Catch:{ all -> 0x01b9 }
            r2[r5] = r9     // Catch:{ all -> 0x01b9 }
            r8.a((int) r1, (com.ironsource.mediationsdk.Y) r10, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x01b9 }
            goto L_0x0092
        L_0x005c:
            r1 = 2200(0x898, float:3.083E-42)
            r2 = 3
            java.lang.Object[][] r2 = new java.lang.Object[r2][]     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x01b9 }
            int r7 = r9.getErrorCode()     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01b9 }
            r6[r5] = r7     // Catch:{ all -> 0x01b9 }
            r2[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "reason"
            r6[r4] = r7     // Catch:{ all -> 0x01b9 }
            java.lang.String r9 = r9.getErrorMessage()     // Catch:{ all -> 0x01b9 }
            r6[r5] = r9     // Catch:{ all -> 0x01b9 }
            r2[r5] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01b9 }
            r9[r5] = r11     // Catch:{ all -> 0x01b9 }
            r2[r3] = r9     // Catch:{ all -> 0x01b9 }
            r8.a((int) r1, (com.ironsource.mediationsdk.Y) r10, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x01b9 }
        L_0x0092:
            if (r10 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r9 = r8.o     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = r10.l()     // Catch:{ all -> 0x01b9 }
            boolean r9 = r9.containsKey(r11)     // Catch:{ all -> 0x01b9 }
            if (r9 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r9 = r8.o     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = r10.l()     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.j$a r12 = com.ironsource.mediationsdk.C0025j.a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x01b9 }
            r9.put(r11, r12)     // Catch:{ all -> 0x01b9 }
        L_0x00ab:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.Y> r9 = r8.m     // Catch:{ all -> 0x01b9 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x01b9 }
            r11 = r4
            r12 = r11
        L_0x00b3:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x01b9 }
            if (r1 == 0) goto L_0x0152
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.Y r1 = (com.ironsource.mediationsdk.Y) r1     // Catch:{ all -> 0x01b9 }
            boolean r2 = r1.e     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0134
            boolean r2 = r8.s     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0118
            boolean r2 = r1.h()     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0118
            if (r11 != 0) goto L_0x00f0
            if (r12 == 0) goto L_0x00d2
            goto L_0x00f0
        L_0x00d2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "Advanced Loading: Starting to load bidder "
            r2.<init>(r6)     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = r1.l()     // Catch:{ all -> 0x01b9 }
            r2.append(r6)     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = ". No other instances will be loaded at the same time."
            r2.append(r6)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01b9 }
            b((java.lang.String) r2)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r2)     // Catch:{ all -> 0x01b9 }
            goto L_0x0118
        L_0x00f0:
            if (r11 == 0) goto L_0x00f5
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00f7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r12)     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = r1.l()     // Catch:{ all -> 0x01b9 }
            r10.append(r12)     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = " as "
            r10.append(r12)     // Catch:{ all -> 0x01b9 }
            r10.append(r9)     // Catch:{ all -> 0x01b9 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x01b9 }
            b((java.lang.String) r9)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x01b9 }
            goto L_0x0152
        L_0x0118:
            r0.add(r1)     // Catch:{ all -> 0x01b9 }
            boolean r2 = r8.s     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0152
            boolean r2 = r10.h()     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0152
            boolean r1 = r1.h()     // Catch:{ all -> 0x01b9 }
            if (r1 != 0) goto L_0x0152
            int r1 = r0.size()     // Catch:{ all -> 0x01b9 }
            int r2 = r8.r     // Catch:{ all -> 0x01b9 }
            if (r1 >= r2) goto L_0x0152
            goto L_0x0146
        L_0x0134:
            com.ironsource.mediationsdk.Y$a r2 = r1.a     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.Y$a r6 = com.ironsource.mediationsdk.Y.a.INIT_IN_PROGRESS     // Catch:{ all -> 0x01b9 }
            if (r2 == r6) goto L_0x0143
            com.ironsource.mediationsdk.Y$a r2 = r1.a     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.Y$a r6 = com.ironsource.mediationsdk.Y.a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x01b9 }
            if (r2 != r6) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r2 = r4
            goto L_0x0144
        L_0x0143:
            r2 = r5
        L_0x0144:
            if (r2 == 0) goto L_0x0149
        L_0x0146:
            r11 = r5
            goto L_0x00b3
        L_0x0149:
            boolean r1 = r1.g()     // Catch:{ all -> 0x01b9 }
            if (r1 == 0) goto L_0x00b3
            r12 = r5
            goto L_0x00b3
        L_0x0152:
            int r9 = r0.size()     // Catch:{ all -> 0x01b9 }
            if (r9 != 0) goto L_0x018c
            com.ironsource.mediationsdk.W$a r9 = r8.l     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.W$a r10 = com.ironsource.mediationsdk.W.a.STATE_LOADING_SMASHES     // Catch:{ all -> 0x01b9 }
            if (r9 != r10) goto L_0x018c
            if (r11 != 0) goto L_0x018c
            com.ironsource.mediationsdk.u r9 = com.ironsource.mediationsdk.C0036u.a()     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "No ads to show"
            r1 = 509(0x1fd, float:7.13E-43)
            r11.<init>(r1, r12)     // Catch:{ all -> 0x01b9 }
            r9.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r10, (com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x01b9 }
            r9 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r10 = new java.lang.Object[r5][]     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "errorCode"
            r11[r4] = r12     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01b9 }
            r11[r5] = r12     // Catch:{ all -> 0x01b9 }
            r10[r4] = r11     // Catch:{ all -> 0x01b9 }
            r8.a((int) r9, (java.lang.Object[][]) r10)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.W$a r9 = com.ironsource.mediationsdk.W.a.STATE_READY_TO_LOAD     // Catch:{ all -> 0x01b9 }
            r8.a((com.ironsource.mediationsdk.W.a) r9)     // Catch:{ all -> 0x01b9 }
        L_0x018c:
            monitor-exit(r8)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "smashesToLoad.size() = "
            r10.<init>(r11)
            int r11 = r0.size()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.verbose(r10)
            java.util.Iterator r9 = r0.iterator()
        L_0x01a8:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01b8
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.Y r10 = (com.ironsource.mediationsdk.Y) r10
            r8.g(r10)
            goto L_0x01a8
        L_0x01b8:
            return
        L_0x01b9:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01b9 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.W.a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.Y, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0194, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.W$a r0 = r9.l     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.W$a r1 = com.ironsource.mediationsdk.W.a.STATE_SHOWING     // Catch:{ all -> 0x01e1 }
            r2 = 2111(0x83f, float:2.958E-42)
            r3 = 1
            r4 = 2
            r5 = 0
            if (r0 != r1) goto L_0x0040
            java.lang.String r10 = "showInterstitial error: can't show ad while an ad is already showing"
            c((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01e1 }
            r1 = 1036(0x40c, float:1.452E-42)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.F r6 = com.ironsource.mediationsdk.F.a()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r9.c     // Catch:{ all -> 0x01e1 }
            r6.a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01e1 }
            r6[r3] = r1     // Catch:{ all -> 0x01e1 }
            r0[r5] = r6     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01e1 }
            r1[r3] = r10     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r9.a((int) r2, (java.lang.Object[][]) r0, (boolean) r5)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x0040:
            com.ironsource.mediationsdk.W$a r0 = r9.l     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.W$a r1 = com.ironsource.mediationsdk.W.a.STATE_READY_TO_SHOW     // Catch:{ all -> 0x01e1 }
            r6 = 509(0x1fd, float:7.13E-43)
            if (r0 == r1) goto L_0x0091
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "showInterstitial() error state="
            r10.<init>(r0)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.W$a r0 = r9.l     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e1 }
            r10.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01e1 }
            b((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = "showInterstitial error: show called while no ads are available"
            c((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01e1 }
            r0.<init>(r6, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.F r1 = com.ironsource.mediationsdk.F.a()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r9.c     // Catch:{ all -> 0x01e1 }
            r1.a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "errorCode"
            r1[r5] = r7     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01e1 }
            r1[r3] = r6     // Catch:{ all -> 0x01e1 }
            r0[r5] = r1     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01e1 }
            r1[r3] = r10     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r9.a((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x0091:
            if (r10 != 0) goto L_0x00c7
            java.lang.String r10 = "showInterstitial error: empty default placement"
            c((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01e1 }
            r1 = 1020(0x3fc, float:1.43E-42)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.F r6 = com.ironsource.mediationsdk.F.a()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r9.c     // Catch:{ all -> 0x01e1 }
            r6.a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01e1 }
            r6[r3] = r1     // Catch:{ all -> 0x01e1 }
            r0[r5] = r6     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01e1 }
            r1[r3] = r10     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r9.a((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x00c7:
            r9.q = r10     // Catch:{ all -> 0x01e1 }
            r0 = 2100(0x834, float:2.943E-42)
            r9.b((int) r0)     // Catch:{ all -> 0x01e1 }
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01e1 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01e1 }
            boolean r0 = com.ironsource.mediationsdk.utils.k.a((android.content.Context) r0, (java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0123
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "placement "
            r10.<init>(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r9.q     // Catch:{ all -> 0x01e1 }
            r10.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = " is capped"
            r10.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01e1 }
            c((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01e1 }
            r1 = 524(0x20c, float:7.34E-43)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.F r6 = com.ironsource.mediationsdk.F.a()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r9.c     // Catch:{ all -> 0x01e1 }
            r6.a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01e1 }
            r6[r3] = r1     // Catch:{ all -> 0x01e1 }
            r0[r5] = r6     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01e1 }
            r1[r3] = r10     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r9.b((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x0123:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.Y> r0 = r9.m     // Catch:{ all -> 0x01e1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01e1 }
        L_0x0129:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x01e1 }
            if (r1 == 0) goto L_0x01b1
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.Y r1 = (com.ironsource.mediationsdk.Y) r1     // Catch:{ all -> 0x01e1 }
            boolean r7 = r1.g()     // Catch:{ all -> 0x01e1 }
            if (r7 == 0) goto L_0x0195
            com.ironsource.mediationsdk.W$a r0 = com.ironsource.mediationsdk.W.a.STATE_SHOWING     // Catch:{ all -> 0x01e1 }
            r9.a((com.ironsource.mediationsdk.W.a) r0)     // Catch:{ all -> 0x01e1 }
            r1.c()     // Catch:{ all -> 0x01e1 }
            r0 = 2201(0x899, float:3.084E-42)
            r9.b((int) r0, (com.ironsource.mediationsdk.Y) r1)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.utils.n r0 = r9.d     // Catch:{ all -> 0x01e1 }
            r0.a(r1)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.utils.n r0 = r9.d     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.b(r1)     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0175
            r1.f()     // Catch:{ all -> 0x01e1 }
            r0 = 2401(0x961, float:3.365E-42)
            r9.a((int) r0, (com.ironsource.mediationsdk.Y) r1)     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r0.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = r1.l()     // Catch:{ all -> 0x01e1 }
            r0.append(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = " was session capped"
            r0.append(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ all -> 0x01e1 }
        L_0x0175:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01e1 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.utils.k.d(r0, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01e1 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01e1 }
            boolean r10 = com.ironsource.mediationsdk.utils.k.a((android.content.Context) r0, (java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            if (r10 == 0) goto L_0x0193
            r10 = 2400(0x960, float:3.363E-42)
            r9.b((int) r10)     // Catch:{ all -> 0x01e1 }
        L_0x0193:
            monitor-exit(r9)
            return
        L_0x0195:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r8 = "showInterstitial "
            r7.<init>(r8)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = r1.l()     // Catch:{ all -> 0x01e1 }
            r7.append(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = " isReadyToShow() == false"
            r7.append(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x01e1 }
            b((java.lang.String) r1)     // Catch:{ all -> 0x01e1 }
            goto L_0x0129
        L_0x01b1:
            com.ironsource.mediationsdk.F r10 = com.ironsource.mediationsdk.F.a()     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r0)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r1 = r9.c     // Catch:{ all -> 0x01e1 }
            r10.a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r10 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "errorCode"
            r0[r5] = r1     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r10[r5] = r0     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "reason"
            r0[r5] = r1     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "Show Fail - No ads to show"
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r10[r3] = r0     // Catch:{ all -> 0x01e1 }
            r9.b((int) r2, (java.lang.Object[][]) r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x01e1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.W.a(java.lang.String):void");
    }

    public final void a(List<b> list, String str, b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j2, int i3, String str2) {
        this.f = str;
        this.p = bVar;
        this.g = jSONObject;
        this.v = i2;
        this.w = "";
        if (!TextUtils.isEmpty(str2)) {
            a((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i3)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}, false);
        }
        a(jSONObject2, IronSource.AD_UNIT.INTERSTITIAL);
        if (this.a.a(IronSource.AD_UNIT.INTERSTITIAL)) {
            a((int) IronSourceConstants.IS_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}}, false);
            a(a.STATE_READY_TO_LOAD);
            C0036u.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"));
            return;
        }
        a((int) IronSourceConstants.IS_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j2)}}, false);
        a(list);
        i();
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Should Track Network State: " + z, 0);
        this.x = z;
    }

    public final void b(Y y) {
        synchronized (this) {
            a(y, "onInterstitialAdClosed");
            b(IronSourceConstants.IS_INSTANCE_CLOSED, y, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(o.a().b(2))}});
            o.a().a(2);
            F.a().c(this.c);
            a(a.STATE_READY_TO_LOAD);
        }
    }

    public final void b(IronSourceError ironSourceError, Y y) {
        a((int) IronSourceConstants.IS_INSTANCE_INIT_FAILED, y, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
    }

    public final void c(Y y) {
        a(y, "onInterstitialAdShowSucceeded");
        F.a().d(this.c);
        b((int) IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, y);
    }

    public final void d(Y y) {
        a(y, "onInterstitialAdClicked");
        F.a().e(this.c);
        b(2006, y);
    }

    public final synchronized void e() {
        if (this.l == a.STATE_SHOWING) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "loadInterstitial: load cannot be invoked while showing an ad", 3);
            F.a().a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial: load cannot be invoked while showing an ad"));
        } else if ((this.l == a.STATE_READY_TO_LOAD || this.l == a.STATE_READY_TO_SHOW) && !C0036u.a().a(IronSource.AD_UNIT.INTERSTITIAL)) {
            this.f = "";
            this.q = "";
            this.g = null;
            a(IronSource.AD_UNIT.INTERSTITIAL);
            a_();
            a(2001, (Object[][]) null, false);
            this.u = new Date().getTime();
            if (this.t) {
                if (!this.o.isEmpty()) {
                    this.i.a(this.o);
                    this.o.clear();
                }
                a();
                return;
            }
            g();
            i();
        } else {
            b("loadInterstitial: load is already in progress");
        }
    }

    public final void e(Y y) {
        a(y, "onInterstitialAdVisible");
    }

    public final void f(Y y) {
        a((int) IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean f() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.x     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0039 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0039 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x001a
        L_0x0014:
            com.ironsource.mediationsdk.W$a r0 = r3.l     // Catch:{ all -> 0x0039 }
            com.ironsource.mediationsdk.W$a r2 = com.ironsource.mediationsdk.W.a.STATE_READY_TO_SHOW     // Catch:{ all -> 0x0039 }
            if (r0 == r2) goto L_0x001c
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.Y> r0 = r3.m     // Catch:{ all -> 0x0039 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0039 }
        L_0x0022:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0039 }
            com.ironsource.mediationsdk.Y r2 = (com.ironsource.mediationsdk.Y) r2     // Catch:{ all -> 0x0039 }
            boolean r2 = r2.g()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0022
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x0037:
            monitor-exit(r3)
            return r1
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.W.f():boolean");
    }
}
