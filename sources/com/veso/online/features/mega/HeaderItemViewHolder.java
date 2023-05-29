package com.veso.online.features.mega;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.R;
import com.veso.online.data.model.VietlotType;
import com.veso.online.databinding.LayoutKenoHeaderBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/veso/online/features/mega/HeaderItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutKenoHeaderBinding;", "(Lcom/veso/online/databinding/LayoutKenoHeaderBinding;)V", "getBinding", "()Lcom/veso/online/databinding/LayoutKenoHeaderBinding;", "bindData", "", "vietlotType", "Lcom/veso/online/data/model/VietlotType;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: JackpotResultAdapter.kt */
public final class HeaderItemViewHolder extends RecyclerView.ViewHolder {
    private final LayoutKenoHeaderBinding binding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderItemViewHolder(LayoutKenoHeaderBinding layoutKenoHeaderBinding) {
        super(layoutKenoHeaderBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutKenoHeaderBinding, "binding");
        this.binding = layoutKenoHeaderBinding;
    }

    public final LayoutKenoHeaderBinding getBinding() {
        return this.binding;
    }

    public final void bindData(VietlotType vietlotType) {
        Intrinsics.checkNotNullParameter(vietlotType, "vietlotType");
        ImageView imageView = this.binding.ivLogo;
        imageView.getLayoutParams().height = imageView.getContext().getResources().getDimensionPixelSize(R.dimen.max3d_logo_height);
        if (vietlotType == VietlotType.MAX3DPRO) {
            imageView.setImageResource(R.drawable.logo_max_3d_pro);
        } else {
            imageView.setImageResource(R.drawable.logo_max_3d);
        }
    }
}
