package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzfsq {
    private final String zza;
    private final zzfsp zzb;
    private zzfsp zzc;

    /* synthetic */ zzfsq(String str, zzfso zzfso) {
        zzfsp zzfsp = new zzfsp((zzfso) null);
        this.zzb = zzfsp;
        this.zzc = zzfsp;
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfsp zzfsp = this.zzb.zzb;
        String str = "";
        while (zzfsp != null) {
            Object obj = zzfsp.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            zzfsp = zzfsp.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfsq zza(@CheckForNull Object obj) {
        zzfsp zzfsp = new zzfsp((zzfso) null);
        this.zzc.zzb = zzfsp;
        this.zzc = zzfsp;
        zzfsp.zza = obj;
        return this;
    }
}
