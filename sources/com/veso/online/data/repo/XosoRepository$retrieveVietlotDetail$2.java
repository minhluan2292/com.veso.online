package com.veso.online.data.repo;

import com.veso.online.data.model.VietlotResultList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H@"}, d2 = {"<anonymous>", "Lcom/veso/online/data/model/VietlotResultList;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.veso.online.data.repo.XosoRepository$retrieveVietlotDetail$2", f = "XosoRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: XosoRepository.kt */
final class XosoRepository$retrieveVietlotDetail$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VietlotResultList>, Object> {
    final /* synthetic */ String $date;
    final /* synthetic */ String $id;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XosoRepository$retrieveVietlotDetail$2(String str, String str2, Continuation<? super XosoRepository$retrieveVietlotDetail$2> continuation) {
        super(2, continuation);
        this.$id = str;
        this.$date = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new XosoRepository$retrieveVietlotDetail$2(this.$id, this.$date, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super VietlotResultList> continuation) {
        return ((XosoRepository$retrieveVietlotDetail$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            XosoRepository xosoRepository = XosoRepository.INSTANCE;
            return XosoRepository.INSTANCE.getGson().fromJson(XosoRepository.callToEndpoint$default(xosoRepository, "/app/kqxs_vietlott_detail.php?id=" + this.$id + "&date=" + this.$date, false, 2, (Object) null), VietlotResultList.class);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
