package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

public class A {
    private a a;
    private Timer b;
    private final Object c = new Object();
    protected AbstractAdapter d;
    protected com.ironsource.mediationsdk.model.a e;
    protected JSONObject f;
    long g;
    protected String h;
    protected JSONObject i;
    protected List<String> j;
    protected String k;
    private final Object l = new Object();

    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public A(com.ironsource.mediationsdk.model.a aVar, AbstractAdapter abstractAdapter) {
        this.e = aVar;
        this.d = abstractAdapter;
        this.f = aVar.b;
        this.a = a.NOT_LOADED;
        this.b = null;
        this.h = "";
        this.i = null;
        this.j = new ArrayList();
    }

    protected static void a(List<String> list, String str, int i2, String str2, String str3) {
        for (String a2 : (List) com.ironsource.mediationsdk.c.a.a(list, new ArrayList())) {
            C0021f.a();
            String a3 = C0021f.a(a2, str, i2, str2, "", "", "", "");
            C0021f.a();
            C0021f.a(str3, str, a3);
        }
    }

    /* access modifiers changed from: package-private */
    public final a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.c) {
            aVar2 = this.a;
            if (Arrays.asList(aVarArr).contains(this.a)) {
                a(aVar);
            }
        }
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.e.a.getProviderName() + ": current state=" + this.a + ", new state=" + aVar);
        synchronized (this.c) {
            this.a = aVar;
        }
    }

    public final void a(String str) {
        C0021f.a();
        this.k = C0021f.d(str);
    }

    /* access modifiers changed from: package-private */
    public final void a(TimerTask timerTask) {
        synchronized (this.l) {
            j();
            Timer timer = new Timer();
            this.b = timer;
            timer.schedule(timerTask, this.g);
        }
    }

    public final void a(JSONObject jSONObject) {
        this.i = jSONObject;
    }

    public final void a(boolean z) {
        try {
            this.f.put("isOneFlow", z);
        } catch (Exception e2) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("Can't set isOneFlow = " + z + ". Error: " + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(a aVar, a aVar2) {
        synchronized (this.c) {
            if (this.a != aVar) {
                return false;
            }
            a(aVar2);
            return true;
        }
    }

    public final void b(String str) {
        this.h = str;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(a aVar) {
        boolean z;
        synchronized (this.c) {
            z = this.a == aVar;
        }
        return z;
    }

    public Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.d;
            String str = "";
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : str);
            AbstractAdapter abstractAdapter2 = this.d;
            if (abstractAdapter2 != null) {
                str = abstractAdapter2.getCoreSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str);
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.e.a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.e.a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (this.e.d) {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                hashMap.put("instanceType", 2);
                if (!TextUtils.isEmpty(this.h)) {
                    hashMap.put("auctionId", this.h);
                }
                JSONObject jSONObject = this.i;
                if (jSONObject != null && jSONObject.length() > 0) {
                    hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.i);
                }
            } else {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 0);
                hashMap.put("instanceType", 1);
            }
            if (!TextUtils.isEmpty(this.k)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.k);
            }
        } catch (Exception e2) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + e() + ")", e2);
        }
        return hashMap;
    }

    public final String e() {
        return this.e.a.getProviderName();
    }

    public final int f() {
        return this.e.f;
    }

    public final String g() {
        return this.e.a.getSubProviderId();
    }

    public final boolean h() {
        return this.f.optBoolean("isOneFlow", false);
    }

    /* access modifiers changed from: package-private */
    public final String i() {
        a aVar = this.a;
        return aVar == null ? "null" : aVar.toString();
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        synchronized (this.l) {
            Timer timer = this.b;
            if (timer != null) {
                timer.cancel();
                this.b = null;
            }
        }
    }

    public final boolean k() {
        return this.e.d;
    }
}
