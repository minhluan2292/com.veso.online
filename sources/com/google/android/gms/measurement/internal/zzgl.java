package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final /* synthetic */ class zzgl implements Runnable {
    public final /* synthetic */ zzhc zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Bundle zzc;

    public /* synthetic */ zzgl(zzhc zzhc, String str, Bundle bundle) {
        this.zza = zzhc;
        this.zzb = str;
        this.zzc = bundle;
    }

    public final void run() {
        this.zza.zzw(this.zzb, this.zzc);
    }
}
