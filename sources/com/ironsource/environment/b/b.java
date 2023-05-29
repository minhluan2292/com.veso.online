package com.ironsource.environment.b;

import com.ironsource.mediationsdk.C0033r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ironsource/environment/events/EventsProvider;", "", "()V", "mEventsKeyList", "Ljava/util/ArrayList;", "", "mGlobalDataReader", "Lcom/ironsource/environment/globaldata/GlobalDataReader;", "getEventsData", "Lorg/json/JSONObject;", "environment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class b {
    private final ArrayList<String> a = new ArrayList<>(new a().a);
    private final C0033r b = new C0033r();

    public final JSONObject a() {
        JSONObject a2 = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return a2;
    }
}
