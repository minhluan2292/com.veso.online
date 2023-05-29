package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
public abstract class zzhy {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    @Nullable
    private static volatile zzhw zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzia zzh = new zzia(zzhq.zza, (byte[]) null);
    private static final AtomicInteger zzi = new AtomicInteger();
    final zzhv zza;
    final String zzb;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private final boolean zzm;

    /* synthetic */ zzhy(zzhv zzhv, String str, Object obj, boolean z, zzhx zzhx) {
        if (zzhv.zzb != null) {
            this.zza = zzhv;
            this.zzb = str;
            this.zzj = obj;
            this.zzm = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    static void zzd() {
        zzi.incrementAndGet();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void zze(android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.zzhw r0 = zze
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = zzd
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzhw r1 = zze     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0040
            monitor-enter(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.measurement.zzhw r1 = zze     // Catch:{ all -> 0x003d }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0015
            r3 = r2
        L_0x0015:
            if (r1 == 0) goto L_0x001d
            android.content.Context r1 = r1.zza()     // Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x003b
        L_0x001d:
            com.google.android.gms.internal.measurement.zzhe.zze()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.zzhz.zzc()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.zzhm.zze()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.zzhp r1 = new com.google.android.gms.internal.measurement.zzhp     // Catch:{ all -> 0x003d }
            r1.<init>(r3)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.zzif r1 = com.google.android.gms.internal.measurement.zzij.zza(r1)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.zzhb r2 = new com.google.android.gms.internal.measurement.zzhb     // Catch:{ all -> 0x003d }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x003d }
            zze = r2     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicInteger r3 = zzi     // Catch:{ all -> 0x003d }
            r3.incrementAndGet()     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r3
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhy.zze(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    public abstract Object zza(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r2 = r2.zzb(zzc());
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzb() {
        /*
            r6 = this;
            boolean r0 = r6.zzm
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = r6.zzb
            java.lang.String r1 = "flagName must not be null"
            java.util.Objects.requireNonNull(r0, r1)
        L_0x000b:
            java.util.concurrent.atomic.AtomicInteger r0 = zzi
            int r0 = r0.get()
            int r1 = r6.zzk
            if (r1 >= r0) goto L_0x00d8
            monitor-enter(r6)
            int r1 = r6.zzk     // Catch:{ all -> 0x00d5 }
            if (r1 >= r0) goto L_0x00d3
            com.google.android.gms.internal.measurement.zzhw r1 = zze     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00cd
            com.google.android.gms.internal.measurement.zzhv r2 = r6.zza     // Catch:{ all -> 0x00d5 }
            boolean r3 = r2.zzf     // Catch:{ all -> 0x00d5 }
            android.net.Uri r2 = r2.zzb     // Catch:{ all -> 0x00d5 }
            r3 = 0
            if (r2 == 0) goto L_0x004e
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.internal.measurement.zzhv r4 = r6.zza     // Catch:{ all -> 0x00d5 }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x00d5 }
            boolean r2 = com.google.android.gms.internal.measurement.zzhn.zza(r2, r4)     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x004c
            com.google.android.gms.internal.measurement.zzhv r2 = r6.zza     // Catch:{ all -> 0x00d5 }
            boolean r2 = r2.zzh     // Catch:{ all -> 0x00d5 }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x00d5 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.internal.measurement.zzhv r4 = r6.zza     // Catch:{ all -> 0x00d5 }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.internal.measurement.zzhe r2 = com.google.android.gms.internal.measurement.zzhe.zza(r2, r4)     // Catch:{ all -> 0x00d5 }
            goto L_0x005a
        L_0x004c:
            r2 = r3
            goto L_0x005a
        L_0x004e:
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.internal.measurement.zzhv r4 = r6.zza     // Catch:{ all -> 0x00d5 }
            java.lang.String r4 = r4.zza     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.internal.measurement.zzhz r2 = com.google.android.gms.internal.measurement.zzhz.zza(r2, r3)     // Catch:{ all -> 0x00d5 }
        L_0x005a:
            if (r2 == 0) goto L_0x006b
            java.lang.String r4 = r6.zzc()     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r2.zzb(r4)     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x006b
            java.lang.Object r2 = r6.zza(r2)     // Catch:{ all -> 0x00d5 }
            goto L_0x006c
        L_0x006b:
            r2 = r3
        L_0x006c:
            if (r2 == 0) goto L_0x006f
            goto L_0x009b
        L_0x006f:
            com.google.android.gms.internal.measurement.zzhv r2 = r6.zza     // Catch:{ all -> 0x00d5 }
            boolean r4 = r2.zze     // Catch:{ all -> 0x00d5 }
            if (r4 != 0) goto L_0x0096
            com.google.android.gms.internal.measurement.zzic r2 = r2.zzi     // Catch:{ all -> 0x00d5 }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.internal.measurement.zzhm r2 = com.google.android.gms.internal.measurement.zzhm.zza(r2)     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.internal.measurement.zzhv r4 = r6.zza     // Catch:{ all -> 0x00d5 }
            boolean r5 = r4.zze     // Catch:{ all -> 0x00d5 }
            if (r5 == 0) goto L_0x0087
            r4 = r3
            goto L_0x008b
        L_0x0087:
            java.lang.String r4 = r4.zzc     // Catch:{ all -> 0x00d5 }
            java.lang.String r4 = r6.zzb     // Catch:{ all -> 0x00d5 }
        L_0x008b:
            java.lang.String r2 = r2.zzb(r4)     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x0096
            java.lang.Object r2 = r6.zza(r2)     // Catch:{ all -> 0x00d5 }
            goto L_0x0097
        L_0x0096:
            r2 = r3
        L_0x0097:
            if (r2 != 0) goto L_0x009b
            java.lang.Object r2 = r6.zzj     // Catch:{ all -> 0x00d5 }
        L_0x009b:
            com.google.android.gms.internal.measurement.zzif r1 = r1.zzb()     // Catch:{ all -> 0x00d5 }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.internal.measurement.zzid r1 = (com.google.android.gms.internal.measurement.zzid) r1     // Catch:{ all -> 0x00d5 }
            boolean r4 = r1.zzb()     // Catch:{ all -> 0x00d5 }
            if (r4 == 0) goto L_0x00c8
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.internal.measurement.zzhg r1 = (com.google.android.gms.internal.measurement.zzhg) r1     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.internal.measurement.zzhv r2 = r6.zza     // Catch:{ all -> 0x00d5 }
            android.net.Uri r4 = r2.zzb     // Catch:{ all -> 0x00d5 }
            java.lang.String r5 = r2.zza     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = r2.zzd     // Catch:{ all -> 0x00d5 }
            java.lang.String r5 = r6.zzb     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = r1.zza(r4, r3, r2, r5)     // Catch:{ all -> 0x00d5 }
            if (r1 != 0) goto L_0x00c4
            java.lang.Object r2 = r6.zzj     // Catch:{ all -> 0x00d5 }
            goto L_0x00c8
        L_0x00c4:
            java.lang.Object r2 = r6.zza(r1)     // Catch:{ all -> 0x00d5 }
        L_0x00c8:
            r6.zzl = r2     // Catch:{ all -> 0x00d5 }
            r6.zzk = r0     // Catch:{ all -> 0x00d5 }
            goto L_0x00d3
        L_0x00cd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d5 }
            r0.<init>(r2)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d3:
            monitor-exit(r6)     // Catch:{ all -> 0x00d5 }
            goto L_0x00d8
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d5 }
            throw r0
        L_0x00d8:
            java.lang.Object r0 = r6.zzl
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhy.zzb():java.lang.Object");
    }

    public final String zzc() {
        String str = this.zza.zzd;
        return this.zzb;
    }
}
