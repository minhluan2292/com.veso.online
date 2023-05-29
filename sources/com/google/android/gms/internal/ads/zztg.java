package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zztg implements zzws, zzrx {
    final /* synthetic */ zztl zza;
    /* access modifiers changed from: private */
    public final long zzb = zzrz.zza();
    private final Uri zzc;
    /* access modifiers changed from: private */
    public final zzfy zzd;
    private final zztb zze;
    private final zzzl zzf;
    private final zzdg zzg;
    private final zzaai zzh = new zzaai();
    private volatile boolean zzi;
    private boolean zzj = true;
    /* access modifiers changed from: private */
    public long zzk;
    /* access modifiers changed from: private */
    public zzfc zzl = zzi(0);
    private zzaap zzm;
    private boolean zzn;

    public zztg(zztl zztl, Uri uri, zzex zzex, zztb zztb, zzzl zzzl, zzdg zzdg) {
        this.zza = zztl;
        this.zzc = uri;
        this.zzd = new zzfy(zzex);
        this.zze = zztb;
        this.zzf = zzzl;
        this.zzg = zzdg;
    }

    static /* bridge */ /* synthetic */ void zzf(zztg zztg, long j, long j2) {
        zztg.zzh.zza = j;
        zztg.zzk = j2;
        zztg.zzj = true;
        zztg.zzn = false;
    }

    private final zzfc zzi(long j) {
        zzfa zzfa = new zzfa();
        zzfa.zzd(this.zzc);
        zzfa.zzc(j);
        zzfa.zza(6);
        zzfa.zzb(zztl.zzb);
        return zzfa.zze();
    }

    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:58|59) */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        com.google.android.gms.internal.ads.zzdw.zze("IcyHeaders", "Invalid metadata interval: ".concat(java.lang.String.valueOf(r3)));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0105 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x020b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c6 A[EDGE_INSN: B:124:0x01c6->B:100:0x01c6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e0 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0111 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0115 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0131 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014d A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0169 A[Catch:{ all -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0172 A[Catch:{ all -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0185 A[SYNTHETIC, Splitter:B:85:0x0185] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh() throws java.io.IOException {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = "Invalid metadata interval: "
        L_0x0004:
            boolean r2 = r1.zzi
            if (r2 != 0) goto L_0x020b
            r2 = -1
            r5 = 0
            com.google.android.gms.internal.ads.zzaai r6 = r1.zzh     // Catch:{ all -> 0x01eb }
            long r13 = r6.zza     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzfc r6 = r1.zzi(r13)     // Catch:{ all -> 0x01eb }
            r1.zzl = r6     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzfy r7 = r1.zzd     // Catch:{ all -> 0x01eb }
            long r6 = r7.zzb(r6)     // Catch:{ all -> 0x01eb }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0025
            long r6 = r6 + r13
            com.google.android.gms.internal.ads.zztl r8 = r1.zza     // Catch:{ all -> 0x01eb }
            r8.zzp.post(new com.google.android.gms.internal.ads.zzte(r8))     // Catch:{ all -> 0x01eb }
        L_0x0025:
            r15 = r6
            com.google.android.gms.internal.ads.zztl r6 = r1.zza     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzfy r7 = r1.zzd     // Catch:{ all -> 0x01eb }
            java.util.Map r7 = r7.zze()     // Catch:{ all -> 0x01eb }
            java.lang.String r8 = "icy-br"
            java.lang.Object r8 = r7.get(r8)     // Catch:{ all -> 0x01eb }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x01eb }
            java.lang.String r9 = "IcyHeaders"
            r10 = -1
            if (r8 == 0) goto L_0x0074
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x01eb }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01eb }
            int r11 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0064 }
            int r11 = r11 * 1000
            if (r11 <= 0) goto L_0x004b
            r2 = 1
            goto L_0x0061
        L_0x004b:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0065 }
            r12.<init>()     // Catch:{ NumberFormatException -> 0x0065 }
            java.lang.String r2 = "Invalid bitrate: "
            r12.append(r2)     // Catch:{ NumberFormatException -> 0x0065 }
            r12.append(r8)     // Catch:{ NumberFormatException -> 0x0065 }
            java.lang.String r2 = r12.toString()     // Catch:{ NumberFormatException -> 0x0065 }
            com.google.android.gms.internal.ads.zzdw.zze(r9, r2)     // Catch:{ NumberFormatException -> 0x0065 }
            r2 = r5
            r11 = r10
        L_0x0061:
            r18 = r11
            goto L_0x0077
        L_0x0064:
            r11 = r10
        L_0x0065:
            java.lang.String r2 = "Invalid bitrate header: "
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzdw.zze(r9, r2)     // Catch:{ all -> 0x01eb }
            r2 = r5
            goto L_0x0061
        L_0x0074:
            r2 = r5
            r18 = r10
        L_0x0077:
            java.lang.String r3 = "icy-genre"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01eb }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01eb }
            r8 = 0
            if (r3 == 0) goto L_0x008c
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01eb }
            r19 = r2
            r2 = 1
            goto L_0x008e
        L_0x008c:
            r19 = r8
        L_0x008e:
            java.lang.String r3 = "icy-name"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01eb }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01eb }
            if (r3 == 0) goto L_0x00a2
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01eb }
            r20 = r2
            r2 = 1
            goto L_0x00a4
        L_0x00a2:
            r20 = r8
        L_0x00a4:
            java.lang.String r3 = "icy-url"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01eb }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01eb }
            if (r3 == 0) goto L_0x00b8
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01eb }
            r21 = r2
            r2 = 1
            goto L_0x00ba
        L_0x00b8:
            r21 = r8
        L_0x00ba:
            java.lang.String r3 = "icy-pub"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01eb }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01eb }
            if (r3 == 0) goto L_0x00d4
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01eb }
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x01eb }
            r22 = r2
            r2 = 1
            goto L_0x00d6
        L_0x00d4:
            r22 = r5
        L_0x00d6:
            java.lang.String r3 = "icy-metaint"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01eb }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01eb }
            if (r3 == 0) goto L_0x0111
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x01eb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01eb }
            int r7 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0104 }
            if (r7 <= 0) goto L_0x00ee
            r2 = 1
            goto L_0x0101
        L_0x00ee:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0105 }
            r11.<init>()     // Catch:{ NumberFormatException -> 0x0105 }
            r11.append(r0)     // Catch:{ NumberFormatException -> 0x0105 }
            r11.append(r3)     // Catch:{ NumberFormatException -> 0x0105 }
            java.lang.String r11 = r11.toString()     // Catch:{ NumberFormatException -> 0x0105 }
            com.google.android.gms.internal.ads.zzdw.zze(r9, r11)     // Catch:{ NumberFormatException -> 0x0105 }
            r7 = r10
        L_0x0101:
            r23 = r7
            goto L_0x0113
        L_0x0104:
            r7 = r10
        L_0x0105:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01eb }
            java.lang.String r3 = r0.concat(r3)     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzdw.zze(r9, r3)     // Catch:{ all -> 0x01eb }
            goto L_0x0101
        L_0x0111:
            r23 = r10
        L_0x0113:
            if (r2 == 0) goto L_0x011c
            com.google.android.gms.internal.ads.zzacm r8 = new com.google.android.gms.internal.ads.zzacm     // Catch:{ all -> 0x01eb }
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x01eb }
        L_0x011c:
            r6.zzr = r8     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzfy r2 = r1.zzd     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zztl r3 = r1.zza     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzacm r6 = r3.zzr     // Catch:{ all -> 0x01eb }
            if (r6 == 0) goto L_0x014d
            com.google.android.gms.internal.ads.zzacm r6 = r3.zzr     // Catch:{ all -> 0x01eb }
            int r6 = r6.zzf     // Catch:{ all -> 0x01eb }
            if (r6 == r10) goto L_0x014d
            com.google.android.gms.internal.ads.zzry r6 = new com.google.android.gms.internal.ads.zzry     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzacm r3 = r3.zzr     // Catch:{ all -> 0x01eb }
            int r3 = r3.zzf     // Catch:{ all -> 0x01eb }
            r6.<init>(r2, r3, r1)     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zztl r2 = r1.zza     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzaap r2 = r2.zzu()     // Catch:{ all -> 0x01eb }
            r1.zzm = r2     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzaf r3 = com.google.android.gms.internal.ads.zztl.zzc     // Catch:{ all -> 0x01eb }
            r2.zzk(r3)     // Catch:{ all -> 0x01eb }
            r8 = r6
            goto L_0x014e
        L_0x014d:
            r8 = r2
        L_0x014e:
            com.google.android.gms.internal.ads.zztb r7 = r1.zze     // Catch:{ all -> 0x01eb }
            android.net.Uri r9 = r1.zzc     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzfy r2 = r1.zzd     // Catch:{ all -> 0x01eb }
            java.util.Map r10 = r2.zze()     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzzl r2 = r1.zzf     // Catch:{ all -> 0x01eb }
            r11 = r13
            r4 = r13
            r13 = r15
            r15 = r2
            r7.zzd(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x01e8 }
            com.google.android.gms.internal.ads.zztl r2 = r1.zza     // Catch:{ all -> 0x01e8 }
            com.google.android.gms.internal.ads.zzacm r2 = r2.zzr     // Catch:{ all -> 0x01e8 }
            if (r2 == 0) goto L_0x016e
            com.google.android.gms.internal.ads.zztb r2 = r1.zze     // Catch:{ all -> 0x01e8 }
            r2.zzc()     // Catch:{ all -> 0x01e8 }
        L_0x016e:
            boolean r2 = r1.zzj     // Catch:{ all -> 0x01e8 }
            if (r2 == 0) goto L_0x0180
            com.google.android.gms.internal.ads.zztb r2 = r1.zze     // Catch:{ all -> 0x01e8 }
            long r7 = r1.zzk     // Catch:{ all -> 0x01e8 }
            r2.zzf(r4, r7)     // Catch:{ all -> 0x01e8 }
            r2 = 0
            r1.zzj = r2     // Catch:{ all -> 0x017d }
            goto L_0x0181
        L_0x017d:
            r0 = move-exception
            goto L_0x01ed
        L_0x0180:
            r2 = 0
        L_0x0181:
            r13 = r4
            r4 = r2
        L_0x0183:
            if (r4 != 0) goto L_0x01c6
            boolean r5 = r1.zzi     // Catch:{ all -> 0x01c3 }
            if (r5 != 0) goto L_0x01c1
            com.google.android.gms.internal.ads.zzdg r5 = r1.zzg     // Catch:{ InterruptedException -> 0x01bb }
            r5.zza()     // Catch:{ InterruptedException -> 0x01bb }
            com.google.android.gms.internal.ads.zztb r5 = r1.zze     // Catch:{ all -> 0x01c3 }
            com.google.android.gms.internal.ads.zzaai r6 = r1.zzh     // Catch:{ all -> 0x01c3 }
            int r4 = r5.zza(r6)     // Catch:{ all -> 0x01c3 }
            com.google.android.gms.internal.ads.zztb r5 = r1.zze     // Catch:{ all -> 0x01c3 }
            long r5 = r5.zzb()     // Catch:{ all -> 0x01c3 }
            com.google.android.gms.internal.ads.zztl r7 = r1.zza     // Catch:{ all -> 0x01c3 }
            long r7 = r7.zzj     // Catch:{ all -> 0x01c3 }
            long r7 = r7 + r13
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0183
            com.google.android.gms.internal.ads.zzdg r7 = r1.zzg     // Catch:{ all -> 0x01c3 }
            r7.zzc()     // Catch:{ all -> 0x01c3 }
            com.google.android.gms.internal.ads.zztl r7 = r1.zza     // Catch:{ all -> 0x01c3 }
            android.os.Handler r8 = r7.zzp     // Catch:{ all -> 0x01c3 }
            java.lang.Runnable r7 = r7.zzo     // Catch:{ all -> 0x01c3 }
            r8.post(r7)     // Catch:{ all -> 0x01c3 }
            r13 = r5
            goto L_0x0183
        L_0x01bb:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x01c3 }
            r0.<init>()     // Catch:{ all -> 0x01c3 }
            throw r0     // Catch:{ all -> 0x01c3 }
        L_0x01c1:
            r4 = r2
            goto L_0x01c6
        L_0x01c3:
            r0 = move-exception
            r5 = r4
            goto L_0x01ee
        L_0x01c6:
            r3 = 1
            if (r4 != r3) goto L_0x01cb
            r5 = r2
            goto L_0x01e0
        L_0x01cb:
            com.google.android.gms.internal.ads.zztb r2 = r1.zze
            long r5 = r2.zzb()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01df
            com.google.android.gms.internal.ads.zzaai r3 = r1.zzh
            long r5 = r2.zzb()
            r3.zza = r5
        L_0x01df:
            r5 = r4
        L_0x01e0:
            com.google.android.gms.internal.ads.zzfy r2 = r1.zzd
            com.google.android.gms.internal.ads.zzez.zza(r2)
            if (r5 == 0) goto L_0x0004
            goto L_0x020b
        L_0x01e8:
            r0 = move-exception
            r2 = 0
            goto L_0x01ed
        L_0x01eb:
            r0 = move-exception
            r2 = r5
        L_0x01ed:
            r5 = r2
        L_0x01ee:
            r2 = 1
            if (r5 == r2) goto L_0x0205
            com.google.android.gms.internal.ads.zztb r2 = r1.zze
            long r3 = r2.zzb()
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0205
            com.google.android.gms.internal.ads.zzaai r3 = r1.zzh
            long r4 = r2.zzb()
            r3.zza = r4
        L_0x0205:
            com.google.android.gms.internal.ads.zzfy r2 = r1.zzd
            com.google.android.gms.internal.ads.zzez.zza(r2)
            throw r0
        L_0x020b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztg.zzh():void");
    }

    public final void zza(zzef zzef) {
        long j;
        if (!this.zzn) {
            j = this.zzk;
        } else {
            j = Math.max(this.zza.zzQ(true), this.zzk);
        }
        int zza2 = zzef.zza();
        zzaap zzaap = this.zzm;
        Objects.requireNonNull(zzaap);
        zzaan.zzb(zzaap, zzef, zza2);
        zzaap.zzs(j, 1, zza2, 0, (zzaao) null);
        this.zzn = true;
    }
}
