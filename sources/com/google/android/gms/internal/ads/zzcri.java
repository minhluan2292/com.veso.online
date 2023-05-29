package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcri implements zzdyy {
    private final zzcpw zza;
    private Context zzb;
    private zzbqr zzc;

    /* synthetic */ zzcri(zzcpw zzcpw, zzcrh zzcrh) {
        this.zza = zzcpw;
    }

    public final /* synthetic */ zzdyy zza(zzbqr zzbqr) {
        Objects.requireNonNull(zzbqr);
        this.zzc = zzbqr;
        return this;
    }

    public final /* synthetic */ zzdyy zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    public final zzdyz zzc() {
        zzgxq.zzc(this.zzb, Context.class);
        zzgxq.zzc(this.zzc, zzbqr.class);
        return new zzcrk(this.zza, this.zzb, this.zzc, (zzcrj) null);
    }
}
