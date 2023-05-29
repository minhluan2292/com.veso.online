package com.veso.online.features.keno.detail;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.veso.online.R;
import com.veso.online.data.model.KenoPrizeRow;
import com.veso.online.databinding.LayoutKenoTableRowBinding;
import com.veso.online.utils.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/veso/online/features/keno/detail/KenoTableRowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutKenoTableRowBinding;", "(Lcom/veso/online/databinding/LayoutKenoTableRowBinding;)V", "getBinding", "()Lcom/veso/online/databinding/LayoutKenoTableRowBinding;", "bindData", "", "data", "Lcom/veso/online/data/model/KenoPrizeRow;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoDetailAdapter.kt */
public final class KenoTableRowViewHolder extends RecyclerView.ViewHolder {
    private final LayoutKenoTableRowBinding binding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KenoTableRowViewHolder(LayoutKenoTableRowBinding layoutKenoTableRowBinding) {
        super(layoutKenoTableRowBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutKenoTableRowBinding, "binding");
        this.binding = layoutKenoTableRowBinding;
    }

    public final LayoutKenoTableRowBinding getBinding() {
        return this.binding;
    }

    public final void bindData(KenoPrizeRow kenoPrizeRow) {
        Intrinsics.checkNotNullParameter(kenoPrizeRow, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        LayoutKenoTableRowBinding layoutKenoTableRowBinding = this.binding;
        layoutKenoTableRowBinding.tvRule.setText(ExtensionsKt.getContext(this).getString(R.string.keno_rule, new Object[]{Integer.valueOf(kenoPrizeRow.getNumOfSame())}));
        layoutKenoTableRowBinding.tvQuantity.setText(String.valueOf(kenoPrizeRow.getQuantity()));
        layoutKenoTableRowBinding.tvPrizeValue.setText(kenoPrizeRow.getPrize());
    }
}
