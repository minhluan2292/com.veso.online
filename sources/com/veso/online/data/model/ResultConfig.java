package com.veso.online.data.model;

import com.google.gson.annotations.SerializedName;
import com.veso.online.features.result.SlidableFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Je\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/veso/online/data/model/ResultConfig;", "", "date", "", "run", "", "dai", "", "dt", "time", "", "delay", "done", "key", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;JIILjava/lang/String;)V", "getDai", "()Ljava/util/List;", "getDate", "()Ljava/lang/String;", "getDelay", "()I", "getDone", "getDt", "getKey", "getRun", "getTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ResultConfig.kt */
public final class ResultConfig {
    @SerializedName("dai")
    private final List<String> dai;
    @SerializedName("date")
    private final String date;
    @SerializedName("delay")
    private final int delay;
    @SerializedName("done")
    private final int done;
    @SerializedName("dt")
    private final List<String> dt;
    @SerializedName("key")
    private final String key;
    @SerializedName("run")
    private final int run;
    @SerializedName("time")
    private final long time;

    public static /* synthetic */ ResultConfig copy$default(ResultConfig resultConfig, String str, int i, List list, List list2, long j, int i2, int i3, String str2, int i4, Object obj) {
        ResultConfig resultConfig2 = resultConfig;
        int i5 = i4;
        return resultConfig.copy((i5 & 1) != 0 ? resultConfig2.date : str, (i5 & 2) != 0 ? resultConfig2.run : i, (i5 & 4) != 0 ? resultConfig2.dai : list, (i5 & 8) != 0 ? resultConfig2.dt : list2, (i5 & 16) != 0 ? resultConfig2.time : j, (i5 & 32) != 0 ? resultConfig2.delay : i2, (i5 & 64) != 0 ? resultConfig2.done : i3, (i5 & 128) != 0 ? resultConfig2.key : str2);
    }

    public final String component1() {
        return this.date;
    }

    public final int component2() {
        return this.run;
    }

    public final List<String> component3() {
        return this.dai;
    }

    public final List<String> component4() {
        return this.dt;
    }

    public final long component5() {
        return this.time;
    }

    public final int component6() {
        return this.delay;
    }

    public final int component7() {
        return this.done;
    }

    public final String component8() {
        return this.key;
    }

    public final ResultConfig copy(String str, int i, List<String> list, List<String> list2, long j, int i2, int i3, String str2) {
        Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(list, "dai");
        Intrinsics.checkNotNullParameter(list2, "dt");
        String str3 = str2;
        Intrinsics.checkNotNullParameter(str3, "key");
        return new ResultConfig(str, i, list, list2, j, i2, i3, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultConfig)) {
            return false;
        }
        ResultConfig resultConfig = (ResultConfig) obj;
        return Intrinsics.areEqual((Object) this.date, (Object) resultConfig.date) && this.run == resultConfig.run && Intrinsics.areEqual((Object) this.dai, (Object) resultConfig.dai) && Intrinsics.areEqual((Object) this.dt, (Object) resultConfig.dt) && this.time == resultConfig.time && this.delay == resultConfig.delay && this.done == resultConfig.done && Intrinsics.areEqual((Object) this.key, (Object) resultConfig.key);
    }

    public int hashCode() {
        return (((((((((((((this.date.hashCode() * 31) + this.run) * 31) + this.dai.hashCode()) * 31) + this.dt.hashCode()) * 31) + ResultConfig$$ExternalSyntheticBackport0.m(this.time)) * 31) + this.delay) * 31) + this.done) * 31) + this.key.hashCode();
    }

    public String toString() {
        return "ResultConfig(date=" + this.date + ", run=" + this.run + ", dai=" + this.dai + ", dt=" + this.dt + ", time=" + this.time + ", delay=" + this.delay + ", done=" + this.done + ", key=" + this.key + ')';
    }

    public ResultConfig(String str, int i, List<String> list, List<String> list2, long j, int i2, int i3, String str2) {
        Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(list, "dai");
        Intrinsics.checkNotNullParameter(list2, "dt");
        Intrinsics.checkNotNullParameter(str2, "key");
        this.date = str;
        this.run = i;
        this.dai = list;
        this.dt = list2;
        this.time = j;
        this.delay = i2;
        this.done = i3;
        this.key = str2;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getRun() {
        return this.run;
    }

    public final List<String> getDai() {
        return this.dai;
    }

    public final List<String> getDt() {
        return this.dt;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDone() {
        return this.done;
    }

    public final String getKey() {
        return this.key;
    }
}
