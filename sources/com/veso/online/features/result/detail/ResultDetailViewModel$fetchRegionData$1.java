package com.veso.online.features.result.detail;

import com.veso.online.data.model.LoadingState;
import com.veso.online.data.model.LotteryResult;
import com.veso.online.data.model.ResultConfig;
import com.veso.online.data.repo.XosoRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.veso.online.features.result.detail.ResultDetailViewModel$fetchRegionData$1", f = "ResultDetailViewModel.kt", i = {}, l = {43, 49}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: ResultDetailViewModel.kt */
final class ResultDetailViewModel$fetchRegionData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $date;
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ String $regionId;
    Object L$0;
    int label;
    final /* synthetic */ ResultDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ResultDetailViewModel$fetchRegionData$1(ResultDetailViewModel resultDetailViewModel, String str, int i, String str2, Continuation<? super ResultDetailViewModel$fetchRegionData$1> continuation) {
        super(2, continuation);
        this.this$0 = resultDetailViewModel;
        this.$regionId = str;
        this.$pageIndex = i;
        this.$date = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResultDetailViewModel$fetchRegionData$1(this.this$0, this.$regionId, this.$pageIndex, this.$date, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResultDetailViewModel$fetchRegionData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultConfig config;
        String key;
        ResultConfig config2;
        ResultDetailViewModel resultDetailViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0._loadingState.postValue(LoadingState.LOADING);
            resultDetailViewModel = this.this$0;
            this.L$0 = resultDetailViewModel;
            this.label = 1;
            obj = XosoRepository.INSTANCE.retrieveRegionResult(this.$regionId, this.$pageIndex, this.$date, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            resultDetailViewModel = (ResultDetailViewModel) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused) {
                this.this$0._loadingState.postValue(LoadingState.ERROR);
            }
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            LotteryResult access$getLotteryResult$p = this.this$0.lotteryResult;
            if (!(access$getLotteryResult$p == null || (config = access$getLotteryResult$p.getConfig()) == null || (key = config.getKey()) == null)) {
                this.this$0.fetchLiveRegionData(this.$regionId, key);
            }
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        resultDetailViewModel.lotteryResult = (LotteryResult) obj;
        this.this$0.populateData();
        LotteryResult access$getLotteryResult$p2 = this.this$0.lotteryResult;
        if (access$getLotteryResult$p2 == null || (config2 = access$getLotteryResult$p2.getConfig()) == null || config2.getRun() != 1) {
            z = false;
        }
        if (z) {
            this.L$0 = null;
            this.label = 2;
            if (DelayKt.delay(15000, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            LotteryResult access$getLotteryResult$p3 = this.this$0.lotteryResult;
            this.this$0.fetchLiveRegionData(this.$regionId, key);
        }
        return Unit.INSTANCE;
    }
}
