package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaeq implements zzzi {
    public static final zzzp zza = zzaeo.zza;
    private static final zzada zzb = zzaep.zza;
    private final zzef zzc;
    private final zzaab zzd;
    private final zzzx zze;
    private final zzzz zzf;
    private final zzaap zzg;
    private zzzl zzh;
    private zzaap zzi;
    private zzaap zzj;
    private int zzk;
    private zzbq zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzaes zzq;
    private boolean zzr;

    public zzaeq() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0151  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzf(com.google.android.gms.internal.ads.zzzj r17) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.zzk
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.zzk(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.android.gms.internal.ads.zzaes r2 = r0.zzq
            r8 = 1
            if (r2 != 0) goto L_0x01ab
            com.google.android.gms.internal.ads.zzef r14 = new com.google.android.gms.internal.ads.zzef
            com.google.android.gms.internal.ads.zzaab r2 = r0.zzd
            int r2 = r2.zzc
            r14.<init>((int) r2)
            byte[] r2 = r14.zzH()
            com.google.android.gms.internal.ads.zzaab r9 = r0.zzd
            int r9 = r9.zzc
            r15 = r1
            com.google.android.gms.internal.ads.zzyy r15 = (com.google.android.gms.internal.ads.zzyy) r15
            r15.zzm(r2, r4, r9, r4)
            com.google.android.gms.internal.ads.zzaab r2 = r0.zzd
            int r9 = r2.zza
            r9 = r9 & r8
            r10 = 36
            r11 = 21
            if (r9 == 0) goto L_0x003c
            int r2 = r2.zze
            if (r2 == r8) goto L_0x0043
            r2 = r10
            goto L_0x0044
        L_0x003c:
            int r2 = r2.zze
            if (r2 == r8) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r11 = 13
        L_0x0043:
            r2 = r11
        L_0x0044:
            int r9 = r14.zzd()
            int r11 = r2 + 4
            r12 = 1483304551(0x58696e67, float:1.02664153E15)
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            r8 = 1231971951(0x496e666f, float:976486.94)
            if (r9 < r11) goto L_0x0064
            r14.zzF(r2)
            int r9 = r14.zze()
            if (r9 == r12) goto L_0x0062
            if (r9 != r8) goto L_0x0064
            r11 = r8
            goto L_0x0078
        L_0x0062:
            r11 = r9
            goto L_0x0078
        L_0x0064:
            int r9 = r14.zzd()
            r11 = 40
            if (r9 < r11) goto L_0x0077
            r14.zzF(r10)
            int r9 = r14.zze()
            if (r9 != r13) goto L_0x0077
            r11 = r13
            goto L_0x0078
        L_0x0077:
            r11 = r4
        L_0x0078:
            if (r11 == r12) goto L_0x009a
            if (r11 != r8) goto L_0x007d
            goto L_0x009a
        L_0x007d:
            if (r11 != r13) goto L_0x0095
            long r9 = r17.zzd()
            long r11 = r17.zzf()
            com.google.android.gms.internal.ads.zzaab r13 = r0.zzd
            com.google.android.gms.internal.ads.zzaet r2 = com.google.android.gms.internal.ads.zzaet.zza(r9, r11, r13, r14)
            com.google.android.gms.internal.ads.zzaab r8 = r0.zzd
            int r8 = r8.zzc
            r15.zzo(r8, r4)
            goto L_0x00f7
        L_0x0095:
            r17.zzj()
            r2 = 0
            goto L_0x00f7
        L_0x009a:
            long r9 = r17.zzd()
            long r12 = r17.zzf()
            com.google.android.gms.internal.ads.zzaab r7 = r0.zzd
            r5 = r11
            r11 = r12
            r13 = r7
            com.google.android.gms.internal.ads.zzaeu r6 = com.google.android.gms.internal.ads.zzaeu.zza(r9, r11, r13, r14)
            if (r6 == 0) goto L_0x00e0
            com.google.android.gms.internal.ads.zzzx r7 = r0.zze
            boolean r7 = r7.zza()
            if (r7 != 0) goto L_0x00e0
            r17.zzj()
            int r2 = r2 + 141
            r15.zzl(r2, r4)
            com.google.android.gms.internal.ads.zzef r2 = r0.zzc
            byte[] r2 = r2.zzH()
            r7 = 3
            r15.zzm(r2, r4, r7, r4)
            com.google.android.gms.internal.ads.zzef r2 = r0.zzc
            r2.zzF(r4)
            com.google.android.gms.internal.ads.zzzx r2 = r0.zze
            com.google.android.gms.internal.ads.zzef r7 = r0.zzc
            int r7 = r7.zzm()
            int r9 = r7 >> 12
            r7 = r7 & 4095(0xfff, float:5.738E-42)
            if (r9 > 0) goto L_0x00dc
            if (r7 <= 0) goto L_0x00e0
        L_0x00dc:
            r2.zza = r9
            r2.zzb = r7
        L_0x00e0:
            com.google.android.gms.internal.ads.zzaab r2 = r0.zzd
            int r2 = r2.zzc
            r15.zzo(r2, r4)
            if (r6 == 0) goto L_0x00f6
            boolean r2 = r6.zzh()
            if (r2 != 0) goto L_0x00f6
            if (r5 != r8) goto L_0x00f6
            com.google.android.gms.internal.ads.zzaes r2 = r0.zzh(r1, r4)
            goto L_0x00f7
        L_0x00f6:
            r2 = r6
        L_0x00f7:
            com.google.android.gms.internal.ads.zzbq r5 = r0.zzl
            long r6 = r17.zzf()
            if (r5 == 0) goto L_0x0146
            int r8 = r5.zza()
            r9 = r4
        L_0x0104:
            if (r9 >= r8) goto L_0x0146
            com.google.android.gms.internal.ads.zzbp r10 = r5.zzb(r9)
            boolean r11 = r10 instanceof com.google.android.gms.internal.ads.zzadh
            if (r11 == 0) goto L_0x0143
            com.google.android.gms.internal.ads.zzadh r10 = (com.google.android.gms.internal.ads.zzadh) r10
            int r8 = r5.zza()
            r9 = r4
        L_0x0115:
            if (r9 >= r8) goto L_0x0139
            com.google.android.gms.internal.ads.zzbp r11 = r5.zzb(r9)
            boolean r12 = r11 instanceof com.google.android.gms.internal.ads.zzadl
            if (r12 == 0) goto L_0x0136
            com.google.android.gms.internal.ads.zzadl r11 = (com.google.android.gms.internal.ads.zzadl) r11
            java.lang.String r12 = r11.zzf
            java.lang.String r13 = "TLEN"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0136
            java.lang.String r5 = r11.zzb
            long r8 = java.lang.Long.parseLong(r5)
            long r8 = com.google.android.gms.internal.ads.zzen.zzv(r8)
            goto L_0x013e
        L_0x0136:
            int r9 = r9 + 1
            goto L_0x0115
        L_0x0139:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x013e:
            com.google.android.gms.internal.ads.zzaen r5 = com.google.android.gms.internal.ads.zzaen.zza(r6, r10, r8)
            goto L_0x0147
        L_0x0143:
            int r9 = r9 + 1
            goto L_0x0104
        L_0x0146:
            r5 = 0
        L_0x0147:
            boolean r6 = r0.zzr
            if (r6 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.zzaer r2 = new com.google.android.gms.internal.ads.zzaer
            r2.<init>()
            goto L_0x0162
        L_0x0151:
            if (r5 == 0) goto L_0x0155
            r2 = r5
            goto L_0x0158
        L_0x0155:
            if (r2 != 0) goto L_0x0158
            r2 = 0
        L_0x0158:
            if (r2 == 0) goto L_0x015e
            r2.zzh()
            goto L_0x0162
        L_0x015e:
            com.google.android.gms.internal.ads.zzaes r2 = r0.zzh(r1, r4)
        L_0x0162:
            r0.zzq = r2
            com.google.android.gms.internal.ads.zzzl r5 = r0.zzh
            r5.zzN(r2)
            com.google.android.gms.internal.ads.zzaap r2 = r0.zzj
            com.google.android.gms.internal.ads.zzad r5 = new com.google.android.gms.internal.ads.zzad
            r5.<init>()
            com.google.android.gms.internal.ads.zzaab r6 = r0.zzd
            java.lang.String r6 = r6.zzb
            r5.zzS(r6)
            r6 = 4096(0x1000, float:5.74E-42)
            r5.zzL(r6)
            com.google.android.gms.internal.ads.zzaab r6 = r0.zzd
            int r6 = r6.zze
            r5.zzw(r6)
            com.google.android.gms.internal.ads.zzaab r6 = r0.zzd
            int r6 = r6.zzd
            r5.zzT(r6)
            com.google.android.gms.internal.ads.zzzx r6 = r0.zze
            int r6 = r6.zza
            r5.zzC(r6)
            com.google.android.gms.internal.ads.zzzx r6 = r0.zze
            int r6 = r6.zzb
            r5.zzD(r6)
            com.google.android.gms.internal.ads.zzbq r6 = r0.zzl
            r5.zzM(r6)
            com.google.android.gms.internal.ads.zzaf r5 = r5.zzY()
            r2.zzk(r5)
            long r5 = r17.zzf()
            r0.zzo = r5
            goto L_0x01c3
        L_0x01ab:
            long r5 = r0.zzo
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x01c3
            long r7 = r17.zzf()
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x01c3
            r2 = r1
            com.google.android.gms.internal.ads.zzyy r2 = (com.google.android.gms.internal.ads.zzyy) r2
            long r5 = r5 - r7
            int r5 = (int) r5
            r2.zzo(r5, r4)
        L_0x01c3:
            int r2 = r0.zzp
            if (r2 != 0) goto L_0x022d
            r17.zzj()
            boolean r2 = r16.zzj(r17)
            if (r2 == 0) goto L_0x01d2
            goto L_0x023f
        L_0x01d2:
            com.google.android.gms.internal.ads.zzef r2 = r0.zzc
            r2.zzF(r4)
            com.google.android.gms.internal.ads.zzef r2 = r0.zzc
            int r2 = r2.zze()
            int r5 = r0.zzk
            long r5 = (long) r5
            boolean r5 = zzi(r2, r5)
            if (r5 == 0) goto L_0x0224
            int r5 = com.google.android.gms.internal.ads.zzaac.zzb(r2)
            if (r5 != r3) goto L_0x01ed
            goto L_0x0224
        L_0x01ed:
            com.google.android.gms.internal.ads.zzaab r5 = r0.zzd
            r5.zza(r2)
            long r5 = r0.zzm
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0209
            com.google.android.gms.internal.ads.zzaes r2 = r0.zzq
            long r5 = r17.zzf()
            long r5 = r2.zzc(r5)
            r0.zzm = r5
        L_0x0209:
            com.google.android.gms.internal.ads.zzaab r2 = r0.zzd
            int r5 = r2.zzc
            r0.zzp = r5
            com.google.android.gms.internal.ads.zzaes r6 = r0.zzq
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.zzaem
            if (r7 != 0) goto L_0x0217
            r2 = r5
            goto L_0x022d
        L_0x0217:
            com.google.android.gms.internal.ads.zzaem r6 = (com.google.android.gms.internal.ads.zzaem) r6
            long r3 = r0.zzn
            int r1 = r2.zzg
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.zzg(r3)
            r1 = 0
            throw r1
        L_0x0224:
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r5 = 1
            r1.zzo(r5, r4)
            r0.zzk = r4
            goto L_0x023e
        L_0x022d:
            r5 = 1
            com.google.android.gms.internal.ads.zzaap r6 = r0.zzj
            int r1 = r6.zze(r1, r2, r5)
            if (r1 != r3) goto L_0x0237
            goto L_0x023f
        L_0x0237:
            int r2 = r0.zzp
            int r2 = r2 - r1
            r0.zzp = r2
            if (r2 <= 0) goto L_0x0240
        L_0x023e:
            r3 = r4
        L_0x023f:
            return r3
        L_0x0240:
            com.google.android.gms.internal.ads.zzaap r5 = r0.zzj
            long r1 = r0.zzn
            long r6 = r0.zzg(r1)
            r8 = 1
            com.google.android.gms.internal.ads.zzaab r1 = r0.zzd
            int r9 = r1.zzc
            r10 = 0
            r11 = 0
            r5.zzs(r6, r8, r9, r10, r11)
            long r1 = r0.zzn
            com.google.android.gms.internal.ads.zzaab r3 = r0.zzd
            int r3 = r3.zzg
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.zzn = r1
            r0.zzp = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeq.zzf(com.google.android.gms.internal.ads.zzzj):int");
    }

    private final long zzg(long j) {
        return this.zzm + ((j * 1000000) / ((long) this.zzd.zzd));
    }

    private final zzaes zzh(zzzj zzzj, boolean z) throws IOException {
        ((zzyy) zzzj).zzm(this.zzc.zzH(), 0, 4, false);
        this.zzc.zzF(0);
        this.zzd.zza(this.zzc.zze());
        return new zzael(zzzj.zzd(), zzzj.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    private final boolean zzj(zzzj zzzj) throws IOException {
        zzaes zzaes = this.zzq;
        if (zzaes != null) {
            long zzb2 = zzaes.zzb();
            if (zzb2 != -1 && zzzj.zze() > zzb2 - 4) {
                return true;
            }
        }
        try {
            return !zzzj.zzm(this.zzc.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzzj zzzj, boolean z) throws IOException {
        int i;
        int i2;
        int zzb2;
        int i3 = true != z ? 131072 : 32768;
        zzzj.zzj();
        if (zzzj.zzf() == 0) {
            zzbq zza2 = this.zzf.zza(zzzj, (zzada) null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i2 = (int) zzzj.zze();
            if (!z) {
                ((zzyy) zzzj).zzo(i2, false);
            }
            i = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = i;
        int i5 = i4;
        while (true) {
            if (!zzj(zzzj)) {
                this.zzc.zzF(0);
                int zze2 = this.zzc.zze();
                if ((i == 0 || zzi(zze2, (long) i)) && (zzb2 = zzaac.zzb(zze2)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zze2);
                        i = zze2;
                    }
                    ((zzyy) zzzj).zzl(zzb2 - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            zzzj.zzj();
                            ((zzyy) zzzj).zzl(i2 + i6, false);
                        } else {
                            ((zzyy) zzzj).zzo(1, false);
                        }
                        i4 = 0;
                        i5 = i6;
                        i = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw zzbu.zza("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzyy) zzzj).zzo(i2 + i5, false);
        } else {
            zzzj.zzj();
        }
        this.zzk = i;
        return true;
    }

    public final int zza(zzzj zzzj, zzaai zzaai) throws IOException {
        zzdd.zzb(this.zzi);
        int i = zzen.zza;
        int zzf2 = zzf(zzzj);
        if (zzf2 == -1 && (this.zzq instanceof zzaem)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                zzaem zzaem = (zzaem) this.zzq;
                throw null;
            }
        }
        return zzf2;
    }

    public final void zzb(zzzl zzzl) {
        this.zzh = zzzl;
        zzaap zzv = zzzl.zzv(0, 1);
        this.zzi = zzv;
        this.zzj = zzv;
        this.zzh.zzC();
    }

    public final void zzc(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0;
        this.zzp = 0;
        zzaes zzaes = this.zzq;
        if (zzaes instanceof zzaem) {
            zzaem zzaem = (zzaem) zzaes;
            throw null;
        }
    }

    public final boolean zzd(zzzj zzzj) throws IOException {
        return zzk(zzzj, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzaeq(int i) {
        this.zzc = new zzef(10);
        this.zzd = new zzaab();
        this.zze = new zzzx();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzzz();
        zzzh zzzh = new zzzh();
        this.zzg = zzzh;
        this.zzj = zzzh;
    }
}
