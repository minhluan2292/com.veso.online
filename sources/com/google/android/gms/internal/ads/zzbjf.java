package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import com.veso.online.data.model.XosoConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbjf {
    private final String zza = ((String) zzbkm.zzb.zze());
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbjf(Context context, String str) {
        String str2;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", XosoConfig.REGION_ID_MIDDLE);
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        linkedHashMap.put("device", zzs.zzq());
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        linkedHashMap.put("app", str2);
        zzt.zzp();
        String str3 = "0";
        linkedHashMap.put("is_lite_sdk", true != zzs.zzA(context) ? str3 : XosoConfig.REGION_ID_SOUTH);
        Future zzb2 = zzt.zzm().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzcbh) zzb2.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzcbh) zzb2.get()).zzl));
        } catch (Exception e) {
            zzt.zzo().zzt(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) zzay.zzc().zzb(zzbjc.zziQ)).booleanValue()) {
            this.zzb.put("is_bstar", true == DeviceProperties.isBstar(context) ? XosoConfig.REGION_ID_SOUTH : str3);
        }
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final String zzc() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final Map zzd() {
        return this.zzb;
    }
}
