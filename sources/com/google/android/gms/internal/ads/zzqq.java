package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzqq extends zzgr {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzqp zzC;
    private zzqn zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private zzqg zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    protected zzgs zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private long zzal;
    private int zzam;
    private zzpr zzan;
    private zzpr zzao;
    private final zzqk zzc;
    private final zzqs zzd;
    private final float zze;
    private final zzgi zzf = new zzgi(0, 0);
    private final zzgi zzg = new zzgi(0, 0);
    private final zzgi zzh = new zzgi(2, 0);
    private final zzqf zzi;
    private final zzek zzj;
    private final ArrayList zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    private zzaf zzp;
    private zzaf zzq;
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzql zzw;
    private zzaf zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzqq(int i, zzqk zzqk, zzqs zzqs, boolean z, float f) {
        super(i);
        this.zzc = zzqk;
        Objects.requireNonNull(zzqs);
        this.zzd = zzqs;
        this.zze = f;
        zzqf zzqf = new zzqf();
        this.zzi = zzqf;
        this.zzj = new zzek(10);
        this.zzk = new ArrayList();
        this.zzl = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzm = new long[10];
        this.zzn = new long[10];
        this.zzo = new long[10];
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        zzqf.zzi(0);
        zzqf.zzb.order(ByteOrder.nativeOrder());
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzZ = 0;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzP = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        this.zzaa = 0;
        this.zzab = 0;
    }

    private final void zzT() {
        this.zzX = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzW = false;
        this.zzV = false;
    }

    private final void zzU() throws zzha {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
            return;
        }
        zzap();
        zzan();
    }

    private final void zzaA() throws zzha {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw zzbg(e, this.zzp, false, 6006);
        }
    }

    private final boolean zzaB() throws zzha {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzG || this.zzI) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaA();
        }
        return true;
    }

    private final boolean zzaC() throws zzha {
        zzql zzql = this.zzw;
        if (zzql == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zza2 = zzql.zza();
            this.zzQ = zza2;
            if (zza2 < 0) {
                return false;
            }
            this.zzg.zzb = this.zzw.zzf(zza2);
            this.zzg.zzb();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzw.zzj(this.zzQ, 0, 0, 0, 4);
                zzay();
            }
            this.zzaa = 2;
            return false;
        } else if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzw.zzj(this.zzQ, 0, 38, 0, 0);
            zzay();
            this.zzac = true;
            return true;
        } else {
            if (this.zzZ == 1) {
                for (int i = 0; i < this.zzx.zzo.size(); i++) {
                    this.zzg.zzb.put((byte[]) this.zzx.zzo.get(i));
                }
                this.zzZ = 2;
            }
            int position = this.zzg.zzb.position();
            zzjg zzh2 = zzh();
            try {
                int zzbf = zzbf(zzh2, this.zzg, 0);
                if (zzG()) {
                    this.zzag = this.zzaf;
                }
                if (zzbf == -3) {
                    return false;
                }
                if (zzbf == -5) {
                    if (this.zzZ == 2) {
                        this.zzg.zzb();
                        this.zzZ = 1;
                    }
                    zzS(zzh2);
                    return true;
                }
                zzgi zzgi = this.zzg;
                if (zzgi.zzg()) {
                    if (this.zzZ == 2) {
                        zzgi.zzb();
                        this.zzZ = 1;
                    }
                    this.zzah = true;
                    if (!this.zzac) {
                        zzax();
                        return false;
                    }
                    try {
                        if (!this.zzN) {
                            this.zzad = true;
                            this.zzw.zzj(this.zzQ, 0, 0, 0, 4);
                            zzay();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw zzbg(e, this.zzp, false, zzen.zzl(e.getErrorCode()));
                    }
                } else if (this.zzac || zzgi.zzh()) {
                    boolean zzk2 = zzgi.zzk();
                    if (zzk2) {
                        zzgi.zza.zzb(position);
                    }
                    if (this.zzF && !zzk2) {
                        ByteBuffer byteBuffer = this.zzg.zzb;
                        byte[] bArr = zzaaf.zza;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i2) & UByte.MAX_VALUE;
                            if (i3 == 3) {
                                if (b == 1) {
                                    if ((byteBuffer.get(i4) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i2 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    b = 1;
                                }
                            } else if (b == 0) {
                                i3++;
                            }
                            if (b != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.zzg.zzb.position() == 0) {
                            return true;
                        }
                        this.zzF = false;
                    }
                    zzgi zzgi2 = this.zzg;
                    long j = zzgi2.zzd;
                    zzqg zzqg = this.zzO;
                    if (zzqg != null) {
                        j = zzqg.zzb(this.zzp, zzgi2);
                        this.zzaf = Math.max(this.zzaf, this.zzO.zza(this.zzp));
                    }
                    long j2 = j;
                    if (this.zzg.zzf()) {
                        this.zzk.add(Long.valueOf(j2));
                    }
                    if (this.zzaj) {
                        this.zzj.zzd(j2, this.zzp);
                        this.zzaj = false;
                    }
                    this.zzaf = Math.max(this.zzaf, j2);
                    this.zzg.zzj();
                    zzgi zzgi3 = this.zzg;
                    if (zzgi3.zze()) {
                        zzam(zzgi3);
                    }
                    zzad(this.zzg);
                    if (zzk2) {
                        try {
                            this.zzw.zzk(this.zzQ, 0, this.zzg.zza, j2, 0);
                        } catch (MediaCodec.CryptoException e2) {
                            throw zzbg(e2, this.zzp, false, zzen.zzl(e2.getErrorCode()));
                        }
                    } else {
                        this.zzw.zzj(this.zzQ, 0, this.zzg.zzb.limit(), j2, 0);
                    }
                    zzay();
                    this.zzac = true;
                    this.zzZ = 0;
                    this.zza.zzc++;
                    return true;
                } else {
                    zzgi.zzb();
                    if (this.zzZ == 2) {
                        this.zzZ = 1;
                    }
                    return true;
                }
            } catch (zzgh e3) {
                zzX(e3);
                zzaE(0);
                zzab();
                return true;
            }
        }
    }

    private final boolean zzaD() {
        return this.zzR >= 0;
    }

    private final boolean zzaE(int i) throws zzha {
        zzjg zzh2 = zzh();
        this.zzf.zzb();
        int zzbf = zzbf(zzh2, this.zzf, i | 4);
        if (zzbf == -5) {
            zzS(zzh2);
            return true;
        } else if (zzbf != -4 || !this.zzf.zzg()) {
            return false;
        } else {
            this.zzah = true;
            zzax();
            return false;
        }
    }

    private final boolean zzaF(long j) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.zzt;
    }

    private final boolean zzaG(zzaf zzaf2) throws zzha {
        if (!(zzen.zza < 23 || this.zzw == null || this.zzab == 3 || zzbe() == 0)) {
            float zzP2 = zzP(this.zzv, zzaf2, zzJ());
            float f = this.zzA;
            if (f == zzP2) {
                return true;
            }
            if (zzP2 == -1.0f) {
                zzU();
                return false;
            } else if (f == -1.0f && zzP2 <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzP2);
                this.zzw.zzp(bundle);
                this.zzA = zzP2;
            }
        }
        return true;
    }

    private final void zzab() {
        try {
            this.zzw.zzi();
        } finally {
            zzaq();
        }
    }

    protected static boolean zzav(zzaf zzaf2) {
        return zzaf2.zzF == 0;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02b7 A[SYNTHETIC, Splitter:B:152:0x02b7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzaw(com.google.android.gms.internal.ads.zzqn r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            java.lang.String r1 = "createCodec:"
            java.lang.String r2 = r0.zza
            int r3 = com.google.android.gms.internal.ads.zzen.zza
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 23
            if (r3 >= r5) goto L_0x0012
            r3 = r4
            goto L_0x001e
        L_0x0012:
            float r3 = r8.zzv
            com.google.android.gms.internal.ads.zzaf r6 = r8.zzp
            com.google.android.gms.internal.ads.zzaf[] r7 = r16.zzJ()
            float r3 = r8.zzP(r3, r6, r7)
        L_0x001e:
            float r6 = r8.zze
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r4 = r3
        L_0x0026:
            long r6 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.internal.ads.zzaf r3 = r8.zzp
            r9 = 0
            com.google.android.gms.internal.ads.zzqj r3 = r8.zzV(r0, r3, r9, r4)
            int r10 = com.google.android.gms.internal.ads.zzen.zza
            r11 = 31
            if (r10 < r11) goto L_0x003e
            com.google.android.gms.internal.ads.zznb r10 = r16.zzl()
            com.google.android.gms.internal.ads.zzqo.zza(r3, r10)
        L_0x003e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x02bb }
            r10.<init>()     // Catch:{ all -> 0x02bb }
            r10.append(r1)     // Catch:{ all -> 0x02bb }
            r10.append(r2)     // Catch:{ all -> 0x02bb }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x02bb }
            android.os.Trace.beginSection(r10)     // Catch:{ all -> 0x02bb }
            int r10 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ all -> 0x02bb }
            r12 = 0
            if (r10 < r5) goto L_0x007a
            int r10 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ all -> 0x02bb }
            if (r10 < r11) goto L_0x007a
            com.google.android.gms.internal.ads.zzaf r1 = r3.zzc     // Catch:{ all -> 0x02bb }
            java.lang.String r1 = r1.zzm     // Catch:{ all -> 0x02bb }
            int r1 = com.google.android.gms.internal.ads.zzbt.zzb(r1)     // Catch:{ all -> 0x02bb }
            java.lang.String r9 = "DMCodecAdapterFactory"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.zzO(r1)     // Catch:{ all -> 0x02bb }
            java.lang.String r11 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r10 = r11.concat(r10)     // Catch:{ all -> 0x02bb }
            com.google.android.gms.internal.ads.zzdw.zzd(r9, r10)     // Catch:{ all -> 0x02bb }
            com.google.android.gms.internal.ads.zzpw r9 = new com.google.android.gms.internal.ads.zzpw     // Catch:{ all -> 0x02bb }
            r9.<init>(r1, r12)     // Catch:{ all -> 0x02bb }
            com.google.android.gms.internal.ads.zzpy r1 = r9.zzc(r3)     // Catch:{ all -> 0x02bb }
            goto L_0x00b3
        L_0x007a:
            com.google.android.gms.internal.ads.zzqn r10 = r3.zza     // Catch:{ IOException -> 0x02b4, RuntimeException -> 0x02b2 }
            java.util.Objects.requireNonNull(r10)
            java.lang.String r10 = r10.zza     // Catch:{ IOException -> 0x02b4, RuntimeException -> 0x02b2 }
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x02b4, RuntimeException -> 0x02b2 }
            java.lang.String r1 = r1.concat(r11)     // Catch:{ IOException -> 0x02b4, RuntimeException -> 0x02b2 }
            android.os.Trace.beginSection(r1)     // Catch:{ IOException -> 0x02b4, RuntimeException -> 0x02b2 }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r10)     // Catch:{ IOException -> 0x02b4, RuntimeException -> 0x02b2 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x02b4, RuntimeException -> 0x02b2 }
            java.lang.String r10 = "configureCodec"
            android.os.Trace.beginSection(r10)     // Catch:{ IOException -> 0x02af, RuntimeException -> 0x02ad }
            android.media.MediaFormat r10 = r3.zzb     // Catch:{ IOException -> 0x02af, RuntimeException -> 0x02ad }
            android.view.Surface r11 = r3.zzd     // Catch:{ IOException -> 0x02af, RuntimeException -> 0x02ad }
            r1.configure(r10, r11, r9, r12)     // Catch:{ IOException -> 0x02af, RuntimeException -> 0x02ad }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x02af, RuntimeException -> 0x02ad }
            java.lang.String r10 = "startCodec"
            android.os.Trace.beginSection(r10)     // Catch:{ IOException -> 0x02af, RuntimeException -> 0x02ad }
            r1.start()     // Catch:{ IOException -> 0x02af, RuntimeException -> 0x02ad }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x02af, RuntimeException -> 0x02ad }
            com.google.android.gms.internal.ads.zzrh r10 = new com.google.android.gms.internal.ads.zzrh     // Catch:{ IOException -> 0x02af, RuntimeException -> 0x02ad }
            r10.<init>(r1, r9)     // Catch:{ IOException -> 0x02af, RuntimeException -> 0x02ad }
            r1 = r10
        L_0x00b3:
            r8.zzw = r1     // Catch:{ all -> 0x02bb }
            android.os.Trace.endSection()
            long r9 = android.os.SystemClock.elapsedRealtime()
            r8.zzD = r0
            r8.zzA = r4
            com.google.android.gms.internal.ads.zzaf r1 = r8.zzp
            r8.zzx = r1
            int r1 = com.google.android.gms.internal.ads.zzen.zza
            java.lang.String r4 = "OMX.Exynos.avc.dec.secure"
            r11 = 25
            r13 = 2
            if (r1 > r11) goto L_0x00fd
            boolean r1 = r4.equals(r2)
            if (r1 == 0) goto L_0x00fd
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzd
            java.lang.String r15 = "SM-T585"
            boolean r1 = r1.startsWith(r15)
            if (r1 != 0) goto L_0x00fb
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzd
            java.lang.String r15 = "SM-A510"
            boolean r1 = r1.startsWith(r15)
            if (r1 != 0) goto L_0x00fb
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzd
            java.lang.String r15 = "SM-A520"
            boolean r1 = r1.startsWith(r15)
            if (r1 != 0) goto L_0x00fb
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzd
            java.lang.String r15 = "SM-J700"
            boolean r1 = r1.startsWith(r15)
            if (r1 == 0) goto L_0x00fd
        L_0x00fb:
            r1 = r13
            goto L_0x013e
        L_0x00fd:
            int r1 = com.google.android.gms.internal.ads.zzen.zza
            r15 = 24
            if (r1 >= r15) goto L_0x013d
            java.lang.String r1 = "OMX.Nvidia.h264.decode"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0113
            java.lang.String r1 = "OMX.Nvidia.h264.decode.secure"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x013d
        L_0x0113:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r15 = "flounder"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x013b
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r15 = "flounder_lte"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x013b
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r15 = "grouper"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x013b
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r15 = "tilapia"
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x013d
        L_0x013b:
            r1 = 1
            goto L_0x013e
        L_0x013d:
            r1 = r12
        L_0x013e:
            r8.zzE = r1
            com.google.android.gms.internal.ads.zzaf r1 = r8.zzx
            int r15 = com.google.android.gms.internal.ads.zzen.zza
            r12 = 21
            if (r15 >= r12) goto L_0x015a
            java.util.List r1 = r1.zzo
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x015a
            java.lang.String r1 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x015a
            r1 = 1
            goto L_0x015b
        L_0x015a:
            r1 = 0
        L_0x015b:
            r8.zzF = r1
            int r1 = com.google.android.gms.internal.ads.zzen.zza
            r15 = 19
            if (r1 != r15) goto L_0x017d
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzd
            java.lang.String r14 = "SM-G800"
            boolean r1 = r1.startsWith(r14)
            if (r1 == 0) goto L_0x017d
            java.lang.String r1 = "OMX.Exynos.avc.dec"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x017b
            boolean r1 = r4.equals(r2)
            if (r1 == 0) goto L_0x017d
        L_0x017b:
            r1 = 1
            goto L_0x017e
        L_0x017d:
            r1 = 0
        L_0x017e:
            r8.zzG = r1
            int r1 = com.google.android.gms.internal.ads.zzen.zza
            r4 = 29
            if (r1 != r4) goto L_0x0190
            java.lang.String r1 = "c2.android.aac.decoder"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0190
            r1 = 1
            goto L_0x0191
        L_0x0190:
            r1 = 0
        L_0x0191:
            r8.zzH = r1
            int r1 = com.google.android.gms.internal.ads.zzen.zza
            if (r1 > r5) goto L_0x01a2
            java.lang.String r1 = "OMX.google.vorbis.decoder"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            r1 = 1
            goto L_0x01cc
        L_0x01a2:
            int r1 = com.google.android.gms.internal.ads.zzen.zza
            if (r1 > r15) goto L_0x01cb
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r5 = "hb2000"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x01ba
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r5 = "stvm8"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x01cb
        L_0x01ba:
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01a0
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01cb
            goto L_0x01a0
        L_0x01cb:
            r1 = 0
        L_0x01cc:
            r8.zzI = r1
            int r1 = com.google.android.gms.internal.ads.zzen.zza
            if (r1 != r12) goto L_0x01dc
            java.lang.String r1 = "OMX.google.aac.decoder"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01dc
            r1 = 1
            goto L_0x01dd
        L_0x01dc:
            r1 = 0
        L_0x01dd:
            r8.zzJ = r1
            int r1 = com.google.android.gms.internal.ads.zzen.zza
            if (r1 >= r12) goto L_0x0233
            java.lang.String r1 = "OMX.SEC.mp3.dec"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0233
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzc
            java.lang.String r5 = "samsung"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0233
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r5 = "baffin"
            boolean r1 = r1.startsWith(r5)
            if (r1 != 0) goto L_0x0231
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r5 = "grand"
            boolean r1 = r1.startsWith(r5)
            if (r1 != 0) goto L_0x0231
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r5 = "fortuna"
            boolean r1 = r1.startsWith(r5)
            if (r1 != 0) goto L_0x0231
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r5 = "gprimelte"
            boolean r1 = r1.startsWith(r5)
            if (r1 != 0) goto L_0x0231
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r5 = "j2y18lte"
            boolean r1 = r1.startsWith(r5)
            if (r1 != 0) goto L_0x0231
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r5 = "ms01"
            boolean r1 = r1.startsWith(r5)
            if (r1 == 0) goto L_0x0233
        L_0x0231:
            r1 = 1
            goto L_0x0234
        L_0x0233:
            r1 = 0
        L_0x0234:
            r8.zzK = r1
            java.lang.String r1 = r0.zza
            int r5 = com.google.android.gms.internal.ads.zzen.zza
            if (r5 > r11) goto L_0x0247
            java.lang.String r5 = "OMX.rk.video_decoder.avc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0245
            goto L_0x0247
        L_0x0245:
            r12 = 1
            goto L_0x0275
        L_0x0247:
            int r5 = com.google.android.gms.internal.ads.zzen.zza
            if (r5 > r4) goto L_0x025b
            java.lang.String r4 = "OMX.broadcom.video_decoder.tunnel"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0245
            java.lang.String r4 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0245
        L_0x025b:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzc
            java.lang.String r4 = "Amazon"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0274
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.zzd
            java.lang.String r4 = "AFTS"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0274
            boolean r1 = r0.zzf
            if (r1 == 0) goto L_0x0274
            goto L_0x0245
        L_0x0274:
            r12 = 0
        L_0x0275:
            r8.zzN = r12
            com.google.android.gms.internal.ads.zzql r1 = r8.zzw
            r1.zzr()
            java.lang.String r0 = r0.zza
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x028d
            com.google.android.gms.internal.ads.zzqg r0 = new com.google.android.gms.internal.ads.zzqg
            r0.<init>()
            r8.zzO = r0
        L_0x028d:
            int r0 = r16.zzbe()
            if (r0 != r13) goto L_0x029c
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r4
            r8.zzP = r0
        L_0x029c:
            com.google.android.gms.internal.ads.zzgs r0 = r8.zza
            int r1 = r0.zza
            r4 = 1
            int r1 = r1 + r4
            r0.zza = r1
            long r6 = r9 - r6
            r1 = r16
            r4 = r9
            r1.zzY(r2, r3, r4, r6)
            return
        L_0x02ad:
            r0 = move-exception
            goto L_0x02b0
        L_0x02af:
            r0 = move-exception
        L_0x02b0:
            r9 = r1
            goto L_0x02b5
        L_0x02b2:
            r0 = move-exception
            goto L_0x02b5
        L_0x02b4:
            r0 = move-exception
        L_0x02b5:
            if (r9 == 0) goto L_0x02ba
            r9.release()     // Catch:{ all -> 0x02bb }
        L_0x02ba:
            throw r0     // Catch:{ all -> 0x02bb }
        L_0x02bb:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqq.zzaw(com.google.android.gms.internal.ads.zzqn, android.media.MediaCrypto):void");
    }

    private final void zzay() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    private final void zzaz() {
        this.zzR = -1;
        this.zzS = null;
    }

    public void zzD(float f, float f2) throws zzha {
        this.zzu = f;
        this.zzv = f2;
        zzaG(this.zzx);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: com.google.android.gms.internal.ads.zzql} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: android.media.MediaFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v25, resolved type: com.google.android.gms.internal.ads.zzaf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v96, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v98, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v34, resolved type: com.google.android.gms.internal.ads.zzaf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v35, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX WARNING: type inference failed for: r19v0 */
    /* JADX WARNING: type inference failed for: r19v1 */
    /* JADX WARNING: type inference failed for: r19v3 */
    /* JADX WARNING: type inference failed for: r19v6 */
    /* JADX WARNING: type inference failed for: r19v16 */
    /* JADX WARNING: type inference failed for: r19v19 */
    /* JADX WARNING: type inference failed for: r19v20 */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:175|176|177|178|179|(1:181)|182|183|268|(1:203)|207|218|219) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:94|95|(1:97)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0276, code lost:
        if (r15.zzq != null) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02c4, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        zzax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02c7, code lost:
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02c9, code lost:
        r19 = r19;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02cb, code lost:
        if (r15.zzai != false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02cd, code lost:
        zzap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02d0, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02d1, code lost:
        r2 = r21;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02d4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02d5, code lost:
        r2 = true;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0345, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0346, code lost:
        r1 = r15;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0390, code lost:
        r1.zzX(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0395, code lost:
        if (com.google.android.gms.internal.ads.zzen.zza < 21) goto L_0x03a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03a4, code lost:
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x03a6, code lost:
        r14 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x03a8, code lost:
        if (r14 != false) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x03aa, code lost:
        zzap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x03bb, code lost:
        throw r1.zzbg(r1.zzak(r0, r1.zzD), r1.zzp, r14, 4003);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r15.zzai = true;
        r13 = false;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012b, code lost:
        r2 = true;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x015b, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        zzax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0160, code lost:
        if (r15.zzai != false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0162, code lost:
        zzap();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x02c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x015b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0175 A[Catch:{ IllegalStateException -> 0x036b }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ae A[Catch:{ IllegalStateException -> 0x036b }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0325 A[Catch:{ IllegalStateException -> 0x0368 }, LOOP:2: B:85:0x0144->B:201:0x0325, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0330 A[Catch:{ IllegalStateException -> 0x0368 }, LOOP:4: B:203:0x0330->B:206:0x033a, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x032d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0324 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzL(long r24, long r26) throws com.google.android.gms.internal.ads.zzha {
        /*
            r23 = this;
            r15 = r23
            r14 = 1
            r13 = 0
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x000c
            r23.zzae()     // Catch:{ IllegalStateException -> 0x036b }
            return
        L_0x000c:
            com.google.android.gms.internal.ads.zzaf r0 = r15.zzp     // Catch:{ IllegalStateException -> 0x036b }
            r11 = 2
            if (r0 != 0) goto L_0x0019
            boolean r0 = r15.zzaE(r11)     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            r23.zzan()     // Catch:{ IllegalStateException -> 0x036b }
            boolean r0 = r15.zzV     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = "bypassRender"
            int r1 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ IllegalStateException -> 0x036b }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x036b }
        L_0x0027:
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x036b }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzdd.zzf(r0)     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzqf r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x036b }
            boolean r1 = r0.zzp()     // Catch:{ IllegalStateException -> 0x036b }
            if (r1 == 0) goto L_0x007b
            java.nio.ByteBuffer r7 = r0.zzb     // Catch:{ IllegalStateException -> 0x036b }
            int r8 = r15.zzR     // Catch:{ IllegalStateException -> 0x036b }
            int r10 = r0.zzl()     // Catch:{ IllegalStateException -> 0x036b }
            long r11 = r0.zzd     // Catch:{ IllegalStateException -> 0x036b }
            boolean r16 = r0.zzf()     // Catch:{ IllegalStateException -> 0x036b }
            r6 = 0
            r9 = 0
            boolean r0 = r0.zzg()     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzaf r4 = r15.zzq     // Catch:{ IllegalStateException -> 0x036b }
            r1 = r23
            r2 = r24
            r17 = r4
            r4 = r26
            r13 = r16
            r14 = r0
            r15 = r17
            boolean r0 = r1.zzaf(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0075 }
            if (r0 == 0) goto L_0x006f
            r15 = r23
            com.google.android.gms.internal.ads.zzqf r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x012e }
            long r0 = r0.zzm()     // Catch:{ IllegalStateException -> 0x012e }
            r15.zzao(r0)     // Catch:{ IllegalStateException -> 0x012e }
            com.google.android.gms.internal.ads.zzqf r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x012e }
            r0.zzb()     // Catch:{ IllegalStateException -> 0x012e }
            goto L_0x007b
        L_0x006f:
            r15 = r23
            r13 = 0
            r14 = 1
            goto L_0x0121
        L_0x0075:
            r0 = move-exception
            r2 = 1
            r19 = 0
            goto L_0x02d6
        L_0x007b:
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x012e }
            if (r0 == 0) goto L_0x0085
            r14 = 1
            r15.zzai = r14     // Catch:{ IllegalStateException -> 0x012a }
            r13 = 0
            goto L_0x0121
        L_0x0085:
            r14 = 1
            boolean r0 = r15.zzW     // Catch:{ IllegalStateException -> 0x012a }
            if (r0 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.zzqf r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x012a }
            com.google.android.gms.internal.ads.zzgi r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x012a }
            boolean r0 = r0.zzo(r1)     // Catch:{ IllegalStateException -> 0x012a }
            com.google.android.gms.internal.ads.zzdd.zzf(r0)     // Catch:{ IllegalStateException -> 0x012a }
            r13 = 0
            r15.zzW = r13     // Catch:{ IllegalStateException -> 0x036b }
            goto L_0x009a
        L_0x0099:
            r13 = 0
        L_0x009a:
            boolean r0 = r15.zzX     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzqf r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x036b }
            boolean r0 = r0.zzp()     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 != 0) goto L_0x0027
            r23.zzT()     // Catch:{ IllegalStateException -> 0x036b }
            r15.zzX = r13     // Catch:{ IllegalStateException -> 0x036b }
            r23.zzan()     // Catch:{ IllegalStateException -> 0x036b }
            boolean r0 = r15.zzV     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x0121
        L_0x00b2:
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x036b }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzdd.zzf(r0)     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzjg r0 = r23.zzh()     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzgi r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x036b }
            r1.zzb()     // Catch:{ IllegalStateException -> 0x036b }
        L_0x00c1:
            com.google.android.gms.internal.ads.zzgi r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x036b }
            r1.zzb()     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzgi r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x036b }
            int r1 = r15.zzbf(r0, r1, r13)     // Catch:{ IllegalStateException -> 0x036b }
            r2 = -5
            if (r1 == r2) goto L_0x0101
            r2 = -4
            if (r1 == r2) goto L_0x00d3
            goto L_0x0104
        L_0x00d3:
            com.google.android.gms.internal.ads.zzgi r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x036b }
            boolean r1 = r1.zzg()     // Catch:{ IllegalStateException -> 0x036b }
            if (r1 == 0) goto L_0x00de
            r15.zzah = r14     // Catch:{ IllegalStateException -> 0x036b }
            goto L_0x0104
        L_0x00de:
            boolean r1 = r15.zzaj     // Catch:{ IllegalStateException -> 0x036b }
            if (r1 == 0) goto L_0x00ef
            com.google.android.gms.internal.ads.zzaf r1 = r15.zzp     // Catch:{ IllegalStateException -> 0x036b }
            java.util.Objects.requireNonNull(r1)
            r15.zzq = r1     // Catch:{ IllegalStateException -> 0x036b }
            r2 = 0
            r15.zzaa(r1, r2)     // Catch:{ IllegalStateException -> 0x036b }
            r15.zzaj = r13     // Catch:{ IllegalStateException -> 0x036b }
        L_0x00ef:
            com.google.android.gms.internal.ads.zzgi r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x036b }
            r1.zzj()     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzqf r1 = r15.zzi     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzgi r2 = r15.zzh     // Catch:{ IllegalStateException -> 0x036b }
            boolean r1 = r1.zzo(r2)     // Catch:{ IllegalStateException -> 0x036b }
            if (r1 != 0) goto L_0x00c1
            r15.zzW = r14     // Catch:{ IllegalStateException -> 0x036b }
            goto L_0x0104
        L_0x0101:
            r15.zzS(r0)     // Catch:{ IllegalStateException -> 0x036b }
        L_0x0104:
            com.google.android.gms.internal.ads.zzqf r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x036b }
            boolean r1 = r0.zzp()     // Catch:{ IllegalStateException -> 0x036b }
            if (r1 == 0) goto L_0x010f
            r0.zzj()     // Catch:{ IllegalStateException -> 0x036b }
        L_0x010f:
            com.google.android.gms.internal.ads.zzqf r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x036b }
            boolean r0 = r0.zzp()     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.zzX     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x0121
            goto L_0x0027
        L_0x0121:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x036b }
            r19 = r13
            r2 = r14
            r1 = r15
            goto L_0x0360
        L_0x012a:
            r0 = move-exception
            r2 = r14
            r1 = r15
            goto L_0x0131
        L_0x012e:
            r0 = move-exception
            r1 = r15
            r2 = 1
        L_0x0131:
            r19 = 0
            goto L_0x0370
        L_0x0135:
            com.google.android.gms.internal.ads.zzql r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x034e
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0348 }
            java.lang.String r0 = "drainAndFeed"
            int r1 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ IllegalStateException -> 0x0348 }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x0348 }
        L_0x0144:
            boolean r0 = r23.zzaD()     // Catch:{ IllegalStateException -> 0x0348 }
            if (r0 != 0) goto L_0x0281
            boolean r0 = r15.zzJ     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x016b
            boolean r0 = r15.zzad     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x016b
            com.google.android.gms.internal.ads.zzql r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x015b }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x015b }
            int r0 = r0.zzb(r1)     // Catch:{ IllegalStateException -> 0x015b }
            goto L_0x0173
        L_0x015b:
            r23.zzax()     // Catch:{ IllegalStateException -> 0x036b }
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x0165
            r23.zzap()     // Catch:{ IllegalStateException -> 0x036b }
        L_0x0165:
            r2 = r9
            r19 = r13
            r1 = r15
            goto L_0x0330
        L_0x016b:
            com.google.android.gms.internal.ads.zzql r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x036b }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x036b }
            int r0 = r0.zzb(r1)     // Catch:{ IllegalStateException -> 0x036b }
        L_0x0173:
            if (r0 >= 0) goto L_0x01ae
            r1 = -2
            if (r0 != r1) goto L_0x019e
            r15.zzae = r14     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzql r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x036b }
            android.media.MediaFormat r0 = r0.zzc()     // Catch:{ IllegalStateException -> 0x036b }
            int r1 = r15.zzE     // Catch:{ IllegalStateException -> 0x036b }
            if (r1 == 0) goto L_0x0199
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x036b }
            r2 = 32
            if (r1 != r2) goto L_0x0199
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x036b }
            if (r1 != r2) goto L_0x0199
            r15.zzM = r14     // Catch:{ IllegalStateException -> 0x036b }
            goto L_0x01b9
        L_0x0199:
            r15.zzy = r0     // Catch:{ IllegalStateException -> 0x036b }
            r15.zzz = r14     // Catch:{ IllegalStateException -> 0x036b }
            goto L_0x01b9
        L_0x019e:
            boolean r0 = r15.zzN     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x0165
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 != 0) goto L_0x01aa
            int r0 = r15.zzaa     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 != r11) goto L_0x0165
        L_0x01aa:
            r23.zzax()     // Catch:{ IllegalStateException -> 0x036b }
            goto L_0x0165
        L_0x01ae:
            boolean r1 = r15.zzM     // Catch:{ IllegalStateException -> 0x036b }
            if (r1 == 0) goto L_0x01c0
            r15.zzM = r13     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzql r1 = r15.zzw     // Catch:{ IllegalStateException -> 0x036b }
            r1.zzn(r0, r13)     // Catch:{ IllegalStateException -> 0x036b }
        L_0x01b9:
            r2 = r9
            r0 = r11
            r19 = r13
            r1 = r15
            goto L_0x031e
        L_0x01c0:
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x036b }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x036b }
            if (r1 != 0) goto L_0x01d2
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x036b }
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x036b }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x01d2
            r23.zzax()     // Catch:{ IllegalStateException -> 0x036b }
            goto L_0x0165
        L_0x01d2:
            r15.zzR = r0     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzql r1 = r15.zzw     // Catch:{ IllegalStateException -> 0x036b }
            java.nio.ByteBuffer r0 = r1.zzg(r0)     // Catch:{ IllegalStateException -> 0x036b }
            r15.zzS = r0     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x01f3
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x036b }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x036b }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x036b }
            java.nio.ByteBuffer r0 = r15.zzS     // Catch:{ IllegalStateException -> 0x036b }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x036b }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x036b }
            android.media.MediaCodec$BufferInfo r2 = r15.zzl     // Catch:{ IllegalStateException -> 0x036b }
            int r2 = r2.size     // Catch:{ IllegalStateException -> 0x036b }
            int r1 = r1 + r2
            r0.limit(r1)     // Catch:{ IllegalStateException -> 0x036b }
        L_0x01f3:
            boolean r0 = r15.zzK     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x0218
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x036b }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x036b }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0218
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x036b }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x036b }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0218
            long r0 = r15.zzaf     // Catch:{ IllegalStateException -> 0x036b }
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0218
            android.media.MediaCodec$BufferInfo r2 = r15.zzl     // Catch:{ IllegalStateException -> 0x036b }
            r2.presentationTimeUs = r0     // Catch:{ IllegalStateException -> 0x036b }
        L_0x0218:
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x036b }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x036b }
            java.util.ArrayList r2 = r15.zzk     // Catch:{ IllegalStateException -> 0x036b }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x036b }
            r3 = r13
        L_0x0223:
            if (r3 >= r2) goto L_0x023f
            java.util.ArrayList r4 = r15.zzk     // Catch:{ IllegalStateException -> 0x036b }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x036b }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x036b }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x036b }
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x023c
            java.util.ArrayList r0 = r15.zzk     // Catch:{ IllegalStateException -> 0x036b }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x036b }
            r0 = r14
            goto L_0x0240
        L_0x023c:
            int r3 = r3 + 1
            goto L_0x0223
        L_0x023f:
            r0 = r13
        L_0x0240:
            r15.zzT = r0     // Catch:{ IllegalStateException -> 0x036b }
            long r0 = r15.zzag     // Catch:{ IllegalStateException -> 0x036b }
            android.media.MediaCodec$BufferInfo r2 = r15.zzl     // Catch:{ IllegalStateException -> 0x036b }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x036b }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x024e
            r0 = r14
            goto L_0x024f
        L_0x024e:
            r0 = r13
        L_0x024f:
            r15.zzU = r0     // Catch:{ IllegalStateException -> 0x036b }
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x036b }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzek r2 = r15.zzj     // Catch:{ IllegalStateException -> 0x036b }
            java.lang.Object r0 = r2.zzc(r0)     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzaf r0 = (com.google.android.gms.internal.ads.zzaf) r0     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 != 0) goto L_0x026b
            boolean r1 = r15.zzz     // Catch:{ IllegalStateException -> 0x036b }
            if (r1 == 0) goto L_0x026b
            com.google.android.gms.internal.ads.zzek r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x036b }
            java.lang.Object r0 = r0.zzb()     // Catch:{ IllegalStateException -> 0x036b }
            com.google.android.gms.internal.ads.zzaf r0 = (com.google.android.gms.internal.ads.zzaf) r0     // Catch:{ IllegalStateException -> 0x036b }
        L_0x026b:
            if (r0 == 0) goto L_0x0270
            r15.zzq = r0     // Catch:{ IllegalStateException -> 0x036b }
            goto L_0x0278
        L_0x0270:
            boolean r0 = r15.zzz     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x0281
            com.google.android.gms.internal.ads.zzaf r0 = r15.zzq     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x0281
        L_0x0278:
            com.google.android.gms.internal.ads.zzaf r0 = r15.zzq     // Catch:{ IllegalStateException -> 0x036b }
            android.media.MediaFormat r1 = r15.zzy     // Catch:{ IllegalStateException -> 0x036b }
            r15.zzaa(r0, r1)     // Catch:{ IllegalStateException -> 0x036b }
            r15.zzz = r13     // Catch:{ IllegalStateException -> 0x036b }
        L_0x0281:
            boolean r0 = r15.zzJ     // Catch:{ IllegalStateException -> 0x0348 }
            if (r0 == 0) goto L_0x02da
            boolean r0 = r15.zzad     // Catch:{ IllegalStateException -> 0x036b }
            if (r0 == 0) goto L_0x02da
            com.google.android.gms.internal.ads.zzql r6 = r15.zzw     // Catch:{ IllegalStateException -> 0x02c0 }
            java.nio.ByteBuffer r7 = r15.zzS     // Catch:{ IllegalStateException -> 0x02c0 }
            int r8 = r15.zzR     // Catch:{ IllegalStateException -> 0x02c0 }
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x02c0 }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x02c0 }
            r12 = 1
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x02c0 }
            long r4 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02c0 }
            boolean r2 = r15.zzT     // Catch:{ IllegalStateException -> 0x02c0 }
            boolean r3 = r15.zzU     // Catch:{ IllegalStateException -> 0x02c0 }
            com.google.android.gms.internal.ads.zzaf r1 = r15.zzq     // Catch:{ IllegalStateException -> 0x02c0 }
            r16 = r1
            r1 = r23
            r17 = r2
            r18 = r3
            r2 = r24
            r19 = r4
            r4 = r26
            r21 = r9
            r9 = r0
            r10 = r12
            r0 = r11
            r11 = r19
            r19 = r13
            r13 = r17
            r14 = r18
            r15 = r16
            boolean r1 = r1.zzaf(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02c4 }
            goto L_0x0302
        L_0x02c0:
            r21 = r9
            r19 = r13
        L_0x02c4:
            r23.zzax()     // Catch:{ IllegalStateException -> 0x02d4 }
            r15 = r23
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x0345 }
            if (r0 == 0) goto L_0x02d0
            r23.zzap()     // Catch:{ IllegalStateException -> 0x0345 }
        L_0x02d0:
            r1 = r15
        L_0x02d1:
            r2 = r21
            goto L_0x0330
        L_0x02d4:
            r0 = move-exception
            r2 = 1
        L_0x02d6:
            r1 = r23
            goto L_0x0370
        L_0x02da:
            r21 = r9
            r0 = r11
            r19 = r13
            com.google.android.gms.internal.ads.zzql r6 = r15.zzw     // Catch:{ IllegalStateException -> 0x0345 }
            java.nio.ByteBuffer r7 = r15.zzS     // Catch:{ IllegalStateException -> 0x0345 }
            int r8 = r15.zzR     // Catch:{ IllegalStateException -> 0x0345 }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0345 }
            int r9 = r1.flags     // Catch:{ IllegalStateException -> 0x0345 }
            r10 = 1
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0345 }
            long r11 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0345 }
            boolean r13 = r15.zzT     // Catch:{ IllegalStateException -> 0x0345 }
            boolean r14 = r15.zzU     // Catch:{ IllegalStateException -> 0x0345 }
            com.google.android.gms.internal.ads.zzaf r4 = r15.zzq     // Catch:{ IllegalStateException -> 0x0345 }
            r1 = r23
            r2 = r24
            r16 = r4
            r4 = r26
            r15 = r16
            boolean r1 = r1.zzaf(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0341 }
        L_0x0302:
            if (r1 == 0) goto L_0x032d
            r1 = r23
            android.media.MediaCodec$BufferInfo r2 = r1.zzl     // Catch:{ IllegalStateException -> 0x0368 }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0368 }
            r1.zzao(r2)     // Catch:{ IllegalStateException -> 0x0368 }
            android.media.MediaCodec$BufferInfo r2 = r1.zzl     // Catch:{ IllegalStateException -> 0x0368 }
            int r2 = r2.flags     // Catch:{ IllegalStateException -> 0x0368 }
            r23.zzaz()     // Catch:{ IllegalStateException -> 0x0368 }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x031c
            r23.zzax()     // Catch:{ IllegalStateException -> 0x0368 }
            goto L_0x02d1
        L_0x031c:
            r2 = r21
        L_0x031e:
            boolean r4 = r1.zzaF(r2)     // Catch:{ IllegalStateException -> 0x0368 }
            if (r4 != 0) goto L_0x0325
            goto L_0x0330
        L_0x0325:
            r11 = r0
            r15 = r1
            r9 = r2
            r13 = r19
            r14 = 1
            goto L_0x0144
        L_0x032d:
            r1 = r23
            goto L_0x02d1
        L_0x0330:
            boolean r0 = r23.zzaC()     // Catch:{ IllegalStateException -> 0x0368 }
            if (r0 == 0) goto L_0x033c
            boolean r0 = r1.zzaF(r2)     // Catch:{ IllegalStateException -> 0x0368 }
            if (r0 != 0) goto L_0x0330
        L_0x033c:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0368 }
            r2 = 1
            goto L_0x0360
        L_0x0341:
            r0 = move-exception
            r1 = r23
            goto L_0x0369
        L_0x0345:
            r0 = move-exception
            r1 = r15
            goto L_0x0369
        L_0x0348:
            r0 = move-exception
            r19 = r13
            r1 = r15
            r2 = r14
            goto L_0x0370
        L_0x034e:
            r19 = r13
            r1 = r15
            com.google.android.gms.internal.ads.zzgs r0 = r1.zza     // Catch:{ IllegalStateException -> 0x0368 }
            int r2 = r0.zzd     // Catch:{ IllegalStateException -> 0x0368 }
            int r3 = r23.zzd(r24)     // Catch:{ IllegalStateException -> 0x0368 }
            int r2 = r2 + r3
            r0.zzd = r2     // Catch:{ IllegalStateException -> 0x0368 }
            r2 = 1
            r1.zzaE(r2)     // Catch:{ IllegalStateException -> 0x0366 }
        L_0x0360:
            com.google.android.gms.internal.ads.zzgs r0 = r1.zza     // Catch:{ IllegalStateException -> 0x0366 }
            r0.zza()     // Catch:{ IllegalStateException -> 0x0366 }
            return
        L_0x0366:
            r0 = move-exception
            goto L_0x0370
        L_0x0368:
            r0 = move-exception
        L_0x0369:
            r2 = 1
            goto L_0x0370
        L_0x036b:
            r0 = move-exception
            r19 = r13
            r2 = r14
            r1 = r15
        L_0x0370:
            int r3 = com.google.android.gms.internal.ads.zzen.zza
            r4 = 21
            if (r3 < r4) goto L_0x037b
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x037b
            goto L_0x0390
        L_0x037b:
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()
            int r5 = r3.length
            if (r5 <= 0) goto L_0x03bc
            r3 = r3[r19]
            java.lang.String r3 = r3.getClassName()
            java.lang.String r5 = "android.media.MediaCodec"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03bc
        L_0x0390:
            r1.zzX(r0)
            int r3 = com.google.android.gms.internal.ads.zzen.zza
            if (r3 < r4) goto L_0x03a6
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x03a6
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r3 = r3.isRecoverable()
            if (r3 == 0) goto L_0x03a6
            r14 = r2
            goto L_0x03a8
        L_0x03a6:
            r14 = r19
        L_0x03a8:
            if (r14 == 0) goto L_0x03ad
            r23.zzap()
        L_0x03ad:
            com.google.android.gms.internal.ads.zzqn r2 = r1.zzD
            com.google.android.gms.internal.ads.zzqm r0 = r1.zzak(r0, r2)
            com.google.android.gms.internal.ads.zzaf r2 = r1.zzp
            r3 = 4003(0xfa3, float:5.61E-42)
            com.google.android.gms.internal.ads.zzha r0 = r1.zzbg(r0, r2, r14, r3)
            throw r0
        L_0x03bc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqq.zzL(long, long):void");
    }

    public boolean zzM() {
        return this.zzai;
    }

    public boolean zzN() {
        if (this.zzp != null) {
            if (zzI() || zzaD()) {
                return true;
            }
            if (this.zzP != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzP) {
                return true;
            }
        }
        return false;
    }

    public final int zzO(zzaf zzaf2) throws zzha {
        try {
            return zzQ(this.zzd, zzaf2);
        } catch (zzqz e) {
            throw zzbg(e, zzaf2, false, 4002);
        }
    }

    /* access modifiers changed from: protected */
    public float zzP(float f, zzaf zzaf2, zzaf[] zzafArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract int zzQ(zzqs zzqs, zzaf zzaf2) throws zzqz;

    /* access modifiers changed from: protected */
    public zzgt zzR(zzqn zzqn, zzaf zzaf2, zzaf zzaf3) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (zzaB() == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (zzaB() == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009a, code lost:
        if (zzaB() == false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cf A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzgt zzS(com.google.android.gms.internal.ads.zzjg r13) throws com.google.android.gms.internal.ads.zzha {
        /*
            r12 = this;
            r0 = 1
            r12.zzaj = r0
            com.google.android.gms.internal.ads.zzaf r4 = r13.zza
            java.util.Objects.requireNonNull(r4)
            java.lang.String r1 = r4.zzm
            r2 = 0
            if (r1 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzpr r13 = r13.zzb
            r12.zzao = r13
            r12.zzp = r4
            boolean r1 = r12.zzV
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r12.zzX = r0
            return r3
        L_0x001b:
            com.google.android.gms.internal.ads.zzql r1 = r12.zzw
            if (r1 != 0) goto L_0x0025
            r12.zzB = r3
            r12.zzan()
            return r3
        L_0x0025:
            com.google.android.gms.internal.ads.zzqn r3 = r12.zzD
            com.google.android.gms.internal.ads.zzaf r5 = r12.zzx
            com.google.android.gms.internal.ads.zzpr r6 = r12.zzan
            r7 = 23
            if (r6 != r13) goto L_0x00d0
            if (r13 == r6) goto L_0x0038
            int r8 = com.google.android.gms.internal.ads.zzen.zza
            if (r8 < r7) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r2
            goto L_0x0039
        L_0x0038:
            r7 = r0
        L_0x0039:
            com.google.android.gms.internal.ads.zzdd.zzf(r7)
            com.google.android.gms.internal.ads.zzgt r7 = r12.zzR(r3, r5, r4)
            int r8 = r7.zzd
            r9 = 3
            r10 = 16
            r11 = 2
            if (r8 == 0) goto L_0x00b3
            if (r8 == r0) goto L_0x008a
            if (r8 == r11) goto L_0x005e
            boolean r0 = r12.zzaG(r4)
            if (r0 != 0) goto L_0x0053
            goto L_0x0090
        L_0x0053:
            r12.zzx = r4
            if (r13 == r6) goto L_0x00b6
            boolean r13 = r12.zzaB()
            if (r13 != 0) goto L_0x00b6
            goto L_0x009c
        L_0x005e:
            boolean r8 = r12.zzaG(r4)
            if (r8 != 0) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            r12.zzY = r0
            r12.zzZ = r0
            int r8 = r12.zzE
            if (r8 == r11) goto L_0x007d
            if (r8 != r0) goto L_0x007c
            int r8 = r4.zzr
            int r10 = r5.zzr
            if (r8 != r10) goto L_0x007c
            int r8 = r4.zzs
            int r10 = r5.zzs
            if (r8 != r10) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r0 = r2
        L_0x007d:
            r12.zzL = r0
            r12.zzx = r4
            if (r13 == r6) goto L_0x00b6
            boolean r13 = r12.zzaB()
            if (r13 != 0) goto L_0x00b6
            goto L_0x009c
        L_0x008a:
            boolean r8 = r12.zzaG(r4)
            if (r8 != 0) goto L_0x0092
        L_0x0090:
            r6 = r10
            goto L_0x00b7
        L_0x0092:
            r12.zzx = r4
            if (r13 == r6) goto L_0x009e
            boolean r13 = r12.zzaB()
            if (r13 != 0) goto L_0x00b6
        L_0x009c:
            r6 = r11
            goto L_0x00b7
        L_0x009e:
            boolean r13 = r12.zzac
            if (r13 == 0) goto L_0x00b6
            r12.zzaa = r0
            boolean r13 = r12.zzG
            if (r13 != 0) goto L_0x00b0
            boolean r13 = r12.zzI
            if (r13 == 0) goto L_0x00ad
            goto L_0x00b0
        L_0x00ad:
            r12.zzab = r0
            goto L_0x00b6
        L_0x00b0:
            r12.zzab = r9
            goto L_0x009c
        L_0x00b3:
            r12.zzU()
        L_0x00b6:
            r6 = r2
        L_0x00b7:
            int r13 = r7.zzd
            if (r13 == 0) goto L_0x00cf
            com.google.android.gms.internal.ads.zzql r13 = r12.zzw
            if (r13 != r1) goto L_0x00c3
            int r13 = r12.zzab
            if (r13 != r9) goto L_0x00cf
        L_0x00c3:
            com.google.android.gms.internal.ads.zzgt r13 = new com.google.android.gms.internal.ads.zzgt
            java.lang.String r2 = r3.zza
            r0 = 0
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00cf:
            return r7
        L_0x00d0:
            if (r13 == 0) goto L_0x00ea
            if (r6 != 0) goto L_0x00d5
            goto L_0x00ea
        L_0x00d5:
            int r13 = com.google.android.gms.internal.ads.zzen.zza
            if (r13 < r7) goto L_0x00ea
            java.util.UUID r13 = com.google.android.gms.internal.ads.zzo.zze
            java.util.UUID r0 = com.google.android.gms.internal.ads.zzo.zza
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00ea
            java.util.UUID r13 = com.google.android.gms.internal.ads.zzo.zze
            java.util.UUID r0 = com.google.android.gms.internal.ads.zzo.zza
            r13.equals(r0)
        L_0x00ea:
            r12.zzU()
            com.google.android.gms.internal.ads.zzgt r13 = new com.google.android.gms.internal.ads.zzgt
            java.lang.String r2 = r3.zza
            r0 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00fb:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.zzha r13 = r12.zzbg(r13, r4, r2, r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqq.zzS(com.google.android.gms.internal.ads.zzjg):com.google.android.gms.internal.ads.zzgt");
    }

    /* access modifiers changed from: protected */
    public abstract zzqj zzV(zzqn zzqn, zzaf zzaf2, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    public abstract List zzW(zzqs zzqs, zzaf zzaf2, boolean z) throws zzqz;

    /* access modifiers changed from: protected */
    public void zzX(Exception exc) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzY(String str, zzqj zzqj, long j, long j2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzZ(String str) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzaa(zzaf zzaf2, MediaFormat mediaFormat) throws zzha {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzac() {
    }

    /* access modifiers changed from: protected */
    public void zzad(zzgi zzgi) throws zzha {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzae() throws zzha {
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzaf(long j, long j2, zzql zzql, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzaf2) throws zzha;

    /* access modifiers changed from: protected */
    public boolean zzag(zzaf zzaf2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final float zzah() {
        return this.zzu;
    }

    /* access modifiers changed from: protected */
    public final long zzai() {
        return this.zzal;
    }

    /* access modifiers changed from: protected */
    public final zzql zzaj() {
        return this.zzw;
    }

    /* access modifiers changed from: protected */
    public zzqm zzak(Throwable th, zzqn zzqn) {
        return new zzqm(th, zzqn);
    }

    /* access modifiers changed from: protected */
    public final zzqn zzal() {
        return this.zzD;
    }

    /* access modifiers changed from: protected */
    public void zzam(zzgi zzgi) throws zzha {
    }

    /* access modifiers changed from: protected */
    public final void zzan() throws zzha {
        zzaf zzaf2;
        if (this.zzw == null && !this.zzV && (zzaf2 = this.zzp) != null) {
            if (this.zzao != null || !zzag(zzaf2)) {
                this.zzan = this.zzao;
                String str = this.zzp.zzm;
                if (this.zzan == null || !zzps.zza) {
                    try {
                        if (this.zzB == null) {
                            List zzW2 = zzW(this.zzd, this.zzp, false);
                            zzW2.isEmpty();
                            this.zzB = new ArrayDeque();
                            if (!zzW2.isEmpty()) {
                                this.zzB.add((zzqn) zzW2.get(0));
                            }
                            this.zzC = null;
                        }
                        if (!this.zzB.isEmpty()) {
                            zzqn zzqn = (zzqn) this.zzB.peekFirst();
                            while (this.zzw == null) {
                                zzqn zzqn2 = (zzqn) this.zzB.peekFirst();
                                if (zzau(zzqn2)) {
                                    try {
                                        zzaw(zzqn2, (MediaCrypto) null);
                                    } catch (Exception e) {
                                        if (zzqn2 == zzqn) {
                                            zzdw.zze("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                                            Thread.sleep(50);
                                            zzaw(zzqn2, (MediaCrypto) null);
                                        } else {
                                            throw e;
                                        }
                                    } catch (Exception e2) {
                                        zzdw.zzf("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(String.valueOf(zzqn2))), e2);
                                        this.zzB.removeFirst();
                                        zzqp zzqp = new zzqp(this.zzp, (Throwable) e2, false, zzqn2);
                                        zzX(zzqp);
                                        zzqp zzqp2 = this.zzC;
                                        if (zzqp2 == null) {
                                            this.zzC = zzqp;
                                        } else {
                                            this.zzC = zzqp.zza(zzqp2, zzqp);
                                        }
                                        if (this.zzB.isEmpty()) {
                                            throw this.zzC;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                            this.zzB = null;
                            return;
                        }
                        throw new zzqp(this.zzp, (Throwable) null, false, -49999);
                    } catch (zzqz e3) {
                        throw new zzqp(this.zzp, (Throwable) e3, false, -49998);
                    } catch (zzqp e4) {
                        throw zzbg(e4, this.zzp, false, 4001);
                    }
                } else {
                    zzpi zza2 = this.zzan.zza();
                    throw zzbg(zza2, this.zzp, false, zza2.zza);
                }
            } else {
                zzaf zzaf3 = this.zzp;
                zzT();
                String str2 = zzaf3.zzm;
                if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                    this.zzi.zzn(32);
                } else {
                    this.zzi.zzn(1);
                }
                this.zzV = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzao(long j) {
        while (true) {
            int i = this.zzam;
            if (i != 0 && j >= this.zzo[0]) {
                long[] jArr = this.zzm;
                this.zzak = jArr[0];
                this.zzal = this.zzn[0];
                int i2 = i - 1;
                this.zzam = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.zzn;
                System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
                long[] jArr3 = this.zzo;
                System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
                zzac();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzap() {
        try {
            zzql zzql = this.zzw;
            if (zzql != null) {
                zzql.zzl();
                this.zza.zzb++;
                zzZ(this.zzD.zza);
            }
        } finally {
            this.zzw = null;
            this.zzr = null;
            this.zzan = null;
            zzar();
        }
    }

    /* access modifiers changed from: protected */
    public void zzaq() {
        zzay();
        zzaz();
        this.zzP = -9223372036854775807L;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        zzqg zzqg = this.zzO;
        if (zzqg != null) {
            zzqg.zzc();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public final void zzar() {
        zzaq();
        this.zzO = null;
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzae = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    /* access modifiers changed from: protected */
    public final boolean zzas() throws zzha {
        boolean zzat = zzat();
        if (zzat) {
            zzan();
        }
        return zzat;
    }

    /* access modifiers changed from: protected */
    public final boolean zzat() {
        if (this.zzw == null) {
            return false;
        }
        int i = this.zzab;
        if (i == 3 || this.zzG || ((this.zzH && !this.zzae) || (this.zzI && this.zzad))) {
            zzap();
            return true;
        }
        if (i == 2) {
            zzdd.zzf(zzen.zza >= 23);
            if (zzen.zza >= 23) {
                try {
                    zzaA();
                } catch (zzha e) {
                    zzdw.zzf("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzap();
                    return true;
                }
            }
        }
        zzab();
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean zzau(zzqn zzqn) {
        return true;
    }

    public final int zze() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public void zzs() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzat();
    }

    /* access modifiers changed from: protected */
    public void zzt(boolean z, boolean z2) throws zzha {
        this.zza = new zzgs();
    }

    /* access modifiers changed from: protected */
    public void zzu(long j, boolean z) throws zzha {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzW = false;
        } else {
            zzas();
        }
        zzek zzek = this.zzj;
        if (zzek.zza() > 0) {
            this.zzaj = true;
        }
        zzek.zze();
        int i = this.zzam;
        if (i != 0) {
            int i2 = i - 1;
            this.zzal = this.zzn[i2];
            this.zzak = this.zzm[i2];
            this.zzam = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void zzv() {
        try {
            zzT();
            zzap();
        } finally {
            this.zzao = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzy(zzaf[] zzafArr, long j, long j2) throws zzha {
        boolean z = true;
        if (this.zzal == -9223372036854775807L) {
            if (this.zzak != -9223372036854775807L) {
                z = false;
            }
            zzdd.zzf(z);
            this.zzak = j;
            this.zzal = j2;
            return;
        }
        int i = this.zzam;
        if (i == 10) {
            zzdw.zze("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.zzn[9]);
        } else {
            this.zzam = i + 1;
        }
        long[] jArr = this.zzm;
        int i2 = this.zzam - 1;
        jArr[i2] = j;
        this.zzn[i2] = j2;
        this.zzo[i2] = this.zzaf;
    }

    private final void zzax() throws zzha {
        int i = this.zzab;
        if (i == 1) {
            zzab();
        } else if (i == 2) {
            zzab();
            zzaA();
        } else if (i != 3) {
            this.zzai = true;
            zzae();
        } else {
            zzap();
            zzan();
        }
    }
}
