package com.veso.online.features.keno.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.R;
import com.veso.online.base.AdsBannerViewHolder;
import com.veso.online.base.SimpleDiffCallback;
import com.veso.online.data.model.KenoHeader;
import com.veso.online.data.model.KenoItem;
import com.veso.online.data.model.KenoResult;
import com.veso.online.databinding.LayoutKenoResultItemBinding;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/veso/online/features/keno/list/KenoResultAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/veso/online/data/model/KenoItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoResultAdapter.kt */
public final class KenoResultAdapter extends ListAdapter<KenoItem, RecyclerView.ViewHolder> {
    public KenoResultAdapter() {
        super(new SimpleDiffCallback());
    }

    public int getItemViewType(int i) {
        KenoItem kenoItem = (KenoItem) getItem(i);
        if (kenoItem instanceof KenoHeader) {
            return 0;
        }
        return kenoItem instanceof KenoResult ? 1 : -1;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            View inflate = from.inflate(R.layout.layout_keno_header, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…no_header, parent, false)");
            return new KenoHeaderViewHolder(inflate);
        } else if (i != 1) {
            return new AdsBannerViewHolder(viewGroup);
        } else {
            LayoutKenoResultItemBinding inflate2 = LayoutKenoResultItemBinding.inflate(from, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(inflater, parent, false)");
            return new KenoResultViewHolder(inflate2);
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        if (viewHolder instanceof KenoResultViewHolder) {
            Object item = getItem(i);
            Objects.requireNonNull(item, "null cannot be cast to non-null type com.veso.online.data.model.KenoResult");
            ((KenoResultViewHolder) viewHolder).bindData((KenoResult) item);
        }
    }
}
