package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

public class IronSourceBannerLayout extends FrameLayout {
    /* access modifiers changed from: private */
    public View a;
    private ISBannerSize b;
    private String c;
    private Activity d;
    private boolean e = false;
    /* access modifiers changed from: private */
    public boolean f = false;

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.d = activity;
        this.b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* access modifiers changed from: protected */
    public final IronSourceBannerLayout a() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.d, this.b);
        ironSourceBannerLayout.setBannerListener(C0029n.a().a);
        ironSourceBannerLayout.setLevelPlayBannerListener(C0029n.a().b);
        ironSourceBannerLayout.setPlacementName(this.c);
        return ironSourceBannerLayout;
    }

    /* access modifiers changed from: package-private */
    public final void a(final View view, final FrameLayout.LayoutParams layoutParams) {
        c.a.b(new Runnable() {
            public final void run() {
                IronSourceBannerLayout.this.removeAllViews();
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                View unused = IronSourceBannerLayout.this.a = view;
                IronSourceBannerLayout.this.addView(view, 0, layoutParams);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void a(AdInfo adInfo, boolean z) {
        C0029n.a().a(adInfo, z);
        this.f = true;
    }

    /* access modifiers changed from: package-private */
    public final void a(final IronSourceError ironSourceError, final boolean z) {
        c.a.b(new Runnable() {
            public final void run() {
                C0029n a2;
                IronSourceError ironSourceError;
                boolean z;
                if (IronSourceBannerLayout.this.f) {
                    a2 = C0029n.a();
                    ironSourceError = ironSourceError;
                    z = true;
                } else {
                    try {
                        if (IronSourceBannerLayout.this.a != null) {
                            IronSourceBannerLayout ironSourceBannerLayout = IronSourceBannerLayout.this;
                            ironSourceBannerLayout.removeView(ironSourceBannerLayout.a);
                            View unused = IronSourceBannerLayout.this.a = null;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    a2 = C0029n.a();
                    ironSourceError = ironSourceError;
                    z = z;
                }
                a2.a(ironSourceError, z);
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.e = true;
        this.d = null;
        this.b = null;
        this.c = null;
        this.a = null;
        removeBannerListener();
    }

    public Activity getActivity() {
        return this.d;
    }

    public BannerListener getBannerListener() {
        return C0029n.a().a;
    }

    public View getBannerView() {
        return this.a;
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return C0029n.a().b;
    }

    public String getPlacementName() {
        return this.c;
    }

    public ISBannerSize getSize() {
        return this.b;
    }

    public boolean isDestroyed() {
        return this.e;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        C0029n.a().a = null;
        C0029n.a().b = null;
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info("");
        C0029n.a().a = bannerListener;
    }

    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info("");
        C0029n.a().b = levelPlayBannerListener;
    }

    public void setPlacementName(String str) {
        this.c = str;
    }
}
