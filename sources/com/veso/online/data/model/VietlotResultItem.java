package com.veso.online.data.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.veso.online.R;
import com.veso.online.features.result.SlidableFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002Bç\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001bJ\u0014\u00104\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00107\u001a\u000208J\u0014\u00109\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00107\u001a\u000208J\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;052\u0006\u0010<\u001a\u00020=J\t\u0010>\u001a\u00020\u0004HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010I\u001a\u00020\u0004HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0002\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010V\u001a\u00020WHÖ\u0001J\u0013\u0010X\u001a\u00020=2\b\u0010Y\u001a\u0004\u0018\u00010ZHÖ\u0003J\t\u0010[\u001a\u00020WHÖ\u0001J\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000405J\t\u0010]\u001a\u00020\u0004HÖ\u0001J\u0019\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020WHÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001d¨\u0006c"}, d2 = {"Lcom/veso/online/data/model/VietlotResultItem;", "Landroid/os/Parcelable;", "Lcom/veso/online/data/model/VietLotItem;", "date", "", "lv", "result0", "result1", "result2", "result3", "result4", "result5", "result6", "result7", "slJackpot", "slJackpot2", "sl1", "sl2", "sl3", "sl4", "sl5", "sl6", "jackpot", "jackpot2", "jackpotSl", "jackpot2Sl", "slExt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getJackpot", "getJackpot2", "getJackpot2Sl", "getJackpotSl", "getLv", "getResult0", "getResult1", "getResult2", "getResult3", "getResult4", "getResult5", "getResult6", "getResult7", "getSl1", "getSl2", "getSl3", "getSl4", "getSl5", "getSl6", "getSlExt", "getSlJackpot", "getSlJackpot2", "buildMax3DPrizeRow", "", "Lcom/veso/online/data/model/Max3DPrizeRow;", "context", "Landroid/content/Context;", "buildMax3DProPrizeRow", "buildTableData", "Lcom/veso/online/data/model/TextCell;", "isPower655", "", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "result", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: VietlotResult.kt */
public final class VietlotResultItem implements Parcelable, VietLotItem {
    public static final Parcelable.Creator<VietlotResultItem> CREATOR = new Creator();
    @SerializedName("date")
    private final String date;
    @SerializedName("jackpot")
    private final String jackpot;
    @SerializedName("jackpot2")
    private final String jackpot2;
    @SerializedName("jackpot2_sl")
    private final String jackpot2Sl;
    @SerializedName("jackpot_sl")
    private final String jackpotSl;
    @SerializedName("lv")
    private final String lv;
    @SerializedName("0")
    private final String result0;
    @SerializedName("1")
    private final String result1;
    @SerializedName("2")
    private final String result2;
    @SerializedName("3")
    private final String result3;
    @SerializedName("4")
    private final String result4;
    @SerializedName("5")
    private final String result5;
    @SerializedName("6")
    private final String result6;
    @SerializedName("7")
    private final String result7;
    @SerializedName("sl_1")
    private final String sl1;
    @SerializedName("sl_2")
    private final String sl2;
    @SerializedName("sl_3")
    private final String sl3;
    @SerializedName("sl_4")
    private final String sl4;
    @SerializedName("sl_5")
    private final String sl5;
    @SerializedName("sl_6")
    private final String sl6;
    @SerializedName("sl_ext")
    private final String slExt;
    @SerializedName("sl_jackpot")
    private final String slJackpot;
    @SerializedName("sl_jackpot2")
    private final String slJackpot2;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* compiled from: VietlotResult.kt */
    public static final class Creator implements Parcelable.Creator<VietlotResultItem> {
        public final VietlotResultItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VietlotResultItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final VietlotResultItem[] newArray(int i) {
            return new VietlotResultItem[i];
        }
    }

