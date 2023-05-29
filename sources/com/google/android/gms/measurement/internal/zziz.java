package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zziz implements Runnable {
    final /* synthetic */ zziw zza;
    final /* synthetic */ zziw zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzje zze;

    zziz(zzje zzje, zziw zziw, zziw zziw2, long j, boolean z) {
        this.zze = zzje;
        this.zza = zziw;
        this.zzb = zziw2;
        this.zzc = j;
        this.zzd = z;
    }

    public final void run() {
        this.zze.zzB(this.zza, this.zzb, this.zzc, this.zzd, (Bundle) null);
    }
}
