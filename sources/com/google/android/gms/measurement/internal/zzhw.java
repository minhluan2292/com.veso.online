package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzhw implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzip zzc;

    zzhw(zzip zzip, AtomicReference atomicReference, boolean z) {
        this.zzc = zzip;
        this.zza = atomicReference;
        this.zzb = z;
    }

    public final void run() {
        this.zzc.zzs.zzt().zzx(this.zza, this.zzb);
    }
}
