package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzlg implements zzls {
    final /* synthetic */ zzll zza;

    zzlg(zzll zzll) {
        this.zza = zzll;
    }

    public final void zza(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            zzll zzll = this.zza;
            if (zzll.zzn != null) {
                zzll.zzn.zzay().zzd().zzb("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.zza.zzaz().zzp(new zzlf(this, str, "_err", bundle));
    }
}
