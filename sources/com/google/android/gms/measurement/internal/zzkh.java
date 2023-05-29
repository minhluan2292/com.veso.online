package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final /* synthetic */ class zzkh implements Runnable {
    public final /* synthetic */ zzkl zza;
    public final /* synthetic */ zzfa zzb;
    public final /* synthetic */ JobParameters zzc;

    public /* synthetic */ zzkh(zzkl zzkl, zzfa zzfa, JobParameters jobParameters) {
        this.zza = zzkl;
        this.zzb = zzfa;
        this.zzc = jobParameters;
    }

    public final void run() {
        this.zza.zzd(this.zzb, this.zzc);
    }
}
