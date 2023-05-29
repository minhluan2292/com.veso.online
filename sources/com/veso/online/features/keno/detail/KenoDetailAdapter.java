package com.veso.online.features.keno.detail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.R;
import com.veso.online.base.MediumAdsBannerViewHolder;
import com.veso.online.base.SimpleDiffCallback;
import com.veso.online.data.model.KenoItem;
import com.veso.online.data.model.KenoPrizeRow;
import com.veso.online.data.model.KenoPrizeSection;
import com.veso.online.data.model.KenoPrizeTableHeader;
import com.veso.online.data.model.KenoPrizeTableLoading;
import com.veso.online.data.model.KenoResult;
import com.veso.online.databinding.LayoutKenoInfoBinding;
import com.veso.online.databinding.LayoutKenoTableRowBinding;
import com.veso.online.databinding.LayoutKenoTableSectionBinding;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/veso/online/features/keno/detail/KenoDetailAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/veso/online/data/model/KenoItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoDetailAdapter.kt */
public final class KenoDetailAdapter extends ListAdapter<KenoItem, RecyclerView.ViewHolder> {
    public KenoDetailAdapter() {
        super(new SimpleDiffCallback());
    }

    public int getItemViewType(int i) {
        KenoItem kenoItem = (KenoItem) getItem(i);
        if (kenoItem instanceof KenoResult) {
            return 0;
        }
        if (kenoItem instanceof KenoPrizeTableHeader) {
            return 1;
        }
        if (kenoItem instanceof KenoPrizeSection) {
            return 2;
        }
        if (kenoItem instanceof KenoPrizeRow) {
            return 3;
        }
        return kenoItem instanceof KenoPrizeTableLoading ? 4 : -1;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            LayoutKenoInfoBinding inflate = LayoutKenoInfoBinding.inflate(from, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, parent, false)");
            return new KenoInfoViewHolder(inflate);
        } else if (i == 1) {
            View inflate2 = from.inflate(R.layout.layout_keno_table_header, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflater.inflate(R.layou…le_header, parent, false)");
            return new KenoTableHeaderViewHolder(inflate2);
        } else if (i == 2) {
            LayoutKenoTableSectionBinding inflate3 = LayoutKenoTableSectionBinding.inflate(from, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(inflater, parent, false)");
            return new KenoTableSectionViewHolder(inflate3);
        } else if (i == 3) {
            LayoutKenoTableRowBinding inflate4 = LayoutKenoTableRowBinding.inflate(from, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(inflater, parent, false)");
            return new KenoTableRowViewHolder(inflate4);
        } else if (i != 4) {
            return new MediumAdsBannerViewHolder(viewGroup);
        } else {
            View inflate5 = from.inflate(R.layout.layout_keno_table_loading, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate5, "inflater.inflate(R.layou…e_loading, parent, false)");
            return new KenoTableLoadingViewHolder(inflate5);
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        if (viewHolder instanceof KenoInfoViewHolder) {
            Object item = getItem(i);
            Objects.requireNonNull(item, "null cannot be cast to non-null type com.veso.online.data.model.KenoResult");
            ((KenoInfoViewHolder) viewHolder).bindData((KenoResult) item);
        } else if (viewHolder instanceof KenoTableSectionViewHolder) {
            Object item2 = getItem(i);
            Objects.requireNonNull(item2, "null cannot be cast to non-null type com.veso.online.data.model.KenoPrizeSection");
            ((KenoTableSectionViewHolder) viewHolder).bindData((KenoPrizeSection) item2);
        } else if (viewHolder instanceof KenoTableRowViewHolder) {
            Object item3 = getItem(i);
            Objects.requireNonNull(item3, "null cannot be cast to non-null type com.veso.online.data.model.KenoPrizeRow");
            ((KenoTableRowViewHolder) viewHolder).bindData((KenoPrizeRow) item3);
        }
    }
}
