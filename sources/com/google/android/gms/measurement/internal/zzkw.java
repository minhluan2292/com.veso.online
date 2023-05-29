package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzkw extends zzap {
    final /* synthetic */ zzkx zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzkw(zzkx zzkx, zzhf zzhf) {
        super(zzhf);
        this.zza = zzkx;
    }

    public final void zzc() {
        this.zza.zza();
        this.zza.zzs.zzay().zzj().zza("Starting upload from DelayedRunnable");
        this.zza.zzf.zzW();
    }
}
