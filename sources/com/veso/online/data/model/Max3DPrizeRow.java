package com.veso.online.data.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJD\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/veso/online/data/model/Max3DPrizeRow;", "", "prizeText", "", "quantity", "prizeValue", "textSizeRes", "", "textColorRes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getPrizeText", "()Ljava/lang/String;", "getPrizeValue", "getQuantity", "getTextColorRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextSizeRes", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/veso/online/data/model/Max3DPrizeRow;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: VietlotResult.kt */
public final class Max3DPrizeRow {
    private final String prizeText;
    private final String prizeValue;
    private final String quantity;
    private final Integer textColorRes;
    private final Integer textSizeRes;

    public static /* synthetic */ Max3DPrizeRow copy$default(Max3DPrizeRow max3DPrizeRow, String str, String str2, String str3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = max3DPrizeRow.prizeText;
        }
        if ((i & 2) != 0) {
            str2 = max3DPrizeRow.quantity;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = max3DPrizeRow.prizeValue;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            num = max3DPrizeRow.textSizeRes;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = max3DPrizeRow.textColorRes;
        }
        return max3DPrizeRow.copy(str, str4, str5, num3, num2);
    }

    public final String component1() {
        return this.prizeText;
    }

    public final String component2() {
        return this.quantity;
    }

    public final String component3() {
        return this.prizeValue;
    }

    public final Integer component4() {
        return this.textSizeRes;
    }

    public final Integer component5() {
        return this.textColorRes;
    }

    public final Max3DPrizeRow copy(String str, String str2, String str3, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "prizeText");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.QUANTITY);
        Intrinsics.checkNotNullParameter(str3, "prizeValue");
        return new Max3DPrizeRow(str, str2, str3, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Max3DPrizeRow)) {
            return false;
        }
        Max3DPrizeRow max3DPrizeRow = (Max3DPrizeRow) obj;
        return Intrinsics.areEqual((Object) this.prizeText, (Object) max3DPrizeRow.prizeText) && Intrinsics.areEqual((Object) this.quantity, (Object) max3DPrizeRow.quantity) && Intrinsics.areEqual((Object) this.prizeValue, (Object) max3DPrizeRow.prizeValue) && Intrinsics.areEqual((Object) this.textSizeRes, (Object) max3DPrizeRow.textSizeRes) && Intrinsics.areEqual((Object) this.textColorRes, (Object) max3DPrizeRow.textColorRes);
    }

    public int hashCode() {
        int hashCode = ((((this.prizeText.hashCode() * 31) + this.quantity.hashCode()) * 31) + this.prizeValue.hashCode()) * 31;
        Integer num = this.textSizeRes;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textColorRes;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "Max3DPrizeRow(prizeText=" + this.prizeText + ", quantity=" + this.quantity + ", prizeValue=" + this.prizeValue + ", textSizeRes=" + this.textSizeRes + ", textColorRes=" + this.textColorRes + ')';
    }

    public Max3DPrizeRow(String str, String str2, String str3, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "prizeText");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.QUANTITY);
        Intrinsics.checkNotNullParameter(str3, "prizeValue");
        this.prizeText = str;
        this.quantity = str2;
        this.prizeValue = str3;
        this.textSizeRes = num;
        this.textColorRes = num2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Max3DPrizeRow(String str, String str2, String str3, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }

    public final String getPrizeText() {
        return this.prizeText;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getPrizeValue() {
        return this.prizeValue;
    }

    public final Integer getTextSizeRes() {
        return this.textSizeRes;
    }

    public final Integer getTextColorRes() {
        return this.textColorRes;
    }
}
