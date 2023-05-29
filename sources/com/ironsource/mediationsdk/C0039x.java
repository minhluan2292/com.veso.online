package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.A;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.a;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.c;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.x  reason: case insensitive filesystem */
public final class C0039x extends A implements InterstitialSmashListener {
    /* access modifiers changed from: private */
    public c a;
    /* access modifiers changed from: private */
    public long b;

    public C0039x(String str, String str2, NetworkSettings networkSettings, c cVar, long j, AbstractAdapter abstractAdapter) {
        super(new a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.a = cVar;
        this.g = j;
        this.d.initInterstitial(str, str2, this.f, this);
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyInterstitialSmash " + this.e.a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyInterstitialSmash " + this.e.a.getProviderName() + " : " + str, 0);
    }

    public final void a() {
        d("showInterstitial state=" + i());
        if (a(A.a.LOADED, A.a.SHOW_IN_PROGRESS)) {
            this.d.showInterstitial(this.f, this);
            return;
        }
        this.a.a(new IronSourceError(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    public final void a(String str, String str2, JSONObject jSONObject, List<String> list) {
        d("loadInterstitial state=" + i());
        A.a a2 = a(new A.a[]{A.a.NOT_LOADED, A.a.LOADED}, A.a.LOAD_IN_PROGRESS);
        if (a2 == A.a.NOT_LOADED || a2 == A.a.LOADED) {
            this.b = new Date().getTime();
            d("start timer");
            a((TimerTask) new TimerTask() {
                public final void run() {
                    C0039x xVar = C0039x.this;
                    xVar.d("load timed out state=" + C0039x.this.i());
                    if (C0039x.this.a(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
                        C0039x.this.a.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_TIMED_OUT, "load timed out"), C0039x.this, new Date().getTime() - C0039x.this.b);
                    }
                }
            });
            if (k()) {
                this.h = str2;
                this.i = jSONObject;
                this.j = list;
                this.d.loadInterstitialForBidding(this.f, this, str);
                return;
            }
            this.d.loadInterstitial(this.f, this);
        } else if (a2 == A.a.LOAD_IN_PROGRESS) {
            this.a.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0);
        } else {
            this.a.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "cannot load because show is in progress"), this, 0);
        }
    }

    public final boolean b() {
        return this.d.isInterstitialReady(this.f);
    }

    public final void onInterstitialAdClicked() {
        c("onInterstitialAdClicked");
        this.a.c(this);
    }

    public final void onInterstitialAdClosed() {
        a(A.a.NOT_LOADED);
        c("onInterstitialAdClosed");
        this.a.b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + i());
        j();
        if (a(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
            this.a.a(ironSourceError, this, new Date().getTime() - this.b);
        }
    }

    public final void onInterstitialAdOpened() {
        c("onInterstitialAdOpened");
        this.a.a(this);
    }

    public final void onInterstitialAdReady() {
        c("onInterstitialAdReady state=" + i());
        j();
        if (a(A.a.LOAD_IN_PROGRESS, A.a.LOADED)) {
            this.a.a(this, new Date().getTime() - this.b);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        a(A.a.NOT_LOADED);
        c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.a.a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
    }

    public final void onInterstitialAdVisible() {
        c("onInterstitialAdVisible");
        this.a.d(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    public final void onInterstitialInitSuccess() {
    }
}
