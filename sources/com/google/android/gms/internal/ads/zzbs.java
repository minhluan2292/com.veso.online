package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbs {
    public final int zza;

    public zzbs(int i, int i2) {
        this.zza = i2;
    }

    public final int zza() {
        int i = this.zza;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i != 42) {
            return i != 22 ? i != 23 ? 0 : 15 : BasicMeasure.EXACTLY;
        }
        return 16;
    }
}
