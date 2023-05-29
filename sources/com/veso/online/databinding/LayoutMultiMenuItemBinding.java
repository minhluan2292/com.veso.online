package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutMultiMenuItemBinding implements ViewBinding {
    public final ImageView ivMenuIcon;
    private final LinearLayout rootView;
    public final TextView tvXosoMiddle;
    public final TextView tvXosoNorth;
    public final TextView tvXosoSouth;

    private LayoutMultiMenuItemBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.ivMenuIcon = imageView;
        this.tvXosoMiddle = textView;
        this.tvXosoNorth = textView2;
        this.tvXosoSouth = textView3;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutMultiMenuItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutMultiMenuItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_multi_menu_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMultiMenuItemBinding bind(View view) {
        int i = R.id.iv_menu_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_menu_icon);
        if (imageView != null) {
            i = R.id.tv_xoso_middle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_xoso_middle);
            if (textView != null) {
                i = R.id.tv_xoso_north;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_xoso_north);
                if (textView2 != null) {
                    i = R.id.tv_xoso_south;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_xoso_south);
                    if (textView3 != null) {
                        return new LayoutMultiMenuItemBinding((LinearLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
