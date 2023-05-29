package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0023h;
import com.ironsource.mediationsdk.C0025j;
import com.ironsource.mediationsdk.F;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.c.e;
import com.ironsource.mediationsdk.adunit.d.a.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.ae;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.server.b;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.o;
import java.util.Iterator;
import java.util.Set;

public abstract class d<Smash extends a<?>, Adapter extends BaseAdInteractionAdapter<?, ? extends AdapterAdInteractionListener>> extends e<Smash, Adapter> implements com.ironsource.mediationsdk.adunit.c.a.a {
    public d(a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    private void a(IronSourceError ironSourceError, String str) {
        this.q.d.a(h(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.o.b();
        this.r.a(ironSourceError, this.a.a(this.a.b));
        if (this.m.h.b()) {
            a(false, false);
        }
    }

    public final void a(a<?> aVar) {
        IronLog.INTERNAL.verbose(a(aVar.m()));
        b bVar = this.r;
        AdInfo a = this.a.a(aVar.o());
        if (bVar.a == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().d(a);
        } else if (bVar.a != IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.a);
        }
    }

    public final void a(IronSourceError ironSourceError, a<?> aVar) {
        b bVar;
        if (this.m.a() && (bVar = (b) this.b.get(aVar.l())) != null) {
            this.a.a(this.a.b, bVar.a(h()));
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(aVar.m() + " - error = " + ironSourceError));
        this.c.put(aVar.l(), C0025j.a.ISAuctionPerformanceFailedToShow);
        a(e.a.READY_TO_LOAD);
        a(ironSourceError, "");
    }

    public final void a(Placement placement) {
        a aVar;
        IronSourceError ironSourceError;
        String stringBuffer;
        IronLog.INTERNAL.verbose(a("state = " + this.n));
        synchronized (this.t) {
            this.j = placement;
            this.q.d.a(h());
            int i = 510;
            aVar = null;
            if (this.n == e.a.SHOWING) {
                IronSource.AD_UNIT ad_unit = this.m.a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
                }
                ironSourceError = new IronSourceError(i, "can't show ad while an ad is already showing");
            } else if (this.n != e.a.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(509, "show called while no ads are available");
            } else if (placement == null) {
                IronSource.AD_UNIT ad_unit2 = this.m.a;
                if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = 1020;
                } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = 1021;
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit2);
                }
                ironSourceError = new IronSourceError(i, "empty default placement");
            } else if (k.a(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.m.a)) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, "placement " + placement.getPlacementName() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(a(ironSourceError.getErrorMessage()));
                stringBuffer = "";
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                Iterator it = this.a.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a aVar2 = (a) it.next();
                    if (aVar2.a()) {
                        a(e.a.SHOWING);
                        aVar2.a(true);
                        aVar = aVar2;
                        break;
                    }
                    if (aVar2.h() != null) {
                        stringBuffer2.append(aVar2.l() + ":" + aVar2.h() + ",");
                    }
                    aVar2.a(false);
                    IronLog.INTERNAL.verbose(a(aVar2.m() + " - not ready to show"));
                }
                if (aVar == null) {
                    ironSourceError = ErrorBuilder.buildNoAdsToShowError(this.m.a.toString());
                    stringBuffer = stringBuffer2.toString();
                }
            }
            a(ironSourceError, stringBuffer);
        }
        if (aVar != null) {
            Placement placement2 = this.j;
            if (this.m.h.b()) {
                this.p.a();
            }
            aVar.a(placement2);
        }
    }

    public final void b(a<?> aVar) {
        IronLog.INTERNAL.verbose(a(aVar.m()));
        this.a.a((c<?>) aVar);
        this.l.a(aVar);
        if (this.l.b(aVar)) {
            IronLog.INTERNAL.verbose(a(aVar.l() + " was session capped"));
            aVar.g();
            IronSourceUtils.sendAutomationLog(aVar.l() + " was session capped");
        }
        k.b(ContextProvider.getInstance().getApplicationContext(), h(), this.m.a);
        if (k.a(ContextProvider.getInstance().getApplicationContext(), h(), this.m.a)) {
            IronLog.INTERNAL.verbose(a("placement " + h() + " is capped"));
            this.q.d.h(h());
        }
        o.a().a(this.m.a);
        if (this.m.a()) {
            b bVar = (b) this.b.get(aVar.l());
            if (bVar != null) {
                this.a.a(this.a.b, bVar.a(h()));
                C0023h.a(bVar, aVar.j(), this.i, h());
                this.c.put(aVar.l(), C0025j.a.ISAuctionPerformanceShowedSuccessfully);
                a(bVar, h());
            } else {
                String l = aVar.l();
                String str = "showing instance missing from waterfall - " + l;
                IronLog.INTERNAL.verbose(a(str));
                this.q.e.a(1011, str, l);
            }
        }
        b bVar2 = this.r;
        AdInfo a = this.a.a(aVar.o());
        if (bVar2.a == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().b(a);
        } else if (bVar2.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().a(a);
        } else {
            IronLog.INTERNAL.warning("ad unit not supported - " + bVar2.a);
        }
        if (this.m.h.b()) {
            a(false, false);
        }
        c cVar = this.o;
        if (cVar.a.a == a.C0009a.AUTOMATIC_LOAD_WHILE_SHOW) {
            cVar.a(cVar.a.b);
        }
    }

    public final boolean b() {
        if (!f()) {
            return false;
        }
        if (this.k && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.a.a().iterator();
        while (it.hasNext()) {
            if (((com.ironsource.mediationsdk.adunit.d.a.a) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        if (this.n == e.a.READY_TO_SHOW) {
            Iterator it = this.a.a().iterator();
            while (it.hasNext()) {
                com.ironsource.mediationsdk.adunit.d.a.a aVar = (com.ironsource.mediationsdk.adunit.d.a.a) it.next();
                if (aVar.e()) {
                    sb.append(aVar.l() + ";");
                }
            }
        }
        return sb.toString();
    }

    public final void c(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog.INTERNAL.verbose(a(aVar.m()));
        if (this.n == e.a.SHOWING) {
            a(e.a.READY_TO_LOAD);
        }
        c cVar = this.o;
        if (cVar.a.a == a.C0009a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            cVar.a(cVar.a.b);
        }
        b bVar = this.r;
        AdInfo a = this.a.a(aVar.o());
        if (bVar.a == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().c(a);
        } else if (bVar.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().b(a);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.a);
        }
    }

    public final void d(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog.INTERNAL.verbose(a(aVar.m()));
        b bVar = this.r;
        if (bVar.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().b();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar.a);
    }

    public final void e(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog.INTERNAL.verbose(a(aVar.m()));
        b bVar = this.r;
        if (bVar.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().c();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar.a);
    }
}
