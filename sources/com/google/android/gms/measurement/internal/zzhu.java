package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzhu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ String zzh;
    final /* synthetic */ zzip zzi;

    zzhu(zzip zzip, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.zzi = zzip;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = bundle;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        this.zzh = str3;
    }

    public final void run() {
        this.zzi.zzJ(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
