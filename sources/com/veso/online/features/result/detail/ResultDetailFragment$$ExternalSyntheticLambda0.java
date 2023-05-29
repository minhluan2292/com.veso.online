package com.veso.online.features.result.detail;

import androidx.lifecycle.Observer;
import com.veso.online.data.model.LoadingState;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ResultDetailFragment$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ ResultDetailFragment f$0;

    public /* synthetic */ ResultDetailFragment$$ExternalSyntheticLambda0(ResultDetailFragment resultDetailFragment) {
        this.f$0 = resultDetailFragment;
    }

    public final void onChanged(Object obj) {
        ResultDetailFragment.m578observeData$lambda2(this.f$0, (LoadingState) obj);
    }
}
