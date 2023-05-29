package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import com.veso.online.R;
import java.util.Objects;

public final class LayoutLoadingBinding implements ViewBinding {
    private final ProgressBar rootView;

    private LayoutLoadingBinding(ProgressBar progressBar) {
        this.rootView = progressBar;
    }

    public ProgressBar getRoot() {
        return this.rootView;
    }

    public static LayoutLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutLoadingBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new LayoutLoadingBinding((ProgressBar) view);
    }
}
