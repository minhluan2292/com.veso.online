package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjr implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzke zzb;

    zzjr(zzke zzke, zzq zzq) {
        this.zzb = zzke;
        this.zza = zzq;
    }

    public final void run() {
        zzke zzke = this.zzb;
        zzeq zzh = zzke.zzb;
        if (zzh == null) {
            zzke.zzs.zzay().zzd().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzh.zzs(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}
