package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcdz {
    private Context zza;
    private Clock zzb;
    private zzg zzc;
    private zzceu zzd;

    private zzcdz() {
    }

    /* synthetic */ zzcdz(zzcdy zzcdy) {
    }

    public final zzcdz zza(zzg zzg) {
        this.zzc = zzg;
        return this;
    }

    public final zzcdz zzb(Context context) {
        Objects.requireNonNull(context);
        this.zza = context;
        return this;
    }

    public final zzcdz zzc(Clock clock) {
        Objects.requireNonNull(clock);
        this.zzb = clock;
        return this;
    }

    public final zzcdz zzd(zzceu zzceu) {
        this.zzd = zzceu;
        return this;
    }

    public final zzcev zze() {
        zzgxq.zzc(this.zza, Context.class);
        zzgxq.zzc(this.zzb, Clock.class);
        zzgxq.zzc(this.zzc, zzg.class);
        zzgxq.zzc(this.zzd, zzceu.class);
        return new zzceb(this.zza, this.zzb, this.zzc, this.zzd, (zzcea) null);
    }
}
