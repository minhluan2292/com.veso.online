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

public final class FragmentDatePickerBinding implements ViewBinding {
    public final ImageButton ibClose;
    public final RecyclerView rcvDatePicker;
    private final LinearLayout rootView;

    private FragmentDatePickerBinding(LinearLayout linearLayout, ImageButton imageButton, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.ibClose = imageButton;
        this.rcvDatePicker = recyclerView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDatePickerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentDatePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_date_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentDatePickerBinding bind(View view) {
        int i = R.id.ib_close;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.ib_close);
        if (imageButton != null) {
            i = R.id.rcv_date_picker;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_date_picker);
            if (recyclerView != null) {
                return new FragmentDatePickerBinding((LinearLayout) view, imageButton, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
