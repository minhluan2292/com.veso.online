package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.a.c;
import com.ironsource.mediationsdk.adunit.d.a.b;
import com.ironsource.mediationsdk.ae;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Set;

public abstract class f<Smash extends b<?>> extends d<Smash, BaseAdInteractionAdapter<?, AdapterAdRewardListener>> implements c {
    public f(a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    public final void a(b<?> bVar, Placement placement) {
        IronLog.INTERNAL.verbose(a(bVar.m()));
        b bVar2 = this.r;
        AdInfo a = this.a.a(bVar.o());
        if (bVar2.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().a(placement, a);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar2.a);
    }
}
