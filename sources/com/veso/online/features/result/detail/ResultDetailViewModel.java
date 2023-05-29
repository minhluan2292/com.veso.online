package com.veso.online.features.result.detail;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.veso.online.R;
import com.veso.online.data.model.AdRow;
import com.veso.online.data.model.LoadingState;
import com.veso.online.data.model.LotoHeaderRow;
import com.veso.online.data.model.LotoRowData;
import com.veso.online.data.model.LotteryResult;
import com.veso.online.data.model.MediumAdRow;
import com.veso.online.data.model.NorthPrizeHeaderData;
import com.veso.online.data.model.PrizeActionRow;
import com.veso.online.data.model.PrizeDisplayType;
import com.veso.online.data.model.PrizeHeaderData;
import com.veso.online.data.model.PrizeRowData;
import com.veso.online.data.model.ResultConfig;
import com.veso.online.data.model.ResultTraditionLottery;
import com.veso.online.data.model.RowData;
import com.veso.online.data.model.SlideGuildRow;
import com.veso.online.data.model.TextStyle;
import com.veso.online.data.model.TicketInfo;
import com.veso.online.data.model.XosoConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u0018\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0002J \u0010)\u001a\u00020!2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u001a\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020\u0011H\u0002J\b\u0010.\u001a\u00020!H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u001a@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lcom/veso/online/features/result/detail/ResultDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_date", "Landroidx/lifecycle/MutableLiveData;", "", "_detailData", "", "Lcom/veso/online/data/model/RowData;", "_loadingState", "Lcom/veso/online/data/model/LoadingState;", "date", "getDate", "()Landroidx/lifecycle/MutableLiveData;", "detailData", "getDetailData", "value", "", "isReadingResult", "()Z", "setReadingResult", "(Z)V", "loadingState", "getLoadingState", "lotteryResult", "Lcom/veso/online/data/model/LotteryResult;", "Lcom/veso/online/data/model/PrizeDisplayType;", "prizeDisplayType", "getPrizeDisplayType", "()Lcom/veso/online/data/model/PrizeDisplayType;", "setPrizeDisplayType", "(Lcom/veso/online/data/model/PrizeDisplayType;)V", "fetchChannelData", "", "channelId", "pageIndex", "", "fetchLiveChannelData", "fetchLiveRegionData", "regionId", "key", "fetchRegionData", "getTextStyle", "Lcom/veso/online/data/model/TextStyle;", "prize", "isNorthLottery", "populateData", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ResultDetailViewModel.kt */
public final class ResultDetailViewModel extends ViewModel {
    private final MutableLiveData<String> _date;
    private final MutableLiveData<List<RowData>> _detailData;
    /* access modifiers changed from: private */
    public final MutableLiveData<LoadingState> _loadingState;
    private final MutableLiveData<String> date;
    private final MutableLiveData<List<RowData>> detailData;
    private boolean isReadingResult;
    private final MutableLiveData<LoadingState> loadingState;
    /* access modifiers changed from: private */
    public LotteryResult lotteryResult;
    private PrizeDisplayType prizeDisplayType = PrizeDisplayType.FULL;

    public ResultDetailViewModel() {
        MutableLiveData<List<RowData>> mutableLiveData = new MutableLiveData<>();
        this._detailData = mutableLiveData;
        this.detailData = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this._date = mutableLiveData2;
        this.date = mutableLiveData2;
        MutableLiveData<LoadingState> mutableLiveData3 = new MutableLiveData<>();
        this._loadingState = mutableLiveData3;
        this.loadingState = mutableLiveData3;
    }

    public final MutableLiveData<List<RowData>> getDetailData() {
        return this.detailData;
    }

    public final MutableLiveData<String> getDate() {
        return this.date;
    }

    public final MutableLiveData<LoadingState> getLoadingState() {
        return this.loadingState;
    }

    public final PrizeDisplayType getPrizeDisplayType() {
        return this.prizeDisplayType;
    }

    public final void setPrizeDisplayType(PrizeDisplayType prizeDisplayType2) {
        Intrinsics.checkNotNullParameter(prizeDisplayType2, "value");
        this.prizeDisplayType = prizeDisplayType2;
        populateData();
    }

    public final boolean isReadingResult() {
        return this.isReadingResult;
    }

    public final void setReadingResult(boolean z) {
        this.isReadingResult = z;
        populateData();
    }

