package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjs implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzke zzb;

    zzjs(zzke zzke, zzq zzq) {
        this.zzb = zzke;
        this.zza = zzq;
    }

    public final void run() {
        zzke zzke = this.zzb;
        zzeq zzh = zzke.zzb;
        if (zzh == null) {
            zzke.zzs.zzay().zzd().zza("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzh.zzp(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send consent settings to the service", e);
        }
    }
}
