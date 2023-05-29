package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutMenuSectionTitleBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;
    public final TextView tvMoveToWeb;
    public final TextView tvSectionTitle;

    private LayoutMenuSectionTitleBinding(LinearLayoutCompat linearLayoutCompat, TextView textView, TextView textView2) {
        this.rootView = linearLayoutCompat;
        this.tvMoveToWeb = textView;
        this.tvSectionTitle = textView2;
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static LayoutMenuSectionTitleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutMenuSectionTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_menu_section_title, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMenuSectionTitleBinding bind(View view) {
        int i = R.id.tv_move_to_web;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_move_to_web);
        if (textView != null) {
            i = R.id.tv_section_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_section_title);
            if (textView2 != null) {
                return new LayoutMenuSectionTitleBinding((LinearLayoutCompat) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
