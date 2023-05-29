package com.veso.online.features.main;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewManager;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda5 implements OnCompleteListener {
    public final /* synthetic */ ReviewManager f$0;
    public final /* synthetic */ MainActivity f$1;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda5(ReviewManager reviewManager, MainActivity mainActivity) {
        this.f$0 = reviewManager;
        this.f$1 = mainActivity;
    }

    public final void onComplete(Task task) {
        MainActivity.m539showReview$lambda14(this.f$0, this.f$1, task);
    }
}
