package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final class zzhc extends zzep {
    /* access modifiers changed from: private */
    public final zzll zza;
    private Boolean zzb;
    private String zzc = null;

    public zzhc(zzll zzll, String str) {
        Preconditions.checkNotNull(zzll);
        this.zza = zzll;
    }

    private final void zzA(zzaw zzaw, zzq zzq) {
        this.zza.zzA();
        this.zza.zzD(zzaw, zzq);
    }

    private final void zzy(zzq zzq, boolean z) {
        Preconditions.checkNotNull(zzq);
        Preconditions.checkNotEmpty(zzq.zza);
        zzz(zzq.zza, false);
        this.zza.zzv().zzX(zzq.zzb, zzq.zzq);
    }

    private final void zzz(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.zzb == null) {
                        if (!"com.google.android.gms".equals(this.zzc) && !UidVerifier.isGooglePlayServicesUid(this.zza.zzau(), Binder.getCallingUid())) {
                            if (!GoogleSignatureVerifier.getInstance(this.zza.zzau()).isUidGoogleSigned(Binder.getCallingUid())) {
                                z2 = false;
                                this.zzb = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.zzb = Boolean.valueOf(z2);
                    }
                    if (this.zzb.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.zza.zzay().zzd().zzb("Measurement Service called with invalid calling package. appId", zzfa.zzn(str));
                    throw e;
                }
            }
            if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzau(), Binder.getCallingUid(), str)) {
                this.zzc = str;
            }
            if (!str.equals(this.zzc)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.zza.zzay().zzd().zza("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* access modifiers changed from: package-private */
    public final zzaw zzb(zzaw zzaw, zzq zzq) {
        zzau zzau;
        if (!(!Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzaw.zza) || (zzau = zzaw.zzb) == null || zzau.zza() == 0)) {
            String zzg = zzaw.zzb.zzg("_cis");
            if ("referrer broadcast".equals(zzg) || "referrer API".equals(zzg)) {
                this.zza.zzay().zzi().zzb("Event has been filtered ", zzaw.toString());
                return new zzaw("_cmpx", zzaw.zzb, zzaw.zzc, zzaw.zzd);
            }
        }
        return zzaw;
    }

    public final String zzd(zzq zzq) {
        zzy(zzq, false);
        return this.zza.zzx(zzq);
    }

    public final List zze(zzq zzq, boolean z) {
        zzy(zzq, false);
        String str = zzq.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zzlq> list = (List) this.zza.zzaz().zzh(new zzgz(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzlq zzlq : list) {
                if (z || !zzlt.zzah(zzlq.zzc)) {
                    arrayList.add(new zzlo(zzlq));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzay().zzd().zzc("Failed to get user properties. appId", zzfa.zzn(zzq.zza), e);
            return null;
        }
    }

    public final List zzf(String str, String str2, zzq zzq) {
        zzy(zzq, false);
        String str3 = zzq.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzaz().zzh(new zzgq(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzay().zzd().zzb("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final List zzg(String str, String str2, String str3) {
        zzz(str, true);
        try {
            return (List) this.zza.zzaz().zzh(new zzgr(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzay().zzd().zzb("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    public final List zzh(String str, String str2, boolean z, zzq zzq) {
        zzy(zzq, false);
        String str3 = zzq.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zzlq> list = (List) this.zza.zzaz().zzh(new zzgo(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzlq zzlq : list) {
                if (z || !zzlt.zzah(zzlq.zzc)) {
                    arrayList.add(new zzlo(zzlq));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzay().zzd().zzc("Failed to query user properties. appId", zzfa.zzn(zzq.zza), e);
            return Collections.emptyList();
        }
    }

    public final List zzi(String str, String str2, String str3, boolean z) {
        zzz(str, true);
        try {
            List<zzlq> list = (List) this.zza.zzaz().zzh(new zzgp(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzlq zzlq : list) {
                if (z || !zzlt.zzah(zzlq.zzc)) {
                    arrayList.add(new zzlo(zzlq));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzay().zzd().zzc("Failed to get user properties as. appId", zzfa.zzn(str), e);
            return Collections.emptyList();
        }
    }

    public final void zzj(zzq zzq) {
        zzy(zzq, false);
        zzx(new zzha(this, zzq));
    }

    public final void zzk(zzaw zzaw, zzq zzq) {
        Preconditions.checkNotNull(zzaw);
        zzy(zzq, false);
        zzx(new zzgv(this, zzaw, zzq));
    }

    public final void zzl(zzaw zzaw, String str, String str2) {
        Preconditions.checkNotNull(zzaw);
        Preconditions.checkNotEmpty(str);
        zzz(str, true);
        zzx(new zzgw(this, zzaw, str));
    }

    public final void zzm(zzq zzq) {
        Preconditions.checkNotEmpty(zzq.zza);
        zzz(zzq.zza, false);
        zzx(new zzgs(this, zzq));
    }

    public final void zzn(zzac zzac, zzq zzq) {
        Preconditions.checkNotNull(zzac);
        Preconditions.checkNotNull(zzac.zzc);
        zzy(zzq, false);
        zzac zzac2 = new zzac(zzac);
        zzac2.zza = zzq.zza;
        zzx(new zzgm(this, zzac2, zzq));
    }

    public final void zzo(zzac zzac) {
        Preconditions.checkNotNull(zzac);
        Preconditions.checkNotNull(zzac.zzc);
        Preconditions.checkNotEmpty(zzac.zza);
        zzz(zzac.zza, true);
        zzx(new zzgn(this, new zzac(zzac)));
    }

    public final void zzp(zzq zzq) {
        Preconditions.checkNotEmpty(zzq.zza);
        Preconditions.checkNotNull(zzq.zzv);
        zzgu zzgu = new zzgu(this, zzq);
        Preconditions.checkNotNull(zzgu);
        if (this.zza.zzaz().zzs()) {
            zzgu.run();
        } else {
            this.zza.zzaz().zzq(zzgu);
        }
    }

    public final void zzq(long j, String str, String str2, String str3) {
        zzx(new zzhb(this, str2, str3, str, j));
    }

    public final void zzr(Bundle bundle, zzq zzq) {
        zzy(zzq, false);
        String str = zzq.zza;
        Preconditions.checkNotNull(str);
        zzx(new zzgl(this, str, bundle));
    }

    public final void zzs(zzq zzq) {
        zzy(zzq, false);
        zzx(new zzgt(this, zzq));
    }

    public final void zzt(zzlo zzlo, zzq zzq) {
        Preconditions.checkNotNull(zzlo);
        zzy(zzq, false);
        zzx(new zzgy(this, zzlo, zzq));
    }

    public final byte[] zzu(zzaw zzaw, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaw);
        zzz(str, true);
        this.zza.zzay().zzc().zzb("Log and bundle. event", this.zza.zzj().zzd(zzaw.zza));
        long nanoTime = this.zza.zzav().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzaz().zzi(new zzgx(this, zzaw, str)).get();
            if (bArr == null) {
                this.zza.zzay().zzd().zzb("Log and bundle returned null. appId", zzfa.zzn(str));
                bArr = new byte[0];
            }
            this.zza.zzay().zzc().zzd("Log and bundle processed. event, size, time_ms", this.zza.zzj().zzd(zzaw.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzav().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzay().zzd().zzd("Failed to log and bundle. appId, event, error", zzfa.zzn(str), this.zza.zzj().zzd(zzaw.zza), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzv(zzaw zzaw, zzq zzq) {
        zzc zzc2;
        if (!this.zza.zzo().zzo(zzq.zza)) {
            zzA(zzaw, zzq);
            return;
        }
        this.zza.zzay().zzj().zzb("EES config found for", zzq.zza);
        zzgb zzo = this.zza.zzo();
        String str = zzq.zza;
        if (TextUtils.isEmpty(str)) {
            zzc2 = null;
        } else {
            zzc2 = (zzc) zzo.zzd.get(str);
        }
        if (zzc2 != null) {
            try {
                Map zzs = this.zza.zzu().zzs(zzaw.zzb.zzc(), true);
                String zza2 = zzhh.zza(zzaw.zza);
                if (zza2 == null) {
                    zza2 = zzaw.zza;
                }
                if (zzc2.zze(new zzaa(zza2, zzaw.zzd, zzs))) {
                    if (zzc2.zzg()) {
                        this.zza.zzay().zzj().zzb("EES edited event", zzaw.zza);
                        zzA(this.zza.zzu().zzi(zzc2.zza().zzb()), zzq);
                    } else {
                        zzA(zzaw, zzq);
                    }
                    if (zzc2.zzf()) {
                        for (zzaa zzaa : zzc2.zza().zzc()) {
                            this.zza.zzay().zzj().zzb("EES logging created event", zzaa.zzd());
                            zzA(this.zza.zzu().zzi(zzaa), zzq);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.zza.zzay().zzd().zzc("EES error. appId, eventName", zzq.zzb, zzaw.zza);
            }
            this.zza.zzay().zzj().zzb("EES was not applied to event", zzaw.zza);
            zzA(zzaw, zzq);
            return;
        }
        this.zza.zzay().zzj().zzb("EES not loaded for", zzq.zza);
        zzA(zzaw, zzq);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzw(String str, Bundle bundle) {
        zzam zzi = this.zza.zzi();
        zzi.zzg();
        zzi.zzW();
        byte[] zzby = zzi.zzf.zzu().zzj(new zzar(zzi.zzs, "", str, "dep", 0, 0, bundle)).zzby();
        zzi.zzs.zzay().zzj().zzc("Saving default event parameters, appId, data size", zzi.zzs.zzj().zzd(str), Integer.valueOf(zzby.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzby);
        try {
            if (zzi.zzh().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                zzi.zzs.zzay().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzfa.zzn(str));
            }
        } catch (SQLiteException e) {
            zzi.zzs.zzay().zzd().zzc("Error storing default event parameters. appId", zzfa.zzn(str), e);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzx(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzaz().zzs()) {
            runnable.run();
        } else {
            this.zza.zzaz().zzp(runnable);
        }
    }
}
