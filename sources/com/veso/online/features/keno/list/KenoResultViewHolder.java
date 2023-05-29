package com.veso.online.features.keno.list;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.data.model.KenoResult;
import com.veso.online.databinding.LayoutKenoResultItemBinding;
import com.veso.online.features.keno.detail.KenoDetailActivity;
import com.veso.online.utils.ExtensionsKt;
import com.veso.online.utils.ViewBindingExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/veso/online/features/keno/list/KenoResultViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutKenoResultItemBinding;", "(Lcom/veso/online/databinding/LayoutKenoResultItemBinding;)V", "getBinding", "()Lcom/veso/online/databinding/LayoutKenoResultItemBinding;", "bindData", "", "item", "Lcom/veso/online/data/model/KenoResult;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoResultAdapter.kt */
public final class KenoResultViewHolder extends RecyclerView.ViewHolder {
    private final LayoutKenoResultItemBinding binding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KenoResultViewHolder(LayoutKenoResultItemBinding layoutKenoResultItemBinding) {
        super(layoutKenoResultItemBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutKenoResultItemBinding, "binding");
        this.binding = layoutKenoResultItemBinding;
    }

    public final LayoutKenoResultItemBinding getBinding() {
        return this.binding;
    }

    public final void bindData(KenoResult kenoResult) {
        Intrinsics.checkNotNullParameter(kenoResult, "item");
        LayoutKenoResultItemBinding layoutKenoResultItemBinding = this.binding;
        layoutKenoResultItemBinding.tvDate.setText(kenoResult.getDate());
        layoutKenoResultItemBinding.tvTime.setText(kenoResult.getTime());
        layoutKenoResultItemBinding.tvPeriod.setText(Intrinsics.stringPlus("#", kenoResult.getLv()));
        LinearLayout linearLayout = layoutKenoResultItemBinding.llResult;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llResult");
        ViewBindingExtKt.populateKenoBalls(kenoResult, linearLayout);
        layoutKenoResultItemBinding.getRoot().setOnClickListener(new KenoResultViewHolder$$ExternalSyntheticLambda0(this, kenoResult));
    }

    /* access modifiers changed from: private */
    /* renamed from: bindData$lambda-1$lambda-0  reason: not valid java name */
    public static final void m527bindData$lambda1$lambda0(KenoResultViewHolder kenoResultViewHolder, KenoResult kenoResult, View view) {
        Intrinsics.checkNotNullParameter(kenoResultViewHolder, "this$0");
        Intrinsics.checkNotNullParameter(kenoResult, "$item");
        KenoDetailActivity.Companion.startScreen(ExtensionsKt.getContext(kenoResultViewHolder), kenoResult);
    }
}
