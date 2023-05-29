package com.veso.online.data.model;

import com.google.gson.annotations.SerializedName;
import com.veso.online.features.result.SlidableFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/veso/online/data/model/XoSoDienToanResult;", "Lcom/veso/online/data/model/XoSoDienToanItem;", "date", "", "dienToanMb", "Lcom/veso/online/data/model/XoSoDienToanMb;", "(Ljava/lang/String;Lcom/veso/online/data/model/XoSoDienToanMb;)V", "getDate", "()Ljava/lang/String;", "getDienToanMb", "()Lcom/veso/online/data/model/XoSoDienToanMb;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XoSoDienToanResult.kt */
public final class XoSoDienToanResult implements XoSoDienToanItem {
    @SerializedName("date")
    private final String date;
    @SerializedName("kq")
    private final XoSoDienToanMb dienToanMb;

    public XoSoDienToanResult(String str, XoSoDienToanMb xoSoDienToanMb) {
        Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(xoSoDienToanMb, "dienToanMb");
        this.date = str;
        this.dienToanMb = xoSoDienToanMb;
    }

    public final String getDate() {
        return this.date;
    }

    public final XoSoDienToanMb getDienToanMb() {
        return this.dienToanMb;
    }
}
