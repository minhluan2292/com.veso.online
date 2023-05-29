package com.veso.online.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/veso/online/data/model/XoSoDienToan;", "", "result0", "", "result1", "result2", "result3", "result4", "result5", "result6", "result7", "result8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResult0", "()Ljava/lang/String;", "getResult1", "getResult2", "getResult3", "getResult4", "getResult5", "getResult6", "getResult7", "getResult8", "results", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XoSoDienToanResult.kt */
public final class XoSoDienToan {
    @SerializedName("0")
    private final String result0;
    @SerializedName("1")
    private final String result1;
    @SerializedName("2")
    private final String result2;
    @SerializedName("3")
    private final String result3;
    @SerializedName("4")
    private final String result4;
    @SerializedName("5")
    private final String result5;
    @SerializedName("6")
    private final String result6;
    @SerializedName("7")
    private final String result7;
    @SerializedName("8")
    private final String result8;

    public XoSoDienToan(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.result0 = str;
        this.result1 = str2;
        this.result2 = str3;
        this.result3 = str4;
        this.result4 = str5;
        this.result5 = str6;
        this.result6 = str7;
        this.result7 = str8;
        this.result8 = str9;
    }

    public final String getResult0() {
        return this.result0;
    }

    public final String getResult1() {
        return this.result1;
    }

    public final String getResult2() {
        return this.result2;
    }

    public final String getResult3() {
        return this.result3;
    }

    public final String getResult4() {
        return this.result4;
    }

    public final String getResult5() {
        return this.result5;
    }

    public final String getResult6() {
        return this.result6;
    }

    public final String getResult7() {
        return this.result7;
    }

    public final String getResult8() {
        return this.result8;
    }

    public final List<String> results() {
        String[] strArr = {this.result0, this.result1, this.result2, this.result3, this.result4, this.result5, this.result6, this.result7, this.result8};
        Collection arrayList = new ArrayList();
        for (String str : CollectionsKt.listOf(strArr)) {
            CharSequence charSequence = str;
            if (charSequence == null || StringsKt.isBlank(charSequence)) {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return (List) arrayList;
    }
}
