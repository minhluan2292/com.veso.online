package com.veso.online.features.result.detail;

import com.veso.online.data.model.PrizeDisplayType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/veso/online/data/model/PrizeDisplayType;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: ResultDetailFragment.kt */
final class ResultDetailFragment$lotteryAdapter$1 extends Lambda implements Function1<PrizeDisplayType, Unit> {
    final /* synthetic */ ResultDetailFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ResultDetailFragment$lotteryAdapter$1(ResultDetailFragment resultDetailFragment) {
        super(1);
        this.this$0 = resultDetailFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PrizeDisplayType) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(PrizeDisplayType prizeDisplayType) {
        Intrinsics.checkNotNullParameter(prizeDisplayType, "it");
        this.this$0.getViewModel().setPrizeDisplayType(prizeDisplayType);
    }
}
