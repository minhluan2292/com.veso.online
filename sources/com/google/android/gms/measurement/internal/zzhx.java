package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzhx implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzip zzb;

    zzhx(zzip zzip, long j) {
        this.zzb = zzip;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzM(this.zza, true);
        this.zzb.zzs.zzt().zzu(new AtomicReference());
    }
}
