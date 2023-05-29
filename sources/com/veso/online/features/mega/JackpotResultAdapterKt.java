package com.veso.online.features.mega;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.firebase.messaging.Constants;
import com.veso.online.R;
import com.veso.online.data.model.VietlotResultItem;
import com.veso.online.databinding.LayoutMax3dItemBinding;
import com.veso.online.databinding.LayoutMaxLotRowBinding;
import com.veso.online.databinding.LayoutPrizeTextBinding;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a.\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¨\u0006\u0016"}, d2 = {"addPrizeText", "", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "value", "", "textColor", "", "newTextSize", "", "bindData", "Lcom/veso/online/databinding/LayoutMax3dItemBinding;", "data", "Lcom/veso/online/data/model/VietlotResultItem;", "bindResult", "Lcom/veso/online/databinding/LayoutMaxLotRowBinding;", "result", "prizeRes", "textSizeRes", "textColorRes", "app_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* compiled from: JackpotResultAdapter.kt */
public final class JackpotResultAdapterKt {
    public static final void bindData(LayoutMax3dItemBinding layoutMax3dItemBinding, VietlotResultItem vietlotResultItem) {
        Intrinsics.checkNotNullParameter(layoutMax3dItemBinding, "<this>");
        Intrinsics.checkNotNullParameter(vietlotResultItem, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        layoutMax3dItemBinding.tvDate.setText(vietlotResultItem.getDate());
        layoutMax3dItemBinding.tvPeriod.setText(vietlotResultItem.getLv());
        List<String> result = vietlotResultItem.result();
        LayoutMaxLotRowBinding layoutMaxLotRowBinding = layoutMax3dItemBinding.prizeSpecial;
        Intrinsics.checkNotNullExpressionValue(layoutMaxLotRowBinding, "prizeSpecial");
        bindResult(layoutMaxLotRowBinding, (String) CollectionsKt.getOrNull(result, 0), R.string.prize_db, R.dimen.sp_26, R.color.primary);
        LayoutMaxLotRowBinding layoutMaxLotRowBinding2 = layoutMax3dItemBinding.prize1;
        Intrinsics.checkNotNullExpressionValue(layoutMaxLotRowBinding2, "prize1");
        bindResult(layoutMaxLotRowBinding2, (String) CollectionsKt.getOrNull(result, 1), R.string.prize_1, R.dimen.sp_22, R.color.black);
        LayoutMaxLotRowBinding layoutMaxLotRowBinding3 = layoutMax3dItemBinding.prize2;
        Intrinsics.checkNotNullExpressionValue(layoutMaxLotRowBinding3, "prize2");
        bindResult(layoutMaxLotRowBinding3, (String) CollectionsKt.getOrNull(result, 2), R.string.prize_2, R.dimen.sp_22, R.color.black);
        LayoutMaxLotRowBinding layoutMaxLotRowBinding4 = layoutMax3dItemBinding.prize3;
        Intrinsics.checkNotNullExpressionValue(layoutMaxLotRowBinding4, "prize3");
        bindResult(layoutMaxLotRowBinding4, (String) CollectionsKt.getOrNull(result, 3), R.string.prize_3, R.dimen.sp_22, R.color.black);
    }

    private static final void bindResult(LayoutMaxLotRowBinding layoutMaxLotRowBinding, String str, int i, int i2, int i3) {
        List<String> list;
        layoutMaxLotRowBinding.tvPrize.setText(i);
        layoutMaxLotRowBinding.llPrizeResult.removeAllViews();
        if (str == null) {
            list = null;
        } else {
            list = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
        }
        Collection collection = list;
        if (!(collection == null || collection.isEmpty())) {
            LayoutInflater from = LayoutInflater.from(layoutMaxLotRowBinding.getRoot().getContext());
            int color = ContextCompat.getColor(layoutMaxLotRowBinding.getRoot().getContext(), i3);
            float dimensionPixelSize = (float) layoutMaxLotRowBinding.getRoot().getResources().getDimensionPixelSize(i2);
            if (list.size() < 4) {
                for (String addPrizeText : list) {
                    Intrinsics.checkNotNullExpressionValue(from, "inflater");
                    LinearLayout linearLayout = layoutMaxLotRowBinding.llPrizeResult;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "llPrizeResult");
                    addPrizeText(from, linearLayout, addPrizeText, color, dimensionPixelSize);
                }
                return;
            }
            layoutMaxLotRowBinding.llPrizeResult.setOrientation(1);
            int i4 = list.size() == 4 ? 2 : 3;
            int size = list.size() / i4;
            int i5 = list.size() % i4 > 0 ? 1 : 0;
            List reversed = CollectionsKt.reversed(list);
            Iterable until = RangesKt.until(0, size + i5);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                arrayList.add(reversed.subList(nextInt * i4, RangesKt.coerceAtMost(reversed.size(), (nextInt + 1) * i4)));
            }
            for (List reversed2 : CollectionsKt.reversed((List) arrayList)) {
                LinearLayout linearLayout2 = new LinearLayout(layoutMaxLotRowBinding.getRoot().getContext());
                layoutMaxLotRowBinding.llPrizeResult.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
                for (String addPrizeText2 : CollectionsKt.reversed(reversed2)) {
                    Intrinsics.checkNotNullExpressionValue(from, "inflater");
                    addPrizeText(from, linearLayout2, addPrizeText2, color, dimensionPixelSize);
                }
            }
        }
    }

    private static final void addPrizeText(LayoutInflater layoutInflater, ViewGroup viewGroup, String str, int i, float f) {
        TextView root = LayoutPrizeTextBinding.inflate(layoutInflater, viewGroup, true).getRoot();
        root.setText(str);
        root.setTextColor(i);
        root.setTextSize(0, f);
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = 0;
            layoutParams2.weight = 1.0f;
        }
        Intrinsics.checkNotNullExpressionValue(root, "");
        int dimensionPixelSize = root.getResources().getDimensionPixelSize(R.dimen.dp_1);
        root.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }
}
