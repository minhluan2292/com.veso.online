package com.veso.online.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.veso.online.data.repo.XosoRepository", f = "XosoRepository.kt", i = {}, l = {81}, m = "retrieveKenoResult", n = {}, s = {})
/* compiled from: XosoRepository.kt */
final class XosoRepository$retrieveKenoResult$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ XosoRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XosoRepository$retrieveKenoResult$1(XosoRepository xosoRepository, Continuation<? super XosoRepository$retrieveKenoResult$1> continuation) {
        super(continuation);
        this.this$0 = xosoRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retrieveKenoResult((String) null, (Integer) null, this);
    }
}
