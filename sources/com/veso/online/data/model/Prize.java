package com.veso.online.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/veso/online/data/model/Prize;", "", "prizePos", "", "prizeResult", "", "", "(ILjava/util/List;)V", "getPrizePos", "()I", "getPrizeResult", "()Ljava/util/List;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: Prize.kt */
public final class Prize {
    @SerializedName("prize_pos")
    private final int prizePos;
    @SerializedName("prize_result")
    private final List<String> prizeResult;

    public Prize(int i, List<String> list) {
        Intrinsics.checkNotNullParameter(list, "prizeResult");
        this.prizePos = i;
        this.prizeResult = list;
    }

    public final int getPrizePos() {
        return this.prizePos;
    }

    public final List<String> getPrizeResult() {
        return this.prizeResult;
    }
}
