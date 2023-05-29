package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjy implements Runnable {
    final /* synthetic */ zzeq zza;
    final /* synthetic */ zzkd zzb;

    zzjy(zzkd zzkd, zzeq zzeq) {
        this.zzb = zzkd;
        this.zza = zzeq;
    }

    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzs.zzay().zzj().zza("Connected to service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
