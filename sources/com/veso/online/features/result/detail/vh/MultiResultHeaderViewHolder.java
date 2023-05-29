package com.veso.online.features.result.detail.vh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.veso.online.R;
import com.veso.online.data.model.PrizeHeaderData;
import com.veso.online.data.model.TicketInfo;
import com.veso.online.databinding.LayoutMultiResultHeaderBinding;
import com.veso.online.databinding.LayoutMultiResultHeaderTextBinding;
import com.veso.online.utils.DateUtils;
import com.veso.online.utils.ExtensionsKt;
import java.util.Date;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/veso/online/features/result/detail/vh/MultiResultHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutMultiResultHeaderBinding;", "(Lcom/veso/online/databinding/LayoutMultiResultHeaderBinding;)V", "bindData", "", "data", "Lcom/veso/online/data/model/PrizeHeaderData;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: MultiResultHeaderViewHolder.kt */
public final class MultiResultHeaderViewHolder extends RecyclerView.ViewHolder {
    private final LayoutMultiResultHeaderBinding binding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiResultHeaderViewHolder(LayoutMultiResultHeaderBinding layoutMultiResultHeaderBinding) {
        super(layoutMultiResultHeaderBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutMultiResultHeaderBinding, "binding");
        this.binding = layoutMultiResultHeaderBinding;
    }

    public final void bindData(PrizeHeaderData prizeHeaderData) {
        Intrinsics.checkNotNullParameter(prizeHeaderData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Date parseDate = DateUtils.INSTANCE.parseDate(prizeHeaderData.getDate());
        if (parseDate == null) {
            Long time = prizeHeaderData.getTime();
            parseDate = time == null ? null : DateUtils.INSTANCE.secondToDate(time.longValue());
        }
        this.binding.tvFirstCol.setText(parseDate == null ? null : ExtensionsKt.getDateOfWeek(parseDate));
        this.binding.llHeaderContent.removeAllViews();
        LayoutInflater from = LayoutInflater.from(this.itemView.getContext());
        int i = 0;
        for (Object next : prizeHeaderData.getConfigs()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TicketInfo ticketInfo = (TicketInfo) next;
            if (i > 0) {
                View view = new View(this.itemView.getContext());
                view.setBackgroundColor(ContextCompat.getColor(this.itemView.getContext(), R.color.divider));
                this.binding.llHeaderContent.addView(view, 1, -1);
            }
            LayoutMultiResultHeaderTextBinding inflate = LayoutMultiResultHeaderTextBinding.inflate(from, this.binding.llHeaderContent, true);
            inflate.tvXosoName.setText(ticketInfo.getName());
            inflate.tvXosoType.setText(ticketInfo.getTicketType());
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
