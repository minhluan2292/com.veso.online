package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutSingleActionHeaderBinding implements ViewBinding {
    public final ImageButton ibBack;
    private final FrameLayout rootView;
    public final TextView tvHeaderTitle;

    private LayoutSingleActionHeaderBinding(FrameLayout frameLayout, ImageButton imageButton, TextView textView) {
        this.rootView = frameLayout;
        this.ibBack = imageButton;
        this.tvHeaderTitle = textView;
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static LayoutSingleActionHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutSingleActionHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_single_action_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutSingleActionHeaderBinding bind(View view) {
        int i = R.id.ib_back;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.ib_back);
        if (imageButton != null) {
            i = R.id.tv_header_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_header_title);
            if (textView != null) {
                return new LayoutSingleActionHeaderBinding((FrameLayout) view, imageButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
