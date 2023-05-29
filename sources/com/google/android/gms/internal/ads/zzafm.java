package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzafm {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    /* JADX WARNING: Unknown top exception splitter block from list: {B:136:0x018c=Splitter:B:136:0x018c, B:224:0x029c=Splitter:B:224:0x029c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzbp zza(com.google.android.gms.internal.ads.zzef r12) {
        /*
            int r0 = r12.zzc()
            int r1 = r12.zze()
            int r0 = r0 + r1
            int r1 = r12.zze()
            int r2 = r1 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = "TCON"
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r6 = "MetadataUtil"
            r7 = 0
            r8 = 169(0xa9, float:2.37E-43)
            if (r2 == r8) goto L_0x01e5
            r8 = 253(0xfd, float:3.55E-43)
            if (r2 != r8) goto L_0x0026
            goto L_0x01e5
        L_0x0026:
            r2 = 1735291493(0x676e7265, float:1.1260334E24)
            r8 = -1
            if (r1 != r2) goto L_0x004f
            int r1 = zzb(r12)     // Catch:{ all -> 0x021a }
            if (r1 <= 0) goto L_0x003c
            r2 = 192(0xc0, float:2.69E-43)
            if (r1 > r2) goto L_0x003c
            java.lang.String[] r2 = zza     // Catch:{ all -> 0x021a }
            int r1 = r1 + r8
            r1 = r2[r1]     // Catch:{ all -> 0x021a }
            goto L_0x003d
        L_0x003c:
            r1 = r7
        L_0x003d:
            if (r1 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzadl r2 = new com.google.android.gms.internal.ads.zzadl     // Catch:{ all -> 0x021a }
            r2.<init>(r3, r7, r1)     // Catch:{ all -> 0x021a }
            r7 = r2
            goto L_0x004b
        L_0x0046:
            java.lang.String r1 = "Failed to parse standard genre code"
            com.google.android.gms.internal.ads.zzdw.zze(r6, r1)     // Catch:{ all -> 0x021a }
        L_0x004b:
            r12.zzF(r0)
            return r7
        L_0x004f:
            r2 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r1 != r2) goto L_0x005e
            java.lang.String r1 = "TPOS"
            com.google.android.gms.internal.ads.zzadl r1 = zzd(r2, r1, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x005e:
            r2 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r1 != r2) goto L_0x006d
            java.lang.String r1 = "TRCK"
            com.google.android.gms.internal.ads.zzadl r1 = zzd(r2, r1, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x006d:
            r2 = 1953329263(0x746d706f, float:7.5247484E31)
            r3 = 1
            r9 = 0
            if (r1 != r2) goto L_0x007e
            java.lang.String r1 = "TBPM"
            com.google.android.gms.internal.ads.zzadd r1 = zzc(r2, r1, r12, r3, r9)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x007e:
            r2 = 1668311404(0x6370696c, float:4.434815E21)
            if (r1 != r2) goto L_0x008d
            java.lang.String r1 = "TCMP"
            com.google.android.gms.internal.ads.zzadd r1 = zzc(r2, r1, r12, r3, r3)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x008d:
            r2 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r1 != r2) goto L_0x00e4
            int r1 = r12.zze()     // Catch:{ all -> 0x021a }
            int r2 = r12.zze()     // Catch:{ all -> 0x021a }
            if (r2 != r5) goto L_0x00db
            int r2 = r12.zze()     // Catch:{ all -> 0x021a }
            r2 = r2 & r4
            r3 = 13
            r4 = 14
            if (r2 != r3) goto L_0x00aa
            java.lang.String r3 = "image/jpeg"
            goto L_0x00b1
        L_0x00aa:
            if (r2 != r4) goto L_0x00b0
            java.lang.String r3 = "image/png"
            r2 = r4
            goto L_0x00b1
        L_0x00b0:
            r3 = r7
        L_0x00b1:
            if (r3 != 0) goto L_0x00c8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021a }
            r1.<init>()     // Catch:{ all -> 0x021a }
            java.lang.String r3 = "Unrecognized cover art flags: "
            r1.append(r3)     // Catch:{ all -> 0x021a }
            r1.append(r2)     // Catch:{ all -> 0x021a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzdw.zze(r6, r1)     // Catch:{ all -> 0x021a }
            goto L_0x00e0
        L_0x00c8:
            r2 = 4
            r12.zzG(r2)     // Catch:{ all -> 0x021a }
            int r1 = r1 + -16
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x021a }
            r12.zzB(r2, r9, r1)     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzaco r1 = new com.google.android.gms.internal.ads.zzaco     // Catch:{ all -> 0x021a }
            r4 = 3
            r1.<init>(r3, r7, r4, r2)     // Catch:{ all -> 0x021a }
            r7 = r1
            goto L_0x00e0
        L_0x00db:
            java.lang.String r1 = "Failed to parse cover art attribute"
            com.google.android.gms.internal.ads.zzdw.zze(r6, r1)     // Catch:{ all -> 0x021a }
        L_0x00e0:
            r12.zzF(r0)
            return r7
        L_0x00e4:
            r2 = 1631670868(0x61415254, float:2.2288462E20)
            if (r1 != r2) goto L_0x00f3
            java.lang.String r1 = "TPE2"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r2, r1, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x00f3:
            r2 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r1 != r2) goto L_0x0102
            java.lang.String r1 = "TSOT"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r2, r1, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x0102:
            r2 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r1 != r2) goto L_0x0111
            java.lang.String r1 = "TSO2"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r2, r1, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x0111:
            r2 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r1 != r2) goto L_0x0120
            java.lang.String r1 = "TSOA"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r2, r1, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x0120:
            r2 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r1 != r2) goto L_0x012f
            java.lang.String r1 = "TSOP"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r2, r1, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x012f:
            r2 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r1 != r2) goto L_0x013e
            java.lang.String r1 = "TSOC"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r2, r1, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x013e:
            r2 = 1920233063(0x72746e67, float:4.84146E30)
            if (r1 != r2) goto L_0x014d
            java.lang.String r1 = "ITUNESADVISORY"
            com.google.android.gms.internal.ads.zzadd r1 = zzc(r2, r1, r12, r9, r9)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x014d:
            r2 = 1885823344(0x70676170, float:2.8643533E29)
            if (r1 != r2) goto L_0x015f
            r1 = 1885823344(0x70676170, float:2.8643533E29)
            java.lang.String r2 = "ITUNESGAPLESS"
            com.google.android.gms.internal.ads.zzadd r1 = zzc(r1, r2, r12, r9, r3)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x015f:
            r2 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r1 != r2) goto L_0x0171
            r1 = 1936683886(0x736f736e, float:1.8971255E31)
            java.lang.String r2 = "TVSHOWSORT"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r1, r2, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x0171:
            r2 = 1953919848(0x74767368, float:7.810338E31)
            if (r1 != r2) goto L_0x0183
            r1 = 1953919848(0x74767368, float:7.810338E31)
            java.lang.String r2 = "TVSHOW"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r1, r2, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x0183:
            r2 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r1 != r2) goto L_0x029c
            r1 = r7
            r2 = r1
            r3 = r8
            r4 = r3
        L_0x018c:
            int r6 = r12.zzc()     // Catch:{ all -> 0x021a }
            if (r6 >= r0) goto L_0x01c7
            int r6 = r12.zzc()     // Catch:{ all -> 0x021a }
            int r9 = r12.zze()     // Catch:{ all -> 0x021a }
            int r10 = r12.zze()     // Catch:{ all -> 0x021a }
            r11 = 4
            r12.zzG(r11)     // Catch:{ all -> 0x021a }
            r11 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r10 != r11) goto L_0x01ae
            int r9 = r9 + -12
            java.lang.String r1 = r12.zzw(r9)     // Catch:{ all -> 0x021a }
            goto L_0x018c
        L_0x01ae:
            r11 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r10 != r11) goto L_0x01ba
            int r9 = r9 + -12
            java.lang.String r2 = r12.zzw(r9)     // Catch:{ all -> 0x021a }
            goto L_0x018c
        L_0x01ba:
            if (r10 != r5) goto L_0x01bd
            r4 = r9
        L_0x01bd:
            if (r10 == r5) goto L_0x01c0
            goto L_0x01c1
        L_0x01c0:
            r3 = r6
        L_0x01c1:
            int r9 = r9 + -12
            r12.zzG(r9)     // Catch:{ all -> 0x021a }
            goto L_0x018c
        L_0x01c7:
            if (r1 == 0) goto L_0x01e1
            if (r2 == 0) goto L_0x01e1
            if (r3 != r8) goto L_0x01ce
            goto L_0x01e1
        L_0x01ce:
            r12.zzF(r3)     // Catch:{ all -> 0x021a }
            r3 = 16
            r12.zzG(r3)     // Catch:{ all -> 0x021a }
            int r4 = r4 + -16
            java.lang.String r3 = r12.zzw(r4)     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzadf r7 = new com.google.android.gms.internal.ads.zzadf     // Catch:{ all -> 0x021a }
            r7.<init>(r1, r2, r3)     // Catch:{ all -> 0x021a }
        L_0x01e1:
            r12.zzF(r0)
            return r7
        L_0x01e5:
            r2 = r1 & r4
            r4 = 6516084(0x636d74, float:9.130979E-39)
            if (r2 != r4) goto L_0x021d
            int r2 = r12.zze()     // Catch:{ all -> 0x021a }
            int r3 = r12.zze()     // Catch:{ all -> 0x021a }
            if (r3 != r5) goto L_0x0209
            r1 = 8
            r12.zzG(r1)     // Catch:{ all -> 0x021a }
            int r2 = r2 + -16
            java.lang.String r1 = r12.zzw(r2)     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzacw r7 = new com.google.android.gms.internal.ads.zzacw     // Catch:{ all -> 0x021a }
            java.lang.String r2 = "und"
            r7.<init>(r2, r1, r1)     // Catch:{ all -> 0x021a }
            goto L_0x0216
        L_0x0209:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzaex.zzf(r1)     // Catch:{ all -> 0x021a }
            java.lang.String r2 = "Failed to parse comment attribute: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzdw.zze(r6, r1)     // Catch:{ all -> 0x021a }
        L_0x0216:
            r12.zzF(r0)
            return r7
        L_0x021a:
            r1 = move-exception
            goto L_0x02cc
        L_0x021d:
            r4 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r2 == r4) goto L_0x02c2
            r4 = 7631467(0x74726b, float:1.0693963E-38)
            if (r2 != r4) goto L_0x0229
            goto L_0x02c2
        L_0x0229:
            r4 = 6516589(0x636f6d, float:9.131686E-39)
            if (r2 == r4) goto L_0x02b8
            r4 = 7828084(0x777274, float:1.0969482E-38)
            if (r2 != r4) goto L_0x0235
            goto L_0x02b8
        L_0x0235:
            r4 = 6578553(0x646179, float:9.218516E-39)
            if (r2 != r4) goto L_0x0244
            java.lang.String r2 = "TDRC"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r1, r2, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x0244:
            r4 = 4280916(0x415254, float:5.998841E-39)
            if (r2 != r4) goto L_0x0253
            java.lang.String r2 = "TPE1"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r1, r2, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x0253:
            r4 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r2 != r4) goto L_0x0262
            java.lang.String r2 = "TSSE"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r1, r2, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x0262:
            r4 = 6384738(0x616c62, float:8.946924E-39)
            if (r2 != r4) goto L_0x0271
            java.lang.String r2 = "TALB"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r1, r2, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x0271:
            r4 = 7108978(0x6c7972, float:9.9618E-39)
            if (r2 != r4) goto L_0x0280
            java.lang.String r2 = "USLT"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r1, r2, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x0280:
            r4 = 6776174(0x67656e, float:9.495442E-39)
            if (r2 != r4) goto L_0x028d
            com.google.android.gms.internal.ads.zzadl r1 = zze(r1, r3, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x028d:
            r3 = 6779504(0x677270, float:9.500109E-39)
            if (r2 != r3) goto L_0x029c
            java.lang.String r2 = "TIT1"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r1, r2, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x029c:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzaex.zzf(r1)     // Catch:{ all -> 0x021a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x021a }
            r2.<init>()     // Catch:{ all -> 0x021a }
            java.lang.String r3 = "Skipped unknown metadata entry: "
            r2.append(r3)     // Catch:{ all -> 0x021a }
            r2.append(r1)     // Catch:{ all -> 0x021a }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzdw.zza(r6, r1)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r7
        L_0x02b8:
            java.lang.String r2 = "TCOM"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r1, r2, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x02c2:
            java.lang.String r2 = "TIT2"
            com.google.android.gms.internal.ads.zzadl r1 = zze(r1, r2, r12)     // Catch:{ all -> 0x021a }
            r12.zzF(r0)
            return r1
        L_0x02cc:
            r12.zzF(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafm.zza(com.google.android.gms.internal.ads.zzef):com.google.android.gms.internal.ads.zzbp");
    }

    private static int zzb(zzef zzef) {
        zzef.zzG(4);
        if (zzef.zze() == 1684108385) {
            zzef.zzG(8);
            return zzef.zzk();
        }
        zzdw.zze("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzadd zzc(int i, String str, zzef zzef, boolean z, boolean z2) {
        int zzb2 = zzb(zzef);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 < 0) {
            zzdw.zze("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzaex.zzf(i)));
            return null;
        } else if (z) {
            return new zzadl(str, (String) null, Integer.toString(zzb2));
        } else {
            return new zzacw("und", str, Integer.toString(zzb2));
        }
    }

    private static zzadl zzd(int i, String str, zzef zzef) {
        int zze = zzef.zze();
        if (zzef.zze() == 1684108385 && zze >= 22) {
            zzef.zzG(10);
            int zzo = zzef.zzo();
            if (zzo > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzo);
                String sb2 = sb.toString();
                int zzo2 = zzef.zzo();
                if (zzo2 > 0) {
                    sb2 = sb2 + "/" + zzo2;
                }
                return new zzadl(str, (String) null, sb2);
            }
        }
        zzdw.zze("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzaex.zzf(i)));
        return null;
    }

    private static zzadl zze(int i, String str, zzef zzef) {
        int zze = zzef.zze();
        if (zzef.zze() == 1684108385) {
            zzef.zzG(8);
            return new zzadl(str, (String) null, zzef.zzw(zze - 16));
        }
        zzdw.zze("MetadataUtil", "Failed to parse text attribute: ".concat(zzaex.zzf(i)));
        return null;
    }
}
