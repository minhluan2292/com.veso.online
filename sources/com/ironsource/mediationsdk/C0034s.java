package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.b;
import com.ironsource.mediationsdk.utils.a;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.s  reason: case insensitive filesystem */
public abstract class C0034s {
    protected a a;
    protected IronSourceSegment b;
    protected AdInfo c;
    private HashSet<ImpressionDataListener> d = new HashSet<>();

    public C0034s(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this.d = hashSet;
        this.a = new a();
        this.b = ironSourceSegment;
    }

    protected static String d() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void a(IronSource.AD_UNIT ad_unit) {
        this.a.a(ad_unit, false);
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.b = ironSourceSegment;
    }

    public final void a(ImpressionData impressionData) {
        if (impressionData != null) {
            this.c = new AdInfo(impressionData);
        }
    }

    public final void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.d.add(impressionDataListener);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(b bVar, String str) {
        if (bVar != null) {
            ImpressionData a2 = bVar.a(str);
            if (a2 != null) {
                Iterator<ImpressionDataListener> it = this.d.iterator();
                while (it.hasNext()) {
                    ImpressionDataListener next = it.next();
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a2);
                    next.onImpressionSuccess(a2);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    /* access modifiers changed from: protected */
    public final void a(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        boolean z = false;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("isAdUnitCapped", false);
        }
        this.a.a(ad_unit, z);
    }

    public final void a_() {
        this.c = null;
    }

    public final void b() {
        synchronized (this) {
            this.d.clear();
        }
    }

    public final void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.d.remove(impressionDataListener);
        }
    }
}
