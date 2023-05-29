package com.veso.online.data.repo;

import com.veso.online.data.model.LotteryResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "Lcom/veso/online/data/model/LotteryResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.veso.online.data.repo.XosoRepository$retrieveLiveRegionResult$2", f = "XosoRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: XosoRepository.kt */
final class XosoRepository$retrieveLiveRegionResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LotteryResult>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ String $regionId;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XosoRepository$retrieveLiveRegionResult$2(String str, String str2, Continuation<? super XosoRepository$retrieveLiveRegionResult$2> continuation) {
        super(2, continuation);
        this.$regionId = str;
        this.$key = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new XosoRepository$retrieveLiveRegionResult$2(this.$regionId, this.$key, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LotteryResult> continuation) {
        return ((XosoRepository$retrieveLiveRegionResult$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            XosoRepository xosoRepository = XosoRepository.INSTANCE;
            XosoRepository xosoRepository2 = XosoRepository.INSTANCE;
            return xosoRepository.parseRegionResult(XosoRepository.callToLiveEndpoint$default(xosoRepository2, "/xstt/json/m_" + this.$regionId + ".json?key=" + this.$key + "&_=" + (System.currentTimeMillis() / ((long) 1000)), false, 2, (Object) null), this.$regionId);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
