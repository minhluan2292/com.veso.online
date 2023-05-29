package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjz implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzkd zzb;

    zzjz(zzkd zzkd, ComponentName componentName) {
        this.zzb = zzkd;
        this.zza = componentName;
    }

    public final void run() {
        zzke.zzo(this.zzb.zza, this.zza);
    }
}
