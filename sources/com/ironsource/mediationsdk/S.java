package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.a.c;
import com.ironsource.mediationsdk.a.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.k;
import com.ironsource.mediationsdk.sdk.f;
import com.ironsource.mediationsdk.sdk.j;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.l;
import com.ironsource.mediationsdk.utils.o;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

final class S implements f {
    j a;
    f b;
    private final String c = getClass().getName();
    private IronSourceLoggerManager d = IronSourceLoggerManager.getLogger();
    private AtomicBoolean e = new AtomicBoolean(true);
    private AtomicBoolean f = new AtomicBoolean(false);
    private l g;
    private NetworkSettings h;
    private String i;

    S() {
    }

    private synchronized void a(IronSourceError ironSourceError) {
        AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        AtomicBoolean atomicBoolean2 = this.e;
        if (atomicBoolean2 != null) {
            atomicBoolean2.set(true);
        }
        f fVar = this.b;
        if (fVar != null) {
            fVar.a(false, ironSourceError);
        }
    }

    private AbstractAdapter b(String str) {
        try {
            L a2 = L.a();
            AbstractAdapter b2 = a2.b(str);
            if (b2 == null) {
                Class<?> cls = Class.forName("com.ironsource.adapters." + str.toLowerCase(Locale.ENGLISH) + "." + str + "Adapter");
                b2 = (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, new Class[]{String.class}).invoke(cls, new Object[]{str});
                if (b2 == null) {
                    return null;
                }
            }
            a2.a(b2);
            return b2;
        } catch (Throwable th) {
            IronSourceLoggerManager ironSourceLoggerManager = this.d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str + " initialization failed - please verify that required dependencies are in you build path.", 2);
            IronSourceLoggerManager ironSourceLoggerManager2 = this.d;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager2.logException(ironSourceTag2, this.c + ":startOfferwallAdapter", th);
            return null;
        }
    }

    public final void a(String str) {
        j jVar;
        String str2 = "OWManager:showOfferwall(" + str + ")";
        try {
            if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
                this.b.onOfferwallShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            this.i = str;
            k a2 = this.g.c.c.a(str);
            if (a2 == null) {
                this.d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a2 = this.g.c.c.a();
                if (a2 == null) {
                    this.d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.d.log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 1);
            AtomicBoolean atomicBoolean = this.f;
            if (atomicBoolean != null && atomicBoolean.get() && (jVar = this.a) != null) {
                jVar.showOfferwall(String.valueOf(a2.a), this.h.getRewardedVideoSettings());
            }
        } catch (Exception e2) {
            this.d.logException(IronSourceLogger.IronSourceTag.INTERNAL, str2, e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a A[Catch:{ Exception -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067 A[SYNTHETIC, Splitter:B:18:0x0067] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.d     // Catch:{ all -> 0x00fa }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00fa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r2.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = r7.c     // Catch:{ all -> 0x00fa }
            r2.append(r3)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = ":initOfferwall(appKey: "
            r2.append(r3)     // Catch:{ all -> 0x00fa }
            r2.append(r8)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = ", userId: "
            r2.append(r3)     // Catch:{ all -> 0x00fa }
            r2.append(r9)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00fa }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00fa }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00fa }
            com.ironsource.mediationsdk.L r0 = com.ironsource.mediationsdk.L.a()     // Catch:{ all -> 0x00fa }
            com.ironsource.mediationsdk.utils.l r0 = r0.i     // Catch:{ all -> 0x00fa }
            r7.g = r0     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x0054
            com.ironsource.mediationsdk.model.h r1 = r0.c     // Catch:{ all -> 0x00fa }
            if (r1 == 0) goto L_0x0054
            com.ironsource.mediationsdk.model.h r1 = r0.c     // Catch:{ all -> 0x00fa }
            com.ironsource.mediationsdk.model.j r1 = r1.c     // Catch:{ all -> 0x00fa }
            if (r1 == 0) goto L_0x0054
            com.ironsource.mediationsdk.model.h r1 = r0.c     // Catch:{ all -> 0x00fa }
            com.ironsource.mediationsdk.model.j r1 = r1.c     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = r1.b()     // Catch:{ all -> 0x00fa }
            if (r1 != 0) goto L_0x004b
            goto L_0x0054
        L_0x004b:
            com.ironsource.mediationsdk.model.h r0 = r0.c     // Catch:{ all -> 0x00fa }
            com.ironsource.mediationsdk.model.j r0 = r0.c     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = r0.b()     // Catch:{ all -> 0x00fa }
            goto L_0x0056
        L_0x0054:
            java.lang.String r0 = "SupersonicAds"
        L_0x0056:
            com.ironsource.mediationsdk.utils.l r1 = r7.g     // Catch:{ all -> 0x00fa }
            if (r1 != 0) goto L_0x0067
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00fa }
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00fa }
            monitor-exit(r7)
            return
        L_0x0067:
            com.ironsource.mediationsdk.model.o r1 = r1.b     // Catch:{ all -> 0x00fa }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r1.a((java.lang.String) r0)     // Catch:{ all -> 0x00fa }
            r7.h = r1     // Catch:{ all -> 0x00fa }
            if (r1 != 0) goto L_0x007e
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00fa }
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00fa }
            monitor-exit(r7)
            return
        L_0x007e:
            com.ironsource.mediationsdk.AbstractAdapter r0 = r7.b(r0)     // Catch:{ all -> 0x00fa }
            if (r0 != 0) goto L_0x0091
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00fa }
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00fa }
            monitor-exit(r7)
            return
        L_0x0091:
            com.ironsource.mediationsdk.L r1 = com.ironsource.mediationsdk.L.a()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r1 = r1.l     // Catch:{ Exception -> 0x00c6 }
            if (r1 == 0) goto L_0x009c
            r0.setMediationSegment(r1)     // Catch:{ Exception -> 0x00c6 }
        L_0x009c:
            com.ironsource.mediationsdk.L r1 = com.ironsource.mediationsdk.L.a()     // Catch:{ Exception -> 0x00c6 }
            java.lang.Boolean r1 = r1.y     // Catch:{ Exception -> 0x00c6 }
            if (r1 == 0) goto L_0x00e1
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.d     // Catch:{ Exception -> 0x00c6 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API     // Catch:{ Exception -> 0x00c6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r6 = "Offerwall | setConsent(consent:"
            r5.<init>(r6)     // Catch:{ Exception -> 0x00c6 }
            r5.append(r1)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00c6 }
            r2.log(r4, r5, r3)     // Catch:{ Exception -> 0x00c6 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x00c6 }
            r0.setConsent(r1)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00e1
        L_0x00c6:
            r1 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.d     // Catch:{ all -> 0x00fa }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00fa }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            java.lang.String r5 = ":setCustomParams():"
            r4.<init>(r5)     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fa }
            r4.append(r1)     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00fa }
            r4 = 3
            r2.log(r3, r1, r4)     // Catch:{ all -> 0x00fa }
        L_0x00e1:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r7.d     // Catch:{ all -> 0x00fa }
            r0.setLogListener(r1)     // Catch:{ all -> 0x00fa }
            com.ironsource.mediationsdk.sdk.j r0 = (com.ironsource.mediationsdk.sdk.j) r0     // Catch:{ all -> 0x00fa }
            r7.a = r0     // Catch:{ all -> 0x00fa }
            r0.setInternalOfferwallListener(r7)     // Catch:{ all -> 0x00fa }
            com.ironsource.mediationsdk.sdk.j r0 = r7.a     // Catch:{ all -> 0x00fa }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r7.h     // Catch:{ all -> 0x00fa }
            org.json.JSONObject r1 = r1.getRewardedVideoSettings()     // Catch:{ all -> 0x00fa }
            r0.initOfferwall(r8, r9, r1)     // Catch:{ all -> 0x00fa }
            monitor-exit(r7)
            return
        L_0x00fa:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.S.a(java.lang.String, java.lang.String):void");
    }

    public final void a(boolean z, IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallAvailable(isAvailable: " + z + ")", 1);
        if (z) {
            this.f.set(true);
            f fVar = this.b;
            if (fVar != null) {
                fVar.onOfferwallAvailable(true);
                return;
            }
            return;
        }
        a(ironSourceError);
    }

    public final synchronized boolean a() {
        boolean z;
        z = false;
        AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean != null) {
            z = atomicBoolean.get();
        }
        return z;
    }

    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        f fVar = this.b;
        if (fVar != null) {
            fVar.onGetOfferwallCreditsFailed(ironSourceError);
        }
    }

    public final boolean onOfferwallAdCredited(int i2, int i3, boolean z) {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAdCredited()", 1);
        f fVar = this.b;
        if (fVar != null) {
            return fVar.onOfferwallAdCredited(i2, i3, z);
        }
        return false;
    }

    public final void onOfferwallAvailable(boolean z) {
        a(z, (IronSourceError) null);
    }

    public final void onOfferwallClosed() {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallClosed()", 1);
        f fVar = this.b;
        if (fVar != null) {
            fVar.onOfferwallClosed();
        }
    }

    public final void onOfferwallOpened() {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallOpened()", 1);
        int b2 = o.a().b(0);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (!TextUtils.isEmpty(this.i)) {
                mediationAdditionalData.put("placement", this.i);
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, b2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        h.d().b(new c(305, mediationAdditionalData));
        o.a().a(0);
        f fVar = this.b;
        if (fVar != null) {
            fVar.onOfferwallOpened();
        }
    }

    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        f fVar = this.b;
        if (fVar != null) {
            fVar.onOfferwallShowFailed(ironSourceError);
        }
    }
}
