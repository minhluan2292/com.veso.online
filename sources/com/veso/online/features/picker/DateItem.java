package com.veso.online.features.picker;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/veso/online/features/picker/DateItem;", "", "title", "", "dayOfWeek", "", "regionId", "(Ljava/lang/String;ILjava/lang/String;)V", "getDayOfWeek", "()I", "getRegionId", "()Ljava/lang/String;", "getTitle", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoDateAdapter.kt */
public final class DateItem {
    private final int dayOfWeek;
    private final String regionId;
    private final String title;

    public DateItem(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "regionId");
        this.title = str;
        this.dayOfWeek = i;
        this.regionId = str2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final String getRegionId() {
        return this.regionId;
    }
}
