package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzgv implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzhc zzc;

    zzgv(zzhc zzhc, zzaw zzaw, zzq zzq) {
        this.zzc = zzhc;
        this.zza = zzaw;
        this.zzb = zzq;
    }

    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
