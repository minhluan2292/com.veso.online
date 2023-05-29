package com.veso.online.features.mega;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.veso.online.features.mega.JackpotListViewModel$loadData$1", f = "JackpotListViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: JackpotListViewModel.kt */
final class JackpotListViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoadMore;
    int label;
    final /* synthetic */ JackpotListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JackpotListViewModel$loadData$1(JackpotListViewModel jackpotListViewModel, boolean z, Continuation<? super JackpotListViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = jackpotListViewModel;
        this.$isLoadMore = z;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JackpotListViewModel$loadData$1(this.this$0, this.$isLoadMore, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JackpotListViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf A[Catch:{ Exception -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0018
            if (r1 != r3) goto L_0x0010
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ Exception -> 0x0108 }
            goto L_0x0059
        L_0x0010:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0018:
            kotlin.ResultKt.throwOnFailure(r10)
            com.veso.online.features.mega.JackpotListViewModel r10 = r9.this$0
            r10.isLoading = r3
            com.veso.online.features.mega.JackpotListViewModel r10 = r9.this$0
            boolean r1 = r9.$isLoadMore
            com.veso.online.data.model.LoadingState r4 = com.veso.online.data.model.LoadingState.LOADING
            r10.updateLoadingState(r1, r4)
            com.veso.online.data.repo.XosoRepository r10 = com.veso.online.data.repo.XosoRepository.INSTANCE     // Catch:{ Exception -> 0x0108 }
            com.veso.online.features.mega.JackpotListViewModel r1 = r9.this$0     // Catch:{ Exception -> 0x0108 }
            com.veso.online.data.model.VietlotType r1 = r1.vietlotType     // Catch:{ Exception -> 0x0108 }
            java.lang.String r1 = r1.getId()     // Catch:{ Exception -> 0x0108 }
            boolean r4 = r9.$isLoadMore     // Catch:{ Exception -> 0x0108 }
            if (r4 == 0) goto L_0x0041
            com.veso.online.features.mega.JackpotListViewModel r4 = r9.this$0     // Catch:{ Exception -> 0x0108 }
            int r4 = r4.pageIndex     // Catch:{ Exception -> 0x0108 }
            int r4 = r4 + r3
            goto L_0x0047
        L_0x0041:
            com.veso.online.features.mega.JackpotListViewModel r4 = r9.this$0     // Catch:{ Exception -> 0x0108 }
            int r4 = r4.pageIndex     // Catch:{ Exception -> 0x0108 }
        L_0x0047:
            com.veso.online.features.mega.JackpotListViewModel r5 = r9.this$0     // Catch:{ Exception -> 0x0108 }
            java.lang.String r5 = r5.date     // Catch:{ Exception -> 0x0108 }
            r6 = r9
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch:{ Exception -> 0x0108 }
            r9.label = r3     // Catch:{ Exception -> 0x0108 }
            java.lang.Object r10 = r10.retrieveVietlotResultList(r1, r4, r5, r6)     // Catch:{ Exception -> 0x0108 }
            if (r10 != r0) goto L_0x0059
            return r0
        L_0x0059:
            com.veso.online.data.model.VietlotResultList r10 = (com.veso.online.data.model.VietlotResultList) r10     // Catch:{ Exception -> 0x0108 }
            com.veso.online.features.mega.JackpotListViewModel r0 = r9.this$0     // Catch:{ Exception -> 0x0108 }
            java.util.List r1 = r0.getVietLotResultItems()     // Catch:{ Exception -> 0x0108 }
            boolean r4 = r9.$isLoadMore     // Catch:{ Exception -> 0x0108 }
            if (r4 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            if (r1 != 0) goto L_0x006d
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ Exception -> 0x0108 }
        L_0x006d:
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x0108 }
            java.util.List r4 = r10.getResults()     // Catch:{ Exception -> 0x0108 }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ Exception -> 0x0108 }
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r1, r4)     // Catch:{ Exception -> 0x0108 }
            r0.setVietLotResultItems(r1)     // Catch:{ Exception -> 0x0108 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0108 }
            r0.<init>()     // Catch:{ Exception -> 0x0108 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0108 }
            com.veso.online.features.mega.JackpotListViewModel r1 = r9.this$0     // Catch:{ Exception -> 0x0108 }
            boolean r1 = r1.getShouldHasHeaderItem()     // Catch:{ Exception -> 0x0108 }
            if (r1 == 0) goto L_0x0093
            com.veso.online.data.model.VietLotHeaderItem r1 = new com.veso.online.data.model.VietLotHeaderItem     // Catch:{ Exception -> 0x0108 }
            r1.<init>()     // Catch:{ Exception -> 0x0108 }
            r0.add(r1)     // Catch:{ Exception -> 0x0108 }
        L_0x0093:
            com.veso.online.features.mega.JackpotListViewModel r1 = r9.this$0     // Catch:{ Exception -> 0x0108 }
            java.util.List r1 = r1.getVietLotResultItems()     // Catch:{ Exception -> 0x0108 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x0108 }
            com.veso.online.features.mega.JackpotListViewModel r4 = r9.this$0     // Catch:{ Exception -> 0x0108 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0108 }
            r5 = r2
        L_0x00a2:
            boolean r6 = r1.hasNext()     // Catch:{ Exception -> 0x0108 }
            if (r6 == 0) goto L_0x00d9
            java.lang.Object r6 = r1.next()     // Catch:{ Exception -> 0x0108 }
            int r7 = r5 + 1
            if (r5 >= 0) goto L_0x00b3
            kotlin.collections.CollectionsKt.throwIndexOverflow()     // Catch:{ Exception -> 0x0108 }
        L_0x00b3:
            com.veso.online.data.model.VietlotResultItem r6 = (com.veso.online.data.model.VietlotResultItem) r6     // Catch:{ Exception -> 0x0108 }
            r0.add(r6)     // Catch:{ Exception -> 0x0108 }
            com.veso.online.data.model.VietlotType r6 = r4.vietlotType     // Catch:{ Exception -> 0x0108 }
            com.veso.online.data.model.VietlotType r8 = com.veso.online.data.model.VietlotType.MAX3D     // Catch:{ Exception -> 0x0108 }
            if (r6 == r8) goto L_0x00cb
            com.veso.online.data.model.VietlotType r6 = r4.vietlotType     // Catch:{ Exception -> 0x0108 }
            com.veso.online.data.model.VietlotType r8 = com.veso.online.data.model.VietlotType.MAX3DPRO     // Catch:{ Exception -> 0x0108 }
            if (r6 != r8) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r6 = 5
            goto L_0x00cc
        L_0x00cb:
            r6 = 2
        L_0x00cc:
            int r5 = r5 % r6
            if (r5 != 0) goto L_0x00d7
            com.veso.online.data.model.VietLotAdsItem r5 = new com.veso.online.data.model.VietLotAdsItem     // Catch:{ Exception -> 0x0108 }
            r5.<init>()     // Catch:{ Exception -> 0x0108 }
            r0.add(r5)     // Catch:{ Exception -> 0x0108 }
        L_0x00d7:
            r5 = r7
            goto L_0x00a2
        L_0x00d9:
            com.veso.online.features.mega.JackpotListViewModel r1 = r9.this$0     // Catch:{ Exception -> 0x0108 }
            androidx.lifecycle.MutableLiveData r1 = r1._vietlotResults     // Catch:{ Exception -> 0x0108 }
            r1.postValue(r0)     // Catch:{ Exception -> 0x0108 }
            boolean r0 = r9.$isLoadMore     // Catch:{ Exception -> 0x0108 }
            if (r0 != 0) goto L_0x00f4
            com.veso.online.features.mega.JackpotListViewModel r0 = r9.this$0     // Catch:{ Exception -> 0x0108 }
            androidx.lifecycle.MutableLiveData r0 = r0._jackpotInfo     // Catch:{ Exception -> 0x0108 }
            com.veso.online.data.model.JackpotInfo r10 = r10.getJackpotInfo()     // Catch:{ Exception -> 0x0108 }
            r0.postValue(r10)     // Catch:{ Exception -> 0x0108 }
            goto L_0x00fe
        L_0x00f4:
            com.veso.online.features.mega.JackpotListViewModel r10 = r9.this$0     // Catch:{ Exception -> 0x0108 }
            int r0 = r10.pageIndex     // Catch:{ Exception -> 0x0108 }
            int r0 = r0 + r3
            r10.pageIndex = r0     // Catch:{ Exception -> 0x0108 }
        L_0x00fe:
            com.veso.online.features.mega.JackpotListViewModel r10 = r9.this$0     // Catch:{ Exception -> 0x0108 }
            boolean r0 = r9.$isLoadMore     // Catch:{ Exception -> 0x0108 }
            com.veso.online.data.model.LoadingState r1 = com.veso.online.data.model.LoadingState.SUCCESS     // Catch:{ Exception -> 0x0108 }
            r10.updateLoadingState(r0, r1)     // Catch:{ Exception -> 0x0108 }
            goto L_0x0111
        L_0x0108:
            com.veso.online.features.mega.JackpotListViewModel r10 = r9.this$0
            boolean r0 = r9.$isLoadMore
            com.veso.online.data.model.LoadingState r1 = com.veso.online.data.model.LoadingState.ERROR
            r10.updateLoadingState(r0, r1)
        L_0x0111:
            com.veso.online.features.mega.JackpotListViewModel r10 = r9.this$0
            r10.isLoading = r2
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.features.mega.JackpotListViewModel$loadData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
