package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.veso.online.R;

public final class FragmentSlidableBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvNext;
    public final TextView tvPrevious;
    public final TextView tvSelectDate;
    public final ViewPager2 viewpager;

    private FragmentSlidableBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.tvNext = textView;
        this.tvPrevious = textView2;
        this.tvSelectDate = textView3;
        this.viewpager = viewPager2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSlidableBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentSlidableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_slidable, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSlidableBinding bind(View view) {
        int i = R.id.tv_next;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_next);
        if (textView != null) {
            i = R.id.tv_previous;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_previous);
            if (textView2 != null) {
                i = R.id.tv_select_date;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_select_date);
                if (textView3 != null) {
                    i = R.id.viewpager;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.viewpager);
                    if (viewPager2 != null) {
                        return new FragmentSlidableBinding((LinearLayout) view, textView, textView2, textView3, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
