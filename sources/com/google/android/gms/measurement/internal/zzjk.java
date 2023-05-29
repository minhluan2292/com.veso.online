package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjk implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzcf zzb;
    final /* synthetic */ zzke zzc;

    zzjk(zzke zzke, zzq zzq, zzcf zzcf) {
        this.zzc = zzke;
        this.zza = zzq;
        this.zzb = zzcf;
    }

    public final void run() {
        zzgk zzgk;
        String str = null;
        try {
            if (!this.zzc.zzs.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                this.zzc.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzs.zzq().zzP((String) null);
                this.zzc.zzs.zzm().zze.zzb((String) null);
                zzgk = this.zzc.zzs;
            } else {
                zzke zzke = this.zzc;
                zzeq zzh = zzke.zzb;
                if (zzh == null) {
                    zzke.zzs.zzay().zzd().zza("Failed to get app instance id");
                    zzgk = this.zzc.zzs;
                } else {
                    Preconditions.checkNotNull(this.zza);
                    str = zzh.zzd(this.zza);
                    if (str != null) {
                        this.zzc.zzs.zzq().zzP(str);
                        this.zzc.zzs.zzm().zze.zzb(str);
                    }
                    this.zzc.zzQ();
                    zzgk = this.zzc.zzs;
                }
            }
        } catch (RemoteException e) {
            this.zzc.zzs.zzay().zzd().zzb("Failed to get app instance id", e);
            zzgk = this.zzc.zzs;
        } catch (Throwable th) {
            this.zzc.zzs.zzv().zzV(this.zzb, (String) null);
            throw th;
        }
        zzgk.zzv().zzV(this.zzb, str);
    }
}
