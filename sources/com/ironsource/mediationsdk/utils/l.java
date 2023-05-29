package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.google.firebase.messaging.Constants;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.mediationsdk.G;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.h;
import com.ironsource.mediationsdk.model.l;
import com.ironsource.mediationsdk.model.m;
import com.ironsource.mediationsdk.model.n;
import com.ironsource.mediationsdk.model.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class l {
    private final String A = "configurations";
    private final String B = IronSourceConstants.EVENTS_GENERIC_PARAMS;
    private final String C = "adUnits";
    private final String D = "providerLoadName";
    private final String E = "application";
    private final String F = "rewardedVideo";
    private final String G = IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE;
    private final String H = "offerwall";
    private final String I = "banner";
    private final String J = "integration";
    private final String K = "loggers";
    private final String L = "segment";
    private final String M = "events";
    private final String N = "crashReporter";
    private final String O = IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY;
    private final String P = "external";
    private final String Q = "mediationTypes";
    private final String R = "providerDefaultInstance";
    private final String S = "settings";
    private final String T = "maxNumOfAdaptersToLoadOnStart";
    private final String U = "advancedLoading";
    private final String V = "adapterTimeOutInSeconds";
    private final String W = "atim";
    private final String X = "bannerInterval";
    private final String Y = "isOneFlow";
    private final String Z = "loadRVInterval";
    public n a;
    private final String aA = "enabled";
    private final String aB = "maxImpressions";
    private final String aC = "numOfSeconds";
    private final String aD = "unit";
    private final String aE = "virtualItemName";
    private final String aF = "virtualItemCount";
    private final String aG = "backFill";
    private final String aH = "premium";
    private final String aI = "uuidEnabled";
    private final String aJ = "abt";
    private final String aK = "delayLoadFailure";
    private final String aL = "keysToInclude";
    private final String aM = "reporterURL";
    private final String aN = "reporterKeyword";
    private final String aO = "includeANR";
    private final String aP = "timeout";
    private final String aQ = "setIgnoreDebugger";
    private final String aR = "adSourceName";
    private final String aS = IronSourceConstants.EVENTS_SUB_PROVIDER_ID;
    private final String aT = "mpis";
    private final String aU = "auction";
    private final String aV = "auctionData";
    private final String aW = "auctioneerURL";
    private final String aX = "extAuctioneerURL";
    private final String aY = IronSourceConstants.EVENTS_PROGRAMMATIC;
    private final String aZ = "objectPerWaterfall";
    private final String aa = "expiredDurationInMinutes";
    private final String ab = "server";
    private final String ac = "publisher";
    private final String ad = "console";
    private final String ae = "sendUltraEvents";
    private final String af = "sendEventsToggle";
    private final String ag = "eventsCompression";
    private final String ah = "serverEventsURL";
    private final String ai = "serverEventsType";
    private final String aj = "backupThreshold";
    private final String ak = "maxNumberOfEvents";
    private final String al = "maxEventsPerBatch";
    private final String am = "optOut";
    private final String an = "optIn";
    private final String ao = "triggerEvents";
    private final String ap = "nonConnectivityEvents";
    private final String aq = "pixel";
    private final String ar = "pixelEventsUrl";
    private final String as = "pixelEventsEnabled";
    private final String at = "placements";
    private final String au = "placementId";
    private final String av = "placementName";
    private final String aw = "delivery";
    private final String ax = "isDefault";
    private final String ay = "capping";
    private final String az = "pacing";
    public o b;
    private final String ba = "minTimeBeforeFirstAuction";
    private final String bb = "timeToWaitBeforeAuction";
    private final String bc = "timeToWaitBeforeLoad";
    private final String bd = "auctionRetryInterval";
    private final String be = "isAuctionOnShowStart";
    private final String bf = "isLoadWhileShow";
    private final String bg = IronSourceConstants.AUCTION_TRIALS;
    private final String bh = "auctionTimeout";
    private final String bi = "auctionSavedHistory";
    private final String bj = "disableLoadWhileShowSupportFor";
    private final String bk = "timeToDeleteOldWaterfallAfterAuction";
    private final String bl = "compressAuctionRequest";
    private final String bm = "compressAuctionResponse";
    private final String bn = "encryptionVersion";
    private final String bo = "shouldSendBannerBURLFromImpression";
    private final String bp = "optInKeys";
    private final String bq = "tokenGenericParams";
    private final String br = "oneToken";
    private final String bs = "compressToken";
    private final String bt = "isExternalArmEventsEnabled";
    private final String bu = "externalArmEventsUrl";
    private final String bv = "compressExternalToken";
    private String bw;
    private String bx;
    private Context by;
    public h c;
    public JSONObject d;
    public int e = a.a;
    private final String f = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
    private final int g = 3;
    private final int h = 2;
    private final int i = 60;
    private final int j = 10000;
    private final int k = 5000;
    private final int l = 300;
    private final int m = 3;
    private final int n = 3;
    private final int o = 3;
    private final int p = 2;
    private final int q = 15;
    private final long r = WorkRequest.MIN_BACKOFF_MILLIS;
    private final int s = 0;
    private final boolean t = false;
    private final int u = 30000;
    private final int v = -1;
    private final int w = 5000;
    private final int x = 1;
    private final String y = "providerOrder";
    private final String z = "providerSettings";

    public enum a {
        ;
        
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;

        static {
            d = new int[]{1, 2, 3};
        }
    }

    public l(Context context, String str, String str2, String str3) {
        this.by = context;
        try {
            this.d = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            h();
            i();
            g();
            this.bw = TextUtils.isEmpty(str) ? "" : str;
            this.bx = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            e();
        }
    }

    public l(l lVar) {
        try {
            this.by = lVar.by;
            this.d = new JSONObject(lVar.d.toString());
            this.bw = lVar.bw;
            this.bx = lVar.bx;
            this.a = lVar.a;
            this.b = lVar.b;
            this.c = lVar.c;
            this.e = lVar.e;
        } catch (Exception unused) {
            e();
        }
    }

    private static int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i2) {
        int i3 = 0;
        if (jSONObject.has(str)) {
            i3 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i3 = jSONObject2.optInt(str, 0);
        }
        return i3 == 0 ? i2 : i3;
    }

    private static com.ironsource.mediationsdk.model.l a(JSONObject jSONObject) {
        m mVar = null;
        if (jSONObject == null) {
            return null;
        }
        l.a aVar = new l.a();
        boolean z2 = true;
        aVar.a = jSONObject.optBoolean("delivery", true);
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("unit");
            if (!TextUtils.isEmpty(optString)) {
                if (m.PER_DAY.toString().equals(optString)) {
                    mVar = m.PER_DAY;
                } else if (m.PER_HOUR.toString().equals(optString)) {
                    mVar = m.PER_HOUR;
                }
            }
            int optInt = optJSONObject.optInt("maxImpressions", 0);
            aVar.a(optJSONObject.optBoolean("enabled", false) && optInt > 0, mVar, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt("numOfSeconds", 0);
            if (!optJSONObject2.optBoolean("enabled", false) || optInt2 <= 0) {
                z2 = false;
            }
            aVar.a(z2, optInt2);
        }
        return aVar.a();
    }

    private static int[] a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int[] iArr = new int[optJSONArray.length()];
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            iArr[i2] = optJSONArray.optInt(i2);
        }
        return iArr;
    }

    private static JSONObject b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private void e() {
        this.d = new JSONObject();
        this.bw = "";
        this.bx = "";
        this.a = new n();
        this.b = o.a();
        this.c = new h();
    }

    private boolean f() {
        JSONObject b2;
        JSONArray optJSONArray;
        JSONObject b3 = b(this.d, "providerOrder");
        JSONArray names = b3.names();
        if (names == null) {
            return true;
        }
        JSONObject b4 = b(b(this.d, "configurations"), "adUnits");
        for (int i2 = 0; i2 < names.length(); i2++) {
            String optString = names.optString(i2);
            JSONArray optJSONArray2 = b3.optJSONArray(optString);
            if (optJSONArray2 != null && optJSONArray2.length() != 0 && (b2 = b(b4, optString)) != null && ((optJSONArray = b2.optJSONArray("placements")) == null || optJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private void g() {
        h hVar;
        h hVar2;
        try {
            JSONObject b2 = b(this.d, "providerOrder");
            JSONArray optJSONArray = b2.optJSONArray("rewardedVideo");
            JSONArray optJSONArray2 = b2.optJSONArray(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
            JSONArray optJSONArray3 = b2.optJSONArray("banner");
            this.a = new n();
            if (!(optJSONArray == null || (hVar2 = this.c) == null || hVar2.a == null)) {
                String str = this.c.a.f;
                String str2 = this.c.a.g;
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    String optString = optJSONArray.optString(i2);
                    if (optString.equals(str)) {
                        this.a.b = str;
                    } else {
                        if (optString.equals(str2)) {
                            this.a.c = str2;
                        }
                        n nVar = this.a;
                        if (!TextUtils.isEmpty(optString)) {
                            nVar.a.add(optString);
                        }
                        NetworkSettings a2 = o.a().a(optString);
                        if (a2 != null) {
                            a2.setRewardedVideoPriority(i2);
                        }
                    }
                }
            }
            if (!(optJSONArray2 == null || (hVar = this.c) == null || hVar.b == null)) {
                String str3 = this.c.b.g;
                String str4 = this.c.b.h;
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    String optString2 = optJSONArray2.optString(i3);
                    if (optString2.equals(str3)) {
                        this.a.f = str3;
                    } else {
                        if (optString2.equals(str4)) {
                            this.a.g = str4;
                        }
                        n nVar2 = this.a;
                        if (!TextUtils.isEmpty(optString2)) {
                            nVar2.d.add(optString2);
                        }
                        NetworkSettings a3 = o.a().a(optString2);
                        if (a3 != null) {
                            a3.setInterstitialPriority(i3);
                        }
                    }
                }
            }
            if (optJSONArray3 != null) {
                for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                    String optString3 = optJSONArray3.optString(i4);
                    n nVar3 = this.a;
                    if (!TextUtils.isEmpty(optString3)) {
                        nVar3.e.add(optString3);
                    }
                    NetworkSettings a4 = o.a().a(optString3);
                    if (a4 != null) {
                        a4.setBannerPriority(i4);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e2 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0132 A[Catch:{ Exception -> 0x015c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "Mediation"
            com.ironsource.mediationsdk.model.o r2 = com.ironsource.mediationsdk.model.o.a()     // Catch:{ Exception -> 0x015c }
            r1.b = r2     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r2 = r1.d     // Catch:{ Exception -> 0x015c }
            java.lang.String r3 = "providerSettings"
            org.json.JSONObject r2 = b(r2, r3)     // Catch:{ Exception -> 0x015c }
            java.util.Iterator r3 = r2.keys()     // Catch:{ Exception -> 0x015c }
        L_0x0016:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x015c }
            if (r4 == 0) goto L_0x0156
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x015c }
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r4 = r2.optJSONObject(r6)     // Catch:{ Exception -> 0x015c }
            if (r4 == 0) goto L_0x014c
            java.lang.String r5 = "mpis"
            r7 = 0
            boolean r13 = r4.optBoolean(r5, r7)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "spId"
            java.lang.String r8 = "0"
            java.lang.String r14 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "adSourceName"
            r8 = 0
            java.lang.String r15 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "providerLoadName"
            java.lang.String r8 = r4.optString(r5, r6)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "providerDefaultInstance"
            java.lang.String r9 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "adUnits"
            org.json.JSONObject r5 = b(r4, r5)     // Catch:{ Exception -> 0x015c }
            java.lang.String r10 = "application"
            org.json.JSONObject r4 = b(r4, r10)     // Catch:{ Exception -> 0x015c }
            java.lang.String r10 = "rewardedVideo"
            org.json.JSONObject r10 = b(r5, r10)     // Catch:{ Exception -> 0x015c }
            java.lang.String r11 = "interstitial"
            org.json.JSONObject r11 = b(r5, r11)     // Catch:{ Exception -> 0x015c }
            java.lang.String r12 = "banner"
            org.json.JSONObject r5 = b(r5, r12)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r10, r4)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r11, r4)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r4)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.o r5 = r1.b     // Catch:{ Exception -> 0x015c }
            boolean r5 = r5.b(r6)     // Catch:{ Exception -> 0x015c }
            if (r5 == 0) goto L_0x00af
            com.ironsource.mediationsdk.model.o r4 = r1.b     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r4 = r4.a((java.lang.String) r6)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = r4.getRewardedVideoSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r6 = r4.getInterstitialSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = r4.getBannerSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r10)     // Catch:{ Exception -> 0x015c }
            r4.setRewardedVideoSettings(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r6, r11)     // Catch:{ Exception -> 0x015c }
            r4.setInterstitialSettings(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r12)     // Catch:{ Exception -> 0x015c }
            r4.setBannerSettings(r5)     // Catch:{ Exception -> 0x015c }
            r4.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r4.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r4.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            goto L_0x0016
        L_0x00af:
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = r8.toLowerCase(r5)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.o r7 = r1.b     // Catch:{ Exception -> 0x015c }
            boolean r7 = r7.b(r0)     // Catch:{ Exception -> 0x015c }
            if (r7 == 0) goto L_0x00dd
            java.lang.String r7 = "SupersonicAds"
            r17 = r2
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r7.toLowerCase(r2)     // Catch:{ Exception -> 0x015c }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x015c }
            if (r2 != 0) goto L_0x00db
            java.lang.String r2 = "IronSource"
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r2.toLowerCase(r7)     // Catch:{ Exception -> 0x015c }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x015c }
            if (r2 == 0) goto L_0x00df
        L_0x00db:
            r7 = 1
            goto L_0x00e0
        L_0x00dd:
            r17 = r2
        L_0x00df:
            r7 = 0
        L_0x00e0:
            if (r7 == 0) goto L_0x0132
            com.ironsource.mediationsdk.model.o r2 = r1.b     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r2.a((java.lang.String) r0)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = r2.getRewardedVideoSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = r2.getInterstitialSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r2 = r2.getBannerSettings()     // Catch:{ Exception -> 0x015c }
            r16 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x015c }
            r0.<init>(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x015c }
            r5.<init>(r7)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x015c }
            r7.<init>(r2)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r0, r10)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r11)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r12)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r0 = new com.ironsource.mediationsdk.model.NetworkSettings     // Catch:{ Exception -> 0x015c }
            r5 = r0
            r7 = r8
            r8 = r9
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x015c }
            r0.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r0.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r0.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.o r2 = r1.b     // Catch:{ Exception -> 0x015c }
            goto L_0x0148
        L_0x0132:
            r16 = r0
            com.ironsource.mediationsdk.model.NetworkSettings r0 = new com.ironsource.mediationsdk.model.NetworkSettings     // Catch:{ Exception -> 0x015c }
            r5 = r0
            r7 = r8
            r8 = r9
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x015c }
            r0.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r0.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r0.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.o r2 = r1.b     // Catch:{ Exception -> 0x015c }
        L_0x0148:
            r2.a((com.ironsource.mediationsdk.model.NetworkSettings) r0)     // Catch:{ Exception -> 0x015c }
            goto L_0x0150
        L_0x014c:
            r16 = r0
            r17 = r2
        L_0x0150:
            r0 = r16
            r2 = r17
            goto L_0x0016
        L_0x0156:
            com.ironsource.mediationsdk.model.o r0 = r1.b     // Catch:{ Exception -> 0x015c }
            r0.b()     // Catch:{ Exception -> 0x015c }
            return
        L_0x015c:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.l.h():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:164:0x0563 A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0644 A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0663 A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0673 A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x068e A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x069a A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x06b5 A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x06c1 A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x06da A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x06e7 A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0762 A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0774 A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x07cc A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0908 A[Catch:{ Exception -> 0x0596 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x032b A[Catch:{ Exception -> 0x0596 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
            r84 = this;
            r1 = r84
            java.lang.String r2 = "events"
            org.json.JSONObject r3 = r1.d     // Catch:{ Exception -> 0x0afa }
            java.lang.String r4 = "configurations"
            org.json.JSONObject r3 = b(r3, r4)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r4 = "adUnits"
            org.json.JSONObject r4 = b(r3, r4)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r5 = "application"
            org.json.JSONObject r3 = b(r3, r5)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r5 = "rewardedVideo"
            org.json.JSONObject r5 = b(r4, r5)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r6 = "interstitial"
            org.json.JSONObject r6 = b(r4, r6)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r7 = "offerwall"
            org.json.JSONObject r7 = b(r4, r7)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r8 = "banner"
            org.json.JSONObject r4 = b(r4, r8)     // Catch:{ Exception -> 0x0afa }
            org.json.JSONObject r8 = b(r3, r2)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r9 = "loggers"
            org.json.JSONObject r9 = b(r3, r9)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r10 = "token"
            org.json.JSONObject r10 = b(r3, r10)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r11 = "segment"
            org.json.JSONObject r11 = b(r3, r11)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r12 = "auction"
            org.json.JSONObject r12 = b(r3, r12)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r13 = "crashReporter"
            org.json.JSONObject r13 = b(r3, r13)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r14 = "settings"
            org.json.JSONObject r14 = b(r3, r14)     // Catch:{ Exception -> 0x0afa }
            java.lang.String r15 = "external"
            org.json.JSONObject r15 = b(r3, r15)     // Catch:{ Exception -> 0x0afa }
            r16 = r15
            java.lang.String r15 = "pixel"
            org.json.JSONObject r15 = b(r8, r15)     // Catch:{ Exception -> 0x0afa }
            r17 = r14
            r14 = 1
            if (r3 == 0) goto L_0x007d
            r18 = r11
            java.lang.String r11 = "uuidEnabled"
            boolean r11 = r3.optBoolean(r11, r14)     // Catch:{ Exception -> 0x0afa }
            android.content.Context r14 = r1.by     // Catch:{ Exception -> 0x0afa }
            r19 = r13
            java.lang.String r13 = "uuidEnabled"
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveBooleanToSharedPrefs(r14, r13, r11)     // Catch:{ Exception -> 0x0afa }
            goto L_0x0081
        L_0x007d:
            r18 = r11
            r19 = r13
        L_0x0081:
            if (r8 == 0) goto L_0x009b
            java.lang.String r11 = "abt"
            java.lang.String r11 = r8.optString(r11)     // Catch:{ Exception -> 0x0afa }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0afa }
            if (r13 != 0) goto L_0x009b
            com.ironsource.mediationsdk.a.d r13 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ Exception -> 0x0afa }
            r13.p = r11     // Catch:{ Exception -> 0x0afa }
            com.ironsource.mediationsdk.a.h r13 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ Exception -> 0x0afa }
            r13.p = r11     // Catch:{ Exception -> 0x0afa }
        L_0x009b:
            java.lang.String r11 = "triggerEvents"
            java.lang.String r13 = "maxEventsPerBatch"
            java.lang.String r14 = "maxNumberOfEvents"
            r20 = r9
            java.lang.String r9 = "backupThreshold"
            r21 = r6
            r22 = r7
            java.lang.String r6 = "serverEventsType"
            java.lang.String r7 = "serverEventsURL"
            r24 = r15
            java.lang.String r15 = "sendEventsToggle"
            r25 = r10
            java.lang.String r10 = "placements"
            r26 = r4
            java.lang.String r4 = "optIn"
            java.lang.String r1 = "optOut"
            r27 = r12
            java.lang.String r12 = "eventsCompression"
            r28 = r11
            java.lang.String r11 = ""
            r29 = 0
            r30 = r4
            if (r5 == 0) goto L_0x035d
            org.json.JSONArray r4 = r5.optJSONArray(r10)     // Catch:{ Exception -> 0x0358 }
            r32 = r10
            org.json.JSONObject r10 = b(r5, r2)     // Catch:{ Exception -> 0x0358 }
            r33 = r2
            java.lang.String r2 = "maxNumOfAdaptersToLoadOnStart"
            r34 = r4
            r4 = 2
            int r2 = a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "advancedLoading"
            r35 = r2
            r2 = 0
            int r4 = a(r5, r3, r4, r2)     // Catch:{ Exception -> 0x0358 }
            if (r4 <= 0) goto L_0x00ee
            r37 = r4
            r38 = 1
            goto L_0x00f2
        L_0x00ee:
            r37 = r35
            r38 = 0
        L_0x00f2:
            java.lang.String r2 = "adapterTimeOutInSeconds"
            r4 = 60
            int r39 = a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r2 = "loadRVInterval"
            r4 = 300(0x12c, float:4.2E-43)
            int r40 = a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r2 = "expiredDurationInMinutes"
            r4 = -1
            int r41 = a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r2 = "delayLoadFailure"
            r4 = 3
            int r44 = a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0358 }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r10, r8)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "sendUltraEvents"
            r10 = 0
            boolean r46 = r2.optBoolean(r4, r10)     // Catch:{ Exception -> 0x0358 }
            boolean r47 = r2.optBoolean(r15, r10)     // Catch:{ Exception -> 0x0358 }
            boolean r48 = r2.optBoolean(r12, r10)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r49 = r2.optString(r7, r11)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r50 = r2.optString(r6, r11)     // Catch:{ Exception -> 0x0358 }
            r4 = -1
            int r51 = r2.optInt(r9, r4)     // Catch:{ Exception -> 0x0358 }
            int r52 = r2.optInt(r14, r4)     // Catch:{ Exception -> 0x0358 }
            r4 = 5000(0x1388, float:7.006E-42)
            int r53 = r2.optInt(r13, r4)     // Catch:{ Exception -> 0x0358 }
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0358 }
            if (r4 == 0) goto L_0x015d
            int r10 = r4.length()     // Catch:{ Exception -> 0x0358 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0358 }
            r35 = r1
            r58 = r13
            r1 = 0
        L_0x014b:
            int r13 = r4.length()     // Catch:{ Exception -> 0x0358 }
            if (r1 >= r13) goto L_0x015a
            int r13 = r4.optInt(r1)     // Catch:{ Exception -> 0x0358 }
            r10[r1] = r13     // Catch:{ Exception -> 0x0358 }
            int r1 = r1 + 1
            goto L_0x014b
        L_0x015a:
            r54 = r10
            goto L_0x0163
        L_0x015d:
            r35 = r1
            r58 = r13
            r54 = r29
        L_0x0163:
            r1 = r30
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0358 }
            if (r4 == 0) goto L_0x0186
            int r10 = r4.length()     // Catch:{ Exception -> 0x0358 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0358 }
            r30 = r1
            r13 = 0
        L_0x0174:
            int r1 = r4.length()     // Catch:{ Exception -> 0x0358 }
            if (r13 >= r1) goto L_0x0183
            int r1 = r4.optInt(r13)     // Catch:{ Exception -> 0x0358 }
            r10[r13] = r1     // Catch:{ Exception -> 0x0358 }
            int r13 = r13 + 1
            goto L_0x0174
        L_0x0183:
            r55 = r10
            goto L_0x018a
        L_0x0186:
            r30 = r1
            r55 = r29
        L_0x018a:
            r1 = r28
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0358 }
            if (r4 == 0) goto L_0x01ad
            int r10 = r4.length()     // Catch:{ Exception -> 0x0358 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0358 }
            r28 = r1
            r13 = 0
        L_0x019b:
            int r1 = r4.length()     // Catch:{ Exception -> 0x0358 }
            if (r13 >= r1) goto L_0x01aa
            int r1 = r4.optInt(r13)     // Catch:{ Exception -> 0x0358 }
            r10[r13] = r1     // Catch:{ Exception -> 0x0358 }
            int r13 = r13 + 1
            goto L_0x019b
        L_0x01aa:
            r56 = r10
            goto L_0x01b1
        L_0x01ad:
            r28 = r1
            r56 = r29
        L_0x01b1:
            java.lang.String r1 = "nonConnectivityEvents"
            org.json.JSONArray r1 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0358 }
            if (r1 == 0) goto L_0x01d2
            int r2 = r1.length()     // Catch:{ Exception -> 0x0358 }
            int[] r2 = new int[r2]     // Catch:{ Exception -> 0x0358 }
            r4 = 0
        L_0x01c0:
            int r10 = r1.length()     // Catch:{ Exception -> 0x0358 }
            if (r4 >= r10) goto L_0x01cf
            int r10 = r1.optInt(r4)     // Catch:{ Exception -> 0x0358 }
            r2[r4] = r10     // Catch:{ Exception -> 0x0358 }
            int r4 = r4 + 1
            goto L_0x01c0
        L_0x01cf:
            r57 = r2
            goto L_0x01d4
        L_0x01d2:
            r57 = r29
        L_0x01d4:
            com.ironsource.mediationsdk.model.c r42 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x0358 }
            r45 = r42
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)     // Catch:{ Exception -> 0x0358 }
            if (r27 == 0) goto L_0x02a6
            java.lang.String r1 = "rewardedVideo"
            r2 = r27
            org.json.JSONObject r1 = b(r2, r1)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "auctionData"
            java.lang.String r60 = r2.optString(r4, r11)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "auctioneerURL"
            java.lang.String r61 = r2.optString(r4, r11)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "extAuctioneerURL"
            java.lang.String r62 = r2.optString(r4, r11)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "auctionTrials"
            r10 = 2
            int r63 = r2.optInt(r4, r10)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "auctionTimeout"
            r10 = r14
            r13 = 10000(0x2710, double:4.9407E-320)
            long r65 = r2.optLong(r4, r13)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "auctionSavedHistory"
            r13 = 15
            int r64 = r2.optInt(r4, r13)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "compressAuctionRequest"
            r13 = 0
            boolean r79 = r2.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "compressAuctionResponse"
            boolean r80 = r2.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "encryptionVersion"
            r14 = 1
            int r82 = r2.optInt(r4, r14)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "programmatic"
            boolean r67 = r1.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r4 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r4 = r1.optInt(r4, r13)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r13 = "auctionRetryInterval"
            r14 = 30000(0x7530, float:4.2039E-41)
            int r13 = r1.optInt(r13, r14)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r14 = "timeToWaitBeforeAuction"
            r27 = r2
            r2 = 5000(0x1388, float:7.006E-42)
            int r14 = r1.optInt(r14, r2)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r2 = "timeToWaitBeforeLoad"
            r45 = r10
            r10 = 50
            int r2 = r1.optInt(r2, r10)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r10 = "isAuctionOnShowStart"
            r46 = r9
            r9 = 0
            boolean r76 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r10 = "objectPerWaterfall"
            boolean r81 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r10 = "isLoadWhileShow"
            boolean r77 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r9 = "timeToDeleteOldWaterfallAfterAuction"
            r10 = 30000(0x7530, float:4.2039E-41)
            int r78 = r1.optInt(r9, r10)     // Catch:{ Exception -> 0x0358 }
            com.ironsource.mediationsdk.utils.c r9 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0358 }
            r10 = r6
            r47 = r7
            long r6 = (long) r4     // Catch:{ Exception -> 0x0358 }
            r68 = r6
            long r6 = (long) r13     // Catch:{ Exception -> 0x0358 }
            r70 = r6
            long r6 = (long) r14     // Catch:{ Exception -> 0x0358 }
            r72 = r6
            long r6 = (long) r2     // Catch:{ Exception -> 0x0358 }
            r74 = r6
            r83 = 0
            r59 = r9
            r59.<init>(r60, r61, r62, r63, r64, r65, r67, r68, r70, r72, r74, r76, r77, r78, r79, r80, r81, r82, r83)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r2 = "disableLoadWhileShowSupportFor"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0358 }
            if (r1 == 0) goto L_0x02a3
            r2 = 0
        L_0x028b:
            int r4 = r1.length()     // Catch:{ Exception -> 0x0358 }
            if (r2 >= r4) goto L_0x02a3
            java.lang.String r4 = r1.optString(r2)     // Catch:{ Exception -> 0x0358 }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0358 }
            if (r6 != 0) goto L_0x02a0
            java.util.ArrayList<java.lang.String> r6 = r9.p     // Catch:{ Exception -> 0x0358 }
            r6.add(r4)     // Catch:{ Exception -> 0x0358 }
        L_0x02a0:
            int r2 = r2 + 1
            goto L_0x028b
        L_0x02a3:
            r43 = r9
            goto L_0x02b4
        L_0x02a6:
            r10 = r6
            r47 = r7
            r46 = r9
            r45 = r14
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0358 }
            r1.<init>()     // Catch:{ Exception -> 0x0358 }
            r43 = r1
        L_0x02b4:
            com.ironsource.mediationsdk.model.p r1 = new com.ironsource.mediationsdk.model.p     // Catch:{ Exception -> 0x0358 }
            r36 = r1
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ Exception -> 0x0358 }
            if (r34 == 0) goto L_0x0337
            r2 = 0
        L_0x02be:
            int r4 = r34.length()     // Catch:{ Exception -> 0x0358 }
            if (r2 >= r4) goto L_0x0337
            r4 = r34
            org.json.JSONObject r6 = r4.optJSONObject(r2)     // Catch:{ Exception -> 0x0358 }
            if (r6 == 0) goto L_0x0317
            java.lang.String r7 = "placementId"
            r9 = -1
            int r37 = r6.optInt(r7, r9)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r7 = "placementName"
            java.lang.String r38 = r6.optString(r7, r11)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r7 = "isDefault"
            r9 = 0
            boolean r39 = r6.optBoolean(r7, r9)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r7 = "virtualItemName"
            java.lang.String r40 = r6.optString(r7, r11)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r7 = "virtualItemCount"
            r9 = -1
            int r41 = r6.optInt(r7, r9)     // Catch:{ Exception -> 0x0358 }
            com.ironsource.mediationsdk.model.l r6 = a(r6)     // Catch:{ Exception -> 0x0358 }
            if (r37 < 0) goto L_0x0317
            boolean r7 = android.text.TextUtils.isEmpty(r38)     // Catch:{ Exception -> 0x0358 }
            if (r7 != 0) goto L_0x0317
            boolean r7 = android.text.TextUtils.isEmpty(r40)     // Catch:{ Exception -> 0x0358 }
            if (r7 != 0) goto L_0x0317
            if (r41 <= 0) goto L_0x0317
            com.ironsource.mediationsdk.model.Placement r7 = new com.ironsource.mediationsdk.model.Placement     // Catch:{ Exception -> 0x0358 }
            r36 = r7
            r42 = r6
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x0358 }
            if (r6 == 0) goto L_0x0314
            r6 = r84
            android.content.Context r9 = r6.by     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.utils.k.a((android.content.Context) r9, (com.ironsource.mediationsdk.model.Placement) r7)     // Catch:{ Exception -> 0x0596 }
            goto L_0x031b
        L_0x0314:
            r6 = r84
            goto L_0x031b
        L_0x0317:
            r6 = r84
            r7 = r29
        L_0x031b:
            if (r7 == 0) goto L_0x0332
            if (r7 == 0) goto L_0x0332
            java.util.ArrayList<com.ironsource.mediationsdk.model.Placement> r9 = r1.a     // Catch:{ Exception -> 0x0596 }
            r9.add(r7)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.model.Placement r9 = r1.k     // Catch:{ Exception -> 0x0596 }
            if (r9 != 0) goto L_0x032b
        L_0x0328:
            r1.k = r7     // Catch:{ Exception -> 0x0596 }
            goto L_0x0332
        L_0x032b:
            int r9 = r7.getPlacementId()     // Catch:{ Exception -> 0x0596 }
            if (r9 != 0) goto L_0x0332
            goto L_0x0328
        L_0x0332:
            int r2 = r2 + 1
            r34 = r4
            goto L_0x02be
        L_0x0337:
            r6 = r84
            java.lang.String r2 = "backFill"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x0596 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0596 }
            if (r4 != 0) goto L_0x0347
            r1.f = r2     // Catch:{ Exception -> 0x0596 }
        L_0x0347:
            java.lang.String r2 = "premium"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x0596 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0596 }
            if (r4 != 0) goto L_0x0355
            r1.g = r2     // Catch:{ Exception -> 0x0596 }
        L_0x0355:
            r37 = r1
            goto L_0x0370
        L_0x0358:
            r0 = move-exception
            r6 = r84
            goto L_0x0afc
        L_0x035d:
            r35 = r1
            r33 = r2
            r47 = r7
            r46 = r9
            r32 = r10
            r58 = r13
            r45 = r14
            r10 = r6
            r6 = r84
            r37 = r29
        L_0x0370:
            if (r21 == 0) goto L_0x0599
            r1 = r21
            r2 = r32
            org.json.JSONArray r4 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0596 }
            r5 = r33
            org.json.JSONObject r7 = b(r1, r5)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r9 = "maxNumOfAdaptersToLoadOnStart"
            r13 = 2
            int r9 = a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r13 = "advancedLoading"
            r14 = 0
            int r13 = a(r1, r3, r13, r14)     // Catch:{ Exception -> 0x0596 }
            if (r13 <= 0) goto L_0x0395
            r39 = r13
            r40 = 1
            goto L_0x0399
        L_0x0395:
            r39 = r9
            r40 = 0
        L_0x0399:
            java.lang.String r9 = "adapterTimeOutInSeconds"
            r13 = 60
            int r41 = a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r9 = "delayLoadFailure"
            r13 = 3
            int r44 = a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x0596 }
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r8)     // Catch:{ Exception -> 0x0596 }
            r9 = 0
            boolean r61 = r7.optBoolean(r15, r9)     // Catch:{ Exception -> 0x0596 }
            boolean r62 = r7.optBoolean(r12, r9)     // Catch:{ Exception -> 0x0596 }
            r9 = r47
            java.lang.String r63 = r7.optString(r9, r11)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r64 = r7.optString(r10, r11)     // Catch:{ Exception -> 0x0596 }
            r13 = r46
            r14 = -1
            int r65 = r7.optInt(r13, r14)     // Catch:{ Exception -> 0x0596 }
            r46 = r13
            r13 = r45
            int r66 = r7.optInt(r13, r14)     // Catch:{ Exception -> 0x0596 }
            r45 = r13
            r14 = r58
            r13 = 5000(0x1388, float:7.006E-42)
            int r67 = r7.optInt(r14, r13)     // Catch:{ Exception -> 0x0596 }
            r58 = r14
            r13 = r35
            org.json.JSONArray r14 = r7.optJSONArray(r13)     // Catch:{ Exception -> 0x0596 }
            if (r14 == 0) goto L_0x0401
            r35 = r13
            int r13 = r14.length()     // Catch:{ Exception -> 0x0596 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x0596 }
            r47 = r9
            r21 = r10
            r10 = 0
        L_0x03ef:
            int r9 = r14.length()     // Catch:{ Exception -> 0x0596 }
            if (r10 >= r9) goto L_0x03fe
            int r9 = r14.optInt(r10)     // Catch:{ Exception -> 0x0596 }
            r13[r10] = r9     // Catch:{ Exception -> 0x0596 }
            int r10 = r10 + 1
            goto L_0x03ef
        L_0x03fe:
            r68 = r13
            goto L_0x0409
        L_0x0401:
            r47 = r9
            r21 = r10
            r35 = r13
            r68 = r29
        L_0x0409:
            r9 = r30
            org.json.JSONArray r10 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x0596 }
            if (r10 == 0) goto L_0x042c
            int r13 = r10.length()     // Catch:{ Exception -> 0x0596 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x0596 }
            r30 = r9
            r14 = 0
        L_0x041a:
            int r9 = r10.length()     // Catch:{ Exception -> 0x0596 }
            if (r14 >= r9) goto L_0x0429
            int r9 = r10.optInt(r14)     // Catch:{ Exception -> 0x0596 }
            r13[r14] = r9     // Catch:{ Exception -> 0x0596 }
            int r14 = r14 + 1
            goto L_0x041a
        L_0x0429:
            r69 = r13
            goto L_0x0430
        L_0x042c:
            r30 = r9
            r69 = r29
        L_0x0430:
            r9 = r28
            org.json.JSONArray r10 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x0596 }
            if (r10 == 0) goto L_0x0453
            int r13 = r10.length()     // Catch:{ Exception -> 0x0596 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x0596 }
            r28 = r9
            r14 = 0
        L_0x0441:
            int r9 = r10.length()     // Catch:{ Exception -> 0x0596 }
            if (r14 >= r9) goto L_0x0450
            int r9 = r10.optInt(r14)     // Catch:{ Exception -> 0x0596 }
            r13[r14] = r9     // Catch:{ Exception -> 0x0596 }
            int r14 = r14 + 1
            goto L_0x0441
        L_0x0450:
            r70 = r13
            goto L_0x0457
        L_0x0453:
            r28 = r9
            r70 = r29
        L_0x0457:
            java.lang.String r9 = "nonConnectivityEvents"
            org.json.JSONArray r7 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x0596 }
            if (r7 == 0) goto L_0x0478
            int r9 = r7.length()     // Catch:{ Exception -> 0x0596 }
            int[] r9 = new int[r9]     // Catch:{ Exception -> 0x0596 }
            r10 = 0
        L_0x0466:
            int r13 = r7.length()     // Catch:{ Exception -> 0x0596 }
            if (r10 >= r13) goto L_0x0475
            int r13 = r7.optInt(r10)     // Catch:{ Exception -> 0x0596 }
            r9[r10] = r13     // Catch:{ Exception -> 0x0596 }
            int r10 = r10 + 1
            goto L_0x0466
        L_0x0475:
            r71 = r9
            goto L_0x047a
        L_0x0478:
            r71 = r29
        L_0x047a:
            com.ironsource.mediationsdk.model.c r42 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x0596 }
            r60 = 0
            r59 = r42
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)     // Catch:{ Exception -> 0x0596 }
            if (r27 == 0) goto L_0x04f9
            java.lang.String r7 = "interstitial"
            r9 = r27
            org.json.JSONObject r7 = b(r9, r7)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "auctionData"
            java.lang.String r60 = r9.optString(r10, r11)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "auctioneerURL"
            java.lang.String r61 = r9.optString(r10, r11)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "extAuctioneerURL"
            java.lang.String r62 = r9.optString(r10, r11)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "auctionTrials"
            r13 = 2
            int r63 = r9.optInt(r10, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "auctionSavedHistory"
            r13 = 15
            int r64 = r9.optInt(r10, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "auctionTimeout"
            r13 = 10000(0x2710, double:4.9407E-320)
            long r65 = r9.optLong(r10, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "compressAuctionRequest"
            r13 = 0
            boolean r79 = r9.optBoolean(r10, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "compressAuctionResponse"
            boolean r80 = r9.optBoolean(r10, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "encryptionVersion"
            r14 = 1
            int r82 = r9.optInt(r10, r14)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "programmatic"
            boolean r67 = r7.optBoolean(r10, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "objectPerWaterfall"
            boolean r81 = r7.optBoolean(r10, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r7 = r7.optInt(r10, r13)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.utils.c r10 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0596 }
            long r13 = (long) r7     // Catch:{ Exception -> 0x0596 }
            r68 = r13
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 1
            r77 = 1
            r78 = 0
            r83 = 0
            r59 = r10
            r59.<init>(r60, r61, r62, r63, r64, r65, r67, r68, r70, r72, r74, r76, r77, r78, r79, r80, r81, r82, r83)     // Catch:{ Exception -> 0x0596 }
            r43 = r10
            goto L_0x0502
        L_0x04f9:
            r9 = r27
            com.ironsource.mediationsdk.utils.c r7 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0596 }
            r7.<init>()     // Catch:{ Exception -> 0x0596 }
            r43 = r7
        L_0x0502:
            com.ironsource.mediationsdk.model.i r7 = new com.ironsource.mediationsdk.model.i     // Catch:{ Exception -> 0x0596 }
            r38 = r7
            r38.<init>(r39, r40, r41, r42, r43, r44)     // Catch:{ Exception -> 0x0596 }
            if (r4 == 0) goto L_0x0573
            r10 = 0
        L_0x050c:
            int r13 = r4.length()     // Catch:{ Exception -> 0x0596 }
            if (r10 >= r13) goto L_0x0573
            org.json.JSONObject r13 = r4.optJSONObject(r10)     // Catch:{ Exception -> 0x0596 }
            if (r13 == 0) goto L_0x054b
            java.lang.String r14 = "placementId"
            r27 = r4
            r4 = -1
            int r14 = r13.optInt(r14, r4)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r4 = "placementName"
            java.lang.String r4 = r13.optString(r4, r11)     // Catch:{ Exception -> 0x0596 }
            r32 = r9
            java.lang.String r9 = "isDefault"
            r33 = r11
            r11 = 0
            boolean r9 = r13.optBoolean(r9, r11)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.model.l r11 = a(r13)     // Catch:{ Exception -> 0x0596 }
            if (r14 < 0) goto L_0x0551
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0596 }
            if (r13 != 0) goto L_0x0551
            com.ironsource.mediationsdk.model.InterstitialPlacement r13 = new com.ironsource.mediationsdk.model.InterstitialPlacement     // Catch:{ Exception -> 0x0596 }
            r13.<init>(r14, r4, r9, r11)     // Catch:{ Exception -> 0x0596 }
            if (r11 == 0) goto L_0x0553
            android.content.Context r4 = r6.by     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.utils.k.a((android.content.Context) r4, (com.ironsource.mediationsdk.model.InterstitialPlacement) r13)     // Catch:{ Exception -> 0x0596 }
            goto L_0x0553
        L_0x054b:
            r27 = r4
            r32 = r9
            r33 = r11
        L_0x0551:
            r13 = r29
        L_0x0553:
            if (r13 == 0) goto L_0x056a
            if (r13 == 0) goto L_0x056a
            java.util.ArrayList<com.ironsource.mediationsdk.model.InterstitialPlacement> r4 = r7.a     // Catch:{ Exception -> 0x0596 }
            r4.add(r13)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.model.InterstitialPlacement r4 = r7.j     // Catch:{ Exception -> 0x0596 }
            if (r4 != 0) goto L_0x0563
        L_0x0560:
            r7.j = r13     // Catch:{ Exception -> 0x0596 }
            goto L_0x056a
        L_0x0563:
            int r4 = r13.getPlacementId()     // Catch:{ Exception -> 0x0596 }
            if (r4 != 0) goto L_0x056a
            goto L_0x0560
        L_0x056a:
            int r10 = r10 + 1
            r4 = r27
            r9 = r32
            r11 = r33
            goto L_0x050c
        L_0x0573:
            r32 = r9
            r33 = r11
            java.lang.String r4 = "backFill"
            java.lang.String r4 = r1.optString(r4)     // Catch:{ Exception -> 0x0596 }
            boolean r9 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0596 }
            if (r9 != 0) goto L_0x0585
            r7.g = r4     // Catch:{ Exception -> 0x0596 }
        L_0x0585:
            java.lang.String r4 = "premium"
            java.lang.String r1 = r1.optString(r4)     // Catch:{ Exception -> 0x0596 }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0596 }
            if (r4 != 0) goto L_0x0593
            r7.h = r1     // Catch:{ Exception -> 0x0596 }
        L_0x0593:
            r38 = r7
            goto L_0x05a5
        L_0x0596:
            r0 = move-exception
            goto L_0x0afc
        L_0x0599:
            r21 = r10
            r2 = r32
            r5 = r33
            r33 = r11
            r32 = r27
            r38 = r29
        L_0x05a5:
            if (r26 == 0) goto L_0x07e3
            r1 = r26
            org.json.JSONArray r4 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0596 }
            org.json.JSONObject r7 = b(r1, r5)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r9 = "maxNumOfAdaptersToLoadOnStart"
            r10 = 1
            int r49 = a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r9 = "atim"
            boolean r10 = r1.has(r9)     // Catch:{ Exception -> 0x0596 }
            r13 = 0
            if (r10 == 0) goto L_0x05c7
            long r9 = r1.optLong(r9, r13)     // Catch:{ Exception -> 0x0596 }
            goto L_0x05d3
        L_0x05c7:
            boolean r10 = r3.has(r9)     // Catch:{ Exception -> 0x0596 }
            if (r10 == 0) goto L_0x05d2
            long r9 = r3.optLong(r9, r13)     // Catch:{ Exception -> 0x0596 }
            goto L_0x05d3
        L_0x05d2:
            r9 = r13
        L_0x05d3:
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x05da
            r50 = 10000(0x2710, double:4.9407E-320)
            goto L_0x05dc
        L_0x05da:
            r50 = r9
        L_0x05dc:
            java.lang.String r9 = "delayLoadFailure"
            r10 = 3
            int r55 = a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r9 = "bannerInterval"
            r10 = 60
            int r53 = a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r9 = "isOneFlow"
            boolean r10 = r1.has(r9)     // Catch:{ Exception -> 0x0596 }
            if (r10 == 0) goto L_0x05fb
            r10 = 0
            boolean r31 = r1.optBoolean(r9, r10)     // Catch:{ Exception -> 0x0596 }
        L_0x05f8:
            r56 = r31
            goto L_0x0609
        L_0x05fb:
            r10 = 0
            boolean r1 = r3.has(r9)     // Catch:{ Exception -> 0x0596 }
            if (r1 == 0) goto L_0x0607
            boolean r31 = r3.optBoolean(r9, r10)     // Catch:{ Exception -> 0x0596 }
            goto L_0x05f8
        L_0x0607:
            r56 = r10
        L_0x0609:
            org.json.JSONObject r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r8)     // Catch:{ Exception -> 0x0596 }
            boolean r61 = r1.optBoolean(r15, r10)     // Catch:{ Exception -> 0x0596 }
            boolean r62 = r1.optBoolean(r12, r10)     // Catch:{ Exception -> 0x0596 }
            r9 = r33
            r7 = r47
            java.lang.String r63 = r1.optString(r7, r9)     // Catch:{ Exception -> 0x0596 }
            r10 = r21
            java.lang.String r64 = r1.optString(r10, r9)     // Catch:{ Exception -> 0x0596 }
            r11 = r46
            r13 = -1
            int r65 = r1.optInt(r11, r13)     // Catch:{ Exception -> 0x0596 }
            r14 = r45
            int r66 = r1.optInt(r14, r13)     // Catch:{ Exception -> 0x0596 }
            r21 = r3
            r13 = r58
            r3 = 5000(0x1388, float:7.006E-42)
            int r67 = r1.optInt(r13, r3)     // Catch:{ Exception -> 0x0596 }
            r26 = r2
            r3 = r35
            org.json.JSONArray r2 = r1.optJSONArray(r3)     // Catch:{ Exception -> 0x0596 }
            if (r2 == 0) goto L_0x0663
            r35 = r3
            int r3 = r2.length()     // Catch:{ Exception -> 0x0596 }
            int[] r3 = new int[r3]     // Catch:{ Exception -> 0x0596 }
            r58 = r13
            r45 = r14
            r13 = 0
        L_0x0651:
            int r14 = r2.length()     // Catch:{ Exception -> 0x0596 }
            if (r13 >= r14) goto L_0x0660
            int r14 = r2.optInt(r13)     // Catch:{ Exception -> 0x0596 }
            r3[r13] = r14     // Catch:{ Exception -> 0x0596 }
            int r13 = r13 + 1
            goto L_0x0651
        L_0x0660:
            r68 = r3
            goto L_0x066b
        L_0x0663:
            r35 = r3
            r58 = r13
            r45 = r14
            r68 = r29
        L_0x066b:
            r2 = r30
            org.json.JSONArray r3 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0596 }
            if (r3 == 0) goto L_0x068e
            int r13 = r3.length()     // Catch:{ Exception -> 0x0596 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x0596 }
            r30 = r2
            r14 = 0
        L_0x067c:
            int r2 = r3.length()     // Catch:{ Exception -> 0x0596 }
            if (r14 >= r2) goto L_0x068b
            int r2 = r3.optInt(r14)     // Catch:{ Exception -> 0x0596 }
            r13[r14] = r2     // Catch:{ Exception -> 0x0596 }
            int r14 = r14 + 1
            goto L_0x067c
        L_0x068b:
            r69 = r13
            goto L_0x0692
        L_0x068e:
            r30 = r2
            r69 = r29
        L_0x0692:
            r2 = r28
            org.json.JSONArray r3 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0596 }
            if (r3 == 0) goto L_0x06b5
            int r13 = r3.length()     // Catch:{ Exception -> 0x0596 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x0596 }
            r28 = r2
            r14 = 0
        L_0x06a3:
            int r2 = r3.length()     // Catch:{ Exception -> 0x0596 }
            if (r14 >= r2) goto L_0x06b2
            int r2 = r3.optInt(r14)     // Catch:{ Exception -> 0x0596 }
            r13[r14] = r2     // Catch:{ Exception -> 0x0596 }
            int r14 = r14 + 1
            goto L_0x06a3
        L_0x06b2:
            r70 = r13
            goto L_0x06b9
        L_0x06b5:
            r28 = r2
            r70 = r29
        L_0x06b9:
            java.lang.String r2 = "nonConnectivityEvents"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0596 }
            if (r1 == 0) goto L_0x06da
            int r2 = r1.length()     // Catch:{ Exception -> 0x0596 }
            int[] r2 = new int[r2]     // Catch:{ Exception -> 0x0596 }
            r3 = 0
        L_0x06c8:
            int r13 = r1.length()     // Catch:{ Exception -> 0x0596 }
            if (r3 >= r13) goto L_0x06d7
            int r13 = r1.optInt(r3)     // Catch:{ Exception -> 0x0596 }
            r2[r3] = r13     // Catch:{ Exception -> 0x0596 }
            int r3 = r3 + 1
            goto L_0x06c8
        L_0x06d7:
            r71 = r2
            goto L_0x06dc
        L_0x06da:
            r71 = r29
        L_0x06dc:
            com.ironsource.mediationsdk.model.c r52 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x0596 }
            r60 = 0
            r59 = r52
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)     // Catch:{ Exception -> 0x0596 }
            if (r32 == 0) goto L_0x0762
            java.lang.String r1 = "banner"
            r2 = r32
            org.json.JSONObject r1 = b(r2, r1)     // Catch:{ Exception -> 0x0596 }
            if (r1 == 0) goto L_0x075c
            java.lang.String r3 = "auctionData"
            java.lang.String r60 = r2.optString(r3, r9)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r3 = "auctioneerURL"
            java.lang.String r61 = r2.optString(r3, r9)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r3 = "extAuctioneerURL"
            java.lang.String r62 = r2.optString(r3, r9)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r3 = "auctionTrials"
            r13 = 2
            int r63 = r2.optInt(r3, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r3 = "auctionSavedHistory"
            r13 = 15
            int r64 = r2.optInt(r3, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r3 = "auctionTimeout"
            r13 = 10000(0x2710, double:4.9407E-320)
            long r65 = r2.optLong(r3, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r3 = "compressAuctionRequest"
            r13 = 0
            boolean r79 = r2.optBoolean(r3, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r3 = "compressAuctionResponse"
            boolean r80 = r2.optBoolean(r3, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r3 = "encryptionVersion"
            r14 = 1
            int r82 = r2.optInt(r3, r14)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r3 = "programmatic"
            boolean r67 = r1.optBoolean(r3, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r3 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r3 = r1.optInt(r3, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r13 = "shouldSendBannerBURLFromImpression"
            r14 = 1
            boolean r83 = r1.optBoolean(r13, r14)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0596 }
            long r13 = (long) r3     // Catch:{ Exception -> 0x0596 }
            r68 = r13
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 1
            r77 = 1
            r78 = 0
            r81 = 0
            r59 = r1
            r59.<init>(r60, r61, r62, r63, r64, r65, r67, r68, r70, r72, r74, r76, r77, r78, r79, r80, r81, r82, r83)     // Catch:{ Exception -> 0x0596 }
            goto L_0x0769
        L_0x075c:
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0596 }
            r1.<init>()     // Catch:{ Exception -> 0x0596 }
            goto L_0x0769
        L_0x0762:
            r2 = r32
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0596 }
            r1.<init>()     // Catch:{ Exception -> 0x0596 }
        L_0x0769:
            r54 = r1
            com.ironsource.mediationsdk.model.f r1 = new com.ironsource.mediationsdk.model.f     // Catch:{ Exception -> 0x0596 }
            r48 = r1
            r48.<init>(r49, r50, r52, r53, r54, r55, r56)     // Catch:{ Exception -> 0x0596 }
            if (r4 == 0) goto L_0x07dc
            r3 = 0
        L_0x0775:
            int r13 = r4.length()     // Catch:{ Exception -> 0x0596 }
            if (r3 >= r13) goto L_0x07dc
            org.json.JSONObject r13 = r4.optJSONObject(r3)     // Catch:{ Exception -> 0x0596 }
            if (r13 == 0) goto L_0x07b4
            java.lang.String r14 = "placementId"
            r23 = r4
            r4 = -1
            int r14 = r13.optInt(r14, r4)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r4 = "placementName"
            java.lang.String r4 = r13.optString(r4, r9)     // Catch:{ Exception -> 0x0596 }
            r27 = r2
            java.lang.String r2 = "isDefault"
            r46 = r11
            r11 = 0
            boolean r2 = r13.optBoolean(r2, r11)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.model.l r11 = a(r13)     // Catch:{ Exception -> 0x0596 }
            if (r14 < 0) goto L_0x07ba
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0596 }
            if (r13 != 0) goto L_0x07ba
            com.ironsource.mediationsdk.model.g r13 = new com.ironsource.mediationsdk.model.g     // Catch:{ Exception -> 0x0596 }
            r13.<init>(r14, r4, r2, r11)     // Catch:{ Exception -> 0x0596 }
            if (r11 == 0) goto L_0x07bc
            android.content.Context r2 = r6.by     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.utils.k.a((android.content.Context) r2, (com.ironsource.mediationsdk.model.g) r13)     // Catch:{ Exception -> 0x0596 }
            goto L_0x07bc
        L_0x07b4:
            r27 = r2
            r23 = r4
            r46 = r11
        L_0x07ba:
            r13 = r29
        L_0x07bc:
            if (r13 == 0) goto L_0x07d3
            if (r13 == 0) goto L_0x07d3
            java.util.ArrayList<com.ironsource.mediationsdk.model.g> r2 = r1.c     // Catch:{ Exception -> 0x0596 }
            r2.add(r13)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.model.g r2 = r1.d     // Catch:{ Exception -> 0x0596 }
            if (r2 != 0) goto L_0x07cc
        L_0x07c9:
            r1.d = r13     // Catch:{ Exception -> 0x0596 }
            goto L_0x07d3
        L_0x07cc:
            int r2 = r13.getPlacementId()     // Catch:{ Exception -> 0x0596 }
            if (r2 != 0) goto L_0x07d3
            goto L_0x07c9
        L_0x07d3:
            int r3 = r3 + 1
            r4 = r23
            r2 = r27
            r11 = r46
            goto L_0x0775
        L_0x07dc:
            r27 = r2
            r46 = r11
            r40 = r1
            goto L_0x07f1
        L_0x07e3:
            r26 = r2
            r10 = r21
            r27 = r32
            r9 = r33
            r7 = r47
            r21 = r3
            r40 = r29
        L_0x07f1:
            if (r22 == 0) goto L_0x0913
            r1 = r22
            org.json.JSONObject r2 = b(r1, r5)     // Catch:{ Exception -> 0x0596 }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r2, r8)     // Catch:{ Exception -> 0x0596 }
            r3 = 0
            boolean r61 = r2.optBoolean(r15, r3)     // Catch:{ Exception -> 0x0596 }
            boolean r62 = r2.optBoolean(r12, r3)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r63 = r2.optString(r7, r9)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r64 = r2.optString(r10, r9)     // Catch:{ Exception -> 0x0596 }
            r3 = r46
            r4 = -1
            int r65 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x0596 }
            r3 = r45
            int r66 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x0596 }
            r3 = r58
            r4 = 5000(0x1388, float:7.006E-42)
            int r67 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x0596 }
            r3 = r35
            org.json.JSONArray r4 = r2.optJSONArray(r3)     // Catch:{ Exception -> 0x0596 }
            if (r4 == 0) goto L_0x0844
            int r7 = r4.length()     // Catch:{ Exception -> 0x0596 }
            int[] r7 = new int[r7]     // Catch:{ Exception -> 0x0596 }
            r10 = 0
        L_0x0832:
            int r11 = r4.length()     // Catch:{ Exception -> 0x0596 }
            if (r10 >= r11) goto L_0x0841
            int r11 = r4.optInt(r10)     // Catch:{ Exception -> 0x0596 }
            r7[r10] = r11     // Catch:{ Exception -> 0x0596 }
            int r10 = r10 + 1
            goto L_0x0832
        L_0x0841:
            r68 = r7
            goto L_0x0846
        L_0x0844:
            r68 = r29
        L_0x0846:
            r4 = r30
            org.json.JSONArray r7 = r2.optJSONArray(r4)     // Catch:{ Exception -> 0x0596 }
            if (r7 == 0) goto L_0x0867
            int r10 = r7.length()     // Catch:{ Exception -> 0x0596 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0596 }
            r11 = 0
        L_0x0855:
            int r13 = r7.length()     // Catch:{ Exception -> 0x0596 }
            if (r11 >= r13) goto L_0x0864
            int r13 = r7.optInt(r11)     // Catch:{ Exception -> 0x0596 }
            r10[r11] = r13     // Catch:{ Exception -> 0x0596 }
            int r11 = r11 + 1
            goto L_0x0855
        L_0x0864:
            r69 = r10
            goto L_0x0869
        L_0x0867:
            r69 = r29
        L_0x0869:
            r7 = r28
            org.json.JSONArray r7 = r2.optJSONArray(r7)     // Catch:{ Exception -> 0x0596 }
            if (r7 == 0) goto L_0x088a
            int r10 = r7.length()     // Catch:{ Exception -> 0x0596 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0596 }
            r11 = 0
        L_0x0878:
            int r13 = r7.length()     // Catch:{ Exception -> 0x0596 }
            if (r11 >= r13) goto L_0x0887
            int r13 = r7.optInt(r11)     // Catch:{ Exception -> 0x0596 }
            r10[r11] = r13     // Catch:{ Exception -> 0x0596 }
            int r11 = r11 + 1
            goto L_0x0878
        L_0x0887:
            r70 = r10
            goto L_0x088c
        L_0x088a:
            r70 = r29
        L_0x088c:
            java.lang.String r7 = "nonConnectivityEvents"
            org.json.JSONArray r2 = r2.optJSONArray(r7)     // Catch:{ Exception -> 0x0596 }
            if (r2 == 0) goto L_0x08ad
            int r7 = r2.length()     // Catch:{ Exception -> 0x0596 }
            int[] r7 = new int[r7]     // Catch:{ Exception -> 0x0596 }
            r10 = 0
        L_0x089b:
            int r11 = r2.length()     // Catch:{ Exception -> 0x0596 }
            if (r10 >= r11) goto L_0x08aa
            int r11 = r2.optInt(r10)     // Catch:{ Exception -> 0x0596 }
            r7[r10] = r11     // Catch:{ Exception -> 0x0596 }
            int r10 = r10 + 1
            goto L_0x089b
        L_0x08aa:
            r71 = r7
            goto L_0x08af
        L_0x08ad:
            r71 = r29
        L_0x08af:
            com.ironsource.mediationsdk.model.c r2 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x0596 }
            r60 = 0
            r59 = r2
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.model.j r7 = new com.ironsource.mediationsdk.model.j     // Catch:{ Exception -> 0x0596 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0596 }
            r7.d = r1     // Catch:{ Exception -> 0x0596 }
            r2 = r26
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0596 }
            if (r1 == 0) goto L_0x0910
            r2 = 0
        L_0x08c8:
            int r10 = r1.length()     // Catch:{ Exception -> 0x0596 }
            if (r2 >= r10) goto L_0x0910
            org.json.JSONObject r10 = r1.optJSONObject(r2)     // Catch:{ Exception -> 0x0596 }
            if (r10 == 0) goto L_0x08f6
            java.lang.String r11 = "placementId"
            r13 = -1
            int r11 = r10.optInt(r11, r13)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r14 = "placementName"
            java.lang.String r14 = r10.optString(r14, r9)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r15 = "isDefault"
            r13 = 0
            boolean r10 = r10.optBoolean(r15, r13)     // Catch:{ Exception -> 0x0596 }
            if (r11 < 0) goto L_0x08f6
            boolean r13 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x0596 }
            if (r13 != 0) goto L_0x08f6
            com.ironsource.mediationsdk.model.k r13 = new com.ironsource.mediationsdk.model.k     // Catch:{ Exception -> 0x0596 }
            r13.<init>(r11, r14, r10)     // Catch:{ Exception -> 0x0596 }
            goto L_0x08f8
        L_0x08f6:
            r13 = r29
        L_0x08f8:
            if (r13 == 0) goto L_0x090d
            if (r13 == 0) goto L_0x090d
            java.util.ArrayList<com.ironsource.mediationsdk.model.k> r10 = r7.a     // Catch:{ Exception -> 0x0596 }
            r10.add(r13)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.model.k r10 = r7.b     // Catch:{ Exception -> 0x0596 }
            if (r10 != 0) goto L_0x0908
        L_0x0905:
            r7.b = r13     // Catch:{ Exception -> 0x0596 }
            goto L_0x090d
        L_0x0908:
            int r10 = r13.a     // Catch:{ Exception -> 0x0596 }
            if (r10 != 0) goto L_0x090d
            goto L_0x0905
        L_0x090d:
            int r2 = r2 + 1
            goto L_0x08c8
        L_0x0910:
            r39 = r7
            goto L_0x0919
        L_0x0913:
            r4 = r30
            r3 = r35
            r39 = r29
        L_0x0919:
            com.ironsource.mediationsdk.utils.p r1 = new com.ironsource.mediationsdk.utils.p     // Catch:{ Exception -> 0x0596 }
            r1.<init>()     // Catch:{ Exception -> 0x0596 }
            if (r25 == 0) goto L_0x095f
            java.lang.String r2 = "optInKeys"
            r7 = r25
            org.json.JSONArray r2 = r7.optJSONArray(r2)     // Catch:{ Exception -> 0x0596 }
            if (r2 == 0) goto L_0x0943
            r10 = 0
        L_0x092b:
            int r11 = r2.length()     // Catch:{ Exception -> 0x0596 }
            if (r10 >= r11) goto L_0x0943
            java.lang.String r11 = r2.optString(r10)     // Catch:{ Exception -> 0x0596 }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0596 }
            if (r13 != 0) goto L_0x0940
            java.util.ArrayList<java.lang.String> r13 = r1.a     // Catch:{ Exception -> 0x0596 }
            r13.add(r11)     // Catch:{ Exception -> 0x0596 }
        L_0x0940:
            int r10 = r10 + 1
            goto L_0x092b
        L_0x0943:
            java.lang.String r2 = "tokenGenericParams"
            org.json.JSONObject r2 = r7.optJSONObject(r2)     // Catch:{ Exception -> 0x0596 }
            if (r2 == 0) goto L_0x094d
            r1.c = r2     // Catch:{ Exception -> 0x0596 }
        L_0x094d:
            java.lang.String r2 = "oneToken"
            r10 = 0
            boolean r2 = r7.optBoolean(r2, r10)     // Catch:{ Exception -> 0x0596 }
            r1.d = r2     // Catch:{ Exception -> 0x0596 }
            java.lang.String r2 = "compressToken"
            r10 = 1
            boolean r2 = r7.optBoolean(r2, r10)     // Catch:{ Exception -> 0x0596 }
            r1.e = r2     // Catch:{ Exception -> 0x0596 }
        L_0x095f:
            com.ironsource.mediationsdk.utils.j r2 = new com.ironsource.mediationsdk.utils.j     // Catch:{ Exception -> 0x0596 }
            r2.<init>()     // Catch:{ Exception -> 0x0596 }
            if (r24 == 0) goto L_0x097b
            java.lang.String r7 = "pixelEventsUrl"
            java.lang.String r10 = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3"
            r11 = r24
            java.lang.String r7 = r11.optString(r7, r10)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "pixelEventsEnabled"
            r13 = 1
            boolean r14 = r11.optBoolean(r10, r13)     // Catch:{ Exception -> 0x0596 }
            r2.a((java.lang.String) r7)     // Catch:{ Exception -> 0x0596 }
            goto L_0x097c
        L_0x097b:
            r14 = 1
        L_0x097c:
            r2.a((boolean) r14)     // Catch:{ Exception -> 0x0596 }
            if (r14 == 0) goto L_0x0997
            int[] r3 = a(r8, r3)     // Catch:{ Exception -> 0x0596 }
            r2.a((int[]) r3)     // Catch:{ Exception -> 0x0596 }
            int[] r3 = a(r8, r4)     // Catch:{ Exception -> 0x0596 }
            r2.b((int[]) r3)     // Catch:{ Exception -> 0x0596 }
            r3 = 0
            boolean r4 = r8.optBoolean(r12, r3)     // Catch:{ Exception -> 0x0596 }
            r2.b((boolean) r4)     // Catch:{ Exception -> 0x0596 }
        L_0x0997:
            java.lang.String r3 = "server"
            r4 = r20
            r7 = 3
            int r3 = r4.optInt(r3, r7)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r10 = "publisher"
            int r10 = r4.optInt(r10, r7)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r11 = "console"
            int r4 = r4.optInt(r11, r7)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.model.e r7 = new com.ironsource.mediationsdk.model.e     // Catch:{ Exception -> 0x0596 }
            r7.<init>(r3, r10, r4)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.sdk.g.d r3 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x0596 }
            r3.<init>()     // Catch:{ Exception -> 0x0596 }
            if (r19 == 0) goto L_0x0a0e
            java.lang.String r4 = "enabled"
            r10 = r19
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x0596 }
            r3.a((boolean) r4)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r4 = "reporterURL"
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x0596 }
            r3.b((java.lang.String) r4)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r4 = "reporterKeyword"
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x0596 }
            r3.c((java.lang.String) r4)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r4 = "includeANR"
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x0596 }
            r3.b((boolean) r4)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r4 = "timeout"
            r11 = 5000(0x1388, float:7.006E-42)
            int r4 = r10.optInt(r4, r11)     // Catch:{ Exception -> 0x0596 }
            r3.a((int) r4)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r4 = "setIgnoreDebugger"
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x0596 }
            r3.c((boolean) r4)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r4 = "keysToInclude"
            org.json.JSONArray r4 = r10.optJSONArray(r4)     // Catch:{ Exception -> 0x0596 }
            if (r4 == 0) goto L_0x0a0e
            r10 = 0
        L_0x09fe:
            int r11 = r4.length()     // Catch:{ Exception -> 0x0596 }
            if (r10 >= r11) goto L_0x0a0e
            java.lang.String r11 = r4.optString(r10)     // Catch:{ Exception -> 0x0596 }
            r3.a((java.lang.String) r11)     // Catch:{ Exception -> 0x0596 }
            int r10 = r10 + 1
            goto L_0x09fe
        L_0x0a0e:
            if (r18 == 0) goto L_0x0a2e
            java.lang.String r4 = "name"
            r10 = r18
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r9 = "id"
            java.lang.String r11 = "-1"
            java.lang.String r9 = r10.optString(r9, r11)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r11 = "custom"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.model.q r11 = new com.ironsource.mediationsdk.model.q     // Catch:{ Exception -> 0x0596 }
            r11.<init>(r4, r9, r10)     // Catch:{ Exception -> 0x0596 }
            r43 = r11
            goto L_0x0a30
        L_0x0a2e:
            r43 = r29
        L_0x0a30:
            com.ironsource.mediationsdk.utils.b r4 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0596 }
            r4.<init>()     // Catch:{ Exception -> 0x0596 }
            if (r17 == 0) goto L_0x0a5d
            java.lang.String r4 = "isExternalArmEventsEnabled"
            r9 = r17
            r10 = 1
            boolean r4 = r9.optBoolean(r4, r10)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r11 = "externalArmEventsUrl"
            java.lang.String r12 = "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData"
            java.lang.String r11 = r9.optString(r11, r12)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r12 = "sid"
            boolean r10 = r9.optBoolean(r12, r10)     // Catch:{ Exception -> 0x0596 }
            java.lang.String r12 = "radvid"
            r13 = 0
            boolean r9 = r9.optBoolean(r12, r13)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.utils.b r12 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0596 }
            r12.<init>(r4, r11, r10, r9)     // Catch:{ Exception -> 0x0596 }
            r47 = r12
            goto L_0x0a5f
        L_0x0a5d:
            r47 = r4
        L_0x0a5f:
            com.ironsource.mediationsdk.model.d r4 = new com.ironsource.mediationsdk.model.d     // Catch:{ Exception -> 0x0596 }
            r4.<init>()     // Catch:{ Exception -> 0x0596 }
            if (r16 == 0) goto L_0x0a84
            java.lang.String r4 = "mediationTypes"
            r9 = r16
            org.json.JSONObject r4 = r9.optJSONObject(r4)     // Catch:{ Exception -> 0x0596 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ Exception -> 0x0596 }
            r10.<init>()     // Catch:{ Exception -> 0x0596 }
            if (r4 == 0) goto L_0x0a79
            java.util.Map r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r4)     // Catch:{ Exception -> 0x0596 }
        L_0x0a79:
            java.lang.String r4 = "compressExternalToken"
            r11 = 0
            r9.optBoolean(r4, r11)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.model.d r4 = new com.ironsource.mediationsdk.model.d     // Catch:{ Exception -> 0x0596 }
            r4.<init>(r10)     // Catch:{ Exception -> 0x0596 }
        L_0x0a84:
            r48 = r4
            com.ironsource.mediationsdk.model.b r4 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x0596 }
            r4.<init>()     // Catch:{ Exception -> 0x0596 }
            if (r27 == 0) goto L_0x0a9d
            java.lang.String r4 = "auctionData"
            r9 = r27
            java.lang.String r4 = r9.optString(r4)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.model.b r9 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x0596 }
            r9.<init>(r4)     // Catch:{ Exception -> 0x0596 }
            r50 = r9
            goto L_0x0a9f
        L_0x0a9d:
            r50 = r4
        L_0x0a9f:
            java.lang.String r4 = "integration"
            r9 = r21
            r10 = 0
            boolean r45 = r9.optBoolean(r4, r10)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.sdk.controller.u r4 = new com.ironsource.sdk.controller.u     // Catch:{ Exception -> 0x0596 }
            r41 = r4
            r42 = r7
            r44 = r1
            r46 = r3
            r49 = r2
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.model.h r1 = new com.ironsource.mediationsdk.model.h     // Catch:{ Exception -> 0x0596 }
            r36 = r1
            r41 = r4
            r36.<init>(r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x0596 }
            r6.c = r1     // Catch:{ Exception -> 0x0596 }
            java.lang.String r1 = "genericParams"
            org.json.JSONObject r1 = b(r8, r1)     // Catch:{ Exception -> 0x0596 }
            if (r1 == 0) goto L_0x0ae5
            org.json.JSONObject r2 = b(r1, r5)     // Catch:{ Exception -> 0x0596 }
            if (r2 == 0) goto L_0x0ae5
            r1.remove(r5)     // Catch:{ Exception -> 0x0596 }
            java.util.Map r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r2)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.a.h r3 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ Exception -> 0x0596 }
            r3.b((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ Exception -> 0x0596 }
            r3.b((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x0596 }
        L_0x0ae5:
            if (r1 == 0) goto L_0x0af9
            java.util.Map r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r1)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.a.h r2 = com.ironsource.mediationsdk.a.h.d()     // Catch:{ Exception -> 0x0596 }
            r2.a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x0596 }
            com.ironsource.mediationsdk.a.d r2 = com.ironsource.mediationsdk.a.d.d()     // Catch:{ Exception -> 0x0596 }
            r2.a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x0596 }
        L_0x0af9:
            return
        L_0x0afa:
            r0 = move-exception
            r6 = r1
        L_0x0afc:
            r1 = r0
            r1.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.l.i():void");
    }

    public final G a() {
        return new G(this.bw, this.bx);
    }

    public final boolean b() {
        JSONObject jSONObject = this.d;
        return (((((jSONObject != null) && !jSONObject.has(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) && this.a != null) && this.b != null) && this.c != null) && f();
    }

    public final String c() {
        try {
            return this.a.b;
        } catch (Exception e2) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVBackFillProvider", e2);
            return null;
        }
    }

    public final String d() {
        try {
            return this.a.c;
        } catch (Exception e2) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVPremiumProvider", e2);
            return null;
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.bw);
            jSONObject.put(DataKeys.USER_ID, this.bx);
            jSONObject.put("response", this.d);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }
}
