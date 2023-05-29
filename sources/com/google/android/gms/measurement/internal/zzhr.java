package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
public final /* synthetic */ class zzhr implements Runnable {
    public final /* synthetic */ zzip zza;

    public /* synthetic */ zzhr(zzip zzip) {
        this.zza = zzip;
    }

    public final void run() {
        zzip zzip = this.zza;
        zzip.zzg();
        if (!zzip.zzs.zzm().zzm.zzb()) {
            long zza2 = zzip.zzs.zzm().zzn.zza();
            zzip.zzs.zzm().zzn.zzb(1 + zza2);
            zzip.zzs.zzf();
            if (zza2 >= 5) {
                zzip.zzs.zzay().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                zzip.zzs.zzm().zzm.zza(true);
                return;
            }
            zzip.zzs.zzE();
            return;
        }
        zzip.zzs.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
