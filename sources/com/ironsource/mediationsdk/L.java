package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.Q;
import com.ironsource.mediationsdk.a.c;
import com.ironsource.mediationsdk.a.d;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.g;
import com.ironsource.mediationsdk.adunit.c.h;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.f;
import com.ironsource.mediationsdk.model.p;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.i;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.l;
import com.ironsource.sdk.a.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class L implements i {
    private static boolean aq = false;
    W A;
    T B;
    g C;
    h D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    int L;
    C0038w M;
    k N;
    com.ironsource.mediationsdk.impressionData.a O;
    private final String P;
    private final String Q;
    private AbstractAdapter R;
    private AtomicBoolean S;
    private final Object T;
    private AtomicBoolean U;
    private boolean V;
    private List<IronSource.AD_UNIT> W;
    private Set<IronSource.AD_UNIT> X;
    private Set<IronSource.AD_UNIT> Y;
    private boolean Z;
    final String a;
    private final String aa;
    private boolean ab;
    private boolean ac;
    private ConcurrentHashMap<String, ISDemandOnlyBannerLayout> ad;
    private Boolean ae;
    private IronSourceBannerLayout af;
    private String ag;
    private InitializationListener ah;
    private AtomicBoolean ai;
    private boolean aj;
    private CopyOnWriteArraySet<String> ak;
    private CopyOnWriteArraySet<String> al;
    private CopyOnWriteArraySet<String> am;
    private C0040y an;
    private e ao;
    private am ap;
    af b;
    I c;
    S d;
    C0031p e;
    IronSourceLoggerManager f;
    com.ironsource.mediationsdk.sdk.i g;
    com.ironsource.mediationsdk.logger.b h;
    l i;
    public String j;
    public String k;
    String l;
    public String m;
    public Map<String, String> n;
    public String o;
    public String p;
    Context q;
    Boolean r;
    IronSourceSegment s;
    int t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    Boolean y;
    D z;

    /* renamed from: com.ironsource.mediationsdk.L$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
        static {
            /*
                int[] r0 = com.ironsource.mediationsdk.utils.k.a.a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                int r2 = com.ironsource.mediationsdk.utils.k.a.a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.mediationsdk.utils.k.a.b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                int r4 = com.ironsource.mediationsdk.utils.k.a.c     // Catch:{ NoSuchFieldError -> 0x001d }
                r3[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0024 }
                int r5 = com.ironsource.mediationsdk.utils.k.a.d     // Catch:{ NoSuchFieldError -> 0x0024 }
                r4[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x003f }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x003f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.AnonymousClass1.<clinit>():void");
        }
    }

    public interface a {
        void a(String str);
    }

    static class b {
        static volatile L a = new L((byte) 0);
    }

    private L() {
        this.a = getClass().getName();
        this.P = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:​7.2.5";
        this.Q = "Activity=";
        this.T = new Object();
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.V = false;
        this.p = null;
        this.r = null;
        this.Z = true;
        this.aa = IronSourceConstants.KEY_SESSION_DEPTH;
        this.y = null;
        this.f = IronSourceLoggerManager.getLogger(0);
        com.ironsource.mediationsdk.logger.b bVar = new com.ironsource.mediationsdk.logger.b((LogListener) null, 1);
        this.h = bVar;
        this.f.addLogger(bVar);
        this.g = new com.ironsource.mediationsdk.sdk.i();
        af afVar = new af();
        this.b = afVar;
        afVar.m = this.g;
        I i2 = new I();
        this.c = i2;
        i2.m = this.g;
        S s2 = new S();
        this.d = s2;
        s2.b = this.g;
        this.S = new AtomicBoolean();
        this.X = new HashSet();
        this.Y = new HashSet();
        this.v = false;
        this.u = false;
        this.ab = false;
        this.U = new AtomicBoolean(true);
        this.ai = new AtomicBoolean(false);
        this.t = 0;
        this.w = false;
        this.x = false;
        this.ac = false;
        this.p = UUID.randomUUID().toString();
        this.ae = Boolean.FALSE;
        this.J = false;
        this.ag = null;
        this.z = null;
        this.A = null;
        this.ah = null;
        this.B = null;
        this.E = false;
        this.F = false;
        this.H = false;
        this.K = false;
        this.ak = new CopyOnWriteArraySet<>();
        this.al = new CopyOnWriteArraySet<>();
        this.am = new CopyOnWriteArraySet<>();
        this.ad = new ConcurrentHashMap<>();
        this.M = null;
        this.an = null;
        this.N = null;
        this.e = null;
        this.L = 1;
        this.O = new com.ironsource.mediationsdk.impressionData.a();
        this.ao = new e();
        this.ap = new am();
    }

    /* synthetic */ L(byte b2) {
        this();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A() {
        /*
            r13 = this;
            boolean r0 = r13.ab
            if (r0 == 0) goto L_0x0008
            r13.B()
            return
        L_0x0008:
            java.lang.Boolean r0 = r13.ae
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.l r1 = r13.i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.h r1 = r1.c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.f r1 = r1.d     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.c r1 = r1.g     // Catch:{ all -> 0x00e5 }
            boolean r1 = r1.a     // Catch:{ all -> 0x00e5 }
            r13.K = r1     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "mIsBnProgrammatic = "
            r2.<init>(r3)     // Catch:{ all -> 0x00e5 }
            boolean r3 = r13.K     // Catch:{ all -> 0x00e5 }
            r2.append(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r1.verbose(r2)     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "mIsBnLoadBeforeInitCompleted = "
            r2.<init>(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.Boolean r3 = r13.ae     // Catch:{ all -> 0x00e5 }
            r2.append(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r1.verbose(r2)     // Catch:{ all -> 0x00e5 }
            r1 = 83000(0x14438, float:1.16308E-40)
            boolean r2 = r13.K     // Catch:{ all -> 0x00e5 }
            r3 = 1
            r4 = 0
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r2, r3)     // Catch:{ all -> 0x00e5 }
            b((int) r1, (org.json.JSONObject) r2)     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00e5 }
            r6.<init>()     // Catch:{ all -> 0x00e5 }
            r1 = r4
        L_0x0055:
            com.ironsource.mediationsdk.utils.l r2 = r13.i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.n r2 = r2.a     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList<java.lang.String> r2 = r2.e     // Catch:{ all -> 0x00e5 }
            int r2 = r2.size()     // Catch:{ all -> 0x00e5 }
            if (r1 >= r2) goto L_0x0083
            com.ironsource.mediationsdk.utils.l r2 = r13.i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.n r2 = r2.a     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList<java.lang.String> r2 = r2.e     // Catch:{ all -> 0x00e5 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00e5 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00e5 }
            if (r5 != 0) goto L_0x0080
            com.ironsource.mediationsdk.utils.l r5 = r13.i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.o r5 = r5.b     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r5.a((java.lang.String) r2)     // Catch:{ all -> 0x00e5 }
            if (r2 == 0) goto L_0x0080
            r6.add(r2)     // Catch:{ all -> 0x00e5 }
        L_0x0080:
            int r1 = r1 + 1
            goto L_0x0055
        L_0x0083:
            int r1 = r6.size()     // Catch:{ all -> 0x00e5 }
            if (r1 <= 0) goto L_0x00bc
            boolean r1 = r13.K     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x0092
            r13.a((java.util.ArrayList<com.ironsource.mediationsdk.model.NetworkSettings>) r6)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            return
        L_0x0092:
            com.ironsource.mediationsdk.utils.l r1 = r13.i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.h r1 = r1.c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.f r1 = r1.d     // Catch:{ all -> 0x00e5 }
            long r9 = r1.b     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.l r1 = r13.i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.h r1 = r1.c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.f r1 = r1.d     // Catch:{ all -> 0x00e5 }
            int r11 = r1.e     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.l r1 = r13.i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.h r1 = r1.c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.f r1 = r1.d     // Catch:{ all -> 0x00e5 }
            int r12 = r1.f     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.p r1 = new com.ironsource.mediationsdk.p     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = r13.j     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()     // Catch:{ all -> 0x00e5 }
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r11, r12)     // Catch:{ all -> 0x00e5 }
            r13.e = r1     // Catch:{ all -> 0x00e5 }
            r13.C()     // Catch:{ all -> 0x00e5 }
            goto L_0x00e3
        L_0x00bc:
            boolean r1 = r13.K     // Catch:{ all -> 0x00e5 }
            org.json.JSONObject r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r1, r3)     // Catch:{ all -> 0x00e5 }
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00e5 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00e5 }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x00e5 }
            r6 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e5 }
            r5[r3] = r6     // Catch:{ all -> 0x00e5 }
            r2[r4] = r5     // Catch:{ all -> 0x00e5 }
            a((org.json.JSONObject) r1, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x00e5 }
            r2 = 83314(0x14572, float:1.16748E-40)
            b((int) r2, (org.json.JSONObject) r1)     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00e5 }
            r13.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r1, (boolean) r4)     // Catch:{ all -> 0x00e5 }
        L_0x00e3:
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            return
        L_0x00e5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.A():void");
    }

    private void B() {
        this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.i.a.e.size(); i2++) {
            String str = this.i.a.e.get(i2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.i.b.a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.am) {
                this.N = new k(arrayList, this.i.c.d, this.j, this.k);
            }
            Iterator<String> it = this.am.iterator();
            while (it.hasNext()) {
                String next = it.next();
                this.N.a(this.ad.get(next), next);
            }
            this.ad.clear();
            this.am.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        b((int) IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
        a(IronSource.AD_UNIT.BANNER, false);
    }

    private void C() {
        if (this.ae.booleanValue()) {
            this.ae = Boolean.FALSE;
            a(this.af, this.ag);
            this.af = null;
            this.ag = null;
        }
    }

    private boolean D() {
        l lVar = this.i;
        return (lVar == null || lVar.a == null || this.i.a.a == null || this.i.a.a.size() <= 0) ? false : true;
    }

    private boolean E() {
        l lVar = this.i;
        return (lVar == null || lVar.a == null || this.i.a.d == null || this.i.a.d.size() <= 0) ? false : true;
    }

    private boolean F() {
        l lVar = this.i;
        return (lVar == null || lVar.c == null || this.i.c.d == null) ? false : true;
    }

    private boolean G() {
        if (F()) {
            l lVar = this.i;
            if ((lVar == null || lVar.a == null || this.i.a.e == null || this.i.a.e.size() <= 0) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private static boolean H() {
        return ContextProvider.getInstance().getCurrentActiveActivity() != null;
    }

    private void I() {
        if (this.ah != null && this.ai.compareAndSet(false, true)) {
            IronLog.CALLBACK.verbose("onInitializationCompleted()");
            com.ironsource.mediationsdk.a.h.d().b(new c(IronSourceConstants.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
            this.ah.onInitializationComplete();
        }
    }

    private int a(p pVar) {
        return !this.aj && !this.F && pVar.l.o ? 2 : 1;
    }

    public static L a() {
        return b.a;
    }

    private IronSourceError a(Q.a aVar) {
        if (!this.ac) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.ab) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (aVar == Q.a.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (aVar != Q.a.INIT_IN_PROGRESS || !Q.a().c()) {
            return null;
        }
        return new IronSourceError(510, "ironSource initialization in progress");
    }

    private l a(Context context, String str) {
        if (IronSourceUtils.isInitResponseCached(context)) {
            String cachedValueByKeyOfCachedInitResponse = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "appKey");
            String cachedValueByKeyOfCachedInitResponse2 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID);
            String cachedValueByKeyOfCachedInitResponse3 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "response");
            String str2 = this.j;
            if (str2 != null && cachedValueByKeyOfCachedInitResponse.equals(str2) && cachedValueByKeyOfCachedInitResponse2.equals(str)) {
                l lVar = new l(context, cachedValueByKeyOfCachedInitResponse, cachedValueByKeyOfCachedInitResponse2, cachedValueByKeyOfCachedInitResponse3);
                lVar.e = l.a.b;
                return lVar;
            }
        }
        return null;
    }

    public static String a(Context context) {
        String[] C2 = com.ironsource.environment.h.C(context);
        return (C2 == null || C2.length != 2) ? "" : C2[0];
    }

    private static String a(String str, int i2) {
        if (i2 == 0) {
            return null;
        }
        int i3 = AnonymousClass1.b[i2 - 1];
        if (i3 != 1 && i3 != 2 && i3 != 3) {
            return null;
        }
        return "placement " + str + " is capped";
    }

    static void a(int i2, JSONObject jSONObject) {
        com.ironsource.mediationsdk.a.h.d().b(new c(i2, jSONObject));
    }

    private void a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    private void a(IronSource.AD_UNIT ad_unit, boolean z2) {
        int i2 = AnonymousClass1.a[ad_unit.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (this.ab) {
                            Iterator<String> it = this.am.iterator();
                            while (it.hasNext()) {
                                C0028m.a().a(it.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.BANNER_AD_UNIT));
                            }
                            this.am.clear();
                            return;
                        }
                        synchronized (this.ae) {
                            if (this.ae.booleanValue()) {
                                this.ae = Boolean.FALSE;
                                C0030o.a().a(this.af, new IronSourceError(602, "Init had failed"), false);
                                this.af = null;
                                this.ag = null;
                            }
                        }
                    }
                } else if (z2 || k() || this.Y.contains(ad_unit)) {
                    this.g.onOfferwallAvailable(false);
                }
            } else if (this.v) {
                Iterator<String> it2 = this.ak.iterator();
                while (it2.hasNext()) {
                    E.a().a(it2.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                }
                this.ak.clear();
            } else if (this.J) {
                this.J = false;
                C0036u.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        } else if (this.u) {
            Iterator<String> it3 = this.al.iterator();
            while (it3.hasNext()) {
                ad.a().a(it3.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.al.clear();
        } else if (this.F) {
            if (this.G) {
                this.G = false;
                C0036u.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
        } else if (z2 || d() || this.Y.contains(ad_unit)) {
            ae.a().a(false, (AdInfo) null);
        }
    }

    public static void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        E.a().a = iSDemandOnlyInterstitialListener;
    }

    static void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        ad.a().a = iSDemandOnlyRewardedVideoListener;
    }

    public static void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayInterstitialListener == null) {
            ironLog.info("ISListener is null");
        } else {
            ironLog.info();
        }
        F.a().a(levelPlayInterstitialListener);
    }

    public static void a(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayRewardedVideoListener == null) {
            ironLog.info("RVListener is null");
        } else {
            ironLog.info();
        }
        ae.a().b = levelPlayRewardedVideoListener;
    }

    static void a(String str, com.ironsource.d.b bVar) {
        if (str != null) {
            try {
                if (str.length() > 64) {
                    bVar.a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
                }
            } catch (Exception unused) {
                bVar.a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
            }
        }
    }

    public static void a(String str, JSONObject jSONObject) {
        String str2 = "networkKey = " + str;
        if (jSONObject != null) {
            str2 = str2 + " networkData = " + jSONObject;
        }
        IronLog.API.verbose(str2);
        C0019d.a().a(str, jSONObject);
    }

    private void a(ArrayList<NetworkSettings> arrayList) {
        this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
        this.B = new T(arrayList, new com.ironsource.mediationsdk.c.b(this.j, IronSourceUtils.getUserIdForNetworks(), this.i.c.d), com.ironsource.d.a.a().b(), this.s);
        C();
    }

    static void a(JSONObject jSONObject, Object[][] objArr) {
        int i2 = 0;
        while (i2 <= 0) {
            try {
                Object[] objArr2 = objArr[0];
                jSONObject.put(objArr2[0].toString(), objArr2[1]);
                i2++;
            } catch (Exception e2) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e2), 3);
                return;
            }
        }
    }

    public static void a(boolean z2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setAdaptersDebug : " + z2, 1);
        C0019d.a().b(z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0115, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(boolean r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r11.length     // Catch:{ all -> 0x01d8 }
            r1 = 0
            r2 = r1
        L_0x0004:
            r3 = 1
            if (r2 >= r0) goto L_0x002c
            r4 = r11[r2]     // Catch:{ all -> 0x01d8 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x01d8 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01d8 }
            if (r5 == 0) goto L_0x0014
            r9.x = r3     // Catch:{ all -> 0x01d8 }
            goto L_0x0029
        L_0x0014:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x01d8 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01d8 }
            if (r5 == 0) goto L_0x001f
            r9.ac = r3     // Catch:{ all -> 0x01d8 }
            goto L_0x0029
        L_0x001f:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x01d8 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x01d8 }
            if (r4 == 0) goto L_0x0029
            r9.w = r3     // Catch:{ all -> 0x01d8 }
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x002c:
            com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x01d8 }
            com.ironsource.mediationsdk.Q$a r0 = r0.b()     // Catch:{ all -> 0x01d8 }
            com.ironsource.mediationsdk.Q$a r2 = com.ironsource.mediationsdk.Q.a.INIT_FAILED     // Catch:{ all -> 0x01d8 }
            if (r0 != r2) goto L_0x0057
            com.ironsource.mediationsdk.sdk.i r10 = r9.g     // Catch:{ Exception -> 0x0051 }
            if (r10 == 0) goto L_0x004f
            int r10 = r11.length     // Catch:{ Exception -> 0x0051 }
        L_0x003d:
            if (r1 >= r10) goto L_0x004f
            r0 = r11[r1]     // Catch:{ Exception -> 0x0051 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r2 = r9.X     // Catch:{ Exception -> 0x0051 }
            boolean r2 = r2.contains(r0)     // Catch:{ Exception -> 0x0051 }
            if (r2 != 0) goto L_0x004c
            r9.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r0, (boolean) r3)     // Catch:{ Exception -> 0x0051 }
        L_0x004c:
            int r1 = r1 + 1
            goto L_0x003d
        L_0x004f:
            monitor-exit(r9)
            return
        L_0x0051:
            r10 = move-exception
            r10.printStackTrace()     // Catch:{ all -> 0x01d8 }
            monitor-exit(r9)
            return
        L_0x0057:
            boolean r0 = r9.V     // Catch:{ all -> 0x01d8 }
            r2 = 14
            if (r0 != 0) goto L_0x0116
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r10)     // Catch:{ all -> 0x01d8 }
            int r0 = r11.length     // Catch:{ all -> 0x01d8 }
            r4 = r1
        L_0x0063:
            if (r1 >= r0) goto L_0x00a3
            r5 = r11[r1]     // Catch:{ all -> 0x01d8 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r6 = r9.X     // Catch:{ all -> 0x01d8 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x01d8 }
            if (r6 != 0) goto L_0x0087
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.X     // Catch:{ all -> 0x01d8 }
            r4.add(r5)     // Catch:{ all -> 0x01d8 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.Y     // Catch:{ all -> 0x01d8 }
            r4.add(r5)     // Catch:{ all -> 0x01d8 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0081 }
            r10.put(r4, r3)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x01d8 }
        L_0x0085:
            r4 = r3
            goto L_0x00a0
        L_0x0087:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r9.f     // Catch:{ all -> 0x01d8 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01d8 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d8 }
            r8.<init>()     // Catch:{ all -> 0x01d8 }
            r8.append(r5)     // Catch:{ all -> 0x01d8 }
            java.lang.String r5 = " ad unit has started initializing."
            r8.append(r5)     // Catch:{ all -> 0x01d8 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x01d8 }
            r8 = 3
            r6.log(r7, r5, r8)     // Catch:{ all -> 0x01d8 }
        L_0x00a0:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x00a3:
            if (r4 == 0) goto L_0x0114
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            r11.<init>()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = ",androidx="
            r0.<init>(r1)     // Catch:{ Exception -> 0x0104 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x0104 }
            r0.append(r1)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = ",Activity="
            r1.<init>(r4)     // Catch:{ Exception -> 0x0104 }
            boolean r4 = H()     // Catch:{ Exception -> 0x0104 }
            r1.append(r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0104 }
            boolean r4 = com.ironsource.environment.a.AnonymousClass1.d()     // Catch:{ Exception -> 0x0104 }
            if (r4 == 0) goto L_0x00e1
            java.lang.String r4 = "appLanguage=Kotlin"
            r11.append(r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = com.ironsource.environment.a.AnonymousClass1.c()     // Catch:{ Exception -> 0x0104 }
        L_0x00dd:
            r11.append(r4)     // Catch:{ Exception -> 0x0104 }
            goto L_0x00e4
        L_0x00e1:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x00dd
        L_0x00e4:
            r11.append(r0)     // Catch:{ Exception -> 0x0104 }
            boolean r0 = r9.n()     // Catch:{ Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00f0
            r11.append(r1)     // Catch:{ Exception -> 0x0104 }
        L_0x00f0:
            java.lang.String r0 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0104 }
            r10.put(r0, r11)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r11 = "sessionDepth"
            int r0 = r9.t     // Catch:{ Exception -> 0x0104 }
            int r0 = r0 + r3
            r9.t = r0     // Catch:{ Exception -> 0x0104 }
            r10.put(r11, r0)     // Catch:{ Exception -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x01d8 }
        L_0x0108:
            com.ironsource.mediationsdk.a.c r11 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x01d8 }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x01d8 }
            com.ironsource.mediationsdk.a.h r10 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x01d8 }
            r10.b((com.ironsource.mediationsdk.a.c) r11)     // Catch:{ all -> 0x01d8 }
        L_0x0114:
            monitor-exit(r9)
            return
        L_0x0116:
            com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x01d8 }
            r0.b(r10)     // Catch:{ all -> 0x01d8 }
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r0 = r9.W     // Catch:{ all -> 0x01d8 }
            if (r0 != 0) goto L_0x0123
            monitor-exit(r9)
            return
        L_0x0123:
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r10)     // Catch:{ all -> 0x01d8 }
            int r0 = r11.length     // Catch:{ all -> 0x01d8 }
            r4 = r1
            r5 = r4
        L_0x012a:
            if (r4 >= r0) goto L_0x0165
            r6 = r11[r4]     // Catch:{ all -> 0x01d8 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r7 = r9.X     // Catch:{ all -> 0x01d8 }
            boolean r7 = r7.contains(r6)     // Catch:{ all -> 0x01d8 }
            if (r7 != 0) goto L_0x015f
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.X     // Catch:{ all -> 0x01d8 }
            r5.add(r6)     // Catch:{ all -> 0x01d8 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.Y     // Catch:{ all -> 0x01d8 }
            r5.add(r6)     // Catch:{ all -> 0x01d8 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0148 }
            r10.put(r5, r3)     // Catch:{ Exception -> 0x0148 }
            goto L_0x014c
        L_0x0148:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x01d8 }
        L_0x014c:
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.W     // Catch:{ all -> 0x01d8 }
            if (r5 == 0) goto L_0x015a
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x01d8 }
            if (r5 == 0) goto L_0x015a
            r9.b((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6)     // Catch:{ all -> 0x01d8 }
            goto L_0x015d
        L_0x015a:
            r9.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6, (boolean) r1)     // Catch:{ all -> 0x01d8 }
        L_0x015d:
            r5 = r3
            goto L_0x0162
        L_0x015f:
            r9.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6)     // Catch:{ all -> 0x01d8 }
        L_0x0162:
            int r4 = r4 + 1
            goto L_0x012a
        L_0x0165:
            if (r5 == 0) goto L_0x01d6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c6 }
            r11.<init>()     // Catch:{ Exception -> 0x01c6 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = ",androidx="
            r0.<init>(r1)     // Catch:{ Exception -> 0x01c6 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x01c6 }
            r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01c6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r4 = ",Activity="
            r1.<init>(r4)     // Catch:{ Exception -> 0x01c6 }
            boolean r4 = H()     // Catch:{ Exception -> 0x01c6 }
            r1.append(r4)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01c6 }
            boolean r4 = com.ironsource.environment.a.AnonymousClass1.d()     // Catch:{ Exception -> 0x01c6 }
            if (r4 == 0) goto L_0x01a3
            java.lang.String r4 = "appLanguage=Kotlin"
            r11.append(r4)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r4 = com.ironsource.environment.a.AnonymousClass1.c()     // Catch:{ Exception -> 0x01c6 }
        L_0x019f:
            r11.append(r4)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x01a6
        L_0x01a3:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x019f
        L_0x01a6:
            r11.append(r0)     // Catch:{ Exception -> 0x01c6 }
            boolean r0 = r9.n()     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x01b2
            r11.append(r1)     // Catch:{ Exception -> 0x01c6 }
        L_0x01b2:
            java.lang.String r0 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01c6 }
            r10.put(r0, r11)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r11 = "sessionDepth"
            int r0 = r9.t     // Catch:{ Exception -> 0x01c6 }
            int r0 = r0 + r3
            r9.t = r0     // Catch:{ Exception -> 0x01c6 }
            r10.put(r11, r0)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x01ca
        L_0x01c6:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x01d8 }
        L_0x01ca:
            com.ironsource.mediationsdk.a.c r11 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x01d8 }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x01d8 }
            com.ironsource.mediationsdk.a.h r10 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x01d8 }
            r10.b((com.ironsource.mediationsdk.a.c) r11)     // Catch:{ all -> 0x01d8 }
        L_0x01d6:
            monitor-exit(r9)
            return
        L_0x01d8:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.a(boolean, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    private boolean a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        synchronized (this.am) {
            if (this.N != null) {
                return false;
            }
            if (!this.am.contains(str)) {
                this.am.add(str);
            }
            this.ad.put(str, iSDemandOnlyBannerLayout);
            return true;
        }
    }

    private static boolean a(C0017b bVar) {
        return bVar.k > 0 && bVar.l > 0;
    }

    private static boolean a(String str, int i2, int i3) {
        return str != null && str.length() >= i2 && str.length() <= i3;
    }

    private static IronSourceError b(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        if (activity == null && ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            return new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_MISSING_ACTIVITY, "Banner was initialized and loaded without Activity");
        }
        if (iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed()) {
            return new IronSourceError(510, iSDemandOnlyBannerLayout == null ? "Missing banner layout" : "Banner layout is destroyed");
        } else if (TextUtils.isEmpty(str)) {
            return new IronSourceError(510, "Missing instance Id");
        } else {
            return null;
        }
    }

    private l b(Context context, String str, a aVar) {
        l lVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String a2 = a(context);
            if (TextUtils.isEmpty(a2)) {
                a2 = com.ironsource.environment.h.x(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = a2;
            IronSourceSegment ironSourceSegment = this.s;
            String stringFromURL = HttpFunctions.getStringFromURL(ServerURL.getCPVProvidersURL(context, this.j, str, str2, this.o, this.F, ironSourceSegment != null ? ironSourceSegment.a() : null, n()), aVar);
            if (stringFromURL == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.getSerr() == 1) {
                IronLog.INTERNAL.verbose("encrypt");
                String optString = new JSONObject(stringFromURL).optString("response", (String) null);
                if (TextUtils.isEmpty(optString)) {
                    IronLog.INTERNAL.warning("encryptedResponse is empty - return null");
                    return null;
                }
                stringFromURL = IronSourceAES.decode(com.ironsource.mediationsdk.utils.g.a().b(), optString);
                if (TextUtils.isEmpty(stringFromURL)) {
                    IronLog.INTERNAL.warning("encoded response invalid - return null");
                    if (!aq) {
                        aq = true;
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                        try {
                            mediationAdditionalData.put("status", "false");
                            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        com.ironsource.mediationsdk.a.h.d().b(new c(114, mediationAdditionalData));
                    }
                    return null;
                }
            }
            l lVar2 = new l(context, this.j, str, stringFromURL);
            try {
                lVar2.e = l.a.c;
                if (lVar2.b()) {
                    return lVar2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e3) {
                e = e3;
                lVar = lVar2;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.warning("exception = " + e);
                e.printStackTrace();
                return lVar;
            }
        } catch (Exception e4) {
            e = e4;
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.warning("exception = " + e);
            e.printStackTrace();
            return lVar;
        }
    }

    private static void b(int i2, JSONObject jSONObject) {
        d.d().b(new c(i2, jSONObject));
    }

    private void b(IronSource.AD_UNIT ad_unit) {
        int i2 = AnonymousClass1.a[ad_unit.ordinal()];
        if (i2 == 1) {
            r();
        } else if (i2 == 2) {
            z();
        } else if (i2 == 3) {
            this.d.a(this.j, this.k);
        } else if (i2 == 4) {
            A();
        }
    }

    private boolean b(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        if (Q.a().b() != Q.a.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.am) {
            if (!this.am.contains(str)) {
                this.am.add(str);
            }
            this.ad.put(str, iSDemandOnlyBannerLayout);
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [com.ironsource.mediationsdk.D] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.ironsource.mediationsdk.Z] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.ironsource.mediationsdk.M] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o() {
        /*
            r11 = this;
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r11.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r2 = "Rewarded Video started in programmatic mode"
            r3 = 0
            r0.log(r1, r2, r3)
            java.util.List r5 = r11.t()
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x007a
            com.ironsource.mediationsdk.utils.l r0 = r11.i
            com.ironsource.mediationsdk.model.h r0 = r0.c
            com.ironsource.mediationsdk.model.p r0 = r0.a
            com.ironsource.mediationsdk.utils.c r0 = r0.l
            boolean r0 = r0.o
            if (r0 == 0) goto L_0x003d
            com.ironsource.mediationsdk.M r0 = new com.ironsource.mediationsdk.M
            com.ironsource.mediationsdk.utils.l r1 = r11.i
            com.ironsource.mediationsdk.model.h r1 = r1.c
            com.ironsource.mediationsdk.model.p r6 = r1.a
            java.lang.String r7 = r11.j
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()
            com.ironsource.d.a r1 = com.ironsource.d.a.a()
            java.util.HashSet r9 = r1.b()
            com.ironsource.mediationsdk.IronSourceSegment r10 = r11.s
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0059
        L_0x003d:
            com.ironsource.mediationsdk.Z r0 = new com.ironsource.mediationsdk.Z
            com.ironsource.mediationsdk.utils.l r1 = r11.i
            com.ironsource.mediationsdk.model.h r1 = r1.c
            com.ironsource.mediationsdk.model.p r6 = r1.a
            java.lang.String r7 = r11.j
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()
            com.ironsource.d.a r1 = com.ironsource.d.a.a()
            java.util.HashSet r9 = r1.b()
            com.ironsource.mediationsdk.IronSourceSegment r10 = r11.s
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L_0x0059:
            r11.z = r0
            java.lang.Boolean r0 = r11.r
            if (r0 == 0) goto L_0x00a2
            com.ironsource.mediationsdk.D r1 = r11.z
            android.content.Context r2 = r11.q
            boolean r0 = r0.booleanValue()
            r1.a(r2, r0)
            java.lang.Boolean r0 = r11.r
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00a2
            com.ironsource.mediationsdk.af r0 = r11.b
            android.content.Context r1 = r11.q
            r0.a((android.content.Context) r1, (boolean) r3)
            return
        L_0x007a:
            int r0 = r11.L
            r1 = 1
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r1, r0)
            java.lang.Object[][] r2 = new java.lang.Object[r1][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            r2[r3] = r4
            a((org.json.JSONObject) r0, (java.lang.Object[][]) r2)
            r1 = 81314(0x13da2, float:1.13945E-40)
            a((int) r1, (org.json.JSONObject) r0)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            r11.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r0, (boolean) r3)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.o():void");
    }

    private Placement p(String str) {
        p pVar = this.i.c.a;
        if (pVar != null) {
            Iterator<Placement> it = pVar.a.iterator();
            while (it.hasNext()) {
                Placement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    private void p() {
        this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.i.a.a.size(); i2++) {
            String str = this.i.a.a.get(i2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.i.b.a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.al) {
                this.an = new C0040y(arrayList, this.i.c.a, this.j, this.k);
            }
            if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
                return;
            }
            Iterator<String> it = this.al.iterator();
            while (it.hasNext()) {
                this.an.a(it.next(), (String) null, false);
            }
            this.al.clear();
            return;
        }
        a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    private void q() {
        NetworkSettings a2;
        NetworkSettings a3;
        NetworkSettings a4;
        p pVar = this.i.c.a;
        int i2 = pVar.e;
        for (int i3 = 0; i3 < this.i.a.a.size(); i3++) {
            String str = this.i.a.a.get(i3);
            if (!TextUtils.isEmpty(str) && (a4 = this.i.b.a(str)) != null) {
                ag agVar = new ag(a4, i2);
                if (a((C0017b) agVar)) {
                    agVar.s = this.b;
                    agVar.n = i3 + 1;
                    this.b.a(agVar);
                }
            }
        }
        if (this.b.c.size() > 0) {
            this.b.n = pVar.b.a;
            this.b.b = pVar.c;
            this.b.o = pVar.h;
            String c2 = this.i.c();
            if (!TextUtils.isEmpty(c2) && (a3 = this.i.b.a(c2)) != null) {
                ag agVar2 = new ag(a3, i2);
                if (a((C0017b) agVar2)) {
                    agVar2.s = this.b;
                    af afVar = this.b;
                    afVar.h.log(IronSourceLogger.IronSourceTag.INTERNAL, agVar2.d + " is set as backfill", 0);
                    afVar.d = agVar2;
                }
            }
            String d2 = this.i.d();
            if (!TextUtils.isEmpty(d2) && (a2 = this.i.b.a(d2)) != null) {
                ag agVar3 = new ag(a2, i2);
                if (a((C0017b) agVar3)) {
                    agVar3.s = this.b;
                    af afVar2 = this.b;
                    afVar2.h.log(IronSourceLogger.IronSourceTag.INTERNAL, agVar3.d + " is set as premium", 0);
                    afVar2.e = agVar3;
                }
            }
            af afVar3 = this.b;
            afVar3.p = new B(pVar.i, afVar3);
            this.b.a(this.j, IronSourceUtils.getUserIdForNetworks());
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, this.L);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
        a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 3
            r1 = 0
            com.ironsource.mediationsdk.model.Placement r7 = r6.p(r7)     // Catch:{ Exception -> 0x0029 }
            if (r7 != 0) goto L_0x000f
            com.ironsource.mediationsdk.model.Placement r7 = r6.b()     // Catch:{ Exception -> 0x000d }
            goto L_0x000f
        L_0x000d:
            r2 = move-exception
            goto L_0x002b
        L_0x000f:
            if (r7 != 0) goto L_0x0034
            java.lang.String r2 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f     // Catch:{ Exception -> 0x000d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ Exception -> 0x000d }
            r3.log(r4, r2, r0)     // Catch:{ Exception -> 0x000d }
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x000d }
            r4 = 1021(0x3fd, float:1.431E-42)
            r3.<init>(r4, r2)     // Catch:{ Exception -> 0x000d }
            com.ironsource.mediationsdk.ae r2 = com.ironsource.mediationsdk.ae.a()     // Catch:{ Exception -> 0x000d }
            r2.a((com.ironsource.mediationsdk.logger.IronSourceError) r3, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)     // Catch:{ Exception -> 0x000d }
            return
        L_0x0029:
            r2 = move-exception
            r7 = r1
        L_0x002b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r5 = "showProgrammaticRewardedVideo()"
            r3.logException(r4, r5, r2)
        L_0x0034:
            com.ironsource.mediationsdk.adunit.c.h r2 = r6.D
            if (r2 == 0) goto L_0x0044
            boolean r3 = r6.F
            if (r3 != 0) goto L_0x0040
            boolean r3 = r6.aj
            if (r3 == 0) goto L_0x0044
        L_0x0040:
            r2.a((com.ironsource.mediationsdk.model.Placement) r7)
            return
        L_0x0044:
            com.ironsource.mediationsdk.D r2 = r6.z
            if (r2 == 0) goto L_0x004c
            r2.a(r7)
            return
        L_0x004c:
            java.lang.String r7 = "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r2.log(r3, r7, r0)
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 1023(0x3ff, float:1.434E-42)
            r0.<init>(r2, r7)
            com.ironsource.mediationsdk.ae r7 = com.ironsource.mediationsdk.ae.a()
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.q(java.lang.String):void");
    }

    private Placement r(String str) {
        Placement p2 = p(str);
        if (p2 == null) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            p2 = b();
            if (p2 == null) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a2 = a(p2.getPlacementName(), k.b(ContextProvider.getInstance().getApplicationContext(), p2));
        if (TextUtils.isEmpty(a2)) {
            return p2;
        }
        this.f.log(IronSourceLogger.IronSourceTag.API, a2, 1);
        ae.a().a(ErrorBuilder.buildCappedPerPlacementError(a2), (AdInfo) null);
        return null;
    }

    private void r() {
        if (this.u) {
            p();
            return;
        }
        p pVar = this.i.c.a;
        this.E = pVar.l.a || this.F;
        this.aj = pVar.l.b;
        int a2 = a(pVar);
        this.L = a2;
        a((int) IronSourceConstants.TROUBLESHOOTING_RV_FORK, IronSourceUtils.getMediationAdditionalData(false, this.E, a2));
        if (this.F || this.aj) {
            s();
        } else if (this.E) {
            o();
        } else {
            q();
        }
    }

    private InterstitialPlacement s(String str) {
        com.ironsource.mediationsdk.model.i iVar = this.i.c.b;
        if (iVar != null) {
            Iterator<InterstitialPlacement> it = iVar.a.iterator();
            while (it.hasNext()) {
                InterstitialPlacement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    private void s() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> t2 = t();
        if (t2.size() > 0) {
            h hVar = new h(t2, this.i.c.a, IronSourceUtils.getUserIdForNetworks(), this.F, com.ironsource.d.a.a().b(), this.s);
            this.D = hVar;
            Boolean bool = this.r;
            if (bool != null) {
                hVar.b(bool.booleanValue());
            }
            if (this.G && this.F) {
                this.G = false;
                this.D.d();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.L);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
        a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    private List<NetworkSettings> t() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.i.a.a.size(); i2++) {
            String str = this.i.a.a.get(i2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.i.b.a(str));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            com.ironsource.mediationsdk.model.InterstitialPlacement r7 = r6.s(r7)     // Catch:{ Exception -> 0x0029 }
            if (r7 != 0) goto L_0x000e
            com.ironsource.mediationsdk.model.InterstitialPlacement r7 = r6.g()     // Catch:{ Exception -> 0x000c }
            goto L_0x000e
        L_0x000c:
            r0 = move-exception
            goto L_0x002d
        L_0x000e:
            if (r7 != 0) goto L_0x0036
            java.lang.String r1 = "showProgrammaticInterstitial error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f     // Catch:{ Exception -> 0x000c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ Exception -> 0x000c }
            r4 = 3
            r2.log(r3, r1, r4)     // Catch:{ Exception -> 0x000c }
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x000c }
            r3 = 1020(0x3fc, float:1.43E-42)
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x000c }
            com.ironsource.mediationsdk.F r1 = com.ironsource.mediationsdk.F.a()     // Catch:{ Exception -> 0x000c }
            r1.a((com.ironsource.mediationsdk.logger.IronSourceError) r2, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r0)     // Catch:{ Exception -> 0x000c }
            return
        L_0x0029:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x002d:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r6.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "showProgrammaticInterstitial()"
            r1.logException(r2, r3, r0)
        L_0x0036:
            boolean r0 = r6.I
            if (r0 == 0) goto L_0x0045
            com.ironsource.mediationsdk.adunit.c.g r0 = r6.C
            com.ironsource.mediationsdk.model.Placement r1 = new com.ironsource.mediationsdk.model.Placement
            r1.<init>(r7)
            r0.a((com.ironsource.mediationsdk.model.Placement) r1)
            return
        L_0x0045:
            com.ironsource.mediationsdk.W r0 = r6.A
            java.lang.String r7 = r7.getPlacementName()
            r0.a((java.lang.String) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.t(java.lang.String):void");
    }

    private InterstitialPlacement u(String str) {
        InterstitialPlacement s2 = s(str);
        if (s2 == null) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            s2 = g();
            if (s2 == null) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a2 = a(s2.getPlacementName(), w(s2.getPlacementName()));
        if (TextUtils.isEmpty(a2)) {
            return s2;
        }
        this.f.log(IronSourceLogger.IronSourceTag.API, a2, 1);
        this.g.e = s2;
        F.a().a(ErrorBuilder.buildCappedPerPlacementError(a2), (AdInfo) null);
        return null;
    }

    private List<NetworkSettings> u() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.i.a.d.size(); i2++) {
            String str = this.i.a.d.get(i2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.i.b.a(str));
            }
        }
        return arrayList;
    }

    private void v() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> u2 = u();
        if (u2.size() > 0) {
            g gVar = new g(u2, this.i.c.b, IronSourceUtils.getUserIdForNetworks(), com.ironsource.d.a.a().b(), this.s);
            this.C = gVar;
            Boolean bool = this.r;
            if (bool != null) {
                gVar.b(bool.booleanValue());
            }
            if (this.J) {
                this.J = false;
                this.C.d();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        b((int) IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    private static boolean v(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private int w(String str) {
        l lVar = this.i;
        if (lVar == null || lVar.c == null || this.i.c.b == null) {
            return k.a.d;
        }
        InterstitialPlacement interstitialPlacement = null;
        try {
            interstitialPlacement = s(str);
            if (interstitialPlacement == null && (interstitialPlacement = g()) == null) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return interstitialPlacement == null ? k.a.d : k.b(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement);
    }

    private void w() {
        this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Adunit: Interstitial is now initiated - programmatic mode", 0);
        List<NetworkSettings> u2 = u();
        if (u2.size() > 0) {
            W w2 = new W(u2, this.i.c.b, this.j, IronSourceUtils.getUserIdForNetworks(), this.i.c.b.f, com.ironsource.d.a.a().b(), this.s);
            this.A = w2;
            Boolean bool = this.r;
            if (bool != null) {
                w2.a(bool.booleanValue());
                if (this.r.booleanValue()) {
                    this.c.a(this.q, false);
                }
            }
            if (this.J) {
                this.J = false;
                this.A.e();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        b((int) IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    private com.ironsource.mediationsdk.model.g x(String str) {
        f fVar = this.i.c.d;
        if (fVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return fVar.a();
        }
        com.ironsource.mediationsdk.model.g a2 = fVar.a(str);
        return a2 != null ? a2 : fVar.a();
    }

    private void x() {
        NetworkSettings a2;
        com.ironsource.mediationsdk.model.i iVar = this.i.c.b;
        int i2 = iVar.e;
        this.c.n.a(IronSource.AD_UNIT.INTERSTITIAL, iVar.f);
        for (int i3 = 0; i3 < this.i.a.d.size(); i3++) {
            String str = this.i.a.d.get(i3);
            if (!TextUtils.isEmpty(str) && (a2 = this.i.b.a(str)) != null) {
                J j2 = new J(a2, i2);
                if (a((C0017b) j2)) {
                    j2.s = this.c;
                    j2.n = i3 + 1;
                    this.c.a(j2);
                }
            }
        }
        if (this.c.c.size() > 0) {
            this.c.b = iVar.c;
            this.c.a(this.j, IronSourceUtils.getUserIdForNetworks());
            if (this.J) {
                this.J = false;
                this.c.c();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        b((int) IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    private void y() {
        this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.i.a.d.size(); i2++) {
            String str = this.i.a.d.get(i2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.i.b.a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.ak) {
                this.M = new C0038w(arrayList, this.i.c.b, this.j, this.k);
            }
            Iterator<String> it = this.ak.iterator();
            while (it.hasNext()) {
                this.M.a(it.next(), (String) null, false);
            }
            this.ak.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        b((int) IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    private void z() {
        if (this.v) {
            y();
            return;
        }
        com.ironsource.mediationsdk.model.i iVar = this.i.c.b;
        this.H = iVar.i.a;
        this.I = iVar.i.b;
        b((int) IronSourceConstants.TROUBLESHOOTING_IS_FORK, IronSourceUtils.getMediationAdditionalData(false, this.H, 1));
        if (!this.H) {
            x();
        } else if (this.I) {
            v();
        } else {
            w();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x02e7, code lost:
        return r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x02b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.utils.l a(android.content.Context r11, java.lang.String r12, com.ironsource.mediationsdk.L.a r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.T
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.l r1 = r10.i     // Catch:{ all -> 0x02e8 }
            if (r1 == 0) goto L_0x000e
            com.ironsource.mediationsdk.utils.l r11 = new com.ironsource.mediationsdk.utils.l     // Catch:{ all -> 0x02e8 }
            r11.<init>(r1)     // Catch:{ all -> 0x02e8 }
            monitor-exit(r0)     // Catch:{ all -> 0x02e8 }
            return r11
        L_0x000e:
            com.ironsource.mediationsdk.utils.l r13 = r10.b((android.content.Context) r11, (java.lang.String) r12, (com.ironsource.mediationsdk.L.a) r13)     // Catch:{ all -> 0x02e8 }
            r1 = 1
            r2 = 0
            if (r13 == 0) goto L_0x001c
            boolean r3 = r13.b()     // Catch:{ all -> 0x02e8 }
            if (r3 != 0) goto L_0x0068
        L_0x001c:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r13 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x02e8 }
            java.lang.String r4 = "Null or invalid response. Trying to get cached response"
            r13.log(r3, r4, r2)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.utils.l r13 = r10.a((android.content.Context) r11, (java.lang.String) r12)     // Catch:{ all -> 0x02e8 }
            if (r13 == 0) goto L_0x0068
            java.lang.String r3 = r10.j     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildUsingCachedConfigurationError(r3, r12)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r10.f     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x02e8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e8 }
            r5.<init>()     // Catch:{ all -> 0x02e8 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x02e8 }
            r5.append(r12)     // Catch:{ all -> 0x02e8 }
            java.lang.String r12 = ": "
            r5.append(r12)     // Catch:{ all -> 0x02e8 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x02e8 }
            r5.append(r12)     // Catch:{ all -> 0x02e8 }
            java.lang.String r12 = r5.toString()     // Catch:{ all -> 0x02e8 }
            r3.log(r4, r12, r1)     // Catch:{ all -> 0x02e8 }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.c r3 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x02e8 }
            r4 = 140(0x8c, float:1.96E-43)
            r3.<init>(r4, r12)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r12 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            r12.b((com.ironsource.mediationsdk.a.c) r3)     // Catch:{ all -> 0x02e8 }
        L_0x0068:
            if (r13 == 0) goto L_0x02e6
            r10.i = r13     // Catch:{ all -> 0x02e8 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveLastResponse(r11, r12)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.utils.l r12 = r10.i     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.logger.b r3 = r10.h     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.h r4 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.sdk.controller.u r4 = r4.e     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.e r4 = r4.a()     // Catch:{ all -> 0x02e8 }
            int r4 = r4.a     // Catch:{ all -> 0x02e8 }
            r3.setDebugLevel(r4)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r10.f     // Catch:{ all -> 0x02e8 }
            java.lang.String r4 = "console"
            com.ironsource.mediationsdk.model.h r5 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.sdk.controller.u r5 = r5.e     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.e r5 = r5.a()     // Catch:{ all -> 0x02e8 }
            int r5 = r5.b     // Catch:{ all -> 0x02e8 }
            r3.setLoggerDebugLevel(r4, r5)     // Catch:{ all -> 0x02e8 }
            boolean r3 = r10.d()     // Catch:{ all -> 0x02e8 }
            if (r3 == 0) goto L_0x00a4
            com.ironsource.mediationsdk.model.h r3 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.p r3 = r3.a     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.c r3 = r3.b     // Catch:{ all -> 0x02e8 }
            boolean r3 = r3.b     // Catch:{ all -> 0x02e8 }
            goto L_0x00a5
        L_0x00a4:
            r3 = r2
        L_0x00a5:
            boolean r4 = r10.i()     // Catch:{ all -> 0x02e8 }
            if (r4 == 0) goto L_0x00b4
            com.ironsource.mediationsdk.model.h r4 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.i r4 = r4.b     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.c r4 = r4.b     // Catch:{ all -> 0x02e8 }
            boolean r4 = r4.b     // Catch:{ all -> 0x02e8 }
            goto L_0x00b5
        L_0x00b4:
            r4 = r2
        L_0x00b5:
            boolean r5 = r10.F()     // Catch:{ all -> 0x02e8 }
            if (r5 == 0) goto L_0x00c4
            com.ironsource.mediationsdk.model.h r5 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.f r5 = r5.d     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.c r5 = r5.a     // Catch:{ all -> 0x02e8 }
            boolean r5 = r5.b     // Catch:{ all -> 0x02e8 }
            goto L_0x00c5
        L_0x00c4:
            r5 = r2
        L_0x00c5:
            boolean r6 = r10.k()     // Catch:{ all -> 0x02e8 }
            if (r6 == 0) goto L_0x00d4
            com.ironsource.mediationsdk.model.h r6 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.j r6 = r6.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.c r6 = r6.c     // Catch:{ all -> 0x02e8 }
            boolean r6 = r6.b     // Catch:{ all -> 0x02e8 }
            goto L_0x00d5
        L_0x00d4:
            r6 = r2
        L_0x00d5:
            com.ironsource.mediationsdk.model.h r7 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.sdk.controller.u r7 = r7.e     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.utils.j r7 = r7.h()     // Catch:{ all -> 0x02e8 }
            boolean r8 = r7.a()     // Catch:{ all -> 0x02e8 }
            if (r3 == 0) goto L_0x0152
            com.ironsource.mediationsdk.model.h r3 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.p r3 = r3.a     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.c r3 = r3.b     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            java.lang.String r9 = r3.e     // Catch:{ all -> 0x02e8 }
            r6.b((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            java.lang.String r9 = r3.d     // Catch:{ all -> 0x02e8 }
            r6.a((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int r9 = r3.g     // Catch:{ all -> 0x02e8 }
            r6.b((int) r9)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int r9 = r3.h     // Catch:{ all -> 0x02e8 }
            r6.c((int) r9)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int r9 = r3.f     // Catch:{ all -> 0x02e8 }
            r6.a((int) r9)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int[] r9 = r3.i     // Catch:{ all -> 0x02e8 }
            r6.a((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int[] r9 = r3.j     // Catch:{ all -> 0x02e8 }
            r6.b((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int[] r9 = r3.k     // Catch:{ all -> 0x02e8 }
            r6.c(r9, r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int[] r9 = r3.l     // Catch:{ all -> 0x02e8 }
            r6.d(r9, r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.h r9 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.sdk.controller.u r9 = r9.e     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.q r9 = r9.b()     // Catch:{ all -> 0x02e8 }
            r6.a((com.ironsource.mediationsdk.model.q) r9)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            boolean r3 = r3.c     // Catch:{ all -> 0x02e8 }
        L_0x014f:
            r6.c = r3     // Catch:{ all -> 0x02e8 }
            goto L_0x01c7
        L_0x0152:
            if (r6 == 0) goto L_0x01c1
            com.ironsource.mediationsdk.model.h r3 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.j r3 = r3.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.c r3 = r3.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            java.lang.String r9 = r3.e     // Catch:{ all -> 0x02e8 }
            r6.b((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            java.lang.String r9 = r3.d     // Catch:{ all -> 0x02e8 }
            r6.a((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int r9 = r3.g     // Catch:{ all -> 0x02e8 }
            r6.b((int) r9)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int r9 = r3.h     // Catch:{ all -> 0x02e8 }
            r6.c((int) r9)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int r9 = r3.f     // Catch:{ all -> 0x02e8 }
            r6.a((int) r9)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int[] r9 = r3.i     // Catch:{ all -> 0x02e8 }
            r6.a((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int[] r9 = r3.j     // Catch:{ all -> 0x02e8 }
            r6.b((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int[] r9 = r3.k     // Catch:{ all -> 0x02e8 }
            r6.c(r9, r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            int[] r9 = r3.l     // Catch:{ all -> 0x02e8 }
            r6.d(r9, r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.h r9 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.sdk.controller.u r9 = r9.e     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.q r9 = r9.b()     // Catch:{ all -> 0x02e8 }
            r6.a((com.ironsource.mediationsdk.model.q) r9)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            boolean r3 = r3.c     // Catch:{ all -> 0x02e8 }
            goto L_0x014f
        L_0x01c1:
            com.ironsource.mediationsdk.a.h r3 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            r3.f = r2     // Catch:{ all -> 0x02e8 }
        L_0x01c7:
            if (r4 == 0) goto L_0x0238
            com.ironsource.mediationsdk.model.h r2 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.i r2 = r2.b     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.c r2 = r2.b     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            java.lang.String r4 = r2.e     // Catch:{ all -> 0x02e8 }
            r3.b((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            java.lang.String r4 = r2.d     // Catch:{ all -> 0x02e8 }
            r3.a((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int r4 = r2.g     // Catch:{ all -> 0x02e8 }
            r3.b((int) r4)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int r4 = r2.h     // Catch:{ all -> 0x02e8 }
            r3.c((int) r4)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int r4 = r2.f     // Catch:{ all -> 0x02e8 }
            r3.a((int) r4)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int[] r4 = r2.i     // Catch:{ all -> 0x02e8 }
            r3.a((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int[] r4 = r2.j     // Catch:{ all -> 0x02e8 }
            r3.b((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int[] r4 = r2.k     // Catch:{ all -> 0x02e8 }
            r3.c(r4, r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int[] r4 = r2.l     // Catch:{ all -> 0x02e8 }
            r3.d(r4, r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.h r12 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.sdk.controller.u r12 = r12.e     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.q r12 = r12.b()     // Catch:{ all -> 0x02e8 }
            r3.a((com.ironsource.mediationsdk.model.q) r12)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            boolean r2 = r2.c     // Catch:{ all -> 0x02e8 }
        L_0x0235:
            r12.c = r2     // Catch:{ all -> 0x02e8 }
            goto L_0x02ad
        L_0x0238:
            if (r5 == 0) goto L_0x02a7
            com.ironsource.mediationsdk.model.h r2 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.f r2 = r2.d     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.c r2 = r2.a     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            java.lang.String r4 = r2.e     // Catch:{ all -> 0x02e8 }
            r3.b((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            java.lang.String r4 = r2.d     // Catch:{ all -> 0x02e8 }
            r3.a((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int r4 = r2.g     // Catch:{ all -> 0x02e8 }
            r3.b((int) r4)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int r4 = r2.h     // Catch:{ all -> 0x02e8 }
            r3.c((int) r4)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int r4 = r2.f     // Catch:{ all -> 0x02e8 }
            r3.a((int) r4)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int[] r4 = r2.i     // Catch:{ all -> 0x02e8 }
            r3.a((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int[] r4 = r2.j     // Catch:{ all -> 0x02e8 }
            r3.b((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int[] r4 = r2.k     // Catch:{ all -> 0x02e8 }
            r3.c(r4, r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            int[] r4 = r2.l     // Catch:{ all -> 0x02e8 }
            r3.d(r4, r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.h r12 = r12.c     // Catch:{ all -> 0x02e8 }
            com.ironsource.sdk.controller.u r12 = r12.e     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.model.q r12 = r12.b()     // Catch:{ all -> 0x02e8 }
            r3.a((com.ironsource.mediationsdk.model.q) r12)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            boolean r2 = r2.c     // Catch:{ all -> 0x02e8 }
            goto L_0x0235
        L_0x02a7:
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            r12.f = r2     // Catch:{ all -> 0x02e8 }
        L_0x02ad:
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.a.g.w     // Catch:{ all -> 0x02e8 }
            r12.f = r8     // Catch:{ all -> 0x02e8 }
            if (r8 == 0) goto L_0x02d6
            java.lang.String r12 = r7.b()     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.g r2 = com.ironsource.mediationsdk.a.g.w     // Catch:{ all -> 0x02e8 }
            r2.a((java.lang.String) r12, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.a.g.w     // Catch:{ all -> 0x02e8 }
            int[] r2 = r7.d()     // Catch:{ all -> 0x02e8 }
            r12.a((int[]) r2, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.a.g.w     // Catch:{ all -> 0x02e8 }
            int[] r2 = r7.e()     // Catch:{ all -> 0x02e8 }
            r12.b((int[]) r2, (android.content.Context) r11)     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.g r11 = com.ironsource.mediationsdk.a.g.w     // Catch:{ all -> 0x02e8 }
            boolean r12 = r7.c()     // Catch:{ all -> 0x02e8 }
            r11.c = r12     // Catch:{ all -> 0x02e8 }
        L_0x02d6:
            com.ironsource.mediationsdk.a.d r11 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02e8 }
            r11.a = r1     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.h r11 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02e8 }
            r11.a = r1     // Catch:{ all -> 0x02e8 }
            com.ironsource.mediationsdk.a.g r11 = com.ironsource.mediationsdk.a.g.w     // Catch:{ all -> 0x02e8 }
            r11.a = r1     // Catch:{ all -> 0x02e8 }
        L_0x02e6:
            monitor-exit(r0)     // Catch:{ all -> 0x02e8 }
            return r13
        L_0x02e8:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02e8 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.L$a):com.ironsource.mediationsdk.utils.l");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.app.Activity r5, com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r6, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.logger.IronSourceError r0 = b((android.app.Activity) r5, (com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0072 }
            r1 = 3
            if (r0 == 0) goto L_0x001a
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r4.f     // Catch:{ all -> 0x0072 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = r0.getErrorMessage()     // Catch:{ all -> 0x0072 }
            r5.log(r2, r3, r1)     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x0018
            r6.sendBannerAdLoadFailed(r7, r0)     // Catch:{ all -> 0x0072 }
        L_0x0018:
            monitor-exit(r4)
            return
        L_0x001a:
            com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x0072 }
            com.ironsource.mediationsdk.Q$a r0 = r0.b()     // Catch:{ all -> 0x0072 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = r4.a((com.ironsource.mediationsdk.Q.a) r0)     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0038
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r4.f     // Catch:{ all -> 0x0072 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = r0.getErrorMessage()     // Catch:{ all -> 0x0072 }
            r5.log(r2, r3, r1)     // Catch:{ all -> 0x0072 }
            r6.sendBannerAdLoadFailed(r7, r0)     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)
            return
        L_0x0038:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0072 }
            r0.updateActivity(r5)     // Catch:{ all -> 0x0072 }
            boolean r5 = r4.b((com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x0047
            monitor-exit(r4)
            return
        L_0x0047:
            boolean r5 = r4.G()     // Catch:{ all -> 0x0072 }
            if (r5 != 0) goto L_0x0063
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r4.f     // Catch:{ all -> 0x0072 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "No banner configurations found"
            r5.log(r0, r2, r1)     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = "the server response does not contain banner data"
            java.lang.String r0 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r5 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r5, r0)     // Catch:{ all -> 0x0072 }
            r6.sendBannerAdLoadFailed(r7, r5)     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)
            return
        L_0x0063:
            boolean r5 = r4.a((com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x006b
            monitor-exit(r4)
            return
        L_0x006b:
            com.ironsource.mediationsdk.utils.k r5 = r4.N     // Catch:{ all -> 0x0072 }
            r5.a((com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)
            return
        L_0x0072:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.a(android.app.Activity, com.ironsource.mediationsdk.ISDemandOnlyBannerLayout, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.app.Activity r4, com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.logger.IronSourceError r0 = b((android.app.Activity) r4, (com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0013
            if (r7 != 0) goto L_0x0013
            java.lang.String r0 = "Missing adm"
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0080 }
            r2 = 510(0x1fe, float:7.15E-43)
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0080 }
            r0 = r1
        L_0x0013:
            r1 = 3
            if (r0 == 0) goto L_0x0028
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r3.f     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r0.getErrorMessage()     // Catch:{ all -> 0x0080 }
            r4.log(r7, r2, r1)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0026
            r5.sendBannerAdLoadFailed(r6, r0)     // Catch:{ all -> 0x0080 }
        L_0x0026:
            monitor-exit(r3)
            return
        L_0x0028:
            com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.Q$a r0 = r0.b()     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = r3.a((com.ironsource.mediationsdk.Q.a) r0)     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0046
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r3.f     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r0.getErrorMessage()     // Catch:{ all -> 0x0080 }
            r4.log(r7, r2, r1)     // Catch:{ all -> 0x0080 }
            r5.sendBannerAdLoadFailed(r6, r0)     // Catch:{ all -> 0x0080 }
            monitor-exit(r3)
            return
        L_0x0046:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0080 }
            r0.updateActivity(r4)     // Catch:{ all -> 0x0080 }
            boolean r4 = r3.b((com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x0055
            monitor-exit(r3)
            return
        L_0x0055:
            boolean r4 = r3.G()     // Catch:{ all -> 0x0080 }
            if (r4 != 0) goto L_0x0071
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r3.f     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "No banner configurations found"
            r4.log(r7, r0, r1)     // Catch:{ all -> 0x0080 }
            java.lang.String r4 = "the server response does not contain banner data"
            java.lang.String r7 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r4 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r4, r7)     // Catch:{ all -> 0x0080 }
            r5.sendBannerAdLoadFailed(r6, r4)     // Catch:{ all -> 0x0080 }
            monitor-exit(r3)
            return
        L_0x0071:
            boolean r4 = r3.a((com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x0079
            monitor-exit(r3)
            return
        L_0x0079:
            com.ironsource.mediationsdk.utils.k r4 = r3.N     // Catch:{ all -> 0x0080 }
            r4.a((com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r5, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0080 }
            monitor-exit(r3)
            return
        L_0x0080:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.a(android.app.Activity, com.ironsource.mediationsdk.ISDemandOnlyBannerLayout, java.lang.String, java.lang.String):void");
    }

    public final synchronized void a(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            ad.a().a(str, new IronSourceError(510, "adm cannot be null"));
            return;
        }
        b(activity, str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r8, java.lang.String r9, com.ironsource.mediationsdk.sdk.InitializationListener r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00f5 }
            r10.<init>()     // Catch:{ all -> 0x00f5 }
            r0 = 1
            if (r11 == 0) goto L_0x008a
            int r1 = r11.length     // Catch:{ all -> 0x00f5 }
            if (r1 != 0) goto L_0x000e
            goto L_0x008a
        L_0x000e:
            int r1 = r11.length     // Catch:{ all -> 0x00f5 }
            r2 = 0
        L_0x0010:
            if (r2 >= r1) goto L_0x00bd
            r3 = r11[r2]     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0036
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r7.f     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r6.<init>()     // Catch:{ all -> 0x00f5 }
            r6.append(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = " ad unit cannot be initialized in demand only mode"
            r6.append(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x00f5 }
            r6 = 3
            r4.log(r5, r3, r6)     // Catch:{ all -> 0x00f5 }
            goto L_0x0087
        L_0x0036:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0051
            boolean r4 = r7.x     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0046
            r7.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0051
        L_0x0046:
            r7.v = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x0051
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0051:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x006c
            boolean r4 = r7.w     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0061
            r7.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x006c
        L_0x0061:
            r7.u = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x006c
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x006c:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0087
            boolean r4 = r7.ac     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x007c
            r7.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0087
        L_0x007c:
            r7.ab = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x0087
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0087:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x008a:
            boolean r11 = r7.w     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x0094
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            r7.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x009b
        L_0x0094:
            r7.u = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x009b:
            boolean r11 = r7.x     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00a5
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            r7.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x00ac
        L_0x00a5:
            r7.v = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00ac:
            boolean r11 = r7.ac     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00b6
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            r7.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x00bd
        L_0x00b6:
            r7.ab = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00bd:
            if (r8 == 0) goto L_0x00d8
            boolean r11 = r8 instanceof android.app.Activity     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00cd
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f5 }
            r0 = r8
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x00f5 }
            r11.updateActivity(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00cd:
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f5 }
            android.content.Context r0 = r8.getApplicationContext()     // Catch:{ all -> 0x00f5 }
            r11.updateAppContext(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00d8:
            int r11 = r10.size()     // Catch:{ all -> 0x00f5 }
            if (r11 <= 0) goto L_0x00f3
            int r11 = r10.size()     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r11 = new com.ironsource.mediationsdk.IronSource.AD_UNIT[r11]     // Catch:{ all -> 0x00f5 }
            java.lang.Object[] r10 = r10.toArray(r11)     // Catch:{ all -> 0x00f5 }
            r5 = r10
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r5 = (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r5     // Catch:{ all -> 0x00f5 }
            r3 = 1
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r7)
            return
        L_0x00f5:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02f9, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081 A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ef A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0133 A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0165 A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ba A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01fb A[SYNTHETIC, Splitter:B:78:0x01fb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r9, java.lang.String r10, boolean r11, com.ironsource.mediationsdk.sdk.InitializationListener r12, com.ironsource.mediationsdk.IronSource.AD_UNIT... r13) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x02fa }
            r0.verbose()     // Catch:{ all -> 0x02fa }
            if (r12 == 0) goto L_0x000a
            r8.ah = r12     // Catch:{ all -> 0x02fa }
        L_0x000a:
            java.util.concurrent.atomic.AtomicBoolean r12 = r8.U     // Catch:{ all -> 0x02fa }
            if (r12 == 0) goto L_0x02d6
            r0 = 0
            r1 = 1
            boolean r12 = r12.compareAndSet(r1, r0)     // Catch:{ all -> 0x02fa }
            if (r12 == 0) goto L_0x02d6
            if (r13 == 0) goto L_0x004d
            int r12 = r13.length     // Catch:{ all -> 0x02fa }
            if (r12 != 0) goto L_0x001c
            goto L_0x004d
        L_0x001c:
            int r12 = r13.length     // Catch:{ all -> 0x02fa }
            r2 = r0
        L_0x001e:
            if (r2 >= r12) goto L_0x0065
            r3 = r13[r2]     // Catch:{ all -> 0x02fa }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r8.X     // Catch:{ all -> 0x02fa }
            r4.add(r3)     // Catch:{ all -> 0x02fa }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r8.Y     // Catch:{ all -> 0x02fa }
            r4.add(r3)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x02fa }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x02fa }
            if (r4 == 0) goto L_0x0036
            r8.x = r1     // Catch:{ all -> 0x02fa }
        L_0x0036:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x02fa }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x02fa }
            if (r4 == 0) goto L_0x0040
            r8.ac = r1     // Catch:{ all -> 0x02fa }
        L_0x0040:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x02fa }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02fa }
            if (r3 == 0) goto L_0x004a
            r8.w = r1     // Catch:{ all -> 0x02fa }
        L_0x004a:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x004d:
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r12 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()     // Catch:{ all -> 0x02fa }
            int r2 = r12.length     // Catch:{ all -> 0x02fa }
            r3 = r0
        L_0x0053:
            if (r3 >= r2) goto L_0x005f
            r4 = r12[r3]     // Catch:{ all -> 0x02fa }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r8.X     // Catch:{ all -> 0x02fa }
            r5.add(r4)     // Catch:{ all -> 0x02fa }
            int r3 = r3 + 1
            goto L_0x0053
        L_0x005f:
            r8.w = r1     // Catch:{ all -> 0x02fa }
            r8.x = r1     // Catch:{ all -> 0x02fa }
            r8.ac = r1     // Catch:{ all -> 0x02fa }
        L_0x0065:
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x02fa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fa }
            java.lang.String r3 = "init(appKey:"
            r2.<init>(r3)     // Catch:{ all -> 0x02fa }
            r2.append(r10)     // Catch:{ all -> 0x02fa }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x02fa }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02fa }
            r12.info(r2)     // Catch:{ all -> 0x02fa }
            boolean r12 = r9 instanceof android.app.Activity     // Catch:{ all -> 0x02fa }
            if (r12 == 0) goto L_0x008b
            com.ironsource.environment.ContextProvider r12 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02fa }
            r2 = r9
            android.app.Activity r2 = (android.app.Activity) r2     // Catch:{ all -> 0x02fa }
            r12.updateActivity(r2)     // Catch:{ all -> 0x02fa }
        L_0x008b:
            com.ironsource.environment.ContextProvider r12 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02fa }
            android.content.Context r2 = r9.getApplicationContext()     // Catch:{ all -> 0x02fa }
            r12.updateAppContext(r2)     // Catch:{ all -> 0x02fa }
            com.ironsource.environment.h.q()     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.a.e r12 = r8.ao     // Catch:{ all -> 0x02fa }
            java.lang.String r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()     // Catch:{ all -> 0x02fa }
            r12.b((java.lang.String) r2)     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.a.e r12 = r8.ao     // Catch:{ all -> 0x02fa }
            com.ironsource.c.b r2 = com.ironsource.c.a.a()     // Catch:{ all -> 0x02fa }
            r12.a((com.ironsource.c.b) r2)     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.a.e r12 = r8.ao     // Catch:{ all -> 0x02fa }
            boolean r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.isGooglePlayInstalled(r9)     // Catch:{ all -> 0x02fa }
            r12.b((boolean) r2)     // Catch:{ all -> 0x02fa }
            com.ironsource.d.b r12 = new com.ironsource.d.b     // Catch:{ all -> 0x02fa }
            r12.<init>()     // Catch:{ all -> 0x02fa }
            if (r10 == 0) goto L_0x00df
            r2 = 5
            r3 = 10
            boolean r2 = a((java.lang.String) r10, (int) r2, (int) r3)     // Catch:{ all -> 0x02fa }
            if (r2 == 0) goto L_0x00d6
            boolean r2 = v(r10)     // Catch:{ all -> 0x02fa }
            if (r2 != 0) goto L_0x00e9
            java.lang.String r2 = "appKey"
            java.lang.String r3 = "should contain only english characters and numbers"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r2, r10, r3)     // Catch:{ all -> 0x02fa }
        L_0x00d2:
            r12.a((com.ironsource.mediationsdk.logger.IronSourceError) r2)     // Catch:{ all -> 0x02fa }
            goto L_0x00e9
        L_0x00d6:
            java.lang.String r2 = "appKey"
            java.lang.String r3 = "length should be between 5-10 characters"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r2, r10, r3)     // Catch:{ all -> 0x02fa }
            goto L_0x00d2
        L_0x00df:
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x02fa }
            r3 = 506(0x1fa, float:7.09E-43)
            java.lang.String r4 = "Init Fail - appKey is missing"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x02fa }
            goto L_0x00d2
        L_0x00e9:
            boolean r2 = r12.a()     // Catch:{ all -> 0x02fa }
            if (r2 == 0) goto L_0x00f1
            r8.j = r10     // Catch:{ all -> 0x02fa }
        L_0x00f1:
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02fa }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x02fa }
            boolean r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.isInitResponseCached(r2)     // Catch:{ all -> 0x02fa }
            long r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSessionTimestamp(r2)     // Catch:{ all -> 0x02fa }
            if (r3 != 0) goto L_0x0123
            r6 = -1
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0123
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x02fa }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fa }
            java.lang.String r7 = "get first session timestamp = "
            r6.<init>(r7)     // Catch:{ all -> 0x02fa }
            r6.append(r3)     // Catch:{ all -> 0x02fa }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x02fa }
            r5.verbose(r6)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveFirstSessionTimestamp(r2, r3)     // Catch:{ all -> 0x02fa }
        L_0x0123:
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02fa }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x02fa }
            java.lang.String r3 = r8.k     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.utils.l r2 = r8.a((android.content.Context) r2, (java.lang.String) r3)     // Catch:{ all -> 0x02fa }
            if (r2 == 0) goto L_0x0155
            com.ironsource.environment.g r3 = com.ironsource.environment.g.a     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.model.h r3 = r2.c     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.controller.u r3 = r3.e     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.utils.b r3 = r3.f()     // Catch:{ all -> 0x02fa }
            boolean r3 = r3.a()     // Catch:{ all -> 0x02fa }
            com.ironsource.environment.g.a(r3)     // Catch:{ all -> 0x02fa }
            com.ironsource.environment.g r3 = com.ironsource.environment.g.a     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.model.h r2 = r2.c     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.controller.u r2 = r2.e     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.utils.b r2 = r2.f()     // Catch:{ all -> 0x02fa }
            boolean r2 = r2.b()     // Catch:{ all -> 0x02fa }
            com.ironsource.environment.g.c(r2)     // Catch:{ all -> 0x02fa }
        L_0x0155:
            com.ironsource.d.a r2 = com.ironsource.d.a.a()     // Catch:{ all -> 0x02fa }
            java.util.concurrent.ConcurrentHashMap r2 = r2.d()     // Catch:{ all -> 0x02fa }
            java.lang.String r3 = "is_deviceid_optout"
            boolean r3 = r2.containsKey(r3)     // Catch:{ all -> 0x02fa }
            if (r3 == 0) goto L_0x0187
            java.lang.String r3 = "is_deviceid_optout"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x02fa }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x02fa }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x02fa }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x02fa }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x02fa }
            if (r3 != 0) goto L_0x0187
            boolean r2 = com.ironsource.mediationsdk.metadata.MetaDataUtils.getMetaDataBooleanValue(r2)     // Catch:{ all -> 0x02fa }
            if (r2 != 0) goto L_0x0181
            r2 = r1
            goto L_0x0182
        L_0x0181:
            r2 = r0
        L_0x0182:
            com.ironsource.environment.g r3 = com.ironsource.environment.g.a     // Catch:{ all -> 0x02fa }
            com.ironsource.environment.g.b(r2)     // Catch:{ all -> 0x02fa }
        L_0x0187:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.S     // Catch:{ all -> 0x02fa }
            if (r2 == 0) goto L_0x01b6
            boolean r2 = r2.compareAndSet(r0, r1)     // Catch:{ all -> 0x02fa }
            if (r2 == 0) goto L_0x01b6
            com.ironsource.mediationsdk.a.i r2 = com.ironsource.mediationsdk.a.i.a()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.utils.h r3 = new com.ironsource.mediationsdk.utils.h     // Catch:{ all -> 0x02fa }
            r3.<init>(r9)     // Catch:{ all -> 0x02fa }
            r2.a(r3)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.a.d r2 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.s     // Catch:{ all -> 0x02fa }
            r2.a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.a.h r2 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.s     // Catch:{ all -> 0x02fa }
            r2.a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.a.g r2 = com.ironsource.mediationsdk.a.g.w     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.s     // Catch:{ all -> 0x02fa }
            r2.a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x02fa }
        L_0x01b6:
            java.lang.String r2 = r8.j     // Catch:{ all -> 0x02fa }
            if (r2 != 0) goto L_0x01fb
            com.ironsource.mediationsdk.Q r9 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.Q$a r10 = com.ironsource.mediationsdk.Q.a.INIT_FAILED     // Catch:{ all -> 0x02fa }
            r9.a((com.ironsource.mediationsdk.Q.a) r10)     // Catch:{ all -> 0x02fa }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r9 = r8.X     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x02fa }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x02fa }
            if (r9 == 0) goto L_0x01d5
            com.ironsource.mediationsdk.ae r9 = com.ironsource.mediationsdk.ae.a()     // Catch:{ all -> 0x02fa }
            r10 = 0
            r9.a((boolean) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r10)     // Catch:{ all -> 0x02fa }
        L_0x01d5:
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r9 = r8.X     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x02fa }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x02fa }
            if (r9 == 0) goto L_0x01e8
            com.ironsource.mediationsdk.sdk.i r9 = r8.g     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.logger.IronSourceError r10 = r12.b()     // Catch:{ all -> 0x02fa }
            r9.a((boolean) r0, (com.ironsource.mediationsdk.logger.IronSourceError) r10)     // Catch:{ all -> 0x02fa }
        L_0x01e8:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r10 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = r12.b()     // Catch:{ all -> 0x02fa }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x02fa }
            r9.log(r10, r11, r1)     // Catch:{ all -> 0x02fa }
            monitor-exit(r8)
            return
        L_0x01fb:
            com.ironsource.sdk.a.e r12 = r8.ao     // Catch:{ all -> 0x02fa }
            r12.a((android.content.Context) r9)     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.a.e r12 = r8.ao     // Catch:{ all -> 0x02fa }
            java.lang.String r2 = r8.j     // Catch:{ all -> 0x02fa }
            r12.a((java.lang.String) r2)     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.a.e r12 = r8.ao     // Catch:{ all -> 0x02fa }
            java.lang.String r2 = r8.p     // Catch:{ all -> 0x02fa }
            r12.c(r2)     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.a.e r12 = r8.ao     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.config.ConfigFile r2 = com.ironsource.mediationsdk.config.ConfigFile.getConfigFile()     // Catch:{ all -> 0x02fa }
            java.lang.String r2 = r2.getPluginType()     // Catch:{ all -> 0x02fa }
            r12.d(r2)     // Catch:{ all -> 0x02fa }
            boolean r12 = r8.Z     // Catch:{ all -> 0x02fa }
            if (r12 == 0) goto L_0x02a8
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fa }
            r12.<init>()     // Catch:{ all -> 0x02fa }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r11)     // Catch:{ all -> 0x02fa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0294 }
            java.lang.String r3 = ",androidx="
            r2.<init>(r3)     // Catch:{ Exception -> 0x0294 }
            boolean r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x0294 }
            r2.append(r3)     // Catch:{ Exception -> 0x0294 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0294 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0294 }
            java.lang.String r4 = ",Activity="
            r3.<init>(r4)     // Catch:{ Exception -> 0x0294 }
            boolean r4 = H()     // Catch:{ Exception -> 0x0294 }
            r3.append(r4)     // Catch:{ Exception -> 0x0294 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0294 }
            boolean r4 = com.ironsource.environment.a.AnonymousClass1.d()     // Catch:{ Exception -> 0x0294 }
            if (r4 == 0) goto L_0x025f
            java.lang.String r4 = "appLanguage=Kotlin"
            r12.append(r4)     // Catch:{ Exception -> 0x0294 }
            java.lang.String r4 = com.ironsource.environment.a.AnonymousClass1.c()     // Catch:{ Exception -> 0x0294 }
        L_0x025b:
            r12.append(r4)     // Catch:{ Exception -> 0x0294 }
            goto L_0x0262
        L_0x025f:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x025b
        L_0x0262:
            r12.append(r2)     // Catch:{ Exception -> 0x0294 }
            boolean r2 = r8.n()     // Catch:{ Exception -> 0x0294 }
            if (r2 == 0) goto L_0x026e
            r12.append(r3)     // Catch:{ Exception -> 0x0294 }
        L_0x026e:
            java.lang.String r2 = "ext1"
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0294 }
            r11.put(r2, r12)     // Catch:{ Exception -> 0x0294 }
            if (r13 == 0) goto L_0x0289
            int r12 = r13.length     // Catch:{ Exception -> 0x0294 }
            r2 = r0
        L_0x027b:
            if (r2 >= r12) goto L_0x0289
            r3 = r13[r2]     // Catch:{ Exception -> 0x0294 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0294 }
            r11.put(r3, r1)     // Catch:{ Exception -> 0x0294 }
            int r2 = r2 + 1
            goto L_0x027b
        L_0x0289:
            java.lang.String r12 = "sessionDepth"
            int r13 = r8.t     // Catch:{ Exception -> 0x0294 }
            int r13 = r13 + r1
            r8.t = r13     // Catch:{ Exception -> 0x0294 }
            r11.put(r12, r13)     // Catch:{ Exception -> 0x0294 }
            goto L_0x0298
        L_0x0294:
            r12 = move-exception
            r12.printStackTrace()     // Catch:{ all -> 0x02fa }
        L_0x0298:
            com.ironsource.mediationsdk.a.c r12 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x02fa }
            r13 = 14
            r12.<init>(r13, r11)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.a.h r11 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x02fa }
            r11.b((com.ironsource.mediationsdk.a.c) r12)     // Catch:{ all -> 0x02fa }
            r8.Z = r0     // Catch:{ all -> 0x02fa }
        L_0x02a8:
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r11 = r8.X     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r12 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x02fa }
            boolean r11 = r11.contains(r12)     // Catch:{ all -> 0x02fa }
            if (r11 == 0) goto L_0x02bb
            com.ironsource.mediationsdk.Q r11 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.I r12 = r8.c     // Catch:{ all -> 0x02fa }
            r11.a((com.ironsource.mediationsdk.utils.i) r12)     // Catch:{ all -> 0x02fa }
        L_0x02bb:
            com.ironsource.mediationsdk.Q r11 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x02fa }
            r11.a((com.ironsource.mediationsdk.utils.i) r8)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.Q r11 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.impressionData.a r12 = r8.O     // Catch:{ all -> 0x02fa }
            r11.a((com.ironsource.mediationsdk.utils.i) r12)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.Q r11 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x02fa }
            java.lang.String r12 = r8.k     // Catch:{ all -> 0x02fa }
            r11.a(r9, r10, r12)     // Catch:{ all -> 0x02fa }
            monitor-exit(r8)
            return
        L_0x02d6:
            if (r13 == 0) goto L_0x02ee
            r8.a((boolean) r11, (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r13)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.Q r9 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.Q$a r9 = r9.b()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.Q$a r10 = com.ironsource.mediationsdk.Q.a.INITIATED     // Catch:{ all -> 0x02fa }
            if (r9 != r10) goto L_0x02f8
            if (r11 != 0) goto L_0x02f8
            r8.I()     // Catch:{ all -> 0x02fa }
            monitor-exit(r8)
            return
        L_0x02ee:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r10 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x02fa }
            java.lang.String r11 = "Multiple calls to init without ad units are not allowed"
            r12 = 3
            r9.log(r10, r11, r12)     // Catch:{ all -> 0x02fa }
        L_0x02f8:
            monitor-exit(r8)
            return
        L_0x02fa:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(AbstractAdapter abstractAdapter) {
        this.R = abstractAdapter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011d, code lost:
        if (r4.K != false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011f, code lost:
        r1.a(r5, x(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0126, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
        r4.B.a(r5, x(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0130, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ironsource.mediationsdk.IronSourceBannerLayout r5, java.lang.String r6) {
        /*
            r4 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "placementName = "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            boolean r0 = r4.ab
            r1 = 0
            r2 = 3
            if (r0 == 0) goto L_0x0030
            java.lang.String r6 = "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r4.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r0.log(r3, r6, r2)
            com.ironsource.mediationsdk.o r0 = com.ironsource.mediationsdk.C0030o.a()
            java.lang.String r2 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r6 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r6, r2)
            r0.a(r5, r6, r1)
            return
        L_0x0030:
            if (r5 == 0) goto L_0x0134
            boolean r0 = r5.isDestroyed()
            if (r0 == 0) goto L_0x003a
            goto L_0x0134
        L_0x003a:
            boolean r0 = r4.ac
            if (r0 != 0) goto L_0x0053
            java.lang.String r6 = "init() must be called before loadBanner()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r4.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r0.log(r3, r6, r2)
            com.ironsource.mediationsdk.o r0 = com.ironsource.mediationsdk.C0030o.a()
            com.ironsource.mediationsdk.logger.IronSourceError r6 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r6)
            r0.a(r5, r6, r1)
            return
        L_0x0053:
            com.ironsource.mediationsdk.ISBannerSize r0 = r5.getSize()
            java.lang.String r0 = r0.getDescription()
            java.lang.String r3 = "CUSTOM"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x008e
            com.ironsource.mediationsdk.ISBannerSize r0 = r5.getSize()
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x0077
            com.ironsource.mediationsdk.ISBannerSize r0 = r5.getSize()
            int r0 = r0.getHeight()
            if (r0 > 0) goto L_0x008e
        L_0x0077:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r4.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "loadBanner: Unsupported banner size. Height and width must be bigger than 0"
            r6.log(r0, r3, r2)
            com.ironsource.mediationsdk.o r6 = com.ironsource.mediationsdk.C0030o.a()
            java.lang.String r0 = ""
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.unsupportedBannerSize(r0)
            r6.a(r5, r0, r1)
            return
        L_0x008e:
            com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.a()
            com.ironsource.mediationsdk.Q$a r0 = r0.b()
            com.ironsource.mediationsdk.Q$a r3 = com.ironsource.mediationsdk.Q.a.INIT_FAILED
            if (r0 != r3) goto L_0x00b4
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r4.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "init() had failed"
            r6.log(r0, r3, r2)
            com.ironsource.mediationsdk.o r6 = com.ironsource.mediationsdk.C0030o.a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 600(0x258, float:8.41E-43)
            java.lang.String r3 = "Init() had failed"
            r0.<init>(r2, r3)
            r6.a(r5, r0, r1)
            return
        L_0x00b4:
            com.ironsource.mediationsdk.Q$a r3 = com.ironsource.mediationsdk.Q.a.INIT_IN_PROGRESS
            if (r0 != r3) goto L_0x00e5
            com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.Q.a()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00dc
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r4.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "init() had failed"
            r6.log(r0, r3, r2)
            com.ironsource.mediationsdk.o r6 = com.ironsource.mediationsdk.C0030o.a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 601(0x259, float:8.42E-43)
            java.lang.String r3 = "Init had failed"
            r0.<init>(r2, r3)
            r6.a(r5, r0, r1)
            return
        L_0x00dc:
            r4.af = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.ae = r5
            r4.ag = r6
            return
        L_0x00e5:
            boolean r0 = r4.G()
            if (r0 != 0) goto L_0x0105
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r4.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "No banner configurations found"
            r6.log(r0, r3, r2)
            com.ironsource.mediationsdk.o r6 = com.ironsource.mediationsdk.C0030o.a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 615(0x267, float:8.62E-43)
            java.lang.String r3 = "the server response does not contain banner data"
            r0.<init>(r2, r3)
            r6.a(r5, r0, r1)
            return
        L_0x0105:
            java.lang.Boolean r0 = r4.ae
            monitor-enter(r0)
            com.ironsource.mediationsdk.p r1 = r4.e     // Catch:{ all -> 0x0131 }
            if (r1 != 0) goto L_0x011a
            com.ironsource.mediationsdk.T r2 = r4.B     // Catch:{ all -> 0x0131 }
            if (r2 != 0) goto L_0x011a
            r4.af = r5     // Catch:{ all -> 0x0131 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0131 }
            r4.ae = r5     // Catch:{ all -> 0x0131 }
            r4.ag = r6     // Catch:{ all -> 0x0131 }
            monitor-exit(r0)     // Catch:{ all -> 0x0131 }
            return
        L_0x011a:
            monitor-exit(r0)     // Catch:{ all -> 0x0131 }
            boolean r0 = r4.K
            if (r0 != 0) goto L_0x0127
            com.ironsource.mediationsdk.model.g r6 = r4.x(r6)
            r1.a((com.ironsource.mediationsdk.IronSourceBannerLayout) r5, (com.ironsource.mediationsdk.model.g) r6)
            return
        L_0x0127:
            com.ironsource.mediationsdk.T r0 = r4.B
            com.ironsource.mediationsdk.model.g r6 = r4.x(r6)
            r0.a((com.ironsource.mediationsdk.IronSourceBannerLayout) r5, (com.ironsource.mediationsdk.model.g) r6)
            return
        L_0x0131:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0131 }
            throw r5
        L_0x0134:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "loadBanner can't be called - "
            r6.<init>(r0)
            if (r5 != 0) goto L_0x0140
            java.lang.String r0 = "banner layout is null "
            goto L_0x0142
        L_0x0140:
            java.lang.String r0 = "banner layout is destroyed"
        L_0x0142:
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r4.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r0.log(r3, r6, r2)
            com.ironsource.mediationsdk.o r0 = com.ironsource.mediationsdk.C0030o.a()
            com.ironsource.mediationsdk.logger.IronSourceError r6 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r6)
            r0.a(r5, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.a(com.ironsource.mediationsdk.IronSourceBannerLayout, java.lang.String):void");
    }

    public final synchronized void a(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (levelPlayRewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.w) {
            if (levelPlayRewardedVideoManualListener == null) {
                this.F = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.F = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        ae.a().b = levelPlayRewardedVideoManualListener;
    }

    public final synchronized void a(RewardedVideoManualListener rewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (rewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.w) {
            if (rewardedVideoManualListener == null) {
                this.F = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.F = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        this.g.a = rewardedVideoManualListener;
        ae.a().a = rewardedVideoManualListener;
    }

    public final void a(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.g != null) {
                for (IronSource.AD_UNIT a2 : this.X) {
                    a(a2, true);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataKeyValidity);
        } else if (checkMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataValueValidity);
        } else {
            MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
            String metaDataKey = formatMetaData.getMetaDataKey();
            List<String> metaDataValue = formatMetaData.getMetaDataValue();
            if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
                C0019d.a().a(metaDataKey, metaDataValue);
            } else if (Q.a().b() != Q.a.INITIATED || !MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                com.ironsource.d.a.a().a(metaDataKey, metaDataValue);
            } else {
                IronLog ironLog2 = IronLog.API;
                ironLog2.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            }
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C0019d.a().c;
                concurrentHashMap.putAll(com.ironsource.d.a.a().d());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
                this.ao.a(jSONObject);
            } catch (JSONException e2) {
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.error("got the following error " + e2.getMessage());
                e2.printStackTrace();
            }
            com.ironsource.mediationsdk.a.h.d().b(new c(Q.a().b() == Q.a.INITIATED ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, boolean z2) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("userId = " + str + ", isFromPublisher = " + z2);
        this.k = str;
        if (z2) {
            com.ironsource.mediationsdk.a.h.d().b(new c(52, IronSourceUtils.getJsonForUserId(false)));
        }
    }

    public final void a(List<IronSource.AD_UNIT> list, boolean z2, com.ironsource.mediationsdk.model.h hVar) {
        IronLog.INTERNAL.verbose();
        try {
            this.W = list;
            this.V = true;
            this.f.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z2) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                com.ironsource.mediationsdk.a.h.d().b(new c(114, mediationAdditionalData));
            }
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            if (currentActiveActivity != null) {
                String screenSizeParams = AdapterUtils.getScreenSizeParams(currentActiveActivity);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, screenSizeParams);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                d.d().b(new c(IronSourceConstants.TROUBLESHOOTING_SCREEN_SIZE, jSONObject));
            }
            d.d().c();
            com.ironsource.mediationsdk.a.h.d().c();
            C0019d a2 = C0019d.a();
            String str = this.j;
            String str2 = this.k;
            a2.a = str;
            a2.b = str2;
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.X.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        b(ad_unit);
                    } else {
                        a(ad_unit, false);
                    }
                }
            }
            I();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized AbstractAdapter b(String str) {
        try {
            AbstractAdapter abstractAdapter = this.R;
            if (abstractAdapter != null && abstractAdapter.getProviderName().equals(str)) {
                return this.R;
            }
        } catch (Exception e2) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "getOfferwallAdapter exception: " + e2, 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Placement b() {
        p pVar = this.i.c.a;
        if (pVar != null) {
            return pVar.a();
        }
        return null;
    }

    public final String b(Context context) {
        String str;
        com.ironsource.mediationsdk.utils.p pVar;
        a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED, (JSONObject) null);
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            return null;
        }
        Q.a b2 = Q.a().b();
        if (b2 == Q.a.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            return null;
        } else if (b2 == Q.a.INIT_FAILED) {
            IronLog.API.error("bidding data cannot be retrieved, SDK failed to initialize");
            a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            return null;
        } else {
            try {
                l lVar = this.i;
                if (lVar == null) {
                    lVar = H.a(context);
                }
                if (b2 == Q.a.NOT_INIT) {
                    this.ao.a(context);
                    this.ao.b(IronSourceUtils.getSDKVersion());
                    this.ao.c(this.p);
                    this.ao.d(ConfigFile.getConfigFile().getPluginType());
                    this.ao.a(com.ironsource.c.a.a());
                    this.ao.b(IronSourceUtils.isGooglePlayInstalled(context));
                }
                if (b2 != Q.a.INITIATED) {
                    Q.a().a(lVar);
                    if (lVar != null) {
                        Q.a().a(context, lVar);
                    }
                }
                if (lVar == null || !lVar.b()) {
                    pVar = new com.ironsource.mediationsdk.utils.p();
                } else {
                    pVar = lVar.c.e.c();
                    if (!pVar.d) {
                        pVar.b = lVar.b.a(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
                    }
                }
                JSONObject a2 = am.a(context, pVar);
                C0021f.a().a(a2, true);
                str = pVar.e ? IronSourceAES.compressAndEncrypt(a2.toString()) : IronSourceAES.encrypt(a2.toString());
            } catch (Throwable th) {
                a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, (JSONObject) null);
                IronLog ironLog = IronLog.API;
                ironLog.error("got error during token creation: " + th.getMessage());
                str = null;
            }
            if (str == null) {
                a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            }
            return str;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void b(android.app.Activity r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f     // Catch:{ all -> 0x015e }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x015e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x015e }
            java.lang.String r3 = "loadISDemandOnlyRewardedVideo() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x015e }
            r2.append(r7)     // Catch:{ all -> 0x015e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x015e }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x015e }
            boolean r0 = r5.w     // Catch:{ all -> 0x0140 }
            r1 = 508(0x1fc, float:7.12E-43)
            r2 = 3
            if (r0 != 0) goto L_0x0035
            java.lang.String r6 = "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.ad r8 = com.ironsource.mediationsdk.ad.a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0140 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0140 }
            r8.a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0140 }
            monitor-exit(r5)
            return
        L_0x0035:
            boolean r0 = r5.u     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x0050
            java.lang.String r6 = "Rewarded video was initialized in mediation mode"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.ad r8 = com.ironsource.mediationsdk.ad.a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0140 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0140 }
            r8.a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0140 }
            monitor-exit(r5)
            return
        L_0x0050:
            r0 = 0
            if (r6 == 0) goto L_0x005b
            com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0140 }
            r1.updateActivity(r6)     // Catch:{ all -> 0x0140 }
            goto L_0x008c
        L_0x005b:
            com.ironsource.environment.ContextProvider r6 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0140 }
            android.app.Activity r6 = r6.getCurrentActiveActivity()     // Catch:{ all -> 0x0140 }
            if (r6 != 0) goto L_0x008c
            if (r8 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r0 = r3
        L_0x0069:
            org.json.JSONObject r6 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r0, r3)     // Catch:{ all -> 0x0140 }
            r8 = 81321(0x13da9, float:1.13955E-40)
            a((int) r8, (org.json.JSONObject) r6)     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "Rewarded video was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.ad r8 = com.ironsource.mediationsdk.ad.a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0140 }
            r1 = 1060(0x424, float:1.485E-42)
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0140 }
            r8.a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0140 }
            monitor-exit(r5)
            return
        L_0x008c:
            com.ironsource.mediationsdk.Q r6 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.Q$a r6 = r6.b()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.Q.a.INIT_FAILED     // Catch:{ all -> 0x0140 }
            if (r6 != r1) goto L_0x00b2
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "init() had failed"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.ad r6 = com.ironsource.mediationsdk.ad.a()     // Catch:{ all -> 0x0140 }
            java.lang.String r8 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0140 }
            r6.a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0140 }
            monitor-exit(r5)
            return
        L_0x00b2:
            com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.Q.a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0140 }
            r4 = 83002(0x1443a, float:1.1631E-40)
            if (r6 != r1) goto L_0x00f6
            com.ironsource.mediationsdk.Q r6 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x0140 }
            boolean r6 = r6.c()     // Catch:{ all -> 0x0140 }
            if (r6 == 0) goto L_0x00dd
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "init() had failed"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.ad r6 = com.ironsource.mediationsdk.ad.a()     // Catch:{ all -> 0x0140 }
            java.lang.String r8 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0140 }
            r6.a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0140 }
            monitor-exit(r5)
            return
        L_0x00dd:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r6 = r5.al     // Catch:{ all -> 0x0140 }
            monitor-enter(r6)     // Catch:{ all -> 0x0140 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r5.al     // Catch:{ all -> 0x00f3 }
            r0.add(r7)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            if (r8 == 0) goto L_0x00f1
            int r6 = r5.L     // Catch:{ all -> 0x0140 }
            org.json.JSONObject r6 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r6)     // Catch:{ all -> 0x0140 }
            a((int) r4, (org.json.JSONObject) r6)     // Catch:{ all -> 0x0140 }
        L_0x00f1:
            monitor-exit(r5)
            return
        L_0x00f3:
            r8 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            throw r8     // Catch:{ all -> 0x0140 }
        L_0x00f6:
            boolean r6 = r5.e()     // Catch:{ all -> 0x0140 }
            if (r6 != 0) goto L_0x0116
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "No rewarded video configurations found"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.ad r6 = com.ironsource.mediationsdk.ad.a()     // Catch:{ all -> 0x0140 }
            java.lang.String r8 = "the server response does not contain rewarded video data"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0140 }
            r6.a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0140 }
            monitor-exit(r5)
            return
        L_0x0116:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r6 = r5.al     // Catch:{ all -> 0x0140 }
            monitor-enter(r6)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.y r1 = r5.an     // Catch:{ all -> 0x013d }
            if (r1 != 0) goto L_0x0130
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r5.al     // Catch:{ all -> 0x013d }
            r0.add(r7)     // Catch:{ all -> 0x013d }
            if (r8 == 0) goto L_0x012d
            int r8 = r5.L     // Catch:{ all -> 0x013d }
            org.json.JSONObject r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r8)     // Catch:{ all -> 0x013d }
            a((int) r4, (org.json.JSONObject) r8)     // Catch:{ all -> 0x013d }
        L_0x012d:
            monitor-exit(r6)     // Catch:{ all -> 0x013d }
            monitor-exit(r5)
            return
        L_0x0130:
            monitor-exit(r6)     // Catch:{ all -> 0x013d }
            if (r8 != 0) goto L_0x0138
            r6 = 0
            r1.a((java.lang.String) r7, (java.lang.String) r6, (boolean) r0)     // Catch:{ all -> 0x0140 }
            goto L_0x015c
        L_0x0138:
            r1.a((java.lang.String) r7, (java.lang.String) r8, (boolean) r3)     // Catch:{ all -> 0x0140 }
            monitor-exit(r5)
            return
        L_0x013d:
            r8 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x013d }
            throw r8     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r6 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f     // Catch:{ all -> 0x015e }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x015e }
            java.lang.String r1 = "loadISDemandOnlyRewardedVideo"
            r8.logException(r0, r1, r6)     // Catch:{ all -> 0x015e }
            com.ironsource.mediationsdk.ad r8 = com.ironsource.mediationsdk.ad.a()     // Catch:{ all -> 0x015e }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x015e }
            r1 = 510(0x1fe, float:7.15E-43)
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x015e }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x015e }
            r8.a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x015e }
        L_0x015c:
            monitor-exit(r5)
            return
        L_0x015e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.b(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    public final void b(boolean z2) {
        this.y = Boolean.valueOf(z2);
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setConsent : " + z2, 1);
        C0019d.a().a(z2);
        if (this.R != null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag2, "Offerwall | setConsent(consent:" + z2 + ")", 1);
            this.R.setConsent(z2);
        }
        int i2 = 40;
        if (!z2) {
            i2 = 41;
        }
        this.ao.a(z2);
        com.ironsource.mediationsdk.a.h.d().b(new c(i2, IronSourceUtils.getMediationAdditionalData(false)));
    }

    public final synchronized void c(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            E.a().a(str, new IronSourceError(510, "adm cannot be null"));
            return;
        }
        d(activity, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r3.c() != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        if (r3.b() != false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048 A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062 A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A[Catch:{ all -> 0x0086 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r9 = this;
            java.lang.String r0 = "isRewardedVideoAvailable():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.u     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f     // Catch:{ all -> 0x008b }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x008b }
            java.lang.String r5 = "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x008b }
            return r2
        L_0x0013:
            boolean r3 = r9.F     // Catch:{ all -> 0x008b }
            if (r3 != 0) goto L_0x0035
            boolean r3 = r9.aj     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x001c
            goto L_0x0035
        L_0x001c:
            boolean r3 = r9.E     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x002e
            com.ironsource.mediationsdk.D r3 = r9.z     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.c()     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x002c
        L_0x002a:
            r3 = r1
            goto L_0x0040
        L_0x002c:
            r3 = r2
            goto L_0x0040
        L_0x002e:
            com.ironsource.mediationsdk.af r3 = r9.b     // Catch:{ all -> 0x008b }
            boolean r3 = r3.c()     // Catch:{ all -> 0x008b }
            goto L_0x0040
        L_0x0035:
            com.ironsource.mediationsdk.adunit.c.h r3 = r9.D     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.b()     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x002c
            goto L_0x002a
        L_0x0040:
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x0086 }
            boolean r5 = r9.E     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x005e
            java.lang.Object[][] r5 = new java.lang.Object[r1][]     // Catch:{ all -> 0x0086 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0086 }
            java.lang.String r7 = "programmatic"
            r6[r2] = r7     // Catch:{ all -> 0x0086 }
            int r7 = r9.L     // Catch:{ all -> 0x0086 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0086 }
            r6[r1] = r7     // Catch:{ all -> 0x0086 }
            r5[r2] = r6     // Catch:{ all -> 0x0086 }
            a((org.json.JSONObject) r4, (java.lang.Object[][]) r5)     // Catch:{ all -> 0x0086 }
        L_0x005e:
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x0065
            r6 = 1101(0x44d, float:1.543E-42)
            goto L_0x0067
        L_0x0065:
            r6 = 1102(0x44e, float:1.544E-42)
        L_0x0067:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0086 }
            com.ironsource.mediationsdk.a.h r4 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ all -> 0x0086 }
            r4.b((com.ironsource.mediationsdk.a.c) r5)     // Catch:{ all -> 0x0086 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f     // Catch:{ all -> 0x0086 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r6.<init>(r0)     // Catch:{ all -> 0x0086 }
            r6.append(r3)     // Catch:{ all -> 0x0086 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0086 }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x0086 }
            r2 = r3
            goto L_0x00a9
        L_0x0086:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x008d
        L_0x008b:
            r3 = move-exception
            r4 = r2
        L_0x008d:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r4 = "isRewardedVideoAvailable()"
            r0.logException(r1, r4, r3)
        L_0x00a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.c():boolean");
    }

    public final boolean c(String str) {
        try {
            this.f.log(IronSourceLogger.IronSourceTag.API, this.a + ":setDynamicUserId(dynamicUserId:" + str + ")", 1);
            com.ironsource.d.b bVar = new com.ironsource.d.b();
            if (!a(str, 1, 128)) {
                bVar.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, IronSourceConstants.SUPERSONIC_CONFIG_NAME, "dynamicUserId is invalid, should be between 1-128 chars in length."));
            }
            if (bVar.a()) {
                this.m = str;
                com.ironsource.mediationsdk.a.h.d().b(new c(52, IronSourceUtils.getJsonForUserId(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, bVar.b().toString(), 2);
            return false;
        } catch (Exception e2) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, this.a + ":setDynamicUserId(dynamicUserId:" + str + ")", e2);
            return false;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void d(android.app.Activity r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r6.f     // Catch:{ all -> 0x0158 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0158 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0158 }
            java.lang.String r3 = "loadISDemandOnlyInterstitial() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x0158 }
            r2.append(r8)     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0158 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0158 }
            r0 = 510(0x1fe, float:7.15E-43)
            boolean r1 = r6.x     // Catch:{ all -> 0x013c }
            r2 = 3
            if (r1 != 0) goto L_0x0035
            java.lang.String r7 = "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x013c }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.E r9 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x013c }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x013c }
            r9.a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x013c }
            monitor-exit(r6)
            return
        L_0x0035:
            boolean r1 = r6.v     // Catch:{ all -> 0x013c }
            if (r1 != 0) goto L_0x0050
            java.lang.String r7 = "Interstitial was initialized in mediation mode. Use loadInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x013c }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.E r9 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x013c }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x013c }
            r9.a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x013c }
            monitor-exit(r6)
            return
        L_0x0050:
            r1 = 0
            if (r7 == 0) goto L_0x005b
            com.ironsource.environment.ContextProvider r4 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x013c }
            r4.updateActivity(r7)     // Catch:{ all -> 0x013c }
            goto L_0x008c
        L_0x005b:
            com.ironsource.environment.ContextProvider r7 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x013c }
            android.app.Activity r7 = r7.getCurrentActiveActivity()     // Catch:{ all -> 0x013c }
            if (r7 != 0) goto L_0x008c
            if (r9 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = r3
        L_0x0069:
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r1, r3)     // Catch:{ all -> 0x013c }
            r9 = 82321(0x14191, float:1.15356E-40)
            b((int) r9, (org.json.JSONObject) r7)     // Catch:{ all -> 0x013c }
            java.lang.String r7 = "Interstitial was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x013c }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.E r9 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x013c }
            r2 = 1061(0x425, float:1.487E-42)
            r1.<init>(r2, r7)     // Catch:{ all -> 0x013c }
            r9.a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x013c }
            monitor-exit(r6)
            return
        L_0x008c:
            com.ironsource.mediationsdk.Q r7 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.Q$a r7 = r7.b()     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.Q$a r4 = com.ironsource.mediationsdk.Q.a.INIT_FAILED     // Catch:{ all -> 0x013c }
            if (r7 != r4) goto L_0x00b2
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x013c }
            java.lang.String r1 = "init() had failed"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.E r7 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x013c }
            java.lang.String r9 = "init() had failed"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x013c }
            r7.a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x013c }
            monitor-exit(r6)
            return
        L_0x00b2:
            com.ironsource.mediationsdk.Q$a r4 = com.ironsource.mediationsdk.Q.a.INIT_IN_PROGRESS     // Catch:{ all -> 0x013c }
            r5 = 83003(0x1443b, float:1.16312E-40)
            if (r7 != r4) goto L_0x00f4
            com.ironsource.mediationsdk.Q r7 = com.ironsource.mediationsdk.Q.a()     // Catch:{ all -> 0x013c }
            boolean r7 = r7.c()     // Catch:{ all -> 0x013c }
            if (r7 == 0) goto L_0x00dd
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x013c }
            java.lang.String r1 = "init() had failed"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.E r7 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x013c }
            java.lang.String r9 = "init() had failed"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x013c }
            r7.a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x013c }
            monitor-exit(r6)
            return
        L_0x00dd:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.ak     // Catch:{ all -> 0x013c }
            monitor-enter(r7)     // Catch:{ all -> 0x013c }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r1 = r6.ak     // Catch:{ all -> 0x00f1 }
            r1.add(r8)     // Catch:{ all -> 0x00f1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00f1 }
            if (r9 == 0) goto L_0x00ef
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x013c }
            b((int) r5, (org.json.JSONObject) r7)     // Catch:{ all -> 0x013c }
        L_0x00ef:
            monitor-exit(r6)
            return
        L_0x00f1:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00f1 }
            throw r9     // Catch:{ all -> 0x013c }
        L_0x00f4:
            boolean r7 = r6.j()     // Catch:{ all -> 0x013c }
            if (r7 != 0) goto L_0x0114
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x013c }
            java.lang.String r1 = "No interstitial configurations found"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.E r7 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x013c }
            java.lang.String r9 = "the server response does not contain interstitial data"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x013c }
            r7.a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x013c }
            monitor-exit(r6)
            return
        L_0x0114:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.ak     // Catch:{ all -> 0x013c }
            monitor-enter(r7)     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.w r2 = r6.M     // Catch:{ all -> 0x0139 }
            if (r2 != 0) goto L_0x012c
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r1 = r6.ak     // Catch:{ all -> 0x0139 }
            r1.add(r8)     // Catch:{ all -> 0x0139 }
            if (r9 == 0) goto L_0x0129
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x0139 }
            b((int) r5, (org.json.JSONObject) r9)     // Catch:{ all -> 0x0139 }
        L_0x0129:
            monitor-exit(r7)     // Catch:{ all -> 0x0139 }
            monitor-exit(r6)
            return
        L_0x012c:
            monitor-exit(r7)     // Catch:{ all -> 0x0139 }
            if (r9 != 0) goto L_0x0134
            r7 = 0
            r2.a((java.lang.String) r8, (java.lang.String) r7, (boolean) r1)     // Catch:{ all -> 0x013c }
            goto L_0x0156
        L_0x0134:
            r2.a((java.lang.String) r8, (java.lang.String) r9, (boolean) r3)     // Catch:{ all -> 0x013c }
            monitor-exit(r6)
            return
        L_0x0139:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0139 }
            throw r9     // Catch:{ all -> 0x013c }
        L_0x013c:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f     // Catch:{ all -> 0x0158 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "loadDemandOnlyInterstitial"
            r9.logException(r1, r2, r7)     // Catch:{ all -> 0x0158 }
            com.ironsource.mediationsdk.E r9 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x0158 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0158 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0158 }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x0158 }
            r9.a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x0158 }
        L_0x0156:
            monitor-exit(r6)
            return
        L_0x0158:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.d(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    public final void d(String str) {
        try {
            this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, this.a + ":setMediationType(mediationType:" + str + ")", 1);
            if (!a(str, 1, 64) || !v(str)) {
                this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.o = str;
            }
        } catch (Exception e2) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, this.a + ":setMediationType(mediationType:" + str + ")", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        l lVar = this.i;
        return (lVar == null || lVar.c == null || this.i.c.a == null) ? false : true;
    }

    public final void e(String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        this.f.log(IronSourceLogger.IronSourceTag.API, str2, 1);
        try {
            if (this.u) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                ae.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (!d()) {
                ae.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (this.E) {
                q(str);
            } else {
                Placement r2 = r(str);
                if (r2 != null) {
                    this.b.a(r2);
                    this.b.a(r2.getPlacementName());
                }
            }
        } catch (Exception e2) {
            this.f.logException(IronSourceLogger.IronSourceTag.API, str2, e2);
            ae.a().a(new IronSourceError(510, e2.getMessage()), (AdInfo) null);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return d() && D();
    }

    public final void f() {
        synchronized (this.ae) {
            if (this.ae.booleanValue()) {
                this.ae = Boolean.FALSE;
                C0030o.a().a(this.af, new IronSourceError(603, "init had failed"), false);
                this.af = null;
                this.ag = null;
            }
        }
        if (this.J) {
            this.J = false;
            C0036u.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        if (this.G) {
            this.G = false;
            C0036u.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.ak) {
            Iterator<String> it = this.ak.iterator();
            while (it.hasNext()) {
                E.a().a(it.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
            this.ak.clear();
        }
        synchronized (this.al) {
            Iterator<String> it2 = this.al.iterator();
            while (it2.hasNext()) {
                ad.a().a(it2.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.al.clear();
        }
        synchronized (this.am) {
            Iterator<String> it3 = this.am.iterator();
            while (it3.hasNext()) {
                C0028m.a().a(it3.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.BANNER_AD_UNIT));
            }
            this.am.clear();
            this.ad.clear();
        }
    }

    public final synchronized void f(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        try {
            if (!this.u) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead", 3);
                ad.a().b(str, new IronSourceError(508, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
                return;
            }
            C0040y yVar = this.an;
            if (yVar == null) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was not initiated", 3);
                ad.a().b(str, new IronSourceError(508, "Rewarded video was not initiated"));
                return;
            } else if (!yVar.a.containsKey(str)) {
                C0040y.a(1500, str);
                ad.a().b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                C0041z zVar = yVar.a.get(str);
                yVar.a((int) IronSourceConstants.RV_INSTANCE_SHOW, zVar);
                zVar.a();
                return;
            }
        } catch (Exception e2) {
            this.f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyRewardedVideo", e2);
            ad.a().b(str, new IronSourceError(510, e2.getMessage()));
        }
        return;
    }

    /* access modifiers changed from: package-private */
    public InterstitialPlacement g() {
        com.ironsource.mediationsdk.model.i iVar = this.i.c.b;
        if (iVar != null) {
            return iVar.a();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean g(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.y r0 = r4.an     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.z> r2 = r0.a     // Catch:{ all -> 0x0038 }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x0038 }
            r3 = 1
            if (r2 != 0) goto L_0x0016
            r0 = 1500(0x5dc, float:2.102E-42)
            com.ironsource.mediationsdk.C0040y.a((int) r0, (java.lang.String) r5)     // Catch:{ all -> 0x0038 }
        L_0x0014:
            r5 = r1
            goto L_0x0032
        L_0x0016:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.z> r0 = r0.a     // Catch:{ all -> 0x0038 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0038 }
            com.ironsource.mediationsdk.z r5 = (com.ironsource.mediationsdk.C0041z) r5     // Catch:{ all -> 0x0038 }
            boolean r0 = r5.b()     // Catch:{ all -> 0x0038 }
            r2 = 0
            if (r0 == 0) goto L_0x002c
            r0 = 1210(0x4ba, float:1.696E-42)
            com.ironsource.mediationsdk.C0040y.a((int) r0, (com.ironsource.mediationsdk.C0041z) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x0038 }
            r5 = r3
            goto L_0x0032
        L_0x002c:
            r0 = 1211(0x4bb, float:1.697E-42)
            com.ironsource.mediationsdk.C0040y.a((int) r0, (com.ironsource.mediationsdk.C0041z) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x0038 }
            goto L_0x0014
        L_0x0032:
            if (r5 == 0) goto L_0x0036
            monitor-exit(r4)
            return r3
        L_0x0036:
            monitor-exit(r4)
            return r1
        L_0x0038:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.g(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showInterstitial("
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r7.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r3 = 1
            r1.log(r2, r0, r3)
            r1 = 510(0x1fe, float:7.15E-43)
            r2 = 0
            boolean r3 = r7.v     // Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x0039
            java.lang.String r8 = "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r7.f     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x0095 }
            r5 = 3
            r3.log(r4, r8, r5)     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.F r3 = com.ironsource.mediationsdk.F.a()     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.logger.IronSourceError r4 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x0095 }
            r4.<init>(r1, r8)     // Catch:{ Exception -> 0x0095 }
            r3.a((com.ironsource.mediationsdk.logger.IronSourceError) r4, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r2)     // Catch:{ Exception -> 0x0095 }
            return
        L_0x0039:
            boolean r3 = r7.i()     // Catch:{ Exception -> 0x0095 }
            if (r3 != 0) goto L_0x004f
            com.ironsource.mediationsdk.F r8 = com.ironsource.mediationsdk.F.a()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r3 = "showInterstitial can't be called before the Interstitial ad unit initialization completed successfully"
            java.lang.String r4 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r3 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r3, r4)     // Catch:{ Exception -> 0x0095 }
            r8.a((com.ironsource.mediationsdk.logger.IronSourceError) r3, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r2)     // Catch:{ Exception -> 0x0095 }
            return
        L_0x004f:
            boolean r3 = r7.H     // Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x0057
            r7.t(r8)     // Catch:{ Exception -> 0x0095 }
            return
        L_0x0057:
            com.ironsource.mediationsdk.model.InterstitialPlacement r3 = r7.u(r8)     // Catch:{ Exception -> 0x0095 }
            r4 = 0
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r5 = "placement"
            if (r3 == 0) goto L_0x006c
            java.lang.String r8 = r3.getPlacementName()     // Catch:{ JSONException -> 0x0073 }
        L_0x0068:
            r4.put(r5, r8)     // Catch:{ JSONException -> 0x0073 }
            goto L_0x0077
        L_0x006c:
            boolean r6 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x0073 }
            if (r6 != 0) goto L_0x0077
            goto L_0x0068
        L_0x0073:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ Exception -> 0x0095 }
        L_0x0077:
            com.ironsource.mediationsdk.a.c r8 = new com.ironsource.mediationsdk.a.c     // Catch:{ Exception -> 0x0095 }
            r5 = 2100(0x834, float:2.943E-42)
            r8.<init>(r5, r4)     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.a.d r4 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ Exception -> 0x0095 }
            r4.b((com.ironsource.mediationsdk.a.c) r8)     // Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x0094
            com.ironsource.mediationsdk.I r8 = r7.c     // Catch:{ Exception -> 0x0095 }
            r8.a((com.ironsource.mediationsdk.model.InterstitialPlacement) r3)     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.I r8 = r7.c     // Catch:{ Exception -> 0x0095 }
            r3.getPlacementName()     // Catch:{ Exception -> 0x0095 }
            r8.d()     // Catch:{ Exception -> 0x0095 }
        L_0x0094:
            return
        L_0x0095:
            r8 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r7.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r3.logException(r4, r0, r8)
            com.ironsource.mediationsdk.F r0 = com.ironsource.mediationsdk.F.a()
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError
            java.lang.String r8 = r8.getMessage()
            r3.<init>(r1, r8)
            r0.a((com.ironsource.mediationsdk.logger.IronSourceError) r3, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.h(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r3.b() != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r3.e() != false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0049 A[Catch:{ all -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004c A[Catch:{ all -> 0x006d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r9 = this;
            java.lang.String r0 = "isInterstitialReady():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.v     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f     // Catch:{ all -> 0x0072 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x0072 }
            return r2
        L_0x0013:
            boolean r3 = r9.H     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0034
            boolean r3 = r9.I     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.adunit.c.g r3 = r9.C     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0027
            boolean r3 = r3.b()     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0027
        L_0x0025:
            r3 = r1
            goto L_0x003f
        L_0x0027:
            r3 = r2
            goto L_0x003f
        L_0x0029:
            com.ironsource.mediationsdk.W r3 = r9.A     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0027
            boolean r3 = r3.f()     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0027
            goto L_0x0025
        L_0x0034:
            com.ironsource.mediationsdk.I r3 = r9.c     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0027
            boolean r3 = r3.e()     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0027
            goto L_0x0025
        L_0x003f:
            boolean r4 = r9.H     // Catch:{ all -> 0x006d }
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r4, r1)     // Catch:{ all -> 0x006d }
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x004c
            r6 = 2101(0x835, float:2.944E-42)
            goto L_0x004e
        L_0x004c:
            r6 = 2102(0x836, float:2.946E-42)
        L_0x004e:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x006d }
            com.ironsource.mediationsdk.a.d r4 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ all -> 0x006d }
            r4.b((com.ironsource.mediationsdk.a.c) r5)     // Catch:{ all -> 0x006d }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f     // Catch:{ all -> 0x006d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r6.<init>(r0)     // Catch:{ all -> 0x006d }
            r6.append(r3)     // Catch:{ all -> 0x006d }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006d }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x006d }
            r2 = r3
            goto L_0x0090
        L_0x006d:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x0074
        L_0x0072:
            r3 = move-exception
            r4 = r2
        L_0x0074:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r4 = "isInterstitialReady()"
            r0.logException(r1, r4, r3)
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.h():boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        l lVar = this.i;
        return (lVar == null || lVar.c == null || this.i.c.b == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean i(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.w r0 = r4.M     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.x> r2 = r0.a     // Catch:{ all -> 0x0038 }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x0038 }
            r3 = 1
            if (r2 != 0) goto L_0x0016
            r0 = 2500(0x9c4, float:3.503E-42)
            com.ironsource.mediationsdk.C0038w.a((int) r0, (java.lang.String) r5)     // Catch:{ all -> 0x0038 }
        L_0x0014:
            r5 = r1
            goto L_0x0032
        L_0x0016:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.x> r0 = r0.a     // Catch:{ all -> 0x0038 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0038 }
            com.ironsource.mediationsdk.x r5 = (com.ironsource.mediationsdk.C0039x) r5     // Catch:{ all -> 0x0038 }
            boolean r0 = r5.b()     // Catch:{ all -> 0x0038 }
            r2 = 0
            if (r0 == 0) goto L_0x002c
            r0 = 2211(0x8a3, float:3.098E-42)
            com.ironsource.mediationsdk.C0038w.a((int) r0, (com.ironsource.mediationsdk.C0039x) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x0038 }
            r5 = r3
            goto L_0x0032
        L_0x002c:
            r0 = 2212(0x8a4, float:3.1E-42)
            com.ironsource.mediationsdk.C0038w.a((int) r0, (com.ironsource.mediationsdk.C0039x) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x0038 }
            goto L_0x0014
        L_0x0032:
            if (r5 == 0) goto L_0x0036
            monitor-exit(r4)
            return r3
        L_0x0036:
            monitor-exit(r4)
            return r1
        L_0x0038:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.i(java.lang.String):boolean");
    }

    public final void j(String str) {
        String str2 = "showOfferwall(" + str + ")";
        this.f.log(IronSourceLogger.IronSourceTag.API, str2, 1);
        try {
            if (!k()) {
                this.g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            com.ironsource.mediationsdk.model.k a2 = this.i.c.c.a(str);
            if (a2 == null) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a2 = this.i.c.c.a();
                if (a2 == null) {
                    this.f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.d.a(a2.b);
        } catch (Exception e2) {
            this.f.logException(IronSourceLogger.IronSourceTag.API, str2, e2);
            this.g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return i() && E();
    }

    public final InterstitialPlacement k(String str) {
        try {
            InterstitialPlacement s2 = s(str);
            if (s2 == null) {
                try {
                    this.f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    s2 = g();
                } catch (Exception unused) {
                    return s2;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + s2, 1);
            return s2;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        l lVar = this.i;
        return (lVar == null || lVar.c == null || this.i.c.c == null) ? false : true;
    }

    public final Placement l(String str) {
        try {
            Placement p2 = p(str);
            if (p2 == null) {
                try {
                    this.f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    p2 = b();
                } catch (Exception unused) {
                    return p2;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + p2, 1);
            return p2;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final boolean l() {
        try {
            S s2 = this.d;
            if (s2 != null) {
                return s2.a();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m() {
        /*
            r8 = this;
            r0 = 83005(0x1443d, float:1.16315E-40)
            r1 = 0
            a((int) r0, (org.json.JSONObject) r1)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            r0.info()
            com.ironsource.mediationsdk.utils.l r0 = r8.i
            if (r0 != 0) goto L_0x0019
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.String r2 = "bidding data cannot be retrieved, SDK not initialized"
            r0.error(r2)
            goto L_0x00ec
        L_0x0019:
            com.ironsource.mediationsdk.model.o r0 = r0.b
            java.lang.String r2 = "IronSource"
            com.ironsource.mediationsdk.model.NetworkSettings r0 = r0.a((java.lang.String) r2)
            if (r0 == 0) goto L_0x00ec
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.ironsource.mediationsdk.d r3 = com.ironsource.mediationsdk.C0019d.a()
            org.json.JSONObject r4 = r0.getApplicationSettings()
            r5 = 0
            r6 = 1
            com.ironsource.mediationsdk.AbstractAdapter r0 = r3.a(r0, r4, r6, r5)
            if (r0 == 0) goto L_0x003c
            org.json.JSONObject r2 = r0.getPlayerBiddingData()     // Catch:{ Exception -> 0x00cb }
        L_0x003c:
            com.ironsource.mediationsdk.utils.l r0 = r8.i     // Catch:{ Exception -> 0x00cb }
            com.ironsource.mediationsdk.model.h r0 = r0.c     // Catch:{ Exception -> 0x00cb }
            com.ironsource.sdk.controller.u r0 = r0.e     // Catch:{ Exception -> 0x00cb }
            com.ironsource.mediationsdk.utils.p r0 = r0.c()     // Catch:{ Exception -> 0x00cb }
            boolean r3 = r0.d     // Catch:{ Exception -> 0x00cb }
            if (r3 == 0) goto L_0x005b
            com.ironsource.environment.f.b r2 = new com.ironsource.environment.f.b     // Catch:{ Exception -> 0x00cb }
            r2.<init>()     // Catch:{ Exception -> 0x00cb }
            org.json.JSONObject r2 = r2.a()     // Catch:{ Exception -> 0x00cb }
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C0021f.a()     // Catch:{ Exception -> 0x00cb }
            r3.a((org.json.JSONObject) r2, (boolean) r6)     // Catch:{ Exception -> 0x00cb }
            goto L_0x0067
        L_0x005b:
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C0021f.a()     // Catch:{ Exception -> 0x00cb }
            org.json.JSONObject r4 = r0.c     // Catch:{ Exception -> 0x00cb }
            java.util.ArrayList<java.lang.String> r5 = r0.a     // Catch:{ Exception -> 0x00cb }
            org.json.JSONObject r2 = r3.a((org.json.JSONObject) r2, (org.json.JSONObject) r4, (java.util.List<java.lang.String>) r5)     // Catch:{ Exception -> 0x00cb }
        L_0x0067:
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00cb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = "bidding data: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00cb }
            r4.append(r2)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00cb }
            r3.verbose(r4)     // Catch:{ Exception -> 0x00cb }
            if (r2 == 0) goto L_0x00ec
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00cb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = "raw biddingData length: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x00cb }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00cb }
            r4.append(r5)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00cb }
            r3.verbose(r4)     // Catch:{ Exception -> 0x00cb }
            boolean r0 = r0.e     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r0)     // Catch:{ Exception -> 0x00cb }
            goto L_0x00ac
        L_0x00a4:
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encrypt(r0)     // Catch:{ Exception -> 0x00cb }
        L_0x00ac:
            if (r0 == 0) goto L_0x00ed
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00c6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r4 = "biddingData length: "
            r3.<init>(r4)     // Catch:{ Exception -> 0x00c6 }
            int r4 = r0.length()     // Catch:{ Exception -> 0x00c6 }
            r3.append(r4)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00c6 }
            r2.verbose(r3)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00ed
        L_0x00c6:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x00cd
        L_0x00cb:
            r0 = move-exception
            r2 = r1
        L_0x00cd:
            r3 = 83007(0x1443f, float:1.16318E-40)
            a((int) r3, (org.json.JSONObject) r1)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "got error during creating the token: "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.error(r0)
            r0 = r2
            goto L_0x00ed
        L_0x00ec:
            r0 = r1
        L_0x00ed:
            if (r0 != 0) goto L_0x00f5
            r2 = 83006(0x1443e, float:1.16316E-40)
            a((int) r2, (org.json.JSONObject) r1)
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.m():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final boolean m(String str) {
        boolean z2 = false;
        if (this.v) {
            return false;
        }
        if (w(str) != k.a.d) {
            z2 = true;
        }
        if (z2) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.v, this.H, 1);
            try {
                mediationAdditionalData.put("placement", str);
                if (this.H) {
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                }
            } catch (Exception unused) {
            }
            d.d().b(new c(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public final boolean n() {
        return this.u || this.v || this.ab;
    }

    /* access modifiers changed from: package-private */
    public final boolean n(String str) {
        if (!F()) {
            return false;
        }
        com.ironsource.mediationsdk.model.g gVar = null;
        try {
            gVar = this.i.c.d.a(str);
            if (gVar == null && (gVar = this.i.c.d.a()) == null) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (gVar == null) {
            return false;
        }
        return k.b(ContextProvider.getInstance().getApplicationContext(), gVar.getPlacementName());
    }

    /* access modifiers changed from: package-private */
    public int o(String str) {
        l lVar = this.i;
        if (lVar == null || lVar.c == null || this.i.c.a == null) {
            return k.a.d;
        }
        Placement placement = null;
        try {
            placement = p(str);
            if (placement == null && (placement = b()) == null) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return placement == null ? k.a.d : k.b(ContextProvider.getInstance().getApplicationContext(), placement);
    }
}
