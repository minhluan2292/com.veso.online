package com.veso.online.data.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006("}, d2 = {"Lcom/veso/online/data/model/PrizeRowData;", "Lcom/veso/online/data/model/RowData;", "prizeName", "", "results", "", "displayType", "Lcom/veso/online/data/model/PrizeDisplayType;", "prize", "", "ticketType", "textStyle", "Lcom/veso/online/data/model/TextStyle;", "(Ljava/lang/String;Ljava/util/List;Lcom/veso/online/data/model/PrizeDisplayType;ILjava/util/List;Lcom/veso/online/data/model/TextStyle;)V", "getDisplayType", "()Lcom/veso/online/data/model/PrizeDisplayType;", "getPrize", "()I", "getPrizeName", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "getTextStyle", "()Lcom/veso/online/data/model/TextStyle;", "getTicketType", "type", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: PrizeRowData.kt */
public final class PrizeRowData implements RowData {
    private final PrizeDisplayType displayType;
    private final int prize;
    private final String prizeName;
    private final List<List<String>> results;
    private final TextStyle textStyle;
    private final List<String> ticketType;
    private final int type = 2;

    public static /* synthetic */ PrizeRowData copy$default(PrizeRowData prizeRowData, String str, List<List<String>> list, PrizeDisplayType prizeDisplayType, int i, List<String> list2, TextStyle textStyle2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = prizeRowData.prizeName;
        }
        if ((i2 & 2) != 0) {
            list = prizeRowData.results;
        }
        List<List<String>> list3 = list;
        if ((i2 & 4) != 0) {
            prizeDisplayType = prizeRowData.displayType;
        }
        PrizeDisplayType prizeDisplayType2 = prizeDisplayType;
        if ((i2 & 8) != 0) {
            i = prizeRowData.prize;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            list2 = prizeRowData.ticketType;
        }
        List<String> list4 = list2;
        if ((i2 & 32) != 0) {
            textStyle2 = prizeRowData.textStyle;
        }
        return prizeRowData.copy(str, list3, prizeDisplayType2, i3, list4, textStyle2);
    }

    public final String component1() {
        return this.prizeName;
    }

    public final List<List<String>> component2() {
        return this.results;
    }

    public final PrizeDisplayType component3() {
        return this.displayType;
    }

    public final int component4() {
        return this.prize;
    }

    public final List<String> component5() {
        return this.ticketType;
    }

    public final TextStyle component6() {
        return this.textStyle;
    }

    public final PrizeRowData copy(String str, List<? extends List<String>> list, PrizeDisplayType prizeDisplayType, int i, List<String> list2, TextStyle textStyle2) {
        Intrinsics.checkNotNullParameter(str, "prizeName");
        Intrinsics.checkNotNullParameter(list, "results");
        Intrinsics.checkNotNullParameter(prizeDisplayType, "displayType");
        Intrinsics.checkNotNullParameter(list2, "ticketType");
        return new PrizeRowData(str, list, prizeDisplayType, i, list2, textStyle2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrizeRowData)) {
            return false;
        }
        PrizeRowData prizeRowData = (PrizeRowData) obj;
        return Intrinsics.areEqual((Object) this.prizeName, (Object) prizeRowData.prizeName) && Intrinsics.areEqual((Object) this.results, (Object) prizeRowData.results) && this.displayType == prizeRowData.displayType && this.prize == prizeRowData.prize && Intrinsics.areEqual((Object) this.ticketType, (Object) prizeRowData.ticketType) && Intrinsics.areEqual((Object) this.textStyle, (Object) prizeRowData.textStyle);
    }

    public int hashCode() {
        int hashCode = ((((((((this.prizeName.hashCode() * 31) + this.results.hashCode()) * 31) + this.displayType.hashCode()) * 31) + this.prize) * 31) + this.ticketType.hashCode()) * 31;
        TextStyle textStyle2 = this.textStyle;
        return hashCode + (textStyle2 == null ? 0 : textStyle2.hashCode());
    }

    public String toString() {
        return "PrizeRowData(prizeName=" + this.prizeName + ", results=" + this.results + ", displayType=" + this.displayType + ", prize=" + this.prize + ", ticketType=" + this.ticketType + ", textStyle=" + this.textStyle + ')';
    }

    public PrizeRowData(String str, List<? extends List<String>> list, PrizeDisplayType prizeDisplayType, int i, List<String> list2, TextStyle textStyle2) {
        Intrinsics.checkNotNullParameter(str, "prizeName");
        Intrinsics.checkNotNullParameter(list, "results");
        Intrinsics.checkNotNullParameter(prizeDisplayType, "displayType");
        Intrinsics.checkNotNullParameter(list2, "ticketType");
        this.prizeName = str;
        this.results = list;
        this.displayType = prizeDisplayType;
        this.prize = i;
        this.ticketType = list2;
        this.textStyle = textStyle2;
    }

    public final String getPrizeName() {
        return this.prizeName;
    }

    public final List<List<String>> getResults() {
        return this.results;
    }

    public final PrizeDisplayType getDisplayType() {
        return this.displayType;
    }

    public final int getPrize() {
        return this.prize;
    }

    public final List<String> getTicketType() {
        return this.ticketType;
    }

    public final TextStyle getTextStyle() {
        return this.textStyle;
    }

    public int getType() {
        return this.type;
    }
}
