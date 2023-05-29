package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
public final /* synthetic */ class zzko implements Runnable {
    public final /* synthetic */ zzkp zza;

    public /* synthetic */ zzko(zzkp zzkp) {
        this.zza = zzkp;
    }

    public final void run() {
        zzkp zzkp = this.zza;
        zzkq zzkq = zzkp.zzc;
        long j = zzkp.zza;
        long j2 = zzkp.zzb;
        zzkq.zza.zzg();
        zzkq.zza.zzs.zzay().zzc().zza("Application going to the background");
        zzkq.zza.zzs.zzm().zzl.zza(true);
        Bundle bundle = new Bundle();
        if (!zzkq.zza.zzs.zzf().zzu()) {
            zzkq.zza.zzb.zzb(j2);
            zzkq.zza.zzb.zzd(false, false, j2);
        }
        zzkq.zza.zzs.zzq().zzI(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", j, bundle);
    }
}
