package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final class zzfo extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzfo zza;
    private int zze;
    private int zzf;
    private zzgh zzg;
    private zzgh zzh;
    private boolean zzi;

    static {
        zzfo zzfo = new zzfo();
        zza = zzfo;
        zzkc.zzbM(zzfo.class, zzfo);
    }

    private zzfo() {
    }

    public static zzfn zzb() {
        return (zzfn) zza.zzbA();
    }

    static /* synthetic */ void zzf(zzfo zzfo, int i) {
        zzfo.zze |= 1;
        zzfo.zzf = i;
    }

    static /* synthetic */ void zzg(zzfo zzfo, zzgh zzgh) {
        zzgh.getClass();
        zzfo.zzg = zzgh;
        zzfo.zze |= 2;
    }

    static /* synthetic */ void zzh(zzfo zzfo, zzgh zzgh) {
        zzfo.zzh = zzgh;
        zzfo.zze |= 4;
    }

    static /* synthetic */ void zzi(zzfo zzfo, boolean z) {
        zzfo.zze |= 8;
        zzfo.zzi = z;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgh zzd() {
        zzgh zzgh = this.zzg;
        return zzgh == null ? zzgh.zzh() : zzgh;
    }

    public final zzgh zze() {
        zzgh zzgh = this.zzh;
        return zzgh == null ? zzgh.zzh() : zzgh;
    }

    public final boolean zzj() {
        return this.zzi;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbL(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzfo();
        } else {
            if (i2 == 4) {
                return new zzfn((zzfj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final boolean zzm() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zze & 4) != 0;
    }
}
