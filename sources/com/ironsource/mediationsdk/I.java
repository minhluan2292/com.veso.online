package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0017b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.Q;
import com.ironsource.mediationsdk.a.c;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.sdk.h;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.d;
import com.ironsource.mediationsdk.utils.e;
import com.ironsource.mediationsdk.utils.i;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.o;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

final class I extends C0016a implements h, d, i {
    com.ironsource.mediationsdk.sdk.i m;
    C0036u n = C0036u.a();
    private final String o = getClass().getName();
    private boolean p = false;
    private boolean q = false;
    private boolean r;
    private InterstitialPlacement s;
    private boolean t = false;
    private Map<String, J> u = new ConcurrentHashMap();
    private CopyOnWriteArraySet<String> v = new CopyOnWriteArraySet<>();
    private long w;
    private boolean x;

    I() {
        this.a = new e(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, this);
        this.x = false;
    }

    private int a(C0017b.a... aVarArr) {
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            C0017b bVar = (C0017b) it.next();
            for (C0017b.a aVar : aVarArr) {
                if (bVar.a == aVar) {
                    i++;
                }
            }
        }
        return i;
    }

    private void a(int i, C0017b bVar, Object[][] objArr) {
        a(i, bVar, objArr, false);
    }

    private void a(int i, C0017b bVar, Object[][] objArr, boolean z) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(bVar);
        if (z) {
            try {
                InterstitialPlacement interstitialPlacement = this.s;
                if (interstitialPlacement != null && !TextUtils.isEmpty(interstitialPlacement.getPlacementName())) {
                    providerAdditionalData.put("placement", this.s.getPlacementName());
                }
            } catch (Exception e) {
                this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new c(i, providerAdditionalData));
    }

    private void a(int i, Object[][] objArr) {
        a(i, objArr, false);
    }

    private void a(int i, Object[][] objArr, boolean z) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (z) {
            try {
                InterstitialPlacement interstitialPlacement = this.s;
                if (interstitialPlacement != null && !TextUtils.isEmpty(interstitialPlacement.getPlacementName())) {
                    mediationAdditionalData.put("placement", this.s.getPlacementName());
                }
            } catch (Exception e) {
                this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new c(i, mediationAdditionalData));
    }

    private void b(int i, C0017b bVar, Object[][] objArr) {
        a(i, bVar, objArr, true);
    }

    private void c(C0017b bVar) {
        if (!bVar.c()) {
            i();
            h();
            return;
        }
        bVar.a(C0017b.a.INITIATED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0095, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ironsource.mediationsdk.AbstractAdapter g(com.ironsource.mediationsdk.J r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r2.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = r9.o     // Catch:{ all -> 0x00c4 }
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = ":startAdapter("
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = r10.j()     // Catch:{ all -> 0x00c4 }
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00c4 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.d r0 = com.ironsource.mediationsdk.C0019d.a()     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r10.c     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r10.c     // Catch:{ all -> 0x00c4 }
            org.json.JSONObject r2 = r2.getInterstitialSettings()     // Catch:{ all -> 0x00c4 }
            r4 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r0.a(r1, r2, r4, r4)     // Catch:{ all -> 0x00c4 }
            r1 = 0
            if (r0 != 0) goto L_0x0059
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r3.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = r10.d     // Catch:{ all -> 0x00c4 }
            r3.append(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = " is configured in IronSource's platform, but the adapter is not integrated"
            r3.append(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00c4 }
            r3 = 2
            r0.log(r2, r10, r3)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r9)
            return r1
        L_0x0059:
            r10.b = r0     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C0017b.a.INIT_PENDING     // Catch:{ all -> 0x00c4 }
            r10.a(r2)     // Catch:{ all -> 0x00c4 }
            r9.b(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r9.g     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = r9.f     // Catch:{ all -> 0x0096 }
            r10.h()     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.b     // Catch:{ all -> 0x0096 }
            if (r5 == 0) goto L_0x0094
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.b     // Catch:{ all -> 0x0096 }
            r5.addInterstitialListener(r10)     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r10.q     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r7.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = r10.d     // Catch:{ all -> 0x0096 }
            r7.append(r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = ":initInterstitial()"
            r7.append(r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0096 }
            r5.log(r6, r7, r3)     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r10.b     // Catch:{ all -> 0x0096 }
            org.json.JSONObject r5 = r10.r     // Catch:{ all -> 0x0096 }
            r3.initInterstitial(r2, r4, r5, r10)     // Catch:{ all -> 0x0096 }
        L_0x0094:
            monitor-exit(r9)
            return r0
        L_0x0096:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r4.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r9.o     // Catch:{ all -> 0x00c4 }
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "failed to init adapter: "
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r10.j()     // Catch:{ all -> 0x00c4 }
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "v"
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c4 }
            r2.logException(r3, r4, r0)     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C0017b.a.INIT_FAILED     // Catch:{ all -> 0x00c4 }
            r10.a(r0)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r9)
            return r1
        L_0x00c4:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.I.g(com.ironsource.mediationsdk.J):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0033 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.c
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C0017b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C0017b.a.NOT_INITIATED
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C0017b.a.INIT_PENDING
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C0017b.a.INITIATED
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C0017b.a.LOAD_PENDING
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r1 = r1.a
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C0017b.a.AVAILABLE
            if (r1 != r3) goto L_0x0006
        L_0x0031:
            r0 = r2
            goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            if (r0 == 0) goto L_0x0064
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "Reset Iteration"
            r0.log(r1, r3, r2)
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.c
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C0017b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C0017b.a.EXHAUSTED
            if (r3 != r4) goto L_0x0045
            r1.g()
            goto L_0x0045
        L_0x005b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "End of Reset Iteration"
            r0.log(r1, r3, r2)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.I.h():void");
    }

    private synchronized void h(J j) {
        a(2002, (C0017b) j, (Object[][]) null);
        j.i();
        if (j.b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = j.q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag, j.d + ":loadInterstitial()", 1);
            j.t = new Date().getTime();
            j.b.loadInterstitial(j.r, j);
        }
    }

    private AbstractAdapter i() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.c.size() && abstractAdapter == null; i2++) {
            if (((C0017b) this.c.get(i2)).a == C0017b.a.AVAILABLE || ((C0017b) this.c.get(i2)).a == C0017b.a.INITIATED || ((C0017b) this.c.get(i2)).a == C0017b.a.INIT_PENDING || ((C0017b) this.c.get(i2)).a == C0017b.a.LOAD_PENDING) {
                i++;
                if (i >= this.b) {
                    break;
                }
            } else if (((C0017b) this.c.get(i2)).a == C0017b.a.NOT_INITIATED && (abstractAdapter = g((J) this.c.get(i2))) == null) {
                ((C0017b) this.c.get(i2)).a(C0017b.a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    private synchronized void j() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            C0017b bVar = (C0017b) it.next();
            if (bVar.a == C0017b.a.AVAILABLE || bVar.a == C0017b.a.LOAD_PENDING || bVar.a == C0017b.a.NOT_AVAILABLE) {
                bVar.a(C0017b.a.INITIATED);
            }
        }
    }

    private void k() {
        for (int i = 0; i < this.c.size(); i++) {
            String providerTypeForReflection = ((C0017b) this.c.get(i)).c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C0019d.a().a(((C0017b) this.c.get(i)).c, ((C0017b) this.c.get(i)).c.getInterstitialSettings(), false, false);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.o + " Should Track Network State: " + z, 0);
        this.i = z;
    }

    public final synchronized void a(J j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.d + " :onInterstitialInitSuccess()", 1);
        a((int) IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, (C0017b) j, (Object[][]) null);
        this.r = true;
        if (this.p) {
            if (a(C0017b.a.AVAILABLE, C0017b.a.LOAD_PENDING) < this.b) {
                j.a(C0017b.a.LOAD_PENDING);
                h(j);
            }
        }
    }

    public final synchronized void a(J j, long j2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.d + ":onInterstitialAdReady()", 1);
        a(2003, (C0017b) j, new Object[][]{new Object[]{"duration", Long.valueOf(j2)}});
        long time = new Date().getTime() - this.w;
        j.a(C0017b.a.AVAILABLE);
        this.q = false;
        if (this.t) {
            this.t = false;
            this.m.onInterstitialAdReady();
            a(2004, new Object[][]{new Object[]{"duration", Long.valueOf(time)}});
        }
    }

    public final synchronized void a(IronSourceError ironSourceError, J j) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager.log(ironSourceTag, j.d + ":onInterstitialInitFailed(" + ironSourceError + ")", 1);
            a((int) IronSourceConstants.IS_INSTANCE_INIT_FAILED, (C0017b) j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            if (a(C0017b.a.INIT_FAILED) >= this.c.size()) {
                IronSourceLoggerManager ironSourceLoggerManager2 = this.h;
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
                ironSourceLoggerManager2.log(ironSourceTag2, "Smart Loading - initialization failed - no adapters are initiated and no more left to init, error: " + ironSourceError.getErrorMessage(), 2);
                if (this.p) {
                    this.n.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildGenericError("no ads to show"));
                    a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 510}});
                    this.t = false;
                }
                this.r = true;
            } else {
                if (i() == null && this.p) {
                    if (a(C0017b.a.INIT_FAILED, C0017b.a.NOT_AVAILABLE, C0017b.a.CAPPED_PER_SESSION, C0017b.a.CAPPED_PER_DAY, C0017b.a.EXHAUSTED) >= this.c.size()) {
                        this.n.a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(509, "No ads to show"));
                        a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 509}});
                        this.t = false;
                    }
                }
                h();
                return;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager3 = this.h;
            IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager3.logException(ironSourceTag3, "onInterstitialInitFailed(error:" + ironSourceError + ", provider:" + j.j() + ")", e);
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ironsource.mediationsdk.logger.IronSourceError r8, com.ironsource.mediationsdk.J r9, long r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.h     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r2.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r9.d     // Catch:{ all -> 0x012c }
            r2.append(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = ":onInterstitialAdLoadFailed("
            r2.append(r3)     // Catch:{ all -> 0x012c }
            r2.append(r8)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x012c }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r0.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r9.d     // Catch:{ all -> 0x012c }
            r0.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = ":onInterstitialAdLoadFailed("
            r0.append(r1)     // Catch:{ all -> 0x012c }
            r0.append(r8)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ all -> 0x012c }
            int r0 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            r1 = 1158(0x486, float:1.623E-42)
            r2 = 2
            r4 = 0
            if (r0 != r1) goto L_0x0074
            r0 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            int r8 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x012c }
            r5[r3] = r8     // Catch:{ all -> 0x012c }
            r1[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "duration"
            r8[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012c }
            r8[r3] = r10     // Catch:{ all -> 0x012c }
            r1[r3] = r8     // Catch:{ all -> 0x012c }
            r7.a((int) r0, (com.ironsource.mediationsdk.C0017b) r9, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x012c }
            goto L_0x00aa
        L_0x0074:
            r0 = 2200(0x898, float:3.083E-42)
            r1 = 3
            java.lang.Object[][] r1 = new java.lang.Object[r1][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            int r6 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x012c }
            r5[r3] = r6     // Catch:{ all -> 0x012c }
            r1[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "reason"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            java.lang.String r8 = r8.getErrorMessage()     // Catch:{ all -> 0x012c }
            r5[r3] = r8     // Catch:{ all -> 0x012c }
            r1[r3] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "duration"
            r8[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012c }
            r8[r3] = r10     // Catch:{ all -> 0x012c }
            r1[r2] = r8     // Catch:{ all -> 0x012c }
            r7.a((int) r0, (com.ironsource.mediationsdk.C0017b) r9, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x012c }
        L_0x00aa:
            com.ironsource.mediationsdk.b$a r8 = com.ironsource.mediationsdk.C0017b.a.NOT_AVAILABLE     // Catch:{ all -> 0x012c }
            r9.a(r8)     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a[] r8 = new com.ironsource.mediationsdk.C0017b.a[r2]     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r9 = com.ironsource.mediationsdk.C0017b.a.AVAILABLE     // Catch:{ all -> 0x012c }
            r8[r4] = r9     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r9 = com.ironsource.mediationsdk.C0017b.a.LOAD_PENDING     // Catch:{ all -> 0x012c }
            r8[r3] = r9     // Catch:{ all -> 0x012c }
            int r8 = r7.a((com.ironsource.mediationsdk.C0017b.a[]) r8)     // Catch:{ all -> 0x012c }
            int r9 = r7.b     // Catch:{ all -> 0x012c }
            if (r8 < r9) goto L_0x00c3
            monitor-exit(r7)
            return
        L_0x00c3:
            java.util.concurrent.CopyOnWriteArrayList r9 = r7.c     // Catch:{ all -> 0x012c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x012c }
        L_0x00c9:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x012c }
            if (r10 == 0) goto L_0x00e7
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b r10 = (com.ironsource.mediationsdk.C0017b) r10     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r11 = r10.a     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C0017b.a.INITIATED     // Catch:{ all -> 0x012c }
            if (r11 != r0) goto L_0x00c9
            com.ironsource.mediationsdk.b$a r8 = com.ironsource.mediationsdk.C0017b.a.LOAD_PENDING     // Catch:{ all -> 0x012c }
            r10.a(r8)     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.J r10 = (com.ironsource.mediationsdk.J) r10     // Catch:{ all -> 0x012c }
            r7.h(r10)     // Catch:{ all -> 0x012c }
            monitor-exit(r7)
            return
        L_0x00e7:
            com.ironsource.mediationsdk.AbstractAdapter r9 = r7.i()     // Catch:{ all -> 0x012c }
            if (r9 == 0) goto L_0x00ef
            monitor-exit(r7)
            return
        L_0x00ef:
            boolean r9 = r7.p     // Catch:{ all -> 0x012c }
            if (r9 == 0) goto L_0x012a
            com.ironsource.mediationsdk.b$a[] r9 = new com.ironsource.mediationsdk.C0017b.a[r3]     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C0017b.a.INIT_PENDING     // Catch:{ all -> 0x012c }
            r9[r4] = r10     // Catch:{ all -> 0x012c }
            int r9 = r7.a((com.ironsource.mediationsdk.C0017b.a[]) r9)     // Catch:{ all -> 0x012c }
            int r8 = r8 + r9
            if (r8 != 0) goto L_0x012a
            r7.h()     // Catch:{ all -> 0x012c }
            r7.q = r4     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.u r8 = r7.n     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r9 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.logger.IronSourceError r10 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x012c }
            java.lang.String r11 = "No ads to show"
            r0 = 509(0x1fd, float:7.13E-43)
            r10.<init>(r0, r11)     // Catch:{ all -> 0x012c }
            r8.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r9, (com.ironsource.mediationsdk.logger.IronSourceError) r10)     // Catch:{ all -> 0x012c }
            r8 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r9 = new java.lang.Object[r3][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r11 = "errorCode"
            r10[r4] = r11     // Catch:{ all -> 0x012c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x012c }
            r10[r3] = r11     // Catch:{ all -> 0x012c }
            r9[r4] = r10     // Catch:{ all -> 0x012c }
            r7.a((int) r8, (java.lang.Object[][]) r9)     // Catch:{ all -> 0x012c }
        L_0x012a:
            monitor-exit(r7)
            return
        L_0x012c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.I.a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.J, long):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(InterstitialPlacement interstitialPlacement) {
        this.s = interstitialPlacement;
        this.m.e = interstitialPlacement;
    }

    public final void a(String str) {
        if (this.p) {
            this.n.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            this.p = false;
            this.q = false;
        }
    }

    public final synchronized void a(String str, String str2) {
        this.h.log(IronSourceLogger.IronSourceTag.NATIVE, this.o + ":initInterstitial(appKey: " + str + ", userId: " + str2 + ")", 1);
        long time = new Date().getTime();
        a((int) IronSourceConstants.IS_MANAGER_INIT_STARTED, (Object[][]) null);
        this.g = str;
        this.f = str2;
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            C0017b bVar = (C0017b) it.next();
            if (this.a.b(bVar)) {
                a(250, bVar, new Object[][]{new Object[]{"status", "false"}});
            }
            if (this.a.c(bVar)) {
                bVar.a(C0017b.a.CAPPED_PER_DAY);
                i++;
            }
        }
        if (i == this.c.size()) {
            this.r = true;
        }
        k();
        for (int i2 = 0; i2 < this.b && i() != null; i2++) {
        }
        a((int) IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    public final void a(List<IronSource.AD_UNIT> list, boolean z, com.ironsource.mediationsdk.model.h hVar) {
    }

    public final void b(J j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.d + ":onInterstitialAdOpened()", 1);
        b(IronSourceConstants.IS_INSTANCE_OPENED, j, (Object[][]) null);
        this.m.onInterstitialAdOpened();
    }

    public final void b(IronSourceError ironSourceError, J j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.d + ":onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        this.x = false;
        c((C0017b) j);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (((C0017b) it.next()).a == C0017b.a.AVAILABLE) {
                this.p = true;
                InterstitialPlacement interstitialPlacement = this.s;
                if (interstitialPlacement != null) {
                    interstitialPlacement.getPlacementName();
                }
                d();
                return;
            }
        }
        this.m.onInterstitialAdShowFailed(ironSourceError);
    }

    public final synchronized void c() {
        try {
            if (this.x) {
                this.h.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial cannot be invoked while showing an ad", 3);
                F.a().a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial cannot be invoked while showing an ad"));
                return;
            }
            this.s = null;
            this.m.e = null;
            if (!this.q) {
                if (!this.n.a(IronSource.AD_UNIT.INTERSTITIAL)) {
                    Q.a b = Q.a().b();
                    if (b == Q.a.NOT_INIT) {
                        this.h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                        return;
                    } else if (b == Q.a.INIT_IN_PROGRESS) {
                        if (Q.a().c()) {
                            this.h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                            this.n.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                            return;
                        }
                        this.w = new Date().getTime();
                        a(2001, (Object[][]) null);
                        this.p = true;
                        this.t = true;
                        return;
                    } else if (b == Q.a.INIT_FAILED) {
                        this.h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        this.n.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    } else if (this.c.size() == 0) {
                        this.h.log(IronSourceLogger.IronSourceTag.API, "the server response does not contain interstitial data", 3);
                        this.n.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    } else {
                        this.w = new Date().getTime();
                        a(2001, (Object[][]) null);
                        this.t = true;
                        j();
                        if (a(C0017b.a.INITIATED) != 0) {
                            this.p = true;
                            this.q = true;
                            Iterator it = this.c.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                C0017b bVar = (C0017b) it.next();
                                if (bVar.a == C0017b.a.INITIATED) {
                                    bVar.a(C0017b.a.LOAD_PENDING);
                                    h((J) bVar);
                                    i++;
                                    if (i >= this.b) {
                                        return;
                                    }
                                }
                            }
                            return;
                        } else if (!this.r) {
                            this.p = true;
                            return;
                        } else {
                            IronSourceError buildGenericError = ErrorBuilder.buildGenericError("no ads to load");
                            this.h.log(IronSourceLogger.IronSourceTag.API, buildGenericError.getErrorMessage(), 1);
                            this.n.a(IronSource.AD_UNIT.INTERSTITIAL, buildGenericError);
                            a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildGenericError.getErrorCode())}});
                            this.t = false;
                            return;
                        }
                    }
                }
            }
            this.h.log(IronSourceLogger.IronSourceTag.API, "Load Interstitial is already in progress", 3);
        } catch (Exception e) {
            e.printStackTrace();
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e.getMessage());
            this.h.log(IronSourceLogger.IronSourceTag.API, buildLoadFailedError.getErrorMessage(), 3);
            this.n.a(IronSource.AD_UNIT.INTERSTITIAL, buildLoadFailedError);
            if (this.t) {
                this.t = false;
                a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildLoadFailedError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
            }
        }
    }

    public final void c(J j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.d + ":onInterstitialAdClosed()", 1);
        this.x = false;
        b(IronSourceConstants.IS_INSTANCE_CLOSED, j, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(o.a().b(2))}});
        o.a().a(2);
        this.m.onInterstitialAdClosed();
    }

    public final void d() {
        if (this.x) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad while an ad is already showing", 3);
            this.m.onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, "showInterstitial error: can't show ad while an ad is already showing"));
        } else if (!this.p) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial failed - You need to load interstitial before showing it", 3);
            this.m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - You need to load interstitial before showing it"));
        } else if (!this.i || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            for (int i = 0; i < this.c.size(); i++) {
                C0017b bVar = (C0017b) this.c.get(i);
                if (bVar.a == C0017b.a.AVAILABLE) {
                    k.c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.s);
                    if (k.b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.s) != k.a.d) {
                        a((int) IronSourceConstants.IS_CAP_PLACEMENT, (Object[][]) null, true);
                    }
                    b(IronSourceConstants.IS_INSTANCE_SHOW, bVar, (Object[][]) null);
                    this.x = true;
                    J j = (J) bVar;
                    if (j.b != null) {
                        j.q.log(IronSourceLogger.IronSourceTag.ADAPTER_API, j.d + ":showInterstitial()", 1);
                        j.d();
                        j.b.showInterstitial(j.r, j);
                    }
                    if (bVar.b()) {
                        a((int) IronSourceConstants.IS_CAP_SESSION, bVar, (Object[][]) null);
                    }
                    this.a.a(bVar);
                    if (this.a.c(bVar)) {
                        bVar.a(C0017b.a.CAPPED_PER_DAY);
                        a(250, bVar, new Object[][]{new Object[]{"status", "true"}});
                    }
                    this.p = false;
                    if (!bVar.c()) {
                        i();
                        return;
                    }
                    return;
                }
            }
            this.m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - No adapters ready to show"));
        } else {
            this.h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad when there's no internet connection", 3);
            this.m.onInterstitialAdShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    public final void d(J j) {
        this.h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, j.d + ":onInterstitialAdShowSucceeded()", 1);
        b(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, j, (Object[][]) null);
        Iterator it = this.c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C0017b bVar = (C0017b) it.next();
            if (bVar.a == C0017b.a.AVAILABLE) {
                c(bVar);
                z = true;
            }
        }
        if (!z && (j.a == C0017b.a.CAPPED_PER_SESSION || j.a == C0017b.a.EXHAUSTED || j.a == C0017b.a.CAPPED_PER_DAY)) {
            h();
        }
        j();
        this.m.onInterstitialAdShowSucceeded();
    }

    public final void e(J j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.d + ":onInterstitialAdClicked()", 1);
        b(2006, j, (Object[][]) null);
        this.m.onInterstitialAdClicked();
    }

    public final synchronized boolean e() {
        boolean z;
        if (this.i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            C0017b bVar = (C0017b) it.next();
            if (bVar.a == C0017b.a.AVAILABLE) {
                J j = (J) bVar;
                if (j.b != null) {
                    j.q.log(IronSourceLogger.IronSourceTag.ADAPTER_API, j.d + ":isInterstitialReady()", 1);
                    z = j.b.isInterstitialReady(j.r);
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        if (this.p) {
            IronSourceError buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            this.n.a(IronSource.AD_UNIT.INTERSTITIAL, buildInitFailedError);
            this.p = false;
            this.q = false;
            if (this.t) {
                a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildInitFailedError.getErrorCode())}}, false);
                this.t = false;
            }
        }
    }

    public final void f(J j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.d + ":onInterstitialAdVisible()", 1);
    }

    public final void g() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            C0017b bVar = (C0017b) it.next();
            if (bVar.a == C0017b.a.CAPPED_PER_DAY) {
                a(250, bVar, new Object[][]{new Object[]{"status", "false"}});
                bVar.a(bVar.b() ? C0017b.a.CAPPED_PER_SESSION : bVar.a() ? C0017b.a.EXHAUSTED : C0017b.a.INITIATED);
            }
        }
    }
}
