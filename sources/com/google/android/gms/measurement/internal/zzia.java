package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzia implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzip zzd;

    zzia(zzip zzip, AtomicReference atomicReference, String str, String str2, String str3) {
        this.zzd = zzip;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final void run() {
        this.zzd.zzs.zzt().zzw(this.zza, (String) null, this.zzb, this.zzc);
    }
}
