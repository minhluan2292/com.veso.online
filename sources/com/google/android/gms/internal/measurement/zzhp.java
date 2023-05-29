package com.google.android.gms.internal.measurement;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
public final /* synthetic */ class zzhp implements zzif {
    public final /* synthetic */ Context zza;

    public /* synthetic */ zzhp(Context context) {
        this.zza = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:61|62) */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0149 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza() {
        /*
            r14 = this;
            java.lang.String r0 = "HermeticFileOverrides"
            android.content.Context r1 = r14.zza
            int r2 = com.google.android.gms.internal.measurement.zzhy.zzc
            java.lang.String r2 = android.os.Build.TYPE
            java.lang.String r3 = android.os.Build.TAGS
            java.lang.String r4 = "eng"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x001b
            java.lang.String r4 = "userdebug"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            java.lang.String r2 = "dev-keys"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x0032
            java.lang.String r2 = "test-keys"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            com.google.android.gms.internal.measurement.zzid r0 = com.google.android.gms.internal.measurement.zzid.zzc()
            goto L_0x0158
        L_0x0032:
            boolean r2 = com.google.android.gms.internal.measurement.zzha.zza()
            if (r2 == 0) goto L_0x0042
            boolean r2 = r1.isDeviceProtectedStorage()
            if (r2 != 0) goto L_0x0042
            android.content.Context r1 = r1.createDeviceProtectedStorageContext()
        L_0x0042:
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0159 }
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ RuntimeException -> 0x0067 }
            java.lang.String r5 = "phenotype_hermetic"
            java.io.File r1 = r1.getDir(r5, r3)     // Catch:{ RuntimeException -> 0x0067 }
            java.lang.String r5 = "overrides.txt"
            r4.<init>(r1, r5)     // Catch:{ RuntimeException -> 0x0067 }
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0159 }
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.measurement.zzid r1 = com.google.android.gms.internal.measurement.zzid.zzd(r4)     // Catch:{ all -> 0x0159 }
            goto L_0x0071
        L_0x0062:
            com.google.android.gms.internal.measurement.zzid r1 = com.google.android.gms.internal.measurement.zzid.zzc()     // Catch:{ all -> 0x0159 }
            goto L_0x0071
        L_0x0067:
            r1 = move-exception
            java.lang.String r4 = "no data dir"
            android.util.Log.e(r0, r4, r1)     // Catch:{ all -> 0x0159 }
            com.google.android.gms.internal.measurement.zzid r1 = com.google.android.gms.internal.measurement.zzid.zzc()     // Catch:{ all -> 0x0159 }
        L_0x0071:
            boolean r4 = r1.zzb()     // Catch:{ all -> 0x0159 }
            if (r4 == 0) goto L_0x0151
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x0159 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x0159 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x014a }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x014a }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x014a }
            r6.<init>(r1)     // Catch:{ IOException -> 0x014a }
            r5.<init>(r6)     // Catch:{ IOException -> 0x014a }
            r4.<init>(r5)     // Catch:{ IOException -> 0x014a }
            r5 = 1
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x012e }
            r6.<init>()     // Catch:{ all -> 0x012e }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x012e }
            r7.<init>()     // Catch:{ all -> 0x012e }
        L_0x0097:
            java.lang.String r8 = r4.readLine()     // Catch:{ all -> 0x012e }
            if (r8 == 0) goto L_0x0109
            java.lang.String r9 = " "
            r10 = 3
            java.lang.String[] r9 = r8.split(r9, r10)     // Catch:{ all -> 0x012e }
            int r11 = r9.length     // Catch:{ all -> 0x012e }
            if (r11 == r10) goto L_0x00bc
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x012e }
            r9.<init>()     // Catch:{ all -> 0x012e }
            java.lang.String r10 = "Invalid: "
            r9.append(r10)     // Catch:{ all -> 0x012e }
            r9.append(r8)     // Catch:{ all -> 0x012e }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x012e }
            android.util.Log.e(r0, r8)     // Catch:{ all -> 0x012e }
            goto L_0x0097
        L_0x00bc:
            r8 = r9[r3]     // Catch:{ all -> 0x012e }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x012e }
            r10.<init>(r8)     // Catch:{ all -> 0x012e }
            r8 = r9[r5]     // Catch:{ all -> 0x012e }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x012e }
            r11.<init>(r8)     // Catch:{ all -> 0x012e }
            java.lang.String r8 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x012e }
            r11 = 2
            r12 = r9[r11]     // Catch:{ all -> 0x012e }
            java.lang.Object r12 = r7.get(r12)     // Catch:{ all -> 0x012e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x012e }
            if (r12 != 0) goto L_0x00f1
            r9 = r9[r11]     // Catch:{ all -> 0x012e }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x012e }
            r11.<init>(r9)     // Catch:{ all -> 0x012e }
            java.lang.String r12 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x012e }
            int r9 = r12.length()     // Catch:{ all -> 0x012e }
            r13 = 1024(0x400, float:1.435E-42)
            if (r9 < r13) goto L_0x00ee
            if (r12 != r11) goto L_0x00f1
        L_0x00ee:
            r7.put(r11, r12)     // Catch:{ all -> 0x012e }
        L_0x00f1:
            boolean r9 = r6.containsKey(r10)     // Catch:{ all -> 0x012e }
            if (r9 != 0) goto L_0x00ff
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x012e }
            r9.<init>()     // Catch:{ all -> 0x012e }
            r6.put(r10, r9)     // Catch:{ all -> 0x012e }
        L_0x00ff:
            java.lang.Object r9 = r6.get(r10)     // Catch:{ all -> 0x012e }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x012e }
            r9.put(r8, r12)     // Catch:{ all -> 0x012e }
            goto L_0x0097
        L_0x0109:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x012e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x012e }
            r7.<init>()     // Catch:{ all -> 0x012e }
            java.lang.String r8 = "Parsed "
            r7.append(r8)     // Catch:{ all -> 0x012e }
            r7.append(r1)     // Catch:{ all -> 0x012e }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x012e }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x012e }
            com.google.android.gms.internal.measurement.zzhg r0 = new com.google.android.gms.internal.measurement.zzhg     // Catch:{ all -> 0x012e }
            r0.<init>(r6)     // Catch:{ all -> 0x012e }
            r4.close()     // Catch:{ IOException -> 0x014a }
            com.google.android.gms.internal.measurement.zzid r0 = com.google.android.gms.internal.measurement.zzid.zzd(r0)     // Catch:{ all -> 0x0159 }
            goto L_0x0155
        L_0x012e:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0133 }
            goto L_0x0149
        L_0x0133:
            r1 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0149 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r4[r3] = r6     // Catch:{ Exception -> 0x0149 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r4 = r6.getDeclaredMethod(r7, r4)     // Catch:{ Exception -> 0x0149 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0149 }
            r5[r3] = r1     // Catch:{ Exception -> 0x0149 }
            r4.invoke(r0, r5)     // Catch:{ Exception -> 0x0149 }
        L_0x0149:
            throw r0     // Catch:{ IOException -> 0x014a }
        L_0x014a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0159 }
            r1.<init>(r0)     // Catch:{ all -> 0x0159 }
            throw r1     // Catch:{ all -> 0x0159 }
        L_0x0151:
            com.google.android.gms.internal.measurement.zzid r0 = com.google.android.gms.internal.measurement.zzid.zzc()     // Catch:{ all -> 0x0159 }
        L_0x0155:
            android.os.StrictMode.setThreadPolicy(r2)
        L_0x0158:
            return r0
        L_0x0159:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhp.zza():java.lang.Object");
    }
}
