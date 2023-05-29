package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzha implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzhc zzb;

    zzha(zzhc zzhc, zzq zzq) {
        this.zzb = zzhc;
        this.zza = zzq;
    }

    public final void run() {
        this.zzb.zza.zzA();
        this.zzb.zza.zzK(this.zza);
    }
}
