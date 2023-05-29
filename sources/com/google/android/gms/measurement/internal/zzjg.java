package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjg implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlo zzc;
    final /* synthetic */ zzke zzd;

    zzjg(zzke zzke, zzq zzq, boolean z, zzlo zzlo) {
        this.zzd = zzke;
        this.zza = zzq;
        this.zzb = z;
        this.zzc = zzlo;
    }

    public final void run() {
        zzlo zzlo;
        zzke zzke = this.zzd;
        zzeq zzh = zzke.zzb;
        if (zzh == null) {
            zzke.zzs.zzay().zzd().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzke zzke2 = this.zzd;
        if (this.zzb) {
            zzlo = null;
        } else {
            zzlo = this.zzc;
        }
        zzke2.zzD(zzh, zzlo, this.zza);
        this.zzd.zzQ();
    }
}
