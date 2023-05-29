package com.veso.online.features.max;

import androidx.lifecycle.Observer;
import com.veso.online.data.model.VietlotResultItem;
import com.veso.online.data.model.VietlotType;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Max3DDetailActivity$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ Max3DDetailActivity f$0;
    public final /* synthetic */ VietlotType f$1;

    public /* synthetic */ Max3DDetailActivity$$ExternalSyntheticLambda0(Max3DDetailActivity max3DDetailActivity, VietlotType vietlotType) {
        this.f$0 = max3DDetailActivity;
        this.f$1 = vietlotType;
    }

    public final void onChanged(Object obj) {
        Max3DDetailActivity.m546onCreate$lambda3(this.f$0, this.f$1, (VietlotResultItem) obj);
    }
}
