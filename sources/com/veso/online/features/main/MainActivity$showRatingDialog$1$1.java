package com.veso.online.features.main;

import com.veso.online.features.rate.RatingDialogFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/veso/online/features/main/MainActivity$showRatingDialog$1$1", "Lcom/veso/online/features/rate/RatingDialogFragment$OnClickListener;", "onCancel", "", "onFeedback", "onRating", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity$showRatingDialog$1$1 implements RatingDialogFragment.OnClickListener {
    final /* synthetic */ MainActivity this$0;

    public void onCancel() {
    }

    public void onFeedback() {
    }

    MainActivity$showRatingDialog$1$1(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    public void onRating() {
        this.this$0.showReview();
    }
}
