package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final class zzfm extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzfm zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        zzfm zzfm = new zzfm();
        zza = zzfm;
        zzkc.zzbM(zzfm.class, zzfm);
    }

    private zzfm() {
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbL(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new zzfm();
        } else {
            if (i2 == 4) {
                return new zzfl((zzfj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
