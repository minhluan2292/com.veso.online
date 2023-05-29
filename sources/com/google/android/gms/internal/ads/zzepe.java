package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.veso.online.data.model.XosoConfig;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzepe implements zzevd {
    private final boolean zza;

    public zzepe(boolean z) {
        this.zza = z;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? "0" : XosoConfig.REGION_ID_SOUTH);
    }
}
