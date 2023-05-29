package com.veso.online.features.main;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/google/gson/JsonObject;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: MainActivity.kt */
final class MainActivity$appConfig$2 extends Lambda implements Function0<JsonObject> {
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MainActivity$appConfig$2(MainActivity mainActivity) {
        super(0);
        this.this$0 = mainActivity;
    }

    public final JsonObject invoke() {
        InputStream open = this.this$0.getAssets().open("app_config.json");
        Intrinsics.checkNotNullExpressionValue(open, "assets.open(\"app_config.json\")");
        return JsonParser.parseString(new String(ByteStreamsKt.readBytes(open), Charsets.UTF_8)).getAsJsonObject();
    }
}
