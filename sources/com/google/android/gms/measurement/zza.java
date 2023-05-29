package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgk;
import com.google.android.gms.measurement.internal.zzhk;
import com.google.android.gms.measurement.internal.zzhl;
import com.google.android.gms.measurement.internal.zzip;
import com.google.android.gms.measurement.internal.zzlo;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zza extends zzd {
    private final zzgk zza;
    private final zzip zzb;

    public zza(zzgk zzgk) {
        super((zzc) null);
        Preconditions.checkNotNull(zzgk);
        this.zza = zzgk;
        this.zzb = zzgk.zzq();
    }

    public final int zza(String str) {
        this.zzb.zzh(str);
        return 25;
    }

    public final long zzb() {
        return this.zza.zzv().zzq();
    }

    public final Boolean zzc() {
        return this.zzb.zzi();
    }

    public final Double zzd() {
        return this.zzb.zzj();
    }

    public final Integer zze() {
        return this.zzb.zzl();
    }

    public final Long zzf() {
        return this.zzb.zzm();
    }

    public final String zzh() {
        return this.zzb.zzo();
    }

    public final String zzi() {
        return this.zzb.zzp();
    }

    public final String zzj() {
        return this.zzb.zzq();
    }

    public final String zzk() {
        return this.zzb.zzo();
    }

    public final String zzl() {
        return this.zzb.zzr();
    }

    public final List zzm(String str, String str2) {
        return this.zzb.zzs(str, str2);
    }

    public final Map zzn(boolean z) {
        List<zzlo> zzt = this.zzb.zzt(z);
        ArrayMap arrayMap = new ArrayMap(zzt.size());
        for (zzlo zzlo : zzt) {
            Object zza2 = zzlo.zza();
            if (zza2 != null) {
                arrayMap.put(zzlo.zzb, zza2);
            }
        }
        return arrayMap;
    }

    public final Map zzo(String str, String str2, boolean z) {
        return this.zzb.zzu(str, str2, z);
    }

    public final void zzp(String str) {
        this.zza.zzd().zzd(str, this.zza.zzav().elapsedRealtime());
    }

    public final void zzq(String str, String str2, Bundle bundle) {
        this.zza.zzq().zzA(str, str2, bundle);
    }

    public final void zzr(String str) {
        this.zza.zzd().zze(str, this.zza.zzav().elapsedRealtime());
    }

    public final void zzs(String str, String str2, Bundle bundle) {
        this.zzb.zzE(str, str2, bundle);
    }

    public final void zzt(String str, String str2, Bundle bundle, long j) {
        this.zzb.zzF(str, str2, bundle, true, false, j);
    }

    public final void zzu(zzhl zzhl) {
        this.zzb.zzK(zzhl);
    }

    public final void zzv(Bundle bundle) {
        this.zzb.zzQ(bundle);
    }

    public final void zzw(zzhk zzhk) {
        this.zzb.zzV(zzhk);
    }

    public final void zzx(zzhl zzhl) {
        this.zzb.zzab(zzhl);
    }

    public final Object zzg(int i) {
        if (i == 0) {
            return this.zzb.zzr();
        }
        if (i == 1) {
            return this.zzb.zzm();
        }
        if (i == 2) {
            return this.zzb.zzj();
        }
        if (i != 3) {
            return this.zzb.zzi();
        }
        return this.zzb.zzl();
    }
}
