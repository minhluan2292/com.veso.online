package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzka implements Runnable {
    final /* synthetic */ zzeq zza;
    final /* synthetic */ zzkd zzb;

    zzka(zzkd zzkd, zzeq zzeq) {
        this.zzb = zzkd;
        this.zza = zzeq;
    }

    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzs.zzay().zzc().zza("Connected to remote service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
