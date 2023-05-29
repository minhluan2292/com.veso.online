package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjb implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzje zzb;

    zzjb(zzje zzje, long j) {
        this.zzb = zzje;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzs.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
