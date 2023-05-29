package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzawn {
    private static final int[] zza = {zzbar.zzg("isom"), zzbar.zzg("iso2"), zzbar.zzg("iso3"), zzbar.zzg("iso4"), zzbar.zzg("iso5"), zzbar.zzg("iso6"), zzbar.zzg("avc1"), zzbar.zzg("hvc1"), zzbar.zzg("hev1"), zzbar.zzg("mp41"), zzbar.zzg("mp42"), zzbar.zzg("3g2a"), zzbar.zzg("3g2b"), zzbar.zzg("3gr6"), zzbar.zzg("3gs6"), zzbar.zzg("3ge6"), zzbar.zzg("3gg6"), zzbar.zzg("M4V "), zzbar.zzg("M4A "), zzbar.zzg("f4v "), zzbar.zzg("kddi"), zzbar.zzg("M4VP"), zzbar.zzg("qt  "), zzbar.zzg("MSNV")};

    public static boolean zza(zzauy zzauy) throws IOException, InterruptedException {
        return zzc(zzauy, true);
    }

    public static boolean zzb(zzauy zzauy) throws IOException, InterruptedException {
        return zzc(zzauy, false);
    }

    private static boolean zzc(zzauy zzauy, boolean z) throws IOException, InterruptedException {
        boolean z2;
        zzauy zzauy2 = zzauy;
        long zzc = zzauy.zzc();
        if (zzc == -1 || zzc > 4096) {
            zzc = 4096;
        }
        int i = (int) zzc;
        zzbak zzbak = new zzbak(64);
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            zzbak.zzs(8);
            zzauy.zzg(zzbak.zza, 0, 8, false);
            long zzm = zzbak.zzm();
            int zze = zzbak.zze();
            int i3 = 16;
            if (zzm == 1) {
                zzauy.zzg(zzbak.zza, 8, 8, false);
                zzbak.zzu(16);
                zzm = zzbak.zzn();
            } else {
                i3 = 8;
            }
            long j = (long) i3;
            if (zzm < j) {
                return false;
            }
            i2 += i3;
            if (zze != zzavw.zzE) {
                if (zze == zzavw.zzN || zze == zzavw.zzP) {
                    z2 = true;
                } else if ((((long) i2) + zzm) - j >= ((long) i)) {
                    break;
                } else {
                    int i4 = (int) (zzm - j);
                    i2 += i4;
                    if (zze == zzavw.zzd) {
                        if (i4 < 8) {
                            return false;
                        }
                        zzbak.zzs(i4);
                        zzauy.zzg(zzbak.zza, 0, i4, false);
                        int i5 = i4 >> 2;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            if (i6 == 1) {
                                zzbak.zzw(4);
                            } else {
                                int zze2 = zzbak.zze();
                                if ((zze2 >>> 8) == zzbar.zzg("3gp")) {
                                    break;
                                }
                                int[] iArr = zza;
                                int length = iArr.length;
                                for (int i7 = 0; i7 < 24; i7++) {
                                    if (iArr[i7] == zze2) {
                                        break;
                                    }
                                }
                                continue;
                            }
                            i6++;
                        }
                        z3 = true;
                        if (!z3) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        zzauy.zzf(i4, false);
                    }
                }
            }
        }
        z2 = false;
        if (!z3 || z != z2) {
            return false;
        }
        return true;
    }
}
