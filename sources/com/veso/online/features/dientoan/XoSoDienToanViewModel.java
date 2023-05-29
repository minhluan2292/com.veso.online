package com.veso.online.features.dientoan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.veso.online.data.model.LoadingState;
import com.veso.online.data.model.XoSoDienToanItem;
import com.veso.online.data.model.XoSoDienToanResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\fH\u0002J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/veso/online/features/dientoan/XoSoDienToanViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_loadingState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/veso/online/data/model/LoadingState;", "_results", "", "Lcom/veso/online/data/model/XoSoDienToanItem;", "date", "", "isLoading", "", "loadingState", "getLoadingState", "()Landroidx/lifecycle/MutableLiveData;", "pageIndex", "", "results", "Landroidx/lifecycle/LiveData;", "getResults", "()Landroidx/lifecycle/LiveData;", "xoSoDienToanResult", "Lcom/veso/online/data/model/XoSoDienToanResult;", "fetchMoreResult", "", "fetchResult", "loadData", "isLoadMore", "updateLoadingState", "state", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XoSoDienToanViewModel.kt */
public final class XoSoDienToanViewModel extends ViewModel {
    private final MutableLiveData<LoadingState> _loadingState;
    /* access modifiers changed from: private */
    public final MutableLiveData<List<XoSoDienToanItem>> _results;
    /* access modifiers changed from: private */
    public String date;
    /* access modifiers changed from: private */
    public boolean isLoading;
    private final MutableLiveData<LoadingState> loadingState;
    /* access modifiers changed from: private */
    public int pageIndex;
    private final LiveData<List<XoSoDienToanItem>> results;
    /* access modifiers changed from: private */
    public List<XoSoDienToanResult> xoSoDienToanResult = CollectionsKt.emptyList();

    public XoSoDienToanViewModel() {
        MutableLiveData<List<XoSoDienToanItem>> mutableLiveData = new MutableLiveData<>();
        this._results = mutableLiveData;
        this.results = mutableLiveData;
        MutableLiveData<LoadingState> mutableLiveData2 = new MutableLiveData<>();
        this._loadingState = mutableLiveData2;
        this.loadingState = mutableLiveData2;
    }

    public final LiveData<List<XoSoDienToanItem>> getResults() {
        return this.results;
    }

    public final MutableLiveData<LoadingState> getLoadingState() {
        return this.loadingState;
    }

    public static /* synthetic */ void fetchResult$default(XoSoDienToanViewModel xoSoDienToanViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        xoSoDienToanViewModel.fetchResult(str);
    }

    public final void fetchResult(String str) {
        this.date = str;
        this.pageIndex = 1;
        loadData(false);
    }

    public final void fetchMoreResult() {
        loadData(true);
    }

    private final void loadData(boolean z) {
        if (!z || !this.isLoading) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new XoSoDienToanViewModel$loadData$1(this, z, (Continuation<? super XoSoDienToanViewModel$loadData$1>) null), 3, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void updateLoadingState(boolean z, LoadingState loadingState2) {
        if (!z) {
            this._loadingState.postValue(loadingState2);
        }
    }
}
