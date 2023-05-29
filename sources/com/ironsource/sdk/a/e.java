package com.ironsource.sdk.a;

import android.content.Context;
import com.ironsource.c.b;
import com.ironsource.mediationsdk.adunit.a.a;
import com.ironsource.sdk.g.c;
import com.ironsource.sdk.g.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class e {
    private a a = new a();

    public static d.e a(c cVar, d.e eVar) {
        return (cVar == null || cVar.d == null || cVar.d.get("rewarded") == null) ? eVar : Boolean.parseBoolean(cVar.d.get("rewarded")) ? d.e.RewardedVideo : d.e.Interstitial;
    }

    public static boolean a(c cVar) {
        if (cVar == null || cVar.d.get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(cVar.d.get("inAppBidding"));
    }

    public void a(int i) {
        a.a("itp", (Object) Integer.valueOf(i));
    }

    public void a(Context context) {
        a.a(context);
    }

    public void a(b bVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("omv", b.b());
            hashMap.put("ompv", b.c());
            hashMap.put("sdkv", b.a());
            a.a((Map<String, Object>) hashMap);
        } catch (Exception unused) {
        }
    }

    public void a(Boolean bool) {
        a.a("fs", (Object) bool);
    }

    public void a(String str) {
        a.a("apky", (Object) str);
    }

    public void a(JSONObject jSONObject) {
        a.a("md", (Object) jSONObject);
    }

    public void a(boolean z) {
        a.a("cnst", (Object) Boolean.valueOf(z));
    }

    public void b(String str) {
        a.a("medv", (Object) str);
    }

    public void b(JSONObject jSONObject) {
        a.a("tkgp", (Object) jSONObject);
    }

    public void b(boolean z) {
        a.a("gpi", (Object) Boolean.valueOf(z));
    }

    public void c(String str) {
        a.a("sid", (Object) str);
    }

    public void d(String str) {
        a.a("plugin", (Object) str);
    }

    public void e(String str) {
        a.a("usid", (Object) str);
    }

    public void f(String str) {
        a.a("audt", (Object) str);
    }
}
