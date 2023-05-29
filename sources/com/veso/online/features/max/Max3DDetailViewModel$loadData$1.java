package com.veso.online.features.max;

import com.veso.online.data.model.VietlotResultItem;
import com.veso.online.data.model.VietlotResultList;
import com.veso.online.data.model.VietlotType;
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
@DebugMetadata(c = "com.veso.online.features.max.Max3DDetailViewModel$loadData$1", f = "Max3DDetailViewModel.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: Max3DDetailViewModel.kt */
final class Max3DDetailViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ VietlotResultItem $origin;
    final /* synthetic */ VietlotType $type;
    int label;
    final /* synthetic */ Max3DDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Max3DDetailViewModel$loadData$1(VietlotType vietlotType, VietlotResultItem vietlotResultItem, Max3DDetailViewModel max3DDetailViewModel, Continuation<? super Max3DDetailViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.$type = vietlotType;
        this.$origin = vietlotResultItem;
        this.this$0 = max3DDetailViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Max3DDetailViewModel$loadData$1(this.$type, this.$origin, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Max3DDetailViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = XosoRepository.INSTANCE.retrieveVietlotDetail(this.$type.getId(), this.$origin.getDate(), this);
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
        VietlotResultItem vietlotResultItem = (VietlotResultItem) CollectionsKt.firstOrNull(((VietlotResultList) obj).getResults());
        if (vietlotResultItem != null) {
            this.this$0._result.postValue(vietlotResultItem);
        }
        return Unit.INSTANCE;
    }
}
