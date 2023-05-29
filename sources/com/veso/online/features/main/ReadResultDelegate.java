package com.veso.online.features.main;

import androidx.lifecycle.LiveData;
import com.veso.online.data.model.ResultTraditionLottery;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J&\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H&J\b\u0010\u0011\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/veso/online/features/main/ReadResultDelegate;", "", "readingLiveData", "Landroidx/lifecycle/LiveData;", "", "getReadingLiveData", "()Landroidx/lifecycle/LiveData;", "readChannelResult", "", "result", "Lcom/veso/online/data/model/ResultTraditionLottery;", "readRegionResult", "regionId", "", "date", "results", "", "stopReading", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ReadResultDelegate.kt */
public interface ReadResultDelegate {
    LiveData<Boolean> getReadingLiveData();

    void readChannelResult(ResultTraditionLottery resultTraditionLottery);

    void readRegionResult(String str, String str2, List<ResultTraditionLottery> list);

    void stopReading();
}
