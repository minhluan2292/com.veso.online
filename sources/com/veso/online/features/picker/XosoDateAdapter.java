package com.veso.online.features.picker;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import com.veso.online.base.SimpleDiffCallback;
import com.veso.online.databinding.LayoutDateItemBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/veso/online/features/picker/XosoDateAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/veso/online/features/picker/DateItem;", "Lcom/veso/online/features/picker/DateItemViewHolder;", "callback", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoDateAdapter.kt */
public final class XosoDateAdapter extends ListAdapter<DateItem, DateItemViewHolder> {
    private final Function1<DateItem, Unit> callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XosoDateAdapter(Function1<? super DateItem, Unit> function1) {
        super(new SimpleDiffCallback());
        Intrinsics.checkNotNullParameter(function1, "callback");
        this.callback = function1;
    }

    public DateItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutDateItemBinding inflate = LayoutDateItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new DateItemViewHolder(inflate);
    }

    public void onBindViewHolder(DateItemViewHolder dateItemViewHolder, int i) {
        Intrinsics.checkNotNullParameter(dateItemViewHolder, "holder");
        DateItem dateItem = (DateItem) getItem(i);
        TextView root = dateItemViewHolder.getBinding().getRoot();
        root.setText(dateItem.getTitle());
        root.setTypeface(dateItem.getDayOfWeek() == 0 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        root.setOnClickListener(new XosoDateAdapter$$ExternalSyntheticLambda0(this, dateItem));
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-1$lambda-0  reason: not valid java name */
    public static final void m560onBindViewHolder$lambda1$lambda0(XosoDateAdapter xosoDateAdapter, DateItem dateItem, View view) {
        Intrinsics.checkNotNullParameter(xosoDateAdapter, "this$0");
        Function1<DateItem, Unit> function1 = xosoDateAdapter.callback;
        Intrinsics.checkNotNullExpressionValue(dateItem, "item");
        function1.invoke(dateItem);
    }
}
