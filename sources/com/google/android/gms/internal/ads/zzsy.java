package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzsy implements zzsg, zzsf {
    private final zzsg[] zza;
    private final IdentityHashMap zzb;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzsf zze;
    private zzuh zzf;
    private zzsg[] zzg;
    private zzub zzh;
    private final zzrt zzi;

    public zzsy(zzrt zzrt, long[] jArr, zzsg[] zzsgArr, byte... bArr) {
        this.zzi = zzrt;
        this.zza = zzsgArr;
        this.zzh = new zzrs(new zzub[0]);
        this.zzb = new IdentityHashMap();
        this.zzg = new zzsg[0];
        for (int i = 0; i < zzsgArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzsw(zzsgArr[i], j);
            }
        }
    }

    public final long zza(long j, zzkd zzkd) {
        zzsg[] zzsgArr = this.zzg;
        return (zzsgArr.length > 0 ? zzsgArr[0] : this.zza[0]).zza(j, zzkd);
    }

    public final long zzb() {
        return this.zzh.zzb();
    }

    public final long zzc() {
        return this.zzh.zzc();
    }

    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzsg zzsg : this.zzg) {
            long zzd2 = zzsg.zzd();
            if (zzd2 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    zzsg[] zzsgArr = this.zzg;
                    int length = zzsgArr.length;
                    int i = 0;
                    while (i < length) {
                        zzsg zzsg2 = zzsgArr[i];
                        if (zzsg2 == zzsg) {
                            break;
                        } else if (zzsg2.zze(zzd2) == zzd2) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd2;
                } else if (zzd2 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || zzsg.zze(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final long zze(long j) {
        long zze2 = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzsg[] zzsgArr = this.zzg;
            if (i >= zzsgArr.length) {
                return zze2;
            }
            if (zzsgArr[i].zze(zze2) == zze2) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final long zzf(zzvt[] zzvtArr, boolean[] zArr, zztz[] zztzArr, boolean[] zArr2, long j) {
        int length;
        Integer num;
        int i;
        zzvt[] zzvtArr2 = zzvtArr;
        zztz[] zztzArr2 = zztzArr;
        int length2 = zzvtArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = zzvtArr2.length;
            num = 0;
            if (i2 >= length) {
                break;
            }
            zztz zztz = zztzArr2[i2];
            if (zztz != null) {
                num = (Integer) this.zzb.get(zztz);
            }
            if (num == null) {
                i = -1;
            } else {
                i = num.intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            zzvt zzvt = zzvtArr2[i2];
            if (zzvt != null) {
                zzcp zzcp = (zzcp) this.zzd.get(zzvt.zze());
                Objects.requireNonNull(zzcp);
                int i3 = 0;
                while (true) {
                    zzsg[] zzsgArr = this.zza;
                    if (i3 >= zzsgArr.length) {
                        break;
                    } else if (zzsgArr[i3].zzh().zza(zzcp) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.zzb.clear();
        zztz[] zztzArr3 = new zztz[length];
        zztz[] zztzArr4 = new zztz[length];
        zzvt[] zzvtArr3 = new zzvt[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.zza.length) {
            for (int i5 = 0; i5 < zzvtArr2.length; i5++) {
                zztzArr4[i5] = iArr[i5] == i4 ? zztzArr2[i5] : num;
                if (iArr2[i5] == i4) {
                    zzvt zzvt2 = zzvtArr2[i5];
                    Objects.requireNonNull(zzvt2);
                    zzcp zzcp2 = (zzcp) this.zzd.get(zzvt2.zze());
                    Objects.requireNonNull(zzcp2);
                    zzvtArr3[i5] = new zzsv(zzvt2, zzcp2);
                } else {
                    zzvtArr3[i5] = num;
                }
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            zztz[] zztzArr5 = zztzArr4;
            zzvt[] zzvtArr4 = zzvtArr3;
            long zzf2 = this.zza[i4].zzf(zzvtArr3, zArr, zztzArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = zzf2;
            } else if (zzf2 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzvtArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    zztz zztz2 = zztzArr5[i7];
                    Objects.requireNonNull(zztz2);
                    zztzArr3[i7] = zztz2;
                    this.zzb.put(zztz2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (zztzArr5[i7] != null) {
                        z2 = false;
                    }
                    zzdd.zzf(z2);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zztzArr4 = zztzArr5;
            zzvtArr3 = zzvtArr4;
            num = null;
        }
        System.arraycopy(zztzArr3, 0, zztzArr2, 0, length);
        zzsg[] zzsgArr2 = (zzsg[]) arrayList.toArray(new zzsg[0]);
        this.zzg = zzsgArr2;
        this.zzh = new zzrs(zzsgArr2);
        return j2;
    }

    public final /* bridge */ /* synthetic */ void zzg(zzub zzub) {
        zzsg zzsg = (zzsg) zzub;
        zzsf zzsf = this.zze;
        Objects.requireNonNull(zzsf);
        zzsf.zzg(this);
    }

    public final zzuh zzh() {
        zzuh zzuh = this.zzf;
        Objects.requireNonNull(zzuh);
        return zzuh;
    }

    public final void zzi(zzsg zzsg) {
        this.zzc.remove(zzsg);
        if (this.zzc.isEmpty()) {
            int i = 0;
            for (zzsg zzh2 : this.zza) {
                i += zzh2.zzh().zzc;
            }
            zzcp[] zzcpArr = new zzcp[i];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                zzsg[] zzsgArr = this.zza;
                if (i2 < zzsgArr.length) {
                    zzuh zzh3 = zzsgArr[i2].zzh();
                    int i4 = zzh3.zzc;
                    int i5 = 0;
                    while (i5 < i4) {
                        zzcp zzb2 = zzh3.zzb(i5);
                        zzcp zzc2 = zzb2.zzc(i2 + ":" + zzb2.zzc);
                        this.zzd.put(zzc2, zzb2);
                        zzcpArr[i3] = zzc2;
                        i5++;
                        i3++;
                    }
                    i2++;
                } else {
                    this.zzf = new zzuh(zzcpArr);
                    zzsf zzsf = this.zze;
                    Objects.requireNonNull(zzsf);
                    zzsf.zzi(this);
                    return;
                }
            }
        }
    }

    public final void zzj(long j, boolean z) {
        for (zzsg zzj : this.zzg) {
            zzj.zzj(j, false);
        }
    }

    public final void zzk() throws IOException {
        for (zzsg zzk : this.zza) {
            zzk.zzk();
        }
    }

    public final void zzl(zzsf zzsf, long j) {
        this.zze = zzsf;
        Collections.addAll(this.zzc, this.zza);
        for (zzsg zzl : this.zza) {
            zzl.zzl(this, j);
        }
    }

    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzsg zzn(int i) {
        zzsg zzsg = this.zza[i];
        return zzsg instanceof zzsw ? ((zzsw) zzsg).zza : zzsg;
    }

    public final boolean zzo(long j) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(j);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzsg) this.zzc.get(i)).zzo(j);
        }
        return false;
    }

    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
