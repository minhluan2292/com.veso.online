package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzgj implements Runnable {
    final /* synthetic */ zzhn zza;
    final /* synthetic */ zzgk zzb;

    zzgj(zzgk zzgk, zzhn zzhn) {
        this.zzb = zzgk;
        this.zza = zzhn;
    }

    public final void run() {
        zzgk.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}
