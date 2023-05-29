package com.veso.online.features.result.detail.vh;

import com.veso.online.data.model.PrizeRowData;
import com.veso.online.databinding.LayoutPrizeTextBinding;
import com.veso.online.utils.ExtensionsKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/veso/online/features/result/detail/vh/MultiResultDetailViewHolder$inflatePrizeText$1$randomTask$1", "Ljava/lang/Runnable;", "run", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: MultiResultDetailViewHolder.kt */
public final class MultiResultDetailViewHolder$inflatePrizeText$1$randomTask$1 implements Runnable {
    final /* synthetic */ PrizeRowData $data;
    final /* synthetic */ String $result;
    final /* synthetic */ LayoutPrizeTextBinding $this_apply;
    final /* synthetic */ MultiResultDetailViewHolder this$0;

    MultiResultDetailViewHolder$inflatePrizeText$1$randomTask$1(LayoutPrizeTextBinding layoutPrizeTextBinding, PrizeRowData prizeRowData, MultiResultDetailViewHolder multiResultDetailViewHolder, String str) {
        this.$this_apply = layoutPrizeTextBinding;
        this.$data = prizeRowData;
        this.this$0 = multiResultDetailViewHolder;
        this.$result = str;
    }

    public void run() {
        this.$this_apply.getRoot().setText(ExtensionsKt.getDisplayText(this.$data.getDisplayType(), this.this$0.randomResult(this.$result)));
        this.$this_apply.getRoot().postDelayed(this, 200);
    }
}
