package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzoc {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zzob zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzoa zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzoc(zzob zzob) {
        this.zza = zzob;
        int i = zzen.zza;
        try {
            Class[] clsArr = null;
            this.zzn = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzl(long j) {
        return (j * 1000000) / ((long) this.zzg);
    }

    private final long zzm() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        if (this.zzx != -9223372036854775807L) {
            return Math.min(this.zzA, this.zzz + ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * ((long) this.zzg)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.zzh) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.zzu = this.zzs;
                }
                playState = 2;
            }
            playbackHeadPosition += this.zzu;
        }
        if (zzen.zza <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.zzs > 0 && playState == 3) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = SystemClock.elapsedRealtime();
                }
                return this.zzs;
            }
            this.zzy = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.zzs > playbackHeadPosition) {
            this.zzt++;
        }
        this.zzs = playbackHeadPosition;
        return playbackHeadPosition + (this.zzt << 32);
    }

    private final void zzn() {
        this.zzl = 0;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0;
        this.zzC = 0;
        this.zzF = 0;
        this.zzk = false;
    }

    public final int zza(long j) {
        return this.zze - ((int) (j - (zzm() * ((long) this.zzd))));
    }

    public final long zzb(boolean z) {
        long j;
        String str;
        Method method;
        zzoc zzoc = this;
        AudioTrack audioTrack = zzoc.zzc;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long zzl2 = zzoc.zzl(zzm());
            if (zzl2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - zzoc.zzm >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = zzoc.zzb;
                    int i = zzoc.zzv;
                    jArr[i] = zzl2 - nanoTime;
                    zzoc.zzv = (i + 1) % 10;
                    int i2 = zzoc.zzw;
                    if (i2 < 10) {
                        zzoc.zzw = i2 + 1;
                    }
                    zzoc.zzm = nanoTime;
                    zzoc.zzl = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = zzoc.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        zzoc.zzl += zzoc.zzb[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!zzoc.zzh) {
                    zzoa zzoa = zzoc.zzf;
                    Objects.requireNonNull(zzoa);
                    if (!zzoa.zzg(nanoTime)) {
                        str = "DefaultAudioSink";
                    } else {
                        long zzb2 = zzoa.zzb();
                        long zza2 = zzoa.zza();
                        if (Math.abs(zzb2 - nanoTime) > 5000000) {
                            zzop zzop = (zzop) zzoc.zza;
                            String str2 = "DefaultAudioSink";
                            zzdw.zze(str2, "Spurious audio timestamp (system clock mismatch): " + zza2 + ", " + zzb2 + ", " + nanoTime + ", " + zzl2 + ", " + zzop.zza.zzE() + ", " + zzop.zza.zzF());
                            zzoa.zzd();
                            zzoc = this;
                            str = str2;
                        } else {
                            String str3 = "DefaultAudioSink";
                            if (Math.abs(zzoc.zzl(zza2) - zzl2) > 5000000) {
                                zzop zzop2 = (zzop) zzoc.zza;
                                zzoa zzoa2 = zzoa;
                                str = str3;
                                zzdw.zze(str, "Spurious audio timestamp (frame position mismatch): " + zza2 + ", " + zzb2 + ", " + nanoTime + ", " + zzl2 + ", " + zzop2.zza.zzE() + ", " + zzop2.zza.zzF());
                                zzoa2.zzd();
                            } else {
                                str = str3;
                                zzoa.zzc();
                            }
                            zzoc = this;
                        }
                    }
                    if (zzoc.zzq && (method = zzoc.zzn) != null && nanoTime - zzoc.zzr >= 500000) {
                        try {
                            AudioTrack audioTrack2 = zzoc.zzc;
                            Objects.requireNonNull(audioTrack2);
                            int i5 = zzen.zza;
                            long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[0])).intValue()) * 1000) - zzoc.zzi;
                            zzoc.zzo = intValue;
                            long max = Math.max(intValue, 0);
                            zzoc.zzo = max;
                            if (max > 5000000) {
                                zzdw.zze(str, "Ignoring impossibly large audio latency: " + max);
                                zzoc.zzo = 0;
                            }
                        } catch (Exception unused) {
                            zzoc.zzn = null;
                        }
                        zzoc.zzr = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzoa zzoa3 = zzoc.zzf;
        Objects.requireNonNull(zzoa3);
        boolean zzf2 = zzoa3.zzf();
        if (zzf2) {
            j = zzoc.zzl(zzoa3.zza()) + zzen.zzs(nanoTime2 - zzoa3.zzb(), zzoc.zzj);
        } else {
            if (zzoc.zzw == 0) {
                j = zzoc.zzl(zzm());
            } else {
                j = zzoc.zzl + nanoTime2;
            }
            if (!z) {
                j = Math.max(0, j - zzoc.zzo);
            }
        }
        if (zzoc.zzD != zzf2) {
            zzoc.zzF = zzoc.zzC;
            zzoc.zzE = zzoc.zzB;
        }
        long j2 = nanoTime2 - zzoc.zzF;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (zzoc.zzE + zzen.zzs(j2, zzoc.zzj)))) / 1000;
        }
        if (!zzoc.zzk) {
            long j4 = zzoc.zzB;
            if (j > j4) {
                zzoc.zzk = true;
                long currentTimeMillis = System.currentTimeMillis() - zzen.zzz(zzen.zzu(zzen.zzz(j - j4), zzoc.zzj));
                zzou zzou = ((zzop) zzoc.zza).zza;
                if (zzou.zzq != null) {
                    ((zzoz) zzou.zzq).zza.zzc.zzr(currentTimeMillis);
                }
            }
        }
        zzoc.zzC = nanoTime2;
        zzoc.zzB = j;
        zzoc.zzD = zzf2;
        return j;
    }

    public final void zzc(long j) {
        this.zzz = zzm();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j;
    }

    public final void zzd() {
        zzn();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.zzc = r4
            r3.zzd = r7
            r3.zze = r8
            com.google.android.gms.internal.ads.zzoa r0 = new com.google.android.gms.internal.ads.zzoa
            r0.<init>(r4)
            r3.zzf = r0
            int r4 = r4.getSampleRate()
            r3.zzg = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0025
            int r5 = com.google.android.gms.internal.ads.zzen.zza
            r2 = 23
            if (r5 >= r2) goto L_0x0025
            r5 = 5
            if (r6 == r5) goto L_0x0026
            if (r6 != r4) goto L_0x0025
            r6 = r4
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            r3.zzh = r0
            boolean r4 = com.google.android.gms.internal.ads.zzen.zzV(r6)
            r3.zzq = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x003c
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r3.zzl(r7)
            goto L_0x003d
        L_0x003c:
            r7 = r5
        L_0x003d:
            r3.zzi = r7
            r7 = 0
            r3.zzs = r7
            r3.zzt = r7
            r3.zzu = r7
            r3.zzp = r1
            r3.zzx = r5
            r3.zzy = r5
            r3.zzr = r7
            r3.zzo = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.zzj = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoc.zze(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final boolean zzg(long j) {
        if (j > zzm()) {
            return true;
        }
        if (!this.zzh) {
            return false;
        }
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 2 && zzm() == 0;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzj(long j) {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            } else if (playState == 1) {
                if (zzm() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zzg2 = zzg(j);
        this.zzp = zzg2;
        if (z && !zzg2 && playState != 1) {
            zzob zzob = this.zza;
            int i = this.zze;
            long zzz2 = zzen.zzz(this.zzi);
            zzop zzop = (zzop) zzob;
            if (zzop.zza.zzq != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzou zzou = zzop.zza;
                ((zzoz) zzou.zzq).zza.zzc.zzt(i, zzz2, elapsedRealtime - zzou.zzV);
            }
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx != -9223372036854775807L) {
            return false;
        }
        zzoa zzoa = this.zzf;
        Objects.requireNonNull(zzoa);
        zzoa.zze();
        return true;
    }

    public final void zzf() {
        zzoa zzoa = this.zzf;
        Objects.requireNonNull(zzoa);
        zzoa.zze();
    }
}
