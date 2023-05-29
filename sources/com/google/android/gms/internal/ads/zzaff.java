package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaff {
    private static final byte[] zza = zzen.zzaa("OpusHead");

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        if (r3 != 13) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        r3 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzaew r11) {
        /*
            com.google.android.gms.internal.ads.zzef r11 = r11.zza
            r0 = 8
            r11.zzF(r0)
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x000a:
            int r4 = r11.zza()
            if (r4 < r0) goto L_0x00df
            int r4 = r11.zzc()
            int r5 = r11.zze()
            int r6 = r11.zze()
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r6 != r7) goto L_0x0075
            r11.zzF(r4)
            int r2 = r4 + r5
            r11.zzG(r0)
            zzd(r11)
        L_0x002c:
            int r6 = r11.zzc()
            if (r6 >= r2) goto L_0x0073
            int r6 = r11.zzc()
            int r7 = r11.zze()
            int r8 = r11.zze()
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r9) goto L_0x006e
            r11.zzF(r6)
            int r6 = r6 + r7
            r11.zzG(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x004f:
            int r7 = r11.zzc()
            if (r7 >= r6) goto L_0x005f
            com.google.android.gms.internal.ads.zzbp r7 = com.google.android.gms.internal.ads.zzafm.zza(r11)
            if (r7 == 0) goto L_0x004f
            r2.add(r7)
            goto L_0x004f
        L_0x005f:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x0066
            goto L_0x0073
        L_0x0066:
            com.google.android.gms.internal.ads.zzbq r6 = new com.google.android.gms.internal.ads.zzbq
            r6.<init>((java.util.List) r2)
            r2 = r6
            goto L_0x00d9
        L_0x006e:
            int r6 = r6 + r7
            r11.zzF(r6)
            goto L_0x002c
        L_0x0073:
            r2 = r1
            goto L_0x00d9
        L_0x0075:
            r7 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r6 != r7) goto L_0x00d9
            r11.zzF(r4)
            int r3 = r4 + r5
            r6 = 12
            r11.zzG(r6)
        L_0x0084:
            int r7 = r11.zzc()
            if (r7 >= r3) goto L_0x00d8
            int r7 = r11.zzc()
            int r8 = r11.zze()
            int r9 = r11.zze()
            r10 = 1935766900(0x73617574, float:1.7862687E31)
            if (r9 != r10) goto L_0x00d3
            r3 = 14
            if (r8 >= r3) goto L_0x00a0
            goto L_0x00d8
        L_0x00a0:
            r3 = 5
            r11.zzG(r3)
            int r3 = r11.zzk()
            r7 = 1123024896(0x42f00000, float:120.0)
            if (r3 == r6) goto L_0x00b1
            r6 = 13
            if (r3 == r6) goto L_0x00b5
            goto L_0x00d8
        L_0x00b1:
            if (r3 != r6) goto L_0x00b5
            r7 = 1131413504(0x43700000, float:240.0)
        L_0x00b5:
            r3 = 1
            r11.zzG(r3)
            int r6 = r11.zzk()
            com.google.android.gms.internal.ads.zzbq r8 = new com.google.android.gms.internal.ads.zzbq
            com.google.android.gms.internal.ads.zzbp[] r3 = new com.google.android.gms.internal.ads.zzbp[r3]
            com.google.android.gms.internal.ads.zzadw r9 = new com.google.android.gms.internal.ads.zzadw
            r9.<init>((float) r7, (int) r6)
            r6 = 0
            r3[r6] = r9
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.<init>(r6, r3)
            r3 = r8
            goto L_0x00d9
        L_0x00d3:
            int r7 = r7 + r8
            r11.zzF(r7)
            goto L_0x0084
        L_0x00d8:
            r3 = r1
        L_0x00d9:
            int r4 = r4 + r5
            r11.zzF(r4)
            goto L_0x000a
        L_0x00df:
            android.util.Pair r11 = android.util.Pair.create(r2, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaff.zza(com.google.android.gms.internal.ads.zzaew):android.util.Pair");
    }

    public static zzbq zzb(zzaev zzaev) {
        zzadq zzadq;
        zzaew zzb = zzaev.zzb(1751411826);
        zzaew zzb2 = zzaev.zzb(1801812339);
        zzaew zzb3 = zzaev.zzb(1768715124);
        if (zzb == null || zzb2 == null || zzb3 == null || zzg(zzb.zza) != 1835299937) {
            return null;
        }
        zzef zzef = zzb2.zza;
        zzef.zzF(12);
        int zze = zzef.zze();
        String[] strArr = new String[zze];
        for (int i = 0; i < zze; i++) {
            int zze2 = zzef.zze();
            zzef.zzG(4);
            strArr[i] = zzef.zzx(zze2 - 8, zzfsk.zzc);
        }
        zzef zzef2 = zzb3.zza;
        zzef2.zzF(8);
        ArrayList arrayList = new ArrayList();
        while (zzef2.zza() > 8) {
            int zzc = zzef2.zzc();
            int zze3 = zzef2.zze();
            int zze4 = zzef2.zze() - 1;
            if (zze4 < 0 || zze4 >= zze) {
                zzdw.zze("AtomParsers", "Skipped metadata with unknown key index: " + zze4);
            } else {
                String str = strArr[zze4];
                int i2 = zzc + zze3;
                int i3 = zzafm.zzb;
                while (true) {
                    int zzc2 = zzef2.zzc();
                    if (zzc2 >= i2) {
                        zzadq = null;
                        break;
                    }
                    int zze5 = zzef2.zze();
                    if (zzef2.zze() == 1684108385) {
                        int zze6 = zzef2.zze();
                        int zze7 = zzef2.zze();
                        int i4 = zze5 - 16;
                        byte[] bArr = new byte[i4];
                        zzef2.zzB(bArr, 0, i4);
                        zzadq = new zzadq(str, bArr, zze7, zze6);
                        break;
                    }
                    zzef2.zzF(zzc2 + zze5);
                }
                if (zzadq != null) {
                    arrayList.add(zzadq);
                }
            }
            zzef2.zzF(zzc + zze3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq((List) arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b6, code lost:
        if (r7 == 0) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0660, code lost:
        if (r1 != 3) goto L_0x066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0756, code lost:
        if (r25 == null) goto L_0x076d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x06b7  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x06b9  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x07d3  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x07de  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x07e5  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x07e9  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x081e  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0b0f  */
    /* JADX WARNING: Removed duplicated region for block: B:495:0x0b12  */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0b6d  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0b8b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x0e06  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List zzc(com.google.android.gms.internal.ads.zzaev r58, com.google.android.gms.internal.ads.zzzx r59, long r60, com.google.android.gms.internal.ads.zzx r62, boolean r63, boolean r64, com.google.android.gms.internal.ads.zzfsm r65) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r0 = r58
            r1 = r59
            r12 = r62
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r15 = 0
        L_0x000c:
            java.util.List r2 = r0.zzc
            int r2 = r2.size()
            if (r15 >= r2) goto L_0x0e13
            java.util.List r2 = r0.zzc
            java.lang.Object r2 = r2.get(r15)
            r11 = r2
            com.google.android.gms.internal.ads.zzaev r11 = (com.google.android.gms.internal.ads.zzaev) r11
            int r2 = r11.zzd
            r3 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r3) goto L_0x0029
            r0 = r13
            r31 = r15
            goto L_0x0e08
        L_0x0029:
            r2 = 1836476516(0x6d766864, float:4.7662196E27)
            com.google.android.gms.internal.ads.zzaew r2 = r0.zzb(r2)
            java.util.Objects.requireNonNull(r2)
            r10 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzaev r3 = r11.zza(r10)
            java.util.Objects.requireNonNull(r3)
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.android.gms.internal.ads.zzaew r4 = r3.zzb(r4)
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.internal.ads.zzef r4 = r4.zza
            int r4 = zzg(r4)
            int r9 = zze(r4)
            java.lang.String r6 = "AtomParsers"
            r31 = r15
            r5 = -1
            if (r9 != r5) goto L_0x0062
            r0 = r65
            r14 = r6
            r2 = r11
            r32 = r13
            r3 = 2
        L_0x005f:
            r8 = 0
            goto L_0x0816
        L_0x0062:
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            com.google.android.gms.internal.ads.zzaew r4 = r11.zzb(r4)
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.internal.ads.zzef r4 = r4.zza
            r8 = 8
            r4.zzF(r8)
            int r21 = r4.zze()
            int r21 = com.google.android.gms.internal.ads.zzaex.zze(r21)
            if (r21 != 0) goto L_0x007f
            r10 = r8
            goto L_0x0081
        L_0x007f:
            r10 = 16
        L_0x0081:
            r4.zzG(r10)
            int r10 = r4.zze()
            r8 = 4
            r4.zzG(r8)
            int r25 = r4.zzc()
            if (r21 != 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r8 = 8
        L_0x0095:
            r7 = 0
        L_0x0096:
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 >= r8) goto L_0x00bc
            byte[] r30 = r4.zzH()
            int r32 = r25 + r7
            byte r14 = r30[r32]
            if (r14 == r5) goto L_0x00b9
            if (r21 != 0) goto L_0x00ae
            long r7 = r4.zzs()
            goto L_0x00b2
        L_0x00ae:
            long r7 = r4.zzt()
        L_0x00b2:
            r14 = 0
            int r21 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r21 != 0) goto L_0x00c1
            goto L_0x00bf
        L_0x00b9:
            int r7 = r7 + 1
            goto L_0x0096
        L_0x00bc:
            r4.zzG(r8)
        L_0x00bf:
            r7 = r28
        L_0x00c1:
            r14 = 16
            r4.zzG(r14)
            int r15 = r4.zze()
            int r5 = r4.zze()
            r14 = 4
            r4.zzG(r14)
            int r14 = r4.zze()
            int r4 = r4.zze()
            r0 = 65536(0x10000, float:9.18355E-41)
            r25 = r6
            r6 = -65536(0xffffffffffff0000, float:NaN)
            if (r15 != 0) goto L_0x00f0
            if (r5 != r0) goto L_0x00ef
            if (r14 != r6) goto L_0x00ee
            if (r4 != 0) goto L_0x00eb
            r0 = 90
            goto L_0x010e
        L_0x00eb:
            r5 = r0
            r14 = r6
            goto L_0x00ef
        L_0x00ee:
            r5 = r0
        L_0x00ef:
            r15 = 0
        L_0x00f0:
            if (r15 != 0) goto L_0x0101
            if (r5 != r6) goto L_0x00fe
            if (r14 != r0) goto L_0x00fd
            if (r4 != 0) goto L_0x00fb
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x010e
        L_0x00fb:
            r5 = r6
            goto L_0x00ff
        L_0x00fd:
            r5 = r6
        L_0x00fe:
            r0 = r14
        L_0x00ff:
            r15 = 0
            goto L_0x0102
        L_0x0101:
            r0 = r14
        L_0x0102:
            if (r15 != r6) goto L_0x010d
            if (r5 != 0) goto L_0x010d
            if (r0 != 0) goto L_0x010d
            if (r4 != r6) goto L_0x010d
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x010e
        L_0x010d:
            r0 = 0
        L_0x010e:
            com.google.android.gms.internal.ads.zzafe r14 = new com.google.android.gms.internal.ads.zzafe
            r14.<init>(r10, r7, r0)
            int r0 = (r60 > r28 ? 1 : (r60 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x011e
            long r4 = r14.zzb
            r35 = r4
            goto L_0x0120
        L_0x011e:
            r35 = r60
        L_0x0120:
            com.google.android.gms.internal.ads.zzef r0 = r2.zza
            r2 = 8
            r0.zzF(r2)
            int r4 = r0.zze()
            int r4 = com.google.android.gms.internal.ads.zzaex.zze(r4)
            if (r4 != 0) goto L_0x0133
            r8 = r2
            goto L_0x0135
        L_0x0133:
            r8 = 16
        L_0x0135:
            r0.zzG(r8)
            long r41 = r0.zzs()
            int r0 = (r35 > r28 ? 1 : (r35 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x0141
            goto L_0x014c
        L_0x0141:
            r37 = 1000000(0xf4240, double:4.940656E-318)
            r39 = r41
            long r4 = com.google.android.gms.internal.ads.zzen.zzw(r35, r37, r39)
            r28 = r4
        L_0x014c:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzaev r2 = r3.zza(r0)
            java.util.Objects.requireNonNull(r2)
            r8 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzaev r2 = r2.zza(r8)
            java.util.Objects.requireNonNull(r2)
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            com.google.android.gms.internal.ads.zzaew r3 = r3.zzb(r4)
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzef r3 = r3.zza
            android.util.Pair r15 = zzi(r3)
            r3 = 1937011556(0x73747364, float:1.9367383E31)
            com.google.android.gms.internal.ads.zzaew r2 = r2.zzb(r3)
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzef r10 = r2.zza
            int r7 = r14.zza
            int r6 = r14.zzc
            java.lang.Object r2 = r15.second
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            r4 = 12
            r10.zzF(r4)
            int r3 = r10.zze()
            com.google.android.gms.internal.ads.zzafb r2 = new com.google.android.gms.internal.ads.zzafb
            r2.<init>(r3)
            r0 = 0
        L_0x0198:
            if (r0 >= r3) goto L_0x07b3
            r32 = r13
            int r13 = r10.zzc()
            int r1 = r10.zze()
            if (r1 <= 0) goto L_0x01a8
            r4 = 1
            goto L_0x01a9
        L_0x01a8:
            r4 = 0
        L_0x01a9:
            java.lang.String r8 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzzm.zzb(r4, r8)
            int r4 = r10.zze()
            r8 = 1635148593(0x61766331, float:2.840654E20)
            r24 = r3
            r3 = 1701733238(0x656e6376, float:7.035987E22)
            if (r4 == r8) goto L_0x03a3
            r8 = 1635148595(0x61766333, float:2.8406544E20)
            if (r4 == r8) goto L_0x03a3
            if (r4 == r3) goto L_0x03a3
            r8 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 == r8) goto L_0x03a3
            r8 = 1836070006(0x6d703476, float:4.646239E27)
            if (r4 == r8) goto L_0x03a3
            r8 = 1752589105(0x68766331, float:4.6541277E24)
            if (r4 == r8) goto L_0x03a3
            r8 = 1751479857(0x68657631, float:4.3344087E24)
            if (r4 == r8) goto L_0x03a3
            r8 = 1932670515(0x73323633, float:1.4119387E31)
            if (r4 == r8) goto L_0x03a3
            r8 = 1211250227(0x48323633, float:182488.8)
            if (r4 == r8) goto L_0x03a3
            r8 = 1987063864(0x76703038, float:1.21789965E33)
            if (r4 == r8) goto L_0x03a3
            r8 = 1987063865(0x76703039, float:1.2178997E33)
            if (r4 == r8) goto L_0x03a3
            r8 = 1635135537(0x61763031, float:2.8383572E20)
            if (r4 == r8) goto L_0x03a3
            r8 = 1685479798(0x64766176, float:1.8179687E22)
            if (r4 == r8) goto L_0x03a3
            r8 = 1685479729(0x64766131, float:1.817961E22)
            if (r4 == r8) goto L_0x03a3
            r8 = 1685481573(0x64766865, float:1.8181686E22)
            if (r4 == r8) goto L_0x03a3
            r8 = 1685481521(0x64766831, float:1.8181627E22)
            if (r4 != r8) goto L_0x0206
            goto L_0x03a3
        L_0x0206:
            r3 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r4 == r3) goto L_0x0364
            r3 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r4 == r3) goto L_0x0364
            r3 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r4 == r3) goto L_0x0364
            r3 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r4 == r3) goto L_0x0364
            r3 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r4 == r3) goto L_0x0364
            r3 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r4 == r3) goto L_0x0364
            r3 = 1685353315(0x64747363, float:1.803728E22)
            if (r4 == r3) goto L_0x0364
            r3 = 1685353317(0x64747365, float:1.8037282E22)
            if (r4 == r3) goto L_0x0364
            r3 = 1685353320(0x64747368, float:1.8037286E22)
            if (r4 == r3) goto L_0x0364
            r3 = 1685353324(0x6474736c, float:1.803729E22)
            if (r4 == r3) goto L_0x0364
            r3 = 1685353336(0x64747378, float:1.8037304E22)
            if (r4 == r3) goto L_0x0364
            r3 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r4 == r3) goto L_0x0364
            r3 = 1935767394(0x73617762, float:1.7863284E31)
            if (r4 == r3) goto L_0x0364
            r3 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r4 == r3) goto L_0x0364
            r3 = 1936684916(0x736f7774, float:1.89725E31)
            if (r4 == r3) goto L_0x0364
            r3 = 1953984371(0x74776f73, float:7.841539E31)
            if (r4 == r3) goto L_0x0364
            r3 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r4 == r3) goto L_0x0364
            r3 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r4 == r3) goto L_0x0364
            r3 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r4 == r3) goto L_0x0364
            r3 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r4 == r3) goto L_0x0364
            r3 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r4 == r3) goto L_0x0364
            r3 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r4 == r3) goto L_0x0364
            r3 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r4 == r3) goto L_0x0364
            r3 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r4 == r3) goto L_0x0364
            r3 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r4 != r3) goto L_0x0285
            goto L_0x0364
        L_0x0285:
            r3 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r4 == r3) goto L_0x02da
            r3 = 1954034535(0x74783367, float:7.865797E31)
            if (r4 == r3) goto L_0x02da
            r3 = 2004251764(0x77767474, float:4.998699E33)
            if (r4 == r3) goto L_0x02da
            r3 = 1937010800(0x73747070, float:1.9366469E31)
            if (r4 == r3) goto L_0x02da
            r3 = 1664495672(0x63363038, float:3.360782E21)
            if (r4 != r3) goto L_0x029f
            goto L_0x02da
        L_0x029f:
            r3 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r4 != r3) goto L_0x02ab
            r3 = 1835365492(0x6d657474, float:4.4383032E27)
            zzn(r10, r3, r13, r7, r2)
            goto L_0x02c3
        L_0x02ab:
            r3 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r4 != r3) goto L_0x02c3
            com.google.android.gms.internal.ads.zzad r3 = new com.google.android.gms.internal.ads.zzad
            r3.<init>()
            r3.zzG(r7)
            java.lang.String r4 = "application/x-camera-motion"
            r3.zzS(r4)
            com.google.android.gms.internal.ads.zzaf r3 = r3.zzY()
            r2.zzb = r3
        L_0x02c3:
            r17 = r0
            r38 = r1
            r4 = r2
            r16 = r5
            r2 = r6
            r1 = r7
            r18 = r9
            r44 = r11
            r40 = r13
            r21 = r14
            r19 = r15
            r14 = r25
            goto L_0x035f
        L_0x02da:
            int r3 = r13 + 16
            r10.zzF(r3)
            r3 = 1414810956(0x54544d4c, float:3.64731957E12)
            r35 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r4 != r3) goto L_0x02f3
            java.lang.String r3 = "application/ttml+xml"
        L_0x02eb:
            r30 = r6
            r22 = r9
            r8 = r35
            r4 = 0
            goto L_0x032f
        L_0x02f3:
            r3 = 1954034535(0x74783367, float:7.865797E31)
            if (r4 != r3) goto L_0x0312
            int r3 = r1 + -16
            byte[] r4 = new byte[r3]
            r8 = 0
            r10.zzB(r4, r8, r3)
            com.google.android.gms.internal.ads.zzfvn r3 = com.google.android.gms.internal.ads.zzfvn.zzp(r4)
            java.lang.String r4 = "application/x-quicktime-tx3g"
            r30 = r6
            r22 = r9
            r8 = r35
            r56 = r4
            r4 = r3
            r3 = r56
            goto L_0x032f
        L_0x0312:
            r3 = 2004251764(0x77767474, float:4.998699E33)
            if (r4 != r3) goto L_0x031a
            java.lang.String r3 = "application/x-mp4-vtt"
            goto L_0x02eb
        L_0x031a:
            r3 = 1937010800(0x73747070, float:1.9366469E31)
            if (r4 != r3) goto L_0x0329
            java.lang.String r3 = "application/ttml+xml"
            r30 = r6
            r22 = r9
            r4 = 0
            r8 = 0
            goto L_0x032f
        L_0x0329:
            r8 = 1
            r2.zzd = r8
            java.lang.String r3 = "application/x-mp4-cea-608"
            goto L_0x02eb
        L_0x032f:
            com.google.android.gms.internal.ads.zzad r6 = new com.google.android.gms.internal.ads.zzad
            r6.<init>()
            r6.zzG(r7)
            r6.zzS(r3)
            r6.zzK(r5)
            r6.zzW(r8)
            r6.zzI(r4)
            com.google.android.gms.internal.ads.zzaf r3 = r6.zzY()
            r2.zzb = r3
            r17 = r0
            r38 = r1
            r4 = r2
            r16 = r5
            r1 = r7
            r44 = r11
            r40 = r13
            r21 = r14
            r19 = r15
            r18 = r22
            r14 = r25
            r2 = r30
        L_0x035f:
            r3 = 2
            r5 = -1
            r15 = r10
            goto L_0x078d
        L_0x0364:
            r30 = r6
            r22 = r9
            r9 = r2
            r2 = r10
            r3 = r4
            r6 = 12
            r8 = 2
            r4 = r13
            r16 = r5
            r6 = -1
            r5 = r1
            r21 = r14
            r19 = r15
            r14 = r25
            r15 = r30
            r6 = r7
            r43 = r7
            r15 = 16
            r7 = r16
            r8 = r64
            r17 = r9
            r18 = r22
            r9 = r62
            r15 = r10
            r10 = r17
            r44 = r11
            r11 = r0
            zzm(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r38 = r1
            r40 = r13
            r4 = r17
            r2 = r30
            r1 = r43
            r3 = 2
            r5 = -1
            r17 = r0
            goto L_0x078d
        L_0x03a3:
            r17 = r2
            r16 = r5
            r30 = r6
            r43 = r7
            r18 = r9
            r44 = r11
            r21 = r14
            r19 = r15
            r14 = r25
            r15 = r10
            int r2 = r13 + 16
            r15.zzF(r2)
            r2 = 16
            r15.zzG(r2)
            int r5 = r15.zzo()
            int r6 = r15.zzo()
            r7 = 50
            r15.zzG(r7)
            int r7 = r15.zzc()
            if (r4 != r3) goto L_0x0405
            android.util.Pair r4 = zzj(r15, r13, r1)
            if (r4 == 0) goto L_0x03fd
            java.lang.Object r3 = r4.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r12 != 0) goto L_0x03e7
            r9 = r17
            r8 = 0
            goto L_0x03f3
        L_0x03e7:
            java.lang.Object r8 = r4.second
            com.google.android.gms.internal.ads.zzafw r8 = (com.google.android.gms.internal.ads.zzafw) r8
            java.lang.String r8 = r8.zzb
            com.google.android.gms.internal.ads.zzx r8 = r12.zzb(r8)
            r9 = r17
        L_0x03f3:
            com.google.android.gms.internal.ads.zzafw[] r10 = r9.zza
            java.lang.Object r4 = r4.second
            com.google.android.gms.internal.ads.zzafw r4 = (com.google.android.gms.internal.ads.zzafw) r4
            r10[r0] = r4
            r4 = r3
            goto L_0x0401
        L_0x03fd:
            r9 = r17
            r4 = r3
            r8 = r12
        L_0x0401:
            r15.zzF(r7)
            goto L_0x0408
        L_0x0405:
            r9 = r17
            r8 = r12
        L_0x0408:
            r3 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 != r3) goto L_0x0415
            java.lang.String r3 = "video/mpeg"
            r56 = r4
            r4 = r3
            r3 = r56
            goto L_0x041f
        L_0x0415:
            r3 = 1211250227(0x48323633, float:182488.8)
            if (r4 != r3) goto L_0x041d
            java.lang.String r4 = "video/3gpp"
            goto L_0x041f
        L_0x041d:
            r3 = r4
            r4 = 0
        L_0x041f:
            r10 = 1065353216(0x3f800000, float:1.0)
            r17 = r0
            r0 = r7
            r36 = r8
            r8 = r10
            r2 = 0
            r10 = -1
            r11 = 0
            r20 = -1
            r22 = -1
            r23 = -1
            r25 = 0
            r26 = 0
            r37 = 0
            r7 = r4
            r4 = 0
        L_0x0438:
            int r12 = r0 - r13
            if (r12 >= r1) goto L_0x06f5
            r15.zzF(r0)
            int r12 = r15.zzc()
            int r38 = r15.zze()
            if (r38 != 0) goto L_0x0461
            int r38 = r15.zzc()
            r39 = r10
            int r10 = r38 - r13
            if (r10 != r1) goto L_0x045f
            r38 = r1
            r55 = r5
            r50 = r6
            r49 = r8
            r47 = r9
            goto L_0x0701
        L_0x045f:
            r10 = 0
            goto L_0x0465
        L_0x0461:
            r39 = r10
            r10 = r38
        L_0x0465:
            if (r10 <= 0) goto L_0x046d
            r38 = r1
            r40 = r13
            r1 = 1
            goto L_0x0472
        L_0x046d:
            r38 = r1
            r40 = r13
            r1 = 0
        L_0x0472:
            java.lang.String r13 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzzm.zzb(r1, r13)
            int r1 = r15.zze()
            r13 = 1635148611(0x61766343, float:2.8406573E20)
            if (r1 != r13) goto L_0x04ae
            if (r7 != 0) goto L_0x0484
            r1 = 1
            goto L_0x0485
        L_0x0484:
            r1 = 0
        L_0x0485:
            r13 = 0
            com.google.android.gms.internal.ads.zzzm.zzb(r1, r13)
            int r12 = r12 + 8
            r15.zzF(r12)
            com.google.android.gms.internal.ads.zzyn r1 = com.google.android.gms.internal.ads.zzyn.zza(r15)
            java.util.List r2 = r1.zza
            int r7 = r1.zzb
            r9.zzc = r7
            if (r4 != 0) goto L_0x049c
            float r8 = r1.zze
        L_0x049c:
            java.lang.String r1 = r1.zzf
            java.lang.String r7 = "video/avc"
        L_0x04a0:
            r37 = r2
            r45 = r3
            r55 = r5
            r50 = r6
            r47 = r9
            r3 = 2
            r2 = r1
            goto L_0x06e4
        L_0x04ae:
            r13 = 1752589123(0x68766343, float:4.6541328E24)
            if (r1 != r13) goto L_0x04d4
            if (r7 != 0) goto L_0x04b7
            r1 = 1
            goto L_0x04b8
        L_0x04b7:
            r1 = 0
        L_0x04b8:
            r2 = 0
            com.google.android.gms.internal.ads.zzzm.zzb(r1, r2)
            int r12 = r12 + 8
            r15.zzF(r12)
            com.google.android.gms.internal.ads.zzzy r1 = com.google.android.gms.internal.ads.zzzy.zza(r15)
            java.util.List r2 = r1.zza
            int r7 = r1.zzb
            r9.zzc = r7
            if (r4 != 0) goto L_0x04cf
            float r8 = r1.zzc
        L_0x04cf:
            java.lang.String r1 = r1.zzd
            java.lang.String r7 = "video/hevc"
            goto L_0x04a0
        L_0x04d4:
            r13 = 1685480259(0x64766343, float:1.8180206E22)
            if (r1 == r13) goto L_0x06c5
            r13 = 1685485123(0x64767643, float:1.8185683E22)
            if (r1 != r13) goto L_0x04e0
            goto L_0x06c5
        L_0x04e0:
            r13 = 1987076931(0x76706343, float:1.21891066E33)
            if (r1 != r13) goto L_0x04f9
            if (r7 != 0) goto L_0x04e9
            r1 = 1
            goto L_0x04ea
        L_0x04e9:
            r1 = 0
        L_0x04ea:
            r7 = 0
            com.google.android.gms.internal.ads.zzzm.zzb(r1, r7)
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            if (r3 != r1) goto L_0x04f6
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L_0x0509
        L_0x04f6:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            goto L_0x0509
        L_0x04f9:
            r13 = 1635135811(0x61763143, float:2.8384055E20)
            if (r1 != r13) goto L_0x0515
            if (r7 != 0) goto L_0x0502
            r1 = 1
            goto L_0x0503
        L_0x0502:
            r1 = 0
        L_0x0503:
            r7 = 0
            com.google.android.gms.internal.ads.zzzm.zzb(r1, r7)
            java.lang.String r1 = "video/av01"
        L_0x0509:
            r7 = r1
        L_0x050a:
            r45 = r3
            r55 = r5
            r50 = r6
            r47 = r9
        L_0x0512:
            r3 = 2
            goto L_0x06e4
        L_0x0515:
            r13 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r1 != r13) goto L_0x0538
            if (r25 != 0) goto L_0x0520
            java.nio.ByteBuffer r25 = zzl()
        L_0x0520:
            r1 = r25
            r12 = 21
            r1.position(r12)
            short r12 = r15.zzy()
            r1.putShort(r12)
            short r12 = r15.zzy()
            r1.putShort(r12)
            r25 = r1
            goto L_0x050a
        L_0x0538:
            r13 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r1 != r13) goto L_0x05b3
            if (r25 != 0) goto L_0x0543
            java.nio.ByteBuffer r25 = zzl()
        L_0x0543:
            r1 = r25
            short r12 = r15.zzy()
            short r13 = r15.zzy()
            r45 = r3
            short r3 = r15.zzy()
            r46 = r4
            short r4 = r15.zzy()
            r47 = r9
            short r9 = r15.zzy()
            r48 = r11
            short r11 = r15.zzy()
            r49 = r8
            short r8 = r15.zzy()
            r50 = r6
            short r6 = r15.zzy()
            long r51 = r15.zzs()
            long r53 = r15.zzs()
            r55 = r5
            r5 = 1
            r1.position(r5)
            r1.putShort(r9)
            r1.putShort(r11)
            r1.putShort(r12)
            r1.putShort(r13)
            r1.putShort(r3)
            r1.putShort(r4)
            r1.putShort(r8)
            r1.putShort(r6)
            r3 = 10000(0x2710, double:4.9407E-320)
            long r3 = r51 / r3
            int r3 = (int) r3
            short r3 = (short) r3
            r1.putShort(r3)
            r3 = 10000(0x2710, double:4.9407E-320)
            long r3 = r53 / r3
            int r3 = (int) r3
            short r3 = (short) r3
            r1.putShort(r3)
            r25 = r1
        L_0x05ab:
            r4 = r46
            r11 = r48
        L_0x05af:
            r8 = r49
            goto L_0x0512
        L_0x05b3:
            r45 = r3
            r46 = r4
            r55 = r5
            r50 = r6
            r49 = r8
            r47 = r9
            r48 = r11
            r3 = 1681012275(0x64323633, float:1.3149704E22)
            if (r1 != r3) goto L_0x05d3
            if (r7 != 0) goto L_0x05ca
            r1 = 1
            goto L_0x05cb
        L_0x05ca:
            r1 = 0
        L_0x05cb:
            r3 = 0
            com.google.android.gms.internal.ads.zzzm.zzb(r1, r3)
            java.lang.String r1 = "video/3gpp"
            r7 = r1
            goto L_0x05ab
        L_0x05d3:
            r3 = 0
            r4 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 != r4) goto L_0x05fc
            if (r7 != 0) goto L_0x05dd
            r1 = 1
            goto L_0x05de
        L_0x05dd:
            r1 = 0
        L_0x05de:
            com.google.android.gms.internal.ads.zzzm.zzb(r1, r3)
            com.google.android.gms.internal.ads.zzaez r1 = zzk(r15, r12)
            java.lang.String r3 = r1.zza
            byte[] r4 = r1.zzb
            if (r4 == 0) goto L_0x05f4
            com.google.android.gms.internal.ads.zzfvn r12 = com.google.android.gms.internal.ads.zzfvn.zzp(r4)
            goto L_0x05f6
        L_0x05f4:
            r12 = r37
        L_0x05f6:
            r26 = r1
            r7 = r3
            r37 = r12
            goto L_0x05ab
        L_0x05fc:
            r3 = 1885434736(0x70617370, float:2.7909473E29)
            if (r1 != r3) goto L_0x0618
            int r12 = r12 + 8
            r15.zzF(r12)
            int r1 = r15.zzn()
            float r1 = (float) r1
            int r3 = r15.zzn()
            float r3 = (float) r3
            float r1 = r1 / r3
            r8 = r1
            r11 = r48
            r3 = 2
            r4 = 1
            goto L_0x06e4
        L_0x0618:
            r3 = 1937126244(0x73763364, float:1.9506033E31)
            if (r1 != r3) goto L_0x0645
            int r1 = r12 + 8
        L_0x061f:
            int r3 = r1 - r12
            if (r3 >= r10) goto L_0x063f
            r15.zzF(r1)
            int r3 = r15.zze()
            int r4 = r15.zze()
            r5 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r4 != r5) goto L_0x063d
            byte[] r4 = r15.zzH()
            int r3 = r3 + r1
            byte[] r8 = java.util.Arrays.copyOfRange(r4, r1, r3)
            goto L_0x0640
        L_0x063d:
            int r1 = r1 + r3
            goto L_0x061f
        L_0x063f:
            r8 = 0
        L_0x0640:
            r11 = r8
            r4 = r46
            goto L_0x05af
        L_0x0645:
            r3 = 1936995172(0x73743364, float:1.9347576E31)
            if (r1 != r3) goto L_0x0672
            int r1 = r15.zzk()
            r4 = 3
            r15.zzG(r4)
            if (r1 != 0) goto L_0x066b
            int r1 = r15.zzk()
            if (r1 == 0) goto L_0x0668
            r3 = 1
            if (r1 == r3) goto L_0x0665
            r3 = 2
            if (r1 == r3) goto L_0x0663
            if (r1 == r4) goto L_0x066e
            goto L_0x066c
        L_0x0663:
            r4 = r3
            goto L_0x066e
        L_0x0665:
            r3 = 2
            r4 = 1
            goto L_0x066e
        L_0x0668:
            r3 = 2
            r4 = 0
            goto L_0x066e
        L_0x066b:
            r3 = 2
        L_0x066c:
            r4 = r39
        L_0x066e:
            r39 = r4
            goto L_0x06de
        L_0x0672:
            r3 = 2
            r4 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r1 != r4) goto L_0x06de
            int r1 = r15.zze()
            r4 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r1 == r4) goto L_0x0695
            r4 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r1 != r4) goto L_0x0687
            goto L_0x0695
        L_0x0687:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzaex.zzf(r1)
            java.lang.String r4 = "Unsupported color type: "
            java.lang.String r1 = r4.concat(r1)
            com.google.android.gms.internal.ads.zzdw.zze(r14, r1)
            goto L_0x06de
        L_0x0695:
            int r1 = r15.zzo()
            int r4 = r15.zzo()
            r15.zzG(r3)
            r5 = 19
            if (r10 != r5) goto L_0x06af
            int r6 = r15.zzk()
            r6 = r6 & 128(0x80, float:1.794E-43)
            r10 = r5
            if (r6 == 0) goto L_0x06af
            r5 = 1
            goto L_0x06b0
        L_0x06af:
            r5 = 0
        L_0x06b0:
            int r1 = com.google.android.gms.internal.ads.zzq.zza(r1)
            r6 = 1
            if (r6 == r5) goto L_0x06b9
            r5 = r3
            goto L_0x06ba
        L_0x06b9:
            r5 = 1
        L_0x06ba:
            int r4 = com.google.android.gms.internal.ads.zzq.zzb(r4)
            r23 = r1
            r20 = r4
            r22 = r5
            goto L_0x06de
        L_0x06c5:
            r45 = r3
            r46 = r4
            r55 = r5
            r50 = r6
            r49 = r8
            r47 = r9
            r48 = r11
            r3 = 2
            com.google.android.gms.internal.ads.zzze r1 = com.google.android.gms.internal.ads.zzze.zza(r15)
            if (r1 == 0) goto L_0x06de
            java.lang.String r2 = r1.zza
            java.lang.String r7 = "video/dolby-vision"
        L_0x06de:
            r4 = r46
            r11 = r48
            r8 = r49
        L_0x06e4:
            int r0 = r0 + r10
            r1 = r38
            r10 = r39
            r13 = r40
            r3 = r45
            r9 = r47
            r6 = r50
            r5 = r55
            goto L_0x0438
        L_0x06f5:
            r38 = r1
            r55 = r5
            r50 = r6
            r49 = r8
            r47 = r9
            r39 = r10
        L_0x0701:
            r48 = r11
            r40 = r13
            r3 = 2
            if (r7 != 0) goto L_0x0711
            r2 = r30
            r1 = r43
            r4 = r47
            r5 = -1
            goto L_0x078d
        L_0x0711:
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            r1 = r43
            r0.zzG(r1)
            r0.zzS(r7)
            r0.zzx(r2)
            r2 = r55
            r0.zzX(r2)
            r2 = r50
            r0.zzF(r2)
            r8 = r49
            r0.zzP(r8)
            r2 = r30
            r0.zzR(r2)
            r11 = r48
            r0.zzQ(r11)
            r4 = r39
            r0.zzV(r4)
            r4 = r37
            r0.zzI(r4)
            r8 = r36
            r0.zzB(r8)
            r4 = r23
            r5 = -1
            if (r4 != r5) goto L_0x0759
            r6 = r22
            r7 = r20
            if (r6 != r5) goto L_0x075d
            if (r7 != r5) goto L_0x075d
            if (r25 == 0) goto L_0x076d
            goto L_0x075d
        L_0x0759:
            r7 = r20
            r6 = r22
        L_0x075d:
            com.google.android.gms.internal.ads.zzq r8 = new com.google.android.gms.internal.ads.zzq
            if (r25 == 0) goto L_0x0766
            byte[] r9 = r25.array()
            goto L_0x0767
        L_0x0766:
            r9 = 0
        L_0x0767:
            r8.<init>(r4, r6, r7, r9)
            r0.zzy(r8)
        L_0x076d:
            if (r26 == 0) goto L_0x0785
            long r6 = r26.zzc
            int r4 = com.google.android.gms.internal.ads.zzfxs.zzc(r6)
            r0.zzv(r4)
            long r6 = r26.zzd
            int r4 = com.google.android.gms.internal.ads.zzfxs.zzc(r6)
            r0.zzO(r4)
        L_0x0785:
            com.google.android.gms.internal.ads.zzaf r0 = r0.zzY()
            r4 = r47
            r4.zzb = r0
        L_0x078d:
            int r13 = r40 + r38
            r15.zzF(r13)
            int r0 = r17 + 1
            r12 = r62
            r7 = r1
            r6 = r2
            r2 = r4
            r25 = r14
            r10 = r15
            r5 = r16
            r9 = r18
            r15 = r19
            r14 = r21
            r3 = r24
            r13 = r32
            r11 = r44
            r4 = 12
            r8 = 1937007212(0x7374626c, float:1.9362132E31)
            r1 = r59
            goto L_0x0198
        L_0x07b3:
            r4 = r2
            r18 = r9
            r44 = r11
            r32 = r13
            r21 = r14
            r19 = r15
            r14 = r25
            r3 = 2
            r5 = -1
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r2 = r44
            com.google.android.gms.internal.ads.zzaev r0 = r2.zza(r0)
            if (r0 == 0) goto L_0x07de
            android.util.Pair r0 = zzh(r0)
            if (r0 == 0) goto L_0x07de
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            r30 = r0
            goto L_0x07e1
        L_0x07de:
            r1 = 0
            r30 = 0
        L_0x07e1:
            com.google.android.gms.internal.ads.zzaf r0 = r4.zzb
            if (r0 != 0) goto L_0x07e9
            r0 = r65
            goto L_0x005f
        L_0x07e9:
            com.google.android.gms.internal.ads.zzafv r8 = new com.google.android.gms.internal.ads.zzafv
            int r17 = r21.zza
            r0 = r19
            java.lang.Object r0 = r0.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r19 = r0.longValue()
            com.google.android.gms.internal.ads.zzaf r0 = r4.zzb
            int r6 = r4.zzd
            com.google.android.gms.internal.ads.zzafw[] r7 = r4.zza
            int r4 = r4.zzc
            r16 = r8
            r21 = r41
            r23 = r28
            r25 = r0
            r26 = r6
            r27 = r7
            r28 = r4
            r29 = r1
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            r0 = r65
        L_0x0816:
            java.lang.Object r1 = r0.apply(r8)
            com.google.android.gms.internal.ads.zzafv r1 = (com.google.android.gms.internal.ads.zzafv) r1
            if (r1 == 0) goto L_0x0e06
            r4 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzaev r2 = r2.zza(r4)
            java.util.Objects.requireNonNull(r2)
            r4 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzaev r2 = r2.zza(r4)
            java.util.Objects.requireNonNull(r2)
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzaev r2 = r2.zza(r4)
            java.util.Objects.requireNonNull(r2)
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.android.gms.internal.ads.zzaew r4 = r2.zzb(r4)
            if (r4 == 0) goto L_0x084d
            com.google.android.gms.internal.ads.zzafc r6 = new com.google.android.gms.internal.ads.zzafc
            com.google.android.gms.internal.ads.zzaf r7 = r1.zzf
            r6.<init>(r4, r7)
            goto L_0x085b
        L_0x084d:
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.android.gms.internal.ads.zzaew r4 = r2.zzb(r4)
            if (r4 == 0) goto L_0x0dfe
            com.google.android.gms.internal.ads.zzafd r6 = new com.google.android.gms.internal.ads.zzafd
            r6.<init>(r4)
        L_0x085b:
            int r4 = r6.zzb()
            if (r4 != 0) goto L_0x0882
            com.google.android.gms.internal.ads.zzafy r2 = new com.google.android.gms.internal.ads.zzafy
            r3 = 0
            long[] r4 = new long[r3]
            int[] r5 = new int[r3]
            r19 = 0
            long[] r6 = new long[r3]
            int[] r7 = new int[r3]
            r22 = 0
            r15 = r2
            r16 = r1
            r17 = r4
            r18 = r5
            r20 = r6
            r21 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
        L_0x087e:
            r0 = r32
            goto L_0x0dfa
        L_0x0882:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.android.gms.internal.ads.zzaew r7 = r2.zzb(r7)
            if (r7 != 0) goto L_0x0898
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.android.gms.internal.ads.zzaew r7 = r2.zzb(r7)
            java.util.Objects.requireNonNull(r7)
            r8 = r7
            r7 = 1
            goto L_0x089a
        L_0x0898:
            r8 = r7
            r7 = 0
        L_0x089a:
            com.google.android.gms.internal.ads.zzef r8 = r8.zza
            r9 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.android.gms.internal.ads.zzaew r9 = r2.zzb(r9)
            java.util.Objects.requireNonNull(r9)
            com.google.android.gms.internal.ads.zzef r9 = r9.zza
            r10 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.android.gms.internal.ads.zzaew r10 = r2.zzb(r10)
            java.util.Objects.requireNonNull(r10)
            com.google.android.gms.internal.ads.zzef r10 = r10.zza
            r11 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.android.gms.internal.ads.zzaew r11 = r2.zzb(r11)
            if (r11 == 0) goto L_0x08c0
            com.google.android.gms.internal.ads.zzef r11 = r11.zza
            goto L_0x08c1
        L_0x08c0:
            r11 = 0
        L_0x08c1:
            r12 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.android.gms.internal.ads.zzaew r2 = r2.zzb(r12)
            if (r2 == 0) goto L_0x08cd
            com.google.android.gms.internal.ads.zzef r2 = r2.zza
            goto L_0x08ce
        L_0x08cd:
            r2 = 0
        L_0x08ce:
            com.google.android.gms.internal.ads.zzaey r12 = new com.google.android.gms.internal.ads.zzaey
            r12.<init>(r9, r8, r7)
            r7 = 12
            r10.zzF(r7)
            int r8 = r10.zzn()
            int r8 = r8 + r5
            int r9 = r10.zzn()
            int r13 = r10.zzn()
            if (r2 == 0) goto L_0x08ef
            r2.zzF(r7)
            int r15 = r2.zzn()
            goto L_0x08f0
        L_0x08ef:
            r15 = 0
        L_0x08f0:
            if (r11 == 0) goto L_0x0906
            r11.zzF(r7)
            int r7 = r11.zzn()
            if (r7 <= 0) goto L_0x0902
            int r16 = r11.zzn()
            int r16 = r16 + -1
            goto L_0x0909
        L_0x0902:
            r16 = r5
            r11 = 0
            goto L_0x0909
        L_0x0906:
            r16 = r5
            r7 = 0
        L_0x0909:
            int r3 = r6.zza()
            com.google.android.gms.internal.ads.zzaf r0 = r1.zzf
            java.lang.String r0 = r0.zzm
            if (r3 == r5) goto L_0x09b3
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x092b
            java.lang.String r5 = "audio/g711-mlaw"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x092b
            java.lang.String r5 = "audio/g711-alaw"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x09b3
        L_0x092b:
            if (r8 != 0) goto L_0x09b3
            if (r15 != 0) goto L_0x09b2
            if (r7 != 0) goto L_0x09b2
            int r0 = r12.zza
            long[] r2 = new long[r0]
            int[] r5 = new int[r0]
        L_0x0937:
            boolean r6 = r12.zza()
            if (r6 == 0) goto L_0x0948
            int r6 = r12.zzb
            long r7 = r12.zzd
            r2[r6] = r7
            int r7 = r12.zzc
            r5[r6] = r7
            goto L_0x0937
        L_0x0948:
            long r6 = (long) r13
            r8 = 8192(0x2000, float:1.14794E-41)
            int r8 = r8 / r3
            r9 = 0
            r10 = 0
        L_0x094e:
            if (r9 >= r0) goto L_0x095a
            r11 = r5[r9]
            int r11 = com.google.android.gms.internal.ads.zzen.zze(r11, r8)
            int r10 = r10 + r11
            int r9 = r9 + 1
            goto L_0x094e
        L_0x095a:
            long[] r9 = new long[r10]
            int[] r11 = new int[r10]
            long[] r12 = new long[r10]
            int[] r10 = new int[r10]
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0967:
            if (r13 >= r0) goto L_0x09a7
            r17 = r5[r13]
            r20 = r2[r13]
            r56 = r17
            r17 = r0
            r0 = r56
        L_0x0973:
            if (r0 <= 0) goto L_0x099e
            int r18 = java.lang.Math.min(r8, r0)
            r9[r16] = r20
            r22 = r2
            int r2 = r3 * r18
            r11[r16] = r2
            int r15 = java.lang.Math.max(r15, r2)
            r23 = r3
            long r2 = (long) r14
            long r2 = r2 * r6
            r12[r16] = r2
            r2 = 1
            r10[r16] = r2
            r2 = r11[r16]
            long r2 = (long) r2
            long r20 = r20 + r2
            int r14 = r14 + r18
            int r0 = r0 - r18
            int r16 = r16 + 1
            r2 = r22
            r3 = r23
            goto L_0x0973
        L_0x099e:
            r22 = r2
            r23 = r3
            int r13 = r13 + 1
            r0 = r17
            goto L_0x0967
        L_0x09a7:
            long r2 = (long) r14
            long r6 = r6 * r2
            r2 = r9
            r14 = r10
            r3 = r11
            r13 = r12
            r12 = r15
            r15 = r1
            r0 = r6
            goto L_0x0b5f
        L_0x09b2:
            r8 = 0
        L_0x09b3:
            long[] r0 = new long[r4]
            int[] r3 = new int[r4]
            long[] r5 = new long[r4]
            r17 = r7
            int[] r7 = new int[r4]
            r22 = r1
            r18 = r9
            r1 = r13
            r23 = r15
            r15 = r16
            r9 = 0
            r13 = 0
            r20 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r16 = r8
            r8 = 0
        L_0x09d3:
            if (r8 >= r4) goto L_0x0a95
            r29 = r25
            r25 = 1
        L_0x09d9:
            if (r20 != 0) goto L_0x09fe
            boolean r25 = r12.zza()
            if (r25 == 0) goto L_0x09f6
            r26 = r10
            r36 = r11
            long r10 = r12.zzd
            r37 = r4
            int r4 = r12.zzc
            r20 = r4
            r29 = r10
            r10 = r26
            r11 = r36
            r4 = r37
            goto L_0x09d9
        L_0x09f6:
            r37 = r4
            r26 = r10
            r36 = r11
            r4 = 0
            goto L_0x0a06
        L_0x09fe:
            r37 = r4
            r26 = r10
            r36 = r11
            r4 = r20
        L_0x0a06:
            if (r25 != 0) goto L_0x0a20
            java.lang.String r1 = "Unexpected end of chunk data"
            com.google.android.gms.internal.ads.zzdw.zze(r14, r1)
            long[] r0 = java.util.Arrays.copyOf(r0, r8)
            int[] r3 = java.util.Arrays.copyOf(r3, r8)
            long[] r5 = java.util.Arrays.copyOf(r5, r8)
            int[] r7 = java.util.Arrays.copyOf(r7, r8)
            r4 = r8
            goto L_0x0a97
        L_0x0a20:
            if (r2 == 0) goto L_0x0a38
        L_0x0a22:
            if (r24 != 0) goto L_0x0a35
            if (r23 <= 0) goto L_0x0a31
            int r24 = r2.zzn()
            int r13 = r2.zze()
            int r23 = r23 + -1
            goto L_0x0a22
        L_0x0a31:
            r10 = -1
            r24 = 0
            goto L_0x0a36
        L_0x0a35:
            r10 = -1
        L_0x0a36:
            int r24 = r24 + -1
        L_0x0a38:
            r0[r8] = r29
            int r10 = r6.zzc()
            r3[r8] = r10
            if (r10 <= r9) goto L_0x0a43
            r9 = r10
        L_0x0a43:
            long r10 = (long) r13
            long r10 = r27 + r10
            r5[r8] = r10
            if (r36 != 0) goto L_0x0a4c
            r10 = 1
            goto L_0x0a4d
        L_0x0a4c:
            r10 = 0
        L_0x0a4d:
            r7[r8] = r10
            if (r8 != r15) goto L_0x0a62
            r10 = 1
            r7[r8] = r10
            int r17 = r17 + -1
            if (r17 <= 0) goto L_0x0a62
            java.util.Objects.requireNonNull(r36)
            int r10 = r36.zzn()
            r11 = -1
            int r10 = r10 + r11
            r15 = r10
        L_0x0a62:
            long r10 = (long) r1
            long r27 = r27 + r10
            int r10 = r18 + -1
            if (r10 != 0) goto L_0x0a7c
            if (r16 <= 0) goto L_0x0a79
            int r1 = r26.zzn()
            int r10 = r26.zze()
            int r16 = r16 + -1
            r18 = r1
            r1 = r10
            goto L_0x0a7e
        L_0x0a79:
            r18 = 0
            goto L_0x0a7e
        L_0x0a7c:
            r18 = r10
        L_0x0a7e:
            r10 = r3[r8]
            long r10 = (long) r10
            long r10 = r29 + r10
            r21 = -1
            int r20 = r4 + -1
            int r8 = r8 + 1
            r4 = r37
            r56 = r10
            r10 = r26
            r25 = r56
            r11 = r36
            goto L_0x09d3
        L_0x0a95:
            r37 = r4
        L_0x0a97:
            long r10 = (long) r13
            long r10 = r27 + r10
            if (r2 == 0) goto L_0x0aac
        L_0x0a9c:
            if (r23 <= 0) goto L_0x0aac
            int r1 = r2.zzn()
            if (r1 == 0) goto L_0x0aa6
            r1 = 0
            goto L_0x0aad
        L_0x0aa6:
            r2.zze()
            int r23 = r23 + -1
            goto L_0x0a9c
        L_0x0aac:
            r1 = 1
        L_0x0aad:
            if (r17 != 0) goto L_0x0afa
            if (r18 != 0) goto L_0x0aee
            if (r20 != 0) goto L_0x0ae3
            if (r16 != 0) goto L_0x0ad9
            if (r24 != 0) goto L_0x0ace
            if (r1 != 0) goto L_0x0ac4
            r16 = r0
            r15 = r22
            r1 = 0
            r2 = 0
            r6 = 0
            r8 = 0
            r12 = 0
            r13 = 0
            goto L_0x0b08
        L_0x0ac4:
            r16 = r0
            r17 = r3
            r18 = r4
            r15 = r22
            goto L_0x0b55
        L_0x0ace:
            r16 = r0
            r15 = r22
            r13 = r24
            r2 = 0
            r6 = 0
            r8 = 0
            r12 = 0
            goto L_0x0b08
        L_0x0ad9:
            r12 = r16
            r15 = r22
            r13 = r24
            r2 = 0
            r6 = 0
            r8 = 0
            goto L_0x0b06
        L_0x0ae3:
            r12 = r16
            r8 = r20
            r15 = r22
            r13 = r24
            r2 = 0
            r6 = 0
            goto L_0x0b06
        L_0x0aee:
            r12 = r16
            r6 = r18
            r8 = r20
            r15 = r22
            r13 = r24
            r2 = 0
            goto L_0x0b06
        L_0x0afa:
            r12 = r16
            r2 = r17
            r6 = r18
            r8 = r20
            r15 = r22
            r13 = r24
        L_0x0b06:
            r16 = r0
        L_0x0b08:
            int r0 = r15.zza
            r17 = r3
            r3 = 1
            if (r3 == r1) goto L_0x0b12
            java.lang.String r1 = ", ctts invalid"
            goto L_0x0b14
        L_0x0b12:
            java.lang.String r1 = ""
        L_0x0b14:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r18 = r4
            java.lang.String r4 = "Inconsistent stbl box for track "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ": remainingSynchronizationSamples "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ", remainingSamplesAtTimestampDelta "
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = ", remainingSamplesInChunk "
            r3.append(r0)
            r3.append(r8)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r3.append(r0)
            r3.append(r12)
            java.lang.String r0 = ", remainingSamplesAtTimestampOffset "
            r3.append(r0)
            r3.append(r13)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r14, r0)
        L_0x0b55:
            r13 = r5
            r14 = r7
            r12 = r9
            r0 = r10
            r2 = r16
            r3 = r17
            r4 = r18
        L_0x0b5f:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r15.zzc
            r5 = r0
            long r22 = com.google.android.gms.internal.ads.zzen.zzw(r5, r7, r9)
            long[] r5 = r15.zzh
            if (r5 != 0) goto L_0x0b8b
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r15.zzc
            com.google.android.gms.internal.ads.zzen.zzR(r13, r0, r4)
            com.google.android.gms.internal.ads.zzafy r0 = new com.google.android.gms.internal.ads.zzafy
            r10 = r15
            r15 = r0
            r16 = r10
            r17 = r2
            r18 = r3
            r19 = r12
            r20 = r13
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
        L_0x0b88:
            r2 = r0
            goto L_0x087e
        L_0x0b8b:
            r10 = r15
            int r6 = r5.length
            r7 = 1
            if (r6 != r7) goto L_0x0c34
            int r6 = r10.zzb
            if (r6 != r7) goto L_0x0c34
            int r6 = r13.length
            r7 = 2
            if (r6 < r7) goto L_0x0c34
            long[] r6 = r10.zzi
            java.util.Objects.requireNonNull(r6)
            long[] r6 = (long[]) r6
            r7 = 0
            r15 = r6[r7]
            r17 = r5[r7]
            long r5 = r10.zzc
            long r7 = r10.zzd
            r19 = r5
            r21 = r7
            long r5 = com.google.android.gms.internal.ads.zzen.zzw(r17, r19, r21)
            long r17 = r15 + r5
            r5 = r13
            r6 = r0
            r8 = r15
            r19 = r4
            r4 = r10
            r10 = r17
            boolean r5 = zzo(r5, r6, r8, r10)
            if (r5 == 0) goto L_0x0c31
            r5 = 0
            r6 = r13[r5]
            long r20 = r15 - r6
            com.google.android.gms.internal.ads.zzaf r5 = r4.zzf
            int r5 = r5.zzA
            long r5 = (long) r5
            long r7 = r4.zzc
            r22 = r5
            r24 = r7
            long r5 = com.google.android.gms.internal.ads.zzen.zzw(r20, r22, r24)
            long r20 = r0 - r17
            com.google.android.gms.internal.ads.zzaf r7 = r4.zzf
            int r7 = r7.zzA
            long r7 = (long) r7
            long r9 = r4.zzc
            r22 = r7
            r24 = r9
            long r7 = com.google.android.gms.internal.ads.zzen.zzw(r20, r22, r24)
            r9 = 0
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0bf1
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0c31
            r5 = 0
        L_0x0bf1:
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x0c31
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x0c31
            int r0 = (int) r5
            r5 = r59
            r5.zza = r0
            int r0 = (int) r7
            r5.zzb = r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r4.zzc
            com.google.android.gms.internal.ads.zzen.zzR(r13, r0, r6)
            long[] r0 = r4.zzh
            r1 = 0
            r6 = r0[r1]
            long r10 = r4.zzd
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r22 = com.google.android.gms.internal.ads.zzen.zzw(r6, r8, r10)
            com.google.android.gms.internal.ads.zzafy r0 = new com.google.android.gms.internal.ads.zzafy
            r15 = r0
            r16 = r4
            r17 = r2
            r18 = r3
            r19 = r12
            r20 = r13
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0b88
        L_0x0c31:
            r5 = r59
            goto L_0x0c39
        L_0x0c34:
            r5 = r59
            r19 = r4
            r4 = r10
        L_0x0c39:
            long[] r6 = r4.zzh
            int r7 = r6.length
            r8 = 1
            if (r7 != r8) goto L_0x0c8b
            r8 = 0
            r9 = r6[r8]
            r6 = 0
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0c8a
            long[] r6 = r4.zzi
            java.util.Objects.requireNonNull(r6)
            long[] r6 = (long[]) r6
            r9 = r6[r8]
            r8 = 0
        L_0x0c52:
            int r6 = r13.length
            if (r8 >= r6) goto L_0x0c69
            r6 = r13[r8]
            long r15 = r6 - r9
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r4.zzc
            r19 = r6
            long r6 = com.google.android.gms.internal.ads.zzen.zzw(r15, r17, r19)
            r13[r8] = r6
            int r8 = r8 + 1
            goto L_0x0c52
        L_0x0c69:
            long r6 = r4.zzc
            long r15 = r0 - r9
            r17 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r6
            long r22 = com.google.android.gms.internal.ads.zzen.zzw(r15, r17, r19)
            com.google.android.gms.internal.ads.zzafy r0 = new com.google.android.gms.internal.ads.zzafy
            r15 = r0
            r16 = r4
            r17 = r2
            r18 = r3
            r19 = r12
            r20 = r13
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0b88
        L_0x0c8a:
            r7 = 1
        L_0x0c8b:
            int r0 = r4.zzb
            r1 = 1
            if (r0 != r1) goto L_0x0c92
            r0 = 1
            goto L_0x0c93
        L_0x0c92:
            r0 = 0
        L_0x0c93:
            int[] r1 = new int[r7]
            int[] r6 = new int[r7]
            long[] r7 = r4.zzi
            java.util.Objects.requireNonNull(r7)
            long[] r7 = (long[]) r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0ca2:
            long[] r15 = r4.zzh
            int r5 = r15.length
            if (r8 >= r5) goto L_0x0d0e
            r5 = r2
            r16 = r3
            r2 = r7[r8]
            r17 = -1
            int r17 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r17 == 0) goto L_0x0cf8
            r20 = r15[r8]
            r17 = r11
            r15 = r12
            long r11 = r4.zzc
            r18 = r9
            r26 = r10
            long r9 = r4.zzd
            r22 = r11
            r24 = r9
            long r9 = com.google.android.gms.internal.ads.zzen.zzw(r20, r22, r24)
            r11 = 1
            int r12 = com.google.android.gms.internal.ads.zzen.zzd(r13, r2, r11, r11)
            r1[r8] = r12
            long r2 = r2 + r9
            r9 = 0
            int r2 = com.google.android.gms.internal.ads.zzen.zzb(r13, r2, r0, r9)
            r6[r8] = r2
        L_0x0cd6:
            r2 = r1[r8]
            r3 = r6[r8]
            if (r2 >= r3) goto L_0x0ce7
            r10 = r14[r2]
            r10 = r10 & r11
            if (r10 != 0) goto L_0x0ce7
            int r2 = r2 + 1
            r1[r8] = r2
            r11 = 1
            goto L_0x0cd6
        L_0x0ce7:
            int r10 = r3 - r2
            int r10 = r18 + r10
            r11 = r26
            if (r11 == r2) goto L_0x0cf1
            r2 = 1
            goto L_0x0cf2
        L_0x0cf1:
            r2 = r9
        L_0x0cf2:
            r2 = r17 | r2
            r17 = r2
            r11 = r3
            goto L_0x0d01
        L_0x0cf8:
            r18 = r9
            r17 = r11
            r15 = r12
            r9 = 0
            r11 = r10
            r10 = r18
        L_0x0d01:
            int r8 = r8 + 1
            r2 = r5
            r9 = r10
            r10 = r11
            r12 = r15
            r3 = r16
            r11 = r17
            r5 = r59
            goto L_0x0ca2
        L_0x0d0e:
            r5 = r2
            r16 = r3
            r10 = r9
            r17 = r11
            r15 = r12
            r2 = r19
            r9 = 0
            if (r10 == r2) goto L_0x0d1c
            r7 = 1
            goto L_0x0d1d
        L_0x0d1c:
            r7 = r9
        L_0x0d1d:
            r0 = r17 | r7
            if (r0 == 0) goto L_0x0d24
            long[] r2 = new long[r10]
            goto L_0x0d25
        L_0x0d24:
            r2 = r5
        L_0x0d25:
            if (r0 == 0) goto L_0x0d2a
            int[] r3 = new int[r10]
            goto L_0x0d2c
        L_0x0d2a:
            r3 = r16
        L_0x0d2c:
            r7 = 1
            if (r7 != r0) goto L_0x0d31
            r8 = r9
            goto L_0x0d32
        L_0x0d31:
            r8 = r15
        L_0x0d32:
            if (r0 == 0) goto L_0x0d37
            int[] r7 = new int[r10]
            goto L_0x0d38
        L_0x0d37:
            r7 = r14
        L_0x0d38:
            long[] r10 = new long[r10]
            r12 = r8
            r8 = r9
            r11 = r8
            r23 = 0
        L_0x0d3f:
            long[] r15 = r4.zzh
            int r15 = r15.length
            if (r8 >= r15) goto L_0x0dd5
            long[] r15 = r4.zzi
            r25 = r15[r8]
            r15 = r1[r8]
            r9 = r6[r8]
            if (r0 == 0) goto L_0x0d60
            r27 = r1
            int r1 = r9 - r15
            java.lang.System.arraycopy(r5, r15, r2, r11, r1)
            r28 = r5
            r5 = r16
            java.lang.System.arraycopy(r5, r15, r3, r11, r1)
            java.lang.System.arraycopy(r14, r15, r7, r11, r1)
            goto L_0x0d66
        L_0x0d60:
            r27 = r1
            r28 = r5
            r5 = r16
        L_0x0d66:
            if (r15 >= r9) goto L_0x0db0
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r1 = r6
            r29 = r7
            long r6 = r4.zzd
            r17 = r23
            r21 = r6
            long r6 = com.google.android.gms.internal.ads.zzen.zzw(r17, r19, r21)
            r16 = r13[r15]
            r18 = r13
            r19 = r14
            long r13 = r16 - r25
            r16 = r1
            r30 = r2
            r1 = 0
            long r33 = java.lang.Math.max(r1, r13)
            r35 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r4.zzc
            r37 = r13
            long r13 = com.google.android.gms.internal.ads.zzen.zzw(r33, r35, r37)
            long r6 = r6 + r13
            r10[r11] = r6
            if (r0 == 0) goto L_0x0da1
            r6 = r3[r11]
            if (r6 <= r12) goto L_0x0da1
            r6 = r5[r15]
            r12 = r6
        L_0x0da1:
            int r11 = r11 + 1
            int r15 = r15 + 1
            r6 = r16
            r13 = r18
            r14 = r19
            r7 = r29
            r2 = r30
            goto L_0x0d66
        L_0x0db0:
            r30 = r2
            r16 = r6
            r29 = r7
            r18 = r13
            r19 = r14
            r1 = 0
            long[] r6 = r4.zzh
            r13 = r6[r8]
            long r23 = r23 + r13
            int r8 = r8 + 1
            r6 = r16
            r13 = r18
            r14 = r19
            r1 = r27
            r2 = r30
            r9 = 0
            r16 = r5
            r5 = r28
            goto L_0x0d3f
        L_0x0dd5:
            r30 = r2
            r29 = r7
            long r0 = r4.zzd
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r17 = r23
            r21 = r0
            long r22 = com.google.android.gms.internal.ads.zzen.zzw(r17, r19, r21)
            com.google.android.gms.internal.ads.zzafy r2 = new com.google.android.gms.internal.ads.zzafy
            r15 = r2
            r16 = r4
            r17 = r30
            r18 = r3
            r19 = r12
            r20 = r10
            r21 = r29
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x087e
        L_0x0dfa:
            r0.add(r2)
            goto L_0x0e08
        L_0x0dfe:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r0, r1)
            throw r0
        L_0x0e06:
            r0 = r32
        L_0x0e08:
            int r15 = r31 + 1
            r1 = r59
            r12 = r62
            r13 = r0
            r0 = r58
            goto L_0x000c
        L_0x0e13:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaff.zzc(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzzx, long, com.google.android.gms.internal.ads.zzx, boolean, boolean, com.google.android.gms.internal.ads.zzfsm):java.util.List");
    }

    public static void zzd(zzef zzef) {
        int zzc = zzef.zzc();
        zzef.zzG(4);
        if (zzef.zze() != 1751411826) {
            zzc += 4;
        }
        zzef.zzF(zzc);
    }

    private static int zze(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static int zzf(zzef zzef) {
        int zzk = zzef.zzk();
        int i = zzk & WorkQueueKt.MASK;
        while ((zzk & 128) == 128) {
            zzk = zzef.zzk();
            i = (i << 7) | (zzk & WorkQueueKt.MASK);
        }
        return i;
    }

    private static int zzg(zzef zzef) {
        zzef.zzF(16);
        return zzef.zze();
    }

    private static Pair zzh(zzaev zzaev) {
        zzaew zzb = zzaev.zzb(1701606260);
        if (zzb == null) {
            return null;
        }
        zzef zzef = zzb.zza;
        zzef.zzF(8);
        int zze = zzaex.zze(zzef.zze());
        int zzn = zzef.zzn();
        long[] jArr = new long[zzn];
        long[] jArr2 = new long[zzn];
        int i = 0;
        while (i < zzn) {
            jArr[i] = zze == 1 ? zzef.zzt() : zzef.zzs();
            jArr2[i] = zze == 1 ? zzef.zzr() : (long) zzef.zze();
            if (zzef.zzy() == 1) {
                zzef.zzG(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzi(zzef zzef) {
        int i = 8;
        zzef.zzF(8);
        int zze = zzaex.zze(zzef.zze());
        zzef.zzG(zze == 0 ? 8 : 16);
        long zzs = zzef.zzs();
        if (zze == 0) {
            i = 4;
        }
        zzef.zzG(i);
        int zzo = zzef.zzo();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((zzo >> 10) & 31) + 96));
        sb.append((char) (((zzo >> 5) & 31) + 96));
        sb.append((char) ((zzo & 31) + 96));
        return Pair.create(Long.valueOf(zzs), sb.toString());
    }

    private static Pair zzj(zzef zzef, int i, int i2) throws zzbu {
        Pair pair;
        Integer num;
        zzafw zzafw;
        int i3;
        int i4;
        byte[] bArr;
        zzef zzef2 = zzef;
        int zzc = zzef.zzc();
        while (zzc - i < i2) {
            zzef2.zzF(zzc);
            int zze = zzef.zze();
            boolean z = true;
            zzzm.zzb(zze > 0, "childAtomSize must be positive");
            if (zzef.zze() == 1936289382) {
                int i5 = zzc + 8;
                int i6 = 0;
                int i7 = -1;
                String str = null;
                Integer num2 = null;
                while (i5 - zzc < zze) {
                    zzef2.zzF(i5);
                    int zze2 = zzef.zze();
                    int zze3 = zzef.zze();
                    if (zze3 == 1718775137) {
                        num2 = Integer.valueOf(zzef.zze());
                    } else if (zze3 == 1935894637) {
                        zzef2.zzG(4);
                        str = zzef2.zzx(4, zzfsk.zzc);
                    } else if (zze3 == 1935894633) {
                        i7 = i5;
                        i6 = zze2;
                    }
                    i5 += zze2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzzm.zzb(num2 != null, "frma atom is mandatory");
                    zzzm.zzb(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num2;
                            zzafw = null;
                            break;
                        }
                        zzef2.zzF(i8);
                        int zze4 = zzef.zze();
                        if (zzef.zze() == 1952804451) {
                            int zze5 = zzef.zze();
                            zzef2.zzG(1);
                            if (zzaex.zze(zze5) == 0) {
                                zzef2.zzG(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int zzk = zzef.zzk();
                                i4 = zzk & 15;
                                i3 = (zzk & 240) >> 4;
                            }
                            boolean z2 = zzef.zzk() == 1;
                            int zzk2 = zzef.zzk();
                            byte[] bArr2 = new byte[16];
                            zzef2.zzB(bArr2, 0, 16);
                            if (!z2 || zzk2 != 0) {
                                bArr = null;
                            } else {
                                int zzk3 = zzef.zzk();
                                byte[] bArr3 = new byte[zzk3];
                                zzef2.zzB(bArr3, 0, zzk3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzafw = new zzafw(z2, str, zzk2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i8 += zze4;
                        }
                    }
                    if (zzafw == null) {
                        z = false;
                    }
                    zzzm.zzb(z, "tenc atom is mandatory");
                    int i9 = zzen.zza;
                    pair = Pair.create(num, zzafw);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            zzc += zze;
        }
        return null;
    }

    private static zzaez zzk(zzef zzef, int i) {
        zzef.zzF(i + 12);
        zzef.zzG(1);
        zzf(zzef);
        zzef.zzG(2);
        int zzk = zzef.zzk();
        if ((zzk & 128) != 0) {
            zzef.zzG(2);
        }
        if ((zzk & 64) != 0) {
            zzef.zzG(zzef.zzk());
        }
        if ((zzk & 32) != 0) {
            zzef.zzG(2);
        }
        zzef.zzG(1);
        zzf(zzef);
        String zzd = zzbt.zzd(zzef.zzk());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzaez(zzd, (byte[]) null, -1, -1);
        }
        zzef.zzG(4);
        long zzs = zzef.zzs();
        long zzs2 = zzef.zzs();
        zzef.zzG(1);
        int zzf = zzf(zzef);
        byte[] bArr = new byte[zzf];
        zzef.zzB(bArr, 0, zzf);
        return new zzaez(zzd, bArr, zzs2 <= 0 ? -1 : zzs2, zzs > 0 ? zzs : -1);
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARNING: Removed duplicated region for block: B:169:0x039c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzm(com.google.android.gms.internal.ads.zzef r24, int r25, int r26, int r27, int r28, java.lang.String r29, boolean r30, com.google.android.gms.internal.ads.zzx r31, com.google.android.gms.internal.ads.zzafb r32, int r33) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r0 = r24
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r31
            r6 = r32
            int r7 = r1 + 16
            r0.zzF(r7)
            r7 = 6
            if (r30 == 0) goto L_0x001e
            int r9 = r24.zzo()
            r0.zzG(r7)
            goto L_0x0024
        L_0x001e:
            r9 = 8
            r0.zzG(r9)
            r9 = 0
        L_0x0024:
            r10 = 20
            r11 = 16
            r12 = 2
            r13 = 1
            if (r9 == 0) goto L_0x004b
            if (r9 != r13) goto L_0x002f
            goto L_0x004b
        L_0x002f:
            if (r9 != r12) goto L_0x004a
            r0.zzG(r11)
            long r14 = r24.zzr()
            double r14 = java.lang.Double.longBitsToDouble(r14)
            long r14 = java.lang.Math.round(r14)
            int r7 = (int) r14
            int r9 = r24.zzn()
            r0.zzG(r10)
            r15 = 0
            goto L_0x0069
        L_0x004a:
            return
        L_0x004b:
            int r14 = r24.zzo()
            r0.zzG(r7)
            int r7 = r24.zzl()
            int r15 = r24.zzc()
            int r15 = r15 + -4
            r0.zzF(r15)
            int r15 = r24.zze()
            if (r9 != r13) goto L_0x0068
            r0.zzG(r11)
        L_0x0068:
            r9 = r14
        L_0x0069:
            int r11 = r24.zzc()
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r12 = r25
            if (r12 != r14) goto L_0x009c
            android.util.Pair r12 = zzj(r0, r1, r2)
            if (r12 == 0) goto L_0x0098
            java.lang.Object r14 = r12.first
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r5 != 0) goto L_0x0086
            r5 = 0
            goto L_0x0090
        L_0x0086:
            java.lang.Object r13 = r12.second
            com.google.android.gms.internal.ads.zzafw r13 = (com.google.android.gms.internal.ads.zzafw) r13
            java.lang.String r13 = r13.zzb
            com.google.android.gms.internal.ads.zzx r5 = r5.zzb(r13)
        L_0x0090:
            com.google.android.gms.internal.ads.zzafw[] r13 = r6.zza
            java.lang.Object r12 = r12.second
            com.google.android.gms.internal.ads.zzafw r12 = (com.google.android.gms.internal.ads.zzafw) r12
            r13[r33] = r12
        L_0x0098:
            r0.zzF(r11)
            r12 = r14
        L_0x009c:
            r13 = 1633889587(0x61632d33, float:2.6191674E20)
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r19 = "audio/raw"
            java.lang.String r10 = "audio/ac4"
            if (r12 != r13) goto L_0x00ad
            java.lang.String r19 = "audio/ac3"
        L_0x00aa:
            r12 = -1
            goto L_0x015f
        L_0x00ad:
            r13 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r12 != r13) goto L_0x00b5
            java.lang.String r19 = "audio/eac3"
            goto L_0x00aa
        L_0x00b5:
            r13 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r12 != r13) goto L_0x00bd
            r19 = r10
            goto L_0x00aa
        L_0x00bd:
            r13 = 1685353315(0x64747363, float:1.803728E22)
            if (r12 != r13) goto L_0x00c5
            java.lang.String r19 = "audio/vnd.dts"
            goto L_0x00aa
        L_0x00c5:
            r13 = 1685353320(0x64747368, float:1.8037286E22)
            if (r12 == r13) goto L_0x015b
            r13 = 1685353324(0x6474736c, float:1.803729E22)
            if (r12 != r13) goto L_0x00d1
            goto L_0x015b
        L_0x00d1:
            r13 = 1685353317(0x64747365, float:1.8037282E22)
            if (r12 != r13) goto L_0x00d9
            java.lang.String r19 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00aa
        L_0x00d9:
            r13 = 1685353336(0x64747378, float:1.8037304E22)
            if (r12 != r13) goto L_0x00e1
            java.lang.String r19 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x00aa
        L_0x00e1:
            r13 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r12 != r13) goto L_0x00e9
            java.lang.String r19 = "audio/3gpp"
            goto L_0x00aa
        L_0x00e9:
            r13 = 1935767394(0x73617762, float:1.7863284E31)
            if (r12 != r13) goto L_0x00f1
            java.lang.String r19 = "audio/amr-wb"
            goto L_0x00aa
        L_0x00f1:
            r13 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r12 == r13) goto L_0x0159
            r13 = 1936684916(0x736f7774, float:1.89725E31)
            if (r12 != r13) goto L_0x00fc
            goto L_0x0159
        L_0x00fc:
            r13 = 1953984371(0x74776f73, float:7.841539E31)
            if (r12 != r13) goto L_0x0104
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x015f
        L_0x0104:
            r13 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r12 == r13) goto L_0x0155
            r13 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r12 != r13) goto L_0x010f
            goto L_0x0155
        L_0x010f:
            r13 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r12 != r13) goto L_0x0117
            java.lang.String r19 = "audio/mha1"
            goto L_0x00aa
        L_0x0117:
            r13 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r12 != r13) goto L_0x011f
            java.lang.String r19 = "audio/mhm1"
            goto L_0x00aa
        L_0x011f:
            if (r12 != r14) goto L_0x0124
            java.lang.String r19 = "audio/alac"
            goto L_0x00aa
        L_0x0124:
            r13 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r12 != r13) goto L_0x012d
            java.lang.String r19 = "audio/g711-alaw"
            goto L_0x00aa
        L_0x012d:
            r13 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r12 != r13) goto L_0x0136
            java.lang.String r19 = "audio/g711-mlaw"
            goto L_0x00aa
        L_0x0136:
            r13 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r12 != r13) goto L_0x013f
            java.lang.String r19 = "audio/opus"
            goto L_0x00aa
        L_0x013f:
            r13 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r12 != r13) goto L_0x0148
            java.lang.String r19 = "audio/flac"
            goto L_0x00aa
        L_0x0148:
            r13 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r12 != r13) goto L_0x0151
            java.lang.String r19 = "audio/true-hd"
            goto L_0x00aa
        L_0x0151:
            r12 = -1
            r19 = 0
            goto L_0x015f
        L_0x0155:
            java.lang.String r19 = "audio/mpeg"
            goto L_0x00aa
        L_0x0159:
            r12 = 2
            goto L_0x015f
        L_0x015b:
            java.lang.String r19 = "audio/vnd.dts.hd"
            goto L_0x00aa
        L_0x015f:
            r13 = r19
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0167:
            int r8 = r11 - r1
            if (r8 >= r2) goto L_0x0396
            r0.zzF(r11)
            int r8 = r24.zze()
            if (r8 <= 0) goto L_0x0176
            r14 = 1
            goto L_0x0177
        L_0x0176:
            r14 = 0
        L_0x0177:
            java.lang.String r1 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzzm.zzb(r14, r1)
            int r14 = r24.zze()
            r2 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r14 != r2) goto L_0x01a1
            int r1 = r8 + -13
            byte[] r2 = new byte[r1]
            int r14 = r11 + 13
            r0.zzF(r14)
            r14 = 0
            r0.zzB(r2, r14, r1)
            com.google.android.gms.internal.ads.zzfvn r21 = com.google.android.gms.internal.ads.zzfvn.zzp(r2)
            r22 = r12
        L_0x0198:
            r12 = 0
            r14 = 20
            r17 = 2
            r18 = 1
            goto L_0x038a
        L_0x01a1:
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r14 == r2) goto L_0x0353
            if (r30 == 0) goto L_0x01f8
            r2 = 2002876005(0x77617665, float:4.5729223E33)
            if (r14 != r2) goto L_0x01f8
            int r2 = r24.zzc()
            if (r2 < r11) goto L_0x01b8
            r22 = r2
            r2 = 0
            r14 = 1
            goto L_0x01bc
        L_0x01b8:
            r22 = r2
            r2 = 0
            r14 = 0
        L_0x01bc:
            com.google.android.gms.internal.ads.zzzm.zzb(r14, r2)
            r2 = r22
        L_0x01c1:
            int r14 = r2 - r11
            if (r14 >= r8) goto L_0x01eb
            r0.zzF(r2)
            int r14 = r24.zze()
            if (r14 <= 0) goto L_0x01d2
            r22 = r12
            r12 = 1
            goto L_0x01d5
        L_0x01d2:
            r22 = r12
            r12 = 0
        L_0x01d5:
            com.google.android.gms.internal.ads.zzzm.zzb(r12, r1)
            int r12 = r24.zze()
            r23 = r1
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r12 == r1) goto L_0x01e9
            int r2 = r2 + r14
            r12 = r22
            r1 = r23
            goto L_0x01c1
        L_0x01e9:
            r1 = -1
            goto L_0x01ef
        L_0x01eb:
            r22 = r12
            r1 = -1
            r2 = -1
        L_0x01ef:
            r12 = 0
            r14 = 20
            r17 = 2
            r18 = 1
            goto L_0x035e
        L_0x01f8:
            r22 = r12
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r14 != r1) goto L_0x0212
            int r1 = r11 + 8
            r0.zzF(r1)
            java.lang.String r1 = java.lang.Integer.toString(r28)
            com.google.android.gms.internal.ads.zzaf r1 = com.google.android.gms.internal.ads.zzyj.zzc(r0, r1, r4, r5)
            r6.zzb = r1
        L_0x020e:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0198
        L_0x0212:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r14 != r1) goto L_0x0227
            int r1 = r11 + 8
            r0.zzF(r1)
            java.lang.String r1 = java.lang.Integer.toString(r28)
            com.google.android.gms.internal.ads.zzaf r1 = com.google.android.gms.internal.ads.zzyj.zzd(r0, r1, r4, r5)
            r6.zzb = r1
            goto L_0x020e
        L_0x0227:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r14 != r1) goto L_0x026b
            int r1 = r11 + 8
            r0.zzF(r1)
            java.lang.String r1 = java.lang.Integer.toString(r28)
            int r2 = com.google.android.gms.internal.ads.zzym.zza
            r2 = 1
            r0.zzG(r2)
            int r12 = r24.zzk()
            r12 = r12 & 32
            int r12 = r12 >> 5
            if (r2 == r12) goto L_0x0249
            r2 = 44100(0xac44, float:6.1797E-41)
            goto L_0x024c
        L_0x0249:
            r2 = 48000(0xbb80, float:6.7262E-41)
        L_0x024c:
            com.google.android.gms.internal.ads.zzad r12 = new com.google.android.gms.internal.ads.zzad
            r12.<init>()
            r12.zzH(r1)
            r12.zzS(r10)
            r1 = 2
            r12.zzw(r1)
            r12.zzT(r2)
            r12.zzB(r5)
            r12.zzK(r4)
            com.google.android.gms.internal.ads.zzaf r1 = r12.zzY()
            r6.zzb = r1
            goto L_0x020e
        L_0x026b:
            r1 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r14 != r1) goto L_0x028d
            if (r15 <= 0) goto L_0x0276
            r7 = r15
            r9 = 2
            goto L_0x0198
        L_0x0276:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r0, r1)
            throw r0
        L_0x028d:
            r1 = 0
            r2 = 1684305011(0x64647473, float:1.6856995E22)
            if (r14 != r2) goto L_0x02b2
            com.google.android.gms.internal.ads.zzad r2 = new com.google.android.gms.internal.ads.zzad
            r2.<init>()
            r2.zzG(r3)
            r2.zzS(r13)
            r2.zzw(r9)
            r2.zzT(r7)
            r2.zzB(r5)
            r2.zzK(r4)
            com.google.android.gms.internal.ads.zzaf r2 = r2.zzY()
            r6.zzb = r2
            goto L_0x020e
        L_0x02b2:
            r2 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r14 != r2) goto L_0x02d0
            int r2 = r8 + -8
            byte[] r12 = zza
            int r14 = r12.length
            int r14 = r14 + r2
            byte[] r14 = java.util.Arrays.copyOf(r12, r14)
            int r1 = r11 + 8
            r0.zzF(r1)
            int r1 = r12.length
            r0.zzB(r14, r1, r2)
            java.util.List r21 = com.google.android.gms.internal.ads.zzaag.zza(r14)
            goto L_0x0198
        L_0x02d0:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r14 != r1) goto L_0x0303
            int r1 = r8 + -12
            int r2 = r1 + 4
            byte[] r2 = new byte[r2]
            r12 = 102(0x66, float:1.43E-43)
            r14 = 0
            r2[r14] = r12
            r12 = 76
            r18 = 1
            r2[r18] = r12
            r12 = 97
            r17 = 2
            r2[r17] = r12
            r12 = 3
            r14 = 67
            r2[r12] = r14
            int r12 = r11 + 12
            r0.zzF(r12)
            r12 = 4
            r0.zzB(r2, r12, r1)
            com.google.android.gms.internal.ads.zzfvn r21 = com.google.android.gms.internal.ads.zzfvn.zzp(r2)
        L_0x02fe:
            r12 = 0
            r14 = 20
            goto L_0x038a
        L_0x0303:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r17 = 2
            r18 = 1
            if (r14 != r1) goto L_0x02fe
            int r2 = r8 + -12
            byte[] r7 = new byte[r2]
            int r9 = r11 + 12
            r0.zzF(r9)
            r12 = 0
            r0.zzB(r7, r12, r2)
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            r2.<init>((byte[]) r7)
            r9 = 9
            r2.zzF(r9)
            int r9 = r2.zzk()
            r14 = 20
            r2.zzF(r14)
            int r2 = r2.zzn()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r2 = android.util.Pair.create(r2, r9)
            java.lang.Object r9 = r2.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.gms.internal.ads.zzfvn r21 = com.google.android.gms.internal.ads.zzfvn.zzp(r7)
            r7 = r9
            r9 = r2
            goto L_0x038a
        L_0x0353:
            r22 = r12
            r12 = 0
            r14 = 20
            r17 = 2
            r18 = 1
            r2 = r11
            r1 = -1
        L_0x035e:
            if (r2 == r1) goto L_0x038a
            com.google.android.gms.internal.ads.zzaez r2 = zzk(r0, r2)
            java.lang.String r13 = r2.zza
            byte[] r16 = r2.zzb
            if (r16 == 0) goto L_0x0388
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0382
            com.google.android.gms.internal.ads.zzyf r1 = com.google.android.gms.internal.ads.zzyg.zza(r16)
            int r7 = r1.zza
            int r9 = r1.zzb
            java.lang.String r1 = r1.zzc
            r20 = r1
        L_0x0382:
            com.google.android.gms.internal.ads.zzfvn r1 = com.google.android.gms.internal.ads.zzfvn.zzp(r16)
            r21 = r1
        L_0x0388:
            r19 = r2
        L_0x038a:
            int r11 = r11 + r8
            r1 = r26
            r2 = r27
            r12 = r22
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0167
        L_0x0396:
            r22 = r12
            com.google.android.gms.internal.ads.zzaf r0 = r6.zzb
            if (r0 != 0) goto L_0x03e2
            if (r13 == 0) goto L_0x03e2
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            r0.zzG(r3)
            r0.zzS(r13)
            r1 = r20
            r0.zzx(r1)
            r0.zzw(r9)
            r0.zzT(r7)
            r8 = r22
            r0.zzN(r8)
            r1 = r21
            r0.zzI(r1)
            r0.zzB(r5)
            r0.zzK(r4)
            if (r19 == 0) goto L_0x03dc
            long r1 = r19.zzc
            int r1 = com.google.android.gms.internal.ads.zzfxs.zzc(r1)
            r0.zzv(r1)
            long r1 = r19.zzd
            int r1 = com.google.android.gms.internal.ads.zzfxs.zzc(r1)
            r0.zzO(r1)
        L_0x03dc:
            com.google.android.gms.internal.ads.zzaf r0 = r0.zzY()
            r6.zzb = r0
        L_0x03e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaff.zzm(com.google.android.gms.internal.ads.zzef, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzx, com.google.android.gms.internal.ads.zzafb, int):void");
    }

    private static void zzn(zzef zzef, int i, int i2, int i3, zzafb zzafb) {
        zzef.zzF(i2 + 16);
        zzef.zzv(0);
        String zzv = zzef.zzv(0);
        if (zzv != null) {
            zzad zzad = new zzad();
            zzad.zzG(i3);
            zzad.zzS(zzv);
            zzafb.zzb = zzad.zzY();
        }
    }

    private static boolean zzo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        int zzf = zzen.zzf(4, 0, i);
        int zzf2 = zzen.zzf(length - 4, 0, i);
        if (jArr[0] > j2 || j2 >= jArr[zzf] || jArr[zzf2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }
}
