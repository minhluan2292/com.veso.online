package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzgy implements Runnable {
    final /* synthetic */ zzlo zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzhc zzc;

    zzgy(zzhc zzhc, zzlo zzlo, zzq zzq) {
        this.zzc = zzhc;
        this.zza = zzlo;
        this.zzb = zzq;
    }

    public final void run() {
        this.zzc.zza.zzA();
        if (this.zza.zza() == null) {
            this.zzc.zza.zzO(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzV(this.zza, this.zzb);
        }
    }
}
