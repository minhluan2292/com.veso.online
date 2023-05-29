package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final /* synthetic */ class zzfx implements Callable {
    public final /* synthetic */ zzgb zza;

    public /* synthetic */ zzfx(zzgb zzgb) {
        this.zza = zzgb;
    }

    public final Object call() {
        return new zzt(this.zza.zze);
    }
}
