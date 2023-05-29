package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzkq {
    final /* synthetic */ zzku zza;
    private zzkp zzb;

    zzkq(zzku zzku) {
        this.zza = zzku;
    }

    /* access modifiers changed from: package-private */
    public final void zza(long j) {
        this.zzb = new zzkp(this, this.zza.zzs.zzav().currentTimeMillis(), j);
        this.zza.zzd.postDelayed(this.zzb, 2000);
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        this.zza.zzg();
        zzkp zzkp = this.zzb;
        if (zzkp != null) {
            this.zza.zzd.removeCallbacks(zzkp);
        }
        this.zza.zzs.zzm().zzl.zza(false);
    }
}
