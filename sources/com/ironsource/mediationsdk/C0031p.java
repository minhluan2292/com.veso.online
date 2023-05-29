package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0032q;
import com.ironsource.mediationsdk.a.c;
import com.ironsource.mediationsdk.a.d;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.f;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.o;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.p  reason: case insensitive filesystem */
public final class C0031p implements com.ironsource.mediationsdk.sdk.a {
    private C0032q a;
    private IronSourceBannerLayout b;
    private g c;
    private a d = a.NOT_INITIATED;
    private IronSourceLoggerManager e = IronSourceLoggerManager.getLogger();
    private String f;
    private String g;
    private final CopyOnWriteArrayList<C0032q> h = new CopyOnWriteArrayList<>();
    private long i;
    private Timer j;
    private AtomicBoolean k = new AtomicBoolean();
    private AtomicBoolean l = new AtomicBoolean();
    private f m;
    private f n;
    private int o;
    private int p;

    /* renamed from: com.ironsource.mediationsdk.p$a */
    enum a {
        NOT_INITIATED,
        READY_TO_LOAD,
        FIRST_LOAD_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        RELOAD_IN_PROGRESS
    }

    public C0031p(List<NetworkSettings> list, String str, String str2, long j2, int i2, int i3) {
        this.f = str;
        this.g = str2;
        this.i = (long) i2;
        C0030o.a().a = i3;
        for (int i4 = 0; i4 < list.size(); i4++) {
            NetworkSettings networkSettings = list.get(i4);
            AbstractAdapter a2 = C0019d.a().a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a2 == null || !C0020e.a().a(a2)) {
                a(networkSettings.getProviderInstanceName() + " can't load adapter or wrong version");
            } else {
                this.h.add(new C0032q(this, networkSettings, a2, j2, i4 + 1));
            }
        }
        this.c = null;
        a(a.READY_TO_LOAD);
    }

    private void a(int i2) {
        a(i2, (Object[][]) null);
    }

    private void a(int i2, C0032q qVar) {
        a(i2, qVar, (Object[][]) null);
    }

    private void a(int i2, C0032q qVar, Object[][] objArr) {
        a(i2, qVar, objArr, this.p);
    }

    private void a(int i2, C0032q qVar, Object[][] objArr, int i3) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(qVar);
        try {
            IronSourceBannerLayout ironSourceBannerLayout = this.b;
            if (ironSourceBannerLayout != null) {
                a(providerAdditionalData, ironSourceBannerLayout.getSize());
            }
            g gVar = this.c;
            if (gVar != null) {
                providerAdditionalData.put("placement", gVar.getPlacementName());
            }
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i3);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e2) {
            this.e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e2), 3);
        }
        d.d().b(new c(i2, providerAdditionalData));
    }

    private void a(int i2, Object[][] objArr) {
        a(i2, objArr, this.p);
    }

    private void a(int i2, Object[][] objArr, int i3) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            IronSourceBannerLayout ironSourceBannerLayout = this.b;
            if (ironSourceBannerLayout != null) {
                a(mediationAdditionalData, ironSourceBannerLayout.getSize());
            }
            g gVar = this.c;
            if (gVar != null) {
                mediationAdditionalData.put("placement", gVar.getPlacementName());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i3);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e2) {
            this.e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendMediationEvent " + Log.getStackTraceString(e2), 3);
        }
        d.d().b(new c(i2, mediationAdditionalData));
    }

    private void a(a aVar) {
        this.d = aVar;
        a("state=" + aVar.name());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(com.ironsource.mediationsdk.C0031p r8) {
        /*
            com.ironsource.mediationsdk.p$a r0 = r8.d
            com.ironsource.mediationsdk.p$a r1 = com.ironsource.mediationsdk.C0031p.a.RELOAD_IN_PROGRESS
            if (r0 == r1) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onReloadTimer wrong state="
            r0.<init>(r1)
            com.ironsource.mediationsdk.p$a r1 = r8.d
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.a((java.lang.String) r0)
            return
        L_0x001e:
            r0 = 0
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r2 = "checking with IronsourceLifecycleManager if app in foreground"
            r1.verbose(r2)
            com.ironsource.lifecycle.d r1 = com.ironsource.lifecycle.d.a()
            boolean r1 = r1.b()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x00e1
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r8.b
            java.lang.String r4 = "banner is null"
            if (r1 != 0) goto L_0x003f
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1.verbose(r4)
        L_0x003d:
            r1 = r3
            goto L_0x0078
        L_0x003f:
            boolean r1 = r1.isShown()
            if (r1 != 0) goto L_0x004d
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r5 = "banner or one of its parents are INVISIBLE or GONE"
        L_0x0049:
            r1.verbose(r5)
            goto L_0x003d
        L_0x004d:
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r8.b
            boolean r1 = r1.hasWindowFocus()
            if (r1 != 0) goto L_0x005a
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r5 = "banner has no window focus"
            goto L_0x0049
        L_0x005a:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r8.b
            boolean r1 = r5.getGlobalVisibleRect(r1)
            com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "visible = "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.verbose(r6)
        L_0x0078:
            if (r1 == 0) goto L_0x00de
            com.ironsource.mediationsdk.utils.o r1 = com.ironsource.mediationsdk.utils.o.a()
            r5 = 3
            int r1 = r1.b((int) r5)
            r8.p = r1
            r1 = 3011(0xbc3, float:4.22E-42)
            r8.a((int) r1)
            r1 = 3012(0xbc4, float:4.221E-42)
            com.ironsource.mediationsdk.q r5 = r8.a
            r8.a((int) r1, (com.ironsource.mediationsdk.C0032q) r5)
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f
            r1.<init>()
            r8.m = r1
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f
            r1.<init>()
            r8.n = r1
            com.ironsource.mediationsdk.q r1 = r8.a
            java.lang.String r5 = "reloadBanner()"
            r1.a((java.lang.String) r5)
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.e
            if (r5 == 0) goto L_0x00c9
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.e
            boolean r5 = r5.isDestroyed()
            if (r5 == 0) goto L_0x00b3
            goto L_0x00c9
        L_0x00b3:
            r1.b()
            com.ironsource.mediationsdk.q$a r4 = com.ironsource.mediationsdk.C0032q.a.LOADED
            r1.a((com.ironsource.mediationsdk.C0032q.a) r4)
            com.ironsource.mediationsdk.AbstractAdapter r4 = r1.a
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.e
            com.ironsource.mediationsdk.model.NetworkSettings r6 = r1.b
            org.json.JSONObject r6 = r6.getBannerSettings()
            r4.reloadBanner(r5, r6, r1)
            goto L_0x00dc
        L_0x00c9:
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.e
            if (r5 != 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            java.lang.String r4 = "banner is destroyed"
        L_0x00d0:
            com.ironsource.mediationsdk.sdk.a r5 = r1.c
            com.ironsource.mediationsdk.logger.IronSourceError r6 = new com.ironsource.mediationsdk.logger.IronSourceError
            r7 = 610(0x262, float:8.55E-43)
            r6.<init>(r7, r4)
            r5.a((com.ironsource.mediationsdk.logger.IronSourceError) r6, (com.ironsource.mediationsdk.C0032q) r1, (boolean) r3)
        L_0x00dc:
            r1 = r3
            goto L_0x00e4
        L_0x00de:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r0 = "app in background - start reload timer"
        L_0x00e3:
            r1 = r2
        L_0x00e4:
            if (r1 == 0) goto L_0x0106
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            r1[r3] = r4
            r8.a((int) r0, (java.lang.Object[][]) r1)
            r8.d()
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C0031p.a(com.ironsource.mediationsdk.p):void");
    }

    private void a(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.e;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "BannerManager " + str, 0);
    }

    private void a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c2 = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c2 == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c2 == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c2 == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c2 == 4) {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
        } catch (Exception e2) {
            this.e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e2), 3);
        }
    }

    private boolean a() {
        IronSourceBannerLayout ironSourceBannerLayout = this.b;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    private void b() {
        Iterator<C0032q> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().d = true;
        }
    }

    private void b(C0032q qVar, View view, FrameLayout.LayoutParams layoutParams) {
        this.a = qVar;
        this.b.a(view, layoutParams);
    }

    private void b(C0032q qVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("bindView = " + z + " smash - " + qVar.a());
        a((int) IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS, qVar, new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.n))}});
        a((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.m))}});
        this.o = o.a().b(3);
        o.a().a(3);
        if (z) {
            b(qVar, view, layoutParams);
        }
        d();
    }

    private boolean c() {
        Iterator<C0032q> it = this.h.iterator();
        while (it.hasNext()) {
            C0032q next = it.next();
            if (next.d && this.a != next) {
                a(this.d == a.FIRST_LOAD_IN_PROGRESS ? IronSourceConstants.BN_INSTANCE_LOAD : IronSourceConstants.BN_INSTANCE_RELOAD, next, (Object[][]) null);
                this.n = new f();
                next.a(this.b.a(), this.f, this.g);
                return true;
            }
        }
        return false;
    }

    private void d() {
        try {
            e();
            if (this.i > 0) {
                Timer timer = new Timer();
                this.j = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        C0031p.a(C0031p.this);
                    }
                }, this.i * 1000);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void e() {
        Timer timer = this.j;
        if (timer != null) {
            timer.cancel();
            this.j = null;
        }
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout == null) {
            this.e.log(IronSourceLogger.IronSourceTag.API, "destroyBanner banner cannot be null", 3);
        } else if (ironSourceBannerLayout.isDestroyed()) {
            this.e.log(IronSourceLogger.IronSourceTag.API, "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API", 3);
        } else {
            a((int) IronSourceConstants.BN_DESTROY, (Object[][]) null, this.o);
            e();
            C0032q qVar = this.a;
            if (qVar != null) {
                a((int) IronSourceConstants.BN_INSTANCE_DESTROY, qVar, (Object[][]) null);
                C0032q qVar2 = this.a;
                qVar2.a("destroyBanner()");
                if (qVar2.a == null) {
                    qVar2.a("destroyBanner() mAdapter == null");
                } else {
                    qVar2.a.destroyBanner(qVar2.b.getBannerSettings());
                    qVar2.a(C0032q.a.DESTROYED);
                }
                this.a = null;
            }
            ironSourceBannerLayout.b();
            this.b = null;
            this.c = null;
            a(a.READY_TO_LOAD);
        }
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout, g gVar) {
        if (ironSourceBannerLayout != null) {
            try {
                if (!ironSourceBannerLayout.isDestroyed()) {
                    if (gVar != null) {
                        if (!TextUtils.isEmpty(gVar.getPlacementName())) {
                            if (this.d == a.READY_TO_LOAD) {
                                if (!C0030o.a().b()) {
                                    this.p = o.a().b(3);
                                    a(a.FIRST_LOAD_IN_PROGRESS);
                                    this.b = ironSourceBannerLayout;
                                    this.c = gVar;
                                    a(3001, (Object[][]) null);
                                    if (k.b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), gVar.getPlacementName())) {
                                        C0030o a2 = C0030o.a();
                                        a2.a(ironSourceBannerLayout, new IronSourceError(604, "placement " + gVar.getPlacementName() + " is capped"));
                                        a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
                                        a(a.READY_TO_LOAD);
                                        return;
                                    }
                                    this.m = new f();
                                    Iterator<C0032q> it = this.h.iterator();
                                    while (it.hasNext()) {
                                        it.next().d = true;
                                    }
                                    this.n = new f();
                                    C0032q qVar = this.h.get(0);
                                    a((int) IronSourceConstants.BN_INSTANCE_LOAD, qVar, (Object[][]) null);
                                    qVar.a(ironSourceBannerLayout.a(), this.f, this.g);
                                    return;
                                }
                            }
                            this.e.log(IronSourceLogger.IronSourceTag.API, "A banner is already loaded", 3);
                            return;
                        }
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = gVar == null ? "placement is null" : "placement name is empty";
                    this.e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr), 3);
                    return;
                }
            } catch (Exception e2) {
                C0030o a3 = C0030o.a();
                a3.a(ironSourceBannerLayout, new IronSourceError(605, "loadBanner() failed " + e2.getMessage()), false);
                a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 605}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e2.getMessage()}});
                a(a.READY_TO_LOAD);
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        this.e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr2), 3);
    }

    public final void a(IronSourceError ironSourceError, C0032q qVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + qVar.a());
        if (this.d == a.FIRST_LOAD_IN_PROGRESS || this.d == a.LOAD_IN_PROGRESS) {
            if (z) {
                a((int) IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, qVar, new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.n))}});
            } else {
                a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, qVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(f.a(this.n))}});
            }
            if (!c()) {
                if (this.d == a.FIRST_LOAD_IN_PROGRESS) {
                    C0030o.a().a(this.b, new IronSourceError(606, "No ads to show"), false);
                    a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{"duration", Long.valueOf(f.a(this.m))}});
                    a(a.READY_TO_LOAD);
                    return;
                }
                a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.m))}});
                a(a.RELOAD_IN_PROGRESS);
                d();
                return;
            }
            return;
        }
        a("onBannerAdLoadFailed " + qVar.a() + " wrong state=" + this.d.name());
    }

    public final void a(C0032q qVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.a());
        Object[][] objArr = null;
        if (a()) {
            C0029n.a().d((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a((int) IronSourceConstants.BN_CALLBACK_CLICK, objArr, this.o);
        a((int) IronSourceConstants.BN_INSTANCE_CLICK, qVar, objArr, this.o);
    }

    public final void a(C0032q qVar, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.a());
        if (this.d == a.FIRST_LOAD_IN_PROGRESS) {
            a((int) IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, qVar, new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.n))}});
            b(qVar, view, layoutParams);
            g gVar = this.c;
            String placementName = gVar != null ? gVar.getPlacementName() : "";
            k.f(ContextProvider.getInstance().getCurrentActiveActivity(), placementName);
            if (k.b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), placementName)) {
                a((int) IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.m))}});
            this.b.a((AdInfo) null, false);
            this.o = o.a().b(3);
            o.a().a(3);
            a(a.RELOAD_IN_PROGRESS);
            d();
        } else if (this.d == a.LOAD_IN_PROGRESS) {
            a(a.RELOAD_IN_PROGRESS);
            b(qVar, view, layoutParams, true);
        } else {
            a((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, qVar, (Object[][]) null);
        }
    }

    public final void a(C0032q qVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.a());
        if (this.d != a.RELOAD_IN_PROGRESS) {
            a("onBannerAdReloaded " + qVar.a() + " wrong state=" + this.d.name());
            a((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, qVar, (Object[][]) null);
            return;
        }
        IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
        b(qVar, view, layoutParams, z);
    }

    public final void b(IronSourceError ironSourceError, C0032q qVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + qVar.a());
        if (this.d != a.RELOAD_IN_PROGRESS) {
            a("onBannerAdReloadFailed " + qVar.a() + " wrong state=" + this.d.name());
            return;
        }
        if (z) {
            a((int) IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL, qVar, new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.n))}});
        } else {
            a((int) IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, qVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(f.a(this.n))}});
        }
        if (this.h.size() == 1) {
            a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.m))}});
            d();
            return;
        }
        a(a.LOAD_IN_PROGRESS);
        b();
        c();
    }

    public final void b(C0032q qVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.a());
        Object[][] objArr = null;
        if (a()) {
            C0029n.a().b((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a((int) IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, this.o);
        a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, qVar, objArr, this.o);
    }

    public final void c(C0032q qVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.a());
        Object[][] objArr = null;
        if (a()) {
            C0029n.a().a((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a((int) IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, this.o);
        a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, qVar, objArr, this.o);
    }

    public final void d(C0032q qVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.a());
        Object[][] objArr = null;
        if (a()) {
            C0029n.a().c((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a((int) IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, this.o);
        a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, qVar, objArr, this.o);
    }

    public final void e(C0032q qVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.a());
        a((int) IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
        a((int) IronSourceConstants.BN_INSTANCE_SHOW, qVar, (Object[][]) null);
    }
}
