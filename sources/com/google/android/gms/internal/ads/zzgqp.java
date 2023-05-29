package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgqp {
    private final Object zza;
    private final int zzb;

    zzgqp(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgqp)) {
            return false;
        }
        zzgqp zzgqp = (zzgqp) obj;
        if (this.zza == zzgqp.zza && this.zzb == zzgqp.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
    }
}
