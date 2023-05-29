package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.a.d;
import com.ironsource.mediationsdk.b.c;
import com.ironsource.mediationsdk.c.b;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.g;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.f;
import java.util.Map;
import org.json.JSONObject;

public final class V extends ac implements c.a, BannerSmashListener {
    String a;
    private b b;
    private c j;
    private a k;
    private U l;
    private IronSourceBannerLayout m;
    private JSONObject n;
    private int o;
    private String p;
    private g q;
    private final Object r;
    private f s;
    private boolean t;
    private boolean u;

    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    V(b bVar, U u2, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2, boolean z) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.r = new Object();
        this.k = a.NONE;
        this.b = bVar;
        this.j = new c(bVar.f());
        this.l = u2;
        this.h = i;
        this.a = str;
        this.o = i2;
        this.p = str2;
        this.n = jSONObject;
        this.t = z;
        this.c.addBannerListener(this);
        if (h() || i()) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isBidder = " + h() + ", shouldEarlyInit = " + i());
            this.u = true;
            f();
        }
    }

    V(b bVar, U u2, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, boolean z) {
        this(bVar, u2, networkSettings, abstractAdapter, i, "", (JSONObject) null, 0, "", z);
    }

    private void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(s() + "state = " + aVar.name());
        synchronized (this.r) {
            this.k = aVar;
        }
    }

    private void a(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 606) {
            a(this.t ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.s))}});
        } else {
            a(this.t ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(f.a(this.s))}});
        }
        U u2 = this.l;
        if (u2 != null) {
            u2.a(ironSourceError, this);
        }
    }

    private void a(String str) {
        IronLog.INTERNAL.verbose(q());
        if (a(a.READY_TO_LOAD, a.LOADING)) {
            this.s = new f();
            a(this.t ? IronSourceConstants.BN_INSTANCE_RELOAD : IronSourceConstants.BN_INSTANCE_LOAD, (Object[][]) null);
            if (this.c != null) {
                try {
                    if (h()) {
                        this.c.loadBannerForBidding(this.m, this.f, this, str);
                    } else {
                        this.c.loadBanner(this.m, this.f, this);
                    }
                } catch (Exception e) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("Exception while trying to load banner from " + this.c.getProviderName() + ", exception =  " + e.getLocalizedMessage());
                    e.printStackTrace();
                    onBannerAdLoadFailed(new IronSourceError(605, e.getLocalizedMessage()));
                    a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
                }
            }
        } else {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("wrong state - state = " + this.k);
        }
    }

    private static boolean a(int i) {
        return i == 3005 || i == 3002 || i == 3012 || i == 3015 || i == 3008 || i == 3305 || i == 3300 || i == 3306 || i == 3307 || i == 3302 || i == 3303 || i == 3304 || i == 3009;
    }

    private boolean a(a aVar, a aVar2) {
        boolean z;
        synchronized (this.r) {
            if (this.k == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(s() + "set state from '" + this.k + "' to '" + aVar2 + "'");
                z = true;
                this.k = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    private void b(int i) {
        a(i, (Object[][]) null);
    }

    private void f() {
        IronLog.INTERNAL.verbose();
        a(a.INIT_IN_PROGRESS);
        g();
        try {
            if (this.c == null) {
                return;
            }
            if (h()) {
                this.c.initBannerForBidding(this.b.a(), this.b.b(), this.f, this);
            } else {
                this.c.initBanners(this.b.a(), this.b.b(), this.f, this);
            }
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to init banner from " + this.c.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            onBannerInitFailed(new IronSourceError(612, th.getLocalizedMessage()));
            a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
        }
    }

    private void g() {
        if (this.c != null) {
            try {
                String str = L.a().l;
                if (!TextUtils.isEmpty(str)) {
                    this.c.setMediationSegment(str);
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
                }
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("Exception while trying to set custom params from " + this.c.getProviderName() + ", exception =  " + e.getLocalizedMessage());
                e.printStackTrace();
                a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
            }
        }
    }

    private boolean r() {
        boolean z;
        synchronized (this.r) {
            z = this.k == a.LOADED;
        }
        return z;
    }

    private String s() {
        return String.format("%s - ", new Object[]{q()});
    }

    private boolean t() {
        IronSourceBannerLayout ironSourceBannerLayout = this.m;
        return ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed();
    }

    public final void a() {
        IronLog.INTERNAL.verbose(q());
        a(a.DESTROYED);
        if (this.c == null) {
            IronLog.INTERNAL.warning("mAdapter == null");
            return;
        }
        try {
            this.c.destroyBanner(this.d.a.getBannerSettings());
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to destroy banner from " + this.c.getProviderName() + ", exception =  " + e.getLocalizedMessage());
            e.printStackTrace();
            a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
        }
        b(IronSourceConstants.BN_INSTANCE_DESTROY);
    }

    public final void a(int i, Object[][] objArr) {
        Map<String, Object> o2 = o();
        if (t()) {
            o2.put(IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed");
        } else {
            C0033r.a(o2, this.m.getSize());
        }
        if (!TextUtils.isEmpty(this.a)) {
            o2.put("auctionId", this.a);
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null && jSONObject.length() > 0) {
            o2.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.n);
        }
        g gVar = this.q;
        if (gVar != null) {
            o2.put("placement", gVar.getPlacementName());
        }
        if (a(i)) {
            d.d();
            d.a(o2, this.o, this.p);
        }
        o2.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    o2.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(l() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e));
            }
        }
        d.d().b(new com.ironsource.mediationsdk.a.c(i, new JSONObject(o2)));
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, g gVar, String str) {
        U u2;
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(q());
        this.q = gVar;
        if (!C0033r.a(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            IronLog.INTERNAL.verbose(str2);
            u2 = this.l;
            ironSourceError = new IronSourceError(610, str2);
        } else if (this.c == null) {
            IronLog.INTERNAL.verbose("mAdapter is null");
            u2 = this.l;
            ironSourceError = new IronSourceError(611, "mAdapter is null");
        } else {
            this.m = ironSourceBannerLayout;
            this.j.a(this);
            try {
                if (h()) {
                    a(str);
                    return;
                } else {
                    f();
                    return;
                }
            } catch (Throwable th) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception = " + th.getLocalizedMessage());
                th.printStackTrace();
                onBannerAdLoadFailed(new IronSourceError(605, th.getLocalizedMessage()));
                return;
            }
        }
        u2.a(ironSourceError, this);
    }

    public final void b() {
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(q());
        if (a(a.INIT_IN_PROGRESS, a.LOAD_FAILED)) {
            IronLog.INTERNAL.verbose("init timed out");
            ironSourceError = new IronSourceError(607, "Timed out");
        } else if (a(a.LOADING, a.LOAD_FAILED)) {
            IronLog.INTERNAL.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("unexpected state - " + this.k);
            return;
        }
        a(ironSourceError);
    }

    public final Map<String, Object> c() {
        try {
            if (!h() || this.c == null) {
                return null;
            }
            return this.c.getBannerBiddingData(this.f);
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to getBannerBiddingData from " + this.c.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    public final void d() {
        this.j.c();
        super.d();
    }

    public final void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(q());
        a((int) IronSourceConstants.BN_INSTANCE_CLICK, (Object[][]) null);
        U u2 = this.l;
        if (u2 != null) {
            u2.a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(q());
        a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, (Object[][]) null);
        U u2 = this.l;
        if (u2 != null) {
            u2.d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(s() + "error = " + ironSourceError);
        this.j.d();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(q());
        this.j.d();
        if (a(a.LOADING, a.LOADED)) {
            a(this.t ? IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(f.a(this.s))}});
            U u2 = this.l;
            if (u2 != null) {
                u2.a(this, view, layoutParams);
                return;
            }
            return;
        }
        a(this.t ? IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, (Object[][]) null);
    }

    public final void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(q());
        a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, (Object[][]) null);
        U u2 = this.l;
        if (u2 != null) {
            u2.b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(q());
        a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, (Object[][]) null);
        U u2 = this.l;
        if (u2 != null) {
            u2.c(this);
        }
    }

    public final void onBannerAdShown() {
        IronLog.INTERNAL.verbose(q());
        if (r()) {
            a((int) IronSourceConstants.BN_INSTANCE_SHOW, (Object[][]) null);
            U u2 = this.l;
            if (u2 != null) {
                u2.e(this);
                return;
            }
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("wrong state - mState = " + this.k);
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.k}, new Object[]{IronSourceConstants.EVENTS_EXT1, l()}});
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(s() + "error = " + ironSourceError);
        this.j.d();
        if (a(a.INIT_IN_PROGRESS, a.NONE)) {
            U u2 = this.l;
            if (u2 != null) {
                u2.a(new IronSourceError(612, "Banner init failed"), this);
                return;
            }
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.warning("wrong state - mState = " + this.k);
    }

    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(q());
        if (!a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            return;
        }
        if (this.u) {
            this.u = false;
        } else if (h()) {
        } else {
            if (!C0033r.a(this.m)) {
                this.l.a(new IronSourceError(605, this.m == null ? "banner is null" : "banner is destroyed"), this);
            } else {
                a((String) null);
            }
        }
    }
}
