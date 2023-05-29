package com.google.android.gms.internal.measurement;

import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzih implements zzif {
    @CheckForNull
    volatile zzif zza;
    volatile boolean zzb;
    @CheckForNull
    Object zzc;

    zzih(zzif zzif) {
        Objects.requireNonNull(zzif);
        this.zza = zzif;
    }

    public final String toString() {
        Object obj = this.zza;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.zzc + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzif zzif = this.zza;
                    zzif.getClass();
                    Object zza2 = zzif.zza();
                    this.zzc = zza2;
                    this.zzb = true;
                    this.zza = null;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
