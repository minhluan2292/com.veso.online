package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzie implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzip zzb;

    zzie(zzip zzip, AtomicReference atomicReference) {
        this.zzb = zzip;
        this.zza = atomicReference;
    }

    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(this.zzb.zzs.zzf().zzo(this.zzb.zzs.zzh().zzl(), zzen.zzK));
                this.zza.notify();
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
