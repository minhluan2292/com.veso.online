package com.veso.online.features.mega.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.veso.online.data.model.VietlotResultItem;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/veso/online/features/mega/detail/JackpotDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_result", "Landroidx/lifecycle/MutableLiveData;", "Lcom/veso/online/data/model/VietlotResultItem;", "result", "Landroidx/lifecycle/LiveData;", "getResult", "()Landroidx/lifecycle/LiveData;", "fetchJackpotDetail", "", "id", "", "originResult", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: JackpotDetailViewModel.kt */
public final class JackpotDetailViewModel extends ViewModel {
    /* access modifiers changed from: private */
    public final MutableLiveData<VietlotResultItem> _result;
    private final LiveData<VietlotResultItem> result;

    public JackpotDetailViewModel() {
        MutableLiveData<VietlotResultItem> mutableLiveData = new MutableLiveData<>();
        this._result = mutableLiveData;
        this.result = mutableLiveData;
    }

    public final LiveData<VietlotResultItem> getResult() {
        return this.result;
    }

    public final void fetchJackpotDetail(String str, VietlotResultItem vietlotResultItem) {
        Intrinsics.checkNotNullParameter(str, FacebookMediationAdapter.KEY_ID);
        Intrinsics.checkNotNullParameter(vietlotResultItem, "originResult");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new JackpotDetailViewModel$fetchJackpotDetail$1(this, vietlotResultItem, str, (Continuation<? super JackpotDetailViewModel$fetchJackpotDetail$1>) null), 3, (Object) null);
    }
}
