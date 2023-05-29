package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.j;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.i;
import com.ironsource.mediationsdk.utils.l;
import com.ironsource.sdk.a.e;
import com.ironsource.sdk.controller.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

final class Q implements j {
    private static Q u;
    private NetworkStateReceiver A;
    private a B = a.NOT_INIT;
    private c C = new c() {
        /* JADX WARNING: Removed duplicated region for block: B:101:0x02eb A[Catch:{ Exception -> 0x0398 }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[Catch:{ Exception -> 0x0398 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[Catch:{ Exception -> 0x0398 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[Catch:{ Exception -> 0x0398 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf A[Catch:{ Exception -> 0x0398 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4 A[Catch:{ Exception -> 0x0398 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0115 A[Catch:{ Exception -> 0x0398 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                com.ironsource.mediationsdk.L r0 = com.ironsource.mediationsdk.L.a()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.al r1 = com.ironsource.mediationsdk.al.a()     // Catch:{ Exception -> 0x0398 }
                java.lang.Thread r2 = new java.lang.Thread     // Catch:{ Exception -> 0x0016 }
                com.ironsource.mediationsdk.al$1 r3 = new com.ironsource.mediationsdk.al$1     // Catch:{ Exception -> 0x0016 }
                r3.<init>()     // Catch:{ Exception -> 0x0016 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0016 }
                r2.start()     // Catch:{ Exception -> 0x0016 }
                goto L_0x001a
            L_0x0016:
                r1 = move-exception
                r1.printStackTrace()     // Catch:{ Exception -> 0x0398 }
            L_0x001a:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r1 = r1.l     // Catch:{ Exception -> 0x0398 }
                com.ironsource.d.b r2 = new com.ironsource.d.b     // Catch:{ Exception -> 0x0398 }
                r2.<init>()     // Catch:{ Exception -> 0x0398 }
                r3 = 0
                r4 = 0
                java.lang.String r5 = "userId"
                r6 = 1
                if (r1 == 0) goto L_0x0047
                if (r1 == 0) goto L_0x003c
                int r7 = r1.length()     // Catch:{ Exception -> 0x0398 }
                if (r7 <= 0) goto L_0x003c
                int r7 = r1.length()     // Catch:{ Exception -> 0x0398 }
                r8 = 64
                if (r7 > r8) goto L_0x003c
                r7 = r6
                goto L_0x003d
            L_0x003c:
                r7 = r4
            L_0x003d:
                if (r7 != 0) goto L_0x004e
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r3)     // Catch:{ Exception -> 0x0398 }
            L_0x0043:
                r2.a((com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ Exception -> 0x0398 }
                goto L_0x004e
            L_0x0047:
                java.lang.String r7 = "it's missing"
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r7)     // Catch:{ Exception -> 0x0398 }
                goto L_0x0043
            L_0x004e:
                boolean r1 = r2.a()     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x005b
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = "userGenerated"
                r1.o = r2     // Catch:{ Exception -> 0x0398 }
                goto L_0x00a8
            L_0x005b:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0398 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = com.ironsource.mediationsdk.L.a((android.content.Context) r2)     // Catch:{ Exception -> 0x0398 }
                r1.l = r2     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r1 = r1.l     // Catch:{ Exception -> 0x0398 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0398 }
                if (r1 != 0) goto L_0x007c
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = "GAID"
            L_0x0079:
                r1.o = r2     // Catch:{ Exception -> 0x0398 }
                goto L_0x00a1
            L_0x007c:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0398 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = com.ironsource.environment.h.x(r2)     // Catch:{ Exception -> 0x0398 }
                r1.l = r2     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r1 = r1.l     // Catch:{ Exception -> 0x0398 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0398 }
                if (r1 != 0) goto L_0x009b
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = "UUID"
                goto L_0x0079
            L_0x009b:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = ""
                r1.l = r2     // Catch:{ Exception -> 0x0398 }
            L_0x00a1:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r1 = r1.l     // Catch:{ Exception -> 0x0398 }
                r0.a((java.lang.String) r1, (boolean) r4)     // Catch:{ Exception -> 0x0398 }
            L_0x00a8:
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.e.a()     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = "userIdType"
                com.ironsource.mediationsdk.Q r4 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r4 = r4.o     // Catch:{ Exception -> 0x0398 }
                r1.a(r2, r4)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r1 = r1.l     // Catch:{ Exception -> 0x0398 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0398 }
                if (r1 != 0) goto L_0x00ca
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.e.a()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r2 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = r2.l     // Catch:{ Exception -> 0x0398 }
                r1.a(r5, r2)     // Catch:{ Exception -> 0x0398 }
            L_0x00ca:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r1 = r1.m     // Catch:{ Exception -> 0x0398 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0398 }
                if (r1 != 0) goto L_0x00e1
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.e.a()     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = "appKey"
                com.ironsource.mediationsdk.Q r4 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r4 = r4.m     // Catch:{ Exception -> 0x0398 }
                r1.a(r2, r4)     // Catch:{ Exception -> 0x0398 }
            L_0x00e1:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.sdk.a.e r1 = r1.s     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r2 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = r2.l     // Catch:{ Exception -> 0x0398 }
                r1.e(r2)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x0398 }
                r2.<init>()     // Catch:{ Exception -> 0x0398 }
                long r4 = r2.getTime()     // Catch:{ Exception -> 0x0398 }
                r1.r = r4     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0398 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r4 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.lang.String r4 = r4.l     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.L$a r5 = r11.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.l r2 = r0.a((android.content.Context) r2, (java.lang.String) r4, (com.ironsource.mediationsdk.L.a) r5)     // Catch:{ Exception -> 0x0398 }
                r1.n = r2     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.l r1 = r1.n     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x02eb
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                android.os.Handler r1 = r1.i     // Catch:{ Exception -> 0x0398 }
                r1.removeCallbacks(r11)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.l r1 = r1.n     // Catch:{ Exception -> 0x0398 }
                boolean r1 = r1.b()     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x02c0
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q$a r2 = com.ironsource.mediationsdk.Q.a.INITIATED     // Catch:{ Exception -> 0x0398 }
                r1.a((com.ironsource.mediationsdk.Q.a) r2)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.l r2 = r1.n     // Catch:{ Exception -> 0x0398 }
                r1.a((com.ironsource.mediationsdk.utils.l) r2)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                boolean r2 = r0.n()     // Catch:{ Exception -> 0x0398 }
                r1.b(r2)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.environment.g r1 = com.ironsource.environment.g.a     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.l r1 = r1.n     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.model.h r1 = r1.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.sdk.controller.u r1 = r1.e     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.b r1 = r1.f()     // Catch:{ Exception -> 0x0398 }
                boolean r1 = r1.a()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.environment.g.a(r1)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.environment.g r1 = com.ironsource.environment.g.a     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.l r1 = r1.n     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.model.h r1 = r1.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.sdk.controller.u r1 = r1.e     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.b r1 = r1.f()     // Catch:{ Exception -> 0x0398 }
                boolean r1 = r1.b()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.environment.g.c(r1)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0398 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r4 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.l r4 = r4.n     // Catch:{ Exception -> 0x0398 }
                r1.a(r2, r4)     // Catch:{ Exception -> 0x0398 }
                java.util.Date r1 = new java.util.Date     // Catch:{ Exception -> 0x0398 }
                r1.<init>()     // Catch:{ Exception -> 0x0398 }
                long r1 = r1.getTime()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r4 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                long r4 = r4.r     // Catch:{ Exception -> 0x0398 }
                long r1 = r1 - r4
                boolean r4 = r0.n()     // Catch:{ Exception -> 0x0398 }
                org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4)     // Catch:{ Exception -> 0x0398 }
                java.lang.String r5 = "duration"
                r4.put(r5, r1)     // Catch:{ Exception -> 0x019b }
                java.lang.String r1 = "sessionDepth"
                int r0 = r0.t     // Catch:{ Exception -> 0x019b }
                r4.put(r1, r0)     // Catch:{ Exception -> 0x019b }
                goto L_0x019f
            L_0x019b:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ Exception -> 0x0398 }
            L_0x019f:
                com.ironsource.mediationsdk.a.c r0 = new com.ironsource.mediationsdk.a.c     // Catch:{ Exception -> 0x0398 }
                r1 = 514(0x202, float:7.2E-43)
                r0.<init>(r1, r4)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.a.h r1 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ Exception -> 0x0398 }
                r1.b((com.ironsource.mediationsdk.a.c) r0)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.aj r1 = new com.ironsource.mediationsdk.aj     // Catch:{ Exception -> 0x0398 }
                r1.<init>()     // Catch:{ Exception -> 0x0398 }
                r0.a = r1     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.aj r0 = r0.a     // Catch:{ Exception -> 0x0398 }
                r0.a()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.l r0 = r0.n     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.model.h r0 = r0.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.sdk.controller.u r0 = r0.e     // Catch:{ Exception -> 0x0398 }
                boolean r0 = r0.d()     // Catch:{ Exception -> 0x0398 }
                if (r0 == 0) goto L_0x01e0
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0398 }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x0398 }
                if (r0 == 0) goto L_0x01e0
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0398 }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(r0)     // Catch:{ Exception -> 0x0398 }
            L_0x01e0:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.l r0 = r0.n     // Catch:{ Exception -> 0x0398 }
                org.json.JSONObject r1 = r0.d     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x023a
                com.ironsource.mediationsdk.model.h r1 = r0.c     // Catch:{ Exception -> 0x0398 }
                if (r1 != 0) goto L_0x01ed
                goto L_0x023a
            L_0x01ed:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0398 }
                r3.<init>()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.model.h r1 = r0.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.model.p r1 = r1.a     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x020b
                com.ironsource.mediationsdk.model.n r1 = r0.a     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x020b
                com.ironsource.mediationsdk.model.n r1 = r0.a     // Catch:{ Exception -> 0x0398 }
                java.util.ArrayList<java.lang.String> r1 = r1.a     // Catch:{ Exception -> 0x0398 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0398 }
                if (r1 <= 0) goto L_0x020b
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ Exception -> 0x0398 }
                r3.add(r1)     // Catch:{ Exception -> 0x0398 }
            L_0x020b:
                com.ironsource.mediationsdk.model.h r1 = r0.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.model.i r1 = r1.b     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x0224
                com.ironsource.mediationsdk.model.n r1 = r0.a     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x0224
                com.ironsource.mediationsdk.model.n r1 = r0.a     // Catch:{ Exception -> 0x0398 }
                java.util.ArrayList<java.lang.String> r1 = r1.d     // Catch:{ Exception -> 0x0398 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0398 }
                if (r1 <= 0) goto L_0x0224
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ Exception -> 0x0398 }
                r3.add(r1)     // Catch:{ Exception -> 0x0398 }
            L_0x0224:
                com.ironsource.mediationsdk.model.h r1 = r0.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.model.j r1 = r1.c     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x022f
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ Exception -> 0x0398 }
                r3.add(r1)     // Catch:{ Exception -> 0x0398 }
            L_0x022f:
                com.ironsource.mediationsdk.model.h r0 = r0.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.model.f r0 = r0.d     // Catch:{ Exception -> 0x0398 }
                if (r0 == 0) goto L_0x023a
                com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ Exception -> 0x0398 }
                r3.add(r0)     // Catch:{ Exception -> 0x0398 }
            L_0x023a:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.k     // Catch:{ Exception -> 0x0398 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0398 }
            L_0x0242:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x025c
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.i) r1     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r2 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                boolean r2 = r2.g     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r4 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.l r4 = r4.n     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.model.h r4 = r4.c     // Catch:{ Exception -> 0x0398 }
                r1.a(r3, r2, r4)     // Catch:{ Exception -> 0x0398 }
                goto L_0x0242
            L_0x025c:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.sdk.SegmentListener r0 = r0.p     // Catch:{ Exception -> 0x0398 }
                if (r0 == 0) goto L_0x0281
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.l r0 = r0.n     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.model.h r0 = r0.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.sdk.controller.u r0 = r0.e     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.model.q r0 = r0.b()     // Catch:{ Exception -> 0x0398 }
                if (r0 == 0) goto L_0x0281
                java.lang.String r1 = r0.a     // Catch:{ Exception -> 0x0398 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0398 }
                if (r1 != 0) goto L_0x0281
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.sdk.SegmentListener r1 = r1.p     // Catch:{ Exception -> 0x0398 }
                java.lang.String r0 = r0.a     // Catch:{ Exception -> 0x0398 }
                r1.onSegmentReceived(r0)     // Catch:{ Exception -> 0x0398 }
            L_0x0281:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.l r0 = r0.n     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.model.h r0 = r0.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.sdk.controller.u r0 = r0.e     // Catch:{ Exception -> 0x0398 }
                com.ironsource.sdk.g.d r0 = r0.e()     // Catch:{ Exception -> 0x0398 }
                boolean r1 = r0.b()     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x039c
                java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSessionId()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.environment.e r2 = com.ironsource.environment.e.a()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0398 }
                android.content.Context r3 = r1.getApplicationContext()     // Catch:{ Exception -> 0x0398 }
                java.util.HashSet r4 = r0.a()     // Catch:{ Exception -> 0x0398 }
                java.lang.String r5 = r0.c()     // Catch:{ Exception -> 0x0398 }
                java.lang.String r6 = r0.d()     // Catch:{ Exception -> 0x0398 }
                boolean r7 = r0.e()     // Catch:{ Exception -> 0x0398 }
                int r9 = r0.f()     // Catch:{ Exception -> 0x0398 }
                boolean r10 = r0.g()     // Catch:{ Exception -> 0x0398 }
                r2.a(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0398 }
                goto L_0x039c
            L_0x02c0:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                boolean r0 = r0.h     // Catch:{ Exception -> 0x0398 }
                if (r0 != 0) goto L_0x0397
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.Q.a.INIT_FAILED     // Catch:{ Exception -> 0x0398 }
                r0.a((com.ironsource.mediationsdk.Q.a) r1)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                r0.h = r6     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.k     // Catch:{ Exception -> 0x0398 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0398 }
            L_0x02d9:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x039c
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.i) r1     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = "serverResponseIsNotValid"
                r1.a(r2)     // Catch:{ Exception -> 0x0398 }
                goto L_0x02d9
            L_0x02eb:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                int r0 = r0.c     // Catch:{ Exception -> 0x0398 }
                r1 = 3
                if (r0 != r1) goto L_0x030e
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                r0.q = r6     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.k     // Catch:{ Exception -> 0x0398 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0398 }
            L_0x02fe:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x030e
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.i) r1     // Catch:{ Exception -> 0x0398 }
                r1.f()     // Catch:{ Exception -> 0x0398 }
                goto L_0x02fe
            L_0x030e:
                boolean r0 = r11.a     // Catch:{ Exception -> 0x0398 }
                if (r0 == 0) goto L_0x0340
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                int r0 = r0.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                int r1 = r1.d     // Catch:{ Exception -> 0x0398 }
                if (r0 >= r1) goto L_0x0340
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                r0.g = r6     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                android.os.Handler r0 = r0.i     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                int r1 = r1.b     // Catch:{ Exception -> 0x0398 }
                int r1 = r1 * 1000
                long r1 = (long) r1     // Catch:{ Exception -> 0x0398 }
                r0.postDelayed(r11, r1)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                int r0 = r0.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                int r1 = r1.e     // Catch:{ Exception -> 0x0398 }
                if (r0 >= r1) goto L_0x0340
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                int r1 = r0.b     // Catch:{ Exception -> 0x0398 }
                int r1 = r1 * 2
                r0.b = r1     // Catch:{ Exception -> 0x0398 }
            L_0x0340:
                boolean r0 = r11.a     // Catch:{ Exception -> 0x0398 }
                if (r0 == 0) goto L_0x034e
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                int r0 = r0.c     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                int r1 = r1.f     // Catch:{ Exception -> 0x0398 }
                if (r0 != r1) goto L_0x0390
            L_0x034e:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                boolean r0 = r0.h     // Catch:{ Exception -> 0x0398 }
                if (r0 != 0) goto L_0x0390
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                r0.h = r6     // Catch:{ Exception -> 0x0398 }
                java.lang.String r0 = r11.b     // Catch:{ Exception -> 0x0398 }
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0398 }
                if (r0 == 0) goto L_0x0364
                java.lang.String r0 = "noServerResponse"
                r11.b = r0     // Catch:{ Exception -> 0x0398 }
            L_0x0364:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.k     // Catch:{ Exception -> 0x0398 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0398 }
            L_0x036c:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0398 }
                if (r1 == 0) goto L_0x037e
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.i) r1     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = r11.b     // Catch:{ Exception -> 0x0398 }
                r1.a(r2)     // Catch:{ Exception -> 0x0398 }
                goto L_0x036c
            L_0x037e:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.Q.a.INIT_FAILED     // Catch:{ Exception -> 0x0398 }
                r0.a((com.ironsource.mediationsdk.Q.a) r1)     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ Exception -> 0x0398 }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x0398 }
                java.lang.String r2 = "Mediation availability false reason: No server response"
                r0.log(r1, r2, r6)     // Catch:{ Exception -> 0x0398 }
            L_0x0390:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.this     // Catch:{ Exception -> 0x0398 }
                int r1 = r0.c     // Catch:{ Exception -> 0x0398 }
                int r1 = r1 + r6
                r0.c = r1     // Catch:{ Exception -> 0x0398 }
            L_0x0397:
                return
            L_0x0398:
                r0 = move-exception
                r0.printStackTrace()
            L_0x039c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.Q.AnonymousClass1.run():void");
        }
    };
    aj a;
    int b;
    int c;
    int d;
    int e;
    int f;
    boolean g;
    boolean h = false;
    Handler i;
    CountDownTimer j;
    List<i> k = new ArrayList();
    String l;
    String m;
    l n;
    String o;
    SegmentListener p;
    boolean q;
    long r;
    e s;
    private int t = b.e;
    private final String v = "appKey";
    private final String w = getClass().getSimpleName();
    private HandlerThread x = null;
    private boolean y = false;
    private AtomicBoolean z;

    /* renamed from: com.ironsource.mediationsdk.Q$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ironsource.mediationsdk.Q$a[] r0 = com.ironsource.mediationsdk.Q.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.Q.a.INIT_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.Q.a.NOT_INIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.Q.a.INITIATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.Q.AnonymousClass3.<clinit>():void");
        }
    }

    enum a {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class b {
        public static int a = 0;
        public static int b = 1;
        public static int c = 2;
        public static int d = 3;
        public static int e = 4;
    }

    abstract class c implements Runnable {
        boolean a = true;
        String b;
        protected L.a c = new L.a() {
            public final void a(String str) {
                c.this.a = false;
                c.this.b = str;
            }
        };

        c() {
        }
    }

    private Q() {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        this.x = handlerThread;
        handlerThread.start();
        this.i = new Handler(this.x.getLooper());
        this.b = 1;
        this.c = 0;
        this.d = 62;
        this.e = 12;
        this.f = 5;
        this.z = new AtomicBoolean(true);
        this.g = false;
        this.q = false;
        this.s = new e();
    }

    public static synchronized Q a() {
        Q q2;
        synchronized (Q.class) {
            if (u == null) {
                u = new Q();
            }
            q2 = u;
        }
        return q2;
    }

    public final void a(Context context, l lVar) {
        this.s.e(lVar.a().b());
        this.s.a(lVar.a().a());
        u uVar = lVar.c.e;
        this.s.f(uVar.i().a());
        this.s.b(uVar.c().c);
        this.s.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
    }

    public final synchronized void a(Context context, String str, String str2) {
        try {
            AtomicBoolean atomicBoolean = this.z;
            if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                logger.log(ironSourceTag, this.w + ": Multiple calls to init are not allowed", 2);
                return;
            }
            a(a.INIT_IN_PROGRESS);
            this.l = str2;
            this.m = str;
            if (IronSourceUtils.isNetworkConnected(context)) {
                this.i.post(this.C);
            } else {
                this.y = true;
                if (this.A == null) {
                    this.A = new NetworkStateReceiver(context, this);
                }
                context.registerReceiver(this.A, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                com.ironsource.environment.e.c.a.c(new Runnable() {
                    public final void run() {
                        Q.this.j = new CountDownTimer(60000, 15000) {
                            public final void onFinish() {
                                if (!Q.this.h) {
                                    Q.this.h = true;
                                    for (i a2 : Q.this.k) {
                                        a2.a(IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_INTERNET);
                                    }
                                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
                                }
                            }

                            public final void onTick(long j) {
                                if (j <= 45000) {
                                    Q.this.q = true;
                                    for (i f : Q.this.k) {
                                        f.f();
                                    }
                                }
                            }
                        }.start();
                    }
                });
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("old status: " + this.B + ", new status: " + aVar + ")");
        this.B = aVar;
    }

    public final void a(i iVar) {
        if (iVar != null) {
            this.k.add(iVar);
        }
    }

    public final synchronized void a(l lVar) {
        int i2;
        int i3 = lVar != null ? lVar.e : l.a.a;
        a aVar = this.B;
        if (i3 == l.a.b) {
            i2 = b.c;
        } else {
            int i4 = AnonymousClass3.a[aVar.ordinal()];
            i2 = i4 != 1 ? i4 != 2 ? i4 != 3 ? b.a : b.b : b.e : b.d;
        }
        this.t = i2;
        this.s.a(i2);
    }

    public final void a(boolean z2) {
        if (this.y && z2) {
            CountDownTimer countDownTimer = this.j;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.y = false;
            this.g = true;
            this.i.post(this.C);
        }
    }

    public final synchronized a b() {
        return this.B;
    }

    public final void b(boolean z2) {
        Map<String, String> a2;
        if (z2 && TextUtils.isEmpty(L.a().o) && (a2 = this.n.c.e.g().a()) != null && !a2.isEmpty()) {
            for (String next : a2.keySet()) {
                if (IronSourceUtils.doesClassExist(next)) {
                    String str = a2.get(next);
                    if (!TextUtils.isEmpty(str)) {
                        next = str;
                    }
                    L.a().d(next);
                    return;
                }
            }
        }
    }

    public final synchronized boolean c() {
        return this.q;
    }
}
