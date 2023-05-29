package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.b;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.c;
import com.ironsource.mediationsdk.utils.g;
import com.ironsource.mediationsdk.utils.p;
import com.veso.online.data.model.XosoConfig;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.h  reason: case insensitive filesystem */
public final class C0023h {
    C0024i a;
    ISBannerSize b;
    private final String c = XosoConfig.REGION_ID_SOUTH;
    private final String d = "102";
    private final String e = "103";
    private final String f = "102";
    private final String g = "GenericNotifications";
    private String h;
    private String i;
    private c j;
    private C0022g k;

    /* renamed from: com.ironsource.mediationsdk.h$a */
    public static class a implements Runnable {
        private WeakReference<C0022g> a;
        private int b;
        private String c;
        private String d;
        private List<b> e;
        private b f;
        private JSONObject g;
        private JSONObject h;
        private long i;
        private int j;
        private String k = "other";
        private int l;
        private String m = "";
        private int n = 0;
        private final URL o;
        private final JSONObject p;
        private final boolean q;
        private final int r;
        private final long s;
        private final boolean t;
        private final boolean u;
        private final int v;

        a(C0022g gVar, URL url, JSONObject jSONObject, boolean z, int i2, long j2, boolean z2, boolean z3, int i3) {
            this.a = new WeakReference<>(gVar);
            this.o = url;
            this.p = jSONObject;
            this.q = z;
            this.r = i2;
            this.s = j2;
            this.t = z2;
            this.u = z3;
            this.v = i3;
        }

