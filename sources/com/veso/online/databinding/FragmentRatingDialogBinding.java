package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class FragmentRatingDialogBinding implements ViewBinding {
    public final AppCompatImageView ivClose;
    public final LinearLayoutCompat llFeedback;
    public final LinearLayoutCompat llSatisfy;
    private final ConstraintLayout rootView;

    private FragmentRatingDialogBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2) {
        this.rootView = constraintLayout;
        this.ivClose = appCompatImageView;
        this.llFeedback = linearLayoutCompat;
        this.llSatisfy = linearLayoutCompat2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRatingDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentRatingDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rating_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentRatingDialogBinding bind(View view) {
        int i = R.id.ivClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.ivClose);
        if (appCompatImageView != null) {
            i = R.id.llFeedback;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, R.id.llFeedback);
            if (linearLayoutCompat != null) {
                i = R.id.llSatisfy;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, R.id.llSatisfy);
                if (linearLayoutCompat2 != null) {
                    return new FragmentRatingDialogBinding((ConstraintLayout) view, appCompatImageView, linearLayoutCompat, linearLayoutCompat2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
