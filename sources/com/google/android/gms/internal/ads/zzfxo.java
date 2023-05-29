package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfxo extends OutputStream {
    zzfxo() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    public final void write(int i) {
    }

    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
        zzfsx.zzg(i, i2 + i, bArr.length);
    }
}
