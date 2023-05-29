package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.A;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.a;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.sdk.d;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.z  reason: case insensitive filesystem */
public final class C0041z extends A implements RewardedVideoSmashListener {
    /* access modifiers changed from: private */
    public d a;
    /* access modifiers changed from: private */
    public long b;

    C0041z(String str, String str2, NetworkSettings networkSettings, d dVar, long j, AbstractAdapter abstractAdapter) {
        super(new a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.e = new a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO);
        this.f = this.e.b;
        this.d = abstractAdapter;
        this.a = dVar;
        this.g = j;
        this.d.initRewardedVideoForDemandOnly(str, str2, this.f, this);
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyRewardedVideoSmash " + this.e.a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRewardedVideoSmash " + this.e.a.getProviderName() + " : " + str, 0);
    }

    public final void a() {
        d("showRewardedVideo state=" + i());
        if (a(A.a.LOADED, A.a.SHOW_IN_PROGRESS)) {
            this.d.showRewardedVideo(this.f, this);
            return;
        }
        this.a.a(new IronSourceError(IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    public final void a(String str, String str2, JSONObject jSONObject, List<String> list) {
        d("loadRewardedVideo state=" + i());
        A.a a2 = a(new A.a[]{A.a.NOT_LOADED, A.a.LOADED}, A.a.LOAD_IN_PROGRESS);
        if (a2 == A.a.NOT_LOADED || a2 == A.a.LOADED) {
            this.b = new Date().getTime();
            d("start timer");
            a((TimerTask) new TimerTask() {
                public final void run() {
                    C0041z zVar = C0041z.this;
                    zVar.d("load timed out state=" + C0041z.this.i());
                    if (C0041z.this.a(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
                        C0041z.this.a.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, "load timed out"), C0041z.this, new Date().getTime() - C0041z.this.b);
                    }
                }
            });
            if (k()) {
                this.h = str2;
                this.i = jSONObject;
                this.j = list;
                this.d.loadRewardedVideoForDemandOnlyForBidding(this.f, this, str);
                return;
            }
            this.d.loadRewardedVideoForDemandOnly(this.f, this);
        } else if (a2 == A.a.LOAD_IN_PROGRESS) {
            this.a.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0);
        } else {
            this.a.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "cannot load because show is in progress"), this, 0);
        }
    }

    public final boolean b() {
        return this.d.isRewardedVideoAvailable(this.f);
    }

    public final void onRewardedVideoAdClicked() {
        c("onRewardedVideoAdClicked");
        this.a.c(this);
    }

    public final void onRewardedVideoAdClosed() {
        a(A.a.NOT_LOADED);
        c("onRewardedVideoAdClosed");
        this.a.b(this);
    }

    public final void onRewardedVideoAdEnded() {
    }

    public final void onRewardedVideoAdOpened() {
        c("onRewardedVideoAdOpened");
        this.a.a(this);
    }

    public final void onRewardedVideoAdRewarded() {
        c("onRewardedVideoAdRewarded");
        this.a.e(this);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a(A.a.NOT_LOADED);
        c("onRewardedVideoAdClosed error=" + ironSourceError);
        this.a.a(ironSourceError, this);
    }

    public final void onRewardedVideoAdStarted() {
    }

    public final void onRewardedVideoAdVisible() {
        c("onRewardedVideoAdVisible");
        this.a.d(this);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        c("onRewardedVideoLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + i());
        j();
        if (a(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
            this.a.a(ironSourceError, this, new Date().getTime() - this.b);
        }
    }

    public final void onRewardedVideoLoadSuccess() {
        c("onRewardedVideoLoadSuccess state=" + i());
        j();
        if (a(A.a.LOAD_IN_PROGRESS, A.a.LOADED)) {
            this.a.a(this, new Date().getTime() - this.b);
        }
    }
}
