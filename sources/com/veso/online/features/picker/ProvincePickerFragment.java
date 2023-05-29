package com.veso.online.features.picker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.data.model.XosoConfig;
import com.veso.online.databinding.FragmentProvincePickerBinding;
import com.veso.online.utils.ExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/veso/online/features/picker/ProvincePickerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/veso/online/databinding/FragmentProvincePickerBinding;", "bindList", "", "rcv", "Landroidx/recyclerview/widget/RecyclerView;", "configs", "", "Lcom/veso/online/data/model/XosoConfig;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ProvincePickerFragment.kt */
public final class ProvincePickerFragment extends Fragment {
    private FragmentProvincePickerBinding binding;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        FragmentProvincePickerBinding inflate = FragmentProvincePickerBinding.inflate(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        FragmentProvincePickerBinding fragmentProvincePickerBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        RecyclerView recyclerView = inflate.rcvPickerSouth;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rcvPickerSouth");
        Collection arrayList = new ArrayList();
        for (Object next : XosoConfig.Companion.getAllConfig()) {
            if (Intrinsics.areEqual((Object) ((XosoConfig) next).getType(), (Object) XosoConfig.REGION_ID_SOUTH)) {
                arrayList.add(next);
            }
        }
        bindList(recyclerView, (List) arrayList);
        FragmentProvincePickerBinding fragmentProvincePickerBinding2 = this.binding;
        if (fragmentProvincePickerBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentProvincePickerBinding2 = null;
        }
        RecyclerView recyclerView2 = fragmentProvincePickerBinding2.rcvPickerMiddle;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.rcvPickerMiddle");
        Collection arrayList2 = new ArrayList();
        for (Object next2 : XosoConfig.Companion.getAllConfig()) {
            if (Intrinsics.areEqual((Object) ((XosoConfig) next2).getType(), (Object) XosoConfig.REGION_ID_MIDDLE)) {
                arrayList2.add(next2);
            }
        }
        bindList(recyclerView2, (List) arrayList2);
        FragmentProvincePickerBinding fragmentProvincePickerBinding3 = this.binding;
        if (fragmentProvincePickerBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentProvincePickerBinding3 = null;
        }
        fragmentProvincePickerBinding3.ibClose.setOnClickListener(new ProvincePickerFragment$$ExternalSyntheticLambda0(this));
        FragmentProvincePickerBinding fragmentProvincePickerBinding4 = this.binding;
        if (fragmentProvincePickerBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentProvincePickerBinding = fragmentProvincePickerBinding4;
        }
        LinearLayout root = fragmentProvincePickerBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-2  reason: not valid java name */
    public static final void m558onCreateView$lambda2(ProvincePickerFragment provincePickerFragment, View view) {
        Intrinsics.checkNotNullParameter(provincePickerFragment, "this$0");
        FragmentActivity activity = provincePickerFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
            ExtensionsKt.trackScreen(context, "ProvincePicker", simpleName);
        }
    }

    private final void bindList(RecyclerView recyclerView, List<XosoConfig> list) {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ProvinceAdapter provinceAdapter = new ProvinceAdapter();
        provinceAdapter.submitList(list);
        recyclerView.setAdapter(provinceAdapter);
    }
}
