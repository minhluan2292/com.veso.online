package com.veso.online.data.repo;

import com.veso.online.data.model.KenoResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H@"}, d2 = {"<anonymous>", "Lcom/veso/online/data/model/KenoResponse;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.veso.online.data.repo.XosoRepository$retrieveKenoResult$2", f = "XosoRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: XosoRepository.kt */
final class XosoRepository$retrieveKenoResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super KenoResponse>, Object> {
    final /* synthetic */ String $date;
    final /* synthetic */ Integer $start;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XosoRepository$retrieveKenoResult$2(String str, Integer num, Continuation<? super XosoRepository$retrieveKenoResult$2> continuation) {
        super(2, continuation);
        this.$date = str;
        this.$start = num;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new XosoRepository$retrieveKenoResult$2(this.$date, this.$start, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super KenoResponse> continuation) {
        return ((XosoRepository$retrieveKenoResult$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String stringPlus;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = this.$date;
            String str3 = "";
            if (str2 == null || (str = Intrinsics.stringPlus("&date=", str2)) == null) {
                str = str3;
            }
            Integer num = this.$start;
            if (!(num == null || (stringPlus = Intrinsics.stringPlus("&start=", Boxing.boxInt(num.intValue()))) == null)) {
                str3 = stringPlus;
            }
            XosoRepository xosoRepository = XosoRepository.INSTANCE;
            return XosoRepository.INSTANCE.getGson().fromJson(XosoRepository.callToEndpoint$default(xosoRepository, "/app/kqxs_keno.php?id=119" + str + str3, false, 2, (Object) null), KenoResponse.class);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
