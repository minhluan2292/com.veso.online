package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zznw;
import com.google.firebase.messaging.Constants;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzfq implements Runnable {
    final /* synthetic */ zzbr zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzfr zzc;

    zzfq(zzfr zzfr, zzbr zzbr, ServiceConnection serviceConnection) {
        this.zzc = zzfr;
        this.zza = zzbr;
        this.zzb = serviceConnection;
    }

    public final void run() {
        Bundle bundle;
        zzfr zzfr = this.zzc;
        zzfs zzfs = zzfr.zza;
        String zza2 = zzfr.zzb;
        zzbr zzbr = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzfs.zza.zzaz().zzg();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", zza2);
        try {
            bundle = zzbr.zzd(bundle2);
            if (bundle == null) {
                zzfs.zza.zzay().zzd().zza("Install Referrer Service returned a null response");
                bundle = null;
            }
        } catch (Exception e) {
            zzfs.zza.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzfs.zza.zzaz().zzg();
        zzgk.zzO();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                zzfs.zza.zzay().zzk().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzfs.zza.zzay().zzd().zza("No referrer defined in Install Referrer response");
                } else {
                    zzfs.zza.zzay().zzj().zzb("InstallReferrer API result", string);
                    zzlt zzv = zzfs.zza.zzv();
                    Uri parse = Uri.parse("?".concat(string));
                    zznw.zzc();
                    boolean zzs = zzfs.zza.zzf().zzs((String) null, zzen.zzau);
                    zznw.zzc();
                    Bundle zzs2 = zzv.zzs(parse, zzs, zzfs.zza.zzf().zzs((String) null, zzen.zzax));
                    if (zzs2 == null) {
                        zzfs.zza.zzay().zzd().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zzs2.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                zzfs.zza.zzay().zzd().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zzs2.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzfs.zza.zzm().zzd.zza()) {
                            zzfs.zza.zzay().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzfs.zza.zzJ()) {
                            zzfs.zza.zzm().zzd.zzb(j);
                            zzfs.zza.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zzs2.putString("_cis", "referrer API v2");
                            zzfs.zza.zzq().zzG(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zzs2, zza2);
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzfs.zza.zzau(), serviceConnection);
    }
}
