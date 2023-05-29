package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzam extends zzkz {
    /* access modifiers changed from: private */
    public static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */
    public static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    /* access modifiers changed from: private */
    public static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */
    public static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */
    public static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzal zzj;
    /* access modifiers changed from: private */
    public final zzkv zzk = new zzkv(this.zzs.zzav());

    zzam(zzll zzll) {
        super(zzll);
        this.zzs.zzf();
        this.zzj = new zzal(this, this.zzs.zzau(), "google_app_measurement.db");
    }

    static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = zzh().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaa(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = zzh().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j;
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzd("Error deleting user property. appId", zzfa.zzn(str), this.zzs.zzj().zzf(str2), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0326, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.zze());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0338, code lost:
        if (r3.zzk() == false) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x033a, code lost:
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0343, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0344, code lost:
        r11.put("session_scoped", r0);
        r11.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0358, code lost:
        if (zzh().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x035a, code lost:
        r9.zzs.zzay().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzfa.zzn(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x036e, code lost:
        r0 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0372, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r9.zzs.zzay().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzfa.zzn(r24), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03bd, code lost:
        r3 = r25;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x018b, code lost:
        r11 = r0.zzh().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0197, code lost:
        if (r11.hasNext() == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a3, code lost:
        if (((com.google.android.gms.internal.measurement.zzes) r11.next()).zzj() != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a5, code lost:
        r9.zzs.zzay().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzfa.zzn(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01be, code lost:
        r11 = r0.zzg().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r11.hasNext() == false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r12 = (com.google.android.gms.internal.measurement.zzej) r11.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f0, code lost:
        if (r12.zzg().isEmpty() == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f2, code lost:
        r0 = r9.zzs.zzay().zzk();
        r8 = com.google.android.gms.measurement.internal.zzfa.zzn(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x020a, code lost:
        if (r12.zzp() == false) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x020c, code lost:
        r20 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0217, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0219, code lost:
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0224, code lost:
        r3 = r12.zzby();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r2);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x023d, code lost:
        if (r12.zzp() == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x023f, code lost:
        r8 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0248, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0249, code lost:
        r4.put("filter_id", r8);
        r4.put("event_name", r12.zzg());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0259, code lost:
        if (r12.zzq() == false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025b, code lost:
        r8 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0264, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0265, code lost:
        r4.put("session_scoped", r8);
        r4.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0279, code lost:
        if (zzh().insertWithOnConflict("event_filters", (java.lang.String) null, r4, 5) != -1) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x027b, code lost:
        r9.zzs.zzay().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzfa.zzn(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x028e, code lost:
        r3 = r25;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02aa, code lost:
        r21 = r4;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02b8, code lost:
        if (r0.hasNext() == false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02ba, code lost:
        r3 = (com.google.android.gms.internal.measurement.zzes) r0.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02d4, code lost:
        if (r3.zze().isEmpty() == false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d6, code lost:
        r0 = r9.zzs.zzay().zzk();
        r7 = com.google.android.gms.measurement.internal.zzfa.zzn(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ee, code lost:
        if (r3.zzj() == false) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02f0, code lost:
        r3 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02f9, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02fa, code lost:
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0303, code lost:
        r4 = r3.zzby();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r2);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x031a, code lost:
        if (r3.zzj() == false) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x031c, code lost:
        r12 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0325, code lost:
        r12 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzB(java.lang.String r24, java.util.List r25) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r5 = "event_filters"
            java.lang.String r6 = "property_filters"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r25)
            r8 = 0
        L_0x0012:
            int r9 = r25.size()
            if (r8 >= r9) goto L_0x00e9
            java.lang.Object r9 = r3.get(r8)
            com.google.android.gms.internal.measurement.zzeh r9 = (com.google.android.gms.internal.measurement.zzeh) r9
            com.google.android.gms.internal.measurement.zzjy r9 = r9.zzbB()
            com.google.android.gms.internal.measurement.zzeg r9 = (com.google.android.gms.internal.measurement.zzeg) r9
            int r11 = r9.zza()
            if (r11 == 0) goto L_0x00a6
            r12 = r9
            r11 = 0
        L_0x002c:
            int r13 = r12.zza()
            if (r11 >= r13) goto L_0x00a3
            com.google.android.gms.internal.measurement.zzej r13 = r12.zze(r11)
            com.google.android.gms.internal.measurement.zzjy r13 = r13.zzbB()
            com.google.android.gms.internal.measurement.zzei r13 = (com.google.android.gms.internal.measurement.zzei) r13
            com.google.android.gms.internal.measurement.zzjy r14 = r13.zzau()
            com.google.android.gms.internal.measurement.zzei r14 = (com.google.android.gms.internal.measurement.zzei) r14
            java.lang.String r15 = r13.zze()
            java.lang.String r15 = com.google.android.gms.measurement.internal.zzhh.zzb(r15)
            if (r15 == 0) goto L_0x0051
            r14.zzb(r15)
            r15 = 1
            goto L_0x0052
        L_0x0051:
            r15 = 0
        L_0x0052:
            r7 = 0
        L_0x0053:
            int r10 = r13.zza()
            if (r7 >= r10) goto L_0x008b
            com.google.android.gms.internal.measurement.zzel r10 = r13.zzd(r7)
            r16 = r13
            java.lang.String r13 = r10.zze()
            r17 = r4
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.zzhi.zza
            java.lang.String[] r1 = com.google.android.gms.measurement.internal.zzhi.zzb
            java.lang.String r1 = com.google.android.gms.measurement.internal.zziv.zzb(r13, r4, r1)
            if (r1 == 0) goto L_0x0082
            com.google.android.gms.internal.measurement.zzjy r4 = r10.zzbB()
            com.google.android.gms.internal.measurement.zzek r4 = (com.google.android.gms.internal.measurement.zzek) r4
            r4.zza(r1)
            com.google.android.gms.internal.measurement.zzkc r1 = r4.zzaE()
            com.google.android.gms.internal.measurement.zzel r1 = (com.google.android.gms.internal.measurement.zzel) r1
            r14.zzc(r7, r1)
            r15 = 1
        L_0x0082:
            int r7 = r7 + 1
            r1 = r23
            r13 = r16
            r4 = r17
            goto L_0x0053
        L_0x008b:
            r17 = r4
            if (r15 == 0) goto L_0x009c
            r12.zzc(r11, r14)
            com.google.android.gms.internal.measurement.zzkc r1 = r9.zzaE()
            com.google.android.gms.internal.measurement.zzeh r1 = (com.google.android.gms.internal.measurement.zzeh) r1
            r3.set(r8, r1)
            r12 = r9
        L_0x009c:
            int r11 = r11 + 1
            r1 = r23
            r4 = r17
            goto L_0x002c
        L_0x00a3:
            r17 = r4
            goto L_0x00a9
        L_0x00a6:
            r17 = r4
            r12 = r9
        L_0x00a9:
            int r1 = r12.zzb()
            if (r1 == 0) goto L_0x00e1
            r1 = 0
        L_0x00b0:
            int r4 = r12.zzb()
            if (r1 >= r4) goto L_0x00e1
            com.google.android.gms.internal.measurement.zzes r4 = r12.zzf(r1)
            java.lang.String r7 = r4.zze()
            java.lang.String[] r10 = com.google.android.gms.measurement.internal.zzhj.zza
            java.lang.String[] r11 = com.google.android.gms.measurement.internal.zzhj.zzb
            java.lang.String r7 = com.google.android.gms.measurement.internal.zziv.zzb(r7, r10, r11)
            if (r7 == 0) goto L_0x00de
            com.google.android.gms.internal.measurement.zzjy r4 = r4.zzbB()
            com.google.android.gms.internal.measurement.zzer r4 = (com.google.android.gms.internal.measurement.zzer) r4
            r4.zza(r7)
            r12.zzd(r1, r4)
            com.google.android.gms.internal.measurement.zzkc r4 = r9.zzaE()
            com.google.android.gms.internal.measurement.zzeh r4 = (com.google.android.gms.internal.measurement.zzeh) r4
            r3.set(r8, r4)
            r12 = r9
        L_0x00de:
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00e1:
            int r8 = r8 + 1
            r1 = r23
            r4 = r17
            goto L_0x0012
        L_0x00e9:
            r17 = r4
            r23.zzW()
            r23.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r25)
            android.database.sqlite.SQLiteDatabase r1 = r23.zzh()
            r1.beginTransaction()
            r23.zzW()     // Catch:{ all -> 0x04aa }
            r23.zzg()     // Catch:{ all -> 0x04aa }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch:{ all -> 0x04aa }
            android.database.sqlite.SQLiteDatabase r4 = r23.zzh()     // Catch:{ all -> 0x04aa }
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x04aa }
            r9 = 0
            r8[r9] = r2     // Catch:{ all -> 0x04aa }
            r4.delete(r6, r0, r8)     // Catch:{ all -> 0x04aa }
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x04aa }
            r8[r9] = r2     // Catch:{ all -> 0x04aa }
            r4.delete(r5, r0, r8)     // Catch:{ all -> 0x04aa }
            java.util.Iterator r4 = r25.iterator()     // Catch:{ all -> 0x04aa }
        L_0x011f:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x04aa }
            if (r0 == 0) goto L_0x03c3
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x04aa }
            com.google.android.gms.internal.measurement.zzeh r0 = (com.google.android.gms.internal.measurement.zzeh) r0     // Catch:{ all -> 0x04aa }
            r23.zzW()     // Catch:{ all -> 0x04aa }
            r23.zzg()     // Catch:{ all -> 0x04aa }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch:{ all -> 0x04aa }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x04aa }
            boolean r9 = r0.zzk()     // Catch:{ all -> 0x04aa }
            if (r9 != 0) goto L_0x0153
            r9 = r23
            com.google.android.gms.measurement.internal.zzgk r0 = r9.zzs     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzk()     // Catch:{ all -> 0x04a8 }
            java.lang.String r7 = "Audience with no ID. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfa.zzn(r24)     // Catch:{ all -> 0x04a8 }
            r0.zzb(r7, r8)     // Catch:{ all -> 0x04a8 }
            goto L_0x011f
        L_0x0153:
            r9 = r23
            int r10 = r0.zza()     // Catch:{ all -> 0x04a8 }
            java.util.List r11 = r0.zzg()     // Catch:{ all -> 0x04a8 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04a8 }
        L_0x0161:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04a8 }
            if (r12 == 0) goto L_0x018b
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.internal.measurement.zzej r12 = (com.google.android.gms.internal.measurement.zzej) r12     // Catch:{ all -> 0x04a8 }
            boolean r12 = r12.zzp()     // Catch:{ all -> 0x04a8 }
            if (r12 != 0) goto L_0x0161
            com.google.android.gms.measurement.internal.zzgk r0 = r9.zzs     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzk()     // Catch:{ all -> 0x04a8 }
            java.lang.String r7 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfa.zzn(r24)     // Catch:{ all -> 0x04a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a8 }
            r0.zzc(r7, r8, r10)     // Catch:{ all -> 0x04a8 }
            goto L_0x011f
        L_0x018b:
            java.util.List r11 = r0.zzh()     // Catch:{ all -> 0x04a8 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04a8 }
        L_0x0193:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04a8 }
            if (r12 == 0) goto L_0x01be
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.internal.measurement.zzes r12 = (com.google.android.gms.internal.measurement.zzes) r12     // Catch:{ all -> 0x04a8 }
            boolean r12 = r12.zzj()     // Catch:{ all -> 0x04a8 }
            if (r12 != 0) goto L_0x0193
            com.google.android.gms.measurement.internal.zzgk r0 = r9.zzs     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzk()     // Catch:{ all -> 0x04a8 }
            java.lang.String r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfa.zzn(r24)     // Catch:{ all -> 0x04a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a8 }
            r0.zzc(r7, r8, r10)     // Catch:{ all -> 0x04a8 }
            goto L_0x011f
        L_0x01be:
            java.util.List r11 = r0.zzg()     // Catch:{ all -> 0x04a8 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04a8 }
        L_0x01c6:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04a8 }
            java.lang.String r7 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r8 = "audience_id"
            java.lang.String r15 = "app_id"
            if (r12 == 0) goto L_0x02aa
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.internal.measurement.zzej r12 = (com.google.android.gms.internal.measurement.zzej) r12     // Catch:{ all -> 0x04a8 }
            r23.zzW()     // Catch:{ all -> 0x04a8 }
            r23.zzg()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)     // Catch:{ all -> 0x04a8 }
            java.lang.String r21 = r12.zzg()     // Catch:{ all -> 0x04a8 }
            boolean r21 = r21.isEmpty()     // Catch:{ all -> 0x04a8 }
            if (r21 == 0) goto L_0x0224
            com.google.android.gms.measurement.internal.zzgk r0 = r9.zzs     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzk()     // Catch:{ all -> 0x04a8 }
            java.lang.String r7 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfa.zzn(r24)     // Catch:{ all -> 0x04a8 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a8 }
            boolean r13 = r12.zzp()     // Catch:{ all -> 0x04a8 }
            if (r13 == 0) goto L_0x0217
            int r12 = r12.zzb()     // Catch:{ all -> 0x04a8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04a8 }
            r20 = r12
            goto L_0x0219
        L_0x0217:
            r20 = 0
        L_0x0219:
            java.lang.String r12 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x04a8 }
            r0.zzd(r7, r8, r11, r12)     // Catch:{ all -> 0x04a8 }
            r21 = r4
            goto L_0x0386
        L_0x0224:
            byte[] r3 = r12.zzby()     // Catch:{ all -> 0x04a8 }
            r21 = r4
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x04a8 }
            r4.<init>()     // Catch:{ all -> 0x04a8 }
            r4.put(r15, r2)     // Catch:{ all -> 0x04a8 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a8 }
            r4.put(r8, r15)     // Catch:{ all -> 0x04a8 }
            boolean r8 = r12.zzp()     // Catch:{ all -> 0x04a8 }
            if (r8 == 0) goto L_0x0248
            int r8 = r12.zzb()     // Catch:{ all -> 0x04a8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x04a8 }
            goto L_0x0249
        L_0x0248:
            r8 = 0
        L_0x0249:
            r4.put(r14, r8)     // Catch:{ all -> 0x04a8 }
            java.lang.String r8 = "event_name"
            java.lang.String r14 = r12.zzg()     // Catch:{ all -> 0x04a8 }
            r4.put(r8, r14)     // Catch:{ all -> 0x04a8 }
            boolean r8 = r12.zzq()     // Catch:{ all -> 0x04a8 }
            if (r8 == 0) goto L_0x0264
            boolean r8 = r12.zzn()     // Catch:{ all -> 0x04a8 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x04a8 }
            goto L_0x0265
        L_0x0264:
            r8 = 0
        L_0x0265:
            r4.put(r13, r8)     // Catch:{ all -> 0x04a8 }
            r4.put(r7, r3)     // Catch:{ all -> 0x04a8 }
            android.database.sqlite.SQLiteDatabase r3 = r23.zzh()     // Catch:{ SQLiteException -> 0x0294 }
            r7 = 5
            r8 = 0
            long r3 = r3.insertWithOnConflict(r5, r8, r4, r7)     // Catch:{ SQLiteException -> 0x0294 }
            r7 = -1
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x028e
            com.google.android.gms.measurement.internal.zzgk r3 = r9.zzs     // Catch:{ SQLiteException -> 0x0294 }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ SQLiteException -> 0x0294 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ SQLiteException -> 0x0294 }
            java.lang.String r4 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfa.zzn(r24)     // Catch:{ SQLiteException -> 0x0294 }
            r3.zzb(r4, r7)     // Catch:{ SQLiteException -> 0x0294 }
        L_0x028e:
            r3 = r25
            r4 = r21
            goto L_0x01c6
        L_0x0294:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgk r3 = r9.zzs     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ all -> 0x04a8 }
            java.lang.String r4 = "Error storing event filter. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfa.zzn(r24)     // Catch:{ all -> 0x04a8 }
            r3.zzc(r4, r7, r0)     // Catch:{ all -> 0x04a8 }
            goto L_0x0386
        L_0x02aa:
            r21 = r4
            java.util.List r0 = r0.zzh()     // Catch:{ all -> 0x04a8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x04a8 }
        L_0x02b4:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x04a8 }
            if (r3 == 0) goto L_0x03bd
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.internal.measurement.zzes r3 = (com.google.android.gms.internal.measurement.zzes) r3     // Catch:{ all -> 0x04a8 }
            r23.zzW()     // Catch:{ all -> 0x04a8 }
            r23.zzg()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x04a8 }
            java.lang.String r4 = r3.zze()     // Catch:{ all -> 0x04a8 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x04a8 }
            if (r4 == 0) goto L_0x0303
            com.google.android.gms.measurement.internal.zzgk r0 = r9.zzs     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzk()     // Catch:{ all -> 0x04a8 }
            java.lang.String r4 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfa.zzn(r24)     // Catch:{ all -> 0x04a8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a8 }
            boolean r11 = r3.zzj()     // Catch:{ all -> 0x04a8 }
            if (r11 == 0) goto L_0x02f9
            int r3 = r3.zza()     // Catch:{ all -> 0x04a8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x04a8 }
            goto L_0x02fa
        L_0x02f9:
            r3 = 0
        L_0x02fa:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x04a8 }
            r0.zzd(r4, r7, r8, r3)     // Catch:{ all -> 0x04a8 }
            goto L_0x0386
        L_0x0303:
            byte[] r4 = r3.zzby()     // Catch:{ all -> 0x04a8 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x04a8 }
            r11.<init>()     // Catch:{ all -> 0x04a8 }
            r11.put(r15, r2)     // Catch:{ all -> 0x04a8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a8 }
            r11.put(r8, r12)     // Catch:{ all -> 0x04a8 }
            boolean r12 = r3.zzj()     // Catch:{ all -> 0x04a8 }
            if (r12 == 0) goto L_0x0325
            int r12 = r3.zza()     // Catch:{ all -> 0x04a8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04a8 }
            goto L_0x0326
        L_0x0325:
            r12 = 0
        L_0x0326:
            r11.put(r14, r12)     // Catch:{ all -> 0x04a8 }
            java.lang.String r12 = "property_name"
            r22 = r0
            java.lang.String r0 = r3.zze()     // Catch:{ all -> 0x04a8 }
            r11.put(r12, r0)     // Catch:{ all -> 0x04a8 }
            boolean r0 = r3.zzk()     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x0343
            boolean r0 = r3.zzi()     // Catch:{ all -> 0x04a8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04a8 }
            goto L_0x0344
        L_0x0343:
            r0 = 0
        L_0x0344:
            r11.put(r13, r0)     // Catch:{ all -> 0x04a8 }
            r11.put(r7, r4)     // Catch:{ all -> 0x04a8 }
            android.database.sqlite.SQLiteDatabase r0 = r23.zzh()     // Catch:{ SQLiteException -> 0x0372 }
            r3 = 0
            r4 = 5
            long r11 = r0.insertWithOnConflict(r6, r3, r11, r4)     // Catch:{ SQLiteException -> 0x0372 }
            r18 = -1
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x036e
            com.google.android.gms.measurement.internal.zzgk r0 = r9.zzs     // Catch:{ SQLiteException -> 0x0372 }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ SQLiteException -> 0x0372 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzd()     // Catch:{ SQLiteException -> 0x0372 }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r24)     // Catch:{ SQLiteException -> 0x0372 }
            r0.zzb(r3, r4)     // Catch:{ SQLiteException -> 0x0372 }
            goto L_0x0386
        L_0x036e:
            r0 = r22
            goto L_0x02b4
        L_0x0372:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgk r3 = r9.zzs     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ all -> 0x04a8 }
            java.lang.String r4 = "Error storing property filter. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfa.zzn(r24)     // Catch:{ all -> 0x04a8 }
            r3.zzc(r4, r7, r0)     // Catch:{ all -> 0x04a8 }
        L_0x0386:
            r23.zzW()     // Catch:{ all -> 0x04a8 }
            r23.zzg()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch:{ all -> 0x04a8 }
            android.database.sqlite.SQLiteDatabase r0 = r23.zzh()     // Catch:{ all -> 0x04a8 }
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x04a8 }
            r3 = 0
            r4[r3] = r2     // Catch:{ all -> 0x04a8 }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04a8 }
            r7 = 1
            r4[r7] = r3     // Catch:{ all -> 0x04a8 }
            r3 = r17
            r0.delete(r6, r3, r4)     // Catch:{ all -> 0x04a8 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x04a8 }
            r7 = 0
            r4[r7] = r2     // Catch:{ all -> 0x04a8 }
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04a8 }
            r8 = 1
            r4[r8] = r7     // Catch:{ all -> 0x04a8 }
            r0.delete(r5, r3, r4)     // Catch:{ all -> 0x04a8 }
            r17 = r3
            r4 = r21
            r3 = r25
            goto L_0x011f
        L_0x03bd:
            r3 = r25
            r4 = r21
            goto L_0x011f
        L_0x03c3:
            r3 = 0
            r9 = r23
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x04a8 }
            r0.<init>()     // Catch:{ all -> 0x04a8 }
            java.util.Iterator r4 = r25.iterator()     // Catch:{ all -> 0x04a8 }
        L_0x03cf:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x04a8 }
            if (r5 == 0) goto L_0x03ef
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.internal.measurement.zzeh r5 = (com.google.android.gms.internal.measurement.zzeh) r5     // Catch:{ all -> 0x04a8 }
            boolean r6 = r5.zzk()     // Catch:{ all -> 0x04a8 }
            if (r6 == 0) goto L_0x03ea
            int r5 = r5.zza()     // Catch:{ all -> 0x04a8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x04a8 }
            goto L_0x03eb
        L_0x03ea:
            r8 = r3
        L_0x03eb:
            r0.add(r8)     // Catch:{ all -> 0x04a8 }
            goto L_0x03cf
        L_0x03ef:
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch:{ all -> 0x04a8 }
            r23.zzW()     // Catch:{ all -> 0x04a8 }
            r23.zzg()     // Catch:{ all -> 0x04a8 }
            android.database.sqlite.SQLiteDatabase r3 = r23.zzh()     // Catch:{ all -> 0x04a8 }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x048d }
            r4 = 0
            r5[r4] = r2     // Catch:{ SQLiteException -> 0x048d }
            java.lang.String r4 = "select count(1) from audience_filter_values where app_id=?"
            long r4 = r9.zzZ(r4, r5)     // Catch:{ SQLiteException -> 0x048d }
            com.google.android.gms.measurement.internal.zzgk r6 = r9.zzs     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzag r6 = r6.zzf()     // Catch:{ all -> 0x04a8 }
            r7 = 2000(0x7d0, float:2.803E-42)
            com.google.android.gms.measurement.internal.zzem r8 = com.google.android.gms.measurement.internal.zzen.zzE     // Catch:{ all -> 0x04a8 }
            int r6 = r6.zze(r2, r8)     // Catch:{ all -> 0x04a8 }
            int r6 = java.lang.Math.min(r7, r6)     // Catch:{ all -> 0x04a8 }
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)     // Catch:{ all -> 0x04a8 }
            long r7 = (long) r6     // Catch:{ all -> 0x04a8 }
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0426
            goto L_0x04a1
        L_0x0426:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x04a8 }
            r4.<init>()     // Catch:{ all -> 0x04a8 }
            r5 = 0
        L_0x042c:
            int r7 = r0.size()     // Catch:{ all -> 0x04a8 }
            if (r5 >= r7) goto L_0x0448
            java.lang.Object r7 = r0.get(r5)     // Catch:{ all -> 0x04a8 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x04a8 }
            if (r7 == 0) goto L_0x04a1
            int r7 = r7.intValue()     // Catch:{ all -> 0x04a8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x04a8 }
            r4.add(r7)     // Catch:{ all -> 0x04a8 }
            int r5 = r5 + 1
            goto L_0x042c
        L_0x0448:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x04a8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a8 }
            r4.<init>()     // Catch:{ all -> 0x04a8 }
            java.lang.String r5 = "("
            r4.append(r5)     // Catch:{ all -> 0x04a8 }
            r4.append(r0)     // Catch:{ all -> 0x04a8 }
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch:{ all -> 0x04a8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a8 }
            r0.<init>()     // Catch:{ all -> 0x04a8 }
            java.lang.String r5 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r0.append(r5)     // Catch:{ all -> 0x04a8 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x04a8 }
            r0.append(r4)     // Catch:{ all -> 0x04a8 }
            java.lang.String r4 = " order by rowid desc limit -1 offset ?)"
            r0.append(r4)     // Catch:{ all -> 0x04a8 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x04a8 }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x04a8 }
            java.lang.String r2 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x04a8 }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x04a8 }
            java.lang.String r2 = "audience_filter_values"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04a8 }
            r3.delete(r2, r0, r4)     // Catch:{ all -> 0x04a8 }
            goto L_0x04a1
        L_0x048d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgk r3 = r9.zzs     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ all -> 0x04a8 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ all -> 0x04a8 }
            java.lang.String r4 = "Database error querying filters. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfa.zzn(r24)     // Catch:{ all -> 0x04a8 }
            r3.zzc(r4, r2, r0)     // Catch:{ all -> 0x04a8 }
        L_0x04a1:
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x04a8 }
            r1.endTransaction()
            return
        L_0x04a8:
            r0 = move-exception
            goto L_0x04ad
        L_0x04aa:
            r0 = move-exception
            r9 = r23
        L_0x04ad:
            r1.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzB(java.lang.String, java.util.List):void");
    }

    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    public final void zzD(zzh zzh2) {
        Preconditions.checkNotNull(zzh2);
        zzg();
        zzW();
        String zzt = zzh2.zzt();
        Preconditions.checkNotNull(zzt);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzt);
        contentValues.put("app_instance_id", zzh2.zzu());
        contentValues.put("gmp_app_id", zzh2.zzy());
        contentValues.put("resettable_device_id_hash", zzh2.zzA());
        contentValues.put("last_bundle_index", Long.valueOf(zzh2.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzh2.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzh2.zzn()));
        contentValues.put("app_version", zzh2.zzw());
        contentValues.put("app_store", zzh2.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzh2.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzh2.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzh2.zzaj()));
        contentValues.put("day", Long.valueOf(zzh2.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzh2.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzh2.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzh2.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzh2.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzh2.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzh2.zzb()));
        contentValues.put("firebase_instance_id", zzh2.zzx());
        contentValues.put("daily_error_events_count", Long.valueOf(zzh2.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzh2.zzh()));
        contentValues.put("health_monitor_sample", zzh2.zzz());
        contentValues.put("android_id", Long.valueOf(zzh2.zza()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzh2.zzai()));
        contentValues.put("admob_app_id", zzh2.zzr());
        contentValues.put("dynamite_version", Long.valueOf(zzh2.zzk()));
        contentValues.put("session_stitching_token", zzh2.zzB());
        List zzC = zzh2.zzC();
        if (zzC != null) {
            if (zzC.isEmpty()) {
                this.zzs.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", zzt);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzC));
            }
        }
        zznz.zzc();
        if (this.zzs.zzf().zzs((String) null, zzen.zzay) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase zzh3 = zzh();
            if (((long) zzh3.update("apps", contentValues, "app_id = ?", new String[]{zzt})) == 0 && zzh3.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzfa.zzn(zzt));
            }
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Error storing app. appId", zzfa.zzn(zzt), e);
        }
    }

    public final void zzE(zzas zzas) {
        Preconditions.checkNotNull(zzas);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzas.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzas.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzas.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzas.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzas.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzas.zzg));
        contentValues.put("last_bundled_day", zzas.zzh);
        contentValues.put("last_sampled_complex_event_id", zzas.zzi);
        contentValues.put("last_sampling_rate", zzas.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzas.zze));
        Boolean bool = zzas.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzfa.zzn(zzas.zza));
            }
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Error storing event aggregates. appId", zzfa.zzn(zzas.zza), e);
        }
    }

    public final boolean zzF() {
        return zzZ("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzG() {
        return zzZ("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final boolean zzH() {
        return zzZ("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: protected */
    public final boolean zzI() {
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        return zzau.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l, long j, zzfs zzfs) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzfs);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzby = zzfs.zzby();
        this.zzs.zzay().zzj().zzc("Saving complex main event, appId, data size", this.zzs.zzj().zzd(str), Integer.valueOf(zzby.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzby);
        try {
            if (zzh().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.zzs.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzfa.zzn(str));
            return false;
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Error storing complex main event. appId", zzfa.zzn(str), e);
            return false;
        }
    }

    public final boolean zzK(zzac zzac) {
        Preconditions.checkNotNull(zzac);
        zzg();
        zzW();
        String str = zzac.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzac.zzc.zzb) == null) {
            long zzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzs.zzf();
            if (zzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzac.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzac.zzc.zzb);
        zzV(contentValues, "value", Preconditions.checkNotNull(zzac.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzac.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzac.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzac.zzh));
        contentValues.put("timed_out_event", this.zzs.zzv().zzan(zzac.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzac.zzd));
        contentValues.put("triggered_event", this.zzs.zzv().zzan(zzac.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzac.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzac.zzj));
        contentValues.put("expired_event", this.zzs.zzv().zzan(zzac.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzfa.zzn(str));
            }
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Error storing conditional user property", zzfa.zzn(str), e);
        }
        return true;
    }

    public final boolean zzL(zzlq zzlq) {
        Preconditions.checkNotNull(zzlq);
        zzg();
        zzW();
        if (zzp(zzlq.zza, zzlq.zzc) == null) {
            if (zzlt.zzai(zzlq.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzlq.zza}) >= ((long) this.zzs.zzf().zzf(zzlq.zza, zzen.zzF, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(zzlq.zzc)) {
                long zzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzlq.zza, zzlq.zzb});
                this.zzs.zzf();
                if (zzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzlq.zza);
        contentValues.put("origin", zzlq.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzlq.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzlq.zzd));
        zzV(contentValues, "value", zzlq.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update user property (got -1). appId", zzfa.zzn(zzlq.zza));
            }
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Error storing user property. appId", zzfa.zzn(zzlq.zza), e);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x008a=Splitter:B:29:0x008a, B:12:0x003e=Splitter:B:12:0x003e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzU(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.zzli r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r26)
            r20.zzg()
            r20.zzW()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.zzh()     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 2
            r12 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0073
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            goto L_0x003a
        L_0x0032:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
        L_0x003a:
            if (r4 == 0) goto L_0x003e
            java.lang.String r5 = "rowid <= ? and "
        L_0x003e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r4.append(r7)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0070 }
            if (r5 != 0) goto L_0x0064
            if (r4 == 0) goto L_0x0063
            r4.close()
        L_0x0063:
            return
        L_0x0064:
            java.lang.String r3 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0070 }
            r4.close()     // Catch:{ SQLiteException -> 0x0070 }
            goto L_0x00b7
        L_0x0070:
            r0 = move-exception
            goto L_0x021b
        L_0x0073:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0082
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            goto L_0x0086
        L_0x0082:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
        L_0x0086:
            if (r4 == 0) goto L_0x008a
            java.lang.String r5 = " and rowid <= ?"
        L_0x008a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r7 = "select metadata_fingerprint from raw_events where app_id = ?"
            r4.append(r7)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r5 = " order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0070 }
            if (r5 != 0) goto L_0x00b0
            if (r4 == 0) goto L_0x00af
            r4.close()
        L_0x00af:
            return
        L_0x00b0:
            java.lang.String r5 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0070 }
            r4.close()     // Catch:{ SQLiteException -> 0x0070 }
        L_0x00b7:
            r16 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0213, all -> 0x020f }
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0213, all -> 0x020f }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0213, all -> 0x020f }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0213, all -> 0x020f }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r15 = r11
            r11 = r18
            r12 = r19
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0213, all -> 0x020f }
            boolean r4 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            if (r4 != 0) goto L_0x00fa
            com.google.android.gms.measurement.internal.zzgk r0 = r1.zzs     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzd()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            r0.zzb(r2, r4)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            if (r12 == 0) goto L_0x00f9
            r12.close()
        L_0x00f9:
            return
        L_0x00fa:
            byte[] r4 = r12.getBlob(r15)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            com.google.android.gms.internal.measurement.zzgb r5 = com.google.android.gms.internal.measurement.zzgc.zzu()     // Catch:{ IOException -> 0x01e3 }
            com.google.android.gms.internal.measurement.zzli r4 = com.google.android.gms.measurement.internal.zzln.zzl(r5, r4)     // Catch:{ IOException -> 0x01e3 }
            com.google.android.gms.internal.measurement.zzgb r4 = (com.google.android.gms.internal.measurement.zzgb) r4     // Catch:{ IOException -> 0x01e3 }
            com.google.android.gms.internal.measurement.zzkc r4 = r4.zzaE()     // Catch:{ IOException -> 0x01e3 }
            com.google.android.gms.internal.measurement.zzgc r4 = (com.google.android.gms.internal.measurement.zzgc) r4     // Catch:{ IOException -> 0x01e3 }
            boolean r5 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            if (r5 == 0) goto L_0x0127
            com.google.android.gms.measurement.internal.zzgk r5 = r1.zzs     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            com.google.android.gms.measurement.internal.zzfa r5 = r5.zzay()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzk()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            r5.zzb(r6, r7)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
        L_0x0127:
            r12.close()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            r2.zza = r4     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            r13 = 3
            if (r4 == 0) goto L_0x0147
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            r5[r15] = r3     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            r14 = 1
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            r7 = 2
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            r7 = r4
            r8 = r5
            goto L_0x0153
        L_0x0147:
            r14 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            r6[r14] = r17     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            r7 = r4
            r8 = r6
        L_0x0153:
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch:{ SQLiteException -> 0x0209, all -> 0x0203 }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "rowid"
            r16 = 0
            r4 = r0
            r17 = r12
            r12 = r16
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0070 }
            if (r0 == 0) goto L_0x01ca
        L_0x0176:
            long r5 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x0070 }
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.internal.measurement.zzfr r7 = com.google.android.gms.internal.measurement.zzfs.zze()     // Catch:{ IOException -> 0x01a9 }
            com.google.android.gms.internal.measurement.zzli r0 = com.google.android.gms.measurement.internal.zzln.zzl(r7, r0)     // Catch:{ IOException -> 0x01a9 }
            com.google.android.gms.internal.measurement.zzfr r0 = (com.google.android.gms.internal.measurement.zzfr) r0     // Catch:{ IOException -> 0x01a9 }
            java.lang.String r7 = r4.getString(r14)     // Catch:{ SQLiteException -> 0x0070 }
            r0.zzi(r7)     // Catch:{ SQLiteException -> 0x0070 }
            r7 = 2
            long r8 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x0070 }
            r0.zzm(r8)     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.internal.measurement.zzkc r0 = r0.zzaE()     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.internal.measurement.zzfs r0 = (com.google.android.gms.internal.measurement.zzfs) r0     // Catch:{ SQLiteException -> 0x0070 }
            boolean r0 = r2.zza(r5, r0)     // Catch:{ SQLiteException -> 0x0070 }
            if (r0 != 0) goto L_0x01be
            if (r4 == 0) goto L_0x01a8
            r4.close()
        L_0x01a8:
            return
        L_0x01a9:
            r0 = move-exception
            r7 = 2
            com.google.android.gms.measurement.internal.zzgk r5 = r1.zzs     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.measurement.internal.zzfa r5 = r5.zzay()     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzd()     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ SQLiteException -> 0x0070 }
            r5.zzc(r6, r8, r0)     // Catch:{ SQLiteException -> 0x0070 }
        L_0x01be:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0070 }
            if (r0 != 0) goto L_0x0176
            if (r4 == 0) goto L_0x0233
            r4.close()
            return
        L_0x01ca:
            com.google.android.gms.measurement.internal.zzgk r0 = r1.zzs     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzk()     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ SQLiteException -> 0x0070 }
            r0.zzb(r2, r5)     // Catch:{ SQLiteException -> 0x0070 }
            if (r4 == 0) goto L_0x01e2
            r4.close()
        L_0x01e2:
            return
        L_0x01e3:
            r0 = move-exception
            r17 = r12
            com.google.android.gms.measurement.internal.zzgk r2 = r1.zzs     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            r2.zzc(r4, r5, r0)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            if (r17 == 0) goto L_0x01fe
            r17.close()
        L_0x01fe:
            return
        L_0x01ff:
            r0 = move-exception
            goto L_0x0206
        L_0x0201:
            r0 = move-exception
            goto L_0x020c
        L_0x0203:
            r0 = move-exception
            r17 = r12
        L_0x0206:
            r3 = r17
            goto L_0x0236
        L_0x0209:
            r0 = move-exception
            r17 = r12
        L_0x020c:
            r4 = r17
            goto L_0x021b
        L_0x020f:
            r0 = move-exception
            r3 = r16
            goto L_0x0236
        L_0x0213:
            r0 = move-exception
            r4 = r16
            goto L_0x021b
        L_0x0217:
            r0 = move-exception
            goto L_0x0236
        L_0x0219:
            r0 = move-exception
            r4 = r3
        L_0x021b:
            com.google.android.gms.measurement.internal.zzgk r2 = r1.zzs     // Catch:{ all -> 0x0234 }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x0234 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x0234 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ all -> 0x0234 }
            r2.zzc(r5, r3, r0)     // Catch:{ all -> 0x0234 }
            if (r4 == 0) goto L_0x0233
            r4.close()
        L_0x0233:
            return
        L_0x0234:
            r0 = move-exception
            r3 = r4
        L_0x0236:
            if (r3 == 0) goto L_0x023b
            r3.close()
        L_0x023b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzU(java.lang.String, long, long, com.google.android.gms.measurement.internal.zzli):void");
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzd("Error deleting conditional property", zzfa.zzn(str), this.zzs.zzj().zzf(str2), e);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzb() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final long zzc(String str, String str2) {
        long j;
        SQLiteException e;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        try {
            j = zzaa("select " + "first_open_count" + " from app2 where app_id=?", new String[]{str}, -1);
            if (j == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (zzh2.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.zzs.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzfa.zzn(str), "first_open_count");
                    zzh2.endTransaction();
                    return -1;
                }
                j = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + j));
                if (((long) zzh2.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    this.zzs.zzay().zzd().zzc("Failed to update column (got 0). appId", zzfa.zzn(str), "first_open_count");
                    zzh2.endTransaction();
                    return -1;
                }
                zzh2.setTransactionSuccessful();
                zzh2.endTransaction();
                return j;
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            j = 0;
            e = e3;
            try {
                this.zzs.zzay().zzd().zzd("Error inserting column. appId", zzfa.zzn(str), "first_open_count", e);
                zzh2.endTransaction();
                return j;
            } catch (Throwable th) {
                zzh2.endTransaction();
                throw th;
            }
        }
    }

    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e) {
            this.zzs.zzay().zzk().zzb("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle zzi(java.lang.String r8) {
        /*
            r7 = this;
            r7.zzg()
            r7.zzW()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.zzh()     // Catch:{ SQLiteException -> 0x00c4, all -> 0x00c2 }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00c4, all -> 0x00c2 }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00c4, all -> 0x00c2 }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00c4, all -> 0x00c2 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00c0 }
            if (r2 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.zzgk r8 = r7.zzs     // Catch:{ SQLiteException -> 0x00c0 }
            com.google.android.gms.measurement.internal.zzfa r8 = r8.zzay()     // Catch:{ SQLiteException -> 0x00c0 }
            com.google.android.gms.measurement.internal.zzey r8 = r8.zzj()     // Catch:{ SQLiteException -> 0x00c0 }
            java.lang.String r2 = "Default event parameters not found"
            r8.zza(r2)     // Catch:{ SQLiteException -> 0x00c0 }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            return r0
        L_0x0032:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x00c0 }
            com.google.android.gms.internal.measurement.zzfr r3 = com.google.android.gms.internal.measurement.zzfs.zze()     // Catch:{ IOException -> 0x00a6 }
            com.google.android.gms.internal.measurement.zzli r2 = com.google.android.gms.measurement.internal.zzln.zzl(r3, r2)     // Catch:{ IOException -> 0x00a6 }
            com.google.android.gms.internal.measurement.zzfr r2 = (com.google.android.gms.internal.measurement.zzfr) r2     // Catch:{ IOException -> 0x00a6 }
            com.google.android.gms.internal.measurement.zzkc r2 = r2.zzaE()     // Catch:{ IOException -> 0x00a6 }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ IOException -> 0x00a6 }
            com.google.android.gms.measurement.internal.zzll r8 = r7.zzf     // Catch:{ SQLiteException -> 0x00c0 }
            r8.zzu()     // Catch:{ SQLiteException -> 0x00c0 }
            java.util.List r8 = r2.zzi()     // Catch:{ SQLiteException -> 0x00c0 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00c0 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00c0 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00c0 }
        L_0x0058:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00c0 }
            if (r3 == 0) goto L_0x00a0
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00c0 }
            com.google.android.gms.internal.measurement.zzfw r3 = (com.google.android.gms.internal.measurement.zzfw) r3     // Catch:{ SQLiteException -> 0x00c0 }
            java.lang.String r4 = r3.zzg()     // Catch:{ SQLiteException -> 0x00c0 }
            boolean r5 = r3.zzu()     // Catch:{ SQLiteException -> 0x00c0 }
            if (r5 == 0) goto L_0x0076
            double r5 = r3.zza()     // Catch:{ SQLiteException -> 0x00c0 }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00c0 }
            goto L_0x0058
        L_0x0076:
            boolean r5 = r3.zzv()     // Catch:{ SQLiteException -> 0x00c0 }
            if (r5 == 0) goto L_0x0084
            float r3 = r3.zzb()     // Catch:{ SQLiteException -> 0x00c0 }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00c0 }
            goto L_0x0058
        L_0x0084:
            boolean r5 = r3.zzy()     // Catch:{ SQLiteException -> 0x00c0 }
            if (r5 == 0) goto L_0x0092
            java.lang.String r3 = r3.zzh()     // Catch:{ SQLiteException -> 0x00c0 }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00c0 }
            goto L_0x0058
        L_0x0092:
            boolean r5 = r3.zzw()     // Catch:{ SQLiteException -> 0x00c0 }
            if (r5 == 0) goto L_0x0058
            long r5 = r3.zzd()     // Catch:{ SQLiteException -> 0x00c0 }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00c0 }
            goto L_0x0058
        L_0x00a0:
            if (r1 == 0) goto L_0x00a5
            r1.close()
        L_0x00a5:
            return r2
        L_0x00a6:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgk r3 = r7.zzs     // Catch:{ SQLiteException -> 0x00c0 }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ SQLiteException -> 0x00c0 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ SQLiteException -> 0x00c0 }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfa.zzn(r8)     // Catch:{ SQLiteException -> 0x00c0 }
            r3.zzc(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00c0 }
            if (r1 == 0) goto L_0x00bf
            r1.close()
        L_0x00bf:
            return r0
        L_0x00c0:
            r8 = move-exception
            goto L_0x00c6
        L_0x00c2:
            r8 = move-exception
            goto L_0x00dd
        L_0x00c4:
            r8 = move-exception
            r1 = r0
        L_0x00c6:
            com.google.android.gms.measurement.internal.zzgk r2 = r7.zzs     // Catch:{ all -> 0x00db }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x00db }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x00db }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zzb(r3, r8)     // Catch:{ all -> 0x00db }
            if (r1 == 0) goto L_0x00da
            r1.close()
        L_0x00da:
            return r0
        L_0x00db:
            r8 = move-exception
            r0 = r1
        L_0x00dd:
            if (r0 == 0) goto L_0x00e2
            r0.close()
        L_0x00e2:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzi(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x011b A[Catch:{ SQLiteException -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x011f A[Catch:{ SQLiteException -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x015b A[Catch:{ SQLiteException -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0174 A[Catch:{ SQLiteException -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0190 A[Catch:{ SQLiteException -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0191 A[Catch:{ SQLiteException -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01a0 A[Catch:{ SQLiteException -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c3 A[Catch:{ SQLiteException -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d5 A[Catch:{ SQLiteException -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0211  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzh zzj(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r35)
            r34.zzg()
            r34.zzW()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r34.zzh()     // Catch:{ SQLiteException -> 0x01f2, all -> 0x01f0 }
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String r33 = "session_stitching_token"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x01f2, all -> 0x01f0 }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01f2, all -> 0x01f0 }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x01f2, all -> 0x01f0 }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x01f2, all -> 0x01f0 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01ee }
            if (r5 != 0) goto L_0x006d
            if (r4 == 0) goto L_0x006c
            r4.close()
        L_0x006c:
            return r3
        L_0x006d:
            com.google.android.gms.measurement.internal.zzh r5 = new com.google.android.gms.measurement.internal.zzh     // Catch:{ SQLiteException -> 0x01ee }
            com.google.android.gms.measurement.internal.zzll r6 = r1.zzf     // Catch:{ SQLiteException -> 0x01ee }
            com.google.android.gms.measurement.internal.zzgk r6 = r6.zzq()     // Catch:{ SQLiteException -> 0x01ee }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x01ee }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzI(r6)     // Catch:{ SQLiteException -> 0x01ee }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzX(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzaf(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzab(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzac(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzaa(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzK(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzJ(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzY(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzT(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01ee }
            if (r7 != 0) goto L_0x00d9
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01ee }
            if (r6 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r6 = r12
            goto L_0x00da
        L_0x00d9:
            r6 = r0
        L_0x00da:
            r5.zzad(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzS(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzQ(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzP(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzN(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzM(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzV(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01ee }
            if (r7 == 0) goto L_0x011f
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0124
        L_0x011f:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01ee }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x01ee }
        L_0x0124:
            r5.zzL(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzW(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzO(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzR(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzZ(r6)     // Catch:{ SQLiteException -> 0x01ee }
            com.google.android.gms.measurement.internal.zzgk r6 = r1.zzs     // Catch:{ SQLiteException -> 0x01ee }
            com.google.android.gms.measurement.internal.zzag r6 = r6.zzf()     // Catch:{ SQLiteException -> 0x01ee }
            com.google.android.gms.measurement.internal.zzem r7 = com.google.android.gms.measurement.internal.zzen.zzah     // Catch:{ SQLiteException -> 0x01ee }
            boolean r6 = r6.zzs(r3, r7)     // Catch:{ SQLiteException -> 0x01ee }
            r7 = 0
            if (r6 != 0) goto L_0x016c
            r6 = 22
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01ee }
            if (r9 == 0) goto L_0x0165
            r9 = r7
            goto L_0x0169
        L_0x0165:
            long r9 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ee }
        L_0x0169:
            r5.zzH(r9)     // Catch:{ SQLiteException -> 0x01ee }
        L_0x016c:
            r6 = 23
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01ee }
            if (r9 != 0) goto L_0x017c
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01ee }
            if (r6 == 0) goto L_0x017b
            goto L_0x017c
        L_0x017b:
            r0 = r12
        L_0x017c:
            r5.zzG(r0)     // Catch:{ SQLiteException -> 0x01ee }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzF(r0)     // Catch:{ SQLiteException -> 0x01ee }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01ee }
            if (r6 == 0) goto L_0x0191
            goto L_0x0195
        L_0x0191:
            long r7 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x01ee }
        L_0x0195:
            r5.zzU(r7)     // Catch:{ SQLiteException -> 0x01ee }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01ee }
            if (r6 != 0) goto L_0x01b2
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01ee }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x01ee }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzag(r0)     // Catch:{ SQLiteException -> 0x01ee }
        L_0x01b2:
            com.google.android.gms.internal.measurement.zzps.zzc()     // Catch:{ SQLiteException -> 0x01ee }
            com.google.android.gms.measurement.internal.zzgk r0 = r1.zzs     // Catch:{ SQLiteException -> 0x01ee }
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()     // Catch:{ SQLiteException -> 0x01ee }
            com.google.android.gms.measurement.internal.zzem r6 = com.google.android.gms.measurement.internal.zzen.zzaH     // Catch:{ SQLiteException -> 0x01ee }
            boolean r0 = r0.zzs(r3, r6)     // Catch:{ SQLiteException -> 0x01ee }
            if (r0 == 0) goto L_0x01cc
            r0 = 28
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01ee }
            r5.zzah(r0)     // Catch:{ SQLiteException -> 0x01ee }
        L_0x01cc:
            r5.zzD()     // Catch:{ SQLiteException -> 0x01ee }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01ee }
            if (r0 == 0) goto L_0x01e8
            com.google.android.gms.measurement.internal.zzgk r0 = r1.zzs     // Catch:{ SQLiteException -> 0x01ee }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ SQLiteException -> 0x01ee }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzd()     // Catch:{ SQLiteException -> 0x01ee }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfa.zzn(r35)     // Catch:{ SQLiteException -> 0x01ee }
            r0.zzb(r6, r7)     // Catch:{ SQLiteException -> 0x01ee }
        L_0x01e8:
            if (r4 == 0) goto L_0x01ed
            r4.close()
        L_0x01ed:
            return r5
        L_0x01ee:
            r0 = move-exception
            goto L_0x01f4
        L_0x01f0:
            r0 = move-exception
            goto L_0x020f
        L_0x01f2:
            r0 = move-exception
            r4 = r3
        L_0x01f4:
            com.google.android.gms.measurement.internal.zzgk r5 = r1.zzs     // Catch:{ all -> 0x020d }
            com.google.android.gms.measurement.internal.zzfa r5 = r5.zzay()     // Catch:{ all -> 0x020d }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzd()     // Catch:{ all -> 0x020d }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfa.zzn(r35)     // Catch:{ all -> 0x020d }
            r5.zzc(r6, r2, r0)     // Catch:{ all -> 0x020d }
            if (r4 == 0) goto L_0x020c
            r4.close()
        L_0x020c:
            return r3
        L_0x020d:
            r0 = move-exception
            r3 = r4
        L_0x020f:
            if (r3 == 0) goto L_0x0214
            r3.close()
        L_0x0214:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzh");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzac zzk(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r31)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r32)
            r30.zzg()
            r30.zzW()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.zzh()     // Catch:{ SQLiteException -> 0x0105, all -> 0x0103 }
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x0105, all -> 0x0103 }
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0105, all -> 0x0103 }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x0105, all -> 0x0103 }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x0105, all -> 0x0103 }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0105, all -> 0x0103 }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0101 }
            if (r4 != 0) goto L_0x0051
            if (r10 == 0) goto L_0x0050
            r10.close()
        L_0x0050:
            return r9
        L_0x0051:
            java.lang.String r4 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x0101 }
            if (r4 != 0) goto L_0x0059
            java.lang.String r4 = ""
        L_0x0059:
            r17 = r4
            java.lang.Object r6 = r1.zzq(r10, r3)     // Catch:{ SQLiteException -> 0x0101 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x0101 }
            if (r0 == 0) goto L_0x0068
            r21 = r3
            goto L_0x006a
        L_0x0068:
            r21 = r2
        L_0x006a:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0101 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzll r0 = r1.zzf     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzln r0 = r0.zzu()     // Catch:{ SQLiteException -> 0x0101 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x0101 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r3 = com.google.android.gms.measurement.internal.zzaw.CREATOR     // Catch:{ SQLiteException -> 0x0101 }
            android.os.Parcelable r0 = r0.zzh(r2, r3)     // Catch:{ SQLiteException -> 0x0101 }
            r23 = r0
            com.google.android.gms.measurement.internal.zzaw r23 = (com.google.android.gms.measurement.internal.zzaw) r23     // Catch:{ SQLiteException -> 0x0101 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzll r0 = r1.zzf     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzln r0 = r0.zzu()     // Catch:{ SQLiteException -> 0x0101 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x0101 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r3 = com.google.android.gms.measurement.internal.zzaw.CREATOR     // Catch:{ SQLiteException -> 0x0101 }
            android.os.Parcelable r0 = r0.zzh(r2, r3)     // Catch:{ SQLiteException -> 0x0101 }
            r26 = r0
            com.google.android.gms.measurement.internal.zzaw r26 = (com.google.android.gms.measurement.internal.zzaw) r26     // Catch:{ SQLiteException -> 0x0101 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0101 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzll r0 = r1.zzf     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzln r0 = r0.zzu()     // Catch:{ SQLiteException -> 0x0101 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x0101 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r3 = com.google.android.gms.measurement.internal.zzaw.CREATOR     // Catch:{ SQLiteException -> 0x0101 }
            android.os.Parcelable r0 = r0.zzh(r2, r3)     // Catch:{ SQLiteException -> 0x0101 }
            r29 = r0
            com.google.android.gms.measurement.internal.zzaw r29 = (com.google.android.gms.measurement.internal.zzaw) r29     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzlo r18 = new com.google.android.gms.measurement.internal.zzlo     // Catch:{ SQLiteException -> 0x0101 }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzac r0 = new com.google.android.gms.measurement.internal.zzac     // Catch:{ SQLiteException -> 0x0101 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x0101 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0101 }
            if (r2 == 0) goto L_0x00fb
            com.google.android.gms.measurement.internal.zzgk r2 = r1.zzs     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ SQLiteException -> 0x0101 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r31)     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzgk r5 = r1.zzs     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzev r5 = r5.zzj()     // Catch:{ SQLiteException -> 0x0101 }
            java.lang.String r5 = r5.zzf(r8)     // Catch:{ SQLiteException -> 0x0101 }
            r2.zzc(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0101 }
        L_0x00fb:
            if (r10 == 0) goto L_0x0100
            r10.close()
        L_0x0100:
            return r0
        L_0x0101:
            r0 = move-exception
            goto L_0x0107
        L_0x0103:
            r0 = move-exception
            goto L_0x012c
        L_0x0105:
            r0 = move-exception
            r10 = r9
        L_0x0107:
            com.google.android.gms.measurement.internal.zzgk r2 = r1.zzs     // Catch:{ all -> 0x012a }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x012a }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x012a }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r31)     // Catch:{ all -> 0x012a }
            com.google.android.gms.measurement.internal.zzgk r5 = r1.zzs     // Catch:{ all -> 0x012a }
            com.google.android.gms.measurement.internal.zzev r5 = r5.zzj()     // Catch:{ all -> 0x012a }
            java.lang.String r5 = r5.zzf(r8)     // Catch:{ all -> 0x012a }
            r2.zzd(r3, r4, r5, r0)     // Catch:{ all -> 0x012a }
            if (r10 == 0) goto L_0x0129
            r10.close()
        L_0x0129:
            return r9
        L_0x012a:
            r0 = move-exception
            r9 = r10
        L_0x012c:
            if (r9 == 0) goto L_0x0131
            r9.close()
        L_0x0131:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzk(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    public final zzak zzl(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zzm(j, str, 1, false, false, z3, false, z5);
    }

    public final zzak zzm(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzak zzak = new zzak();
        Cursor cursor = null;
        try {
            SQLiteDatabase zzh2 = zzh();
            cursor = zzh2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.zzs.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzfa.zzn(str));
                if (cursor != null) {
                    cursor.close();
                }
                return zzak;
            }
            if (cursor.getLong(0) == j) {
                zzak.zzb = cursor.getLong(1);
                zzak.zza = cursor.getLong(2);
                zzak.zzc = cursor.getLong(3);
                zzak.zzd = cursor.getLong(4);
                zzak.zze = cursor.getLong(5);
            }
            if (z) {
                zzak.zzb += j2;
            }
            if (z2) {
                zzak.zza += j2;
            }
            if (z3) {
                zzak.zzc += j2;
            }
            if (z4) {
                zzak.zzd += j2;
            }
            if (z5) {
                zzak.zze += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(zzak.zza));
            contentValues.put("daily_events_count", Long.valueOf(zzak.zzb));
            contentValues.put("daily_conversions_count", Long.valueOf(zzak.zzc));
            contentValues.put("daily_error_events_count", Long.valueOf(zzak.zzd));
            contentValues.put("daily_realtime_events_count", Long.valueOf(zzak.zze));
            zzh2.update("apps", contentValues, "app_id=?", strArr);
            if (cursor != null) {
                cursor.close();
            }
            return zzak;
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Error updating daily counts. appId", zzfa.zzn(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return zzak;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzas zzn(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r29)
            r27.zzg()
            r27.zzW()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.zzh()     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            if (r2 != 0) goto L_0x005e
            if (r13 == 0) goto L_0x005d
            r13.close()
        L_0x005d:
            return r19
        L_0x005e:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r3 = 0
            if (r2 == 0) goto L_0x0076
            r20 = r3
            goto L_0x007a
        L_0x0076:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
        L_0x007a:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            if (r2 == 0) goto L_0x0084
            r0 = r19
            goto L_0x008c
        L_0x0084:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
        L_0x008c:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            if (r9 == 0) goto L_0x0096
            r18 = r19
            goto L_0x00a0
        L_0x0096:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r18 = r2
        L_0x00a0:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            if (r9 == 0) goto L_0x00aa
            r22 = r19
            goto L_0x00b4
        L_0x00aa:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r22 = r2
        L_0x00b4:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            if (r9 != 0) goto L_0x00cd
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c6
            r10 = r11
        L_0x00c6:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r23 = r2
            goto L_0x00cf
        L_0x00cd:
            r23 = r19
        L_0x00cf:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            if (r9 == 0) goto L_0x00d9
            r9 = r3
            goto L_0x00de
        L_0x00d9:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r9 = r2
        L_0x00de:
            com.google.android.gms.measurement.internal.zzas r24 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            if (r0 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.zzgk r0 = r1.zzs     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzd()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfa.zzn(r28)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            r0.zzb(r2, r3)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
        L_0x010f:
            if (r25 == 0) goto L_0x0114
            r25.close()
        L_0x0114:
            return r24
        L_0x0115:
            r0 = move-exception
            goto L_0x011c
        L_0x0117:
            r0 = move-exception
            goto L_0x0122
        L_0x0119:
            r0 = move-exception
            r25 = r13
        L_0x011c:
            r19 = r25
            goto L_0x0152
        L_0x011f:
            r0 = move-exception
            r25 = r13
        L_0x0122:
            r13 = r25
            goto L_0x012a
        L_0x0125:
            r0 = move-exception
            goto L_0x0152
        L_0x0127:
            r0 = move-exception
            r13 = r19
        L_0x012a:
            com.google.android.gms.measurement.internal.zzgk r2 = r1.zzs     // Catch:{ all -> 0x014f }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x014f }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x014f }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r28)     // Catch:{ all -> 0x014f }
            com.google.android.gms.measurement.internal.zzgk r5 = r1.zzs     // Catch:{ all -> 0x014f }
            com.google.android.gms.measurement.internal.zzev r5 = r5.zzj()     // Catch:{ all -> 0x014f }
            r6 = r29
            java.lang.String r5 = r5.zzd(r6)     // Catch:{ all -> 0x014f }
            r2.zzd(r3, r4, r5, r0)     // Catch:{ all -> 0x014f }
            if (r13 == 0) goto L_0x014e
            r13.close()
        L_0x014e:
            return r19
        L_0x014f:
            r0 = move-exception
            r19 = r13
        L_0x0152:
            if (r19 == 0) goto L_0x0157
            r19.close()
        L_0x0157:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzn(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzas");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzlq zzp(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r21)
            r19.zzg()
            r19.zzW()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.zzh()     // Catch:{ SQLiteException -> 0x0083, all -> 0x0081 }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x0083, all -> 0x0081 }
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0083, all -> 0x0081 }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x0083, all -> 0x0081 }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x0083, all -> 0x0081 }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0083, all -> 0x0081 }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x007f }
            if (r4 != 0) goto L_0x0042
            if (r11 == 0) goto L_0x0041
            r11.close()
        L_0x0041:
            return r10
        L_0x0042:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x007f }
            java.lang.Object r8 = r1.zzq(r11, r3)     // Catch:{ SQLiteException -> 0x007f }
            if (r8 != 0) goto L_0x0052
            if (r11 == 0) goto L_0x0051
            r11.close()
        L_0x0051:
            return r10
        L_0x0052:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x007f }
            com.google.android.gms.measurement.internal.zzlq r0 = new com.google.android.gms.measurement.internal.zzlq     // Catch:{ SQLiteException -> 0x007f }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x007f }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x007f }
            if (r2 == 0) goto L_0x0079
            com.google.android.gms.measurement.internal.zzgk r2 = r1.zzs     // Catch:{ SQLiteException -> 0x007f }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ SQLiteException -> 0x007f }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ SQLiteException -> 0x007f }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r20)     // Catch:{ SQLiteException -> 0x007f }
            r2.zzb(r3, r4)     // Catch:{ SQLiteException -> 0x007f }
        L_0x0079:
            if (r11 == 0) goto L_0x007e
            r11.close()
        L_0x007e:
            return r0
        L_0x007f:
            r0 = move-exception
            goto L_0x0085
        L_0x0081:
            r0 = move-exception
            goto L_0x00aa
        L_0x0083:
            r0 = move-exception
            r11 = r10
        L_0x0085:
            com.google.android.gms.measurement.internal.zzgk r2 = r1.zzs     // Catch:{ all -> 0x00a8 }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x00a8 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r20)     // Catch:{ all -> 0x00a8 }
            com.google.android.gms.measurement.internal.zzgk r5 = r1.zzs     // Catch:{ all -> 0x00a8 }
            com.google.android.gms.measurement.internal.zzev r5 = r5.zzj()     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r5.zzf(r9)     // Catch:{ all -> 0x00a8 }
            r2.zzd(r3, r4, r5, r0)     // Catch:{ all -> 0x00a8 }
            if (r11 == 0) goto L_0x00a7
            r11.close()
        L_0x00a7:
            return r10
        L_0x00a8:
            r0 = move-exception
            r10 = r11
        L_0x00aa:
            if (r10 == 0) goto L_0x00af
            r10.close()
        L_0x00af:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzp(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzlq");
    }

    /* access modifiers changed from: package-private */
    public final Object zzq(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.zzs.zzay().zzd().zza("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                this.zzs.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.zzs.zzay().zzd().zza("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzr() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.zzh()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0026, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x0029
        L_0x0024:
            r0 = move-exception
            goto L_0x0042
        L_0x0026:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0029:
            com.google.android.gms.measurement.internal.zzgk r3 = r6.zzs     // Catch:{ all -> 0x003e }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ all -> 0x003e }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zzb(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()
        L_0x0047:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzr():java.lang.String");
    }

    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List zzt(String str, String[] strArr) {
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase zzh2 = zzh();
            String[] strArr2 = {"app_id", "origin", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
            this.zzs.zzf();
            Cursor query = zzh2.query("conditional_properties", strArr2, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    this.zzs.zzf();
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object zzq = zzq(query, 3);
                        boolean z = query.getInt(4) != 0;
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        arrayList.add(new zzac(string, string2, new zzlo(string3, query.getLong(10), zzq, string2), query.getLong(8), z, string4, (zzaw) this.zzf.zzu().zzh(query.getBlob(7), zzaw.CREATOR), j, (zzaw) this.zzf.zzu().zzh(query.getBlob(9), zzaw.CREATOR), query.getLong(11), (zzaw) this.zzf.zzu().zzh(query.getBlob(12), zzaw.CREATOR)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        zzey zzd2 = this.zzs.zzay().zzd();
                        this.zzs.zzf();
                        zzd2.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            }
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzb("Error querying conditional user property value", e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.zzs.zzf();
            Cursor query = zzh().query("user_attributes", new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object zzq = zzq(query, 3);
                    if (zzq == null) {
                        this.zzs.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzfa.zzn(str));
                    } else {
                        arrayList.add(new zzlq(str, str2, string, j, zzq));
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayList;
            }
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Error querying user properties. appId", zzfa.zzn(str), e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0128 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzv(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r18)
            r17.zzg()
            r17.zzW()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r11 = "1001"
            r12 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x010a }
            r13 = 3
            r3.<init>(r13)     // Catch:{ SQLiteException -> 0x010a }
            r14 = r18
            r3.add(r14)     // Catch:{ SQLiteException -> 0x0108 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0108 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x0108 }
            boolean r5 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x0108 }
            if (r5 != 0) goto L_0x0038
            r15 = r19
            r3.add(r15)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r5 = " and origin=?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0104 }
            goto L_0x003a
        L_0x0038:
            r15 = r19
        L_0x003a:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x0104 }
            if (r5 != 0) goto L_0x0059
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0104 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0104 }
            r5.append(r0)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r6 = "*"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x0104 }
            r3.add(r5)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r5 = " and name glob ?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0104 }
        L_0x0059:
            int r5 = r3.size()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ SQLiteException -> 0x0104 }
            r7 = r3
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ SQLiteException -> 0x0104 }
            android.database.sqlite.SQLiteDatabase r3 = r17.zzh()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r5 = "user_attributes"
            java.lang.String r6 = "name"
            java.lang.String r8 = "set_timestamp"
            java.lang.String r9 = "value"
            java.lang.String r10 = "origin"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r9, r10}     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r8 = r4.toString()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r10 = "rowid"
            com.google.android.gms.measurement.internal.zzgk r4 = r1.zzs     // Catch:{ SQLiteException -> 0x0104 }
            r4.zzf()     // Catch:{ SQLiteException -> 0x0104 }
            r9 = 0
            r16 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r16
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0104 }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0104 }
            if (r3 != 0) goto L_0x009c
            if (r12 == 0) goto L_0x009b
            r12.close()
        L_0x009b:
            return r2
        L_0x009c:
            int r3 = r2.size()     // Catch:{ SQLiteException -> 0x0104 }
            com.google.android.gms.measurement.internal.zzgk r4 = r1.zzs     // Catch:{ SQLiteException -> 0x0104 }
            r4.zzf()     // Catch:{ SQLiteException -> 0x0104 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00c2
            com.google.android.gms.measurement.internal.zzgk r0 = r1.zzs     // Catch:{ SQLiteException -> 0x0104 }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ SQLiteException -> 0x0104 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzd()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            com.google.android.gms.measurement.internal.zzgk r5 = r1.zzs     // Catch:{ SQLiteException -> 0x0104 }
            r5.zzf()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0104 }
            r0.zzb(r3, r4)     // Catch:{ SQLiteException -> 0x0104 }
            goto L_0x00fe
        L_0x00c2:
            r3 = 0
            java.lang.String r7 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x0104 }
            r3 = 1
            long r8 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x0104 }
            r3 = 2
            java.lang.Object r10 = r1.zzq(r12, r3)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r15 = r12.getString(r13)     // Catch:{ SQLiteException -> 0x0104 }
            if (r10 != 0) goto L_0x00eb
            com.google.android.gms.measurement.internal.zzgk r3 = r1.zzs     // Catch:{ SQLiteException -> 0x0104 }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ SQLiteException -> 0x0104 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r4 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfa.zzn(r18)     // Catch:{ SQLiteException -> 0x0104 }
            r3.zzd(r4, r5, r15, r0)     // Catch:{ SQLiteException -> 0x0104 }
            goto L_0x00f7
        L_0x00eb:
            com.google.android.gms.measurement.internal.zzlq r3 = new com.google.android.gms.measurement.internal.zzlq     // Catch:{ SQLiteException -> 0x0104 }
            r4 = r3
            r5 = r18
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0104 }
            r2.add(r3)     // Catch:{ SQLiteException -> 0x0104 }
        L_0x00f7:
            boolean r3 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0104 }
            if (r3 == 0) goto L_0x00fe
            goto L_0x009c
        L_0x00fe:
            if (r12 == 0) goto L_0x0103
            r12.close()
        L_0x0103:
            return r2
        L_0x0104:
            r0 = move-exception
            goto L_0x010f
        L_0x0106:
            r0 = move-exception
            goto L_0x012c
        L_0x0108:
            r0 = move-exception
            goto L_0x010d
        L_0x010a:
            r0 = move-exception
            r14 = r18
        L_0x010d:
            r15 = r19
        L_0x010f:
            com.google.android.gms.measurement.internal.zzgk r2 = r1.zzs     // Catch:{ all -> 0x0106 }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x0106 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x0106 }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r18)     // Catch:{ all -> 0x0106 }
            r2.zzd(r3, r4, r15, r0)     // Catch:{ all -> 0x0106 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0106 }
            if (r12 == 0) goto L_0x012b
            r12.close()
        L_0x012b:
            return r0
        L_0x012c:
            if (r12 == 0) goto L_0x0131
            r12.close()
        L_0x0131:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzv(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    /* access modifiers changed from: package-private */
    public final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzZ("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                this.zzs.zzay().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.zzs.zzay().zzd().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long zza2 = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzs.zzf();
            if (abs > ((Long) zzen.zzx.zza((Object) null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase zzh2 = zzh();
                    this.zzs.zzf();
                    int delete = zzh2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.zzs.zzav().currentTimeMillis()), String.valueOf(zzag.zzA())});
                    if (delete > 0) {
                        this.zzs.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
