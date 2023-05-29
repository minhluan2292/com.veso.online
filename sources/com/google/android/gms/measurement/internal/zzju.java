package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzju implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzac zzc;
    final /* synthetic */ zzac zzd;
    final /* synthetic */ zzke zze;

    zzju(zzke zzke, boolean z, zzq zzq, boolean z2, zzac zzac, zzac zzac2) {
        this.zze = zzke;
        this.zza = zzq;
        this.zzb = z2;
        this.zzc = zzac;
        this.zzd = zzac2;
    }

    public final void run() {
        zzac zzac;
        zzke zzke = this.zze;
        zzeq zzh = zzke.zzb;
        if (zzh == null) {
            zzke.zzs.zzay().zzd().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzke zzke2 = this.zze;
        if (this.zzb) {
            zzac = null;
        } else {
            zzac = this.zzc;
        }
        zzke2.zzD(zzh, zzac, this.zza);
        this.zze.zzQ();
    }
}
