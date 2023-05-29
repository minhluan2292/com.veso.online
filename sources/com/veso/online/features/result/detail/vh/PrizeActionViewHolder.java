package com.veso.online.features.result.detail.vh;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.veso.online.R;
import com.veso.online.data.model.LotteryResult;
import com.veso.online.data.model.PrizeActionRow;
import com.veso.online.data.model.PrizeDisplayType;
import com.veso.online.data.model.ResultTraditionLottery;
import com.veso.online.databinding.LayoutPrizeActionsBinding;
import com.veso.online.features.main.ReadResultDelegate;
import com.veso.online.utils.ExtensionsKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/veso/online/features/result/detail/vh/PrizeActionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutPrizeActionsBinding;", "callback", "Lkotlin/Function1;", "Lcom/veso/online/data/model/PrizeDisplayType;", "", "(Lcom/veso/online/databinding/LayoutPrizeActionsBinding;Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "bindData", "data", "Lcom/veso/online/data/model/PrizeActionRow;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: PrizeActionViewHolder.kt */
public final class PrizeActionViewHolder extends RecyclerView.ViewHolder {
    private final LayoutPrizeActionsBinding binding;
    private final Function1<PrizeDisplayType, Unit> callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrizeActionViewHolder(LayoutPrizeActionsBinding layoutPrizeActionsBinding, Function1<? super PrizeDisplayType, Unit> function1) {
        super(layoutPrizeActionsBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutPrizeActionsBinding, "binding");
        Intrinsics.checkNotNullParameter(function1, "callback");
        this.binding = layoutPrizeActionsBinding;
        this.callback = function1;
    }

    public final Function1<PrizeDisplayType, Unit> getCallback() {
        return this.callback;
    }

    public final void bindData(PrizeActionRow prizeActionRow) {
        Intrinsics.checkNotNullParameter(prizeActionRow, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        boolean z = true;
        int i = 0;
        this.binding.tvActionFull.setSelected(prizeActionRow.getPrizeDisplayType() == PrizeDisplayType.FULL);
        this.binding.tvAction3n.setSelected(prizeActionRow.getPrizeDisplayType() == PrizeDisplayType.THREE_NUM);
        this.binding.tvAction2n.setSelected(prizeActionRow.getPrizeDisplayType() == PrizeDisplayType.TWO_NUM);
        this.binding.ibPlaySound.setImageResource(prizeActionRow.isReadingResult() ? R.drawable.ic_loudspeaker_active : R.drawable.ic_loudspeaker);
        this.binding.tvActionFull.setOnClickListener(new PrizeActionViewHolder$$ExternalSyntheticLambda2(this));
        this.binding.tvAction3n.setOnClickListener(new PrizeActionViewHolder$$ExternalSyntheticLambda1(this));
        this.binding.tvAction2n.setOnClickListener(new PrizeActionViewHolder$$ExternalSyntheticLambda0(this));
        this.binding.ibPlaySound.setOnClickListener(new PrizeActionViewHolder$$ExternalSyntheticLambda3(this, prizeActionRow));
        ImageButton imageButton = this.binding.ibPlaySound;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.ibPlaySound");
        View view = imageButton;
        Iterable result = prizeActionRow.getResult().getResult();
        if (!(result instanceof Collection) || !((Collection) result).isEmpty()) {
            Iterator it = result.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((ResultTraditionLottery) it.next()).isComplete()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: bindData$lambda-0  reason: not valid java name */
    public static final void m581bindData$lambda0(PrizeActionViewHolder prizeActionViewHolder, View view) {
        Intrinsics.checkNotNullParameter(prizeActionViewHolder, "this$0");
        prizeActionViewHolder.callback.invoke(PrizeDisplayType.FULL);
    }

    /* access modifiers changed from: private */
    /* renamed from: bindData$lambda-1  reason: not valid java name */
    public static final void m582bindData$lambda1(PrizeActionViewHolder prizeActionViewHolder, View view) {
        Intrinsics.checkNotNullParameter(prizeActionViewHolder, "this$0");
        prizeActionViewHolder.callback.invoke(PrizeDisplayType.THREE_NUM);
    }

    /* access modifiers changed from: private */
    /* renamed from: bindData$lambda-2  reason: not valid java name */
    public static final void m583bindData$lambda2(PrizeActionViewHolder prizeActionViewHolder, View view) {
        Intrinsics.checkNotNullParameter(prizeActionViewHolder, "this$0");
        prizeActionViewHolder.callback.invoke(PrizeDisplayType.TWO_NUM);
    }

    /* access modifiers changed from: private */
    /* renamed from: bindData$lambda-4  reason: not valid java name */
    public static final void m584bindData$lambda4(PrizeActionViewHolder prizeActionViewHolder, PrizeActionRow prizeActionRow, View view) {
        Intrinsics.checkNotNullParameter(prizeActionViewHolder, "this$0");
        Intrinsics.checkNotNullParameter(prizeActionRow, "$data");
        Context context = ExtensionsKt.getContext(prizeActionViewHolder);
        ReadResultDelegate readResultDelegate = context instanceof ReadResultDelegate ? (ReadResultDelegate) context : null;
        if (readResultDelegate != null) {
            LotteryResult result = prizeActionRow.getResult();
            if (prizeActionRow.isReadingResult()) {
                readResultDelegate.stopReading();
            } else if (result.getRegionId() != null) {
                readResultDelegate.readRegionResult(result.getRegionId(), ((ResultTraditionLottery) CollectionsKt.first(result.getResult())).getDate(), result.getResult());
            } else {
                ResultTraditionLottery resultTraditionLottery = (ResultTraditionLottery) CollectionsKt.firstOrNull(result.getResult());
                if (resultTraditionLottery != null) {
                    readResultDelegate.readChannelResult(resultTraditionLottery);
                }
            }
        }
    }
}
