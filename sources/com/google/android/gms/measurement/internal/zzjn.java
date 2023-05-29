package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjn implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzke zzc;

    zzjn(zzke zzke, zzq zzq, Bundle bundle) {
        this.zzc = zzke;
        this.zza = zzq;
        this.zzb = bundle;
    }

    public final void run() {
        zzke zzke = this.zzc;
        zzeq zzh = zzke.zzb;
        if (zzh == null) {
            zzke.zzs.zzay().zzd().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzh.zzr(this.zzb, this.zza);
        } catch (RemoteException e) {
            this.zzc.zzs.zzay().zzd().zzb("Failed to send default event parameters to service", e);
        }
    }
}
