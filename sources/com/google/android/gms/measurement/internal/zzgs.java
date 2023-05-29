package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzgs implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzhc zzb;

    zzgs(zzhc zzhc, zzq zzq) {
        this.zzb = zzhc;
        this.zza = zzq;
    }

    public final void run() {
        this.zzb.zza.zzA();
        this.zzb.zza.zzP(this.zza);
    }
}
