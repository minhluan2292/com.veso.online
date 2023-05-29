package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class ac implements n.a {
    protected AbstractAdapter c;
    protected a d;
    boolean e;
    protected JSONObject f;
    protected String g;
    protected int h;
    protected Long i = null;

    ac(a aVar, AbstractAdapter abstractAdapter) {
        this.d = aVar;
        this.c = abstractAdapter;
        this.f = aVar.b;
    }

    private String a() {
        return this.d.a.isMultipleInstances() ? this.d.a.getProviderTypeForReflection() : this.d.a.getProviderName();
    }

    public final void b(String str) {
        C0021f.a();
        this.g = C0021f.d(str);
    }

    public void d() {
        try {
            AbstractAdapter abstractAdapter = this.c;
            if (abstractAdapter != null) {
                abstractAdapter.releaseMemory(this.d.c, this.f);
            }
        } catch (Exception e2) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception - " + e2.getMessage());
        }
        this.c = null;
    }

    public int e() {
        return 1;
    }

    public final boolean h() {
        return this.d.d;
    }

    public final boolean i() {
        return this.d.e;
    }

    public final int j() {
        return this.d.f;
    }

    public final int k() {
        return this.d.g;
    }

    public final String l() {
        return this.d.a.getProviderName();
    }

    public final String m() {
        return this.d.a.getProviderTypeForReflection();
    }

    public final int n() {
        return this.h;
    }

    public final Map<String, Object> o() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.c;
            String str = "";
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : str);
            AbstractAdapter abstractAdapter2 = this.c;
            if (abstractAdapter2 != null) {
                str = abstractAdapter2.getCoreSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str);
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.d.a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.d.a.getAdSourceNameForEvents());
            hashMap.put("instanceType", Integer.valueOf(h() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(e()));
            if (!TextUtils.isEmpty(this.g)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.g);
            }
        } catch (Exception e2) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + l() + ")", e2);
        }
        return hashMap;
    }

    public final Long p() {
        return this.i;
    }

    public final String q() {
        return String.format("%s %s", new Object[]{a(), Integer.valueOf(hashCode())});
    }
}
