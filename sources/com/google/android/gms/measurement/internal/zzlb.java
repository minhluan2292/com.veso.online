package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzlb implements Runnable {
    final /* synthetic */ zzlm zza;
    final /* synthetic */ zzll zzb;

    zzlb(zzll zzll, zzlm zzlm) {
        this.zzb = zzll;
        this.zza = zzlm;
    }

    public final void run() {
        zzll.zzy(this.zzb, this.zza);
        this.zzb.zzR();
    }
}
