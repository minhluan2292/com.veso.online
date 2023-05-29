package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public final class j {
    public ArrayList<k> a = new ArrayList<>();
    public k b;
    public c c;
    public JSONObject d;

    public j(c cVar) {
        this.c = cVar;
    }

    public final k a() {
        Iterator<k> it = this.a.iterator();
        while (it.hasNext()) {
            k next = it.next();
            if (next.c) {
                return next;
            }
        }
        return this.b;
    }

    public final k a(String str) {
        Iterator<k> it = this.a.iterator();
        while (it.hasNext()) {
            k next = it.next();
            if (next.b.equals(str)) {
                return next;
            }
        }
        return null;
    }

    public final String b() {
        JSONObject jSONObject = this.d;
        return (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("adapterName"))) ? IronSourceConstants.SUPERSONIC_CONFIG_NAME : this.d.optString("adapterName");
    }
}
