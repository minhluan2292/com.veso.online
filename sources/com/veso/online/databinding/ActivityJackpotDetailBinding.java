package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class ActivityJackpotDetailBinding implements ViewBinding {
    public final ImageView ivLogo;
    public final LayoutSingleActionHeaderBinding layoutHeader;
    public final LinearLayout llJackpotResult;
    private final LinearLayout rootView;
    public final GridLayout table;
    public final TextView tvDate;
    public final TextView tvJackpot2Prize;
    public final TextView tvJackpot2Subtitle;
    public final TextView tvJackpotPrize;
    public final TextView tvPeriod;

    private ActivityJackpotDetailBinding(LinearLayout linearLayout, ImageView imageView, LayoutSingleActionHeaderBinding layoutSingleActionHeaderBinding, LinearLayout linearLayout2, GridLayout gridLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.ivLogo = imageView;
        this.layoutHeader = layoutSingleActionHeaderBinding;
        this.llJackpotResult = linearLayout2;
        this.table = gridLayout;
        this.tvDate = textView;
        this.tvJackpot2Prize = textView2;
        this.tvJackpot2Subtitle = textView3;
        this.tvJackpotPrize = textView4;
        this.tvPeriod = textView5;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityJackpotDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityJackpotDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_jackpot_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityJackpotDetailBinding bind(View view) {
        int i = R.id.iv_logo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo);
        if (imageView != null) {
            i = R.id.layout_header;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.layout_header);
            if (findChildViewById != null) {
                LayoutSingleActionHeaderBinding bind = LayoutSingleActionHeaderBinding.bind(findChildViewById);
                i = R.id.ll_jackpot_result;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_jackpot_result);
                if (linearLayout != null) {
                    i = R.id.table;
                    GridLayout gridLayout = (GridLayout) ViewBindings.findChildViewById(view, R.id.table);
                    if (gridLayout != null) {
                        i = R.id.tv_date;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date);
                        if (textView != null) {
                            i = R.id.tv_jackpot_2_prize;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_jackpot_2_prize);
                            if (textView2 != null) {
                                i = R.id.tv_jackpot_2_subtitle;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_jackpot_2_subtitle);
                                if (textView3 != null) {
                                    i = R.id.tv_jackpot_prize;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_jackpot_prize);
                                    if (textView4 != null) {
                                        i = R.id.tv_period;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_period);
                                        if (textView5 != null) {
                                            return new ActivityJackpotDetailBinding((LinearLayout) view, imageView, bind, linearLayout, gridLayout, textView, textView2, textView3, textView4, textView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
