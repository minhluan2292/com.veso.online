package com.veso.online.features.mega.detail;

import com.veso.online.data.model.VietlotResultItem;
import com.veso.online.data.model.VietlotResultList;
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
@DebugMetadata(c = "com.veso.online.features.mega.detail.JackpotDetailViewModel$fetchJackpotDetail$1", f = "JackpotDetailViewModel.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: JackpotDetailViewModel.kt */
final class JackpotDetailViewModel$fetchJackpotDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    final /* synthetic */ VietlotResultItem $originResult;
    int label;
    final /* synthetic */ JackpotDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JackpotDetailViewModel$fetchJackpotDetail$1(JackpotDetailViewModel jackpotDetailViewModel, VietlotResultItem vietlotResultItem, String str, Continuation<? super JackpotDetailViewModel$fetchJackpotDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = jackpotDetailViewModel;
        this.$originResult = vietlotResultItem;
        this.$id = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JackpotDetailViewModel$fetchJackpotDetail$1(this.this$0, this.$originResult, this.$id, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JackpotDetailViewModel$fetchJackpotDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0._result.postValue(this.$originResult);
            this.label = 1;
            obj = XosoRepository.INSTANCE.retrieveVietlotDetail(this.$id, this.$originResult.getDate(), this);
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
