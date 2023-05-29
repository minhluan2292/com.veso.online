package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzahn implements zzahc {
    private final zzaid zza;
    private String zzb;
    private zzaap zzc;
    private zzahm zzd;
    private boolean zze;
    private final boolean[] zzf = new boolean[3];
    private final zzahr zzg = new zzahr(32, 128);
    private final zzahr zzh = new zzahr(33, 128);
    private final zzahr zzi = new zzahr(34, 128);
    private final zzahr zzj = new zzahr(39, 128);
    private final zzahr zzk = new zzahr(40, 128);
    private long zzl;
    private long zzm = -9223372036854775807L;
    private final zzef zzn = new zzef();

    public zzahn(zzaid zzaid) {
        this.zza = zzaid;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzb(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzef r38) {
        /*
            r37 = this;
            r0 = r37
            com.google.android.gms.internal.ads.zzaap r1 = r0.zzc
            com.google.android.gms.internal.ads.zzdd.zzb(r1)
            int r1 = com.google.android.gms.internal.ads.zzen.zza
        L_0x0009:
            int r1 = r38.zza()
            if (r1 <= 0) goto L_0x03dd
            int r1 = r38.zzc()
            int r2 = r38.zzd()
            byte[] r3 = r38.zzH()
            long r4 = r0.zzl
            int r6 = r38.zza()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zzl = r4
            com.google.android.gms.internal.ads.zzaap r4 = r0.zzc
            int r5 = r38.zza()
            r6 = r38
            r4.zzq(r6, r5)
        L_0x0030:
            if (r1 >= r2) goto L_0x0009
            boolean[] r4 = r0.zzf
            int r4 = com.google.android.gms.internal.ads.zzaaf.zza(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x03da
            int r5 = r4 + 3
            byte r7 = r3[r5]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            r8 = 1
            int r7 = r7 >> r8
            int r9 = r4 - r1
            if (r9 <= 0) goto L_0x0049
            r0.zzf(r3, r1, r4)
        L_0x0049:
            int r12 = r2 - r4
            long r10 = r0.zzl
            long r13 = (long) r12
            long r10 = r10 - r13
            if (r9 >= 0) goto L_0x0053
            int r4 = -r9
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            long r13 = r0.zzm
            com.google.android.gms.internal.ads.zzahm r9 = r0.zzd
            boolean r15 = r0.zze
            r9.zza(r10, r12, r15)
            boolean r9 = r0.zze
            if (r9 != 0) goto L_0x033a
            com.google.android.gms.internal.ads.zzahr r9 = r0.zzg
            r9.zzd(r4)
            com.google.android.gms.internal.ads.zzahr r9 = r0.zzh
            r9.zzd(r4)
            com.google.android.gms.internal.ads.zzahr r9 = r0.zzi
            r9.zzd(r4)
            com.google.android.gms.internal.ads.zzahr r9 = r0.zzg
            boolean r16 = r9.zze()
            if (r16 == 0) goto L_0x033a
            com.google.android.gms.internal.ads.zzahr r8 = r0.zzh
            boolean r17 = r8.zze()
            if (r17 == 0) goto L_0x033a
            com.google.android.gms.internal.ads.zzahr r15 = r0.zzi
            boolean r18 = r15.zze()
            if (r18 == 0) goto L_0x033a
            com.google.android.gms.internal.ads.zzaap r1 = r0.zzc
            r19 = r5
            java.lang.String r5 = r0.zzb
            int r6 = r9.zzb
            r20 = r2
            int r2 = r8.zzb
            int r2 = r2 + r6
            r21 = r3
            int r3 = r15.zzb
            int r2 = r2 + r3
            byte[] r2 = new byte[r2]
            byte[] r3 = r9.zza
            r22 = r7
            r7 = 0
            java.lang.System.arraycopy(r3, r7, r2, r7, r6)
            byte[] r3 = r8.zza
            int r6 = r9.zzb
            r18 = r12
            int r12 = r8.zzb
            java.lang.System.arraycopy(r3, r7, r2, r6, r12)
            byte[] r3 = r15.zza
            int r6 = r9.zzb
            int r9 = r8.zzb
            int r6 = r6 + r9
            int r9 = r15.zzb
            java.lang.System.arraycopy(r3, r7, r2, r6, r9)
            com.google.android.gms.internal.ads.zzaah r3 = new com.google.android.gms.internal.ads.zzaah
            byte[] r6 = r8.zza
            int r8 = r8.zzb
            r3.<init>(r6, r7, r8)
            r6 = 44
            r3.zze(r6)
            r6 = 3
            int r8 = r3.zza(r6)
            r3.zzd()
            r9 = 2
            int r23 = r3.zza(r9)
            boolean r24 = r3.zzf()
            r12 = 5
            int r25 = r3.zza(r12)
            r12 = r7
            r26 = r12
        L_0x00e2:
            r15 = 32
            if (r12 >= r15) goto L_0x00f4
            boolean r15 = r3.zzf()
            if (r15 == 0) goto L_0x00f1
            r15 = 1
            int r27 = r15 << r12
            r26 = r26 | r27
        L_0x00f1:
            int r12 = r12 + 1
            goto L_0x00e2
        L_0x00f4:
            r12 = 6
            int[] r15 = new int[r12]
        L_0x00f7:
            r9 = 8
            if (r7 >= r12) goto L_0x0104
            int r9 = r3.zza(r9)
            r15[r7] = r9
            int r7 = r7 + 1
            goto L_0x00f7
        L_0x0104:
            int r7 = r3.zza(r9)
            r9 = 0
            r12 = 0
        L_0x010a:
            if (r9 >= r8) goto L_0x011f
            boolean r30 = r3.zzf()
            if (r30 == 0) goto L_0x0114
            int r12 = r12 + 89
        L_0x0114:
            boolean r30 = r3.zzf()
            if (r30 == 0) goto L_0x011c
            int r12 = r12 + 8
        L_0x011c:
            int r9 = r9 + 1
            goto L_0x010a
        L_0x011f:
            r3.zze(r12)
            if (r8 <= 0) goto L_0x012a
            int r9 = 8 - r8
            int r9 = r9 + r9
            r3.zze(r9)
        L_0x012a:
            r3.zzc()
            int r9 = r3.zzc()
            if (r9 != r6) goto L_0x0137
            r3.zzd()
            r9 = r6
        L_0x0137:
            int r12 = r3.zzc()
            int r30 = r3.zzc()
            boolean r31 = r3.zzf()
            if (r31 == 0) goto L_0x017a
            int r31 = r3.zzc()
            int r32 = r3.zzc()
            int r33 = r3.zzc()
            int r34 = r3.zzc()
            r6 = 1
            if (r9 == r6) goto L_0x0165
            r6 = 2
            if (r9 != r6) goto L_0x0160
            r35 = r10
            r6 = 2
            r9 = 2
            goto L_0x0163
        L_0x0160:
            r35 = r10
            r6 = 1
        L_0x0163:
            r10 = 1
            goto L_0x0169
        L_0x0165:
            r35 = r10
            r10 = r6
            r6 = 2
        L_0x0169:
            if (r9 != r10) goto L_0x016d
            r9 = 2
            goto L_0x016e
        L_0x016d:
            r9 = 1
        L_0x016e:
            int r31 = r31 + r32
            int r6 = r6 * r31
            int r12 = r12 - r6
            int r33 = r33 + r34
            int r9 = r9 * r33
            int r30 = r30 - r9
            goto L_0x017c
        L_0x017a:
            r35 = r10
        L_0x017c:
            r3.zzc()
            r3.zzc()
            int r6 = r3.zzc()
            boolean r9 = r3.zzf()
            r10 = 1
            if (r10 == r9) goto L_0x018f
            r9 = r8
            goto L_0x0190
        L_0x018f:
            r9 = 0
        L_0x0190:
            if (r9 > r8) goto L_0x019e
            r3.zzc()
            r3.zzc()
            r3.zzc()
            int r9 = r9 + 1
            goto L_0x0190
        L_0x019e:
            r3.zzc()
            r3.zzc()
            r3.zzc()
            r3.zzc()
            r3.zzc()
            r3.zzc()
            boolean r8 = r3.zzf()
            r9 = 4
            if (r8 == 0) goto L_0x01ff
            boolean r8 = r3.zzf()
            if (r8 == 0) goto L_0x01ff
            r8 = 0
        L_0x01be:
            if (r8 >= r9) goto L_0x01ff
            r10 = 0
        L_0x01c1:
            r11 = 6
            if (r10 >= r11) goto L_0x01f8
            boolean r29 = r3.zzf()
            if (r29 != 0) goto L_0x01d1
            r3.zzc()
            r33 = r13
        L_0x01cf:
            r9 = 3
            goto L_0x01ee
        L_0x01d1:
            r11 = 64
            int r31 = r8 + r8
            int r31 = r31 + 4
            r33 = r13
            r9 = 1
            int r13 = r9 << r31
            int r11 = java.lang.Math.min(r11, r13)
            if (r8 <= r9) goto L_0x01e5
            r3.zzb()
        L_0x01e5:
            r9 = 0
        L_0x01e6:
            if (r9 >= r11) goto L_0x01cf
            r3.zzb()
            int r9 = r9 + 1
            goto L_0x01e6
        L_0x01ee:
            if (r8 != r9) goto L_0x01f2
            r11 = r9
            goto L_0x01f3
        L_0x01f2:
            r11 = 1
        L_0x01f3:
            int r10 = r10 + r11
            r13 = r33
            r9 = 4
            goto L_0x01c1
        L_0x01f8:
            r33 = r13
            r9 = 3
            int r8 = r8 + 1
            r9 = 4
            goto L_0x01be
        L_0x01ff:
            r33 = r13
            r8 = 2
            r3.zze(r8)
            boolean r8 = r3.zzf()
            if (r8 == 0) goto L_0x0219
            r8 = 8
            r3.zze(r8)
            r3.zzc()
            r3.zzc()
            r3.zzd()
        L_0x0219:
            int r8 = r3.zzc()
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0220:
            if (r9 >= r8) goto L_0x026c
            if (r9 == 0) goto L_0x0228
            boolean r10 = r3.zzf()
        L_0x0228:
            if (r10 == 0) goto L_0x0242
            r3.zzd()
            r3.zzc()
            r13 = 0
        L_0x0231:
            if (r13 > r11) goto L_0x023f
            boolean r14 = r3.zzf()
            if (r14 == 0) goto L_0x023c
            r3.zzd()
        L_0x023c:
            int r13 = r13 + 1
            goto L_0x0231
        L_0x023f:
            r29 = r8
            goto L_0x0267
        L_0x0242:
            int r11 = r3.zzc()
            int r13 = r3.zzc()
            int r14 = r11 + r13
            r29 = r8
            r8 = 0
        L_0x024f:
            if (r8 >= r11) goto L_0x025a
            r3.zzc()
            r3.zzd()
            int r8 = r8 + 1
            goto L_0x024f
        L_0x025a:
            r8 = 0
        L_0x025b:
            if (r8 >= r13) goto L_0x0266
            r3.zzc()
            r3.zzd()
            int r8 = r8 + 1
            goto L_0x025b
        L_0x0266:
            r11 = r14
        L_0x0267:
            int r9 = r9 + 1
            r8 = r29
            goto L_0x0220
        L_0x026c:
            boolean r8 = r3.zzf()
            if (r8 == 0) goto L_0x0282
            r8 = 0
        L_0x0273:
            int r9 = r3.zzc()
            if (r8 >= r9) goto L_0x0282
            r9 = 5
            int r10 = r6 + 5
            r3.zze(r10)
            int r8 = r8 + 1
            goto L_0x0273
        L_0x0282:
            r6 = 2
            r3.zze(r6)
            boolean r6 = r3.zzf()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x0305
            boolean r6 = r3.zzf()
            if (r6 == 0) goto L_0x02d0
            r6 = 8
            int r6 = r3.zza(r6)
            r9 = 255(0xff, float:3.57E-43)
            if (r6 != r9) goto L_0x02b0
            r6 = 16
            int r9 = r3.zza(r6)
            int r6 = r3.zza(r6)
            if (r9 == 0) goto L_0x02d0
            if (r6 == 0) goto L_0x02d0
            float r8 = (float) r9
            float r6 = (float) r6
            float r8 = r8 / r6
            goto L_0x02d0
        L_0x02b0:
            r9 = 17
            if (r6 >= r9) goto L_0x02ba
            float[] r8 = com.google.android.gms.internal.ads.zzaaf.zzb
            r6 = r8[r6]
            r8 = r6
            goto L_0x02d0
        L_0x02ba:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unexpected aspect_ratio_idc value: "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            java.lang.String r9 = "H265Reader"
            com.google.android.gms.internal.ads.zzdw.zze(r9, r6)
        L_0x02d0:
            boolean r6 = r3.zzf()
            if (r6 == 0) goto L_0x02d9
            r3.zzd()
        L_0x02d9:
            boolean r6 = r3.zzf()
            if (r6 == 0) goto L_0x02ee
            r6 = 4
            r3.zze(r6)
            boolean r6 = r3.zzf()
            if (r6 == 0) goto L_0x02ee
            r6 = 24
            r3.zze(r6)
        L_0x02ee:
            boolean r6 = r3.zzf()
            if (r6 == 0) goto L_0x02fa
            r3.zzc()
            r3.zzc()
        L_0x02fa:
            r3.zzd()
            boolean r3 = r3.zzf()
            if (r3 == 0) goto L_0x0305
            int r30 = r30 + r30
        L_0x0305:
            r3 = r30
            r27 = r15
            r28 = r7
            java.lang.String r6 = com.google.android.gms.internal.ads.zzdf.zzb(r23, r24, r25, r26, r27, r28)
            com.google.android.gms.internal.ads.zzad r7 = new com.google.android.gms.internal.ads.zzad
            r7.<init>()
            r7.zzH(r5)
            java.lang.String r5 = "video/hevc"
            r7.zzS(r5)
            r7.zzx(r6)
            r7.zzX(r12)
            r7.zzF(r3)
            r7.zzP(r8)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r7.zzI(r2)
            com.google.android.gms.internal.ads.zzaf r2 = r7.zzY()
            r1.zzk(r2)
            r1 = 1
            r0.zze = r1
            goto L_0x0348
        L_0x033a:
            r20 = r2
            r21 = r3
            r19 = r5
            r22 = r7
            r35 = r10
            r18 = r12
            r33 = r13
        L_0x0348:
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzj
            boolean r1 = r1.zzd(r4)
            if (r1 == 0) goto L_0x0373
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzj
            byte[] r2 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzaaf.zzb(r2, r1)
            com.google.android.gms.internal.ads.zzef r2 = r0.zzn
            com.google.android.gms.internal.ads.zzahr r3 = r0.zzj
            byte[] r3 = r3.zza
            r2.zzD(r3, r1)
            com.google.android.gms.internal.ads.zzef r1 = r0.zzn
            r2 = 5
            r1.zzG(r2)
            com.google.android.gms.internal.ads.zzaid r1 = r0.zza
            com.google.android.gms.internal.ads.zzef r2 = r0.zzn
            r5 = r33
            r1.zza(r5, r2)
            goto L_0x0375
        L_0x0373:
            r5 = r33
        L_0x0375:
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzk
            boolean r1 = r1.zzd(r4)
            if (r1 == 0) goto L_0x039d
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzk
            byte[] r2 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzaaf.zzb(r2, r1)
            com.google.android.gms.internal.ads.zzef r2 = r0.zzn
            com.google.android.gms.internal.ads.zzahr r3 = r0.zzk
            byte[] r3 = r3.zza
            r2.zzD(r3, r1)
            com.google.android.gms.internal.ads.zzef r1 = r0.zzn
            r2 = 5
            r1.zzG(r2)
            com.google.android.gms.internal.ads.zzaid r1 = r0.zza
            com.google.android.gms.internal.ads.zzef r2 = r0.zzn
            r1.zza(r5, r2)
        L_0x039d:
            long r14 = r0.zzm
            com.google.android.gms.internal.ads.zzahm r9 = r0.zzd
            boolean r1 = r0.zze
            r10 = r35
            r12 = r18
            r13 = r22
            r16 = r1
            r9.zzd(r10, r12, r13, r14, r16)
            boolean r1 = r0.zze
            if (r1 != 0) goto L_0x03c4
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzg
            r2 = r22
            r1.zzc(r2)
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzh
            r1.zzc(r2)
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzi
            r1.zzc(r2)
            goto L_0x03c6
        L_0x03c4:
            r2 = r22
        L_0x03c6:
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzj
            r1.zzc(r2)
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzk
            r1.zzc(r2)
            r6 = r38
            r1 = r19
            r2 = r20
            r3 = r21
            goto L_0x0030
        L_0x03da:
            r0.zzf(r3, r1, r2)
        L_0x03dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahn.zza(com.google.android.gms.internal.ads.zzef):void");
    }

    public final void zzb(zzzl zzzl, zzaio zzaio) {
        zzaio.zzc();
        this.zzb = zzaio.zzb();
        zzaap zzv = zzzl.zzv(zzaio.zza(), 2);
        this.zzc = zzv;
        this.zzd = new zzahm(zzv);
        this.zza.zzb(zzzl, zzaio);
    }

    public final void zzc() {
    }

    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzm = j;
        }
    }

    public final void zze() {
        this.zzl = 0;
        this.zzm = -9223372036854775807L;
        zzaaf.zze(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzahm zzahm = this.zzd;
        if (zzahm != null) {
            zzahm.zzc();
        }
    }
}
