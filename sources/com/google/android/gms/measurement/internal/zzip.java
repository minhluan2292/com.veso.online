package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
public final class zzip extends zzf {
    protected zzio zza;
    final zzs zzb;
    protected boolean zzc = true;
    private zzhk zzd;
    private final Set zze = new CopyOnWriteArraySet();
    private boolean zzf;
    private final AtomicReference zzg = new AtomicReference();
    private final Object zzh = new Object();
    private zzai zzi = new zzai((Boolean) null, (Boolean) null);
    private int zzj = 100;
    private final AtomicLong zzk = new AtomicLong(0);
    private long zzl = -1;
    private int zzm = 100;
    private final zzls zzn = new zzid(this);

    protected zzip(zzgk zzgk) {
        super(zzgk);
        this.zzb = new zzs(zzgk);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzac */
    public final void zzC(Bundle bundle, long j) {
        if (TextUtils.isEmpty(this.zzs.zzh().zzm())) {
            zzS(bundle, 0, j);
        } else {
            this.zzs.zzay().zzl().zza("Using developer consent only; google app id found");
        }
    }

    /* access modifiers changed from: private */
    public final void zzad(Boolean bool, boolean z) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzs.zzm().zzh(bool);
        if (z) {
            zzfp zzm2 = this.zzs.zzm();
            zzgk zzgk = zzm2.zzs;
            zzm2.zzg();
            SharedPreferences.Editor edit = zzm2.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzs.zzK() || (bool != null && !bool.booleanValue())) {
            zzae();
        }
    }

    /* access modifiers changed from: private */
    public final void zzae() {
        zzg();
        String zza2 = this.zzs.zzm().zzh.zza();
        if (zza2 != null) {
            if ("unset".equals(zza2)) {
                zzaa("app", "_npa", (Object) null, this.zzs.zzav().currentTimeMillis());
            } else {
                zzaa("app", "_npa", Long.valueOf(true != "true".equals(zza2) ? 0 : 1), this.zzs.zzav().currentTimeMillis());
            }
        }
        if (!this.zzs.zzJ() || !this.zzc) {
            this.zzs.zzay().zzc().zza("Updating Scion state (FE)");
            this.zzs.zzt().zzI();
            return;
        }
        this.zzs.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzz();
        zzoo.zzc();
        if (this.zzs.zzf().zzs((String) null, zzen.zzae)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzs.zzaz().zzp(new zzhs(this));
    }

    static /* bridge */ /* synthetic */ void zzv(zzip zzip, zzai zzai, zzai zzai2) {
        boolean z;
        zzah[] zzahArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            zzah zzah = zzahArr[i];
            if (!zzai2.zzi(zzah) && zzai.zzi(zzah)) {
                z = true;
                break;
            }
            i++;
        }
        boolean zzl2 = zzai.zzl(zzai2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z || zzl2) {
            zzip.zzs.zzh().zzo();
        }
    }

    static /* synthetic */ void zzw(zzip zzip, zzai zzai, int i, long j, boolean z, boolean z2) {
        zzip.zzg();
        zzip.zza();
        if (j > zzip.zzl || !zzai.zzj(zzip.zzm, i)) {
            zzfp zzm2 = zzip.zzs.zzm();
            zzgk zzgk = zzm2.zzs;
            zzm2.zzg();
            if (zzm2.zzl(i)) {
                SharedPreferences.Editor edit = zzm2.zza().edit();
                edit.putString("consent_settings", zzai.zzh());
                edit.putInt("consent_source", i);
                edit.apply();
                zzip.zzl = j;
                zzip.zzm = i;
                zzip.zzs.zzt().zzF(z);
                if (z2) {
                    zzip.zzs.zzt().zzu(new AtomicReference());
                    return;
                }
                return;
            }
            zzip.zzs.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        zzip.zzs.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzai);
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzs.zzaz().zzp(new zzhz(this, bundle2));
    }

