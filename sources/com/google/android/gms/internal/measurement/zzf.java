package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final class zzf {
    final zzax zza;
    final zzg zzb;
    final zzg zzc;
    final zzj zzd;

    public zzf() {
        zzax zzax = new zzax();
        this.zza = zzax;
        zzg zzg = new zzg((zzg) null, zzax);
        this.zzc = zzg;
        this.zzb = zzg.zza();
        zzj zzj = new zzj();
        this.zzd = zzj;
        zzg.zzg("require", new zzw(zzj));
        zzj.zza("internal.platform", zze.zza);
        zzg.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    public final zzap zza(zzg zzg, zzgx... zzgxArr) {
        zzap zzap = zzap.zzf;
        for (zzgx zza2 : zzgxArr) {
            zzap = zzi.zza(zza2);
            zzh.zzc(this.zzc);
            if ((zzap instanceof zzaq) || (zzap instanceof zzao)) {
                zzap = this.zza.zza(zzg, zzap);
            }
        }
        return zzap;
    }
}
