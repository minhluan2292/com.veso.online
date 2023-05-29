package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzasp implements zzasm {
    private final zzatb[] zza;
    private final zzazh zzb;
    private final zzazf zzc;
    private final Handler zzd;
    private final zzasu zze;
    private final CopyOnWriteArraySet zzf = new CopyOnWriteArraySet();
    private final zzatg zzg;
    private final zzatf zzh;
    private boolean zzi;
    private boolean zzj = false;
    private int zzk = 1;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zzath zzo;
    private Object zzp;
    private zzayt zzq;
    private zzazf zzr;
    private zzata zzs;
    private zzasr zzt;
    private long zzu;

    public zzasp(zzatb[] zzatbArr, zzazh zzazh, zzcjv zzcjv, byte[] bArr) {
        String str = zzbar.zze;
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.2 [" + str + "]");
        this.zza = zzatbArr;
        Objects.requireNonNull(zzazh);
        this.zzb = zzazh;
        zzazf zzazf = new zzazf(new zzayx[2], (byte[]) null);
        this.zzc = zzazf;
        this.zzo = zzath.zza;
        this.zzg = new zzatg();
        this.zzh = new zzatf();
        this.zzq = zzayt.zza;
        this.zzr = zzazf;
        this.zzs = zzata.zza;
        zzaso zzaso = new zzaso(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.zzd = zzaso;
        zzasr zzasr = new zzasr(0, 0);
        this.zzt = zzasr;
        this.zze = new zzasu(zzatbArr, zzazh, zzcjv, this.zzj, 0, zzaso, zzasr, this, (byte[]) null);
    }

    public final int zza() {
        return this.zzk;
    }

    public final long zzb() {
        if (this.zzo.zzh() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzash.zzb(0) + zzash.zzb(this.zzt.zzd);
    }

    public final long zzc() {
        if (this.zzo.zzh() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzash.zzb(0) + zzash.zzb(this.zzt.zzc);
    }

    public final long zzd() {
        if (this.zzo.zzh()) {
            return -9223372036854775807L;
        }
        zzath zzath = this.zzo;
        zzs();
        return zzash.zzb(zzath.zzg(0, this.zzg, false).zza);
    }

    public final void zze(zzasj zzasj) {
        this.zzf.add(zzasj);
    }

    public final void zzf(zzasl... zzaslArr) {
        if (!this.zze.zzr()) {
            this.zze.zza(zzaslArr);
        } else if (!this.zze.zzq(zzaslArr)) {
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzasj) it.next()).zzc(zzasi.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
            }
        }
    }

    public final void zzg() {
        this.zze.zzb();
    }

    public final void zzh(int i) {
        this.zze.zzc(i);
    }

    public final void zzi() {
        this.zze.zzd();
    }

    public final void zzj(zzaye zzaye) {
        if (!this.zzo.zzh() || this.zzp != null) {
            this.zzo = zzath.zza;
            this.zzp = null;
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzasj) it.next()).zzf(this.zzo, this.zzp);
            }
        }
        if (this.zzi) {
            this.zzi = false;
            this.zzq = zzayt.zza;
            this.zzr = this.zzc;
            this.zzb.zzd((Object) null);
            Iterator it2 = this.zzf.iterator();
            while (it2.hasNext()) {
                ((zzasj) it2.next()).zzg(this.zzq, this.zzr);
            }
        }
        this.zzm++;
        this.zze.zzi(zzaye, true);
    }

    public final void zzk() {
        if (this.zze.zzr()) {
            if (!this.zze.zzs()) {
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzasj) it.next()).zzc(zzasi.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
                }
            }
            this.zzd.removeCallbacksAndMessages((Object) null);
            return;
        }
        this.zze.zzj();
        this.zzd.removeCallbacksAndMessages((Object) null);
    }

    public final void zzl(zzasj zzasj) {
        this.zzf.remove(zzasj);
    }

    public final void zzm(long j) {
        zzs();
        if (this.zzo.zzh() || this.zzo.zzc() > 0) {
            this.zzl++;
            if (!this.zzo.zzh()) {
                this.zzo.zzg(0, this.zzg, false);
                long zza2 = zzash.zza(j);
                long j2 = this.zzo.zzd(0, this.zzh, false).zzc;
                if (j2 != -9223372036854775807L) {
                    int i = (zza2 > j2 ? 1 : (zza2 == j2 ? 0 : -1));
                }
            }
            this.zzu = j;
            this.zze.zzk(this.zzo, 0, zzash.zza(j));
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzasj) it.next()).zze();
            }
            return;
        }
        throw new zzasy(this.zzo, 0, j);
    }

    public final void zzn(zzasl... zzaslArr) {
        this.zze.zzl(zzaslArr);
    }

    public final void zzo(int i) {
        this.zze.zzm(i);
    }

    public final void zzp(int i) {
        this.zze.zzn(i);
    }

    public final void zzq(boolean z) {
        if (this.zzj != z) {
            this.zzj = z;
            this.zze.zzo(z);
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzasj) it.next()).zzd(z, this.zzk);
            }
        }
    }

    public final void zzr() {
        this.zze.zzp();
    }

    public final int zzs() {
        if (!this.zzo.zzh() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final void zzt(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.zzm--;
                return;
            case 1:
                this.zzk = message.arg1;
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzasj) it.next()).zzd(this.zzj, this.zzk);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.zzn = z;
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    ((zzasj) it2.next()).zza(this.zzn);
                }
                return;
            case 3:
                if (this.zzm == 0) {
                    zzazi zzazi = (zzazi) message.obj;
                    this.zzi = true;
                    this.zzq = zzazi.zza;
                    this.zzr = zzazi.zzb;
                    this.zzb.zzd(zzazi.zzc);
                    Iterator it3 = this.zzf.iterator();
                    while (it3.hasNext()) {
                        ((zzasj) it3.next()).zzg(this.zzq, this.zzr);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.zzl - 1;
                this.zzl = i;
                if (i == 0) {
                    this.zzt = (zzasr) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.zzf.iterator();
                        while (it4.hasNext()) {
                            ((zzasj) it4.next()).zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzl == 0) {
                    this.zzt = (zzasr) message.obj;
                    Iterator it5 = this.zzf.iterator();
                    while (it5.hasNext()) {
                        ((zzasj) it5.next()).zze();
                    }
                    return;
                }
                return;
            case 6:
                zzast zzast = (zzast) message.obj;
                this.zzl -= zzast.zzd;
                if (this.zzm == 0) {
                    this.zzo = zzast.zza;
                    this.zzp = zzast.zzb;
                    this.zzt = zzast.zzc;
                    Iterator it6 = this.zzf.iterator();
                    while (it6.hasNext()) {
                        ((zzasj) it6.next()).zzf(this.zzo, this.zzp);
                    }
                    return;
                }
                return;
            case 7:
                zzata zzata = (zzata) message.obj;
                if (!this.zzs.equals(zzata)) {
                    this.zzs = zzata;
                    Iterator it7 = this.zzf.iterator();
                    while (it7.hasNext()) {
                        ((zzasj) it7.next()).zzb(zzata);
                    }
                    return;
                }
                return;
            case 8:
                zzasi zzasi = (zzasi) message.obj;
                Iterator it8 = this.zzf.iterator();
                while (it8.hasNext()) {
                    ((zzasj) it8.next()).zzc(zzasi);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
