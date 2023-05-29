package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutResultDetailBinding implements ViewBinding {
    public final LinearLayout llResultContent;
    private final LinearLayout rootView;
    public final TextView tvFirstCol;

    private LayoutResultDetailBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.llResultContent = linearLayout2;
        this.tvFirstCol = textView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutResultDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutResultDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_result_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutResultDetailBinding bind(View view) {
        int i = R.id.ll_result_content;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_result_content);
        if (linearLayout != null) {
            i = R.id.tv_first_col;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_first_col);
            if (textView != null) {
                return new LayoutResultDetailBinding((LinearLayout) view, linearLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
