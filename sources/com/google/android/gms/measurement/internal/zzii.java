package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzii implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzip zzb;

    zzii(zzip zzip, Boolean bool) {
        this.zzb = zzip;
        this.zza = bool;
    }

    public final void run() {
        this.zzb.zzad(this.zza, true);
    }
}
