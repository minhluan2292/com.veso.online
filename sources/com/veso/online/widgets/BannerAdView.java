package com.veso.online.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.nativead.NativeAd;
import com.veso.online.BuildConfig;
import com.veso.online.R;
import com.veso.online.databinding.AdsMediumBannerBinding;
import com.veso.online.databinding.AdsSmallBannerBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/veso/online/widgets/BannerAdView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "templateView", "Lcom/google/android/ads/nativetemplates/TemplateView;", "loadAd", "", "onAttachedToWindow", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: BannerAdView.kt */
public final class BannerAdView extends FrameLayout {
    private final TemplateView templateView;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BannerAdView(Context context) {
        this(context, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BannerAdView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BannerAdView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ViewBinding viewBinding;
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BannerAdView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.BannerAdView)");
        LayoutInflater from = LayoutInflater.from(context);
        if (obtainStyledAttributes.getInt(0, 0) == 1) {
            viewBinding = AdsMediumBannerBinding.inflate(from, this, true);
        } else {
            viewBinding = AdsSmallBannerBinding.inflate(from, this, true);
        }
        TemplateView templateView2 = (TemplateView) viewBinding.getRoot();
        this.templateView = templateView2;
        obtainStyledAttributes.recycle();
        templateView2.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        postDelayed(new BannerAdView$$ExternalSyntheticLambda1(this), 100);
    }

    /* access modifiers changed from: private */
    /* renamed from: onAttachedToWindow$lambda-0  reason: not valid java name */
    public static final void m593onAttachedToWindow$lambda0(BannerAdView bannerAdView) {
        Intrinsics.checkNotNullParameter(bannerAdView, "this$0");
        bannerAdView.loadAd();
    }

    private final void loadAd() {
        new AdLoader.Builder(getContext(), BuildConfig.NATIVE_ADS_ID).forNativeAd(new BannerAdView$$ExternalSyntheticLambda0(this)).build().loadAd(new AdRequest.Builder().build());
    }

    /* access modifiers changed from: private */
    /* renamed from: loadAd$lambda-1  reason: not valid java name */
    public static final void m592loadAd$lambda1(BannerAdView bannerAdView, NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(bannerAdView, "this$0");
        Intrinsics.checkNotNullParameter(nativeAd, "it");
        bannerAdView.templateView.setVisibility(0);
        bannerAdView.templateView.setStyles(new NativeTemplateStyle.Builder().build());
        bannerAdView.templateView.setNativeAd(nativeAd);
    }
}
