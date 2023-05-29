package com.veso.online.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.veso.online.features.result.SlidableFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/veso/online/data/model/SimpleKenoResult;", "Landroid/os/Parcelable;", "date", "", "time", "lv", "daySo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getDaySo", "getLv", "getTime", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoResult.kt */
public final class SimpleKenoResult implements Parcelable {
    public static final Parcelable.Creator<SimpleKenoResult> CREATOR = new Creator();
    private final String date;
    private final String daySo;
    private final String lv;
    private final String time;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* compiled from: KenoResult.kt */
    public static final class Creator implements Parcelable.Creator<SimpleKenoResult> {
        public final SimpleKenoResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SimpleKenoResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final SimpleKenoResult[] newArray(int i) {
            return new SimpleKenoResult[i];
        }
    }

    public static /* synthetic */ SimpleKenoResult copy$default(SimpleKenoResult simpleKenoResult, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleKenoResult.date;
        }
        if ((i & 2) != 0) {
            str2 = simpleKenoResult.time;
        }
        if ((i & 4) != 0) {
            str3 = simpleKenoResult.lv;
        }
        if ((i & 8) != 0) {
            str4 = simpleKenoResult.daySo;
        }
        return simpleKenoResult.copy(str, str2, str3, str4);
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

    public final SimpleKenoResult copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(str2, "time");
        Intrinsics.checkNotNullParameter(str3, "lv");
        Intrinsics.checkNotNullParameter(str4, "daySo");
        return new SimpleKenoResult(str, str2, str3, str4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleKenoResult)) {
            return false;
        }
        SimpleKenoResult simpleKenoResult = (SimpleKenoResult) obj;
        return Intrinsics.areEqual((Object) this.date, (Object) simpleKenoResult.date) && Intrinsics.areEqual((Object) this.time, (Object) simpleKenoResult.time) && Intrinsics.areEqual((Object) this.lv, (Object) simpleKenoResult.lv) && Intrinsics.areEqual((Object) this.daySo, (Object) simpleKenoResult.daySo);
    }

    public int hashCode() {
        return (((((this.date.hashCode() * 31) + this.time.hashCode()) * 31) + this.lv.hashCode()) * 31) + this.daySo.hashCode();
    }

    public String toString() {
        return "SimpleKenoResult(date=" + this.date + ", time=" + this.time + ", lv=" + this.lv + ", daySo=" + this.daySo + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.date);
        parcel.writeString(this.time);
        parcel.writeString(this.lv);
        parcel.writeString(this.daySo);
    }

    public SimpleKenoResult(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(str2, "time");
        Intrinsics.checkNotNullParameter(str3, "lv");
        Intrinsics.checkNotNullParameter(str4, "daySo");
        this.date = str;
        this.time = str2;
        this.lv = str3;
        this.daySo = str4;
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
}
