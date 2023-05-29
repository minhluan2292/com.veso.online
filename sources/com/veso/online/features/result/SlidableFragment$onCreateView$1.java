package com.veso.online.features.result;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import com.veso.online.features.main.ReadResultDelegate;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/veso/online/features/result/SlidableFragment$onCreateView$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", "position", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: SlidableFragment.kt */
public final class SlidableFragment$onCreateView$1 extends ViewPager2.OnPageChangeCallback {
    final /* synthetic */ SlidableFragment this$0;

    SlidableFragment$onCreateView$1(SlidableFragment slidableFragment) {
        this.this$0 = slidableFragment;
    }

    public void onPageSelected(int i) {
        this.this$0.showDate(i);
        this.this$0.updateButtonStatus();
        Context context = this.this$0.getContext();
        ReadResultDelegate readResultDelegate = context instanceof ReadResultDelegate ? (ReadResultDelegate) context : null;
        if (readResultDelegate != null) {
            readResultDelegate.stopReading();
        }
    }
}
