package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzht implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzip zzb;

    zzht(zzip zzip, long j) {
        this.zzb = zzip;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzs.zzm().zzf.zzb(this.zza);
        this.zzb.zzs.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
