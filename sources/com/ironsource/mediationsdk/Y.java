package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.C0017b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public final class Y extends ac implements InterstitialSmashListener {
    /* access modifiers changed from: package-private */
    public a a = a.NO_INIT;
    /* access modifiers changed from: private */
    public X b;
    private Timer j;
    private int k;
    private String l;
    private String m;
    /* access modifiers changed from: private */
    public long n;
    private final Object o = new Object();
    private boolean p;

    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    public Y(String str, String str2, NetworkSettings networkSettings, X x, int i, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.l = str;
        this.m = str2;
        this.b = x;
        this.j = null;
        this.k = i;
        this.c.addInterstitialListener(this);
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        d("current state=" + this.a + ", new state=" + aVar);
        this.a = aVar;
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + l() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + l() + " : " + str, 0);
    }

    private void e(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + l() + " : " + str, 3);
    }

    private void r() {
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
            d("setCustomParams() " + e.getMessage());
        }
    }

    private void s() {
        synchronized (this.o) {
            Timer timer = this.j;
            if (timer != null) {
                timer.cancel();
                this.j = null;
            }
        }
    }

    private void t() {
        synchronized (this.o) {
            d("start timer");
            s();
            Timer timer = new Timer();
            this.j = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    Y y = Y.this;
                    y.d("timed out state=" + Y.this.a.name() + " isBidder=" + Y.this.h());
                    if (Y.this.a != a.INIT_IN_PROGRESS || !Y.this.h()) {
                        Y.this.a(a.LOAD_FAILED);
                        Y.this.b.a(ErrorBuilder.buildLoadFailedError("timed out"), Y.this, new Date().getTime() - Y.this.n);
                        return;
                    }
                    Y.this.a(a.NO_INIT);
                }
            }, (long) (this.k * 1000));
        }
    }

    public final Map<String, Object> a() {
        try {
            if (h()) {
                return this.c.getInterstitialBiddingData(this.f);
            }
            return null;
        } catch (Throwable th) {
            e("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    public final void a(String str) {
        try {
            this.n = new Date().getTime();
            d("loadInterstitial");
            this.e = false;
            if (h()) {
                t();
                a(a.LOAD_IN_PROGRESS);
                this.c.loadInterstitialForBidding(this.f, this, str);
            } else if (this.a == a.NO_INIT) {
                t();
                a(a.INIT_IN_PROGRESS);
                r();
                this.c.initInterstitial(this.l, this.m, this.f, this);
            } else {
                t();
                a(a.LOAD_IN_PROGRESS);
                this.c.loadInterstitial(this.f, this);
            }
        } catch (Throwable th) {
            e("loadInterstitial exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
        }
    }

    public final void b() {
        d("isBidder = " + h() + ", shouldEarlyInit = " + i());
        this.p = true;
        a(a.INIT_IN_PROGRESS);
        r();
        try {
            if (h()) {
                this.c.initInterstitialForBidding(this.l, this.m, this.f, this);
            } else {
                this.c.initInterstitial(this.l, this.m, this.f, this);
            }
        } catch (Throwable th) {
            e(l() + " initForBidding exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void c() {
        try {
            this.c.showInterstitial(this.f, this);
        } catch (Throwable th) {
            e(l() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void f() {
        this.c.setMediationState(C0017b.a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
    }

    public final boolean g() {
        try {
            return this.c.isInterstitialReady(this.f);
        } catch (Throwable th) {
            e("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return false;
        }
    }

    public final void onInterstitialAdClicked() {
        c("onInterstitialAdClicked");
        this.b.d(this);
    }

    public final void onInterstitialAdClosed() {
        c("onInterstitialAdClosed");
        this.b.b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.a.name());
        s();
        if (this.a == a.LOAD_IN_PROGRESS) {
            a(a.LOAD_FAILED);
            this.b.a(ironSourceError, this, new Date().getTime() - this.n);
        }
    }

    public final void onInterstitialAdOpened() {
        c("onInterstitialAdOpened");
        this.b.a(this);
    }

    public final void onInterstitialAdReady() {
        c("onInterstitialAdReady state=" + this.a.name());
        s();
        if (this.a == a.LOAD_IN_PROGRESS) {
            a(a.LOADED);
            this.b.a(this, new Date().getTime() - this.n);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.b.a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
        c("onInterstitialAdShowSucceeded");
        this.b.c(this);
    }

    public final void onInterstitialAdVisible() {
        c("onInterstitialAdVisible");
        this.b.e(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        c("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.a.name());
        if (this.a == a.INIT_IN_PROGRESS) {
            s();
            a(a.NO_INIT);
            this.b.b(ironSourceError, this);
            if (!h()) {
                this.b.a(ironSourceError, this, new Date().getTime() - this.n);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        c("onInterstitialInitSuccess state=" + this.a.name());
        if (this.a == a.INIT_IN_PROGRESS) {
            s();
            if (h() || this.p) {
                this.p = false;
                a(a.INIT_SUCCESS);
            } else {
                a(a.LOAD_IN_PROGRESS);
                t();
                try {
                    this.c.loadInterstitial(this.f, this);
                } catch (Throwable th) {
                    e("onInterstitialInitSuccess exception: " + th.getLocalizedMessage());
                    th.printStackTrace();
                    onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
                }
            }
            this.b.f(this);
        }
    }
}
