package com.veso.online.features.keno.list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.veso.online.data.model.KenoItem;
import com.veso.online.data.model.KenoResult;
import com.veso.online.data.model.LoadingState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\fH\u0002J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\bH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/veso/online/features/keno/list/KenoResultListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_kenoResults", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/veso/online/data/model/KenoItem;", "_loadingState", "Lcom/veso/online/data/model/LoadingState;", "date", "", "isLoading", "", "kenoResultItems", "Lcom/veso/online/data/model/KenoResult;", "kenoResults", "Landroidx/lifecycle/LiveData;", "getKenoResults", "()Landroidx/lifecycle/LiveData;", "loadingState", "getLoadingState", "()Landroidx/lifecycle/MutableLiveData;", "fetchKenoResult", "", "fetchMoreData", "loadData", "isLoadMore", "updateLoadingState", "state", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoResultListViewModel.kt */
public final class KenoResultListViewModel extends ViewModel {
    /* access modifiers changed from: private */
    public final MutableLiveData<List<KenoItem>> _kenoResults;
    private final MutableLiveData<LoadingState> _loadingState;
    /* access modifiers changed from: private */
    public String date;
    /* access modifiers changed from: private */
    public boolean isLoading;
    /* access modifiers changed from: private */
    public List<KenoResult> kenoResultItems = CollectionsKt.emptyList();
    private final LiveData<List<KenoItem>> kenoResults;
    private final MutableLiveData<LoadingState> loadingState;

    public KenoResultListViewModel() {
        MutableLiveData<List<KenoItem>> mutableLiveData = new MutableLiveData<>();
        this._kenoResults = mutableLiveData;
        this.kenoResults = mutableLiveData;
        MutableLiveData<LoadingState> mutableLiveData2 = new MutableLiveData<>();
        this._loadingState = mutableLiveData2;
        this.loadingState = mutableLiveData2;
    }

    public final LiveData<List<KenoItem>> getKenoResults() {
        return this.kenoResults;
    }

    public final MutableLiveData<LoadingState> getLoadingState() {
        return this.loadingState;
    }

    public static /* synthetic */ void fetchKenoResult$default(KenoResultListViewModel kenoResultListViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        kenoResultListViewModel.fetchKenoResult(str);
    }

    public final void fetchKenoResult(String str) {
        this.date = str;
        loadData(false);
    }

    public final void fetchMoreData() {
        loadData(true);
    }

    private final void loadData(boolean z) {
        if (!z || !this.isLoading) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new KenoResultListViewModel$loadData$1(this, z, (Continuation<? super KenoResultListViewModel$loadData$1>) null), 3, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void updateLoadingState(boolean z, LoadingState loadingState2) {
        if (!z) {
            this._loadingState.postValue(loadingState2);
        }
    }
}
