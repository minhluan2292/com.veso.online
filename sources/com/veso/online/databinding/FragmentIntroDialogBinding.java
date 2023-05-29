package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class FragmentIntroDialogBinding implements ViewBinding {
    public final ImageView imageView;
    private final ConstraintLayout rootView;
    public final TextView tvUnderstand;

    private FragmentIntroDialogBinding(ConstraintLayout constraintLayout, ImageView imageView2, TextView textView) {
        this.rootView = constraintLayout;
        this.imageView = imageView2;
        this.tvUnderstand = textView;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentIntroDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentIntroDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_intro_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentIntroDialogBinding bind(View view) {
        int i = R.id.imageView;
        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
        if (imageView2 != null) {
            i = R.id.tvUnderstand;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvUnderstand);
            if (textView != null) {
                return new FragmentIntroDialogBinding((ConstraintLayout) view, imageView2, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
