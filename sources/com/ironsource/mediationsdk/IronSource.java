package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.d.b;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0033r;
import com.ironsource.mediationsdk.Q;
import com.ironsource.mediationsdk.T;
import com.ironsource.mediationsdk.a.d;
import com.ironsource.mediationsdk.a.g;
import com.ironsource.mediationsdk.a.h;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.c.a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.k;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class IronSource {
    public static final String DataSource_MOPUB = "MoPub";

    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE),
        OFFERWALL("offerwall"),
        BANNER("banner");
        
        private String a;

        private AD_UNIT(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        L a = L.a();
        if (a.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            com.ironsource.d.a.a().a(impressionDataListener);
            if (a.z != null) {
                a.z.a(impressionDataListener);
            }
            if (a.A != null) {
                a.A.a(impressionDataListener);
            }
            if (a.C != null) {
                a.C.a(impressionDataListener);
            }
            if (a.D != null) {
                a.D.a(impressionDataListener);
            }
            if (a.B != null) {
                a.B.a(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void clearRewardedVideoServerParameters() {
        L.a().n = null;
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "createBanner()", 1);
        if (activity == null) {
            a.f.log(IronSourceLogger.IronSourceTag.API, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            a.f.log(IronSourceLogger.IronSourceTag.API, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (a.K && a.B != null) {
                T t = a.B;
                IronLog.INTERNAL.verbose("");
                T.AnonymousClass2 r2 = new C0033r.b(ironSourceBannerLayout) {
                    private /* synthetic */ IronSourceBannerLayout a;

                    {
                        this.a = r2;
                    }

                    public final void a() {
                        IronLog.INTERNAL.verbose("destroying banner");
                        T.this.e.d();
                        T.this.a((int) IronSourceConstants.BN_DESTROY, (Object[][]) null, T.this.h != null ? T.this.h.n() : T.this.i);
                        T t = T.this;
                        if (t.h != null) {
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("mActiveSmash = " + t.h.q());
                            t.h.a();
                            t.h = null;
                        }
                        this.a.b();
                        T.this.f = null;
                        T.this.g = null;
                        T.this.a(a.READY_TO_LOAD);
                    }

                    public final void a(String str) {
                        IronLog ironLog = IronLog.API;
                        ironLog.error("destroy banner failed - errorMessage = " + str);
                    }
                };
                if (ironSourceBannerLayout != null) {
                    if (!ironSourceBannerLayout.isDestroyed()) {
                        r2.a();
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                r2.a(String.format("can't destroy banner - %s", objArr));
            } else if (a.e != null) {
                a.e.a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public static void destroyISDemandOnlyBanner(String str) {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (a.N != null) {
                a.N.a(str);
            }
        } catch (Throwable th) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    public static String getAdvertiserId(Context context) {
        L.a();
        return L.a(context);
    }

    public static synchronized String getISDemandOnlyBiddingData() {
        String m;
        synchronized (IronSource.class) {
            m = L.a().m();
        }
        return m;
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String b;
        synchronized (IronSource.class) {
            b = L.a().b(context);
        }
        return b;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return L.a().k(str);
    }

    public static void getOfferwallCredits() {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            S s = a.d;
            if (s.a != null) {
                s.a.getOfferwallCredits();
            }
        } catch (Throwable th) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return L.a().l(str);
    }

    public static void init(Activity activity, String str) {
        init(activity, str, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener) {
        init(activity, str, initializationListener, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        L.a().a(activity, str, false, initializationListener, ad_unitArr);
    }

    public static void init(Activity activity, String str, AD_UNIT... ad_unitArr) {
        L.a().a(activity, str, false, (InitializationListener) null, ad_unitArr);
    }

    @Deprecated
    public static void initISDemandOnly(Activity activity, String str, AD_UNIT... ad_unitArr) {
        L.a().a((Context) activity, str, (InitializationListener) null, ad_unitArr);
    }

    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        L.a().a(context, str, (InitializationListener) null, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        return L.a().n(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return L.a().i(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return L.a().g(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        return L.a().m(str);
    }

    public static boolean isInterstitialReady() {
        return L.a().h();
    }

    public static boolean isOfferwallAvailable() {
        return L.a().l();
    }

    public static boolean isRewardedVideoAvailable() {
        return L.a().c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = com.ironsource.mediationsdk.L.AnonymousClass1.b[r1 - 1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isRewardedVideoPlacementCapped(java.lang.String r7) {
        /*
            com.ironsource.mediationsdk.L r0 = com.ironsource.mediationsdk.L.a()
            int r1 = r0.o(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001c
            int[] r5 = com.ironsource.mediationsdk.L.AnonymousClass1.b
            int r1 = r1 - r4
            r1 = r5[r1]
            if (r1 == r4) goto L_0x001a
            if (r1 == r2) goto L_0x001a
            r5 = 3
            if (r1 == r5) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = r4
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            if (r1 == 0) goto L_0x003f
            boolean r5 = r0.u
            boolean r6 = r0.E
            int r0 = r0.L
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r5, r6, r0)
            if (r7 == 0) goto L_0x003a
            java.lang.Object[][] r5 = new java.lang.Object[r4][]
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = "placement"
            r2[r3] = r6
            r2[r4] = r7
            r5[r3] = r2
            com.ironsource.mediationsdk.L.a((org.json.JSONObject) r0, (java.lang.Object[][]) r5)
        L_0x003a:
            r7 = 1110(0x456, float:1.555E-42)
            com.ironsource.mediationsdk.L.a((int) r7, (org.json.JSONObject) r0)
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.IronSource.isRewardedVideoPlacementCapped(java.lang.String):boolean");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        L.a().a(ironSourceBannerLayout, "");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        L.a().a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBanner(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        L.a().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        L.a().a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        L.a().d(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitial(String str) {
        L.a().d((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        L.a().c(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(String str, String str2) {
        L.a().c((Activity) null, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        L.a().b(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideo(String str) {
        L.a().b((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        L.a().a(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(String str, String str2) {
        L.a().a((Activity) null, str, str2);
    }

    public static void loadInterstitial() {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", 1);
        try {
            if (a.v) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                C0036u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else if (!a.x) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                C0036u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                Q.a b = Q.a().b();
                if (b == Q.a.INIT_FAILED) {
                    a.f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C0036u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (b == Q.a.INIT_IN_PROGRESS) {
                    if (Q.a().c()) {
                        a.f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        C0036u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    }
                    a.J = true;
                } else if (!a.j()) {
                    a.f.log(IronSourceLogger.IronSourceTag.API, "No interstitial configurations found", 3);
                    C0036u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (!a.H) {
                    a.c.c();
                } else {
                    if (a.I) {
                        if (a.C != null) {
                            a.C.d();
                            return;
                        }
                    } else if (a.A != null) {
                        a.A.e();
                        return;
                    }
                    a.J = true;
                }
            }
        } catch (Throwable th) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C0036u.a().a(AD_UNIT.INTERSTITIAL, new IronSourceError(510, th.getMessage()));
        }
    }

    public static void loadRewardedVideo() {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", 1);
        try {
            if (a.u) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                C0036u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!a.F) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video is not initiated with manual load", 3);
            } else if (!a.w) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadRewardedVideo()", 3);
                C0036u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                Q.a b = Q.a().b();
                if (b == Q.a.INIT_FAILED) {
                    a.f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C0036u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (b == Q.a.INIT_IN_PROGRESS) {
                    if (Q.a().c()) {
                        a.f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        C0036u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                        return;
                    }
                    a.G = true;
                } else if (!a.e()) {
                    a.f.log(IronSourceLogger.IronSourceTag.API, "No rewarded video configurations found", 3);
                    C0036u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (a.D == null) {
                    a.G = true;
                } else {
                    a.D.d();
                }
            }
        } catch (Throwable th) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            C0036u.a().a(AD_UNIT.REWARDED_VIDEO, new IronSourceError(510, th.getMessage()));
        }
    }

    public static void onPause(Activity activity) {
        L a = L.a();
        try {
            a.f.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public static void onResume(Activity activity) {
        L a = L.a();
        try {
            a.f.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        L a = L.a();
        if (a.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            com.ironsource.d.a.a().b(impressionDataListener);
            if (a.z != null) {
                a.z.b(impressionDataListener);
            }
            if (a.A != null) {
                a.A.b(impressionDataListener);
            }
            if (a.C != null) {
                a.C.b(impressionDataListener);
            }
            if (a.D != null) {
                a.D.b(impressionDataListener);
            }
            if (a.B != null) {
                a.B.b(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void removeInterstitialListener() {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        a.g.b = null;
        F.a().a((InterstitialListener) null);
        F.a().a((LevelPlayInterstitialListener) null);
    }

    public static void removeOfferwallListener() {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        a.g.c = null;
    }

    public static void removeRewardedVideoListener() {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        a.g.a = null;
        ae.a().a = null;
        ae.a().b = null;
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        L a = L.a();
        if (a.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && a.a((Object) str, "setAdRevenueData - dataSource is null")) {
            a.O.a(str, jSONObject);
        }
    }

    public static void setAdaptersDebug(boolean z) {
        L.a();
        L.a(z);
    }

    public static void setConsent(boolean z) {
        L.a().b(z);
    }

    public static boolean setDynamicUserId(String str) {
        return L.a().c(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        L.a();
        L.a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        L.a();
        L.a(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setImpressionDataListener(ImpressionDataListener impressionDataListener) {
        L a = L.a();
        IronLog.API.info("removing all impression data listeners");
        com.ironsource.d.a.a().c();
        if (a.z != null) {
            a.z.b();
        }
        if (a.A != null) {
            a.A.b();
        }
        if (a.C != null) {
            a.C.g();
        }
        if (a.D != null) {
            a.D.g();
        }
        if (a.B != null) {
            a.B.b();
        }
        addImpressionDataListener(impressionDataListener);
    }

    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, interstitialListener == null ? "setInterstitialListener(ISListener:null)" : "setInterstitialListener(ISListener)", 1);
        a.g.b = interstitialListener;
        F.a().a(interstitialListener);
    }

    public static void setLevelPlayInterstitialListener(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        L.a();
        L.a(levelPlayInterstitialListener);
    }

    public static void setLevelPlayRewardedVideoListener(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        L.a();
        L.a(levelPlayRewardedVideoListener);
    }

    public static void setLevelPlayRewardedVideoManualListener(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        L.a().a(levelPlayRewardedVideoManualListener);
    }

    public static void setLogListener(LogListener logListener) {
        L a = L.a();
        if (logListener == null) {
            a.f.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        a.h.c = logListener;
        IronSourceLoggerManager ironSourceLoggerManager = a.f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public static void setManualLoadRewardedVideo(RewardedVideoManualListener rewardedVideoManualListener) {
        L.a().a(rewardedVideoManualListener);
    }

    public static void setMediationSegment(String str) {
        L a = L.a();
        try {
            a.f.log(IronSourceLogger.IronSourceTag.API, a.a + ":setMediationSegment(segment:" + str + ")", 1);
            b bVar = new b();
            L.a(str, bVar);
            if (bVar.a()) {
                a.l = str;
            } else {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, bVar.b().toString(), 2);
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = a.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, a.a + ":setMediationSegment(segment:" + str + ")", e);
        }
    }

    public static void setMediationType(String str) {
        L.a().d(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        L.a().a(str, (List<String>) arrayList);
    }

    public static void setMetaData(String str, List<String> list) {
        L.a().a(str, list);
    }

    public static void setNetworkData(String str, JSONObject jSONObject) {
        L.a();
        L.a(str, jSONObject);
    }

    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, offerwallListener == null ? "setOfferwallListener(OWListener:null)" : "setOfferwallListener(OWListener)", 1);
        a.g.c = offerwallListener;
    }

    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, rewardedVideoListener == null ? "setRewardedVideoListener(RVListener:null)" : "setRewardedVideoListener(RVListener)", 1);
        a.g.a = rewardedVideoListener;
        ae.a().a = rewardedVideoListener;
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        L a = L.a();
        if (map != null) {
            try {
                if (map.size() != 0) {
                    a.f.log(IronSourceLogger.IronSourceTag.API, a.a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                    a.n = new HashMap(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager ironSourceLoggerManager = a.f;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.logException(ironSourceTag, a.a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e);
            }
        }
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        L a = L.a();
        a.s = ironSourceSegment;
        if (a.D != null) {
            a.D.a(ironSourceSegment);
        }
        if (a.z != null) {
            a.z.a(ironSourceSegment);
        }
        if (a.C != null) {
            a.C.a(ironSourceSegment);
        }
        if (a.A != null) {
            a.A.a(ironSourceSegment);
        }
        if (a.B != null) {
            a.B.a(ironSourceSegment);
        }
        d.d().v = a.s;
        h.d().v = a.s;
        g.w.v = a.s;
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        L a = L.a();
        if (a.g != null) {
            a.g.d = segmentListener;
            Q.a().p = a.g;
        }
    }

    public static void setUserId(String str) {
        L.a().a(str, true);
    }

    public static void shouldTrackNetworkState(Context context, boolean z) {
        L a = L.a();
        a.q = context;
        a.r = Boolean.valueOf(z);
        if (a.H) {
            if (a.I) {
                if (a.C != null) {
                    a.C.b(z);
                }
            } else if (a.A != null) {
                a.A.a(z);
            }
        } else if (a.c != null) {
            a.c.a(context, z);
        }
        if (a.E) {
            if (a.z != null) {
                a.z.a(context, z);
            }
        } else if (a.b != null) {
            a.b.a(context, z);
        }
    }

    public static void showISDemandOnlyInterstitial(String str) {
        L a = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a.f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
            if (!a.v) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
            } else if (a.M == null) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "Interstitial video was not initiated", 3);
                E.a().b(str, new IronSourceError(508, "Interstitial video was not initiated"));
            } else {
                C0038w wVar = a.M;
                if (!wVar.a.containsKey(str)) {
                    C0038w.a((int) IronSourceConstants.IS_INSTANCE_NOT_FOUND, str);
                    E.a().b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    return;
                }
                C0039x xVar = wVar.a.get(str);
                wVar.a((int) IronSourceConstants.IS_INSTANCE_SHOW, xVar);
                xVar.a();
            }
        } catch (Exception e) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyInterstitial", e);
            E.a().b(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        L.a().f(str);
    }

    public static void showInterstitial() {
        L a = L.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "showInterstitial()", 1);
        try {
            if (a.v) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                F.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (!a.i()) {
                F.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT), (AdInfo) null);
            } else {
                InterstitialPlacement g = a.g();
                if (g != null) {
                    a.h(g.getPlacementName());
                } else {
                    F.a().a(new IronSourceError(1020, "showInterstitial error: empty default placement in response"), (AdInfo) null);
                }
            }
        } catch (Exception e) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e);
            F.a().a(new IronSourceError(510, e.getMessage()), (AdInfo) null);
        }
    }

    public static void showInterstitial(String str) {
        L.a().h(str);
    }

    public static void showOfferwall() {
        L a = L.a();
        try {
            a.f.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!a.k()) {
                a.g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            k a2 = a.i.c.c.a();
            if (a2 != null) {
                a.j(a2.b);
            }
        } catch (Exception e) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e);
            a.g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public static void showOfferwall(String str) {
        L.a().j(str);
    }

    public static void showRewardedVideo() {
        L a = L.a();
        if (!a.d()) {
            ae.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            a.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement b = a.b();
        if (b == null) {
            a.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
            ae.a().a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
            return;
        }
        a.e(b.getPlacementName());
    }

    public static void showRewardedVideo(String str) {
        L.a().e(str);
    }
}
