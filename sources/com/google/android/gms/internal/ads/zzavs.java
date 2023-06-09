package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzavs {
    private final zzbak zza = new zzbak(8);
    private int zzb;

    private final long zzb(zzauy zzauy) throws IOException, InterruptedException {
        int i = 0;
        zzauy.zzg(this.zza.zza, 0, 1, false);
        byte b = this.zza.zza[0] & UByte.MAX_VALUE;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        zzauy.zzg(this.zza.zza, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.zza.zza[i] & UByte.MAX_VALUE) + (i4 << 8);
        }
        this.zzb += i3 + 1;
        return (long) i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r0 = zzb(r14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.internal.ads.zzauy r14) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r13 = this;
            long r0 = r14.zzc()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1024(0x400, double:5.06E-321)
            if (r2 == 0) goto L_0x0012
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            int r3 = (int) r3
            com.google.android.gms.internal.ads.zzbak r4 = r13.zza
            byte[] r4 = r4.zza
            r5 = 0
            r6 = 4
            r14.zzg(r4, r5, r6, r5)
            com.google.android.gms.internal.ads.zzbak r4 = r13.zza
            long r7 = r4.zzm()
            r13.zzb = r6
        L_0x0024:
            r9 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r6 = 1
            if (r4 == 0) goto L_0x004e
            int r4 = r13.zzb
            int r4 = r4 + r6
            r13.zzb = r4
            if (r4 != r3) goto L_0x0034
            return r5
        L_0x0034:
            com.google.android.gms.internal.ads.zzbak r4 = r13.zza
            byte[] r4 = r4.zza
            r14.zzg(r4, r5, r6, r5)
            r4 = 8
            long r6 = r7 << r4
            r8 = -256(0xffffffffffffff00, double:NaN)
            long r6 = r6 & r8
            com.google.android.gms.internal.ads.zzbak r4 = r13.zza
            byte[] r4 = r4.zza
            byte r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r8 = (long) r4
            long r7 = r6 | r8
            goto L_0x0024
        L_0x004e:
            long r3 = r13.zzb(r14)
            int r7 = r13.zzb
            long r7 = (long) r7
            r9 = -9223372036854775808
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0093
            if (r2 != 0) goto L_0x005e
            goto L_0x0065
        L_0x005e:
            long r11 = r7 + r3
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0065
            goto L_0x0093
        L_0x0065:
            int r0 = r13.zzb
            long r0 = (long) r0
            long r11 = r7 + r3
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0090
            long r0 = r13.zzb(r14)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            return r5
        L_0x0077:
            long r0 = r13.zzb(r14)
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x008f
            if (r2 == 0) goto L_0x0065
            int r2 = (int) r0
            r14.zzf(r2, r5)
            int r2 = r13.zzb
            long r11 = (long) r2
            long r11 = r11 + r0
            int r0 = (int) r11
            r13.zzb = r0
            goto L_0x0065
        L_0x008f:
            return r5
        L_0x0090:
            if (r0 != 0) goto L_0x0093
            return r6
        L_0x0093:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavs.zza(com.google.android.gms.internal.ads.zzauy):boolean");
    }
}
