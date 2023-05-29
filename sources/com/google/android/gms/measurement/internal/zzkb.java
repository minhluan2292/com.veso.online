package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzkb implements Runnable {
    final /* synthetic */ zzkd zza;

    zzkb(zzkd zzkd) {
        this.zza = zzkd;
    }

    public final void run() {
        zzke zzke = this.zza.zza;
        Context zzau = zzke.zzs.zzau();
        this.zza.zza.zzs.zzaw();
        zzke.zzo(zzke, new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
