package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzjf implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzcf zze;
    final /* synthetic */ zzke zzf;

    zzjf(zzke zzke, String str, String str2, zzq zzq, boolean z, zzcf zzcf) {
        this.zzf = zzke;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzq;
        this.zzd = z;
        this.zze = zzcf;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            zzke zzke = this.zzf;
            zzeq zzh = zzke.zzb;
            if (zzh == null) {
                zzke.zzs.zzay().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                this.zzf.zzs.zzv().zzR(this.zze, bundle2);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            List<zzlo> zzh2 = zzh.zzh(this.zza, this.zzb, this.zzd, this.zzc);
            bundle = new Bundle();
            if (zzh2 != null) {
                for (zzlo zzlo : zzh2) {
                    String str = zzlo.zze;
                    if (str != null) {
                        bundle.putString(zzlo.zzb, str);
                    } else {
                        Long l = zzlo.zzd;
                        if (l != null) {
                            bundle.putLong(zzlo.zzb, l.longValue());
                        } else {
                            Double d = zzlo.zzg;
                            if (d != null) {
                                bundle.putDouble(zzlo.zzb, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.zzf.zzQ();
                this.zzf.zzs.zzv().zzR(this.zze, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.zzf.zzs.zzay().zzd().zzc("Failed to get user properties; remote exception", this.zza, e);
                    this.zzf.zzs.zzv().zzR(this.zze, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.zzf.zzs.zzv().zzR(this.zze, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.zzf.zzs.zzay().zzd().zzc("Failed to get user properties; remote exception", this.zza, e);
            this.zzf.zzs.zzv().zzR(this.zze, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.zzf.zzs.zzv().zzR(this.zze, bundle2);
            throw th;
        }
    }
}
