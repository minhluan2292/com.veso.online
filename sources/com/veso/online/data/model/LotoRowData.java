package com.veso.online.data.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ6\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/veso/online/data/model/LotoRowData;", "Lcom/veso/online/data/model/RowData;", "results", "", "", "title", "titleRes", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "getResults", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getTitleRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "type", "getType", "()I", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/veso/online/data/model/LotoRowData;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: PrizeRowData.kt */
public final class LotoRowData implements RowData {
    private final List<String> results;
    private final String title;
    private final Integer titleRes;
    private final int type;

    public static /* synthetic */ LotoRowData copy$default(LotoRowData lotoRowData, List<String> list, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lotoRowData.results;
        }
        if ((i & 2) != 0) {
            str = lotoRowData.title;
        }
        if ((i & 4) != 0) {
            num = lotoRowData.titleRes;
        }
        return lotoRowData.copy(list, str, num);
    }

    public final List<String> component1() {
        return this.results;
    }

    public final String component2() {
        return this.title;
    }

    public final Integer component3() {
        return this.titleRes;
    }

    public final LotoRowData copy(List<String> list, String str, Integer num) {
        Intrinsics.checkNotNullParameter(list, "results");
        return new LotoRowData(list, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LotoRowData)) {
            return false;
        }
        LotoRowData lotoRowData = (LotoRowData) obj;
        return Intrinsics.areEqual((Object) this.results, (Object) lotoRowData.results) && Intrinsics.areEqual((Object) this.title, (Object) lotoRowData.title) && Intrinsics.areEqual((Object) this.titleRes, (Object) lotoRowData.titleRes);
    }

    public int hashCode() {
        int hashCode = this.results.hashCode() * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.titleRes;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "LotoRowData(results=" + this.results + ", title=" + this.title + ", titleRes=" + this.titleRes + ')';
    }

    public LotoRowData(List<String> list, String str, Integer num) {
        Intrinsics.checkNotNullParameter(list, "results");
        this.results = list;
        this.title = str;
        this.titleRes = num;
        this.type = 5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LotoRowData(List list, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }

    public final List<String> getResults() {
        return this.results;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTitleRes() {
        return this.titleRes;
    }

    public int getType() {
        return this.type;
    }
}
