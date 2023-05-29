package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.c.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.k;
import com.veso.online.data.model.XosoConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.r  reason: case insensitive filesystem */
public class C0033r {

    /* renamed from: com.ironsource.mediationsdk.r$a */
    interface a {
        void a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    /* renamed from: com.ironsource.mediationsdk.r$b */
    interface b {
        void a();

        void a(String str);
    }

    public static JSONObject a(Context context, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a2 = a.C0006a.a.a(context);
        for (String str : strArr) {
            if (a2.has(str)) {
                jSONObject.put(str, a2.opt(str));
            }
        }
        return jSONObject;
    }

    public static JSONObject a(String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a2 = a.C0006a.a.a(ContextProvider.getInstance().getApplicationContext());
        for (String str : strArr) {
            if (a2.has(str)) {
                jSONObject.put(str, a2.opt(str));
            }
        }
        return jSONObject;
    }

    static void a(String str, ConcurrentHashMap<String, V> concurrentHashMap, a aVar) {
        StringBuilder sb;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        if (!k.b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), str)) {
            for (V next : concurrentHashMap.values()) {
                if (next.h()) {
                    Map<String, Object> c = next.c();
                    if (c != null) {
                        hashMap.put(next.l(), c);
                        sb = new StringBuilder(XosoConfig.REGION_ID_NORTH);
                    } else {
                        next.a((int) IronSourceConstants.TROUBLESHOOTING_BN_BIDDING_DATA_MISSING, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
                    }
                } else if (!next.h()) {
                    arrayList.add(next.l());
                    sb = new StringBuilder(XosoConfig.REGION_ID_SOUTH);
                }
                sb.append(next.l());
                sb.append(",");
                sb2.append(sb.toString());
            }
        }
        aVar.a(hashMap, arrayList, sb2);
    }

    public static void a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        int i;
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                i = 1;
            } else if (c == 1) {
                i = 2;
            } else if (c == 2) {
                i = 3;
            } else if (c == 3) {
                i = 5;
            } else if (c == 4) {
                map.put("bannerAdSize", 6);
                map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                return;
            } else {
                return;
            }
            map.put("bannerAdSize", i);
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    static boolean a(IronSourceBannerLayout ironSourceBannerLayout) {
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    public JSONObject a(ArrayList<String> arrayList) {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        JSONObject jSONObject = new JSONObject();
        JSONObject a2 = a.C0006a.a.a(applicationContext);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (a2.has(next)) {
                jSONObject.put(next, a2.opt(next));
            }
        }
        return jSONObject;
    }
}
