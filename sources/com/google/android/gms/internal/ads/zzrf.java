package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzrf {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzqz {
        int i;
        int i2 = zzd;
        if (i2 == -1) {
            zzqn zzc2 = zzc("video/avc", false, false);
            if (zzc2 != null) {
                int i3 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzg()) {
                    int i4 = codecProfileLevel.level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                }
                i2 = Math.max(i3, zzen.zza >= 21 ? 345600 : 172800);
            } else {
                i2 = 0;
            }
            zzd = i2;
        }
        return i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0779  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x078e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair zzb(com.google.android.gms.internal.ads.zzaf r17) {
        /*
            r0 = r17
            java.lang.String r1 = r0.zzj
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = r0.zzm
            java.lang.String r4 = "video/dolby-vision"
            boolean r3 = r4.equals(r3)
            r7 = 512(0x200, float:7.175E-43)
            r8 = 256(0x100, float:3.59E-43)
            r9 = 128(0x80, float:1.794E-43)
            r11 = 64
            r12 = 32
            r14 = 4096(0x1000, float:5.74E-42)
            r15 = 16
            r5 = 8
            r2 = 3
            r10 = 4
            r13 = 2
            java.lang.String r4 = "MediaCodecUtil"
            r6 = 1
            if (r3 == 0) goto L_0x01f9
            java.lang.String r0 = r0.zzj
            int r3 = r1.length
            if (r3 >= r2) goto L_0x0043
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
        L_0x0040:
            r2 = 0
            goto L_0x01f8
        L_0x0043:
            java.util.regex.Pattern r3 = zzb
            r2 = r1[r6]
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x005f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x0040
        L_0x005f:
            java.lang.String r0 = r2.group(r6)
            if (r0 != 0) goto L_0x0068
        L_0x0065:
            r2 = 0
            goto L_0x010d
        L_0x0068:
            int r2 = r0.hashCode()
            switch(r2) {
                case 1536: goto L_0x00cd;
                case 1537: goto L_0x00c3;
                case 1538: goto L_0x00b9;
                case 1539: goto L_0x00af;
                case 1540: goto L_0x00a5;
                case 1541: goto L_0x009b;
                case 1542: goto L_0x0091;
                case 1543: goto L_0x0087;
                case 1544: goto L_0x007d;
                case 1545: goto L_0x0071;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x00d7
        L_0x0071:
            java.lang.String r2 = "09"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 9
            goto L_0x00d8
        L_0x007d:
            java.lang.String r2 = "08"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = r5
            goto L_0x00d8
        L_0x0087:
            java.lang.String r2 = "07"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 7
            goto L_0x00d8
        L_0x0091:
            java.lang.String r2 = "06"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 6
            goto L_0x00d8
        L_0x009b:
            java.lang.String r2 = "05"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 5
            goto L_0x00d8
        L_0x00a5:
            java.lang.String r2 = "04"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = r10
            goto L_0x00d8
        L_0x00af:
            java.lang.String r2 = "03"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 3
            goto L_0x00d8
        L_0x00b9:
            java.lang.String r2 = "02"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = r13
            goto L_0x00d8
        L_0x00c3:
            java.lang.String r2 = "01"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = r6
            goto L_0x00d8
        L_0x00cd:
            java.lang.String r2 = "00"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 0
            goto L_0x00d8
        L_0x00d7:
            r2 = -1
        L_0x00d8:
            switch(r2) {
                case 0: goto L_0x0109;
                case 1: goto L_0x0104;
                case 2: goto L_0x00ff;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00f5;
                case 5: goto L_0x00f0;
                case 6: goto L_0x00eb;
                case 7: goto L_0x00e6;
                case 8: goto L_0x00e1;
                case 9: goto L_0x00dc;
                default: goto L_0x00db;
            }
        L_0x00db:
            goto L_0x0065
        L_0x00dc:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x010d
        L_0x00e1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x010d
        L_0x00e6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x010d
        L_0x00eb:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            goto L_0x010d
        L_0x00f0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            goto L_0x010d
        L_0x00f5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            goto L_0x010d
        L_0x00fa:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x010d
        L_0x00ff:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x010d
        L_0x0104:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            goto L_0x010d
        L_0x0109:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L_0x010d:
            if (r2 != 0) goto L_0x011e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x0040
        L_0x011e:
            r0 = r1[r13]
            if (r0 != 0) goto L_0x0125
        L_0x0122:
            r1 = 0
            goto L_0x01e1
        L_0x0125:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1537: goto L_0x01d5;
                case 1538: goto L_0x01c8;
                case 1539: goto L_0x01bb;
                case 1540: goto L_0x01ae;
                case 1541: goto L_0x01a1;
                case 1542: goto L_0x0194;
                case 1543: goto L_0x0187;
                case 1544: goto L_0x017a;
                case 1545: goto L_0x016c;
                default: goto L_0x012c;
            }
        L_0x012c:
            switch(r1) {
                case 1567: goto L_0x015e;
                case 1568: goto L_0x014e;
                case 1569: goto L_0x013e;
                case 1570: goto L_0x0130;
                default: goto L_0x012f;
            }
        L_0x012f:
            goto L_0x0122
        L_0x0130:
            java.lang.String r1 = "13"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L_0x01e1
        L_0x013e:
            java.lang.String r1 = "12"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            r1 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x01e1
        L_0x014e:
            java.lang.String r1 = "11"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            r1 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x01e1
        L_0x015e:
            java.lang.String r1 = "10"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x01e1
        L_0x016c:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L_0x01e1
        L_0x017a:
            java.lang.String r1 = "08"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x01e1
        L_0x0187:
            java.lang.String r1 = "07"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x01e1
        L_0x0194:
            java.lang.String r1 = "06"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            goto L_0x01e1
        L_0x01a1:
            java.lang.String r1 = "05"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            goto L_0x01e1
        L_0x01ae:
            java.lang.String r1 = "04"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x01e1
        L_0x01bb:
            java.lang.String r1 = "03"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x01e1
        L_0x01c8:
            java.lang.String r1 = "02"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            goto L_0x01e1
        L_0x01d5:
            java.lang.String r1 = "01"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
        L_0x01e1:
            if (r1 != 0) goto L_0x01f2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x0040
        L_0x01f2:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r2 = r0
        L_0x01f8:
            return r2
        L_0x01f9:
            r2 = 0
            r3 = r1[r2]
            int r2 = r3.hashCode()
            switch(r2) {
                case 3004662: goto L_0x0240;
                case 3006243: goto L_0x0236;
                case 3006244: goto L_0x022c;
                case 3199032: goto L_0x0222;
                case 3214780: goto L_0x0218;
                case 3356560: goto L_0x020e;
                case 3624515: goto L_0x0204;
                default: goto L_0x0203;
            }
        L_0x0203:
            goto L_0x024a
        L_0x0204:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = r13
            goto L_0x024b
        L_0x020e:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = 6
            goto L_0x024b
        L_0x0218:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = r10
            goto L_0x024b
        L_0x0222:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = 3
            goto L_0x024b
        L_0x022c:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = r6
            goto L_0x024b
        L_0x0236:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = 0
            goto L_0x024b
        L_0x0240:
            java.lang.String r2 = "av01"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = 5
            goto L_0x024b
        L_0x024a:
            r2 = -1
        L_0x024b:
            r3 = 8192(0x2000, float:1.14794E-41)
            r11 = 20
            switch(r2) {
                case 0: goto L_0x06ff;
                case 1: goto L_0x06ff;
                case 2: goto L_0x062f;
                case 3: goto L_0x03d0;
                case 4: goto L_0x03d0;
                case 5: goto L_0x02e0;
                case 6: goto L_0x0254;
                default: goto L_0x0252;
            }
        L_0x0252:
            r0 = 0
            return r0
        L_0x0254:
            java.lang.String r0 = r0.zzj
            int r2 = r1.length
            r3 = 3
            if (r2 == r3) goto L_0x026a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
        L_0x0267:
            r2 = 0
            goto L_0x02df
        L_0x026a:
            java.lang.String r2 = "audio/mp4a-latm"
            r3 = r1[r6]     // Catch:{ NumberFormatException -> 0x02d1 }
            int r3 = java.lang.Integer.parseInt(r3, r15)     // Catch:{ NumberFormatException -> 0x02d1 }
            java.lang.String r3 = com.google.android.gms.internal.ads.zzbt.zzd(r3)     // Catch:{ NumberFormatException -> 0x02d1 }
            boolean r2 = r2.equals(r3)     // Catch:{ NumberFormatException -> 0x02d1 }
            if (r2 == 0) goto L_0x0267
            r1 = r1[r13]     // Catch:{ NumberFormatException -> 0x02d1 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x02d1 }
            r2 = 17
            if (r1 == r2) goto L_0x02bc
            if (r1 == r11) goto L_0x02ba
            r2 = 23
            if (r1 == r2) goto L_0x02b7
            r2 = 29
            if (r1 == r2) goto L_0x02b4
            r2 = 39
            if (r1 == r2) goto L_0x02b1
            r2 = 42
            if (r1 == r2) goto L_0x02ae
            switch(r1) {
                case 1: goto L_0x02ab;
                case 2: goto L_0x02a9;
                case 3: goto L_0x02a6;
                case 4: goto L_0x02a4;
                case 5: goto L_0x02a1;
                case 6: goto L_0x029e;
                default: goto L_0x029b;
            }     // Catch:{ NumberFormatException -> 0x02d1 }
        L_0x029b:
            r1 = -1
            r5 = -1
            goto L_0x02bf
        L_0x029e:
            r1 = -1
            r5 = 6
            goto L_0x02bf
        L_0x02a1:
            r1 = -1
            r5 = 5
            goto L_0x02bf
        L_0x02a4:
            r5 = r10
            goto L_0x02ac
        L_0x02a6:
            r1 = -1
            r5 = 3
            goto L_0x02bf
        L_0x02a9:
            r5 = r13
            goto L_0x02ac
        L_0x02ab:
            r5 = r6
        L_0x02ac:
            r1 = -1
            goto L_0x02bf
        L_0x02ae:
            r5 = 42
            goto L_0x02ac
        L_0x02b1:
            r5 = 39
            goto L_0x02ac
        L_0x02b4:
            r5 = 29
            goto L_0x02ac
        L_0x02b7:
            r5 = 23
            goto L_0x02ac
        L_0x02ba:
            r5 = r11
            goto L_0x02ac
        L_0x02bc:
            r5 = 17
            goto L_0x02ac
        L_0x02bf:
            if (r5 == r1) goto L_0x0267
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x02d1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x02d1 }
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x02d1 }
            r1.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x02d1 }
            r2 = r1
            goto L_0x02df
        L_0x02d1:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x0267
        L_0x02df:
            return r2
        L_0x02e0:
            java.lang.String r2 = r0.zzj
            com.google.android.gms.internal.ads.zzq r0 = r0.zzy
            int r11 = r1.length
            if (r11 >= r10) goto L_0x02f7
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
        L_0x02f4:
            r2 = 0
            goto L_0x03cf
        L_0x02f7:
            r11 = r1[r6]     // Catch:{ NumberFormatException -> 0x03c0 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x03c0 }
            r15 = r1[r13]     // Catch:{ NumberFormatException -> 0x03c0 }
            r8 = 0
            java.lang.String r8 = r15.substring(r8, r13)     // Catch:{ NumberFormatException -> 0x03c0 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x03c0 }
            r15 = 3
            r1 = r1[r15]     // Catch:{ NumberFormatException -> 0x03c0 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x03c0 }
            if (r11 == 0) goto L_0x0326
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown AV1 profile: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x02f4
        L_0x0326:
            if (r1 == r5) goto L_0x0353
            r2 = 10
            if (r1 == r2) goto L_0x0341
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unknown AV1 bit depth: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x02f4
        L_0x0341:
            if (r0 == 0) goto L_0x0351
            byte[] r1 = r0.zze
            if (r1 != 0) goto L_0x034f
            int r0 = r0.zzd
            r1 = 7
            if (r0 == r1) goto L_0x034f
            r1 = 6
            if (r0 != r1) goto L_0x0351
        L_0x034f:
            r0 = r14
            goto L_0x0354
        L_0x0351:
            r0 = r13
            goto L_0x0354
        L_0x0353:
            r0 = r6
        L_0x0354:
            switch(r8) {
                case 0: goto L_0x0398;
                case 1: goto L_0x0396;
                case 2: goto L_0x0394;
                case 3: goto L_0x0392;
                case 4: goto L_0x038f;
                case 5: goto L_0x038d;
                case 6: goto L_0x038a;
                case 7: goto L_0x0388;
                case 8: goto L_0x0385;
                case 9: goto L_0x0383;
                case 10: goto L_0x0380;
                case 11: goto L_0x037d;
                case 12: goto L_0x037b;
                case 13: goto L_0x0379;
                case 14: goto L_0x0376;
                case 15: goto L_0x0372;
                case 16: goto L_0x036f;
                case 17: goto L_0x036c;
                case 18: goto L_0x0369;
                case 19: goto L_0x0366;
                case 20: goto L_0x0363;
                case 21: goto L_0x0360;
                case 22: goto L_0x035d;
                case 23: goto L_0x035a;
                default: goto L_0x0357;
            }
        L_0x0357:
            r1 = -1
            goto L_0x0399
        L_0x035a:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0399
        L_0x035d:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0399
        L_0x0360:
            r1 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0399
        L_0x0363:
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0399
        L_0x0366:
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0399
        L_0x0369:
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0399
        L_0x036c:
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0399
        L_0x036f:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0399
        L_0x0372:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0399
        L_0x0376:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0399
        L_0x0379:
            r1 = r3
            goto L_0x0399
        L_0x037b:
            r1 = r14
            goto L_0x0399
        L_0x037d:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0399
        L_0x0380:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x0399
        L_0x0383:
            r1 = r7
            goto L_0x0399
        L_0x0385:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0399
        L_0x0388:
            r1 = r9
            goto L_0x0399
        L_0x038a:
            r1 = 64
            goto L_0x0399
        L_0x038d:
            r1 = r12
            goto L_0x0399
        L_0x038f:
            r1 = 16
            goto L_0x0399
        L_0x0392:
            r1 = r5
            goto L_0x0399
        L_0x0394:
            r1 = r10
            goto L_0x0399
        L_0x0396:
            r1 = r13
            goto L_0x0399
        L_0x0398:
            r1 = r6
        L_0x0399:
            r2 = -1
            if (r1 != r2) goto L_0x03b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown AV1 level: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x02f4
        L_0x03b2:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r0, r1)
            goto L_0x03cf
        L_0x03c0:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x02f4
        L_0x03cf:
            return r2
        L_0x03d0:
            java.lang.String r0 = r0.zzj
            int r2 = r1.length
            if (r2 >= r10) goto L_0x03e5
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
        L_0x03e2:
            r2 = 0
            goto L_0x062e
        L_0x03e5:
            java.util.regex.Pattern r2 = zzb
            r8 = r1[r6]
            java.util.regex.Matcher r2 = r2.matcher(r8)
            boolean r8 = r2.matches()
            if (r8 != 0) goto L_0x0401
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x03e2
        L_0x0401:
            java.lang.String r0 = r2.group(r6)
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0410
            r0 = r6
        L_0x040e:
            r2 = 3
            goto L_0x041a
        L_0x0410:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x061f
            r0 = r13
            goto L_0x040e
        L_0x041a:
            r1 = r1[r2]
            if (r1 != 0) goto L_0x0421
        L_0x041e:
            r2 = 0
            goto L_0x0603
        L_0x0421:
            int r2 = r1.hashCode()
            switch(r2) {
                case 70821: goto L_0x0544;
                case 70914: goto L_0x0539;
                case 70917: goto L_0x052e;
                case 71007: goto L_0x0523;
                case 71010: goto L_0x0518;
                case 74665: goto L_0x050e;
                case 74758: goto L_0x0504;
                case 74761: goto L_0x04fa;
                case 74851: goto L_0x04f0;
                case 74854: goto L_0x04e5;
                case 2193639: goto L_0x04d9;
                case 2193642: goto L_0x04cd;
                case 2193732: goto L_0x04c2;
                case 2193735: goto L_0x04b6;
                case 2193738: goto L_0x04aa;
                case 2193825: goto L_0x049e;
                case 2193828: goto L_0x0492;
                case 2193831: goto L_0x0486;
                case 2312803: goto L_0x047b;
                case 2312806: goto L_0x0470;
                case 2312896: goto L_0x0465;
                case 2312899: goto L_0x045a;
                case 2312902: goto L_0x044e;
                case 2312989: goto L_0x0442;
                case 2312992: goto L_0x0436;
                case 2312995: goto L_0x042a;
                default: goto L_0x0428;
            }
        L_0x0428:
            goto L_0x054f
        L_0x042a:
            java.lang.String r2 = "L186"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 12
            goto L_0x0550
        L_0x0436:
            java.lang.String r2 = "L183"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 11
            goto L_0x0550
        L_0x0442:
            java.lang.String r2 = "L180"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 10
            goto L_0x0550
        L_0x044e:
            java.lang.String r2 = "L156"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 9
            goto L_0x0550
        L_0x045a:
            java.lang.String r2 = "L153"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = r5
            goto L_0x0550
        L_0x0465:
            java.lang.String r2 = "L150"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 7
            goto L_0x0550
        L_0x0470:
            java.lang.String r2 = "L123"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 6
            goto L_0x0550
        L_0x047b:
            java.lang.String r2 = "L120"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 5
            goto L_0x0550
        L_0x0486:
            java.lang.String r2 = "H186"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 25
            goto L_0x0550
        L_0x0492:
            java.lang.String r2 = "H183"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 24
            goto L_0x0550
        L_0x049e:
            java.lang.String r2 = "H180"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 23
            goto L_0x0550
        L_0x04aa:
            java.lang.String r2 = "H156"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 22
            goto L_0x0550
        L_0x04b6:
            java.lang.String r2 = "H153"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 21
            goto L_0x0550
        L_0x04c2:
            java.lang.String r2 = "H150"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = r11
            goto L_0x0550
        L_0x04cd:
            java.lang.String r2 = "H123"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 19
            goto L_0x0550
        L_0x04d9:
            java.lang.String r2 = "H120"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 18
            goto L_0x0550
        L_0x04e5:
            java.lang.String r2 = "L93"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = r10
            goto L_0x0550
        L_0x04f0:
            java.lang.String r2 = "L90"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 3
            goto L_0x0550
        L_0x04fa:
            java.lang.String r2 = "L63"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = r13
            goto L_0x0550
        L_0x0504:
            java.lang.String r2 = "L60"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = r6
            goto L_0x0550
        L_0x050e:
            java.lang.String r2 = "L30"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 0
            goto L_0x0550
        L_0x0518:
            java.lang.String r2 = "H93"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 17
            goto L_0x0550
        L_0x0523:
            java.lang.String r2 = "H90"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 16
            goto L_0x0550
        L_0x052e:
            java.lang.String r2 = "H63"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 15
            goto L_0x0550
        L_0x0539:
            java.lang.String r2 = "H60"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 14
            goto L_0x0550
        L_0x0544:
            java.lang.String r2 = "H30"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x054f
            r2 = 13
            goto L_0x0550
        L_0x054f:
            r2 = -1
        L_0x0550:
            switch(r2) {
                case 0: goto L_0x05ff;
                case 1: goto L_0x05fa;
                case 2: goto L_0x05f3;
                case 3: goto L_0x05ec;
                case 4: goto L_0x05e5;
                case 5: goto L_0x05de;
                case 6: goto L_0x05d9;
                case 7: goto L_0x05d2;
                case 8: goto L_0x05cb;
                case 9: goto L_0x05c4;
                case 10: goto L_0x05bd;
                case 11: goto L_0x05b6;
                case 12: goto L_0x05af;
                case 13: goto L_0x05aa;
                case 14: goto L_0x05a5;
                case 15: goto L_0x05a0;
                case 16: goto L_0x059a;
                case 17: goto L_0x0594;
                case 18: goto L_0x058c;
                case 19: goto L_0x0586;
                case 20: goto L_0x057d;
                case 21: goto L_0x0575;
                case 22: goto L_0x056d;
                case 23: goto L_0x0565;
                case 24: goto L_0x055d;
                case 25: goto L_0x0555;
                default: goto L_0x0553;
            }
        L_0x0553:
            goto L_0x041e
        L_0x0555:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x055d:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x0565:
            r2 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x056d:
            r2 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x0575:
            r2 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x057d:
            r2 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x0586:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x0603
        L_0x058c:
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x0594:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0603
        L_0x059a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x0603
        L_0x05a0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            goto L_0x0603
        L_0x05a5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x0603
        L_0x05aa:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            goto L_0x0603
        L_0x05af:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x05b6:
            r2 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x05bd:
            r2 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x05c4:
            r2 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x05cb:
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x05d2:
            r2 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x05d9:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x0603
        L_0x05de:
            r8 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x0603
        L_0x05e5:
            r15 = 256(0x100, float:3.59E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            goto L_0x0603
        L_0x05ec:
            r16 = 64
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            goto L_0x0603
        L_0x05f3:
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0603
        L_0x05fa:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x0603
        L_0x05ff:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L_0x0603:
            if (r2 != 0) goto L_0x0614
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Unknown HEVC level string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x03e2
        L_0x0614:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r0, r2)
            r2 = r1
            goto L_0x062e
        L_0x061f:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown HEVC profile string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x03e2
        L_0x062e:
            return r2
        L_0x062f:
            r15 = r8
            r2 = 2048(0x800, float:2.87E-42)
            r16 = 64
            java.lang.String r0 = r0.zzj
            int r8 = r1.length
            r2 = 3
            if (r8 >= r2) goto L_0x064a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
        L_0x0647:
            r2 = 0
            goto L_0x06fe
        L_0x064a:
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x06ef }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x06ef }
            r1 = r1[r13]     // Catch:{ NumberFormatException -> 0x06ef }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x06ef }
            if (r2 == 0) goto L_0x0667
            if (r2 == r6) goto L_0x0665
            if (r2 == r13) goto L_0x0663
            r1 = 3
            if (r2 == r1) goto L_0x0661
            r1 = -1
            goto L_0x0668
        L_0x0661:
            r1 = r5
            goto L_0x0668
        L_0x0663:
            r1 = r10
            goto L_0x0668
        L_0x0665:
            r1 = r13
            goto L_0x0668
        L_0x0667:
            r1 = r6
        L_0x0668:
            r8 = -1
            if (r1 != r8) goto L_0x0680
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown VP9 profile: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x0647
        L_0x0680:
            r2 = 10
            if (r0 == r2) goto L_0x06c8
            r2 = 11
            if (r0 == r2) goto L_0x06c7
            if (r0 == r11) goto L_0x06c5
            r2 = 21
            if (r0 == r2) goto L_0x06c3
            r2 = 30
            if (r0 == r2) goto L_0x06bf
            r2 = 31
            if (r0 == r2) goto L_0x06bd
            r2 = 40
            if (r0 == r2) goto L_0x06ba
            r2 = 41
            if (r0 == r2) goto L_0x06b8
            r2 = 50
            if (r0 == r2) goto L_0x06b6
            r2 = 51
            if (r0 == r2) goto L_0x06b4
            switch(r0) {
                case 60: goto L_0x06b0;
                case 61: goto L_0x06ae;
                case 62: goto L_0x06ac;
                default: goto L_0x06a9;
            }
        L_0x06a9:
            r2 = -1
            r6 = -1
            goto L_0x06c9
        L_0x06ac:
            r6 = r3
            goto L_0x06c8
        L_0x06ae:
            r6 = r14
            goto L_0x06c8
        L_0x06b0:
            r2 = -1
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x06c9
        L_0x06b4:
            r6 = r7
            goto L_0x06c8
        L_0x06b6:
            r6 = r15
            goto L_0x06c8
        L_0x06b8:
            r6 = r9
            goto L_0x06c8
        L_0x06ba:
            r6 = r16
            goto L_0x06c8
        L_0x06bd:
            r6 = r12
            goto L_0x06c8
        L_0x06bf:
            r2 = -1
            r6 = 16
            goto L_0x06c9
        L_0x06c3:
            r6 = r5
            goto L_0x06c8
        L_0x06c5:
            r6 = r10
            goto L_0x06c8
        L_0x06c7:
            r6 = r13
        L_0x06c8:
            r2 = -1
        L_0x06c9:
            if (r6 != r2) goto L_0x06e1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown VP9 level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x0647
        L_0x06e1:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2.<init>(r0, r1)
            goto L_0x06fe
        L_0x06ef:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x0647
        L_0x06fe:
            return r2
        L_0x06ff:
            r15 = r8
            r8 = 1024(0x400, float:1.435E-42)
            r16 = 64
            java.lang.String r0 = r0.zzj
            int r2 = r1.length
            if (r2 >= r13) goto L_0x0719
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
        L_0x0716:
            r2 = 0
            goto L_0x0811
        L_0x0719:
            r11 = r1[r6]     // Catch:{ NumberFormatException -> 0x0802 }
            int r11 = r11.length()     // Catch:{ NumberFormatException -> 0x0802 }
            r3 = 6
            if (r11 != r3) goto L_0x073a
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x0802 }
            r3 = 0
            java.lang.String r2 = r2.substring(r3, r13)     // Catch:{ NumberFormatException -> 0x0802 }
            r3 = 16
            int r2 = java.lang.Integer.parseInt(r2, r3)     // Catch:{ NumberFormatException -> 0x0802 }
            r1 = r1[r6]     // Catch:{ NumberFormatException -> 0x0802 }
            java.lang.String r1 = r1.substring(r10)     // Catch:{ NumberFormatException -> 0x0802 }
            int r0 = java.lang.Integer.parseInt(r1, r3)     // Catch:{ NumberFormatException -> 0x0802 }
            goto L_0x074b
        L_0x073a:
            r3 = 16
            r11 = 3
            if (r2 < r11) goto L_0x07ec
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x0802 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0802 }
            r1 = r1[r13]     // Catch:{ NumberFormatException -> 0x0802 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0802 }
        L_0x074b:
            r1 = 66
            if (r2 == r1) goto L_0x0775
            r1 = 77
            if (r2 == r1) goto L_0x0776
            r1 = 88
            if (r2 == r1) goto L_0x0773
            r1 = 100
            if (r2 == r1) goto L_0x0771
            r1 = 110(0x6e, float:1.54E-43)
            if (r2 == r1) goto L_0x076f
            r1 = 122(0x7a, float:1.71E-43)
            if (r2 == r1) goto L_0x076d
            r1 = 244(0xf4, float:3.42E-43)
            if (r2 == r1) goto L_0x076a
            r1 = -1
            r13 = -1
            goto L_0x0777
        L_0x076a:
            r13 = r16
            goto L_0x0776
        L_0x076d:
            r13 = r12
            goto L_0x0776
        L_0x076f:
            r13 = r3
            goto L_0x0776
        L_0x0771:
            r13 = r5
            goto L_0x0776
        L_0x0773:
            r13 = r10
            goto L_0x0776
        L_0x0775:
            r13 = r6
        L_0x0776:
            r1 = -1
        L_0x0777:
            if (r13 != r1) goto L_0x078e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown AVC profile: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x0716
        L_0x078e:
            switch(r0) {
                case 10: goto L_0x07c4;
                case 11: goto L_0x07c2;
                case 12: goto L_0x07c0;
                case 13: goto L_0x07be;
                default: goto L_0x0791;
            }
        L_0x0791:
            switch(r0) {
                case 20: goto L_0x07bc;
                case 21: goto L_0x07b9;
                case 22: goto L_0x07b7;
                default: goto L_0x0794;
            }
        L_0x0794:
            switch(r0) {
                case 30: goto L_0x07b5;
                case 31: goto L_0x07b3;
                case 32: goto L_0x07b1;
                default: goto L_0x0797;
            }
        L_0x0797:
            switch(r0) {
                case 40: goto L_0x07ae;
                case 41: goto L_0x07ac;
                case 42: goto L_0x07a9;
                default: goto L_0x079a;
            }
        L_0x079a:
            switch(r0) {
                case 50: goto L_0x07a6;
                case 51: goto L_0x07a2;
                case 52: goto L_0x079f;
                default: goto L_0x079d;
            }
        L_0x079d:
            r1 = -1
            goto L_0x07c5
        L_0x079f:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x07c5
        L_0x07a2:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x07c5
        L_0x07a6:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x07c5
        L_0x07a9:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x07c5
        L_0x07ac:
            r1 = r14
            goto L_0x07c5
        L_0x07ae:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x07c5
        L_0x07b1:
            r1 = r8
            goto L_0x07c5
        L_0x07b3:
            r1 = r7
            goto L_0x07c5
        L_0x07b5:
            r1 = r15
            goto L_0x07c5
        L_0x07b7:
            r1 = r9
            goto L_0x07c5
        L_0x07b9:
            r1 = r16
            goto L_0x07c5
        L_0x07bc:
            r1 = r12
            goto L_0x07c5
        L_0x07be:
            r1 = r3
            goto L_0x07c5
        L_0x07c0:
            r1 = r5
            goto L_0x07c5
        L_0x07c2:
            r1 = r10
            goto L_0x07c5
        L_0x07c4:
            r1 = r6
        L_0x07c5:
            r2 = -1
            if (r1 != r2) goto L_0x07de
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown AVC level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x0716
        L_0x07de:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r0, r1)
            goto L_0x0811
        L_0x07ec:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0802 }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x0802 }
            java.lang.String r2 = "Ignoring malformed AVC codec string: "
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x0802 }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0802 }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x0802 }
            com.google.android.gms.internal.ads.zzdw.zze(r4, r1)     // Catch:{ NumberFormatException -> 0x0802 }
            goto L_0x0716
        L_0x0802:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            goto L_0x0716
        L_0x0811:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrf.zzb(com.google.android.gms.internal.ads.zzaf):android.util.Pair");
    }

    public static zzqn zzc(String str, boolean z, boolean z2) throws zzqz {
        List zzf = zzf(str, false, false);
        if (zzf.isEmpty()) {
            return null;
        }
        return (zzqn) zzf.get(0);
    }

    public static zzqn zzd() throws zzqz {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzaf zzaf) {
        Pair zzb2;
        if ("audio/eac3-joc".equals(zzaf.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzaf.zzm) || (zzb2 = zzb(zzaf)) == null) {
            return null;
        }
        int intValue = ((Integer) zzb2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List zzf(String str, boolean z, boolean z2) throws zzqz {
        zzra zzra;
        int i;
        String str2 = str;
        boolean z3 = z;
        boolean z4 = z2;
        synchronized (zzrf.class) {
            zzqx zzqx = new zzqx(str2, z3, z4);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzqx);
            if (list != null) {
                return list;
            }
            if (zzen.zza >= 21) {
                zzra = new zzrd(z3, z4);
            } else {
                zzra = new zzrc((zzrb) null);
            }
            ArrayList zzh = zzh(zzqx, zzra);
            if (z3 && zzh.isEmpty() && (i = zzen.zza) >= 21 && i <= 23) {
                zzh = zzh(zzqx, new zzrc((zzrb) null));
                if (!zzh.isEmpty()) {
                    String str3 = ((zzqn) zzh.get(0)).zza;
                    zzdw.zze("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str2 + ". Assuming: " + str3);
                }
            }
            if ("audio/raw".equals(str2)) {
                if (zzen.zza < 26 && zzen.zzb.equals("R9") && zzh.size() == 1 && ((zzqn) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzqn.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
                }
                zzi(zzh, zzqv.zza);
            }
            if (zzen.zza < 21 && zzh.size() > 1) {
                String str4 = ((zzqn) zzh.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str4) || "OMX.SEC.MP3.Decoder".equals(str4) || "OMX.brcm.audio.mp3.decoder".equals(str4)) {
                    zzi(zzh, zzqw.zza);
                }
            }
            if (zzen.zza < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzqn) zzh.get(0)).zza)) {
                zzh.add((zzqn) zzh.remove(0));
            }
            zzfvn zzm = zzfvn.zzm(zzh);
            hashMap.put(zzqx, zzm);
            return zzm;
        }
    }

    public static List zzg(List list, zzaf zzaf) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzqt(zzaf));
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0255, code lost:
        if (r2 != r8) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x025b, code lost:
        if (r1.zzb == false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x025d, code lost:
        r22 = r12;
        r18 = r13;
        r20 = r14;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r12.endsWith(".secure") == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        r6.add(com.google.android.gms.internal.ads.zzqn.zzc(r12, r15, r5, r10, r11, r21, r0, false, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0279, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x027a, code lost:
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        if ("OMX.Exynos.AAC.Decoder".equals(r12) == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ec, code lost:
        if ("SCV31".equals(com.google.android.gms.internal.ads.zzen.zzb) == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0134, code lost:
        if (com.google.android.gms.internal.ads.zzen.zzb.startsWith("t0") != false) goto L_0x002d;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02c8 A[SYNTHETIC, Splitter:B:186:0x02c8] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02e8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzqx r23, com.google.android.gms.internal.ads.zzra r24) throws com.google.android.gms.internal.ads.zzqz {
        /*
            r1 = r23
            r2 = r24
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0316 }
            r6.<init>()     // Catch:{ Exception -> 0x0316 }
            java.lang.String r15 = r1.zza     // Catch:{ Exception -> 0x0316 }
            int r14 = r24.zza()     // Catch:{ Exception -> 0x0316 }
            boolean r16 = r24.zze()     // Catch:{ Exception -> 0x0316 }
            r17 = 0
            r13 = r17
        L_0x001b:
            if (r13 >= r14) goto L_0x0315
            android.media.MediaCodecInfo r0 = r2.zzb(r13)     // Catch:{ Exception -> 0x0316 }
            int r7 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ Exception -> 0x0316 }
            r8 = 29
            if (r7 < r8) goto L_0x0034
            boolean r7 = r0.isAlias()     // Catch:{ Exception -> 0x0316 }
            if (r7 == 0) goto L_0x0034
        L_0x002d:
            r18 = r13
            r20 = r14
            r2 = r15
            goto L_0x030a
        L_0x0034:
            java.lang.String r12 = r0.getName()     // Catch:{ Exception -> 0x0316 }
            boolean r7 = r0.isEncoder()     // Catch:{ Exception -> 0x0316 }
            if (r7 != 0) goto L_0x002d
            java.lang.String r7 = ".secure"
            if (r16 != 0) goto L_0x0048
            boolean r9 = r12.endsWith(r7)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
        L_0x0048:
            int r9 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ Exception -> 0x0316 }
            r10 = 21
            if (r9 >= r10) goto L_0x007e
            java.lang.String r9 = "CIPAACDecoder"
            boolean r9 = r9.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = "CIPMP3Decoder"
            boolean r9 = r9.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = "CIPVorbisDecoder"
            boolean r9 = r9.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = "CIPAMRNBDecoder"
            boolean r9 = r9.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = "AACDecoder"
            boolean r9 = r9.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = "MP3Decoder"
            boolean r9 = r9.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
        L_0x007e:
            int r9 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ Exception -> 0x0316 }
            r10 = 24
            java.lang.String r11 = "samsung"
            if (r9 >= r10) goto L_0x00ee
            java.lang.String r9 = "OMX.SEC.aac.dec"
            boolean r9 = r9.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x0096
            java.lang.String r9 = "OMX.Exynos.AAC.Decoder"
            boolean r9 = r9.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r9 == 0) goto L_0x00ee
        L_0x0096:
            java.lang.String r9 = com.google.android.gms.internal.ads.zzen.zzc     // Catch:{ Exception -> 0x0316 }
            boolean r9 = r11.equals(r9)     // Catch:{ Exception -> 0x0316 }
            if (r9 == 0) goto L_0x00ee
            java.lang.String r9 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            java.lang.String r10 = "zeroflte"
            boolean r9 = r9.startsWith(r10)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            java.lang.String r10 = "zerolte"
            boolean r9 = r9.startsWith(r10)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            java.lang.String r10 = "zenlte"
            boolean r9 = r9.startsWith(r10)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = "SC-05G"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = "marinelteatt"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = "404SC"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = "SC-04G"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = "SCV31"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
        L_0x00ee:
            int r9 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ Exception -> 0x0316 }
            java.lang.String r10 = "jflte"
            r5 = 19
            if (r9 > r5) goto L_0x0136
            java.lang.String r9 = "OMX.SEC.vp8.dec"
            boolean r9 = r9.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r9 == 0) goto L_0x0136
            java.lang.String r9 = com.google.android.gms.internal.ads.zzen.zzc     // Catch:{ Exception -> 0x0316 }
            boolean r9 = r11.equals(r9)     // Catch:{ Exception -> 0x0316 }
            if (r9 == 0) goto L_0x0136
            java.lang.String r9 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            java.lang.String r11 = "d2"
            boolean r9 = r9.startsWith(r11)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            java.lang.String r11 = "serrano"
            boolean r9 = r9.startsWith(r11)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            boolean r9 = r9.startsWith(r10)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            java.lang.String r11 = "santos"
            boolean r9 = r9.startsWith(r11)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            java.lang.String r11 = "t0"
            boolean r9 = r9.startsWith(r11)     // Catch:{ Exception -> 0x0316 }
            if (r9 != 0) goto L_0x002d
        L_0x0136:
            int r9 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ Exception -> 0x0316 }
            if (r9 > r5) goto L_0x014a
            java.lang.String r5 = com.google.android.gms.internal.ads.zzen.zzb     // Catch:{ Exception -> 0x0316 }
            boolean r5 = r5.startsWith(r10)     // Catch:{ Exception -> 0x0316 }
            if (r5 == 0) goto L_0x014a
            java.lang.String r5 = "OMX.qcom.video.decoder.vp8"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r5 != 0) goto L_0x002d
        L_0x014a:
            int r5 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ Exception -> 0x0316 }
            r11 = 23
            if (r5 > r11) goto L_0x0160
            java.lang.String r5 = "audio/eac3-joc"
            boolean r5 = r5.equals(r15)     // Catch:{ Exception -> 0x0316 }
            if (r5 == 0) goto L_0x0160
            java.lang.String r5 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r5 != 0) goto L_0x002d
        L_0x0160:
            java.lang.String[] r5 = r0.getSupportedTypes()     // Catch:{ Exception -> 0x0316 }
            int r9 = r5.length     // Catch:{ Exception -> 0x0316 }
            r10 = r17
        L_0x0167:
            if (r10 >= r9) goto L_0x0178
            r11 = r5[r10]     // Catch:{ Exception -> 0x0316 }
            boolean r19 = r11.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x0316 }
            if (r19 == 0) goto L_0x0173
        L_0x0171:
            r5 = r11
            goto L_0x01d8
        L_0x0173:
            int r10 = r10 + 1
            r11 = 23
            goto L_0x0167
        L_0x0178:
            java.lang.String r5 = "video/dolby-vision"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x0316 }
            if (r5 == 0) goto L_0x019e
            java.lang.String r5 = "OMX.MS.HEVCDV.Decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r5 == 0) goto L_0x018b
            java.lang.String r11 = "video/hevcdv"
            goto L_0x0171
        L_0x018b:
            java.lang.String r5 = "OMX.RTK.video.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r5 != 0) goto L_0x019b
            java.lang.String r5 = "OMX.realtek.video.decoder.tunneled"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r5 == 0) goto L_0x01d7
        L_0x019b:
            java.lang.String r11 = "video/dv_hevc"
            goto L_0x0171
        L_0x019e:
            java.lang.String r5 = "audio/alac"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x0316 }
            if (r5 == 0) goto L_0x01b1
            java.lang.String r5 = "OMX.lge.alac.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r5 == 0) goto L_0x01b1
            java.lang.String r11 = "audio/x-lg-alac"
            goto L_0x0171
        L_0x01b1:
            java.lang.String r5 = "audio/flac"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x0316 }
            if (r5 == 0) goto L_0x01c4
            java.lang.String r5 = "OMX.lge.flac.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r5 == 0) goto L_0x01c4
            java.lang.String r11 = "audio/x-lg-flac"
            goto L_0x0171
        L_0x01c4:
            java.lang.String r5 = "audio/ac3"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x0316 }
            if (r5 == 0) goto L_0x01d7
            java.lang.String r5 = "OMX.lge.ac3.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0316 }
            if (r5 == 0) goto L_0x01d7
            java.lang.String r11 = "audio/lg-ac3"
            goto L_0x0171
        L_0x01d7:
            r5 = 0
        L_0x01d8:
            if (r5 == 0) goto L_0x002d
            android.media.MediaCodecInfo$CodecCapabilities r10 = r0.getCapabilitiesForType(r5)     // Catch:{ Exception -> 0x02b9 }
            boolean r9 = r2.zzd(r4, r5, r10)     // Catch:{ Exception -> 0x02b9 }
            boolean r11 = r2.zzc(r4, r5, r10)     // Catch:{ Exception -> 0x02b9 }
            boolean r8 = r1.zzc     // Catch:{ Exception -> 0x02b9 }
            if (r8 != 0) goto L_0x01ed
            if (r11 != 0) goto L_0x002d
            goto L_0x01f1
        L_0x01ed:
            if (r9 != 0) goto L_0x01f1
            goto L_0x002d
        L_0x01f1:
            boolean r8 = r2.zzd(r3, r5, r10)     // Catch:{ Exception -> 0x02b9 }
            boolean r9 = r2.zzc(r3, r5, r10)     // Catch:{ Exception -> 0x02b9 }
            boolean r11 = r1.zzb     // Catch:{ Exception -> 0x02b9 }
            r20 = 1
            if (r11 != 0) goto L_0x0202
            if (r9 != 0) goto L_0x002d
            goto L_0x0206
        L_0x0202:
            if (r8 == 0) goto L_0x002d
            r8 = r20
        L_0x0206:
            int r9 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ Exception -> 0x02b9 }
            r11 = 29
            if (r9 < r11) goto L_0x0212
            boolean r9 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x02b9 }
            r11 = r9
            goto L_0x021d
        L_0x0212:
            boolean r9 = zzj(r0, r15)     // Catch:{ Exception -> 0x02b9 }
            if (r9 != 0) goto L_0x021b
            r11 = r20
            goto L_0x021d
        L_0x021b:
            r11 = r17
        L_0x021d:
            boolean r21 = zzj(r0, r15)     // Catch:{ Exception -> 0x02b9 }
            int r9 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ Exception -> 0x02b9 }
            r2 = 29
            if (r9 < r2) goto L_0x022c
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x02b9 }
            goto L_0x0251
        L_0x022c:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x02b9 }
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfse.zza(r0)     // Catch:{ Exception -> 0x02b9 }
            java.lang.String r2 = "omx.google."
            boolean r2 = r0.startsWith(r2)     // Catch:{ Exception -> 0x02b9 }
            if (r2 != 0) goto L_0x024f
            java.lang.String r2 = "c2.android."
            boolean r2 = r0.startsWith(r2)     // Catch:{ Exception -> 0x02b9 }
            if (r2 != 0) goto L_0x024f
            java.lang.String r2 = "c2.google."
            boolean r0 = r0.startsWith(r2)     // Catch:{ Exception -> 0x02b9 }
            if (r0 != 0) goto L_0x024f
            r0 = r20
            goto L_0x0251
        L_0x024f:
            r0 = r17
        L_0x0251:
            if (r16 == 0) goto L_0x0257
            boolean r2 = r1.zzb     // Catch:{ Exception -> 0x02b9 }
            if (r2 == r8) goto L_0x025d
        L_0x0257:
            if (r16 != 0) goto L_0x0285
            boolean r2 = r1.zzb     // Catch:{ Exception -> 0x027d }
            if (r2 != 0) goto L_0x0285
        L_0x025d:
            r2 = 0
            r19 = 0
            r7 = r12
            r8 = r15
            r9 = r5
            r22 = r12
            r12 = r21
            r18 = r13
            r13 = r0
            r20 = r14
            r14 = r2
            r2 = r15
            r15 = r19
            com.google.android.gms.internal.ads.zzqn r0 = com.google.android.gms.internal.ads.zzqn.zzc(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0279 }
            r6.add(r0)     // Catch:{ Exception -> 0x0279 }
            goto L_0x030a
        L_0x0279:
            r0 = move-exception
            r1 = r22
            goto L_0x02c0
        L_0x027d:
            r0 = move-exception
            r18 = r13
            r20 = r14
            r2 = r15
            r1 = r12
            goto L_0x02c0
        L_0x0285:
            r22 = r12
            r18 = r13
            r20 = r14
            r2 = r15
            if (r16 != 0) goto L_0x030a
            if (r8 == 0) goto L_0x030a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0279 }
            r8.<init>()     // Catch:{ Exception -> 0x0279 }
            r15 = r22
            r8.append(r15)     // Catch:{ Exception -> 0x02b6 }
            r8.append(r7)     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x02b6 }
            r14 = 0
            r19 = 1
            r8 = r2
            r9 = r5
            r12 = r21
            r13 = r0
            r1 = r15
            r15 = r19
            com.google.android.gms.internal.ads.zzqn r0 = com.google.android.gms.internal.ads.zzqn.zzc(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x02b4 }
            r6.add(r0)     // Catch:{ Exception -> 0x02b4 }
            return r6
        L_0x02b4:
            r0 = move-exception
            goto L_0x02c0
        L_0x02b6:
            r0 = move-exception
            r1 = r15
            goto L_0x02c0
        L_0x02b9:
            r0 = move-exception
            r1 = r12
            r18 = r13
            r20 = r14
            r2 = r15
        L_0x02c0:
            int r7 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ Exception -> 0x0316 }
            java.lang.String r8 = "MediaCodecUtil"
            r9 = 23
            if (r7 > r9) goto L_0x02e8
            boolean r7 = r6.isEmpty()     // Catch:{ Exception -> 0x0316 }
            if (r7 != 0) goto L_0x02e8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0316 }
            r0.<init>()     // Catch:{ Exception -> 0x0316 }
            java.lang.String r5 = "Skipping codec "
            r0.append(r5)     // Catch:{ Exception -> 0x0316 }
            r0.append(r1)     // Catch:{ Exception -> 0x0316 }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x0316 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0316 }
            com.google.android.gms.internal.ads.zzdw.zzb(r8, r0)     // Catch:{ Exception -> 0x0316 }
            goto L_0x030a
        L_0x02e8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0316 }
            r2.<init>()     // Catch:{ Exception -> 0x0316 }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x0316 }
            r2.append(r1)     // Catch:{ Exception -> 0x0316 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x0316 }
            r2.append(r5)     // Catch:{ Exception -> 0x0316 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x0316 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0316 }
            com.google.android.gms.internal.ads.zzdw.zzb(r8, r1)     // Catch:{ Exception -> 0x0316 }
            throw r0     // Catch:{ Exception -> 0x0316 }
        L_0x030a:
            int r13 = r18 + 1
            r1 = r23
            r15 = r2
            r14 = r20
            r2 = r24
            goto L_0x001b
        L_0x0315:
            return r6
        L_0x0316:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzqz r1 = new com.google.android.gms.internal.ads.zzqz
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrf.zzh(com.google.android.gms.internal.ads.zzqx, com.google.android.gms.internal.ads.zzra):java.util.ArrayList");
    }

    private static void zzi(List list, zzre zzre) {
        Collections.sort(list, new zzqu(zzre));
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzen.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbt.zzg(str)) {
            return true;
        }
        String zza2 = zzfse.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        if (zza2.startsWith("omx.")) {
            return false;
        }
        if (!zza2.startsWith("c2.")) {
            return true;
        }
        return false;
    }
}
