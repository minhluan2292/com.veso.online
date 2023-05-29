package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzex;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzli;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final class zzln extends zzkz {
    zzln(zzll zzll) {
        super(zzll);
    }

    static final boolean zzA(zzaw zzaw, zzq zzq) {
        Preconditions.checkNotNull(zzaw);
        Preconditions.checkNotNull(zzq);
        return !TextUtils.isEmpty(zzq.zzb) || !TextUtils.isEmpty(zzq.zzq);
    }

    static final zzfw zzB(zzfs zzfs, String str) {
        for (zzfw zzfw : zzfs.zzi()) {
            if (zzfw.zzg().equals(str)) {
                return zzfw;
            }
        }
        return null;
    }

    static final Object zzC(zzfs zzfs, String str) {
        zzfw zzB = zzB(zzfs, str);
        if (zzB == null) {
            return null;
        }
        if (zzB.zzy()) {
            return zzB.zzh();
        }
        if (zzB.zzw()) {
            return Long.valueOf(zzB.zzd());
        }
        if (zzB.zzu()) {
            return Double.valueOf(zzB.zza());
        }
        if (zzB.zzc() <= 0) {
            return null;
        }
        List<zzfw> zzi = zzB.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfw zzfw : zzi) {
            if (zzfw != null) {
                Bundle bundle = new Bundle();
                for (zzfw zzfw2 : zzfw.zzi()) {
                    if (zzfw2.zzy()) {
                        bundle.putString(zzfw2.zzg(), zzfw2.zzh());
                    } else if (zzfw2.zzw()) {
                        bundle.putLong(zzfw2.zzg(), zzfw2.zzd());
                    } else if (zzfw2.zzu()) {
                        bundle.putDouble(zzfw2.zzg(), zzfw2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void zzD(StringBuilder sb, int i, List list) {
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfw zzfw = (zzfw) it.next();
                if (zzfw != null) {
                    zzF(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    zzI(sb, i2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzfw.zzx() ? this.zzs.zzj().zze(zzfw.zzg()) : null);
                    zzI(sb, i2, "string_value", zzfw.zzy() ? zzfw.zzh() : null);
                    zzI(sb, i2, "int_value", zzfw.zzw() ? Long.valueOf(zzfw.zzd()) : null);
                    if (zzfw.zzu()) {
                        d = Double.valueOf(zzfw.zza());
                    }
                    zzI(sb, i2, "double_value", d);
                    if (zzfw.zzc() > 0) {
                        zzD(sb, i2, zzfw.zzi());
                    }
                    zzF(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    private final void zzE(StringBuilder sb, int i, zzel zzel) {
        String str;
        if (zzel != null) {
            zzF(sb, i);
            sb.append("filter {\n");
            if (zzel.zzh()) {
                zzI(sb, i, "complement", Boolean.valueOf(zzel.zzg()));
            }
            if (zzel.zzj()) {
                zzI(sb, i, "param_name", this.zzs.zzj().zze(zzel.zze()));
            }
            if (zzel.zzk()) {
                int i2 = i + 1;
                zzex zzd = zzel.zzd();
                if (zzd != null) {
                    zzF(sb, i2);
                    sb.append("string_filter {\n");
                    if (zzd.zzi()) {
                        switch (zzd.zzj()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        zzI(sb, i2, "match_type", str);
                    }
                    if (zzd.zzh()) {
                        zzI(sb, i2, "expression", zzd.zzd());
                    }
                    if (zzd.zzg()) {
                        zzI(sb, i2, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                    }
                    if (zzd.zza() > 0) {
                        zzF(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : zzd.zze()) {
                            zzF(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    zzF(sb, i2);
                    sb.append("}\n");
                }
            }
            if (zzel.zzi()) {
                zzJ(sb, i + 1, "number_filter", zzel.zzc());
            }
            zzF(sb, i);
            sb.append("}\n");
        }
    }

    private static final void zzF(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static final String zzG(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void zzH(StringBuilder sb, int i, String str, zzgh zzgh) {
        if (zzgh != null) {
            zzF(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (zzgh.zzb() != 0) {
                zzF(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : zzgh.zzk()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (zzgh.zzd() != 0) {
                zzF(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : zzgh.zzn()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (zzgh.zza() != 0) {
                zzF(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (zzfq zzfq : zzgh.zzj()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(zzfq.zzh() ? Integer.valueOf(zzfq.zza()) : null);
                    sb.append(":");
                    sb.append(zzfq.zzg() ? Long.valueOf(zzfq.zzb()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (zzgh.zzc() != 0) {
                zzF(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (zzgj zzgj : zzgh.zzm()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(zzgj.zzi() ? Integer.valueOf(zzgj.zzb()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : zzgj.zzf()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            zzF(sb, 3);
            sb.append("}\n");
        }
    }

    private static final void zzI(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            zzF(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    private static final void zzJ(StringBuilder sb, int i, String str, zzeq zzeq) {
        if (zzeq != null) {
            zzF(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (zzeq.zzg()) {
                int zzm = zzeq.zzm();
                zzI(sb, i, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (zzeq.zzi()) {
                zzI(sb, i, "match_as_float", Boolean.valueOf(zzeq.zzf()));
            }
            if (zzeq.zzh()) {
                zzI(sb, i, "comparison_value", zzeq.zzc());
            }
            if (zzeq.zzk()) {
                zzI(sb, i, "min_comparison_value", zzeq.zze());
            }
            if (zzeq.zzj()) {
                zzI(sb, i, "max_comparison_value", zzeq.zzd());
            }
            zzF(sb, i);
            sb.append("}\n");
        }
    }

    static int zza(zzgb zzgb, String str) {
        if (zzgb != null) {
            for (int i = 0; i < zzgb.zzb(); i++) {
                if (str.equals(zzgb.zzap(i).zzf())) {
                    return i;
                }
            }
        }
        return -1;
    }

    static zzli zzl(zzli zzli, byte[] bArr) throws zzkm {
        zzjo zzb = zzjo.zzb();
        if (zzb != null) {
            return zzli.zzaA(bArr, zzb);
        }
        return zzli.zzaz(bArr);
    }

    static List zzr(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    static boolean zzv(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
    }

    static boolean zzx(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static final void zzz(zzfr zzfr, String str, Object obj) {
        List zzp = zzfr.zzp();
        int i = 0;
        while (true) {
            if (i >= zzp.size()) {
                i = -1;
                break;
            } else if (str.equals(((zzfw) zzp.get(i)).zzg())) {
                break;
            } else {
                i++;
            }
        }
        zzfv zze = zzfw.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        }
        if (i >= 0) {
            zzfr.zzj(i, zze);
        } else {
            zzfr.zze(zze);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzb() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzs.zzv().zzg();
        MessageDigest zzF = zzlt.zzF();
        if (zzF != null) {
            return zzlt.zzp(zzF.digest(bArr));
        }
        this.zzs.zzay().zzd().zza("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzf(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                zzpd.zzc();
                if (this.zzs.zzf().zzs((String) null, zzen.zzam)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(zzf((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList arrayList4 = new ArrayList();
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList4.add(zzf((Map) arrayList3.get(i2), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.zzs.zzay().zzd().zza("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable zzh(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.zzgk r5 = r4.zzs     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzfa r5 = r5.zzay()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzd()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.zza(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzln.zzh(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzaw zzi(com.google.android.gms.internal.measurement.zzaa r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.zze()
            r1 = 1
            android.os.Bundle r0 = r8.zzf(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r9.zzd()
            java.lang.String r1 = com.google.android.gms.measurement.internal.zzhh.zzb(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r9.zzd()
        L_0x002d:
            r3 = r1
            com.google.android.gms.measurement.internal.zzaw r1 = new com.google.android.gms.measurement.internal.zzaw
            com.google.android.gms.measurement.internal.zzau r4 = new com.google.android.gms.measurement.internal.zzau
            r4.<init>(r0)
            long r6 = r9.zza()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzln.zzi(com.google.android.gms.internal.measurement.zzaa):com.google.android.gms.measurement.internal.zzaw");
    }

    /* access modifiers changed from: package-private */
    public final zzfs zzj(zzar zzar) {
        zzfr zze = zzfs.zze();
        zze.zzl(zzar.zze);
        zzat zzat = new zzat(zzar.zzf);
        while (zzat.hasNext()) {
            String zza = zzat.next();
            zzfv zze2 = zzfw.zze();
            zze2.zzj(zza);
            Object zzf = zzar.zzf.zzf(zza);
            Preconditions.checkNotNull(zzf);
            zzt(zze2, zzf);
            zze.zze(zze2);
        }
        return (zzfs) zze.zzaE();
    }

    /* access modifiers changed from: package-private */
    public final String zzm(zzga zzga) {
        if (zzga == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (zzgc zzgc : zzga.zzd()) {
            if (zzgc != null) {
                zzF(sb, 1);
                sb.append("bundle {\n");
                if (zzgc.zzbm()) {
                    zzI(sb, 1, "protocol_version", Integer.valueOf(zzgc.zzd()));
                }
                zzps.zzc();
                if (this.zzs.zzf().zzs((String) null, zzen.zzaH) && zzgc.zzbp()) {
                    zzI(sb, 1, "session_stitching_token", zzgc.zzL());
                }
                zzI(sb, 1, "platform", zzgc.zzJ());
                if (zzgc.zzbi()) {
                    zzI(sb, 1, "gmp_version", Long.valueOf(zzgc.zzn()));
                }
                if (zzgc.zzbt()) {
                    zzI(sb, 1, "uploading_gmp_version", Long.valueOf(zzgc.zzs()));
                }
                if (zzgc.zzbg()) {
                    zzI(sb, 1, "dynamite_version", Long.valueOf(zzgc.zzk()));
                }
                if (zzgc.zzbd()) {
                    zzI(sb, 1, "config_version", Long.valueOf(zzgc.zzi()));
                }
                zzI(sb, 1, "gmp_app_id", zzgc.zzG());
                zzI(sb, 1, "admob_app_id", zzgc.zzx());
                zzI(sb, 1, "app_id", zzgc.zzy());
                zzI(sb, 1, "app_version", zzgc.zzB());
                if (zzgc.zzbb()) {
                    zzI(sb, 1, "app_version_major", Integer.valueOf(zzgc.zza()));
                }
                zzI(sb, 1, "firebase_instance_id", zzgc.zzF());
                if (zzgc.zzbf()) {
                    zzI(sb, 1, "dev_cert_hash", Long.valueOf(zzgc.zzj()));
                }
                zzI(sb, 1, "app_store", zzgc.zzA());
                if (zzgc.zzbs()) {
                    zzI(sb, 1, "upload_timestamp_millis", Long.valueOf(zzgc.zzr()));
                }
                if (zzgc.zzbq()) {
                    zzI(sb, 1, "start_timestamp_millis", Long.valueOf(zzgc.zzq()));
                }
                if (zzgc.zzbh()) {
                    zzI(sb, 1, "end_timestamp_millis", Long.valueOf(zzgc.zzm()));
                }
                if (zzgc.zzbl()) {
                    zzI(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgc.zzp()));
                }
                if (zzgc.zzbk()) {
                    zzI(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgc.zzo()));
                }
                zzI(sb, 1, "app_instance_id", zzgc.zzz());
                zzI(sb, 1, "resettable_device_id", zzgc.zzK());
                zzI(sb, 1, "ds_id", zzgc.zzE());
                if (zzgc.zzbj()) {
                    zzI(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzgc.zzaY()));
                }
                zzI(sb, 1, "os_version", zzgc.zzI());
                zzI(sb, 1, "device_model", zzgc.zzD());
                zzI(sb, 1, "user_default_language", zzgc.zzM());
                if (zzgc.zzbr()) {
                    zzI(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzgc.zzf()));
                }
                if (zzgc.zzbc()) {
                    zzI(sb, 1, "bundle_sequential_index", Integer.valueOf(zzgc.zzb()));
                }
                if (zzgc.zzbo()) {
                    zzI(sb, 1, "service_upload", Boolean.valueOf(zzgc.zzaZ()));
                }
                zzI(sb, 1, "health_monitor", zzgc.zzH());
                if (!this.zzs.zzf().zzs((String) null, zzen.zzah) && zzgc.zzba() && zzgc.zzh() != 0) {
                    zzI(sb, 1, "android_id", Long.valueOf(zzgc.zzh()));
                }
                if (zzgc.zzbn()) {
                    zzI(sb, 1, "retry_counter", Integer.valueOf(zzgc.zze()));
                }
                if (zzgc.zzbe()) {
                    zzI(sb, 1, "consent_signals", zzgc.zzC());
                }
                List<zzgl> zzP = zzgc.zzP();
                if (zzP != null) {
                    for (zzgl zzgl : zzP) {
                        if (zzgl != null) {
                            zzF(sb, 2);
                            sb.append("user_property {\n");
                            zzI(sb, 2, "set_timestamp_millis", zzgl.zzs() ? Long.valueOf(zzgl.zzc()) : null);
                            zzI(sb, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzs.zzj().zzf(zzgl.zzf()));
                            zzI(sb, 2, "string_value", zzgl.zzg());
                            zzI(sb, 2, "int_value", zzgl.zzr() ? Long.valueOf(zzgl.zzb()) : null);
                            zzI(sb, 2, "double_value", zzgl.zzq() ? Double.valueOf(zzgl.zza()) : null);
                            zzF(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfo> zzN = zzgc.zzN();
                if (zzN != null) {
                    for (zzfo zzfo : zzN) {
                        if (zzfo != null) {
                            zzF(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzfo.zzk()) {
                                zzI(sb, 2, "audience_id", Integer.valueOf(zzfo.zza()));
                            }
                            if (zzfo.zzm()) {
                                zzI(sb, 2, "new_audience", Boolean.valueOf(zzfo.zzj()));
                            }
                            zzH(sb, 2, "current_data", zzfo.zzd());
                            if (zzfo.zzn()) {
                                zzH(sb, 2, "previous_data", zzfo.zze());
                            }
                            zzF(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfs> zzO = zzgc.zzO();
                if (zzO != null) {
                    for (zzfs zzfs : zzO) {
                        if (zzfs != null) {
                            zzF(sb, 2);
                            sb.append("event {\n");
                            zzI(sb, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzs.zzj().zzd(zzfs.zzh()));
                            if (zzfs.zzu()) {
                                zzI(sb, 2, "timestamp_millis", Long.valueOf(zzfs.zzd()));
                            }
                            if (zzfs.zzt()) {
                                zzI(sb, 2, "previous_timestamp_millis", Long.valueOf(zzfs.zzc()));
                            }
                            if (zzfs.zzs()) {
                                zzI(sb, 2, "count", Integer.valueOf(zzfs.zza()));
                            }
                            if (zzfs.zzb() != 0) {
                                zzD(sb, 2, zzfs.zzi());
                            }
                            zzF(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zzF(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String zzo(zzej zzej) {
        if (zzej == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzej.zzp()) {
            zzI(sb, 0, "filter_id", Integer.valueOf(zzej.zzb()));
        }
        zzI(sb, 0, "event_name", this.zzs.zzj().zzd(zzej.zzg()));
        String zzG = zzG(zzej.zzk(), zzej.zzm(), zzej.zzn());
        if (!zzG.isEmpty()) {
            zzI(sb, 0, "filter_type", zzG);
        }
        if (zzej.zzo()) {
            zzJ(sb, 1, "event_count_filter", zzej.zzf());
        }
        if (zzej.zza() > 0) {
            sb.append("  filters {\n");
            for (zzel zzE : zzej.zzh()) {
                zzE(sb, 2, zzE);
            }
        }
        zzF(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String zzp(zzes zzes) {
        if (zzes == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzes.zzj()) {
            zzI(sb, 0, "filter_id", Integer.valueOf(zzes.zza()));
        }
        zzI(sb, 0, "property_name", this.zzs.zzj().zzf(zzes.zze()));
        String zzG = zzG(zzes.zzg(), zzes.zzh(), zzes.zzi());
        if (!zzG.isEmpty()) {
            zzI(sb, 0, "filter_type", zzG);
        }
        zzE(sb, 1, zzes.zzb());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final List zzq(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzs.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzs.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    public final Map zzs(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            zzpd.zzc();
            if (!this.zzs.zzf().zzs((String) null, zzen.zzam) ? (obj instanceof Bundle[]) || (obj instanceof ArrayList) || (obj instanceof Bundle) : (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (obj instanceof Parcelable[]) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zzs((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zzs((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zzs((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void zzt(zzfv zzfv, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfv.zzg();
        zzfv.zze();
        zzfv.zzd();
        zzfv.zzf();
        if (obj instanceof String) {
            zzfv.zzk((String) obj);
        } else if (obj instanceof Long) {
            zzfv.zzi(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfv.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfv zze = zzfw.zze();
                    for (String str : bundle.keySet()) {
                        zzfv zze2 = zzfw.zze();
                        zze2.zzj(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zze2.zzi(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zze2.zzk((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zze2.zzh(((Double) obj2).doubleValue());
                        }
                        zze.zzc(zze2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((zzfw) zze.zzaE());
                    }
                }
            }
            zzfv.zzb(arrayList);
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzu(zzgk zzgk, Object obj) {
        Preconditions.checkNotNull(obj);
        zzgk.zzc();
        zzgk.zzb();
        zzgk.zza();
        if (obj instanceof String) {
            zzgk.zzh((String) obj);
        } else if (obj instanceof Long) {
            zzgk.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzgk.zzd(((Double) obj).doubleValue());
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzw(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.zzs.zzav().currentTimeMillis() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zzy(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.zzs.zzay().zzd().zzb("Failed to gzip content", e);
            throw e;
        }
    }
}
