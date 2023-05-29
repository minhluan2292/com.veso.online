package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzij implements Runnable {
    final /* synthetic */ zzai zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzai zzf;
    final /* synthetic */ zzip zzg;

    zzij(zzip zzip, zzai zzai, long j, int i, long j2, boolean z, zzai zzai2) {
        this.zzg = zzip;
        this.zza = zzai;
        this.zzb = j;
        this.zzc = i;
        this.zzd = j2;
        this.zze = z;
        this.zzf = zzai2;
    }

    public final void run() {
        this.zzg.zzX(this.zza);
        this.zzg.zzM(this.zzb, false);
        zzip.zzw(this.zzg, this.zza, this.zzc, this.zzd, true, this.zze);
        zzps.zzc();
        if (this.zzg.zzs.zzf().zzs((String) null, zzen.zzaI)) {
            zzip.zzv(this.zzg, this.zza, this.zzf);
        }
    }
}
