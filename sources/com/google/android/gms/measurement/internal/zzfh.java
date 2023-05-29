package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzfh implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzfi zzb;

    zzfh(zzfi zzfi, boolean z) {
        this.zzb = zzfi;
        this.zza = z;
    }

    public final void run() {
        this.zzb.zzb.zzI(this.zza);
    }
}
