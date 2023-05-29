package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutDienToanItemBinding implements ViewBinding {
    public final LinearLayout llDienToan123;
    public final LinearLayout llDienToan636;
    public final LinearLayout llDienToanThanTai;
    private final LinearLayout rootView;
    public final TextView tvDienToan123;
    public final TextView tvDienToan636;
    public final TextView tvDienToanDate;
    public final TextView tvDienToanThanTai;

    private LayoutDienToanItemBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.llDienToan123 = linearLayout2;
        this.llDienToan636 = linearLayout3;
        this.llDienToanThanTai = linearLayout4;
        this.tvDienToan123 = textView;
        this.tvDienToan636 = textView2;
        this.tvDienToanDate = textView3;
        this.tvDienToanThanTai = textView4;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutDienToanItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutDienToanItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_dien_toan_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutDienToanItemBinding bind(View view) {
        int i = R.id.ll_dien_toan_123;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_dien_toan_123);
        if (linearLayout != null) {
            i = R.id.ll_dien_toan_636;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_dien_toan_636);
            if (linearLayout2 != null) {
                i = R.id.ll_dien_toan_than_tai;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_dien_toan_than_tai);
                if (linearLayout3 != null) {
                    i = R.id.tv_dien_toan_123;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dien_toan_123);
                    if (textView != null) {
                        i = R.id.tv_dien_toan_636;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dien_toan_636);
                        if (textView2 != null) {
                            i = R.id.tv_dien_toan_date;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dien_toan_date);
                            if (textView3 != null) {
                                i = R.id.tv_dien_toan_than_tai;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dien_toan_than_tai);
                                if (textView4 != null) {
                                    return new LayoutDienToanItemBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, textView4);
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
