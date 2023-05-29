package com.veso.online.data.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/veso/online/data/model/XosoConfig;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoConfig.kt */
final class XosoConfig$Companion$mapConfigIds$2 extends Lambda implements Function0<Map<String, ? extends XosoConfig>> {
    public static final XosoConfig$Companion$mapConfigIds$2 INSTANCE = new XosoConfig$Companion$mapConfigIds$2();

    XosoConfig$Companion$mapConfigIds$2() {
        super(0);
    }

    public final Map<String, XosoConfig> invoke() {
        Iterable allConfig = XosoConfig.Companion.getAllConfig();
        Map<String, XosoConfig> linkedHashMap = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(allConfig, 10)), 16));
        for (Object next : allConfig) {
            linkedHashMap.put(((XosoConfig) next).getId(), next);
        }
        return linkedHashMap;
    }
}
