package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzgz implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzhc zzb;

    zzgz(zzhc zzhc, String str) {
        this.zzb = zzhc;
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.zzb.zza.zzA();
        return this.zzb.zza.zzi().zzu(this.zza);
    }
}
