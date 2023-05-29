package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzgm implements Runnable {
    final /* synthetic */ zzac zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzhc zzc;

    zzgm(zzhc zzhc, zzac zzac, zzq zzq) {
        this.zzc = zzhc;
        this.zza = zzac;
        this.zzb = zzq;
    }

    public final void run() {
        this.zzc.zza.zzA();
        if (this.zza.zzc.zza() == null) {
            this.zzc.zza.zzN(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzT(this.zza, this.zzb);
        }
    }
}
