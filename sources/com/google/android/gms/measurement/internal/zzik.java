package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzik implements Runnable {
    final /* synthetic */ zzai zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzai zze;
    final /* synthetic */ zzip zzf;

    zzik(zzip zzip, zzai zzai, int i, long j, boolean z, zzai zzai2) {
        this.zzf = zzip;
        this.zza = zzai;
        this.zzb = i;
        this.zzc = j;
        this.zzd = z;
        this.zze = zzai2;
    }

    public final void run() {
        this.zzf.zzX(this.zza);
        zzip.zzw(this.zzf, this.zza, this.zzb, this.zzc, false, this.zzd);
        zzps.zzc();
        if (this.zzf.zzs.zzf().zzs((String) null, zzen.zzaI)) {
            zzip.zzv(this.zzf, this.zza, this.zze);
        }
    }
}
