package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzu;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final /* synthetic */ class zzfw implements Callable {
    public final /* synthetic */ zzgb zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzfw(zzgb zzgb, String str) {
        this.zza = zzgb;
        this.zzb = str;
    }

    public final Object call() {
        return new zzu("internal.appMetadata", new zzfu(this.zza, this.zzb));
    }
}
