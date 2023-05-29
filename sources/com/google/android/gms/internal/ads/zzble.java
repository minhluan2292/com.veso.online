package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzble {
    public static final zzbke zza = zzbke.zzb("gads:ad_loader:timeout_ms", 60000);
    public static final zzbke zzb = zzbke.zzb("gads:rendering:timeout_ms", 60000);
    public static final zzbke zzc = zzbke.zzb("gads:resolve_future:default_timeout_ms", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
}
