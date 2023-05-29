package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutMultiResultHeaderTextBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvXosoName;
    public final TextView tvXosoType;

    private LayoutMultiResultHeaderTextBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.tvXosoName = textView;
        this.tvXosoType = textView2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutMultiResultHeaderTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutMultiResultHeaderTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_multi_result_header_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMultiResultHeaderTextBinding bind(View view) {
        int i = R.id.tv_xoso_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_xoso_name);
        if (textView != null) {
            i = R.id.tv_xoso_type;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_xoso_type);
            if (textView2 != null) {
                return new LayoutMultiResultHeaderTextBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
