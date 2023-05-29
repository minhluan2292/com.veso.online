package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzzd implements zzzp {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final zzzc zzc = new zzzc(zzyz.zza);
    private static final zzzc zzd = new zzzc(zzza.zza);

    private static final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzagr());
                return;
            case 1:
                list.add(new zzagu());
                return;
            case 2:
                list.add(new zzagx(0));
                return;
            case 3:
                list.add(new zzaax(0));
                return;
            case 4:
                zzzi zza2 = zzc.zza(0);
                if (zza2 != null) {
                    list.add(zza2);
                    return;
                } else {
                    list.add(new zzabo(0));
                    return;
                }
            case 5:
                list.add(new zzabr());
                return;
            case 6:
                list.add(new zzaei(0));
                return;
            case 7:
                list.add(new zzaeq(0));
                return;
            case 8:
                list.add(new zzafl(0, (zzel) null));
                list.add(new zzafq(0));
                return;
            case 9:
                list.add(new zzagf());
                return;
            case 10:
                list.add(new zzaia());
                return;
            case 11:
                list.add(new zzaik(1, 0, 112800));
                return;
            case 12:
                list.add(new zzaiw());
                return;
            case 14:
                list.add(new zzabw());
                return;
            case 15:
                zzzi zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    return;
                }
                return;
            case 16:
                list.add(new zzabc());
                return;
            default:
                return;
        }
    }

    public final synchronized zzzi[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v76, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x017d, code lost:
        r3 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0180, code lost:
        r3 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0182, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0185, code lost:
        r3 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0187, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0189, code lost:
        r3 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x018c, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x018e, code lost:
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0190, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0192, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0194, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016d, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x016e, code lost:
        switch(r3) {
            case 0: goto L_0x0194;
            case 1: goto L_0x0194;
            case 2: goto L_0x0194;
            case 3: goto L_0x0192;
            case 4: goto L_0x0190;
            case 5: goto L_0x0190;
            case 6: goto L_0x0190;
            case 7: goto L_0x018e;
            case 8: goto L_0x018c;
            case 9: goto L_0x0189;
            case 10: goto L_0x0187;
            case 11: goto L_0x0187;
            case 12: goto L_0x0187;
            case 13: goto L_0x0187;
            case 14: goto L_0x0187;
            case 15: goto L_0x0185;
            case 16: goto L_0x0182;
            case 17: goto L_0x0182;
            case 18: goto L_0x0182;
            case 19: goto L_0x0180;
            case 20: goto L_0x017d;
            case 21: goto L_0x017b;
            case 22: goto L_0x0179;
            case 23: goto L_0x0177;
            case 24: goto L_0x0175;
            case 25: goto L_0x0173;
            default: goto L_0x0171;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0173, code lost:
        r3 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0175, code lost:
        r3 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0177, code lost:
        r3 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0179, code lost:
        r3 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x017b, code lost:
        r3 = 11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0313  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzzi[] zzb(android.net.Uri r21, java.util.Map r22) {
        /*
            r20 = this;
            monitor-enter(r20)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x032d }
            r1 = 16
            r0.<init>(r1)     // Catch:{ all -> 0x032d }
            java.lang.String r2 = "Content-Type"
            r3 = r22
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x032d }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x032d }
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0024
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x001d
            goto L_0x0024
        L_0x001d:
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x032d }
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x032d }
        L_0x0024:
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 14
            r10 = 13
            r11 = 12
            r12 = 11
            r13 = 9
            r14 = 6
            r15 = 1
            r16 = 15
            r17 = 10
            r18 = 8
            r2 = -1
            if (r3 != 0) goto L_0x003f
        L_0x003c:
            r3 = r2
            goto L_0x0195
        L_0x003f:
            java.lang.String r3 = com.google.android.gms.internal.ads.zzbt.zze(r3)     // Catch:{ all -> 0x032d }
            int r19 = r3.hashCode()     // Catch:{ all -> 0x032d }
            switch(r19) {
                case -2123537834: goto L_0x0163;
                case -1662384011: goto L_0x0158;
                case -1662384007: goto L_0x014d;
                case -1662095187: goto L_0x0143;
                case -1606874997: goto L_0x0139;
                case -1487394660: goto L_0x012e;
                case -1248337486: goto L_0x0123;
                case -1079884372: goto L_0x0118;
                case -1004728940: goto L_0x010d;
                case -387023398: goto L_0x0102;
                case -43467528: goto L_0x00f7;
                case 13915911: goto L_0x00eb;
                case 187078296: goto L_0x00e0;
                case 187078297: goto L_0x00d5;
                case 187078669: goto L_0x00ca;
                case 187090232: goto L_0x00be;
                case 187091926: goto L_0x00b2;
                case 187099443: goto L_0x00a6;
                case 1331848029: goto L_0x009b;
                case 1503095341: goto L_0x0090;
                case 1504578661: goto L_0x0085;
                case 1504619009: goto L_0x007a;
                case 1504824762: goto L_0x006f;
                case 1504831518: goto L_0x0063;
                case 1505118770: goto L_0x0058;
                case 2039520277: goto L_0x004c;
                default: goto L_0x004a;
            }     // Catch:{ all -> 0x032d }
        L_0x004a:
            goto L_0x016d
        L_0x004c:
            java.lang.String r4 = "video/x-matroska"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r17
            goto L_0x016e
        L_0x0058:
            java.lang.String r4 = "audio/webm"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r10
            goto L_0x016e
        L_0x0063:
            java.lang.String r4 = "audio/mpeg"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r16
            goto L_0x016e
        L_0x006f:
            java.lang.String r4 = "audio/midi"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r13
            goto L_0x016e
        L_0x007a:
            java.lang.String r4 = "audio/flac"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = 7
            goto L_0x016e
        L_0x0085:
            java.lang.String r4 = "audio/eac3"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r15
            goto L_0x016e
        L_0x0090:
            java.lang.String r4 = "audio/3gpp"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r6
            goto L_0x016e
        L_0x009b:
            java.lang.String r4 = "video/mp4"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r1
            goto L_0x016e
        L_0x00a6:
            java.lang.String r4 = "audio/wav"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = 22
            goto L_0x016e
        L_0x00b2:
            java.lang.String r4 = "audio/ogg"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = 19
            goto L_0x016e
        L_0x00be:
            java.lang.String r4 = "audio/mp4"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = 17
            goto L_0x016e
        L_0x00ca:
            java.lang.String r4 = "audio/amr"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r7
            goto L_0x016e
        L_0x00d5:
            java.lang.String r4 = "audio/ac4"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r8
            goto L_0x016e
        L_0x00e0:
            java.lang.String r4 = "audio/ac3"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = 0
            goto L_0x016e
        L_0x00eb:
            java.lang.String r4 = "video/x-flv"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r18
            goto L_0x016e
        L_0x00f7:
            java.lang.String r4 = "application/webm"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r9
            goto L_0x016e
        L_0x0102:
            java.lang.String r4 = "audio/x-matroska"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r12
            goto L_0x016e
        L_0x010d:
            java.lang.String r4 = "text/vtt"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = 23
            goto L_0x016e
        L_0x0118:
            java.lang.String r4 = "video/x-msvideo"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = 25
            goto L_0x016e
        L_0x0123:
            java.lang.String r4 = "application/mp4"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = 18
            goto L_0x016e
        L_0x012e:
            java.lang.String r4 = "image/jpeg"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = 24
            goto L_0x016e
        L_0x0139:
            java.lang.String r4 = "audio/amr-wb"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r14
            goto L_0x016e
        L_0x0143:
            java.lang.String r4 = "video/webm"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = r11
            goto L_0x016e
        L_0x014d:
            java.lang.String r4 = "video/mp2t"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = 21
            goto L_0x016e
        L_0x0158:
            java.lang.String r4 = "video/mp2p"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = 20
            goto L_0x016e
        L_0x0163:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x016d
            r3 = 2
            goto L_0x016e
        L_0x016d:
            r3 = r2
        L_0x016e:
            switch(r3) {
                case 0: goto L_0x0194;
                case 1: goto L_0x0194;
                case 2: goto L_0x0194;
                case 3: goto L_0x0192;
                case 4: goto L_0x0190;
                case 5: goto L_0x0190;
                case 6: goto L_0x0190;
                case 7: goto L_0x018e;
                case 8: goto L_0x018c;
                case 9: goto L_0x0189;
                case 10: goto L_0x0187;
                case 11: goto L_0x0187;
                case 12: goto L_0x0187;
                case 13: goto L_0x0187;
                case 14: goto L_0x0187;
                case 15: goto L_0x0185;
                case 16: goto L_0x0182;
                case 17: goto L_0x0182;
                case 18: goto L_0x0182;
                case 19: goto L_0x0180;
                case 20: goto L_0x017d;
                case 21: goto L_0x017b;
                case 22: goto L_0x0179;
                case 23: goto L_0x0177;
                case 24: goto L_0x0175;
                case 25: goto L_0x0173;
                default: goto L_0x0171;
            }     // Catch:{ all -> 0x032d }
        L_0x0171:
            goto L_0x003c
        L_0x0173:
            r3 = r1
            goto L_0x0195
        L_0x0175:
            r3 = r9
            goto L_0x0195
        L_0x0177:
            r3 = r10
            goto L_0x0195
        L_0x0179:
            r3 = r11
            goto L_0x0195
        L_0x017b:
            r3 = r12
            goto L_0x0195
        L_0x017d:
            r3 = r17
            goto L_0x0195
        L_0x0180:
            r3 = r13
            goto L_0x0195
        L_0x0182:
            r3 = r18
            goto L_0x0195
        L_0x0185:
            r3 = 7
            goto L_0x0195
        L_0x0187:
            r3 = r14
            goto L_0x0195
        L_0x0189:
            r3 = r16
            goto L_0x0195
        L_0x018c:
            r3 = r6
            goto L_0x0195
        L_0x018e:
            r3 = r7
            goto L_0x0195
        L_0x0190:
            r3 = r8
            goto L_0x0195
        L_0x0192:
            r3 = r15
            goto L_0x0195
        L_0x0194:
            r3 = 0
        L_0x0195:
            if (r3 == r2) goto L_0x019a
            zzc(r3, r0)     // Catch:{ all -> 0x032d }
        L_0x019a:
            java.lang.String r4 = r21.getLastPathSegment()     // Catch:{ all -> 0x032d }
            if (r4 != 0) goto L_0x01a3
        L_0x01a0:
            r9 = r2
            goto L_0x0307
        L_0x01a3:
            java.lang.String r5 = ".ac3"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x0306
            java.lang.String r5 = ".ec3"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x01b5
            goto L_0x0306
        L_0x01b5:
            java.lang.String r5 = ".ac4"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x01c0
            r9 = r15
            goto L_0x0307
        L_0x01c0:
            java.lang.String r5 = ".adts"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x0304
            java.lang.String r5 = ".aac"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x01d2
            goto L_0x0304
        L_0x01d2:
            java.lang.String r5 = ".amr"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x01dd
            r9 = r8
            goto L_0x0307
        L_0x01dd:
            java.lang.String r5 = ".flac"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x01e8
            r9 = r7
            goto L_0x0307
        L_0x01e8:
            java.lang.String r5 = ".flv"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x01f3
            r9 = r6
            goto L_0x0307
        L_0x01f3:
            java.lang.String r5 = ".mid"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x0301
            java.lang.String r5 = ".midi"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x0301
            java.lang.String r5 = ".smf"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x020d
            goto L_0x0301
        L_0x020d:
            java.lang.String r5 = ".mk"
            int r6 = r4.length()     // Catch:{ all -> 0x032d }
            int r6 = r6 + -4
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x02ff
            java.lang.String r5 = ".webm"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x0225
            goto L_0x02ff
        L_0x0225:
            java.lang.String r5 = ".mp3"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x0230
            r9 = 7
            goto L_0x0307
        L_0x0230:
            java.lang.String r5 = ".mp4"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x02fc
            java.lang.String r5 = ".m4"
            int r6 = r4.length()     // Catch:{ all -> 0x032d }
            int r6 = r6 + -4
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x02fc
            java.lang.String r5 = ".mp4"
            int r6 = r4.length()     // Catch:{ all -> 0x032d }
            int r6 = r6 + -5
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x02fc
            java.lang.String r5 = ".cmf"
            int r6 = r4.length()     // Catch:{ all -> 0x032d }
            int r6 = r6 + -5
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x0264
            goto L_0x02fc
        L_0x0264:
            java.lang.String r5 = ".og"
            int r6 = r4.length()     // Catch:{ all -> 0x032d }
            int r6 = r6 + -4
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x02fa
            java.lang.String r5 = ".opus"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x027c
            goto L_0x02fa
        L_0x027c:
            java.lang.String r5 = ".ps"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x02f7
            java.lang.String r5 = ".mpeg"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x02f7
            java.lang.String r5 = ".mpg"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x02f7
            java.lang.String r5 = ".m2p"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x029d
            goto L_0x02f7
        L_0x029d:
            java.lang.String r5 = ".ts"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x02f5
            java.lang.String r5 = ".ts"
            int r6 = r4.length()     // Catch:{ all -> 0x032d }
            int r6 = r6 + -4
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x02b4
            goto L_0x02f5
        L_0x02b4:
            java.lang.String r5 = ".wav"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x02f3
            java.lang.String r5 = ".wave"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x02c5
            goto L_0x02f3
        L_0x02c5:
            java.lang.String r5 = ".vtt"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x02f1
            java.lang.String r5 = ".webvtt"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x02d6
            goto L_0x02f1
        L_0x02d6:
            java.lang.String r5 = ".jpg"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 != 0) goto L_0x0307
            java.lang.String r5 = ".jpeg"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x02e7
            goto L_0x0307
        L_0x02e7:
            java.lang.String r5 = ".avi"
            boolean r4 = r4.endsWith(r5)     // Catch:{ all -> 0x032d }
            if (r4 == 0) goto L_0x01a0
            r9 = r1
            goto L_0x0307
        L_0x02f1:
            r9 = r10
            goto L_0x0307
        L_0x02f3:
            r9 = r11
            goto L_0x0307
        L_0x02f5:
            r9 = r12
            goto L_0x0307
        L_0x02f7:
            r9 = r17
            goto L_0x0307
        L_0x02fa:
            r9 = r13
            goto L_0x0307
        L_0x02fc:
            r9 = r18
            goto L_0x0307
        L_0x02ff:
            r9 = r14
            goto L_0x0307
        L_0x0301:
            r9 = r16
            goto L_0x0307
        L_0x0304:
            r9 = 2
            goto L_0x0307
        L_0x0306:
            r9 = 0
        L_0x0307:
            if (r9 == r2) goto L_0x030e
            if (r9 == r3) goto L_0x030e
            zzc(r9, r0)     // Catch:{ all -> 0x032d }
        L_0x030e:
            int[] r2 = zza     // Catch:{ all -> 0x032d }
            r4 = 0
        L_0x0311:
            if (r4 >= r1) goto L_0x031f
            r5 = r2[r4]     // Catch:{ all -> 0x032d }
            if (r5 == r3) goto L_0x031c
            if (r5 == r9) goto L_0x031c
            zzc(r5, r0)     // Catch:{ all -> 0x032d }
        L_0x031c:
            int r4 = r4 + 1
            goto L_0x0311
        L_0x031f:
            int r1 = r0.size()     // Catch:{ all -> 0x032d }
            com.google.android.gms.internal.ads.zzzi[] r1 = new com.google.android.gms.internal.ads.zzzi[r1]     // Catch:{ all -> 0x032d }
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ all -> 0x032d }
            com.google.android.gms.internal.ads.zzzi[] r0 = (com.google.android.gms.internal.ads.zzzi[]) r0     // Catch:{ all -> 0x032d }
            monitor-exit(r20)
            return r0
        L_0x032d:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzd.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzzi[]");
    }
}
