package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.Pair;
import com.ironsource.mediationsdk.C0023h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.c;
import java.net.URL;
import java.util.Vector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ironsource/mediationsdk/AuctionHelper;", "", "settings", "Lcom/ironsource/mediationsdk/utils/AuctionSettings;", "isOneToken", "", "sessionId", "", "(Lcom/ironsource/mediationsdk/utils/AuctionSettings;ZLjava/lang/String;)V", "generateAuctionHttpRequestTask", "Lcom/ironsource/mediationsdk/AuctionHandler$AuctionHttpRequestTask;", "context", "Landroid/content/Context;", "auctionParams", "Lcom/ironsource/mediationsdk/AuctionParams;", "auctionListener", "Lcom/ironsource/mediationsdk/AuctionEventListener;", "generateRequest", "Lorg/json/JSONObject;", "getSegmentDataJson", "segment", "Lcom/ironsource/mediationsdk/IronSourceSegment;", "isAuctionEnabled", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.ironsource.mediationsdk.i  reason: case insensitive filesystem */
public final class C0024i {
    private final c a;
    private final boolean b;
    private final String c;

    public C0024i(c cVar, boolean z, String str) {
        Intrinsics.checkNotNullParameter(cVar, "settings");
        Intrinsics.checkNotNullParameter(str, "sessionId");
        this.a = cVar;
        this.b = z;
        this.c = str;
    }

    private static JSONObject a(IronSourceSegment ironSourceSegment) {
        JSONObject jSONObject = new JSONObject();
        if (ironSourceSegment == null) {
            return null;
        }
        Vector<Pair<String, String>> a2 = ironSourceSegment.a();
        int i = 0;
        int size = a2.size();
        while (i < size) {
            int i2 = i + 1;
            try {
                jSONObject.put((String) a2.get(i).first, a2.get(i).second);
            } catch (JSONException e) {
                e.printStackTrace();
                IronLog.INTERNAL.error(Intrinsics.stringPlus("exception ", e.getMessage()));
            }
            i = i2;
        }
        return jSONObject;
    }

    public final C0023h.a a(Context context, C0026k kVar, C0022g gVar) {
        JSONObject a2;
        C0026k kVar2 = kVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(kVar2, "auctionParams");
        Intrinsics.checkNotNullParameter(gVar, "auctionListener");
        new JSONObject();
        JSONObject a3 = a((IronSourceSegment) null);
        if (this.b) {
            a2 = C0021f.a().a(kVar2.a, kVar2.c, kVar2.d, kVar2.e, (C0025j) null, kVar2.f, kVar2.g, a3);
            Intrinsics.checkNotNullExpressionValue(a2, "getInstance().enrichToke…segmentJson\n            )");
        } else {
            a2 = C0021f.a().a(context, kVar2.d, kVar2.e, (C0025j) null, kVar2.f, this.c, this.a, kVar2.g, a3);
            Intrinsics.checkNotNullExpressionValue(a2, "getInstance().enrichToke…segmentJson\n            )");
            a2.put("adunit", kVar2.a);
            a2.put("doNotEncryptResponse", kVar2.c ? "false" : "true");
        }
        JSONObject jSONObject = a2;
        if (kVar2.h) {
            jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        }
        if (kVar2.b) {
            jSONObject.put("isOneFlow", 1);
        }
        return new C0023h.a(gVar, new URL(kVar2.h ? this.a.e : this.a.d), jSONObject, kVar2.c, this.a.f, this.a.i, this.a.q, this.a.r, this.a.s);
    }

    public final boolean a() {
        return this.a.f > 0;
    }
}
