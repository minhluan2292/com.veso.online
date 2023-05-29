package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzga implements zzo {
    final /* synthetic */ String zza;
    final /* synthetic */ zzgb zzb;

    zzga(zzgb zzgb, String str) {
        this.zzb = zzgb;
        this.zza = str;
    }

    public final String zza(String str) {
        Map map = (Map) this.zzb.zzg.get(this.zza);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
