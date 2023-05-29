package com.ironsource.sdk.f;

import com.ironsource.sdk.g.d;

public class a {
    private com.ironsource.mediationsdk.adunit.a.a a = new com.ironsource.mediationsdk.adunit.a.a();

    /* renamed from: com.ironsource.sdk.f.a$a  reason: collision with other inner class name */
    public static class C0013a {
        public String a;
        public String b;
        public String c;

        public static C0013a a(d.e eVar) {
            String str;
            C0013a aVar = new C0013a();
            if (eVar == d.e.RewardedVideo) {
                aVar.a = "showRewardedVideo";
                aVar.b = "onShowRewardedVideoSuccess";
                str = "onShowRewardedVideoFail";
            } else if (eVar == d.e.Interstitial) {
                aVar.a = "showInterstitial";
                aVar.b = "onShowInterstitialSuccess";
                str = "onShowInterstitialFail";
            } else {
                if (eVar == d.e.OfferWall) {
                    aVar.a = "showOfferWall";
                    aVar.b = "onShowOfferWallSuccess";
                    str = "onInitOfferWallFail";
                }
                return aVar;
            }
            aVar.c = str;
            return aVar;
        }
    }

    public void a(int i) {
        com.ironsource.mediationsdk.adunit.a.a.a("sdia", (Object) Integer.valueOf(i));
    }

    public void b(int i) {
        com.ironsource.mediationsdk.adunit.a.a.a("sdra", (Object) Integer.valueOf(i));
    }

    public void c(int i) {
        com.ironsource.mediationsdk.adunit.a.a.a("sdba", (Object) Integer.valueOf(i));
    }
}
