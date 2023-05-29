package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class zzcg<T> implements zzcl<T> {
    private static final Object zza = new Object();
    private volatile zzcl<T> zzb;
    private volatile Object zzc = zza;

    private zzcg(zzcl<T> zzcl) {
        this.zzb = zzcl;
    }

    public final T zzb() {
        T t = this.zzc;
        T t2 = zza;
        if (t == t2) {
            synchronized (this) {
                t = this.zzc;
                if (t == t2) {
                    t = this.zzb.zzb();
                    T t3 = this.zzc;
                    if (t3 != t2 && !(t3 instanceof zzcj)) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.zzc = t;
                    this.zzb = null;
                }
            }
        }
        return t;
    }

    public static <P extends zzcl<T>, T> zzcl<T> zza(P p) {
        Objects.requireNonNull(p);
        if (p instanceof zzcg) {
            return p;
        }
        return new zzcg(p);
    }
}
