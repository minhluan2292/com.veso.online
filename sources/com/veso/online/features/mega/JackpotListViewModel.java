package com.veso.online.features.mega;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.veso.online.data.model.JackpotInfo;
import com.veso.online.data.model.LoadingState;
import com.veso.online.data.model.VietLotHeaderItem;
import com.veso.online.data.model.VietLotItem;
import com.veso.online.data.model.VietLotLoadingItem;
import com.veso.online.data.model.VietlotResultItem;
import com.veso.online.data.model.VietlotType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010#\u001a\u00020!J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\fH\u0002J\u0018\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020\f2\u0006\u0010'\u001a\u00020(H\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/veso/online/features/mega/JackpotListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_jackpotInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/veso/online/data/model/JackpotInfo;", "_vietlotResults", "", "Lcom/veso/online/data/model/VietLotItem;", "date", "", "isLoading", "", "jackpotInfo", "Landroidx/lifecycle/LiveData;", "getJackpotInfo", "()Landroidx/lifecycle/LiveData;", "pageIndex", "", "shouldHasHeaderItem", "getShouldHasHeaderItem", "()Z", "vietLotResultItems", "Lcom/veso/online/data/model/VietlotResultItem;", "getVietLotResultItems", "()Ljava/util/List;", "setVietLotResultItems", "(Ljava/util/List;)V", "vietlotResults", "getVietlotResults", "vietlotType", "Lcom/veso/online/data/model/VietlotType;", "fetchData", "", "type", "fetchMoreData", "loadData", "isLoadMore", "updateLoadingState", "state", "Lcom/veso/online/data/model/LoadingState;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: JackpotListViewModel.kt */
public final class JackpotListViewModel extends ViewModel {
    /* access modifiers changed from: private */
    public final MutableLiveData<JackpotInfo> _jackpotInfo;
    /* access modifiers changed from: private */
    public final MutableLiveData<List<VietLotItem>> _vietlotResults;
    /* access modifiers changed from: private */
    public String date;
    /* access modifiers changed from: private */
    public boolean isLoading;
    private final LiveData<JackpotInfo> jackpotInfo;
    /* access modifiers changed from: private */
    public int pageIndex;
    private List<VietlotResultItem> vietLotResultItems = CollectionsKt.emptyList();
    private final LiveData<List<VietLotItem>> vietlotResults;
    /* access modifiers changed from: private */
    public VietlotType vietlotType;

    public JackpotListViewModel() {
        MutableLiveData<List<VietLotItem>> mutableLiveData = new MutableLiveData<>();
        this._vietlotResults = mutableLiveData;
        this.vietlotResults = mutableLiveData;
        MutableLiveData<JackpotInfo> mutableLiveData2 = new MutableLiveData<>();
        this._jackpotInfo = mutableLiveData2;
        this.jackpotInfo = mutableLiveData2;
        this.vietlotType = VietlotType.MEGA;
        this.isLoading = true;
    }

    public final List<VietlotResultItem> getVietLotResultItems() {
        return this.vietLotResultItems;
    }

    public final void setVietLotResultItems(List<VietlotResultItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.vietLotResultItems = list;
    }

    public final LiveData<List<VietLotItem>> getVietlotResults() {
        return this.vietlotResults;
    }

    public final LiveData<JackpotInfo> getJackpotInfo() {
        return this.jackpotInfo;
    }

    public static /* synthetic */ void fetchData$default(JackpotListViewModel jackpotListViewModel, VietlotType vietlotType2, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        jackpotListViewModel.fetchData(vietlotType2, str);
    }

    public final void fetchData(VietlotType vietlotType2, String str) {
        Intrinsics.checkNotNullParameter(vietlotType2, "type");
        this.pageIndex = 0;
        this.vietlotType = vietlotType2;
        this.date = str;
        loadData(false);
    }

    public final void fetchMoreData() {
        loadData(true);
    }

    private final void loadData(boolean z) {
        if (!z || !this.isLoading) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new JackpotListViewModel$loadData$1(this, z, (Continuation<? super JackpotListViewModel$loadData$1>) null), 3, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void updateLoadingState(boolean z, LoadingState loadingState) {
        List list;
        if (!z && loadingState != LoadingState.SUCCESS) {
            if (getShouldHasHeaderItem()) {
                list = CollectionsKt.listOf(new VietLotHeaderItem(), new VietLotLoadingItem(loadingState));
            } else {
                list = CollectionsKt.listOf(new VietLotLoadingItem(loadingState));
            }
            this._vietlotResults.postValue(list);
        }
    }

    /* access modifiers changed from: private */
    public final boolean getShouldHasHeaderItem() {
        return this.vietlotType == VietlotType.MAX3D || this.vietlotType == VietlotType.MAX3DPRO;
    }
}
