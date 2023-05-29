package com.veso.online.features.main;

import android.view.View;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.veso.online.databinding.ActivityMainBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/veso/online/features/main/MainActivity$drawerListener$2$1", "invoke", "()Lcom/veso/online/features/main/MainActivity$drawerListener$2$1;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: MainActivity.kt */
final class MainActivity$drawerListener$2 extends Lambda implements Function0<AnonymousClass1> {
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MainActivity$drawerListener$2(MainActivity mainActivity) {
        super(0);
        this.this$0 = mainActivity;
    }

    public final AnonymousClass1 invoke() {
        final MainActivity mainActivity = this.this$0;
        return new DrawerLayout.SimpleDrawerListener() {
            public void onDrawerSlide(View view, float f) {
                Intrinsics.checkNotNullParameter(view, "drawerView");
                ActivityMainBinding access$getBinding$p = mainActivity.binding;
                ActivityMainBinding activityMainBinding = null;
                if (access$getBinding$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    access$getBinding$p = null;
                }
                LinearLayout linearLayout = access$getBinding$p.llContent;
                ActivityMainBinding access$getBinding$p2 = mainActivity.binding;
                if (access$getBinding$p2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityMainBinding = access$getBinding$p2;
                }
                linearLayout.setTranslationX(((float) activityMainBinding.fragmentLeftMenu.getWidth()) * f);
            }
        };
    }
}
