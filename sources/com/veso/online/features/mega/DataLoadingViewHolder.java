package com.veso.online.features.mega;

import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.data.model.LoadingState;
import com.veso.online.databinding.LayoutFragmentLoadingBinding;
import com.veso.online.utils.ViewBindingExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/veso/online/features/mega/DataLoadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutFragmentLoadingBinding;", "(Lcom/veso/online/databinding/LayoutFragmentLoadingBinding;)V", "getBinding", "()Lcom/veso/online/databinding/LayoutFragmentLoadingBinding;", "bindData", "", "loadingState", "Lcom/veso/online/data/model/LoadingState;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: JackpotResultAdapter.kt */
public final class DataLoadingViewHolder extends RecyclerView.ViewHolder {
    private final LayoutFragmentLoadingBinding binding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataLoadingViewHolder(LayoutFragmentLoadingBinding layoutFragmentLoadingBinding) {
        super(layoutFragmentLoadingBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutFragmentLoadingBinding, "binding");
        this.binding = layoutFragmentLoadingBinding;
    }

    public final LayoutFragmentLoadingBinding getBinding() {
        return this.binding;
    }

    public final void bindData(LoadingState loadingState) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        ViewBindingExtKt.setState(this.binding, loadingState);
    }
}
