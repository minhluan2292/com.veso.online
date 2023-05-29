package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjt implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaw zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzke zze;

    zzjt(zzke zzke, boolean z, zzq zzq, boolean z2, zzaw zzaw, String str) {
        this.zze = zzke;
        this.zza = zzq;
        this.zzb = z2;
        this.zzc = zzaw;
        this.zzd = str;
    }

    public final void run() {
        zzaw zzaw;
        zzke zzke = this.zze;
        zzeq zzh = zzke.zzb;
        if (zzh == null) {
            zzke.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzke zzke2 = this.zze;
        if (this.zzb) {
            zzaw = null;
        } else {
            zzaw = this.zzc;
        }
        zzke2.zzD(zzh, zzaw, this.zza);
        this.zze.zzQ();
    }
}
