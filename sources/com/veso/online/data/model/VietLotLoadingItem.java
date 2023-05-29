package com.veso.online.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/veso/online/data/model/VietLotLoadingItem;", "Lcom/veso/online/data/model/VietLotItem;", "state", "Lcom/veso/online/data/model/LoadingState;", "(Lcom/veso/online/data/model/LoadingState;)V", "getState", "()Lcom/veso/online/data/model/LoadingState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: VietlotResult.kt */
public final class VietLotLoadingItem implements VietLotItem {
    private final LoadingState state;

    public static /* synthetic */ VietLotLoadingItem copy$default(VietLotLoadingItem vietLotLoadingItem, LoadingState loadingState, int i, Object obj) {
        if ((i & 1) != 0) {
            loadingState = vietLotLoadingItem.state;
        }
        return vietLotLoadingItem.copy(loadingState);
    }

    public final LoadingState component1() {
        return this.state;
    }

    public final VietLotLoadingItem copy(LoadingState loadingState) {
        Intrinsics.checkNotNullParameter(loadingState, "state");
        return new VietLotLoadingItem(loadingState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VietLotLoadingItem) && this.state == ((VietLotLoadingItem) obj).state;
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        return "VietLotLoadingItem(state=" + this.state + ')';
    }

    public VietLotLoadingItem(LoadingState loadingState) {
        Intrinsics.checkNotNullParameter(loadingState, "state");
        this.state = loadingState;
    }

    public final LoadingState getState() {
        return this.state;
    }
}
