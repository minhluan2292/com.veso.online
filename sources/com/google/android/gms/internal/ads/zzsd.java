package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzsd extends zzrr {
    private final zzsk zza;
    private final boolean zzb;
    private final zzcm zzc;
    private final zzck zzd;
    private zzsb zze;
    private zzsa zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzsd(zzsk zzsk, boolean z) {
        boolean z2;
        this.zza = zzsk;
        if (z) {
            zzsk.zzu();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzcm();
        this.zzd = new zzck();
        zzsk.zzG();
        this.zze = zzsb.zzq(zzsk.zzz());
    }

    private final Object zzE(Object obj) {
        return (this.zze.zzf == null || !obj.equals(zzsb.zzd)) ? obj : this.zze.zzf;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzF(long j) {
        zzsa zzsa = this.zzf;
        int zza2 = this.zze.zza(zzsa.zza.zza);
        if (zza2 != -1) {
            zzsb zzsb = this.zze;
            zzck zzck = this.zzd;
            zzsb.zzd(zza2, zzck, false);
            long j2 = zzck.zze;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            zzsa.zzs(j);
        }
    }

    public final zzcn zzA() {
        return this.zze;
    }

    public final void zzB(zzsg zzsg) {
        ((zzsa) zzsg).zzt();
        if (zzsg == this.zzf) {
            this.zzf = null;
        }
    }

    /* renamed from: zzC */
    public final zzsa zzD(zzsi zzsi, zzwi zzwi, long j) {
        zzsa zzsa = new zzsa(zzsi, zzwi, j, (byte[]) null);
        zzsa.zzu(this.zza);
        if (this.zzh) {
            zzsa.zzr(zzsi.zzc(zzE(zzsi.zza)));
        } else {
            this.zzf = zzsa;
            if (!this.zzg) {
                this.zzg = true;
                zzy((Object) null, this.zza);
            }
        }
        return zzsa;
    }

    public final void zzn(zzfz zzfz) {
        super.zzn(zzfz);
        if (!this.zzb) {
            this.zzg = true;
            zzy((Object) null, this.zza);
        }
    }

    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ zzsi zzv(Object obj, zzsi zzsi) {
        Void voidR = (Void) obj;
        Object obj2 = zzsi.zza;
        if (this.zze.zzf != null && this.zze.zzf.equals(obj2)) {
            obj2 = zzsb.zzd;
        }
        return zzsi.zzc(obj2);
    }

    public final void zzw() {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void zzx(java.lang.Object r13, com.google.android.gms.internal.ads.zzsk r14, com.google.android.gms.internal.ads.zzcn r15) {
        /*
            r12 = this;
            java.lang.Void r13 = (java.lang.Void) r13
            boolean r13 = r12.zzh
            r14 = 0
            if (r13 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzsb r13 = r12.zze
            com.google.android.gms.internal.ads.zzsb r13 = r13.zzp(r15)
            r12.zze = r13
            com.google.android.gms.internal.ads.zzsa r13 = r12.zzf
            if (r13 == 0) goto L_0x009d
            long r0 = r13.zzn()
            r12.zzF(r0)
            goto L_0x009d
        L_0x001c:
            boolean r13 = r15.zzo()
            if (r13 == 0) goto L_0x0038
            boolean r13 = r12.zzi
            if (r13 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzsb r13 = r12.zze
            com.google.android.gms.internal.ads.zzsb r13 = r13.zzp(r15)
            goto L_0x0035
        L_0x002d:
            java.lang.Object r13 = com.google.android.gms.internal.ads.zzcm.zza
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzsb.zzd
            com.google.android.gms.internal.ads.zzsb r13 = com.google.android.gms.internal.ads.zzsb.zzr(r15, r13, r0)
        L_0x0035:
            r12.zze = r13
            goto L_0x009d
        L_0x0038:
            com.google.android.gms.internal.ads.zzcm r13 = r12.zzc
            r0 = 0
            r1 = 0
            r15.zze(r0, r13, r1)
            com.google.android.gms.internal.ads.zzcm r13 = r12.zzc
            java.lang.Object r13 = r13.zzc
            com.google.android.gms.internal.ads.zzsa r3 = r12.zzf
            if (r3 == 0) goto L_0x0064
            long r4 = r3.zzq()
            com.google.android.gms.internal.ads.zzsb r6 = r12.zze
            com.google.android.gms.internal.ads.zzsi r3 = r3.zza
            java.lang.Object r3 = r3.zza
            com.google.android.gms.internal.ads.zzck r7 = r12.zzd
            r6.zzn(r3, r7)
            com.google.android.gms.internal.ads.zzsb r3 = r12.zze
            com.google.android.gms.internal.ads.zzcm r6 = r12.zzc
            r3.zze(r0, r6, r1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            r10 = r4
            goto L_0x0065
        L_0x0064:
            r10 = r1
        L_0x0065:
            com.google.android.gms.internal.ads.zzcm r7 = r12.zzc
            com.google.android.gms.internal.ads.zzck r8 = r12.zzd
            r9 = 0
            r6 = r15
            android.util.Pair r0 = r6.zzl(r7, r8, r9, r10)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r12.zzi
            if (r0 == 0) goto L_0x0084
            com.google.android.gms.internal.ads.zzsb r13 = r12.zze
            com.google.android.gms.internal.ads.zzsb r13 = r13.zzp(r15)
            goto L_0x0088
        L_0x0084:
            com.google.android.gms.internal.ads.zzsb r13 = com.google.android.gms.internal.ads.zzsb.zzr(r15, r13, r1)
        L_0x0088:
            r12.zze = r13
            com.google.android.gms.internal.ads.zzsa r13 = r12.zzf
            if (r13 == 0) goto L_0x009d
            r12.zzF(r2)
            com.google.android.gms.internal.ads.zzsi r13 = r13.zza
            java.lang.Object r14 = r13.zza
            java.lang.Object r14 = r12.zzE(r14)
            com.google.android.gms.internal.ads.zzsi r14 = r13.zzc(r14)
        L_0x009d:
            r13 = 1
            r12.zzi = r13
            r12.zzh = r13
            com.google.android.gms.internal.ads.zzsb r13 = r12.zze
            r12.zzo(r13)
            if (r14 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.zzsa r13 = r12.zzf
            java.util.Objects.requireNonNull(r13)
            r13.zzr(r14)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsd.zzx(java.lang.Object, com.google.android.gms.internal.ads.zzsk, com.google.android.gms.internal.ads.zzcn):void");
    }

    public final zzbg zzz() {
        return this.zza.zzz();
    }
}
