package com.veso.online.data.model;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/veso/online/data/model/PrizeActionRow;", "Lcom/veso/online/data/model/RowData;", "prizeDisplayType", "Lcom/veso/online/data/model/PrizeDisplayType;", "result", "Lcom/veso/online/data/model/LotteryResult;", "isReadingResult", "", "(Lcom/veso/online/data/model/PrizeDisplayType;Lcom/veso/online/data/model/LotteryResult;Z)V", "()Z", "getPrizeDisplayType", "()Lcom/veso/online/data/model/PrizeDisplayType;", "getResult", "()Lcom/veso/online/data/model/LotteryResult;", "type", "", "getType", "()I", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: PrizeRowData.kt */
public final class PrizeActionRow implements RowData {
    private final boolean isReadingResult;
    private final PrizeDisplayType prizeDisplayType;
    private final LotteryResult result;
    private final int type = 3;

    public PrizeActionRow(PrizeDisplayType prizeDisplayType2, LotteryResult lotteryResult, boolean z) {
        Intrinsics.checkNotNullParameter(prizeDisplayType2, "prizeDisplayType");
        Intrinsics.checkNotNullParameter(lotteryResult, IronSourceConstants.EVENTS_RESULT);
        this.prizeDisplayType = prizeDisplayType2;
        this.result = lotteryResult;
        this.isReadingResult = z;
    }

    public final PrizeDisplayType getPrizeDisplayType() {
        return this.prizeDisplayType;
    }

    public final LotteryResult getResult() {
        return this.result;
    }

    public final boolean isReadingResult() {
        return this.isReadingResult;
    }

    public int getType() {
        return this.type;
    }
}
