package com.veso.online.features.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import com.veso.online.R;
import com.veso.online.data.model.Menu;
import com.veso.online.data.model.MenuAction;
import com.veso.online.databinding.FragmentMenusBinding;
import com.veso.online.widgets.MenuSectionLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/veso/online/features/menu/MenuFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/veso/online/databinding/FragmentMenusBinding;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: MenuFragment.kt */
public final class MenuFragment extends Fragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final List<Menu> digitalLotteryMenus = CollectionsKt.listOf(new Menu(R.drawable.ic_lottery_keno, R.string.result_of_keno, MenuAction.XOSO_KENO), new Menu(R.drawable.ic_lottery_max_3d, R.string.result_of_max_3d, MenuAction.XOSO_MAX_3D), new Menu(R.drawable.ic_lottery_max_3d_pro, R.string.result_of_max_3d_pro, MenuAction.XOSO_MAX_3D_PRO), new Menu(R.drawable.ic_loterry_mega_645, R.string.result_of_mega, MenuAction.XOSO_VIETLOT_MEGA), new Menu(R.drawable.ic_lottery_power_655, R.string.result_of_power, MenuAction.XOSO_VIETLOT_POWER));
    private static final List<Menu> statisticsMenus = CollectionsKt.listOf(new Menu(R.drawable.ic_loto_gan, R.string.statistic_loto_gan, MenuAction.STATISTIC_GAN), new Menu(R.drawable.ic_loto_roi, R.string.statistic_loto_roi, MenuAction.STATISTIC_MAX), new Menu(R.drawable.ic_frequency, R.string.statistic_frequency, MenuAction.STATISTIC_FREQ));
    private static final List<Menu> traditionLotteryMenus = CollectionsKt.listOf(new Menu(R.drawable.ic_north_lottery, R.string.result_of_north, MenuAction.XOSO_NORTH), new Menu(R.drawable.ic_middle_lottery, R.string.result_of_middle, MenuAction.XOSO_MIDDLE), new Menu(R.drawable.ic_south_lottery, R.string.result_of_south, MenuAction.XOSO_SOUTH), new Menu(R.drawable.ic_lottery_by_province, R.string.result_by_province, MenuAction.XOSO_PROVINCE), new Menu(R.drawable.ic_lottery_by_date, R.string.result_by_date, MenuAction.XOSO_DATE), new Menu(R.drawable.ic_xoso_dientoan, R.string.result_dien_toan, MenuAction.XOSO_DIEN_TOAN));
    private FragmentMenusBinding binding;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        FragmentMenusBinding inflate = FragmentMenusBinding.inflate(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        FragmentMenusBinding fragmentMenusBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        MenuSectionLayout menuSectionLayout = inflate.menusTraditionLottery;
        Intrinsics.checkNotNullExpressionValue(menuSectionLayout, "binding.menusTraditionLottery");
        MenuSectionLayout.populateMenus$default(menuSectionLayout, traditionLotteryMenus, (Integer) null, 2, (Object) null);
        FragmentMenusBinding fragmentMenusBinding2 = this.binding;
        if (fragmentMenusBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMenusBinding2 = null;
        }
        fragmentMenusBinding2.menusDigitalLottery.populateMenus(digitalLotteryMenus, Integer.valueOf(R.dimen.icon_height_digital_lottery));
        FragmentMenusBinding fragmentMenusBinding3 = this.binding;
        if (fragmentMenusBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMenusBinding3 = null;
        }
        fragmentMenusBinding3.menusStatistic.populateMenus(statisticsMenus, Integer.valueOf(R.dimen.icon_height_statistic));
        FragmentMenusBinding fragmentMenusBinding4 = this.binding;
        if (fragmentMenusBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentMenusBinding = fragmentMenusBinding4;
        }
        ScrollView root = fragmentMenusBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/veso/online/features/menu/MenuFragment$Companion;", "", "()V", "digitalLotteryMenus", "", "Lcom/veso/online/data/model/Menu;", "statisticsMenus", "traditionLotteryMenus", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: MenuFragment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
