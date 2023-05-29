package com.veso.online.features.dientoan;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.base.AdsBannerViewHolder;
import com.veso.online.base.SimpleDiffCallback;
import com.veso.online.data.model.XoSoDienToanItem;
import com.veso.online.data.model.XoSoDienToanResult;
import com.veso.online.databinding.LayoutDienToanItemBinding;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/veso/online/features/dientoan/XoSoDienToanAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/veso/online/data/model/XoSoDienToanItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XoSoDienToanAdapter.kt */
public final class XoSoDienToanAdapter extends ListAdapter<XoSoDienToanItem, RecyclerView.ViewHolder> {
    public XoSoDienToanAdapter() {
        super(new SimpleDiffCallback());
    }

    public int getItemViewType(int i) {
        return getItem(i) instanceof XoSoDienToanResult ? 1 : 0;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i != 1) {
            return new AdsBannerViewHolder(viewGroup);
        }
        LayoutDienToanItemBinding inflate = LayoutDienToanItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new XoSoDienToanViewHolder(inflate);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        if (viewHolder instanceof XoSoDienToanViewHolder) {
            Object item = getItem(i);
            Objects.requireNonNull(item, "null cannot be cast to non-null type com.veso.online.data.model.XoSoDienToanResult");
            ((XoSoDienToanViewHolder) viewHolder).bindData((XoSoDienToanResult) item);
        }
    }
}
