package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzkj implements Runnable {
    final /* synthetic */ zzll zza;
    final /* synthetic */ Runnable zzb;

    zzkj(zzkl zzkl, zzll zzll, Runnable runnable) {
        this.zza = zzll;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzA();
        this.zza.zzz(this.zzb);
        this.zza.zzW();
    }
}
