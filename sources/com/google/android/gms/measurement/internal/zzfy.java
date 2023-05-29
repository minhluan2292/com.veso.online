package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzfy extends LruCache {
    final /* synthetic */ zzgb zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfy(zzgb zzgb, int i) {
        super(20);
        this.zza = zzgb;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzgb.zzd(this.zza, str);
    }
}
