package com.veso.online.data.model;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/veso/online/data/model/LotteryResult;", "", "config", "Lcom/veso/online/data/model/ResultConfig;", "result", "", "Lcom/veso/online/data/model/ResultTraditionLottery;", "regionId", "", "(Lcom/veso/online/data/model/ResultConfig;Ljava/util/List;Ljava/lang/String;)V", "getConfig", "()Lcom/veso/online/data/model/ResultConfig;", "getRegionId", "()Ljava/lang/String;", "getResult", "()Ljava/util/List;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: LotteryResult.kt */
public final class LotteryResult {
    private final ResultConfig config;
    private final String regionId;
    private final List<ResultTraditionLottery> result;

    public LotteryResult(ResultConfig resultConfig, List<ResultTraditionLottery> list, String str) {
        Intrinsics.checkNotNullParameter(list, IronSourceConstants.EVENTS_RESULT);
        this.config = resultConfig;
        this.result = list;
        this.regionId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LotteryResult(ResultConfig resultConfig, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultConfig, list, (i & 4) != 0 ? null : str);
    }

    public final ResultConfig getConfig() {
        return this.config;
    }

    public final List<ResultTraditionLottery> getResult() {
        return this.result;
    }

    public final String getRegionId() {
        return this.regionId;
    }
}
