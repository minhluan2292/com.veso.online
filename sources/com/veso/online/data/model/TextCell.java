package com.veso.online.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\nHÆ\u0003JH\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013¨\u0006!"}, d2 = {"Lcom/veso/online/data/model/TextCell;", "", "textRes", "", "text", "", "textSizeRes", "colWeight", "", "isBold", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Z)V", "getColWeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "()Z", "getText", "()Ljava/lang/String;", "getTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextSizeRes", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Z)Lcom/veso/online/data/model/TextCell;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: TextCell.kt */
public final class TextCell {
    private final Float colWeight;
    private final boolean isBold;
    private final String text;
    private final Integer textRes;
    private final Integer textSizeRes;

    public TextCell() {
        this((Integer) null, (String) null, (Integer) null, (Float) null, false, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TextCell copy$default(TextCell textCell, Integer num, String str, Integer num2, Float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = textCell.textRes;
        }
        if ((i & 2) != 0) {
            str = textCell.text;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            num2 = textCell.textSizeRes;
        }
        Integer num3 = num2;
        if ((i & 8) != 0) {
            f = textCell.colWeight;
        }
        Float f2 = f;
        if ((i & 16) != 0) {
            z = textCell.isBold;
        }
        return textCell.copy(num, str2, num3, f2, z);
    }

    public final Integer component1() {
        return this.textRes;
    }

    public final String component2() {
        return this.text;
    }

    public final Integer component3() {
        return this.textSizeRes;
    }

    public final Float component4() {
        return this.colWeight;
    }

    public final boolean component5() {
        return this.isBold;
    }

    public final TextCell copy(Integer num, String str, Integer num2, Float f, boolean z) {
        return new TextCell(num, str, num2, f, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextCell)) {
            return false;
        }
        TextCell textCell = (TextCell) obj;
        return Intrinsics.areEqual((Object) this.textRes, (Object) textCell.textRes) && Intrinsics.areEqual((Object) this.text, (Object) textCell.text) && Intrinsics.areEqual((Object) this.textSizeRes, (Object) textCell.textSizeRes) && Intrinsics.areEqual((Object) this.colWeight, (Object) textCell.colWeight) && this.isBold == textCell.isBold;
    }

    public int hashCode() {
        Integer num = this.textRes;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.textSizeRes;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.colWeight;
        if (f != null) {
            i = f.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.isBold;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        return "TextCell(textRes=" + this.textRes + ", text=" + this.text + ", textSizeRes=" + this.textSizeRes + ", colWeight=" + this.colWeight + ", isBold=" + this.isBold + ')';
    }

    public TextCell(Integer num, String str, Integer num2, Float f, boolean z) {
        this.textRes = num;
        this.text = str;
        this.textSizeRes = num2;
        this.colWeight = f;
        this.isBold = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextCell(java.lang.Integer r4, java.lang.String r5, java.lang.Integer r6, java.lang.Float r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L_0x0007
            r10 = r0
            goto L_0x0008
        L_0x0007:
            r10 = r4
        L_0x0008:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r5
        L_0x000f:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r7
        L_0x001c:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0021
            r8 = 0
        L_0x0021:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.data.model.TextCell.<init>(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Float, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Integer getTextRes() {
        return this.textRes;
    }

    public final String getText() {
        return this.text;
    }

    public final Integer getTextSizeRes() {
        return this.textSizeRes;
    }

    public final Float getColWeight() {
        return this.colWeight;
    }

    public final boolean isBold() {
        return this.isBold;
    }
}
