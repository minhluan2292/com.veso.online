package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
abstract class zzav {
    private static final zzcc zza;

    static {
        zzcc zzcc = null;
        try {
            Object newInstance = zzau.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzcgp.zzj("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzcc = queryLocalInterface instanceof zzcc ? (zzcc) queryLocalInterface : new zzca(iBinder);
                }
            }
        } catch (Exception unused) {
            zzcgp.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzcc;
    }

    zzav() {
    }

    private final Object zze() {
        zzcc zzcc = zza;
        if (zzcc != null) {
            try {
                return zzb(zzcc);
            } catch (RemoteException e) {
                zzcgp.zzk("Cannot invoke local loader using ClientApi class.", e);
                return null;
            }
        } else {
            zzcgp.zzj("ClientApi class cannot be loaded.");
            return null;
        }
    }

    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e) {
            zzcgp.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object zza();

    /* access modifiers changed from: protected */
    public abstract Object zzb(zzcc zzcc) throws RemoteException;

    /* access modifiers changed from: protected */
    public abstract Object zzc() throws RemoteException;

    public final Object zzd(Context context, boolean z) {
        boolean z2;
        Object obj;
        if (!z) {
            zzaw.zzb();
            if (!zzcgi.zzr(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzcgp.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = z | (!(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID)));
        zzbjc.zzc(context);
        if (((Boolean) zzbkn.zza.zze()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) zzbkn.zzb.zze()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z4;
            z2 = false;
        }
        if (z3) {
            obj = zze();
            if (obj == null && !z2) {
                obj = zzf();
            }
        } else {
            Object zzf = zzf();
            if (zzf == null) {
                if (zzaw.zze().nextInt(((Long) zzbla.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzaw.zzb().zzm(context, zzaw.zzc().zza, "gmob-apps", bundle, true);
                }
            }
            obj = zzf == null ? zze() : zzf;
        }
        return obj == null ? zza() : obj;
    }
}
