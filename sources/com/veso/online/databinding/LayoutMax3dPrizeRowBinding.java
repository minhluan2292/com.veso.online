package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutMax3dPrizeRowBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tv1Col;
    public final TextView tv2Col;
    public final TextView tv3Col;

    private LayoutMax3dPrizeRowBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.tv1Col = textView;
        this.tv2Col = textView2;
        this.tv3Col = textView3;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutMax3dPrizeRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutMax3dPrizeRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_max_3d_prize_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMax3dPrizeRowBinding bind(View view) {
        int i = R.id.tv_1_col;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_1_col);
        if (textView != null) {
            i = R.id.tv_2_col;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_2_col);
            if (textView2 != null) {
                i = R.id.tv_3_col;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_3_col);
                if (textView3 != null) {
                    return new LayoutMax3dPrizeRowBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
