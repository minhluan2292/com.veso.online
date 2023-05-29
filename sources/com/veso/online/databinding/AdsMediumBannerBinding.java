package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.google.android.ads.nativetemplates.TemplateView;
import com.veso.online.R;
import java.util.Objects;

public final class AdsMediumBannerBinding implements ViewBinding {
    private final TemplateView rootView;

    private AdsMediumBannerBinding(TemplateView templateView) {
        this.rootView = templateView;
    }

    public TemplateView getRoot() {
        return this.rootView;
    }

    public static AdsMediumBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static AdsMediumBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ads_medium_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdsMediumBannerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new AdsMediumBannerBinding((TemplateView) view);
    }
}
