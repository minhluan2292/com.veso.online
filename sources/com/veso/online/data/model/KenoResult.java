package com.veso.online.data.model;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.veso.online.features.result.SlidableFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/veso/online/data/model/KenoResult;", "Lcom/veso/online/data/model/KenoItem;", "date", "", "time", "lv", "daySo", "info", "Lcom/veso/online/data/model/KenoInfo;", "sltrung", "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/veso/online/data/model/KenoInfo;Lcom/google/gson/JsonObject;)V", "getDate", "()Ljava/lang/String;", "getDaySo", "getInfo", "()Lcom/veso/online/data/model/KenoInfo;", "getLv", "getSltrung", "()Lcom/google/gson/JsonObject;", "getTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoResult.kt */
public final class KenoResult implements KenoItem {
    @SerializedName("date")
    private final String date;
    @SerializedName("dayso")
    private final String daySo;
    @SerializedName("info")
    private final KenoInfo info;
    @SerializedName("lv")
    private final String lv;
    @SerializedName("sltrung")
    private final JsonObject sltrung;
    @SerializedName("time")
    private final String time;

    public static /* synthetic */ KenoResult copy$default(KenoResult kenoResult, String str, String str2, String str3, String str4, KenoInfo kenoInfo, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kenoResult.date;
        }
        if ((i & 2) != 0) {
            str2 = kenoResult.time;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = kenoResult.lv;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = kenoResult.daySo;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            kenoInfo = kenoResult.info;
        }
        KenoInfo kenoInfo2 = kenoInfo;
        if ((i & 32) != 0) {
            jsonObject = kenoResult.sltrung;
        }
        return kenoResult.copy(str, str5, str6, str7, kenoInfo2, jsonObject);
    }

    public final String component1() {
        return this.date;
    }

    public final String component2() {
        return this.time;
    }

    public final String component3() {
        return this.lv;
    }

    public final String component4() {
        return this.daySo;
    }

    public final KenoInfo component5() {
        return this.info;
    }

    public final JsonObject component6() {
        return this.sltrung;
    }

    public final KenoResult copy(String str, String str2, String str3, String str4, KenoInfo kenoInfo, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(str2, "time");
        Intrinsics.checkNotNullParameter(str3, "lv");
        Intrinsics.checkNotNullParameter(str4, "daySo");
        return new KenoResult(str, str2, str3, str4, kenoInfo, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KenoResult)) {
            return false;
        }
        KenoResult kenoResult = (KenoResult) obj;
        return Intrinsics.areEqual((Object) this.date, (Object) kenoResult.date) && Intrinsics.areEqual((Object) this.time, (Object) kenoResult.time) && Intrinsics.areEqual((Object) this.lv, (Object) kenoResult.lv) && Intrinsics.areEqual((Object) this.daySo, (Object) kenoResult.daySo) && Intrinsics.areEqual((Object) this.info, (Object) kenoResult.info) && Intrinsics.areEqual((Object) this.sltrung, (Object) kenoResult.sltrung);
    }

    public int hashCode() {
        int hashCode = ((((((this.date.hashCode() * 31) + this.time.hashCode()) * 31) + this.lv.hashCode()) * 31) + this.daySo.hashCode()) * 31;
        KenoInfo kenoInfo = this.info;
        int i = 0;
        int hashCode2 = (hashCode + (kenoInfo == null ? 0 : kenoInfo.hashCode())) * 31;
        JsonObject jsonObject = this.sltrung;
        if (jsonObject != null) {
            i = jsonObject.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "KenoResult(date=" + this.date + ", time=" + this.time + ", lv=" + this.lv + ", daySo=" + this.daySo + ", info=" + this.info + ", sltrung=" + this.sltrung + ')';
    }

    public KenoResult(String str, String str2, String str3, String str4, KenoInfo kenoInfo, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(str2, "time");
        Intrinsics.checkNotNullParameter(str3, "lv");
        Intrinsics.checkNotNullParameter(str4, "daySo");
        this.date = str;
        this.time = str2;
        this.lv = str3;
        this.daySo = str4;
        this.info = kenoInfo;
        this.sltrung = jsonObject;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KenoResult(String str, String str2, String str3, String str4, KenoInfo kenoInfo, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : kenoInfo, (i & 32) != 0 ? null : jsonObject);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getTime() {
        return this.time;
    }

    public final String getLv() {
        return this.lv;
    }

    public final String getDaySo() {
        return this.daySo;
    }

    public final KenoInfo getInfo() {
        return this.info;
    }

    public final JsonObject getSltrung() {
        return this.sltrung;
    }
}
