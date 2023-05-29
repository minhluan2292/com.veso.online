package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzao implements Runnable {
    final /* synthetic */ zzhf zza;
    final /* synthetic */ zzap zzb;

    zzao(zzap zzap, zzhf zzhf) {
        this.zzb = zzap;
        this.zza = zzhf;
    }

    public final void run() {
        this.zza.zzaw();
        if (zzab.zza()) {
            this.zza.zzaz().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0;
        if (zze) {
            this.zzb.zzc();
        }
    }
}