    public final void fetchRegionData(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "regionId");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ResultDetailViewModel$fetchRegionData$1(this, str, i, str2, (Continuation<? super ResultDetailViewModel$fetchRegionData$1>) null), 3, (Object) null);
    }

    public final void fetchChannelData(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "channelId");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ResultDetailViewModel$fetchChannelData$1(this, str, i, str2, (Continuation<? super ResultDetailViewModel$fetchChannelData$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void fetchLiveRegionData(String str, String str2) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ResultDetailViewModel$fetchLiveRegionData$1(this, str, str2, (Continuation<? super ResultDetailViewModel$fetchLiveRegionData$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void fetchLiveChannelData(String str) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ResultDetailViewModel$fetchLiveChannelData$1(this, str, (Continuation<? super ResultDetailViewModel$fetchLiveChannelData$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void populateData() {
        List list;
        List list2;
        ResultConfig config;
        ResultConfig config2;
        List<ResultTraditionLottery> result;
        LotteryResult lotteryResult2 = this.lotteryResult;
        if (lotteryResult2 == null || (result = lotteryResult2.getResult()) == null) {
            list = null;
        } else {
            Collection arrayList = new ArrayList();
            for (Object next : result) {
                if (XosoConfig.Companion.getMapConfigIds().get(((ResultTraditionLottery) next).getId()) != null) {
                    arrayList.add(next);
                }
            }
            list = (List) arrayList;
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            this._detailData.postValue(CollectionsKt.listOf(new AdRow(), new SlideGuildRow()));
            return;
        }
        List mutableListOf = CollectionsKt.mutableListOf(new AdRow());
        ResultTraditionLottery resultTraditionLottery = (ResultTraditionLottery) CollectionsKt.first(list);
        Iterable<ResultTraditionLottery> iterable = list;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ResultTraditionLottery resultTraditionLottery2 : iterable) {
            XosoConfig xosoConfig = XosoConfig.Companion.getMapConfigIds().get(resultTraditionLottery2.getId());
            Intrinsics.checkNotNull(xosoConfig);
            arrayList2.add(new TicketInfo(xosoConfig.getName(), resultTraditionLottery2.getTicketType()));
        }
        List list3 = (List) arrayList2;
        boolean areEqual = Intrinsics.areEqual((Object) resultTraditionLottery.getRegionId(), (Object) XosoConfig.REGION_ID_NORTH);
        if (areEqual) {
            String date2 = resultTraditionLottery.getDate();
            LotteryResult lotteryResult3 = this.lotteryResult;
            mutableListOf.add(new NorthPrizeHeaderData(date2, list3, (lotteryResult3 == null || (config2 = lotteryResult3.getConfig()) == null) ? null : Long.valueOf(config2.getTime())));
        } else {
            String date3 = resultTraditionLottery.getDate();
            LotteryResult lotteryResult4 = this.lotteryResult;
            mutableListOf.add(new PrizeHeaderData(date3, list3, (lotteryResult4 == null || (config = lotteryResult4.getConfig()) == null) ? null : Long.valueOf(config.getTime())));
        }
        if (!collection.isEmpty()) {
            int i = 0;
            for (Object next2 : ((ResultTraditionLottery) CollectionsKt.first(list)).getPrizes()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) next2;
                String stringPlus = ((Number) pair.getFirst()).intValue() == 0 ? "ĐB" : Intrinsics.stringPlus(RequestConfiguration.MAX_AD_CONTENT_RATING_G, pair.getFirst());
                Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (ResultTraditionLottery prizes : iterable) {
                    Pair pair2 = (Pair) CollectionsKt.getOrNull(prizes.getPrizes(), i);
                    List list4 = pair2 == null ? null : (List) pair2.getSecond();
                    if (list4 == null) {
                        list4 = CollectionsKt.emptyList();
                    }
                    arrayList3.add(list4);
                }
                List list5 = (List) arrayList3;
                if (!areEqual || ((Number) pair.getFirst()).intValue() != 0) {
                    list2 = CollectionsKt.emptyList();
                } else {
                    Collection arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (ResultTraditionLottery ticketType : iterable) {
                        arrayList4.add(ticketType.getTicketType());
                    }
                    list2 = (List) arrayList4;
                }
                mutableListOf.add(new PrizeRowData(stringPlus, list5, getPrizeDisplayType(), ((Number) pair.getFirst()).intValue(), list2, getTextStyle(((Number) pair.getFirst()).intValue(), areEqual)));
                i = i2;
            }
        }
        PrizeDisplayType prizeDisplayType2 = this.prizeDisplayType;
        LotteryResult lotteryResult5 = this.lotteryResult;
        Intrinsics.checkNotNull(lotteryResult5);
        mutableListOf.add(new PrizeActionRow(prizeDisplayType2, lotteryResult5, this.isReadingResult));
        mutableListOf.add(new MediumAdRow());
        mutableListOf.add(new LotoHeaderRow());
        Iterable<TicketInfo> iterable2 = list3;
        Collection arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        for (TicketInfo name : iterable2) {
            arrayList5.add(name.getName());
        }
        mutableListOf.add(new LotoRowData((List) arrayList5, (String) null, Integer.valueOf(R.string.loto_start), 2, (DefaultConstructorMarker) null));
        Collection arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ResultTraditionLottery lotoDauDuoi : iterable) {
            arrayList6.add(lotoDauDuoi.lotoDauDuoi());
        }
        List list6 = (List) arrayList6;
        Iterator it = RangesKt.until(0, 10).iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            Iterable<Map> iterable3 = list6;
            Collection arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10));
            for (Map map : iterable3) {
                String str = (String) map.get(Integer.valueOf(nextInt));
                if (str == null) {
                    str = "";
                }
                arrayList7.add(str);
            }
            mutableListOf.add(new LotoRowData((List) arrayList7, String.valueOf(nextInt), (Integer) null, 4, (DefaultConstructorMarker) null));
        }
        mutableListOf.add(new SlideGuildRow());
        this._date.postValue(resultTraditionLottery.getDate());
        this._detailData.postValue(mutableListOf);
        this._loadingState.postValue(LoadingState.SUCCESS);
    }

    private final TextStyle getTextStyle(int i, boolean z) {
        if (i == 0) {
            return new TextStyle(R.dimen.ts_db, R.color.prize_db);
        }
        if ((z && i == 6) || (!z && i == 7)) {
            return new TextStyle(R.dimen.ts_normal, R.color.prize_near_last);
        }
        if ((!z || i != 7) && (z || i != 8)) {
            return null;
        }
        return new TextStyle(R.dimen.ts_normal, R.color.prize_last);
    }
}
