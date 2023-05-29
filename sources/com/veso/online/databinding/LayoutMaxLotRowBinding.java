package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutMaxLotRowBinding implements ViewBinding {
    public final LinearLayout llPrizeResult;
    private final LinearLayout rootView;
    public final TextView tvPrize;

    private LayoutMaxLotRowBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.llPrizeResult = linearLayout2;
        this.tvPrize = textView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutMaxLotRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutMaxLotRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_max_lot_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMaxLotRowBinding bind(View view) {
        int i = R.id.ll_prize_result;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_prize_result);
        if (linearLayout != null) {
            i = R.id.tv_prize;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_prize);
            if (textView != null) {
                return new LayoutMaxLotRowBinding((LinearLayout) view, linearLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
