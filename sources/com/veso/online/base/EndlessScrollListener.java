package com.veso.online.base;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J \u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/veso/online/base/EndlessScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "callback", "Lkotlin/Function0;", "", "(Landroidx/recyclerview/widget/LinearLayoutManager;Lkotlin/jvm/functions/Function0;)V", "pastVisiblesItems", "", "totalItemCount", "visibleItemCount", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: EndlessScrollListener.kt */
public final class EndlessScrollListener extends RecyclerView.OnScrollListener {
    private final Function0<Unit> callback;
    private final LinearLayoutManager layoutManager;
    private int pastVisiblesItems;
    private int totalItemCount;
    private int visibleItemCount;

    public EndlessScrollListener(LinearLayoutManager linearLayoutManager, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(linearLayoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(function0, "callback");
        this.layoutManager = linearLayoutManager;
        this.callback = function0;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i2 > 0) {
            this.visibleItemCount = this.layoutManager.getChildCount();
            this.totalItemCount = this.layoutManager.getItemCount();
            int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
            this.pastVisiblesItems = findFirstVisibleItemPosition;
            if (this.visibleItemCount + findFirstVisibleItemPosition >= this.totalItemCount) {
                this.callback.invoke();
            }
        }
    }
}
