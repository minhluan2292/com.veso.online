package com.veso.online.features.result.detail.vh;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: MultiResultDetailViewHolder.kt */
final class MultiResultDetailViewHolder$randomResult$1 extends Lambda implements Function1<Integer, CharSequence> {
    public static final MultiResultDetailViewHolder$randomResult$1 INSTANCE = new MultiResultDetailViewHolder$randomResult$1();

    MultiResultDetailViewHolder$randomResult$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final CharSequence invoke(int i) {
        return String.valueOf((int) Math.floor(Math.random() * 9.99d));
    }
}