    public static /* synthetic */ VietlotResultItem copy$default(VietlotResultItem vietlotResultItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, int i, Object obj) {
        VietlotResultItem vietlotResultItem2 = vietlotResultItem;
        int i2 = i;
        return vietlotResultItem.copy((i2 & 1) != 0 ? vietlotResultItem2.date : str, (i2 & 2) != 0 ? vietlotResultItem2.lv : str2, (i2 & 4) != 0 ? vietlotResultItem2.result0 : str3, (i2 & 8) != 0 ? vietlotResultItem2.result1 : str4, (i2 & 16) != 0 ? vietlotResultItem2.result2 : str5, (i2 & 32) != 0 ? vietlotResultItem2.result3 : str6, (i2 & 64) != 0 ? vietlotResultItem2.result4 : str7, (i2 & 128) != 0 ? vietlotResultItem2.result5 : str8, (i2 & 256) != 0 ? vietlotResultItem2.result6 : str9, (i2 & 512) != 0 ? vietlotResultItem2.result7 : str10, (i2 & 1024) != 0 ? vietlotResultItem2.slJackpot : str11, (i2 & 2048) != 0 ? vietlotResultItem2.slJackpot2 : str12, (i2 & 4096) != 0 ? vietlotResultItem2.sl1 : str13, (i2 & 8192) != 0 ? vietlotResultItem2.sl2 : str14, (i2 & 16384) != 0 ? vietlotResultItem2.sl3 : str15, (i2 & 32768) != 0 ? vietlotResultItem2.sl4 : str16, (i2 & 65536) != 0 ? vietlotResultItem2.sl5 : str17, (i2 & 131072) != 0 ? vietlotResultItem2.sl6 : str18, (i2 & 262144) != 0 ? vietlotResultItem2.jackpot : str19, (i2 & 524288) != 0 ? vietlotResultItem2.jackpot2 : str20, (i2 & 1048576) != 0 ? vietlotResultItem2.jackpotSl : str21, (i2 & 2097152) != 0 ? vietlotResultItem2.jackpot2Sl : str22, (i2 & 4194304) != 0 ? vietlotResultItem2.slExt : str23);
    }

    public final String component1() {
        return this.date;
    }

    public final String component10() {
        return this.result7;
    }

    public final String component11() {
        return this.slJackpot;
    }

    public final String component12() {
        return this.slJackpot2;
    }

    public final String component13() {
        return this.sl1;
    }

    public final String component14() {
        return this.sl2;
    }

    public final String component15() {
        return this.sl3;
    }

    public final String component16() {
        return this.sl4;
    }

    public final String component17() {
        return this.sl5;
    }

    public final String component18() {
        return this.sl6;
    }

    public final String component19() {
        return this.jackpot;
    }

    public final String component2() {
        return this.lv;
    }

    public final String component20() {
        return this.jackpot2;
    }

    public final String component21() {
        return this.jackpotSl;
    }

    public final String component22() {
        return this.jackpot2Sl;
    }

    public final String component23() {
        return this.slExt;
    }

    public final String component3() {
        return this.result0;
    }

    public final String component4() {
        return this.result1;
    }

    public final String component5() {
        return this.result2;
    }

    public final String component6() {
        return this.result3;
    }

    public final String component7() {
        return this.result4;
    }

    public final String component8() {
        return this.result5;
    }

    public final String component9() {
        return this.result6;
    }

