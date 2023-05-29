package com.veso.online.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\""}, d2 = {"Lcom/veso/online/data/model/KenoInfo;", "Landroid/os/Parcelable;", "chan", "", "le", "lon", "nho", "tong", "(IIIII)V", "getChan", "()I", "getLe", "getLon", "getNho", "getTong", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoResult.kt */
public final class KenoInfo implements Parcelable {
    public static final Parcelable.Creator<KenoInfo> CREATOR = new Creator();
    @SerializedName("chan")
    private final int chan;
    @SerializedName("le")
    private final int le;
    @SerializedName("lon")
    private final int lon;
    @SerializedName("nho")
    private final int nho;
    @SerializedName("tong")
    private final int tong;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* compiled from: KenoResult.kt */
    public static final class Creator implements Parcelable.Creator<KenoInfo> {
        public final KenoInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KenoInfo(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public final KenoInfo[] newArray(int i) {
            return new KenoInfo[i];
        }
    }

    public static /* synthetic */ KenoInfo copy$default(KenoInfo kenoInfo, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = kenoInfo.chan;
        }
        if ((i6 & 2) != 0) {
            i2 = kenoInfo.le;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = kenoInfo.lon;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = kenoInfo.nho;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = kenoInfo.tong;
        }
        return kenoInfo.copy(i, i7, i8, i9, i5);
    }

    public final int component1() {
        return this.chan;
    }

    public final int component2() {
        return this.le;
    }

    public final int component3() {
        return this.lon;
    }

    public final int component4() {
        return this.nho;
    }

    public final int component5() {
        return this.tong;
    }

    public final KenoInfo copy(int i, int i2, int i3, int i4, int i5) {
        return new KenoInfo(i, i2, i3, i4, i5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KenoInfo)) {
            return false;
        }
        KenoInfo kenoInfo = (KenoInfo) obj;
        return this.chan == kenoInfo.chan && this.le == kenoInfo.le && this.lon == kenoInfo.lon && this.nho == kenoInfo.nho && this.tong == kenoInfo.tong;
    }

    public int hashCode() {
        return (((((((this.chan * 31) + this.le) * 31) + this.lon) * 31) + this.nho) * 31) + this.tong;
    }

    public String toString() {
        return "KenoInfo(chan=" + this.chan + ", le=" + this.le + ", lon=" + this.lon + ", nho=" + this.nho + ", tong=" + this.tong + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.chan);
        parcel.writeInt(this.le);
        parcel.writeInt(this.lon);
        parcel.writeInt(this.nho);
        parcel.writeInt(this.tong);
    }

    public KenoInfo(int i, int i2, int i3, int i4, int i5) {
        this.chan = i;
        this.le = i2;
        this.lon = i3;
        this.nho = i4;
        this.tong = i5;
    }

    public final int getChan() {
        return this.chan;
    }

    public final int getLe() {
        return this.le;
    }

    public final int getLon() {
        return this.lon;
    }

    public final int getNho() {
        return this.nho;
    }

    public final int getTong() {
        return this.tong;
    }
}
