package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;
import com.veso.online.widgets.MenuSectionLayout;

public final class FragmentMenusBinding implements ViewBinding {
    public final MenuSectionLayout menusDigitalLottery;
    public final MenuSectionLayout menusStatistic;
    public final MenuSectionLayout menusSystemMedia;
    public final MenuSectionLayout menusTraditionLottery;
    private final ScrollView rootView;

    private FragmentMenusBinding(ScrollView scrollView, MenuSectionLayout menuSectionLayout, MenuSectionLayout menuSectionLayout2, MenuSectionLayout menuSectionLayout3, MenuSectionLayout menuSectionLayout4) {
        this.rootView = scrollView;
        this.menusDigitalLottery = menuSectionLayout;
        this.menusStatistic = menuSectionLayout2;
        this.menusSystemMedia = menuSectionLayout3;
        this.menusTraditionLottery = menuSectionLayout4;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentMenusBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentMenusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_menus, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMenusBinding bind(View view) {
        int i = R.id.menus_digital_lottery;
        MenuSectionLayout menuSectionLayout = (MenuSectionLayout) ViewBindings.findChildViewById(view, R.id.menus_digital_lottery);
        if (menuSectionLayout != null) {
            i = R.id.menus_statistic;
            MenuSectionLayout menuSectionLayout2 = (MenuSectionLayout) ViewBindings.findChildViewById(view, R.id.menus_statistic);
            if (menuSectionLayout2 != null) {
                i = R.id.menus_system_media;
                MenuSectionLayout menuSectionLayout3 = (MenuSectionLayout) ViewBindings.findChildViewById(view, R.id.menus_system_media);
                if (menuSectionLayout3 != null) {
                    i = R.id.menus_tradition_lottery;
                    MenuSectionLayout menuSectionLayout4 = (MenuSectionLayout) ViewBindings.findChildViewById(view, R.id.menus_tradition_lottery);
                    if (menuSectionLayout4 != null) {
                        return new FragmentMenusBinding((ScrollView) view, menuSectionLayout, menuSectionLayout2, menuSectionLayout3, menuSectionLayout4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
