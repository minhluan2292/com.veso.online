package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutKenoResultItemBinding implements ViewBinding {
    public final LinearLayout llResult;
    private final LinearLayout rootView;
    public final TextView tvDate;
    public final TextView tvPeriod;
    public final TextView tvTime;

    private LayoutKenoResultItemBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.llResult = linearLayout2;
        this.tvDate = textView;
        this.tvPeriod = textView2;
        this.tvTime = textView3;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutKenoResultItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutKenoResultItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_keno_result_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutKenoResultItemBinding bind(View view) {
        int i = R.id.ll_result;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_result);
        if (linearLayout != null) {
            i = R.id.tv_date;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date);
            if (textView != null) {
                i = R.id.tv_period;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_period);
                if (textView2 != null) {
                    i = R.id.tv_time;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time);
                    if (textView3 != null) {
                        return new LayoutKenoResultItemBinding((LinearLayout) view, linearLayout, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
