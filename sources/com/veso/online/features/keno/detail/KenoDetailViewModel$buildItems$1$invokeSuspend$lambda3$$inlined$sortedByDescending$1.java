package com.veso.online.features.keno.detail;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.veso.online.features.keno.detail.KenoDetailViewModel$buildItems$1$invokeSuspend$lambda-3$$inlined$sortedByDescending$1  reason: invalid class name */
/* compiled from: Comparisons.kt */
public final class KenoDetailViewModel$buildItems$1$invokeSuspend$lambda3$$inlined$sortedByDescending$1<T> implements Comparator {
    public final int compare(T t, T t2) {
        String str = (String) t2;
        Intrinsics.checkNotNullExpressionValue(str, "it");
        String str2 = (String) t;
        Intrinsics.checkNotNullExpressionValue(str2, "it");
        return ComparisonsKt.compareValues(Integer.valueOf(Integer.parseInt(StringsKt.replace$default(str, "t", "", false, 4, (Object) null))), Integer.valueOf(Integer.parseInt(StringsKt.replace$default(str2, "t", "", false, 4, (Object) null))));
    }
}
