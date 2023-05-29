package com.veso.online.features.picker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import com.veso.online.base.SimpleDiffCallback;
import com.veso.online.data.model.MenuAction;
import com.veso.online.data.model.XosoConfig;
import com.veso.online.databinding.LayoutProvinceVhBinding;
import com.veso.online.features.main.OnMenuItemSelected;
import com.veso.online.features.result.detail.ResultDetailFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/veso/online/features/picker/ProvinceAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/veso/online/data/model/XosoConfig;", "Lcom/veso/online/features/picker/ProvinceViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ProvinceAdapter.kt */
public final class ProvinceAdapter extends ListAdapter<XosoConfig, ProvinceViewHolder> {
    public ProvinceAdapter() {
        super(new SimpleDiffCallback());
    }

    public ProvinceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutProvinceVhBinding inflate = LayoutProvinceVhBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, parent, false)");
        return new ProvinceViewHolder(inflate);
    }

    public void onBindViewHolder(ProvinceViewHolder provinceViewHolder, int i) {
        Intrinsics.checkNotNullParameter(provinceViewHolder, "holder");
        XosoConfig xosoConfig = (XosoConfig) getItem(i);
        TextView root = provinceViewHolder.getBinding().getRoot();
        root.setText(xosoConfig.getName());
        root.setOnClickListener(new ProvinceAdapter$$ExternalSyntheticLambda0(root, xosoConfig));
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-1$lambda-0  reason: not valid java name */
    public static final void m557onBindViewHolder$lambda1$lambda0(TextView textView, XosoConfig xosoConfig, View view) {
        Intrinsics.checkNotNullParameter(textView, "$this_apply");
        Context context = textView.getContext();
        OnMenuItemSelected onMenuItemSelected = context instanceof OnMenuItemSelected ? (OnMenuItemSelected) context : null;
        if (onMenuItemSelected != null) {
            OnMenuItemSelected.DefaultImpls.onMenuSelected$default(onMenuItemSelected, MenuAction.XOSO_RESULT, ResultDetailFragment.Companion.argsForChannel(xosoConfig.getId()), false, 4, (Object) null);
        }
    }
}
