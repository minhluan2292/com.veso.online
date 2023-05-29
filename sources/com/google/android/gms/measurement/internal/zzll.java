package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.internal.measurement.zzpj;
import com.google.android.gms.internal.measurement.zzpp;
import com.google.android.gms.internal.measurement.zzps;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final class zzll implements zzhf {
    private static volatile zzll zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zziw zzD;
    private String zzE;
    private final zzls zzF = new zzlg(this);
    long zza;
    private final zzgb zzc;
    private final zzfg zzd;
    private zzam zze;
    private zzfi zzf;
    private zzkx zzg;
    private zzaa zzh;
    private final zzln zzi;
    private zziu zzj;
    private zzkg zzk;
    private final zzla zzl;
    private zzfs zzm;
    /* access modifiers changed from: private */
    public final zzgk zzn;
    private boolean zzo = false;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;

    zzll(zzlm zzlm, zzgk zzgk) {
        Preconditions.checkNotNull(zzlm);
        this.zzn = zzgk.zzp(zzlm.zza, (zzcl) null, (Long) null);
        this.zzA = -1;
        this.zzl = new zzla(this);
        zzln zzln = new zzln(this);
        zzln.zzX();
        this.zzi = zzln;
        zzfg zzfg = new zzfg(this);
        zzfg.zzX();
        this.zzd = zzfg;
        zzgb zzgb = new zzgb(this);
        zzgb.zzX();
        this.zzc = zzgb;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaz().zzp(new zzlb(this, zzlm));
    }

    static final void zzZ(zzfr zzfr, int i, String str) {
        List zzp2 = zzfr.zzp();
        int i2 = 0;
        while (i2 < zzp2.size()) {
            if (!"_err".equals(((zzfw) zzp2.get(i2)).zzg())) {
                i2++;
            } else {
                return;
            }
        }
        zzfv zze2 = zzfw.zze();
        zze2.zzj("_err");
        zze2.zzi(Long.valueOf((long) i).longValue());
        zzfv zze3 = zzfw.zze();
        zze3.zzj("_ev");
        zze3.zzk(str);
        zzfr.zzf((zzfw) zze2.zzaE());
        zzfr.zzf((zzfw) zze3.zzaE());
    }

    static final void zzaa(zzfr zzfr, String str) {
        List zzp2 = zzfr.zzp();
        for (int i = 0; i < zzp2.size(); i++) {
            if (str.equals(((zzfw) zzp2.get(i)).zzg())) {
                zzfr.zzh(i);
                return;
            }
        }
    }

    private final zzq zzab(String str) {
        String str2 = str;
        zzam zzam = this.zze;
        zzak(zzam);
        zzh zzj2 = zzam.zzj(str2);
        if (zzj2 == null || TextUtils.isEmpty(zzj2.zzw())) {
            zzay().zzc().zzb("No app data available; dropping", str2);
            return null;
        }
        Boolean zzac = zzac(zzj2);
        if (zzac == null || zzac.booleanValue()) {
            zzh zzh2 = zzj2;
            return new zzq(str, zzj2.zzy(), zzj2.zzw(), zzj2.zzb(), zzj2.zzv(), zzj2.zzm(), zzj2.zzj(), (String) null, zzj2.zzaj(), false, zzj2.zzx(), zzh2.zza(), 0, 0, zzh2.zzai(), false, zzh2.zzr(), zzh2.zzq(), zzh2.zzk(), zzh2.zzC(), (String) null, zzh(str).zzh(), "", (String) null);
        }
        zzay().zzd().zzb("App version does not match; dropping. appId", zzfa.zzn(str));
        return null;
    }

    private final Boolean zzac(zzh zzh2) {
        try {
            if (zzh2.zzb() != -2147483648L) {
                if (zzh2.zzb() == ((long) Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzh2.zzt(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzh2.zzt(), 0).versionName;
                String zzw2 = zzh2.zzw();
                if (zzw2 != null && zzw2.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzad() {
        zzaz().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzay().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzay().zzj().zza("Stopping uploading service(s)");
        List<Runnable> list = this.zzq;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) Preconditions.checkNotNull(this.zzq)).clear();
        }
    }

    private final void zzae(zzgb zzgb, long j, boolean z) {
        zzlq zzlq;
        String str = true != z ? "_lte" : "_se";
        zzam zzam = this.zze;
        zzak(zzam);
        zzlq zzp2 = zzam.zzp(zzgb.zzaq(), str);
        if (zzp2 == null || zzp2.zze == null) {
            zzlq = new zzlq(zzgb.zzaq(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str, zzav().currentTimeMillis(), Long.valueOf(j));
        } else {
            zzlq = new zzlq(zzgb.zzaq(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str, zzav().currentTimeMillis(), Long.valueOf(((Long) zzp2.zze).longValue() + j));
        }
        zzgk zzd2 = zzgl.zzd();
        zzd2.zzf(str);
        zzd2.zzg(zzav().currentTimeMillis());
        zzd2.zze(((Long) zzlq.zze).longValue());
        zzgl zzgl = (zzgl) zzd2.zzaE();
        int zza2 = zzln.zza(zzgb, str);
        if (zza2 >= 0) {
            zzgb.zzan(zza2, zzgl);
        } else {
            zzgb.zzm(zzgl);
        }
        if (j > 0) {
            zzam zzam2 = this.zze;
            zzak(zzam2);
            zzam2.zzL(zzlq);
            zzay().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzlq.zze);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0237  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzaf() {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.zzgh r1 = r20.zzaz()
            r1.zzg()
            r20.zzB()
            long r1 = r0.zza
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004e
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            com.google.android.gms.common.util.Clock r5 = r20.zzav()
            long r5 = r5.elapsedRealtime()
            long r7 = r0.zza
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.zzfa r3 = r20.zzay()
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzj()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.zzb(r2, r1)
            com.google.android.gms.measurement.internal.zzfi r1 = r20.zzm()
            r1.zzc()
            com.google.android.gms.measurement.internal.zzkx r1 = r0.zzg
            zzak(r1)
            r1.zza()
            return
        L_0x004c:
            r0.zza = r3
        L_0x004e:
            com.google.android.gms.measurement.internal.zzgk r1 = r0.zzn
            boolean r1 = r1.zzM()
            if (r1 == 0) goto L_0x0254
            boolean r1 = r20.zzah()
            if (r1 != 0) goto L_0x005e
            goto L_0x0254
        L_0x005e:
            com.google.android.gms.common.util.Clock r1 = r20.zzav()
            long r1 = r1.currentTimeMillis()
            r20.zzg()
            com.google.android.gms.measurement.internal.zzem r5 = com.google.android.gms.measurement.internal.zzen.zzz
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.zzam r5 = r0.zze
            zzak(r5)
            boolean r5 = r5.zzH()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.zzam r5 = r0.zze
            zzak(r5)
            boolean r5 = r5.zzG()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00d3
            com.google.android.gms.measurement.internal.zzag r5 = r20.zzg()
            java.lang.String r5 = r5.zzl()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00bf
            r20.zzg()
            com.google.android.gms.measurement.internal.zzem r5 = com.google.android.gms.measurement.internal.zzen.zzu
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00bf:
            r20.zzg()
            com.google.android.gms.measurement.internal.zzem r5 = com.google.android.gms.measurement.internal.zzen.zzt
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00d3:
            r20.zzg()
            com.google.android.gms.measurement.internal.zzem r5 = com.google.android.gms.measurement.internal.zzen.zzs
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        L_0x00e6:
            com.google.android.gms.measurement.internal.zzkg r5 = r0.zzk
            com.google.android.gms.measurement.internal.zzfl r5 = r5.zzc
            long r13 = r5.zza()
            com.google.android.gms.measurement.internal.zzkg r5 = r0.zzk
            com.google.android.gms.measurement.internal.zzfl r5 = r5.zzd
            long r15 = r5.zza()
            com.google.android.gms.measurement.internal.zzam r5 = r0.zze
            zzak(r5)
            r17 = r10
            long r9 = r5.zzd()
            com.google.android.gms.measurement.internal.zzam r5 = r0.zze
            zzak(r5)
            r18 = r7
            long r6 = r5.zze()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
        L_0x0114:
            r7 = r3
            goto L_0x018e
        L_0x0117:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r9 = r1 - r9
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r1, r9)
            long r7 = r5 + r18
            if (r17 == 0) goto L_0x013c
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x013c
            long r7 = java.lang.Math.min(r5, r1)
            long r7 = r7 + r11
        L_0x013c:
            com.google.android.gms.measurement.internal.zzln r13 = r0.zzi
            zzak(r13)
            boolean r13 = r13.zzw(r1, r11)
            if (r13 != 0) goto L_0x0149
            long r7 = r1 + r11
        L_0x0149:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018e
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x018e
            r1 = 0
        L_0x0152:
            r20.zzg()
            r2 = 20
            com.google.android.gms.measurement.internal.zzem r5 = com.google.android.gms.measurement.internal.zzen.zzB
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11 = 0
            int r5 = java.lang.Math.max(r11, r5)
            int r2 = java.lang.Math.min(r2, r5)
            if (r1 >= r2) goto L_0x0114
            r20.zzg()
            com.google.android.gms.measurement.internal.zzem r2 = com.google.android.gms.measurement.internal.zzen.zzA
            java.lang.Object r2 = r2.zza(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            r12 = 1
            long r12 = r12 << r1
            long r5 = r5 * r12
            long r7 = r7 + r5
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x018e
            int r1 = r1 + 1
            goto L_0x0152
        L_0x018e:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0237
            com.google.android.gms.measurement.internal.zzfg r1 = r0.zzd
            zzak(r1)
            boolean r1 = r1.zza()
            if (r1 == 0) goto L_0x021a
            com.google.android.gms.measurement.internal.zzkg r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzfl r1 = r1.zzb
            long r1 = r1.zza()
            r20.zzg()
            com.google.android.gms.measurement.internal.zzem r5 = com.google.android.gms.measurement.internal.zzen.zzq
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzln r9 = r0.zzi
            zzak(r9)
            boolean r9 = r9.zzw(r1, r5)
            if (r9 != 0) goto L_0x01c9
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x01c9:
            com.google.android.gms.measurement.internal.zzfi r1 = r20.zzm()
            r1.zzc()
            com.google.android.gms.common.util.Clock r1 = r20.zzav()
            long r1 = r1.currentTimeMillis()
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0200
            r20.zzg()
            com.google.android.gms.measurement.internal.zzem r1 = com.google.android.gms.measurement.internal.zzen.zzv
            r2 = 0
            java.lang.Object r1 = r1.zza(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.zzkg r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzfl r1 = r1.zzc
            com.google.android.gms.common.util.Clock r2 = r20.zzav()
            long r2 = r2.currentTimeMillis()
            r1.zzb(r2)
        L_0x0200:
            com.google.android.gms.measurement.internal.zzfa r1 = r20.zzay()
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzj()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.zzb(r3, r2)
            com.google.android.gms.measurement.internal.zzkx r1 = r0.zzg
            zzak(r1)
            r1.zzd(r7)
            return
        L_0x021a:
            com.google.android.gms.measurement.internal.zzfa r1 = r20.zzay()
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzj()
            java.lang.String r2 = "No network"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfi r1 = r20.zzm()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzkx r1 = r0.zzg
            zzak(r1)
            r1.zza()
            return
        L_0x0237:
            com.google.android.gms.measurement.internal.zzfa r1 = r20.zzay()
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzj()
            java.lang.String r2 = "Next upload time is 0"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfi r1 = r20.zzm()
            r1.zzc()
            com.google.android.gms.measurement.internal.zzkx r1 = r0.zzg
            zzak(r1)
            r1.zza()
            return
        L_0x0254:
            com.google.android.gms.measurement.internal.zzfa r1 = r20.zzay()
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzj()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfi r1 = r20.zzm()
            r1.zzc()
            com.google.android.gms.measurement.internal.zzkx r1 = r0.zzg
            zzak(r1)
            r1.zza()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzll.zzaf():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0b81, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.zzag.zzA() + r8)) goto L_0x0b83;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03a7 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x046b A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04c5 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x081f A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0868 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x088b A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0902 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0904 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x090c A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0938 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0b71 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0bf8 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0c14 A[Catch:{ SQLiteException -> 0x0c2c }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x01e4=Splitter:B:69:0x01e4, B:420:0x0d08=Splitter:B:420:0x0d08} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzag(java.lang.String r42, long r43) {
        /*
            r41 = this;
            r1 = r41
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            com.google.android.gms.measurement.internal.zzam r4 = r1.zze
            zzak(r4)
            r4.zzw()
            com.google.android.gms.measurement.internal.zzli r4 = new com.google.android.gms.measurement.internal.zzli     // Catch:{ all -> 0x0d1a }
            r12 = 0
            r4.<init>(r1, r12)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzam r5 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r5)     // Catch:{ all -> 0x0d1a }
            r6 = 0
            long r9 = r1.zzA     // Catch:{ all -> 0x0d1a }
            r7 = r43
            r11 = r4
            r5.zzU(r6, r7, r9, r11)     // Catch:{ all -> 0x0d1a }
            java.util.List r5 = r4.zzc     // Catch:{ all -> 0x0d1a }
            if (r5 == 0) goto L_0x0d08
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d1a }
            if (r5 == 0) goto L_0x002e
            goto L_0x0d08
        L_0x002e:
            com.google.android.gms.internal.measurement.zzgc r5 = r4.zza     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzjy r5 = r5.zzbB()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgb r5 = (com.google.android.gms.internal.measurement.zzgb) r5     // Catch:{ all -> 0x0d1a }
            r5.zzr()     // Catch:{ all -> 0x0d1a }
            r10 = r12
            r13 = r10
            r8 = 0
            r9 = 0
            r11 = -1
            r14 = -1
            r15 = 0
        L_0x0040:
            java.util.List r12 = r4.zzc     // Catch:{ all -> 0x0d1a }
            int r12 = r12.size()     // Catch:{ all -> 0x0d1a }
            java.lang.String r6 = "_fr"
            java.lang.String r7 = "_et"
            r16 = r15
            java.lang.String r15 = "_e"
            r17 = r2
            r18 = r3
            if (r8 >= r12) goto L_0x0543
            java.util.List r3 = r4.zzc     // Catch:{ all -> 0x0d1a }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r3 = (com.google.android.gms.internal.measurement.zzfs) r3     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzjy r3 = r3.zzbB()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfr r3 = (com.google.android.gms.internal.measurement.zzfr) r3     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzgb r12 = r1.zzc     // Catch:{ all -> 0x0d1a }
            zzak(r12)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r2 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r2 = r2.zzy()     // Catch:{ all -> 0x0d1a }
            r20 = r9
            java.lang.String r9 = r3.zzo()     // Catch:{ all -> 0x0d1a }
            boolean r2 = r12.zzr(r2, r9)     // Catch:{ all -> 0x0d1a }
            java.lang.String r9 = "_err"
            if (r2 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.zzfa r2 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzk()     // Catch:{ all -> 0x0d1a }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.zzgc r7 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r7 = r7.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfa.zzn(r7)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzgk r12 = r1.zzn     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzev r12 = r12.zzj()     // Catch:{ all -> 0x0d1a }
            java.lang.String r15 = r3.zzo()     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = r12.zzd(r15)     // Catch:{ all -> 0x0d1a }
            r2.zzc(r6, r7, r12)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzgb r2 = r1.zzc     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r6 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r6 = r6.zzy()     // Catch:{ all -> 0x0d1a }
            boolean r2 = r2.zzp(r6)     // Catch:{ all -> 0x0d1a }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.zzgb r2 = r1.zzc     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r6 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r6 = r6.zzy()     // Catch:{ all -> 0x0d1a }
            boolean r2 = r2.zzs(r6)     // Catch:{ all -> 0x0d1a }
            if (r2 == 0) goto L_0x00c3
            goto L_0x00e8
        L_0x00c3:
            java.lang.String r2 = r3.zzo()     // Catch:{ all -> 0x0d1a }
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x0d1a }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.zzlt r21 = r41.zzv()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzls r2 = r1.zzF     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r6 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r23 = r6.zzy()     // Catch:{ all -> 0x0d1a }
            r24 = 11
            java.lang.String r25 = "_ev"
            java.lang.String r26 = r3.zzo()     // Catch:{ all -> 0x0d1a }
            r27 = 0
            r22 = r2
            r21.zzN(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0d1a }
        L_0x00e8:
            r7 = r8
            r23 = r10
            r15 = r16
            r9 = r20
            r10 = r5
            r5 = -1
            goto L_0x0538
        L_0x00f3:
            java.lang.String r2 = r3.zzo()     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = com.google.android.gms.measurement.internal.zzhh.zza(r18)     // Catch:{ all -> 0x0d1a }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0d1a }
            if (r2 == 0) goto L_0x016d
            r2 = r18
            r3.zzi(r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzfa r12 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r12 = r12.zzj()     // Catch:{ all -> 0x0d1a }
            r18 = r2
            java.lang.String r2 = "Renaming ad_impression to _ai"
            r12.zza(r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzfa r2 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            java.lang.String r2 = r2.zzq()     // Catch:{ all -> 0x0d1a }
            r12 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r12)     // Catch:{ all -> 0x0d1a }
            if (r2 == 0) goto L_0x016d
            r2 = 0
        L_0x0125:
            int r12 = r3.zza()     // Catch:{ all -> 0x0d1a }
            if (r2 >= r12) goto L_0x016d
            java.lang.String r12 = "ad_platform"
            com.google.android.gms.internal.measurement.zzfw r21 = r3.zzn(r2)     // Catch:{ all -> 0x0d1a }
            r22 = r8
            java.lang.String r8 = r21.zzg()     // Catch:{ all -> 0x0d1a }
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x0d1a }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.internal.measurement.zzfw r8 = r3.zzn(r2)     // Catch:{ all -> 0x0d1a }
            java.lang.String r8 = r8.zzh()     // Catch:{ all -> 0x0d1a }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0d1a }
            if (r8 != 0) goto L_0x0168
            java.lang.String r8 = "admob"
            com.google.android.gms.internal.measurement.zzfw r12 = r3.zzn(r2)     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = r12.zzh()     // Catch:{ all -> 0x0d1a }
            boolean r8 = r8.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0d1a }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.measurement.internal.zzfa r8 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r8 = r8.zzl()     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = "AdMob ad impression logged from app. Potentially duplicative."
            r8.zza(r12)     // Catch:{ all -> 0x0d1a }
        L_0x0168:
            int r2 = r2 + 1
            r8 = r22
            goto L_0x0125
        L_0x016d:
            r22 = r8
            com.google.android.gms.measurement.internal.zzgb r2 = r1.zzc     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r8 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r8 = r8.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = r3.zzo()     // Catch:{ all -> 0x0d1a }
            boolean r2 = r2.zzq(r8, r12)     // Catch:{ all -> 0x0d1a }
            java.lang.String r8 = "_c"
            if (r2 != 0) goto L_0x01db
            com.google.android.gms.measurement.internal.zzln r12 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r12)     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = r3.zzo()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)     // Catch:{ all -> 0x0d1a }
            r21 = r11
            int r11 = r12.hashCode()     // Catch:{ all -> 0x0d1a }
            r23 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r11 == r10) goto L_0x01be
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r11 == r10) goto L_0x01b4
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r10) goto L_0x01aa
            goto L_0x01c8
        L_0x01aa:
            java.lang.String r10 = "_ui"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 1
            goto L_0x01c9
        L_0x01b4:
            java.lang.String r10 = "_ug"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 2
            goto L_0x01c9
        L_0x01be:
            java.lang.String r10 = "_in"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 0
            goto L_0x01c9
        L_0x01c8:
            r10 = -1
        L_0x01c9:
            if (r10 == 0) goto L_0x01df
            r11 = 1
            if (r10 == r11) goto L_0x01df
            r11 = 2
            if (r10 == r11) goto L_0x01df
            r25 = r5
            r24 = r7
            r7 = r13
            r19 = r14
            r2 = 0
            goto L_0x03a5
        L_0x01db:
            r23 = r10
            r21 = r11
        L_0x01df:
            r24 = r7
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x01e4:
            int r7 = r3.zza()     // Catch:{ all -> 0x0d1a }
            r25 = r5
            java.lang.String r5 = "_r"
            if (r10 >= r7) goto L_0x024b
            com.google.android.gms.internal.measurement.zzfw r7 = r3.zzn(r10)     // Catch:{ all -> 0x0d1a }
            java.lang.String r7 = r7.zzg()     // Catch:{ all -> 0x0d1a }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0d1a }
            if (r7 == 0) goto L_0x0219
            com.google.android.gms.internal.measurement.zzfw r5 = r3.zzn(r10)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzjy r5 = r5.zzbB()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfv r5 = (com.google.android.gms.internal.measurement.zzfv) r5     // Catch:{ all -> 0x0d1a }
            r7 = r13
            r19 = r14
            r13 = 1
            r5.zzi(r13)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r5 = r5.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d1a }
            r3.zzk(r10, r5)     // Catch:{ all -> 0x0d1a }
            r11 = 1
            goto L_0x0243
        L_0x0219:
            r7 = r13
            r19 = r14
            com.google.android.gms.internal.measurement.zzfw r13 = r3.zzn(r10)     // Catch:{ all -> 0x0d1a }
            java.lang.String r13 = r13.zzg()     // Catch:{ all -> 0x0d1a }
            boolean r5 = r5.equals(r13)     // Catch:{ all -> 0x0d1a }
            if (r5 == 0) goto L_0x0243
            com.google.android.gms.internal.measurement.zzfw r5 = r3.zzn(r10)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzjy r5 = r5.zzbB()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfv r5 = (com.google.android.gms.internal.measurement.zzfv) r5     // Catch:{ all -> 0x0d1a }
            r12 = 1
            r5.zzi(r12)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r5 = r5.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d1a }
            r3.zzk(r10, r5)     // Catch:{ all -> 0x0d1a }
            r12 = 1
        L_0x0243:
            int r10 = r10 + 1
            r13 = r7
            r14 = r19
            r5 = r25
            goto L_0x01e4
        L_0x024b:
            r7 = r13
            r19 = r14
            if (r11 != 0) goto L_0x027c
            if (r2 == 0) goto L_0x027c
            com.google.android.gms.measurement.internal.zzfa r10 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r10 = r10.zzj()     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.zzgk r13 = r1.zzn     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzev r13 = r13.zzj()     // Catch:{ all -> 0x0d1a }
            java.lang.String r14 = r3.zzo()     // Catch:{ all -> 0x0d1a }
            java.lang.String r13 = r13.zzd(r14)     // Catch:{ all -> 0x0d1a }
            r10.zzb(r11, r13)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfv r10 = com.google.android.gms.internal.measurement.zzfw.zze()     // Catch:{ all -> 0x0d1a }
            r10.zzj(r8)     // Catch:{ all -> 0x0d1a }
            r13 = 1
            r10.zzi(r13)     // Catch:{ all -> 0x0d1a }
            r3.zze(r10)     // Catch:{ all -> 0x0d1a }
        L_0x027c:
            if (r12 != 0) goto L_0x02a8
            com.google.android.gms.measurement.internal.zzfa r10 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r10 = r10.zzj()     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.zzgk r12 = r1.zzn     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzev r12 = r12.zzj()     // Catch:{ all -> 0x0d1a }
            java.lang.String r13 = r3.zzo()     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = r12.zzd(r13)     // Catch:{ all -> 0x0d1a }
            r10.zzb(r11, r12)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfv r10 = com.google.android.gms.internal.measurement.zzfw.zze()     // Catch:{ all -> 0x0d1a }
            r10.zzj(r5)     // Catch:{ all -> 0x0d1a }
            r11 = 1
            r10.zzi(r11)     // Catch:{ all -> 0x0d1a }
            r3.zze(r10)     // Catch:{ all -> 0x0d1a }
        L_0x02a8:
            com.google.android.gms.measurement.internal.zzam r10 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r10)     // Catch:{ all -> 0x0d1a }
            long r27 = r41.zza()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r11 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r29 = r11.zzy()     // Catch:{ all -> 0x0d1a }
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r26 = r10
            com.google.android.gms.measurement.internal.zzak r10 = r26.zzl(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d1a }
            long r10 = r10.zze     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzag r12 = r41.zzg()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r13 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r13 = r13.zzy()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzem r14 = com.google.android.gms.measurement.internal.zzen.zzn     // Catch:{ all -> 0x0d1a }
            int r12 = r12.zze(r13, r14)     // Catch:{ all -> 0x0d1a }
            long r12 = (long) r12     // Catch:{ all -> 0x0d1a }
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x02e2
            zzaa(r3, r5)     // Catch:{ all -> 0x0d1a }
            goto L_0x02e4
        L_0x02e2:
            r16 = 1
        L_0x02e4:
            java.lang.String r5 = r3.zzo()     // Catch:{ all -> 0x0d1a }
            boolean r5 = com.google.android.gms.measurement.internal.zzlt.zzai(r5)     // Catch:{ all -> 0x0d1a }
            if (r5 == 0) goto L_0x03a5
            if (r2 == 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.zzam r5 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r5)     // Catch:{ all -> 0x0d1a }
            long r27 = r41.zza()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r10 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r29 = r10.zzy()     // Catch:{ all -> 0x0d1a }
            r30 = 0
            r31 = 0
            r32 = 1
            r33 = 0
            r34 = 0
            r26 = r5
            com.google.android.gms.measurement.internal.zzak r5 = r26.zzl(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d1a }
            long r10 = r5.zzc     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzag r5 = r41.zzg()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r12 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = r12.zzy()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzem r13 = com.google.android.gms.measurement.internal.zzen.zzm     // Catch:{ all -> 0x0d1a }
            int r5 = r5.zze(r12, r13)     // Catch:{ all -> 0x0d1a }
            long r12 = (long) r5     // Catch:{ all -> 0x0d1a }
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.zzfa r5 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzk()     // Catch:{ all -> 0x0d1a }
            java.lang.String r10 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzgc r11 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = r11.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzfa.zzn(r11)     // Catch:{ all -> 0x0d1a }
            r5.zzb(r10, r11)     // Catch:{ all -> 0x0d1a }
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = -1
        L_0x0341:
            int r13 = r3.zza()     // Catch:{ all -> 0x0d1a }
            if (r10 >= r13) goto L_0x036b
            com.google.android.gms.internal.measurement.zzfw r13 = r3.zzn(r10)     // Catch:{ all -> 0x0d1a }
            java.lang.String r14 = r13.zzg()     // Catch:{ all -> 0x0d1a }
            boolean r14 = r8.equals(r14)     // Catch:{ all -> 0x0d1a }
            if (r14 == 0) goto L_0x035d
            com.google.android.gms.internal.measurement.zzjy r5 = r13.zzbB()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfv r5 = (com.google.android.gms.internal.measurement.zzfv) r5     // Catch:{ all -> 0x0d1a }
            r12 = r10
            goto L_0x0368
        L_0x035d:
            java.lang.String r13 = r13.zzg()     // Catch:{ all -> 0x0d1a }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0d1a }
            if (r13 == 0) goto L_0x0368
            r11 = 1
        L_0x0368:
            int r10 = r10 + 1
            goto L_0x0341
        L_0x036b:
            if (r11 == 0) goto L_0x0374
            if (r5 == 0) goto L_0x0373
            r3.zzh(r12)     // Catch:{ all -> 0x0d1a }
            goto L_0x03a5
        L_0x0373:
            r5 = 0
        L_0x0374:
            if (r5 == 0) goto L_0x038e
            com.google.android.gms.internal.measurement.zzjy r5 = r5.zzau()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfv r5 = (com.google.android.gms.internal.measurement.zzfv) r5     // Catch:{ all -> 0x0d1a }
            r5.zzj(r9)     // Catch:{ all -> 0x0d1a }
            r9 = 10
            r5.zzi(r9)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r5 = r5.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d1a }
            r3.zzk(r12, r5)     // Catch:{ all -> 0x0d1a }
            goto L_0x03a5
        L_0x038e:
            com.google.android.gms.measurement.internal.zzfa r5 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzd()     // Catch:{ all -> 0x0d1a }
            java.lang.String r9 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzgc r10 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r10 = r10.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzfa.zzn(r10)     // Catch:{ all -> 0x0d1a }
            r5.zzb(r9, r10)     // Catch:{ all -> 0x0d1a }
        L_0x03a5:
            if (r2 == 0) goto L_0x045e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0d1a }
            java.util.List r5 = r3.zzp()     // Catch:{ all -> 0x0d1a }
            r2.<init>(r5)     // Catch:{ all -> 0x0d1a }
            r5 = 0
            r9 = -1
            r10 = -1
        L_0x03b3:
            int r11 = r2.size()     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r5 >= r11) goto L_0x03e3
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfw r11 = (com.google.android.gms.internal.measurement.zzfw) r11     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = r11.zzg()     // Catch:{ all -> 0x0d1a }
            boolean r11 = r13.equals(r11)     // Catch:{ all -> 0x0d1a }
            if (r11 == 0) goto L_0x03cf
            r9 = r5
            goto L_0x03e0
        L_0x03cf:
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfw r11 = (com.google.android.gms.internal.measurement.zzfw) r11     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = r11.zzg()     // Catch:{ all -> 0x0d1a }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0d1a }
            if (r11 == 0) goto L_0x03e0
            r10 = r5
        L_0x03e0:
            int r5 = r5 + 1
            goto L_0x03b3
        L_0x03e3:
            r5 = -1
            if (r9 != r5) goto L_0x03e8
            goto L_0x045f
        L_0x03e8:
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d1a }
            boolean r5 = r5.zzw()     // Catch:{ all -> 0x0d1a }
            if (r5 != 0) goto L_0x0419
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d1a }
            boolean r5 = r5.zzu()     // Catch:{ all -> 0x0d1a }
            if (r5 != 0) goto L_0x0419
            com.google.android.gms.measurement.internal.zzfa r2 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzl()     // Catch:{ all -> 0x0d1a }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.zza(r5)     // Catch:{ all -> 0x0d1a }
            r3.zzh(r9)     // Catch:{ all -> 0x0d1a }
            zzaa(r3, r8)     // Catch:{ all -> 0x0d1a }
            r2 = 18
            zzZ(r3, r2, r13)     // Catch:{ all -> 0x0d1a }
            goto L_0x045e
        L_0x0419:
            r5 = -1
            if (r10 != r5) goto L_0x041d
            goto L_0x0445
        L_0x041d:
            java.lang.Object r2 = r2.get(r10)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfw r2 = (com.google.android.gms.internal.measurement.zzfw) r2     // Catch:{ all -> 0x0d1a }
            java.lang.String r2 = r2.zzh()     // Catch:{ all -> 0x0d1a }
            int r10 = r2.length()     // Catch:{ all -> 0x0d1a }
            r11 = 3
            if (r10 != r11) goto L_0x0445
            r10 = 0
        L_0x042f:
            int r11 = r2.length()     // Catch:{ all -> 0x0d1a }
            if (r10 >= r11) goto L_0x045f
            int r11 = r2.codePointAt(r10)     // Catch:{ all -> 0x0d1a }
            boolean r13 = java.lang.Character.isLetter(r11)     // Catch:{ all -> 0x0d1a }
            if (r13 == 0) goto L_0x0445
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0d1a }
            int r10 = r10 + r11
            goto L_0x042f
        L_0x0445:
            com.google.android.gms.measurement.internal.zzfa r2 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzl()     // Catch:{ all -> 0x0d1a }
            java.lang.String r10 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.zza(r10)     // Catch:{ all -> 0x0d1a }
            r3.zzh(r9)     // Catch:{ all -> 0x0d1a }
            zzaa(r3, r8)     // Catch:{ all -> 0x0d1a }
            r2 = 19
            zzZ(r3, r2, r12)     // Catch:{ all -> 0x0d1a }
            goto L_0x045f
        L_0x045e:
            r5 = -1
        L_0x045f:
            java.lang.String r2 = r3.zzo()     // Catch:{ all -> 0x0d1a }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0d1a }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04c5
            com.google.android.gms.measurement.internal.zzln r2 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r2 = r3.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfw r2 = com.google.android.gms.measurement.internal.zzln.zzB(r2, r6)     // Catch:{ all -> 0x0d1a }
            if (r2 != 0) goto L_0x04c0
            if (r7 == 0) goto L_0x04b4
            long r10 = r7.zzc()     // Catch:{ all -> 0x0d1a }
            long r12 = r3.zzc()     // Catch:{ all -> 0x0d1a }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0d1a }
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x04b4
            com.google.android.gms.internal.measurement.zzjy r2 = r7.zzau()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfr r2 = (com.google.android.gms.internal.measurement.zzfr) r2     // Catch:{ all -> 0x0d1a }
            boolean r6 = r1.zzai(r3, r2)     // Catch:{ all -> 0x0d1a }
            if (r6 == 0) goto L_0x04a7
            r6 = r19
            r10 = r25
            r10.zzT(r6, r2)     // Catch:{ all -> 0x0d1a }
            r11 = r21
            r2 = 0
            r13 = 0
            goto L_0x04af
        L_0x04a7:
            r6 = r19
            r10 = r25
            r2 = r3
            r13 = r7
            r11 = r20
        L_0x04af:
            r23 = r2
            r14 = r6
            goto L_0x0524
        L_0x04b4:
            r6 = r19
            r10 = r25
            r23 = r3
            r14 = r6
            r13 = r7
            r11 = r20
            goto L_0x0524
        L_0x04c0:
            r6 = r19
            r10 = r25
            goto L_0x051f
        L_0x04c5:
            r6 = r19
            r10 = r25
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r3.zzo()     // Catch:{ all -> 0x0d1a }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0d1a }
            if (r2 == 0) goto L_0x051f
            com.google.android.gms.measurement.internal.zzln r2 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r2 = r3.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d1a }
            r11 = r24
            com.google.android.gms.internal.measurement.zzfw r2 = com.google.android.gms.measurement.internal.zzln.zzB(r2, r11)     // Catch:{ all -> 0x0d1a }
            if (r2 != 0) goto L_0x051f
            if (r23 == 0) goto L_0x0518
            long r11 = r23.zzc()     // Catch:{ all -> 0x0d1a }
            long r13 = r3.zzc()     // Catch:{ all -> 0x0d1a }
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0d1a }
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0518
            com.google.android.gms.internal.measurement.zzjy r2 = r23.zzau()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfr r2 = (com.google.android.gms.internal.measurement.zzfr) r2     // Catch:{ all -> 0x0d1a }
            boolean r7 = r1.zzai(r2, r3)     // Catch:{ all -> 0x0d1a }
            if (r7 == 0) goto L_0x0511
            r8 = r21
            r10.zzT(r8, r2)     // Catch:{ all -> 0x0d1a }
            r14 = r6
            r2 = 0
            r23 = 0
            goto L_0x0516
        L_0x0511:
            r8 = r21
            r2 = r3
            r14 = r20
        L_0x0516:
            r13 = r2
            goto L_0x0523
        L_0x0518:
            r8 = r21
            r13 = r3
            r11 = r8
            r14 = r20
            goto L_0x0524
        L_0x051f:
            r8 = r21
            r14 = r6
            r13 = r7
        L_0x0523:
            r11 = r8
        L_0x0524:
            java.util.List r2 = r4.zzc     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r6 = r3.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r6 = (com.google.android.gms.internal.measurement.zzfs) r6     // Catch:{ all -> 0x0d1a }
            r7 = r22
            r2.set(r7, r6)     // Catch:{ all -> 0x0d1a }
            int r9 = r20 + 1
            r10.zzk(r3)     // Catch:{ all -> 0x0d1a }
            r15 = r16
        L_0x0538:
            int r8 = r7 + 1
            r5 = r10
            r2 = r17
            r3 = r18
            r10 = r23
            goto L_0x0040
        L_0x0543:
            r10 = r5
            r11 = r7
            r20 = r9
            r2 = 0
            r7 = r2
            r5 = 0
        L_0x054b:
            if (r5 >= r9) goto L_0x059b
            com.google.android.gms.internal.measurement.zzfs r12 = r10.zze(r5)     // Catch:{ all -> 0x0d1a }
            java.lang.String r13 = r12.zzh()     // Catch:{ all -> 0x0d1a }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0d1a }
            if (r13 == 0) goto L_0x056e
            com.google.android.gms.measurement.internal.zzln r13 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r13)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfw r13 = com.google.android.gms.measurement.internal.zzln.zzB(r12, r6)     // Catch:{ all -> 0x0d1a }
            if (r13 == 0) goto L_0x056e
            r10.zzA(r5)     // Catch:{ all -> 0x0d1a }
            int r9 = r9 + -1
            int r5 = r5 + -1
            goto L_0x0598
        L_0x056e:
            com.google.android.gms.measurement.internal.zzln r13 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r13)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfw r12 = com.google.android.gms.measurement.internal.zzln.zzB(r12, r11)     // Catch:{ all -> 0x0d1a }
            if (r12 == 0) goto L_0x0598
            boolean r13 = r12.zzw()     // Catch:{ all -> 0x0d1a }
            if (r13 == 0) goto L_0x0588
            long r12 = r12.zzd()     // Catch:{ all -> 0x0d1a }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d1a }
            goto L_0x0589
        L_0x0588:
            r12 = 0
        L_0x0589:
            if (r12 == 0) goto L_0x0598
            long r13 = r12.longValue()     // Catch:{ all -> 0x0d1a }
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0598
            long r12 = r12.longValue()     // Catch:{ all -> 0x0d1a }
            long r7 = r7 + r12
        L_0x0598:
            r12 = 1
            int r5 = r5 + r12
            goto L_0x054b
        L_0x059b:
            r5 = 0
            r1.zzae(r10, r7, r5)     // Catch:{ all -> 0x0d1a }
            java.util.List r5 = r10.zzas()     // Catch:{ all -> 0x0d1a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0d1a }
        L_0x05a7:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0d1a }
            java.lang.String r9 = "_se"
            if (r6 == 0) goto L_0x05cd
            java.lang.String r6 = "_s"
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r11 = (com.google.android.gms.internal.measurement.zzfs) r11     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = r11.zzh()     // Catch:{ all -> 0x0d1a }
            boolean r6 = r6.equals(r11)     // Catch:{ all -> 0x0d1a }
            if (r6 == 0) goto L_0x05a7
            com.google.android.gms.measurement.internal.zzam r5 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r5)     // Catch:{ all -> 0x0d1a }
            java.lang.String r6 = r10.zzaq()     // Catch:{ all -> 0x0d1a }
            r5.zzA(r6, r9)     // Catch:{ all -> 0x0d1a }
        L_0x05cd:
            java.lang.String r5 = "_sid"
            int r5 = com.google.android.gms.measurement.internal.zzln.zza(r10, r5)     // Catch:{ all -> 0x0d1a }
            if (r5 < 0) goto L_0x05da
            r5 = 1
            r1.zzae(r10, r7, r5)     // Catch:{ all -> 0x0d1a }
            goto L_0x05fa
        L_0x05da:
            int r5 = com.google.android.gms.measurement.internal.zzln.zza(r10, r9)     // Catch:{ all -> 0x0d1a }
            if (r5 < 0) goto L_0x05fa
            r10.zzB(r5)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzfa r5 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzd()     // Catch:{ all -> 0x0d1a }
            java.lang.String r6 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzgc r7 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r7 = r7.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfa.zzn(r7)     // Catch:{ all -> 0x0d1a }
            r5.zzb(r6, r7)     // Catch:{ all -> 0x0d1a }
        L_0x05fa:
            com.google.android.gms.measurement.internal.zzln r5 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r5)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzgk r6 = r5.zzs     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzfa r6 = r6.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r6 = r6.zzj()     // Catch:{ all -> 0x0d1a }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r6.zza(r7)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzll r6 = r5.zzf     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzgb r6 = r6.zzc     // Catch:{ all -> 0x0d1a }
            zzak(r6)     // Catch:{ all -> 0x0d1a }
            java.lang.String r7 = r10.zzaq()     // Catch:{ all -> 0x0d1a }
            boolean r6 = r6.zzn(r7)     // Catch:{ all -> 0x0d1a }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.zzll r6 = r5.zzf     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzam r6 = r6.zze     // Catch:{ all -> 0x0d1a }
            zzak(r6)     // Catch:{ all -> 0x0d1a }
            java.lang.String r7 = r10.zzaq()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzh r6 = r6.zzj(r7)     // Catch:{ all -> 0x0d1a }
            if (r6 == 0) goto L_0x0691
            boolean r6 = r6.zzai()     // Catch:{ all -> 0x0d1a }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.zzgk r6 = r5.zzs     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzaq r6 = r6.zzg()     // Catch:{ all -> 0x0d1a }
            boolean r6 = r6.zze()     // Catch:{ all -> 0x0d1a }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.zzgk r6 = r5.zzs     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzfa r6 = r6.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r6 = r6.zzc()     // Catch:{ all -> 0x0d1a }
            java.lang.String r7 = "Turning off ad personalization due to account type"
            r6.zza(r7)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgk r6 = com.google.android.gms.internal.measurement.zzgl.zzd()     // Catch:{ all -> 0x0d1a }
            r7 = r17
            r6.zzf(r7)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.zzs     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzaq r5 = r5.zzg()     // Catch:{ all -> 0x0d1a }
            long r8 = r5.zza()     // Catch:{ all -> 0x0d1a }
            r6.zzg(r8)     // Catch:{ all -> 0x0d1a }
            r8 = 1
            r6.zze(r8)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r5 = r6.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgl r5 = (com.google.android.gms.internal.measurement.zzgl) r5     // Catch:{ all -> 0x0d1a }
            r6 = 0
        L_0x0673:
            int r8 = r10.zzb()     // Catch:{ all -> 0x0d1a }
            if (r6 >= r8) goto L_0x068e
            com.google.android.gms.internal.measurement.zzgl r8 = r10.zzap(r6)     // Catch:{ all -> 0x0d1a }
            java.lang.String r8 = r8.zzf()     // Catch:{ all -> 0x0d1a }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0d1a }
            if (r8 == 0) goto L_0x068b
            r10.zzan(r6, r5)     // Catch:{ all -> 0x0d1a }
            goto L_0x0691
        L_0x068b:
            int r6 = r6 + 1
            goto L_0x0673
        L_0x068e:
            r10.zzm(r5)     // Catch:{ all -> 0x0d1a }
        L_0x0691:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10.zzaj(r5)     // Catch:{ all -> 0x0d1a }
            r5 = -9223372036854775808
            r10.zzR(r5)     // Catch:{ all -> 0x0d1a }
            r5 = 0
        L_0x069f:
            int r6 = r10.zza()     // Catch:{ all -> 0x0d1a }
            if (r5 >= r6) goto L_0x06d2
            com.google.android.gms.internal.measurement.zzfs r6 = r10.zze(r5)     // Catch:{ all -> 0x0d1a }
            long r7 = r6.zzd()     // Catch:{ all -> 0x0d1a }
            long r11 = r10.zzd()     // Catch:{ all -> 0x0d1a }
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x06bc
            long r7 = r6.zzd()     // Catch:{ all -> 0x0d1a }
            r10.zzaj(r7)     // Catch:{ all -> 0x0d1a }
        L_0x06bc:
            long r7 = r6.zzd()     // Catch:{ all -> 0x0d1a }
            long r11 = r10.zzc()     // Catch:{ all -> 0x0d1a }
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x06cf
            long r6 = r6.zzd()     // Catch:{ all -> 0x0d1a }
            r10.zzR(r6)     // Catch:{ all -> 0x0d1a }
        L_0x06cf:
            int r5 = r5 + 1
            goto L_0x069f
        L_0x06d2:
            r10.zzz()     // Catch:{ all -> 0x0d1a }
            r10.zzo()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzaa r5 = r1.zzh     // Catch:{ all -> 0x0d1a }
            zzak(r5)     // Catch:{ all -> 0x0d1a }
            java.lang.String r21 = r10.zzaq()     // Catch:{ all -> 0x0d1a }
            java.util.List r22 = r10.zzas()     // Catch:{ all -> 0x0d1a }
            java.util.List r23 = r10.zzat()     // Catch:{ all -> 0x0d1a }
            long r6 = r10.zzd()     // Catch:{ all -> 0x0d1a }
            java.lang.Long r24 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d1a }
            long r6 = r10.zzc()     // Catch:{ all -> 0x0d1a }
            java.lang.Long r25 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d1a }
            r20 = r5
            java.util.List r5 = r20.zza(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0d1a }
            r10.zzf(r5)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzag r5 = r41.zzg()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r6 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r6 = r6.zzy()     // Catch:{ all -> 0x0d1a }
            boolean r5 = r5.zzw(r6)     // Catch:{ all -> 0x0d1a }
            if (r5 == 0) goto L_0x0a54
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0d1a }
            r5.<init>()     // Catch:{ all -> 0x0d1a }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0d1a }
            r6.<init>()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzlt r7 = r41.zzv()     // Catch:{ all -> 0x0d1a }
            java.security.SecureRandom r7 = r7.zzG()     // Catch:{ all -> 0x0d1a }
            r8 = 0
        L_0x0725:
            int r9 = r10.zza()     // Catch:{ all -> 0x0d1a }
            if (r8 >= r9) goto L_0x0a1a
            com.google.android.gms.internal.measurement.zzfs r9 = r10.zze(r8)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzjy r9 = r9.zzbB()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfr r9 = (com.google.android.gms.internal.measurement.zzfr) r9     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = r9.zzo()     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r11 == 0) goto L_0x07c8
            com.google.android.gms.measurement.internal.zzln r11 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r11)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r11 = r9.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r11 = (com.google.android.gms.internal.measurement.zzfs) r11     // Catch:{ all -> 0x0d1a }
            java.lang.String r14 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzln.zzC(r11, r14)     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0d1a }
            java.lang.Object r14 = r5.get(r11)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzas r14 = (com.google.android.gms.measurement.internal.zzas) r14     // Catch:{ all -> 0x0d1a }
            if (r14 != 0) goto L_0x077c
            com.google.android.gms.measurement.internal.zzam r14 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r14)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r15 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r15 = r15.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.Object r17 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0d1a }
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzas r14 = r14.zzn(r15, r2)     // Catch:{ all -> 0x0d1a }
            if (r14 == 0) goto L_0x077c
            r5.put(r11, r14)     // Catch:{ all -> 0x0d1a }
        L_0x077c:
            if (r14 == 0) goto L_0x07bb
            java.lang.Long r2 = r14.zzi     // Catch:{ all -> 0x0d1a }
            if (r2 != 0) goto L_0x07bb
            java.lang.Long r2 = r14.zzj     // Catch:{ all -> 0x0d1a }
            if (r2 == 0) goto L_0x079a
            long r2 = r2.longValue()     // Catch:{ all -> 0x0d1a }
            r17 = 1
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x079a
            com.google.android.gms.measurement.internal.zzln r2 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            java.lang.Long r2 = r14.zzj     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzln.zzz(r9, r13, r2)     // Catch:{ all -> 0x0d1a }
        L_0x079a:
            java.lang.Boolean r2 = r14.zzk     // Catch:{ all -> 0x0d1a }
            if (r2 == 0) goto L_0x07b2
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0d1a }
            if (r2 == 0) goto L_0x07b2
            com.google.android.gms.measurement.internal.zzln r2 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            r2 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzln.zzz(r9, r12, r11)     // Catch:{ all -> 0x0d1a }
        L_0x07b2:
            com.google.android.gms.internal.measurement.zzkc r2 = r9.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d1a }
            r6.add(r2)     // Catch:{ all -> 0x0d1a }
        L_0x07bb:
            r10.zzT(r8, r9)     // Catch:{ all -> 0x0d1a }
        L_0x07be:
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a0e
        L_0x07c8:
            com.google.android.gms.measurement.internal.zzgb r2 = r1.zzc     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r3 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r3 = r3.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r11 = r2.zza(r3, r11)     // Catch:{ all -> 0x0d1a }
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0d1a }
            if (r14 != 0) goto L_0x07f9
            long r2 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x07e4 }
            goto L_0x07fb
        L_0x07e4:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.zzgk r2 = r2.zzs     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzk()     // Catch:{ all -> 0x0d1a }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ all -> 0x0d1a }
            r2.zzc(r14, r3, r11)     // Catch:{ all -> 0x0d1a }
        L_0x07f9:
            r2 = 0
        L_0x07fb:
            com.google.android.gms.measurement.internal.zzlt r11 = r41.zzv()     // Catch:{ all -> 0x0d1a }
            long r14 = r9.zzc()     // Catch:{ all -> 0x0d1a }
            long r14 = r11.zzr(r14, r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r11 = r9.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r11 = (com.google.android.gms.internal.measurement.zzfs) r11     // Catch:{ all -> 0x0d1a }
            r44 = r12
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0d1a }
            r17 = r2
            java.lang.String r2 = "_dbg"
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0d1a }
            if (r3 != 0) goto L_0x0853
            java.util.List r3 = r11.zzi()     // Catch:{ all -> 0x0d1a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d1a }
        L_0x0827:
            boolean r11 = r3.hasNext()     // Catch:{ all -> 0x0d1a }
            if (r11 == 0) goto L_0x0853
            java.lang.Object r11 = r3.next()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfw r11 = (com.google.android.gms.internal.measurement.zzfw) r11     // Catch:{ all -> 0x0d1a }
            r22 = r3
            java.lang.String r3 = r11.zzg()     // Catch:{ all -> 0x0d1a }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0d1a }
            if (r3 == 0) goto L_0x0850
            long r2 = r11.zzd()     // Catch:{ all -> 0x0d1a }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d1a }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0d1a }
            if (r2 != 0) goto L_0x084e
            goto L_0x0853
        L_0x084e:
            r2 = 1
            goto L_0x0866
        L_0x0850:
            r3 = r22
            goto L_0x0827
        L_0x0853:
            com.google.android.gms.measurement.internal.zzgb r2 = r1.zzc     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r3 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r3 = r3.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = r9.zzo()     // Catch:{ all -> 0x0d1a }
            int r2 = r2.zzc(r3, r11)     // Catch:{ all -> 0x0d1a }
        L_0x0866:
            if (r2 > 0) goto L_0x088b
            com.google.android.gms.measurement.internal.zzfa r3 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzk()     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r9.zzo()     // Catch:{ all -> 0x0d1a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d1a }
            r3.zzc(r11, r12, r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r2 = r9.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d1a }
            r6.add(r2)     // Catch:{ all -> 0x0d1a }
            r10.zzT(r8, r9)     // Catch:{ all -> 0x0d1a }
            goto L_0x07be
        L_0x088b:
            java.lang.String r3 = r9.zzo()     // Catch:{ all -> 0x0d1a }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzas r3 = (com.google.android.gms.measurement.internal.zzas) r3     // Catch:{ all -> 0x0d1a }
            if (r3 != 0) goto L_0x08eb
            com.google.android.gms.measurement.internal.zzam r3 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r3)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r11 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = r11.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = r9.zzo()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzas r3 = r3.zzn(r11, r12)     // Catch:{ all -> 0x0d1a }
            if (r3 != 0) goto L_0x08eb
            com.google.android.gms.measurement.internal.zzfa r3 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzk()     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzgc r12 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = r12.zzy()     // Catch:{ all -> 0x0d1a }
            r22 = r14
            java.lang.String r14 = r9.zzo()     // Catch:{ all -> 0x0d1a }
            r3.zzc(r11, r12, r14)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzas r3 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r11 = r4.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r25 = r11.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.String r26 = r9.zzo()     // Catch:{ all -> 0x0d1a }
            r27 = 1
            r29 = 1
            r31 = 1
            long r33 = r9.zzc()     // Catch:{ all -> 0x0d1a }
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r24 = r3
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch:{ all -> 0x0d1a }
            goto L_0x08ed
        L_0x08eb:
            r22 = r14
        L_0x08ed:
            com.google.android.gms.measurement.internal.zzln r11 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r11)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r11 = r9.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r11 = (com.google.android.gms.internal.measurement.zzfs) r11     // Catch:{ all -> 0x0d1a }
            java.lang.String r12 = "_eid"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzln.zzC(r11, r12)     // Catch:{ all -> 0x0d1a }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0d1a }
            if (r11 == 0) goto L_0x0904
            r12 = 1
            goto L_0x0905
        L_0x0904:
            r12 = 0
        L_0x0905:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0d1a }
            r14 = 1
            if (r2 != r14) goto L_0x0938
            com.google.android.gms.internal.measurement.zzkc r2 = r9.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d1a }
            r6.add(r2)     // Catch:{ all -> 0x0d1a }
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d1a }
            if (r2 == 0) goto L_0x0933
            java.lang.Long r2 = r3.zzi     // Catch:{ all -> 0x0d1a }
            if (r2 != 0) goto L_0x0927
            java.lang.Long r2 = r3.zzj     // Catch:{ all -> 0x0d1a }
            if (r2 != 0) goto L_0x0927
            java.lang.Boolean r2 = r3.zzk     // Catch:{ all -> 0x0d1a }
            if (r2 == 0) goto L_0x0933
        L_0x0927:
            r2 = 0
            com.google.android.gms.measurement.internal.zzas r3 = r3.zza(r2, r2, r2)     // Catch:{ all -> 0x0d1a }
            java.lang.String r2 = r9.zzo()     // Catch:{ all -> 0x0d1a }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d1a }
        L_0x0933:
            r10.zzT(r8, r9)     // Catch:{ all -> 0x0d1a }
            goto L_0x07be
        L_0x0938:
            int r14 = r7.nextInt(r2)     // Catch:{ all -> 0x0d1a }
            if (r14 != 0) goto L_0x097a
            com.google.android.gms.measurement.internal.zzln r11 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r11)     // Catch:{ all -> 0x0d1a }
            long r14 = (long) r2     // Catch:{ all -> 0x0d1a }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzln.zzz(r9, r13, r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r11 = r9.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r11 = (com.google.android.gms.internal.measurement.zzfs) r11     // Catch:{ all -> 0x0d1a }
            r6.add(r11)     // Catch:{ all -> 0x0d1a }
            boolean r11 = r12.booleanValue()     // Catch:{ all -> 0x0d1a }
            if (r11 == 0) goto L_0x095f
            r11 = 0
            com.google.android.gms.measurement.internal.zzas r3 = r3.zza(r11, r2, r11)     // Catch:{ all -> 0x0d1a }
        L_0x095f:
            java.lang.String r2 = r9.zzo()     // Catch:{ all -> 0x0d1a }
            long r11 = r9.zzc()     // Catch:{ all -> 0x0d1a }
            r14 = r22
            com.google.android.gms.measurement.internal.zzas r3 = r3.zzb(r11, r14)     // Catch:{ all -> 0x0d1a }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d1a }
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a0b
        L_0x097a:
            r14 = r22
            r22 = r7
            java.lang.Long r7 = r3.zzh     // Catch:{ all -> 0x0d1a }
            if (r7 == 0) goto L_0x098f
            long r17 = r7.longValue()     // Catch:{ all -> 0x0d1a }
            r24 = r4
            r26 = r5
            r25 = r10
            r23 = r11
            goto L_0x09a5
        L_0x098f:
            com.google.android.gms.measurement.internal.zzlt r7 = r41.zzv()     // Catch:{ all -> 0x0d1a }
            r25 = r10
            r23 = r11
            long r10 = r9.zzb()     // Catch:{ all -> 0x0d1a }
            r24 = r4
            r26 = r5
            r4 = r17
            long r17 = r7.zzr(r10, r4)     // Catch:{ all -> 0x0d1a }
        L_0x09a5:
            int r4 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x09f1
            com.google.android.gms.measurement.internal.zzln r4 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r4)     // Catch:{ all -> 0x0d1a }
            r4 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d1a }
            r10 = r44
            com.google.android.gms.measurement.internal.zzln.zzz(r9, r10, r7)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzln r7 = r1.zzi     // Catch:{ all -> 0x0d1a }
            zzak(r7)     // Catch:{ all -> 0x0d1a }
            long r10 = (long) r2     // Catch:{ all -> 0x0d1a }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzln.zzz(r9, r13, r2)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r7 = r9.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfs r7 = (com.google.android.gms.internal.measurement.zzfs) r7     // Catch:{ all -> 0x0d1a }
            r6.add(r7)     // Catch:{ all -> 0x0d1a }
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0d1a }
            if (r7 == 0) goto L_0x09df
            r7 = 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0d1a }
            r7 = 0
            com.google.android.gms.measurement.internal.zzas r3 = r3.zza(r7, r2, r10)     // Catch:{ all -> 0x0d1a }
        L_0x09df:
            java.lang.String r2 = r9.zzo()     // Catch:{ all -> 0x0d1a }
            long r10 = r9.zzc()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzas r3 = r3.zzb(r10, r14)     // Catch:{ all -> 0x0d1a }
            r7 = r26
            r7.put(r2, r3)     // Catch:{ all -> 0x0d1a }
            goto L_0x0a09
        L_0x09f1:
            r7 = r26
            r4 = 1
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d1a }
            if (r2 == 0) goto L_0x0a09
            java.lang.String r2 = r9.zzo()     // Catch:{ all -> 0x0d1a }
            r11 = r23
            r10 = 0
            com.google.android.gms.measurement.internal.zzas r3 = r3.zza(r11, r10, r10)     // Catch:{ all -> 0x0d1a }
            r7.put(r2, r3)     // Catch:{ all -> 0x0d1a }
        L_0x0a09:
            r2 = r25
        L_0x0a0b:
            r2.zzT(r8, r9)     // Catch:{ all -> 0x0d1a }
        L_0x0a0e:
            int r8 = r8 + 1
            r10 = r2
            r5 = r7
            r7 = r22
            r4 = r24
            r2 = 0
            goto L_0x0725
        L_0x0a1a:
            r24 = r4
            r7 = r5
            r2 = r10
            int r3 = r6.size()     // Catch:{ all -> 0x0d1a }
            int r4 = r2.zza()     // Catch:{ all -> 0x0d1a }
            if (r3 >= r4) goto L_0x0a2e
            r2.zzr()     // Catch:{ all -> 0x0d1a }
            r2.zzg(r6)     // Catch:{ all -> 0x0d1a }
        L_0x0a2e:
            java.util.Set r3 = r7.entrySet()     // Catch:{ all -> 0x0d1a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d1a }
        L_0x0a36:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0d1a }
            if (r4 == 0) goto L_0x0a51
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0d1a }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzam r5 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r5)     // Catch:{ all -> 0x0d1a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzas r4 = (com.google.android.gms.measurement.internal.zzas) r4     // Catch:{ all -> 0x0d1a }
            r5.zzE(r4)     // Catch:{ all -> 0x0d1a }
            goto L_0x0a36
        L_0x0a51:
            r3 = r24
            goto L_0x0a56
        L_0x0a54:
            r2 = r10
            r3 = r4
        L_0x0a56:
            com.google.android.gms.internal.measurement.zzgc r4 = r3.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r4 = r4.zzy()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzam r5 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r5)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzh r5 = r5.zzj(r4)     // Catch:{ all -> 0x0d1a }
            if (r5 != 0) goto L_0x0a7f
            com.google.android.gms.measurement.internal.zzfa r5 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzd()     // Catch:{ all -> 0x0d1a }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzgc r7 = r3.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r7 = r7.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfa.zzn(r7)     // Catch:{ all -> 0x0d1a }
            r5.zzb(r6, r7)     // Catch:{ all -> 0x0d1a }
            goto L_0x0adb
        L_0x0a7f:
            int r6 = r2.zza()     // Catch:{ all -> 0x0d1a }
            if (r6 <= 0) goto L_0x0adb
            long r6 = r5.zzn()     // Catch:{ all -> 0x0d1a }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0a93
            r2.zzac(r6)     // Catch:{ all -> 0x0d1a }
            goto L_0x0a96
        L_0x0a93:
            r2.zzv()     // Catch:{ all -> 0x0d1a }
        L_0x0a96:
            long r8 = r5.zzp()     // Catch:{ all -> 0x0d1a }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0aa1
            goto L_0x0aa2
        L_0x0aa1:
            r6 = r8
        L_0x0aa2:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0aaa
            r2.zzad(r6)     // Catch:{ all -> 0x0d1a }
            goto L_0x0aad
        L_0x0aaa:
            r2.zzw()     // Catch:{ all -> 0x0d1a }
        L_0x0aad:
            r5.zzE()     // Catch:{ all -> 0x0d1a }
            long r6 = r5.zzo()     // Catch:{ all -> 0x0d1a }
            int r6 = (int) r6     // Catch:{ all -> 0x0d1a }
            r2.zzJ(r6)     // Catch:{ all -> 0x0d1a }
            long r6 = r2.zzd()     // Catch:{ all -> 0x0d1a }
            r5.zzac(r6)     // Catch:{ all -> 0x0d1a }
            long r6 = r2.zzc()     // Catch:{ all -> 0x0d1a }
            r5.zzaa(r6)     // Catch:{ all -> 0x0d1a }
            java.lang.String r6 = r5.zzs()     // Catch:{ all -> 0x0d1a }
            if (r6 == 0) goto L_0x0ad0
            r2.zzX(r6)     // Catch:{ all -> 0x0d1a }
            goto L_0x0ad3
        L_0x0ad0:
            r2.zzs()     // Catch:{ all -> 0x0d1a }
        L_0x0ad3:
            com.google.android.gms.measurement.internal.zzam r6 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r6)     // Catch:{ all -> 0x0d1a }
            r6.zzD(r5)     // Catch:{ all -> 0x0d1a }
        L_0x0adb:
            int r5 = r2.zza()     // Catch:{ all -> 0x0d1a }
            if (r5 <= 0) goto L_0x0c5f
            com.google.android.gms.measurement.internal.zzgk r5 = r1.zzn     // Catch:{ all -> 0x0d1a }
            r5.zzaw()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzgb r5 = r1.zzc     // Catch:{ all -> 0x0d1a }
            zzak(r5)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r6 = r3.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r6 = r6.zzy()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzfe r5 = r5.zze(r6)     // Catch:{ all -> 0x0d1a }
            r6 = -1
            if (r5 == 0) goto L_0x0b08
            boolean r8 = r5.zzs()     // Catch:{ all -> 0x0d1a }
            if (r8 != 0) goto L_0x0b00
            goto L_0x0b08
        L_0x0b00:
            long r8 = r5.zzc()     // Catch:{ all -> 0x0d1a }
            r2.zzL(r8)     // Catch:{ all -> 0x0d1a }
            goto L_0x0b2f
        L_0x0b08:
            com.google.android.gms.internal.measurement.zzgc r5 = r3.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r5 = r5.zzG()     // Catch:{ all -> 0x0d1a }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d1a }
            if (r5 == 0) goto L_0x0b18
            r2.zzL(r6)     // Catch:{ all -> 0x0d1a }
            goto L_0x0b2f
        L_0x0b18:
            com.google.android.gms.measurement.internal.zzfa r5 = r41.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzk()     // Catch:{ all -> 0x0d1a }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzgc r9 = r3.zza     // Catch:{ all -> 0x0d1a }
            java.lang.String r9 = r9.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzfa.zzn(r9)     // Catch:{ all -> 0x0d1a }
            r5.zzb(r8, r9)     // Catch:{ all -> 0x0d1a }
        L_0x0b2f:
            com.google.android.gms.measurement.internal.zzam r5 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r5)     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzkc r2 = r2.zzaE()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.internal.measurement.zzgc r2 = (com.google.android.gms.internal.measurement.zzgc) r2     // Catch:{ all -> 0x0d1a }
            r5.zzg()     // Catch:{ all -> 0x0d1a }
            r5.zzW()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x0d1a }
            java.lang.String r8 = r2.zzy()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)     // Catch:{ all -> 0x0d1a }
            boolean r8 = r2.zzbh()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.common.internal.Preconditions.checkState(r8)     // Catch:{ all -> 0x0d1a }
            r5.zzz()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzgk r8 = r5.zzs     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.common.util.Clock r8 = r8.zzav()     // Catch:{ all -> 0x0d1a }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x0d1a }
            long r10 = r2.zzm()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzgk r12 = r5.zzs     // Catch:{ all -> 0x0d1a }
            r12.zzf()     // Catch:{ all -> 0x0d1a }
            long r12 = com.google.android.gms.measurement.internal.zzag.zzA()     // Catch:{ all -> 0x0d1a }
            long r12 = r8 - r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x0b83
            long r10 = r2.zzm()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzgk r12 = r5.zzs     // Catch:{ all -> 0x0d1a }
            r12.zzf()     // Catch:{ all -> 0x0d1a }
            long r12 = com.google.android.gms.measurement.internal.zzag.zzA()     // Catch:{ all -> 0x0d1a }
            long r12 = r12 + r8
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0ba6
        L_0x0b83:
            com.google.android.gms.measurement.internal.zzgk r10 = r5.zzs     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzfa r10 = r10.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r10 = r10.zzk()     // Catch:{ all -> 0x0d1a }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r2.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzfa.zzn(r12)     // Catch:{ all -> 0x0d1a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0d1a }
            long r13 = r2.zzm()     // Catch:{ all -> 0x0d1a }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0d1a }
            r10.zzd(r11, r12, r8, r9)     // Catch:{ all -> 0x0d1a }
        L_0x0ba6:
            byte[] r8 = r2.zzby()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzll r9 = r5.zzf     // Catch:{ IOException -> 0x0c46 }
            com.google.android.gms.measurement.internal.zzln r9 = r9.zzi     // Catch:{ IOException -> 0x0c46 }
            zzak(r9)     // Catch:{ IOException -> 0x0c46 }
            byte[] r8 = r9.zzy(r8)     // Catch:{ IOException -> 0x0c46 }
            com.google.android.gms.measurement.internal.zzgk r9 = r5.zzs     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzfa r9 = r9.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r9 = r9.zzj()     // Catch:{ all -> 0x0d1a }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0d1a }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0d1a }
            r9.zzb(r10, r11)     // Catch:{ all -> 0x0d1a }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0d1a }
            r9.<init>()     // Catch:{ all -> 0x0d1a }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r2.zzy()     // Catch:{ all -> 0x0d1a }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d1a }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r2.zzm()     // Catch:{ all -> 0x0d1a }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d1a }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d1a }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0d1a }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0d1a }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d1a }
            boolean r8 = r2.zzbn()     // Catch:{ all -> 0x0d1a }
            if (r8 == 0) goto L_0x0c05
            java.lang.String r8 = "retry_count"
            int r10 = r2.zze()     // Catch:{ all -> 0x0d1a }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0d1a }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d1a }
        L_0x0c05:
            android.database.sqlite.SQLiteDatabase r8 = r5.zzh()     // Catch:{ SQLiteException -> 0x0c2c }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0c2c }
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0c5f
            com.google.android.gms.measurement.internal.zzgk r6 = r5.zzs     // Catch:{ SQLiteException -> 0x0c2c }
            com.google.android.gms.measurement.internal.zzfa r6 = r6.zzay()     // Catch:{ SQLiteException -> 0x0c2c }
            com.google.android.gms.measurement.internal.zzey r6 = r6.zzd()     // Catch:{ SQLiteException -> 0x0c2c }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r2.zzy()     // Catch:{ SQLiteException -> 0x0c2c }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfa.zzn(r8)     // Catch:{ SQLiteException -> 0x0c2c }
            r6.zzb(r7, r8)     // Catch:{ SQLiteException -> 0x0c2c }
            goto L_0x0c5f
        L_0x0c2c:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzgk r5 = r5.zzs     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzfa r5 = r5.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzd()     // Catch:{ all -> 0x0d1a }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r2 = r2.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfa.zzn(r2)     // Catch:{ all -> 0x0d1a }
            r5.zzc(r7, r2, r6)     // Catch:{ all -> 0x0d1a }
            goto L_0x0c5f
        L_0x0c46:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzgk r5 = r5.zzs     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzfa r5 = r5.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzd()     // Catch:{ all -> 0x0d1a }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r2 = r2.zzy()     // Catch:{ all -> 0x0d1a }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfa.zzn(r2)     // Catch:{ all -> 0x0d1a }
            r5.zzc(r7, r2, r6)     // Catch:{ all -> 0x0d1a }
        L_0x0c5f:
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            java.util.List r3 = r3.zzb     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x0d1a }
            r2.zzg()     // Catch:{ all -> 0x0d1a }
            r2.zzW()     // Catch:{ all -> 0x0d1a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d1a }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0d1a }
            r6 = 0
        L_0x0c77:
            int r7 = r3.size()     // Catch:{ all -> 0x0d1a }
            if (r6 >= r7) goto L_0x0c94
            if (r6 == 0) goto L_0x0c84
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0d1a }
        L_0x0c84:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0d1a }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d1a }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d1a }
            r5.append(r7)     // Catch:{ all -> 0x0d1a }
            int r6 = r6 + 1
            goto L_0x0c77
        L_0x0c94:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0d1a }
            android.database.sqlite.SQLiteDatabase r6 = r2.zzh()     // Catch:{ all -> 0x0d1a }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0d1a }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0d1a }
            int r6 = r3.size()     // Catch:{ all -> 0x0d1a }
            if (r5 == r6) goto L_0x0cc9
            com.google.android.gms.measurement.internal.zzgk r2 = r2.zzs     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x0d1a }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d1a }
            int r3 = r3.size()     // Catch:{ all -> 0x0d1a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d1a }
            r2.zzc(r6, r5, r3)     // Catch:{ all -> 0x0d1a }
        L_0x0cc9:
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            android.database.sqlite.SQLiteDatabase r3 = r2.zzh()     // Catch:{ all -> 0x0d1a }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0ce1 }
            r6 = 0
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0ce1 }
            r6 = 1
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0ce1 }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r3.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0ce1 }
            goto L_0x0cf6
        L_0x0ce1:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzgk r2 = r2.zzs     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x0d1a }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r4)     // Catch:{ all -> 0x0d1a }
            r2.zzc(r5, r4, r3)     // Catch:{ all -> 0x0d1a }
        L_0x0cf6:
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            r2.zzC()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze
            zzak(r2)
            r2.zzx()
            r2 = 1
            return r2
        L_0x0d08:
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x0d1a }
            zzak(r2)     // Catch:{ all -> 0x0d1a }
            r2.zzC()     // Catch:{ all -> 0x0d1a }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze
            zzak(r2)
            r2.zzx()
            r2 = 0
            return r2
        L_0x0d1a:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzam r3 = r1.zze
            zzak(r3)
            r3.zzx()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzll.zzag(java.lang.String, long):boolean");
    }

    private final boolean zzah() {
        zzaz().zzg();
        zzB();
        zzam zzam = this.zze;
        zzak(zzam);
        if (zzam.zzF()) {
            return true;
        }
        zzam zzam2 = this.zze;
        zzak(zzam2);
        return !TextUtils.isEmpty(zzam2.zzr());
    }

    private final boolean zzai(zzfr zzfr, zzfr zzfr2) {
        Preconditions.checkArgument("_e".equals(zzfr.zzo()));
        zzak(this.zzi);
        zzfw zzB2 = zzln.zzB((zzfs) zzfr.zzaE(), "_sc");
        String str = null;
        String zzh2 = zzB2 == null ? null : zzB2.zzh();
        zzak(this.zzi);
        zzfw zzB3 = zzln.zzB((zzfs) zzfr2.zzaE(), "_pc");
        if (zzB3 != null) {
            str = zzB3.zzh();
        }
        if (str == null || !str.equals(zzh2)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfr.zzo()));
        zzak(this.zzi);
        zzfw zzB4 = zzln.zzB((zzfs) zzfr.zzaE(), "_et");
        if (zzB4 == null || !zzB4.zzw() || zzB4.zzd() <= 0) {
            return true;
        }
        long zzd2 = zzB4.zzd();
        zzak(this.zzi);
        zzfw zzB5 = zzln.zzB((zzfs) zzfr2.zzaE(), "_et");
        if (zzB5 != null && zzB5.zzd() > 0) {
            zzd2 += zzB5.zzd();
        }
        zzak(this.zzi);
        zzln.zzz(zzfr2, "_et", Long.valueOf(zzd2));
        zzak(this.zzi);
        zzln.zzz(zzfr, "_fr", 1L);
        return true;
    }

    private static final boolean zzaj(zzq zzq2) {
        return !TextUtils.isEmpty(zzq2.zzb) || !TextUtils.isEmpty(zzq2.zzq);
    }

    private static final zzkz zzak(zzkz zzkz) {
        if (zzkz == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (zzkz.zzY()) {
            return zzkz;
        } else {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(zzkz.getClass()))));
        }
    }

    public static zzll zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzll.class) {
                if (zzb == null) {
                    zzb = new zzll((zzlm) Preconditions.checkNotNull(new zzlm(context)), (zzgk) null);
                }
            }
        }
        return zzb;
    }

    static /* bridge */ /* synthetic */ void zzy(zzll zzll, zzlm zzlm) {
        zzll.zzaz().zzg();
        zzll.zzm = new zzfs(zzll);
        zzam zzam = new zzam(zzll);
        zzam.zzX();
        zzll.zze = zzam;
        zzll.zzg().zzq((zzaf) Preconditions.checkNotNull(zzll.zzc));
        zzkg zzkg = new zzkg(zzll);
        zzkg.zzX();
        zzll.zzk = zzkg;
        zzaa zzaa = new zzaa(zzll);
        zzaa.zzX();
        zzll.zzh = zzaa;
        zziu zziu = new zziu(zzll);
        zziu.zzX();
        zzll.zzj = zziu;
        zzkx zzkx = new zzkx(zzll);
        zzkx.zzX();
        zzll.zzg = zzkx;
        zzll.zzf = new zzfi(zzll);
        if (zzll.zzr != zzll.zzs) {
            zzll.zzay().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzll.zzr), Integer.valueOf(zzll.zzs));
        }
        zzll.zzo = true;
    }

    /* access modifiers changed from: package-private */
    public final void zzA() {
        zzaz().zzg();
        zzB();
        if (!this.zzp) {
            this.zzp = true;
            if (zzY()) {
                FileChannel fileChannel = this.zzx;
                zzaz().zzg();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    zzay().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            zzay().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        zzay().zzd().zzb("Failed to read from channel", e);
                    }
                }
                int zzi2 = this.zzn.zzh().zzi();
                zzaz().zzg();
                if (i > zzi2) {
                    zzay().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi2));
                } else if (i < zzi2) {
                    FileChannel fileChannel2 = this.zzx;
                    zzaz().zzg();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        zzay().zzd().zza("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(zzi2);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                zzay().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            zzay().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi2));
                            return;
                        } catch (IOException e2) {
                            zzay().zzd().zzb("Failed to write to channel", e2);
                        }
                    }
                    zzay().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi2));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzC(zzh zzh2) {
        ArrayMap arrayMap;
        ArrayMap arrayMap2;
        zzaz().zzg();
        if (!TextUtils.isEmpty(zzh2.zzy()) || !TextUtils.isEmpty(zzh2.zzr())) {
            zzla zzla = this.zzl;
            Uri.Builder builder = new Uri.Builder();
            String zzy2 = zzh2.zzy();
            if (TextUtils.isEmpty(zzy2)) {
                zzy2 = zzh2.zzr();
            }
            ArrayMap arrayMap3 = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) zzen.zzd.zza((Object) null)).encodedAuthority((String) zzen.zze.zza((Object) null)).path("config/app/".concat(String.valueOf(zzy2))).appendQueryParameter("platform", "android");
            zzla.zzs.zzf().zzh();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(64000)).appendQueryParameter("runtime_version", "0");
            zzpj.zzc();
            if (!zzla.zzs.zzf().zzs(zzh2.zzt(), zzen.zzaA)) {
                builder.appendQueryParameter("app_instance_id", zzh2.zzu());
            }
            String uri = builder.build().toString();
            try {
                String str = (String) Preconditions.checkNotNull(zzh2.zzt());
                URL url = new URL(uri);
                zzay().zzj().zzb("Fetching remote configuration", str);
                zzgb zzgb = this.zzc;
                zzak(zzgb);
                zzfe zze2 = zzgb.zze(str);
                zzgb zzgb2 = this.zzc;
                zzak(zzgb2);
                String zzh3 = zzgb2.zzh(str);
                if (zze2 != null) {
                    if (!TextUtils.isEmpty(zzh3)) {
                        arrayMap2 = new ArrayMap();
                        arrayMap2.put("If-Modified-Since", zzh3);
                    } else {
                        arrayMap2 = null;
                    }
                    zzpj.zzc();
                    if (zzg().zzs((String) null, zzen.zzaM)) {
                        zzgb zzgb3 = this.zzc;
                        zzak(zzgb3);
                        String zzf2 = zzgb3.zzf(str);
                        if (!TextUtils.isEmpty(zzf2)) {
                            if (arrayMap2 == null) {
                                arrayMap2 = new ArrayMap();
                            }
                            arrayMap3 = arrayMap2;
                            arrayMap3.put("If-None-Match", zzf2);
                        }
                    }
                    arrayMap = arrayMap2;
                    this.zzt = true;
                    zzfg zzfg = this.zzd;
                    zzak(zzfg);
                    zzld zzld = new zzld(this);
                    zzfg.zzg();
                    zzfg.zzW();
                    Preconditions.checkNotNull(url);
                    Preconditions.checkNotNull(zzld);
                    zzfg.zzs.zzaz().zzo(new zzff(zzfg, str, url, (byte[]) null, arrayMap, zzld));
                }
                arrayMap = arrayMap3;
                this.zzt = true;
                zzfg zzfg2 = this.zzd;
                zzak(zzfg2);
                zzld zzld2 = new zzld(this);
                zzfg2.zzg();
                zzfg2.zzW();
                Preconditions.checkNotNull(url);
                Preconditions.checkNotNull(zzld2);
                zzfg2.zzs.zzaz().zzo(new zzff(zzfg2, str, url, (byte[]) null, arrayMap, zzld2));
            } catch (MalformedURLException unused) {
                zzay().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzfa.zzn(zzh2.zzt()), uri);
            }
        } else {
            zzH((String) Preconditions.checkNotNull(zzh2.zzt()), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzD(zzaw zzaw, zzq zzq2) {
        zzaw zzaw2;
        List<zzac> list;
        List<zzac> list2;
        List<zzac> list3;
        String str;
        zzq zzq3 = zzq2;
        Preconditions.checkNotNull(zzq2);
        Preconditions.checkNotEmpty(zzq3.zza);
        zzaz().zzg();
        zzB();
        String str2 = zzq3.zza;
        zzaw zzaw3 = zzaw;
        long j = zzaw3.zzd;
        zzpp.zzc();
        zziw zziw = null;
        if (zzg().zzs((String) null, zzen.zzat)) {
            zzfb zzb2 = zzfb.zzb(zzaw);
            zzaz().zzg();
            if (!(this.zzD == null || (str = this.zzE) == null || !str.equals(str2))) {
                zziw = this.zzD;
            }
            zzlt.zzK(zziw, zzb2.zzd, false);
            zzaw3 = zzb2.zza();
        }
        zzak(this.zzi);
        if (zzln.zzA(zzaw3, zzq3)) {
            if (!zzq3.zzh) {
                zzd(zzq3);
                return;
            }
            List list4 = zzq3.zzt;
            if (list4 == null) {
                zzaw2 = zzaw3;
            } else if (list4.contains(zzaw3.zza)) {
                Bundle zzc2 = zzaw3.zzb.zzc();
                zzc2.putLong("ga_safelisted", 1);
                zzaw2 = new zzaw(zzaw3.zza, new zzau(zzc2), zzaw3.zzc, zzaw3.zzd);
            } else {
                zzay().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzaw3.zza, zzaw3.zzc);
                return;
            }
            zzam zzam = this.zze;
            zzak(zzam);
            zzam.zzw();
            try {
                zzam zzam2 = this.zze;
                zzak(zzam2);
                Preconditions.checkNotEmpty(str2);
                zzam2.zzg();
                zzam2.zzW();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    zzam2.zzs.zzay().zzk().zzc("Invalid time querying timed out conditional properties", zzfa.zzn(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = zzam2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzac : list) {
                    if (zzac != null) {
                        zzay().zzj().zzd("User property timed out", zzac.zza, this.zzn.zzj().zzf(zzac.zzc.zzb), zzac.zzc.zza());
                        zzaw zzaw4 = zzac.zzg;
                        if (zzaw4 != null) {
                            zzX(new zzaw(zzaw4, j), zzq3);
                        }
                        zzam zzam3 = this.zze;
                        zzak(zzam3);
                        zzam3.zza(str2, zzac.zzc.zzb);
                    }
                }
                zzam zzam4 = this.zze;
                zzak(zzam4);
                Preconditions.checkNotEmpty(str2);
                zzam4.zzg();
                zzam4.zzW();
                if (i < 0) {
                    zzam4.zzs.zzay().zzk().zzc("Invalid time querying expired conditional properties", zzfa.zzn(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = zzam4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList = new ArrayList<>(list2.size());
                for (zzac zzac2 : list2) {
                    if (zzac2 != null) {
                        zzay().zzj().zzd("User property expired", zzac2.zza, this.zzn.zzj().zzf(zzac2.zzc.zzb), zzac2.zzc.zza());
                        zzam zzam5 = this.zze;
                        zzak(zzam5);
                        zzam5.zzA(str2, zzac2.zzc.zzb);
                        zzaw zzaw5 = zzac2.zzk;
                        if (zzaw5 != null) {
                            arrayList.add(zzaw5);
                        }
                        zzam zzam6 = this.zze;
                        zzak(zzam6);
                        zzam6.zza(str2, zzac2.zzc.zzb);
                    }
                }
                for (zzaw zzaw6 : arrayList) {
                    zzX(new zzaw(zzaw6, j), zzq3);
                }
                zzam zzam7 = this.zze;
                zzak(zzam7);
                String str3 = zzaw2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzam7.zzg();
                zzam7.zzW();
                if (i < 0) {
                    zzam7.zzs.zzay().zzk().zzd("Invalid time querying triggered conditional properties", zzfa.zzn(str2), zzam7.zzs.zzj().zzd(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = zzam7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList2 = new ArrayList<>(list3.size());
                for (zzac zzac3 : list3) {
                    if (zzac3 != null) {
                        zzlo zzlo = zzac3.zzc;
                        zzlq zzlq = new zzlq((String) Preconditions.checkNotNull(zzac3.zza), zzac3.zzb, zzlo.zzb, j, Preconditions.checkNotNull(zzlo.zza()));
                        zzam zzam8 = this.zze;
                        zzak(zzam8);
                        if (zzam8.zzL(zzlq)) {
                            zzay().zzj().zzd("User property triggered", zzac3.zza, this.zzn.zzj().zzf(zzlq.zzc), zzlq.zze);
                        } else {
                            zzay().zzd().zzd("Too many active user properties, ignoring", zzfa.zzn(zzac3.zza), this.zzn.zzj().zzf(zzlq.zzc), zzlq.zze);
                        }
                        zzaw zzaw7 = zzac3.zzi;
                        if (zzaw7 != null) {
                            arrayList2.add(zzaw7);
                        }
                        zzac3.zzc = new zzlo(zzlq);
                        zzac3.zze = true;
                        zzam zzam9 = this.zze;
                        zzak(zzam9);
                        zzam9.zzK(zzac3);
                    }
                }
                zzX(zzaw2, zzq3);
                for (zzaw zzaw8 : arrayList2) {
                    zzX(new zzaw(zzaw8, j), zzq3);
                }
                zzam zzam10 = this.zze;
                zzak(zzam10);
                zzam10.zzC();
            } finally {
                zzam zzam11 = this.zze;
                zzak(zzam11);
                zzam11.zzx();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzE(zzaw zzaw, String str) {
        zzaw zzaw2 = zzaw;
        String str2 = str;
        zzam zzam = this.zze;
        zzak(zzam);
        zzh zzj2 = zzam.zzj(str2);
        if (zzj2 == null || TextUtils.isEmpty(zzj2.zzw())) {
            zzay().zzc().zzb("No app data available; dropping event", str2);
            return;
        }
        Boolean zzac = zzac(zzj2);
        if (zzac == null) {
            if (!"_ui".equals(zzaw2.zza)) {
                zzay().zzk().zzb("Could not find package. appId", zzfa.zzn(str));
            }
        } else if (!zzac.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping event. appId", zzfa.zzn(str));
            return;
        }
        zzq zzq2 = r2;
        zzh zzh2 = zzj2;
        zzq zzq3 = new zzq(str, zzj2.zzy(), zzj2.zzw(), zzj2.zzb(), zzj2.zzv(), zzj2.zzm(), zzj2.zzj(), (String) null, zzj2.zzaj(), false, zzh2.zzx(), zzh2.zza(), 0, 0, zzh2.zzai(), false, zzh2.zzr(), zzh2.zzq(), zzh2.zzk(), zzh2.zzC(), (String) null, zzh(str2).zzh(), "", (String) null);
        zzF(zzaw2, zzq2);
    }

    /* access modifiers changed from: package-private */
    public final void zzF(zzaw zzaw, zzq zzq2) {
        Preconditions.checkNotEmpty(zzq2.zza);
        zzfb zzb2 = zzfb.zzb(zzaw);
        zzlt zzv2 = zzv();
        Bundle bundle = zzb2.zzd;
        zzam zzam = this.zze;
        zzak(zzam);
        zzv2.zzL(bundle, zzam.zzi(zzq2.zza));
        zzv().zzM(zzb2, zzg().zzd(zzq2.zza));
        zzaw zza2 = zzb2.zza();
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zza2.zza) && "referrer API v2".equals(zza2.zzb.zzg("_cis"))) {
            String zzg2 = zza2.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(zzg2)) {
                zzV(new zzlo("_lgclid", zza2.zzd, zzg2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzq2);
            }
        }
        zzD(zza2, zzq2);
    }

    /* access modifiers changed from: package-private */
    public final void zzG() {
        this.zzs++;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0104 A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012b A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0151 A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0181 A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0185 A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzH(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.zzgh r0 = r8.zzaz()
            r0.zzg()
            r8.zzB()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            r0 = 0
            if (r12 != 0) goto L_0x0012
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x01a0 }
        L_0x0012:
            com.google.android.gms.measurement.internal.zzfa r1 = r8.zzay()     // Catch:{ all -> 0x01a0 }
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzj()     // Catch:{ all -> 0x01a0 }
            int r2 = r12.length     // Catch:{ all -> 0x01a0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01a0 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.zzb(r3, r2)     // Catch:{ all -> 0x01a0 }
            com.google.android.gms.measurement.internal.zzam r1 = r8.zze     // Catch:{ all -> 0x01a0 }
            zzak(r1)     // Catch:{ all -> 0x01a0 }
            r1.zzw()     // Catch:{ all -> 0x01a0 }
            com.google.android.gms.measurement.internal.zzam r1 = r8.zze     // Catch:{ all -> 0x0196 }
            zzak(r1)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzh r1 = r1.zzj(r9)     // Catch:{ all -> 0x0196 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r10 == r3) goto L_0x0042
            r3 = 204(0xcc, float:2.86E-43)
            if (r10 == r3) goto L_0x0042
            if (r10 != r4) goto L_0x0046
            r10 = r4
        L_0x0042:
            if (r11 != 0) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x0046:
            r3 = r0
        L_0x0047:
            if (r1 != 0) goto L_0x005c
            com.google.android.gms.measurement.internal.zzfa r10 = r8.zzay()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzey r10 = r10.zzk()     // Catch:{ all -> 0x0196 }
            java.lang.String r11 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzfa.zzn(r9)     // Catch:{ all -> 0x0196 }
            r10.zzb(r11, r9)     // Catch:{ all -> 0x0196 }
            goto L_0x0188
        L_0x005c:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00ba
            if (r10 != r5) goto L_0x0063
            goto L_0x00ba
        L_0x0063:
            com.google.android.gms.common.util.Clock r12 = r8.zzav()     // Catch:{ all -> 0x0196 }
            long r12 = r12.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            r1.zzV(r12)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzam r12 = r8.zze     // Catch:{ all -> 0x0196 }
            zzak(r12)     // Catch:{ all -> 0x0196 }
            r12.zzD(r1)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzfa r12 = r8.zzay()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzey r12 = r12.zzj()     // Catch:{ all -> 0x0196 }
            java.lang.String r13 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0196 }
            r12.zzc(r13, r1, r11)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzgb r11 = r8.zzc     // Catch:{ all -> 0x0196 }
            zzak(r11)     // Catch:{ all -> 0x0196 }
            r11.zzl(r9)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzkg r9 = r8.zzk     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzfl r9 = r9.zzd     // Catch:{ all -> 0x0196 }
            com.google.android.gms.common.util.Clock r11 = r8.zzav()     // Catch:{ all -> 0x0196 }
            long r11 = r11.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            r9.zzb(r11)     // Catch:{ all -> 0x0196 }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x00a6
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x00b5
        L_0x00a6:
            com.google.android.gms.measurement.internal.zzkg r9 = r8.zzk     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzfl r9 = r9.zzb     // Catch:{ all -> 0x0196 }
            com.google.android.gms.common.util.Clock r10 = r8.zzav()     // Catch:{ all -> 0x0196 }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            r9.zzb(r10)     // Catch:{ all -> 0x0196 }
        L_0x00b5:
            r8.zzaf()     // Catch:{ all -> 0x0196 }
            goto L_0x0188
        L_0x00ba:
            r11 = 0
            if (r13 == 0) goto L_0x00c6
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r3 = r13.get(r3)     // Catch:{ all -> 0x0196 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0196 }
            goto L_0x00c7
        L_0x00c6:
            r3 = r11
        L_0x00c7:
            if (r3 == 0) goto L_0x00d6
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x0196 }
            if (r6 != 0) goto L_0x00d6
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0196 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0196 }
            goto L_0x00d7
        L_0x00d6:
            r3 = r11
        L_0x00d7:
            com.google.android.gms.internal.measurement.zzpj.zzc()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzag r6 = r8.zzg()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzem r7 = com.google.android.gms.measurement.internal.zzen.zzaM     // Catch:{ all -> 0x0196 }
            boolean r6 = r6.zzs(r11, r7)     // Catch:{ all -> 0x0196 }
            if (r6 == 0) goto L_0x0101
            if (r13 == 0) goto L_0x00f1
            java.lang.String r6 = "ETag"
            java.lang.Object r13 = r13.get(r6)     // Catch:{ all -> 0x0196 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x0196 }
            goto L_0x00f2
        L_0x00f1:
            r13 = r11
        L_0x00f2:
            if (r13 == 0) goto L_0x0101
            boolean r6 = r13.isEmpty()     // Catch:{ all -> 0x0196 }
            if (r6 != 0) goto L_0x0101
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x0196 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0196 }
            goto L_0x0102
        L_0x0101:
            r13 = r11
        L_0x0102:
            if (r10 == r5) goto L_0x0120
            if (r10 != r4) goto L_0x0107
            goto L_0x0120
        L_0x0107:
            com.google.android.gms.measurement.internal.zzgb r11 = r8.zzc     // Catch:{ all -> 0x0196 }
            zzak(r11)     // Catch:{ all -> 0x0196 }
            boolean r11 = r11.zzt(r9, r12, r3, r13)     // Catch:{ all -> 0x0196 }
            if (r11 != 0) goto L_0x013c
            com.google.android.gms.measurement.internal.zzam r9 = r8.zze     // Catch:{ all -> 0x01a0 }
            zzak(r9)     // Catch:{ all -> 0x01a0 }
        L_0x0117:
            r9.zzx()     // Catch:{ all -> 0x01a0 }
            r8.zzt = r0
            r8.zzad()
            return
        L_0x0120:
            com.google.android.gms.measurement.internal.zzgb r12 = r8.zzc     // Catch:{ all -> 0x0196 }
            zzak(r12)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.internal.measurement.zzfe r12 = r12.zze(r9)     // Catch:{ all -> 0x0196 }
            if (r12 != 0) goto L_0x013c
            com.google.android.gms.measurement.internal.zzgb r12 = r8.zzc     // Catch:{ all -> 0x0196 }
            zzak(r12)     // Catch:{ all -> 0x0196 }
            boolean r11 = r12.zzt(r9, r11, r11, r11)     // Catch:{ all -> 0x0196 }
            if (r11 != 0) goto L_0x013c
            com.google.android.gms.measurement.internal.zzam r9 = r8.zze     // Catch:{ all -> 0x01a0 }
            zzak(r9)     // Catch:{ all -> 0x01a0 }
            goto L_0x0117
        L_0x013c:
            com.google.android.gms.common.util.Clock r11 = r8.zzav()     // Catch:{ all -> 0x0196 }
            long r11 = r11.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            r1.zzM(r11)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzam r11 = r8.zze     // Catch:{ all -> 0x0196 }
            zzak(r11)     // Catch:{ all -> 0x0196 }
            r11.zzD(r1)     // Catch:{ all -> 0x0196 }
            if (r10 != r5) goto L_0x015f
            com.google.android.gms.measurement.internal.zzfa r10 = r8.zzay()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzey r10 = r10.zzl()     // Catch:{ all -> 0x0196 }
            java.lang.String r11 = "Config not found. Using empty config. appId"
            r10.zzb(r11, r9)     // Catch:{ all -> 0x0196 }
            goto L_0x0170
        L_0x015f:
            com.google.android.gms.measurement.internal.zzfa r9 = r8.zzay()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzey r9 = r9.zzj()     // Catch:{ all -> 0x0196 }
            java.lang.String r11 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0196 }
            r9.zzc(r11, r10, r2)     // Catch:{ all -> 0x0196 }
        L_0x0170:
            com.google.android.gms.measurement.internal.zzfg r9 = r8.zzd     // Catch:{ all -> 0x0196 }
            zzak(r9)     // Catch:{ all -> 0x0196 }
            boolean r9 = r9.zza()     // Catch:{ all -> 0x0196 }
            if (r9 == 0) goto L_0x0185
            boolean r9 = r8.zzah()     // Catch:{ all -> 0x0196 }
            if (r9 == 0) goto L_0x0185
            r8.zzW()     // Catch:{ all -> 0x0196 }
            goto L_0x0188
        L_0x0185:
            r8.zzaf()     // Catch:{ all -> 0x0196 }
        L_0x0188:
            com.google.android.gms.measurement.internal.zzam r9 = r8.zze     // Catch:{ all -> 0x0196 }
            zzak(r9)     // Catch:{ all -> 0x0196 }
            r9.zzC()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzam r9 = r8.zze     // Catch:{ all -> 0x01a0 }
            zzak(r9)     // Catch:{ all -> 0x01a0 }
            goto L_0x0117
        L_0x0196:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzam r10 = r8.zze     // Catch:{ all -> 0x01a0 }
            zzak(r10)     // Catch:{ all -> 0x01a0 }
            r10.zzx()     // Catch:{ all -> 0x01a0 }
            throw r9     // Catch:{ all -> 0x01a0 }
        L_0x01a0:
            r9 = move-exception
            r8.zzt = r0
            r8.zzad()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzll.zzH(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void zzI(boolean z) {
        zzaf();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void zzJ(int i, Throwable th, byte[] bArr, String str) {
        zzam zzam;
        zzaz().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzu = false;
                zzad();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzd.zzb(zzav().currentTimeMillis());
            if (i == 503 || i == 429) {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            }
            zzam zzam2 = this.zze;
            zzak(zzam2);
            zzam2.zzy(list);
            zzaf();
            this.zzu = false;
            zzad();
        }
        if (th == null) {
            try {
                this.zzk.zzc.zzb(zzav().currentTimeMillis());
                this.zzk.zzd.zzb(0);
                zzaf();
                zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzam zzam3 = this.zze;
                zzak(zzam3);
                zzam3.zzw();
                try {
                    for (Long l : list) {
                        try {
                            zzam = this.zze;
                            zzak(zzam);
                            long longValue = l.longValue();
                            zzam.zzg();
                            zzam.zzW();
                            if (zzam.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            zzam.zzs.zzay().zzd().zzb("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List list2 = this.zzz;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    zzam zzam4 = this.zze;
                    zzak(zzam4);
                    zzam4.zzC();
                    zzam zzam5 = this.zze;
                    zzak(zzam5);
                    zzam5.zzx();
                    this.zzz = null;
                    zzfg zzfg = this.zzd;
                    zzak(zzfg);
                    if (!zzfg.zza() || !zzah()) {
                        this.zzA = -1;
                        zzaf();
                    } else {
                        zzW();
                    }
                    this.zza = 0;
                } catch (Throwable th3) {
                    zzam zzam6 = this.zze;
                    zzak(zzam6);
                    zzam6.zzx();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                zzay().zzd().zzb("Database error while trying to delete uploaded bundles", e3);
                this.zza = zzav().elapsedRealtime();
                zzay().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
            this.zzu = false;
            zzad();
        }
        zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.zzk.zzd.zzb(zzav().currentTimeMillis());
        this.zzk.zzb.zzb(zzav().currentTimeMillis());
        zzam zzam22 = this.zze;
        zzak(zzam22);
        zzam22.zzy(list);
        zzaf();
        this.zzu = false;
        zzad();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03ce A[Catch:{ SQLiteException -> 0x01cd, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03fa A[Catch:{ SQLiteException -> 0x01cd, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0411 A[SYNTHETIC, Splitter:B:128:0x0411] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04d9 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x053d A[Catch:{ SQLiteException -> 0x01cd, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b9 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e4 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021a A[Catch:{ SQLiteException -> 0x01cd, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0239 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x023f A[Catch:{ SQLiteException -> 0x01cd, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x024e A[Catch:{ SQLiteException -> 0x01cd, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025e A[Catch:{ SQLiteException -> 0x01cd, all -> 0x056b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzK(com.google.android.gms.measurement.internal.zzq r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.zzgh r8 = r23.zzaz()
            r8.zzg()
            r23.zzB()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r24)
            java.lang.String r8 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            boolean r8 = zzaj(r24)
            if (r8 == 0) goto L_0x0575
            com.google.android.gms.measurement.internal.zzam r8 = r1.zze
            zzak(r8)
            java.lang.String r9 = r2.zza
            com.google.android.gms.measurement.internal.zzh r8 = r8.zzj(r9)
            r9 = 0
            if (r8 == 0) goto L_0x005e
            java.lang.String r11 = r8.zzy()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r2.zzb
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x005e
            r8.zzM(r9)
            com.google.android.gms.measurement.internal.zzam r11 = r1.zze
            zzak(r11)
            r11.zzD(r8)
            com.google.android.gms.measurement.internal.zzgb r8 = r1.zzc
            zzak(r8)
            java.lang.String r11 = r2.zza
            r8.zzm(r11)
        L_0x005e:
            boolean r8 = r2.zzh
            if (r8 != 0) goto L_0x0066
            r23.zzd(r24)
            return
        L_0x0066:
            long r11 = r2.zzm
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0074
            com.google.android.gms.common.util.Clock r8 = r23.zzav()
            long r11 = r8.currentTimeMillis()
        L_0x0074:
            com.google.android.gms.measurement.internal.zzgk r8 = r1.zzn
            com.google.android.gms.measurement.internal.zzaq r8 = r8.zzg()
            r8.zzd()
            int r8 = r2.zzn
            r15 = 1
            if (r8 == 0) goto L_0x009c
            if (r8 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.zzfa r13 = r23.zzay()
            com.google.android.gms.measurement.internal.zzey r13 = r13.zzk()
            java.lang.String r14 = r2.zza
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzfa.zzn(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.zzc(r9, r14, r8)
            r8 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.zzam r9 = r1.zze
            zzak(r9)
            r9.zzw()
            com.google.android.gms.measurement.internal.zzam r9 = r1.zze     // Catch:{ all -> 0x056b }
            zzak(r9)     // Catch:{ all -> 0x056b }
            java.lang.String r10 = r2.zza     // Catch:{ all -> 0x056b }
            java.lang.String r13 = "_npa"
            com.google.android.gms.measurement.internal.zzlq r9 = r9.zzp(r10, r13)     // Catch:{ all -> 0x056b }
            if (r9 == 0) goto L_0x00c5
            java.lang.String r10 = "auto"
            java.lang.String r13 = r9.zzb     // Catch:{ all -> 0x056b }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x056b }
            if (r10 == 0) goto L_0x00be
            goto L_0x00c5
        L_0x00be:
            r21 = r3
            r22 = r4
            r4 = r15
            r3 = 0
            goto L_0x0119
        L_0x00c5:
            java.lang.Boolean r10 = r2.zzr     // Catch:{ all -> 0x056b }
            if (r10 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.zzlo r10 = new com.google.android.gms.measurement.internal.zzlo     // Catch:{ all -> 0x056b }
            java.lang.String r14 = "_npa"
            java.lang.Boolean r13 = r2.zzr     // Catch:{ all -> 0x056b }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x056b }
            if (r15 == r13) goto L_0x00d8
            r19 = 0
            goto L_0x00da
        L_0x00d8:
            r19 = 1
        L_0x00da:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x056b }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 1
            r13 = r10
            r3 = 0
            r4 = r15
            r15 = r11
            r17 = r19
            r18 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x056b }
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r9.zze     // Catch:{ all -> 0x056b }
            java.lang.Long r13 = r10.zzd     // Catch:{ all -> 0x056b }
            boolean r9 = r9.equals(r13)     // Catch:{ all -> 0x056b }
            if (r9 != 0) goto L_0x0119
        L_0x00fd:
            r1.zzV(r10, r2)     // Catch:{ all -> 0x056b }
            goto L_0x0119
        L_0x0101:
            r21 = r3
            r22 = r4
            r4 = r15
            r3 = 0
            if (r9 == 0) goto L_0x0119
            com.google.android.gms.measurement.internal.zzlo r9 = new com.google.android.gms.measurement.internal.zzlo     // Catch:{ all -> 0x056b }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r9
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x056b }
            r1.zzO(r9, r2)     // Catch:{ all -> 0x056b }
        L_0x0119:
            com.google.android.gms.measurement.internal.zzam r9 = r1.zze     // Catch:{ all -> 0x056b }
            zzak(r9)     // Catch:{ all -> 0x056b }
            java.lang.String r10 = r2.zza     // Catch:{ all -> 0x056b }
            java.lang.Object r10 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)     // Catch:{ all -> 0x056b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzh r9 = r9.zzj(r10)     // Catch:{ all -> 0x056b }
            if (r9 == 0) goto L_0x01e2
            com.google.android.gms.measurement.internal.zzlt r13 = r23.zzv()     // Catch:{ all -> 0x056b }
            java.lang.String r14 = r2.zzb     // Catch:{ all -> 0x056b }
            java.lang.String r15 = r9.zzy()     // Catch:{ all -> 0x056b }
            java.lang.String r10 = r2.zzq     // Catch:{ all -> 0x056b }
            java.lang.String r3 = r9.zzr()     // Catch:{ all -> 0x056b }
            boolean r3 = r13.zzam(r14, r15, r10, r3)     // Catch:{ all -> 0x056b }
            if (r3 == 0) goto L_0x01e2
            com.google.android.gms.measurement.internal.zzfa r3 = r23.zzay()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzk()     // Catch:{ all -> 0x056b }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r9.zzt()     // Catch:{ all -> 0x056b }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzfa.zzn(r13)     // Catch:{ all -> 0x056b }
            r3.zzb(r10, r13)     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzam r3 = r1.zze     // Catch:{ all -> 0x056b }
            zzak(r3)     // Catch:{ all -> 0x056b }
            java.lang.String r9 = r9.zzt()     // Catch:{ all -> 0x056b }
            r3.zzW()     // Catch:{ all -> 0x056b }
            r3.zzg()     // Catch:{ all -> 0x056b }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)     // Catch:{ all -> 0x056b }
            android.database.sqlite.SQLiteDatabase r10 = r3.zzh()     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01cd }
            r14 = 0
            r13[r14] = r9     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r14 = "events"
            int r14 = r10.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01e1
            com.google.android.gms.measurement.internal.zzgk r0 = r3.zzs     // Catch:{ SQLiteException -> 0x01cd }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ SQLiteException -> 0x01cd }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzj()     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01cd }
            r0.zzc(r10, r9, r13)     // Catch:{ SQLiteException -> 0x01cd }
            goto L_0x01e1
        L_0x01cd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgk r3 = r3.zzs     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ all -> 0x056b }
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzfa.zzn(r9)     // Catch:{ all -> 0x056b }
            r3.zzc(r10, r9, r0)     // Catch:{ all -> 0x056b }
        L_0x01e1:
            r9 = 0
        L_0x01e2:
            if (r9 == 0) goto L_0x0239
            long r13 = r9.zzb()     // Catch:{ all -> 0x056b }
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01fc
            long r13 = r9.zzb()     // Catch:{ all -> 0x056b }
            r3 = r5
            long r4 = r2.zzj     // Catch:{ all -> 0x056b }
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01fd
            r0 = 1
            goto L_0x01fe
        L_0x01fc:
            r3 = r5
        L_0x01fd:
            r0 = 0
        L_0x01fe:
            java.lang.String r4 = r9.zzw()     // Catch:{ all -> 0x056b }
            long r13 = r9.zzb()     // Catch:{ all -> 0x056b }
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x0216
            if (r4 == 0) goto L_0x0216
            java.lang.String r5 = r2.zzc     // Catch:{ all -> 0x056b }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x056b }
            if (r5 != 0) goto L_0x0216
            r15 = 1
            goto L_0x0217
        L_0x0216:
            r15 = 0
        L_0x0217:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x023a
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x056b }
            r0.<init>()     // Catch:{ all -> 0x056b }
            java.lang.String r5 = "_pv"
            r0.putString(r5, r4)     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzaw r4 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x056b }
            r15.<init>(r0)     // Catch:{ all -> 0x056b }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r4
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x056b }
            r1.zzD(r4, r2)     // Catch:{ all -> 0x056b }
            goto L_0x023a
        L_0x0239:
            r3 = r5
        L_0x023a:
            r23.zzd(r24)     // Catch:{ all -> 0x056b }
            if (r8 != 0) goto L_0x024e
            com.google.android.gms.measurement.internal.zzam r0 = r1.zze     // Catch:{ all -> 0x056b }
            zzak(r0)     // Catch:{ all -> 0x056b }
            java.lang.String r4 = r2.zza     // Catch:{ all -> 0x056b }
            java.lang.String r5 = "_f"
            com.google.android.gms.measurement.internal.zzas r0 = r0.zzn(r4, r5)     // Catch:{ all -> 0x056b }
            r15 = 0
            goto L_0x025c
        L_0x024e:
            com.google.android.gms.measurement.internal.zzam r0 = r1.zze     // Catch:{ all -> 0x056b }
            zzak(r0)     // Catch:{ all -> 0x056b }
            java.lang.String r4 = r2.zza     // Catch:{ all -> 0x056b }
            java.lang.String r5 = "_v"
            com.google.android.gms.measurement.internal.zzas r0 = r0.zzn(r4, r5)     // Catch:{ all -> 0x056b }
            r15 = 1
        L_0x025c:
            if (r0 != 0) goto L_0x053d
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r11 / r4
            r13 = 1
            long r8 = r8 + r13
            long r8 = r8 * r4
            java.lang.String r4 = "_dac"
            java.lang.String r5 = "_et"
            java.lang.String r14 = "_r"
            java.lang.String r13 = "_c"
            if (r15 != 0) goto L_0x04f3
            com.google.android.gms.measurement.internal.zzlo r0 = new com.google.android.gms.measurement.internal.zzlo     // Catch:{ all -> 0x056b }
            java.lang.String r15 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x056b }
            java.lang.String r18 = "auto"
            r8 = r13
            r13 = r0
            r9 = r14
            r14 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x056b }
            r1.zzV(r0, r2)     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzgh r0 = r23.zzaz()     // Catch:{ all -> 0x056b }
            r0.zzg()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzfs r0 = r1.zzm     // Catch:{ all -> 0x056b }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x056b }
            r13 = r0
            com.google.android.gms.measurement.internal.zzfs r13 = (com.google.android.gms.measurement.internal.zzfs) r13     // Catch:{ all -> 0x056b }
            java.lang.String r0 = r2.zza     // Catch:{ all -> 0x056b }
            if (r0 == 0) goto L_0x038d
            boolean r14 = r0.isEmpty()     // Catch:{ all -> 0x056b }
            if (r14 == 0) goto L_0x02a2
            goto L_0x038d
        L_0x02a2:
            com.google.android.gms.measurement.internal.zzgk r14 = r13.zza     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzgh r14 = r14.zzaz()     // Catch:{ all -> 0x056b }
            r14.zzg()     // Catch:{ all -> 0x056b }
            boolean r14 = r13.zza()     // Catch:{ all -> 0x056b }
            if (r14 != 0) goto L_0x02c2
            com.google.android.gms.measurement.internal.zzgk r0 = r13.zza     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzi()     // Catch:{ all -> 0x056b }
            java.lang.String r3 = "Install Referrer Reporter is not available"
            r0.zza(r3)     // Catch:{ all -> 0x056b }
            goto L_0x039c
        L_0x02c2:
            com.google.android.gms.measurement.internal.zzfr r14 = new com.google.android.gms.measurement.internal.zzfr     // Catch:{ all -> 0x056b }
            r14.<init>(r13, r0)     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzgk r0 = r13.zza     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzgh r0 = r0.zzaz()     // Catch:{ all -> 0x056b }
            r0.zzg()     // Catch:{ all -> 0x056b }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x056b }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x056b }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x056b }
            java.lang.String r10 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r3, r10)     // Catch:{ all -> 0x056b }
            r0.setComponent(r15)     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzgk r10 = r13.zza     // Catch:{ all -> 0x056b }
            android.content.Context r10 = r10.zzau()     // Catch:{ all -> 0x056b }
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch:{ all -> 0x056b }
            if (r10 != 0) goto L_0x02fe
            com.google.android.gms.measurement.internal.zzgk r0 = r13.zza     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzm()     // Catch:{ all -> 0x056b }
            java.lang.String r3 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.zza(r3)     // Catch:{ all -> 0x056b }
            goto L_0x039c
        L_0x02fe:
            r15 = 0
            java.util.List r10 = r10.queryIntentServices(r0, r15)     // Catch:{ all -> 0x056b }
            if (r10 == 0) goto L_0x037d
            boolean r17 = r10.isEmpty()     // Catch:{ all -> 0x056b }
            if (r17 != 0) goto L_0x037d
            java.lang.Object r10 = r10.get(r15)     // Catch:{ all -> 0x056b }
            android.content.pm.ResolveInfo r10 = (android.content.pm.ResolveInfo) r10     // Catch:{ all -> 0x056b }
            android.content.pm.ServiceInfo r15 = r10.serviceInfo     // Catch:{ all -> 0x056b }
            if (r15 == 0) goto L_0x039c
            android.content.pm.ServiceInfo r15 = r10.serviceInfo     // Catch:{ all -> 0x056b }
            java.lang.String r15 = r15.packageName     // Catch:{ all -> 0x056b }
            android.content.pm.ServiceInfo r10 = r10.serviceInfo     // Catch:{ all -> 0x056b }
            java.lang.String r10 = r10.name     // Catch:{ all -> 0x056b }
            if (r10 == 0) goto L_0x036d
            boolean r3 = r3.equals(r15)     // Catch:{ all -> 0x056b }
            if (r3 == 0) goto L_0x036d
            boolean r3 = r13.zza()     // Catch:{ all -> 0x056b }
            if (r3 == 0) goto L_0x036d
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x056b }
            r3.<init>(r0)     // Catch:{ all -> 0x056b }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ RuntimeException -> 0x0358 }
            com.google.android.gms.measurement.internal.zzgk r10 = r13.zza     // Catch:{ RuntimeException -> 0x0358 }
            android.content.Context r10 = r10.zzau()     // Catch:{ RuntimeException -> 0x0358 }
            r15 = 1
            boolean r0 = r0.bindService(r10, r3, r14, r15)     // Catch:{ RuntimeException -> 0x0358 }
            com.google.android.gms.measurement.internal.zzgk r3 = r13.zza     // Catch:{ RuntimeException -> 0x0358 }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ RuntimeException -> 0x0358 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzj()     // Catch:{ RuntimeException -> 0x0358 }
            java.lang.String r14 = "Install Referrer Service is"
            java.lang.String r15 = "available"
            java.lang.String r16 = "not available"
            r10 = 1
            if (r10 == r0) goto L_0x0354
            r15 = r16
        L_0x0354:
            r3.zzb(r14, r15)     // Catch:{ RuntimeException -> 0x0358 }
            goto L_0x039c
        L_0x0358:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgk r3 = r13.zza     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ all -> 0x056b }
            java.lang.String r13 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x056b }
            r3.zzb(r13, r0)     // Catch:{ all -> 0x056b }
            goto L_0x039c
        L_0x036d:
            com.google.android.gms.measurement.internal.zzgk r0 = r13.zza     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzk()     // Catch:{ all -> 0x056b }
            java.lang.String r3 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.zza(r3)     // Catch:{ all -> 0x056b }
            goto L_0x039c
        L_0x037d:
            com.google.android.gms.measurement.internal.zzgk r0 = r13.zza     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzi()     // Catch:{ all -> 0x056b }
            java.lang.String r3 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.zza(r3)     // Catch:{ all -> 0x056b }
            goto L_0x039c
        L_0x038d:
            com.google.android.gms.measurement.internal.zzgk r0 = r13.zza     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzm()     // Catch:{ all -> 0x056b }
            java.lang.String r3 = "Install Referrer Reporter was called with invalid app package name"
            r0.zza(r3)     // Catch:{ all -> 0x056b }
        L_0x039c:
            com.google.android.gms.measurement.internal.zzgh r0 = r23.zzaz()     // Catch:{ all -> 0x056b }
            r0.zzg()     // Catch:{ all -> 0x056b }
            r23.zzB()     // Catch:{ all -> 0x056b }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x056b }
            r3.<init>()     // Catch:{ all -> 0x056b }
            r13 = 1
            r3.putLong(r8, r13)     // Catch:{ all -> 0x056b }
            r3.putLong(r9, r13)     // Catch:{ all -> 0x056b }
            r8 = 0
            r3.putLong(r7, r8)     // Catch:{ all -> 0x056b }
            r3.putLong(r6, r8)     // Catch:{ all -> 0x056b }
            r15 = r22
            r3.putLong(r15, r8)     // Catch:{ all -> 0x056b }
            r14 = r21
            r3.putLong(r14, r8)     // Catch:{ all -> 0x056b }
            r8 = 1
            r3.putLong(r5, r8)     // Catch:{ all -> 0x056b }
            boolean r0 = r2.zzp     // Catch:{ all -> 0x056b }
            if (r0 == 0) goto L_0x03d1
            r3.putLong(r4, r8)     // Catch:{ all -> 0x056b }
        L_0x03d1:
            java.lang.String r0 = r2.zza     // Catch:{ all -> 0x056b }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x056b }
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzam r0 = r1.zze     // Catch:{ all -> 0x056b }
            zzak(r0)     // Catch:{ all -> 0x056b }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch:{ all -> 0x056b }
            r0.zzg()     // Catch:{ all -> 0x056b }
            r0.zzW()     // Catch:{ all -> 0x056b }
            java.lang.String r5 = "first_open_count"
            long r8 = r0.zzc(r4, r5)     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzgk r0 = r1.zzn     // Catch:{ all -> 0x056b }
            android.content.Context r0 = r0.zzau()     // Catch:{ all -> 0x056b }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x056b }
            if (r0 != 0) goto L_0x0411
            com.google.android.gms.measurement.internal.zzfa r0 = r23.zzay()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzd()     // Catch:{ all -> 0x056b }
            java.lang.String r5 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r4)     // Catch:{ all -> 0x056b }
            r0.zzb(r5, r4)     // Catch:{ all -> 0x056b }
            r22 = r6
        L_0x040d:
            r4 = 0
            goto L_0x04d5
        L_0x0411:
            com.google.android.gms.measurement.internal.zzgk r0 = r1.zzn     // Catch:{ NameNotFoundException -> 0x0421 }
            android.content.Context r0 = r0.zzau()     // Catch:{ NameNotFoundException -> 0x0421 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x0421 }
            r5 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0421 }
            goto L_0x0434
        L_0x0421:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfa r5 = r23.zzay()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzd()     // Catch:{ all -> 0x056b }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzfa.zzn(r4)     // Catch:{ all -> 0x056b }
            r5.zzc(r13, r10, r0)     // Catch:{ all -> 0x056b }
            r0 = 0
        L_0x0434:
            if (r0 == 0) goto L_0x0494
            r21 = r14
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x056b }
            r17 = 0
            int r5 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x048e
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x056b }
            r22 = r6
            long r5 = r0.lastUpdateTime     // Catch:{ all -> 0x056b }
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x046e
            com.google.android.gms.measurement.internal.zzag r0 = r23.zzg()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzem r5 = com.google.android.gms.measurement.internal.zzen.zzac     // Catch:{ all -> 0x056b }
            r6 = 0
            boolean r0 = r0.zzs(r6, r5)     // Catch:{ all -> 0x056b }
            if (r0 == 0) goto L_0x0468
            r13 = 0
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0466
            r13 = 1
            r3.putLong(r7, r13)     // Catch:{ all -> 0x056b }
            r0 = 0
            r8 = 0
            goto L_0x0470
        L_0x0466:
            r0 = 0
            goto L_0x0470
        L_0x0468:
            r13 = 1
            r3.putLong(r7, r13)     // Catch:{ all -> 0x056b }
            goto L_0x0466
        L_0x046e:
            r6 = 0
            r0 = 1
        L_0x0470:
            com.google.android.gms.measurement.internal.zzlo r5 = new com.google.android.gms.measurement.internal.zzlo     // Catch:{ all -> 0x056b }
            java.lang.String r14 = "_fi"
            r7 = 1
            if (r7 == r0) goto L_0x047a
            r16 = 0
            goto L_0x047c
        L_0x047a:
            r16 = 1
        L_0x047c:
            java.lang.Long r17 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x056b }
            java.lang.String r18 = "auto"
            r13 = r5
            r7 = r21
            r6 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x056b }
            r1.zzV(r5, r2)     // Catch:{ all -> 0x056b }
            goto L_0x0498
        L_0x048e:
            r22 = r6
            r6 = r15
            r7 = r21
            goto L_0x0498
        L_0x0494:
            r22 = r6
            r7 = r14
            r6 = r15
        L_0x0498:
            com.google.android.gms.measurement.internal.zzgk r0 = r1.zzn     // Catch:{ NameNotFoundException -> 0x04a8 }
            android.content.Context r0 = r0.zzau()     // Catch:{ NameNotFoundException -> 0x04a8 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x04a8 }
            r5 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x04a8 }
            goto L_0x04bb
        L_0x04a8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfa r5 = r23.zzay()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzd()     // Catch:{ all -> 0x056b }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r4)     // Catch:{ all -> 0x056b }
            r5.zzc(r13, r4, r0)     // Catch:{ all -> 0x056b }
            r0 = 0
        L_0x04bb:
            if (r0 == 0) goto L_0x040d
            int r4 = r0.flags     // Catch:{ all -> 0x056b }
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x04c8
            r4 = 1
            r3.putLong(r6, r4)     // Catch:{ all -> 0x056b }
        L_0x04c8:
            int r0 = r0.flags     // Catch:{ all -> 0x056b }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x040d
            r4 = 1
            r3.putLong(r7, r4)     // Catch:{ all -> 0x056b }
            goto L_0x040d
        L_0x04d5:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x04de
            r4 = r22
            r3.putLong(r4, r8)     // Catch:{ all -> 0x056b }
        L_0x04de:
            com.google.android.gms.measurement.internal.zzaw r0 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x056b }
            r15.<init>(r3)     // Catch:{ all -> 0x056b }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x056b }
            r1.zzF(r0, r2)     // Catch:{ all -> 0x056b }
            goto L_0x055a
        L_0x04f3:
            r6 = r13
            r3 = r14
            com.google.android.gms.measurement.internal.zzlo r0 = new com.google.android.gms.measurement.internal.zzlo     // Catch:{ all -> 0x056b }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x056b }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x056b }
            r1.zzV(r0, r2)     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzgh r0 = r23.zzaz()     // Catch:{ all -> 0x056b }
            r0.zzg()     // Catch:{ all -> 0x056b }
            r23.zzB()     // Catch:{ all -> 0x056b }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x056b }
            r0.<init>()     // Catch:{ all -> 0x056b }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x056b }
            r0.putLong(r3, r7)     // Catch:{ all -> 0x056b }
            r0.putLong(r5, r7)     // Catch:{ all -> 0x056b }
            boolean r3 = r2.zzp     // Catch:{ all -> 0x056b }
            if (r3 == 0) goto L_0x0528
            r0.putLong(r4, r7)     // Catch:{ all -> 0x056b }
        L_0x0528:
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x056b }
            r15.<init>(r0)     // Catch:{ all -> 0x056b }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x056b }
            r1.zzF(r3, r2)     // Catch:{ all -> 0x056b }
            goto L_0x055a
        L_0x053d:
            boolean r0 = r2.zzi     // Catch:{ all -> 0x056b }
            if (r0 == 0) goto L_0x055a
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x056b }
            r0.<init>()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x056b }
            r15.<init>(r0)     // Catch:{ all -> 0x056b }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x056b }
            r1.zzF(r3, r2)     // Catch:{ all -> 0x056b }
        L_0x055a:
            com.google.android.gms.measurement.internal.zzam r0 = r1.zze     // Catch:{ all -> 0x056b }
            zzak(r0)     // Catch:{ all -> 0x056b }
            r0.zzC()     // Catch:{ all -> 0x056b }
            com.google.android.gms.measurement.internal.zzam r0 = r1.zze
            zzak(r0)
            r0.zzx()
            return
        L_0x056b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze
            zzak(r2)
            r2.zzx()
            throw r0
        L_0x0575:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzll.zzK(com.google.android.gms.measurement.internal.zzq):void");
    }

    /* access modifiers changed from: package-private */
    public final void zzL() {
        this.zzr++;
    }

    /* access modifiers changed from: package-private */
    public final void zzM(zzac zzac) {
        zzq zzab = zzab((String) Preconditions.checkNotNull(zzac.zza));
        if (zzab != null) {
            zzN(zzac, zzab);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzN(zzac zzac, zzq zzq2) {
        Preconditions.checkNotNull(zzac);
        Preconditions.checkNotEmpty(zzac.zza);
        Preconditions.checkNotNull(zzac.zzc);
        Preconditions.checkNotEmpty(zzac.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzaj(zzq2)) {
            if (zzq2.zzh) {
                zzam zzam = this.zze;
                zzak(zzam);
                zzam.zzw();
                try {
                    zzd(zzq2);
                    String str = (String) Preconditions.checkNotNull(zzac.zza);
                    zzam zzam2 = this.zze;
                    zzak(zzam2);
                    zzac zzk2 = zzam2.zzk(str, zzac.zzc.zzb);
                    if (zzk2 != null) {
                        zzay().zzc().zzc("Removing conditional user property", zzac.zza, this.zzn.zzj().zzf(zzac.zzc.zzb));
                        zzam zzam3 = this.zze;
                        zzak(zzam3);
                        zzam3.zza(str, zzac.zzc.zzb);
                        if (zzk2.zze) {
                            zzam zzam4 = this.zze;
                            zzak(zzam4);
                            zzam4.zzA(str, zzac.zzc.zzb);
                        }
                        zzaw zzaw = zzac.zzk;
                        if (zzaw != null) {
                            zzau zzau = zzaw.zzb;
                            zzX((zzaw) Preconditions.checkNotNull(zzv().zzz(str, ((zzaw) Preconditions.checkNotNull(zzac.zzk)).zza, zzau != null ? zzau.zzc() : null, zzk2.zzb, zzac.zzk.zzd, true, true)), zzq2);
                        }
                    } else {
                        zzay().zzk().zzc("Conditional user property doesn't exist", zzfa.zzn(zzac.zza), this.zzn.zzj().zzf(zzac.zzc.zzb));
                    }
                    zzam zzam5 = this.zze;
                    zzak(zzam5);
                    zzam5.zzC();
                } finally {
                    zzam zzam6 = this.zze;
                    zzak(zzam6);
                    zzam6.zzx();
                }
            } else {
                zzd(zzq2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzO(zzlo zzlo, zzq zzq2) {
        zzaz().zzg();
        zzB();
        if (zzaj(zzq2)) {
            if (!zzq2.zzh) {
                zzd(zzq2);
            } else if (!"_npa".equals(zzlo.zzb) || zzq2.zzr == null) {
                zzay().zzc().zzb("Removing user property", this.zzn.zzj().zzf(zzlo.zzb));
                zzam zzam = this.zze;
                zzak(zzam);
                zzam.zzw();
                try {
                    zzd(zzq2);
                    zzne.zzc();
                    if (this.zzn.zzf().zzs((String) null, zzen.zzan) && this.zzn.zzf().zzs((String) null, zzen.zzap) && "_id".equals(zzlo.zzb)) {
                        zzam zzam2 = this.zze;
                        zzak(zzam2);
                        zzam2.zzA((String) Preconditions.checkNotNull(zzq2.zza), "_lair");
                    }
                    zzam zzam3 = this.zze;
                    zzak(zzam3);
                    zzam3.zzA((String) Preconditions.checkNotNull(zzq2.zza), zzlo.zzb);
                    zzam zzam4 = this.zze;
                    zzak(zzam4);
                    zzam4.zzC();
                    zzay().zzc().zzb("User property removed", this.zzn.zzj().zzf(zzlo.zzb));
                } finally {
                    zzam zzam5 = this.zze;
                    zzak(zzam5);
                    zzam5.zzx();
                }
            } else {
                zzay().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzV(new zzlo("_npa", zzav().currentTimeMillis(), Long.valueOf(true != zzq2.zzr.booleanValue() ? 0 : 1), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzq2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzP(zzq zzq2) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzam zzam = this.zze;
        zzak(zzam);
        String str = (String) Preconditions.checkNotNull(zzq2.zza);
        Preconditions.checkNotEmpty(str);
        zzam.zzg();
        zzam.zzW();
        try {
            SQLiteDatabase zzh2 = zzam.zzh();
            String[] strArr = {str};
            int delete = zzh2.delete("apps", "app_id=?", strArr) + zzh2.delete("events", "app_id=?", strArr) + zzh2.delete("user_attributes", "app_id=?", strArr) + zzh2.delete("conditional_properties", "app_id=?", strArr) + zzh2.delete("raw_events", "app_id=?", strArr) + zzh2.delete("raw_events_metadata", "app_id=?", strArr) + zzh2.delete("queue", "app_id=?", strArr) + zzh2.delete("audience_filter_values", "app_id=?", strArr) + zzh2.delete("main_event_params", "app_id=?", strArr) + zzh2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzam.zzs.zzay().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzam.zzs.zzay().zzd().zzc("Error resetting analytics data. appId, error", zzfa.zzn(str), e);
        }
        if (zzq2.zzh) {
            zzK(zzq2);
        }
    }

    public final void zzQ(String str, zziw zziw) {
        zzaz().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zziw != null) {
            this.zzE = str;
            this.zzD = zziw;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzR() {
        zzaz().zzg();
        zzam zzam = this.zze;
        zzak(zzam);
        zzam.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzaf();
    }

    /* access modifiers changed from: package-private */
    public final void zzS(zzac zzac) {
        zzq zzab = zzab((String) Preconditions.checkNotNull(zzac.zza));
        if (zzab != null) {
            zzT(zzac, zzab);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzT(zzac zzac, zzq zzq2) {
        Preconditions.checkNotNull(zzac);
        Preconditions.checkNotEmpty(zzac.zza);
        Preconditions.checkNotNull(zzac.zzb);
        Preconditions.checkNotNull(zzac.zzc);
        Preconditions.checkNotEmpty(zzac.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzaj(zzq2)) {
            if (!zzq2.zzh) {
                zzd(zzq2);
                return;
            }
            zzac zzac2 = new zzac(zzac);
            boolean z = false;
            zzac2.zze = false;
            zzam zzam = this.zze;
            zzak(zzam);
            zzam.zzw();
            try {
                zzam zzam2 = this.zze;
                zzak(zzam2);
                zzac zzk2 = zzam2.zzk((String) Preconditions.checkNotNull(zzac2.zza), zzac2.zzc.zzb);
                if (zzk2 != null && !zzk2.zzb.equals(zzac2.zzb)) {
                    zzay().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzac2.zzc.zzb), zzac2.zzb, zzk2.zzb);
                }
                if (zzk2 != null && zzk2.zze) {
                    zzac2.zzb = zzk2.zzb;
                    zzac2.zzd = zzk2.zzd;
                    zzac2.zzh = zzk2.zzh;
                    zzac2.zzf = zzk2.zzf;
                    zzac2.zzi = zzk2.zzi;
                    zzac2.zze = true;
                    zzlo zzlo = zzac2.zzc;
                    zzac2.zzc = new zzlo(zzlo.zzb, zzk2.zzc.zzc, zzlo.zza(), zzk2.zzc.zzf);
                } else if (TextUtils.isEmpty(zzac2.zzf)) {
                    zzlo zzlo2 = zzac2.zzc;
                    zzac2.zzc = new zzlo(zzlo2.zzb, zzac2.zzd, zzlo2.zza(), zzac2.zzc.zzf);
                    zzac2.zze = true;
                    z = true;
                }
                if (zzac2.zze) {
                    zzlo zzlo3 = zzac2.zzc;
                    zzlq zzlq = new zzlq((String) Preconditions.checkNotNull(zzac2.zza), zzac2.zzb, zzlo3.zzb, zzlo3.zzc, Preconditions.checkNotNull(zzlo3.zza()));
                    zzam zzam3 = this.zze;
                    zzak(zzam3);
                    if (zzam3.zzL(zzlq)) {
                        zzay().zzc().zzd("User property updated immediately", zzac2.zza, this.zzn.zzj().zzf(zzlq.zzc), zzlq.zze);
                    } else {
                        zzay().zzd().zzd("(2)Too many active user properties, ignoring", zzfa.zzn(zzac2.zza), this.zzn.zzj().zzf(zzlq.zzc), zzlq.zze);
                    }
                    if (z && zzac2.zzi != null) {
                        zzX(new zzaw(zzac2.zzi, zzac2.zzd), zzq2);
                    }
                }
                zzam zzam4 = this.zze;
                zzak(zzam4);
                if (zzam4.zzK(zzac2)) {
                    zzay().zzc().zzd("Conditional property added", zzac2.zza, this.zzn.zzj().zzf(zzac2.zzc.zzb), zzac2.zzc.zza());
                } else {
                    zzay().zzd().zzd("Too many conditional properties, ignoring", zzfa.zzn(zzac2.zza), this.zzn.zzj().zzf(zzac2.zzc.zzb), zzac2.zzc.zza());
                }
                zzam zzam5 = this.zze;
                zzak(zzam5);
                zzam5.zzC();
            } finally {
                zzam zzam6 = this.zze;
                zzak(zzam6);
                zzam6.zzx();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzU(String str, zzai zzai) {
        zzaz().zzg();
        zzB();
        this.zzB.put(str, zzai);
        zzam zzam = this.zze;
        zzak(zzam);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzai);
        zzam.zzg();
        zzam.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzai.zzh());
        try {
            if (zzam.zzh().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                zzam.zzs.zzay().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzfa.zzn(str));
            }
        } catch (SQLiteException e) {
            zzam.zzs.zzay().zzd().zzc("Error storing consent setting. appId, error", zzfa.zzn(str), e);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzV(zzlo zzlo, zzq zzq2) {
        long j;
        zzlo zzlo2 = zzlo;
        zzq zzq3 = zzq2;
        zzaz().zzg();
        zzB();
        if (zzaj(zzq2)) {
            if (!zzq3.zzh) {
                zzd(zzq3);
                return;
            }
            int zzl2 = zzv().zzl(zzlo2.zzb);
            int i = 0;
            if (zzl2 != 0) {
                zzlt zzv2 = zzv();
                String str = zzlo2.zzb;
                zzg();
                String zzD2 = zzv2.zzD(str, 24, true);
                String str2 = zzlo2.zzb;
                zzv().zzN(this.zzF, zzq3.zza, zzl2, "_ev", zzD2, str2 != null ? str2.length() : 0);
                return;
            }
            int zzd2 = zzv().zzd(zzlo2.zzb, zzlo.zza());
            if (zzd2 != 0) {
                zzlt zzv3 = zzv();
                String str3 = zzlo2.zzb;
                zzg();
                String zzD3 = zzv3.zzD(str3, 24, true);
                Object zza2 = zzlo.zza();
                if (zza2 != null && ((zza2 instanceof String) || (zza2 instanceof CharSequence))) {
                    i = zza2.toString().length();
                }
                zzv().zzN(this.zzF, zzq3.zza, zzd2, "_ev", zzD3, i);
                return;
            }
            Object zzB2 = zzv().zzB(zzlo2.zzb, zzlo.zza());
            if (zzB2 != null) {
                if ("_sid".equals(zzlo2.zzb)) {
                    long j2 = zzlo2.zzc;
                    String str4 = zzlo2.zzf;
                    String str5 = (String) Preconditions.checkNotNull(zzq3.zza);
                    zzam zzam = this.zze;
                    zzak(zzam);
                    zzlq zzp2 = zzam.zzp(str5, "_sno");
                    if (zzp2 != null) {
                        Object obj = zzp2.zze;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            zzV(new zzlo("_sno", j2, Long.valueOf(j + 1), str4), zzq3);
                        }
                    }
                    if (zzp2 != null) {
                        zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzp2.zze);
                    }
                    zzam zzam2 = this.zze;
                    zzak(zzam2);
                    zzas zzn2 = zzam2.zzn(str5, "_s");
                    if (zzn2 != null) {
                        j = zzn2.zzc;
                        zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    zzV(new zzlo("_sno", j2, Long.valueOf(j + 1), str4), zzq3);
                }
                zzlq zzlq = new zzlq((String) Preconditions.checkNotNull(zzq3.zza), (String) Preconditions.checkNotNull(zzlo2.zzf), zzlo2.zzb, zzlo2.zzc, zzB2);
                zzay().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzlq.zzc), zzB2);
                zzam zzam3 = this.zze;
                zzak(zzam3);
                zzam3.zzw();
                try {
                    zzne.zzc();
                    if (this.zzn.zzf().zzs((String) null, zzen.zzan) && "_id".equals(zzlq.zzc)) {
                        if (this.zzn.zzf().zzs((String) null, zzen.zzaq)) {
                            zzam zzam4 = this.zze;
                            zzak(zzam4);
                            zzlq zzp3 = zzam4.zzp(zzq3.zza, "_id");
                            if (zzp3 != null && !zzlq.zze.equals(zzp3.zze)) {
                                zzam zzam5 = this.zze;
                                zzak(zzam5);
                                zzam5.zzA(zzq3.zza, "_lair");
                            }
                        } else {
                            zzam zzam6 = this.zze;
                            zzak(zzam6);
                            zzam6.zzA(zzq3.zza, "_lair");
                        }
                    }
                    zzd(zzq3);
                    zzam zzam7 = this.zze;
                    zzak(zzam7);
                    boolean zzL = zzam7.zzL(zzlq);
                    zzam zzam8 = this.zze;
                    zzak(zzam8);
                    zzam8.zzC();
                    if (!zzL) {
                        zzay().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzlq.zzc), zzlq.zze);
                        zzv().zzN(this.zzF, zzq3.zza, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    zzam zzam9 = this.zze;
                    zzak(zzam9);
                    zzam9.zzx();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:282|283) */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        r8 = r8.subList(0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x031c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x031d, code lost:
        r2 = r0;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
        zzay().zzd().zzc("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.zzfa.zzn(r6), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0682, code lost:
        if (r12 != null) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06ac, code lost:
        if (r12 != null) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06af, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x06d8, code lost:
        r1.zzv = r3;
        zzad();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06dd, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0108, code lost:
        if (r11 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0112, code lost:
        if (r11 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012d, code lost:
        if (r11 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1.zzA = r8;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:282:0x0625 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02b5 A[SYNTHETIC, Splitter:B:156:0x02b5] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02be A[Catch:{ all -> 0x0502, all -> 0x06d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04bd A[Catch:{ all -> 0x0502, all -> 0x06d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x04cd A[Catch:{ all -> 0x0502, all -> 0x06d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04dc A[Catch:{ all -> 0x0502, all -> 0x06d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x063d A[Catch:{ all -> 0x0502, all -> 0x06d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x06ce A[SYNTHETIC, Splitter:B:325:0x06ce] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x04f2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0138 A[Catch:{ all -> 0x0133, all -> 0x06d6 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:315:0x06b0=Splitter:B:315:0x06b0, B:184:0x0324=Splitter:B:184:0x0324, B:297:0x0684=Splitter:B:297:0x0684, B:282:0x0625=Splitter:B:282:0x0625, B:153:0x029c=Splitter:B:153:0x029c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzW() {
        /*
            r26 = this;
            r1 = r26
            com.google.android.gms.measurement.internal.zzgh r2 = r26.zzaz()
            r2.zzg()
            r26.zzB()
            r2 = 1
            r1.zzv = r2
            r3 = 0
            com.google.android.gms.measurement.internal.zzgk r4 = r1.zzn     // Catch:{ all -> 0x06d6 }
            r4.zzaw()     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzgk r4 = r1.zzn     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzke r4 = r4.zzt()     // Catch:{ all -> 0x06d6 }
            java.lang.Boolean r4 = r4.zzj()     // Catch:{ all -> 0x06d6 }
            if (r4 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.zzfa r2 = r26.zzay()     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzk()     // Catch:{ all -> 0x06d6 }
            java.lang.String r4 = "Upload data called on the client side before use of service was decided"
            r2.zza(r4)     // Catch:{ all -> 0x06d6 }
            r1.zzv = r3
        L_0x0030:
            r26.zzad()
            return
        L_0x0034:
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x06d6 }
            if (r4 == 0) goto L_0x004a
            com.google.android.gms.measurement.internal.zzfa r2 = r26.zzay()     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x06d6 }
            java.lang.String r4 = "Upload called in the client side when service should be used"
            r2.zza(r4)     // Catch:{ all -> 0x06d6 }
            r1.zzv = r3
            goto L_0x0030
        L_0x004a:
            long r4 = r1.zza     // Catch:{ all -> 0x06d6 }
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0058
            r26.zzaf()     // Catch:{ all -> 0x06d6 }
            r1.zzv = r3
            goto L_0x0030
        L_0x0058:
            com.google.android.gms.measurement.internal.zzgh r4 = r26.zzaz()     // Catch:{ all -> 0x06d6 }
            r4.zzg()     // Catch:{ all -> 0x06d6 }
            java.util.List r4 = r1.zzy     // Catch:{ all -> 0x06d6 }
            if (r4 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.zzfa r2 = r26.zzay()     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzj()     // Catch:{ all -> 0x06d6 }
            java.lang.String r4 = "Uploading requested multiple times"
            r2.zza(r4)     // Catch:{ all -> 0x06d6 }
            r1.zzv = r3
            goto L_0x0030
        L_0x0073:
            com.google.android.gms.measurement.internal.zzfg r4 = r1.zzd     // Catch:{ all -> 0x06d6 }
            zzak(r4)     // Catch:{ all -> 0x06d6 }
            boolean r4 = r4.zza()     // Catch:{ all -> 0x06d6 }
            if (r4 != 0) goto L_0x0091
            com.google.android.gms.measurement.internal.zzfa r2 = r26.zzay()     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzj()     // Catch:{ all -> 0x06d6 }
            java.lang.String r4 = "Network not connected, ignoring upload request"
            r2.zza(r4)     // Catch:{ all -> 0x06d6 }
            r26.zzaf()     // Catch:{ all -> 0x06d6 }
            r1.zzv = r3
            goto L_0x0030
        L_0x0091:
            com.google.android.gms.common.util.Clock r4 = r26.zzav()     // Catch:{ all -> 0x06d6 }
            long r4 = r4.currentTimeMillis()     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzag r8 = r26.zzg()     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzem r9 = com.google.android.gms.measurement.internal.zzen.zzP     // Catch:{ all -> 0x06d6 }
            r10 = 0
            int r8 = r8.zze(r10, r9)     // Catch:{ all -> 0x06d6 }
            r26.zzg()     // Catch:{ all -> 0x06d6 }
            long r11 = com.google.android.gms.measurement.internal.zzag.zzz()     // Catch:{ all -> 0x06d6 }
            long r11 = r4 - r11
            r9 = r3
        L_0x00ae:
            if (r9 >= r8) goto L_0x00b9
            boolean r13 = r1.zzag(r10, r11)     // Catch:{ all -> 0x06d6 }
            if (r13 == 0) goto L_0x00b9
            int r9 = r9 + 1
            goto L_0x00ae
        L_0x00b9:
            com.google.android.gms.measurement.internal.zzkg r8 = r1.zzk     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzfl r8 = r8.zzc     // Catch:{ all -> 0x06d6 }
            long r8 = r8.zza()     // Catch:{ all -> 0x06d6 }
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.zzfa r6 = r26.zzay()     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzey r6 = r6.zzc()     // Catch:{ all -> 0x06d6 }
            java.lang.String r7 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r8 = r4 - r8
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x06d6 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x06d6 }
            r6.zzb(r7, r8)     // Catch:{ all -> 0x06d6 }
        L_0x00dc:
            com.google.android.gms.measurement.internal.zzam r6 = r1.zze     // Catch:{ all -> 0x06d6 }
            zzak(r6)     // Catch:{ all -> 0x06d6 }
            java.lang.String r6 = r6.zzr()     // Catch:{ all -> 0x06d6 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x06d6 }
            r8 = -1
            if (r7 != 0) goto L_0x0641
            long r11 = r1.zzA     // Catch:{ all -> 0x06d6 }
            int r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x013c
            com.google.android.gms.measurement.internal.zzam r7 = r1.zze     // Catch:{ all -> 0x06d6 }
            zzak(r7)     // Catch:{ all -> 0x06d6 }
            android.database.sqlite.SQLiteDatabase r11 = r7.zzh()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            java.lang.String r12 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r11.rawQuery(r12, r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            boolean r12 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0115 }
            if (r12 != 0) goto L_0x010e
            if (r11 == 0) goto L_0x0130
        L_0x010a:
            r11.close()     // Catch:{ all -> 0x06d6 }
            goto L_0x0130
        L_0x010e:
            long r8 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0115 }
            if (r11 == 0) goto L_0x0130
            goto L_0x010a
        L_0x0115:
            r0 = move-exception
            r12 = r0
            goto L_0x011e
        L_0x0118:
            r0 = move-exception
            r2 = r0
            goto L_0x0136
        L_0x011b:
            r0 = move-exception
            r12 = r0
            r11 = r10
        L_0x011e:
            com.google.android.gms.measurement.internal.zzgk r7 = r7.zzs     // Catch:{ all -> 0x0133 }
            com.google.android.gms.measurement.internal.zzfa r7 = r7.zzay()     // Catch:{ all -> 0x0133 }
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzd()     // Catch:{ all -> 0x0133 }
            java.lang.String r13 = "Error querying raw events"
            r7.zzb(r13, r12)     // Catch:{ all -> 0x0133 }
            if (r11 == 0) goto L_0x0130
            goto L_0x010a
        L_0x0130:
            r1.zzA = r8     // Catch:{ all -> 0x06d6 }
            goto L_0x013c
        L_0x0133:
            r0 = move-exception
            r2 = r0
            r10 = r11
        L_0x0136:
            if (r10 == 0) goto L_0x013b
            r10.close()     // Catch:{ all -> 0x06d6 }
        L_0x013b:
            throw r2     // Catch:{ all -> 0x06d6 }
        L_0x013c:
            com.google.android.gms.measurement.internal.zzag r7 = r26.zzg()     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzem r8 = com.google.android.gms.measurement.internal.zzen.zzf     // Catch:{ all -> 0x06d6 }
            int r7 = r7.zze(r6, r8)     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzag r8 = r26.zzg()     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzem r9 = com.google.android.gms.measurement.internal.zzen.zzg     // Catch:{ all -> 0x06d6 }
            int r8 = r8.zze(r6, r9)     // Catch:{ all -> 0x06d6 }
            int r8 = java.lang.Math.max(r3, r8)     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.measurement.internal.zzam r9 = r1.zze     // Catch:{ all -> 0x06d6 }
            zzak(r9)     // Catch:{ all -> 0x06d6 }
            r9.zzg()     // Catch:{ all -> 0x06d6 }
            r9.zzW()     // Catch:{ all -> 0x06d6 }
            if (r7 <= 0) goto L_0x0163
            r11 = r2
            goto L_0x0164
        L_0x0163:
            r11 = r3
        L_0x0164:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r11)     // Catch:{ all -> 0x06d6 }
            if (r8 <= 0) goto L_0x016b
            r11 = r2
            goto L_0x016c
        L_0x016b:
            r11 = r3
        L_0x016c:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r11)     // Catch:{ all -> 0x06d6 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)     // Catch:{ all -> 0x06d6 }
            android.database.sqlite.SQLiteDatabase r12 = r9.zzh()     // Catch:{ SQLiteException -> 0x0297, all -> 0x0292 }
            java.lang.String r13 = "rowid"
            java.lang.String r14 = "data"
            java.lang.String r15 = "retry_count"
            java.lang.String[] r14 = new java.lang.String[]{r13, r14, r15}     // Catch:{ SQLiteException -> 0x0297, all -> 0x0292 }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0297, all -> 0x0292 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0297, all -> 0x0292 }
            java.lang.String r13 = "queue"
            java.lang.String r16 = "app_id=?"
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0297, all -> 0x0292 }
            r7 = r15
            r15 = r16
            r16 = r7
            android.database.Cursor r7 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x0297, all -> 0x0292 }
            boolean r12 = r7.moveToFirst()     // Catch:{ SQLiteException -> 0x028d }
            if (r12 != 0) goto L_0x01b4
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x01ae }
            if (r7 == 0) goto L_0x01aa
            r7.close()     // Catch:{ all -> 0x06d6 }
        L_0x01aa:
            r20 = r4
            goto L_0x02b8
        L_0x01ae:
            r0 = move-exception
            r2 = r0
            r20 = r4
            goto L_0x029c
        L_0x01b4:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x028d }
            r12.<init>()     // Catch:{ SQLiteException -> 0x028d }
            r13 = r3
        L_0x01ba:
            long r14 = r7.getLong(r3)     // Catch:{ SQLiteException -> 0x028d }
            byte[] r10 = r7.getBlob(r2)     // Catch:{ IOException -> 0x025d }
            com.google.android.gms.measurement.internal.zzll r2 = r9.zzf     // Catch:{ IOException -> 0x025d }
            com.google.android.gms.measurement.internal.zzln r2 = r2.zzi     // Catch:{ IOException -> 0x025d }
            zzak(r2)     // Catch:{ IOException -> 0x025d }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0247 }
            r3.<init>(r10)     // Catch:{ IOException -> 0x0247 }
            java.util.zip.GZIPInputStream r10 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0247 }
            r10.<init>(r3)     // Catch:{ IOException -> 0x0247 }
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0247 }
            r11.<init>()     // Catch:{ IOException -> 0x0247 }
            r20 = r4
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0245 }
        L_0x01de:
            int r5 = r10.read(r4)     // Catch:{ IOException -> 0x0245 }
            if (r5 > 0) goto L_0x023c
            r10.close()     // Catch:{ IOException -> 0x0245 }
            r3.close()     // Catch:{ IOException -> 0x0245 }
            byte[] r2 = r11.toByteArray()     // Catch:{ IOException -> 0x0245 }
            boolean r3 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x028b }
            if (r3 != 0) goto L_0x01fa
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x028b }
            int r3 = r3 + r13
            if (r3 <= r8) goto L_0x01fa
            goto L_0x0284
        L_0x01fa:
            com.google.android.gms.internal.measurement.zzgb r3 = com.google.android.gms.internal.measurement.zzgc.zzu()     // Catch:{ IOException -> 0x0226 }
            com.google.android.gms.internal.measurement.zzli r3 = com.google.android.gms.measurement.internal.zzln.zzl(r3, r2)     // Catch:{ IOException -> 0x0226 }
            com.google.android.gms.internal.measurement.zzgb r3 = (com.google.android.gms.internal.measurement.zzgb) r3     // Catch:{ IOException -> 0x0226 }
            r4 = 2
            boolean r5 = r7.isNull(r4)     // Catch:{ SQLiteException -> 0x028b }
            if (r5 != 0) goto L_0x0212
            int r5 = r7.getInt(r4)     // Catch:{ SQLiteException -> 0x028b }
            r3.zzag(r5)     // Catch:{ SQLiteException -> 0x028b }
        L_0x0212:
            int r2 = r2.length     // Catch:{ SQLiteException -> 0x028b }
            int r13 = r13 + r2
            com.google.android.gms.internal.measurement.zzkc r2 = r3.zzaE()     // Catch:{ SQLiteException -> 0x028b }
            com.google.android.gms.internal.measurement.zzgc r2 = (com.google.android.gms.internal.measurement.zzgc) r2     // Catch:{ SQLiteException -> 0x028b }
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x028b }
            android.util.Pair r2 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x028b }
            r12.add(r2)     // Catch:{ SQLiteException -> 0x028b }
            goto L_0x0274
        L_0x0226:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzgk r3 = r9.zzs     // Catch:{ SQLiteException -> 0x028b }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ SQLiteException -> 0x028b }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ SQLiteException -> 0x028b }
            java.lang.String r4 = "Failed to merge queued bundle. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfa.zzn(r6)     // Catch:{ SQLiteException -> 0x028b }
            r3.zzc(r4, r5, r2)     // Catch:{ SQLiteException -> 0x028b }
            goto L_0x0274
        L_0x023c:
            r22 = r3
            r3 = 0
            r11.write(r4, r3, r5)     // Catch:{ IOException -> 0x0245 }
            r3 = r22
            goto L_0x01de
        L_0x0245:
            r0 = move-exception
            goto L_0x024a
        L_0x0247:
            r0 = move-exception
            r20 = r4
        L_0x024a:
            r3 = r0
            com.google.android.gms.measurement.internal.zzgk r2 = r2.zzs     // Catch:{ IOException -> 0x025b }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ IOException -> 0x025b }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ IOException -> 0x025b }
            java.lang.String r4 = "Failed to ungzip content"
            r2.zzb(r4, r3)     // Catch:{ IOException -> 0x025b }
            throw r3     // Catch:{ IOException -> 0x025b }
        L_0x025b:
            r0 = move-exception
            goto L_0x0260
        L_0x025d:
            r0 = move-exception
            r20 = r4
        L_0x0260:
            r2 = r0
            com.google.android.gms.measurement.internal.zzgk r3 = r9.zzs     // Catch:{ SQLiteException -> 0x028b }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ SQLiteException -> 0x028b }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ SQLiteException -> 0x028b }
            java.lang.String r4 = "Failed to unzip queued bundle. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfa.zzn(r6)     // Catch:{ SQLiteException -> 0x028b }
            r3.zzc(r4, r5, r2)     // Catch:{ SQLiteException -> 0x028b }
        L_0x0274:
            boolean r2 = r7.moveToNext()     // Catch:{ SQLiteException -> 0x028b }
            if (r2 == 0) goto L_0x0284
            if (r13 <= r8) goto L_0x027d
            goto L_0x0284
        L_0x027d:
            r4 = r20
            r2 = 1
            r3 = 0
            r10 = 0
            goto L_0x01ba
        L_0x0284:
            if (r7 == 0) goto L_0x0289
            r7.close()     // Catch:{ all -> 0x06d2 }
        L_0x0289:
            r8 = r12
            goto L_0x02b8
        L_0x028b:
            r0 = move-exception
            goto L_0x0290
        L_0x028d:
            r0 = move-exception
            r20 = r4
        L_0x0290:
            r2 = r0
            goto L_0x029c
        L_0x0292:
            r0 = move-exception
            r2 = r0
            r10 = 0
            goto L_0x063b
        L_0x0297:
            r0 = move-exception
            r20 = r4
            r2 = r0
            r7 = 0
        L_0x029c:
            com.google.android.gms.measurement.internal.zzgk r3 = r9.zzs     // Catch:{ all -> 0x0638 }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ all -> 0x0638 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ all -> 0x0638 }
            java.lang.String r4 = "Error querying bundles. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfa.zzn(r6)     // Catch:{ all -> 0x0638 }
            r3.zzc(r4, r5, r2)     // Catch:{ all -> 0x0638 }
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0638 }
            if (r7 == 0) goto L_0x02b8
            r7.close()     // Catch:{ all -> 0x06d2 }
        L_0x02b8:
            boolean r2 = r8.isEmpty()     // Catch:{ all -> 0x06d2 }
            if (r2 != 0) goto L_0x06c4
            com.google.android.gms.measurement.internal.zzai r2 = r1.zzh(r6)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzah r3 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x06d2 }
            boolean r2 = r2.zzi(r3)     // Catch:{ all -> 0x06d2 }
            if (r2 == 0) goto L_0x0324
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x06d2 }
        L_0x02ce:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x06d2 }
            if (r3 == 0) goto L_0x02ed
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x06d2 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x06d2 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.internal.measurement.zzgc r3 = (com.google.android.gms.internal.measurement.zzgc) r3     // Catch:{ all -> 0x06d2 }
            java.lang.String r4 = r3.zzK()     // Catch:{ all -> 0x06d2 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x06d2 }
            if (r4 != 0) goto L_0x02ce
            java.lang.String r2 = r3.zzK()     // Catch:{ all -> 0x06d2 }
            goto L_0x02ee
        L_0x02ed:
            r2 = 0
        L_0x02ee:
            if (r2 == 0) goto L_0x0324
            r3 = 0
        L_0x02f1:
            int r4 = r8.size()     // Catch:{ all -> 0x06d2 }
            if (r3 >= r4) goto L_0x0324
            java.lang.Object r4 = r8.get(r3)     // Catch:{ all -> 0x06d2 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x06d2 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.internal.measurement.zzgc r4 = (com.google.android.gms.internal.measurement.zzgc) r4     // Catch:{ all -> 0x06d2 }
            java.lang.String r5 = r4.zzK()     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x030c
            goto L_0x0321
        L_0x030c:
            java.lang.String r4 = r4.zzK()     // Catch:{ all -> 0x06d2 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x06d2 }
            if (r4 != 0) goto L_0x0321
            r4 = 0
            java.util.List r8 = r8.subList(r4, r3)     // Catch:{ all -> 0x031c }
            goto L_0x0324
        L_0x031c:
            r0 = move-exception
            r2 = r0
            r3 = r4
            goto L_0x06d8
        L_0x0321:
            int r3 = r3 + 1
            goto L_0x02f1
        L_0x0324:
            com.google.android.gms.internal.measurement.zzfz r2 = com.google.android.gms.internal.measurement.zzga.zza()     // Catch:{ all -> 0x06d2 }
            int r3 = r8.size()     // Catch:{ all -> 0x06d2 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x06d2 }
            int r5 = r8.size()     // Catch:{ all -> 0x06d2 }
            r4.<init>(r5)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzag r5 = r26.zzg()     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzt(r6)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x034d
            com.google.android.gms.measurement.internal.zzai r5 = r1.zzh(r6)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzah r7 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzi(r7)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x034d
            r5 = 1
            goto L_0x034e
        L_0x034d:
            r5 = 0
        L_0x034e:
            com.google.android.gms.measurement.internal.zzai r7 = r1.zzh(r6)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x06d2 }
            boolean r7 = r7.zzi(r9)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzai r9 = r1.zzh(r6)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzah r10 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE     // Catch:{ all -> 0x06d2 }
            boolean r9 = r9.zzi(r10)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.internal.measurement.zzps.zzc()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzag r10 = r26.zzg()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzem r11 = com.google.android.gms.measurement.internal.zzen.zzaH     // Catch:{ all -> 0x06d2 }
            r12 = 0
            boolean r10 = r10.zzs(r12, r11)     // Catch:{ all -> 0x06d2 }
            r11 = 0
        L_0x0371:
            if (r11 >= r3) goto L_0x0507
            java.lang.Object r12 = r8.get(r11)     // Catch:{ all -> 0x06d2 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x06d2 }
            java.lang.Object r12 = r12.first     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.internal.measurement.zzgc r12 = (com.google.android.gms.internal.measurement.zzgc) r12     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.internal.measurement.zzjy r12 = r12.zzbB()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.internal.measurement.zzgb r12 = (com.google.android.gms.internal.measurement.zzgb) r12     // Catch:{ all -> 0x06d2 }
            java.lang.Object r13 = r8.get(r11)     // Catch:{ all -> 0x06d2 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x06d2 }
            java.lang.Object r13 = r13.second     // Catch:{ all -> 0x06d2 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x06d2 }
            r4.add(r13)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzag r13 = r26.zzg()     // Catch:{ all -> 0x06d2 }
            r13.zzh()     // Catch:{ all -> 0x06d2 }
            r13 = 64000(0xfa00, double:3.162E-319)
            r12.zzam(r13)     // Catch:{ all -> 0x06d2 }
            r13 = r20
            r12.zzal(r13)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzgk r15 = r1.zzn     // Catch:{ all -> 0x06d2 }
            r15.zzaw()     // Catch:{ all -> 0x06d2 }
            r15 = 0
            r12.zzah(r15)     // Catch:{ all -> 0x0502 }
            if (r5 != 0) goto L_0x03b0
            r12.zzq()     // Catch:{ all -> 0x06d2 }
        L_0x03b0:
            if (r7 != 0) goto L_0x03b8
            r12.zzx()     // Catch:{ all -> 0x06d2 }
            r12.zzt()     // Catch:{ all -> 0x06d2 }
        L_0x03b8:
            if (r9 != 0) goto L_0x03bd
            r12.zzn()     // Catch:{ all -> 0x06d2 }
        L_0x03bd:
            com.google.android.gms.internal.measurement.zzpj.zzc()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzag r15 = r26.zzg()     // Catch:{ all -> 0x06d2 }
            r20 = r5
            com.google.android.gms.measurement.internal.zzem r5 = com.google.android.gms.measurement.internal.zzen.zzaC     // Catch:{ all -> 0x06d2 }
            boolean r5 = r15.zzs(r6, r5)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x03dc
            com.google.android.gms.measurement.internal.zzgb r5 = r1.zzc     // Catch:{ all -> 0x06d2 }
            zzak(r5)     // Catch:{ all -> 0x06d2 }
            java.util.Set r5 = r5.zzk(r6)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x03dc
            r12.zzi(r5)     // Catch:{ all -> 0x06d2 }
        L_0x03dc:
            com.google.android.gms.measurement.internal.zzag r5 = r26.zzg()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzem r15 = com.google.android.gms.measurement.internal.zzen.zzaE     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzs(r6, r15)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x0404
            com.google.android.gms.measurement.internal.zzgb r5 = r1.zzc     // Catch:{ all -> 0x06d2 }
            zzak(r5)     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzv(r6)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x03f6
            r12.zzp()     // Catch:{ all -> 0x06d2 }
        L_0x03f6:
            com.google.android.gms.measurement.internal.zzgb r5 = r1.zzc     // Catch:{ all -> 0x06d2 }
            zzak(r5)     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzy(r6)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x0404
            r12.zzu()     // Catch:{ all -> 0x06d2 }
        L_0x0404:
            com.google.android.gms.measurement.internal.zzag r5 = r26.zzg()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzem r15 = com.google.android.gms.measurement.internal.zzen.zzaF     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzs(r6, r15)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x0427
            com.google.android.gms.measurement.internal.zzgb r5 = r1.zzc     // Catch:{ all -> 0x06d2 }
            zzak(r5)     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzz(r6)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x0427
            java.lang.String r5 = "_id"
            int r5 = com.google.android.gms.measurement.internal.zzln.zza(r12, r5)     // Catch:{ all -> 0x06d2 }
            r15 = -1
            if (r5 == r15) goto L_0x0427
            r12.zzB(r5)     // Catch:{ all -> 0x06d2 }
        L_0x0427:
            com.google.android.gms.measurement.internal.zzag r5 = r26.zzg()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzem r15 = com.google.android.gms.measurement.internal.zzen.zzaG     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzs(r6, r15)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x0441
            com.google.android.gms.measurement.internal.zzgb r5 = r1.zzc     // Catch:{ all -> 0x06d2 }
            zzak(r5)     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzx(r6)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x0441
            r12.zzq()     // Catch:{ all -> 0x06d2 }
        L_0x0441:
            com.google.android.gms.measurement.internal.zzag r5 = r26.zzg()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzem r15 = com.google.android.gms.measurement.internal.zzen.zzaJ     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzs(r6, r15)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x04ac
            com.google.android.gms.measurement.internal.zzgb r5 = r1.zzc     // Catch:{ all -> 0x06d2 }
            zzak(r5)     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzu(r6)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x04ac
            r12.zzn()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzag r5 = r26.zzg()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzem r15 = com.google.android.gms.measurement.internal.zzen.zzaK     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzs(r6, r15)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x04ac
            java.util.Map r5 = r1.zzC     // Catch:{ all -> 0x06d2 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzlk r5 = (com.google.android.gms.measurement.internal.zzlk) r5     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x0496
            r21 = r7
            r15 = r8
            long r7 = r5.zzb     // Catch:{ all -> 0x06d2 }
            r22 = r5
            com.google.android.gms.measurement.internal.zzag r5 = r26.zzg()     // Catch:{ all -> 0x06d2 }
            r23 = r9
            com.google.android.gms.measurement.internal.zzem r9 = com.google.android.gms.measurement.internal.zzen.zzR     // Catch:{ all -> 0x06d2 }
            long r24 = r5.zzi(r6, r9)     // Catch:{ all -> 0x06d2 }
            long r7 = r7 + r24
            com.google.android.gms.common.util.Clock r5 = r26.zzav()     // Catch:{ all -> 0x06d2 }
            long r24 = r5.elapsedRealtime()     // Catch:{ all -> 0x06d2 }
            int r5 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r5 >= 0) goto L_0x0493
            goto L_0x049b
        L_0x0493:
            r5 = r22
            goto L_0x04a6
        L_0x0496:
            r21 = r7
            r15 = r8
            r23 = r9
        L_0x049b:
            com.google.android.gms.measurement.internal.zzlk r5 = new com.google.android.gms.measurement.internal.zzlk     // Catch:{ all -> 0x06d2 }
            r7 = 0
            r5.<init>((com.google.android.gms.measurement.internal.zzll) r1)     // Catch:{ all -> 0x06d2 }
            java.util.Map r7 = r1.zzC     // Catch:{ all -> 0x06d2 }
            r7.put(r6, r5)     // Catch:{ all -> 0x06d2 }
        L_0x04a6:
            java.lang.String r5 = r5.zza     // Catch:{ all -> 0x06d2 }
            r12.zzS(r5)     // Catch:{ all -> 0x06d2 }
            goto L_0x04b1
        L_0x04ac:
            r21 = r7
            r15 = r8
            r23 = r9
        L_0x04b1:
            com.google.android.gms.measurement.internal.zzag r5 = r26.zzg()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzem r7 = com.google.android.gms.measurement.internal.zzen.zzaL     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzs(r6, r7)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x04cb
            com.google.android.gms.measurement.internal.zzgb r5 = r1.zzc     // Catch:{ all -> 0x06d2 }
            zzak(r5)     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzw(r6)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x04cb
            r12.zzy()     // Catch:{ all -> 0x06d2 }
        L_0x04cb:
            if (r10 != 0) goto L_0x04d0
            r12.zzy()     // Catch:{ all -> 0x06d2 }
        L_0x04d0:
            com.google.android.gms.measurement.internal.zzag r5 = r26.zzg()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzem r7 = com.google.android.gms.measurement.internal.zzen.zzU     // Catch:{ all -> 0x06d2 }
            boolean r5 = r5.zzs(r6, r7)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x04f2
            com.google.android.gms.internal.measurement.zzkc r5 = r12.zzaE()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.internal.measurement.zzgc r5 = (com.google.android.gms.internal.measurement.zzgc) r5     // Catch:{ all -> 0x06d2 }
            byte[] r5 = r5.zzby()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzln r7 = r1.zzi     // Catch:{ all -> 0x06d2 }
            zzak(r7)     // Catch:{ all -> 0x06d2 }
            long r7 = r7.zzd(r5)     // Catch:{ all -> 0x06d2 }
            r12.zzK(r7)     // Catch:{ all -> 0x06d2 }
        L_0x04f2:
            r2.zza(r12)     // Catch:{ all -> 0x06d2 }
            int r11 = r11 + 1
            r8 = r15
            r5 = r20
            r7 = r21
            r9 = r23
            r20 = r13
            goto L_0x0371
        L_0x0502:
            r0 = move-exception
            r2 = r0
            r3 = r15
            goto L_0x06d8
        L_0x0507:
            r13 = r20
            com.google.android.gms.measurement.internal.zzfa r5 = r26.zzay()     // Catch:{ all -> 0x06d2 }
            java.lang.String r5 = r5.zzq()     // Catch:{ all -> 0x06d2 }
            r7 = 2
            boolean r5 = android.util.Log.isLoggable(r5, r7)     // Catch:{ all -> 0x06d2 }
            if (r5 == 0) goto L_0x0529
            com.google.android.gms.measurement.internal.zzln r5 = r1.zzi     // Catch:{ all -> 0x06d2 }
            zzak(r5)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.internal.measurement.zzkc r7 = r2.zzaE()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.internal.measurement.zzga r7 = (com.google.android.gms.internal.measurement.zzga) r7     // Catch:{ all -> 0x06d2 }
            java.lang.String r5 = r5.zzm(r7)     // Catch:{ all -> 0x06d2 }
            r12 = r5
            goto L_0x052a
        L_0x0529:
            r12 = 0
        L_0x052a:
            com.google.android.gms.measurement.internal.zzln r5 = r1.zzi     // Catch:{ all -> 0x06d2 }
            zzak(r5)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.internal.measurement.zzkc r5 = r2.zzaE()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.internal.measurement.zzga r5 = (com.google.android.gms.internal.measurement.zzga) r5     // Catch:{ all -> 0x06d2 }
            byte[] r15 = r5.zzby()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzla r5 = r1.zzl     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.internal.measurement.zzpj.zzc()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzgk r7 = r5.zzs     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzag r7 = r7.zzf()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzem r8 = com.google.android.gms.measurement.internal.zzen.zzaD     // Catch:{ all -> 0x06d2 }
            boolean r7 = r7.zzs(r6, r8)     // Catch:{ all -> 0x06d2 }
            if (r7 == 0) goto L_0x059c
            com.google.android.gms.measurement.internal.zzll r5 = r5.zzf     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzgb r5 = r5.zzc     // Catch:{ all -> 0x06d2 }
            zzak(r5)     // Catch:{ all -> 0x06d2 }
            java.lang.String r5 = r5.zzi(r6)     // Catch:{ all -> 0x06d2 }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x06d2 }
            if (r7 != 0) goto L_0x0592
            com.google.android.gms.measurement.internal.zzem r7 = com.google.android.gms.measurement.internal.zzen.zzp     // Catch:{ all -> 0x06d2 }
            r8 = 0
            java.lang.Object r7 = r7.zza(r8)     // Catch:{ all -> 0x06d2 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x06d2 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x06d2 }
            android.net.Uri$Builder r8 = r7.buildUpon()     // Catch:{ all -> 0x06d2 }
            java.lang.String r7 = r7.getAuthority()     // Catch:{ all -> 0x06d2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x06d2 }
            r9.<init>()     // Catch:{ all -> 0x06d2 }
            r9.append(r5)     // Catch:{ all -> 0x06d2 }
            java.lang.String r5 = "."
            r9.append(r5)     // Catch:{ all -> 0x06d2 }
            r9.append(r7)     // Catch:{ all -> 0x06d2 }
            java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x06d2 }
            r8.authority(r5)     // Catch:{ all -> 0x06d2 }
            android.net.Uri r5 = r8.build()     // Catch:{ all -> 0x06d2 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x06d2 }
            goto L_0x05a5
        L_0x0592:
            com.google.android.gms.measurement.internal.zzem r5 = com.google.android.gms.measurement.internal.zzen.zzp     // Catch:{ all -> 0x06d2 }
            r7 = 0
            java.lang.Object r5 = r5.zza(r7)     // Catch:{ all -> 0x06d2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x06d2 }
            goto L_0x05a5
        L_0x059c:
            com.google.android.gms.measurement.internal.zzem r5 = com.google.android.gms.measurement.internal.zzen.zzp     // Catch:{ all -> 0x06d2 }
            r7 = 0
            java.lang.Object r5 = r5.zza(r7)     // Catch:{ all -> 0x06d2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x06d2 }
        L_0x05a5:
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0625 }
            r7.<init>(r5)     // Catch:{ MalformedURLException -> 0x0625 }
            boolean r8 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x0625 }
            r9 = 1
            r8 = r8 ^ r9
            com.google.android.gms.common.internal.Preconditions.checkArgument(r8)     // Catch:{ MalformedURLException -> 0x0625 }
            java.util.List r8 = r1.zzy     // Catch:{ MalformedURLException -> 0x0625 }
            if (r8 == 0) goto L_0x05c5
            com.google.android.gms.measurement.internal.zzfa r4 = r26.zzay()     // Catch:{ MalformedURLException -> 0x0625 }
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzd()     // Catch:{ MalformedURLException -> 0x0625 }
            java.lang.String r8 = "Set uploading progress before finishing the previous upload"
            r4.zza(r8)     // Catch:{ MalformedURLException -> 0x0625 }
            goto L_0x05cc
        L_0x05c5:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0625 }
            r8.<init>(r4)     // Catch:{ MalformedURLException -> 0x0625 }
            r1.zzy = r8     // Catch:{ MalformedURLException -> 0x0625 }
        L_0x05cc:
            com.google.android.gms.measurement.internal.zzkg r4 = r1.zzk     // Catch:{ MalformedURLException -> 0x0625 }
            com.google.android.gms.measurement.internal.zzfl r4 = r4.zzd     // Catch:{ MalformedURLException -> 0x0625 }
            r4.zzb(r13)     // Catch:{ MalformedURLException -> 0x0625 }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x05e0
            r3 = 0
            com.google.android.gms.internal.measurement.zzgc r2 = r2.zzb(r3)     // Catch:{  }
            java.lang.String r4 = r2.zzy()     // Catch:{ MalformedURLException -> 0x0625 }
        L_0x05e0:
            com.google.android.gms.measurement.internal.zzfa r2 = r26.zzay()     // Catch:{ MalformedURLException -> 0x0625 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzj()     // Catch:{ MalformedURLException -> 0x0625 }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r8 = r15.length     // Catch:{ MalformedURLException -> 0x0625 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x0625 }
            r2.zzd(r3, r4, r8, r12)     // Catch:{ MalformedURLException -> 0x0625 }
            r2 = 1
            r1.zzu = r2     // Catch:{ MalformedURLException -> 0x0625 }
            com.google.android.gms.measurement.internal.zzfg r12 = r1.zzd     // Catch:{ MalformedURLException -> 0x0625 }
            zzak(r12)     // Catch:{ MalformedURLException -> 0x0625 }
            com.google.android.gms.measurement.internal.zzlc r2 = new com.google.android.gms.measurement.internal.zzlc     // Catch:{ MalformedURLException -> 0x0625 }
            r2.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x0625 }
            r12.zzg()     // Catch:{ MalformedURLException -> 0x0625 }
            r12.zzW()     // Catch:{ MalformedURLException -> 0x0625 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ MalformedURLException -> 0x0625 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r15)     // Catch:{ MalformedURLException -> 0x0625 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ MalformedURLException -> 0x0625 }
            com.google.android.gms.measurement.internal.zzgk r3 = r12.zzs     // Catch:{ MalformedURLException -> 0x0625 }
            com.google.android.gms.measurement.internal.zzgh r3 = r3.zzaz()     // Catch:{ MalformedURLException -> 0x0625 }
            com.google.android.gms.measurement.internal.zzff r4 = new com.google.android.gms.measurement.internal.zzff     // Catch:{ MalformedURLException -> 0x0625 }
            r16 = 0
            r11 = r4
            r13 = r6
            r14 = r7
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ MalformedURLException -> 0x0625 }
            r3.zzo(r4)     // Catch:{ MalformedURLException -> 0x0625 }
            goto L_0x06c4
        L_0x0625:
            com.google.android.gms.measurement.internal.zzfa r2 = r26.zzay()     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x06d2 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r6)     // Catch:{ all -> 0x06d2 }
            r2.zzc(r3, r4, r5)     // Catch:{ all -> 0x06d2 }
            goto L_0x06c4
        L_0x0638:
            r0 = move-exception
            r2 = r0
            r10 = r7
        L_0x063b:
            if (r10 == 0) goto L_0x0640
            r10.close()     // Catch:{ all -> 0x06d2 }
        L_0x0640:
            throw r2     // Catch:{ all -> 0x06d2 }
        L_0x0641:
            r13 = r4
            r7 = r10
            r1.zzA = r8     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x06d2 }
            zzak(r2)     // Catch:{ all -> 0x06d2 }
            r26.zzg()     // Catch:{ all -> 0x06d2 }
            long r3 = com.google.android.gms.measurement.internal.zzag.zzz()     // Catch:{ all -> 0x06d2 }
            long r4 = r13 - r3
            r2.zzg()     // Catch:{ all -> 0x06d2 }
            r2.zzW()     // Catch:{ all -> 0x06d2 }
            android.database.sqlite.SQLiteDatabase r3 = r2.zzh()     // Catch:{ SQLiteException -> 0x069a, all -> 0x0696 }
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x069a, all -> 0x0696 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x069a, all -> 0x0696 }
            r5 = 0
            r6[r5] = r4     // Catch:{ SQLiteException -> 0x069a, all -> 0x0696 }
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r12 = r3.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x069a, all -> 0x0696 }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0693 }
            if (r3 != 0) goto L_0x0688
            com.google.android.gms.measurement.internal.zzgk r3 = r2.zzs     // Catch:{ SQLiteException -> 0x0693 }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ SQLiteException -> 0x0693 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzj()     // Catch:{ SQLiteException -> 0x0693 }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r3.zza(r4)     // Catch:{ SQLiteException -> 0x0693 }
            if (r12 == 0) goto L_0x06af
        L_0x0684:
            r12.close()     // Catch:{ all -> 0x06d2 }
            goto L_0x06af
        L_0x0688:
            r3 = 0
            java.lang.String r10 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x0693 }
            if (r12 == 0) goto L_0x06b0
            r12.close()     // Catch:{ all -> 0x06d2 }
            goto L_0x06b0
        L_0x0693:
            r0 = move-exception
            r3 = r0
            goto L_0x069d
        L_0x0696:
            r0 = move-exception
            r2 = r0
            r10 = r7
            goto L_0x06cc
        L_0x069a:
            r0 = move-exception
            r3 = r0
            r12 = r7
        L_0x069d:
            com.google.android.gms.measurement.internal.zzgk r2 = r2.zzs     // Catch:{ all -> 0x06c9 }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x06c9 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x06c9 }
            java.lang.String r4 = "Error selecting expired configs"
            r2.zzb(r4, r3)     // Catch:{ all -> 0x06c9 }
            if (r12 == 0) goto L_0x06af
            goto L_0x0684
        L_0x06af:
            r10 = r7
        L_0x06b0:
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x06d2 }
            if (r2 != 0) goto L_0x06c4
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x06d2 }
            zzak(r2)     // Catch:{ all -> 0x06d2 }
            com.google.android.gms.measurement.internal.zzh r2 = r2.zzj(r10)     // Catch:{ all -> 0x06d2 }
            if (r2 == 0) goto L_0x06c4
            r1.zzC(r2)     // Catch:{ all -> 0x06d2 }
        L_0x06c4:
            r2 = 0
            r1.zzv = r2
            goto L_0x0030
        L_0x06c9:
            r0 = move-exception
            r2 = r0
            r10 = r12
        L_0x06cc:
            if (r10 == 0) goto L_0x06d1
            r10.close()     // Catch:{ all -> 0x06d2 }
        L_0x06d1:
            throw r2     // Catch:{ all -> 0x06d2 }
        L_0x06d2:
            r0 = move-exception
            r2 = r0
            r3 = 0
            goto L_0x06d8
        L_0x06d6:
            r0 = move-exception
            r2 = r0
        L_0x06d8:
            r1.zzv = r3
            r26.zzad()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzll.zzW():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0762, code lost:
        if (r14.isEmpty() != false) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0976, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02e9 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0333 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0336 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0396 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x052a A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0569 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x05e2 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x062f A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x063c A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0649 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0673 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0684 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x06c5 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x06e0 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0767 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0788 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x07f7 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0804 A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x081d A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x08ba A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x08da A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x096c A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0a18 A[Catch:{ SQLiteException -> 0x0a33 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0a2e  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0978 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017c A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0192 A[SYNTHETIC, Splitter:B:51:0x0192] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020d A[Catch:{ NumberFormatException -> 0x074c, all -> 0x0aaf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzX(com.google.android.gms.measurement.internal.zzaw r35, com.google.android.gms.measurement.internal.zzq r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r36)
            java.lang.String r8 = r3.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.zzgh r10 = r34.zzaz()
            r10.zzg()
            r34.zzB()
            java.lang.String r10 = r3.zza
            com.google.android.gms.measurement.internal.zzln r11 = r1.zzi
            zzak(r11)
            boolean r11 = com.google.android.gms.measurement.internal.zzln.zzA(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.zzh
            if (r11 == 0) goto L_0x0aba
            com.google.android.gms.measurement.internal.zzgb r11 = r1.zzc
            zzak(r11)
            java.lang.String r12 = r2.zza
            boolean r11 = r11.zzr(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.zzfa r3 = r34.zzay()
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzk()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r10)
            com.google.android.gms.measurement.internal.zzgk r5 = r1.zzn
            com.google.android.gms.measurement.internal.zzev r5 = r5.zzj()
            java.lang.String r6 = r2.zza
            java.lang.String r5 = r5.zzd(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.zzc(r6, r4, r5)
            com.google.android.gms.measurement.internal.zzgb r3 = r1.zzc
            zzak(r3)
            boolean r3 = r3.zzp(r10)
            if (r3 != 0) goto L_0x0097
            com.google.android.gms.measurement.internal.zzgb r3 = r1.zzc
            zzak(r3)
            boolean r3 = r3.zzs(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.zza
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzlt r11 = r34.zzv()
            com.google.android.gms.measurement.internal.zzls r12 = r1.zzF
            r14 = 11
            java.lang.String r2 = r2.zza
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.zzN(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze
            zzak(r2)
            com.google.android.gms.measurement.internal.zzh r2 = r2.zzj(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.zzl()
            long r5 = r2.zzc()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.common.util.Clock r5 = r34.zzav()
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.zzg()
            com.google.android.gms.measurement.internal.zzem r5 = com.google.android.gms.measurement.internal.zzen.zzy
            java.lang.Object r5 = r5.zza(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzfa r3 = r34.zzay()
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzc()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.zza(r4)
            r1.zzC(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.zzfb r2 = com.google.android.gms.measurement.internal.zzfb.zzb(r35)
            com.google.android.gms.measurement.internal.zzlt r11 = r34.zzv()
            com.google.android.gms.measurement.internal.zzag r12 = r34.zzg()
            int r12 = r12.zzd(r10)
            r11.zzM(r2, r12)
            com.google.android.gms.measurement.internal.zzaw r2 = r2.zza()
            com.google.android.gms.measurement.internal.zzfa r11 = r34.zzay()
            java.lang.String r11 = r11.zzq()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.zzfa r11 = r34.zzay()
            com.google.android.gms.measurement.internal.zzey r11 = r11.zzj()
            com.google.android.gms.measurement.internal.zzgk r12 = r1.zzn
            com.google.android.gms.measurement.internal.zzev r12 = r12.zzj()
            java.lang.String r12 = r12.zzc(r2)
            java.lang.String r13 = "Logging event"
            r11.zzb(r13, r12)
        L_0x011c:
            com.google.android.gms.measurement.internal.zzam r11 = r1.zze
            zzak(r11)
            r11.zzw()
            r1.zzd(r3)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.internal.measurement.zzne.zzc()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzag r11 = r34.zzg()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzem r12 = com.google.android.gms.measurement.internal.zzen.zzan     // Catch:{ all -> 0x0aaf }
            boolean r11 = r11.zzs(r14, r12)     // Catch:{ all -> 0x0aaf }
            if (r11 != 0) goto L_0x014e
            com.google.android.gms.measurement.internal.zzag r11 = r34.zzg()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzem r12 = com.google.android.gms.measurement.internal.zzen.zzao     // Catch:{ all -> 0x0aaf }
            boolean r11 = r11.zzs(r14, r12)     // Catch:{ all -> 0x0aaf }
            if (r11 == 0) goto L_0x014e
            com.google.android.gms.measurement.internal.zzam r11 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r11)     // Catch:{ all -> 0x0aaf }
            java.lang.String r12 = r3.zza     // Catch:{ all -> 0x0aaf }
            java.lang.String r13 = "_lair"
            r11.zzA(r12, r13)     // Catch:{ all -> 0x0aaf }
        L_0x014e:
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.zza     // Catch:{ all -> 0x0aaf }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0aaf }
            java.lang.String r12 = "refund"
            r28 = r8
            if (r11 != 0) goto L_0x0171
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0aaf }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0aaf }
            if (r9 != 0) goto L_0x0171
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0aaf }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0aaf }
            if (r9 == 0) goto L_0x016f
            goto L_0x0171
        L_0x016f:
            r9 = 0
            goto L_0x0172
        L_0x0171:
            r9 = 1
        L_0x0172:
            java.lang.String r11 = "_iap"
            java.lang.String r13 = r2.zza     // Catch:{ all -> 0x0aaf }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0aaf }
            if (r11 != 0) goto L_0x0186
            if (r9 == 0) goto L_0x0180
            r9 = 1
            goto L_0x0186
        L_0x0180:
            r33 = r4
            r8 = r15
        L_0x0183:
            r4 = 2
            goto L_0x0320
        L_0x0186:
            com.google.android.gms.measurement.internal.zzau r11 = r2.zzb     // Catch:{ all -> 0x0aaf }
            java.lang.String r13 = "currency"
            java.lang.String r11 = r11.zzg(r13)     // Catch:{ all -> 0x0aaf }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x01fb
            com.google.android.gms.measurement.internal.zzau r9 = r2.zzb     // Catch:{ all -> 0x0aaf }
            java.lang.Double r9 = r9.zzd(r13)     // Catch:{ all -> 0x0aaf }
            double r17 = r9.doubleValue()     // Catch:{ all -> 0x0aaf }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r9 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x01b9
            com.google.android.gms.measurement.internal.zzau r9 = r2.zzb     // Catch:{ all -> 0x0aaf }
            java.lang.Long r9 = r9.zze(r13)     // Catch:{ all -> 0x0aaf }
            r21 = r15
            long r14 = r9.longValue()     // Catch:{ all -> 0x0aaf }
            double r13 = (double) r14     // Catch:{ all -> 0x0aaf }
            double r17 = r13 * r19
            goto L_0x01bb
        L_0x01b9:
            r21 = r15
        L_0x01bb:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x01d5
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x01d5
            long r13 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0aaf }
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0aaf }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0aaf }
            if (r9 == 0) goto L_0x0207
            long r13 = -r13
            goto L_0x0207
        L_0x01d5:
            com.google.android.gms.measurement.internal.zzfa r2 = r34.zzay()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzk()     // Catch:{ all -> 0x0aaf }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r10)     // Catch:{ all -> 0x0aaf }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0aaf }
            r2.zzc(r3, r4, r5)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r2)     // Catch:{ all -> 0x0aaf }
            r2.zzC()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze
            zzak(r2)
            r2.zzx()
            return
        L_0x01fb:
            r21 = r15
            com.google.android.gms.measurement.internal.zzau r9 = r2.zzb     // Catch:{ all -> 0x0aaf }
            java.lang.Long r9 = r9.zze(r13)     // Catch:{ all -> 0x0aaf }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0aaf }
        L_0x0207:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0aaf }
            if (r9 != 0) goto L_0x031a
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0aaf }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x0aaf }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0aaf }
            if (r11 == 0) goto L_0x031a
            java.lang.String r11 = "_ltv_"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0aaf }
            java.lang.String r9 = r11.concat(r9)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzam r11 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r11)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzlq r11 = r11.zzp(r10, r9)     // Catch:{ all -> 0x0aaf }
            if (r11 == 0) goto L_0x0265
            java.lang.Object r11 = r11.zze     // Catch:{ all -> 0x0aaf }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0aaf }
            if (r12 != 0) goto L_0x0237
            goto L_0x0265
        L_0x0237:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0aaf }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzlq r18 = new com.google.android.gms.measurement.internal.zzlq     // Catch:{ all -> 0x0aaf }
            java.lang.String r15 = r2.zzc     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.common.util.Clock r17 = r34.zzav()     // Catch:{ all -> 0x0aaf }
            long r19 = r17.currentTimeMillis()     // Catch:{ all -> 0x0aaf }
            long r11 = r11 + r13
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0aaf }
            r11 = r18
            r12 = r10
            r14 = 0
            r13 = r15
            r8 = r14
            r15 = 0
            r14 = r9
            r9 = r21
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0aaf }
            r33 = r4
            r8 = r9
            r9 = r18
            r4 = 2
            goto L_0x02de
        L_0x0265:
            r15 = r21
            r8 = 0
            com.google.android.gms.measurement.internal.zzam r11 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r11)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzag r12 = r34.zzg()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzem r8 = com.google.android.gms.measurement.internal.zzen.zzD     // Catch:{ all -> 0x0aaf }
            int r8 = r12.zze(r10, r8)     // Catch:{ all -> 0x0aaf }
            int r8 = r8 + -1
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch:{ all -> 0x0aaf }
            r11.zzg()     // Catch:{ all -> 0x0aaf }
            r11.zzW()     // Catch:{ all -> 0x0aaf }
            android.database.sqlite.SQLiteDatabase r12 = r11.zzh()     // Catch:{ SQLiteException -> 0x02a8 }
            r21 = r15
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x02a4 }
            r16 = 0
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x02a4 }
            r16 = 1
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x02a4 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x02a4 }
            r33 = r4
            r4 = 2
            r15[r4] = r8     // Catch:{ SQLiteException -> 0x02a2 }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12.execSQL(r8, r15)     // Catch:{ SQLiteException -> 0x02a2 }
            goto L_0x02c2
        L_0x02a2:
            r0 = move-exception
            goto L_0x02ae
        L_0x02a4:
            r0 = move-exception
            r33 = r4
            goto L_0x02ad
        L_0x02a8:
            r0 = move-exception
            r33 = r4
            r21 = r15
        L_0x02ad:
            r4 = 2
        L_0x02ae:
            r8 = r0
            com.google.android.gms.measurement.internal.zzgk r11 = r11.zzs     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzfa r11 = r11.zzay()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzey r11 = r11.zzd()     // Catch:{ all -> 0x0aaf }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzfa.zzn(r10)     // Catch:{ all -> 0x0aaf }
            r11.zzc(r12, r15, r8)     // Catch:{ all -> 0x0aaf }
        L_0x02c2:
            com.google.android.gms.measurement.internal.zzlq r18 = new com.google.android.gms.measurement.internal.zzlq     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = r2.zzc     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.common.util.Clock r11 = r34.zzav()     // Catch:{ all -> 0x0aaf }
            long r15 = r11.currentTimeMillis()     // Catch:{ all -> 0x0aaf }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0aaf }
            r11 = r18
            r12 = r10
            r13 = r8
            r14 = r9
            r8 = r21
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0aaf }
            r9 = r18
        L_0x02de:
            com.google.android.gms.measurement.internal.zzam r11 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r11)     // Catch:{ all -> 0x0aaf }
            boolean r11 = r11.zzL(r9)     // Catch:{ all -> 0x0aaf }
            if (r11 != 0) goto L_0x0320
            com.google.android.gms.measurement.internal.zzfa r11 = r34.zzay()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzey r11 = r11.zzd()     // Catch:{ all -> 0x0aaf }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzfa.zzn(r10)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzgk r14 = r1.zzn     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzev r14 = r14.zzj()     // Catch:{ all -> 0x0aaf }
            java.lang.String r15 = r9.zzc     // Catch:{ all -> 0x0aaf }
            java.lang.String r14 = r14.zzf(r15)     // Catch:{ all -> 0x0aaf }
            java.lang.Object r9 = r9.zze     // Catch:{ all -> 0x0aaf }
            r11.zzd(r12, r13, r14, r9)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzlt r11 = r34.zzv()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzls r12 = r1.zzF     // Catch:{ all -> 0x0aaf }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.zzN(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0aaf }
            goto L_0x0320
        L_0x031a:
            r33 = r4
            r8 = r21
            goto L_0x0183
        L_0x0320:
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0aaf }
            boolean r9 = com.google.android.gms.measurement.internal.zzlt.zzai(r9)     // Catch:{ all -> 0x0aaf }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0aaf }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0aaf }
            r34.zzv()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzau r11 = r2.zzb     // Catch:{ all -> 0x0aaf }
            if (r11 != 0) goto L_0x0336
            r16 = 0
            goto L_0x0356
        L_0x0336:
            com.google.android.gms.measurement.internal.zzat r12 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0aaf }
            r12.<init>(r11)     // Catch:{ all -> 0x0aaf }
            r16 = 0
        L_0x033d:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0aaf }
            if (r13 == 0) goto L_0x0356
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0aaf }
            java.lang.Object r13 = r11.zzf(r13)     // Catch:{ all -> 0x0aaf }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0aaf }
            if (r14 == 0) goto L_0x033d
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0aaf }
            int r13 = r13.length     // Catch:{ all -> 0x0aaf }
            long r13 = (long) r13     // Catch:{ all -> 0x0aaf }
            long r16 = r16 + r13
            goto L_0x033d
        L_0x0356:
            r22 = 1
            long r15 = r16 + r22
            com.google.android.gms.measurement.internal.zzam r11 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r11)     // Catch:{ all -> 0x0aaf }
            long r12 = r34.zza()     // Catch:{ all -> 0x0aaf }
            r17 = 1
            r20 = 0
            r21 = 0
            r30 = r5
            r4 = 0
            r14 = r10
            r18 = r9
            r19 = r20
            r20 = r8
            com.google.android.gms.measurement.internal.zzak r11 = r11.zzm(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0aaf }
            long r12 = r11.zzb     // Catch:{ all -> 0x0aaf }
            r34.zzg()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzem r14 = com.google.android.gms.measurement.internal.zzen.zzj     // Catch:{ all -> 0x0aaf }
            r15 = 0
            java.lang.Object r14 = r14.zza(r15)     // Catch:{ all -> 0x0aaf }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0aaf }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0aaf }
            r31 = r6
            r16 = r7
            long r6 = (long) r14     // Catch:{ all -> 0x0aaf }
            long r12 = r12 - r6
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r17 = 1000(0x3e8, double:4.94E-321)
            if (r6 <= 0) goto L_0x03c4
            long r12 = r12 % r17
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x03b3
            com.google.android.gms.measurement.internal.zzfa r2 = r34.zzay()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x0aaf }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r10)     // Catch:{ all -> 0x0aaf }
            long r5 = r11.zzb     // Catch:{ all -> 0x0aaf }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0aaf }
            r2.zzc(r3, r4, r5)     // Catch:{ all -> 0x0aaf }
        L_0x03b3:
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r2)     // Catch:{ all -> 0x0aaf }
            r2.zzC()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze
            zzak(r2)
            r2.zzx()
            return
        L_0x03c4:
            if (r9 == 0) goto L_0x041f
            long r6 = r11.zza     // Catch:{ all -> 0x0aaf }
            r34.zzg()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzem r12 = com.google.android.gms.measurement.internal.zzen.zzl     // Catch:{ all -> 0x0aaf }
            java.lang.Object r12 = r12.zza(r15)     // Catch:{ all -> 0x0aaf }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0aaf }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0aaf }
            long r12 = (long) r12     // Catch:{ all -> 0x0aaf }
            long r6 = r6 - r12
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x041f
            long r6 = r6 % r17
            int r3 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x03fa
            com.google.android.gms.measurement.internal.zzfa r3 = r34.zzay()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ all -> 0x0aaf }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfa.zzn(r10)     // Catch:{ all -> 0x0aaf }
            long r6 = r11.zza     // Catch:{ all -> 0x0aaf }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0aaf }
            r3.zzc(r4, r5, r6)     // Catch:{ all -> 0x0aaf }
        L_0x03fa:
            com.google.android.gms.measurement.internal.zzlt r11 = r34.zzv()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzls r12 = r1.zzF     // Catch:{ all -> 0x0aaf }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.zza     // Catch:{ all -> 0x0aaf }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.zzN(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r2)     // Catch:{ all -> 0x0aaf }
            r2.zzC()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze
            zzak(r2)
            r2.zzx()
            return
        L_0x041f:
            r6 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x046d
            long r7 = r11.zzd     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzag r12 = r34.zzg()     // Catch:{ all -> 0x0aaf }
            java.lang.String r13 = r3.zza     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzem r14 = com.google.android.gms.measurement.internal.zzen.zzk     // Catch:{ all -> 0x0aaf }
            int r12 = r12.zze(r13, r14)     // Catch:{ all -> 0x0aaf }
            int r12 = java.lang.Math.min(r6, r12)     // Catch:{ all -> 0x0aaf }
            r13 = 0
            int r12 = java.lang.Math.max(r13, r12)     // Catch:{ all -> 0x0aaf }
            long r12 = (long) r12     // Catch:{ all -> 0x0aaf }
            long r7 = r7 - r12
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x046d
            int r2 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x045c
            com.google.android.gms.measurement.internal.zzfa r2 = r34.zzay()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x0aaf }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r10)     // Catch:{ all -> 0x0aaf }
            long r5 = r11.zzd     // Catch:{ all -> 0x0aaf }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0aaf }
            r2.zzc(r3, r4, r5)     // Catch:{ all -> 0x0aaf }
        L_0x045c:
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r2)     // Catch:{ all -> 0x0aaf }
            r2.zzC()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze
            zzak(r2)
            r2.zzx()
            return
        L_0x046d:
            com.google.android.gms.measurement.internal.zzau r7 = r2.zzb     // Catch:{ all -> 0x0aaf }
            android.os.Bundle r7 = r7.zzc()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzlt r8 = r34.zzv()     // Catch:{ all -> 0x0aaf }
            java.lang.String r11 = "_o"
            java.lang.String r12 = r2.zzc     // Catch:{ all -> 0x0aaf }
            r8.zzO(r7, r11, r12)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzlt r8 = r34.zzv()     // Catch:{ all -> 0x0aaf }
            boolean r8 = r8.zzae(r10)     // Catch:{ all -> 0x0aaf }
            java.lang.String r14 = "_r"
            if (r8 == 0) goto L_0x049e
            com.google.android.gms.measurement.internal.zzlt r8 = r34.zzv()     // Catch:{ all -> 0x0aaf }
            java.lang.Long r11 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0aaf }
            java.lang.String r12 = "_dbg"
            r8.zzO(r7, r12, r11)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzlt r8 = r34.zzv()     // Catch:{ all -> 0x0aaf }
            r8.zzO(r7, r14, r11)     // Catch:{ all -> 0x0aaf }
        L_0x049e:
            java.lang.String r8 = "_s"
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0aaf }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0aaf }
            if (r8 == 0) goto L_0x04c6
            com.google.android.gms.measurement.internal.zzam r8 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r8)     // Catch:{ all -> 0x0aaf }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0aaf }
            r12 = r16
            com.google.android.gms.measurement.internal.zzlq r8 = r8.zzp(r11, r12)     // Catch:{ all -> 0x0aaf }
            if (r8 == 0) goto L_0x04c6
            java.lang.Object r11 = r8.zze     // Catch:{ all -> 0x0aaf }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0aaf }
            if (r11 == 0) goto L_0x04c6
            com.google.android.gms.measurement.internal.zzlt r11 = r34.zzv()     // Catch:{ all -> 0x0aaf }
            java.lang.Object r8 = r8.zze     // Catch:{ all -> 0x0aaf }
            r11.zzO(r7, r12, r8)     // Catch:{ all -> 0x0aaf }
        L_0x04c6:
            com.google.android.gms.measurement.internal.zzam r8 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r8)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch:{ all -> 0x0aaf }
            r8.zzg()     // Catch:{ all -> 0x0aaf }
            r8.zzW()     // Catch:{ all -> 0x0aaf }
            android.database.sqlite.SQLiteDatabase r11 = r8.zzh()     // Catch:{ SQLiteException -> 0x050a }
            com.google.android.gms.measurement.internal.zzgk r12 = r8.zzs     // Catch:{ SQLiteException -> 0x050a }
            com.google.android.gms.measurement.internal.zzag r12 = r12.zzf()     // Catch:{ SQLiteException -> 0x050a }
            com.google.android.gms.measurement.internal.zzem r13 = com.google.android.gms.measurement.internal.zzen.zzo     // Catch:{ SQLiteException -> 0x050a }
            int r12 = r12.zze(r10, r13)     // Catch:{ SQLiteException -> 0x050a }
            int r6 = java.lang.Math.min(r6, r12)     // Catch:{ SQLiteException -> 0x050a }
            r13 = 0
            int r6 = java.lang.Math.max(r13, r6)     // Catch:{ SQLiteException -> 0x0506 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0506 }
            r12 = 2
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0506 }
            r12[r13] = r10     // Catch:{ SQLiteException -> 0x0506 }
            r16 = 1
            r12[r16] = r6     // Catch:{ SQLiteException -> 0x0506 }
            java.lang.String r6 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            r4 = r31
            int r5 = r11.delete(r4, r6, r12)     // Catch:{ SQLiteException -> 0x0504 }
            long r5 = (long) r5
            goto L_0x0524
        L_0x0504:
            r0 = move-exception
            goto L_0x050e
        L_0x0506:
            r0 = move-exception
            r4 = r31
            goto L_0x050e
        L_0x050a:
            r0 = move-exception
            r4 = r31
            r13 = 0
        L_0x050e:
            r5 = r0
            com.google.android.gms.measurement.internal.zzgk r6 = r8.zzs     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzfa r6 = r6.zzay()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzey r6 = r6.zzd()     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzfa.zzn(r10)     // Catch:{ all -> 0x0aaf }
            r6.zzc(r8, r11, r5)     // Catch:{ all -> 0x0aaf }
            r5 = 0
        L_0x0524:
            r11 = 0
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x053f
            com.google.android.gms.measurement.internal.zzfa r8 = r34.zzay()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzey r8 = r8.zzk()     // Catch:{ all -> 0x0aaf }
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzfa.zzn(r10)     // Catch:{ all -> 0x0aaf }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0aaf }
            r8.zzc(r11, r12, r5)     // Catch:{ all -> 0x0aaf }
        L_0x053f:
            com.google.android.gms.measurement.internal.zzar r5 = new com.google.android.gms.measurement.internal.zzar     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzgk r12 = r1.zzn     // Catch:{ all -> 0x0aaf }
            java.lang.String r6 = r2.zzc     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = r2.zza     // Catch:{ all -> 0x0aaf }
            long r2 = r2.zzd     // Catch:{ all -> 0x0aaf }
            r18 = 0
            r11 = r5
            r31 = r13
            r13 = r6
            r6 = r14
            r14 = r10
            r32 = r4
            r4 = r15
            r15 = r8
            r16 = r2
            r20 = r7
            r11.<init>((com.google.android.gms.measurement.internal.zzgk) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r2)     // Catch:{ all -> 0x0aaf }
            java.lang.String r3 = r5.zzb     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzas r2 = r2.zzn(r10, r3)     // Catch:{ all -> 0x0aaf }
            if (r2 != 0) goto L_0x05e2
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r2)     // Catch:{ all -> 0x0aaf }
            long r2 = r2.zzf(r10)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzag r7 = r34.zzg()     // Catch:{ all -> 0x0aaf }
            int r7 = r7.zzb(r10)     // Catch:{ all -> 0x0aaf }
            long r7 = (long) r7     // Catch:{ all -> 0x0aaf }
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x05c4
            if (r9 == 0) goto L_0x05c4
            com.google.android.gms.measurement.internal.zzfa r2 = r34.zzay()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x0aaf }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r10)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzgk r6 = r1.zzn     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzev r6 = r6.zzj()     // Catch:{ all -> 0x0aaf }
            java.lang.String r5 = r5.zzb     // Catch:{ all -> 0x0aaf }
            java.lang.String r5 = r6.zzd(r5)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzag r6 = r34.zzg()     // Catch:{ all -> 0x0aaf }
            int r6 = r6.zzb(r10)     // Catch:{ all -> 0x0aaf }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0aaf }
            r2.zzd(r3, r4, r5, r6)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzlt r11 = r34.zzv()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzls r12 = r1.zzF     // Catch:{ all -> 0x0aaf }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.zzN(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze
            zzak(r2)
            r2.zzx()
            return
        L_0x05c4:
            com.google.android.gms.measurement.internal.zzas r2 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x0aaf }
            java.lang.String r13 = r5.zzb     // Catch:{ all -> 0x0aaf }
            long r7 = r5.zzd     // Catch:{ all -> 0x0aaf }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r7
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0aaf }
            goto L_0x05f0
        L_0x05e2:
            com.google.android.gms.measurement.internal.zzgk r3 = r1.zzn     // Catch:{ all -> 0x0aaf }
            long r7 = r2.zzf     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzar r5 = r5.zza(r3, r7)     // Catch:{ all -> 0x0aaf }
            long r7 = r5.zzd     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzas r2 = r2.zzc(r7)     // Catch:{ all -> 0x0aaf }
        L_0x05f0:
            com.google.android.gms.measurement.internal.zzam r3 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r3)     // Catch:{ all -> 0x0aaf }
            r3.zzE(r2)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzgh r2 = r34.zzaz()     // Catch:{ all -> 0x0aaf }
            r2.zzg()     // Catch:{ all -> 0x0aaf }
            r34.zzB()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r36)     // Catch:{ all -> 0x0aaf }
            java.lang.String r2 = r5.zza     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x0aaf }
            java.lang.String r2 = r5.zza     // Catch:{ all -> 0x0aaf }
            r3 = r36
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x0aaf }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.internal.measurement.zzgb r2 = com.google.android.gms.internal.measurement.zzgc.zzu()     // Catch:{ all -> 0x0aaf }
            r7 = 1
            r2.zzae(r7)     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = "android"
            r2.zzaa(r8)     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0aaf }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aaf }
            if (r8 != 0) goto L_0x0634
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0aaf }
            r2.zzE(r8)     // Catch:{ all -> 0x0aaf }
        L_0x0634:
            java.lang.String r8 = r3.zzd     // Catch:{ all -> 0x0aaf }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aaf }
            if (r8 != 0) goto L_0x0641
            java.lang.String r8 = r3.zzd     // Catch:{ all -> 0x0aaf }
            r2.zzG(r8)     // Catch:{ all -> 0x0aaf }
        L_0x0641:
            java.lang.String r8 = r3.zzc     // Catch:{ all -> 0x0aaf }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aaf }
            if (r8 != 0) goto L_0x064e
            java.lang.String r8 = r3.zzc     // Catch:{ all -> 0x0aaf }
            r2.zzH(r8)     // Catch:{ all -> 0x0aaf }
        L_0x064e:
            com.google.android.gms.internal.measurement.zzps.zzc()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzag r8 = r34.zzg()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzem r9 = com.google.android.gms.measurement.internal.zzen.zzaH     // Catch:{ all -> 0x0aaf }
            boolean r8 = r8.zzs(r4, r9)     // Catch:{ all -> 0x0aaf }
            if (r8 == 0) goto L_0x066a
            java.lang.String r8 = r3.zzx     // Catch:{ all -> 0x0aaf }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aaf }
            if (r8 != 0) goto L_0x066a
            java.lang.String r8 = r3.zzx     // Catch:{ all -> 0x0aaf }
            r2.zzai(r8)     // Catch:{ all -> 0x0aaf }
        L_0x066a:
            long r8 = r3.zzj     // Catch:{ all -> 0x0aaf }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x0677
            int r8 = (int) r8     // Catch:{ all -> 0x0aaf }
            r2.zzI(r8)     // Catch:{ all -> 0x0aaf }
        L_0x0677:
            long r8 = r3.zze     // Catch:{ all -> 0x0aaf }
            r2.zzW(r8)     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = r3.zzb     // Catch:{ all -> 0x0aaf }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aaf }
            if (r8 != 0) goto L_0x0689
            java.lang.String r8 = r3.zzb     // Catch:{ all -> 0x0aaf }
            r2.zzV(r8)     // Catch:{ all -> 0x0aaf }
        L_0x0689:
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0aaf }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzai r8 = r1.zzh(r8)     // Catch:{ all -> 0x0aaf }
            java.lang.String r9 = r3.zzv     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzai r9 = com.google.android.gms.measurement.internal.zzai.zzb(r9)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzai r8 = r8.zzc(r9)     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = r8.zzh()     // Catch:{ all -> 0x0aaf }
            r2.zzM(r8)     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = r2.zzar()     // Catch:{ all -> 0x0aaf }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0aaf }
            if (r8 == 0) goto L_0x06bd
            java.lang.String r8 = r3.zzq     // Catch:{ all -> 0x0aaf }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aaf }
            if (r8 != 0) goto L_0x06bd
            java.lang.String r8 = r3.zzq     // Catch:{ all -> 0x0aaf }
            r2.zzC(r8)     // Catch:{ all -> 0x0aaf }
        L_0x06bd:
            long r8 = r3.zzf     // Catch:{ all -> 0x0aaf }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x06c8
            r2.zzN(r8)     // Catch:{ all -> 0x0aaf }
        L_0x06c8:
            long r8 = r3.zzs     // Catch:{ all -> 0x0aaf }
            r2.zzQ(r8)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzln r8 = r1.zzi     // Catch:{ all -> 0x0aaf }
            zzak(r8)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzll r9 = r8.zzf     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzgk r9 = r9.zzn     // Catch:{ all -> 0x0aaf }
            android.content.Context r9 = r9.zzau()     // Catch:{ all -> 0x0aaf }
            java.util.Map r9 = com.google.android.gms.measurement.internal.zzen.zzc(r9)     // Catch:{ all -> 0x0aaf }
            if (r9 == 0) goto L_0x0764
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0aaf }
            if (r10 == 0) goto L_0x06e8
            goto L_0x0764
        L_0x06e8:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0aaf }
            r14.<init>()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzem r10 = com.google.android.gms.measurement.internal.zzen.zzO     // Catch:{ all -> 0x0aaf }
            java.lang.Object r10 = r10.zza(r4)     // Catch:{ all -> 0x0aaf }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0aaf }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0aaf }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0aaf }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0aaf }
        L_0x0701:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0aaf }
            if (r11 == 0) goto L_0x075e
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0aaf }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0aaf }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x0aaf }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0aaf }
            java.lang.String r13 = "measurement.id."
            boolean r12 = r12.startsWith(r13)     // Catch:{ all -> 0x0aaf }
            if (r12 == 0) goto L_0x0701
            java.lang.Object r11 = r11.getValue()     // Catch:{ NumberFormatException -> 0x074c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x074c }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x074c }
            if (r11 == 0) goto L_0x0701
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x074c }
            r14.add(r11)     // Catch:{ NumberFormatException -> 0x074c }
            int r11 = r14.size()     // Catch:{ NumberFormatException -> 0x074c }
            if (r11 < r10) goto L_0x0701
            com.google.android.gms.measurement.internal.zzgk r11 = r8.zzs     // Catch:{ NumberFormatException -> 0x074c }
            com.google.android.gms.measurement.internal.zzfa r11 = r11.zzay()     // Catch:{ NumberFormatException -> 0x074c }
            com.google.android.gms.measurement.internal.zzey r11 = r11.zzk()     // Catch:{ NumberFormatException -> 0x074c }
            java.lang.String r12 = "Too many experiment IDs. Number of IDs"
            int r13 = r14.size()     // Catch:{ NumberFormatException -> 0x074c }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x074c }
            r11.zzb(r12, r13)     // Catch:{ NumberFormatException -> 0x074c }
            goto L_0x075e
        L_0x074c:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.zzgk r12 = r8.zzs     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzfa r12 = r12.zzay()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzey r12 = r12.zzk()     // Catch:{ all -> 0x0aaf }
            java.lang.String r13 = "Experiment ID NumberFormatException"
            r12.zzb(r13, r11)     // Catch:{ all -> 0x0aaf }
            goto L_0x0701
        L_0x075e:
            boolean r8 = r14.isEmpty()     // Catch:{ all -> 0x0aaf }
            if (r8 == 0) goto L_0x0765
        L_0x0764:
            r14 = r4
        L_0x0765:
            if (r14 == 0) goto L_0x076a
            r2.zzh(r14)     // Catch:{ all -> 0x0aaf }
        L_0x076a:
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0aaf }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzai r8 = r1.zzh(r8)     // Catch:{ all -> 0x0aaf }
            java.lang.String r9 = r3.zzv     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzai r9 = com.google.android.gms.measurement.internal.zzai.zzb(r9)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzai r8 = r8.zzc(r9)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0aaf }
            boolean r9 = r8.zzi(r9)     // Catch:{ all -> 0x0aaf }
            if (r9 == 0) goto L_0x07b4
            com.google.android.gms.measurement.internal.zzkg r9 = r1.zzk     // Catch:{ all -> 0x0aaf }
            java.lang.String r10 = r3.zza     // Catch:{ all -> 0x0aaf }
            android.util.Pair r9 = r9.zzd(r10, r8)     // Catch:{ all -> 0x0aaf }
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0aaf }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x0aaf }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0aaf }
            if (r10 != 0) goto L_0x07b4
            boolean r10 = r3.zzo     // Catch:{ all -> 0x0aaf }
            if (r10 == 0) goto L_0x07b4
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0aaf }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0aaf }
            r2.zzaf(r10)     // Catch:{ all -> 0x0aaf }
            java.lang.Object r10 = r9.second     // Catch:{ all -> 0x0aaf }
            if (r10 == 0) goto L_0x07b4
            java.lang.Object r9 = r9.second     // Catch:{ all -> 0x0aaf }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0aaf }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0aaf }
            r2.zzY(r9)     // Catch:{ all -> 0x0aaf }
        L_0x07b4:
            com.google.android.gms.measurement.internal.zzgk r9 = r1.zzn     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzaq r9 = r9.zzg()     // Catch:{ all -> 0x0aaf }
            r9.zzu()     // Catch:{ all -> 0x0aaf }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x0aaf }
            r2.zzO(r9)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzgk r9 = r1.zzn     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzaq r9 = r9.zzg()     // Catch:{ all -> 0x0aaf }
            r9.zzu()     // Catch:{ all -> 0x0aaf }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0aaf }
            r2.zzZ(r9)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzgk r9 = r1.zzn     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzaq r9 = r9.zzg()     // Catch:{ all -> 0x0aaf }
            long r9 = r9.zzb()     // Catch:{ all -> 0x0aaf }
            int r9 = (int) r9     // Catch:{ all -> 0x0aaf }
            r2.zzak(r9)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzgk r9 = r1.zzn     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzaq r9 = r9.zzg()     // Catch:{ all -> 0x0aaf }
            java.lang.String r9 = r9.zzc()     // Catch:{ all -> 0x0aaf }
            r2.zzao(r9)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzag r9 = r34.zzg()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzem r10 = com.google.android.gms.measurement.internal.zzen.zzah     // Catch:{ all -> 0x0aaf }
            boolean r9 = r9.zzs(r4, r10)     // Catch:{ all -> 0x0aaf }
            if (r9 != 0) goto L_0x07fc
            long r9 = r3.zzl     // Catch:{ all -> 0x0aaf }
            r2.zzD(r9)     // Catch:{ all -> 0x0aaf }
        L_0x07fc:
            com.google.android.gms.measurement.internal.zzgk r9 = r1.zzn     // Catch:{ all -> 0x0aaf }
            boolean r9 = r9.zzJ()     // Catch:{ all -> 0x0aaf }
            if (r9 == 0) goto L_0x0810
            r2.zzaq()     // Catch:{ all -> 0x0aaf }
            boolean r9 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0aaf }
            if (r9 != 0) goto L_0x0810
            r2.zzP(r4)     // Catch:{ all -> 0x0aaf }
        L_0x0810:
            com.google.android.gms.measurement.internal.zzam r9 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r9)     // Catch:{ all -> 0x0aaf }
            java.lang.String r10 = r3.zza     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzh r9 = r9.zzj(r10)     // Catch:{ all -> 0x0aaf }
            if (r9 != 0) goto L_0x0891
            com.google.android.gms.measurement.internal.zzh r9 = new com.google.android.gms.measurement.internal.zzh     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzgk r10 = r1.zzn     // Catch:{ all -> 0x0aaf }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0aaf }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0aaf }
            java.lang.String r10 = r1.zzw(r8)     // Catch:{ all -> 0x0aaf }
            r9.zzI(r10)     // Catch:{ all -> 0x0aaf }
            java.lang.String r10 = r3.zzk     // Catch:{ all -> 0x0aaf }
            r9.zzW(r10)     // Catch:{ all -> 0x0aaf }
            java.lang.String r10 = r3.zzb     // Catch:{ all -> 0x0aaf }
            r9.zzX(r10)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzah r10 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0aaf }
            boolean r10 = r8.zzi(r10)     // Catch:{ all -> 0x0aaf }
            if (r10 == 0) goto L_0x084a
            com.google.android.gms.measurement.internal.zzkg r10 = r1.zzk     // Catch:{ all -> 0x0aaf }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0aaf }
            java.lang.String r10 = r10.zzf(r11)     // Catch:{ all -> 0x0aaf }
            r9.zzaf(r10)     // Catch:{ all -> 0x0aaf }
        L_0x084a:
            r10 = 0
            r9.zzab(r10)     // Catch:{ all -> 0x0aaf }
            r9.zzac(r10)     // Catch:{ all -> 0x0aaf }
            r9.zzaa(r10)     // Catch:{ all -> 0x0aaf }
            java.lang.String r10 = r3.zzc     // Catch:{ all -> 0x0aaf }
            r9.zzK(r10)     // Catch:{ all -> 0x0aaf }
            long r10 = r3.zzj     // Catch:{ all -> 0x0aaf }
            r9.zzL(r10)     // Catch:{ all -> 0x0aaf }
            java.lang.String r10 = r3.zzd     // Catch:{ all -> 0x0aaf }
            r9.zzJ(r10)     // Catch:{ all -> 0x0aaf }
            long r10 = r3.zze     // Catch:{ all -> 0x0aaf }
            r9.zzY(r10)     // Catch:{ all -> 0x0aaf }
            long r10 = r3.zzf     // Catch:{ all -> 0x0aaf }
            r9.zzT(r10)     // Catch:{ all -> 0x0aaf }
            boolean r10 = r3.zzh     // Catch:{ all -> 0x0aaf }
            r9.zzad(r10)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzag r10 = r34.zzg()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzem r11 = com.google.android.gms.measurement.internal.zzen.zzah     // Catch:{ all -> 0x0aaf }
            boolean r10 = r10.zzs(r4, r11)     // Catch:{ all -> 0x0aaf }
            if (r10 != 0) goto L_0x0884
            long r10 = r3.zzl     // Catch:{ all -> 0x0aaf }
            r9.zzH(r10)     // Catch:{ all -> 0x0aaf }
        L_0x0884:
            long r10 = r3.zzs     // Catch:{ all -> 0x0aaf }
            r9.zzU(r10)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzam r10 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r10)     // Catch:{ all -> 0x0aaf }
            r10.zzD(r9)     // Catch:{ all -> 0x0aaf }
        L_0x0891:
            com.google.android.gms.measurement.internal.zzah r10 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE     // Catch:{ all -> 0x0aaf }
            boolean r8 = r8.zzi(r10)     // Catch:{ all -> 0x0aaf }
            if (r8 == 0) goto L_0x08b0
            java.lang.String r8 = r9.zzu()     // Catch:{ all -> 0x0aaf }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aaf }
            if (r8 != 0) goto L_0x08b0
            java.lang.String r8 = r9.zzu()     // Catch:{ all -> 0x0aaf }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aaf }
            r2.zzF(r8)     // Catch:{ all -> 0x0aaf }
        L_0x08b0:
            java.lang.String r8 = r9.zzx()     // Catch:{ all -> 0x0aaf }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aaf }
            if (r8 != 0) goto L_0x08c7
            java.lang.String r8 = r9.zzx()     // Catch:{ all -> 0x0aaf }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aaf }
            r2.zzU(r8)     // Catch:{ all -> 0x0aaf }
        L_0x08c7:
            com.google.android.gms.measurement.internal.zzam r8 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r8)     // Catch:{ all -> 0x0aaf }
            java.lang.String r3 = r3.zza     // Catch:{ all -> 0x0aaf }
            java.util.List r3 = r8.zzu(r3)     // Catch:{ all -> 0x0aaf }
            r13 = r31
        L_0x08d4:
            int r8 = r3.size()     // Catch:{ all -> 0x0aaf }
            if (r13 >= r8) goto L_0x090a
            com.google.android.gms.internal.measurement.zzgk r8 = com.google.android.gms.internal.measurement.zzgl.zzd()     // Catch:{ all -> 0x0aaf }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzlq r9 = (com.google.android.gms.measurement.internal.zzlq) r9     // Catch:{ all -> 0x0aaf }
            java.lang.String r9 = r9.zzc     // Catch:{ all -> 0x0aaf }
            r8.zzf(r9)     // Catch:{ all -> 0x0aaf }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzlq r9 = (com.google.android.gms.measurement.internal.zzlq) r9     // Catch:{ all -> 0x0aaf }
            long r9 = r9.zzd     // Catch:{ all -> 0x0aaf }
            r8.zzg(r9)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzln r9 = r1.zzi     // Catch:{ all -> 0x0aaf }
            zzak(r9)     // Catch:{ all -> 0x0aaf }
            java.lang.Object r10 = r3.get(r13)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzlq r10 = (com.google.android.gms.measurement.internal.zzlq) r10     // Catch:{ all -> 0x0aaf }
            java.lang.Object r10 = r10.zze     // Catch:{ all -> 0x0aaf }
            r9.zzu(r8, r10)     // Catch:{ all -> 0x0aaf }
            r2.zzl(r8)     // Catch:{ all -> 0x0aaf }
            int r13 = r13 + 1
            goto L_0x08d4
        L_0x090a:
            com.google.android.gms.measurement.internal.zzam r3 = r1.zze     // Catch:{ IOException -> 0x0a65 }
            zzak(r3)     // Catch:{ IOException -> 0x0a65 }
            com.google.android.gms.internal.measurement.zzkc r8 = r2.zzaE()     // Catch:{ IOException -> 0x0a65 }
            com.google.android.gms.internal.measurement.zzgc r8 = (com.google.android.gms.internal.measurement.zzgc) r8     // Catch:{ IOException -> 0x0a65 }
            r3.zzg()     // Catch:{ IOException -> 0x0a65 }
            r3.zzW()     // Catch:{ IOException -> 0x0a65 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ IOException -> 0x0a65 }
            java.lang.String r9 = r8.zzy()     // Catch:{ IOException -> 0x0a65 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)     // Catch:{ IOException -> 0x0a65 }
            byte[] r9 = r8.zzby()     // Catch:{ IOException -> 0x0a65 }
            com.google.android.gms.measurement.internal.zzll r10 = r3.zzf     // Catch:{ IOException -> 0x0a65 }
            com.google.android.gms.measurement.internal.zzln r10 = r10.zzi     // Catch:{ IOException -> 0x0a65 }
            zzak(r10)     // Catch:{ IOException -> 0x0a65 }
            long r10 = r10.zzd(r9)     // Catch:{ IOException -> 0x0a65 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0a65 }
            r12.<init>()     // Catch:{ IOException -> 0x0a65 }
            java.lang.String r13 = r8.zzy()     // Catch:{ IOException -> 0x0a65 }
            r14 = r30
            r12.put(r14, r13)     // Catch:{ IOException -> 0x0a65 }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0a65 }
            r15 = r33
            r12.put(r15, r13)     // Catch:{ IOException -> 0x0a65 }
            java.lang.String r13 = "metadata"
            r12.put(r13, r9)     // Catch:{ IOException -> 0x0a65 }
            android.database.sqlite.SQLiteDatabase r9 = r3.zzh()     // Catch:{ SQLiteException -> 0x0a4b }
            java.lang.String r13 = "raw_events_metadata"
            r7 = 4
            r9.insertWithOnConflict(r13, r4, r12, r7)     // Catch:{ SQLiteException -> 0x0a4b }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r2)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzau r3 = r5.zzf     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzat r7 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0aaf }
            r7.<init>(r3)     // Catch:{ all -> 0x0aaf }
        L_0x0966:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x0aaf }
            if (r3 == 0) goto L_0x0978
            java.lang.String r3 = r7.next()     // Catch:{ all -> 0x0aaf }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0aaf }
            if (r3 == 0) goto L_0x0966
        L_0x0976:
            r13 = 1
            goto L_0x09ba
        L_0x0978:
            com.google.android.gms.measurement.internal.zzgb r3 = r1.zzc     // Catch:{ all -> 0x0aaf }
            zzak(r3)     // Catch:{ all -> 0x0aaf }
            java.lang.String r6 = r5.zza     // Catch:{ all -> 0x0aaf }
            java.lang.String r7 = r5.zzb     // Catch:{ all -> 0x0aaf }
            boolean r3 = r3.zzq(r6, r7)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzam r6 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r6)     // Catch:{ all -> 0x0aaf }
            long r17 = r34.zza()     // Catch:{ all -> 0x0aaf }
            java.lang.String r7 = r5.zza     // Catch:{ all -> 0x0aaf }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r16 = r6
            r19 = r7
            com.google.android.gms.measurement.internal.zzak r6 = r16.zzl(r17, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0aaf }
            if (r3 == 0) goto L_0x09b8
            long r6 = r6.zze     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzag r3 = r34.zzg()     // Catch:{ all -> 0x0aaf }
            java.lang.String r8 = r5.zza     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzem r9 = com.google.android.gms.measurement.internal.zzen.zzn     // Catch:{ all -> 0x0aaf }
            int r3 = r3.zze(r8, r9)     // Catch:{ all -> 0x0aaf }
            long r8 = (long) r3     // Catch:{ all -> 0x0aaf }
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x09b8
            goto L_0x0976
        L_0x09b8:
            r13 = r31
        L_0x09ba:
            r2.zzg()     // Catch:{ all -> 0x0aaf }
            r2.zzW()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0aaf }
            java.lang.String r3 = r5.zza     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzll r3 = r2.zzf     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzln r3 = r3.zzi     // Catch:{ all -> 0x0aaf }
            zzak(r3)     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.internal.measurement.zzfs r3 = r3.zzj(r5)     // Catch:{ all -> 0x0aaf }
            byte[] r3 = r3.zzby()     // Catch:{ all -> 0x0aaf }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0aaf }
            r6.<init>()     // Catch:{ all -> 0x0aaf }
            java.lang.String r7 = r5.zza     // Catch:{ all -> 0x0aaf }
            r6.put(r14, r7)     // Catch:{ all -> 0x0aaf }
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.zzb     // Catch:{ all -> 0x0aaf }
            r6.put(r7, r8)     // Catch:{ all -> 0x0aaf }
            java.lang.String r7 = "timestamp"
            long r8 = r5.zzd     // Catch:{ all -> 0x0aaf }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0aaf }
            r6.put(r7, r8)     // Catch:{ all -> 0x0aaf }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0aaf }
            r6.put(r15, r7)     // Catch:{ all -> 0x0aaf }
            java.lang.String r7 = "data"
            r6.put(r7, r3)     // Catch:{ all -> 0x0aaf }
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0aaf }
            r6.put(r3, r7)     // Catch:{ all -> 0x0aaf }
            android.database.sqlite.SQLiteDatabase r3 = r2.zzh()     // Catch:{ SQLiteException -> 0x0a33 }
            r7 = r32
            long r3 = r3.insert(r7, r4, r6)     // Catch:{ SQLiteException -> 0x0a33 }
            r6 = -1
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0a2e
            com.google.android.gms.measurement.internal.zzgk r3 = r2.zzs     // Catch:{ SQLiteException -> 0x0a33 }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ SQLiteException -> 0x0a33 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ SQLiteException -> 0x0a33 }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.zza     // Catch:{ SQLiteException -> 0x0a33 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzfa.zzn(r6)     // Catch:{ SQLiteException -> 0x0a33 }
            r3.zzb(r4, r6)     // Catch:{ SQLiteException -> 0x0a33 }
            goto L_0x0a7c
        L_0x0a2e:
            r3 = 0
            r1.zza = r3     // Catch:{ all -> 0x0aaf }
            goto L_0x0a7c
        L_0x0a33:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzgk r2 = r2.zzs     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x0aaf }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.zza     // Catch:{ all -> 0x0aaf }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfa.zzn(r5)     // Catch:{ all -> 0x0aaf }
            r2.zzc(r4, r5, r3)     // Catch:{ all -> 0x0aaf }
            goto L_0x0a7c
        L_0x0a4b:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.zzgk r3 = r3.zzs     // Catch:{ IOException -> 0x0a65 }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ IOException -> 0x0a65 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ IOException -> 0x0a65 }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r8.zzy()     // Catch:{ IOException -> 0x0a65 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzfa.zzn(r6)     // Catch:{ IOException -> 0x0a65 }
            r3.zzc(r5, r6, r4)     // Catch:{ IOException -> 0x0a65 }
            throw r4     // Catch:{ IOException -> 0x0a65 }
        L_0x0a65:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzfa r4 = r34.zzay()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzd()     // Catch:{ all -> 0x0aaf }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.zzaq()     // Catch:{ all -> 0x0aaf }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfa.zzn(r2)     // Catch:{ all -> 0x0aaf }
            r4.zzc(r5, r2, r3)     // Catch:{ all -> 0x0aaf }
        L_0x0a7c:
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze     // Catch:{ all -> 0x0aaf }
            zzak(r2)     // Catch:{ all -> 0x0aaf }
            r2.zzC()     // Catch:{ all -> 0x0aaf }
            com.google.android.gms.measurement.internal.zzam r2 = r1.zze
            zzak(r2)
            r2.zzx()
            r34.zzaf()
            com.google.android.gms.measurement.internal.zzfa r2 = r34.zzay()
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzj()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.zzb(r4, r3)
            return
        L_0x0aaf:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzam r3 = r1.zze
            zzak(r3)
            r3.zzx()
            throw r2
        L_0x0aba:
            r1.zzd(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzll.zzX(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean zzY() {
        zzaz().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock == null || !fileLock.isValid()) {
            this.zze.zzs.zzf();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.zzn.zzau().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.zzx = channel;
                FileLock tryLock = channel.tryLock();
                this.zzw = tryLock;
                if (tryLock != null) {
                    zzay().zzj().zza("Storage concurrent access okay");
                    return true;
                }
                zzay().zzd().zza("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                zzay().zzd().zzb("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                zzay().zzd().zzb("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                zzay().zzk().zzb("Storage lock already acquired", e3);
                return false;
            }
        } else {
            zzay().zzj().zza("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final long zza() {
        long currentTimeMillis = zzav().currentTimeMillis();
        zzkg zzkg = this.zzk;
        zzkg.zzW();
        zzkg.zzg();
        long zza2 = zzkg.zze.zza();
        if (zza2 == 0) {
            zza2 = ((long) zzkg.zzs.zzv().zzG().nextInt(86400000)) + 1;
            zzkg.zze.zzb(zza2);
        }
        return ((((currentTimeMillis + zza2) / 1000) / 60) / 60) / 24;
    }

    public final Context zzau() {
        return this.zzn.zzau();
    }

    public final Clock zzav() {
        return ((zzgk) Preconditions.checkNotNull(this.zzn)).zzav();
    }

    public final zzab zzaw() {
        throw null;
    }

    public final zzfa zzay() {
        return ((zzgk) Preconditions.checkNotNull(this.zzn)).zzay();
    }

    public final zzgh zzaz() {
        return ((zzgk) Preconditions.checkNotNull(this.zzn)).zzaz();
    }

    /* access modifiers changed from: package-private */
    public final zzh zzd(zzq zzq2) {
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzq2);
        Preconditions.checkNotEmpty(zzq2.zza);
        zzpj.zzc();
        if (zzg().zzs(zzq2.zza, zzen.zzaJ) && !zzq2.zzw.isEmpty()) {
            this.zzC.put(zzq2.zza, new zzlk(this, zzq2.zzw));
        }
        zzam zzam = this.zze;
        zzak(zzam);
        zzh zzj2 = zzam.zzj(zzq2.zza);
        zzai zzc2 = zzh(zzq2.zza).zzc(zzai.zzb(zzq2.zzv));
        String zzf2 = zzc2.zzi(zzah.AD_STORAGE) ? this.zzk.zzf(zzq2.zza) : "";
        if (zzj2 == null) {
            zzj2 = new zzh(this.zzn, zzq2.zza);
            if (zzc2.zzi(zzah.ANALYTICS_STORAGE)) {
                zzj2.zzI(zzw(zzc2));
            }
            if (zzc2.zzi(zzah.AD_STORAGE)) {
                zzj2.zzaf(zzf2);
            }
        } else if (zzc2.zzi(zzah.AD_STORAGE) && zzf2 != null && !zzf2.equals(zzj2.zzA())) {
            zzj2.zzaf(zzf2);
            zzne.zzc();
            if (!zzg().zzs((String) null, zzen.zzan) || !zzg().zzs((String) null, zzen.zzas)) {
                zzj2.zzI(zzw(zzc2));
            } else if (!"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzq2.zza, zzc2).first)) {
                zzj2.zzI(zzw(zzc2));
            }
            zzne.zzc();
            if (zzg().zzs((String) null, zzen.zzan) && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzq2.zza, zzc2).first)) {
                zzam zzam2 = this.zze;
                zzak(zzam2);
                if (zzam2.zzp(zzq2.zza, "_id") != null) {
                    zzam zzam3 = this.zze;
                    zzak(zzam3);
                    if (zzam3.zzp(zzq2.zza, "_lair") == null) {
                        zzlq zzlq = new zzlq(zzq2.zza, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lair", zzav().currentTimeMillis(), 1L);
                        zzam zzam4 = this.zze;
                        zzak(zzam4);
                        zzam4.zzL(zzlq);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzj2.zzu()) && zzc2.zzi(zzah.ANALYTICS_STORAGE)) {
            zzj2.zzI(zzw(zzc2));
        }
        zzj2.zzX(zzq2.zzb);
        zzj2.zzF(zzq2.zzq);
        if (!TextUtils.isEmpty(zzq2.zzk)) {
            zzj2.zzW(zzq2.zzk);
        }
        long j = zzq2.zze;
        if (j != 0) {
            zzj2.zzY(j);
        }
        if (!TextUtils.isEmpty(zzq2.zzc)) {
            zzj2.zzK(zzq2.zzc);
        }
        zzj2.zzL(zzq2.zzj);
        String str = zzq2.zzd;
        if (str != null) {
            zzj2.zzJ(str);
        }
        zzj2.zzT(zzq2.zzf);
        zzj2.zzad(zzq2.zzh);
        if (!TextUtils.isEmpty(zzq2.zzg)) {
            zzj2.zzZ(zzq2.zzg);
        }
        if (!zzg().zzs((String) null, zzen.zzah)) {
            zzj2.zzH(zzq2.zzl);
        }
        zzj2.zzG(zzq2.zzo);
        zzj2.zzae(zzq2.zzr);
        zzj2.zzU(zzq2.zzs);
        zzps.zzc();
        if (zzg().zzs((String) null, zzen.zzaH)) {
            zzj2.zzah(zzq2.zzx);
        }
        zznz.zzc();
        if (zzg().zzs((String) null, zzen.zzaz)) {
            zzj2.zzag(zzq2.zzt);
        } else {
            zznz.zzc();
            if (zzg().zzs((String) null, zzen.zzay)) {
                zzj2.zzag((List) null);
            }
        }
        if (zzj2.zzak()) {
            zzam zzam5 = this.zze;
            zzak(zzam5);
            zzam5.zzD(zzj2);
        }
        return zzj2;
    }

    public final zzaa zzf() {
        zzaa zzaa = this.zzh;
        zzak(zzaa);
        return zzaa;
    }

    public final zzag zzg() {
        return ((zzgk) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    /* access modifiers changed from: package-private */
    public final zzai zzh(String str) {
        String str2;
        zzai zzai = zzai.zza;
        zzaz().zzg();
        zzB();
        zzai zzai2 = (zzai) this.zzB.get(str);
        if (zzai2 != null) {
            return zzai2;
        }
        zzam zzam = this.zze;
        zzak(zzam);
        Preconditions.checkNotNull(str);
        zzam.zzg();
        zzam.zzW();
        Cursor cursor = null;
        try {
            Cursor rawQuery = zzam.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } else {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                str2 = "G1";
            }
            zzai zzb2 = zzai.zzb(str2);
            zzU(str, zzb2);
            return zzb2;
        } catch (SQLiteException e) {
            zzam.zzs.zzay().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final zzam zzi() {
        zzam zzam = this.zze;
        zzak(zzam);
        return zzam;
    }

    public final zzev zzj() {
        return this.zzn.zzj();
    }

    public final zzfg zzl() {
        zzfg zzfg = this.zzd;
        zzak(zzfg);
        return zzfg;
    }

    public final zzfi zzm() {
        zzfi zzfi = this.zzf;
        if (zzfi != null) {
            return zzfi;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzgb zzo() {
        zzgb zzgb = this.zzc;
        zzak(zzgb);
        return zzgb;
    }

    /* access modifiers changed from: package-private */
    public final zzgk zzq() {
        return this.zzn;
    }

    public final zziu zzr() {
        zziu zziu = this.zzj;
        zzak(zziu);
        return zziu;
    }

    public final zzkg zzs() {
        return this.zzk;
    }

    public final zzln zzu() {
        zzln zzln = this.zzi;
        zzak(zzln);
        return zzln;
    }

    public final zzlt zzv() {
        return ((zzgk) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    /* access modifiers changed from: package-private */
    public final String zzw(zzai zzai) {
        if (!zzai.zzi(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzv().zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    public final String zzx(zzq zzq2) {
        try {
            return (String) zzaz().zzh(new zzle(this, zzq2)).get(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzay().zzd().zzc("Failed to get app instance id. appId", zzfa.zzn(zzq2.zza), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzz(Runnable runnable) {
        zzaz().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
