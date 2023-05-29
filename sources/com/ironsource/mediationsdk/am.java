package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.environment.f.b;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ironsource/mediationsdk/TokenRepository;", "", "()V", "getBiddingData", "Lorg/json/JSONObject;", "context", "Landroid/content/Context;", "tokenSettings", "Lcom/ironsource/mediationsdk/utils/TokenSettings;", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class am {
    public static JSONObject a(Context context, p pVar) {
        AbstractAdapter a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pVar, "tokenSettings");
        if (pVar.d) {
            b bVar = new b();
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject a2 = C0033r.a(context, bVar.a);
            Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
            return b.a(a2);
        }
        NetworkSettings networkSettings = pVar.b;
        if (networkSettings == null || (a = C0019d.a().a(networkSettings, networkSettings.getApplicationSettings(), true, false)) == null) {
            return null;
        }
        return C0021f.a().a(a.getPlayerBiddingData(), pVar.c, (List<String>) pVar.a);
    }
}
