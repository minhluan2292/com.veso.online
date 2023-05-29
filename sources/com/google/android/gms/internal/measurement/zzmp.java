package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.0.0 */
final class zzmp implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzmq zzb;

    zzmp(zzmq zzmq) {
        this.zzb = zzmq;
        this.zza = zzmq.zza.iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
