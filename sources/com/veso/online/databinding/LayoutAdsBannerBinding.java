package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.veso.online.R;
import com.veso.online.widgets.BannerAdView;
import java.util.Objects;

public final class LayoutAdsBannerBinding implements ViewBinding {
    private final BannerAdView rootView;

    private LayoutAdsBannerBinding(BannerAdView bannerAdView) {
        this.rootView = bannerAdView;
    }

    public BannerAdView getRoot() {
        return this.rootView;
    }

    public static LayoutAdsBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutAdsBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_ads_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutAdsBannerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new LayoutAdsBannerBinding((BannerAdView) view);
    }
}
