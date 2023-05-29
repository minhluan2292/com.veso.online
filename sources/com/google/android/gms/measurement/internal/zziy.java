package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zziy implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zziw zzb;
    final /* synthetic */ zziw zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzje zze;

    zziy(zzje zzje, Bundle bundle, zziw zziw, zziw zziw2, long j) {
        this.zze = zzje;
        this.zza = bundle;
        this.zzb = zziw;
        this.zzc = zziw2;
        this.zzd = j;
    }

    public final void run() {
        zzje.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
