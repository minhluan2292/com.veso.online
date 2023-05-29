package com.veso.online.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/veso/online/data/model/Menu;", "", "iconRes", "", "titleRes", "action", "Lcom/veso/online/data/model/MenuAction;", "(IILcom/veso/online/data/model/MenuAction;)V", "getAction", "()Lcom/veso/online/data/model/MenuAction;", "getIconRes", "()I", "getTitleRes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: Menu.kt */
public final class Menu {
    private final MenuAction action;
    private final int iconRes;
    private final int titleRes;

    public static /* synthetic */ Menu copy$default(Menu menu, int i, int i2, MenuAction menuAction, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = menu.iconRes;
        }
        if ((i3 & 2) != 0) {
            i2 = menu.titleRes;
        }
        if ((i3 & 4) != 0) {
            menuAction = menu.action;
        }
        return menu.copy(i, i2, menuAction);
    }

    public final int component1() {
        return this.iconRes;
    }

    public final int component2() {
        return this.titleRes;
    }

    public final MenuAction component3() {
        return this.action;
    }

    public final Menu copy(int i, int i2, MenuAction menuAction) {
        return new Menu(i, i2, menuAction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Menu)) {
            return false;
        }
        Menu menu = (Menu) obj;
        return this.iconRes == menu.iconRes && this.titleRes == menu.titleRes && this.action == menu.action;
    }

    public int hashCode() {
        int i = ((this.iconRes * 31) + this.titleRes) * 31;
        MenuAction menuAction = this.action;
        return i + (menuAction == null ? 0 : menuAction.hashCode());
    }

    public String toString() {
        return "Menu(iconRes=" + this.iconRes + ", titleRes=" + this.titleRes + ", action=" + this.action + ')';
    }

    public Menu(int i, int i2, MenuAction menuAction) {
        this.iconRes = i;
        this.titleRes = i2;
        this.action = menuAction;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Menu(int i, int i2, MenuAction menuAction, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : menuAction);
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final MenuAction getAction() {
        return this.action;
    }
}
