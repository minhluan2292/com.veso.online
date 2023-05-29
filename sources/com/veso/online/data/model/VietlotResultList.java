package com.veso.online.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/veso/online/data/model/VietlotResultList;", "", "jackpotInfo", "Lcom/veso/online/data/model/JackpotInfo;", "results", "", "Lcom/veso/online/data/model/VietlotResultItem;", "(Lcom/veso/online/data/model/JackpotInfo;Ljava/util/List;)V", "getJackpotInfo", "()Lcom/veso/online/data/model/JackpotInfo;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: VietlotResult.kt */
public final class VietlotResultList {
    @SerializedName("jackpot")
    private final JackpotInfo jackpotInfo;
    @SerializedName("ketqua")
    private final List<VietlotResultItem> results;

    public static /* synthetic */ VietlotResultList copy$default(VietlotResultList vietlotResultList, JackpotInfo jackpotInfo2, List<VietlotResultItem> list, int i, Object obj) {
        if ((i & 1) != 0) {
            jackpotInfo2 = vietlotResultList.jackpotInfo;
        }
        if ((i & 2) != 0) {
            list = vietlotResultList.results;
        }
        return vietlotResultList.copy(jackpotInfo2, list);
    }

    public final JackpotInfo component1() {
        return this.jackpotInfo;
    }

    public final List<VietlotResultItem> component2() {
        return this.results;
    }

    public final VietlotResultList copy(JackpotInfo jackpotInfo2, List<VietlotResultItem> list) {
        Intrinsics.checkNotNullParameter(list, "results");
        return new VietlotResultList(jackpotInfo2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VietlotResultList)) {
            return false;
        }
        VietlotResultList vietlotResultList = (VietlotResultList) obj;
        return Intrinsics.areEqual((Object) this.jackpotInfo, (Object) vietlotResultList.jackpotInfo) && Intrinsics.areEqual((Object) this.results, (Object) vietlotResultList.results);
    }

    public int hashCode() {
        JackpotInfo jackpotInfo2 = this.jackpotInfo;
        return ((jackpotInfo2 == null ? 0 : jackpotInfo2.hashCode()) * 31) + this.results.hashCode();
    }

    public String toString() {
        return "VietlotResultList(jackpotInfo=" + this.jackpotInfo + ", results=" + this.results + ')';
    }

    public VietlotResultList(JackpotInfo jackpotInfo2, List<VietlotResultItem> list) {
        Intrinsics.checkNotNullParameter(list, "results");
        this.jackpotInfo = jackpotInfo2;
        this.results = list;
    }

    public final JackpotInfo getJackpotInfo() {
        return this.jackpotInfo;
    }

    public final List<VietlotResultItem> getResults() {
        return this.results;
    }
}
