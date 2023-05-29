package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutMenuSectionBinding implements ViewBinding {
    public final GridLayout gridMenus;
    private final LinearLayout rootView;
    public final TextView tvMenuTitle;
    public final TextView tvMoveToWeb;

    private LayoutMenuSectionBinding(LinearLayout linearLayout, GridLayout gridLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.gridMenus = gridLayout;
        this.tvMenuTitle = textView;
        this.tvMoveToWeb = textView2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutMenuSectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutMenuSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_menu_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMenuSectionBinding bind(View view) {
        int i = R.id.grid_menus;
        GridLayout gridLayout = (GridLayout) ViewBindings.findChildViewById(view, R.id.grid_menus);
        if (gridLayout != null) {
            i = R.id.tv_menu_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_menu_title);
            if (textView != null) {
                i = R.id.tv_move_to_web;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_move_to_web);
                if (textView2 != null) {
                    return new LayoutMenuSectionBinding((LinearLayout) view, gridLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
