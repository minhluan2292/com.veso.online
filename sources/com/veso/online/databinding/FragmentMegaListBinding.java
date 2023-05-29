package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class FragmentMegaListBinding implements ViewBinding {
    public final LinearLayout headerMegaNPower;
    public final ImageView ivLogo;
    public final RecyclerView rcvVietLot;
    private final LinearLayout rootView;
    public final TextView tvJackpot2Prize;
    public final TextView tvJackpotPrize;

    private FragmentMegaListBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.headerMegaNPower = linearLayout2;
        this.ivLogo = imageView;
        this.rcvVietLot = recyclerView;
        this.tvJackpot2Prize = textView;
        this.tvJackpotPrize = textView2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMegaListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentMegaListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mega_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMegaListBinding bind(View view) {
        int i = R.id.header_mega_n_power;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.header_mega_n_power);
        if (linearLayout != null) {
            i = R.id.iv_logo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo);
            if (imageView != null) {
                i = R.id.rcv_viet_lot;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_viet_lot);
                if (recyclerView != null) {
                    i = R.id.tv_jackpot_2_prize;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_jackpot_2_prize);
                    if (textView != null) {
                        i = R.id.tv_jackpot_prize;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_jackpot_prize);
                        if (textView2 != null) {
                            return new FragmentMegaListBinding((LinearLayout) view, linearLayout, imageView, recyclerView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
