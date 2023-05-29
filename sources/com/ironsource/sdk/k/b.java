package com.ironsource.sdk.k;

import android.os.Handler;
import android.os.Message;
import androidx.core.view.PointerIconCompat;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class b {
    private static b d;
    public a a = new a(com.ironsource.environment.e.a.a());
    public final String b;
    private JSONObject c;
    private Thread e;

    static class a implements Callable<C0015b> {
        private String a;
        private String b;
        private String c;
        private long d;
        private String e;
        private JSONObject f;

        a(String str, String str2, String str3, long j, String str4, JSONObject jSONObject) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = j;
            this.e = str4;
            this.f = jSONObject == null ? new JSONObject() : jSONObject;
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v1, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v4, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r3v5, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: type inference failed for: r3v8, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v12 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0143 A[Catch:{ all -> 0x013f }] */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x0152 A[SYNTHETIC, Splitter:B:111:0x0152] */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x015a A[Catch:{ all -> 0x0156 }] */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x0169 A[SYNTHETIC, Splitter:B:123:0x0169] */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x0171 A[Catch:{ all -> 0x016d }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008f A[SYNTHETIC, Splitter:B:25:0x008f] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0097 A[Catch:{ all -> 0x0093 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf A[Catch:{ all -> 0x0108 }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00c8 A[SYNTHETIC, Splitter:B:48:0x00c8] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00d0 A[Catch:{ all -> 0x00cc }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00ea A[Catch:{ all -> 0x0108 }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x00f3 A[SYNTHETIC, Splitter:B:63:0x00f3] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00fb A[Catch:{ all -> 0x00f7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x010d A[SYNTHETIC, Splitter:B:74:0x010d] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0115 A[Catch:{ all -> 0x0111 }] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0124 A[SYNTHETIC, Splitter:B:87:0x0124] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x012c A[Catch:{ all -> 0x0128 }] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x013b A[SYNTHETIC, Splitter:B:99:0x013b] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x00e0=Splitter:B:58:0x00e0, B:43:0x00b5=Splitter:B:43:0x00b5} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.ironsource.sdk.k.b.C0015b a(java.lang.String r12, int r13) {
            /*
                r11 = this;
                java.lang.String r0 = "DownloadManager"
                com.ironsource.sdk.k.b$b r1 = new com.ironsource.sdk.k.b$b
                r1.<init>()
                boolean r2 = android.text.TextUtils.isEmpty(r12)
                if (r2 == 0) goto L_0x0014
                r1.a = r12
                r12 = 1007(0x3ef, float:1.411E-42)
                r1.b = r12
                return r1
            L_0x0014:
                r2 = 1019(0x3fb, float:1.428E-42)
                r3 = 0
                r4 = 0
                java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0166, URISyntaxException -> 0x014f, SocketTimeoutException -> 0x0138, FileNotFoundException -> 0x0121, Exception -> 0x00dd, Error -> 0x00b3, all -> 0x00af }
                r5.<init>(r12)     // Catch:{ MalformedURLException -> 0x0166, URISyntaxException -> 0x014f, SocketTimeoutException -> 0x0138, FileNotFoundException -> 0x0121, Exception -> 0x00dd, Error -> 0x00b3, all -> 0x00af }
                r5.toURI()     // Catch:{ MalformedURLException -> 0x0166, URISyntaxException -> 0x014f, SocketTimeoutException -> 0x0138, FileNotFoundException -> 0x0121, Exception -> 0x00dd, Error -> 0x00b3, all -> 0x00af }
                java.net.URLConnection r5 = r5.openConnection()     // Catch:{ MalformedURLException -> 0x0166, URISyntaxException -> 0x014f, SocketTimeoutException -> 0x0138, FileNotFoundException -> 0x0121, Exception -> 0x00dd, Error -> 0x00b3, all -> 0x00af }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ MalformedURLException -> 0x0166, URISyntaxException -> 0x014f, SocketTimeoutException -> 0x0138, FileNotFoundException -> 0x0121, Exception -> 0x00dd, Error -> 0x00b3, all -> 0x00af }
                java.lang.String r6 = "GET"
                r5.setRequestMethod(r6)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                org.json.JSONObject r6 = r11.f     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                java.lang.String r7 = "connectionTimeout"
                r8 = 5
                int r6 = r6.optInt(r7, r8)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                int r6 = r6 * 1000
                r7 = 5000(0x1388, float:7.006E-42)
                if (r6 <= 0) goto L_0x003b
                goto L_0x003c
            L_0x003b:
                r6 = r7
            L_0x003c:
                org.json.JSONObject r9 = r11.f     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                java.lang.String r10 = "readTimeout"
                int r8 = r9.optInt(r10, r8)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                int r8 = r8 * 1000
                if (r8 <= 0) goto L_0x0049
                r7 = r8
            L_0x0049:
                r5.setConnectTimeout(r6)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                r5.setReadTimeout(r7)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                r5.connect()     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                int r4 = r5.getResponseCode()     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                r6 = 200(0xc8, float:2.8E-43)
                if (r4 < r6) goto L_0x006a
                r6 = 400(0x190, float:5.6E-43)
                if (r4 < r6) goto L_0x005f
                goto L_0x006a
            L_0x005f:
                java.io.InputStream r3 = r5.getInputStream()     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                byte[] r13 = a(r3)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                r1.c = r13     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                goto L_0x008d
            L_0x006a:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                java.lang.String r7 = " RESPONSE CODE: "
                r6.<init>(r7)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                r6.append(r4)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                java.lang.String r7 = " URL: "
                r6.append(r7)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                r6.append(r12)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                java.lang.String r7 = " ATTEMPT: "
                r6.append(r7)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                r6.append(r13)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                java.lang.String r13 = r6.toString()     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                com.ironsource.sdk.utils.Logger.i(r0, r13)     // Catch:{ MalformedURLException -> 0x0167, URISyntaxException -> 0x0150, SocketTimeoutException -> 0x0139, FileNotFoundException -> 0x0122, Exception -> 0x00aa, Error -> 0x00a6, all -> 0x00a4 }
                r4 = 1011(0x3f3, float:1.417E-42)
            L_0x008d:
                if (r3 == 0) goto L_0x0095
                r3.close()     // Catch:{ all -> 0x0093 }
                goto L_0x0095
            L_0x0093:
                r13 = move-exception
                goto L_0x009b
            L_0x0095:
                if (r5 == 0) goto L_0x009e
                r5.disconnect()     // Catch:{ all -> 0x0093 }
                goto L_0x009e
            L_0x009b:
                r13.printStackTrace()
            L_0x009e:
                r1.a = r12
                r1.b = r4
                goto L_0x017e
            L_0x00a4:
                r13 = move-exception
                goto L_0x00b1
            L_0x00a6:
                r13 = move-exception
                r4 = r3
                r3 = r5
                goto L_0x00b5
            L_0x00aa:
                r13 = move-exception
                r2 = r4
                r4 = r3
                r3 = r5
                goto L_0x00e0
            L_0x00af:
                r13 = move-exception
                r5 = r3
            L_0x00b1:
                r2 = r4
                goto L_0x010b
            L_0x00b3:
                r13 = move-exception
                r4 = r3
            L_0x00b5:
                java.lang.String r5 = r13.getMessage()     // Catch:{ all -> 0x0108 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0108 }
                if (r5 != 0) goto L_0x00c6
                java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x0108 }
                com.ironsource.sdk.utils.Logger.i(r0, r13)     // Catch:{ all -> 0x0108 }
            L_0x00c6:
                if (r4 == 0) goto L_0x00ce
                r4.close()     // Catch:{ all -> 0x00cc }
                goto L_0x00ce
            L_0x00cc:
                r13 = move-exception
                goto L_0x00d4
            L_0x00ce:
                if (r3 == 0) goto L_0x00d7
                r3.disconnect()     // Catch:{ all -> 0x00cc }
                goto L_0x00d7
            L_0x00d4:
                r13.printStackTrace()
            L_0x00d7:
                r1.a = r12
                r1.b = r2
                goto L_0x017e
            L_0x00dd:
                r13 = move-exception
                r2 = r4
                r4 = r3
            L_0x00e0:
                java.lang.String r5 = r13.getMessage()     // Catch:{ all -> 0x0108 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0108 }
                if (r5 != 0) goto L_0x00f1
                java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x0108 }
                com.ironsource.sdk.utils.Logger.i(r0, r13)     // Catch:{ all -> 0x0108 }
            L_0x00f1:
                if (r4 == 0) goto L_0x00f9
                r4.close()     // Catch:{ all -> 0x00f7 }
                goto L_0x00f9
            L_0x00f7:
                r13 = move-exception
                goto L_0x00ff
            L_0x00f9:
                if (r3 == 0) goto L_0x0102
                r3.disconnect()     // Catch:{ all -> 0x00f7 }
                goto L_0x0102
            L_0x00ff:
                r13.printStackTrace()
            L_0x0102:
                r1.a = r12
                r12 = 1009(0x3f1, float:1.414E-42)
                goto L_0x017c
            L_0x0108:
                r13 = move-exception
                r5 = r3
                r3 = r4
            L_0x010b:
                if (r3 == 0) goto L_0x0113
                r3.close()     // Catch:{ all -> 0x0111 }
                goto L_0x0113
            L_0x0111:
                r0 = move-exception
                goto L_0x0119
            L_0x0113:
                if (r5 == 0) goto L_0x011c
                r5.disconnect()     // Catch:{ all -> 0x0111 }
                goto L_0x011c
            L_0x0119:
                r0.printStackTrace()
            L_0x011c:
                r1.a = r12
                r1.b = r2
                throw r13
            L_0x0121:
                r5 = r3
            L_0x0122:
                if (r3 == 0) goto L_0x012a
                r3.close()     // Catch:{ all -> 0x0128 }
                goto L_0x012a
            L_0x0128:
                r13 = move-exception
                goto L_0x0130
            L_0x012a:
                if (r5 == 0) goto L_0x0133
                r5.disconnect()     // Catch:{ all -> 0x0128 }
                goto L_0x0133
            L_0x0130:
                r13.printStackTrace()
            L_0x0133:
                r1.a = r12
                r12 = 1018(0x3fa, float:1.427E-42)
                goto L_0x017c
            L_0x0138:
                r5 = r3
            L_0x0139:
                if (r3 == 0) goto L_0x0141
                r3.close()     // Catch:{ all -> 0x013f }
                goto L_0x0141
            L_0x013f:
                r13 = move-exception
                goto L_0x0147
            L_0x0141:
                if (r5 == 0) goto L_0x014a
                r5.disconnect()     // Catch:{ all -> 0x013f }
                goto L_0x014a
            L_0x0147:
                r13.printStackTrace()
            L_0x014a:
                r1.a = r12
                r12 = 1008(0x3f0, float:1.413E-42)
                goto L_0x017c
            L_0x014f:
                r5 = r3
            L_0x0150:
                if (r3 == 0) goto L_0x0158
                r3.close()     // Catch:{ all -> 0x0156 }
                goto L_0x0158
            L_0x0156:
                r13 = move-exception
                goto L_0x015e
            L_0x0158:
                if (r5 == 0) goto L_0x0161
                r5.disconnect()     // Catch:{ all -> 0x0156 }
                goto L_0x0161
            L_0x015e:
                r13.printStackTrace()
            L_0x0161:
                r1.a = r12
                r12 = 1010(0x3f2, float:1.415E-42)
                goto L_0x017c
            L_0x0166:
                r5 = r3
            L_0x0167:
                if (r3 == 0) goto L_0x016f
                r3.close()     // Catch:{ all -> 0x016d }
                goto L_0x016f
            L_0x016d:
                r13 = move-exception
                goto L_0x0175
            L_0x016f:
                if (r5 == 0) goto L_0x0178
                r5.disconnect()     // Catch:{ all -> 0x016d }
                goto L_0x0178
            L_0x0175:
                r13.printStackTrace()
            L_0x0178:
                r1.a = r12
                r12 = 1004(0x3ec, float:1.407E-42)
            L_0x017c:
                r1.b = r12
            L_0x017e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.k.b.a.a(java.lang.String, int):com.ironsource.sdk.k.b$b");
        }

        private static byte[] a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            r2 = a(r7.a, r1);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ironsource.sdk.k.b.C0015b call() {
            /*
                r7 = this;
                java.lang.String r0 = "DownloadManager"
                long r1 = r7.d
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L_0x000e
                r1 = 1
                r7.d = r1
            L_0x000e:
                r1 = 0
                r2 = 0
            L_0x0010:
                long r3 = (long) r1
                long r5 = r7.d
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                r4 = 1009(0x3f1, float:1.414E-42)
                if (r3 >= 0) goto L_0x002a
                java.lang.String r2 = r7.a
                com.ironsource.sdk.k.b$b r2 = r7.a(r2, r1)
                int r3 = r2.b
                r5 = 1008(0x3f0, float:1.413E-42)
                if (r3 == r5) goto L_0x0027
                if (r3 != r4) goto L_0x002a
            L_0x0027:
                int r1 = r1 + 1
                goto L_0x0010
            L_0x002a:
                if (r2 == 0) goto L_0x00ab
                byte[] r1 = r2.c
                if (r1 == 0) goto L_0x00ab
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = r7.b
                r1.append(r3)
                java.lang.String r3 = java.io.File.separator
                r1.append(r3)
                java.lang.String r3 = r7.c
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = r7.e
                r3.append(r5)
                java.lang.String r5 = java.io.File.separator
                r3.append(r5)
                java.lang.String r5 = "tmp_"
                r3.append(r5)
                java.lang.String r5 = r7.c
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                byte[] r5 = r2.c     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                int r5 = com.ironsource.sdk.utils.IronSourceStorageUtils.saveFile(r5, r3)     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                if (r5 != 0) goto L_0x0072
                r1 = 1006(0x3ee, float:1.41E-42)
                r2.b = r1     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                goto L_0x00ab
            L_0x0072:
                boolean r1 = com.ironsource.sdk.utils.IronSourceStorageUtils.renameFile(r3, r1)     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                if (r1 != 0) goto L_0x00ab
                r1 = 1020(0x3fc, float:1.43E-42)
                r2.b = r1     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                goto L_0x00ab
            L_0x007d:
                r1 = move-exception
                java.lang.String r3 = r1.getMessage()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x008f
                java.lang.String r1 = r1.getMessage()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
            L_0x008f:
                r0 = 1019(0x3fb, float:1.428E-42)
                goto L_0x00a9
            L_0x0092:
                r1 = move-exception
                java.lang.String r3 = r1.getMessage()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x00a4
                java.lang.String r1 = r1.getMessage()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
            L_0x00a4:
                r2.b = r4
                goto L_0x00ab
            L_0x00a7:
                r0 = 1018(0x3fa, float:1.427E-42)
            L_0x00a9:
                r2.b = r0
            L_0x00ab:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.k.b.a.call():com.ironsource.sdk.k.b$b");
        }
    }

    /* renamed from: com.ironsource.sdk.k.b$b  reason: collision with other inner class name */
    static class C0015b {
        public String a;
        int b;
        byte[] c;

        C0015b() {
        }
    }

    static class c implements Runnable {
        private final long a = 3;
        private final String b;
        private Handler c;
        private String d;
        private String e;
        private String f;
        private long g;
        private JSONObject h;

        c(com.ironsource.sdk.h.c cVar, String str, Handler handler, String str2, JSONObject jSONObject) {
            this.d = str;
            this.e = cVar.getParent();
            this.f = cVar.getName();
            this.g = 3;
            this.c = handler;
            this.b = str2;
            this.h = jSONObject;
        }

        public final void run() {
            int i;
            com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(this.e, this.f);
            Message message = new Message();
            message.obj = cVar;
            String makeDir = IronSourceStorageUtils.makeDir(cVar.getParent());
            if (makeDir == null) {
                i = 1020;
            } else {
                C0015b a2 = new a(this.d, makeDir, cVar.getName(), this.g, this.b, this.h).call();
                i = a2.b == 200 ? PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW : a2.b;
            }
            message.what = i;
            this.c.sendMessage(message);
        }
    }

    private b(String str, com.ironsource.environment.e.a aVar, JSONObject jSONObject) {
        this.b = str;
        this.c = jSONObject;
        IronSourceStorageUtils.deleteFolder(c());
        IronSourceStorageUtils.makeDir(c());
    }

    public static synchronized b a(String str, com.ironsource.environment.e.a aVar, JSONObject jSONObject) {
        b bVar;
        synchronized (b.class) {
            if (d == null) {
                d = new b(str, aVar, jSONObject);
            }
            bVar = d;
        }
        return bVar;
    }

    private String c() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.b, "temp");
    }

    public final synchronized void a() {
        d = null;
        a aVar = this.a;
        if (aVar != null) {
            aVar.a = null;
            this.a = null;
        }
    }

    public final void a(com.ironsource.sdk.h.c cVar, String str) {
        Thread thread = new Thread(new c(cVar, str, this.a, c(), this.c));
        this.e = thread;
        thread.start();
    }

    public final void a(com.ironsource.sdk.h.c cVar, String str, Handler handler) {
        new Thread(new c(cVar, str, handler, c(), this.c)).start();
    }

    public final boolean b() {
        Thread thread = this.e;
        return thread != null && thread.isAlive();
    }
}
