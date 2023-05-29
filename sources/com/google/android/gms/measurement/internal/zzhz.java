package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzhz implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzip zzb;

    zzhz(zzip zzip, Bundle bundle) {
        this.zzb = zzip;
        this.zza = bundle;
    }

    public final void run() {
        zzip zzip = this.zzb;
        Bundle bundle = this.zza;
        zzip.zzg();
        zzip.zza();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        if (!zzip.zzs.zzJ()) {
            zzip.zzs.zzay().zzj().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzlo zzlo = new zzlo(checkNotEmpty, 0, (Object) null, "");
        try {
            zzac zzac = r4;
            zzac zzac2 = new zzac(bundle.getString("app_id"), "", zzlo, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), (zzaw) null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), (zzaw) null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzip.zzs.zzv().zzz(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true));
            zzip.zzs.zzt().zzE(zzac);
        } catch (IllegalArgumentException unused) {
        }
    }
}
