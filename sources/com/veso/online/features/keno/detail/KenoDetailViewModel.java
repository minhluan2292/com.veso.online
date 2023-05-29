package com.veso.online.features.keno.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.JsonObject;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.veso.online.data.model.KenoItem;
import com.veso.online.data.model.KenoResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/veso/online/features/keno/detail/KenoDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_kenoItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/veso/online/data/model/KenoItem;", "kenoItems", "Landroidx/lifecycle/LiveData;", "getKenoItems", "()Landroidx/lifecycle/LiveData;", "prizeSchema", "Lcom/google/gson/JsonObject;", "getPrizeSchema", "()Lcom/google/gson/JsonObject;", "setPrizeSchema", "(Lcom/google/gson/JsonObject;)V", "buildItems", "", "data", "Lcom/veso/online/data/model/KenoResult;", "fetchDetail", "result", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoDetailViewModel.kt */
public final class KenoDetailViewModel extends ViewModel {
    /* access modifiers changed from: private */
    public final MutableLiveData<List<KenoItem>> _kenoItems;
    private final LiveData<List<KenoItem>> kenoItems;
    public JsonObject prizeSchema;

    public KenoDetailViewModel() {
        MutableLiveData<List<KenoItem>> mutableLiveData = new MutableLiveData<>();
        this._kenoItems = mutableLiveData;
        this.kenoItems = mutableLiveData;
    }

    public final LiveData<List<KenoItem>> getKenoItems() {
        return this.kenoItems;
    }

    public final JsonObject getPrizeSchema() {
        JsonObject jsonObject = this.prizeSchema;
        if (jsonObject != null) {
            return jsonObject;
        }
        Intrinsics.throwUninitializedPropertyAccessException("prizeSchema");
        return null;
    }

    public final void setPrizeSchema(JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.prizeSchema = jsonObject;
    }

    public final void fetchDetail(KenoResult kenoResult) {
        Intrinsics.checkNotNullParameter(kenoResult, IronSourceConstants.EVENTS_RESULT);
        buildItems(kenoResult);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new KenoDetailViewModel$fetchDetail$1(kenoResult, this, (Continuation<? super KenoDetailViewModel$fetchDetail$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void buildItems(KenoResult kenoResult) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new KenoDetailViewModel$buildItems$1(kenoResult, this, (Continuation<? super KenoDetailViewModel$buildItems$1>) null), 2, (Object) null);
    }
}
