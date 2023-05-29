package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzkm implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzku zzb;

    zzkm(zzku zzku, long j) {
        this.zzb = zzku;
        this.zza = j;
    }

    public final void run() {
        zzku.zzl(this.zzb, this.zza);
    }
}
