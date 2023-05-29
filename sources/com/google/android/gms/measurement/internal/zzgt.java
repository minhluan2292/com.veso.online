package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzgt implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzhc zzb;

    zzgt(zzhc zzhc, zzq zzq) {
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
        zzc.zzd(zzq);
    }
}
