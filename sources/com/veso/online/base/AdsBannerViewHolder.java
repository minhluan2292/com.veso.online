package com.veso.online.base;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.R;
import com.veso.online.utils.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/veso/online/base/AdsBannerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "horizontalMargin", "", "verticalMargin", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: AdsBannerViewHolder.kt */
public final class AdsBannerViewHolder extends RecyclerView.ViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdsBannerViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_ads_banner, viewGroup, false));
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    public static /* synthetic */ void bindData$default(AdsBannerViewHolder adsBannerViewHolder, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        adsBannerViewHolder.bindData(num, num2);
    }

    public final void bindData(Integer num, Integer num2) {
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (num != null) {
                int intValue = num.intValue();
                RecyclerView.ViewHolder viewHolder = this;
                marginLayoutParams.setMarginEnd(ExtensionsKt.getContext(viewHolder).getResources().getDimensionPixelSize(intValue));
                marginLayoutParams.setMarginStart(ExtensionsKt.getContext(viewHolder).getResources().getDimensionPixelSize(intValue));
            }
            if (num2 != null) {
                int intValue2 = num2.intValue();
                RecyclerView.ViewHolder viewHolder2 = this;
                marginLayoutParams.topMargin = ExtensionsKt.getContext(viewHolder2).getResources().getDimensionPixelSize(intValue2);
                marginLayoutParams.bottomMargin = ExtensionsKt.getContext(viewHolder2).getResources().getDimensionPixelSize(intValue2);
            }
        }
    }
}
