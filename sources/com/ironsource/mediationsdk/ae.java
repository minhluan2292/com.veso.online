package com.ironsource.mediationsdk;

import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.b;

public final class ae extends b {
    private static final ae c = new ae();
    public RewardedVideoListener a = null;
    public LevelPlayRewardedVideoBaseListener b;

    private ae() {
    }

    public static ae a() {
        return c;
    }

    public final void a(final AdInfo adInfo) {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.a != null) {
                        ae.this.a.onRewardedVideoAdOpened();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
                    }
                }
            });
        }
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.b != null) {
                        ae.this.b.onAdOpened(ae.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdOpened() adInfo = " + ae.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void a(final IronSourceError ironSourceError) {
        RewardedVideoListener rewardedVideoListener = this.a;
        if (rewardedVideoListener != null && (rewardedVideoListener instanceof RewardedVideoManualListener)) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.a != null) {
                        ((RewardedVideoManualListener) ae.this.a).onRewardedVideoAdLoadFailed(ironSourceError);
                        ae aeVar = ae.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.b;
        if (levelPlayRewardedVideoBaseListener != null && (levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.b != null) {
                        ((LevelPlayRewardedVideoManualListener) ae.this.b).onAdLoadFailed(ironSourceError);
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final void a(final IronSourceError ironSourceError, final AdInfo adInfo) {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.a != null) {
                        ae.this.a.onRewardedVideoAdShowFailed(ironSourceError);
                        ae aeVar = ae.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.b != null) {
                        ae.this.b.onAdShowFailed(ironSourceError, ae.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdShowFailed() adInfo = " + ae.this.f(adInfo) + ", error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final void a(final Placement placement, final AdInfo adInfo) {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.a != null) {
                        ae.this.a.onRewardedVideoAdRewarded(placement);
                        ae aeVar = ae.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdRewarded(" + placement + ")", 1);
                    }
                }
            });
        }
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.b != null) {
                        ae.this.b.onAdRewarded(placement, ae.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdRewarded() placement = " + placement + ", adInfo = " + ae.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void a(final boolean z, final AdInfo adInfo) {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.a != null) {
                        ae.this.a.onRewardedVideoAvailabilityChanged(z);
                        ae aeVar = ae.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAvailabilityChanged() available=" + z, 1);
                    }
                }
            });
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.b;
        if (levelPlayRewardedVideoBaseListener != null && (levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.b == null) {
                        return;
                    }
                    if (z) {
                        ((LevelPlayRewardedVideoListener) ae.this.b).onAdAvailable(ae.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdAvailable() adInfo = " + ae.this.f(adInfo));
                        return;
                    }
                    ((LevelPlayRewardedVideoListener) ae.this.b).onAdUnavailable();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                }
            });
        }
    }

    public final void b() {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.a != null) {
                        ae.this.a.onRewardedVideoAdStarted();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
                    }
                }
            });
        }
    }

    public final void b(final AdInfo adInfo) {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.a != null) {
                        ae.this.a.onRewardedVideoAdClosed();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
                    }
                }
            });
        }
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.b != null) {
                        ae.this.b.onAdClosed(ae.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClosed() adInfo = " + ae.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void b(final Placement placement, final AdInfo adInfo) {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.a != null) {
                        ae.this.a.onRewardedVideoAdClicked(placement);
                        ae aeVar = ae.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClicked(" + placement + ")", 1);
                    }
                }
            });
        }
        if (this.b != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.b != null) {
                        ae.this.b.onAdClicked(placement, ae.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClicked() placement = " + placement + ", adInfo = " + ae.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void c() {
        if (this.a != null) {
            c.a.b(new Runnable() {
                public final void run() {
                    if (ae.this.a != null) {
                        ae.this.a.onRewardedVideoAdEnded();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
                    }
                }
            });
        }
    }
}
