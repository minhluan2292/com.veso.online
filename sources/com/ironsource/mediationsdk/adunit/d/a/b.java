package com.ironsource.mediationsdk.adunit.d.a;

import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.c.a.c;
import com.ironsource.mediationsdk.adunit.d.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.f;
import java.util.HashMap;

public class b<Listener extends c> extends a<Listener> implements AdapterAdRewardListener {
    private f h;

    public b(a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
    }

    public void onAdClosed() {
        this.h = new f();
        super.onAdClosed();
    }

    public void onAdOpened() {
        this.h = null;
        super.onAdOpened();
    }

    public void onAdRewarded() {
        if (this.e != null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(c("placement name = " + q()));
            if (this.c != null) {
                HashMap hashMap = new HashMap();
                if (L.a().n != null) {
                    for (String next : L.a().n.keySet()) {
                        hashMap.put("custom_" + next, L.a().n.get(next));
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                this.c.d.a(q(), this.e.getRewardName(), this.e.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, l()), f.a(this.h), hashMap, L.a().m);
            }
            ((c) this.b).a(this, this.e);
            return;
        }
        IronLog.INTERNAL.verbose(c("placement is null "));
        if (this.c != null) {
            this.c.e.m("mCurrentPlacement is null");
        }
    }
}
