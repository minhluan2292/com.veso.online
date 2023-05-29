package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.q  reason: case insensitive filesystem */
public final class C0032q implements BannerSmashListener {
    public AbstractAdapter a;
    public NetworkSettings b;
    /* access modifiers changed from: package-private */
    public com.ironsource.mediationsdk.sdk.a c;
    boolean d;
    IronSourceBannerLayout e;
    public int f;
    private Timer g;
    private long h;
    /* access modifiers changed from: private */
    public a i = a.NO_INIT;

    /* renamed from: com.ironsource.mediationsdk.q$a */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    C0032q(com.ironsource.mediationsdk.sdk.a aVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, long j, int i2) {
        this.f = i2;
        this.c = aVar;
        this.a = abstractAdapter;
        this.b = networkSettings;
        this.h = j;
        abstractAdapter.addBannerListener(this);
    }

    private void a(String str, String str2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, str + " Banner exception: " + a() + " | " + str2, 3);
    }

    private void c() {
        if (this.a != null) {
            try {
                String str = L.a().l;
                if (!TextUtils.isEmpty(str)) {
                    this.a.setMediationSegment(str);
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
                }
            } catch (Exception e2) {
                a(":setCustomParams():" + e2.toString());
            }
        }
    }

    private void d() {
        try {
            Timer timer = this.g;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e2) {
            a("stopLoadTimer", e2.getLocalizedMessage());
        } finally {
            this.g = null;
        }
    }

    public final String a() {
        return this.b.isMultipleInstances() ? this.b.getProviderTypeForReflection() : this.b.getProviderName();
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        a("loadBanner");
        this.d = false;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            a("loadBanner - bannerLayout is null or destroyed");
            this.c.a(new IronSourceError(610, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false);
        } else if (this.a == null) {
            a("loadBanner - mAdapter is null");
            this.c.a(new IronSourceError(611, "adapter==null"), this, false);
        } else {
            this.e = ironSourceBannerLayout;
            b();
            if (this.i == a.NO_INIT) {
                a(a.INIT_IN_PROGRESS);
                c();
                this.a.initBanners(str, str2, this.b.getBannerSettings(), this);
                return;
            }
            a(a.LOAD_IN_PROGRESS);
            this.a.loadBanner(ironSourceBannerLayout, this.b.getBannerSettings(), this);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.i = aVar;
        a("state=" + aVar.name());
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
        logger.log(ironSourceTag, "BannerSmash " + a() + " " + str, 1);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        try {
            d();
            Timer timer = new Timer();
            this.g = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    com.ironsource.mediationsdk.sdk.a b;
                    IronSourceError ironSourceError;
                    cancel();
                    if (C0032q.this.i == a.INIT_IN_PROGRESS) {
                        C0032q.this.a(a.NO_INIT);
                        C0032q.this.a("init timed out");
                        b = C0032q.this.c;
                        ironSourceError = new IronSourceError(607, "Timed out");
                    } else if (C0032q.this.i == a.LOAD_IN_PROGRESS) {
                        C0032q.this.a(a.LOAD_FAILED);
                        C0032q.this.a("load timed out");
                        b = C0032q.this.c;
                        ironSourceError = new IronSourceError(608, "Timed out");
                    } else if (C0032q.this.i == a.LOADED) {
                        C0032q.this.a(a.LOAD_FAILED);
                        C0032q.this.a("reload timed out");
                        C0032q.this.c.b(new IronSourceError(609, "Timed out"), C0032q.this, false);
                        return;
                    } else {
                        return;
                    }
                    b.a(ironSourceError, C0032q.this, false);
                }
            }, this.h);
        } catch (Exception e2) {
            a("startLoadTimer", e2.getLocalizedMessage());
        }
    }

    public final void onBannerAdClicked() {
        com.ironsource.mediationsdk.sdk.a aVar = this.c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        com.ironsource.mediationsdk.sdk.a aVar = this.c;
        if (aVar != null) {
            aVar.d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        a("onBannerAdLoadFailed()");
        d();
        boolean z = ironSourceError.getErrorCode() == 606;
        if (this.i == a.LOAD_IN_PROGRESS) {
            a(a.LOAD_FAILED);
            this.c.a(ironSourceError, this, z);
        } else if (this.i == a.LOADED) {
            this.c.b(ironSourceError, this, z);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        a("onBannerAdLoaded()");
        d();
        if (this.i == a.LOAD_IN_PROGRESS) {
            a(a.LOADED);
            this.c.a(this, view, layoutParams);
        } else if (this.i == a.LOADED) {
            this.c.a(this, view, layoutParams, this.a.shouldBindBannerViewOnReload());
        }
    }

    public final void onBannerAdScreenDismissed() {
        com.ironsource.mediationsdk.sdk.a aVar = this.c;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        com.ironsource.mediationsdk.sdk.a aVar = this.c;
        if (aVar != null) {
            aVar.c(this);
        }
    }

    public final void onBannerAdShown() {
        com.ironsource.mediationsdk.sdk.a aVar = this.c;
        if (aVar != null) {
            aVar.e(this);
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        d();
        if (this.i == a.INIT_IN_PROGRESS) {
            this.c.a(new IronSourceError(612, "Banner init failed"), this, false);
            a(a.NO_INIT);
        }
    }

    public final void onBannerInitSuccess() {
        d();
        if (this.i == a.INIT_IN_PROGRESS) {
            IronSourceBannerLayout ironSourceBannerLayout = this.e;
            if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
                this.c.a(new IronSourceError(605, this.e == null ? "banner is null" : "banner is destroyed"), this, false);
                return;
            }
            b();
            a(a.LOAD_IN_PROGRESS);
            this.a.loadBanner(this.e, this.b.getBannerSettings(), this);
        }
    }
}
