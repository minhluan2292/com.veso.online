package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyBannerListener;

public class ISDemandOnlyBannerLayout extends FrameLayout {
    /* access modifiers changed from: package-private */
    public View a;
    ISBannerSize b;
    String c;
    Activity d;
    boolean e = false;
    /* access modifiers changed from: package-private */
    public boolean f = false;

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.d = activity;
        this.b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public Activity getActivity() {
        return this.d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return C0028m.a().a;
    }

    public View getBannerView() {
        return this.a;
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
        C0028m.a().a = null;
    }

    public final void sendBannerAdLoadFailed(final String str, final IronSourceError ironSourceError) {
        c.a.b(new Runnable() {
            public final void run() {
                if (ISDemandOnlyBannerLayout.this.f) {
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onBannerAdLoadFailed error=" + ironSourceError + ". instanceId: " + str);
                } else {
                    try {
                        if (ISDemandOnlyBannerLayout.this.a != null) {
                            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
                            iSDemandOnlyBannerLayout.removeView(iSDemandOnlyBannerLayout.a);
                            View unused = ISDemandOnlyBannerLayout.this.a = null;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                C0028m.a().a(str, ironSourceError);
            }
        });
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info("");
        C0028m.a().a = iSDemandOnlyBannerListener;
    }

    public void setPlacementName(String str) {
        this.c = str;
    }
}
