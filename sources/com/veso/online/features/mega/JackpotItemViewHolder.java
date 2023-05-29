package com.veso.online.features.mega;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.R;
import com.veso.online.data.model.VietlotResultItem;
import com.veso.online.databinding.LayoutMegaResultItemBinding;
import com.veso.online.features.mega.detail.JackpotDetailActivity;
import com.veso.online.utils.ExtensionsKt;
import com.veso.online.utils.ViewBindingExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/veso/online/features/mega/JackpotItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutMegaResultItemBinding;", "(Lcom/veso/online/databinding/LayoutMegaResultItemBinding;)V", "getBinding", "()Lcom/veso/online/databinding/LayoutMegaResultItemBinding;", "bindData", "", "item", "Lcom/veso/online/data/model/VietlotResultItem;", "isPower655", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: JackpotResultAdapter.kt */
public final class JackpotItemViewHolder extends RecyclerView.ViewHolder {
    private final LayoutMegaResultItemBinding binding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JackpotItemViewHolder(LayoutMegaResultItemBinding layoutMegaResultItemBinding) {
        super(layoutMegaResultItemBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutMegaResultItemBinding, "binding");
        this.binding = layoutMegaResultItemBinding;
    }

    public final LayoutMegaResultItemBinding getBinding() {
        return this.binding;
    }

    public final void bindData(VietlotResultItem vietlotResultItem, boolean z) {
        Intrinsics.checkNotNullParameter(vietlotResultItem, "item");
        LayoutMegaResultItemBinding layoutMegaResultItemBinding = this.binding;
        layoutMegaResultItemBinding.getRoot().setBackgroundResource(z ? R.drawable.bg_power_item : R.drawable.bg_mega_item);
        int color = ContextCompat.getColor(ExtensionsKt.getContext(this), z ? R.color.black : R.color.primary);
        layoutMegaResultItemBinding.tvDate.setTextColor(color);
        layoutMegaResultItemBinding.tvDate.setText(vietlotResultItem.getDate());
        layoutMegaResultItemBinding.tvPeriod.setTextColor(color);
        layoutMegaResultItemBinding.tvPeriod.setText(vietlotResultItem.getLv());
        LinearLayout linearLayout = layoutMegaResultItemBinding.llResult;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llResult");
        ViewBindingExtKt.populateMegaBalls(vietlotResultItem, linearLayout, z);
        layoutMegaResultItemBinding.getRoot().setOnClickListener(new JackpotItemViewHolder$$ExternalSyntheticLambda0(layoutMegaResultItemBinding, vietlotResultItem, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: bindData$lambda-1$lambda-0  reason: not valid java name */
    public static final void m547bindData$lambda1$lambda0(LayoutMegaResultItemBinding layoutMegaResultItemBinding, VietlotResultItem vietlotResultItem, boolean z, View view) {
        Intrinsics.checkNotNullParameter(layoutMegaResultItemBinding, "$this_apply");
        Intrinsics.checkNotNullParameter(vietlotResultItem, "$item");
        JackpotDetailActivity.Companion companion = JackpotDetailActivity.Companion;
        Context context = layoutMegaResultItemBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "root.context");
        companion.startScreen(context, vietlotResultItem, z);
    }
}
