package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class FragmentResultDetailBinding implements ViewBinding {
    public final LayoutFragmentLoadingBinding fragmentLoading;
    public final RecyclerView rcvDetail;
    private final LinearLayout rootView;

    private FragmentResultDetailBinding(LinearLayout linearLayout, LayoutFragmentLoadingBinding layoutFragmentLoadingBinding, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.fragmentLoading = layoutFragmentLoadingBinding;
        this.rcvDetail = recyclerView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentResultDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentResultDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_result_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentResultDetailBinding bind(View view) {
        int i = R.id.fragment_loading;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.fragment_loading);
        if (findChildViewById != null) {
            LayoutFragmentLoadingBinding bind = LayoutFragmentLoadingBinding.bind(findChildViewById);
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_detail);
            if (recyclerView != null) {
                return new FragmentResultDetailBinding((LinearLayout) view, bind, recyclerView);
            }
            i = R.id.rcv_detail;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
