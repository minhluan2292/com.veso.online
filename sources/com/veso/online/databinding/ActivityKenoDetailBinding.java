package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class ActivityKenoDetailBinding implements ViewBinding {
    public final LayoutSingleActionHeaderBinding layoutHeader;
    public final RecyclerView rcvKenoDetail;
    private final LinearLayout rootView;

    private ActivityKenoDetailBinding(LinearLayout linearLayout, LayoutSingleActionHeaderBinding layoutSingleActionHeaderBinding, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.layoutHeader = layoutSingleActionHeaderBinding;
        this.rcvKenoDetail = recyclerView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityKenoDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityKenoDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_keno_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityKenoDetailBinding bind(View view) {
        int i = R.id.layout_header;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.layout_header);
        if (findChildViewById != null) {
            LayoutSingleActionHeaderBinding bind = LayoutSingleActionHeaderBinding.bind(findChildViewById);
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_keno_detail);
            if (recyclerView != null) {
                return new ActivityKenoDetailBinding((LinearLayout) view, bind, recyclerView);
            }
            i = R.id.rcv_keno_detail;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
