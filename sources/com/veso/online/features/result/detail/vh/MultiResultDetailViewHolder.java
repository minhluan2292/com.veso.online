package com.veso.online.features.result.detail.vh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.messaging.Constants;
import com.veso.online.R;
import com.veso.online.data.model.PrizeRowData;
import com.veso.online.data.model.TextStyle;
import com.veso.online.databinding.LayoutLoadingBinding;
import com.veso.online.databinding.LayoutPrizeTextBinding;
import com.veso.online.databinding.LayoutResultDetailBinding;
import com.veso.online.databinding.LayoutTicketTypeBinding;
import com.veso.online.utils.ExtensionsKt;
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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0002J&\u0010\u0011\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J&\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\f\u0010\u0014\u001a\u00020\n*\u00020\nH\u0002J\f\u0010\u0015\u001a\u00020\u0010*\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/veso/online/features/result/detail/vh/MultiResultDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutResultDetailBinding;", "(Lcom/veso/online/databinding/LayoutResultDetailBinding;)V", "bindData", "", "data", "Lcom/veso/online/data/model/PrizeRowData;", "inflatePrizeText", "Landroidx/viewbinding/ViewBinding;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "result", "", "populateMultiResultForManyChannel", "", "populateMultiResultForSingleChannel", "applyHorizontalSketch", "randomResult", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: MultiResultDetailViewHolder.kt */
public final class MultiResultDetailViewHolder extends RecyclerView.ViewHolder {
    private final LayoutResultDetailBinding binding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiResultDetailViewHolder(LayoutResultDetailBinding layoutResultDetailBinding) {
        super(layoutResultDetailBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutResultDetailBinding, "binding");
        this.binding = layoutResultDetailBinding;
    }

    public final void bindData(PrizeRowData prizeRowData) {
        Intrinsics.checkNotNullParameter(prizeRowData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.binding.tvFirstCol.setText(prizeRowData.getPrizeName());
        this.binding.llResultContent.removeAllViews();
        LayoutInflater from = LayoutInflater.from(this.itemView.getContext());
        int i = 0;
        int i2 = prizeRowData.getResults().size() > 1 ? 1 : 0;
        this.binding.llResultContent.setOrientation(i2 ^ 1);
        for (Object next : prizeRowData.getResults()) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List list = (List) next;
            if (i > 0) {
                View view = new View(this.itemView.getContext());
                view.setBackgroundColor(ContextCompat.getColor(this.itemView.getContext(), R.color.divider));
                this.binding.llResultContent.addView(view, 1, -1);
            }
            if (list.size() > 1) {
                if (i2 != 0) {
                    Intrinsics.checkNotNullExpressionValue(from, "inflater");
                    populateMultiResultForManyChannel(list, from, prizeRowData);
                } else {
                    Intrinsics.checkNotNullExpressionValue(from, "inflater");
                    populateMultiResultForSingleChannel(list, from, prizeRowData);
                }
            } else if (list.size() == 1) {
                String str = (String) CollectionsKt.getOrNull(prizeRowData.getTicketType(), i);
                if (i2 == 0 && str != null) {
                    LayoutTicketTypeBinding.inflate(from, this.binding.llResultContent, true).getRoot().setText(str);
                }
                Intrinsics.checkNotNullExpressionValue(from, "inflater");
                LinearLayout linearLayout = this.binding.llResultContent;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llResultContent");
                ViewBinding inflatePrizeText = inflatePrizeText(from, linearLayout, (String) CollectionsKt.first(list), prizeRowData);
                if (i2 != 0) {
                    applyHorizontalSketch(inflatePrizeText);
                }
            }
            i = i3;
        }
    }

