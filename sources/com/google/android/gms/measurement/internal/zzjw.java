package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjw implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ zzcf zzd;
    final /* synthetic */ zzke zze;

    zzjw(zzke zzke, String str, String str2, zzq zzq, zzcf zzcf) {
        this.zze = zzke;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzq;
        this.zzd = zzcf;
    }

    public final void run() {
        zzgk zzgk;
        ArrayList arrayList = new ArrayList();
        try {
            zzke zzke = this.zze;
            zzeq zzh = zzke.zzb;
            if (zzh == null) {
                zzke.zzs.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                zzgk = this.zze.zzs;
            } else {
                Preconditions.checkNotNull(this.zzc);
                arrayList = zzlt.zzH(zzh.zzf(this.zza, this.zzb, this.zzc));
                this.zze.zzQ();
                zzgk = this.zze.zzs;
            }
        } catch (RemoteException e) {
            this.zze.zzs.zzay().zzd().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e);
            zzgk = this.zze.zzs;
        } catch (Throwable th) {
            this.zze.zzs.zzv().zzQ(this.zzd, arrayList);
            throw th;
        }
        zzgk.zzv().zzQ(this.zzd, arrayList);
    }
}
