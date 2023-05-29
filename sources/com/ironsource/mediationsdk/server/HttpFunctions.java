package com.ironsource.mediationsdk.server;

import com.ironsource.mediationsdk.L;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpFunctions {
    public static final String ERROR_PREFIX = "ERROR:";
    private static final ExecutorService a = Executors.newSingleThreadExecutor();

    public static String getStringFromURL(String str) {
        return getStringFromURL(str, (L.a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getStringFromURL(java.lang.String r4, com.ironsource.mediationsdk.L.a r5) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0088, all -> 0x007b }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0088, all -> 0x007b }
            java.net.URLConnection r4 = r1.openConnection()     // Catch:{ Exception -> 0x0088, all -> 0x007b }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x0088, all -> 0x007b }
            r1 = 15000(0x3a98, float:2.102E-41)
            r4.setReadTimeout(r1)     // Catch:{ Exception -> 0x0079, all -> 0x0074 }
            r4.setConnectTimeout(r1)     // Catch:{ Exception -> 0x0079, all -> 0x0074 }
            java.lang.String r1 = "GET"
            r4.setRequestMethod(r1)     // Catch:{ Exception -> 0x0079, all -> 0x0074 }
            r1 = 1
            r4.setDoInput(r1)     // Catch:{ Exception -> 0x0079, all -> 0x0074 }
            r4.connect()     // Catch:{ Exception -> 0x0079, all -> 0x0074 }
            int r1 = r4.getResponseCode()     // Catch:{ Exception -> 0x0079, all -> 0x0074 }
            r2 = 400(0x190, float:5.6E-43)
            if (r1 != r2) goto L_0x0035
            if (r5 == 0) goto L_0x002f
            java.lang.String r1 = "Bad Request - 400"
            r5.a(r1)     // Catch:{ Exception -> 0x0079, all -> 0x0074 }
        L_0x002f:
            if (r4 == 0) goto L_0x0034
            r4.disconnect()
        L_0x0034:
            return r0
        L_0x0035:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0079, all -> 0x0074 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0079, all -> 0x0074 }
            java.io.InputStream r2 = r4.getInputStream()     // Catch:{ Exception -> 0x0079, all -> 0x0074 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0079, all -> 0x0074 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0079, all -> 0x0074 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008a, all -> 0x006e }
            r1.<init>()     // Catch:{ Exception -> 0x008a, all -> 0x006e }
        L_0x0048:
            java.lang.String r2 = r5.readLine()     // Catch:{ Exception -> 0x008a, all -> 0x006e }
            if (r2 == 0) goto L_0x0052
            r1.append(r2)     // Catch:{ Exception -> 0x008a, all -> 0x006e }
            goto L_0x0048
        L_0x0052:
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x008a, all -> 0x006e }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x008a, all -> 0x006e }
            if (r2 == 0) goto L_0x0065
            if (r4 == 0) goto L_0x0061
            r4.disconnect()
        L_0x0061:
            r5.close()
            return r0
        L_0x0065:
            if (r4 == 0) goto L_0x006a
            r4.disconnect()
        L_0x006a:
            r5.close()
            return r1
        L_0x006e:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r5
            r5 = r3
            goto L_0x007d
        L_0x0074:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x007d
        L_0x0079:
            r5 = r0
            goto L_0x008a
        L_0x007b:
            r5 = move-exception
            r4 = r0
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.disconnect()
        L_0x0082:
            if (r4 == 0) goto L_0x0087
            r4.close()
        L_0x0087:
            throw r5
        L_0x0088:
            r4 = r0
            r5 = r4
        L_0x008a:
            if (r4 == 0) goto L_0x008f
            r4.disconnect()
        L_0x008f:
            if (r5 == 0) goto L_0x0094
            r5.close()
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.server.HttpFunctions.getStringFromURL(java.lang.String, com.ironsource.mediationsdk.L$a):java.lang.String");
    }

    public static void sendPostRequest(String str, String str2, a aVar) {
        sendPostRequestWithAutho(str, str2, (String) null, (String) null, aVar);
    }

    public static void sendPostRequestWithAutho(String str, String str2, String str3, String str4, a aVar) {
        final String str5 = str;
        final String str6 = str3;
        final String str7 = str4;
        final String str8 = str2;
        final a aVar2 = aVar;
        a.submit(new Runnable() {
            /* JADX WARNING: type inference failed for: r1v0, types: [java.io.OutputStream, java.net.HttpURLConnection] */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1 A[SYNTHETIC, Splitter:B:33:0x00b1] */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x00c2 A[SYNTHETIC, Splitter:B:41:0x00c2] */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc  */
            /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r8 = this;
                    r0 = 0
                    r1 = 0
                    java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x008d, all -> 0x008a }
                    java.lang.String r3 = r2     // Catch:{ Exception -> 0x008d, all -> 0x008a }
                    r2.<init>(r3)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
                    java.lang.String r3 = r3     // Catch:{ Exception -> 0x008d, all -> 0x008a }
                    if (r3 == 0) goto L_0x001a
                    java.lang.String r4 = r4     // Catch:{ Exception -> 0x008d, all -> 0x008a }
                    if (r4 == 0) goto L_0x001a
                    java.lang.String r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.getBase64Auth(r3, r4)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
                    java.lang.String r4 = "Authorization"
                    r1.setRequestProperty(r4, r3)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
                L_0x001a:
                    java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x008d, all -> 0x008a }
                    java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x008d, all -> 0x008a }
                    r3 = 15000(0x3a98, float:2.102E-41)
                    r2.setReadTimeout(r3)     // Catch:{ Exception -> 0x0088 }
                    r2.setConnectTimeout(r3)     // Catch:{ Exception -> 0x0088 }
                    java.lang.String r3 = "POST"
                    r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x0088 }
                    r3 = 1
                    r2.setDoInput(r3)     // Catch:{ Exception -> 0x0088 }
                    r2.setDoOutput(r3)     // Catch:{ Exception -> 0x0088 }
                    java.io.OutputStream r1 = r2.getOutputStream()     // Catch:{ Exception -> 0x0088 }
                    java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0088 }
                    java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0088 }
                    java.lang.String r6 = "UTF-8"
                    r5.<init>(r1, r6)     // Catch:{ Exception -> 0x0088 }
                    r4.<init>(r5)     // Catch:{ Exception -> 0x0088 }
                    java.lang.String r5 = r5     // Catch:{ Exception -> 0x0088 }
                    r4.write(r5)     // Catch:{ Exception -> 0x0088 }
                    r4.flush()     // Catch:{ Exception -> 0x0088 }
                    r4.close()     // Catch:{ Exception -> 0x0088 }
                    int r4 = r2.getResponseCode()     // Catch:{ Exception -> 0x0088 }
                    r5 = 200(0xc8, float:2.8E-43)
                    if (r4 != r5) goto L_0x0058
                    goto L_0x0059
                L_0x0058:
                    r3 = r0
                L_0x0059:
                    if (r3 != 0) goto L_0x0073
                    com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x0088 }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0088 }
                    java.lang.String r7 = "invalid response code "
                    r6.<init>(r7)     // Catch:{ Exception -> 0x0088 }
                    r6.append(r4)     // Catch:{ Exception -> 0x0088 }
                    java.lang.String r4 = " sending request"
                    r6.append(r4)     // Catch:{ Exception -> 0x0088 }
                    java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x0088 }
                    r5.error(r4)     // Catch:{ Exception -> 0x0088 }
                L_0x0073:
                    com.ironsource.mediationsdk.server.a r4 = r6     // Catch:{ Exception -> 0x0088 }
                    r4.a(r3)     // Catch:{ Exception -> 0x0088 }
                    if (r1 == 0) goto L_0x0082
                    r1.close()     // Catch:{ IOException -> 0x007e }
                    goto L_0x0082
                L_0x007e:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x0082:
                    if (r2 == 0) goto L_0x00be
                    r2.disconnect()
                    return
                L_0x0088:
                    r3 = move-exception
                    goto L_0x0090
                L_0x008a:
                    r0 = move-exception
                    r2 = r1
                    goto L_0x00c0
                L_0x008d:
                    r2 = move-exception
                    r3 = r2
                    r2 = r1
                L_0x0090:
                    r3.printStackTrace()     // Catch:{ all -> 0x00bf }
                    com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00bf }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
                    java.lang.String r6 = "exception while sending request "
                    r5.<init>(r6)     // Catch:{ all -> 0x00bf }
                    java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00bf }
                    r5.append(r3)     // Catch:{ all -> 0x00bf }
                    java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00bf }
                    r4.error(r3)     // Catch:{ all -> 0x00bf }
                    com.ironsource.mediationsdk.server.a r3 = r6     // Catch:{ all -> 0x00bf }
                    r3.a(r0)     // Catch:{ all -> 0x00bf }
                    if (r1 == 0) goto L_0x00b9
                    r1.close()     // Catch:{ IOException -> 0x00b5 }
                    goto L_0x00b9
                L_0x00b5:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x00b9:
                    if (r2 == 0) goto L_0x00be
                    r2.disconnect()
                L_0x00be:
                    return
                L_0x00bf:
                    r0 = move-exception
                L_0x00c0:
                    if (r1 == 0) goto L_0x00ca
                    r1.close()     // Catch:{ IOException -> 0x00c6 }
                    goto L_0x00ca
                L_0x00c6:
                    r1 = move-exception
                    r1.printStackTrace()
                L_0x00ca:
                    if (r2 == 0) goto L_0x00cf
                    r2.disconnect()
                L_0x00cf:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.server.HttpFunctions.AnonymousClass1.run():void");
            }
        });
    }
}
