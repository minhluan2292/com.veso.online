package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0025j;
import com.ironsource.mediationsdk.C0033r;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.a.c;
import com.ironsource.mediationsdk.a.d;
import com.ironsource.mediationsdk.b.b;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.f;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.o;
import com.veso.online.data.model.XosoConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public final class T extends C0034s implements U, b.a, C0022g {
    com.ironsource.mediationsdk.c.b d;
    b e;
    IronSourceBannerLayout f;
    g g;
    V h;
    int i;
    final ConcurrentHashMap<String, V> j;
    C0023h k;
    C0025j l;
    ConcurrentHashMap<String, C0025j.a> m;
    long n;
    private a o = a.NONE;
    private int p;
    private CopyOnWriteArrayList<V> q;
    private String r;
    private JSONObject s;
    private String t = "";
    private int u;
    private com.ironsource.mediationsdk.server.b v;
    private ConcurrentHashMap<String, com.ironsource.mediationsdk.server.b> w;
    private final Object x = new Object();
    private f y;

    enum a {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public T(List<NetworkSettings> list, com.ironsource.mediationsdk.c.b bVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isAuctionEnabled = " + bVar.c());
        this.d = bVar;
        this.e = new b(bVar.g());
        this.j = new ConcurrentHashMap<>();
        this.q = new CopyOnWriteArrayList<>();
        this.w = new ConcurrentHashMap<>();
        this.m = new ConcurrentHashMap<>();
        this.i = o.a().b(3);
        C0030o.a().a = this.d.e();
        if (this.d.c()) {
            this.k = new C0023h("banner", this.d.h(), this);
        }
        a(list);
        b(list);
        this.n = new Date().getTime();
        a(a.READY_TO_LOAD);
    }

    static /* synthetic */ ISBannerSize a(T t2) {
        IronSourceBannerLayout ironSourceBannerLayout = t2.f;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return t2.f.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getCurrentActiveActivity()) ? ISBannerSize.a : ISBannerSize.BANNER : t2.f.getSize();
    }

    /* access modifiers changed from: private */
    public void a(int i2, Object[][] objArr) {
        a(i2, objArr, this.i);
    }

    private void a(V v2, com.ironsource.mediationsdk.server.b bVar) {
        C0023h.a(bVar, v2.j(), this.v, f());
        a(this.w.get(v2.l()), f());
    }

    private void a(List<NetworkSettings> list) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings providerName : list) {
            arrayList.add(providerName.getProviderName());
        }
        this.l = new C0025j(arrayList, this.d.h().g);
    }

    private static void a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c == 4) {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                String str = "Adaptive=true";
                if (jSONObject.has(IronSourceConstants.EVENTS_EXT1)) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , Adaptive=true";
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e2));
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.o);
        if (a(a.STARTED_LOADING, this.d.c() ? z ? a.AUCTION : a.FIRST_AUCTION : z ? a.RELOADING : a.LOADING)) {
            this.y = new f();
            this.r = "";
            this.s = null;
            this.p = 0;
            this.i = o.a().b(3);
            a(z ? IronSourceConstants.BN_RELOAD : 3001, (Object[][]) null);
            if (this.d.c()) {
                e();
                return;
            }
            h();
            g();
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.error("wrong state - " + this.o);
    }

    private void b(List<NetworkSettings> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            NetworkSettings networkSettings = list.get(i2);
            AbstractAdapter a2 = C0019d.a().a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a2 != null) {
                V v2 = new V(this.d, this, networkSettings, a2, this.i, o());
                this.j.put(v2.l(), v2);
            } else {
                IronLog.INTERNAL.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
            }
        }
    }

    private static boolean b(int i2) {
        return i2 == 3201 || i2 == 3110 || i2 == 3111 || i2 == 3116 || i2 == 3119 || i2 == 3112 || i2 == 3115 || i2 == 3501 || i2 == 3502 || i2 == 3506;
    }

    private String c(List<com.ironsource.mediationsdk.server.b> list) {
        int i2;
        int i3;
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.q.clear();
        this.w.clear();
        this.m.clear();
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (i4 < list.size()) {
            com.ironsource.mediationsdk.server.b bVar = list.get(i4);
            V v2 = this.j.get(bVar.a());
            if (v2 != null) {
                AbstractAdapter a2 = C0019d.a().a(v2.d.a);
                if (a2 != null) {
                    V v3 = r0;
                    i2 = i4;
                    i3 = 1;
                    V v4 = new V(this.d, this, v2.d.a, a2, this.i, this.r, this.s, this.u, this.t, o());
                    v3.e = true;
                    this.q.add(v3);
                    this.w.put(v3.l(), bVar);
                    this.m.put(bVar.a(), C0025j.a.ISAuctionPerformanceDidntAttemptToLoad);
                } else {
                    i2 = i4;
                    i3 = 1;
                }
            } else {
                i2 = i4;
                i3 = 1;
                IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + bVar.a());
            }
            V v5 = this.j.get(bVar.a());
            String str = XosoConfig.REGION_ID_SOUTH;
            if (v5 == null ? !TextUtils.isEmpty(bVar.b()) : v5.h()) {
                str = XosoConfig.REGION_ID_NORTH;
            }
            sb.append(str + bVar.a());
            int i5 = i2;
            if (i5 != list.size() - i3) {
                sb.append(",");
            }
            i4 = i5 + 1;
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    private void f(V v2) {
        Iterator<V> it = this.q.iterator();
        while (it.hasNext()) {
            V next = it.next();
            if (!next.equals(v2)) {
                next.d();
            }
        }
    }

    private void g() {
        int i2 = this.p;
        while (true) {
            String str = null;
            if (i2 < this.q.size()) {
                V v2 = this.q.get(i2);
                if (v2.e) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("loading smash - " + v2.q());
                    this.p = i2 + 1;
                    IronSourceBannerLayout ironSourceBannerLayout = this.f;
                    if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                        if (v2.h()) {
                            str = this.w.get(v2.l()).b();
                            v2.b(str);
                        }
                        v2.a(this.f.a(), this.g, str);
                        return;
                    }
                    return;
                }
                i2++;
            } else {
                String str2 = this.q.isEmpty() ? "Empty waterfall" : "Mediation No fill";
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("errorReason = " + str2);
                f((V) null);
                if (a(a.LOADING, a.READY_TO_LOAD)) {
                    a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{"duration", Long.valueOf(f.a(this.y))}});
                    C0030o.a().a(this.f, new IronSourceError(606, str2), false);
                    return;
                } else if (a(a.RELOADING, a.LOADED)) {
                    a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.y))}});
                    C0030o.a().a(this.f, new IronSourceError(606, str2), true);
                    this.e.a(this);
                    return;
                } else {
                    a(a.READY_TO_LOAD);
                    IronLog ironLog3 = IronLog.INTERNAL;
                    ironLog3.error("wrong state = " + this.o);
                    return;
                }
            }
        }
    }

    private void h() {
        List<com.ironsource.mediationsdk.server.b> i2 = i();
        this.r = d();
        c(i2);
    }

    private List<com.ironsource.mediationsdk.server.b> i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (V next : this.j.values()) {
            if (!next.h() && !k.b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), f())) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.server.b(next.l()));
            }
        }
        return copyOnWriteArrayList;
    }

    private boolean j() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    private ISBannerSize k() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    private boolean l() {
        boolean z;
        synchronized (this.x) {
            if (this.o != a.LOADING) {
                if (this.o != a.RELOADING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    private boolean m() {
        boolean z;
        synchronized (this.x) {
            if (this.o != a.FIRST_AUCTION) {
                if (this.o != a.AUCTION) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    private boolean n() {
        boolean z;
        synchronized (this.x) {
            z = this.o == a.LOADED;
        }
        return z;
    }

    private boolean o() {
        return this.o == a.RELOADING || this.o == a.AUCTION;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = "checking with IronsourceLifecycleManager if app in foreground"
            r0.verbose(r1)
            com.ironsource.lifecycle.d r0 = com.ironsource.lifecycle.d.a()
            boolean r0 = r0.b()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0088
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r6.f
            if (r0 != 0) goto L_0x0020
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner is null"
        L_0x001b:
            r0.verbose(r3)
            r0 = r2
            goto L_0x0056
        L_0x0020:
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L_0x002b
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner or one of its parents are INVISIBLE or GONE"
            goto L_0x001b
        L_0x002b:
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r6.f
            boolean r0 = r0.hasWindowFocus()
            if (r0 != 0) goto L_0x0038
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner has no window focus"
            goto L_0x001b
        L_0x0038:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r6.f
            boolean r0 = r3.getGlobalVisibleRect(r0)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "visible = "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.verbose(r4)
        L_0x0056:
            if (r0 == 0) goto L_0x0085
            com.ironsource.mediationsdk.T$a r0 = com.ironsource.mediationsdk.T.a.LOADED
            com.ironsource.mediationsdk.T$a r3 = com.ironsource.mediationsdk.T.a.STARTED_LOADING
            boolean r0 = r6.a((com.ironsource.mediationsdk.T.a) r0, (com.ironsource.mediationsdk.T.a) r3)
            if (r0 == 0) goto L_0x006d
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "start loading"
            r0.verbose(r3)
            r6.a((boolean) r1)
            goto L_0x0082
        L_0x006d:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "wrong state = "
            r3.<init>(r4)
            com.ironsource.mediationsdk.T$a r4 = r6.o
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.error(r3)
        L_0x0082:
            r0 = 0
            r3 = r2
            goto L_0x008b
        L_0x0085:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L_0x008a
        L_0x0088:
            java.lang.String r0 = "app in background - start reload timer"
        L_0x008a:
            r3 = r1
        L_0x008b:
            if (r3 == 0) goto L_0x00af
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r3.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r3 = new java.lang.Object[r1][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r2] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            r3[r2] = r4
            r6.a((int) r0, (java.lang.Object[][]) r3)
            com.ironsource.mediationsdk.b.b r0 = r6.e
            r0.a(r6)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.T.a():void");
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        a(i2, (Object[][]) null);
    }

    public final void a(int i2, String str, int i3, String str2, long j2) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i2 + " - " + str + ")";
        IronLog.INTERNAL.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (m()) {
            this.t = str2;
            this.u = i3;
            this.s = null;
            h();
            a((int) IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}});
            a(this.o == a.FIRST_AUCTION ? a.LOADING : a.RELOADING);
            g();
            return;
        }
        IronLog.INTERNAL.warning("wrong state - mCurrentState = " + this.o);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, Object[][] objArr, int i3) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize k2 = k();
            if (k2 != null) {
                a(mediationAdditionalData, k2);
            }
            if (this.g != null) {
                mediationAdditionalData.put("placement", f());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i3);
            if (!TextUtils.isEmpty(this.r)) {
                mediationAdditionalData.put("auctionId", this.r);
            }
            JSONObject jSONObject = this.s;
            if (jSONObject != null && jSONObject.length() > 0) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.s);
            }
            if (b(i2)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.u);
                if (!TextUtils.isEmpty(this.t)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.t);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e2));
        }
        d.d().b(new c(i2, mediationAdditionalData));
    }

    public final void a(final IronSourceBannerLayout ironSourceBannerLayout, final g gVar) {
        IronLog.INTERNAL.verbose("");
        a(IronSource.AD_UNIT.BANNER);
        a_();
        if (!a(a.READY_TO_LOAD, a.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (!C0030o.a().b()) {
            AnonymousClass1 r0 = new C0033r.b() {
                public final void a() {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("placement = " + gVar.getPlacementName());
                    T.this.f = ironSourceBannerLayout;
                    T.this.g = gVar;
                    if (k.b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), gVar.getPlacementName())) {
                        IronLog.INTERNAL.verbose("placement is capped");
                        C0030o a2 = C0030o.a();
                        IronSourceBannerLayout ironSourceBannerLayout = ironSourceBannerLayout;
                        a2.a(ironSourceBannerLayout, new IronSourceError(604, "placement " + gVar.getPlacementName() + " is capped"), false);
                        T.this.a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
                        T.this.a(a.READY_TO_LOAD);
                        return;
                    }
                    T.this.a(false);
                }

                public final void a(String str) {
                    IronLog ironLog = IronLog.API;
                    ironLog.error("can't load banner - errorMessage = " + str);
                }
            };
            String str = null;
            if (!C0033r.a(ironSourceBannerLayout)) {
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                str = String.format("can't load banner - %s", objArr);
            }
            if (gVar == null || TextUtils.isEmpty(gVar.getPlacementName())) {
                Object[] objArr2 = new Object[1];
                objArr2[0] = gVar == null ? "placement is null" : "placement name is empty";
                str = String.format("can't load banner - %s", objArr2);
            }
            if (!TextUtils.isEmpty(str)) {
                IronLog.INTERNAL.error(str);
                r0.a(str);
                return;
            }
            r0.a();
        } else {
            IronLog.INTERNAL.verbose("can't load banner - already has pending invocation");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("from '" + this.o + "' to '" + aVar + "'");
        synchronized (this.x) {
            this.o = aVar;
        }
    }

    public final void a(V v2) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(v2.q());
        if (j()) {
            C0029n.a().d(this.c);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a((int) IronSourceConstants.BN_CALLBACK_CLICK, objArr, v2.n());
    }

    public final void a(V v2, View view, FrameLayout.LayoutParams layoutParams) {
        Object[][] objArr;
        V v3 = v2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + v2.q());
        if (v3.a != this.r) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("invoked with auctionId: " + v3.a + " and the current id is " + this.r);
            Object[] objArr2 = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            v3.a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr2, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction id " + v3.a + " State - " + this.o}, new Object[]{IronSourceConstants.EVENTS_EXT1, v2.l()}});
        } else if (l()) {
            V v4 = this.h;
            if (v4 != null) {
                v4.d();
            }
            f(v2);
            this.h = v3;
            IronSourceBannerLayout ironSourceBannerLayout = this.f;
            if (ironSourceBannerLayout != null) {
                ironSourceBannerLayout.a(view, layoutParams);
            }
            this.m.put(v2.l(), C0025j.a.ISAuctionPerformanceShowedSuccessfully);
            if (this.d.c()) {
                com.ironsource.mediationsdk.server.b bVar = this.w.get(v2.l());
                if (bVar != null) {
                    a(bVar.a(f()));
                    C0023h.a(bVar, v2.j(), this.v);
                    C0023h hVar = this.k;
                    CopyOnWriteArrayList<V> copyOnWriteArrayList = this.q;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = copyOnWriteArrayList;
                    hVar.a((CopyOnWriteArrayList<ac>) copyOnWriteArrayList, this.w, v2.j(), this.v, bVar);
                    if (!this.d.h().t) {
                        a(v3, bVar);
                    }
                } else {
                    String l2 = v2.l();
                    IronLog ironLog3 = IronLog.INTERNAL;
                    ironLog3.error("onLoadSuccess winner instance " + l2 + " missing from waterfall. auctionId = " + this.r);
                    a((int) IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, l2}});
                }
            }
            if (this.o == a.LOADING) {
                if (j()) {
                    this.f.a(this.c, false);
                    objArr = new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.y))}};
                } else {
                    objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}, new Object[]{"duration", Long.valueOf(f.a(this.y))}};
                }
                a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, objArr);
            } else {
                if (j()) {
                    this.f.a(this.c, true);
                }
                IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
                a((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.y))}});
            }
            String f2 = f();
            k.f(ContextProvider.getInstance().getCurrentActiveActivity(), f2);
            if (k.b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), f2)) {
                a((int) IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            o.a().a(3);
            a(a.LOADED);
            this.e.a(this);
        } else {
            IronLog ironLog4 = IronLog.INTERNAL;
            ironLog4.warning("wrong state - mCurrentState = " + this.o);
        }
    }

    public final void a(IronSourceError ironSourceError, V v2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (v2.a != this.r) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("invoked with auctionId: " + v2.a + " and the current id is " + this.r);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 3};
            v2.a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction " + v2.a + " State - " + this.o}, new Object[]{IronSourceConstants.EVENTS_EXT1, v2.l()}});
        } else if (l()) {
            this.m.put(v2.l(), C0025j.a.ISAuctionPerformanceFailedToLoad);
            g();
        } else {
            IronLog ironLog3 = IronLog.INTERNAL;
            ironLog3.warning("wrong state - mCurrentState = " + this.o);
        }
    }

    public final void a(List<com.ironsource.mediationsdk.server.b> list, String str, com.ironsource.mediationsdk.server.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j2, int i3, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (m()) {
            this.t = "";
            this.r = str;
            this.u = i2;
            this.v = bVar;
            this.s = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                a((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i3)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}});
            }
            a(jSONObject2, IronSource.AD_UNIT.BANNER);
            if (this.a.a(IronSource.AD_UNIT.BANNER)) {
                a((int) IronSourceConstants.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
                a aVar = this.o;
                a(a.READY_TO_LOAD);
                if (aVar == a.FIRST_AUCTION) {
                    C0030o.a().a(this.f, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"), false);
                    return;
                }
                return;
            }
            a((int) IronSourceConstants.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j2)}});
            a(this.o == a.FIRST_AUCTION ? a.LOADING : a.RELOADING);
            a((int) IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c(list)}});
            g();
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.warning("wrong state - mCurrentState = " + this.o);
    }

    /* access modifiers changed from: package-private */
    public boolean a(a aVar, a aVar2) {
        boolean z;
        synchronized (this.x) {
            if (this.o == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("set state from '" + this.o + "' to '" + aVar2 + "'");
                z = true;
                this.o = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void b(V v2) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(v2.q());
        if (j()) {
            C0029n.a().b(this.c);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a((int) IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, v2.n());
    }

    public final void c(V v2) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(v2.q());
        if (j()) {
            C0029n.a().a(this.c);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a((int) IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, v2.n());
    }

    public final void d(V v2) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(v2.q());
        if (j()) {
            C0029n.a().c(this.c);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a((int) IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, v2.n());
    }

    /* access modifiers changed from: package-private */
    public void e() {
        IronLog.INTERNAL.verbose("");
        AsyncTask.execute(new Runnable() {
            public final void run() {
                boolean z;
                T t = T.this;
                if (!t.m.isEmpty()) {
                    t.l.a(t.m);
                    t.m.clear();
                }
                T t2 = T.this;
                long d = t2.d.d() - (new Date().getTime() - t2.n);
                if (d > 0) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("waiting before auction - timeToWaitBeforeAuction = " + d);
                    new Timer().schedule(new TimerTask() {
                        public final void run() {
                            T.this.e();
                        }
                    }, d);
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    T.this.a((int) IronSourceConstants.BN_AUCTION_REQUEST);
                    C0033r.a(T.this.f(), T.this.j, new C0033r.a() {
                        public final void a(Map<String, Object> map, List<String> list, StringBuilder sb) {
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("auction waterfallString = " + sb);
                            if (map.size() == 0 && list.size() == 0) {
                                T.this.a((int) IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}});
                                if (T.this.a(a.AUCTION, a.LOADED)) {
                                    T.this.e.a(T.this);
                                    return;
                                }
                                C0030o.a().a(T.this.f, new IronSourceError(1005, "No candidates available for auctioning"), false);
                                T.this.a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
                                T.this.a(a.READY_TO_LOAD);
                                return;
                            }
                            T.this.a((int) IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
                            if (T.this.k != null) {
                                C0023h hVar = T.this.k;
                                Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                                C0025j jVar = T.this.l;
                                int i = T.this.i;
                                IronSourceSegment ironSourceSegment = T.this.b;
                                hVar.b = T.a(T.this);
                                hVar.a(applicationContext, map, list, jVar, i, ironSourceSegment);
                                return;
                            }
                            IronLog.INTERNAL.error("mAuctionHandler is null");
                        }
                    });
                }
            }
        });
    }

    public final void e(V v2) {
        com.ironsource.mediationsdk.server.b bVar;
        IronLog.INTERNAL.verbose(v2.q());
        if (n()) {
            if (this.d.c() && this.d.h().t && (bVar = this.w.get(v2.l())) != null) {
                a(v2, bVar);
            }
            a((int) IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("wrong state - mCurrentState = " + this.o);
        String l2 = v2.l();
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.o}, new Object[]{IronSourceConstants.EVENTS_EXT1, l2}});
    }

    /* access modifiers changed from: package-private */
    public String f() {
        g gVar = this.g;
        return gVar != null ? gVar.getPlacementName() : "";
    }
}
