package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjy;
import com.google.android.gms.internal.measurement.zzkc;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.0.0 */
public class zzjy<MessageType extends zzkc<MessageType, BuilderType>, BuilderType extends zzjy<MessageType, BuilderType>> extends zzik<MessageType, BuilderType> {
    protected zzkc zza;
    protected boolean zzb = false;
    private final zzkc zzc;

    protected zzjy(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzkc) messagetype.zzl(4, (Object) null, (Object) null);
    }

    private static final void zza(zzkc zzkc, zzkc zzkc2) {
        zzlr.zza().zzb(zzkc.getClass()).zzg(zzkc, zzkc2);
    }

    /* renamed from: zzaB */
    public final zzjy zzau() {
        zzjy zzjy = (zzjy) this.zzc.zzl(5, (Object) null, (Object) null);
        zzjy.zzaC(zzaG());
        return zzjy;
    }

    public final zzjy zzaC(zzkc zzkc) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zza(this.zza, zzkc);
        return this;
    }

    public final zzjy zzaD(byte[] bArr, int i, int i2, zzjo zzjo) throws zzkm {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        try {
            zzlr.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i2, new zzio(zzjo));
            return this;
        } catch (zzkm e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzkm.zzf();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r3 != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType zzaE() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.zzkc r0 = r5.zzaG()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.zzl(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0015
            goto L_0x0032
        L_0x0015:
            if (r3 == 0) goto L_0x0033
            com.google.android.gms.internal.measurement.zzlr r3 = com.google.android.gms.internal.measurement.zzlr.zza()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.zzlu r3 = r3.zzb(r4)
            boolean r3 = r3.zzk(r0)
            if (r1 == r3) goto L_0x002b
            r1 = r2
            goto L_0x002c
        L_0x002b:
            r1 = r0
        L_0x002c:
            r4 = 2
            r0.zzl(r4, r1, r2)
            if (r3 == 0) goto L_0x0033
        L_0x0032:
            return r0
        L_0x0033:
            com.google.android.gms.internal.measurement.zzmk r1 = new com.google.android.gms.internal.measurement.zzmk
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjy.zzaE():com.google.android.gms.internal.measurement.zzkc");
    }

    /* renamed from: zzaF */
    public MessageType zzaG() {
        if (this.zzb) {
            return this.zza;
        }
        zzkc zzkc = this.zza;
        zzlr.zza().zzb(zzkc.getClass()).zzf(zzkc);
        this.zzb = true;
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public void zzaI() {
        zzkc zzkc = (zzkc) this.zza.zzl(4, (Object) null, (Object) null);
        zza(zzkc, this.zza);
        this.zza = zzkc;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ zzik zzav(zzil zzil) {
        zzaC((zzkc) zzil);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzik zzaw(byte[] bArr, int i, int i2) throws zzkm {
        zzaD(bArr, 0, i2, zzjo.zza());
        return this;
    }

    public final /* bridge */ /* synthetic */ zzik zzax(byte[] bArr, int i, int i2, zzjo zzjo) throws zzkm {
        zzaD(bArr, 0, i2, zzjo);
        return this;
    }

    public final /* synthetic */ zzlj zzbR() {
        return this.zzc;
    }
}
