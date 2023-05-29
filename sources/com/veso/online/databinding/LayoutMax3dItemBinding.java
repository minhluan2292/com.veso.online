package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutMax3dItemBinding implements ViewBinding {
    public final LayoutMaxLotRowBinding prize1;
    public final LayoutMaxLotRowBinding prize2;
    public final LayoutMaxLotRowBinding prize3;
    public final LayoutMaxLotRowBinding prizeSpecial;
    private final LinearLayout rootView;
    public final TextView tvDate;
    public final TextView tvPeriod;

    private LayoutMax3dItemBinding(LinearLayout linearLayout, LayoutMaxLotRowBinding layoutMaxLotRowBinding, LayoutMaxLotRowBinding layoutMaxLotRowBinding2, LayoutMaxLotRowBinding layoutMaxLotRowBinding3, LayoutMaxLotRowBinding layoutMaxLotRowBinding4, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.prize1 = layoutMaxLotRowBinding;
        this.prize2 = layoutMaxLotRowBinding2;
        this.prize3 = layoutMaxLotRowBinding3;
        this.prizeSpecial = layoutMaxLotRowBinding4;
        this.tvDate = textView;
        this.tvPeriod = textView2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutMax3dItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutMax3dItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_max_3d_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMax3dItemBinding bind(View view) {
        int i = R.id.prize_1;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.prize_1);
        if (findChildViewById != null) {
            LayoutMaxLotRowBinding bind = LayoutMaxLotRowBinding.bind(findChildViewById);
            i = R.id.prize_2;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.prize_2);
            if (findChildViewById2 != null) {
                LayoutMaxLotRowBinding bind2 = LayoutMaxLotRowBinding.bind(findChildViewById2);
                i = R.id.prize_3;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.prize_3);
                if (findChildViewById3 != null) {
                    LayoutMaxLotRowBinding bind3 = LayoutMaxLotRowBinding.bind(findChildViewById3);
                    i = R.id.prize_special;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.prize_special);
                    if (findChildViewById4 != null) {
                        LayoutMaxLotRowBinding bind4 = LayoutMaxLotRowBinding.bind(findChildViewById4);
                        i = R.id.tv_date;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date);
                        if (textView != null) {
                            i = R.id.tv_period;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_period);
                            if (textView2 != null) {
                                return new LayoutMax3dItemBinding((LinearLayout) view, bind, bind2, bind3, bind4, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
