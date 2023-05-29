package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class zzci<T> implements zzch<T> {
    private static final zzci<Object> zza = new zzci<>((Object) null);
    private final T zzb;

    private zzci(T t) {
        this.zzb = t;
    }

    public final T zzb() {
        return this.zzb;
    }

    public static <T> zzch<T> zza(T t) {
        Objects.requireNonNull(t, "instance cannot be null");
        return new zzci(t);
    }
}
