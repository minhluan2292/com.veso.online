package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zznb {
    public static final zznb zza = (zzen.zza < 31 ? new zznb() : new zznb(zzna.zza));
    private final zzna zzb;

    public zznb() {
        this.zzb = null;
        zzdd.zzf(zzen.zza < 31);
    }

    private zznb(zzna zzna) {
        this.zzb = zzna;
    }

    public final LogSessionId zza() {
        zzna zzna = this.zzb;
        Objects.requireNonNull(zzna);
        return zzna.zzb;
    }

    public zznb(LogSessionId logSessionId) {
        this.zzb = new zzna(logSessionId);
    }
}
