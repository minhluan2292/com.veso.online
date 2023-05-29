package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.google.android.ads.nativetemplates.TemplateView;
import com.veso.online.R;
import java.util.Objects;

public final class AdsSmallBannerBinding implements ViewBinding {
    private final TemplateView rootView;

    private AdsSmallBannerBinding(TemplateView templateView) {
        this.rootView = templateView;
    }

    public TemplateView getRoot() {
        return this.rootView;
    }

    public static AdsSmallBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static AdsSmallBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ads_small_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdsSmallBannerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new AdsSmallBannerBinding((TemplateView) view);
    }
}
