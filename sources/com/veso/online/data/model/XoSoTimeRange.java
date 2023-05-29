package com.veso.online.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/veso/online/data/model/XoSoTimeRange;", "", "startHour", "", "startMin", "(Ljava/lang/String;III)V", "getStartHour", "()I", "getStartMin", "NORTH", "MIDDLE", "SOUTH", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XoSoTimeRange.kt */
public enum XoSoTimeRange {
    NORTH(18, 15),
    MIDDLE(17, 15),
    SOUTH(16, 15);
    
    public static final Companion Companion = null;
    private final int startHour;
    private final int startMin;

    private XoSoTimeRange(int i, int i2) {
        this.startHour = i;
        this.startMin = i2;
    }

    public final int getStartHour() {
        return this.startHour;
    }

    public final int getStartMin() {
        return this.startMin;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/veso/online/data/model/XoSoTimeRange$Companion;", "", "()V", "getTimeRange", "Lcom/veso/online/data/model/XoSoTimeRange;", "regionId", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: XoSoTimeRange.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final XoSoTimeRange getTimeRange(String str) {
            if (Intrinsics.areEqual((Object) str, (Object) XosoConfig.REGION_ID_NORTH)) {
                return XoSoTimeRange.NORTH;
            }
            if (Intrinsics.areEqual((Object) str, (Object) XosoConfig.REGION_ID_MIDDLE)) {
                return XoSoTimeRange.MIDDLE;
            }
            return XoSoTimeRange.SOUTH;
        }
    }
}
