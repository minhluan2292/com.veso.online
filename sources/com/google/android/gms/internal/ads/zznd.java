package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zznd {
    public static final zznd zza = new zznd(new int[]{2}, 8);
    private static final zznd zzb = new zznd(new int[]{2, 5, 6}, 8);
    /* access modifiers changed from: private */
    public static final zzfvq zzc;
    private final int[] zzd;
    private final int zze = 8;

    static {
        zzfvp zzfvp = new zzfvp();
        zzfvp.zza(5, 6);
        zzfvp.zza(17, 6);
        zzfvp.zza(7, 6);
        zzfvp.zza(18, 6);
        zzfvp.zza(6, 8);
        zzfvp.zza(8, 8);
        zzfvp.zza(14, 8);
        zzc = zzfvp.zzc();
    }

    public zznd(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzd = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zznd)) {
            return false;
        }
        zznd zznd = (zznd) obj;
        if (!Arrays.equals(this.zzd, zznd.zzd)) {
            return false;
        }
        int i = zznd.zze;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzd) * 31) + 8;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzd);
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + arrays + "]";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007e, code lost:
        if (r7 != 5) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair zza(com.google.android.gms.internal.ads.zzaf r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.zzm
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = r10.zzj
            int r0 = com.google.android.gms.internal.ads.zzbt.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfvq r1 = zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0019
            return r3
        L_0x0019:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L_0x002a
            boolean r0 = r9.zzc(r6)
            if (r0 != 0) goto L_0x0029
            r0 = r4
            goto L_0x0033
        L_0x0029:
            r0 = r6
        L_0x002a:
            if (r0 != r5) goto L_0x0033
            boolean r7 = r9.zzc(r5)
            if (r7 != 0) goto L_0x0033
            r0 = r2
        L_0x0033:
            boolean r7 = r9.zzc(r0)
            if (r7 != 0) goto L_0x003a
            return r3
        L_0x003a:
            int r7 = r10.zzz
            r8 = -1
            if (r7 == r8) goto L_0x0045
            if (r0 != r6) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            if (r7 <= r5) goto L_0x006d
            return r3
        L_0x0045:
            int r10 = r10.zzA
            if (r10 != r8) goto L_0x004c
            r10 = 48000(0xbb80, float:6.7262E-41)
        L_0x004c:
            int r6 = com.google.android.gms.internal.ads.zzen.zza
            r7 = 29
            if (r6 < r7) goto L_0x0057
            int r7 = com.google.android.gms.internal.ads.zznc.zza(r0, r10)
            goto L_0x006d
        L_0x0057:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.util.Objects.requireNonNull(r10)
            int r7 = r10.intValue()
        L_0x006d:
            int r10 = com.google.android.gms.internal.ads.zzen.zza
            r1 = 28
            if (r10 > r1) goto L_0x0081
            if (r7 != r2) goto L_0x0077
            r4 = r5
            goto L_0x0082
        L_0x0077:
            r10 = 3
            if (r7 == r10) goto L_0x0082
            r10 = 4
            if (r7 == r10) goto L_0x0082
            r10 = 5
            if (r7 != r10) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r4 = r7
        L_0x0082:
            int r10 = com.google.android.gms.internal.ads.zzen.zza
            r1 = 26
            if (r10 > r1) goto L_0x0096
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r1 = "fugu"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x0096
            r10 = 1
            if (r4 != r10) goto L_0x0096
            r4 = 2
        L_0x0096:
            int r10 = com.google.android.gms.internal.ads.zzen.zzj(r4)
            if (r10 != 0) goto L_0x009d
            return r3
        L_0x009d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznd.zza(com.google.android.gms.internal.ads.zzaf):android.util.Pair");
    }

    public final boolean zzc(int i) {
        return Arrays.binarySearch(this.zzd, i) >= 0;
    }
}
