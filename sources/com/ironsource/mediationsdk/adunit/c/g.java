package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.C0019d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.d.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.adunit.d.b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;

public final class g extends d<b, BaseAdInteractionAdapter<?, AdapterAdInteractionListener>> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> r18, com.ironsource.mediationsdk.model.i r19, java.lang.String r20, java.util.Set<com.ironsource.mediationsdk.impressionData.ImpressionDataListener> r21, com.ironsource.mediationsdk.IronSourceSegment r22) {
        /*
            r17 = this;
            r0 = r19
            com.ironsource.mediationsdk.adunit.c.a r10 = new com.ironsource.mediationsdk.adunit.c.a
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL
            com.ironsource.mediationsdk.utils.c r4 = r0.i
            int r5 = r0.c
            int r6 = r0.e
            int r7 = r0.f
            com.ironsource.mediationsdk.adunit.c.b.a r9 = new com.ironsource.mediationsdk.adunit.c.b.a
            com.ironsource.mediationsdk.adunit.c.b.a$a r12 = com.ironsource.mediationsdk.adunit.c.b.a.C0009a.MANUAL
            com.ironsource.mediationsdk.utils.c r2 = r0.i
            long r13 = r2.l
            com.ironsource.mediationsdk.utils.c r0 = r0.i
            long r2 = r0.k
            r11 = r9
            r15 = r2
            r11.<init>(r12, r13, r15)
            r8 = -1
            r0 = r10
            r2 = r20
            r3 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r17
            r1 = r21
            r2 = r22
            r0.<init>(r10, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.g.<init>(java.util.List, com.ironsource.mediationsdk.model.i, java.lang.String, java.util.Set, com.ironsource.mediationsdk.IronSourceSegment):void");
    }

    private static BaseAdInteractionAdapter<?, AdapterAdInteractionListener> b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> b = C0019d.a().b(networkSettings, ad_unit);
        if (b == null || !(b instanceof BaseAdInteractionAdapter)) {
            return null;
        }
        try {
            return (BaseAdInteractionAdapter) b;
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception creating adapter - " + e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ BaseAdAdapter a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        return b(networkSettings, ad_unit);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ c a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str) {
        return new b(new a(IronSource.AD_UNIT.INTERSTITIAL, this.m.b, i, this.h, str, this.f, this.g, networkSettings, this.m.g), (BaseAdInteractionAdapter) baseAdAdapter, this);
    }
}
