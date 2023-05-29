package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzr;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzfz implements zzr {
    final /* synthetic */ zzgb zza;

    zzfz(zzgb zzgb) {
        this.zza = zzgb;
    }

    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        zzey zzey;
        int i2 = i - 1;
        if (i2 == 0) {
            zzey = this.zza.zzs.zzay().zzc();
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzey = this.zza.zzs.zzay().zzj();
            } else if (i2 != 4) {
                zzey = this.zza.zzs.zzay().zzi();
            } else if (z) {
                zzey = this.zza.zzs.zzay().zzm();
            } else if (!z2) {
                zzey = this.zza.zzs.zzay().zzl();
            } else {
                zzey = this.zza.zzs.zzay().zzk();
            }
        } else if (z) {
            zzey = this.zza.zzs.zzay().zzh();
        } else if (!z2) {
            zzey = this.zza.zzs.zzay().zze();
        } else {
            zzey = this.zza.zzs.zzay().zzd();
        }
        int size = list.size();
        if (size == 1) {
            zzey.zzb(str, list.get(0));
        } else if (size == 2) {
            zzey.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzey.zza(str);
        } else {
            zzey.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
