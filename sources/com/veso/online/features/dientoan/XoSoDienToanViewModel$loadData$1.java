package com.veso.online.features.dientoan;

import com.veso.online.data.model.LoadingState;
import com.veso.online.data.model.XoSoDienToanAds;
import com.veso.online.data.model.XoSoDienToanResult;
import com.veso.online.data.repo.XosoRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.veso.online.features.dientoan.XoSoDienToanViewModel$loadData$1", f = "XoSoDienToanViewModel.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: XoSoDienToanViewModel.kt */
final class XoSoDienToanViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoadMore;
    int label;
    final /* synthetic */ XoSoDienToanViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XoSoDienToanViewModel$loadData$1(XoSoDienToanViewModel xoSoDienToanViewModel, boolean z, Continuation<? super XoSoDienToanViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = xoSoDienToanViewModel;
        this.$isLoadMore = z;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new XoSoDienToanViewModel$loadData$1(this.this$0, this.$isLoadMore, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((XoSoDienToanViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.isLoading = true;
            this.this$0.updateLoadingState(this.$isLoadMore, LoadingState.LOADING);
            XosoRepository xosoRepository = XosoRepository.INSTANCE;
            int access$getPageIndex$p = this.$isLoadMore ? this.this$0.pageIndex : 0;
            this.label = 1;
            obj = xosoRepository.retrieveDienToanMb(access$getPageIndex$p, this.this$0.date, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused) {
                this.this$0.updateLoadingState(this.$isLoadMore, LoadingState.ERROR);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        XoSoDienToanViewModel xoSoDienToanViewModel = this.this$0;
        List access$getXoSoDienToanResult$p = xoSoDienToanViewModel.xoSoDienToanResult;
        if (!this.$isLoadMore) {
            access$getXoSoDienToanResult$p = null;
        }
        if (access$getXoSoDienToanResult$p == null) {
            access$getXoSoDienToanResult$p = CollectionsKt.emptyList();
        }
        xoSoDienToanViewModel.xoSoDienToanResult = CollectionsKt.plus(access$getXoSoDienToanResult$p, list);
        List arrayList = new ArrayList();
        int i2 = 0;
        for (Object next : this.this$0.xoSoDienToanResult) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add((XoSoDienToanResult) next);
            if (i2 % 3 == 0) {
                arrayList.add(new XoSoDienToanAds());
            }
            i2 = i3;
        }
        this.this$0._results.postValue(arrayList);
        if (this.$isLoadMore) {
            XoSoDienToanViewModel xoSoDienToanViewModel2 = this.this$0;
            xoSoDienToanViewModel2.pageIndex = xoSoDienToanViewModel2.pageIndex + 1;
        }
        this.this$0.updateLoadingState(this.$isLoadMore, LoadingState.SUCCESS);
        this.this$0.isLoading = false;
        return Unit.INSTANCE;
    }
}
