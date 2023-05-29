package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzn;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final /* synthetic */ class zzfv implements Callable {
    public final /* synthetic */ zzgb zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzfv(zzgb zzgb, String str) {
        this.zza = zzgb;
        this.zzb = str;
    }

    public final Object call() {
        return new zzn("internal.remoteConfig", new zzga(this.zza, this.zzb));
    }
}
