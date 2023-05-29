package com.veso.online.data.repo;

import com.veso.online.data.model.XoSoDienToanResult;
import java.util.List;
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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0004H@"}, d2 = {"<anonymous>", "", "Lcom/veso/online/data/model/XoSoDienToanResult;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.veso.online.data.repo.XosoRepository$retrieveDienToanMb$2", f = "XosoRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: XosoRepository.kt */
final class XosoRepository$retrieveDienToanMb$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends XoSoDienToanResult>>, Object> {
    final /* synthetic */ String $date;
    final /* synthetic */ int $page;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XosoRepository$retrieveDienToanMb$2(int i, String str, Continuation<? super XosoRepository$retrieveDienToanMb$2> continuation) {
        super(2, continuation);
        this.$page = i;
        this.$date = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new XosoRepository$retrieveDienToanMb$2(this.$page, this.$date, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<XoSoDienToanResult>> continuation) {
        return ((XosoRepository$retrieveDienToanMb$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            return XosoRepository.INSTANCE.getGson().fromJson(XosoRepository.callToEndpoint$default(xosoRepository, "/app/kqxs_xsdt_mb.php?&key=none" + stringPlus2 + str, false, 2, (Object) null), new XosoRepository$retrieveDienToanMb$2$type$1().getType());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
