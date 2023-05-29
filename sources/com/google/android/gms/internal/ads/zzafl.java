package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzafl implements zzzi {
    public static final zzzp zza = zzafh.zza;
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzaf zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzzl zzD;
    private zzaap[] zzE;
    private zzaap[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzef zzf;
    private final zzef zzg;
    private final zzef zzh;
    private final byte[] zzi;
    private final zzef zzj;
    private final zzacg zzk;
    private final zzef zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzef zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzafk zzy;
    private int zzz;

    static {
        zzad zzad = new zzad();
        zzad.zzS("application/x-emsg");
        zzc = zzad.zzY();
    }

    public zzafl() {
        this(0, (zzel) null);
    }

    private static int zze(int i) throws zzbu {
        if (i >= 0) {
            return i;
        }
        throw zzbu.zza("Unexpected negative value: " + i, (Throwable) null);
    }

    private static zzx zzf(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzaew zzaew = (zzaew) list.get(i);
            if (zzaew.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzH = zzaew.zza.zzH();
                UUID zza2 = zzafs.zza(zzH);
                if (zza2 == null) {
                    zzdw.zze("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzw(zza2, (String) null, "video/mp4", zzH));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzx((List) arrayList);
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzef zzef, int i, zzafx zzafx) throws zzbu {
        zzef.zzF(i + 8);
        int zze2 = zzef.zze() & ViewCompat.MEASURED_SIZE_MASK;
        if ((zze2 & 1) == 0) {
            boolean z = (zze2 & 2) != 0;
            int zzn2 = zzef.zzn();
            if (zzn2 == 0) {
                Arrays.fill(zzafx.zzl, 0, zzafx.zze, false);
                return;
            }
            int i2 = zzafx.zze;
            if (zzn2 == i2) {
                Arrays.fill(zzafx.zzl, 0, zzn2, z);
                zzafx.zza(zzef.zza());
                zzef zzef2 = zzafx.zzn;
                zzef.zzB(zzef2.zzH(), 0, zzef2.zzd());
                zzafx.zzn.zzF(0);
                zzafx.zzo = false;
                return;
            }
            throw zzbu.zza("Senc sample count " + zzn2 + " is different from fragment sample count" + i2, (Throwable) null);
        }
        throw zzbu.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private final void zzi(long j) throws zzbu {
        zzafl zzafl;
        int i;
        zzaev zzaev;
        int i2;
        SparseArray sparseArray;
        byte[] bArr;
        int i3;
        int i4;
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        boolean z;
        zzafx zzafx;
        zzaev zzaev2;
        int i6;
        int i7;
        byte[] bArr4;
        zzaev zzaev3;
        int i8;
        int i9;
        List list;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j2;
        zzafg zzafg;
        int i20;
        int i21;
        int i22;
        int i23;
        zzafl zzafl2 = this;
        while (!zzafl2.zzm.isEmpty() && ((zzaev) zzafl2.zzm.peek()).zza == j) {
            zzaev zzaev4 = (zzaev) zzafl2.zzm.pop();
            int i24 = zzaev4.zzd;
            int i25 = 12;
            int i26 = 8;
            if (i24 == 1836019574) {
                zzx zzf2 = zzf(zzaev4.zzb);
                zzaev zza2 = zzaev4.zza(1836475768);
                Objects.requireNonNull(zza2);
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j3 = -9223372036854775807L;
                int i27 = 0;
                while (i27 < size) {
                    zzaew zzaew = (zzaew) zza2.zzb.get(i27);
                    int i28 = zzaew.zzd;
                    if (i28 == 1953654136) {
                        zzef zzef = zzaew.zza;
                        zzef.zzF(i25);
                        Pair create = Pair.create(Integer.valueOf(zzef.zze()), new zzafg(zzef.zze() - 1, zzef.zze(), zzef.zze(), zzef.zze()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzafg) create.second);
                    } else if (i28 == 1835362404) {
                        zzef zzef2 = zzaew.zza;
                        zzef2.zzF(8);
                        j3 = zzaex.zze(zzef2.zze()) == 0 ? zzef2.zzs() : zzef2.zzt();
                    }
                    i27++;
                    i25 = 12;
                }
                List zzc2 = zzaff.zzc(zzaev4, new zzzx(), j3, zzf2, false, false, new zzafi(zzafl2));
                int size2 = zzc2.size();
                if (zzafl2.zze.size() == 0) {
                    for (int i29 = 0; i29 < size2; i29++) {
                        zzafy zzafy = (zzafy) zzc2.get(i29);
                        zzafv zzafv = zzafy.zza;
                        zzafl2.zze.put(zzafv.zza, new zzafk(zzafl2.zzD.zzv(i29, zzafv.zzb), zzafy, zzj(sparseArray2, zzafv.zza)));
                        zzafl2.zzw = Math.max(zzafl2.zzw, zzafv.zze);
                    }
                    zzafl2.zzD.zzC();
                } else {
                    zzdd.zzf(zzafl2.zze.size() == size2);
                    for (int i30 = 0; i30 < size2; i30++) {
                        zzafy zzafy2 = (zzafy) zzc2.get(i30);
                        zzafv zzafv2 = zzafy2.zza;
                        ((zzafk) zzafl2.zze.get(zzafv2.zza)).zzh(zzafy2, zzj(sparseArray2, zzafv2.zza));
                    }
                }
            } else {
                if (i24 == 1836019558) {
                    SparseArray sparseArray3 = zzafl2.zze;
                    byte[] bArr5 = zzafl2.zzi;
                    int size3 = zzaev4.zzc.size();
                    int i31 = 0;
                    while (i31 < size3) {
                        zzaev zzaev5 = (zzaev) zzaev4.zzc.get(i31);
                        if (zzaev5.zzd == 1953653094) {
                            zzaew zzb2 = zzaev5.zzb(1952868452);
                            Objects.requireNonNull(zzb2);
                            zzef zzef3 = zzb2.zza;
                            zzef3.zzF(i26);
                            int zze2 = zzef3.zze() & ViewCompat.MEASURED_SIZE_MASK;
                            zzafk zzafk = (zzafk) sparseArray3.get(zzef3.zze());
                            if (zzafk == null) {
                                zzafk = null;
                            } else {
                                if ((zze2 & 1) != 0) {
                                    long zzt2 = zzef3.zzt();
                                    zzafx zzafx2 = zzafk.zzb;
                                    zzafx2.zzb = zzt2;
                                    zzafx2.zzc = zzt2;
                                }
                                zzafg zzafg2 = zzafk.zze;
                                if ((zze2 & 2) != 0) {
                                    i20 = zzef3.zze() - 1;
                                } else {
                                    i20 = zzafg2.zza;
                                }
                                if ((zze2 & 8) != 0) {
                                    i21 = zzef3.zze();
                                } else {
                                    i21 = zzafg2.zzb;
                                }
                                if ((zze2 & 16) != 0) {
                                    i22 = zzef3.zze();
                                } else {
                                    i22 = zzafg2.zzc;
                                }
                                if ((zze2 & 32) != 0) {
                                    i23 = zzef3.zze();
                                } else {
                                    i23 = zzafg2.zzd;
                                }
                                zzafk.zzb.zza = new zzafg(i20, i21, i22, i23);
                            }
                            if (zzafk != null) {
                                zzafx zzafx3 = zzafk.zzb;
                                long j4 = zzafx3.zzp;
                                boolean z2 = zzafx3.zzq;
                                zzafk.zzi();
                                zzafk.zzl = true;
                                zzaew zzb3 = zzaev5.zzb(1952867444);
                                if (zzb3 != null) {
                                    zzef zzef4 = zzb3.zza;
                                    zzef4.zzF(i26);
                                    zzafx3.zzp = zzaex.zze(zzef4.zze()) == 1 ? zzef4.zzt() : zzef4.zzs();
                                    zzafx3.zzq = true;
                                } else {
                                    zzafx3.zzp = j4;
                                    zzafx3.zzq = z2;
                                }
                                List list2 = zzaev5.zzb;
                                int size4 = list2.size();
                                int i32 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i32 >= size4) {
                                        break;
                                    }
                                    zzaew zzaew2 = (zzaew) list2.get(i32);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzaew2.zzd == 1953658222) {
                                        zzef zzef5 = zzaew2.zza;
                                        zzef5.zzF(12);
                                        int zzn2 = zzef5.zzn();
                                        if (zzn2 > 0) {
                                            i34 += zzn2;
                                            i33++;
                                        }
                                    }
                                    i32++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzafk.zzh = 0;
                                zzafk.zzg = 0;
                                zzafk.zzf = 0;
                                zzafx zzafx4 = zzafk.zzb;
                                zzafx4.zzd = i33;
                                zzafx4.zze = i34;
                                if (zzafx4.zzg.length < i33) {
                                    zzafx4.zzf = new long[i33];
                                    zzafx4.zzg = new int[i33];
                                }
                                if (zzafx4.zzh.length < i34) {
                                    int i35 = (i34 * 125) / 100;
                                    zzafx4.zzh = new int[i35];
                                    zzafx4.zzi = new long[i35];
                                    zzafx4.zzj = new boolean[i35];
                                    zzafx4.zzl = new boolean[i35];
                                }
                                int i36 = 0;
                                int i37 = 0;
                                int i38 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i36 >= size4) {
                                        break;
                                    }
                                    zzaew zzaew3 = (zzaew) list2.get(i36);
                                    if (zzaew3.zzd == i4) {
                                        zzef zzef6 = zzaew3.zza;
                                        zzef6.zzF(8);
                                        int zze3 = zzef6.zze() & ViewCompat.MEASURED_SIZE_MASK;
                                        list = list2;
                                        zzafv zzafv3 = zzafk.zzd.zza;
                                        i9 = size3;
                                        zzafx zzafx5 = zzafk.zzb;
                                        i8 = size4;
                                        zzafg zzafg3 = zzafx5.zza;
                                        int i39 = zzen.zza;
                                        int i40 = i38 + 1;
                                        zzafx5.zzg[i38] = zzef6.zzn();
                                        long[] jArr = zzafx5.zzf;
                                        zzaev3 = zzaev4;
                                        bArr4 = bArr5;
                                        long j6 = zzafx5.zzb;
                                        jArr[i38] = j6;
                                        if ((zze3 & 1) != 0) {
                                            i7 = i36;
                                            jArr[i38] = j6 + ((long) zzef6.zze());
                                        } else {
                                            i7 = i36;
                                        }
                                        int i41 = zze3 & 4;
                                        int i42 = zzafg3.zzd;
                                        if (i41 != 0) {
                                            i42 = zzef6.zze();
                                        }
                                        int i43 = zze3 & 256;
                                        int i44 = zze3 & 512;
                                        int i45 = zze3 & 1024;
                                        int i46 = zze3 & 2048;
                                        int i47 = i42;
                                        long[] jArr2 = zzafv3.zzh;
                                        if (jArr2 != null) {
                                            i6 = i31;
                                            zzaev2 = zzaev5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j5 = ((long[]) zzen.zzH(zzafv3.zzi))[0];
                                            }
                                        } else {
                                            i6 = i31;
                                            zzaev2 = zzaev5;
                                        }
                                        int[] iArr = zzafx5.zzh;
                                        long[] jArr3 = zzafx5.zzi;
                                        boolean[] zArr = zzafx5.zzj;
                                        zzafx = zzafx3;
                                        int i48 = zzafx5.zzg[i38] + i37;
                                        boolean[] zArr2 = zArr;
                                        long j7 = zzafv3.zzc;
                                        int i49 = i37;
                                        long[] jArr4 = jArr3;
                                        long j8 = zzafx5.zzp;
                                        while (i49 < i48) {
                                            if (i43 != 0) {
                                                i10 = i43;
                                                i11 = zzef6.zze();
                                            } else {
                                                i10 = i43;
                                                i11 = zzafg3.zzb;
                                            }
                                            zze(i11);
                                            if (i44 != 0) {
                                                i12 = i44;
                                                i13 = zzef6.zze();
                                            } else {
                                                i12 = i44;
                                                i13 = zzafg3.zzc;
                                            }
                                            zze(i13);
                                            if (i45 != 0) {
                                                i14 = i41;
                                                i15 = zzef6.zze();
                                            } else {
                                                i14 = i41;
                                                if (i49 == 0) {
                                                    if (i41 != 0) {
                                                        i15 = i47;
                                                        i49 = 0;
                                                    } else {
                                                        i49 = 0;
                                                    }
                                                }
                                                i15 = zzafg3.zzd;
                                            }
                                            if (i46 != 0) {
                                                i18 = i48;
                                                i17 = i45;
                                                i16 = i46;
                                                i19 = zzef6.zze();
                                            } else {
                                                i18 = i48;
                                                i17 = i45;
                                                i16 = i46;
                                                i19 = 0;
                                            }
                                            long zzw2 = zzen.zzw((((long) i19) + j8) - j5, 1000000, j7);
                                            jArr4[i49] = zzw2;
                                            if (!zzafx5.zzq) {
                                                zzafg = zzafg3;
                                                j2 = j7;
                                                jArr4[i49] = zzw2 + zzafk.zzd.zzh;
                                            } else {
                                                zzafg = zzafg3;
                                                j2 = j7;
                                            }
                                            iArr[i49] = i13;
                                            zArr2[i49] = 1 == (((i15 >> 16) & 1) ^ 1);
                                            j8 += (long) i11;
                                            i49++;
                                            zzafg3 = zzafg;
                                            j7 = j2;
                                            i43 = i10;
                                            i44 = i12;
                                            i41 = i14;
                                            i48 = i18;
                                            i45 = i17;
                                            i46 = i16;
                                        }
                                        zzafx5.zzp = j8;
                                        i38 = i40;
                                        i37 = i48;
                                    } else {
                                        i7 = i36;
                                        zzaev3 = zzaev4;
                                        bArr4 = bArr5;
                                        zzafx = zzafx3;
                                        list = list2;
                                        i9 = size3;
                                        int i50 = i37;
                                        i6 = i31;
                                        i8 = size4;
                                        zzaev2 = zzaev5;
                                    }
                                    i36 = i7 + 1;
                                    list2 = list;
                                    size3 = i9;
                                    size4 = i8;
                                    zzaev4 = zzaev3;
                                    bArr5 = bArr4;
                                    i31 = i6;
                                    zzaev5 = zzaev2;
                                    zzafx3 = zzafx;
                                    i4 = 1953658222;
                                }
                                zzaev = zzaev4;
                                byte[] bArr6 = bArr5;
                                i2 = size3;
                                i = i31;
                                zzafv zzafv4 = zzafk.zzd.zza;
                                zzafx zzafx6 = zzafx3;
                                zzafg zzafg4 = zzafx6.zza;
                                Objects.requireNonNull(zzafg4);
                                zzafw zza3 = zzafv4.zza(zzafg4.zza);
                                zzaev zzaev6 = zzaev5;
                                zzaew zzb4 = zzaev6.zzb(1935763834);
                                if (zzb4 != null) {
                                    Objects.requireNonNull(zza3);
                                    zzef zzef7 = zzb4.zza;
                                    int i51 = zza3.zzd;
                                    zzef7.zzF(8);
                                    if ((zzef7.zze() & 1) == 1) {
                                        zzef7.zzG(8);
                                    }
                                    int zzk2 = zzef7.zzk();
                                    int zzn3 = zzef7.zzn();
                                    int i52 = zzafx6.zze;
                                    if (zzn3 <= i52) {
                                        if (zzk2 == 0) {
                                            boolean[] zArr3 = zzafx6.zzl;
                                            i5 = 0;
                                            for (int i53 = 0; i53 < zzn3; i53++) {
                                                int zzk3 = zzef7.zzk();
                                                i5 += zzk3;
                                                zArr3[i53] = zzk3 > i51;
                                            }
                                            z = false;
                                        } else {
                                            boolean z3 = zzk2 > i51;
                                            i5 = zzk2 * zzn3;
                                            z = false;
                                            Arrays.fill(zzafx6.zzl, 0, zzn3, z3);
                                        }
                                        Arrays.fill(zzafx6.zzl, zzn3, zzafx6.zze, z);
                                        if (i5 > 0) {
                                            zzafx6.zza(i5);
                                        }
                                    } else {
                                        throw zzbu.zza("Saiz sample count " + zzn3 + " is greater than fragment sample count" + i52, (Throwable) null);
                                    }
                                }
                                zzaew zzb5 = zzaev6.zzb(1935763823);
                                if (zzb5 != null) {
                                    zzef zzef8 = zzb5.zza;
                                    zzef8.zzF(8);
                                    int zze4 = zzef8.zze();
                                    if ((zze4 & 1) == 1) {
                                        zzef8.zzG(8);
                                    }
                                    int zzn4 = zzef8.zzn();
                                    if (zzn4 == 1) {
                                        zzafx6.zzc += zzaex.zze(zze4) == 0 ? zzef8.zzs() : zzef8.zzt();
                                    } else {
                                        throw zzbu.zza("Unexpected saio entry count: " + zzn4, (Throwable) null);
                                    }
                                }
                                zzaew zzb6 = zzaev6.zzb(1936027235);
                                if (zzb6 != null) {
                                    zzh(zzb6.zza, 0, zzafx6);
                                }
                                String str = zza3 != null ? zza3.zzb : null;
                                zzef zzef9 = null;
                                zzef zzef10 = null;
                                for (int i54 = 0; i54 < zzaev6.zzb.size(); i54++) {
                                    zzaew zzaew4 = (zzaew) zzaev6.zzb.get(i54);
                                    zzef zzef11 = zzaew4.zza;
                                    int i55 = zzaew4.zzd;
                                    if (i55 == 1935828848) {
                                        zzef11.zzF(12);
                                        if (zzef11.zze() == 1936025959) {
                                            zzef9 = zzef11;
                                        }
                                    } else if (i55 == 1936158820) {
                                        zzef11.zzF(12);
                                        if (zzef11.zze() == 1936025959) {
                                            zzef10 = zzef11;
                                        }
                                    }
                                }
                                if (zzef9 != null && zzef10 != null) {
                                    zzef9.zzF(8);
                                    int zze5 = zzef9.zze();
                                    zzef9.zzG(4);
                                    if (zzaex.zze(zze5) == 1) {
                                        zzef9.zzG(4);
                                    }
                                    if (zzef9.zze() == 1) {
                                        zzef10.zzF(8);
                                        int zze6 = zzaex.zze(zzef10.zze());
                                        zzef10.zzG(4);
                                        if (zze6 == 1) {
                                            if (zzef10.zzs() == 0) {
                                                throw zzbu.zzc("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (zze6 >= 2) {
                                            zzef10.zzG(4);
                                        }
                                        if (zzef10.zzs() == 1) {
                                            zzef10.zzG(1);
                                            int zzk4 = zzef10.zzk();
                                            int i56 = (zzk4 & 240) >> 4;
                                            int i57 = zzk4 & 15;
                                            if (zzef10.zzk() == 1) {
                                                int zzk5 = zzef10.zzk();
                                                byte[] bArr7 = new byte[16];
                                                zzef10.zzB(bArr7, 0, 16);
                                                if (zzk5 == 0) {
                                                    int zzk6 = zzef10.zzk();
                                                    byte[] bArr8 = new byte[zzk6];
                                                    zzef10.zzB(bArr8, 0, zzk6);
                                                    bArr3 = bArr8;
                                                } else {
                                                    bArr3 = null;
                                                }
                                                zzafx6.zzk = true;
                                                zzafx6.zzm = new zzafw(true, str, zzk5, bArr7, i56, i57, bArr3);
                                            }
                                        } else {
                                            throw zzbu.zzc("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw zzbu.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = zzaev6.zzb.size();
                                int i58 = 0;
                                while (i58 < size5) {
                                    zzaew zzaew5 = (zzaew) zzaev6.zzb.get(i58);
                                    if (zzaew5.zzd == 1970628964) {
                                        zzef zzef12 = zzaew5.zza;
                                        zzef12.zzF(8);
                                        bArr2 = bArr6;
                                        zzef12.zzB(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzef12, 16, zzafx6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i58++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                i3 = 8;
                                i26 = i3;
                                bArr5 = bArr;
                                size3 = i2;
                                zzaev4 = zzaev;
                                i31 = i + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzaev = zzaev4;
                        i2 = size3;
                        i3 = i26;
                        i = i31;
                        bArr = bArr5;
                        i26 = i3;
                        bArr5 = bArr;
                        size3 = i2;
                        zzaev4 = zzaev;
                        i31 = i + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzx zzf3 = zzf(zzaev4.zzb);
                    zzafl = this;
                    if (zzf3 != null) {
                        int size6 = zzafl.zze.size();
                        for (int i59 = 0; i59 < size6; i59++) {
                            zzafk zzafk2 = (zzafk) zzafl.zze.valueAt(i59);
                            zzafv zzafv5 = zzafk2.zzd.zza;
                            zzafg zzafg5 = zzafk2.zzb.zza;
                            int i60 = zzen.zza;
                            zzafw zza4 = zzafv5.zza(zzafg5.zza);
                            zzx zzb7 = zzf3.zzb(zza4 != null ? zza4.zzb : null);
                            zzad zzb8 = zzafk2.zzd.zza.zzf.zzb();
                            zzb8.zzB(zzb7);
                            zzafk2.zza.zzk(zzb8.zzY());
                        }
                    }
                    if (zzafl.zzv != -9223372036854775807L) {
                        int size7 = zzafl.zze.size();
                        for (int i61 = 0; i61 < size7; i61++) {
                            zzafk zzafk3 = (zzafk) zzafl.zze.valueAt(i61);
                            long j9 = zzafl.zzv;
                            int i62 = zzafk3.zzf;
                            while (true) {
                                zzafx zzafx7 = zzafk3.zzb;
                                if (i62 >= zzafx7.zze || zzafx7.zzi[i62] >= j9) {
                                } else {
                                    if (zzafx7.zzj[i62]) {
                                        zzafk3.zzi = i62;
                                    }
                                    i62++;
                                }
                            }
                        }
                        zzafl.zzv = -9223372036854775807L;
                    }
                } else {
                    zzafl = zzafl2;
                    zzaev zzaev7 = zzaev4;
                    if (!zzafl.zzm.isEmpty()) {
                        ((zzaev) zzafl.zzm.peek()).zzc(zzaev7);
                    }
                }
                zzafl2 = zzafl;
            }
        }
        zzafl zzafl3 = zzafl2;
        zzg();
    }

    private static final zzafg zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzafg) sparseArray.valueAt(0);
        }
        zzafg zzafg = (zzafg) sparseArray.get(i);
        Objects.requireNonNull(zzafg);
        return zzafg;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.google.android.gms.internal.ads.zzafk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v72, resolved type: com.google.android.gms.internal.ads.zzafk} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzzj r34, com.google.android.gms.internal.ads.zzaai r35) throws java.io.IOException {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
        L_0x0004:
            int r2 = r0.zzo
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r5 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x0539
            java.lang.String r10 = "FragmentedMp4Extractor"
            if (r2 == r8) goto L_0x02f9
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 3
            if (r2 == r5) goto L_0x0299
            com.google.android.gms.internal.ads.zzafk r2 = r0.zzy
            if (r2 != 0) goto L_0x0099
            android.util.SparseArray r2 = r0.zze
            int r13 = r2.size()
            r14 = r3
            r3 = r7
            r4 = r9
        L_0x002b:
            if (r4 >= r13) goto L_0x0061
            java.lang.Object r16 = r2.valueAt(r4)
            r5 = r16
            com.google.android.gms.internal.ads.zzafk r5 = (com.google.android.gms.internal.ads.zzafk) r5
            boolean r16 = r5.zzl
            if (r16 != 0) goto L_0x0043
            int r11 = r5.zzf
            com.google.android.gms.internal.ads.zzafy r6 = r5.zzd
            int r6 = r6.zzb
            if (r11 == r6) goto L_0x005d
        L_0x0043:
            boolean r6 = r5.zzl
            if (r6 == 0) goto L_0x0052
            int r6 = r5.zzh
            com.google.android.gms.internal.ads.zzafx r11 = r5.zzb
            int r11 = r11.zzd
            if (r6 != r11) goto L_0x0052
            goto L_0x005d
        L_0x0052:
            long r18 = r5.zzd()
            int r6 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x005d
            r3 = r5
            r14 = r18
        L_0x005d:
            int r4 = r4 + 1
            r5 = 2
            goto L_0x002b
        L_0x0061:
            if (r3 != 0) goto L_0x007e
            long r2 = r0.zzt
            long r4 = r34.zzf()
            long r2 = r2 - r4
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0077
            r3 = r1
            com.google.android.gms.internal.ads.zzyy r3 = (com.google.android.gms.internal.ads.zzyy) r3
            r3.zzo(r2, r9)
            r33.zzg()
            goto L_0x0004
        L_0x0077:
            java.lang.String r1 = "Offset to end of mdat was negative."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r7)
            throw r1
        L_0x007e:
            long r4 = r3.zzd()
            long r13 = r34.zzf()
            long r4 = r4 - r13
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x0090
            java.lang.String r2 = "Ignoring negative offset to sample data."
            com.google.android.gms.internal.ads.zzdw.zze(r10, r2)
            r2 = r9
        L_0x0090:
            r4 = r1
            com.google.android.gms.internal.ads.zzyy r4 = (com.google.android.gms.internal.ads.zzyy) r4
            r4.zzo(r2, r9)
            r0.zzy = r3
            r2 = r3
        L_0x0099:
            int r3 = r0.zzo
            r4 = 6
            if (r3 != r12) goto L_0x0133
            int r3 = r2.zzb()
            r0.zzz = r3
            int r5 = r2.zzf
            int r6 = r2.zzi
            if (r5 >= r6) goto L_0x00e0
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.zzo(r3, r9)
            com.google.android.gms.internal.ads.zzafw r1 = r2.zzf()
            if (r1 != 0) goto L_0x00b6
            goto L_0x00d3
        L_0x00b6:
            com.google.android.gms.internal.ads.zzafx r3 = r2.zzb
            com.google.android.gms.internal.ads.zzef r3 = r3.zzn
            int r1 = r1.zzd
            if (r1 == 0) goto L_0x00c1
            r3.zzG(r1)
        L_0x00c1:
            com.google.android.gms.internal.ads.zzafx r1 = r2.zzb
            int r5 = r2.zzf
            boolean r1 = r1.zzb(r5)
            if (r1 == 0) goto L_0x00d3
            int r1 = r3.zzo()
            int r1 = r1 * r4
            r3.zzG(r1)
        L_0x00d3:
            boolean r1 = r2.zzk()
            if (r1 != 0) goto L_0x00db
            r0.zzy = r7
        L_0x00db:
            r0.zzo = r12
            r1 = r9
            goto L_0x0298
        L_0x00e0:
            com.google.android.gms.internal.ads.zzafy r5 = r2.zzd
            com.google.android.gms.internal.ads.zzafv r5 = r5.zza
            int r5 = r5.zzg
            if (r5 != r8) goto L_0x00f4
            int r3 = r3 + -8
            r0.zzz = r3
            r3 = r1
            com.google.android.gms.internal.ads.zzyy r3 = (com.google.android.gms.internal.ads.zzyy) r3
            r5 = 8
            r3.zzo(r5, r9)
        L_0x00f4:
            com.google.android.gms.internal.ads.zzafy r3 = r2.zzd
            com.google.android.gms.internal.ads.zzafv r3 = r3.zza
            com.google.android.gms.internal.ads.zzaf r3 = r3.zzf
            java.lang.String r3 = r3.zzm
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0121
            int r3 = r0.zzz
            r5 = 7
            int r3 = r2.zzc(r3, r5)
            r0.zzA = r3
            int r3 = r0.zzz
            com.google.android.gms.internal.ads.zzef r6 = r0.zzj
            com.google.android.gms.internal.ads.zzym.zzb(r3, r6)
            com.google.android.gms.internal.ads.zzaap r3 = r2.zza
            com.google.android.gms.internal.ads.zzef r6 = r0.zzj
            r3.zzq(r6, r5)
            int r3 = r0.zzA
            int r3 = r3 + r5
            r0.zzA = r3
            goto L_0x0129
        L_0x0121:
            int r3 = r0.zzz
            int r3 = r2.zzc(r3, r9)
            r0.zzA = r3
        L_0x0129:
            int r5 = r0.zzz
            int r5 = r5 + r3
            r0.zzz = r5
            r3 = 4
            r0.zzo = r3
            r0.zzB = r9
        L_0x0133:
            com.google.android.gms.internal.ads.zzafy r3 = r2.zzd
            com.google.android.gms.internal.ads.zzafv r3 = r3.zza
            com.google.android.gms.internal.ads.zzaap r5 = r2.zza
            long r10 = r2.zze()
            int r6 = r3.zzj
            if (r6 != 0) goto L_0x0152
        L_0x0141:
            int r3 = r0.zzA
            int r4 = r0.zzz
            if (r3 >= r4) goto L_0x0236
            int r4 = r4 - r3
            int r3 = r5.zze(r1, r4, r9)
            int r4 = r0.zzA
            int r4 = r4 + r3
            r0.zzA = r4
            goto L_0x0141
        L_0x0152:
            com.google.android.gms.internal.ads.zzef r13 = r0.zzg
            byte[] r13 = r13.zzH()
            r13[r9] = r9
            r13[r8] = r9
            r14 = 2
            r13[r14] = r9
            int r14 = r6 + 1
            r15 = 4
            int r6 = 4 - r6
        L_0x0164:
            int r15 = r0.zzA
            int r12 = r0.zzz
            if (r15 >= r12) goto L_0x0236
            int r12 = r0.zzB
            java.lang.String r15 = "video/hevc"
            if (r12 != 0) goto L_0x01d7
            r12 = r1
            com.google.android.gms.internal.ads.zzyy r12 = (com.google.android.gms.internal.ads.zzyy) r12
            r12.zzn(r13, r6, r14, r9)
            com.google.android.gms.internal.ads.zzef r12 = r0.zzg
            r12.zzF(r9)
            com.google.android.gms.internal.ads.zzef r12 = r0.zzg
            int r12 = r12.zze()
            if (r12 <= 0) goto L_0x01d0
            int r12 = r12 + -1
            r0.zzB = r12
            com.google.android.gms.internal.ads.zzef r12 = r0.zzf
            r12.zzF(r9)
            com.google.android.gms.internal.ads.zzef r12 = r0.zzf
            r9 = 4
            r5.zzq(r12, r9)
            com.google.android.gms.internal.ads.zzef r12 = r0.zzg
            r5.zzq(r12, r8)
            com.google.android.gms.internal.ads.zzaap[] r12 = r0.zzF
            int r12 = r12.length
            if (r12 <= 0) goto L_0x01c1
            com.google.android.gms.internal.ads.zzaf r12 = r3.zzf
            java.lang.String r12 = r12.zzm
            byte r17 = r13[r9]
            byte[] r9 = com.google.android.gms.internal.ads.zzaaf.zza
            java.lang.String r9 = "video/avc"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x01b3
            r9 = r17 & 31
            if (r9 == r4) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r9 = r8
            goto L_0x01c2
        L_0x01b3:
            boolean r9 = r15.equals(r12)
            if (r9 == 0) goto L_0x01c1
            r9 = r17 & 126(0x7e, float:1.77E-43)
            int r9 = r9 >> r8
            r12 = 39
            if (r9 != r12) goto L_0x01c1
            goto L_0x01b1
        L_0x01c1:
            r9 = 0
        L_0x01c2:
            r0.zzC = r9
            int r9 = r0.zzA
            int r9 = r9 + 5
            r0.zzA = r9
            int r9 = r0.zzz
            int r9 = r9 + r6
            r0.zzz = r9
            goto L_0x0232
        L_0x01d0:
            java.lang.String r1 = "Invalid NAL length"
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r7)
            throw r1
        L_0x01d7:
            boolean r9 = r0.zzC
            if (r9 == 0) goto L_0x0220
            com.google.android.gms.internal.ads.zzef r9 = r0.zzh
            r9.zzC(r12)
            com.google.android.gms.internal.ads.zzef r9 = r0.zzh
            byte[] r9 = r9.zzH()
            int r12 = r0.zzB
            r4 = r1
            com.google.android.gms.internal.ads.zzyy r4 = (com.google.android.gms.internal.ads.zzyy) r4
            r8 = 0
            r4.zzn(r9, r8, r12, r8)
            com.google.android.gms.internal.ads.zzef r4 = r0.zzh
            int r8 = r0.zzB
            r5.zzq(r4, r8)
            int r4 = r0.zzB
            com.google.android.gms.internal.ads.zzef r8 = r0.zzh
            byte[] r9 = r8.zzH()
            int r8 = r8.zzd()
            int r8 = com.google.android.gms.internal.ads.zzaaf.zzb(r9, r8)
            com.google.android.gms.internal.ads.zzef r9 = r0.zzh
            com.google.android.gms.internal.ads.zzaf r12 = r3.zzf
            java.lang.String r12 = r12.zzm
            boolean r12 = r15.equals(r12)
            r9.zzF(r12)
            com.google.android.gms.internal.ads.zzef r9 = r0.zzh
            r9.zzE(r8)
            com.google.android.gms.internal.ads.zzef r8 = r0.zzh
            com.google.android.gms.internal.ads.zzaap[] r9 = r0.zzF
            com.google.android.gms.internal.ads.zzyv.zza(r10, r8, r9)
            goto L_0x0226
        L_0x0220:
            r4 = 0
            int r8 = r5.zze(r1, r12, r4)
            r4 = r8
        L_0x0226:
            int r8 = r0.zzA
            int r8 = r8 + r4
            r0.zzA = r8
            int r8 = r0.zzB
            int r8 = r8 - r4
            r0.zzB = r8
            r4 = 6
            r8 = 1
        L_0x0232:
            r9 = 0
            r12 = 3
            goto L_0x0164
        L_0x0236:
            int r20 = r2.zza()
            com.google.android.gms.internal.ads.zzafw r1 = r2.zzf()
            if (r1 == 0) goto L_0x0245
            com.google.android.gms.internal.ads.zzaao r1 = r1.zzc
            r23 = r1
            goto L_0x0247
        L_0x0245:
            r23 = r7
        L_0x0247:
            int r1 = r0.zzz
            r22 = 0
            r17 = r5
            r18 = r10
            r21 = r1
            r17.zzs(r18, r20, r21, r22, r23)
        L_0x0254:
            java.util.ArrayDeque r1 = r0.zzn
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x028c
            java.util.ArrayDeque r1 = r0.zzn
            java.lang.Object r1 = r1.removeFirst()
            com.google.android.gms.internal.ads.zzafj r1 = (com.google.android.gms.internal.ads.zzafj) r1
            int r3 = r0.zzu
            int r4 = r1.zzc
            int r3 = r3 - r4
            r0.zzu = r3
            long r3 = r1.zza
            boolean r5 = r1.zzb
            if (r5 == 0) goto L_0x0272
            long r3 = r3 + r10
        L_0x0272:
            com.google.android.gms.internal.ads.zzaap[] r5 = r0.zzE
            int r6 = r5.length
            r8 = 0
        L_0x0276:
            if (r8 >= r6) goto L_0x0254
            r12 = r5[r8]
            r15 = 1
            int r9 = r1.zzc
            int r13 = r0.zzu
            r18 = 0
            r17 = r13
            r13 = r3
            r16 = r9
            r12.zzs(r13, r15, r16, r17, r18)
            int r8 = r8 + 1
            goto L_0x0276
        L_0x028c:
            boolean r1 = r2.zzk()
            if (r1 != 0) goto L_0x0294
            r0.zzy = r7
        L_0x0294:
            r1 = 3
            r0.zzo = r1
            r1 = 0
        L_0x0298:
            return r1
        L_0x0299:
            android.util.SparseArray r2 = r0.zze
            int r2 = r2.size()
            r6 = r7
            r5 = 0
        L_0x02a1:
            if (r5 >= r2) goto L_0x02c4
            android.util.SparseArray r8 = r0.zze
            java.lang.Object r8 = r8.valueAt(r5)
            com.google.android.gms.internal.ads.zzafk r8 = (com.google.android.gms.internal.ads.zzafk) r8
            com.google.android.gms.internal.ads.zzafx r8 = r8.zzb
            boolean r9 = r8.zzo
            if (r9 == 0) goto L_0x02c1
            long r8 = r8.zzc
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x02c1
            android.util.SparseArray r3 = r0.zze
            java.lang.Object r3 = r3.valueAt(r5)
            r6 = r3
            com.google.android.gms.internal.ads.zzafk r6 = (com.google.android.gms.internal.ads.zzafk) r6
            r3 = r8
        L_0x02c1:
            int r5 = r5 + 1
            goto L_0x02a1
        L_0x02c4:
            if (r6 != 0) goto L_0x02cb
            r2 = 3
            r0.zzo = r2
            goto L_0x0004
        L_0x02cb:
            long r8 = r34.zzf()
            long r3 = r3 - r8
            int r2 = (int) r3
            if (r2 < 0) goto L_0x02f2
            r3 = r1
            com.google.android.gms.internal.ads.zzyy r3 = (com.google.android.gms.internal.ads.zzyy) r3
            r4 = 0
            r3.zzo(r2, r4)
            com.google.android.gms.internal.ads.zzafx r2 = r6.zzb
            com.google.android.gms.internal.ads.zzef r5 = r2.zzn
            byte[] r6 = r5.zzH()
            int r5 = r5.zzd()
            r3.zzn(r6, r4, r5, r4)
            com.google.android.gms.internal.ads.zzef r3 = r2.zzn
            r3.zzF(r4)
            r2.zzo = r4
            goto L_0x0004
        L_0x02f2:
            java.lang.String r1 = "Offset to encryption data was negative."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r7)
            throw r1
        L_0x02f9:
            long r5 = r0.zzq
            int r2 = (int) r5
            int r5 = r0.zzr
            int r2 = r2 - r5
            com.google.android.gms.internal.ads.zzef r5 = r0.zzs
            if (r5 == 0) goto L_0x0529
            byte[] r6 = r5.zzH()
            r8 = r1
            com.google.android.gms.internal.ads.zzyy r8 = (com.google.android.gms.internal.ads.zzyy) r8
            r9 = 8
            r11 = 0
            r8.zzn(r6, r9, r2, r11)
            com.google.android.gms.internal.ads.zzaew r2 = new com.google.android.gms.internal.ads.zzaew
            int r6 = r0.zzp
            r2.<init>(r6, r5)
            long r5 = r34.zzf()
            java.util.ArrayDeque r8 = r0.zzm
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0330
            java.util.ArrayDeque r3 = r0.zzm
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzaev r3 = (com.google.android.gms.internal.ads.zzaev) r3
            r3.zzd(r2)
            goto L_0x0530
        L_0x0330:
            int r8 = r2.zzd
            if (r8 != r4) goto L_0x03fa
            com.google.android.gms.internal.ads.zzef r2 = r2.zza
            r3 = 8
            r2.zzF(r3)
            int r3 = r2.zze()
            r4 = 4
            r2.zzG(r4)
            long r14 = r2.zzs()
            int r3 = com.google.android.gms.internal.ads.zzaex.zze(r3)
            if (r3 != 0) goto L_0x0356
            long r3 = r2.zzs()
            long r8 = r2.zzs()
            goto L_0x035e
        L_0x0356:
            long r3 = r2.zzt()
            long r8 = r2.zzt()
        L_0x035e:
            long r5 = r5 + r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r3
            r12 = r14
            long r19 = com.google.android.gms.internal.ads.zzen.zzw(r8, r10, r12)
            r8 = 2
            r2.zzG(r8)
            int r12 = r2.zzo()
            int[] r13 = new int[r12]
            long[] r10 = new long[r12]
            long[] r11 = new long[r12]
            long[] r8 = new long[r12]
            r21 = r19
            r9 = 0
        L_0x037b:
            if (r9 >= r12) goto L_0x03d1
            int r17 = r2.zze()
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = r17 & r23
            if (r23 != 0) goto L_0x03c9
            long r23 = r2.zzs()
            r25 = 2147483647(0x7fffffff, float:NaN)
            r17 = r17 & r25
            r13[r9] = r17
            r10[r9] = r5
            r8[r9] = r21
            long r3 = r3 + r23
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r7 = r8
            r24 = r9
            r8 = r3
            r25 = r3
            r3 = r10
            r4 = r11
            r10 = r21
            r17 = r12
            r1 = r13
            r12 = r14
            long r21 = com.google.android.gms.internal.ads.zzen.zzw(r8, r10, r12)
            r8 = r7[r24]
            long r8 = r21 - r8
            r4[r24] = r8
            r8 = 4
            r2.zzG(r8)
            r9 = r1[r24]
            long r9 = (long) r9
            long r5 = r5 + r9
            int r9 = r24 + 1
            r13 = r1
            r10 = r3
            r11 = r4
            r8 = r7
            r12 = r17
            r3 = r25
            r7 = 0
            r1 = r34
            goto L_0x037b
        L_0x03c9:
            java.lang.String r1 = "Unhandled indirect reference"
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r2)
            throw r1
        L_0x03d1:
            r7 = r8
            r3 = r10
            r4 = r11
            r1 = r13
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            com.google.android.gms.internal.ads.zzyw r5 = new com.google.android.gms.internal.ads.zzyw
            r5.<init>(r1, r3, r4, r7)
            android.util.Pair r1 = android.util.Pair.create(r2, r5)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.zzx = r2
            com.google.android.gms.internal.ads.zzzl r2 = r0.zzD
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.zzaal r1 = (com.google.android.gms.internal.ads.zzaal) r1
            r2.zzN(r1)
            r1 = 1
            r0.zzG = r1
            goto L_0x0526
        L_0x03fa:
            if (r8 != r3) goto L_0x0526
            com.google.android.gms.internal.ads.zzef r1 = r2.zza
            com.google.android.gms.internal.ads.zzaap[] r2 = r0.zzE
            int r2 = r2.length
            if (r2 == 0) goto L_0x0526
            r2 = 8
            r1.zzF(r2)
            int r2 = r1.zze()
            int r2 = com.google.android.gms.internal.ads.zzaex.zze(r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0468
            r5 = 1
            if (r2 == r5) goto L_0x0430
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r10, r1)
            goto L_0x0526
        L_0x0430:
            long r5 = r1.zzs()
            long r11 = r1.zzt()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r5
            long r7 = com.google.android.gms.internal.ads.zzen.zzw(r11, r13, r15)
            long r11 = r1.zzs()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = com.google.android.gms.internal.ads.zzen.zzw(r11, r13, r15)
            long r9 = r1.zzs()
            r2 = 0
            java.lang.String r11 = r1.zzv(r2)
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = r1.zzv(r2)
            java.util.Objects.requireNonNull(r12)
            r28 = r5
            r30 = r9
            r26 = r11
            r27 = r12
            r5 = r3
            r12 = r7
            goto L_0x04ad
        L_0x0468:
            r2 = 0
            java.lang.String r11 = r1.zzv(r2)
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = r1.zzv(r2)
            java.util.Objects.requireNonNull(r12)
            long r13 = r1.zzs()
            long r5 = r1.zzs()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r13
            long r15 = com.google.android.gms.internal.ads.zzen.zzw(r5, r7, r9)
            long r5 = r0.zzx
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0491
            long r5 = r5 + r15
            r19 = r5
            goto L_0x0493
        L_0x0491:
            r19 = r3
        L_0x0493:
            long r5 = r1.zzs()
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = r13
            long r5 = com.google.android.gms.internal.ads.zzen.zzw(r5, r7, r9)
            long r9 = r1.zzs()
            r28 = r5
            r30 = r9
            r26 = r11
            r27 = r12
            r5 = r15
            r12 = r19
        L_0x04ad:
            int r2 = r1.zza()
            byte[] r2 = new byte[r2]
            int r7 = r1.zza()
            r8 = 0
            r1.zzB(r2, r8, r7)
            com.google.android.gms.internal.ads.zzacf r1 = new com.google.android.gms.internal.ads.zzacf
            r25 = r1
            r32 = r2
            r25.<init>(r26, r27, r28, r30, r32)
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            com.google.android.gms.internal.ads.zzacg r7 = r0.zzk
            byte[] r1 = r7.zza(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.zza()
            com.google.android.gms.internal.ads.zzaap[] r7 = r0.zzE
            int r8 = r7.length
            r9 = 0
        L_0x04d7:
            if (r9 >= r8) goto L_0x04e5
            r10 = r7[r9]
            r11 = 0
            r2.zzF(r11)
            r10.zzq(r2, r1)
            int r9 = r9 + 1
            goto L_0x04d7
        L_0x04e5:
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x04fa
            java.util.ArrayDeque r2 = r0.zzn
            com.google.android.gms.internal.ads.zzafj r3 = new com.google.android.gms.internal.ads.zzafj
            r4 = 1
            r3.<init>(r5, r4, r1)
            r2.addLast(r3)
            int r2 = r0.zzu
            int r2 = r2 + r1
            r0.zzu = r2
            goto L_0x0526
        L_0x04fa:
            java.util.ArrayDeque r2 = r0.zzn
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0513
            java.util.ArrayDeque r2 = r0.zzn
            com.google.android.gms.internal.ads.zzafj r3 = new com.google.android.gms.internal.ads.zzafj
            r4 = 0
            r3.<init>(r12, r4, r1)
            r2.addLast(r3)
            int r2 = r0.zzu
            int r2 = r2 + r1
            r0.zzu = r2
            goto L_0x0526
        L_0x0513:
            com.google.android.gms.internal.ads.zzaap[] r2 = r0.zzE
            int r3 = r2.length
            r4 = 0
        L_0x0517:
            if (r4 >= r3) goto L_0x0526
            r5 = r2[r4]
            r8 = 1
            r10 = 0
            r11 = 0
            r6 = r12
            r9 = r1
            r5.zzs(r6, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto L_0x0517
        L_0x0526:
            r1 = r34
            goto L_0x0530
        L_0x0529:
            r3 = r1
            com.google.android.gms.internal.ads.zzyy r3 = (com.google.android.gms.internal.ads.zzyy) r3
            r5 = 0
            r3.zzo(r2, r5)
        L_0x0530:
            long r2 = r34.zzf()
            r0.zzi(r2)
            goto L_0x0004
        L_0x0539:
            r5 = r9
            int r2 = r0.zzr
            if (r2 != 0) goto L_0x0566
            com.google.android.gms.internal.ads.zzef r2 = r0.zzl
            byte[] r2 = r2.zzH()
            r6 = 8
            r7 = 1
            boolean r2 = r1.zzn(r2, r5, r6, r7)
            if (r2 != 0) goto L_0x054f
            r1 = -1
            return r1
        L_0x054f:
            r0.zzr = r6
            com.google.android.gms.internal.ads.zzef r2 = r0.zzl
            r2.zzF(r5)
            com.google.android.gms.internal.ads.zzef r2 = r0.zzl
            long r5 = r2.zzs()
            r0.zzq = r5
            com.google.android.gms.internal.ads.zzef r2 = r0.zzl
            int r2 = r2.zze()
            r0.zzp = r2
        L_0x0566:
            long r5 = r0.zzq
            r7 = 1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x058b
            com.google.android.gms.internal.ads.zzef r2 = r0.zzl
            byte[] r2 = r2.zzH()
            r5 = r1
            com.google.android.gms.internal.ads.zzyy r5 = (com.google.android.gms.internal.ads.zzyy) r5
            r6 = 8
            r7 = 0
            r5.zzn(r2, r6, r6, r7)
            int r2 = r0.zzr
            int r2 = r2 + r6
            r0.zzr = r2
            com.google.android.gms.internal.ads.zzef r2 = r0.zzl
            long r5 = r2.zzt()
            r0.zzq = r5
            goto L_0x05be
        L_0x058b:
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05be
            long r5 = r34.zzd()
            r7 = -1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05af
            java.util.ArrayDeque r2 = r0.zzm
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x05ae
            java.util.ArrayDeque r2 = r0.zzm
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.zzaev r2 = (com.google.android.gms.internal.ads.zzaev) r2
            long r5 = r2.zza
            goto L_0x05af
        L_0x05ae:
            r5 = r7
        L_0x05af:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x05be
            long r7 = r34.zzf()
            long r5 = r5 - r7
            int r2 = r0.zzr
            long r7 = (long) r2
            long r5 = r5 + r7
            r0.zzq = r5
        L_0x05be:
            long r5 = r0.zzq
            int r2 = r0.zzr
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0741
            long r5 = r34.zzf()
            long r5 = r5 - r7
            int r2 = r0.zzp
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            r8 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r8) goto L_0x05d8
            if (r2 != r7) goto L_0x05eb
        L_0x05d8:
            boolean r2 = r0.zzG
            if (r2 != 0) goto L_0x05eb
            com.google.android.gms.internal.ads.zzzl r2 = r0.zzD
            com.google.android.gms.internal.ads.zzaak r9 = new com.google.android.gms.internal.ads.zzaak
            long r10 = r0.zzw
            r9.<init>(r10, r5)
            r2.zzN(r9)
            r2 = 1
            r0.zzG = r2
        L_0x05eb:
            int r2 = r0.zzp
            if (r2 != r8) goto L_0x0609
            android.util.SparseArray r2 = r0.zze
            int r2 = r2.size()
            r9 = 0
        L_0x05f6:
            if (r9 >= r2) goto L_0x0609
            android.util.SparseArray r10 = r0.zze
            java.lang.Object r10 = r10.valueAt(r9)
            com.google.android.gms.internal.ads.zzafk r10 = (com.google.android.gms.internal.ads.zzafk) r10
            com.google.android.gms.internal.ads.zzafx r10 = r10.zzb
            r10.zzc = r5
            r10.zzb = r5
            int r9 = r9 + 1
            goto L_0x05f6
        L_0x0609:
            int r2 = r0.zzp
            if (r2 != r7) goto L_0x061a
            r7 = 0
            r0.zzy = r7
            long r2 = r0.zzq
            long r5 = r5 + r2
            r0.zzt = r5
            r2 = 2
            r0.zzo = r2
            goto L_0x0004
        L_0x061a:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x071a
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x071a
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x071a
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x071a
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x071a
            if (r2 == r8) goto L_0x071a
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x071a
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x071a
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x0646
            goto L_0x071a
        L_0x0646:
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r5) goto L_0x06e5
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r5) goto L_0x06e5
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r5) goto L_0x06e5
            if (r2 == r4) goto L_0x06e5
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x06e5
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x06e5
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x06e5
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x06e5
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x06e5
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x06e5
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x06e5
            if (r2 != r3) goto L_0x06d0
            goto L_0x06e5
        L_0x06d0:
            long r2 = r0.zzq
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x06de
            r2 = 0
            r0.zzs = r2
            r2 = 1
            r0.zzo = r2
            goto L_0x0004
        L_0x06de:
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zzc(r1)
            throw r1
        L_0x06e5:
            int r2 = r0.zzr
            r3 = 8
            if (r2 != r3) goto L_0x0713
            long r4 = r0.zzq
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x070c
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            int r4 = (int) r4
            r2.<init>((int) r4)
            com.google.android.gms.internal.ads.zzef r4 = r0.zzl
            byte[] r4 = r4.zzH()
            byte[] r5 = r2.zzH()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r3)
            r0.zzs = r2
            r2 = 1
            r0.zzo = r2
            goto L_0x0004
        L_0x070c:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zzc(r1)
            throw r1
        L_0x0713:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zzc(r1)
            throw r1
        L_0x071a:
            long r3 = r34.zzf()
            long r5 = r0.zzq
            long r3 = r3 + r5
            r5 = -8
            long r3 = r3 + r5
            java.util.ArrayDeque r5 = r0.zzm
            com.google.android.gms.internal.ads.zzaev r6 = new com.google.android.gms.internal.ads.zzaev
            r6.<init>(r2, r3)
            r5.push(r6)
            long r5 = r0.zzq
            int r2 = r0.zzr
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x073c
            r0.zzi(r3)
            goto L_0x0004
        L_0x073c:
            r33.zzg()
            goto L_0x0004
        L_0x0741:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zzc(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafl.zza(com.google.android.gms.internal.ads.zzzj, com.google.android.gms.internal.ads.zzaai):int");
    }

    public final void zzb(zzzl zzzl) {
        this.zzD = zzzl;
        zzg();
        zzaap[] zzaapArr = new zzaap[2];
        this.zzE = zzaapArr;
        int i = 0;
        zzaap[] zzaapArr2 = (zzaap[]) zzen.zzae(zzaapArr, 0);
        this.zzE = zzaapArr2;
        for (zzaap zzk2 : zzaapArr2) {
            zzk2.zzk(zzc);
        }
        this.zzF = new zzaap[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzaap zzv2 = this.zzD.zzv(i2, 3);
            zzv2.zzk((zzaf) this.zzd.get(i));
            this.zzF[i] = zzv2;
            i++;
            i2 = i3;
        }
    }

    public final void zzc(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            ((zzafk) this.zze.valueAt(i)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zzg();
    }

    public final boolean zzd(zzzj zzzj) throws IOException {
        return zzafu.zza(zzzj);
    }

    public zzafl(int i, zzel zzel) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzacg();
        this.zzl = new zzef(16);
        this.zzf = new zzef(zzaaf.zza);
        this.zzg = new zzef(5);
        this.zzh = new zzef();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzef(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzzl.zza;
        this.zzE = new zzaap[0];
        this.zzF = new zzaap[0];
    }
}
