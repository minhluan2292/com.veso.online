package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.veso.online.data.model.XosoConfig;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzex implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzfa zzf;

    zzex(zzfa zzfa, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzfa;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    public final void run() {
        zzfp zzm = this.zzf.zzs.zzm();
        if (zzm.zzx()) {
            zzfa zzfa = this.zzf;
            if (zzfa.zza == 0) {
                if (zzfa.zzs.zzf().zzy()) {
                    zzfa zzfa2 = this.zzf;
                    zzfa2.zzs.zzaw();
                    zzfa2.zza = 'C';
                } else {
                    zzfa zzfa3 = this.zzf;
                    zzfa3.zzs.zzaw();
                    zzfa3.zza = 'c';
                }
            }
            zzfa zzfa4 = this.zzf;
            if (zzfa4.zzb < 0) {
                zzfa4.zzs.zzf().zzh();
                zzfa4.zzb = 64000;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            zzfa zzfa5 = this.zzf;
            String str = XosoConfig.REGION_ID_NORTH + charAt + zzfa5.zza + zzfa5.zzb + ":" + zzfa.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
            if (str.length() > 1024) {
                str = this.zzb.substring(0, 1024);
            }
            zzfn zzfn = zzm.zzb;
            if (zzfn != null) {
                zzfn.zzb(str, 1);
                return;
            }
            return;
        }
        Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
    }
}
