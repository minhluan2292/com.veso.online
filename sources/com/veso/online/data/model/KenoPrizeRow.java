package com.veso.online.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/veso/online/data/model/KenoPrizeRow;", "Lcom/veso/online/data/model/KenoItem;", "numOfSame", "", "quantity", "prize", "", "(IILjava/lang/String;)V", "getNumOfSame", "()I", "getPrize", "()Ljava/lang/String;", "getQuantity", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoResult.kt */
public final class KenoPrizeRow implements KenoItem {
    private final int numOfSame;
    private final String prize;
    private final int quantity;

    public KenoPrizeRow(int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "prize");
        this.numOfSame = i;
        this.quantity = i2;
        this.prize = str;
    }

    public final int getNumOfSame() {
        return this.numOfSame;
    }

    public final String getPrize() {
        return this.prize;
    }

    public final int getQuantity() {
        return this.quantity;
    }
}
