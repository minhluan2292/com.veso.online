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

public final class LayoutMenuItemViewBinding implements ViewBinding {
    public final ImageView ivMenuIcon;
    private final LinearLayout rootView;
    public final TextView tvMenuTitle;

    private LayoutMenuItemViewBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.ivMenuIcon = imageView;
        this.tvMenuTitle = textView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutMenuItemViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutMenuItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_menu_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMenuItemViewBinding bind(View view) {
        int i = R.id.iv_menu_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_menu_icon);
        if (imageView != null) {
            i = R.id.tv_menu_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_menu_title);
            if (textView != null) {
                return new LayoutMenuItemViewBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
