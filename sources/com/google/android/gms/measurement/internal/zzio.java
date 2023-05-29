package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzio implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzip zza;

    /* synthetic */ zzio(zzip zzip, zzin zzin) {
        this.zza = zzip;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzgk zzgk;
        try {
            this.zza.zzs.zzay().zzj().zza("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                zzgk = this.zza.zzs;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.zza.zzs.zzv();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.zza.zzs.zzaz().zzp(new zzim(this, z, data, str, queryParameter));
                        zzgk = this.zza.zzs;
                    }
                }
                zzgk = this.zza.zzs;
            }
        } catch (RuntimeException e) {
            this.zza.zzs.zzay().zzd().zzb("Throwable caught in onActivityCreated", e);
            zzgk = this.zza.zzs;
        } catch (Throwable th) {
            this.zza.zzs.zzs().zzr(activity, bundle);
            throw th;
        }
        zzgk.zzs().zzr(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzs.zzs().zzs(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.zza.zzs.zzs().zzt(activity);
        zzku zzu = this.zza.zzs.zzu();
        zzu.zzs.zzaz().zzp(new zzkn(zzu, zzu.zzs.zzav().elapsedRealtime()));
    }

    public final void onActivityResumed(Activity activity) {
        zzku zzu = this.zza.zzs.zzu();
        zzu.zzs.zzaz().zzp(new zzkm(zzu, zzu.zzs.zzav().elapsedRealtime()));
        this.zza.zzs.zzs().zzu(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzs.zzs().zzv(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
