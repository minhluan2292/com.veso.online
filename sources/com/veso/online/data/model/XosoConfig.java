package com.veso.online.data.model;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.veso.online.features.result.SlidableFragment;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/veso/online/data/model/XosoConfig;", "", "id", "", "code", "type", "name", "shortName", "date", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDate", "getId", "getName", "getShortName", "getType", "isTraditionLottery", "", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoConfig.kt */
public final class XosoConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String MEGA_ID = "115";
    public static final String POWER_ID = "117";
    public static final String REGION_ID_MIDDLE = "3";
    public static final String REGION_ID_NORTH = "2";
    public static final String REGION_ID_SOUTH = "1";
    /* access modifiers changed from: private */
    public static final List<XosoConfig> allConfig = CollectionsKt.listOf(new XosoConfig(REGION_ID_SOUTH, "HCM", REGION_ID_SOUTH, "TP. HCM", "TP. HCM", "2,7"), new XosoConfig(REGION_ID_NORTH, "DT", REGION_ID_SOUTH, "Đồng Tháp", "Đ.Tháp", REGION_ID_NORTH), new XosoConfig(REGION_ID_MIDDLE, "CM", REGION_ID_SOUTH, "Cà Mau", "C.Mau", REGION_ID_NORTH), new XosoConfig("9", "BL", REGION_ID_SOUTH, "Bạc Liêu", "B.Liêu", REGION_ID_MIDDLE), new XosoConfig("8", "VT", REGION_ID_SOUTH, "Vũng Tàu", "V.Tàu", REGION_ID_MIDDLE), new XosoConfig("7", "BTR", REGION_ID_SOUTH, "Bến Tre", "B.Tre", REGION_ID_MIDDLE), new XosoConfig("10", "DN", REGION_ID_SOUTH, "Đồng Nai", "Đ.Nai", "4"), new XosoConfig("11", "CT", REGION_ID_SOUTH, "Cần Thơ", "C.Thơ", "4"), new XosoConfig("12", "ST", REGION_ID_SOUTH, "Sóc Trăng", "S.Trăng", "4"), new XosoConfig("13", "TN", REGION_ID_SOUTH, "Tây Ninh", "T.Ninh", "5"), new XosoConfig("14", "AG", REGION_ID_SOUTH, "An Giang", "A.Giang", "5"), new XosoConfig("15", "BTH", REGION_ID_SOUTH, "Bình Thuận", "B.Thuận", "5"), new XosoConfig("16", "VL", REGION_ID_SOUTH, "Vĩnh Long", "V.Long", "6"), new XosoConfig("17", "BD", REGION_ID_SOUTH, "Bình Dương", "B.Dương", "6"), new XosoConfig("18", "TV", REGION_ID_SOUTH, "Trà Vinh", "T.Vinh", "6"), new XosoConfig("19", "LA", REGION_ID_SOUTH, "Long An", "L.An", "7"), new XosoConfig("20", "HG", REGION_ID_SOUTH, "Hậu Giang", "H.Giang", "7"), new XosoConfig("21", "BP", REGION_ID_SOUTH, "Bình Phước", "B.Phước", "7"), new XosoConfig("22", "TG", REGION_ID_SOUTH, "Tiền Giang", "T.Giang", REGION_ID_SOUTH), new XosoConfig("23", "KG", REGION_ID_SOUTH, "Kiên Giang", "K.Giang", REGION_ID_SOUTH), new XosoConfig("24", "DL", REGION_ID_SOUTH, "Đà Lạt", "Đ.Lạt", REGION_ID_SOUTH), new XosoConfig("26", "TTH", REGION_ID_MIDDLE, "Thừa T. Huế", "T.T.Huế", REGION_ID_NORTH), new XosoConfig("27", "PY", REGION_ID_MIDDLE, "Phú Yên", "P.Yên", REGION_ID_NORTH), new XosoConfig("28", "QNM", REGION_ID_MIDDLE, "Quảng Nam", "Q.Nam", REGION_ID_MIDDLE), new XosoConfig("29", "DLK", REGION_ID_MIDDLE, "Đắk Lắk", "Đ.Lắk", REGION_ID_MIDDLE), new XosoConfig("30", "DNG", REGION_ID_MIDDLE, "Đà Nẵng", "Đ.Nẵng", "4,7"), new XosoConfig("31", "KH", REGION_ID_MIDDLE, "Khánh Hòa", "K.Hòa", "1,4"), new XosoConfig("32", "BDI", REGION_ID_MIDDLE, "Bình Định", "B.Định", "5"), new XosoConfig("33", "QT", REGION_ID_MIDDLE, "Quảng Trị", "Q.Trị", "5"), new XosoConfig("34", "QB", REGION_ID_MIDDLE, "Quảng Bình", "Q.Bình", "5"), new XosoConfig("35", "GL", REGION_ID_MIDDLE, "Gia Lai", "G.Lai", "6"), new XosoConfig("36", "NT", REGION_ID_MIDDLE, "Ninh Thuận", "N.Thuận", "6"), new XosoConfig("37", "QNG", REGION_ID_MIDDLE, "Quảng Ngãi", "Q.Ngãi", "7"), new XosoConfig("38", "DNO", REGION_ID_MIDDLE, "Đắk Nông", "Đ.Nông", "7"), new XosoConfig("39", "KT", REGION_ID_MIDDLE, "Kon Tum", "K.Tum", REGION_ID_SOUTH), new XosoConfig("46", "HN", REGION_ID_NORTH, "Hà Nội", "Hà Nội", "2,5"), new XosoConfig("47", "QN", REGION_ID_NORTH, "Quảng Ninh", "Q.Ninh", REGION_ID_MIDDLE), new XosoConfig("48", "BN", REGION_ID_NORTH, "Bắc Ninh", "B.Ninh", "4"), new XosoConfig("49", "HP", REGION_ID_NORTH, "Hải Phòng", "Hải Phòng", "6"), new XosoConfig("50", "ND", REGION_ID_NORTH, "Nam Định", "N.Định", "7"), new XosoConfig("51", "TB", REGION_ID_NORTH, "Thái Bình", "T.Bình", REGION_ID_SOUTH), new XosoConfig("111", "THANTAI", "5", "Điện Toán Thần Tài", "Thần Tài", "1,2,3,4,5,6,7"), new XosoConfig("112", "6X36", "5", "Điện Toán 6X36", "6X36", "4,7"), new XosoConfig("113", "123", "5", "Điện Toán 1*2*3", "1*2*3", "1,2,3,4,5,6,7"), new XosoConfig(MEGA_ID, "MEGA", "4", "Điện Toán Mega 6/45", "Mega 6/45", "1,4,6"), new XosoConfig("116", "MAX", "4", "Điện Toán Max4D", "Max4D", "3,5,7"), new XosoConfig(POWER_ID, "POWER", "4", "Điện Toán Power 6/55", "Power 6/55", "3,5,7"));
    /* access modifiers changed from: private */
    public static final Lazy<Map<String, XosoConfig>> mapConfigIds$delegate = LazyKt.lazy(XosoConfig$Companion$mapConfigIds$2.INSTANCE);
    private final String code;
    private final String date;
    private final String id;
    private final String name;
    private final String shortName;
    private final String type;

    public XosoConfig(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, FacebookMediationAdapter.KEY_ID);
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "type");
        Intrinsics.checkNotNullParameter(str4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter(str5, "shortName");
        Intrinsics.checkNotNullParameter(str6, SlidableFragment.KEY_DATE);
        this.id = str;
        this.code = str2;
        this.type = str3;
        this.name = str4;
        this.shortName = str5;
        this.date = str6;
    }

    public final String getId() {
        return this.id;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getType() {
        return this.type;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getDate() {
        return this.date;
    }

    public final boolean isTraditionLottery() {
        return Intrinsics.areEqual((Object) this.type, (Object) REGION_ID_SOUTH) || Intrinsics.areEqual((Object) this.type, (Object) REGION_ID_NORTH) || Intrinsics.areEqual((Object) this.type, (Object) REGION_ID_MIDDLE);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u000f8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/veso/online/data/model/XosoConfig$Companion;", "", "()V", "MEGA_ID", "", "POWER_ID", "REGION_ID_MIDDLE", "REGION_ID_NORTH", "REGION_ID_SOUTH", "allConfig", "", "Lcom/veso/online/data/model/XosoConfig;", "getAllConfig", "()Ljava/util/List;", "mapConfigIds", "", "getMapConfigIds", "()Ljava/util/Map;", "mapConfigIds$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: XosoConfig.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<XosoConfig> getAllConfig() {
            return XosoConfig.allConfig;
        }

        public final Map<String, XosoConfig> getMapConfigIds() {
            return (Map) XosoConfig.mapConfigIds$delegate.getValue();
        }
    }
}
