package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class ActivityMax3DdetailBinding implements ViewBinding {
    public final ImageView ivLogo;
    public final LayoutSingleActionHeaderBinding layoutHeader;
    public final LayoutMax3dItemBinding layoutMax3dResult;
    public final LinearLayout llPrizeQuantity;
    private final LinearLayout rootView;
    public final TextView tvDate;
    public final TextView tvPeriod;

    private ActivityMax3DdetailBinding(LinearLayout linearLayout, ImageView imageView, LayoutSingleActionHeaderBinding layoutSingleActionHeaderBinding, LayoutMax3dItemBinding layoutMax3dItemBinding, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.ivLogo = imageView;
        this.layoutHeader = layoutSingleActionHeaderBinding;
        this.layoutMax3dResult = layoutMax3dItemBinding;
        this.llPrizeQuantity = linearLayout2;
        this.tvDate = textView;
        this.tvPeriod = textView2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMax3DdetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityMax3DdetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_max3_ddetail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMax3DdetailBinding bind(View view) {
        int i = R.id.iv_logo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo);
        if (imageView != null) {
            i = R.id.layout_header;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.layout_header);
            if (findChildViewById != null) {
                LayoutSingleActionHeaderBinding bind = LayoutSingleActionHeaderBinding.bind(findChildViewById);
                i = R.id.layout_max_3d_result;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.layout_max_3d_result);
                if (findChildViewById2 != null) {
                    LayoutMax3dItemBinding bind2 = LayoutMax3dItemBinding.bind(findChildViewById2);
                    i = R.id.ll_prize_quantity;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_prize_quantity);
                    if (linearLayout != null) {
                        i = R.id.tv_date;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date);
                        if (textView != null) {
                            i = R.id.tv_period;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_period);
                            if (textView2 != null) {
                                return new ActivityMax3DdetailBinding((LinearLayout) view, imageView, bind, bind2, linearLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
