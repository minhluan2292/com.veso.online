package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final class zzfd extends zzjy implements zzlk {
    private zzfd() {
        super(zzfe.zza);
    }

    public final int zza() {
        return ((zzfe) this.zza).zzb();
    }

    public final zzfc zzb(int i) {
        return ((zzfe) this.zza).zzd(i);
    }

    public final zzfd zzc() {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        ((zzfe) this.zza).zzk = zzfe.zzbG();
        return this;
    }

    public final zzfd zzd(int i, zzfb zzfb) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfe.zzo((zzfe) this.zza, i, (zzfc) zzfb.zzaE());
        return this;
    }

    public final String zze() {
        return ((zzfe) this.zza).zzi();
    }

    public final List zzf() {
        return Collections.unmodifiableList(((zzfe) this.zza).zzj());
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzfe) this.zza).zzk());
    }

    /* synthetic */ zzfd(zzey zzey) {
        super(zzfe.zza);
    }
}
