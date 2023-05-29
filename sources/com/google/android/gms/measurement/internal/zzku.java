package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzby;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
public final class zzku extends zzf {
    protected final zzkt zza = new zzkt(this);
    protected final zzks zzb = new zzks(this);
    protected final zzkq zzc = new zzkq(this);
    /* access modifiers changed from: private */
    public Handler zzd;

    zzku(zzgk zzgk) {
        super(zzgk);
    }

    static /* bridge */ /* synthetic */ void zzj(zzku zzku, long j) {
        zzku.zzg();
        zzku.zzm();
        zzku.zzs.zzay().zzj().zzb("Activity paused, time", Long.valueOf(j));
        zzku.zzc.zza(j);
        if (zzku.zzs.zzf().zzu()) {
            zzku.zzb.zzb(j);
        }
    }

    static /* bridge */ /* synthetic */ void zzl(zzku zzku, long j) {
        zzku.zzg();
        zzku.zzm();
        zzku.zzs.zzay().zzj().zzb("Activity resumed, time", Long.valueOf(j));
        if (zzku.zzs.zzf().zzu() || zzku.zzs.zzm().zzl.zzb()) {
            zzku.zzb.zzc(j);
        }
        zzku.zzc.zzb();
        zzkt zzkt = zzku.zza;
        zzkt.zza.zzg();
        if (zzkt.zza.zzs.zzJ()) {
            zzkt.zzb(zzkt.zza.zzs.zzav().currentTimeMillis(), false);
        }
    }

    /* access modifiers changed from: private */
    public final void zzm() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new zzby(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzf() {
        return false;
    }
}