    public final void zzB() {
        if ((this.zzs.zzau().getApplicationContext() instanceof Application) && this.zza != null) {
            ((Application) this.zzs.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzD(Bundle bundle) {
        if (bundle == null) {
            this.zzs.zzm().zzr.zzb(new Bundle());
            return;
        }
        Bundle zza2 = this.zzs.zzm().zzr.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzs.zzv().zzaf(obj)) {
                    this.zzs.zzv().zzN(this.zzn, (String) null, 27, (String) null, (String) null, 0);
                }
                this.zzs.zzay().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlt.zzah(str)) {
                this.zzs.zzay().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza2.remove(str);
            } else {
                zzlt zzv = this.zzs.zzv();
                this.zzs.zzf();
                if (zzv.zzaa("param", str, 100, obj)) {
                    this.zzs.zzv().zzO(zza2, str, obj);
                }
            }
        }
        this.zzs.zzv();
        int zzc2 = this.zzs.zzf().zzc();
        if (zza2.size() > zzc2) {
            int i = 0;
            for (String str2 : new TreeSet(zza2.keySet())) {
                i++;
                if (i > zzc2) {
                    zza2.remove(str2);
                }
            }
            this.zzs.zzv().zzN(this.zzn, (String) null, 26, (String) null, (String) null, 0);
            this.zzs.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzs.zzm().zzr.zzb(zza2);
        this.zzs.zzt().zzH(zza2);
    }

    public final void zzE(String str, String str2, Bundle bundle) {
        zzF(str, str2, bundle, true, true, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzF(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str2;
        String str4 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str3 == FirebaseAnalytics.Event.SCREEN_VIEW || (str3 != null && str2.equals(FirebaseAnalytics.Event.SCREEN_VIEW))) {
            this.zzs.zzs().zzx(bundle2, j);
            return;
        }
        boolean z3 = true;
        if (z2 && this.zzd != null && !zzlt.zzah(str2)) {
            z3 = false;
        }
        zzN(str4, str2, j, bundle2, z2, z3, z, (String) null);
    }

    public final void zzG(String str, String str2, Bundle bundle, String str3) {
        zzgk.zzO();
        zzN(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str2, this.zzs.zzav().currentTimeMillis(), bundle, false, true, true, str3);
    }

    /* access modifiers changed from: package-private */
    public final void zzH(String str, String str2, Bundle bundle) {
        zzg();
        zzI(str, str2, this.zzs.zzav().currentTimeMillis(), bundle);
    }

    /* access modifiers changed from: package-private */
    public final void zzI(String str, String str2, long j, Bundle bundle) {
        zzg();
        zzJ(str, str2, j, bundle, true, this.zzd == null || zzlt.zzah(str2), true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzJ(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r24)
            r19.zzg()
            r19.zza()
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs
            boolean r0 = r0.zzJ()
            if (r0 == 0) goto L_0x0512
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzer r0 = r0.zzh()
            java.util.List r0 = r0.zzn()
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0031
            goto L_0x0041
        L_0x0031:
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzc()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.zzc(r1, r9, r8)
            return
        L_0x0041:
            boolean r0 = r7.zzf
            r13 = 0
            r14 = 0
            r15 = 1
            if (r0 != 0) goto L_0x00a1
            r7.zzf = r15
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r0 = r0.zzN()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r1 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r0 = r0.zzau()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r1, r15, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            com.google.android.gms.measurement.internal.zzgk r2 = r7.zzs     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.zzau()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.zzfa r1 = r1.zzay()     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzk()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.zzb(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzi()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.zza(r1)
        L_0x00a1:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00cd
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            r1.zzaw()
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs
            com.google.android.gms.common.util.Clock r0 = r0.zzav()
            long r5 = r0.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r19
            r1.zzaa(r2, r3, r4, r5)
        L_0x00cd:
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs
            r0.zzaw()
            if (r25 == 0) goto L_0x00ef
            boolean r0 = com.google.android.gms.measurement.internal.zzlt.zzal(r21)
            if (r0 == 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzlt r0 = r0.zzv()
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzfp r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzfk r1 = r1.zzr
            android.os.Bundle r1 = r1.zza()
            r0.zzL(r12, r1)
        L_0x00ef:
            r0 = 40
            if (r27 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            r1.zzaw()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzlt r1 = r1.zzv()
            java.lang.String r2 = "event"
            boolean r3 = r1.zzac(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            java.lang.String[] r3 = com.google.android.gms.measurement.internal.zzhh.zza
            java.lang.String[] r5 = com.google.android.gms.measurement.internal.zzhh.zzb
            boolean r3 = r1.zzZ(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x011d
            r4 = 13
            goto L_0x012a
        L_0x011d:
            com.google.android.gms.measurement.internal.zzgk r3 = r1.zzs
            r3.zzf()
            boolean r1 = r1.zzY(r2, r0, r9)
            if (r1 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r4 = r14
        L_0x012a:
            if (r4 == 0) goto L_0x0177
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzfa r1 = r1.zzay()
            com.google.android.gms.measurement.internal.zzey r1 = r1.zze()
            com.google.android.gms.measurement.internal.zzgk r2 = r7.zzs
            com.google.android.gms.measurement.internal.zzev r2 = r2.zzj()
            java.lang.String r2 = r2.zzd(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.zzb(r3, r2)
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzlt r1 = r1.zzv()
            com.google.android.gms.measurement.internal.zzgk r2 = r7.zzs
            r2.zzf()
            java.lang.String r0 = r1.zzD(r9, r0, r15)
            if (r9 == 0) goto L_0x015a
            int r14 = r21.length()
        L_0x015a:
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzlt r1 = r1.zzv()
            com.google.android.gms.measurement.internal.zzls r2 = r7.zzn
            r3 = 0
            java.lang.String r5 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r14
            r20.zzN(r21, r22, r23, r24, r25, r26)
            return
        L_0x0177:
            com.google.android.gms.internal.measurement.zzpp.zzc()
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzag r1 = r1.zzf()
            com.google.android.gms.measurement.internal.zzem r2 = com.google.android.gms.measurement.internal.zzen.zzat
            boolean r1 = r1.zzs(r13, r2)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x01ae
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            r1.zzaw()
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzje r1 = r1.zzs()
            com.google.android.gms.measurement.internal.zziw r1 = r1.zzj(r14)
            if (r1 == 0) goto L_0x01a3
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01a3
            r1.zzd = r15
        L_0x01a3:
            if (r25 == 0) goto L_0x01a9
            if (r27 != 0) goto L_0x01a9
            r3 = r15
            goto L_0x01aa
        L_0x01a9:
            r3 = r14
        L_0x01aa:
            com.google.android.gms.measurement.internal.zzlt.zzK(r1, r12, r3)
            goto L_0x01d1
        L_0x01ae:
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            r1.zzaw()
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzje r1 = r1.zzs()
            com.google.android.gms.measurement.internal.zziw r1 = r1.zzj(r14)
            if (r1 == 0) goto L_0x01c7
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01c7
            r1.zzd = r15
        L_0x01c7:
            if (r25 == 0) goto L_0x01cd
            if (r27 != 0) goto L_0x01cd
            r3 = r15
            goto L_0x01ce
        L_0x01cd:
            r3 = r14
        L_0x01ce:
            com.google.android.gms.measurement.internal.zzlt.zzK(r1, r12, r3)
        L_0x01d1:
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.zzlt.zzah(r21)
            if (r25 == 0) goto L_0x021e
            com.google.android.gms.measurement.internal.zzhk r4 = r7.zzd
            if (r4 == 0) goto L_0x021e
            if (r3 != 0) goto L_0x021e
            if (r1 == 0) goto L_0x01e8
            r16 = r15
            goto L_0x0220
        L_0x01e8:
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzc()
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzev r1 = r1.zzj()
            java.lang.String r1 = r1.zzd(r9)
            com.google.android.gms.measurement.internal.zzgk r2 = r7.zzs
            com.google.android.gms.measurement.internal.zzev r2 = r2.zzj()
            java.lang.String r2 = r2.zzb(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.zzc(r3, r1, r2)
            com.google.android.gms.measurement.internal.zzhk r0 = r7.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzhk r1 = r7.zzd
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.interceptEvent(r2, r3, r4, r5)
            return
        L_0x021e:
            r16 = r1
        L_0x0220:
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            boolean r1 = r1.zzM()
            if (r1 == 0) goto L_0x0511
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzlt r1 = r1.zzv()
            int r1 = r1.zzh(r9)
            if (r1 == 0) goto L_0x027e
            com.google.android.gms.measurement.internal.zzgk r2 = r7.zzs
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()
            com.google.android.gms.measurement.internal.zzey r2 = r2.zze()
            com.google.android.gms.measurement.internal.zzgk r3 = r7.zzs
            com.google.android.gms.measurement.internal.zzev r3 = r3.zzj()
            java.lang.String r3 = r3.zzd(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.zzb(r4, r3)
            com.google.android.gms.measurement.internal.zzgk r2 = r7.zzs
            com.google.android.gms.measurement.internal.zzlt r2 = r2.zzv()
            com.google.android.gms.measurement.internal.zzgk r3 = r7.zzs
            r3.zzf()
            java.lang.String r0 = r2.zzD(r9, r0, r15)
            if (r9 == 0) goto L_0x0262
            int r14 = r21.length()
        L_0x0262:
            com.google.android.gms.measurement.internal.zzgk r2 = r7.zzs
            com.google.android.gms.measurement.internal.zzlt r2 = r2.zzv()
            com.google.android.gms.measurement.internal.zzls r3 = r7.zzn
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r14
            r20.zzN(r21, r22, r23, r24, r25, r26)
            return
        L_0x027e:
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r3 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r5 = com.google.android.gms.common.util.CollectionUtils.listOf((T[]) r1)
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzlt r1 = r1.zzv()
            r2 = r28
            r3 = r21
            r4 = r24
            r6 = r27
            android.os.Bundle r12 = r1.zzy(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            r1.zzaw()
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzje r1 = r1.zzs()
            com.google.android.gms.measurement.internal.zziw r1 = r1.zzj(r14)
            r5 = 0
            java.lang.String r4 = "_ae"
            if (r1 == 0) goto L_0x02e3
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x02e3
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r1 = r1.zzu()
            com.google.android.gms.measurement.internal.zzks r1 = r1.zzb
            com.google.android.gms.measurement.internal.zzku r2 = r1.zzc
            com.google.android.gms.measurement.internal.zzgk r2 = r2.zzs
            com.google.android.gms.common.util.Clock r2 = r2.zzav()
            long r2 = r2.elapsedRealtime()
            long r14 = r1.zzb
            long r14 = r2 - r14
            r1.zzb = r2
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x02e3
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzlt r1 = r1.zzv()
            r1.zzI(r12, r14)
        L_0x02e3:
            com.google.android.gms.internal.measurement.zzoc.zzc()
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzag r1 = r1.zzf()
            com.google.android.gms.measurement.internal.zzem r2 = com.google.android.gms.measurement.internal.zzen.zzad
            boolean r1 = r1.zzs(r13, r2)
            if (r1 == 0) goto L_0x036d
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x034c
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x034c
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzlt r1 = r1.zzv()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r2)
            if (r3 == 0) goto L_0x0318
            r2 = r13
            goto L_0x031e
        L_0x0318:
            if (r2 == 0) goto L_0x031e
            java.lang.String r2 = r2.trim()
        L_0x031e:
            com.google.android.gms.measurement.internal.zzgk r3 = r1.zzs
            com.google.android.gms.measurement.internal.zzfp r3 = r3.zzm()
            com.google.android.gms.measurement.internal.zzfo r3 = r3.zzo
            java.lang.String r3 = r3.zza()
            boolean r3 = com.google.android.gms.measurement.internal.zzlr.zza(r2, r3)
            if (r3 != 0) goto L_0x033c
            com.google.android.gms.measurement.internal.zzgk r1 = r1.zzs
            com.google.android.gms.measurement.internal.zzfp r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzfo r1 = r1.zzo
            r1.zzb(r2)
            goto L_0x036d
        L_0x033c:
            com.google.android.gms.measurement.internal.zzgk r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzc()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.zza(r1)
            return
        L_0x034c:
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x036d
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzlt r1 = r1.zzv()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.zzs
            com.google.android.gms.measurement.internal.zzfp r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzfo r1 = r1.zzo
            java.lang.String r1 = r1.zza()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x036d
            r12.putString(r2, r1)
        L_0x036d:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzfp r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzfl r1 = r1.zzj
            long r1 = r1.zza()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x03ef
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzfp r1 = r1.zzm()
            boolean r1 = r1.zzk(r10)
            if (r1 == 0) goto L_0x03ef
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzfp r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzfj r1 = r1.zzl
            boolean r1 = r1.zzb()
            if (r1 == 0) goto L_0x03ef
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzfa r1 = r1.zzay()
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzj()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.zza(r2)
            r15 = 0
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.common.util.Clock r1 = r1.zzav()
            long r17 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sid"
            r1 = r19
            r13 = r4
            r4 = r15
            r8 = r5
            r5 = r17
            r1.zzaa(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.common.util.Clock r1 = r1.zzav()
            long r5 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r19
            r1.zzaa(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.common.util.Clock r1 = r1.zzav()
            long r5 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r19
            r1.zzaa(r2, r3, r4, r5)
            goto L_0x03f1
        L_0x03ef:
            r13 = r4
            r8 = r5
        L_0x03f1:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r8)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0418
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzfa r1 = r1.zzay()
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzj()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r1 = r1.zzu()
            com.google.android.gms.measurement.internal.zzkt r1 = r1.zza
            r2 = 1
            r1.zzb(r10, r2)
        L_0x0418:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0429:
            if (r3 >= r2) goto L_0x0477
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0474
            com.google.android.gms.measurement.internal.zzgk r5 = r7.zzs
            r5.zzv()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0449
            r6 = 1
            android.os.Bundle[] r8 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r8[r6] = r5
            goto L_0x046f
        L_0x0449:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x045a
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r8 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r8)
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x046f
        L_0x045a:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x046e
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x046f
        L_0x046e:
            r8 = 0
        L_0x046f:
            if (r8 == 0) goto L_0x0474
            r12.putParcelableArray(r4, r8)
        L_0x0474:
            int r3 = r3 + 1
            goto L_0x0429
        L_0x0477:
            r8 = 0
        L_0x0478:
            int r1 = r14.size()
            if (r8 >= r1) goto L_0x04e1
            java.lang.Object r1 = r14.get(r8)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r8 == 0) goto L_0x048b
            java.lang.String r2 = "_ep"
            r9 = r20
            goto L_0x048f
        L_0x048b:
            r9 = r20
            r2 = r21
        L_0x048f:
            r1.putString(r0, r9)
            if (r26 == 0) goto L_0x049e
            com.google.android.gms.measurement.internal.zzgk r3 = r7.zzs
            com.google.android.gms.measurement.internal.zzlt r3 = r3.zzv()
            android.os.Bundle r1 = r3.zzt(r1)
        L_0x049e:
            r12 = r1
            com.google.android.gms.measurement.internal.zzaw r15 = new com.google.android.gms.measurement.internal.zzaw
            com.google.android.gms.measurement.internal.zzau r3 = new com.google.android.gms.measurement.internal.zzau
            r3.<init>(r12)
            r1 = r15
            r4 = r20
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzke r1 = r1.zzt()
            r5 = r28
            r1.zzA(r15, r5)
            if (r16 != 0) goto L_0x04de
            java.util.Set r1 = r7.zze
            java.util.Iterator r15 = r1.iterator()
        L_0x04c1:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x04de
            java.lang.Object r1 = r15.next()
            com.google.android.gms.measurement.internal.zzhl r1 = (com.google.android.gms.measurement.internal.zzhl) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r12)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.onEvent(r2, r3, r4, r5)
            r5 = r28
            goto L_0x04c1
        L_0x04de:
            int r8 = r8 + 1
            goto L_0x0478
        L_0x04e1:
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs
            r0.zzaw()
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzje r0 = r0.zzs()
            r1 = 0
            com.google.android.gms.measurement.internal.zziw r0 = r0.zzj(r1)
            if (r0 == 0) goto L_0x0511
            r1 = r21
            boolean r0 = r13.equals(r1)
            if (r0 == 0) goto L_0x0511
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r0 = r0.zzu()
            com.google.android.gms.measurement.internal.zzgk r1 = r7.zzs
            com.google.android.gms.common.util.Clock r1 = r1.zzav()
            long r1 = r1.elapsedRealtime()
            com.google.android.gms.measurement.internal.zzks r0 = r0.zzb
            r3 = 1
            r0.zzd(r3, r3, r1)
        L_0x0511:
            return
        L_0x0512:
            com.google.android.gms.measurement.internal.zzgk r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzc()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.zza(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzip.zzJ(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void zzK(zzhl zzhl) {
        zza();
        Preconditions.checkNotNull(zzhl);
        if (!this.zze.add(zzhl)) {
            this.zzs.zzay().zzk().zza("OnEventListener already registered");
        }
    }

    public final void zzL(long j) {
        this.zzg.set((Object) null);
        this.zzs.zzaz().zzp(new zzhx(this, j));
    }

    /* access modifiers changed from: package-private */
    public final void zzM(long j, boolean z) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zza("Resetting analytics data (FE)");
        zzku zzu = this.zzs.zzu();
        zzu.zzg();
        zzkt zzkt = zzu.zza;
        zzu.zzb.zza();
        zzps.zzc();
        if (this.zzs.zzf().zzs((String) null, zzen.zzaI)) {
            this.zzs.zzh().zzo();
        }
        boolean zzJ = this.zzs.zzJ();
        zzfp zzm2 = this.zzs.zzm();
        zzm2.zzc.zzb(j);
        if (!TextUtils.isEmpty(zzm2.zzs.zzm().zzo.zza())) {
            zzm2.zzo.zzb((String) null);
        }
        zzoo.zzc();
        if (zzm2.zzs.zzf().zzs((String) null, zzen.zzae)) {
            zzm2.zzj.zzb(0);
        }
        if (!zzm2.zzs.zzf().zzv()) {
            zzm2.zzi(!zzJ);
        }
        zzm2.zzp.zzb((String) null);
        zzm2.zzq.zzb(0);
        zzm2.zzr.zzb((Bundle) null);
        if (z) {
            this.zzs.zzt().zzC();
        }
        zzoo.zzc();
        if (this.zzs.zzf().zzs((String) null, zzen.zzae)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    /* access modifiers changed from: protected */
    public final void zzN(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.zzs.zzaz().zzp(new zzhu(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* access modifiers changed from: package-private */
    public final void zzO(String str, String str2, long j, Object obj) {
        this.zzs.zzaz().zzp(new zzhv(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    public final void zzP(String str) {
        this.zzg.set(str);
    }

    public final void zzQ(Bundle bundle) {
        zzR(bundle, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzR(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzs.zzay().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzhg.zza(bundle2, "app_id", String.class, (Object) null);
        zzhg.zza(bundle2, "origin", String.class, (Object) null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, (Object) null);
        zzhg.zza(bundle2, "value", Object.class, (Object) null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, (Object) null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, (Object) null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, (Object) null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, (Object) null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, (Object) null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, (Object) null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, (Object) null);
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Object obj = bundle2.get("value");
        if (this.zzs.zzv().zzl(string) != 0) {
            this.zzs.zzay().zzd().zzb("Invalid conditional user property name", this.zzs.zzj().zzf(string));
        } else if (this.zzs.zzv().zzd(string, obj) == 0) {
            Object zzB = this.zzs.zzv().zzB(string, obj);
            if (zzB == null) {
                this.zzs.zzay().zzd().zzc("Unable to normalize conditional user property value", this.zzs.zzj().zzf(string), obj);
                return;
            }
            zzhg.zzb(bundle2, zzB);
            long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
            if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                this.zzs.zzf();
                if (j2 > 15552000000L || j2 < 1) {
                    this.zzs.zzay().zzd().zzc("Invalid conditional user property timeout", this.zzs.zzj().zzf(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
            this.zzs.zzf();
            if (j3 > 15552000000L || j3 < 1) {
                this.zzs.zzay().zzd().zzc("Invalid conditional user property time to live", this.zzs.zzj().zzf(string), Long.valueOf(j3));
            } else {
                this.zzs.zzaz().zzp(new zzhy(this, bundle2));
            }
        } else {
            this.zzs.zzay().zzd().zzc("Invalid conditional user property value", this.zzs.zzj().zzf(string), obj);
        }
    }

    public final void zzS(Bundle bundle, int i, long j) {
        zza();
        String zzg2 = zzai.zzg(bundle);
        if (zzg2 != null) {
            this.zzs.zzay().zzl().zzb("Ignoring invalid consent setting", zzg2);
            this.zzs.zzay().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzT(zzai.zza(bundle), i, j);
    }

    public final void zzT(zzai zzai, int i, long j) {
        zzai zzai2;
        boolean z;
        boolean z2;
        boolean z3;
        zzai zzai3 = zzai;
        int i2 = i;
        zza();
        if (i2 != -10 && zzai.zze() == null && zzai.zzf() == null) {
            this.zzs.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            zzai2 = this.zzi;
            z = true;
            z2 = false;
            if (zzai.zzj(i2, this.zzj)) {
                boolean zzk2 = zzai3.zzk(this.zzi);
                if (zzai3.zzi(zzah.ANALYTICS_STORAGE) && !this.zzi.zzi(zzah.ANALYTICS_STORAGE)) {
                    z2 = true;
                }
                zzai3 = zzai3.zzd(this.zzi);
                this.zzi = zzai3;
                this.zzj = i2;
                z3 = z2;
                z2 = zzk2;
            } else {
                z = false;
                z3 = false;
            }
        }
        if (!z) {
            this.zzs.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzai3);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (z2) {
            this.zzg.set((Object) null);
            this.zzs.zzaz().zzq(new zzij(this, zzai3, j, i, andIncrement, z3, zzai2));
            return;
        }
        zzik zzik = new zzik(this, zzai3, i, andIncrement, z3, zzai2);
        if (i2 == 30 || i2 == -10) {
            this.zzs.zzaz().zzq(zzik);
        } else {
            this.zzs.zzaz().zzp(zzik);
        }
    }

    public final void zzU(Bundle bundle, long j) {
        zzof.zzc();
        if (this.zzs.zzf().zzs((String) null, zzen.zzal)) {
            this.zzs.zzaz().zzq(new zzho(this, bundle, j));
        } else {
            zzC(bundle, j);
        }
    }

    public final void zzV(zzhk zzhk) {
        zzhk zzhk2;
        zzg();
        zza();
        if (!(zzhk == null || zzhk == (zzhk2 = this.zzd))) {
            Preconditions.checkState(zzhk2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzhk;
    }

    public final void zzW(Boolean bool) {
        zza();
        this.zzs.zzaz().zzp(new zzii(this, bool));
    }

    /* access modifiers changed from: package-private */
    public final void zzX(zzai zzai) {
        zzg();
        boolean z = (zzai.zzi(zzah.ANALYTICS_STORAGE) && zzai.zzi(zzah.AD_STORAGE)) || this.zzs.zzt().zzM();
        if (z != this.zzs.zzK()) {
            this.zzs.zzG(z);
            zzfp zzm2 = this.zzs.zzm();
            zzgk zzgk = zzm2.zzs;
            zzm2.zzg();
            Boolean valueOf = zzm2.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzm2.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                zzad(Boolean.valueOf(z), false);
            }
        }
    }

    public final void zzY(String str, String str2, Object obj, boolean z) {
        zzZ(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", obj, true, this.zzs.zzav().currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzaa(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzg()
            r8.zza()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0064
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0052
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0052
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L_0x0037
            r10 = 0
            goto L_0x0038
        L_0x0037:
            r10 = r2
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.zzgk r10 = r8.zzs
            com.google.android.gms.measurement.internal.zzfp r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzfo r10 = r10.zzh
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x004e
            java.lang.String r0 = "true"
        L_0x004e:
            r10.zzb(r0)
            goto L_0x0061
        L_0x0052:
            if (r11 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.zzgk r10 = r8.zzs
            com.google.android.gms.measurement.internal.zzfp r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzfo r10 = r10.zzh
            java.lang.String r0 = "unset"
            r10.zzb(r0)
        L_0x0061:
            r6 = r11
            r3 = r1
            goto L_0x0066
        L_0x0064:
            r3 = r10
            r6 = r11
        L_0x0066:
            com.google.android.gms.measurement.internal.zzgk r10 = r8.zzs
            boolean r10 = r10.zzJ()
            if (r10 != 0) goto L_0x007e
            com.google.android.gms.measurement.internal.zzgk r9 = r8.zzs
            com.google.android.gms.measurement.internal.zzfa r9 = r9.zzay()
            com.google.android.gms.measurement.internal.zzey r9 = r9.zzj()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.zza(r10)
            return
        L_0x007e:
            com.google.android.gms.measurement.internal.zzgk r10 = r8.zzs
            boolean r10 = r10.zzM()
            if (r10 != 0) goto L_0x0087
            return
        L_0x0087:
            com.google.android.gms.measurement.internal.zzlo r10 = new com.google.android.gms.measurement.internal.zzlo
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzgk r9 = r8.zzs
            com.google.android.gms.measurement.internal.zzke r9 = r9.zzt()
            r9.zzK(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzip.zzaa(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zzab(zzhl zzhl) {
        zza();
        Preconditions.checkNotNull(zzhl);
        if (!this.zze.remove(zzhl)) {
            this.zzs.zzay().zzk().zza("OnEventListener had not been registered");
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzs.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzs.zzaz().zzd(atomicReference, 15000, "boolean test flag value", new zzib(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzs.zzaz().zzd(atomicReference, 15000, "double test flag value", new zzih(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzs.zzaz().zzd(atomicReference, 15000, "int test flag value", new zzig(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzs.zzaz().zzd(atomicReference, 15000, "long test flag value", new zzif(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zziw zzi2 = this.zzs.zzs().zzi();
        if (zzi2 != null) {
            return zzi2.zzb;
        }
        return null;
    }

    public final String zzq() {
        zziw zzi2 = this.zzs.zzs().zzi();
        if (zzi2 != null) {
            return zzi2.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzs.zzaz().zzd(atomicReference, 15000, "String test flag value", new zzie(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzs.zzaw();
        if (zzab.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000, "get conditional user properties", new zzia(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzlt.zzH(list);
        }
        this.zzs.zzay().zzd().zzb("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    public final List zzt(boolean z) {
        zza();
        this.zzs.zzay().zzj().zza("Getting user properties (FE)");
        if (!this.zzs.zzaz().zzs()) {
            this.zzs.zzaw();
            if (zzab.zza()) {
                this.zzs.zzay().zzd().zza("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzs.zzaz().zzd(atomicReference, 5000, "get user properties", new zzhw(this, atomicReference, z));
            List list = (List) atomicReference.get();
            if (list != null) {
                return list;
            }
            this.zzs.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyList();
        }
        this.zzs.zzay().zzd().zza("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzs.zzaw();
        if (zzab.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000, "get user properties", new zzic(this, atomicReference, (String) null, str, str2, z));
        List<zzlo> list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzlo zzlo : list) {
            Object zza2 = zzlo.zza();
            if (zza2 != null) {
                arrayMap.put(zzlo.zzb, zza2);
            }
        }
        return arrayMap;
    }

    public final void zzz() {
        zzg();
        zza();
        if (this.zzs.zzM()) {
            if (this.zzs.zzf().zzs((String) null, zzen.zzY)) {
                zzag zzf2 = this.zzs.zzf();
                zzf2.zzs.zzaw();
                Boolean zzk2 = zzf2.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk2 != null && zzk2.booleanValue()) {
                    this.zzs.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzs.zzaz().zzp(new zzhr(this));
                }
            }
            this.zzs.zzt().zzq();
            this.zzc = false;
            zzfp zzm2 = this.zzs.zzm();
            zzm2.zzg();
            String string = zzm2.zza().getString("previous_os_version", (String) null);
            zzm2.zzs.zzg().zzu();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm2.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.zzs.zzg().zzu();
                if (!string.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    zzH(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzZ(java.lang.String r16, java.lang.String r17, java.lang.Object r18, boolean r19, long r20) {
        /*
            r15 = this;
            r6 = r15
            r2 = r17
            r0 = r18
            if (r16 != 0) goto L_0x000a
            java.lang.String r1 = "app"
            goto L_0x000c
        L_0x000a:
            r1 = r16
        L_0x000c:
            r3 = 6
            r4 = 0
            r5 = 24
            if (r19 == 0) goto L_0x001e
            com.google.android.gms.measurement.internal.zzgk r3 = r6.zzs
            com.google.android.gms.measurement.internal.zzlt r3 = r3.zzv()
            int r3 = r3.zzl(r2)
        L_0x001c:
            r11 = r3
            goto L_0x0046
        L_0x001e:
            com.google.android.gms.measurement.internal.zzgk r7 = r6.zzs
            com.google.android.gms.measurement.internal.zzlt r7 = r7.zzv()
            java.lang.String r8 = "user property"
            boolean r9 = r7.zzac(r8, r2)
            if (r9 != 0) goto L_0x002d
        L_0x002c:
            goto L_0x001c
        L_0x002d:
            java.lang.String[] r9 = com.google.android.gms.measurement.internal.zzhj.zza
            r10 = 0
            boolean r9 = r7.zzZ(r8, r9, r10, r2)
            if (r9 != 0) goto L_0x0039
            r3 = 15
            goto L_0x001c
        L_0x0039:
            com.google.android.gms.measurement.internal.zzgk r9 = r7.zzs
            r9.zzf()
            boolean r7 = r7.zzY(r8, r5, r2)
            if (r7 != 0) goto L_0x0045
            goto L_0x002c
        L_0x0045:
            r11 = r4
        L_0x0046:
            r3 = 1
            if (r11 == 0) goto L_0x006e
            com.google.android.gms.measurement.internal.zzgk r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzlt r0 = r0.zzv()
            com.google.android.gms.measurement.internal.zzgk r1 = r6.zzs
            r1.zzf()
            java.lang.String r13 = r0.zzD(r2, r5, r3)
            if (r2 == 0) goto L_0x005e
            int r4 = r17.length()
        L_0x005e:
            r14 = r4
            com.google.android.gms.measurement.internal.zzgk r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzlt r8 = r0.zzv()
            com.google.android.gms.measurement.internal.zzls r9 = r6.zzn
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.zzN(r9, r10, r11, r12, r13, r14)
            return
        L_0x006e:
            if (r0 == 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.zzgk r7 = r6.zzs
            com.google.android.gms.measurement.internal.zzlt r7 = r7.zzv()
            int r11 = r7.zzd(r2, r0)
            if (r11 == 0) goto L_0x00ab
            com.google.android.gms.measurement.internal.zzgk r1 = r6.zzs
            com.google.android.gms.measurement.internal.zzlt r1 = r1.zzv()
            com.google.android.gms.measurement.internal.zzgk r7 = r6.zzs
            r7.zzf()
            java.lang.String r13 = r1.zzD(r2, r5, r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x0093
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L_0x009b
        L_0x0093:
            java.lang.String r0 = r18.toString()
            int r4 = r0.length()
        L_0x009b:
            r14 = r4
            com.google.android.gms.measurement.internal.zzgk r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzlt r8 = r0.zzv()
            com.google.android.gms.measurement.internal.zzls r9 = r6.zzn
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.zzN(r9, r10, r11, r12, r13, r14)
            return
        L_0x00ab:
            com.google.android.gms.measurement.internal.zzgk r3 = r6.zzs
            com.google.android.gms.measurement.internal.zzlt r3 = r3.zzv()
            java.lang.Object r5 = r3.zzB(r2, r0)
            if (r5 == 0) goto L_0x00bf
            r0 = r15
            r2 = r17
            r3 = r20
            r0.zzO(r1, r2, r3, r5)
        L_0x00bf:
            return
        L_0x00c0:
            r5 = 0
            r0 = r15
            r2 = r17
            r3 = r20
            r0.zzO(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzip.zzZ(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }
}
