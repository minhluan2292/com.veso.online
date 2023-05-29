package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzkp implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzkq zzc;

    zzkp(zzkq zzkq, long j, long j2) {
        this.zzc = zzkq;
        this.zza = j;
        this.zzb = j2;
    }

    public final void run() {
        this.zzc.zza.zzs.zzaz().zzp(new zzko(this));
    }
}
