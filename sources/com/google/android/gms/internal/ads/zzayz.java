package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzayz extends zzazd {
    private final AtomicReference zza;

    public zzayz() {
        this((zzaze) null);
    }

    protected static boolean zza(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    private static int zzh(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: protected */
    public final zzayx[] zzb(zzatc[] zzatcArr, zzayt[] zzaytArr, int[][][] iArr) throws zzasi {
        boolean z;
        zzaza zzaza;
        zzaza zzaza2;
        int[] iArr2;
        ArrayList arrayList;
        zzays zzays;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3 = 2;
        zzayx[] zzayxArr = new zzayx[2];
        zzayy zzayy = (zzayy) this.zza.get();
        int i4 = 0;
        boolean z4 = false;
        while (true) {
            int i5 = -1;
            int i6 = 1;
            if (i4 >= i3) {
                break;
            }
            if (zzatcArr[i4].zzc() == i3) {
                if (!z4) {
                    zzatc zzatc = zzatcArr[i4];
                    zzayt zzayt = zzaytArr[i4];
                    int[][] iArr3 = iArr[i4];
                    int i7 = zzayy.zzd;
                    int i8 = zzayy.zze;
                    int i9 = zzayy.zzf;
                    boolean z5 = zzayy.zzc;
                    boolean z6 = zzayy.zzb;
                    int i10 = zzayy.zzi;
                    int i11 = zzayy.zzj;
                    boolean z7 = zzayy.zzk;
                    boolean z8 = zzayy.zzg;
                    boolean z9 = zzayy.zzh;
                    int i12 = -1;
                    int i13 = 0;
                    zzays zzays2 = null;
                    int i14 = 0;
                    int i15 = 0;
                    while (i13 < zzayt.zzb) {
                        zzays zzb = zzayt.zzb(i13);
                        int i16 = zzb.zza;
                        ArrayList arrayList2 = new ArrayList(i6);
                        int i17 = 0;
                        while (true) {
                            int i18 = zzb.zza;
                            if (i17 > 0) {
                                break;
                            }
                            arrayList2.add(Integer.valueOf(i17));
                            i17++;
                        }
                        int[] iArr4 = iArr3[i13];
                        int i19 = 0;
                        while (true) {
                            int i20 = zzb.zza;
                            if (i19 > 0) {
                                break;
                            }
                            zzayt zzayt2 = zzayt;
                            if (zza(iArr4[i19], true)) {
                                zzasw zzb2 = zzb.zzb(i19);
                                if (arrayList2.contains(Integer.valueOf(i19))) {
                                    int i21 = zzb2.zzj;
                                    int i22 = zzb2.zzk;
                                    int i23 = zzb2.zzb;
                                    zzays = zzb;
                                    z3 = true;
                                    z2 = true;
                                } else {
                                    zzays = zzb;
                                    z3 = true;
                                    z2 = false;
                                }
                                if (z3 != z2) {
                                    arrayList = arrayList2;
                                    i = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i = 2;
                                }
                                iArr2 = iArr4;
                                boolean zza2 = zza(iArr4[i19], false);
                                if (zza2) {
                                    i += 1000;
                                }
                                boolean z10 = i > i15;
                                if (i == i15) {
                                    if (zzb2.zza() != i12) {
                                        i2 = zzh(zzb2.zza(), i12);
                                    } else {
                                        i2 = zzh(zzb2.zzb, i5);
                                    }
                                    z10 = !zza2 || !z2 ? i2 < 0 : i2 > 0;
                                }
                                if (z10) {
                                    i5 = zzb2.zzb;
                                    i12 = zzb2.zza();
                                    i15 = i;
                                    i14 = i19;
                                    zzays2 = zzays;
                                }
                            } else {
                                zzays = zzb;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i19++;
                            zzayt = zzayt2;
                            zzb = zzays;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        zzayt zzayt3 = zzayt;
                        i13++;
                        i6 = 1;
                    }
                    if (zzays2 == null) {
                        zzaza2 = null;
                    } else {
                        zzaza2 = new zzaza(zzays2, i14, 0, (Object) null);
                    }
                    zzayxArr[i4] = zzaza2;
                    z4 = zzaza2 != null;
                }
                int i24 = zzaytArr[i4].zzb;
            }
            i4++;
            i3 = 2;
        }
        int i25 = 0;
        boolean z11 = false;
        while (i25 < i3) {
            if (zzatcArr[i25].zzc() == 1 && !z11) {
                zzayt zzayt4 = zzaytArr[i25];
                int[][] iArr5 = iArr[i25];
                String str = zzayy.zza;
                boolean z12 = zzayy.zzh;
                boolean z13 = zzayy.zzb;
                int i26 = -1;
                int i27 = -1;
                int i28 = 0;
                int i29 = 0;
                while (i28 < zzayt4.zzb) {
                    zzays zzb3 = zzayt4.zzb(i28);
                    int[] iArr6 = iArr5[i28];
                    int i30 = i27;
                    int i31 = i26;
                    int i32 = i29;
                    int i33 = 0;
                    while (true) {
                        int i34 = zzb3.zza;
                        if (i33 > 0) {
                            break;
                        }
                        if (zza(iArr6[i33], true)) {
                            zzasw zzb4 = zzb3.zzb(i33);
                            int i35 = iArr6[i33];
                            int i36 = 1 != (zzb4.zzx & 1) ? 1 : 2;
                            if (zza(i35, false)) {
                                i36 += 1000;
                            }
                            if (i36 > i32) {
                                i31 = i28;
                                i30 = i33;
                                i32 = i36;
                            }
                        }
                        i33++;
                    }
                    i28++;
                    i29 = i32;
                    i26 = i31;
                    i27 = i30;
                }
                if (i26 == -1) {
                    zzaza = null;
                    z = false;
                } else {
                    z = false;
                    zzaza = new zzaza(zzayt4.zzb(i26), i27, 0, (Object) null);
                }
                zzayxArr[i25] = zzaza;
                z11 = zzaza != null ? true : z;
            }
            i25++;
            i3 = 2;
        }
        return zzayxArr;
    }

    public zzayz(zzaze zzaze) {
        this.zza = new AtomicReference(new zzayy());
    }
}