    private final void populateMultiResultForManyChannel(List<String> list, LayoutInflater layoutInflater, PrizeRowData prizeRowData) {
        LinearLayout linearLayout = new LinearLayout(this.itemView.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        this.binding.llResultContent.addView(linearLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
        for (String inflatePrizeText : list) {
            inflatePrizeText(layoutInflater, linearLayout, inflatePrizeText, prizeRowData);
        }
    }

    private final void populateMultiResultForSingleChannel(List<String> list, LayoutInflater layoutInflater, PrizeRowData prizeRowData) {
        List<T> list2;
        int i = 3;
        if (list.size() <= 4) {
            i = (list.size() <= 3 || prizeRowData.getPrize() >= 7) ? -1 : 2;
        }
        if (i > 0) {
            int size = list.size() / i;
            if (size * i < list.size()) {
                size++;
            }
            Iterable until = RangesKt.until(0, size);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                arrayList.add(list.subList(nextInt * i, Math.min(list.size(), (nextInt + 1) * i)));
            }
            list2 = (List) arrayList;
        } else {
            list2 = CollectionsKt.listOf(list);
        }
        for (T<String> it2 : list2) {
            LinearLayout linearLayout = new LinearLayout(this.itemView.getContext());
            linearLayout.setOrientation(0);
            linearLayout.setGravity(1);
            this.binding.llResultContent.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            for (String inflatePrizeText : it2) {
                applyHorizontalSketch(inflatePrizeText(layoutInflater, linearLayout, inflatePrizeText, prizeRowData));
            }
        }
    }

    private final ViewBinding inflatePrizeText(LayoutInflater layoutInflater, ViewGroup viewGroup, String str, PrizeRowData prizeRowData) {
        CharSequence charSequence = str;
        if (StringsKt.contains$default(charSequence, (CharSequence) "*", false, 2, (Object) null)) {
            LayoutLoadingBinding inflate = LayoutLoadingBinding.inflate(layoutInflater, viewGroup, true);
            Intrinsics.checkNotNullExpressionValue(inflate, "{\n            LayoutLoad…, parent, true)\n        }");
            return inflate;
        }
        LayoutPrizeTextBinding inflate2 = LayoutPrizeTextBinding.inflate(layoutInflater, viewGroup, true);
        if (StringsKt.contains$default(charSequence, (CharSequence) "+", false, 2, (Object) null)) {
            inflate2.getRoot().postDelayed(new MultiResultDetailViewHolder$inflatePrizeText$1$randomTask$1(inflate2, prizeRowData, this, str), 200);
            inflate2.getRoot().setText(ExtensionsKt.getDisplayText(prizeRowData.getDisplayType(), randomResult(str)));
            inflate2.getRoot().setAlpha(0.5f);
        } else {
            inflate2.getRoot().setText(ExtensionsKt.getDisplayText(prizeRowData.getDisplayType(), str));
        }
        TextStyle textStyle = prizeRowData.getTextStyle();
        if (textStyle != null) {
            RecyclerView.ViewHolder viewHolder = this;
            inflate2.getRoot().setTextColor(ContextCompat.getColor(ExtensionsKt.getContext(viewHolder), textStyle.getColor()));
            inflate2.getRoot().setTextSize(0, (float) ExtensionsKt.getContext(viewHolder).getResources().getDimensionPixelSize(textStyle.getSize()));
        }
        Intrinsics.checkNotNullExpressionValue(inflate2, "{\n            LayoutPriz…}\n            }\n        }");
        return inflate2;
    }

    /* access modifiers changed from: private */
    public final String randomResult(String str) {
        return CollectionsKt.joinToString$default(RangesKt.until(0, str.length()), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, MultiResultDetailViewHolder$randomResult$1.INSTANCE, 30, (Object) null);
    }

    private final ViewBinding applyHorizontalSketch(ViewBinding viewBinding) {
        ViewGroup.LayoutParams layoutParams = viewBinding.getRoot().getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = 0;
            layoutParams2.weight = 1.0f;
            layoutParams2.gravity = 16;
        }
        return viewBinding;
    }
}
