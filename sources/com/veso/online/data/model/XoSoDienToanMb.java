package com.veso.online.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/veso/online/data/model/XoSoDienToanMb;", "", "thanTai", "Lcom/veso/online/data/model/XoSoDienToan;", "dienToan636", "dienToan123", "(Lcom/veso/online/data/model/XoSoDienToan;Lcom/veso/online/data/model/XoSoDienToan;Lcom/veso/online/data/model/XoSoDienToan;)V", "getDienToan123", "()Lcom/veso/online/data/model/XoSoDienToan;", "getDienToan636", "getThanTai", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XoSoDienToanResult.kt */
public final class XoSoDienToanMb {
    @SerializedName("113")
    private final XoSoDienToan dienToan123;
    @SerializedName("112")
    private final XoSoDienToan dienToan636;
    @SerializedName("111")
    private final XoSoDienToan thanTai;

    public XoSoDienToanMb(XoSoDienToan xoSoDienToan, XoSoDienToan xoSoDienToan2, XoSoDienToan xoSoDienToan3) {
        this.thanTai = xoSoDienToan;
        this.dienToan636 = xoSoDienToan2;
        this.dienToan123 = xoSoDienToan3;
    }

    public final XoSoDienToan getThanTai() {
        return this.thanTai;
    }

    public final XoSoDienToan getDienToan636() {
        return this.dienToan636;
    }

    public final XoSoDienToan getDienToan123() {
        return this.dienToan123;
    }
}
