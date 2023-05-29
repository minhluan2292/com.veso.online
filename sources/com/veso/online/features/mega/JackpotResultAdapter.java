package com.veso.online.features.mega;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.base.AdsBannerViewHolder;
import com.veso.online.base.SimpleDiffCallback;
import com.veso.online.data.model.VietLotHeaderItem;
import com.veso.online.data.model.VietLotItem;
import com.veso.online.data.model.VietLotLoadingItem;
import com.veso.online.data.model.VietlotResultItem;
import com.veso.online.data.model.VietlotType;
import com.veso.online.databinding.LayoutFragmentLoadingBinding;
import com.veso.online.databinding.LayoutKenoHeaderBinding;
import com.veso.online.databinding.LayoutMax3dItemBinding;
import com.veso.online.databinding.LayoutMegaResultItemBinding;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/veso/online/features/mega/JackpotResultAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/veso/online/data/model/VietLotItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "vietlotType", "Lcom/veso/online/data/model/VietlotType;", "(Lcom/veso/online/data/model/VietlotType;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: JackpotResultAdapter.kt */
public final class JackpotResultAdapter extends ListAdapter<VietLotItem, RecyclerView.ViewHolder> {
    private final VietlotType vietlotType;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* compiled from: JackpotResultAdapter.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VietlotType.values().length];
            iArr[VietlotType.MAX3D.ordinal()] = 1;
            iArr[VietlotType.MAX3DPRO.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JackpotResultAdapter(VietlotType vietlotType2) {
        super(new SimpleDiffCallback());
        Intrinsics.checkNotNullParameter(vietlotType2, "vietlotType");
        this.vietlotType = vietlotType2;
    }

    public int getItemViewType(int i) {
        VietLotItem vietLotItem = (VietLotItem) getItem(i);
        if (vietLotItem instanceof VietLotHeaderItem) {
            return 0;
        }
        if (vietLotItem instanceof VietLotLoadingItem) {
            return 1;
        }
        if (!(vietLotItem instanceof VietlotResultItem)) {
            return -1;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.vietlotType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return 2;
        }
        return 3;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            LayoutKenoHeaderBinding inflate = LayoutKenoHeaderBinding.inflate(from, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, parent, false)");
            return new HeaderItemViewHolder(inflate);
        } else if (i == 1) {
            LayoutFragmentLoadingBinding inflate2 = LayoutFragmentLoadingBinding.inflate(from, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(inflater, parent, false)");
            return new DataLoadingViewHolder(inflate2);
        } else if (i == 2) {
            LayoutMax3dItemBinding inflate3 = LayoutMax3dItemBinding.inflate(from, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(inflater, parent, false)");
            return new Max3DItemViewHolder(inflate3);
        } else if (i != 3) {
            return new AdsBannerViewHolder(viewGroup);
        } else {
            LayoutMegaResultItemBinding inflate4 = LayoutMegaResultItemBinding.inflate(from, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(inflater, parent, false)");
            return new JackpotItemViewHolder(inflate4);
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        if (viewHolder instanceof JackpotItemViewHolder) {
            JackpotItemViewHolder jackpotItemViewHolder = (JackpotItemViewHolder) viewHolder;
            Object item = getItem(i);
            Objects.requireNonNull(item, "null cannot be cast to non-null type com.veso.online.data.model.VietlotResultItem");
            jackpotItemViewHolder.bindData((VietlotResultItem) item, this.vietlotType == VietlotType.POWER);
        } else if (viewHolder instanceof Max3DItemViewHolder) {
            Object item2 = getItem(i);
            Objects.requireNonNull(item2, "null cannot be cast to non-null type com.veso.online.data.model.VietlotResultItem");
            ((Max3DItemViewHolder) viewHolder).bindData((VietlotResultItem) item2, this.vietlotType);
        } else if (viewHolder instanceof HeaderItemViewHolder) {
            ((HeaderItemViewHolder) viewHolder).bindData(this.vietlotType);
        } else if (viewHolder instanceof DataLoadingViewHolder) {
            Object item3 = getItem(i);
            Objects.requireNonNull(item3, "null cannot be cast to non-null type com.veso.online.data.model.VietLotLoadingItem");
            ((DataLoadingViewHolder) viewHolder).bindData(((VietLotLoadingItem) item3).getState());
        }
    }
}
