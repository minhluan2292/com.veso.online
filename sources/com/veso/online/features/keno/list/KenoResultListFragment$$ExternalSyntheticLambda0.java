package com.veso.online.features.keno.list;

import androidx.lifecycle.Observer;
import com.veso.online.data.model.LoadingState;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class KenoResultListFragment$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ KenoResultListFragment f$0;

    public /* synthetic */ KenoResultListFragment$$ExternalSyntheticLambda0(KenoResultListFragment kenoResultListFragment) {
        this.f$0 = kenoResultListFragment;
    }

    public final void onChanged(Object obj) {
        KenoResultListFragment.m525observeData$lambda1(this.f$0, (LoadingState) obj);
    }
}
