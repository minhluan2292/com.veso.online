package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.measurement.zzne;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final class zzkg extends zzkz {
    public final zzfl zza;
    public final zzfl zzb;
    public final zzfl zzc;
    public final zzfl zzd;
    public final zzfl zze;
    private final Map zzg = new HashMap();
    private String zzh;
    private boolean zzi;
    private long zzj;

    zzkg(zzll zzll) {
        super(zzll);
        zzfp zzm = this.zzs.zzm();
        zzm.getClass();
        this.zza = new zzfl(zzm, "last_delete_stale", 0);
        zzfp zzm2 = this.zzs.zzm();
        zzm2.getClass();
        this.zzb = new zzfl(zzm2, "backoff", 0);
        zzfp zzm3 = this.zzs.zzm();
        zzm3.getClass();
        this.zzc = new zzfl(zzm3, "last_upload", 0);
        zzfp zzm4 = this.zzs.zzm();
        zzm4.getClass();
        this.zzd = new zzfl(zzm4, "last_upload_attempt", 0);
        zzfp zzm5 = this.zzs.zzm();
        zzm5.getClass();
        this.zze = new zzfl(zzm5, "midnight_offset", 0);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final Pair zza(String str) {
        zzkf zzkf;
        zzg();
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
        zzne.zzc();
        if (this.zzs.zzf().zzs((String) null, zzen.zzar)) {
            zzkf zzkf2 = (zzkf) this.zzg.get(str);
            if (zzkf2 != null && elapsedRealtime < zzkf2.zzc) {
                return new Pair(zzkf2.zza, Boolean.valueOf(zzkf2.zzb));
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            long zzi2 = elapsedRealtime + this.zzs.zzf().zzi(str, zzen.zza);
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
                if (advertisingIdInfo == null) {
                    return new Pair("", false);
                }
                String id = advertisingIdInfo.getId();
                if (id != null) {
                    zzkf = new zzkf(id, advertisingIdInfo.isLimitAdTrackingEnabled(), zzi2);
                } else {
                    zzkf = new zzkf("", advertisingIdInfo.isLimitAdTrackingEnabled(), zzi2);
                }
                this.zzg.put(str, zzkf);
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                return new Pair(zzkf.zza, Boolean.valueOf(zzkf.zzb));
            } catch (Exception e) {
                this.zzs.zzay().zzc().zzb("Unable to get advertising id", e);
                zzkf = new zzkf("", false, zzi2);
            }
        } else {
            String str2 = this.zzh;
            if (str2 != null && elapsedRealtime < this.zzj) {
                return new Pair(str2, Boolean.valueOf(this.zzi));
            }
            this.zzj = elapsedRealtime + this.zzs.zzf().zzi(str, zzen.zza);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            try {
                AdvertisingIdClient.Info advertisingIdInfo2 = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
                if (advertisingIdInfo2 == null) {
                    return new Pair("", false);
                }
                this.zzh = "";
                String id2 = advertisingIdInfo2.getId();
                if (id2 != null) {
                    this.zzh = id2;
                }
                this.zzi = advertisingIdInfo2.isLimitAdTrackingEnabled();
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                return new Pair(this.zzh, Boolean.valueOf(this.zzi));
            } catch (Exception e2) {
                this.zzs.zzay().zzc().zzb("Unable to get advertising id", e2);
                this.zzh = "";
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzb() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Pair zzd(String str, zzai zzai) {
        if (zzai.zzi(zzah.AD_STORAGE)) {
            return zza(str);
        }
        return new Pair("", false);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final String zzf(String str) {
        zzg();
        String str2 = (String) zza(str).first;
        MessageDigest zzF = zzlt.zzF();
        if (zzF == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, zzF.digest(str2.getBytes()))});
    }
}
