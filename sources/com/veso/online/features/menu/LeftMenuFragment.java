package com.veso.online.features.menu;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.veso.online.R;
import com.veso.online.data.model.Menu;
import com.veso.online.data.model.MenuAction;
import com.veso.online.databinding.FragmentLeftMenuBinding;
import com.veso.online.databinding.LayoutMultiMenuItemBinding;
import com.veso.online.features.main.OnMenuItemSelected;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J6\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/veso/online/features/menu/LeftMenuFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/veso/online/databinding/FragmentLeftMenuBinding;", "addSectionTitle", "", "inflater", "Landroid/view/LayoutInflater;", "titleRes", "", "addSingleMenuItem", "iconRes", "top", "menuAction", "Lcom/veso/online/data/model/MenuAction;", "onCreateView", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "populateMenus", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: LeftMenuFragment.kt */
public final class LeftMenuFragment extends Fragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final List<Menu> digitalLotteryMenus = CollectionsKt.listOf(new Menu(R.drawable.ic_lottery_keno, R.string.xoso_keno, MenuAction.XOSO_KENO), new Menu(R.drawable.ic_loterry_mega_645, R.string.xoso_mega, MenuAction.XOSO_VIETLOT_MEGA), new Menu(R.drawable.ic_lottery_power_655, R.string.xoso_power, MenuAction.XOSO_VIETLOT_POWER), new Menu(R.drawable.ic_lottery_max_3d_pro, R.string.xoso_max_3d_pro, MenuAction.XOSO_MAX_3D_PRO), new Menu(R.drawable.ic_lottery_max_3d, R.string.xoso_max_3d, MenuAction.XOSO_MAX_3D));
    private static final List<Menu> mediaMenus = CollectionsKt.listOf(new Menu(R.drawable.ic_website, R.string.xoso_website, (MenuAction) null, 4, (DefaultConstructorMarker) null), new Menu(R.drawable.ic_chat, R.string.system_chat, (MenuAction) null, 4, (DefaultConstructorMarker) null), new Menu(R.drawable.ic_youtube, R.string.system_youtube, (MenuAction) null, 4, (DefaultConstructorMarker) null));
    private static final List<Menu> statisticsMenus = CollectionsKt.listOf(new Menu(R.drawable.ic_loto_gan, R.string.statistic_loto, MenuAction.STATISTIC_GAN), new Menu(R.drawable.ic_loto_roi, R.string.statistic_max, MenuAction.STATISTIC_MAX), new Menu(R.drawable.ic_frequency, R.string.statistic_freq, MenuAction.STATISTIC_FREQ));
    private FragmentLeftMenuBinding binding;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        FragmentLeftMenuBinding inflate = FragmentLeftMenuBinding.inflate(getLayoutInflater(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater, container, false)");
        this.binding = inflate;
        populateMenus(layoutInflater);
        FragmentLeftMenuBinding fragmentLeftMenuBinding = this.binding;
        FragmentLeftMenuBinding fragmentLeftMenuBinding2 = null;
        if (fragmentLeftMenuBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentLeftMenuBinding = null;
        }
        fragmentLeftMenuBinding.scrollView.setVerticalScrollBarEnabled(false);
        FragmentLeftMenuBinding fragmentLeftMenuBinding3 = this.binding;
        if (fragmentLeftMenuBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentLeftMenuBinding2 = fragmentLeftMenuBinding3;
        }
        LinearLayout root = fragmentLeftMenuBinding2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    private final void populateMenus(LayoutInflater layoutInflater) {
        addSingleMenuItem(layoutInflater, R.drawable.ic_home, R.string.home_page, getResources().getDimensionPixelSize(R.dimen.layout_padding_large), MenuAction.HOME);
        addSectionTitle(layoutInflater, R.string.lottery_tradition);
        LayoutInflater layoutInflater2 = getLayoutInflater();
        FragmentLeftMenuBinding fragmentLeftMenuBinding = this.binding;
        if (fragmentLeftMenuBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentLeftMenuBinding = null;
        }
        LayoutMultiMenuItemBinding inflate = LayoutMultiMenuItemBinding.inflate(layoutInflater2, fragmentLeftMenuBinding.layoutMenus, true);
        inflate.tvXosoNorth.setOnClickListener(new LeftMenuFragment$$ExternalSyntheticLambda0(this));
        inflate.tvXosoMiddle.setOnClickListener(new LeftMenuFragment$$ExternalSyntheticLambda2(this));
        inflate.tvXosoSouth.setOnClickListener(new LeftMenuFragment$$ExternalSyntheticLambda1(this));
        LayoutInflater layoutInflater3 = layoutInflater;
        addSingleMenuItem$default(this, layoutInflater3, R.drawable.ic_lottery_by_province, R.string.xoso_province, 0, MenuAction.XOSO_PROVINCE, 8, (Object) null);
        addSingleMenuItem$default(this, layoutInflater3, R.drawable.ic_lottery_by_date, R.string.xoso_date, 0, MenuAction.XOSO_DATE, 8, (Object) null);
        addSingleMenuItem$default(this, layoutInflater3, R.drawable.ic_xoso_dientoan, R.string.xoso_dien_toan, 0, MenuAction.XOSO_DIEN_TOAN, 8, (Object) null);
        addSectionTitle(layoutInflater, R.string.lottery_digital);
        for (Menu menu : digitalLotteryMenus) {
            addSingleMenuItem$default(this, layoutInflater, menu.getIconRes(), menu.getTitleRes(), 0, menu.getAction(), 8, (Object) null);
        }
        addSectionTitle(layoutInflater, R.string.statistic_and_analysis);
        for (Menu menu2 : statisticsMenus) {
            addSingleMenuItem$default(this, layoutInflater, menu2.getIconRes(), menu2.getTitleRes(), 0, menu2.getAction(), 8, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: populateMenus$lambda-3$lambda-0  reason: not valid java name */
    public static final void m554populateMenus$lambda3$lambda0(LeftMenuFragment leftMenuFragment, View view) {
        Intrinsics.checkNotNullParameter(leftMenuFragment, "this$0");
        Context context = leftMenuFragment.getContext();
        OnMenuItemSelected onMenuItemSelected = context instanceof OnMenuItemSelected ? (OnMenuItemSelected) context : null;
        if (onMenuItemSelected != null) {
            OnMenuItemSelected.DefaultImpls.onMenuSelected$default(onMenuItemSelected, MenuAction.XOSO_NORTH, (Bundle) null, true, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: populateMenus$lambda-3$lambda-1  reason: not valid java name */
    public static final void m555populateMenus$lambda3$lambda1(LeftMenuFragment leftMenuFragment, View view) {
        Intrinsics.checkNotNullParameter(leftMenuFragment, "this$0");
        Context context = leftMenuFragment.getContext();
        OnMenuItemSelected onMenuItemSelected = context instanceof OnMenuItemSelected ? (OnMenuItemSelected) context : null;
        if (onMenuItemSelected != null) {
            OnMenuItemSelected.DefaultImpls.onMenuSelected$default(onMenuItemSelected, MenuAction.XOSO_MIDDLE, (Bundle) null, true, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: populateMenus$lambda-3$lambda-2  reason: not valid java name */
    public static final void m556populateMenus$lambda3$lambda2(LeftMenuFragment leftMenuFragment, View view) {
        Intrinsics.checkNotNullParameter(leftMenuFragment, "this$0");
        Context context = leftMenuFragment.getContext();
        OnMenuItemSelected onMenuItemSelected = context instanceof OnMenuItemSelected ? (OnMenuItemSelected) context : null;
        if (onMenuItemSelected != null) {
            OnMenuItemSelected.DefaultImpls.onMenuSelected$default(onMenuItemSelected, MenuAction.XOSO_SOUTH, (Bundle) null, true, 2, (Object) null);
        }
    }

    static /* synthetic */ void addSingleMenuItem$default(LeftMenuFragment leftMenuFragment, LayoutInflater layoutInflater, int i, int i2, int i3, MenuAction menuAction, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i3 = leftMenuFragment.getResources().getDimensionPixelSize(R.dimen.card_padding);
        }
        int i5 = i3;
        if ((i4 & 16) != 0) {
            menuAction = null;
        }
        leftMenuFragment.addSingleMenuItem(layoutInflater, i, i2, i5, menuAction);
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void addSingleMenuItem(android.view.LayoutInflater r4, int r5, int r6, int r7, com.veso.online.data.model.MenuAction r8) {
        /*
            r3 = this;
            com.veso.online.databinding.FragmentLeftMenuBinding r0 = r3.binding
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r1
        L_0x000b:
            android.widget.LinearLayout r0 = r0.layoutMenus
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2 = 1
            com.veso.online.databinding.LayoutItemLeftMenuBinding r4 = com.veso.online.databinding.LayoutItemLeftMenuBinding.inflate(r4, r0, r2)
            java.lang.String r0 = "inflate(inflater, binding.layoutMenus, true)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            android.widget.ImageView r0 = r4.ivMenuIcon
            r0.setImageResource(r5)
            android.widget.TextView r5 = r4.tvMenuTitle
            r5.setText(r6)
            android.widget.LinearLayout r5 = r4.getRoot()
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0032
            r1 = r5
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x0032:
            if (r1 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r1.topMargin = r7
        L_0x0037:
            if (r8 == 0) goto L_0x0045
            android.widget.LinearLayout r4 = r4.getRoot()
            com.veso.online.features.menu.LeftMenuFragment$$ExternalSyntheticLambda3 r5 = new com.veso.online.features.menu.LeftMenuFragment$$ExternalSyntheticLambda3
            r5.<init>(r3, r8)
            r4.setOnClickListener(r5)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.features.menu.LeftMenuFragment.addSingleMenuItem(android.view.LayoutInflater, int, int, int, com.veso.online.data.model.MenuAction):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: addSingleMenuItem$lambda-6  reason: not valid java name */
    public static final void m553addSingleMenuItem$lambda6(LeftMenuFragment leftMenuFragment, MenuAction menuAction, View view) {
        Intrinsics.checkNotNullParameter(leftMenuFragment, "this$0");
        Context context = leftMenuFragment.getContext();
        OnMenuItemSelected onMenuItemSelected = context instanceof OnMenuItemSelected ? (OnMenuItemSelected) context : null;
        if (onMenuItemSelected != null) {
            OnMenuItemSelected.DefaultImpls.onMenuSelected$default(onMenuItemSelected, menuAction, (Bundle) null, true, 2, (Object) null);
        }
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void addSectionTitle(android.view.LayoutInflater r5, int r6) {
        /*
            r4 = this;
            com.veso.online.databinding.FragmentLeftMenuBinding r0 = r4.binding
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r1
        L_0x000b:
            android.widget.LinearLayout r0 = r0.layoutMenus
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2 = 1
            com.veso.online.databinding.LayoutMenuSectionTitleBinding r5 = com.veso.online.databinding.LayoutMenuSectionTitleBinding.inflate(r5, r0, r2)
            java.lang.String r0 = "inflate(inflater, binding.layoutMenus, true)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            android.widget.TextView r0 = r5.tvSectionTitle
            r0.setText(r6)
            android.widget.TextView r0 = r5.tvMoveToWeb
            android.widget.TextView r2 = r5.tvMoveToWeb
            android.content.Context r2 = r2.getContext()
            java.lang.String r6 = r2.getString(r6)
            android.widget.TextView r2 = r5.tvMoveToWeb
            android.content.Context r2 = r2.getContext()
            r3 = 2131820812(0x7f11010c, float:1.927435E38)
            java.lang.String r2 = r2.getString(r3)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)
            if (r6 == 0) goto L_0x003f
            r6 = 0
            goto L_0x0041
        L_0x003f:
            r6 = 8
        L_0x0041:
            r0.setVisibility(r6)
            androidx.appcompat.widget.LinearLayoutCompat r5 = r5.getRoot()
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0053
            r1 = r5
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x0053:
            if (r1 != 0) goto L_0x0056
            goto L_0x0063
        L_0x0056:
            android.content.res.Resources r5 = r4.getResources()
            r6 = 2131099847(0x7f0600c7, float:1.7812059E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r1.topMargin = r5
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.features.menu.LeftMenuFragment.addSectionTitle(android.view.LayoutInflater, int):void");
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/veso/online/features/menu/LeftMenuFragment$Companion;", "", "()V", "digitalLotteryMenus", "", "Lcom/veso/online/data/model/Menu;", "mediaMenus", "statisticsMenus", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: LeftMenuFragment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
