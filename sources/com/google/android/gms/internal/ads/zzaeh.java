package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaeh {
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public byte[] zzM;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public zzaaq zzS;
    public boolean zzT;
    public boolean zzU = true;
    public zzaap zzV;
    public int zzW;
    /* access modifiers changed from: private */
    public int zzX;
    /* access modifiers changed from: private */
    public String zzY = "eng";
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzaao zzi;
    public byte[] zzj;
    public zzx zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;

    protected zzaeh() {
    }

    private static Pair zzf(zzef zzef) throws zzbu {
        try {
            zzef.zzG(16);
            long zzq2 = zzef.zzq();
            if (zzq2 == 1482049860) {
                return new Pair("video/divx", (Object) null);
            }
            if (zzq2 == 859189832) {
                return new Pair("video/3gpp", (Object) null);
            }
            if (zzq2 == 826496599) {
                int zzc2 = zzef.zzc() + 20;
                byte[] zzH2 = zzef.zzH();
                while (true) {
                    int length = zzH2.length;
                    if (zzc2 >= length - 4) {
                        throw zzbu.zza("Failed to find FourCC VC1 initialization data", (Throwable) null);
                    } else if (zzH2[zzc2] == 0 && zzH2[zzc2 + 1] == 0 && zzH2[zzc2 + 2] == 1 && zzH2[zzc2 + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzH2, zzc2, length)));
                    } else {
                        zzc2++;
                    }
                }
            } else {
                zzdw.zze("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", (Object) null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing FourCC private data", (Throwable) null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbu {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 0;
                int i2 = 1;
                while (true) {
                    b = bArr[i2] & UByte.MAX_VALUE;
                    if (b != 255) {
                        break;
                    }
                    i += 255;
                    i2++;
                }
                int i3 = i2 + 1;
                int i4 = i + b;
                int i5 = 0;
                while (true) {
                    b2 = bArr[i3] & UByte.MAX_VALUE;
                    if (b2 != 255) {
                        break;
                    }
                    i5 += 255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + b2;
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            int length = bArr.length - i9;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i9, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzbu.zza("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw zzbu.zza("Error parsing vorbis codec private", (Throwable) null);
                }
                throw zzbu.zza("Error parsing vorbis codec private", (Throwable) null);
            }
            throw zzbu.zza("Error parsing vorbis codec private", (Throwable) null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing vorbis codec private", (Throwable) null);
        }
    }

    private static boolean zzh(zzef zzef) throws zzbu {
        try {
            int zzi2 = zzef.zzi();
            if (zzi2 == 1) {
                return true;
            }
            if (zzi2 == 65534) {
                zzef.zzF(24);
                return zzef.zzr() == zzaei.zzf.getMostSignificantBits() && zzef.zzr() == zzaei.zzf.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing MS/ACM codec private", (Throwable) null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzbu {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbu.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.google.android.gms.internal.ads.zzq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x024c, code lost:
        r1 = null;
        r2 = null;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0287, code lost:
        r1 = null;
        r2 = null;
        r17 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02b9, code lost:
        r1 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0325, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0326, code lost:
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0345, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0376, code lost:
        r3 = -1;
        r9 = -1;
        r19 = r2;
        r2 = r1;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0396, code lost:
        r1 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0398, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0399, code lost:
        r9 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x039a, code lost:
        r4 = r0.zzM;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x039c, code lost:
        if (r4 == null) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x039e, code lost:
        r4 = com.google.android.gms.internal.ads.zzze.zza(new com.google.android.gms.internal.ads.zzef(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03a7, code lost:
        if (r4 == null) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03a9, code lost:
        r2 = r4.zza;
        r17 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ad, code lost:
        r4 = r17;
        r5 = r0.zzU;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03b3, code lost:
        if (true == r0.zzT) goto L_0x03b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03b5, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b7, code lost:
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03b8, code lost:
        r5 = r5 | r8;
        r8 = new com.google.android.gms.internal.ads.zzad();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03c2, code lost:
        if (com.google.android.gms.internal.ads.zzbt.zzg(r4) == false) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03c4, code lost:
        r8.zzw(r0.zzN);
        r8.zzT(r0.zzP);
        r8.zzN(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03d7, code lost:
        if (com.google.android.gms.internal.ads.zzbt.zzh(r4) == false) goto L_0x055c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03db, code lost:
        if (r0.zzp != 0) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03dd, code lost:
        r6 = r0.zzn;
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03e0, code lost:
        if (r6 != -1) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03e2, code lost:
        r6 = r0.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03e4, code lost:
        r0.zzn = r6;
        r6 = r0.zzo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03e8, code lost:
        if (r6 != -1) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03ea, code lost:
        r6 = r0.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03ec, code lost:
        r0.zzo = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03ef, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03f0, code lost:
        r6 = r0.zzn;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f4, code lost:
        if (r6 == r7) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f6, code lost:
        r11 = r0.zzo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f8, code lost:
        if (r11 == r7) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03fa, code lost:
        r6 = ((float) (r0.zzm * r6)) / ((float) (r0.zzl * r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0404, code lost:
        r6 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0407, code lost:
        if (r0.zzw == false) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x040d, code lost:
        if (r0.zzC == -1.0f) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0413, code lost:
        if (r0.zzD == -1.0f) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0419, code lost:
        if (r0.zzE == -1.0f) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x041f, code lost:
        if (r0.zzF == -1.0f) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0425, code lost:
        if (r0.zzG == -1.0f) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x042b, code lost:
        if (r0.zzH == -1.0f) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0431, code lost:
        if (r0.zzI == -1.0f) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0437, code lost:
        if (r0.zzJ == -1.0f) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x043d, code lost:
        if (r0.zzK == -1.0f) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0443, code lost:
        if (r0.zzL != -1.0f) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0446, code lost:
        r12 = new byte[25];
        r9 = java.nio.ByteBuffer.wrap(r12).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r9.put((byte) 0);
        r9.putShort((short) ((int) ((r0.zzC * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.zzD * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.zzE * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.zzF * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.zzG * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.zzH * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.zzI * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.zzJ * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) (r0.zzK + 0.5f)));
        r9.putShort((short) ((int) (r0.zzL + 0.5f)));
        r9.putShort((short) r0.zzA);
        r9.putShort((short) r0.zzB);
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04c0, code lost:
        r12 = new com.google.android.gms.internal.ads.zzq(r0.zzx, r0.zzz, r0.zzy, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04ce, code lost:
        if (r0.zza == null) goto L_0x04ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04da, code lost:
        if (com.google.android.gms.internal.ads.zzaei.zzg.containsKey(r0.zza) == false) goto L_0x04ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04dc, code lost:
        r7 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzaei.zzg.get(r0.zza)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04ee, code lost:
        if (r0.zzq != 0) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04f7, code lost:
        if (java.lang.Float.compare(r0.zzr, 0.0f) != 0) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04ff, code lost:
        if (java.lang.Float.compare(r0.zzs, 0.0f) != 0) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0507, code lost:
        if (java.lang.Float.compare(r0.zzt, 0.0f) != 0) goto L_0x050a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0512, code lost:
        if (java.lang.Float.compare(r0.zzs, 90.0f) != 0) goto L_0x0517;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0514, code lost:
        r10 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x051f, code lost:
        if (java.lang.Float.compare(r0.zzs, -180.0f) == 0) goto L_0x0539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0529, code lost:
        if (java.lang.Float.compare(r0.zzs, 180.0f) != 0) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0534, code lost:
        if (java.lang.Float.compare(r0.zzs, -90.0f) != 0) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0536, code lost:
        r10 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0539, code lost:
        r10 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x053c, code lost:
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x053d, code lost:
        r8.zzX(r0.zzl);
        r8.zzF(r0.zzm);
        r8.zzP(r6);
        r8.zzR(r10);
        r8.zzQ(r0.zzu);
        r8.zzV(r0.zzv);
        r8.zzy(r12);
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0560, code lost:
        if ("application/x-subrip".equals(r4) != false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0566, code lost:
        if ("text/x-ssa".equals(r4) != false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x056c, code lost:
        if ("text/vtt".equals(r4) != false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0574, code lost:
        if ("application/vobsub".equals(r4) != false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x057c, code lost:
        if ("application/pgs".equals(r4) != false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0584, code lost:
        if ("application/dvbsubs".equals(r4) == false) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x058d, code lost:
        throw com.google.android.gms.internal.ads.zzbu.zza("Unexpected MIME type.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x058e, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0591, code lost:
        if (r0.zza == null) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x059d, code lost:
        if (com.google.android.gms.internal.ads.zzaei.zzg.containsKey(r0.zza) != false) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x059f, code lost:
        r8.zzJ(r0.zza);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05a4, code lost:
        r8.zzG(r22);
        r8.zzS(r4);
        r8.zzL(r3);
        r8.zzK(r0.zzY);
        r8.zzU(r5);
        r8.zzI(r1);
        r8.zzx(r2);
        r8.zzB(r0.zzk);
        r1 = r8.zzY();
        r2 = r21.zzv(r0.zzc, r6);
        r0.zzV = r2;
        r2.zzk(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05d3, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.internal.ads.zzzl r21, int r22) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = r0.zzb
            int r2 = r1.hashCode()
            r4 = 16
            r5 = 32
            r6 = 1
            r8 = 8
            r9 = 4
            r10 = 0
            r11 = 3
            switch(r2) {
                case -2095576542: goto L_0x0185;
                case -2095575984: goto L_0x017b;
                case -1985379776: goto L_0x0170;
                case -1784763192: goto L_0x0165;
                case -1730367663: goto L_0x015a;
                case -1482641358: goto L_0x014f;
                case -1482641357: goto L_0x0144;
                case -1373388978: goto L_0x0139;
                case -933872740: goto L_0x012f;
                case -538363189: goto L_0x0124;
                case -538363109: goto L_0x0119;
                case -425012669: goto L_0x010d;
                case -356037306: goto L_0x0101;
                case 62923557: goto L_0x00f5;
                case 62923603: goto L_0x00ea;
                case 62927045: goto L_0x00de;
                case 82318131: goto L_0x00d3;
                case 82338133: goto L_0x00c8;
                case 82338134: goto L_0x00bd;
                case 99146302: goto L_0x00b1;
                case 444813526: goto L_0x00a5;
                case 542569478: goto L_0x0099;
                case 635596514: goto L_0x008d;
                case 725948237: goto L_0x0081;
                case 725957860: goto L_0x0075;
                case 738597099: goto L_0x0069;
                case 855502857: goto L_0x005e;
                case 1045209816: goto L_0x0052;
                case 1422270023: goto L_0x0046;
                case 1809237540: goto L_0x003b;
                case 1950749482: goto L_0x002f;
                case 1950789798: goto L_0x0023;
                case 1951062397: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x018f
        L_0x0017:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 12
            goto L_0x0190
        L_0x0023:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 22
            goto L_0x0190
        L_0x002f:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 17
            goto L_0x0190
        L_0x003b:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = r11
            goto L_0x0190
        L_0x0046:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 27
            goto L_0x0190
        L_0x0052:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 29
            goto L_0x0190
        L_0x005e:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = r8
            goto L_0x0190
        L_0x0069:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 28
            goto L_0x0190
        L_0x0075:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 24
            goto L_0x0190
        L_0x0081:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 25
            goto L_0x0190
        L_0x008d:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 26
            goto L_0x0190
        L_0x0099:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 20
            goto L_0x0190
        L_0x00a5:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 10
            goto L_0x0190
        L_0x00b1:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 31
            goto L_0x0190
        L_0x00bd:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = r6
            goto L_0x0190
        L_0x00c8:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = r10
            goto L_0x0190
        L_0x00d3:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 2
            goto L_0x0190
        L_0x00de:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 19
            goto L_0x0190
        L_0x00ea:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = r4
            goto L_0x0190
        L_0x00f5:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 13
            goto L_0x0190
        L_0x0101:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 21
            goto L_0x0190
        L_0x010d:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 30
            goto L_0x0190
        L_0x0119:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 7
            goto L_0x0190
        L_0x0124:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 5
            goto L_0x0190
        L_0x012f:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = r5
            goto L_0x0190
        L_0x0139:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 9
            goto L_0x0190
        L_0x0144:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 15
            goto L_0x0190
        L_0x014f:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 14
            goto L_0x0190
        L_0x015a:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 11
            goto L_0x0190
        L_0x0165:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 18
            goto L_0x0190
        L_0x0170:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 23
            goto L_0x0190
        L_0x017b:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = r9
            goto L_0x0190
        L_0x0185:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x018f
            r2 = 6
            goto L_0x0190
        L_0x018f:
            r2 = -1
        L_0x0190:
            java.lang.String r13 = ". Setting mimeType to audio/x-unknown"
            java.lang.String r14 = "text/vtt"
            java.lang.String r15 = "text/x-ssa"
            java.lang.String r7 = "application/x-subrip"
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.String r17 = "audio/raw"
            java.lang.String r18 = "audio/x-unknown"
            java.lang.String r3 = "MatroskaExtractor"
            r12 = 0
            switch(r2) {
                case 0: goto L_0x0394;
                case 1: goto L_0x0391;
                case 2: goto L_0x038e;
                case 3: goto L_0x038b;
                case 4: goto L_0x037e;
                case 5: goto L_0x037e;
                case 6: goto L_0x037e;
                case 7: goto L_0x035f;
                case 8: goto L_0x0347;
                case 9: goto L_0x032e;
                case 10: goto L_0x032a;
                case 11: goto L_0x0319;
                case 12: goto L_0x02d8;
                case 13: goto L_0x02bc;
                case 14: goto L_0x02b7;
                case 15: goto L_0x02b4;
                case 16: goto L_0x02b0;
                case 17: goto L_0x02ac;
                case 18: goto L_0x02a1;
                case 19: goto L_0x029d;
                case 20: goto L_0x029d;
                case 21: goto L_0x0299;
                case 22: goto L_0x028d;
                case 23: goto L_0x0251;
                case 24: goto L_0x022a;
                case 25: goto L_0x0207;
                case 26: goto L_0x01e9;
                case 27: goto L_0x01e5;
                case 28: goto L_0x01d2;
                case 29: goto L_0x01cc;
                case 30: goto L_0x01c0;
                case 31: goto L_0x01bc;
                case 32: goto L_0x01ab;
                default: goto L_0x01a4;
            }
        L_0x01a4:
            java.lang.String r1 = "Unrecognized codec identifier."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r12)
            throw r1
        L_0x01ab:
            byte[] r2 = new byte[r9]
            byte[] r1 = r0.zzi(r1)
            java.lang.System.arraycopy(r1, r10, r2, r10, r9)
            com.google.android.gms.internal.ads.zzfvn r1 = com.google.android.gms.internal.ads.zzfvn.zzp(r2)
            java.lang.String r17 = "application/dvbsubs"
            goto L_0x0345
        L_0x01bc:
            java.lang.String r17 = "application/pgs"
            goto L_0x0396
        L_0x01c0:
            byte[] r1 = r0.zzi(r1)
            com.google.android.gms.internal.ads.zzfvn r1 = com.google.android.gms.internal.ads.zzfvn.zzp(r1)
            java.lang.String r17 = "application/vobsub"
            goto L_0x0345
        L_0x01cc:
            r1 = r12
            r2 = r1
            r17 = r14
            goto L_0x0398
        L_0x01d2:
            byte[] r1 = com.google.android.gms.internal.ads.zzaei.zzc
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            com.google.android.gms.internal.ads.zzfvn r1 = com.google.android.gms.internal.ads.zzfvn.zzq(r1, r2)
            r2 = r12
            r17 = r15
            goto L_0x0398
        L_0x01e5:
            r17 = r7
            goto L_0x0396
        L_0x01e9:
            int r1 = r0.zzO
            if (r1 != r5) goto L_0x01ee
            goto L_0x024c
        L_0x01ee:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported floating point PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r3, r1)
            goto L_0x0287
        L_0x0207:
            int r1 = r0.zzO
            if (r1 != r8) goto L_0x020d
            r9 = r11
            goto L_0x024c
        L_0x020d:
            if (r1 != r4) goto L_0x0212
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x024c
        L_0x0212:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported big endian PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r3, r1)
            goto L_0x0287
        L_0x022a:
            int r1 = r0.zzO
            int r9 = com.google.android.gms.internal.ads.zzen.zzn(r1)
            if (r9 != 0) goto L_0x024c
            int r1 = r0.zzO
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported little endian PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r3, r1)
            goto L_0x0287
        L_0x024c:
            r1 = r12
            r2 = r1
            r3 = -1
            goto L_0x039a
        L_0x0251:
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            byte[] r1 = r0.zzi(r1)
            r2.<init>((byte[]) r1)
            boolean r1 = zzh(r2)
            if (r1 == 0) goto L_0x0282
            int r1 = r0.zzO
            int r9 = com.google.android.gms.internal.ads.zzen.zzn(r1)
            if (r9 != 0) goto L_0x024c
            int r1 = r0.zzO
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzdw.zze(r3, r1)
            goto L_0x0287
        L_0x0282:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            com.google.android.gms.internal.ads.zzdw.zze(r3, r1)
        L_0x0287:
            r1 = r12
            r2 = r1
            r17 = r18
            goto L_0x0398
        L_0x028d:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r17 = "audio/flac"
            goto L_0x0345
        L_0x0299:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x0396
        L_0x029d:
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x0396
        L_0x02a1:
            com.google.android.gms.internal.ads.zzaaq r1 = new com.google.android.gms.internal.ads.zzaaq
            r1.<init>()
            r0.zzS = r1
            java.lang.String r17 = "audio/true-hd"
            goto L_0x0396
        L_0x02ac:
            java.lang.String r17 = "audio/eac3"
            goto L_0x0396
        L_0x02b0:
            java.lang.String r17 = "audio/ac3"
            goto L_0x0396
        L_0x02b4:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x02b9
        L_0x02b7:
            java.lang.String r17 = "audio/mpeg-L2"
        L_0x02b9:
            r1 = r12
            r2 = r1
            goto L_0x0326
        L_0x02bc:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.zzj
            com.google.android.gms.internal.ads.zzyf r2 = com.google.android.gms.internal.ads.zzyg.zza(r2)
            int r3 = r2.zza
            r0.zzP = r3
            int r3 = r2.zzb
            r0.zzN = r3
            java.lang.String r2 = r2.zzc
            java.lang.String r17 = "audio/mp4a-latm"
            goto L_0x0398
        L_0x02d8:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r0.zzQ
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r0.zzR
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r1.add(r2)
            r16 = 5760(0x1680, float:8.071E-42)
            java.lang.String r17 = "audio/opus"
            goto L_0x0325
        L_0x0319:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = zzg(r1)
            r16 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r17 = "audio/vorbis"
        L_0x0325:
            r2 = r12
        L_0x0326:
            r3 = r16
            goto L_0x0399
        L_0x032a:
            java.lang.String r17 = "video/x-unknown"
            goto L_0x0396
        L_0x032e:
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            byte[] r1 = r0.zzi(r1)
            r2.<init>((byte[]) r1)
            android.util.Pair r1 = zzf(r2)
            java.lang.Object r2 = r1.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
        L_0x0345:
            r2 = r12
            goto L_0x0398
        L_0x0347:
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            byte[] r1 = r0.zzi(r1)
            r2.<init>((byte[]) r1)
            com.google.android.gms.internal.ads.zzzy r1 = com.google.android.gms.internal.ads.zzzy.zza(r2)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r0.zzW = r3
            java.lang.String r1 = r1.zzd
            java.lang.String r17 = "video/hevc"
            goto L_0x0376
        L_0x035f:
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            byte[] r1 = r0.zzi(r1)
            r2.<init>((byte[]) r1)
            com.google.android.gms.internal.ads.zzyn r1 = com.google.android.gms.internal.ads.zzyn.zza(r2)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r0.zzW = r3
            java.lang.String r1 = r1.zzf
            java.lang.String r17 = "video/avc"
        L_0x0376:
            r3 = -1
            r9 = -1
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x039a
        L_0x037e:
            byte[] r1 = r0.zzj
            if (r1 != 0) goto L_0x0384
            r1 = r12
            goto L_0x0388
        L_0x0384:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x0388:
            java.lang.String r17 = "video/mp4v-es"
            goto L_0x0345
        L_0x038b:
            java.lang.String r17 = "video/mpeg2"
            goto L_0x0396
        L_0x038e:
            java.lang.String r17 = "video/av01"
            goto L_0x0396
        L_0x0391:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L_0x0396
        L_0x0394:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
        L_0x0396:
            r1 = r12
            r2 = r1
        L_0x0398:
            r3 = -1
        L_0x0399:
            r9 = -1
        L_0x039a:
            byte[] r4 = r0.zzM
            if (r4 == 0) goto L_0x03ad
            com.google.android.gms.internal.ads.zzef r5 = new com.google.android.gms.internal.ads.zzef
            r5.<init>((byte[]) r4)
            com.google.android.gms.internal.ads.zzze r4 = com.google.android.gms.internal.ads.zzze.zza(r5)
            if (r4 == 0) goto L_0x03ad
            java.lang.String r2 = r4.zza
            java.lang.String r17 = "video/dolby-vision"
        L_0x03ad:
            r4 = r17
            boolean r5 = r0.zzU
            boolean r8 = r0.zzT
            if (r6 == r8) goto L_0x03b7
            r8 = r10
            goto L_0x03b8
        L_0x03b7:
            r8 = 2
        L_0x03b8:
            r5 = r5 | r8
            com.google.android.gms.internal.ads.zzad r8 = new com.google.android.gms.internal.ads.zzad
            r8.<init>()
            boolean r13 = com.google.android.gms.internal.ads.zzbt.zzg(r4)
            if (r13 == 0) goto L_0x03d3
            int r7 = r0.zzN
            r8.zzw(r7)
            int r7 = r0.zzP
            r8.zzT(r7)
            r8.zzN(r9)
            goto L_0x058f
        L_0x03d3:
            boolean r6 = com.google.android.gms.internal.ads.zzbt.zzh(r4)
            if (r6 == 0) goto L_0x055c
            int r6 = r0.zzp
            if (r6 != 0) goto L_0x03ef
            int r6 = r0.zzn
            r7 = -1
            if (r6 != r7) goto L_0x03e4
            int r6 = r0.zzl
        L_0x03e4:
            r0.zzn = r6
            int r6 = r0.zzo
            if (r6 != r7) goto L_0x03ec
            int r6 = r0.zzm
        L_0x03ec:
            r0.zzo = r6
            goto L_0x03f0
        L_0x03ef:
            r7 = -1
        L_0x03f0:
            int r6 = r0.zzn
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 == r7) goto L_0x0404
            int r11 = r0.zzo
            if (r11 == r7) goto L_0x0404
            int r13 = r0.zzm
            int r13 = r13 * r6
            float r6 = (float) r13
            int r13 = r0.zzl
            int r13 = r13 * r11
            float r11 = (float) r13
            float r6 = r6 / r11
            goto L_0x0405
        L_0x0404:
            r6 = r9
        L_0x0405:
            boolean r11 = r0.zzw
            if (r11 == 0) goto L_0x04cc
            float r11 = r0.zzC
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04c0
            float r11 = r0.zzD
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04c0
            float r11 = r0.zzE
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04c0
            float r11 = r0.zzF
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04c0
            float r11 = r0.zzG
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04c0
            float r11 = r0.zzH
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04c0
            float r11 = r0.zzI
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04c0
            float r11 = r0.zzJ
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04c0
            float r11 = r0.zzK
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04c0
            float r11 = r0.zzL
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x0446
            goto L_0x04c0
        L_0x0446:
            r9 = 25
            byte[] r12 = new byte[r9]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r12)
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r9 = r9.order(r11)
            r9.put(r10)
            float r11 = r0.zzC
            r13 = 1195593728(0x47435000, float:50000.0)
            float r11 = r11 * r13
            r14 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.zzD
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.zzE
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.zzF
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.zzG
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.zzH
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.zzI
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.zzJ
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.zzK
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.zzL
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            int r11 = r0.zzA
            short r11 = (short) r11
            r9.putShort(r11)
            int r11 = r0.zzB
            short r11 = (short) r11
            r9.putShort(r11)
        L_0x04c0:
            com.google.android.gms.internal.ads.zzq r9 = new com.google.android.gms.internal.ads.zzq
            int r11 = r0.zzx
            int r13 = r0.zzz
            int r14 = r0.zzy
            r9.<init>(r11, r13, r14, r12)
            r12 = r9
        L_0x04cc:
            java.lang.String r9 = r0.zza
            if (r9 == 0) goto L_0x04ec
            java.util.Map r9 = com.google.android.gms.internal.ads.zzaei.zzg
            java.lang.String r11 = r0.zza
            boolean r9 = r9.containsKey(r11)
            if (r9 == 0) goto L_0x04ec
            java.util.Map r7 = com.google.android.gms.internal.ads.zzaei.zzg
            java.lang.String r9 = r0.zza
            java.lang.Object r7 = r7.get(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x04ec:
            int r9 = r0.zzq
            if (r9 != 0) goto L_0x053c
            float r9 = r0.zzr
            r11 = 0
            int r9 = java.lang.Float.compare(r9, r11)
            if (r9 != 0) goto L_0x053c
            float r9 = r0.zzs
            int r9 = java.lang.Float.compare(r9, r11)
            if (r9 != 0) goto L_0x053c
            float r9 = r0.zzt
            int r9 = java.lang.Float.compare(r9, r11)
            if (r9 != 0) goto L_0x050a
            goto L_0x053d
        L_0x050a:
            float r9 = r0.zzs
            r10 = 1119092736(0x42b40000, float:90.0)
            int r9 = java.lang.Float.compare(r9, r10)
            if (r9 != 0) goto L_0x0517
            r10 = 90
            goto L_0x053d
        L_0x0517:
            float r9 = r0.zzs
            r10 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r9 = java.lang.Float.compare(r9, r10)
            if (r9 == 0) goto L_0x0539
            float r9 = r0.zzs
            r10 = 1127481344(0x43340000, float:180.0)
            int r9 = java.lang.Float.compare(r9, r10)
            if (r9 != 0) goto L_0x052c
            goto L_0x0539
        L_0x052c:
            float r9 = r0.zzs
            r10 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r9 = java.lang.Float.compare(r9, r10)
            if (r9 != 0) goto L_0x053c
            r10 = 270(0x10e, float:3.78E-43)
            goto L_0x053d
        L_0x0539:
            r10 = 180(0xb4, float:2.52E-43)
            goto L_0x053d
        L_0x053c:
            r10 = r7
        L_0x053d:
            int r7 = r0.zzl
            r8.zzX(r7)
            int r7 = r0.zzm
            r8.zzF(r7)
            r8.zzP(r6)
            r8.zzR(r10)
            byte[] r6 = r0.zzu
            r8.zzQ(r6)
            int r6 = r0.zzv
            r8.zzV(r6)
            r8.zzy(r12)
            r6 = 2
            goto L_0x058f
        L_0x055c:
            boolean r6 = r7.equals(r4)
            if (r6 != 0) goto L_0x058e
            boolean r6 = r15.equals(r4)
            if (r6 != 0) goto L_0x058e
            boolean r6 = r14.equals(r4)
            if (r6 != 0) goto L_0x058e
            java.lang.String r6 = "application/vobsub"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x058e
            java.lang.String r6 = "application/pgs"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x058e
            java.lang.String r6 = "application/dvbsubs"
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x0587
            goto L_0x058e
        L_0x0587:
            java.lang.String r1 = "Unexpected MIME type."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r12)
            throw r1
        L_0x058e:
            r6 = r11
        L_0x058f:
            java.lang.String r7 = r0.zza
            if (r7 == 0) goto L_0x05a4
            java.util.Map r7 = com.google.android.gms.internal.ads.zzaei.zzg
            java.lang.String r9 = r0.zza
            boolean r7 = r7.containsKey(r9)
            if (r7 != 0) goto L_0x05a4
            java.lang.String r7 = r0.zza
            r8.zzJ(r7)
        L_0x05a4:
            r7 = r22
            r8.zzG(r7)
            r8.zzS(r4)
            r8.zzL(r3)
            java.lang.String r3 = r0.zzY
            r8.zzK(r3)
            r8.zzU(r5)
            r8.zzI(r1)
            r8.zzx(r2)
            com.google.android.gms.internal.ads.zzx r1 = r0.zzk
            r8.zzB(r1)
            com.google.android.gms.internal.ads.zzaf r1 = r8.zzY()
            int r2 = r0.zzc
            r3 = r21
            com.google.android.gms.internal.ads.zzaap r2 = r3.zzv(r2, r6)
            r0.zzV = r2
            r2.zzk(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeh.zze(com.google.android.gms.internal.ads.zzzl, int):void");
    }
}
