package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjp implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcf zzc;
    final /* synthetic */ zzke zzd;

    zzjp(zzke zzke, zzaw zzaw, String str, zzcf zzcf) {
        this.zzd = zzke;
        this.zza = zzaw;
        this.zzb = str;
        this.zzc = zzcf;
    }

    public final void run() {
        zzgk zzgk;
        byte[] bArr = null;
        try {
            zzke zzke = this.zzd;
            zzeq zzh = zzke.zzb;
            if (zzh == null) {
                zzke.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                zzgk = this.zzd.zzs;
            } else {
                bArr = zzh.zzu(this.zza, this.zzb);
                this.zzd.zzQ();
                zzgk = this.zzd.zzs;
            }
        } catch (RemoteException e) {
            this.zzd.zzs.zzay().zzd().zzb("Failed to send event to the service to bundle", e);
            zzgk = this.zzd.zzs;
        } catch (Throwable th) {
            this.zzd.zzs.zzv().zzS(this.zzc, bArr);
            throw th;
        }
        zzgk.zzv().zzS(this.zzc, bArr);
    }
}
