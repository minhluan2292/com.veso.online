package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfz;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzps;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzgx implements Callable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzhc zzc;

    zzgx(zzhc zzhc, zzaw zzaw, String str) {
        this.zzc = zzhc;
        this.zza = zzaw;
        this.zzb = str;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzll zzll;
        zzlq zzlq;
        zzfz zzfz;
        zzgb zzgb;
        Bundle bundle;
        String str;
        zzh zzh;
        long j;
        String str2;
        zzas zzas;
        this.zzc.zza.zzA();
        zziu zzr = this.zzc.zza.zzr();
        zzaw zzaw = this.zza;
        String str3 = this.zzb;
        zzr.zzg();
        zzgk.zzO();
        Preconditions.checkNotNull(zzaw);
        Preconditions.checkNotEmpty(str3);
        if (!zzr.zzs.zzf().zzs(str3, zzen.zzT)) {
            zzr.zzs.zzay().zzc().zzb("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        } else if ("_iap".equals(zzaw.zza) || "_iapx".equals(zzaw.zza)) {
            zzfz zza2 = zzga.zza();
            zzr.zzf.zzi().zzw();
            zzh zzj = zzr.zzf.zzi().zzj(str3);
            if (zzj == null) {
                zzr.zzs.zzay().zzc().zzb("Log and bundle not available. package_name", str3);
                bArr = new byte[0];
                zzll = zzr.zzf;
            } else if (!zzj.zzaj()) {
                zzr.zzs.zzay().zzc().zzb("Log and bundle disabled. package_name", str3);
                bArr = new byte[0];
                zzll = zzr.zzf;
            } else {
                zzgb zzu = zzgc.zzu();
                zzu.zzae(1);
                zzu.zzaa("android");
                if (!TextUtils.isEmpty(zzj.zzt())) {
                    zzu.zzE(zzj.zzt());
                }
                if (!TextUtils.isEmpty(zzj.zzv())) {
                    zzu.zzG((String) Preconditions.checkNotNull(zzj.zzv()));
                }
                if (!TextUtils.isEmpty(zzj.zzw())) {
                    zzu.zzH((String) Preconditions.checkNotNull(zzj.zzw()));
                }
                if (zzj.zzb() != -2147483648L) {
                    zzu.zzI((int) zzj.zzb());
                }
                zzu.zzW(zzj.zzm());
                zzu.zzQ(zzj.zzk());
                String zzy = zzj.zzy();
                String zzr2 = zzj.zzr();
                if (!TextUtils.isEmpty(zzy)) {
                    zzu.zzV(zzy);
                } else if (!TextUtils.isEmpty(zzr2)) {
                    zzu.zzC(zzr2);
                }
                zzai zzh2 = zzr.zzf.zzh(str3);
                zzu.zzN(zzj.zzj());
                if (zzr.zzs.zzJ() && zzr.zzs.zzf().zzt(zzu.zzaq()) && zzh2.zzi(zzah.AD_STORAGE) && !TextUtils.isEmpty((CharSequence) null)) {
                    zzu.zzP((String) null);
                }
                zzu.zzM(zzh2.zzh());
                if (zzh2.zzi(zzah.AD_STORAGE)) {
                    Pair zzd = zzr.zzf.zzs().zzd(zzj.zzt(), zzh2);
                    if (zzj.zzai() && !TextUtils.isEmpty((CharSequence) zzd.first)) {
                        try {
                            zzu.zzaf(zziu.zza((String) zzd.first, Long.toString(zzaw.zzd)));
                            if (zzd.second != null) {
                                zzu.zzY(((Boolean) zzd.second).booleanValue());
                            }
                        } catch (SecurityException e) {
                            zzr.zzs.zzay().zzc().zzb("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            zzll = zzr.zzf;
                        } catch (Throwable th) {
                            zzr.zzf.zzi().zzx();
                            throw th;
                        }
                    }
                }
                zzr.zzs.zzg().zzu();
                zzu.zzO(Build.MODEL);
                zzr.zzs.zzg().zzu();
                zzu.zzZ(Build.VERSION.RELEASE);
                zzu.zzak((int) zzr.zzs.zzg().zzb());
                zzu.zzao(zzr.zzs.zzg().zzc());
                try {
                    if (zzh2.zzi(zzah.ANALYTICS_STORAGE) && zzj.zzu() != null) {
                        zzu.zzF(zziu.zza((String) Preconditions.checkNotNull(zzj.zzu()), Long.toString(zzaw.zzd)));
                    }
                    if (!TextUtils.isEmpty(zzj.zzx())) {
                        zzu.zzU((String) Preconditions.checkNotNull(zzj.zzx()));
                    }
                    String zzt = zzj.zzt();
                    List zzu2 = zzr.zzf.zzi().zzu(zzt);
                    Iterator it = zzu2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzlq = null;
                            break;
                        }
                        zzlq = (zzlq) it.next();
                        if ("_lte".equals(zzlq.zzc)) {
                            break;
                        }
                    }
                    if (zzlq == null || zzlq.zze == null) {
                        zzlq zzlq2 = new zzlq(zzt, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzr.zzs.zzav().currentTimeMillis(), 0L);
                        zzu2.add(zzlq2);
                        zzr.zzf.zzi().zzL(zzlq2);
                    }
                    zzln zzu3 = zzr.zzf.zzu();
                    zzu3.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                    if (zzu3.zzs.zzg().zze()) {
                        String zzt2 = zzj.zzt();
                        Preconditions.checkNotNull(zzt2);
                        if (zzj.zzai() && zzu3.zzf.zzo().zzn(zzt2)) {
                            zzu3.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                            Iterator it2 = zzu2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if ("_npa".equals(((zzlq) it2.next()).zzc)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            zzu2.add(new zzlq(zzt2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_npa", zzu3.zzs.zzav().currentTimeMillis(), 1L));
                        }
                    }
                    zzgl[] zzglArr = new zzgl[zzu2.size()];
                    for (int i = 0; i < zzu2.size(); i++) {
                        zzgk zzd2 = zzgl.zzd();
                        zzd2.zzf(((zzlq) zzu2.get(i)).zzc);
                        zzd2.zzg(((zzlq) zzu2.get(i)).zzd);
                        zzr.zzf.zzu().zzu(zzd2, ((zzlq) zzu2.get(i)).zze);
                        zzglArr[i] = (zzgl) zzd2.zzaE();
                    }
                    zzu.zzj(Arrays.asList(zzglArr));
                    zzfb zzb2 = zzfb.zzb(zzaw);
                    zzr.zzs.zzv().zzL(zzb2.zzd, zzr.zzf.zzi().zzi(str3));
                    zzr.zzs.zzv().zzM(zzb2, zzr.zzs.zzf().zzd(str3));
                    Bundle bundle2 = zzb2.zzd;
                    bundle2.putLong("_c", 1);
                    zzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", zzaw.zzc);
                    if (zzr.zzs.zzv().zzae(zzu.zzaq())) {
                        zzr.zzs.zzv().zzO(bundle2, "_dbg", 1L);
                        zzr.zzs.zzv().zzO(bundle2, "_r", 1L);
                    }
                    zzas zzn = zzr.zzf.zzi().zzn(str3, zzaw.zza);
                    if (zzn == null) {
                        zzgb = zzu;
                        zzh = zzj;
                        zzfz = zza2;
                        str = str3;
                        bundle = bundle2;
                        str2 = null;
                        zzas = new zzas(str3, zzaw.zza, 0, 0, 0, zzaw.zzd, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j = 0;
                    } else {
                        zzh = zzj;
                        zzfz = zza2;
                        str = str3;
                        bundle = bundle2;
                        zzgb = zzu;
                        str2 = null;
                        long j2 = zzn.zzf;
                        zzas = zzn.zzc(zzaw.zzd);
                        j = j2;
                    }
                    zzr.zzf.zzi().zzE(zzas);
                    zzar zzar = new zzar(zzr.zzs, zzaw.zzc, str, zzaw.zza, zzaw.zzd, j, bundle);
                    zzfr zze = zzfs.zze();
                    zze.zzm(zzar.zzd);
                    zze.zzi(zzar.zzb);
                    zze.zzl(zzar.zze);
                    zzat zzat = new zzat(zzar.zzf);
                    while (zzat.hasNext()) {
                        String zza3 = zzat.next();
                        zzfv zze2 = zzfw.zze();
                        zze2.zzj(zza3);
                        Object zzf = zzar.zzf.zzf(zza3);
                        if (zzf != null) {
                            zzr.zzf.zzu().zzt(zze2, zzf);
                            zze.zze(zze2);
                        }
                    }
                    zzgb zzgb2 = zzgb;
                    zzgb2.zzk(zze);
                    zzgd zza4 = zzgf.zza();
                    zzft zza5 = zzfu.zza();
                    zza5.zza(zzas.zzc);
                    zza5.zzb(zzaw.zza);
                    zza4.zza(zza5);
                    zzgb2.zzab(zza4);
                    zzgb2.zzf(zzr.zzf.zzf().zza(zzh.zzt(), Collections.emptyList(), zzgb2.zzat(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                    if (zze.zzq()) {
                        zzgb2.zzaj(zze.zzc());
                        zzgb2.zzR(zze.zzc());
                    }
                    long zzn2 = zzh.zzn();
                    int i2 = (zzn2 > 0 ? 1 : (zzn2 == 0 ? 0 : -1));
                    if (i2 != 0) {
                        zzgb2.zzac(zzn2);
                    }
                    long zzp = zzh.zzp();
                    if (zzp != 0) {
                        zzgb2.zzad(zzp);
                    } else if (i2 != 0) {
                        zzgb2.zzad(zzn2);
                    }
                    String zzB = zzh.zzB();
                    zzps.zzc();
                    if (zzr.zzs.zzf().zzs(str2, zzen.zzaH) && zzB != null) {
                        zzgb2.zzai(zzB);
                    }
                    zzh.zzE();
                    zzgb2.zzJ((int) zzh.zzo());
                    zzr.zzs.zzf().zzh();
                    zzgb2.zzam(64000);
                    zzgb2.zzal(zzr.zzs.zzav().currentTimeMillis());
                    Boolean bool = Boolean.TRUE;
                    zzgb2.zzah(true);
                    zzfz zzfz2 = zzfz;
                    zzfz2.zza(zzgb2);
                    zzh zzh3 = zzh;
                    zzh3.zzac(zzgb2.zzd());
                    zzh3.zzaa(zzgb2.zzc());
                    zzr.zzf.zzi().zzD(zzh3);
                    zzr.zzf.zzi().zzC();
                    zzr.zzf.zzi().zzx();
                    try {
                        return zzr.zzf.zzu().zzy(((zzga) zzfz2.zzaE()).zzby());
                    } catch (IOException e2) {
                        zzr.zzs.zzay().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzfa.zzn(str), e2);
                        return str2;
                    }
                } catch (SecurityException e3) {
                    zzr.zzs.zzay().zzc().zzb("app instance id encryption failed", e3.getMessage());
                    bArr = new byte[0];
                    zzll = zzr.zzf;
                }
            }
            zzll.zzi().zzx();
            return bArr;
        } else {
            zzr.zzs.zzay().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str3, zzaw.zza);
            return null;
        }
    }
}
