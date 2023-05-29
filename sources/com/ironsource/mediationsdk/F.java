package com.ironsource.mediationsdk;

import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.b;

public final class F extends b {
    private static final F a = new F();
    /* access modifiers changed from: private */
    public InterstitialListener b = null;
    /* access modifiers changed from: private */
    public LevelPlayInterstitialListener c;

    private F() {
    }

    public static synchronized F a() {
        F f;
        synchronized (F.class) {
            f = a;
        }
        return f;
    }

    public final void a(final AdInfo adInfo) {
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.b != null) {
                        F.this.b.onInterstitialAdReady();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
                    }
                }
            });
        }
        if (this.c != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.c != null) {
                        F.this.c.onAdReady(F.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdReady() adInfo = " + F.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void a(final IronSourceError ironSourceError) {
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.b != null) {
                        F.this.b.onInterstitialAdLoadFailed(ironSourceError);
                        F f = F.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
        if (this.c != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.c != null) {
                        F.this.c.onAdLoadFailed(ironSourceError);
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final void a(final IronSourceError ironSourceError, final AdInfo adInfo) {
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.b != null) {
                        F.this.b.onInterstitialAdShowFailed(ironSourceError);
                        F f = F.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
        if (this.c != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.c != null) {
                        F.this.c.onAdShowFailed(ironSourceError, F.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdShowFailed() adInfo = " + F.this.f(adInfo) + ", error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final synchronized void a(InterstitialListener interstitialListener) {
        this.b = interstitialListener;
    }

    public final synchronized void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.c = levelPlayInterstitialListener;
    }

    public final void b(final AdInfo adInfo) {
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.b != null) {
                        F.this.b.onInterstitialAdOpened();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
                    }
                }
            });
        }
        if (this.c != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.c != null) {
                        F.this.c.onAdOpened(F.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdOpened() adInfo = " + F.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void c(final AdInfo adInfo) {
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.b != null) {
                        F.this.b.onInterstitialAdClosed();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
                    }
                }
            });
        }
        if (this.c != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.c != null) {
                        F.this.c.onAdClosed(F.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClosed() adInfo = " + F.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void d(final AdInfo adInfo) {
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.b != null) {
                        F.this.b.onInterstitialAdShowSucceeded();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
                    }
                }
            });
        }
        if (this.c != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.c != null) {
                        F.this.c.onAdShowSucceeded(F.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdShowSucceeded() adInfo = " + F.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void e(final AdInfo adInfo) {
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.b != null) {
                        F.this.b.onInterstitialAdClicked();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
                    }
                }
            });
        }
        if (this.c != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (F.this.c != null) {
                        F.this.c.onAdClicked(F.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClicked() adInfo = " + F.this.f(adInfo));
                    }
                }
            });
        }
    }
}
