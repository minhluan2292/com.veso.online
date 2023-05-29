package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcqu implements zzezw {
    private final zzcpw zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    /* synthetic */ zzcqu(zzcpw zzcpw, zzcqt zzcqt) {
        this.zza = zzcpw;
    }

    public final /* synthetic */ zzezw zza(zzq zzq) {
        Objects.requireNonNull(zzq);
        this.zzd = zzq;
        return this;
    }

    public final /* synthetic */ zzezw zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzezw zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    public final zzezx zzd() {
        zzgxq.zzc(this.zzb, Context.class);
        zzgxq.zzc(this.zzc, String.class);
        zzgxq.zzc(this.zzd, zzq.class);
        return new zzcqw(this.zza, this.zzb, this.zzc, this.zzd, (zzcqv) null);
    }
}
