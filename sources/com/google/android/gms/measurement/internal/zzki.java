package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final /* synthetic */ class zzki implements Runnable {
    public final /* synthetic */ zzkl zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzfa zzc;
    public final /* synthetic */ Intent zzd;

    public /* synthetic */ zzki(zzkl zzkl, int i, zzfa zzfa, Intent intent) {
        this.zza = zzkl;
        this.zzb = i;
        this.zzc = zzfa;
        this.zzd = intent;
    }

    public final void run() {
        this.zza.zzc(this.zzb, this.zzc, this.zzd);
    }
}
