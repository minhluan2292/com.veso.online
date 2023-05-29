package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
public final /* synthetic */ class zzho implements Runnable {
    public final /* synthetic */ zzip zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzho(zzip zzip, Bundle bundle, long j) {
        this.zza = zzip;
        this.zzb = bundle;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzC(this.zzb, this.zzc);
    }
}
