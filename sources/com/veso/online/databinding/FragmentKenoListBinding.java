package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class FragmentKenoListBinding implements ViewBinding {
    public final LayoutFragmentLoadingBinding fragmentLoading;
    public final RecyclerView rcvKeno;
    private final LinearLayout rootView;

    private FragmentKenoListBinding(LinearLayout linearLayout, LayoutFragmentLoadingBinding layoutFragmentLoadingBinding, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.fragmentLoading = layoutFragmentLoadingBinding;
        this.rcvKeno = recyclerView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentKenoListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentKenoListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_keno_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentKenoListBinding bind(View view) {
        int i = R.id.fragment_loading;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.fragment_loading);
        if (findChildViewById != null) {
            LayoutFragmentLoadingBinding bind = LayoutFragmentLoadingBinding.bind(findChildViewById);
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_keno);
            if (recyclerView != null) {
                return new FragmentKenoListBinding((LinearLayout) view, bind, recyclerView);
            }
            i = R.id.rcv_keno;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
