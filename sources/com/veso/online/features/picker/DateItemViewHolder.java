package com.veso.online.features.picker;

import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.databinding.LayoutDateItemBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/veso/online/features/picker/DateItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutDateItemBinding;", "(Lcom/veso/online/databinding/LayoutDateItemBinding;)V", "getBinding", "()Lcom/veso/online/databinding/LayoutDateItemBinding;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoDateAdapter.kt */
public final class DateItemViewHolder extends RecyclerView.ViewHolder {
    private final LayoutDateItemBinding binding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateItemViewHolder(LayoutDateItemBinding layoutDateItemBinding) {
        super(layoutDateItemBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutDateItemBinding, "binding");
        this.binding = layoutDateItemBinding;
    }

    public final LayoutDateItemBinding getBinding() {
        return this.binding;
    }
}
