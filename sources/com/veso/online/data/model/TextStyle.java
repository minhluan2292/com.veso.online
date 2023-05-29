package com.veso.online.data.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/veso/online/data/model/TextStyle;", "", "size", "", "color", "(II)V", "getColor", "()I", "getSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: PrizeRowData.kt */
public final class TextStyle {
    private final int color;
    private final int size;

    public static /* synthetic */ TextStyle copy$default(TextStyle textStyle, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = textStyle.size;
        }
        if ((i3 & 2) != 0) {
            i2 = textStyle.color;
        }
        return textStyle.copy(i, i2);
    }

    public final int component1() {
        return this.size;
    }

    public final int component2() {
        return this.color;
    }

    public final TextStyle copy(int i, int i2) {
        return new TextStyle(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return this.size == textStyle.size && this.color == textStyle.color;
    }

    public int hashCode() {
        return (this.size * 31) + this.color;
    }

    public String toString() {
        return "TextStyle(size=" + this.size + ", color=" + this.color + ')';
    }

    public TextStyle(int i, int i2) {
        this.size = i;
        this.color = i2;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getColor() {
        return this.color;
    }
}
