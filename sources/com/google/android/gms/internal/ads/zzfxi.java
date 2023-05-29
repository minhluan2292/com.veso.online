package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfxi {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfsy zzfsy) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzfxf) {
                zzfxf zzfxf = (zzfxf) sortedSet;
                return new zzfxg((SortedSet) zzfxf.zza, zzftb.zza(zzfxf.zzb, zzfsy));
            }
            Objects.requireNonNull(sortedSet);
            Objects.requireNonNull(zzfsy);
            return new zzfxg(sortedSet, zzfsy);
        } else if (set instanceof zzfxf) {
            zzfxf zzfxf2 = (zzfxf) set;
            return new zzfxf(zzfxf2.zza, zzftb.zza(zzfxf2.zzb, zzfsy));
        } else {
            Objects.requireNonNull(set);
            Objects.requireNonNull(zzfsy);
            return new zzfxf(set, zzfsy);
        }
    }

    static boolean zzc(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    static boolean zze(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    static boolean zzd(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof zzfws) {
            collection = ((zzfws) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        Objects.requireNonNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
