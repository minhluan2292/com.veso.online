package com.veso.online.features.keno.detail;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.veso.online.data.model.KenoResult;
import com.veso.online.databinding.LayoutKenoInfoBinding;
import com.veso.online.utils.ViewBindingExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/veso/online/features/keno/detail/KenoInfoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutKenoInfoBinding;", "(Lcom/veso/online/databinding/LayoutKenoInfoBinding;)V", "getBinding", "()Lcom/veso/online/databinding/LayoutKenoInfoBinding;", "bindData", "", "data", "Lcom/veso/online/data/model/KenoResult;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoDetailAdapter.kt */
public final class KenoInfoViewHolder extends RecyclerView.ViewHolder {
    private final LayoutKenoInfoBinding binding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KenoInfoViewHolder(LayoutKenoInfoBinding layoutKenoInfoBinding) {
        super(layoutKenoInfoBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutKenoInfoBinding, "binding");
        this.binding = layoutKenoInfoBinding;
    }

    public final LayoutKenoInfoBinding getBinding() {
        return this.binding;
    }

    public final void bindData(KenoResult kenoResult) {
        Intrinsics.checkNotNullParameter(kenoResult, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        LayoutKenoInfoBinding layoutKenoInfoBinding = this.binding;
        layoutKenoInfoBinding.tvPeriod.setText(Intrinsics.stringPlus("#", kenoResult.getLv()));
        TextView textView = layoutKenoInfoBinding.tvDateTime;
        textView.setText(kenoResult.getTime() + "  " + kenoResult.getDate());
        LinearLayout linearLayout = layoutKenoInfoBinding.llKenoBalls;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llKenoBalls");
        ViewBindingExtKt.populateKenoBalls(kenoResult, linearLayout);
    }
}
