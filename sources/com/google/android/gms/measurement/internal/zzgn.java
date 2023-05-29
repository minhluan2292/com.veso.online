package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzgn implements Runnable {
    final /* synthetic */ zzac zza;
    final /* synthetic */ zzhc zzb;

    zzgn(zzhc zzhc, zzac zzac) {
        this.zzb = zzhc;
        this.zza = zzac;
    }

    public final void run() {
        this.zzb.zza.zzA();
        if (this.zza.zzc.zza() == null) {
            this.zzb.zza.zzM(this.zza);
        } else {
            this.zzb.zza.zzS(this.zza);
        }
    }
}
