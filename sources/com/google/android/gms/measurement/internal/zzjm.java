package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjm implements Runnable {
    final /* synthetic */ zziw zza;
    final /* synthetic */ zzke zzb;

    zzjm(zzke zzke, zziw zziw) {
        this.zzb = zzke;
        this.zza = zziw;
    }

    public final void run() {
        zzke zzke = this.zzb;
        zzeq zzh = zzke.zzb;
        if (zzh == null) {
            zzke.zzs.zzay().zzd().zza("Failed to send current screen to service");
            return;
        }
        try {
            zziw zziw = this.zza;
            if (zziw == null) {
                zzh.zzq(0, (String) null, (String) null, zzke.zzs.zzau().getPackageName());
            } else {
                zzh.zzq(zziw.zzc, zziw.zza, zziw.zzb, zzke.zzs.zzau().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send current screen to the service", e);
        }
    }
}
