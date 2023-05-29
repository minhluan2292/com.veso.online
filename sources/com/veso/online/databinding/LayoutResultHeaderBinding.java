package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutResultHeaderBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvFirstCol;
    public final TextView tvHeader;

    private LayoutResultHeaderBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.tvFirstCol = textView;
        this.tvHeader = textView2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutResultHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutResultHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_result_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutResultHeaderBinding bind(View view) {
        int i = R.id.tv_first_col;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_first_col);
        if (textView != null) {
            i = R.id.tv_header;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_header);
            if (textView2 != null) {
                return new LayoutResultHeaderBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
