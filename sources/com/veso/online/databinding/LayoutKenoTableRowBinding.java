package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutKenoTableRowBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvPrizeValue;
    public final TextView tvQuantity;
    public final TextView tvRule;

    private LayoutKenoTableRowBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.tvPrizeValue = textView;
        this.tvQuantity = textView2;
        this.tvRule = textView3;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutKenoTableRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutKenoTableRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_keno_table_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutKenoTableRowBinding bind(View view) {
        int i = R.id.tv_prize_value;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_prize_value);
        if (textView != null) {
            i = R.id.tv_quantity;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_quantity);
            if (textView2 != null) {
                i = R.id.tv_rule;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_rule);
                if (textView3 != null) {
                    return new LayoutKenoTableRowBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
