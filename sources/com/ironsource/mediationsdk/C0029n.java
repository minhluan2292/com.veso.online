package com.ironsource.mediationsdk;

import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.b;

/* renamed from: com.ironsource.mediationsdk.n  reason: case insensitive filesystem */
public final class C0029n extends b {
    private static final C0029n c = new C0029n();
    /* access modifiers changed from: package-private */
    public BannerListener a = null;
    /* access modifiers changed from: package-private */
    public LevelPlayBannerListener b = null;

    private C0029n() {
    }

    public static C0029n a() {
        return c;
    }

    public final void a(final AdInfo adInfo) {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0029n.this.a != null) {
                        C0029n.this.a.onBannerAdScreenPresented();
                        IronLog.CALLBACK.info("onBannerAdScreenPresented()");
                    }
                }
            });
        }
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0029n.this.b != null) {
                        C0029n.this.b.onAdScreenPresented(C0029n.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdScreenPresented() adInfo = " + C0029n.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void a(final AdInfo adInfo, boolean z) {
        if (this.a != null && !z) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0029n.this.a != null) {
                        C0029n.this.a.onBannerAdLoaded();
                        IronLog.CALLBACK.info("onBannerAdLoaded()");
                    }
                }
            });
        }
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0029n.this.b != null) {
                        C0029n.this.b.onAdLoaded(C0029n.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoaded() adInfo = " + C0029n.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void a(final IronSourceError ironSourceError, boolean z) {
        if (this.a != null && !z) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0029n.this.a != null) {
                        C0029n.this.a.onBannerAdLoadFailed(ironSourceError);
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onBannerAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0029n.this.b != null) {
                        C0029n.this.b.onAdLoadFailed(ironSourceError);
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final void b(final AdInfo adInfo) {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0029n.this.a != null) {
                        C0029n.this.a.onBannerAdScreenDismissed();
                        IronLog.CALLBACK.info("onBannerAdScreenDismissed()");
                    }
                }
            });
        }
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0029n.this.b != null) {
                        C0029n.this.b.onAdScreenDismissed(C0029n.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdScreenDismissed() adInfo = " + C0029n.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void c(final AdInfo adInfo) {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0029n.this.a != null) {
                        C0029n.this.a.onBannerAdLeftApplication();
                        IronLog.CALLBACK.info("onBannerAdLeftApplication()");
                    }
                }
            });
        }
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0029n.this.b != null) {
                        C0029n.this.b.onAdLeftApplication(C0029n.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLeftApplication() adInfo = " + C0029n.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void d(final AdInfo adInfo) {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0029n.this.a != null) {
                        C0029n.this.a.onBannerAdClicked();
                        IronLog.CALLBACK.info("onBannerAdClicked()");
                    }
                }
            });
        }
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (C0029n.this.b != null) {
                        C0029n.this.b.onAdClicked(C0029n.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClicked() adInfo = " + C0029n.this.f(adInfo));
                    }
                }
            });
        }
    }
}
