package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzhb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzhc zze;

    zzhb(zzhc zzhc, String str, String str2, String str3, long j) {
        this.zze = zzhc;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
    }

    public final void run() {
        zzpp.zzc();
        if (this.zze.zza.zzg().zzs((String) null, zzen.zzat)) {
            String str = this.zza;
            if (str == null) {
                this.zze.zza.zzQ(this.zzb, (zziw) null);
                return;
            }
            this.zze.zza.zzQ(this.zzb, new zziw(this.zzc, str, this.zzd));
            return;
        }
        String str2 = this.zza;
        if (str2 == null) {
            this.zze.zza.zzq().zzs().zzy(this.zzb, (zziw) null);
            return;
        }
        this.zze.zza.zzq().zzs().zzy(this.zzb, new zziw(this.zzc, str2, this.zzd));
    }
}
