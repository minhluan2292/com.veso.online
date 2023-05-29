package com.veso.online.features.result.detail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.R;
import com.veso.online.base.AdsBannerViewHolder;
import com.veso.online.base.MediumAdsBannerViewHolder;
import com.veso.online.base.SimpleDiffCallback;
import com.veso.online.data.model.LotoRowData;
import com.veso.online.data.model.NorthPrizeHeaderData;
import com.veso.online.data.model.PrizeActionRow;
import com.veso.online.data.model.PrizeDisplayType;
import com.veso.online.data.model.PrizeHeaderData;
import com.veso.online.data.model.PrizeRowData;
import com.veso.online.data.model.RowData;
import com.veso.online.databinding.LayoutLotoHeaderBinding;
import com.veso.online.databinding.LayoutMultiResultHeaderBinding;
import com.veso.online.databinding.LayoutPrizeActionsBinding;
import com.veso.online.databinding.LayoutResultDetailBinding;
import com.veso.online.databinding.LayoutResultHeaderBinding;
import com.veso.online.features.result.detail.vh.LotoHeaderViewHolder;
import com.veso.online.features.result.detail.vh.LotoRowViewHolder;
import com.veso.online.features.result.detail.vh.MultiResultDetailViewHolder;
import com.veso.online.features.result.detail.vh.MultiResultHeaderViewHolder;
import com.veso.online.features.result.detail.vh.NorthResultHeaderViewHolder;
import com.veso.online.features.result.detail.vh.PrizeActionViewHolder;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/veso/online/features/result/detail/LotteryResultAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/veso/online/data/model/RowData;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "actionCallback", "Lkotlin/Function1;", "Lcom/veso/online/data/model/PrizeDisplayType;", "", "(Lkotlin/jvm/functions/Function1;)V", "getActionCallback", "()Lkotlin/jvm/functions/Function1;", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: LotteryResultAdapter.kt */
public final class LotteryResultAdapter extends ListAdapter<RowData, RecyclerView.ViewHolder> {
    private final Function1<PrizeDisplayType, Unit> actionCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LotteryResultAdapter(Function1<? super PrizeDisplayType, Unit> function1) {
        super(new SimpleDiffCallback());
        Intrinsics.checkNotNullParameter(function1, "actionCallback");
        this.actionCallback = function1;
    }

    public final Function1<PrizeDisplayType, Unit> getActionCallback() {
        return this.actionCallback;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        switch (i) {
            case 0:
                LayoutMultiResultHeaderBinding inflate = LayoutMultiResultHeaderBinding.inflate(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, parent, false)");
                return new MultiResultHeaderViewHolder(inflate);
            case 1:
                LayoutResultHeaderBinding inflate2 = LayoutResultHeaderBinding.inflate(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(inflater, parent, false)");
                return new NorthResultHeaderViewHolder(inflate2);
            case 2:
                LayoutResultDetailBinding inflate3 = LayoutResultDetailBinding.inflate(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(inflater, parent, false)");
                return new MultiResultDetailViewHolder(inflate3);
            case 3:
                LayoutPrizeActionsBinding inflate4 = LayoutPrizeActionsBinding.inflate(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(inflater, parent, false)");
                return new PrizeActionViewHolder(inflate4, this.actionCallback);
            case 4:
                LayoutLotoHeaderBinding inflate5 = LayoutLotoHeaderBinding.inflate(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate5, "inflate(inflater, parent, false)");
                return new LotoHeaderViewHolder(inflate5);
            case 5:
                LayoutResultDetailBinding inflate6 = LayoutResultDetailBinding.inflate(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate6, "inflate(inflater, parent, false)");
                return new LotoRowViewHolder(inflate6);
            case 7:
                return new AdsBannerViewHolder(viewGroup);
            case 8:
                return new MediumAdsBannerViewHolder(viewGroup);
            default:
                View inflate7 = from.inflate(R.layout.layout_slide_guide, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate7, "inflater.inflate(R.layou…ide_guide, parent, false)");
                return new SimpleViewHolder(inflate7);
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        RowData rowData = (RowData) getItem(i);
        if (viewHolder instanceof MultiResultDetailViewHolder) {
            Objects.requireNonNull(rowData, "null cannot be cast to non-null type com.veso.online.data.model.PrizeRowData");
            ((MultiResultDetailViewHolder) viewHolder).bindData((PrizeRowData) rowData);
        } else if (viewHolder instanceof MultiResultHeaderViewHolder) {
            Objects.requireNonNull(rowData, "null cannot be cast to non-null type com.veso.online.data.model.PrizeHeaderData");
            ((MultiResultHeaderViewHolder) viewHolder).bindData((PrizeHeaderData) rowData);
        } else if (viewHolder instanceof NorthResultHeaderViewHolder) {
            Objects.requireNonNull(rowData, "null cannot be cast to non-null type com.veso.online.data.model.NorthPrizeHeaderData");
            ((NorthResultHeaderViewHolder) viewHolder).bindData((NorthPrizeHeaderData) rowData);
        } else if (viewHolder instanceof LotoRowViewHolder) {
            Objects.requireNonNull(rowData, "null cannot be cast to non-null type com.veso.online.data.model.LotoRowData");
            ((LotoRowViewHolder) viewHolder).bindData((LotoRowData) rowData);
        } else if (viewHolder instanceof PrizeActionViewHolder) {
            Objects.requireNonNull(rowData, "null cannot be cast to non-null type com.veso.online.data.model.PrizeActionRow");
            ((PrizeActionViewHolder) viewHolder).bindData((PrizeActionRow) rowData);
        } else if (viewHolder instanceof AdsBannerViewHolder) {
            ((AdsBannerViewHolder) viewHolder).bindData(Integer.valueOf(R.dimen.dp_16), Integer.valueOf(R.dimen.dp_8));
        } else if (viewHolder instanceof MediumAdsBannerViewHolder) {
            ((MediumAdsBannerViewHolder) viewHolder).bindData(Integer.valueOf(R.dimen.dp_16), Integer.valueOf(R.dimen.dp_8));
        }
    }

    public int getItemViewType(int i) {
        return ((RowData) getItem(i)).getType();
    }
}
