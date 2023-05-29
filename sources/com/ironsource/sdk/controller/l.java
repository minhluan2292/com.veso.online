package com.ironsource.sdk.controller;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.h.b;
import org.json.JSONObject;

final class l {
    String a;
    b b;

    l(String str, b bVar) {
        this.a = str;
        this.b = bVar;
    }

    static JSONObject a(n nVar, long j) {
        try {
            return nVar.a().put(IronSourceConstants.EVENTS_RESULT, j);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    static JSONObject a(n nVar, String str) {
        try {
            return nVar.a().put("errMsg", str);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    static JSONObject a(n nVar, JSONObject jSONObject) {
        try {
            return nVar.a().put(IronSourceConstants.EVENTS_RESULT, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }
}
