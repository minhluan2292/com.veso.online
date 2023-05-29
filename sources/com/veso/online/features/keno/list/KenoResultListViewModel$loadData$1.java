package com.veso.online.features.keno.list;

import com.veso.online.data.model.KenoAdsItem;
import com.veso.online.data.model.KenoHeader;
import com.veso.online.data.model.KenoResponse;
import com.veso.online.data.model.KenoResult;
import com.veso.online.data.model.LoadingState;
import com.veso.online.data.repo.XosoRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.veso.online.features.keno.list.KenoResultListViewModel$loadData$1", f = "KenoResultListViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: KenoResultListViewModel.kt */
final class KenoResultListViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoadMore;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KenoResultListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KenoResultListViewModel$loadData$1(KenoResultListViewModel kenoResultListViewModel, boolean z, Continuation<? super KenoResultListViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = kenoResultListViewModel;
        this.$isLoadMore = z;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KenoResultListViewModel$loadData$1(this.this$0, this.$isLoadMore, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KenoResultListViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        KenoResultListViewModel kenoResultListViewModel;
        Collection collection;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.isLoading = true;
            this.this$0.updateLoadingState(this.$isLoadMore, LoadingState.LOADING);
            List access$getKenoResultItems$p = this.this$0.kenoResultItems;
            Integer num = null;
            if (!this.$isLoadMore) {
                access$getKenoResultItems$p = null;
            }
            if (access$getKenoResultItems$p == null) {
                access$getKenoResultItems$p = CollectionsKt.emptyList();
            }
            KenoResult kenoResult = (KenoResult) CollectionsKt.lastOrNull(access$getKenoResultItems$p);
            if (kenoResult != null) {
                String lv = kenoResult.getLv();
                if (lv != null) {
                    try {
                        num = Boxing.boxInt(Integer.parseInt(lv) - 1);
                    } catch (Exception unused) {
                        Integer num2 = null;
                    }
                }
            }
            kenoResultListViewModel = this.this$0;
            Collection collection2 = access$getKenoResultItems$p;
            this.L$0 = kenoResultListViewModel;
            this.L$1 = collection2;
            this.label = 1;
            Object retrieveKenoResult = XosoRepository.INSTANCE.retrieveKenoResult(this.this$0.date, num, this);
            if (retrieveKenoResult == coroutine_suspended) {
                return coroutine_suspended;
            }
            collection = collection2;
            obj = retrieveKenoResult;
        } else if (i == 1) {
            collection = (Collection) this.L$1;
            kenoResultListViewModel = (KenoResultListViewModel) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused2) {
                this.this$0.updateLoadingState(this.$isLoadMore, LoadingState.ERROR);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kenoResultListViewModel.kenoResultItems = CollectionsKt.plus(collection, ((KenoResponse) obj).getResults());
        List arrayList = new ArrayList();
        arrayList.add(new KenoHeader());
        int i2 = 0;
        for (Object next : this.this$0.kenoResultItems) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add((KenoResult) next);
            if (i2 % 2 == 0) {
                arrayList.add(new KenoAdsItem());
            }
            i2 = i3;
        }
        this.this$0._kenoResults.postValue(arrayList);
        this.this$0.updateLoadingState(this.$isLoadMore, LoadingState.SUCCESS);
        this.this$0.isLoading = false;
        return Unit.INSTANCE;
    }
}
