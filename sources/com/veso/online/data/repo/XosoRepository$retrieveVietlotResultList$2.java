package com.veso.online.data.repo;

import com.veso.online.data.model.VietlotResultList;
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

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H@"}, d2 = {"<anonymous>", "Lcom/veso/online/data/model/VietlotResultList;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.veso.online.data.repo.XosoRepository$retrieveVietlotResultList$2", f = "XosoRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: XosoRepository.kt */
final class XosoRepository$retrieveVietlotResultList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VietlotResultList>, Object> {
    final /* synthetic */ String $date;
    final /* synthetic */ String $id;
    final /* synthetic */ int $page;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XosoRepository$retrieveVietlotResultList$2(int i, String str, String str2, Continuation<? super XosoRepository$retrieveVietlotResultList$2> continuation) {
        super(2, continuation);
        this.$page = i;
        this.$date = str;
        this.$id = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new XosoRepository$retrieveVietlotResultList$2(this.$page, this.$date, this.$id, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super VietlotResultList> continuation) {
        return ((XosoRepository$retrieveVietlotResultList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String stringPlus;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            int i = this.$page;
            String str = "";
            String stringPlus2 = i != 0 ? Intrinsics.stringPlus("&page=", Boxing.boxInt(i)) : str;
            String str2 = this.$date;
            if (!(str2 == null || (stringPlus = Intrinsics.stringPlus("&date=", str2)) == null)) {
                str = stringPlus;
            }
            XosoRepository xosoRepository = XosoRepository.INSTANCE;
            return XosoRepository.INSTANCE.getGson().fromJson(XosoRepository.callToEndpoint$default(xosoRepository, "/app/kqxs_vietlott.php?id=" + this.$id + stringPlus2 + str, false, 2, (Object) null), VietlotResultList.class);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
