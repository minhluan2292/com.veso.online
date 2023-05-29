package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzgu implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzhc zzb;

    zzgu(zzhc zzhc, zzq zzq) {
        this.zzb = zzhc;
        this.zza = zzq;
    }

    public final void run() {
        this.zzb.zza.zzA();
        zzll zzc = this.zzb.zza;
        zzq zzq = this.zza;
        zzc.zzaz().zzg();
        zzc.zzB();
        Preconditions.checkNotEmpty(zzq.zza);
        zzai zzb2 = zzai.zzb(zzq.zzv);
        zzai zzh = zzc.zzh(zzq.zza);
        zzc.zzay().zzj().zzc("Setting consent, package, consent", zzq.zza, zzb2);
        zzc.zzU(zzq.zza, zzb2);
        if (zzb2.zzk(zzh)) {
            zzc.zzP(zzq);
        }
    }
}
