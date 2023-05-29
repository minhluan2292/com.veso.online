package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutKenoInfoBinding implements ViewBinding {
    public final LinearLayout llKenoBalls;
    private final LinearLayout rootView;
    public final TextView tvDateTime;
    public final TextView tvPeriod;

    private LayoutKenoInfoBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.llKenoBalls = linearLayout2;
        this.tvDateTime = textView;
        this.tvPeriod = textView2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutKenoInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutKenoInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_keno_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutKenoInfoBinding bind(View view) {
        int i = R.id.ll_keno_balls;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_keno_balls);
        if (linearLayout != null) {
            i = R.id.tv_date_time;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_time);
            if (textView != null) {
                i = R.id.tv_period;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_period);
                if (textView2 != null) {
                    return new LayoutKenoInfoBinding((LinearLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
