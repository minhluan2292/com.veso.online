package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final class zzgl extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzgl zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        zzgl zzgl = new zzgl();
        zza = zzgl;
        zzkc.zzbM(zzgl.class, zzgl);
    }

    private zzgl() {
    }

    public static zzgk zzd() {
        return (zzgk) zza.zzbA();
    }

    static /* synthetic */ void zzh(zzgl zzgl, long j) {
        zzgl.zze |= 1;
        zzgl.zzf = j;
    }

    static /* synthetic */ void zzi(zzgl zzgl, String str) {
        str.getClass();
        zzgl.zze |= 2;
        zzgl.zzg = str;
    }

    static /* synthetic */ void zzj(zzgl zzgl, String str) {
        str.getClass();
        zzgl.zze |= 4;
        zzgl.zzh = str;
    }

    static /* synthetic */ void zzk(zzgl zzgl) {
        zzgl.zze &= -5;
        zzgl.zzh = zza.zzh;
    }

    static /* synthetic */ void zzm(zzgl zzgl, long j) {
        zzgl.zze |= 8;
        zzgl.zzi = j;
    }

    static /* synthetic */ void zzn(zzgl zzgl) {
        zzgl.zze &= -9;
        zzgl.zzi = 0;
    }

    static /* synthetic */ void zzo(zzgl zzgl, double d) {
        zzgl.zze |= 32;
        zzgl.zzk = d;
    }

    static /* synthetic */ void zzp(zzgl zzgl) {
        zzgl.zze &= -33;
        zzgl.zzk = 0.0d;
    }

    public final double zza() {
        return this.zzk;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final String zzg() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbL(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new zzgl();
        } else {
            if (i2 == 4) {
                return new zzgk((zzfj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final boolean zzq() {
        return (this.zze & 32) != 0;
    }

    public final boolean zzr() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzs() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }
}
