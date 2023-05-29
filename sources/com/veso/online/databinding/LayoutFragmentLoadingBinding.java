package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutFragmentLoadingBinding implements ViewBinding {
    public final ProgressBar pbLoading;
    private final LinearLayout rootView;
    public final TextView tvInfo;

    private LayoutFragmentLoadingBinding(LinearLayout linearLayout, ProgressBar progressBar, TextView textView) {
        this.rootView = linearLayout;
        this.pbLoading = progressBar;
        this.tvInfo = textView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutFragmentLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutFragmentLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_fragment_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutFragmentLoadingBinding bind(View view) {
        int i = R.id.pb_loading;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_loading);
        if (progressBar != null) {
            i = R.id.tv_info;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_info);
            if (textView != null) {
                return new LayoutFragmentLoadingBinding((LinearLayout) view, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
