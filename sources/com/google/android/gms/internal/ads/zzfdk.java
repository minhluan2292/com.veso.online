package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfdk {
    public final String zzA;
    public final zzcdn zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfei zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbzi zzae;
    public final boolean zzaf;
    public final zzs zzag;
    public final String zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final JSONObject zzal;
    public final boolean zzam;
    public final String zzan;
    public final boolean zzao;
    public final String zzap;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzcce zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzfdp zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzfdk(android.util.JsonReader r77) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException, java.lang.NumberFormatException {
        /*
            r76 = this;
            r0 = r76
            r76.<init>()
            java.util.List r1 = java.util.Collections.emptyList()
            java.util.List r2 = java.util.Collections.emptyList()
            java.util.List r3 = java.util.Collections.emptyList()
            java.util.List r4 = java.util.Collections.emptyList()
            java.util.List r5 = java.util.Collections.emptyList()
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.List r7 = java.util.Collections.emptyList()
            java.util.List r8 = java.util.Collections.emptyList()
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.List r10 = java.util.Collections.emptyList()
            java.util.List r11 = java.util.Collections.emptyList()
            java.util.List r12 = java.util.Collections.emptyList()
            java.util.List r13 = java.util.Collections.emptyList()
            java.util.List r14 = java.util.Collections.emptyList()
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            org.json.JSONObject r16 = new org.json.JSONObject
            r16.<init>()
            org.json.JSONObject r17 = new org.json.JSONObject
            r17.<init>()
            org.json.JSONObject r18 = new org.json.JSONObject
            r18.<init>()
            org.json.JSONObject r19 = new org.json.JSONObject
            r19.<init>()
            org.json.JSONObject r20 = new org.json.JSONObject
            r20.<init>()
            com.google.android.gms.internal.ads.zzfvn r21 = com.google.android.gms.internal.ads.zzfvn.zzo()
            r77.beginObject()
            r22 = 1
            r23 = -1
            r24 = 0
            java.lang.String r25 = ""
            r26 = 0
            r27 = r16
            r28 = r17
            r29 = r18
            r30 = r19
            r31 = r20
            r32 = r21
            r61 = r22
            r50 = r23
            r58 = r50
            r19 = r24
            r33 = r19
            r34 = r33
            r35 = r34
            r36 = r35
            r38 = r25
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r53 = r42
            r57 = r53
            r59 = r57
            r62 = r59
            r64 = r62
            r65 = r64
            r66 = r65
            r67 = r66
            r68 = r67
            r73 = r68
            r37 = r26
            r43 = r37
            r44 = r43
            r45 = r44
            r46 = r45
            r47 = r46
            r48 = r47
            r49 = r48
            r51 = r49
            r52 = r51
            r54 = r52
            r55 = r54
            r56 = r55
            r60 = r56
            r63 = r60
            r69 = r63
            r70 = r69
            r71 = r70
            r72 = r71
            r21 = r11
            r20 = r12
            r18 = r13
            r17 = r14
            r16 = r15
            r15 = r36
            r11 = r73
            r12 = r11
            r13 = r72
            r14 = r13
        L_0x00de:
            boolean r24 = r77.hasNext()
            if (r24 == 0) goto L_0x081e
            java.lang.String r24 = r77.nextName()
            if (r24 != 0) goto L_0x00ed
            r74 = r25
            goto L_0x00ef
        L_0x00ed:
            r74 = r24
        L_0x00ef:
            int r24 = r74.hashCode()
            switch(r24) {
                case -2138196627: goto L_0x05a7;
                case -1980587809: goto L_0x0596;
                case -1965512151: goto L_0x0585;
                case -1812055556: goto L_0x0574;
                case -1776946669: goto L_0x0563;
                case -1662989631: goto L_0x0552;
                case -1620470467: goto L_0x0540;
                case -1550155393: goto L_0x052e;
                case -1440104884: goto L_0x051c;
                case -1439500848: goto L_0x050a;
                case -1428969291: goto L_0x04f8;
                case -1406227629: goto L_0x04e6;
                case -1403779768: goto L_0x04d4;
                case -1375413093: goto L_0x04c2;
                case -1360811658: goto L_0x04b0;
                case -1306015996: goto L_0x049e;
                case -1303332046: goto L_0x048c;
                case -1289032093: goto L_0x047a;
                case -1240082064: goto L_0x0468;
                case -1234181075: goto L_0x0456;
                case -1168140544: goto L_0x0444;
                case -1152230954: goto L_0x0432;
                case -1146534047: goto L_0x0420;
                case -1115838944: goto L_0x040e;
                case -1081936678: goto L_0x03fc;
                case -1078050970: goto L_0x03ea;
                case -1051269058: goto L_0x03d8;
                case -982608540: goto L_0x03c6;
                case -972056451: goto L_0x03b4;
                case -776859333: goto L_0x03a3;
                case -544216775: goto L_0x0391;
                case -437057161: goto L_0x0380;
                case -404433734: goto L_0x036e;
                case -404326515: goto L_0x035c;
                case -397704715: goto L_0x034a;
                case -388807511: goto L_0x0338;
                case -369773488: goto L_0x0326;
                case -213449460: goto L_0x0314;
                case -213424028: goto L_0x0302;
                case -180214626: goto L_0x02f0;
                case -154616268: goto L_0x02de;
                case -29338502: goto L_0x02cc;
                case 3107: goto L_0x02ba;
                case 3355: goto L_0x02a8;
                case 3076010: goto L_0x0296;
                case 37109963: goto L_0x0284;
                case 63195984: goto L_0x0272;
                case 107433883: goto L_0x0260;
                case 230323073: goto L_0x024f;
                case 418392395: goto L_0x023d;
                case 549176928: goto L_0x022b;
                case 597473788: goto L_0x0219;
                case 754887508: goto L_0x0207;
                case 791122864: goto L_0x01f6;
                case 1010584092: goto L_0x01e4;
                case 1100650276: goto L_0x01d2;
                case 1186014765: goto L_0x01c0;
                case 1321720943: goto L_0x01ae;
                case 1437255331: goto L_0x019c;
                case 1637553475: goto L_0x018a;
                case 1638957285: goto L_0x0179;
                case 1686319423: goto L_0x0167;
                case 1688341040: goto L_0x0156;
                case 1799285870: goto L_0x0144;
                case 1839650832: goto L_0x0132;
                case 1875425491: goto L_0x0120;
                case 2068142375: goto L_0x010e;
                case 2072888499: goto L_0x00fc;
                default: goto L_0x00f6;
            }
        L_0x00f6:
            r75 = r9
            r24 = r10
            goto L_0x05b8
        L_0x00fc:
            r24 = r10
            java.lang.String r10 = "manual_tracking_urls"
            r75 = r9
            r9 = r74
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 15
            goto L_0x05ba
        L_0x010e:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "rule_line_external_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 52
            goto L_0x05ba
        L_0x0120:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_analytics_logging_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 42
            goto L_0x05ba
        L_0x0132:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "renderers"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = r26
            goto L_0x05ba
        L_0x0144:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "use_third_party_container_height"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 48
            goto L_0x05ba
        L_0x0156:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "video_reward_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 7
            goto L_0x05ba
        L_0x0167:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_network_class_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 55
            goto L_0x05ba
        L_0x0179:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "video_start_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 6
            goto L_0x05ba
        L_0x018a:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "bid_response"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 40
            goto L_0x05ba
        L_0x019c:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_source_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 57
            goto L_0x05ba
        L_0x01ae:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "allow_pub_owned_ad_view"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 31
            goto L_0x05ba
        L_0x01c0:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "cache_hit_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 65
            goto L_0x05ba
        L_0x01d2:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "rewards"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 11
            goto L_0x05ba
        L_0x01e4:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "transaction_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 9
            goto L_0x05ba
        L_0x01f6:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "impression_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 5
            goto L_0x05ba
        L_0x0207:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "container_sizes"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 17
            goto L_0x05ba
        L_0x0219:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "debug_dialog_string"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 27
            goto L_0x05ba
        L_0x022b:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "presentation_error_timeout_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 16
            goto L_0x05ba
        L_0x023d:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_closable_area_disabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 36
            goto L_0x05ba
        L_0x024f:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_load_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 4
            goto L_0x05ba
        L_0x0260:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "qdata"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 24
            goto L_0x05ba
        L_0x0272:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "render_test_label"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 33
            goto L_0x05ba
        L_0x0284:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "request_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 67
            goto L_0x05ba
        L_0x0296:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "data"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 22
            goto L_0x05ba
        L_0x02a8:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 23
            goto L_0x05ba
        L_0x02ba:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 18
            goto L_0x05ba
        L_0x02cc:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "allow_custom_click_gesture"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 32
            goto L_0x05ba
        L_0x02de:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_offline_ad"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 60
            goto L_0x05ba
        L_0x02f0:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "native_required_asset_viewability"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 62
            goto L_0x05ba
        L_0x0302:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "watermark"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 46
            goto L_0x05ba
        L_0x0314:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "force_disable_hardware_acceleration"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 64
            goto L_0x05ba
        L_0x0326:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_close_button_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 50
            goto L_0x05ba
        L_0x0338:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "content_url"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 63
            goto L_0x05ba
        L_0x034a:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_close_time_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 45
            goto L_0x05ba
        L_0x035c:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "render_timeout_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 38
            goto L_0x05ba
        L_0x036e:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "rtb_native_required_assets"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 61
            goto L_0x05ba
        L_0x0380:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "imp_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 3
            goto L_0x05ba
        L_0x0391:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "safe_browsing"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 26
            goto L_0x05ba
        L_0x03a3:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "click_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 2
            goto L_0x05ba
        L_0x03b4:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_source_instance_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 59
            goto L_0x05ba
        L_0x03c6:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "valid_from_timestamp"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 10
            goto L_0x05ba
        L_0x03d8:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "active_view"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 25
            goto L_0x05ba
        L_0x03ea:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "video_complete_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 8
            goto L_0x05ba
        L_0x03fc:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "allocation_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 21
            goto L_0x05ba
        L_0x040e:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "fill_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 12
            goto L_0x05ba
        L_0x0420:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_scroll_aware"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 43
            goto L_0x05ba
        L_0x0432:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = r22
            goto L_0x05ba
        L_0x0444:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "presentation_error_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 14
            goto L_0x05ba
        L_0x0456:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "allow_pub_rendered_attribution"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 30
            goto L_0x05ba
        L_0x0468:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_event_value"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 51
            goto L_0x05ba
        L_0x047a:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "extras"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 29
            goto L_0x05ba
        L_0x048c:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "test_mode_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 34
            goto L_0x05ba
        L_0x049e:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "adapters"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 20
            goto L_0x05ba
        L_0x04b0:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_sizes"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 19
            goto L_0x05ba
        L_0x04c2:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_cover"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 54
            goto L_0x05ba
        L_0x04d4:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "showable_impression_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 44
            goto L_0x05ba
        L_0x04e6:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "buffer_click_url_as_ready_to_ping"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 66
            goto L_0x05ba
        L_0x04f8:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "enable_omid"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 39
            goto L_0x05ba
        L_0x050a:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "orientation"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 37
            goto L_0x05ba
        L_0x051c:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_custom_close_blocked"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 35
            goto L_0x05ba
        L_0x052e:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "nofill_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 13
            goto L_0x05ba
        L_0x0540:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "backend_query_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 47
            goto L_0x05ba
        L_0x0552:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_interscroller"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 53
            goto L_0x05ba
        L_0x0563:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_source_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 56
            goto L_0x05ba
        L_0x0574:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "play_prewarm_options"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 49
            goto L_0x05ba
        L_0x0585:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "omid_settings"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 41
            goto L_0x05ba
        L_0x0596:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "debug_signals"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 28
            goto L_0x05ba
        L_0x05a7:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_source_instance_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b8
            r9 = 58
            goto L_0x05ba
        L_0x05b8:
            r9 = r23
        L_0x05ba:
            switch(r9) {
                case 0: goto L_0x0812;
                case 1: goto L_0x0807;
                case 2: goto L_0x0800;
                case 3: goto L_0x07f9;
                case 4: goto L_0x07f2;
                case 5: goto L_0x07e7;
                case 6: goto L_0x07e0;
                case 7: goto L_0x07d9;
                case 8: goto L_0x07d2;
                case 9: goto L_0x07cb;
                case 10: goto L_0x07c4;
                case 11: goto L_0x07b8;
                case 12: goto L_0x07b0;
                case 13: goto L_0x07a8;
                case 14: goto L_0x079e;
                case 15: goto L_0x0794;
                case 16: goto L_0x078c;
                case 17: goto L_0x0782;
                case 18: goto L_0x0777;
                case 19: goto L_0x076d;
                case 20: goto L_0x0763;
                case 21: goto L_0x075b;
                case 22: goto L_0x0751;
                case 23: goto L_0x074c;
                case 24: goto L_0x0747;
                case 25: goto L_0x073e;
                case 26: goto L_0x0730;
                case 27: goto L_0x072b;
                case 28: goto L_0x0721;
                case 29: goto L_0x0717;
                case 30: goto L_0x0712;
                case 31: goto L_0x070d;
                case 32: goto L_0x0708;
                case 33: goto L_0x0703;
                case 34: goto L_0x06fe;
                case 35: goto L_0x06f8;
                case 36: goto L_0x06f2;
                case 37: goto L_0x06e8;
                case 38: goto L_0x06e2;
                case 39: goto L_0x06dc;
                case 40: goto L_0x06d6;
                case 41: goto L_0x06cc;
                case 42: goto L_0x06c6;
                case 43: goto L_0x06c0;
                case 44: goto L_0x06ba;
                case 45: goto L_0x06b4;
                case 46: goto L_0x06ae;
                case 47: goto L_0x06a8;
                case 48: goto L_0x06a2;
                case 49: goto L_0x0694;
                case 50: goto L_0x068e;
                case 51: goto L_0x0680;
                case 52: goto L_0x067a;
                case 53: goto L_0x0674;
                case 54: goto L_0x066a;
                case 55: goto L_0x0664;
                case 56: goto L_0x064b;
                case 57: goto L_0x0632;
                case 58: goto L_0x0619;
                case 59: goto L_0x0600;
                case 60: goto L_0x05fa;
                case 61: goto L_0x05f0;
                case 62: goto L_0x05ea;
                case 63: goto L_0x05e0;
                case 64: goto L_0x05da;
                case 65: goto L_0x05d0;
                case 66: goto L_0x05ca;
                case 67: goto L_0x05c4;
                default: goto L_0x05bd;
            }
        L_0x05bd:
            r10 = r77
            r77.skipValue()
            goto L_0x0818
        L_0x05c4:
            java.lang.String r73 = r77.nextString()
            goto L_0x075f
        L_0x05ca:
            boolean r72 = r77.nextBoolean()
            goto L_0x075f
        L_0x05d0:
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
            r10 = r77
            r32 = r9
            goto L_0x0818
        L_0x05da:
            boolean r71 = r77.nextBoolean()
            goto L_0x075f
        L_0x05e0:
            java.lang.String r9 = r77.nextString()
            r10 = r77
            r36 = r9
            goto L_0x0818
        L_0x05ea:
            boolean r70 = r77.nextBoolean()
            goto L_0x075f
        L_0x05f0:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbu.zzh(r77)
            r10 = r77
            r31 = r9
            goto L_0x0818
        L_0x05fa:
            boolean r69 = r77.nextBoolean()
            goto L_0x075f
        L_0x0600:
            com.google.android.gms.internal.ads.zzbiu r9 = com.google.android.gms.internal.ads.zzbjc.zzfR
            java.lang.Object r9 = r9.zzl()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0614
            java.lang.String r68 = r77.nextString()
            goto L_0x075f
        L_0x0614:
            r77.skipValue()
            goto L_0x075f
        L_0x0619:
            com.google.android.gms.internal.ads.zzbiu r9 = com.google.android.gms.internal.ads.zzbjc.zzfR
            java.lang.Object r9 = r9.zzl()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x062d
            java.lang.String r67 = r77.nextString()
            goto L_0x075f
        L_0x062d:
            r77.skipValue()
            goto L_0x075f
        L_0x0632:
            com.google.android.gms.internal.ads.zzbiu r9 = com.google.android.gms.internal.ads.zzbjc.zzfR
            java.lang.Object r9 = r9.zzl()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0646
            java.lang.String r66 = r77.nextString()
            goto L_0x075f
        L_0x0646:
            r77.skipValue()
            goto L_0x075f
        L_0x064b:
            com.google.android.gms.internal.ads.zzbiu r9 = com.google.android.gms.internal.ads.zzbjc.zzfR
            java.lang.Object r9 = r9.zzl()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x065f
            java.lang.String r65 = r77.nextString()
            goto L_0x075f
        L_0x065f:
            r77.skipValue()
            goto L_0x075f
        L_0x0664:
            java.lang.String r64 = r77.nextString()
            goto L_0x075f
        L_0x066a:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbu.zzh(r77)
            r10 = r77
            r30 = r9
            goto L_0x0818
        L_0x0674:
            boolean r63 = r77.nextBoolean()
            goto L_0x075f
        L_0x067a:
            java.lang.String r62 = r77.nextString()
            goto L_0x075f
        L_0x0680:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbu.zzh(r77)
            com.google.android.gms.ads.internal.client.zzs r9 = com.google.android.gms.ads.internal.client.zzs.zza(r9)
            r10 = r77
            r35 = r9
            goto L_0x0818
        L_0x068e:
            boolean r61 = r77.nextBoolean()
            goto L_0x075f
        L_0x0694:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbu.zzh(r77)
            com.google.android.gms.internal.ads.zzbzi r9 = com.google.android.gms.internal.ads.zzbzi.zza(r9)
            r10 = r77
            r34 = r9
            goto L_0x0818
        L_0x06a2:
            boolean r60 = r77.nextBoolean()
            goto L_0x075f
        L_0x06a8:
            java.lang.String r59 = r77.nextString()
            goto L_0x075f
        L_0x06ae:
            java.lang.String r57 = r77.nextString()
            goto L_0x075f
        L_0x06b4:
            int r58 = r77.nextInt()
            goto L_0x075f
        L_0x06ba:
            int r56 = r77.nextInt()
            goto L_0x075f
        L_0x06c0:
            boolean r55 = r77.nextBoolean()
            goto L_0x075f
        L_0x06c6:
            boolean r54 = r77.nextBoolean()
            goto L_0x075f
        L_0x06cc:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbu.zzh(r77)
            r10 = r77
            r29 = r9
            goto L_0x0818
        L_0x06d6:
            java.lang.String r53 = r77.nextString()
            goto L_0x075f
        L_0x06dc:
            boolean r52 = r77.nextBoolean()
            goto L_0x075f
        L_0x06e2:
            int r51 = r77.nextInt()
            goto L_0x075f
        L_0x06e8:
            java.lang.String r9 = r77.nextString()
            int r50 = zzd(r9)
            goto L_0x075f
        L_0x06f2:
            boolean r49 = r77.nextBoolean()
            goto L_0x075f
        L_0x06f8:
            boolean r48 = r77.nextBoolean()
            goto L_0x075f
        L_0x06fe:
            boolean r47 = r77.nextBoolean()
            goto L_0x075f
        L_0x0703:
            boolean r46 = r77.nextBoolean()
            goto L_0x075f
        L_0x0708:
            boolean r45 = r77.nextBoolean()
            goto L_0x075f
        L_0x070d:
            boolean r44 = r77.nextBoolean()
            goto L_0x075f
        L_0x0712:
            boolean r43 = r77.nextBoolean()
            goto L_0x075f
        L_0x0717:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbu.zzh(r77)
            r10 = r77
            r28 = r9
            goto L_0x0818
        L_0x0721:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbu.zzh(r77)
            r10 = r77
            r27 = r9
            goto L_0x0818
        L_0x072b:
            java.lang.String r42 = r77.nextString()
            goto L_0x075f
        L_0x0730:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbu.zzh(r77)
            com.google.android.gms.internal.ads.zzcdn r9 = com.google.android.gms.internal.ads.zzcdn.zza(r9)
            r10 = r77
            r33 = r9
            goto L_0x0818
        L_0x073e:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbu.zzh(r77)
            java.lang.String r41 = r9.toString()
            goto L_0x075f
        L_0x0747:
            java.lang.String r40 = r77.nextString()
            goto L_0x075f
        L_0x074c:
            java.lang.String r39 = r77.nextString()
            goto L_0x075f
        L_0x0751:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbu.zzh(r77)
            r10 = r77
            r16 = r9
            goto L_0x0818
        L_0x075b:
            java.lang.String r38 = r77.nextString()
        L_0x075f:
            r10 = r77
            goto L_0x0818
        L_0x0763:
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
            r10 = r77
            r18 = r9
            goto L_0x0818
        L_0x076d:
            java.util.List r9 = com.google.android.gms.internal.ads.zzfdl.zza(r77)
            r10 = r77
            r17 = r9
            goto L_0x0818
        L_0x0777:
            com.google.android.gms.internal.ads.zzfdp r9 = new com.google.android.gms.internal.ads.zzfdp
            r10 = r77
            r9.<init>(r10)
            r19 = r9
            goto L_0x0818
        L_0x0782:
            r10 = r77
            java.util.List r9 = com.google.android.gms.internal.ads.zzfdl.zza(r77)
            r20 = r9
            goto L_0x0818
        L_0x078c:
            r10 = r77
            int r37 = r77.nextInt()
            goto L_0x0818
        L_0x0794:
            r10 = r77
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
            r21 = r9
            goto L_0x0818
        L_0x079e:
            r10 = r77
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
            r24 = r9
            goto L_0x0818
        L_0x07a8:
            r10 = r77
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
            goto L_0x081a
        L_0x07b0:
            r10 = r77
            java.util.List r8 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
            goto L_0x0818
        L_0x07b8:
            r10 = r77
            org.json.JSONArray r9 = com.google.android.gms.ads.internal.util.zzbu.zze(r77)
            com.google.android.gms.internal.ads.zzcce r9 = com.google.android.gms.internal.ads.zzcce.zza(r9)
            r15 = r9
            goto L_0x0818
        L_0x07c4:
            r10 = r77
            java.lang.String r11 = r77.nextString()
            goto L_0x0818
        L_0x07cb:
            r10 = r77
            java.lang.String r12 = r77.nextString()
            goto L_0x0818
        L_0x07d2:
            r10 = r77
            java.util.List r7 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
            goto L_0x0818
        L_0x07d9:
            r10 = r77
            java.util.List r6 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
            goto L_0x0818
        L_0x07e0:
            r10 = r77
            java.util.List r5 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
            goto L_0x0818
        L_0x07e7:
            r10 = r77
            int r9 = r77.nextInt()
            int r14 = zzc(r9)
            goto L_0x0818
        L_0x07f2:
            r10 = r77
            java.util.List r4 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
            goto L_0x0818
        L_0x07f9:
            r10 = r77
            java.util.List r3 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
            goto L_0x0818
        L_0x0800:
            r10 = r77
            java.util.List r2 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
            goto L_0x0818
        L_0x0807:
            r10 = r77
            java.lang.String r9 = r77.nextString()
            int r13 = zzb(r9)
            goto L_0x0818
        L_0x0812:
            r10 = r77
            java.util.List r1 = com.google.android.gms.ads.internal.util.zzbu.zzd(r77)
        L_0x0818:
            r9 = r75
        L_0x081a:
            r10 = r24
            goto L_0x00de
        L_0x081e:
            r75 = r9
            r24 = r10
            r10 = r77
            r77.endObject()
            r0.zza = r1
            r0.zzb = r13
            r0.zzc = r2
            r0.zzd = r3
            r0.zzg = r4
            r0.zzf = r14
            r0.zzh = r5
            r0.zzi = r6
            r0.zzj = r7
            r0.zzk = r12
            r0.zzl = r11
            r0.zzm = r15
            r0.zzn = r8
            r0.zzo = r9
            r10 = r24
            r0.zzp = r10
            r11 = r21
            r0.zzq = r11
            r1 = r37
            r0.zzr = r1
            r12 = r20
            r0.zzs = r12
            r1 = r19
            r0.zzt = r1
            r13 = r18
            r0.zzu = r13
            r14 = r17
            r0.zzv = r14
            r1 = r38
            r0.zzx = r1
            r15 = r16
            r0.zzw = r15
            r1 = r39
            r0.zzy = r1
            r1 = r40
            r0.zzz = r1
            r1 = r41
            r0.zzA = r1
            r1 = r33
            r0.zzB = r1
            r1 = r42
            r0.zzC = r1
            r1 = r27
            r0.zzD = r1
            r1 = r28
            r0.zzE = r1
            r1 = r43
            r0.zzK = r1
            r1 = r44
            r0.zzL = r1
            r1 = r45
            r0.zzM = r1
            r1 = r46
            r0.zzN = r1
            r1 = r47
            r0.zzO = r1
            r1 = r48
            r0.zzP = r1
            r1 = r49
            r0.zzQ = r1
            r1 = r50
            r0.zzR = r1
            r1 = r51
            r0.zzS = r1
            r1 = r52
            r0.zzU = r1
            r1 = r53
            r0.zzV = r1
            com.google.android.gms.internal.ads.zzfei r1 = new com.google.android.gms.internal.ads.zzfei
            r2 = r29
            r1.<init>(r2)
            r0.zzW = r1
            r1 = r54
            r0.zzX = r1
            r1 = r55
            r0.zzY = r1
            r1 = r56
            r0.zzZ = r1
            r1 = r57
            r0.zzaa = r1
            r1 = r58
            r0.zzab = r1
            r1 = r59
            r0.zzac = r1
            r1 = r60
            r0.zzad = r1
            r1 = r34
            r0.zzae = r1
            r1 = r61
            r0.zzaf = r1
            r1 = r35
            r0.zzag = r1
            r1 = r62
            r0.zzah = r1
            r1 = r63
            r0.zzai = r1
            r1 = r30
            r0.zzaj = r1
            r1 = r64
            r0.zzF = r1
            r1 = r65
            r0.zzG = r1
            r1 = r66
            r0.zzH = r1
            r1 = r67
            r0.zzI = r1
            r1 = r68
            r0.zzJ = r1
            r1 = r69
            r0.zzak = r1
            r1 = r31
            r0.zzal = r1
            r1 = r70
            r0.zzam = r1
            r1 = r36
            r0.zzan = r1
            r1 = r71
            r0.zzao = r1
            r1 = r32
            r0.zze = r1
            r1 = r72
            r0.zzT = r1
            r1 = r73
            r0.zzap = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdk.<init>(android.util.JsonReader):void");
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if (IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE.equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str) || "app_open_ad_v2".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i) {
        if (i == 0 || i == 1) {
            return i;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
