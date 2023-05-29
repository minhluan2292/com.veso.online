package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzabc implements zzzi {
    private final zzef zza = new zzef(12);
    private final zzabb zzb = new zzabb((zzaba) null);
    private int zzc;
    private zzzl zzd = new zzzg();
    private zzabd zze;
    private long zzf = -9223372036854775807L;
    /* access modifiers changed from: private */
    public zzabf[] zzg = new zzabf[0];
    private long zzh;
    private zzabf zzi;
    private int zzj = -1;
    private long zzk = -1;
    private long zzl = -1;
    private int zzm;
    private boolean zzn;

    private final zzabf zzf(int i) {
        for (zzabf zzabf : this.zzg) {
            if (zzabf.zzg(i)) {
                return zzabf;
            }
        }
        return null;
    }

    public final void zzb(zzzl zzzl) {
        this.zzc = 0;
        this.zzd = zzzl;
        this.zzh = -1;
    }

    public final void zzc(long j, long j2) {
        int i;
        this.zzh = -1;
        this.zzi = null;
        for (zzabf zzf2 : this.zzg) {
            zzf2.zzf(j);
        }
        if (j != 0) {
            i = 6;
        } else if (this.zzg.length == 0) {
            this.zzc = 0;
            return;
        } else {
            i = 3;
        }
        this.zzc = i;
    }

    public final boolean zzd(zzzj zzzj) throws IOException {
        ((zzyy) zzzj).zzm(this.zza.zzH(), 0, 12, false);
        this.zza.zzF(0);
        if (this.zza.zzg() != 1179011410) {
            return false;
        }
        this.zza.zzG(4);
        if (this.zza.zzg() == 541677121) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzzj r23, com.google.android.gms.internal.ads.zzaai r24) throws java.io.IOException {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            long r2 = r0.zzh
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x002e
            long r9 = r23.zzf()
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x0028
            r11 = 262144(0x40000, double:1.295163E-318)
            long r11 = r11 + r9
            int r6 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            r6 = r1
            com.google.android.gms.internal.ads.zzyy r6 = (com.google.android.gms.internal.ads.zzyy) r6
            long r2 = r2 - r9
            int r2 = (int) r2
            r6.zzo(r2, r8)
            goto L_0x002e
        L_0x0028:
            r6 = r24
            r6.zza = r2
            r2 = r7
            goto L_0x002f
        L_0x002e:
            r2 = r8
        L_0x002f:
            r0.zzh = r4
            if (r2 == 0) goto L_0x0034
            return r7
        L_0x0034:
            int r2 = r0.zzc
            r3 = 12
            r6 = 0
            if (r2 == 0) goto L_0x03a8
            r9 = 1819436136(0x6c726468, float:1.1721368E27)
            r10 = 1414744396(0x5453494c, float:3.62987127E12)
            r11 = 2
            if (r2 == r7) goto L_0x034b
            r12 = 3
            if (r2 == r11) goto L_0x022b
            r9 = 6
            r11 = 1769369453(0x69766f6d, float:1.8620122E25)
            r13 = 4
            r16 = 8
            r14 = 16
            if (r2 == r12) goto L_0x0198
            r4 = 5
            r5 = 8
            if (r2 == r13) goto L_0x0168
            if (r2 == r4) goto L_0x00e6
            long r12 = r23.zzf()
            long r14 = r0.zzl
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0066
            r8 = -1
            goto L_0x00e5
        L_0x0066:
            com.google.android.gms.internal.ads.zzabf r2 = r0.zzi
            if (r2 == 0) goto L_0x0075
            boolean r1 = r2.zzh(r1)
            if (r1 != 0) goto L_0x0072
            goto L_0x00e5
        L_0x0072:
            r0.zzi = r6
            return r8
        L_0x0075:
            long r12 = r23.zzf()
            r14 = 1
            long r12 = r12 & r14
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x0086
            r2 = r1
            com.google.android.gms.internal.ads.zzyy r2 = (com.google.android.gms.internal.ads.zzyy) r2
            r2.zzo(r7, r8)
        L_0x0086:
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            byte[] r2 = r2.zzH()
            r4 = r1
            com.google.android.gms.internal.ads.zzyy r4 = (com.google.android.gms.internal.ads.zzyy) r4
            r4.zzm(r2, r8, r3, r8)
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            r2.zzF(r8)
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            int r2 = r2.zzg()
            if (r2 != r10) goto L_0x00b5
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            r2.zzF(r5)
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            int r2 = r2.zzg()
            if (r2 != r11) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r3 = r5
        L_0x00ae:
            r4.zzo(r3, r8)
            r23.zzj()
            goto L_0x00e5
        L_0x00b5:
            com.google.android.gms.internal.ads.zzef r3 = r0.zza
            int r3 = r3.zzg()
            r6 = 1263424842(0x4b4e554a, float:1.352225E7)
            if (r2 != r6) goto L_0x00cb
            long r1 = r23.zzf()
            long r3 = (long) r3
            long r1 = r1 + r3
            long r1 = r1 + r16
            r0.zzh = r1
            goto L_0x00e5
        L_0x00cb:
            r4.zzo(r5, r8)
            r23.zzj()
            com.google.android.gms.internal.ads.zzabf r2 = r0.zzf(r2)
            if (r2 != 0) goto L_0x00e0
            long r1 = r23.zzf()
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.zzh = r1
            goto L_0x00e5
        L_0x00e0:
            r2.zze(r3)
            r0.zzi = r2
        L_0x00e5:
            return r8
        L_0x00e6:
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            int r3 = r0.zzm
            r2.<init>((int) r3)
            byte[] r3 = r2.zzH()
            int r4 = r0.zzm
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.zzn(r3, r8, r4, r8)
            int r1 = r2.zza()
            if (r1 >= r14) goto L_0x0101
            r18 = 0
            goto L_0x011d
        L_0x0101:
            int r1 = r2.zzc()
            r2.zzG(r5)
            int r3 = r2.zzg()
            long r4 = r0.zzk
            long r10 = (long) r3
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0116
            r18 = 0
            goto L_0x011a
        L_0x0116:
            long r4 = r4 + r16
            r18 = r4
        L_0x011a:
            r2.zzF(r1)
        L_0x011d:
            int r1 = r2.zza()
            if (r1 < r14) goto L_0x0145
            int r1 = r2.zzg()
            int r3 = r2.zzg()
            int r4 = r2.zzg()
            long r4 = (long) r4
            long r4 = r4 + r18
            r2.zzg()
            com.google.android.gms.internal.ads.zzabf r1 = r0.zzf(r1)
            if (r1 == 0) goto L_0x011d
            r3 = r3 & r14
            if (r3 != r14) goto L_0x0141
            r1.zzb(r4)
        L_0x0141:
            r1.zzd()
            goto L_0x011d
        L_0x0145:
            com.google.android.gms.internal.ads.zzabf[] r1 = r0.zzg
            int r2 = r1.length
            r3 = r8
        L_0x0149:
            if (r3 >= r2) goto L_0x0153
            r4 = r1[r3]
            r4.zzc()
            int r3 = r3 + 1
            goto L_0x0149
        L_0x0153:
            r0.zzn = r7
            com.google.android.gms.internal.ads.zzzl r1 = r0.zzd
            com.google.android.gms.internal.ads.zzaaz r2 = new com.google.android.gms.internal.ads.zzaaz
            long r3 = r0.zzf
            r2.<init>(r0, r3)
            r1.zzN(r2)
            r0.zzc = r9
            long r1 = r0.zzk
            r0.zzh = r1
            return r8
        L_0x0168:
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            byte[] r2 = r2.zzH()
            r3 = r1
            com.google.android.gms.internal.ads.zzyy r3 = (com.google.android.gms.internal.ads.zzyy) r3
            r3.zzn(r2, r8, r5, r8)
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            r2.zzF(r8)
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            int r2 = r2.zzg()
            com.google.android.gms.internal.ads.zzef r3 = r0.zza
            int r3 = r3.zzg()
            r5 = 829973609(0x31786469, float:3.6145826E-9)
            if (r2 != r5) goto L_0x018f
            r0.zzc = r4
            r0.zzm = r3
            goto L_0x0197
        L_0x018f:
            long r1 = r23.zzf()
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.zzh = r1
        L_0x0197:
            return r8
        L_0x0198:
            long r13 = r0.zzk
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x01aa
            long r4 = r23.zzf()
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x01a7
            goto L_0x01aa
        L_0x01a7:
            r0.zzh = r13
            return r8
        L_0x01aa:
            com.google.android.gms.internal.ads.zzef r4 = r0.zza
            byte[] r4 = r4.zzH()
            r5 = r1
            com.google.android.gms.internal.ads.zzyy r5 = (com.google.android.gms.internal.ads.zzyy) r5
            r5.zzm(r4, r8, r3, r8)
            r23.zzj()
            com.google.android.gms.internal.ads.zzef r4 = r0.zza
            r4.zzF(r8)
            com.google.android.gms.internal.ads.zzabb r4 = r0.zzb
            com.google.android.gms.internal.ads.zzef r6 = r0.zza
            r4.zza(r6)
            com.google.android.gms.internal.ads.zzef r4 = r0.zza
            int r4 = r4.zzg()
            com.google.android.gms.internal.ads.zzabb r6 = r0.zzb
            int r12 = r6.zza
            r13 = 1179011410(0x46464952, float:12690.33)
            if (r12 != r13) goto L_0x01d8
            r5.zzo(r3, r8)
            return r8
        L_0x01d8:
            if (r12 != r10) goto L_0x021e
            if (r4 == r11) goto L_0x01dd
            goto L_0x021e
        L_0x01dd:
            long r3 = r23.zzf()
            r0.zzk = r3
            int r5 = r6.zzb
            long r5 = (long) r5
            long r3 = r3 + r5
            long r3 = r3 + r16
            r0.zzl = r3
            boolean r5 = r0.zzn
            if (r5 != 0) goto L_0x0212
            com.google.android.gms.internal.ads.zzabd r5 = r0.zze
            java.util.Objects.requireNonNull(r5)
            int r5 = r5.zzb
            r2 = 16
            r5 = r5 & r2
            if (r5 == r2) goto L_0x020c
            com.google.android.gms.internal.ads.zzzl r2 = r0.zzd
            com.google.android.gms.internal.ads.zzaak r3 = new com.google.android.gms.internal.ads.zzaak
            long r4 = r0.zzf
            r10 = 0
            r3.<init>(r4, r10)
            r2.zzN(r3)
            r0.zzn = r7
            goto L_0x0212
        L_0x020c:
            r2 = 4
            r0.zzc = r2
            r0.zzh = r3
            return r8
        L_0x0212:
            long r1 = r23.zzf()
            r3 = 12
            long r1 = r1 + r3
            r0.zzh = r1
            r0.zzc = r9
            return r8
        L_0x021e:
            long r1 = r23.zzf()
            int r3 = r6.zzb
            long r3 = (long) r3
            long r1 = r1 + r3
            long r1 = r1 + r16
            r0.zzh = r1
            return r8
        L_0x022b:
            int r2 = r0.zzj
            int r2 = r2 + -4
            com.google.android.gms.internal.ads.zzef r3 = new com.google.android.gms.internal.ads.zzef
            r3.<init>((int) r2)
            byte[] r4 = r3.zzH()
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.zzn(r4, r8, r2, r8)
            com.google.android.gms.internal.ads.zzabg r1 = com.google.android.gms.internal.ads.zzabg.zzc(r9, r3)
            int r2 = r1.zza()
            if (r2 != r9) goto L_0x0331
            java.lang.Class<com.google.android.gms.internal.ads.zzabd> r2 = com.google.android.gms.internal.ads.zzabd.class
            com.google.android.gms.internal.ads.zzaay r2 = r1.zzb(r2)
            com.google.android.gms.internal.ads.zzabd r2 = (com.google.android.gms.internal.ads.zzabd) r2
            if (r2 == 0) goto L_0x032a
            r0.zze = r2
            int r3 = r2.zzc
            long r3 = (long) r3
            int r2 = r2.zza
            long r9 = (long) r2
            long r3 = r3 * r9
            r0.zzf = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.gms.internal.ads.zzfvn r1 = r1.zza
            int r3 = r1.size()
            r4 = r8
            r14 = r4
        L_0x0269:
            if (r4 >= r3) goto L_0x0316
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.ads.zzaay r5 = (com.google.android.gms.internal.ads.zzaay) r5
            int r9 = r5.zza()
            r10 = 1819440243(0x6c727473, float:1.17243986E27)
            if (r9 != r10) goto L_0x030f
            com.google.android.gms.internal.ads.zzabg r5 = (com.google.android.gms.internal.ads.zzabg) r5
            int r9 = r14 + 1
            java.lang.Class<com.google.android.gms.internal.ads.zzabe> r10 = com.google.android.gms.internal.ads.zzabe.class
            com.google.android.gms.internal.ads.zzaay r10 = r5.zzb(r10)
            com.google.android.gms.internal.ads.zzabe r10 = (com.google.android.gms.internal.ads.zzabe) r10
            java.lang.Class<com.google.android.gms.internal.ads.zzabh> r13 = com.google.android.gms.internal.ads.zzabh.class
            com.google.android.gms.internal.ads.zzaay r13 = r5.zzb(r13)
            com.google.android.gms.internal.ads.zzabh r13 = (com.google.android.gms.internal.ads.zzabh) r13
            java.lang.String r15 = "AviExtractor"
            if (r10 != 0) goto L_0x029c
            java.lang.String r5 = "Missing Stream Header"
            com.google.android.gms.internal.ads.zzdw.zze(r15, r5)
        L_0x0297:
            r11 = r6
            r23 = r9
            goto L_0x0308
        L_0x029c:
            if (r13 != 0) goto L_0x02a4
            java.lang.String r5 = "Missing Stream Format"
            com.google.android.gms.internal.ads.zzdw.zze(r15, r5)
            goto L_0x0297
        L_0x02a4:
            int r15 = r10.zzd
            r23 = r9
            long r8 = (long) r15
            int r15 = r10.zzb
            long r11 = (long) r15
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r18 = r11 * r15
            int r11 = r10.zzc
            long r11 = (long) r11
            r16 = r8
            r20 = r11
            long r8 = com.google.android.gms.internal.ads.zzen.zzw(r16, r18, r20)
            com.google.android.gms.internal.ads.zzaf r11 = r13.zza
            com.google.android.gms.internal.ads.zzad r12 = r11.zzb()
            r12.zzG(r14)
            int r13 = r10.zze
            if (r13 == 0) goto L_0x02cc
            r12.zzL(r13)
        L_0x02cc:
            java.lang.Class<com.google.android.gms.internal.ads.zzabi> r13 = com.google.android.gms.internal.ads.zzabi.class
            com.google.android.gms.internal.ads.zzaay r5 = r5.zzb(r13)
            com.google.android.gms.internal.ads.zzabi r5 = (com.google.android.gms.internal.ads.zzabi) r5
            if (r5 == 0) goto L_0x02db
            java.lang.String r5 = r5.zza
            r12.zzJ(r5)
        L_0x02db:
            java.lang.String r5 = r11.zzm
            int r5 = com.google.android.gms.internal.ads.zzbt.zzb(r5)
            if (r5 == r7) goto L_0x02ea
            r11 = 2
            if (r5 != r11) goto L_0x02e8
            r15 = 2
            goto L_0x02eb
        L_0x02e8:
            r11 = r6
            goto L_0x0308
        L_0x02ea:
            r15 = r5
        L_0x02eb:
            com.google.android.gms.internal.ads.zzzl r5 = r0.zzd
            com.google.android.gms.internal.ads.zzaap r5 = r5.zzv(r14, r15)
            com.google.android.gms.internal.ads.zzaf r11 = r12.zzY()
            r5.zzk(r11)
            com.google.android.gms.internal.ads.zzabf r11 = new com.google.android.gms.internal.ads.zzabf
            int r10 = r10.zzd
            r13 = r11
            r16 = r8
            r18 = r10
            r19 = r5
            r13.<init>(r14, r15, r16, r18, r19)
            r0.zzf = r8
        L_0x0308:
            if (r11 == 0) goto L_0x030d
            r2.add(r11)
        L_0x030d:
            r14 = r23
        L_0x030f:
            int r4 = r4 + 1
            r8 = 0
            r11 = 2
            r12 = 3
            goto L_0x0269
        L_0x0316:
            r4 = r8
            com.google.android.gms.internal.ads.zzabf[] r1 = new com.google.android.gms.internal.ads.zzabf[r4]
            java.lang.Object[] r1 = r2.toArray(r1)
            com.google.android.gms.internal.ads.zzabf[] r1 = (com.google.android.gms.internal.ads.zzabf[]) r1
            r0.zzg = r1
            com.google.android.gms.internal.ads.zzzl r1 = r0.zzd
            r1.zzC()
            r1 = 3
            r0.zzc = r1
            return r4
        L_0x032a:
            java.lang.String r1 = "AviHeader not found"
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r6)
            throw r1
        L_0x0331:
            int r1 = r1.zza()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected header list type "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r6)
            throw r1
        L_0x034b:
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            byte[] r2 = r2.zzH()
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r4 = 0
            r1.zzn(r2, r4, r3, r4)
            com.google.android.gms.internal.ads.zzef r1 = r0.zza
            r1.zzF(r4)
            com.google.android.gms.internal.ads.zzabb r1 = r0.zzb
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            r1.zza(r2)
            int r3 = r1.zza
            if (r3 != r10) goto L_0x0392
            int r2 = r2.zzg()
            r1.zzc = r2
            com.google.android.gms.internal.ads.zzabb r1 = r0.zzb
            int r2 = r1.zzc
            if (r2 != r9) goto L_0x037c
            int r1 = r1.zzb
            r0.zzj = r1
            r1 = 2
            r0.zzc = r1
            r1 = 0
            return r1
        L_0x037c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "hdrl expected, found: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r6)
            throw r1
        L_0x0392:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LIST expected, found: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r6)
            throw r1
        L_0x03a8:
            boolean r2 = r22.zzd(r23)
            if (r2 == 0) goto L_0x03b7
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r2 = 0
            r1.zzo(r3, r2)
            r0.zzc = r7
            return r2
        L_0x03b7:
            java.lang.String r1 = "AVI Header List not found"
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabc.zza(com.google.android.gms.internal.ads.zzzj, com.google.android.gms.internal.ads.zzaai):int");
    }
}
