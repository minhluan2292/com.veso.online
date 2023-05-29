package com.veso.online.features.main;

import android.os.Bundle;
import com.veso.online.data.model.MenuAction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/veso/online/features/main/OnMenuItemSelected;", "", "onMenuSelected", "", "menuAction", "Lcom/veso/online/data/model/MenuAction;", "extraData", "Landroid/os/Bundle;", "fromLeftMenu", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: OnMenuItemSelected.kt */
public interface OnMenuItemSelected {
    void onMenuSelected(MenuAction menuAction, Bundle bundle, boolean z);

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* compiled from: OnMenuItemSelected.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void onMenuSelected$default(OnMenuItemSelected onMenuItemSelected, MenuAction menuAction, Bundle bundle, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bundle = new Bundle();
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                onMenuItemSelected.onMenuSelected(menuAction, bundle, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onMenuSelected");
        }
    }
}
