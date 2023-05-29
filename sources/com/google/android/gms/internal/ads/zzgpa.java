package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgpa {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b = copyOf[31] & ByteCompanionObject.MAX_VALUE;
            copyOf[31] = (byte) b;
            copyOf[31] = (byte) (b | 64);
            int i = zzgnx.zzb;
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & ByteCompanionObject.MAX_VALUE);
                int i2 = 0;
                while (i2 < 7) {
                    if (!zzgnv.zzb(zzgnx.zza[i2], copyOf2)) {
                        i2++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(zzgoq.zza(zzgnx.zza[i2])));
                    }
                }
                long[] zzk = zzgop.zzk(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                int i3 = 10;
                System.arraycopy(zzk, 0, jArr2, 0, 10);
                int i4 = 0;
                int i5 = 32;
                while (i4 < i5) {
                    byte b2 = copyOf[(32 - i4) - 1] & UByte.MAX_VALUE;
                    int i6 = 0;
                    while (i6 < 8) {
                        int i7 = (b2 >> (7 - i6)) & 1;
                        zzgnx.zza(jArr4, jArr2, i7);
                        zzgnx.zza(jArr5, jArr3, i7);
                        byte[] bArr5 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        byte b3 = b2;
                        long[] jArr10 = jArr;
                        long[] jArr11 = new long[19];
                        int i8 = i4;
                        long[] jArr12 = new long[19];
                        int i9 = i6;
                        long[] jArr13 = new long[19];
                        int i10 = i7;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        zzgop.zzi(jArr4, jArr4, jArr5);
                        zzgop.zzh(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        zzgop.zzi(jArr2, jArr2, jArr3);
                        zzgop.zzh(jArr3, copyOf4, jArr3);
                        zzgop.zzb(jArr13, jArr2, jArr5);
                        zzgop.zzb(jArr14, jArr4, jArr3);
                        zzgop.zze(jArr13);
                        zzgop.zzd(jArr13);
                        zzgop.zze(jArr14);
                        zzgop.zzd(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf4, 0, 10);
                        zzgop.zzi(jArr13, jArr13, jArr14);
                        zzgop.zzh(jArr14, copyOf4, jArr14);
                        zzgop.zzg(jArr17, jArr13);
                        zzgop.zzg(jArr16, jArr14);
                        zzgop.zzb(jArr14, jArr16, zzk);
                        zzgop.zze(jArr14);
                        zzgop.zzd(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        zzgop.zzg(jArr11, jArr4);
                        zzgop.zzg(jArr12, jArr5);
                        zzgop.zzb(jArr8, jArr11, jArr12);
                        zzgop.zze(jArr8);
                        zzgop.zzd(jArr8);
                        zzgop.zzh(jArr12, jArr11, jArr12);
                        long[] jArr19 = new long[19];
                        Arrays.fill(jArr19, 10, 18, 0);
                        zzgop.zzf(jArr19, jArr12, 121665);
                        zzgop.zzd(jArr19);
                        zzgop.zzi(jArr19, jArr19, jArr11);
                        long[] jArr20 = jArr15;
                        zzgop.zzb(jArr20, jArr12, jArr19);
                        zzgop.zze(jArr20);
                        zzgop.zzd(jArr20);
                        int i11 = i10;
                        zzgnx.zza(jArr8, jArr6, i11);
                        zzgnx.zza(jArr20, jArr7, i11);
                        i6 = i9 + 1;
                        byte[] bArr6 = bArr2;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        b2 = b3;
                        jArr = jArr10;
                        i4 = i8;
                        jArr6 = jArr18;
                        jArr5 = jArr20;
                        copyOf = bArr5;
                        long[] jArr21 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr21;
                        long[] jArr22 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr22;
                    }
                    byte[] bArr7 = copyOf;
                    long[] jArr23 = jArr9;
                    long[] jArr24 = jArr;
                    long[] jArr25 = jArr2;
                    i4++;
                    byte[] bArr8 = bArr2;
                    copyOf = bArr7;
                    i5 = 32;
                    i3 = 10;
                }
                long[] jArr26 = jArr;
                int i12 = i3;
                long[] jArr27 = new long[i12];
                long[] jArr28 = new long[i12];
                long[] jArr29 = new long[i12];
                long[] jArr30 = new long[i12];
                long[] jArr31 = new long[i12];
                long[] jArr32 = new long[i12];
                long[] jArr33 = new long[i12];
                long[] jArr34 = new long[i12];
                long[] jArr35 = new long[i12];
                long[] jArr36 = new long[i12];
                long[] jArr37 = jArr2;
                long[] jArr38 = new long[i12];
                zzgop.zzg(jArr28, jArr5);
                zzgop.zzg(jArr38, jArr28);
                zzgop.zzg(jArr36, jArr38);
                zzgop.zza(jArr29, jArr36, jArr5);
                zzgop.zza(jArr30, jArr29, jArr28);
                zzgop.zzg(jArr36, jArr30);
                zzgop.zza(jArr31, jArr36, jArr29);
                zzgop.zzg(jArr36, jArr31);
                zzgop.zzg(jArr38, jArr36);
                zzgop.zzg(jArr36, jArr38);
                zzgop.zzg(jArr38, jArr36);
                zzgop.zzg(jArr36, jArr38);
                zzgop.zza(jArr32, jArr36, jArr31);
                zzgop.zzg(jArr36, jArr32);
                zzgop.zzg(jArr38, jArr36);
                for (int i13 = 2; i13 < 10; i13 += 2) {
                    zzgop.zzg(jArr36, jArr38);
                    zzgop.zzg(jArr38, jArr36);
                }
                zzgop.zza(jArr33, jArr38, jArr32);
                zzgop.zzg(jArr36, jArr33);
                zzgop.zzg(jArr38, jArr36);
                for (int i14 = 2; i14 < 20; i14 += 2) {
                    zzgop.zzg(jArr36, jArr38);
                    zzgop.zzg(jArr38, jArr36);
                }
                zzgop.zza(jArr36, jArr38, jArr33);
                zzgop.zzg(jArr38, jArr36);
                zzgop.zzg(jArr36, jArr38);
                for (int i15 = 2; i15 < 10; i15 += 2) {
                    zzgop.zzg(jArr38, jArr36);
                    zzgop.zzg(jArr36, jArr38);
                }
                zzgop.zza(jArr34, jArr36, jArr32);
                zzgop.zzg(jArr36, jArr34);
                zzgop.zzg(jArr38, jArr36);
                for (int i16 = 2; i16 < 50; i16 += 2) {
                    zzgop.zzg(jArr36, jArr38);
                    zzgop.zzg(jArr38, jArr36);
                }
                zzgop.zza(jArr35, jArr38, jArr34);
                zzgop.zzg(jArr38, jArr35);
                zzgop.zzg(jArr36, jArr38);
                for (int i17 = 2; i17 < 100; i17 += 2) {
                    zzgop.zzg(jArr38, jArr36);
                    zzgop.zzg(jArr36, jArr38);
                }
                zzgop.zza(jArr38, jArr36, jArr35);
                zzgop.zzg(jArr36, jArr38);
                zzgop.zzg(jArr38, jArr36);
                for (int i18 = 2; i18 < 50; i18 += 2) {
                    zzgop.zzg(jArr36, jArr38);
                    zzgop.zzg(jArr38, jArr36);
                }
                zzgop.zza(jArr36, jArr38, jArr34);
                zzgop.zzg(jArr38, jArr36);
                zzgop.zzg(jArr36, jArr38);
                zzgop.zzg(jArr38, jArr36);
                zzgop.zzg(jArr36, jArr38);
                zzgop.zzg(jArr38, jArr36);
                zzgop.zza(jArr27, jArr38, jArr30);
                long[] jArr39 = jArr26;
                zzgop.zza(jArr39, jArr4, jArr27);
                long[] jArr40 = new long[10];
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[11];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                zzgop.zza(jArr40, zzk, jArr39);
                zzgop.zzi(jArr41, zzk, jArr39);
                long[] jArr45 = new long[10];
                jArr45[0] = 486662;
                zzgop.zzi(jArr43, jArr41, jArr45);
                zzgop.zza(jArr43, jArr43, jArr3);
                long[] jArr46 = jArr37;
                zzgop.zzi(jArr43, jArr43, jArr46);
                zzgop.zza(jArr43, jArr43, jArr40);
                zzgop.zza(jArr43, jArr43, jArr46);
                zzgop.zzf(jArr42, jArr43, 4);
                zzgop.zzd(jArr42);
                zzgop.zza(jArr43, jArr40, jArr3);
                zzgop.zzh(jArr43, jArr43, jArr3);
                zzgop.zza(jArr44, jArr41, jArr46);
                zzgop.zzi(jArr43, jArr43, jArr44);
                zzgop.zzg(jArr43, jArr43);
                if (zzgnv.zzb(zzgop.zzj(jArr42), zzgop.zzj(jArr43))) {
                    return zzgop.zzj(jArr39);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzgoq.zza(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] zzb() {
        byte[] zza = zzgox.zza(32);
        zza[0] = (byte) (zza[0] | 7);
        byte b = zza[31] & 63;
        zza[31] = (byte) b;
        zza[31] = (byte) (b | ByteCompanionObject.MIN_VALUE);
        return zza;
    }

    public static byte[] zzc(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
