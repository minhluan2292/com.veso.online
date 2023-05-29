package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class FragmentLeftMenuBinding implements ViewBinding {
    public final LinearLayout layoutMenus;
    private final LinearLayout rootView;
    public final ScrollView scrollView;

    private FragmentLeftMenuBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ScrollView scrollView2) {
        this.rootView = linearLayout;
        this.layoutMenus = linearLayout2;
        this.scrollView = scrollView2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLeftMenuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentLeftMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_left_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLeftMenuBinding bind(View view) {
        int i = R.id.layout_menus;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_menus);
        if (linearLayout != null) {
            i = R.id.scrollView;
            ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
            if (scrollView2 != null) {
                return new FragmentLeftMenuBinding((LinearLayout) view, linearLayout, scrollView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
