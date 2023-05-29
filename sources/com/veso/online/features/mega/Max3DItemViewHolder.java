package com.veso.online.features.mega;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.veso.online.data.model.VietlotResultItem;
import com.veso.online.data.model.VietlotType;
import com.veso.online.databinding.LayoutMax3dItemBinding;
import com.veso.online.features.max.Max3DDetailActivity;
import com.veso.online.utils.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/veso/online/features/mega/Max3DItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutMax3dItemBinding;", "(Lcom/veso/online/databinding/LayoutMax3dItemBinding;)V", "getBinding", "()Lcom/veso/online/databinding/LayoutMax3dItemBinding;", "bindData", "", "data", "Lcom/veso/online/data/model/VietlotResultItem;", "type", "Lcom/veso/online/data/model/VietlotType;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: JackpotResultAdapter.kt */
public final class Max3DItemViewHolder extends RecyclerView.ViewHolder {
    private final LayoutMax3dItemBinding binding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Max3DItemViewHolder(LayoutMax3dItemBinding layoutMax3dItemBinding) {
        super(layoutMax3dItemBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutMax3dItemBinding, "binding");
        this.binding = layoutMax3dItemBinding;
    }

    public final LayoutMax3dItemBinding getBinding() {
        return this.binding;
    }

    public final void bindData(VietlotResultItem vietlotResultItem, VietlotType vietlotType) {
        Intrinsics.checkNotNullParameter(vietlotResultItem, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkNotNullParameter(vietlotType, "type");
        JackpotResultAdapterKt.bindData(this.binding, vietlotResultItem);
        this.binding.getRoot().setOnClickListener(new Max3DItemViewHolder$$ExternalSyntheticLambda0(this, vietlotResultItem, vietlotType));
    }

    /* access modifiers changed from: private */
    /* renamed from: bindData$lambda-0  reason: not valid java name */
    public static final void m550bindData$lambda0(Max3DItemViewHolder max3DItemViewHolder, VietlotResultItem vietlotResultItem, VietlotType vietlotType, View view) {
        Intrinsics.checkNotNullParameter(max3DItemViewHolder, "this$0");
        Intrinsics.checkNotNullParameter(vietlotResultItem, "$data");
        Intrinsics.checkNotNullParameter(vietlotType, "$type");
        Max3DDetailActivity.Companion.startScreen(ExtensionsKt.getContext(max3DItemViewHolder), vietlotResultItem, vietlotType);
    }
}
