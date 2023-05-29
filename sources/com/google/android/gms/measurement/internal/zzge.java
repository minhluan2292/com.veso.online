package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzge implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzgh zza;
    private final String zzb;

    public zzge(zzgh zzgh, String str) {
        this.zza = zzgh;
        Preconditions.checkNotNull(str);
        this.zzb = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.zza.zzs.zzay().zzd().zzb(this.zzb, th);
    }
}
