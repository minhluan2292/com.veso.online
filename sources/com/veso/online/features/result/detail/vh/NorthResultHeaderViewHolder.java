package com.veso.online.features.result.detail.vh;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.veso.online.data.model.NorthPrizeHeaderData;
import com.veso.online.data.model.TicketInfo;
import com.veso.online.databinding.LayoutResultHeaderBinding;
import com.veso.online.utils.DateUtils;
import com.veso.online.utils.ExtensionsKt;
import java.util.Date;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/veso/online/features/result/detail/vh/NorthResultHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutResultHeaderBinding;", "(Lcom/veso/online/databinding/LayoutResultHeaderBinding;)V", "bindData", "", "data", "Lcom/veso/online/data/model/NorthPrizeHeaderData;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: NorthResultHeaderViewHolder.kt */
public final class NorthResultHeaderViewHolder extends RecyclerView.ViewHolder {
    private final LayoutResultHeaderBinding binding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NorthResultHeaderViewHolder(LayoutResultHeaderBinding layoutResultHeaderBinding) {
        super(layoutResultHeaderBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutResultHeaderBinding, "binding");
        this.binding = layoutResultHeaderBinding;
    }

    public final void bindData(NorthPrizeHeaderData northPrizeHeaderData) {
        Intrinsics.checkNotNullParameter(northPrizeHeaderData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Date parseDate = DateUtils.INSTANCE.parseDate(northPrizeHeaderData.getDate());
        String str = null;
        if (parseDate == null) {
            Long time = northPrizeHeaderData.getTime();
            parseDate = time == null ? null : DateUtils.INSTANCE.secondToDate(time.longValue());
        }
        this.binding.tvFirstCol.setText(parseDate == null ? null : ExtensionsKt.getDateOfWeek(parseDate));
        TextView textView = this.binding.tvHeader;
        TicketInfo ticketInfo = (TicketInfo) CollectionsKt.firstOrNull(northPrizeHeaderData.getConfigs());
        if (ticketInfo != null) {
            str = ticketInfo.getName();
        }
        textView.setText(str);
    }
}
