package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzgy extends ContentObserver {
    zzgy(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        zzgz.zzk.set(true);
    }
}
