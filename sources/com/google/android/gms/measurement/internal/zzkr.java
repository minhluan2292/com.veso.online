package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzkr extends zzap {
    final /* synthetic */ zzks zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzkr(zzks zzks, zzhf zzhf) {
        super(zzhf);
        this.zza = zzks;
    }

    public final void zzc() {
        zzks zzks = this.zza;
        zzks.zzc.zzg();
        zzks.zzd(false, false, zzks.zzc.zzs.zzav().elapsedRealtime());
        zzks.zzc.zzs.zzd().zzf(zzks.zzc.zzs.zzav().elapsedRealtime());
    }
}
