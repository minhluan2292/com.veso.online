package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzawd {
    private static final int zza = zzbar.zzg("vide");
    private static final int zzb = zzbar.zzg("soun");
    private static final int zzc = zzbar.zzg("text");
    private static final int zzd = zzbar.zzg("sbtl");
    private static final int zze = zzbar.zzg("subt");
    private static final int zzf = zzbar.zzg("clcp");
    private static final int zzg = zzbar.zzg("cenc");
    private static final int zzh = zzbar.zzg("meta");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v5, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r11v16, types: [java.util.List] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x054b: MOVE  (r6v19 java.lang.String) = (r44v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x07dc  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x082f  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0838 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0839  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b3  */
    public static com.google.android.gms.internal.ads.zzawo zza(com.google.android.gms.internal.ads.zzavu r50, com.google.android.gms.internal.ads.zzavv r51, long r52, com.google.android.gms.internal.ads.zzauv r54, boolean r55) throws com.google.android.gms.internal.ads.zzasz {
        /*
            r0 = r50
            r15 = r54
            int r1 = com.google.android.gms.internal.ads.zzavw.zzH
            com.google.android.gms.internal.ads.zzavu r1 = r0.zza(r1)
            int r2 = com.google.android.gms.internal.ads.zzavw.zzV
            com.google.android.gms.internal.ads.zzavv r2 = r1.zzb(r2)
            com.google.android.gms.internal.ads.zzbak r2 = r2.zza
            r14 = 16
            r2.zzv(r14)
            int r2 = r2.zze()
            int r3 = zzb
            r4 = 4
            r11 = -1
            if (r2 != r3) goto L_0x0023
            r10 = 1
            goto L_0x0043
        L_0x0023:
            int r3 = zza
            if (r2 != r3) goto L_0x0029
            r10 = 2
            goto L_0x0043
        L_0x0029:
            int r3 = zzc
            if (r2 == r3) goto L_0x0042
            int r3 = zzd
            if (r2 == r3) goto L_0x0042
            int r3 = zze
            if (r2 == r3) goto L_0x0042
            int r3 = zzf
            if (r2 != r3) goto L_0x003a
            goto L_0x0042
        L_0x003a:
            int r3 = zzh
            if (r2 != r3) goto L_0x0040
            r10 = r4
            goto L_0x0043
        L_0x0040:
            r10 = r11
            goto L_0x0043
        L_0x0042:
            r10 = 3
        L_0x0043:
            r8 = 0
            if (r10 != r11) goto L_0x0047
            return r8
        L_0x0047:
            int r2 = com.google.android.gms.internal.ads.zzavw.zzR
            com.google.android.gms.internal.ads.zzavv r2 = r0.zzb(r2)
            com.google.android.gms.internal.ads.zzbak r2 = r2.zza
            r7 = 8
            r2.zzv(r7)
            int r3 = r2.zze()
            int r3 = com.google.android.gms.internal.ads.zzavw.zzf(r3)
            if (r3 != 0) goto L_0x0060
            r5 = r7
            goto L_0x0061
        L_0x0060:
            r5 = r14
        L_0x0061:
            r2.zzw(r5)
            int r5 = r2.zze()
            r2.zzw(r4)
            int r6 = r2.zzc()
            if (r3 != 0) goto L_0x0073
            r12 = r4
            goto L_0x0074
        L_0x0073:
            r12 = r7
        L_0x0074:
            r9 = 0
        L_0x0075:
            r19 = 0
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 >= r12) goto L_0x0099
            byte[] r13 = r2.zza
            int r24 = r6 + r9
            byte r13 = r13[r24]
            if (r13 == r11) goto L_0x0096
            if (r3 != 0) goto L_0x008d
            long r12 = r2.zzm()
            goto L_0x0091
        L_0x008d:
            long r12 = r2.zzn()
        L_0x0091:
            int r3 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x009e
            goto L_0x009c
        L_0x0096:
            int r9 = r9 + 1
            goto L_0x0075
        L_0x0099:
            r2.zzw(r12)
        L_0x009c:
            r12 = r21
        L_0x009e:
            r2.zzw(r14)
            int r3 = r2.zze()
            int r6 = r2.zze()
            r2.zzw(r4)
            int r9 = r2.zze()
            int r2 = r2.zze()
            r4 = 65536(0x10000, float:9.18355E-41)
            r14 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x00c8
            if (r6 != r4) goto L_0x00c7
            if (r9 != r14) goto L_0x00c6
            if (r2 != 0) goto L_0x00c3
            r2 = 90
            goto L_0x00e6
        L_0x00c3:
            r6 = r4
            r9 = r14
            goto L_0x00c7
        L_0x00c6:
            r6 = r4
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            if (r3 != 0) goto L_0x00d9
            if (r6 != r14) goto L_0x00d6
            if (r9 != r4) goto L_0x00d3
            if (r2 != 0) goto L_0x00d4
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00e6
        L_0x00d3:
            r4 = r9
        L_0x00d4:
            r6 = r14
            goto L_0x00d7
        L_0x00d6:
            r4 = r9
        L_0x00d7:
            r3 = 0
            goto L_0x00da
        L_0x00d9:
            r4 = r9
        L_0x00da:
            if (r3 != r14) goto L_0x00e5
            if (r6 != 0) goto L_0x00e5
            if (r4 != 0) goto L_0x00e5
            if (r2 != r14) goto L_0x00e5
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00e6
        L_0x00e5:
            r2 = 0
        L_0x00e6:
            com.google.android.gms.internal.ads.zzawc r14 = new com.google.android.gms.internal.ads.zzawc
            r14.<init>(r5, r12, r2)
            int r2 = (r52 > r21 ? 1 : (r52 == r21 ? 0 : -1))
            if (r2 != 0) goto L_0x00f8
            long r2 = r14.zzb
            r26 = r2
            r2 = r51
            goto L_0x00fc
        L_0x00f8:
            r2 = r51
            r26 = r52
        L_0x00fc:
            com.google.android.gms.internal.ads.zzbak r2 = r2.zza
            r2.zzv(r7)
            int r3 = r2.zze()
            int r3 = com.google.android.gms.internal.ads.zzavw.zzf(r3)
            if (r3 != 0) goto L_0x010d
            r3 = r7
            goto L_0x010f
        L_0x010d:
            r3 = 16
        L_0x010f:
            r2.zzw(r3)
            long r32 = r2.zzm()
            int r2 = (r26 > r21 ? 1 : (r26 == r21 ? 0 : -1))
            if (r2 != 0) goto L_0x011d
            r26 = r21
            goto L_0x0128
        L_0x011d:
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r30 = r32
            long r2 = com.google.android.gms.internal.ads.zzbar.zzj(r26, r28, r30)
            r26 = r2
        L_0x0128:
            int r2 = com.google.android.gms.internal.ads.zzavw.zzI
            com.google.android.gms.internal.ads.zzavu r2 = r1.zza(r2)
            int r3 = com.google.android.gms.internal.ads.zzavw.zzJ
            com.google.android.gms.internal.ads.zzavu r2 = r2.zza(r3)
            int r3 = com.google.android.gms.internal.ads.zzavw.zzU
            com.google.android.gms.internal.ads.zzavv r1 = r1.zzb(r3)
            com.google.android.gms.internal.ads.zzbak r1 = r1.zza
            r1.zzv(r7)
            int r3 = r1.zze()
            int r3 = com.google.android.gms.internal.ads.zzavw.zzf(r3)
            if (r3 != 0) goto L_0x014b
            r4 = r7
            goto L_0x014d
        L_0x014b:
            r4 = 16
        L_0x014d:
            r1.zzw(r4)
            long r4 = r1.zzm()
            if (r3 != 0) goto L_0x0158
            r3 = 4
            goto L_0x0159
        L_0x0158:
            r3 = r7
        L_0x0159:
            r1.zzw(r3)
            int r1 = r1.zzj()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r6 = r1 >> 10
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r3.append(r6)
            int r6 = r1 >> 5
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r3.append(r6)
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r3.append(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r3 = r3.toString()
            android.util.Pair r13 = android.util.Pair.create(r1, r3)
            int r1 = com.google.android.gms.internal.ads.zzavw.zzW
            com.google.android.gms.internal.ads.zzavv r1 = r2.zzb(r1)
            com.google.android.gms.internal.ads.zzbak r12 = r1.zza
            int r21 = r14.zza
            int r22 = r14.zzc
            java.lang.Object r1 = r13.second
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            r1 = 12
            r12.zzv(r1)
            int r6 = r12.zze()
            com.google.android.gms.internal.ads.zzavz r5 = new com.google.android.gms.internal.ads.zzavz
            r5.<init>(r6)
            r4 = 0
        L_0x01b1:
            if (r4 >= r6) goto L_0x07c0
            int r3 = r12.zzc()
            int r2 = r12.zze()
            if (r2 <= 0) goto L_0x01c1
            r24 = r10
            r1 = 1
            goto L_0x01c4
        L_0x01c1:
            r24 = r10
            r1 = 0
        L_0x01c4:
            java.lang.String r10 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.zzbac.zzd(r1, r10)
            int r1 = r12.zze()
            int r7 = com.google.android.gms.internal.ads.zzavw.zze
            if (r1 == r7) goto L_0x05b6
            int r7 = com.google.android.gms.internal.ads.zzavw.zzf
            if (r1 == r7) goto L_0x05b6
            int r7 = com.google.android.gms.internal.ads.zzavw.zzac
            if (r1 == r7) goto L_0x05b6
            int r7 = com.google.android.gms.internal.ads.zzavw.zzan
            if (r1 == r7) goto L_0x05b6
            int r7 = com.google.android.gms.internal.ads.zzavw.zzg
            if (r1 == r7) goto L_0x05b6
            int r7 = com.google.android.gms.internal.ads.zzavw.zzh
            if (r1 == r7) goto L_0x05b6
            int r7 = com.google.android.gms.internal.ads.zzavw.zzi
            if (r1 == r7) goto L_0x05b6
            int r7 = com.google.android.gms.internal.ads.zzavw.zzaM
            if (r1 == r7) goto L_0x05b6
            int r7 = com.google.android.gms.internal.ads.zzavw.zzaN
            if (r1 != r7) goto L_0x01f3
            goto L_0x05b6
        L_0x01f3:
            int r7 = com.google.android.gms.internal.ads.zzavw.zzl
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzad
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzq
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzs
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzu
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzx
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzv
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzw
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzaA
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzaB
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzo
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzp
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzm
            if (r1 == r7) goto L_0x02f9
            int r7 = com.google.android.gms.internal.ads.zzavw.zzaQ
            if (r1 != r7) goto L_0x022d
            goto L_0x02f9
        L_0x022d:
            int r7 = com.google.android.gms.internal.ads.zzavw.zzam
            if (r1 == r7) goto L_0x0266
            int r7 = com.google.android.gms.internal.ads.zzavw.zzaw
            if (r1 == r7) goto L_0x0266
            int r7 = com.google.android.gms.internal.ads.zzavw.zzax
            if (r1 == r7) goto L_0x0266
            int r7 = com.google.android.gms.internal.ads.zzavw.zzay
            if (r1 == r7) goto L_0x0266
            int r7 = com.google.android.gms.internal.ads.zzavw.zzaz
            if (r1 != r7) goto L_0x0242
            goto L_0x0266
        L_0x0242:
            int r7 = com.google.android.gms.internal.ads.zzavw.zzaP
            if (r1 != r7) goto L_0x0252
            java.lang.String r1 = java.lang.Integer.toString(r21)
            java.lang.String r7 = "application/x-camera-motion"
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.zzj(r1, r7, r8, r11, r15)
            r5.zzb = r1
        L_0x0252:
            r29 = r2
            r23 = r3
            r35 = r4
            r2 = r5
            r31 = r6
            r34 = r9
            r28 = r11
            r0 = r12
            r46 = r13
            r17 = r14
            goto L_0x0358
        L_0x0266:
            int r7 = r3 + 16
            r12.zzv(r7)
            int r7 = com.google.android.gms.internal.ads.zzavw.zzam
            java.lang.String r10 = "application/ttml+xml"
            r29 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 != r7) goto L_0x027b
            r18 = r8
            r7 = r10
        L_0x0279:
            r10 = 1
            goto L_0x02b0
        L_0x027b:
            int r7 = com.google.android.gms.internal.ads.zzavw.zzaw
            if (r1 != r7) goto L_0x0290
            int r1 = r2 + -16
            byte[] r7 = new byte[r1]
            r10 = 0
            r12.zzq(r7, r10, r1)
            java.util.List r1 = java.util.Collections.singletonList(r7)
            java.lang.String r7 = "application/x-quicktime-tx3g"
            r18 = r1
            goto L_0x0279
        L_0x0290:
            int r7 = com.google.android.gms.internal.ads.zzavw.zzax
            if (r1 != r7) goto L_0x029a
            java.lang.String r1 = "application/x-mp4-vtt"
            r7 = r1
            r18 = r8
            goto L_0x0279
        L_0x029a:
            int r7 = com.google.android.gms.internal.ads.zzavw.zzay
            if (r1 != r7) goto L_0x02a4
            r18 = r8
            r7 = r10
            r29 = r19
            goto L_0x0279
        L_0x02a4:
            int r7 = com.google.android.gms.internal.ads.zzavw.zzaz
            if (r1 != r7) goto L_0x02f3
            r10 = 1
            r5.zzd = r10
            java.lang.String r1 = "application/x-mp4-cea-608"
            r7 = r1
            r18 = r8
        L_0x02b0:
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r31 = 0
            r34 = -1
            r35 = 0
            r36 = -1
            r51 = r13
            r13 = r2
            r2 = r7
            r7 = r3
            r3 = r31
            r37 = r4
            r4 = r34
            r38 = r5
            r5 = r35
            r31 = r6
            r6 = r9
            r39 = r7
            r7 = r36
            r8 = r54
            r40 = r9
            r9 = r29
            r0 = r11
            r11 = r18
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.zzk(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            r11 = r38
            r11.zzb = r1
            r46 = r51
            r28 = r0
            r2 = r11
            r0 = r12
            r29 = r13
            r17 = r14
            r35 = r37
            r23 = r39
            goto L_0x0356
        L_0x02f3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02f9:
            r39 = r3
            r37 = r4
            r31 = r6
            r40 = r9
            r0 = r11
            r51 = r13
            r13 = r2
            r11 = r5
            r9 = r39
            int r3 = r9 + 16
            r12.zzv(r3)
            r2 = 6
            if (r55 == 0) goto L_0x031a
            int r3 = r12.zzj()
            r12.zzw(r2)
            r8 = 8
            goto L_0x0320
        L_0x031a:
            r8 = 8
            r12.zzw(r8)
            r3 = 0
        L_0x0320:
            if (r3 == 0) goto L_0x035e
            r7 = 1
            if (r3 != r7) goto L_0x0327
            r6 = 2
            goto L_0x0360
        L_0x0327:
            r6 = 2
            if (r3 != r6) goto L_0x0348
            r2 = 16
            r12.zzw(r2)
            long r2 = r12.zzl()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            long r2 = java.lang.Math.round(r2)
            int r2 = (int) r2
            int r3 = r12.zzi()
            r4 = 20
            r12.zzw(r4)
            r5 = 16
            goto L_0x0376
        L_0x0348:
            r46 = r51
            r28 = r0
            r23 = r9
            r2 = r11
            r0 = r12
            r29 = r13
            r17 = r14
            r35 = r37
        L_0x0356:
            r34 = r40
        L_0x0358:
            r16 = 0
        L_0x035a:
            r18 = 3
            goto L_0x07a0
        L_0x035e:
            r6 = 2
            r7 = 1
        L_0x0360:
            int r4 = r12.zzj()
            r12.zzw(r2)
            int r2 = r12.zzh()
            if (r3 != r7) goto L_0x0373
            r5 = 16
            r12.zzw(r5)
            goto L_0x0375
        L_0x0373:
            r5 = 16
        L_0x0375:
            r3 = r4
        L_0x0376:
            int r4 = r12.zzc()
            int r5 = com.google.android.gms.internal.ads.zzavw.zzad
            if (r1 != r5) goto L_0x0388
            r5 = r37
            int r1 = zze(r12, r9, r13, r11, r5)
            r12.zzv(r4)
            goto L_0x038a
        L_0x0388:
            r5 = r37
        L_0x038a:
            int r6 = com.google.android.gms.internal.ads.zzavw.zzq
            java.lang.String r0 = "audio/raw"
            if (r1 != r6) goto L_0x0393
            java.lang.String r1 = "audio/ac3"
            goto L_0x03dc
        L_0x0393:
            int r6 = com.google.android.gms.internal.ads.zzavw.zzs
            if (r1 != r6) goto L_0x039a
            java.lang.String r1 = "audio/eac3"
            goto L_0x03dc
        L_0x039a:
            int r6 = com.google.android.gms.internal.ads.zzavw.zzu
            if (r1 != r6) goto L_0x03a1
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x03dc
        L_0x03a1:
            int r6 = com.google.android.gms.internal.ads.zzavw.zzv
            if (r1 == r6) goto L_0x03da
            int r6 = com.google.android.gms.internal.ads.zzavw.zzw
            if (r1 != r6) goto L_0x03aa
            goto L_0x03da
        L_0x03aa:
            int r6 = com.google.android.gms.internal.ads.zzavw.zzx
            if (r1 != r6) goto L_0x03b1
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03dc
        L_0x03b1:
            int r6 = com.google.android.gms.internal.ads.zzavw.zzaA
            if (r1 != r6) goto L_0x03b8
            java.lang.String r1 = "audio/3gpp"
            goto L_0x03dc
        L_0x03b8:
            int r6 = com.google.android.gms.internal.ads.zzavw.zzaB
            if (r1 != r6) goto L_0x03bf
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x03dc
        L_0x03bf:
            int r6 = com.google.android.gms.internal.ads.zzavw.zzo
            if (r1 == r6) goto L_0x03d8
            int r6 = com.google.android.gms.internal.ads.zzavw.zzp
            if (r1 != r6) goto L_0x03c8
            goto L_0x03d8
        L_0x03c8:
            int r6 = com.google.android.gms.internal.ads.zzavw.zzm
            if (r1 != r6) goto L_0x03cf
            java.lang.String r1 = "audio/mpeg"
            goto L_0x03dc
        L_0x03cf:
            int r6 = com.google.android.gms.internal.ads.zzavw.zzaQ
            if (r1 != r6) goto L_0x03d6
            java.lang.String r1 = "audio/alac"
            goto L_0x03dc
        L_0x03d6:
            r1 = 0
            goto L_0x03dc
        L_0x03d8:
            r1 = r0
            goto L_0x03dc
        L_0x03da:
            java.lang.String r1 = "audio/vnd.dts.hd"
        L_0x03dc:
            r6 = r1
            r29 = r2
            r28 = r3
            r30 = 0
        L_0x03e3:
            int r1 = r4 - r9
            if (r1 >= r13) goto L_0x0536
            r12.zzv(r4)
            int r3 = r12.zze()
            if (r3 <= 0) goto L_0x03f2
            r1 = r7
            goto L_0x03f3
        L_0x03f2:
            r1 = 0
        L_0x03f3:
            com.google.android.gms.internal.ads.zzbac.zzd(r1, r10)
            int r1 = r12.zze()
            int r2 = com.google.android.gms.internal.ads.zzavw.zzM
            if (r1 == r2) goto L_0x04b5
            if (r55 == 0) goto L_0x0406
            int r7 = com.google.android.gms.internal.ads.zzavw.zzn
            if (r1 != r7) goto L_0x0406
            goto L_0x04b5
        L_0x0406:
            int r2 = com.google.android.gms.internal.ads.zzavw.zzr
            if (r1 != r2) goto L_0x042e
            int r1 = r4 + 8
            r12.zzv(r1)
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r7 = r40
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzati.zzb(r12, r1, r7, r15)
            r11.zzb = r1
        L_0x041b:
            r43 = r5
            r44 = r6
            r34 = r7
            r45 = r9
            r15 = r10
            r35 = r13
            r17 = 2
            r25 = 16
            r13 = r11
        L_0x042b:
            r11 = 0
            goto L_0x04b0
        L_0x042e:
            r7 = r40
            int r2 = com.google.android.gms.internal.ads.zzavw.zzt
            if (r1 != r2) goto L_0x0444
            int r1 = r4 + 8
            r12.zzv(r1)
            java.lang.String r1 = java.lang.Integer.toString(r21)
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzati.zzc(r12, r1, r7, r15)
            r11.zzb = r1
            goto L_0x041b
        L_0x0444:
            int r2 = com.google.android.gms.internal.ads.zzavw.zzy
            if (r1 != r2) goto L_0x0489
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r34 = 0
            r35 = -1
            r36 = -1
            r37 = 0
            r38 = 0
            r2 = r6
            r41 = r3
            r3 = r34
            r42 = r4
            r4 = r35
            r43 = r5
            r25 = 16
            r5 = r36
            r44 = r6
            r17 = 2
            r6 = r28
            r34 = r7
            r15 = 1
            r7 = r29
            r8 = r37
            r45 = r9
            r9 = r54
            r15 = r10
            r10 = r38
            r35 = r13
            r13 = r11
            r11 = r34
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.zzg(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.zzb = r1
        L_0x0484:
            r3 = r41
            r4 = r42
            goto L_0x042b
        L_0x0489:
            r41 = r3
            r42 = r4
            r43 = r5
            r44 = r6
            r34 = r7
            r45 = r9
            r15 = r10
            r35 = r13
            r17 = 2
            r25 = 16
            r13 = r11
            int r2 = com.google.android.gms.internal.ads.zzavw.zzaQ
            if (r1 != r2) goto L_0x0484
            r3 = r41
            byte[] r1 = new byte[r3]
            r4 = r42
            r12.zzv(r4)
            r11 = 0
            r12.zzq(r1, r11, r3)
            r30 = r1
        L_0x04b0:
            r6 = r44
            r10 = -1
            goto L_0x0524
        L_0x04b5:
            r43 = r5
            r44 = r6
            r45 = r9
            r15 = r10
            r35 = r13
            r34 = r40
            r17 = 2
            r25 = 16
            r13 = r11
            r11 = 0
            if (r1 != r2) goto L_0x04cb
            r1 = r4
        L_0x04c9:
            r10 = -1
            goto L_0x04ee
        L_0x04cb:
            int r1 = r12.zzc()
        L_0x04cf:
            int r2 = r1 - r4
            if (r2 >= r3) goto L_0x04ec
            r12.zzv(r1)
            int r2 = r12.zze()
            if (r2 <= 0) goto L_0x04de
            r9 = 1
            goto L_0x04df
        L_0x04de:
            r9 = r11
        L_0x04df:
            com.google.android.gms.internal.ads.zzbac.zzd(r9, r15)
            int r5 = r12.zze()
            int r6 = com.google.android.gms.internal.ads.zzavw.zzM
            if (r5 == r6) goto L_0x04c9
            int r1 = r1 + r2
            goto L_0x04cf
        L_0x04ec:
            r1 = -1
            goto L_0x04c9
        L_0x04ee:
            if (r1 == r10) goto L_0x0522
            android.util.Pair r1 = zzf(r12, r1)
            java.lang.Object r2 = r1.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.second
            r30 = r1
            byte[] r30 = (byte[]) r30
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0520
            android.util.Pair r1 = com.google.android.gms.internal.ads.zzbad.zza(r30)
            java.lang.Object r5 = r1.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r28 = r1
            r6 = r2
            r29 = r5
            goto L_0x0524
        L_0x0520:
            r6 = r2
            goto L_0x0524
        L_0x0522:
            r6 = r44
        L_0x0524:
            int r4 = r4 + r3
            r11 = r13
            r10 = r15
            r40 = r34
            r13 = r35
            r5 = r43
            r9 = r45
            r7 = 1
            r8 = 8
            r15 = r54
            goto L_0x03e3
        L_0x0536:
            r43 = r5
            r44 = r6
            r45 = r9
            r35 = r13
            r34 = r40
            r10 = -1
            r17 = 2
            r25 = 16
            r13 = r11
            r11 = 0
            com.google.android.gms.internal.ads.zzasw r1 = r13.zzb
            if (r1 != 0) goto L_0x05a0
            r6 = r44
            if (r6 == 0) goto L_0x05a0
            boolean r0 = r0.equals(r6)
            r15 = 1
            if (r15 == r0) goto L_0x0558
            r8 = r10
            goto L_0x055a
        L_0x0558:
            r8 = r17
        L_0x055a:
            java.lang.String r1 = java.lang.Integer.toString(r21)
            if (r30 != 0) goto L_0x0562
            r0 = 0
            goto L_0x0566
        L_0x0562:
            java.util.List r0 = java.util.Collections.singletonList(r30)
        L_0x0566:
            r3 = 0
            r4 = -1
            r5 = -1
            r9 = -1
            r18 = -1
            r23 = 0
            r30 = 0
            r2 = r6
            r6 = r28
            r7 = r29
            r28 = r10
            r10 = r18
            r18 = r11
            r11 = r0
            r0 = r12
            r12 = r54
            r46 = r51
            r47 = r13
            r16 = r18
            r48 = r35
            r13 = r23
            r17 = r14
            r14 = r34
            r15 = r30
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.zzh(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r14 = r47
            r14.zzb = r1
            r2 = r14
            r35 = r43
            r23 = r45
            r29 = r48
            goto L_0x035a
        L_0x05a0:
            r46 = r51
            r28 = r10
            r16 = r11
            r0 = r12
            r17 = r14
            r2 = r13
            r36 = r25
            r29 = r35
            r35 = r43
            r23 = r45
            r18 = 3
            goto L_0x07a2
        L_0x05b6:
            r48 = r2
            r45 = r3
            r43 = r4
            r31 = r6
            r34 = r9
            r15 = r10
            r28 = r11
            r0 = r12
            r46 = r13
            r17 = r14
            r16 = 0
            r14 = r5
            r13 = r45
            int r3 = r13 + 16
            r0.zzv(r3)
            r12 = 16
            r0.zzw(r12)
            int r6 = r0.zzj()
            int r7 = r0.zzj()
            r2 = 50
            r0.zzw(r2)
            int r2 = r0.zzc()
            int r3 = com.google.android.gms.internal.ads.zzavw.zzac
            if (r1 != r3) goto L_0x05f8
            r11 = r43
            r10 = r48
            int r1 = zze(r0, r13, r10, r14, r11)
            r0.zzv(r2)
            goto L_0x05fc
        L_0x05f8:
            r11 = r43
            r10 = r48
        L_0x05fc:
            r3 = 1065353216(0x3f800000, float:1.0)
            r18 = r3
            r4 = r16
            r25 = r28
            r3 = 0
            r9 = 0
            r23 = 0
        L_0x0608:
            int r5 = r2 - r13
            if (r5 >= r10) goto L_0x075c
            r0.zzv(r2)
            int r5 = r0.zzc()
            int r8 = r0.zze()
            if (r8 != 0) goto L_0x0624
            int r8 = r0.zzc()
            int r8 = r8 - r13
            if (r8 != r10) goto L_0x0622
            goto L_0x075c
        L_0x0622:
            r8 = r16
        L_0x0624:
            if (r8 <= 0) goto L_0x0628
            r12 = 1
            goto L_0x062a
        L_0x0628:
            r12 = r16
        L_0x062a:
            com.google.android.gms.internal.ads.zzbac.zzd(r12, r15)
            int r12 = r0.zze()
            r48 = r10
            int r10 = com.google.android.gms.internal.ads.zzavw.zzK
            if (r12 != r10) goto L_0x0658
            if (r3 != 0) goto L_0x063b
            r9 = 1
            goto L_0x063d
        L_0x063b:
            r9 = r16
        L_0x063d:
            com.google.android.gms.internal.ads.zzbac.zze(r9)
            int r5 = r5 + 8
            r0.zzv(r5)
            com.google.android.gms.internal.ads.zzbas r3 = com.google.android.gms.internal.ads.zzbas.zza(r0)
            java.util.List r9 = r3.zza
            int r5 = r3.zzb
            r14.zzc = r5
            if (r4 != 0) goto L_0x0655
            float r3 = r3.zzc
            r18 = r3
        L_0x0655:
            java.lang.String r3 = "video/avc"
            goto L_0x0676
        L_0x0658:
            int r10 = com.google.android.gms.internal.ads.zzavw.zzL
            if (r12 != r10) goto L_0x067d
            if (r3 != 0) goto L_0x0660
            r9 = 1
            goto L_0x0662
        L_0x0660:
            r9 = r16
        L_0x0662:
            com.google.android.gms.internal.ads.zzbac.zze(r9)
            int r5 = r5 + 8
            r0.zzv(r5)
            com.google.android.gms.internal.ads.zzbay r3 = com.google.android.gms.internal.ads.zzbay.zza(r0)
            java.util.List r9 = r3.zza
            int r3 = r3.zzb
            r14.zzc = r3
            java.lang.String r3 = "video/hevc"
        L_0x0676:
            r29 = r1
        L_0x0678:
            r5 = 2
            r10 = 1
            r12 = 3
            goto L_0x0753
        L_0x067d:
            int r10 = com.google.android.gms.internal.ads.zzavw.zzaO
            if (r12 != r10) goto L_0x0694
            if (r3 != 0) goto L_0x0685
            r3 = 1
            goto L_0x0687
        L_0x0685:
            r3 = r16
        L_0x0687:
            com.google.android.gms.internal.ads.zzbac.zze(r3)
            int r3 = com.google.android.gms.internal.ads.zzavw.zzaM
            if (r1 != r3) goto L_0x0691
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            goto L_0x0676
        L_0x0691:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            goto L_0x0676
        L_0x0694:
            int r10 = com.google.android.gms.internal.ads.zzavw.zzj
            if (r12 != r10) goto L_0x06a4
            if (r3 != 0) goto L_0x069c
            r3 = 1
            goto L_0x069e
        L_0x069c:
            r3 = r16
        L_0x069e:
            com.google.android.gms.internal.ads.zzbac.zze(r3)
            java.lang.String r3 = "video/3gpp"
            goto L_0x0676
        L_0x06a4:
            int r10 = com.google.android.gms.internal.ads.zzavw.zzM
            if (r12 != r10) goto L_0x06c5
            if (r3 != 0) goto L_0x06ac
            r9 = 1
            goto L_0x06ae
        L_0x06ac:
            r9 = r16
        L_0x06ae:
            com.google.android.gms.internal.ads.zzbac.zze(r9)
            android.util.Pair r3 = zzf(r0, r5)
            java.lang.Object r5 = r3.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.second
            byte[] r3 = (byte[]) r3
            java.util.List r9 = java.util.Collections.singletonList(r3)
            r29 = r1
            r3 = r5
            goto L_0x0678
        L_0x06c5:
            int r10 = com.google.android.gms.internal.ads.zzavw.zzal
            if (r12 != r10) goto L_0x06de
            int r5 = r5 + 8
            r0.zzv(r5)
            int r4 = r0.zzi()
            float r4 = (float) r4
            int r5 = r0.zzi()
            float r5 = (float) r5
            float r18 = r4 / r5
            r29 = r1
            r4 = 1
            goto L_0x0678
        L_0x06de:
            int r10 = com.google.android.gms.internal.ads.zzavw.zzaK
            if (r12 != r10) goto L_0x0714
            int r10 = r5 + 8
        L_0x06e4:
            int r12 = r10 - r5
            if (r12 >= r8) goto L_0x0709
            r0.zzv(r10)
            int r12 = r0.zze()
            r29 = r1
            int r1 = r0.zze()
            r51 = r4
            int r4 = com.google.android.gms.internal.ads.zzavw.zzaL
            if (r1 != r4) goto L_0x0703
            byte[] r1 = r0.zza
            int r12 = r12 + r10
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r10, r12)
            goto L_0x070e
        L_0x0703:
            int r10 = r10 + r12
            r4 = r51
            r1 = r29
            goto L_0x06e4
        L_0x0709:
            r29 = r1
            r51 = r4
            r1 = 0
        L_0x070e:
            r4 = r51
            r23 = r1
            goto L_0x0678
        L_0x0714:
            r29 = r1
            r51 = r4
            int r1 = com.google.android.gms.internal.ads.zzavw.zzaJ
            if (r12 != r1) goto L_0x074e
            int r1 = r0.zzg()
            r12 = 3
            r0.zzw(r12)
            if (r1 != 0) goto L_0x074b
            int r1 = r0.zzg()
            if (r1 == 0) goto L_0x0744
            r10 = 1
            r5 = 2
            if (r1 == r10) goto L_0x073f
            if (r1 == r5) goto L_0x073a
            if (r1 == r12) goto L_0x0735
            goto L_0x0751
        L_0x0735:
            r4 = r51
            r25 = r12
            goto L_0x0753
        L_0x073a:
            r4 = r51
            r25 = r5
            goto L_0x0753
        L_0x073f:
            r4 = r51
            r25 = r10
            goto L_0x0753
        L_0x0744:
            r5 = 2
            r10 = 1
            r4 = r51
            r25 = r16
            goto L_0x0753
        L_0x074b:
            r5 = 2
            r10 = 1
            goto L_0x0751
        L_0x074e:
            r5 = 2
            r10 = 1
            r12 = 3
        L_0x0751:
            r4 = r51
        L_0x0753:
            int r2 = r2 + r8
            r1 = r29
            r10 = r48
            r12 = 16
            goto L_0x0608
        L_0x075c:
            r48 = r10
            r5 = 2
            r10 = 1
            r12 = 3
            if (r3 == 0) goto L_0x0797
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r4 = 0
            r8 = -1
            r15 = -1
            r29 = -1082130432(0xffffffffbf800000, float:-1.0)
            r30 = 0
            r2 = r3
            r3 = r4
            r4 = r8
            r8 = r5
            r5 = r15
            r15 = r8
            r8 = r29
            r29 = r48
            r10 = r22
            r35 = r11
            r11 = r18
            r18 = r12
            r36 = 16
            r12 = r23
            r23 = r13
            r13 = r25
            r49 = r14
            r14 = r30
            r15 = r54
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.zzl(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = r49
            r2.zzb = r1
            goto L_0x07a2
        L_0x0797:
            r35 = r11
            r18 = r12
            r23 = r13
            r2 = r14
            r29 = r48
        L_0x07a0:
            r36 = 16
        L_0x07a2:
            int r3 = r23 + r29
            r0.zzv(r3)
            int r4 = r35 + 1
            r15 = r54
            r12 = r0
            r5 = r2
            r14 = r17
            r10 = r24
            r11 = r28
            r6 = r31
            r9 = r34
            r13 = r46
            r7 = 8
            r8 = 0
            r0 = r50
            goto L_0x01b1
        L_0x07c0:
            r2 = r5
            r24 = r10
            r46 = r13
            r17 = r14
            r16 = 0
            int r0 = com.google.android.gms.internal.ads.zzavw.zzS
            r1 = r50
            com.google.android.gms.internal.ads.zzavu r0 = r1.zza(r0)
            if (r0 == 0) goto L_0x082f
            int r1 = com.google.android.gms.internal.ads.zzavw.zzT
            com.google.android.gms.internal.ads.zzavv r0 = r0.zzb(r1)
            if (r0 != 0) goto L_0x07dc
            goto L_0x082f
        L_0x07dc:
            com.google.android.gms.internal.ads.zzbak r0 = r0.zza
            r1 = 8
            r0.zzv(r1)
            int r1 = r0.zze()
            int r1 = com.google.android.gms.internal.ads.zzavw.zzf(r1)
            int r3 = r0.zzi()
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            r13 = r16
        L_0x07f5:
            if (r13 >= r3) goto L_0x0828
            r6 = 1
            if (r1 != r6) goto L_0x07ff
            long r7 = r0.zzn()
            goto L_0x0803
        L_0x07ff:
            long r7 = r0.zzm()
        L_0x0803:
            r4[r13] = r7
            if (r1 != r6) goto L_0x080c
            long r7 = r0.zzl()
            goto L_0x0811
        L_0x080c:
            int r7 = r0.zze()
            long r7 = (long) r7
        L_0x0811:
            r5[r13] = r7
            short r7 = r0.zzp()
            if (r7 != r6) goto L_0x0820
            r7 = 2
            r0.zzw(r7)
            int r13 = r13 + 1
            goto L_0x07f5
        L_0x0820:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0828:
            android.util.Pair r0 = android.util.Pair.create(r4, r5)
            r1 = r0
            r0 = 0
            goto L_0x0834
        L_0x082f:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
        L_0x0834:
            com.google.android.gms.internal.ads.zzasw r3 = r2.zzb
            if (r3 != 0) goto L_0x0839
            return r0
        L_0x0839:
            com.google.android.gms.internal.ads.zzawo r0 = new com.google.android.gms.internal.ads.zzawo
            int r16 = r17.zza
            r3 = r46
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r18 = r3.longValue()
            com.google.android.gms.internal.ads.zzasw r3 = r2.zzb
            int r4 = r2.zzd
            com.google.android.gms.internal.ads.zzawp[] r5 = r2.zza
            int r2 = r2.zzc
            java.lang.Object r6 = r1.first
            r28 = r6
            long[] r28 = (long[]) r28
            java.lang.Object r1 = r1.second
            r29 = r1
            long[] r29 = (long[]) r29
            r15 = r0
            r17 = r24
            r20 = r32
            r22 = r26
            r24 = r3
            r25 = r4
            r26 = r5
            r27 = r2
            r15.<init>(r16, r17, r18, r20, r22, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawd.zza(com.google.android.gms.internal.ads.zzavu, com.google.android.gms.internal.ads.zzavv, long, com.google.android.gms.internal.ads.zzauv, boolean):com.google.android.gms.internal.ads.zzawo");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0173 A[LOOP:5: B:57:0x0173->B:58:0x0175, LOOP_START, PHI: r14 r15 r22 r25 
      PHI: (r14v4 int) = (r14v2 int), (r14v11 int) binds: [B:56:0x0171, B:58:0x0175] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r15v5 int) = (r15v3 int), (r15v11 int) binds: [B:56:0x0171, B:58:0x0175] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r22v6 int) = (r22v5 int), (r22v9 int) binds: [B:56:0x0171, B:58:0x0175] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v4 long) = (r25v3 long), (r25v6 long) binds: [B:56:0x0171, B:58:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0237  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzawr zzb(com.google.android.gms.internal.ads.zzawo r42, com.google.android.gms.internal.ads.zzavu r43, com.google.android.gms.internal.ads.zzavd r44) throws com.google.android.gms.internal.ads.zzasz {
        /*
            r0 = r42
            r1 = r43
            r2 = r44
            int r3 = com.google.android.gms.internal.ads.zzavw.zzas
            com.google.android.gms.internal.ads.zzavv r3 = r1.zzb(r3)
            if (r3 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.zzawa r4 = new com.google.android.gms.internal.ads.zzawa
            r4.<init>(r3)
            goto L_0x0021
        L_0x0014:
            int r3 = com.google.android.gms.internal.ads.zzavw.zzat
            com.google.android.gms.internal.ads.zzavv r3 = r1.zzb(r3)
            if (r3 == 0) goto L_0x04cf
            com.google.android.gms.internal.ads.zzawb r4 = new com.google.android.gms.internal.ads.zzawb
            r4.<init>(r3)
        L_0x0021:
            int r3 = r4.zza()
            r5 = 0
            if (r3 != 0) goto L_0x0038
            com.google.android.gms.internal.ads.zzawr r0 = new com.google.android.gms.internal.ads.zzawr
            long[] r7 = new long[r5]
            int[] r8 = new int[r5]
            r9 = 0
            long[] r10 = new long[r5]
            int[] r11 = new int[r5]
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x0038:
            int r6 = com.google.android.gms.internal.ads.zzavw.zzau
            com.google.android.gms.internal.ads.zzavv r6 = r1.zzb(r6)
            if (r6 != 0) goto L_0x0048
            int r6 = com.google.android.gms.internal.ads.zzavw.zzav
            com.google.android.gms.internal.ads.zzavv r6 = r1.zzb(r6)
            r8 = 1
            goto L_0x0049
        L_0x0048:
            r8 = r5
        L_0x0049:
            com.google.android.gms.internal.ads.zzbak r6 = r6.zza
            int r9 = com.google.android.gms.internal.ads.zzavw.zzar
            com.google.android.gms.internal.ads.zzavv r9 = r1.zzb(r9)
            com.google.android.gms.internal.ads.zzbak r9 = r9.zza
            int r10 = com.google.android.gms.internal.ads.zzavw.zzao
            com.google.android.gms.internal.ads.zzavv r10 = r1.zzb(r10)
            com.google.android.gms.internal.ads.zzbak r10 = r10.zza
            int r11 = com.google.android.gms.internal.ads.zzavw.zzap
            com.google.android.gms.internal.ads.zzavv r11 = r1.zzb(r11)
            r12 = 0
            if (r11 == 0) goto L_0x0067
            com.google.android.gms.internal.ads.zzbak r11 = r11.zza
            goto L_0x0068
        L_0x0067:
            r11 = r12
        L_0x0068:
            int r13 = com.google.android.gms.internal.ads.zzavw.zzaq
            com.google.android.gms.internal.ads.zzavv r1 = r1.zzb(r13)
            if (r1 == 0) goto L_0x0073
            com.google.android.gms.internal.ads.zzbak r1 = r1.zza
            goto L_0x0074
        L_0x0073:
            r1 = r12
        L_0x0074:
            com.google.android.gms.internal.ads.zzavx r13 = new com.google.android.gms.internal.ads.zzavx
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.zzv(r6)
            int r8 = r10.zzi()
            r9 = -1
            int r8 = r8 + r9
            int r14 = r10.zzi()
            int r15 = r10.zzi()
            if (r1 == 0) goto L_0x0096
            r1.zzv(r6)
            int r16 = r1.zzi()
            goto L_0x0098
        L_0x0096:
            r16 = r5
        L_0x0098:
            if (r11 == 0) goto L_0x00ab
            r11.zzv(r6)
            int r6 = r11.zzi()
            if (r6 <= 0) goto L_0x00a9
            int r12 = r11.zzi()
            int r12 = r12 + r9
            goto L_0x00ad
        L_0x00a9:
            r11 = r12
            goto L_0x00ac
        L_0x00ab:
            r6 = r5
        L_0x00ac:
            r12 = r9
        L_0x00ad:
            boolean r17 = r4.zzc()
            r18 = 0
            if (r17 == 0) goto L_0x015b
            com.google.android.gms.internal.ads.zzasw r5 = r0.zzf
            java.lang.String r5 = r5.zzf
            java.lang.String r9 = "audio/raw"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x015b
            if (r8 != 0) goto L_0x015b
            if (r16 != 0) goto L_0x015a
            if (r6 != 0) goto L_0x015a
            int r1 = r13.zza
            long[] r5 = new long[r1]
            int[] r6 = new int[r1]
        L_0x00cd:
            boolean r8 = r13.zza()
            if (r8 == 0) goto L_0x00de
            int r8 = r13.zzb
            long r9 = r13.zzd
            r5[r8] = r9
            int r9 = r13.zzc
            r6[r8] = r9
            goto L_0x00cd
        L_0x00de:
            int r4 = r4.zzb()
            long r8 = (long) r15
            r10 = 8192(0x2000, float:1.14794E-41)
            int r10 = r10 / r4
            r11 = 0
            r12 = 0
        L_0x00e8:
            if (r11 >= r1) goto L_0x00f4
            r13 = r6[r11]
            int r13 = com.google.android.gms.internal.ads.zzbar.zzd(r13, r10)
            int r12 = r12 + r13
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x00f4:
            long[] r11 = new long[r12]
            int[] r13 = new int[r12]
            long[] r14 = new long[r12]
            int[] r12 = new int[r12]
            r15 = 0
            r16 = 0
            r20 = 0
            r21 = 0
        L_0x0103:
            if (r15 >= r1) goto L_0x0151
            r22 = r6[r15]
            r23 = r5[r15]
            r7 = r16
            r40 = r20
            r20 = r1
            r1 = r40
            r41 = r22
            r22 = r5
            r5 = r41
        L_0x0117:
            if (r5 <= 0) goto L_0x0142
            int r16 = java.lang.Math.min(r10, r5)
            r11[r21] = r23
            r25 = r6
            int r6 = r4 * r16
            r13[r21] = r6
            int r7 = java.lang.Math.max(r7, r6)
            r26 = r7
            long r6 = (long) r1
            long r6 = r6 * r8
            r14[r21] = r6
            r6 = 1
            r12[r21] = r6
            r6 = r13[r21]
            long r6 = (long) r6
            long r23 = r23 + r6
            int r1 = r1 + r16
            int r5 = r5 - r16
            int r21 = r21 + 1
            r6 = r25
            r7 = r26
            goto L_0x0117
        L_0x0142:
            r25 = r6
            int r15 = r15 + 1
            r16 = r7
            r5 = r22
            r40 = r20
            r20 = r1
            r1 = r40
            goto L_0x0103
        L_0x0151:
            r4 = r0
            r15 = r12
            r12 = r13
            r13 = r16
            r27 = r18
            goto L_0x029f
        L_0x015a:
            r8 = 0
        L_0x015b:
            long[] r5 = new long[r3]
            int[] r7 = new int[r3]
            long[] r9 = new long[r3]
            r20 = r6
            int[] r6 = new int[r3]
            r25 = r18
            r27 = r25
            r0 = 0
            r2 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0171:
            if (r2 >= r3) goto L_0x0213
        L_0x0173:
            if (r22 != 0) goto L_0x018d
            boolean r22 = r13.zza()
            com.google.android.gms.internal.ads.zzbac.zze(r22)
            r24 = r14
            r29 = r15
            long r14 = r13.zzd
            r25 = r14
            int r14 = r13.zzc
            r22 = r14
            r14 = r24
            r15 = r29
            goto L_0x0173
        L_0x018d:
            r24 = r14
            r29 = r15
            if (r1 == 0) goto L_0x01a9
        L_0x0193:
            if (r21 != 0) goto L_0x01a6
            if (r16 <= 0) goto L_0x01a2
            int r21 = r1.zzi()
            int r23 = r1.zze()
            int r16 = r16 + -1
            goto L_0x0193
        L_0x01a2:
            r14 = -1
            r21 = 0
            goto L_0x01a7
        L_0x01a6:
            r14 = -1
        L_0x01a7:
            int r21 = r21 + -1
        L_0x01a9:
            r14 = r23
            r5[r2] = r25
            int r15 = r4.zzb()
            r7[r2] = r15
            if (r15 <= r0) goto L_0x01ba
            r23 = r5
            r0 = r15
            r15 = r4
            goto L_0x01bd
        L_0x01ba:
            r15 = r4
            r23 = r5
        L_0x01bd:
            long r4 = (long) r14
            long r4 = r27 + r4
            r9[r2] = r4
            if (r11 != 0) goto L_0x01c6
            r4 = 1
            goto L_0x01c7
        L_0x01c6:
            r4 = 0
        L_0x01c7:
            r6[r2] = r4
            if (r2 != r12) goto L_0x01d9
            r4 = 1
            r6[r2] = r4
            int r20 = r20 + -1
            if (r20 <= 0) goto L_0x01d9
            int r4 = r11.zzi()
            r5 = -1
            int r4 = r4 + r5
            r12 = r4
        L_0x01d9:
            r4 = r29
            r29 = r6
            long r5 = (long) r4
            long r27 = r27 + r5
            int r5 = r24 + -1
            if (r5 != 0) goto L_0x01f4
            if (r8 <= 0) goto L_0x01f1
            int r4 = r10.zzi()
            int r5 = r10.zzi()
            int r8 = r8 + -1
            goto L_0x01f9
        L_0x01f1:
            r5 = r4
            r4 = 0
            goto L_0x01f9
        L_0x01f4:
            r40 = r5
            r5 = r4
            r4 = r40
        L_0x01f9:
            r6 = r7[r2]
            r24 = r4
            r30 = r5
            long r4 = (long) r6
            long r25 = r25 + r4
            int r22 = r22 + -1
            int r2 = r2 + 1
            r4 = r15
            r5 = r23
            r6 = r29
            r15 = r30
            r23 = r14
            r14 = r24
            goto L_0x0171
        L_0x0213:
            r23 = r5
            r29 = r6
            r24 = r14
            if (r21 != 0) goto L_0x021d
            r2 = 1
            goto L_0x021e
        L_0x021d:
            r2 = 0
        L_0x021e:
            com.google.android.gms.internal.ads.zzbac.zzc(r2)
        L_0x0221:
            if (r16 <= 0) goto L_0x0235
            int r2 = r1.zzi()
            if (r2 != 0) goto L_0x022b
            r2 = 1
            goto L_0x022c
        L_0x022b:
            r2 = 0
        L_0x022c:
            com.google.android.gms.internal.ads.zzbac.zzc(r2)
            r1.zze()
            int r16 = r16 + -1
            goto L_0x0221
        L_0x0235:
            if (r20 != 0) goto L_0x0257
            if (r24 != 0) goto L_0x024e
            if (r22 != 0) goto L_0x0247
            if (r8 == 0) goto L_0x0243
            r1 = 0
            r2 = 0
            r4 = r42
            r5 = r0
            goto L_0x0255
        L_0x0243:
            r4 = r42
            r5 = r0
            goto L_0x0298
        L_0x0247:
            r1 = 0
            r4 = r42
            r5 = r0
            r2 = r22
            goto L_0x0255
        L_0x024e:
            r4 = r42
            r5 = r0
            r2 = r22
            r1 = r24
        L_0x0255:
            r0 = 0
            goto L_0x0260
        L_0x0257:
            r4 = r42
            r5 = r0
            r0 = r20
            r2 = r22
            r1 = r24
        L_0x0260:
            int r6 = r4.zza
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Inconsistent stbl box for track "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r6 = ": remainingSynchronizationSamples "
            r10.append(r6)
            r10.append(r0)
            java.lang.String r0 = ", remainingSamplesAtTimestampDelta "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ", remainingSamplesInChunk "
            r10.append(r0)
            r10.append(r2)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r0 = r10.toString()
            java.lang.String r1 = "AtomParsers"
            android.util.Log.w(r1, r0)
        L_0x0298:
            r13 = r5
            r12 = r7
            r14 = r9
            r11 = r23
            r15 = r29
        L_0x029f:
            long[] r0 = r4.zzi
            if (r0 == 0) goto L_0x04b6
            boolean r5 = r44.zza()
            if (r5 == 0) goto L_0x02ab
            goto L_0x04b6
        L_0x02ab:
            int r5 = r0.length
            r6 = 1
            if (r5 != r6) goto L_0x0337
            int r5 = r4.zzb
            if (r5 != r6) goto L_0x0337
            int r5 = r14.length
            r6 = 2
            if (r5 < r6) goto L_0x0337
            long[] r6 = r4.zzj
            r7 = 0
            r8 = r6[r7]
            r29 = r0[r7]
            long r1 = r4.zzc
            r22 = r8
            long r7 = r4.zzd
            r31 = r1
            r33 = r7
            long r0 = com.google.android.gms.internal.ads.zzbar.zzj(r29, r31, r33)
            long r8 = r22 + r0
            r0 = 0
            r1 = r14[r0]
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 > 0) goto L_0x0337
            r0 = 1
            r6 = r14[r0]
            int r0 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0337
            r0 = -1
            int r5 = r5 + r0
            r5 = r14[r5]
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0337
            int r0 = (r8 > r27 ? 1 : (r8 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x0337
            long r29 = r22 - r1
            com.google.android.gms.internal.ads.zzasw r0 = r4.zzf
            int r0 = r0.zzs
            long r0 = (long) r0
            long r5 = r4.zzc
            r31 = r0
            r33 = r5
            long r0 = com.google.android.gms.internal.ads.zzbar.zzj(r29, r31, r33)
            long r29 = r27 - r8
            com.google.android.gms.internal.ads.zzasw r2 = r4.zzf
            int r2 = r2.zzs
            long r5 = (long) r2
            long r7 = r4.zzc
            r31 = r5
            r33 = r7
            long r5 = com.google.android.gms.internal.ads.zzbar.zzj(r29, r31, r33)
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 != 0) goto L_0x0314
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0337
            r0 = r18
        L_0x0314:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0337
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0320
            goto L_0x0337
        L_0x0320:
            int r0 = (int) r0
            r1 = r44
            r1.zzb = r0
            int r0 = (int) r5
            r1.zzc = r0
            long r0 = r4.zzc
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.zzbar.zzn(r14, r2, r0)
            com.google.android.gms.internal.ads.zzawr r0 = new com.google.android.gms.internal.ads.zzawr
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x0337:
            long[] r0 = r4.zzi
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x036b
            r17 = 0
            r1 = r0[r17]
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x036b
            r0 = r17
        L_0x0347:
            int r1 = r14.length
            if (r0 >= r1) goto L_0x0364
            r1 = r14[r0]
            long[] r3 = r4.zzj
            r5 = r3[r17]
            long r18 = r1 - r5
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r4.zzc
            r22 = r1
            long r1 = com.google.android.gms.internal.ads.zzbar.zzj(r18, r20, r22)
            r14[r0] = r1
            int r0 = r0 + 1
            r17 = 0
            goto L_0x0347
        L_0x0364:
            com.google.android.gms.internal.ads.zzawr r0 = new com.google.android.gms.internal.ads.zzawr
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x036b:
            int r0 = r4.zzb
            r1 = 1
            if (r0 != r1) goto L_0x0372
            r6 = 1
            goto L_0x0373
        L_0x0372:
            r6 = 0
        L_0x0373:
            r0 = 0
            r1 = 0
            r2 = 0
            r7 = 0
        L_0x0377:
            long[] r5 = r4.zzi
            int r8 = r5.length
            r9 = -1
            if (r7 >= r8) goto L_0x03b9
            long[] r8 = r4.zzj
            r43 = r12
            r16 = r13
            r12 = r8[r7]
            int r8 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x03b0
            r25 = r5[r7]
            long r8 = r4.zzc
            r5 = r11
            long r10 = r4.zzd
            r27 = r8
            r29 = r10
            long r8 = com.google.android.gms.internal.ads.zzbar.zzj(r25, r27, r29)
            r10 = 1
            int r11 = com.google.android.gms.internal.ads.zzbar.zzb(r14, r12, r10, r10)
            long r12 = r12 + r8
            r8 = 0
            int r9 = com.google.android.gms.internal.ads.zzbar.zzb(r14, r12, r6, r8)
            int r8 = r9 - r11
            int r0 = r0 + r8
            if (r1 == r11) goto L_0x03ab
            r1 = 1
            goto L_0x03ac
        L_0x03ab:
            r1 = 0
        L_0x03ac:
            r1 = r1 | r2
            r2 = r1
            r1 = r9
            goto L_0x03b1
        L_0x03b0:
            r5 = r11
        L_0x03b1:
            int r7 = r7 + 1
            r12 = r43
            r11 = r5
            r13 = r16
            goto L_0x0377
        L_0x03b9:
            r5 = r11
            r43 = r12
            r16 = r13
            if (r0 == r3) goto L_0x03c2
            r1 = 1
            goto L_0x03c3
        L_0x03c2:
            r1 = 0
        L_0x03c3:
            r1 = r1 | r2
            if (r1 == 0) goto L_0x03c9
            long[] r2 = new long[r0]
            goto L_0x03ca
        L_0x03c9:
            r2 = r5
        L_0x03ca:
            if (r1 == 0) goto L_0x03cf
            int[] r3 = new int[r0]
            goto L_0x03d1
        L_0x03cf:
            r3 = r43
        L_0x03d1:
            r7 = 1
            if (r7 != r1) goto L_0x03d6
            r13 = 0
            goto L_0x03d8
        L_0x03d6:
            r13 = r16
        L_0x03d8:
            if (r1 == 0) goto L_0x03dd
            int[] r7 = new int[r0]
            goto L_0x03de
        L_0x03dd:
            r7 = r15
        L_0x03de:
            long[] r0 = new long[r0]
            r28 = r13
            r12 = r18
            r8 = 0
            r11 = 0
        L_0x03e6:
            long[] r9 = r4.zzi
            int r10 = r9.length
            if (r8 >= r10) goto L_0x048b
            long[] r10 = r4.zzj
            r29 = r12
            r12 = r10[r8]
            r31 = r9[r8]
            r9 = -1
            int r16 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r16 == 0) goto L_0x0473
            long r9 = r4.zzc
            r16 = r7
            r24 = r8
            long r7 = r4.zzd
            r18 = r31
            r20 = r9
            r22 = r7
            long r7 = com.google.android.gms.internal.ads.zzbar.zzj(r18, r20, r22)
            r9 = 1
            int r10 = com.google.android.gms.internal.ads.zzbar.zzb(r14, r12, r9, r9)
            long r7 = r7 + r12
            r9 = 0
            int r7 = com.google.android.gms.internal.ads.zzbar.zzb(r14, r7, r6, r9)
            if (r1 == 0) goto L_0x042a
            int r8 = r7 - r10
            java.lang.System.arraycopy(r5, r10, r2, r11, r8)
            r9 = r43
            java.lang.System.arraycopy(r9, r10, r3, r11, r8)
            r27 = r6
            r6 = r16
            java.lang.System.arraycopy(r15, r10, r6, r11, r8)
            goto L_0x0430
        L_0x042a:
            r9 = r43
            r27 = r6
            r6 = r16
        L_0x0430:
            r8 = r28
        L_0x0432:
            if (r10 >= r7) goto L_0x046c
            r20 = 1000000(0xf4240, double:4.940656E-318)
            r33 = r5
            r16 = r6
            long r5 = r4.zzd
            r18 = r29
            r22 = r5
            long r5 = com.google.android.gms.internal.ads.zzbar.zzj(r18, r20, r22)
            r18 = r14[r10]
            long r34 = r18 - r12
            r36 = 1000000(0xf4240, double:4.940656E-318)
            r43 = r12
            long r12 = r4.zzc
            r38 = r12
            long r12 = com.google.android.gms.internal.ads.zzbar.zzj(r34, r36, r38)
            long r5 = r5 + r12
            r0[r11] = r5
            if (r1 == 0) goto L_0x0461
            r5 = r3[r11]
            if (r5 <= r8) goto L_0x0461
            r8 = r9[r10]
        L_0x0461:
            int r11 = r11 + 1
            int r10 = r10 + 1
            r12 = r43
            r6 = r16
            r5 = r33
            goto L_0x0432
        L_0x046c:
            r33 = r5
            r16 = r6
            r28 = r8
            goto L_0x047d
        L_0x0473:
            r9 = r43
            r33 = r5
            r27 = r6
            r16 = r7
            r24 = r8
        L_0x047d:
            long r12 = r29 + r31
            int r8 = r24 + 1
            r43 = r9
            r7 = r16
            r6 = r27
            r5 = r33
            goto L_0x03e6
        L_0x048b:
            r15 = r7
            r5 = 0
            r17 = 0
        L_0x048f:
            int r1 = r15.length
            if (r5 >= r1) goto L_0x049c
            if (r17 != 0) goto L_0x049e
            r1 = r15[r5]
            r4 = 1
            r17 = r1 & 1
            int r5 = r5 + 1
            goto L_0x048f
        L_0x049c:
            if (r17 == 0) goto L_0x04ae
        L_0x049e:
            com.google.android.gms.internal.ads.zzawr r1 = new com.google.android.gms.internal.ads.zzawr
            r25 = r1
            r26 = r2
            r27 = r3
            r29 = r0
            r30 = r15
            r25.<init>(r26, r27, r28, r29, r30)
            return r1
        L_0x04ae:
            com.google.android.gms.internal.ads.zzasz r0 = new com.google.android.gms.internal.ads.zzasz
            java.lang.String r1 = "The edited sample sequence does not contain a sync sample."
            r0.<init>(r1)
            throw r0
        L_0x04b6:
            r33 = r11
            r9 = r12
            r16 = r13
            long r0 = r4.zzc
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.zzbar.zzn(r14, r2, r0)
            com.google.android.gms.internal.ads.zzawr r0 = new com.google.android.gms.internal.ads.zzawr
            r10 = r0
            r11 = r33
            r12 = r9
            r13 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x04cf:
            com.google.android.gms.internal.ads.zzasz r0 = new com.google.android.gms.internal.ads.zzasz
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawd.zzb(com.google.android.gms.internal.ads.zzawo, com.google.android.gms.internal.ads.zzavu, com.google.android.gms.internal.ads.zzavd):com.google.android.gms.internal.ads.zzawr");
    }

    public static zzaxh zzc(zzavv zzavv, boolean z) {
        if (z) {
            return null;
        }
        zzbak zzbak = zzavv.zza;
        zzbak.zzv(8);
        while (zzbak.zza() >= 8) {
            int zzc2 = zzbak.zzc();
            int zze2 = zzbak.zze();
            if (zzbak.zze() == zzavw.zzaD) {
                zzbak.zzv(zzc2);
                int i = zzc2 + zze2;
                zzbak.zzw(12);
                while (zzbak.zzc() < i) {
                    int zzc3 = zzbak.zzc();
                    int zze3 = zzbak.zze();
                    if (zzbak.zze() == zzavw.zzaE) {
                        zzbak.zzv(zzc3);
                        int i2 = zzc3 + zze3;
                        zzbak.zzw(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzbak.zzc() < i2) {
                            zzaxg zza2 = zzawj.zza(zzbak);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new zzaxh((List) arrayList);
                    }
                    zzbak.zzw(zze3 - 8);
                }
                return null;
            }
            zzbak.zzw(zze2 - 8);
        }
        return null;
    }

    private static int zzd(zzbak zzbak) {
        int zzg2 = zzbak.zzg();
        int i = zzg2 & WorkQueueKt.MASK;
        while ((zzg2 & 128) == 128) {
            zzg2 = zzbak.zzg();
            i = (i << 7) | (zzg2 & WorkQueueKt.MASK);
        }
        return i;
    }

    private static int zze(zzbak zzbak, int i, int i2, zzavz zzavz, int i3) {
        zzbak zzbak2 = zzbak;
        int zzc2 = zzbak.zzc();
        while (true) {
            boolean z = false;
            if (zzc2 - i >= i2) {
                return 0;
            }
            zzbak.zzv(zzc2);
            int zze2 = zzbak.zze();
            zzbac.zzd(zze2 > 0, "childAtomSize should be positive");
            if (zzbak.zze() == zzavw.zzY) {
                int i4 = zzc2 + 8;
                Pair pair = null;
                boolean z2 = false;
                Integer num = null;
                zzawp zzawp = null;
                while (i4 - zzc2 < zze2) {
                    zzbak.zzv(i4);
                    int zze3 = zzbak.zze();
                    int zze4 = zzbak.zze();
                    if (zze4 == zzavw.zzae) {
                        num = Integer.valueOf(zzbak.zze());
                    } else if (zze4 == zzavw.zzZ) {
                        zzbak.zzw(4);
                        z2 = zzbak.zze() == zzg;
                    } else if (zze4 == zzavw.zzaa) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= zze3) {
                                zzawp = null;
                                break;
                            }
                            zzbak.zzv(i5);
                            int zze5 = zzbak.zze();
                            if (zzbak.zze() == zzavw.zzab) {
                                zzbak.zzw(6);
                                boolean z3 = zzbak.zzg() == 1;
                                int zzg2 = zzbak.zzg();
                                byte[] bArr = new byte[16];
                                zzbak.zzq(bArr, 0, 16);
                                zzawp = new zzawp(z3, zzg2, bArr);
                            } else {
                                i5 += zze5;
                            }
                        }
                    }
                    i4 += zze3;
                }
                if (z2) {
                    zzbac.zzd(num != null, "frma atom is mandatory");
                    if (zzawp != null) {
                        z = true;
                    }
                    zzbac.zzd(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzawp);
                }
                if (pair != null) {
                    zzavz.zza[i3] = (zzawp) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            zzavz zzavz2 = zzavz;
            zzc2 += zze2;
        }
    }

    private static Pair zzf(zzbak zzbak, int i) {
        zzbak.zzv(i + 12);
        zzbak.zzw(1);
        zzd(zzbak);
        zzbak.zzw(2);
        int zzg2 = zzbak.zzg();
        if ((zzg2 & 128) != 0) {
            zzbak.zzw(2);
        }
        if ((zzg2 & 64) != 0) {
            zzbak.zzw(zzbak.zzj());
        }
        if ((zzg2 & 32) != 0) {
            zzbak.zzw(2);
        }
        zzbak.zzw(1);
        zzd(zzbak);
        int zzg3 = zzbak.zzg();
        String str = null;
        if (zzg3 == 32) {
            str = "video/mp4v-es";
        } else if (zzg3 == 33) {
            str = "video/avc";
        } else if (zzg3 != 35) {
            if (zzg3 != 64) {
                if (zzg3 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (zzg3 == 165) {
                    str = "audio/ac3";
                } else if (zzg3 != 166) {
                    switch (zzg3) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (zzg3) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzbak.zzw(12);
        zzbak.zzw(1);
        int zzd2 = zzd(zzbak);
        byte[] bArr = new byte[zzd2];
        zzbak.zzq(bArr, 0, zzd2);
        return Pair.create(str, bArr);
    }
}
