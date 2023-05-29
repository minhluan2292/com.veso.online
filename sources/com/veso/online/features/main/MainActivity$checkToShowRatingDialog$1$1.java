package com.veso.online.features.main;

import com.veso.online.features.rate.IntroDialogFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/veso/online/features/main/MainActivity$checkToShowRatingDialog$1$1", "Lcom/veso/online/features/rate/IntroDialogFragment$OnClickListener;", "onOK", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity$checkToShowRatingDialog$1$1 implements IntroDialogFragment.OnClickListener {
    final /* synthetic */ MainActivity this$0;

    MainActivity$checkToShowRatingDialog$1$1(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    public void onOK() {
        this.this$0.showRatingDialog();
    }
}
