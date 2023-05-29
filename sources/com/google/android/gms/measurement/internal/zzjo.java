package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjo extends zzap {
    final /* synthetic */ zzke zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzjo(zzke zzke, zzhf zzhf) {
        super(zzhf);
        this.zza = zzke;
    }

    public final void zzc() {
        zzke zzke = this.zza;
        zzke.zzg();
        if (zzke.zzL()) {
            zzke.zzs.zzay().zzj().zza("Inactivity, disconnecting from the service");
            zzke.zzs();
        }
    }
}
