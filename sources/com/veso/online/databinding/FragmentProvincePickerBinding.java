package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class FragmentProvincePickerBinding implements ViewBinding {
    public final ImageButton ibClose;
    public final RecyclerView rcvPickerMiddle;
    public final RecyclerView rcvPickerSouth;
    private final LinearLayout rootView;

    private FragmentProvincePickerBinding(LinearLayout linearLayout, ImageButton imageButton, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = linearLayout;
        this.ibClose = imageButton;
        this.rcvPickerMiddle = recyclerView;
        this.rcvPickerSouth = recyclerView2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentProvincePickerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentProvincePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_province_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentProvincePickerBinding bind(View view) {
        int i = R.id.ib_close;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.ib_close);
        if (imageButton != null) {
            i = R.id.rcv_picker_middle;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_picker_middle);
            if (recyclerView != null) {
                i = R.id.rcv_picker_south;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_picker_south);
                if (recyclerView2 != null) {
                    return new FragmentProvincePickerBinding((LinearLayout) view, imageButton, recyclerView, recyclerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
