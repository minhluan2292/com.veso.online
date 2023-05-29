package com.veso.online.features.main;

import android.content.res.AssetManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/veso/online/features/main/ReadResultEngine;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: MainActivity.kt */
final class MainActivity$readingEngine$2 extends Lambda implements Function0<ReadResultEngine> {
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MainActivity$readingEngine$2(MainActivity mainActivity) {
        super(0);
        this.this$0 = mainActivity;
    }

    public final ReadResultEngine invoke() {
        AssetManager assets = this.this$0.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "assets");
        ReadResultEngine readResultEngine = new ReadResultEngine(assets);
        readResultEngine.setOnStateChangedCallback(new MainActivity$readingEngine$2$1$1(this.this$0));
        return readResultEngine;
    }
}
