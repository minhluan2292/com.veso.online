package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
public final /* synthetic */ class zzhp implements Runnable {
    public final /* synthetic */ zzip zza;
    public final /* synthetic */ Bundle zzb;

    public /* synthetic */ zzhp(zzip zzip, Bundle bundle) {
        this.zza = zzip;
        this.zzb = bundle;
    }

    public final void run() {
        this.zza.zzD(this.zzb);
    }
}
