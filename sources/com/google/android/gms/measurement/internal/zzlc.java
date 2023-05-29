package com.google.android.gms.measurement.internal;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzlc implements zzfc {
    final /* synthetic */ String zza;
    final /* synthetic */ zzll zzb;

    zzlc(zzll zzll, String str) {
        this.zzb = zzll;
        this.zza = str;
    }

    public final void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.zzb.zzJ(i, th, bArr, this.zza);
    }
}
