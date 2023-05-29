package com.google.android.gms.internal.ads;

import android.util.Log;
import com.ironsource.mediationsdk.IronSourceSegment;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzawj {
    private static final int zzA = zzbar.zzg("sosn");
    private static final int zzB = zzbar.zzg("tvsh");
    private static final int zzC = zzbar.zzg("----");
    private static final String[] zzD = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};
    private static final int zza = zzbar.zzg("nam");
    private static final int zzb = zzbar.zzg("trk");
    private static final int zzc = zzbar.zzg("cmt");
    private static final int zzd = zzbar.zzg("day");
    private static final int zze = zzbar.zzg("ART");
    private static final int zzf = zzbar.zzg("too");
    private static final int zzg = zzbar.zzg("alb");
    private static final int zzh = zzbar.zzg("com");
    private static final int zzi = zzbar.zzg("wrt");
    private static final int zzj = zzbar.zzg("lyr");
    private static final int zzk = zzbar.zzg(IronSourceSegment.GENDER);
    private static final int zzl = zzbar.zzg("covr");
    private static final int zzm = zzbar.zzg("gnre");
    private static final int zzn = zzbar.zzg("grp");
    private static final int zzo = zzbar.zzg("disk");
    private static final int zzp = zzbar.zzg("trkn");
    private static final int zzq = zzbar.zzg("tmpo");
    private static final int zzr = zzbar.zzg("cpil");
    private static final int zzs = zzbar.zzg("aART");
    private static final int zzt = zzbar.zzg("sonm");
    private static final int zzu = zzbar.zzg("soal");
    private static final int zzv = zzbar.zzg("soar");
    private static final int zzw = zzbar.zzg("soaa");
    private static final int zzx = zzbar.zzg("soco");
    private static final int zzy = zzbar.zzg("rtng");
    private static final int zzz = zzbar.zzg("pgap");

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[Catch:{ all -> 0x01d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[Catch:{ all -> 0x01d2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaxg zza(com.google.android.gms.internal.ads.zzbak r13) {
        /*
            int r0 = r13.zzc()
            int r1 = r13.zze()
            int r0 = r0 + r1
            int r1 = r13.zze()
            int r2 = r1 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = "und"
            java.lang.String r4 = "TCON"
            java.lang.String r5 = "MetadataUtil"
            r6 = 0
            r7 = 169(0xa9, float:2.37E-43)
            if (r2 == r7) goto L_0x01d5
            int r2 = zzm     // Catch:{ all -> 0x01d2 }
            r7 = -1
            if (r1 != r2) goto L_0x0045
            int r1 = zzb(r13)     // Catch:{ all -> 0x01d2 }
            if (r1 <= 0) goto L_0x0032
            java.lang.String[] r2 = zzD     // Catch:{ all -> 0x01d2 }
            int r3 = r2.length     // Catch:{ all -> 0x01d2 }
            r3 = 148(0x94, float:2.07E-43)
            if (r1 > r3) goto L_0x0032
            int r1 = r1 + r7
            r1 = r2[r1]     // Catch:{ all -> 0x01d2 }
            goto L_0x0033
        L_0x0032:
            r1 = r6
        L_0x0033:
            if (r1 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.zzaxp r2 = new com.google.android.gms.internal.ads.zzaxp     // Catch:{ all -> 0x01d2 }
            r2.<init>(r4, r6, r1)     // Catch:{ all -> 0x01d2 }
            r6 = r2
            goto L_0x0041
        L_0x003c:
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d2 }
        L_0x0041:
            r13.zzv(r0)
            return r6
        L_0x0045:
            int r2 = zzo     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0053
            java.lang.String r2 = "TPOS"
            com.google.android.gms.internal.ads.zzaxp r1 = zzd(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x0053:
            int r2 = zzp     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0061
            java.lang.String r2 = "TRCK"
            com.google.android.gms.internal.ads.zzaxp r1 = zzd(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x0061:
            int r2 = zzq     // Catch:{ all -> 0x01d2 }
            r4 = 1
            r8 = 0
            if (r1 != r2) goto L_0x0071
            java.lang.String r2 = "TBPM"
            com.google.android.gms.internal.ads.zzaxn r1 = zzc(r1, r2, r13, r4, r8)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x0071:
            int r2 = zzr     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x007f
            java.lang.String r2 = "TCMP"
            com.google.android.gms.internal.ads.zzaxn r1 = zzc(r1, r2, r13, r4, r4)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x007f:
            int r2 = zzl     // Catch:{ all -> 0x01d2 }
            r9 = 4
            if (r1 != r2) goto L_0x00da
            int r1 = r13.zze()     // Catch:{ all -> 0x01d2 }
            int r2 = r13.zze()     // Catch:{ all -> 0x01d2 }
            int r3 = com.google.android.gms.internal.ads.zzavw.zzaH     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x00d1
            int r2 = r13.zze()     // Catch:{ all -> 0x01d2 }
            int r2 = com.google.android.gms.internal.ads.zzavw.zze(r2)     // Catch:{ all -> 0x01d2 }
            r3 = 13
            r4 = 14
            if (r2 != r3) goto L_0x00a1
            java.lang.String r3 = "image/jpeg"
            goto L_0x00a8
        L_0x00a1:
            if (r2 != r4) goto L_0x00a7
            java.lang.String r3 = "image/png"
            r2 = r4
            goto L_0x00a8
        L_0x00a7:
            r3 = r6
        L_0x00a8:
            if (r3 != 0) goto L_0x00bf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r3 = "Unrecognized cover art flags: "
            r1.append(r3)     // Catch:{ all -> 0x01d2 }
            r1.append(r2)     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d2 }
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d2 }
            goto L_0x00d6
        L_0x00bf:
            r13.zzw(r9)     // Catch:{ all -> 0x01d2 }
            int r1 = r1 + -16
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x01d2 }
            r13.zzq(r2, r8, r1)     // Catch:{ all -> 0x01d2 }
            com.google.android.gms.internal.ads.zzaxj r1 = new com.google.android.gms.internal.ads.zzaxj     // Catch:{ all -> 0x01d2 }
            r4 = 3
            r1.<init>(r3, r6, r4, r2)     // Catch:{ all -> 0x01d2 }
            r6 = r1
            goto L_0x00d6
        L_0x00d1:
            java.lang.String r1 = "Failed to parse cover art attribute"
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d2 }
        L_0x00d6:
            r13.zzv(r0)
            return r6
        L_0x00da:
            int r2 = zzs     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x00e8
            java.lang.String r2 = "TPE2"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x00e8:
            int r2 = zzt     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x00f6
            java.lang.String r2 = "TSOT"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x00f6:
            int r2 = zzu     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0104
            java.lang.String r2 = "TSO2"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x0104:
            int r2 = zzv     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0112
            java.lang.String r2 = "TSOA"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x0112:
            int r2 = zzw     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0120
            java.lang.String r2 = "TSOP"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x0120:
            int r2 = zzx     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x012e
            java.lang.String r2 = "TSOC"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x012e:
            int r2 = zzy     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x013c
            java.lang.String r2 = "ITUNESADVISORY"
            com.google.android.gms.internal.ads.zzaxn r1 = zzc(r1, r2, r13, r8, r8)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x013c:
            int r2 = zzz     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x014a
            java.lang.String r2 = "ITUNESGAPLESS"
            com.google.android.gms.internal.ads.zzaxn r1 = zzc(r1, r2, r13, r8, r4)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x014a:
            int r2 = zzA     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0158
            java.lang.String r2 = "TVSHOWSORT"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x0158:
            int r2 = zzB     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0166
            java.lang.String r2 = "TVSHOW"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x0166:
            int r2 = zzC     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x027f
            r1 = r6
            r2 = r1
            r4 = r7
            r5 = r4
        L_0x016e:
            int r8 = r13.zzc()     // Catch:{ all -> 0x01d2 }
            if (r8 >= r0) goto L_0x01a8
            int r8 = r13.zzc()     // Catch:{ all -> 0x01d2 }
            int r10 = r13.zze()     // Catch:{ all -> 0x01d2 }
            int r11 = r13.zze()     // Catch:{ all -> 0x01d2 }
            r13.zzw(r9)     // Catch:{ all -> 0x01d2 }
            int r12 = com.google.android.gms.internal.ads.zzavw.zzaF     // Catch:{ all -> 0x01d2 }
            if (r11 != r12) goto L_0x018e
            int r10 = r10 + -12
            java.lang.String r1 = r13.zzo(r10)     // Catch:{ all -> 0x01d2 }
            goto L_0x016e
        L_0x018e:
            int r12 = com.google.android.gms.internal.ads.zzavw.zzaG     // Catch:{ all -> 0x01d2 }
            if (r11 != r12) goto L_0x0199
            int r10 = r10 + -12
            java.lang.String r2 = r13.zzo(r10)     // Catch:{ all -> 0x01d2 }
            goto L_0x016e
        L_0x0199:
            int r12 = com.google.android.gms.internal.ads.zzavw.zzaH     // Catch:{ all -> 0x01d2 }
            if (r11 != r12) goto L_0x019e
            r5 = r10
        L_0x019e:
            if (r11 == r12) goto L_0x01a1
            goto L_0x01a2
        L_0x01a1:
            r4 = r8
        L_0x01a2:
            int r10 = r10 + -12
            r13.zzw(r10)     // Catch:{ all -> 0x01d2 }
            goto L_0x016e
        L_0x01a8:
            java.lang.String r8 = "com.apple.iTunes"
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x01d2 }
            if (r1 == 0) goto L_0x01ce
            java.lang.String r1 = "iTunSMPB"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x01d2 }
            if (r1 == 0) goto L_0x01ce
            if (r4 != r7) goto L_0x01bb
            goto L_0x01ce
        L_0x01bb:
            r13.zzv(r4)     // Catch:{ all -> 0x01d2 }
            r1 = 16
            r13.zzw(r1)     // Catch:{ all -> 0x01d2 }
            int r5 = r5 + -16
            java.lang.String r1 = r13.zzo(r5)     // Catch:{ all -> 0x01d2 }
            com.google.android.gms.internal.ads.zzaxl r6 = new com.google.android.gms.internal.ads.zzaxl     // Catch:{ all -> 0x01d2 }
            r6.<init>(r3, r2, r1)     // Catch:{ all -> 0x01d2 }
        L_0x01ce:
            r13.zzv(r0)
            return r6
        L_0x01d2:
            r1 = move-exception
            goto L_0x02af
        L_0x01d5:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r7 = zzc     // Catch:{ all -> 0x01d2 }
            if (r2 != r7) goto L_0x020b
            int r2 = r13.zze()     // Catch:{ all -> 0x01d2 }
            int r4 = r13.zze()     // Catch:{ all -> 0x01d2 }
            int r7 = com.google.android.gms.internal.ads.zzavw.zzaH     // Catch:{ all -> 0x01d2 }
            if (r4 != r7) goto L_0x01fa
            r1 = 8
            r13.zzw(r1)     // Catch:{ all -> 0x01d2 }
            int r2 = r2 + -16
            java.lang.String r1 = r13.zzo(r2)     // Catch:{ all -> 0x01d2 }
            com.google.android.gms.internal.ads.zzaxl r6 = new com.google.android.gms.internal.ads.zzaxl     // Catch:{ all -> 0x01d2 }
            r6.<init>(r3, r1, r1)     // Catch:{ all -> 0x01d2 }
            goto L_0x0207
        L_0x01fa:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzavw.zzg(r1)     // Catch:{ all -> 0x01d2 }
            java.lang.String r2 = "Failed to parse comment attribute: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x01d2 }
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d2 }
        L_0x0207:
            r13.zzv(r0)
            return r6
        L_0x020b:
            int r3 = zza     // Catch:{ all -> 0x01d2 }
            if (r2 == r3) goto L_0x02a5
            int r3 = zzb     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x0215
            goto L_0x02a5
        L_0x0215:
            int r3 = zzh     // Catch:{ all -> 0x01d2 }
            if (r2 == r3) goto L_0x029b
            int r3 = zzi     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x021f
            goto L_0x029b
        L_0x021f:
            int r3 = zzd     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x022d
            java.lang.String r2 = "TDRC"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x022d:
            int r3 = zze     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x023b
            java.lang.String r2 = "TPE1"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x023b:
            int r3 = zzf     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x0249
            java.lang.String r2 = "TSSE"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x0249:
            int r3 = zzg     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x0257
            java.lang.String r2 = "TALB"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x0257:
            int r3 = zzj     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x0265
            java.lang.String r2 = "USLT"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x0265:
            int r3 = zzk     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x0271
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r4, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x0271:
            int r3 = zzn     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x027f
            java.lang.String r2 = "TIT1"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x027f:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzavw.zzg(r1)     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r2.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r3 = "Skipped unknown metadata entry: "
            r2.append(r3)     // Catch:{ all -> 0x01d2 }
            r2.append(r1)     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01d2 }
            android.util.Log.d(r5, r1)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r6
        L_0x029b:
            java.lang.String r2 = "TCOM"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x02a5:
            java.lang.String r2 = "TIT2"
            com.google.android.gms.internal.ads.zzaxp r1 = zze(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.zzv(r0)
            return r1
        L_0x02af:
            r13.zzv(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawj.zza(com.google.android.gms.internal.ads.zzbak):com.google.android.gms.internal.ads.zzaxg");
    }

    private static int zzb(zzbak zzbak) {
        zzbak.zzw(4);
        if (zzbak.zze() == zzavw.zzaH) {
            zzbak.zzw(8);
            return zzbak.zzg();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzaxn zzc(int i, String str, zzbak zzbak, boolean z, boolean z2) {
        int zzb2 = zzb(zzbak);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 < 0) {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzavw.zzg(i)));
            return null;
        } else if (z) {
            return new zzaxp(str, (String) null, Integer.toString(zzb2));
        } else {
            return new zzaxl("und", str, Integer.toString(zzb2));
        }
    }

    private static zzaxp zzd(int i, String str, zzbak zzbak) {
        int zze2 = zzbak.zze();
        if (zzbak.zze() == zzavw.zzaH && zze2 >= 22) {
            zzbak.zzw(10);
            int zzj2 = zzbak.zzj();
            if (zzj2 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzj2);
                String sb2 = sb.toString();
                int zzj3 = zzbak.zzj();
                if (zzj3 > 0) {
                    sb2 = sb2 + "/" + zzj3;
                }
                return new zzaxp(str, (String) null, sb2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzavw.zzg(i)));
        return null;
    }

    private static zzaxp zze(int i, String str, zzbak zzbak) {
        int zze2 = zzbak.zze();
        if (zzbak.zze() == zzavw.zzaH) {
            zzbak.zzw(8);
            return new zzaxp(str, (String) null, zzbak.zzo(zze2 - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: ".concat(zzavw.zzg(i)));
        return null;
    }
}
