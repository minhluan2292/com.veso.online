package com.ironsource.mediationsdk.integration;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.util.Log;
import android.util.Pair;
import com.ironsource.mediationsdk.IntegrationData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegrationHelper {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e2 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.app.Activity r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "IntegrationHelper"
            r1 = 0
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015a }
            java.lang.String r2 = r9.toLowerCase(r2)     // Catch:{ Exception -> 0x015a }
            r3 = -1
            int r4 = r2.hashCode()     // Catch:{ Exception -> 0x015a }
            r5 = -1875652737(0xffffffff9033cf7f, float:-3.5461375E-29)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L_0x0034
            r5 = 92668925(0x58603fd, float:1.2602765E-35)
            if (r4 == r5) goto L_0x002a
            r5 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r4 == r5) goto L_0x0020
            goto L_0x003d
        L_0x0020:
            java.lang.String r4 = "facebook"
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x015a }
            if (r2 == 0) goto L_0x003d
            r3 = r7
            goto L_0x003d
        L_0x002a:
            java.lang.String r4 = "admob"
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x015a }
            if (r2 == 0) goto L_0x003d
            r3 = r6
            goto L_0x003d
        L_0x0034:
            java.lang.String r4 = "supersonicads"
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x015a }
            if (r2 == 0) goto L_0x003d
            r3 = r1
        L_0x003d:
            if (r3 == 0) goto L_0x0060
            if (r3 == r7) goto L_0x005d
            if (r3 == r6) goto L_0x005a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015a }
            java.lang.String r3 = "--------------- "
            r2.<init>(r3)     // Catch:{ Exception -> 0x015a }
            r2.append(r9)     // Catch:{ Exception -> 0x015a }
            java.lang.String r3 = " --------------"
            r2.append(r3)     // Catch:{ Exception -> 0x015a }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x015a }
        L_0x0056:
            android.util.Log.i(r0, r2)     // Catch:{ Exception -> 0x015a }
            goto L_0x0063
        L_0x005a:
            java.lang.String r2 = "--------------- Google (AdMob and Ad Manager) --------------"
            goto L_0x0056
        L_0x005d:
            java.lang.String r2 = "--------------- Meta --------------"
            goto L_0x0056
        L_0x0060:
            java.lang.String r2 = "--------------- IronSource --------------"
            goto L_0x0056
        L_0x0063:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015a }
            java.lang.String r3 = "com.ironsource.adapters."
            r2.<init>(r3)     // Catch:{ Exception -> 0x015a }
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015a }
            java.lang.String r3 = r9.toLowerCase(r3)     // Catch:{ Exception -> 0x015a }
            r2.append(r3)     // Catch:{ Exception -> 0x015a }
            java.lang.String r3 = "."
            r2.append(r3)     // Catch:{ Exception -> 0x015a }
            r2.append(r9)     // Catch:{ Exception -> 0x015a }
            java.lang.String r3 = "Adapter"
            r2.append(r3)     // Catch:{ Exception -> 0x015a }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x015a }
            com.ironsource.mediationsdk.IntegrationData r3 = b((android.app.Activity) r8, (java.lang.String) r2)     // Catch:{ Exception -> 0x015a }
            if (r3 != 0) goto L_0x008b
            return r1
        L_0x008b:
            java.lang.String r4 = "SupersonicAds"
            boolean r4 = r9.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x015a }
            if (r4 != 0) goto L_0x00e3
            java.lang.String r4 = r3.version     // Catch:{ Exception -> 0x015a }
            java.lang.String r5 = "4.1"
            boolean r4 = r4.startsWith(r5)     // Catch:{ Exception -> 0x015a }
            if (r4 != 0) goto L_0x00db
            java.lang.String r4 = r3.version     // Catch:{ Exception -> 0x015a }
            java.lang.String r5 = "4.3"
            boolean r4 = r4.startsWith(r5)     // Catch:{ Exception -> 0x015a }
            if (r4 == 0) goto L_0x00a8
            goto L_0x00db
        L_0x00a8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015a }
            r4.<init>()     // Catch:{ Exception -> 0x015a }
            java.lang.String r5 = r3.name     // Catch:{ Exception -> 0x015a }
            r4.append(r5)     // Catch:{ Exception -> 0x015a }
            java.lang.String r5 = " adapter "
            r4.append(r5)     // Catch:{ Exception -> 0x015a }
            java.lang.String r5 = r3.version     // Catch:{ Exception -> 0x015a }
            r4.append(r5)     // Catch:{ Exception -> 0x015a }
            java.lang.String r5 = " is incompatible with SDK version "
            r4.append(r5)     // Catch:{ Exception -> 0x015a }
            java.lang.String r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()     // Catch:{ Exception -> 0x015a }
            r4.append(r5)     // Catch:{ Exception -> 0x015a }
            java.lang.String r5 = ", please update your adapter to version 4.1"
            r4.append(r5)     // Catch:{ Exception -> 0x015a }
            java.lang.String r5 = ".*"
            r4.append(r5)     // Catch:{ Exception -> 0x015a }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x015a }
            android.util.Log.e(r0, r4)     // Catch:{ Exception -> 0x015a }
            r7 = r1
            goto L_0x00e0
        L_0x00db:
            java.lang.String r4 = "Adapter - VERIFIED"
            android.util.Log.i(r0, r4)     // Catch:{ Exception -> 0x015a }
        L_0x00e0:
            if (r7 != 0) goto L_0x00e3
            return r1
        L_0x00e3:
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x010a }
            java.lang.String r4 = "getAdapterSDKVersion"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x010a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ Exception -> 0x010a }
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x010a }
            java.lang.Object r2 = r2.invoke(r4, r5)     // Catch:{ Exception -> 0x010a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x010a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010a }
            java.lang.String r5 = "SDK Version - "
            r4.<init>(r5)     // Catch:{ Exception -> 0x010a }
            r4.append(r2)     // Catch:{ Exception -> 0x010a }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x010a }
            android.util.Log.i(r0, r2)     // Catch:{ Exception -> 0x010a }
            goto L_0x0111
        L_0x010a:
            java.lang.String r2 = "validateSDKVersion"
            java.lang.String r4 = "Unable to get SDK version"
            android.util.Log.w(r2, r4)     // Catch:{ Exception -> 0x015a }
        L_0x0111:
            java.lang.String[] r2 = r3.activities     // Catch:{ Exception -> 0x015a }
            boolean r2 = b((android.app.Activity) r8, (java.lang.String[]) r2)     // Catch:{ Exception -> 0x015a }
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r4 = r3.externalLibs     // Catch:{ Exception -> 0x015a }
            boolean r4 = a(r4)     // Catch:{ Exception -> 0x015a }
            if (r4 != 0) goto L_0x0120
            r2 = r1
        L_0x0120:
            java.lang.String[] r4 = r3.services     // Catch:{ Exception -> 0x015a }
            boolean r4 = a((android.app.Activity) r8, (java.lang.String[]) r4)     // Catch:{ Exception -> 0x015a }
            if (r4 != 0) goto L_0x0129
            r2 = r1
        L_0x0129:
            java.lang.String[] r4 = r3.providers     // Catch:{ Exception -> 0x015a }
            boolean r4 = a((android.content.Context) r8, (java.lang.String[]) r4)     // Catch:{ Exception -> 0x015a }
            if (r4 != 0) goto L_0x0132
            r2 = r1
        L_0x0132:
            boolean r3 = r3.validateWriteExternalStorage     // Catch:{ Exception -> 0x015a }
            if (r3 == 0) goto L_0x0158
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x015a }
            r4 = 18
            if (r3 > r4) goto L_0x0158
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch:{ Exception -> 0x015a }
            java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r8 = r8.getPackageName()     // Catch:{ Exception -> 0x015a }
            int r8 = r3.checkPermission(r4, r8)     // Catch:{ Exception -> 0x015a }
            if (r8 != 0) goto L_0x0152
            java.lang.String r8 = "android.permission.WRITE_EXTERNAL_STORAGE - VERIFIED"
            android.util.Log.i(r0, r8)     // Catch:{ Exception -> 0x015a }
            goto L_0x0158
        L_0x0152:
            java.lang.String r8 = "android.permission.WRITE_EXTERNAL_STORAGE - MISSING"
            android.util.Log.e(r0, r8)     // Catch:{ Exception -> 0x015a }
            goto L_0x0159
        L_0x0158:
            r1 = r2
        L_0x0159:
            return r1
        L_0x015a:
            r8 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "isAdapterValid "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            android.util.Log.e(r0, r9, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.a(android.app.Activity, java.lang.String):boolean");
    }

    private static boolean a(Activity activity, String[] strArr) {
        boolean z = true;
        if (strArr == null) {
            return true;
        }
        PackageManager packageManager = activity.getPackageManager();
        Log.i("IntegrationHelper", "*** Services ***");
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                if (packageManager.queryIntentServices(new Intent(activity, Class.forName(str)), 65536).size() > 0) {
                    Log.i("IntegrationHelper", str + " - VERIFIED");
                    i++;
                } else {
                    Log.e("IntegrationHelper", str + " - MISSING");
                    z = false;
                    i++;
                }
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
        }
        return z;
    }

    private static boolean a(Context context, String[] strArr) {
        String str;
        boolean z;
        List<PackageInfo> installedPackages;
        ArrayList arrayList = new ArrayList();
        if (!(context == null || (installedPackages = context.getPackageManager().getInstalledPackages(8)) == null)) {
            for (PackageInfo packageInfo : installedPackages) {
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        arrayList.add(providerInfo.name);
                    }
                }
            }
        }
        boolean z2 = true;
        if (strArr != null) {
            Log.i("IntegrationHelper", "*** Content Providers ***");
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                if (!arrayList.contains(str2)) {
                    str = "- MISSING";
                    z = false;
                } else {
                    z = z2;
                    str = "- VERIFIED";
                }
                Log.d("IntegrationHelper", str2 + str);
                i++;
                z2 = z;
            }
        }
        return z2;
    }

    private static boolean a(ArrayList<Pair<String, String>> arrayList) {
        boolean z = true;
        if (arrayList == null) {
            return true;
        }
        Log.i("IntegrationHelper", "*** External Libraries ***");
        Iterator<Pair<String, String>> it = arrayList.iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            try {
                Class.forName((String) next.first);
                Log.i("IntegrationHelper", ((String) next.second) + " - VERIFIED");
            } catch (ClassNotFoundException unused) {
                z = false;
                Log.e("IntegrationHelper", ((String) next.second) + " - MISSING");
            }
        }
        return z;
    }

    private static IntegrationData b(Activity activity, String str) {
        String str2;
        try {
            IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", new Class[]{Activity.class}).invoke((Object) null, new Object[]{activity});
            Log.i("IntegrationHelper", "Adapter " + integrationData.version + " - VERIFIED");
            return integrationData;
        } catch (ClassNotFoundException unused) {
            str2 = "Adapter - MISSING";
            Log.e("IntegrationHelper", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "Adapter version - NOT VERIFIED";
            Log.e("IntegrationHelper", str2);
            return null;
        }
    }

    private static boolean b(Activity activity, String[] strArr) {
        boolean z = true;
        if (strArr == null) {
            return true;
        }
        Log.i("IntegrationHelper", "*** Activities ***");
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                if (activity.getPackageManager().queryIntentActivities(new Intent(activity, Class.forName(str)), 65536).size() > 0) {
                    Log.i("IntegrationHelper", str + " - VERIFIED");
                    i++;
                } else {
                    Log.e("IntegrationHelper", str + " - MISSING");
                    z = false;
                    i++;
                }
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
        }
        return z;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009b, code lost:
        if (r6.equals("facebook") == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e3, code lost:
        if (r6.equals("facebook") == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0117, code lost:
        android.util.Log.e("IntegrationHelper", r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void validateIntegration(android.app.Activity r23) {
        /*
            r0 = r23
            java.lang.String r1 = "IntegrationHelper"
            java.lang.String r2 = "Verifying Integration:"
            android.util.Log.i(r1, r2)
            java.lang.String r2 = "*** Permissions ***"
            android.util.Log.i(r1, r2)
            android.content.pm.PackageManager r2 = r23.getPackageManager()
            java.lang.String r3 = r23.getPackageName()
            java.lang.String r4 = "android.permission.INTERNET"
            int r3 = r2.checkPermission(r4, r3)
            if (r3 != 0) goto L_0x0024
            java.lang.String r3 = "android.permission.INTERNET - VERIFIED"
            android.util.Log.i(r1, r3)
            goto L_0x0029
        L_0x0024:
            java.lang.String r3 = "android.permission.INTERNET - MISSING"
            android.util.Log.e(r1, r3)
        L_0x0029:
            java.lang.String r3 = r23.getPackageName()
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            int r2 = r2.checkPermission(r4, r3)
            if (r2 != 0) goto L_0x003b
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE - VERIFIED"
            android.util.Log.i(r1, r2)
            goto L_0x0040
        L_0x003b:
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE - MISSING"
            android.util.Log.e(r1, r2)
        L_0x0040:
            java.lang.String r3 = "AdColony"
            java.lang.String r4 = "AppLovin"
            java.lang.String r5 = "Chartboost"
            java.lang.String r6 = "Fyber"
            java.lang.String r7 = "AdMob"
            java.lang.String r8 = "HyprMX"
            java.lang.String r9 = "InMobi"
            java.lang.String r10 = "SupersonicAds"
            java.lang.String r11 = "Liftoff"
            java.lang.String r12 = "Maio"
            java.lang.String r13 = "Facebook"
            java.lang.String r14 = "Mintegral"
            java.lang.String r15 = "MyTarget"
            java.lang.String r16 = "Pangle"
            java.lang.String r17 = "Smaato"
            java.lang.String r18 = "SuperAwesome"
            java.lang.String r19 = "Tapjoy"
            java.lang.String r20 = "UnityAds"
            java.lang.String r21 = "Vungle"
            java.lang.String r22 = "Yahoo"
            java.lang.String[] r2 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}
            r3 = 0
            r4 = r3
        L_0x006e:
            r5 = 20
            if (r4 >= r5) goto L_0x011e
            r5 = r2[r4]
            boolean r6 = a((android.app.Activity) r0, (java.lang.String) r5)
            java.lang.String r7 = ">>>> "
            r8 = 2
            java.lang.String r9 = "facebook"
            java.lang.String r10 = "admob"
            java.lang.String r11 = "supersonicads"
            r12 = -1
            r13 = 1
            if (r6 == 0) goto L_0x00cd
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r6 = r5.toLowerCase(r6)
            r6.hashCode()
            int r14 = r6.hashCode()
            switch(r14) {
                case -1875652737: goto L_0x00a7;
                case 92668925: goto L_0x009e;
                case 497130182: goto L_0x0097;
                default: goto L_0x0095;
            }
        L_0x0095:
            r8 = r12
            goto L_0x00af
        L_0x0097:
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x00af
            goto L_0x0095
        L_0x009e:
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x00a5
            goto L_0x0095
        L_0x00a5:
            r8 = r13
            goto L_0x00af
        L_0x00a7:
            boolean r6 = r6.equals(r11)
            if (r6 != 0) goto L_0x00ae
            goto L_0x0095
        L_0x00ae:
            r8 = r3
        L_0x00af:
            switch(r8) {
                case 0: goto L_0x00ca;
                case 1: goto L_0x00c7;
                case 2: goto L_0x00c4;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = " - VERIFIED"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x010e
        L_0x00c4:
            java.lang.String r5 = ">>>> Meta - VERIFIED"
            goto L_0x010e
        L_0x00c7:
            java.lang.String r5 = ">>>> Google (AdMob and Ad Manager) - VERIFIED"
            goto L_0x010e
        L_0x00ca:
            java.lang.String r5 = ">>>> IronSource - VERIFIED"
            goto L_0x010e
        L_0x00cd:
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r6 = r5.toLowerCase(r6)
            r6.hashCode()
            int r14 = r6.hashCode()
            switch(r14) {
                case -1875652737: goto L_0x00ef;
                case 92668925: goto L_0x00e6;
                case 497130182: goto L_0x00df;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            r8 = r12
            goto L_0x00f7
        L_0x00df:
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x00f7
            goto L_0x00dd
        L_0x00e6:
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x00ed
            goto L_0x00dd
        L_0x00ed:
            r8 = r13
            goto L_0x00f7
        L_0x00ef:
            boolean r6 = r6.equals(r11)
            if (r6 != 0) goto L_0x00f6
            goto L_0x00dd
        L_0x00f6:
            r8 = r3
        L_0x00f7:
            switch(r8) {
                case 0: goto L_0x0115;
                case 1: goto L_0x0112;
                case 2: goto L_0x010c;
                default: goto L_0x00fa;
            }
        L_0x00fa:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = " - NOT VERIFIED"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x0117
        L_0x010c:
            java.lang.String r5 = ">>>> Meta - NOT VERIFIED"
        L_0x010e:
            android.util.Log.i(r1, r5)
            goto L_0x011a
        L_0x0112:
            java.lang.String r5 = ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED"
            goto L_0x010e
        L_0x0115:
            java.lang.String r5 = ">>>> IronSource - NOT VERIFIED"
        L_0x0117:
            android.util.Log.e(r1, r5)
        L_0x011a:
            int r4 = r4 + 1
            goto L_0x006e
        L_0x011e:
            com.ironsource.mediationsdk.integration.IntegrationHelper$1 r1 = new com.ironsource.mediationsdk.integration.IntegrationHelper$1
            r1.<init>(r0)
            r1.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(android.app.Activity):void");
    }
}
