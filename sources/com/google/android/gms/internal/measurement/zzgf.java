package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final class zzgf extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzgf zza;
    private int zze;
    private int zzf = 1;
    private zzkj zzg = zzbG();

    static {
        zzgf zzgf = new zzgf();
        zza = zzgf;
        zzkc.zzbM(zzgf.class, zzgf);
    }

    private zzgf() {
    }

    public static zzgd zza() {
        return (zzgd) zza.zzbA();
    }

    static /* synthetic */ void zzc(zzgf zzgf, zzfu zzfu) {
        zzfu.getClass();
        zzkj zzkj = zzgf.zzg;
        if (!zzkj.zzc()) {
            zzgf.zzg = zzkc.zzbH(zzkj);
        }
        zzgf.zzg.add(zzfu);
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzge.zza, "zzg", zzfu.class});
        } else if (i2 == 3) {
            return new zzgf();
        } else {
            if (i2 == 4) {
                return new zzgd((zzfj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