    public final VietlotResultItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        String str24 = str;
        Intrinsics.checkNotNullParameter(str24, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(str2, "lv");
        return new VietlotResultItem(str24, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VietlotResultItem)) {
            return false;
        }
        VietlotResultItem vietlotResultItem = (VietlotResultItem) obj;
        return Intrinsics.areEqual((Object) this.date, (Object) vietlotResultItem.date) && Intrinsics.areEqual((Object) this.lv, (Object) vietlotResultItem.lv) && Intrinsics.areEqual((Object) this.result0, (Object) vietlotResultItem.result0) && Intrinsics.areEqual((Object) this.result1, (Object) vietlotResultItem.result1) && Intrinsics.areEqual((Object) this.result2, (Object) vietlotResultItem.result2) && Intrinsics.areEqual((Object) this.result3, (Object) vietlotResultItem.result3) && Intrinsics.areEqual((Object) this.result4, (Object) vietlotResultItem.result4) && Intrinsics.areEqual((Object) this.result5, (Object) vietlotResultItem.result5) && Intrinsics.areEqual((Object) this.result6, (Object) vietlotResultItem.result6) && Intrinsics.areEqual((Object) this.result7, (Object) vietlotResultItem.result7) && Intrinsics.areEqual((Object) this.slJackpot, (Object) vietlotResultItem.slJackpot) && Intrinsics.areEqual((Object) this.slJackpot2, (Object) vietlotResultItem.slJackpot2) && Intrinsics.areEqual((Object) this.sl1, (Object) vietlotResultItem.sl1) && Intrinsics.areEqual((Object) this.sl2, (Object) vietlotResultItem.sl2) && Intrinsics.areEqual((Object) this.sl3, (Object) vietlotResultItem.sl3) && Intrinsics.areEqual((Object) this.sl4, (Object) vietlotResultItem.sl4) && Intrinsics.areEqual((Object) this.sl5, (Object) vietlotResultItem.sl5) && Intrinsics.areEqual((Object) this.sl6, (Object) vietlotResultItem.sl6) && Intrinsics.areEqual((Object) this.jackpot, (Object) vietlotResultItem.jackpot) && Intrinsics.areEqual((Object) this.jackpot2, (Object) vietlotResultItem.jackpot2) && Intrinsics.areEqual((Object) this.jackpotSl, (Object) vietlotResultItem.jackpotSl) && Intrinsics.areEqual((Object) this.jackpot2Sl, (Object) vietlotResultItem.jackpot2Sl) && Intrinsics.areEqual((Object) this.slExt, (Object) vietlotResultItem.slExt);
    }

    public int hashCode() {
        int hashCode = ((this.date.hashCode() * 31) + this.lv.hashCode()) * 31;
        String str = this.result0;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.result1;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.result2;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.result3;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.result4;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.result5;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.result6;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.result7;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.slJackpot;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.slJackpot2;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.sl1;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.sl2;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.sl3;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.sl4;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.sl5;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.sl6;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.jackpot;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.jackpot2;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.jackpotSl;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.jackpot2Sl;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.slExt;
        if (str21 != null) {
            i = str21.hashCode();
        }
        return hashCode21 + i;
    }

    public String toString() {
        return "VietlotResultItem(date=" + this.date + ", lv=" + this.lv + ", result0=" + this.result0 + ", result1=" + this.result1 + ", result2=" + this.result2 + ", result3=" + this.result3 + ", result4=" + this.result4 + ", result5=" + this.result5 + ", result6=" + this.result6 + ", result7=" + this.result7 + ", slJackpot=" + this.slJackpot + ", slJackpot2=" + this.slJackpot2 + ", sl1=" + this.sl1 + ", sl2=" + this.sl2 + ", sl3=" + this.sl3 + ", sl4=" + this.sl4 + ", sl5=" + this.sl5 + ", sl6=" + this.sl6 + ", jackpot=" + this.jackpot + ", jackpot2=" + this.jackpot2 + ", jackpotSl=" + this.jackpotSl + ", jackpot2Sl=" + this.jackpot2Sl + ", slExt=" + this.slExt + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.date);
        parcel.writeString(this.lv);
        parcel.writeString(this.result0);
        parcel.writeString(this.result1);
        parcel.writeString(this.result2);
        parcel.writeString(this.result3);
        parcel.writeString(this.result4);
        parcel.writeString(this.result5);
        parcel.writeString(this.result6);
        parcel.writeString(this.result7);
        parcel.writeString(this.slJackpot);
        parcel.writeString(this.slJackpot2);
        parcel.writeString(this.sl1);
        parcel.writeString(this.sl2);
        parcel.writeString(this.sl3);
        parcel.writeString(this.sl4);
        parcel.writeString(this.sl5);
        parcel.writeString(this.sl6);
        parcel.writeString(this.jackpot);
        parcel.writeString(this.jackpot2);
        parcel.writeString(this.jackpotSl);
        parcel.writeString(this.jackpot2Sl);
        parcel.writeString(this.slExt);
    }

    public VietlotResultItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(str2, "lv");
        this.date = str;
        this.lv = str2;
        this.result0 = str3;
        this.result1 = str4;
        this.result2 = str5;
        this.result3 = str6;
        this.result4 = str7;
        this.result5 = str8;
        this.result6 = str9;
        this.result7 = str10;
        this.slJackpot = str11;
        this.slJackpot2 = str12;
        this.sl1 = str13;
        this.sl2 = str14;
        this.sl3 = str15;
        this.sl4 = str16;
        this.sl5 = str17;
        this.sl6 = str18;
        this.jackpot = str19;
        this.jackpot2 = str20;
        this.jackpotSl = str21;
        this.jackpot2Sl = str22;
        this.slExt = str23;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getLv() {
        return this.lv;
    }

    public final String getResult0() {
        return this.result0;
    }

    public final String getResult1() {
        return this.result1;
    }

    public final String getResult2() {
        return this.result2;
    }

    public final String getResult3() {
        return this.result3;
    }

    public final String getResult4() {
        return this.result4;
    }

    public final String getResult5() {
        return this.result5;
    }

    public final String getResult6() {
        return this.result6;
    }

    public final String getResult7() {
        return this.result7;
    }

    public final String getSlJackpot() {
        return this.slJackpot;
    }

    public final String getSlJackpot2() {
        return this.slJackpot2;
    }

    public final String getSl1() {
        return this.sl1;
    }

    public final String getSl2() {
        return this.sl2;
    }

    public final String getSl3() {
        return this.sl3;
    }

    public final String getSl4() {
        return this.sl4;
    }

    public final String getSl5() {
        return this.sl5;
    }

    public final String getSl6() {
        return this.sl6;
    }

    public final String getJackpot() {
        return this.jackpot;
    }

    public final String getJackpot2() {
        return this.jackpot2;
    }

    public final String getJackpotSl() {
        return this.jackpotSl;
    }

    public final String getJackpot2Sl() {
        return this.jackpot2Sl;
    }

    public final String getSlExt() {
        return this.slExt;
    }

    public final List<String> result() {
        String[] strArr = {this.result0, this.result1, this.result2, this.result3, this.result4, this.result5, this.result6, this.result7};
        Collection arrayList = new ArrayList();
        for (String str : CollectionsKt.listOf(strArr)) {
            CharSequence charSequence = str;
            if (!(!(charSequence == null || StringsKt.isBlank(charSequence)))) {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return (List) arrayList;
    }

    public final List<TextCell> buildTableData(boolean z) {
        List<TextCell> arrayList = new ArrayList<>();
        Integer valueOf = Integer.valueOf(R.string.prize);
        Integer valueOf2 = Integer.valueOf(R.dimen.ts_jackpot_header);
        Float valueOf3 = Float.valueOf(0.8f);
        arrayList.add(new TextCell(valueOf, (String) null, valueOf2, valueOf3, false, 18, (DefaultConstructorMarker) null));
        Integer num = valueOf2;
        Float f = valueOf3;
        arrayList.add(new TextCell(Integer.valueOf(R.string.prize_rule), (String) null, num, f, false, 18, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell(Integer.valueOf(R.string.prize_quantity), (String) null, num, f, false, 18, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell(Integer.valueOf(R.string.prize_value), (String) null, num, f, false, 18, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell(Integer.valueOf(R.string.jackpot_1), (String) null, (Integer) null, (Float) null, false, 30, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell(Integer.valueOf(R.string.jackpot_1_rule), (String) null, (Integer) null, (Float) null, false, 30, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell((Integer) null, this.slJackpot, (Integer) null, (Float) null, false, 29, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell((Integer) null, this.jackpot, (Integer) null, (Float) null, true, 13, (DefaultConstructorMarker) null));
        if (z) {
            arrayList.add(new TextCell(Integer.valueOf(R.string.jackpot_2), (String) null, (Integer) null, (Float) null, false, 30, (DefaultConstructorMarker) null));
            arrayList.add(new TextCell(Integer.valueOf(R.string.jackpot_2_rule), (String) null, (Integer) null, (Float) null, false, 30, (DefaultConstructorMarker) null));
            arrayList.add(new TextCell((Integer) null, this.slJackpot2, (Integer) null, (Float) null, false, 29, (DefaultConstructorMarker) null));
            arrayList.add(new TextCell((Integer) null, this.jackpot2, (Integer) null, (Float) null, true, 13, (DefaultConstructorMarker) null));
        }
        arrayList.add(new TextCell(Integer.valueOf(R.string.jackpot_pz_1), (String) null, (Integer) null, (Float) null, false, 30, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell(Integer.valueOf(R.string.jackpot_pz_1_rule), (String) null, (Integer) null, (Float) null, false, 30, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell((Integer) null, this.sl1, (Integer) null, (Float) null, false, 29, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell((Integer) null, z ? "40,000,000" : "10,000,000", (Integer) null, (Float) null, false, 29, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell(Integer.valueOf(R.string.jackpot_pz_2), (String) null, (Integer) null, (Float) null, false, 30, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell(Integer.valueOf(R.string.jackpot_pz_2_rule), (String) null, (Integer) null, (Float) null, false, 30, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell((Integer) null, this.sl2, (Integer) null, (Float) null, false, 29, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell((Integer) null, z ? "500,000" : "300,000", (Integer) null, (Float) null, false, 29, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell(Integer.valueOf(R.string.jackpot_pz_3), (String) null, (Integer) null, (Float) null, false, 30, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell(Integer.valueOf(R.string.jackpot_pz_3_rule), (String) null, (Integer) null, (Float) null, false, 30, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell((Integer) null, this.sl3, (Integer) null, (Float) null, false, 29, (DefaultConstructorMarker) null));
        arrayList.add(new TextCell((Integer) null, z ? "50,000" : "30,000", (Integer) null, (Float) null, false, 29, (DefaultConstructorMarker) null));
        return arrayList;
    }

    public final List<Max3DPrizeRow> buildMax3DPrizeRow(Context context) {
        String str;
        String str2;
        String str3;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        Max3DPrizeRow[] max3DPrizeRowArr = new Max3DPrizeRow[5];
        String string = context2.getString(R.string.prize);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.prize)");
        String string2 = context2.getString(R.string.prize_quantity);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.prize_quantity)");
        String string3 = context2.getString(R.string.prize_value);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.prize_value)");
        max3DPrizeRowArr[0] = new Max3DPrizeRow(string, string2, string3, Integer.valueOf(R.dimen.sp_16), Integer.valueOf(R.color.white));
        String string4 = context2.getString(R.string.prize_db);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.string.prize_db)");
        String str4 = this.sl1;
        max3DPrizeRowArr[1] = new Max3DPrizeRow(string4, str4 == null ? "0" : str4, "1,000,000", (Integer) null, (Integer) null, 24, (DefaultConstructorMarker) null);
        String string5 = context2.getString(R.string.prize_1);
        Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.string.prize_1)");
        String str5 = this.sl2;
        if (str5 == null) {
            str = "0";
        } else {
            str = str5;
        }
        max3DPrizeRowArr[2] = new Max3DPrizeRow(string5, str, "350,000", (Integer) null, (Integer) null, 24, (DefaultConstructorMarker) null);
        String string6 = context2.getString(R.string.prize_2);
        Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.string.prize_2)");
        String str6 = this.sl3;
        if (str6 == null) {
            str2 = "0";
        } else {
            str2 = str6;
        }
        max3DPrizeRowArr[3] = new Max3DPrizeRow(string6, str2, "210,000", (Integer) null, (Integer) null, 24, (DefaultConstructorMarker) null);
        String string7 = context2.getString(R.string.prize_3);
        Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.string.prize_3)");
        String str7 = this.sl4;
        if (str7 == null) {
            str3 = "0";
        } else {
            str3 = str7;
        }
        max3DPrizeRowArr[4] = new Max3DPrizeRow(string7, str3, "100,000", (Integer) null, (Integer) null, 24, (DefaultConstructorMarker) null);
        return CollectionsKt.listOf(max3DPrizeRowArr);
    }

    public final List<Max3DPrizeRow> buildMax3DProPrizeRow(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        Max3DPrizeRow[] max3DPrizeRowArr = new Max3DPrizeRow[9];
        String string = context2.getString(R.string.prize);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.prize)");
        String string2 = context2.getString(R.string.prize_quantity);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.prize_quantity)");
        String string3 = context2.getString(R.string.prize_value);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.prize_value)");
        max3DPrizeRowArr[0] = new Max3DPrizeRow(string, string2, string3, Integer.valueOf(R.dimen.sp_16), Integer.valueOf(R.color.white));
        String string4 = context2.getString(R.string.prize_db);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.string.prize_db)");
        String str8 = this.slJackpot;
        max3DPrizeRowArr[1] = new Max3DPrizeRow(string4, str8 == null ? "0" : str8, "2,000,000,000", (Integer) null, (Integer) null, 24, (DefaultConstructorMarker) null);
        String string5 = context2.getString(R.string.prize_sub_db);
        Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.string.prize_sub_db)");
        String str9 = this.slJackpot2;
        if (str9 == null) {
            str = "0";
        } else {
            str = str9;
        }
        max3DPrizeRowArr[2] = new Max3DPrizeRow(string5, str, "400,000,000", (Integer) null, (Integer) null, 24, (DefaultConstructorMarker) null);
        String string6 = context2.getString(R.string.prize_1);
        Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.string.prize_1)");
        String str10 = this.sl1;
        if (str10 == null) {
            str2 = "0";
        } else {
            str2 = str10;
        }
        max3DPrizeRowArr[3] = new Max3DPrizeRow(string6, str2, "30,000,000", (Integer) null, (Integer) null, 24, (DefaultConstructorMarker) null);
        String string7 = context2.getString(R.string.prize_2);
        Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.string.prize_2)");
        String str11 = this.sl2;
        if (str11 == null) {
            str3 = "0";
        } else {
            str3 = str11;
        }
        max3DPrizeRowArr[4] = new Max3DPrizeRow(string7, str3, "10,000,000", (Integer) null, (Integer) null, 24, (DefaultConstructorMarker) null);
        String string8 = context2.getString(R.string.prize_3);
        Intrinsics.checkNotNullExpressionValue(string8, "context.getString(R.string.prize_3)");
        String str12 = this.sl3;
        if (str12 == null) {
            str4 = "0";
        } else {
            str4 = str12;
        }
        max3DPrizeRowArr[5] = new Max3DPrizeRow(string8, str4, "4,000,000", (Integer) null, (Integer) null, 24, (DefaultConstructorMarker) null);
        String string9 = context2.getString(R.string.prize_4);
        Intrinsics.checkNotNullExpressionValue(string9, "context.getString(R.string.prize_4)");
        String str13 = this.sl4;
        if (str13 == null) {
            str5 = "0";
        } else {
            str5 = str13;
        }
        max3DPrizeRowArr[6] = new Max3DPrizeRow(string9, str5, "1,000,000", (Integer) null, (Integer) null, 24, (DefaultConstructorMarker) null);
        String string10 = context2.getString(R.string.prize_5);
        Intrinsics.checkNotNullExpressionValue(string10, "context.getString(R.string.prize_5)");
        String str14 = this.sl5;
        if (str14 == null) {
            str6 = "0";
        } else {
            str6 = str14;
        }
        max3DPrizeRowArr[7] = new Max3DPrizeRow(string10, str6, "100,000", (Integer) null, (Integer) null, 24, (DefaultConstructorMarker) null);
        String string11 = context2.getString(R.string.prize_6);
        Intrinsics.checkNotNullExpressionValue(string11, "context.getString(R.string.prize_6)");
        String str15 = this.sl6;
        if (str15 == null) {
            str7 = "0";
        } else {
            str7 = str15;
        }
        max3DPrizeRowArr[8] = new Max3DPrizeRow(string11, str7, "40,000", (Integer) null, (Integer) null, 24, (DefaultConstructorMarker) null);
        return CollectionsKt.listOf(max3DPrizeRowArr);
    }
}
