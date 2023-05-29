package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.F;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.ae;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

final class b {
    IronSource.AD_UNIT a;

    public b(IronSource.AD_UNIT ad_unit) {
        this.a = ad_unit;
    }

    /* access modifiers changed from: package-private */
    public final void a(IronSourceError ironSourceError) {
        if (this.a == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().a(ironSourceError);
        } else if (this.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.a == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().a(ironSourceError, adInfo);
        } else if (this.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().a(ironSourceError, adInfo);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z, AdInfo adInfo) {
        if (this.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().a(z, adInfo);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + this.a);
    }
}
