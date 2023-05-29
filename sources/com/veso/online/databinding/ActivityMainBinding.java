package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class ActivityMainBinding implements ViewBinding {
    public final DrawerLayout drawerLayout;
    public final FragmentContainerView fragmentLeftMenu;
    public final ImageButton ibMenu;
    public final ImageButton ibSelectDate;
    public final ImageButton ibShare;
    public final LinearLayout llContent;
    public final FragmentContainerView navHostFragment;
    private final DrawerLayout rootView;
    public final TextView tvAppTitle;

    private ActivityMainBinding(DrawerLayout drawerLayout2, DrawerLayout drawerLayout3, FragmentContainerView fragmentContainerView, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, LinearLayout linearLayout, FragmentContainerView fragmentContainerView2, TextView textView) {
        this.rootView = drawerLayout2;
        this.drawerLayout = drawerLayout3;
        this.fragmentLeftMenu = fragmentContainerView;
        this.ibMenu = imageButton;
        this.ibSelectDate = imageButton2;
        this.ibShare = imageButton3;
        this.llContent = linearLayout;
        this.navHostFragment = fragmentContainerView2;
        this.tvAppTitle = textView;
    }

    public DrawerLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMainBinding bind(View view) {
        DrawerLayout drawerLayout2 = (DrawerLayout) view;
        int i = R.id.fragment_left_menu;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, R.id.fragment_left_menu);
        if (fragmentContainerView != null) {
            i = R.id.ib_menu;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.ib_menu);
            if (imageButton != null) {
                i = R.id.ib_select_date;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, R.id.ib_select_date);
                if (imageButton2 != null) {
                    i = R.id.ib_share;
                    ImageButton imageButton3 = (ImageButton) ViewBindings.findChildViewById(view, R.id.ib_share);
                    if (imageButton3 != null) {
                        i = R.id.ll_content;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_content);
                        if (linearLayout != null) {
                            i = R.id.nav_host_fragment;
                            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, R.id.nav_host_fragment);
                            if (fragmentContainerView2 != null) {
                                i = R.id.tv_app_title;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_title);
                                if (textView != null) {
                                    return new ActivityMainBinding(drawerLayout2, drawerLayout2, fragmentContainerView, imageButton, imageButton2, imageButton3, linearLayout, fragmentContainerView2, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
