package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.veso.online.data.model.XosoConfig;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzesh implements zzevd {
    public final String zza;
    public final boolean zzb;

    public zzesh(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", XosoConfig.REGION_ID_SOUTH);
        }
    }
}
