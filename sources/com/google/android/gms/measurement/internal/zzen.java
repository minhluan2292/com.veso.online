package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.zzhe;
import com.google.android.gms.internal.measurement.zzho;
import com.google.firebase.messaging.ServiceStarter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
public final class zzen {
    public static final zzem zzA = zza("measurement.upload.retry_time", 1800000L, 1800000L, zzbh.zza);
    public static final zzem zzB = zza("measurement.upload.retry_count", 6, 6, zzbi.zza);
    public static final zzem zzC = zza("measurement.upload.max_queue_time", 2419200000L, 2419200000L, zzbk.zza);
    public static final zzem zzD = zza("measurement.lifetimevalue.max_currency_tracked", 4, 4, zzbl.zza);
    public static final zzem zzE = zza("measurement.audience.filter_result_max_count", 200, 200, zzbn.zza);
    public static final zzem zzF = zza("measurement.upload.max_public_user_properties", 25, 25, (zzej) null);
    public static final zzem zzG;
    public static final zzem zzH = zza("measurement.upload.max_public_event_params", 25, 25, (zzej) null);
    public static final zzem zzI = zza("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, zzbo.zza);
    public static final zzem zzJ = zza("measurement.test.boolean_flag", false, false, zzbp.zza);
    public static final zzem zzK = zza("measurement.test.string_flag", "---", "---", zzbq.zza);
    public static final zzem zzL = zza("measurement.test.long_flag", -1L, -1L, zzbr.zza);
    public static final zzem zzM = zza("measurement.test.int_flag", -2, -2, zzbs.zza);
    public static final zzem zzN;
    public static final zzem zzO = zza("measurement.experiment.max_ids", 50, 50, zzbv.zza);
    public static final zzem zzP = zza("measurement.max_bundles_per_iteration", 100, 100, zzbw.zza);
    public static final zzem zzQ = zza("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, zzbx.zza);
    public static final zzem zzR = zza("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, zzbz.zza);
    public static final zzem zzS = zza("measurement.validation.internal_limits_internal_event_params", true, true, zzca.zza);
    public static final zzem zzT = zza("measurement.collection.log_event_and_bundle_v2", true, true, zzcb.zza);
    public static final zzem zzU = zza("measurement.quality.checksum", false, false, (zzej) null);
    public static final zzem zzV = zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, zzcc.zza);
    public static final zzem zzW = zza("measurement.audience.refresh_event_count_filters_timestamp", false, false, zzcd.zza);
    public static final zzem zzX = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, zzce.zza);
    public static final zzem zzY = zza("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, zzcg.zza);
    public static final zzem zzZ = zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, zzch.zza);
    public static final zzem zza;
    public static final zzem zzaA = zza("measurement.redaction.no_aiid_in_config_request", true, true, zzdo.zza);
    public static final zzem zzaB = zza("measurement.redaction.config_redacted_fields", true, true, zzdp.zza);
    public static final zzem zzaC = zza("measurement.redaction.upload_redacted_fields", true, true, zzdq.zza);
    public static final zzem zzaD = zza("measurement.redaction.upload_subdomain_override", true, true, zzdr.zza);
    public static final zzem zzaE = zza("measurement.redaction.device_info", true, true, zzds.zza);
    public static final zzem zzaF = zza("measurement.redaction.user_id", true, true, zzdt.zza);
    public static final zzem zzaG = zza("measurement.redaction.google_signals", true, true, zzdv.zza);
    public static final zzem zzaH = zza("measurement.collection.enable_session_stitching_token.service", false, false, zzdw.zza);
    public static final zzem zzaI = zza("measurement.collection.enable_session_stitching_token.client.dev", false, false, zzdy.zza);
    public static final zzem zzaJ = zza("measurement.redaction.app_instance_id", true, true, zzdz.zza);
    public static final zzem zzaK = zza("measurement.redaction.populate_ephemeral_app_instance_id", true, true, zzea.zza);
    public static final zzem zzaL = zza("measurement.redaction.enhanced_uid", true, true, zzeb.zza);
    public static final zzem zzaM = zza("measurement.redaction.e_tag", false, false, zzec.zza);
    public static final zzem zzaN = zza("measurement.redaction.client_ephemeral_aiid_generation", true, true, zzed.zza);
    public static final zzem zzaO = zza("measurement.audience.dynamic_filters.oob_fix", true, true, zzee.zza);
    /* access modifiers changed from: private */
    public static final List zzaP = Collections.synchronizedList(new ArrayList());
    private static final Set zzaQ = Collections.synchronizedSet(new HashSet());
    public static final zzem zzaa = zza("measurement.lifecycle.app_in_background_parameter", false, false, zzci.zza);
    public static final zzem zzab = zza("measurement.integration.disable_firebase_instance_id", false, false, zzcj.zza);
    public static final zzem zzac = zza("measurement.collection.service.update_with_analytics_fix", false, false, zzcl.zza);
    public static final zzem zzad = zza("measurement.client.firebase_feature_rollout.v1.enable", true, true, zzcm.zza);
    public static final zzem zzae = zza("measurement.client.sessions.check_on_reset_and_enable2", true, true, zzcn.zza);
    public static final zzem zzaf = zza("measurement.scheduler.task_thread.cleanup_on_exit", false, false, zzco.zza);
    public static final zzem zzag = zza("measurement.collection.synthetic_data_mitigation", false, false, zzcp.zza);
    public static final zzem zzah = zza("measurement.androidId.delete_feature", true, true, zzcr.zza);
    public static final zzem zzai = zza("measurement.service.storage_consent_support_version", 203600, 203600, zzcs.zza);
    public static final zzem zzaj = zza("measurement.client.click_identifier_control.dev", false, false, zzct.zza);
    public static final zzem zzak = zza("measurement.service.click_identifier_control", false, false, zzcu.zza);
    public static final zzem zzal = zza("measurement.client.consent.gmpappid_worker_thread_fix", true, true, zzcv.zza);
    public static final zzem zzam = zza("measurement.module.pixie.fix_array", true, true, zzcx.zza);
    public static final zzem zzan = zza("measurement.adid_zero.service", true, true, zzcy.zza);
    public static final zzem zzao = zza("measurement.adid_zero.remove_lair_if_adidzero_false", true, true, zzcz.zza);
    public static final zzem zzap = zza("measurement.adid_zero.remove_lair_if_userid_cleared", true, true, zzda.zza);
    public static final zzem zzaq = zza("measurement.adid_zero.remove_lair_on_id_value_change_only", true, true, zzdc.zza);
    public static final zzem zzar = zza("measurement.adid_zero.adid_uid", true, true, zzdd.zza);
    public static final zzem zzas = zza("measurement.adid_zero.app_instance_id_fix", true, true, zzde.zza);
    public static final zzem zzat = zza("measurement.service.refactor.package_side_screen", true, true, zzdf.zza);
    public static final zzem zzau = zza("measurement.enhanced_campaign.service", true, true, zzdg.zza);
    public static final zzem zzav = zza("measurement.enhanced_campaign.client", true, true, zzdh.zza);
    public static final zzem zzaw = zza("measurement.enhanced_campaign.srsltid.client", true, true, zzdj.zza);
    public static final zzem zzax = zza("measurement.enhanced_campaign.srsltid.service", true, true, zzdk.zza);
    public static final zzem zzay = zza("measurement.service.store_null_safelist", true, true, zzdl.zza);
    public static final zzem zzaz = zza("measurement.service.store_safelist", true, true, zzdn.zza);
    public static final zzem zzb = zza("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, zzba.zza);
    public static final zzem zzc = zza("measurement.config.cache_time", 86400000L, 3600000L, zzbm.zza);
    public static final zzem zzd = zza("measurement.config.url_scheme", "https", "https", zzby.zza);
    public static final zzem zze = zza("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", zzck.zza);
    public static final zzem zzf = zza("measurement.upload.max_bundles", 100, 100, zzcw.zza);
    public static final zzem zzg = zza("measurement.upload.max_batch_size", 65536, 65536, zzdi.zza);
    public static final zzem zzh = zza("measurement.upload.max_bundle_size", 65536, 65536, zzdu.zza);
    public static final zzem zzi = zza("measurement.upload.max_events_per_bundle", 1000, 1000, zzef.zza);
    public static final zzem zzj = zza("measurement.upload.max_events_per_day", 100000, 100000, zzeg.zza);
    public static final zzem zzk = zza("measurement.upload.max_error_events_per_day", 1000, 1000, zzbj.zza);
    public static final zzem zzl = zza("measurement.upload.max_public_events_per_day", 50000, 50000, zzbu.zza);
    public static final zzem zzm = zza("measurement.upload.max_conversions_per_day", 10000, 10000, zzcf.zza);
    public static final zzem zzn = zza("measurement.upload.max_realtime_events_per_day", 10, 10, zzcq.zza);
    public static final zzem zzo = zza("measurement.store.max_stored_events_per_app", 100000, 100000, zzdb.zza);
    public static final zzem zzp = zza("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", zzdm.zza);
    public static final zzem zzq = zza("measurement.upload.backoff_period", 43200000L, 43200000L, zzdx.zza);
    public static final zzem zzr = zza("measurement.upload.window_interval", 3600000L, 3600000L, zzeh.zza);
    public static final zzem zzs = zza("measurement.upload.interval", 3600000L, 3600000L, zzei.zza);
    public static final zzem zzt;
    public static final zzem zzu = zza("measurement.upload.debug_upload_interval", 1000L, 1000L, zzbb.zza);
    public static final zzem zzv = zza("measurement.upload.minimum_delay", 500L, 500L, zzbc.zza);
    public static final zzem zzw = zza("measurement.alarm_manager.minimum_interval", 60000L, 60000L, zzbd.zza);
    public static final zzem zzx = zza("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, zzbe.zza);
    public static final zzem zzy = zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, zzbf.zza);
    public static final zzem zzz = zza("measurement.upload.initial_upload_delay_time", 15000L, 15000L, zzbg.zza);

    static {
        Long valueOf = Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS);
        zza = zza("measurement.ad_id_cache_time", valueOf, valueOf, zzay.zza);
        zzt = zza("measurement.upload.realtime_upload_interval", valueOf, valueOf, zzaz.zza);
        Integer valueOf2 = Integer.valueOf(ServiceStarter.ERROR_UNKNOWN);
        zzG = zza("measurement.upload.max_event_name_cardinality", valueOf2, valueOf2, (zzej) null);
        Double valueOf3 = Double.valueOf(-3.0d);
        zzN = zza("measurement.test.double_flag", valueOf3, valueOf3, zzbt.zza);
    }

    static zzem zza(String str, Object obj, Object obj2, zzej zzej) {
        zzem zzem = new zzem(str, obj, obj2, zzej, (zzel) null);
        zzaP.add(zzem);
        return zzem;
    }

    public static Map zzc(Context context) {
        zzhe zza2 = zzhe.zza(context.getContentResolver(), zzho.zza("com.google.android.gms.measurement"));
        return zza2 == null ? Collections.emptyMap() : zza2.zzc();
    }
}
