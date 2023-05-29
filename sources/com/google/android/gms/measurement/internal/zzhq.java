package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
public final /* synthetic */ class zzhq implements Runnable {
    public final /* synthetic */ zzip zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzhq(zzip zzip, String str) {
        this.zza = zzip;
        this.zzb = str;
    }

    public final void run() {
        zzip zzip = this.zza;
        if (zzip.zzs.zzh().zzp(this.zzb)) {
            zzip.zzs.zzh().zzo();
        }
    }
}
