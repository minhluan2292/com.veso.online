package com.veso.online.features.dientoan;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.R;
import com.veso.online.base.EndlessScrollListener;
import com.veso.online.data.model.LoadingState;
import com.veso.online.databinding.FragmentXosoDienToanBinding;
import com.veso.online.databinding.LayoutFragmentLoadingBinding;
import com.veso.online.features.main.AppTitleDelegate;
import com.veso.online.features.main.DateChangeConsumer;
import com.veso.online.features.result.SlidableFragment;
import com.veso.online.utils.DateUtils;
import com.veso.online.utils.ExtensionsKt;
import com.veso.online.utils.ViewBindingExtKt;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/veso/online/features/dientoan/XosoDienToanMBFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/veso/online/features/main/DateChangeConsumer;", "Lcom/veso/online/features/main/AppTitleDelegate;", "()V", "binding", "Lcom/veso/online/databinding/FragmentXosoDienToanBinding;", "titleRes", "", "getTitleRes", "()I", "viewModel", "Lcom/veso/online/features/dientoan/XoSoDienToanViewModel;", "getViewModel", "()Lcom/veso/online/features/dientoan/XoSoDienToanViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDateChanged", "", "date", "Ljava/util/Date;", "onResume", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoDienToanMBFragment.kt */
public final class XosoDienToanMBFragment extends Fragment implements DateChangeConsumer, AppTitleDelegate {
    private FragmentXosoDienToanBinding binding;
    private final Lazy viewModel$delegate = LazyKt.lazy(new XosoDienToanMBFragment$viewModel$2(this));

    public int getTitleRes() {
        return R.string.kq_xs_dien_toan_mb;
    }

    /* access modifiers changed from: private */
    public final XoSoDienToanViewModel getViewModel() {
        return (XoSoDienToanViewModel) this.viewModel$delegate.getValue();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        FragmentXosoDienToanBinding inflate = FragmentXosoDienToanBinding.inflate(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        FragmentXosoDienToanBinding fragmentXosoDienToanBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        RecyclerView recyclerView = inflate.rcvDienToan;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new XoSoDienToanAdapter());
        recyclerView.addOnScrollListener(new EndlessScrollListener(linearLayoutManager, new XosoDienToanMBFragment$onCreateView$1$1(this)));
        getViewModel().getResults().observe(getViewLifecycleOwner(), new XosoDienToanMBFragment$$ExternalSyntheticLambda1(this));
        getViewModel().getLoadingState().observe(getViewLifecycleOwner(), new XosoDienToanMBFragment$$ExternalSyntheticLambda0(this));
        XoSoDienToanViewModel.fetchResult$default(getViewModel(), (String) null, 1, (Object) null);
        FragmentXosoDienToanBinding fragmentXosoDienToanBinding2 = this.binding;
        if (fragmentXosoDienToanBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentXosoDienToanBinding = fragmentXosoDienToanBinding2;
        }
        return fragmentXosoDienToanBinding.getRoot();
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m522onCreateView$lambda1(com.veso.online.features.dientoan.XosoDienToanMBFragment r2, java.util.List r3) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.veso.online.databinding.FragmentXosoDienToanBinding r2 = r2.binding
            r0 = 0
            if (r2 != 0) goto L_0x0010
            java.lang.String r2 = "binding"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r2 = r0
        L_0x0010:
            androidx.recyclerview.widget.RecyclerView r2 = r2.rcvDienToan
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r2.getAdapter()
            boolean r1 = r2 instanceof com.veso.online.features.dientoan.XoSoDienToanAdapter
            if (r1 == 0) goto L_0x001d
            r0 = r2
            com.veso.online.features.dientoan.XoSoDienToanAdapter r0 = (com.veso.online.features.dientoan.XoSoDienToanAdapter) r0
        L_0x001d:
            if (r0 != 0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            r0.submitList(r3)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.features.dientoan.XosoDienToanMBFragment.m522onCreateView$lambda1(com.veso.online.features.dientoan.XosoDienToanMBFragment, java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-2  reason: not valid java name */
    public static final void m523onCreateView$lambda2(XosoDienToanMBFragment xosoDienToanMBFragment, LoadingState loadingState) {
        Intrinsics.checkNotNullParameter(xosoDienToanMBFragment, "this$0");
        FragmentXosoDienToanBinding fragmentXosoDienToanBinding = xosoDienToanMBFragment.binding;
        if (fragmentXosoDienToanBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentXosoDienToanBinding = null;
        }
        LayoutFragmentLoadingBinding layoutFragmentLoadingBinding = fragmentXosoDienToanBinding.fragmentLoading;
        Intrinsics.checkNotNullExpressionValue(layoutFragmentLoadingBinding, "binding.fragmentLoading");
        Intrinsics.checkNotNullExpressionValue(loadingState, "it");
        ViewBindingExtKt.setState(layoutFragmentLoadingBinding, loadingState);
    }

    public void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
            ExtensionsKt.trackScreen(context, "XosoDienToanMB", simpleName);
        }
    }

    public void onDateChanged(Date date) {
        Intrinsics.checkNotNullParameter(date, SlidableFragment.KEY_DATE);
        getViewModel().fetchResult(ExtensionsKt.isToday(date) ? null : DateUtils.INSTANCE.format(date));
    }
}
