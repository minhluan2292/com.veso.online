package com.veso.online.data.repo;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.veso.online.data.model.LotteryResult;
import com.veso.online.data.model.ResultConfig;
import com.veso.online.data.model.XosoConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "Lcom/veso/online/data/model/LotteryResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.veso.online.data.repo.XosoRepository$retrieveLiveChannelResult$2", f = "XosoRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: XosoRepository.kt */
final class XosoRepository$retrieveLiveChannelResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LotteryResult>, Object> {
    final /* synthetic */ String $id;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XosoRepository$retrieveLiveChannelResult$2(String str, Continuation<? super XosoRepository$retrieveLiveChannelResult$2> continuation) {
        super(2, continuation);
        this.$id = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new XosoRepository$retrieveLiveChannelResult$2(this.$id, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LotteryResult> continuation) {
        return ((XosoRepository$retrieveLiveChannelResult$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            XosoRepository xosoRepository = XosoRepository.INSTANCE;
            JsonObject asJsonObject = JsonParser.parseString(XosoRepository.callToLiveEndpoint$default(xosoRepository, "/xstt/kq/json_" + this.$id + ".js?_=" + (System.currentTimeMillis() / ((long) 1000)), false, 2, (Object) null)).getAsJsonObject();
            XosoConfig xosoConfig = XosoConfig.Companion.getMapConfigIds().get(this.$id);
            XosoRepository xosoRepository2 = XosoRepository.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(asJsonObject, "jsonObject");
            Intrinsics.checkNotNull(xosoConfig);
            return new LotteryResult((ResultConfig) null, CollectionsKt.listOf(xosoRepository2.parseTraditionResult(asJsonObject, xosoConfig.getType(), xosoConfig.getId())), (String) null, 4, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
