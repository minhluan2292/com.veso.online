package com.veso.online.features.mega;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.R;
import com.veso.online.base.EndlessScrollListener;
import com.veso.online.data.model.JackpotInfo;
import com.veso.online.data.model.VietlotType;
import com.veso.online.databinding.FragmentMegaListBinding;
import com.veso.online.features.main.AppTitleDelegate;
import com.veso.online.features.main.DateChangeConsumer;
import com.veso.online.features.result.SlidableFragment;
import com.veso.online.utils.DateUtils;
import com.veso.online.utils.ExtensionsKt;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001$B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, d2 = {"Lcom/veso/online/features/mega/JackpotLotteryListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/veso/online/features/main/DateChangeConsumer;", "Lcom/veso/online/features/main/AppTitleDelegate;", "()V", "binding", "Lcom/veso/online/databinding/FragmentMegaListBinding;", "titleRes", "", "getTitleRes", "()I", "vietlotType", "Lcom/veso/online/data/model/VietlotType;", "getVietlotType", "()Lcom/veso/online/data/model/VietlotType;", "viewModel", "Lcom/veso/online/features/mega/JackpotListViewModel;", "getViewModel", "()Lcom/veso/online/features/mega/JackpotListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "applyPower655Style", "", "observeData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDateChanged", "date", "Ljava/util/Date;", "onResume", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: JackpotLotteryListFragment.kt */
public final class JackpotLotteryListFragment extends Fragment implements DateChangeConsumer, AppTitleDelegate {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String KEY_VIETLOT_TYPE = "KEY_VIETLOT_TYPE";
    private FragmentMegaListBinding binding;
    private final Lazy viewModel$delegate = LazyKt.lazy(new JackpotLotteryListFragment$viewModel$2(this));

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* compiled from: JackpotLotteryListFragment.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VietlotType.values().length];
            iArr[VietlotType.POWER.ordinal()] = 1;
            iArr[VietlotType.MAX3D.ordinal()] = 2;
            iArr[VietlotType.MAX3DPRO.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* access modifiers changed from: private */
    public final JackpotListViewModel getViewModel() {
        return (JackpotListViewModel) this.viewModel$delegate.getValue();
    }

    public int getTitleRes() {
        int i = WhenMappings.$EnumSwitchMapping$0[getVietlotType().ordinal()];
        if (i == 1) {
            return R.string.app_title_power;
        }
        if (i != 2) {
            return i != 3 ? R.string.app_title_mega : R.string.app_title_max_3d_pro;
        }
        return R.string.app_title_max_3d;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.veso.online.data.model.VietlotType getVietlotType() {
        /*
            r5 = this;
            android.os.Bundle r0 = r5.getArguments()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x002f
        L_0x0008:
            java.lang.String r2 = "KEY_VIETLOT_TYPE"
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 < r4) goto L_0x001f
            java.io.Serializable r0 = r0.getSerializable(r2)
            boolean r2 = r0 instanceof com.veso.online.data.model.VietlotType
            if (r2 != 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = r0
        L_0x001a:
            com.veso.online.data.model.VietlotType r1 = (com.veso.online.data.model.VietlotType) r1
            java.io.Serializable r1 = (java.io.Serializable) r1
            goto L_0x002d
        L_0x001f:
            java.io.Serializable r0 = r0.getSerializable(r2)
            boolean r2 = r0 instanceof com.veso.online.data.model.VietlotType
            if (r2 != 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = r0
        L_0x0029:
            com.veso.online.data.model.VietlotType r1 = (com.veso.online.data.model.VietlotType) r1
            java.io.Serializable r1 = (java.io.Serializable) r1
        L_0x002d:
            com.veso.online.data.model.VietlotType r1 = (com.veso.online.data.model.VietlotType) r1
        L_0x002f:
            if (r1 != 0) goto L_0x0033
            com.veso.online.data.model.VietlotType r1 = com.veso.online.data.model.VietlotType.MEGA
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.features.mega.JackpotLotteryListFragment.getVietlotType():com.veso.online.data.model.VietlotType");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        FragmentMegaListBinding inflate = FragmentMegaListBinding.inflate(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        FragmentMegaListBinding fragmentMegaListBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        RecyclerView recyclerView = inflate.rcvVietLot;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new JackpotResultAdapter(getVietlotType()));
        recyclerView.addOnScrollListener(new EndlessScrollListener(linearLayoutManager, new JackpotLotteryListFragment$onCreateView$1$1(this)));
        int i = WhenMappings.$EnumSwitchMapping$0[getVietlotType().ordinal()];
        if (i == 1) {
            applyPower655Style();
        } else if (i == 2 || i == 3) {
            FragmentMegaListBinding fragmentMegaListBinding2 = this.binding;
            if (fragmentMegaListBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMegaListBinding2 = null;
            }
            fragmentMegaListBinding2.headerMegaNPower.setVisibility(8);
            FragmentMegaListBinding fragmentMegaListBinding3 = this.binding;
            if (fragmentMegaListBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMegaListBinding3 = null;
            }
            LinearLayout root = fragmentMegaListBinding3.getRoot();
            FragmentMegaListBinding fragmentMegaListBinding4 = this.binding;
            if (fragmentMegaListBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMegaListBinding4 = null;
            }
            root.setBackgroundColor(ContextCompat.getColor(fragmentMegaListBinding4.getRoot().getContext(), R.color.bg_max_3d));
        }
        observeData();
        JackpotListViewModel.fetchData$default(getViewModel(), getVietlotType(), (String) null, 2, (Object) null);
        FragmentMegaListBinding fragmentMegaListBinding5 = this.binding;
        if (fragmentMegaListBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentMegaListBinding = fragmentMegaListBinding5;
        }
        LinearLayout root2 = fragmentMegaListBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.root");
        return root2;
    }

    public void onResume() {
        super.onResume();
        int i = WhenMappings.$EnumSwitchMapping$0[getVietlotType().ordinal()];
        String str = i != 1 ? i != 2 ? i != 3 ? "VietlotMega645List" : "VietlotMax3DProList" : "VietlotMax3DList" : "VietlotPower655List";
        Context context = getContext();
        if (context != null) {
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
            ExtensionsKt.trackScreen(context, str, simpleName);
        }
    }

    private final void applyPower655Style() {
        FragmentMegaListBinding fragmentMegaListBinding = this.binding;
        if (fragmentMegaListBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMegaListBinding = null;
        }
        fragmentMegaListBinding.getRoot().setBackgroundColor(ContextCompat.getColor(fragmentMegaListBinding.getRoot().getContext(), R.color.bg_power));
        fragmentMegaListBinding.ivLogo.setImageResource(R.drawable.logo_power_655);
        fragmentMegaListBinding.tvJackpotPrize.setBackgroundResource(R.drawable.bg_text_power_jackpot);
        fragmentMegaListBinding.tvJackpotPrize.setTextColor(-1);
        fragmentMegaListBinding.tvJackpot2Prize.setVisibility(0);
    }

    private final void observeData() {
        getViewModel().getVietlotResults().observe(getViewLifecycleOwner(), new JackpotLotteryListFragment$$ExternalSyntheticLambda1(this));
        getViewModel().getJackpotInfo().observe(getViewLifecycleOwner(), new JackpotLotteryListFragment$$ExternalSyntheticLambda0(this));
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m548observeData$lambda2(com.veso.online.features.mega.JackpotLotteryListFragment r2, java.util.List r3) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.veso.online.databinding.FragmentMegaListBinding r2 = r2.binding
            r0 = 0
            if (r2 != 0) goto L_0x0010
            java.lang.String r2 = "binding"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r2 = r0
        L_0x0010:
            androidx.recyclerview.widget.RecyclerView r2 = r2.rcvVietLot
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r2.getAdapter()
            boolean r1 = r2 instanceof com.veso.online.features.mega.JackpotResultAdapter
            if (r1 == 0) goto L_0x001d
            r0 = r2
            com.veso.online.features.mega.JackpotResultAdapter r0 = (com.veso.online.features.mega.JackpotResultAdapter) r0
        L_0x001d:
            if (r0 != 0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            r0.submitList(r3)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.features.mega.JackpotLotteryListFragment.m548observeData$lambda2(com.veso.online.features.mega.JackpotLotteryListFragment, java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-3  reason: not valid java name */
    public static final void m549observeData$lambda3(JackpotLotteryListFragment jackpotLotteryListFragment, JackpotInfo jackpotInfo) {
        Intrinsics.checkNotNullParameter(jackpotLotteryListFragment, "this$0");
        FragmentMegaListBinding fragmentMegaListBinding = jackpotLotteryListFragment.binding;
        String str = null;
        if (fragmentMegaListBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMegaListBinding = null;
        }
        fragmentMegaListBinding.tvJackpotPrize.setText(jackpotInfo == null ? null : jackpotInfo.getJackpot());
        FragmentMegaListBinding fragmentMegaListBinding2 = jackpotLotteryListFragment.binding;
        if (fragmentMegaListBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMegaListBinding2 = null;
        }
        TextView textView = fragmentMegaListBinding2.tvJackpot2Prize;
        if (jackpotInfo != null) {
            str = jackpotInfo.getJackpot2();
        }
        textView.setText(str);
    }

    public void onDateChanged(Date date) {
        Intrinsics.checkNotNullParameter(date, SlidableFragment.KEY_DATE);
        getViewModel().fetchData(getVietlotType(), ExtensionsKt.isToday(date) ? null : DateUtils.INSTANCE.format(date));
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/veso/online/features/mega/JackpotLotteryListFragment$Companion;", "", "()V", "KEY_VIETLOT_TYPE", "", "args", "Landroid/os/Bundle;", "type", "Lcom/veso/online/data/model/VietlotType;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: JackpotLotteryListFragment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Bundle args(VietlotType vietlotType) {
            Intrinsics.checkNotNullParameter(vietlotType, "type");
            return BundleKt.bundleOf(TuplesKt.to(JackpotLotteryListFragment.KEY_VIETLOT_TYPE, vietlotType));
        }
    }
}
