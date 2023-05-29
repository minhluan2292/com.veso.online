package com.veso.online.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/veso/online/data/model/JackpotInfo;", "", "slJackpot", "", "slJackpot2", "jackpot", "jackpot2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getJackpot", "()Ljava/lang/String;", "getJackpot2", "getSlJackpot", "getSlJackpot2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: VietlotResult.kt */
public final class JackpotInfo {
    @SerializedName("jackpot")
    private final String jackpot;
    @SerializedName("jackpot2")
    private final String jackpot2;
    @SerializedName("sl_jackpot")
    private final String slJackpot;
    @SerializedName("sl_jackpot2")
    private final String slJackpot2;

    public static /* synthetic */ JackpotInfo copy$default(JackpotInfo jackpotInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jackpotInfo.slJackpot;
        }
        if ((i & 2) != 0) {
            str2 = jackpotInfo.slJackpot2;
        }
        if ((i & 4) != 0) {
            str3 = jackpotInfo.jackpot;
        }
        if ((i & 8) != 0) {
            str4 = jackpotInfo.jackpot2;
        }
        return jackpotInfo.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.slJackpot;
    }

    public final String component2() {
        return this.slJackpot2;
    }

    public final String component3() {
        return this.jackpot;
    }

    public final String component4() {
        return this.jackpot2;
    }

    public final JackpotInfo copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "slJackpot");
        Intrinsics.checkNotNullParameter(str2, "slJackpot2");
        Intrinsics.checkNotNullParameter(str3, "jackpot");
        Intrinsics.checkNotNullParameter(str4, "jackpot2");
        return new JackpotInfo(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JackpotInfo)) {
            return false;
        }
        JackpotInfo jackpotInfo = (JackpotInfo) obj;
        return Intrinsics.areEqual((Object) this.slJackpot, (Object) jackpotInfo.slJackpot) && Intrinsics.areEqual((Object) this.slJackpot2, (Object) jackpotInfo.slJackpot2) && Intrinsics.areEqual((Object) this.jackpot, (Object) jackpotInfo.jackpot) && Intrinsics.areEqual((Object) this.jackpot2, (Object) jackpotInfo.jackpot2);
    }

    public int hashCode() {
        return (((((this.slJackpot.hashCode() * 31) + this.slJackpot2.hashCode()) * 31) + this.jackpot.hashCode()) * 31) + this.jackpot2.hashCode();
    }

    public String toString() {
        return "JackpotInfo(slJackpot=" + this.slJackpot + ", slJackpot2=" + this.slJackpot2 + ", jackpot=" + this.jackpot + ", jackpot2=" + this.jackpot2 + ')';
    }

    public JackpotInfo(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "slJackpot");
        Intrinsics.checkNotNullParameter(str2, "slJackpot2");
        Intrinsics.checkNotNullParameter(str3, "jackpot");
        Intrinsics.checkNotNullParameter(str4, "jackpot2");
        this.slJackpot = str;
        this.slJackpot2 = str2;
        this.jackpot = str3;
        this.jackpot2 = str4;
    }

    public final String getSlJackpot() {
        return this.slJackpot;
    }

    public final String getSlJackpot2() {
        return this.slJackpot2;
    }

    public final String getJackpot() {
        return this.jackpot;
    }

    public final String getJackpot2() {
        return this.jackpot2;
    }
}
