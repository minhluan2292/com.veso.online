package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjc implements Runnable {
    final /* synthetic */ zziw zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzje zzc;

    zzjc(zzje zzje, zziw zziw, long j) {
        this.zzc = zzje;
        this.zza = zziw;
        this.zzb = j;
    }

    public final void run() {
        this.zzc.zzC(this.zza, false, this.zzb);
        zzje zzje = this.zzc;
        zzje.zza = null;
        zzje.zzs.zzt().zzG((zziw) null);
    }
}
