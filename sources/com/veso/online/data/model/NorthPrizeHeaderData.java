package com.veso.online.data.model;

import com.veso.online.features.result.SlidableFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ4\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0012HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/veso/online/data/model/NorthPrizeHeaderData;", "Lcom/veso/online/data/model/RowData;", "date", "", "configs", "", "Lcom/veso/online/data/model/TicketInfo;", "time", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", "getConfigs", "()Ljava/util/List;", "getDate", "()Ljava/lang/String;", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "type", "", "getType", "()I", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lcom/veso/online/data/model/NorthPrizeHeaderData;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: PrizeRowData.kt */
public final class NorthPrizeHeaderData implements RowData {
    private final List<TicketInfo> configs;
    private final String date;
    private final Long time;
    private final int type = 1;

    public static /* synthetic */ NorthPrizeHeaderData copy$default(NorthPrizeHeaderData northPrizeHeaderData, String str, List<TicketInfo> list, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = northPrizeHeaderData.date;
        }
        if ((i & 2) != 0) {
            list = northPrizeHeaderData.configs;
        }
        if ((i & 4) != 0) {
            l = northPrizeHeaderData.time;
        }
        return northPrizeHeaderData.copy(str, list, l);
    }

    public final String component1() {
        return this.date;
    }

    public final List<TicketInfo> component2() {
        return this.configs;
    }

    public final Long component3() {
        return this.time;
    }

    public final NorthPrizeHeaderData copy(String str, List<TicketInfo> list, Long l) {
        Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(list, "configs");
        return new NorthPrizeHeaderData(str, list, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NorthPrizeHeaderData)) {
            return false;
        }
        NorthPrizeHeaderData northPrizeHeaderData = (NorthPrizeHeaderData) obj;
        return Intrinsics.areEqual((Object) this.date, (Object) northPrizeHeaderData.date) && Intrinsics.areEqual((Object) this.configs, (Object) northPrizeHeaderData.configs) && Intrinsics.areEqual((Object) this.time, (Object) northPrizeHeaderData.time);
    }

    public int hashCode() {
        int hashCode = ((this.date.hashCode() * 31) + this.configs.hashCode()) * 31;
        Long l = this.time;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "NorthPrizeHeaderData(date=" + this.date + ", configs=" + this.configs + ", time=" + this.time + ')';
    }

    public NorthPrizeHeaderData(String str, List<TicketInfo> list, Long l) {
        Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(list, "configs");
        this.date = str;
        this.configs = list;
        this.time = l;
    }

    public final String getDate() {
        return this.date;
    }

    public final List<TicketInfo> getConfigs() {
        return this.configs;
    }

    public final Long getTime() {
        return this.time;
    }

    public int getType() {
        return this.type;
    }
}
