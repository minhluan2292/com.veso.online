package com.veso.online.features.result.detail.vh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.veso.online.R;
import com.veso.online.data.model.LotoRowData;
import com.veso.online.databinding.LayoutPrizeTextBinding;
import com.veso.online.databinding.LayoutResultDetailBinding;
import com.veso.online.utils.ExtensionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/veso/online/features/result/detail/vh/LotoRowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutResultDetailBinding;", "(Lcom/veso/online/databinding/LayoutResultDetailBinding;)V", "bindData", "", "data", "Lcom/veso/online/data/model/LotoRowData;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: LotoRowViewHolder.kt */
public final class LotoRowViewHolder extends RecyclerView.ViewHolder {
    private final LayoutResultDetailBinding binding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LotoRowViewHolder(LayoutResultDetailBinding layoutResultDetailBinding) {
        super(layoutResultDetailBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutResultDetailBinding, "binding");
        this.binding = layoutResultDetailBinding;
    }

    public final void bindData(LotoRowData lotoRowData) {
        Intrinsics.checkNotNullParameter(lotoRowData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = this.binding.tvFirstCol;
        String title = lotoRowData.getTitle();
        if (title == null) {
            Integer titleRes = lotoRowData.getTitleRes();
            title = titleRes == null ? null : ExtensionsKt.getContext(this).getString(titleRes.intValue());
        }
        textView.setText(title);
        this.binding.llResultContent.removeAllViews();
        RecyclerView.ViewHolder viewHolder = this;
        LayoutInflater from = LayoutInflater.from(ExtensionsKt.getContext(viewHolder));
        int i = 0;
        for (Object next : lotoRowData.getResults()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) next;
            if (i > 0) {
                View view = new View(this.itemView.getContext());
                view.setBackgroundColor(ContextCompat.getColor(this.itemView.getContext(), R.color.divider));
                this.binding.llResultContent.addView(view, 1, -1);
            }
            LayoutPrizeTextBinding inflate = LayoutPrizeTextBinding.inflate(from, this.binding.llResultContent, true);
            inflate.getRoot().setText(str);
            inflate.getRoot().setTextSize(16.0f);
            inflate.getRoot().setMinHeight(ExtensionsKt.getContext(viewHolder).getResources().getDimensionPixelSize(R.dimen.loto_min_height));
            ViewGroup.LayoutParams layoutParams = inflate.getRoot().getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.width = 0;
                layoutParams2.weight = 1.0f;
            }
            i = i2;
        }
    }
}
