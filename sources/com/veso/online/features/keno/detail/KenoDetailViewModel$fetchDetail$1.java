package com.veso.online.features.keno.detail;

import com.veso.online.data.model.KenoResponse;
import com.veso.online.data.model.KenoResult;
import com.veso.online.data.repo.XosoRepository;
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
@DebugMetadata(c = "com.veso.online.features.keno.detail.KenoDetailViewModel$fetchDetail$1", f = "KenoDetailViewModel.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: KenoDetailViewModel.kt */
final class KenoDetailViewModel$fetchDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ KenoResult $result;
    int label;
    final /* synthetic */ KenoDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KenoDetailViewModel$fetchDetail$1(KenoResult kenoResult, KenoDetailViewModel kenoDetailViewModel, Continuation<? super KenoDetailViewModel$fetchDetail$1> continuation) {
        super(2, continuation);
        this.$result = kenoResult;
        this.this$0 = kenoDetailViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KenoDetailViewModel$fetchDetail$1(this.$result, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KenoDetailViewModel$fetchDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = XosoRepository.INSTANCE.retrieveKenoDetail(this.$result.getLv(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        KenoResult kenoResult = (KenoResult) CollectionsKt.firstOrNull(((KenoResponse) obj).getResults());
        if (kenoResult != null) {
            this.this$0.buildItems(kenoResult);
        }
        return Unit.INSTANCE;
    }
}