        private static String a(HttpURLConnection httpURLConnection) {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        /* JADX WARNING: type inference failed for: r0v22, types: [java.net.URLConnection] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0255  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean a() {
            /*
                r17 = this;
                r1 = r17
                java.lang.String r2 = "decompression error"
                java.lang.String r3 = "decryption error"
                java.lang.String r4 = "other"
                java.util.Date r0 = new java.util.Date
                r0.<init>()
                long r5 = r0.getTime()
                r1.i = r5
                r5 = 0
                int r0 = r1.n     // Catch:{ Exception -> 0x02a1 }
                r6 = 1015(0x3f7, float:1.422E-42)
                r7 = 1
                if (r0 != r6) goto L_0x001d
                r0 = r7
                goto L_0x001f
            L_0x001d:
                int r0 = r1.v     // Catch:{ Exception -> 0x02a1 }
            L_0x001f:
                r1.l = r0     // Catch:{ Exception -> 0x02a1 }
                r1.j = r5
                r0 = 0
                r8 = r0
            L_0x0025:
                int r0 = r1.j
                int r9 = r1.r
                if (r0 >= r9) goto L_0x0297
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                long r9 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r11 = "Auction Handler: auction trial "
                r0.<init>(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                int r11 = r1.j     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                int r11 = r11 + r7
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r11 = " out of "
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                int r11 = r1.r     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r11 = " max trials"
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r11.log(r12, r0, r5)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.net.URL r0 = r1.o     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                long r11 = r1.s     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                int r11 = (int) r11     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r12 = r0
                java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r0 = "POST"
                r12.setRequestMethod(r0)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r0 = "Content-Type"
                java.lang.String r13 = "application/json; charset=utf-8"
                r12.setRequestProperty(r0, r13)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r12.setReadTimeout(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r12.setDoInput(r7)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r12.setDoOutput(r7)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                org.json.JSONObject r8 = r1.p     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                boolean r11 = r1.t     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.io.OutputStream r13 = r12.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.io.OutputStreamWriter r14 = new java.io.OutputStreamWriter     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = "UTF-8"
                r14.<init>(r13, r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.io.BufferedWriter r15 = new java.io.BufferedWriter     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r15.<init>(r14)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r16 = ""
                int r0 = r1.l     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5 = 2
                if (r0 != r5) goto L_0x00c7
                com.ironsource.mediationsdk.utils.g r0 = com.ironsource.mediationsdk.utils.g.a()     // Catch:{ JSONException -> 0x00a5 }
                java.lang.String r16 = r0.d()     // Catch:{ JSONException -> 0x00a5 }
                goto L_0x00c7
            L_0x00a5:
                r0 = move-exception
                java.lang.String r5 = r0.getLocalizedMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r1.m = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r1.n = r6     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r1.l = r7     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r7 = "get encrypted session key exception "
                r6.<init>(r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6.append(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5.error(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x00c7:
                java.lang.String r0 = r8.toString()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = r17.b()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r11 == 0) goto L_0x00dd
                com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r7 = "compressing and encrypting auction request"
                r6.verbose(r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r5, r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                goto L_0x00e1
            L_0x00dd:
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encode(r5, r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x00e1:
                int r5 = r1.l     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 2
                if (r5 != r6) goto L_0x00f5
                java.lang.String r5 = "{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}"
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 0
                r7[r6] = r16     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 1
                r7[r6] = r0     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = java.lang.String.format(r5, r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                goto L_0x0101
            L_0x00f5:
                java.lang.String r5 = "{\"request\" : \"%1$s\"}"
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 0
                r7[r6] = r0     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = java.lang.String.format(r5, r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x0101:
                r15.write(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r15.flush()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r15.close()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r14.close()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r13.close()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                int r0 = r12.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5 = 200(0xc8, float:2.8E-43)
                if (r0 == r5) goto L_0x0157
                r5 = 1001(0x3e9, float:1.403E-42)
                r1.b = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r6 = "Auction status not 200 error, error code response from server - "
                r5.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5.append(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r5.toString()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r1.c = r0     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = r1.c     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r0.error(r5)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r12.disconnect()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                int r0 = r1.j     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                int r5 = r1.r     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 1
                int r5 = r5 - r6
                if (r0 >= r5) goto L_0x0154
                long r5 = r1.s     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                long r7 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                long r7 = r7 - r9
                long r5 = r5 - r7
                r7 = 0
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r0 <= 0) goto L_0x0154
                android.os.SystemClock.sleep(r5)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x0154:
                r8 = r12
                goto L_0x028b
            L_0x0157:
                java.lang.String r0 = a(r12)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                boolean r5 = r1.q     // Catch:{ JSONException -> 0x01e0 }
                boolean r6 = r1.u     // Catch:{ JSONException -> 0x01e0 }
                boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01e0 }
                if (r7 != 0) goto L_0x01d8
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e0 }
                r7.<init>(r0)     // Catch:{ JSONException -> 0x01e0 }
                if (r5 == 0) goto L_0x01b0
                java.lang.String r0 = r17.b()     // Catch:{ JSONException -> 0x01e0 }
                int r5 = r1.l     // Catch:{ JSONException -> 0x01e0 }
                r8 = 2
                if (r5 != r8) goto L_0x0178
                java.lang.String r5 = "ct"
                goto L_0x017a
            L_0x0178:
                java.lang.String r5 = "response"
            L_0x017a:
                java.lang.String r5 = r7.getString(r5)     // Catch:{ JSONException -> 0x01e0 }
                if (r6 == 0) goto L_0x0199
                com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r7 = "decrypting and decompressing auction response"
                r6.verbose(r7)     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decryptAndDecompress(r0, r5)     // Catch:{ JSONException -> 0x01e0 }
                if (r0 == 0) goto L_0x0193
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e0 }
                r5.<init>(r0)     // Catch:{ JSONException -> 0x01e0 }
                goto L_0x01a8
            L_0x0193:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01e0 }
                r0.<init>(r2)     // Catch:{ JSONException -> 0x01e0 }
                throw r0     // Catch:{ JSONException -> 0x01e0 }
            L_0x0199:
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decode(r0, r5)     // Catch:{ JSONException -> 0x01e0 }
                boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01e0 }
                if (r5 != 0) goto L_0x01aa
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e0 }
                r5.<init>(r0)     // Catch:{ JSONException -> 0x01e0 }
            L_0x01a8:
                r7 = r5
                goto L_0x01b0
            L_0x01aa:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01e0 }
                r0.<init>(r3)     // Catch:{ JSONException -> 0x01e0 }
                throw r0     // Catch:{ JSONException -> 0x01e0 }
            L_0x01b0:
                com.ironsource.mediationsdk.C0021f.a()     // Catch:{ JSONException -> 0x01e0 }
                com.ironsource.mediationsdk.f$a r0 = com.ironsource.mediationsdk.C0021f.a((org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r5 = r0.a     // Catch:{ JSONException -> 0x01e0 }
                r1.d = r5     // Catch:{ JSONException -> 0x01e0 }
                java.util.List<com.ironsource.mediationsdk.server.b> r5 = r0.b     // Catch:{ JSONException -> 0x01e0 }
                r1.e = r5     // Catch:{ JSONException -> 0x01e0 }
                com.ironsource.mediationsdk.server.b r5 = r0.c     // Catch:{ JSONException -> 0x01e0 }
                r1.f = r5     // Catch:{ JSONException -> 0x01e0 }
                org.json.JSONObject r5 = r0.d     // Catch:{ JSONException -> 0x01e0 }
                r1.g = r5     // Catch:{ JSONException -> 0x01e0 }
                org.json.JSONObject r5 = r0.e     // Catch:{ JSONException -> 0x01e0 }
                r1.h = r5     // Catch:{ JSONException -> 0x01e0 }
                int r5 = r0.f     // Catch:{ JSONException -> 0x01e0 }
                r1.b = r5     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r0 = r0.g     // Catch:{ JSONException -> 0x01e0 }
                r1.c = r0     // Catch:{ JSONException -> 0x01e0 }
                r12.disconnect()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r2 = 1
                return r2
            L_0x01d8:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r5 = "empty response"
                r0.<init>(r5)     // Catch:{ JSONException -> 0x01e0 }
                throw r0     // Catch:{ JSONException -> 0x01e0 }
            L_0x01e0:
                r0 = move-exception
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r5 == 0) goto L_0x01f9
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                boolean r5 = r5.equalsIgnoreCase(r3)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r5 == 0) goto L_0x01f9
                r5 = 1003(0x3eb, float:1.406E-42)
                r1.b = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = "Auction decryption error"
                r1.c = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x01f9:
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r5 == 0) goto L_0x0212
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                boolean r5 = r5.equalsIgnoreCase(r2)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r5 == 0) goto L_0x0212
                r5 = 1008(0x3f0, float:1.413E-42)
                r1.b = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = "Auction decompression error"
            L_0x020f:
                r1.c = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                goto L_0x0219
            L_0x0212:
                r5 = 1002(0x3ea, float:1.404E-42)
                r1.b = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = "Auction parsing error"
                goto L_0x020f
            L_0x0219:
                java.lang.String r5 = "parsing"
                r1.k = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r7 = "Auction handle response exception "
                r6.<init>(r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6.append(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5.error(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r12.disconnect()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r2 = 0
                return r2
            L_0x0239:
                r0 = move-exception
                r8 = r12
                goto L_0x0240
            L_0x023c:
                r0 = move-exception
                r8 = r12
                goto L_0x0267
            L_0x023f:
                r0 = move-exception
            L_0x0240:
                com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r5 = "getting exception "
                r3.<init>(r5)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.error(r3)
                if (r8 == 0) goto L_0x0258
                r8.disconnect()
            L_0x0258:
                r2 = 1000(0x3e8, float:1.401E-42)
                r1.b = r2
                java.lang.String r0 = r0.getMessage()
                r1.c = r0
                r1.k = r4
                r2 = 0
                return r2
            L_0x0266:
                r0 = move-exception
            L_0x0267:
                if (r8 == 0) goto L_0x026c
                r8.disconnect()
            L_0x026c:
                r5 = 1006(0x3ee, float:1.41E-42)
                r1.b = r5
                java.lang.String r5 = "Connection timed out"
                r1.c = r5
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "Auction socket timeout exception "
                r6.<init>(r7)
                java.lang.String r0 = r0.getMessage()
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                r5.error(r0)
            L_0x028b:
                int r0 = r1.j
                r5 = 1
                int r0 = r0 + r5
                r1.j = r0
                r7 = r5
                r5 = 0
                r6 = 1015(0x3f7, float:1.422E-42)
                goto L_0x0025
            L_0x0297:
                r5 = r7
                int r9 = r9 - r5
                r1.j = r9
                java.lang.String r0 = "trials_fail"
                r1.k = r0
                r2 = 0
                return r2
            L_0x02a1:
                r0 = move-exception
                r2 = r5
                r3 = 1007(0x3ef, float:1.411E-42)
                r1.b = r3
                java.lang.String r3 = r0.getMessage()
                r1.c = r3
                r1.j = r2
                r1.k = r4
                com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Auction request exception "
                r4.<init>(r5)
                java.lang.String r0 = r0.getMessage()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r3.error(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C0023h.a.a():boolean");
        }

        private String b() {
            return this.l == 2 ? g.a().c() : g.a().b();
        }

        public final void run() {
            boolean a2 = a();
            C0022g gVar = (C0022g) this.a.get();
            if (gVar != null) {
                long time = new Date().getTime() - this.i;
                if (a2) {
                    gVar.a(this.e, this.d, this.f, this.g, this.h, this.j + 1, time, this.n, this.m);
                } else {
                    gVar.a(this.b, this.c, this.j + 1, this.k, time);
                }
            }
        }
    }

    public C0023h(C0024i iVar) {
        this.a = iVar;
    }

    @Deprecated
    public C0023h(String str, c cVar, C0022g gVar) {
        this.h = str;
        this.j = cVar;
        this.k = gVar;
        this.i = IronSourceUtils.getSessionId();
    }

    private JSONObject a(Context context, Map<String, Object> map, List<String> list, C0025j jVar, int i2, boolean z, IronSourceSegment ironSourceSegment) {
        new JSONObject();
        p c2 = L.a().i.c.e.c();
        JSONObject a2 = a(ironSourceSegment);
        boolean z2 = c2.d;
        C0021f a3 = C0021f.a();
        if (z2) {
            return a3.a(this.h, z, map, list, jVar, i2, this.b, a2);
        }
        JSONObject a4 = a3.a(context, map, list, jVar, i2, this.i, this.j, this.b, a2);
        a4.put("adUnit", this.h);
        a4.put("doNotEncryptResponse", z ? "false" : "true");
        return a4;
    }

    private static JSONObject a(IronSourceSegment ironSourceSegment) {
        JSONObject jSONObject = new JSONObject();
        if (ironSourceSegment == null) {
            return null;
        }
        Vector<Pair<String, String>> a2 = ironSourceSegment.a();
        for (int i2 = 0; i2 < a2.size(); i2++) {
            try {
                jSONObject.put((String) a2.get(i2).first, a2.get(i2).second);
            } catch (JSONException e2) {
                e2.printStackTrace();
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception " + e2.getMessage());
            }
        }
        return jSONObject;
    }

    public static void a(b bVar, int i2, b bVar2) {
        for (String a2 : bVar.f()) {
            String a3 = C0021f.a().a(a2, i2, bVar, "", "", "");
            C0021f.a();
            C0021f.a("reportLoadSuccess", bVar.a(), a3);
        }
        if (bVar2 != null) {
            for (String a4 : bVar2.f()) {
                String a5 = C0021f.a().a(a4, i2, bVar, "", "102", "");
                C0021f.a();
                C0021f.a("reportLoadSuccess", "GenericNotifications", a5);
            }
        }
    }

    public static void a(b bVar, int i2, b bVar2, String str) {
        for (String a2 : bVar.d()) {
            String a3 = C0021f.a().a(a2, i2, bVar, "", "", str);
            C0021f.a();
            C0021f.a("reportImpression", bVar.a(), a3);
        }
        if (bVar2 != null) {
            for (String a4 : bVar2.d()) {
                String a5 = C0021f.a().a(a4, i2, bVar, "", "102", str);
                C0021f.a();
                C0021f.a("reportImpression", "GenericNotifications", a5);
            }
        }
    }

    public static void a(ArrayList<String> arrayList, ConcurrentHashMap<String, b> concurrentHashMap, int i2, b bVar, b bVar2) {
        Iterator<String> it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(bVar2.a())) {
                z2 = i2 == 2;
                z = true;
            } else {
                int i3 = i2;
                b bVar3 = concurrentHashMap.get(next);
                String c2 = bVar3.c();
                String str = z ? z2 ? "102" : "103" : XosoConfig.REGION_ID_SOUTH;
                for (String a2 : bVar3.e()) {
                    String a3 = C0021f.a().a(a2, i2, bVar2, c2, str, "");
                    C0021f.a();
                    C0021f.a("reportAuctionLose", bVar3.a(), a3);
                }
            }
        }
        int i4 = i2;
        if (bVar != null) {
            for (String a4 : bVar.e()) {
                String a5 = C0021f.a().a(a4, i2, bVar2, "", "102", "");
                C0021f.a();
                C0021f.a("reportAuctionLose", "GenericNotifications", a5);
            }
        }
    }

    @Deprecated
    public final void a(Context context, Map<String, Object> map, List<String> list, C0025j jVar, int i2, IronSourceSegment ironSourceSegment) {
        try {
            boolean z = true;
            if (IronSourceUtils.getSerr() != 1) {
                z = false;
            }
            boolean z2 = z;
            JSONObject a2 = a(context, map, list, jVar, i2, z2, ironSourceSegment);
            com.ironsource.environment.e.c.a.c(new a(this.k, new URL(this.j.d), a2, z2, this.j.f, this.j.i, this.j.q, this.j.r, this.j.s));
        } catch (Exception e2) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("execute auction exception " + e2.getMessage());
            this.k.a(1000, e2.getMessage(), 0, "other", 0);
        }
    }

    public final void a(CopyOnWriteArrayList<ac> copyOnWriteArrayList, ConcurrentHashMap<String, b> concurrentHashMap, int i2, b bVar, b bVar2) {
        ArrayList arrayList = new ArrayList();
        Iterator<ac> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().l());
        }
        a((ArrayList<String>) arrayList, concurrentHashMap, i2, bVar, bVar2);
    }
}
