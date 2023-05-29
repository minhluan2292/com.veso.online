package com.veso.online.data.repo;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.veso.online.data.model.LotteryResult;
import com.veso.online.data.model.ResultConfig;
import com.veso.online.data.model.ResultTraditionLottery;
import com.veso.online.data.model.XosoConfig;
import com.veso.online.features.result.SlidableFragment;
import com.veso.online.utils.DateUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002J\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002J+\u0010\u001c\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\fH@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fH@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010%J%\u0010&\u001a\u00020#2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010'\u001a\u0004\u0018\u00010\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0019\u0010)\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010%J!\u0010*\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010+\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010,J+\u0010-\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\fH@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ!\u0010.\u001a\u00020/2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010,J+\u00100\u001a\u00020/2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\fH@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0012\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u001f*\u000202H\u0002J\u001c\u00103\u001a\u000204*\u0002052\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00106\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/veso/online/data/repo/XosoRepository;", "", "()V", "endpointIndex", "", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "buildParam", "", "id", "page", "date", "buildRegionParam", "callApi", "url", "callToEndpoint", "isFirstTime", "", "callToLiveEndpoint", "parseRegionResult", "Lcom/veso/online/data/model/LotteryResult;", "result", "regionId", "randomIndex", "retrieveChannelResult", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveDienToanMb", "", "Lcom/veso/online/data/model/XoSoDienToanResult;", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveKenoDetail", "Lcom/veso/online/data/model/KenoResponse;", "period", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveKenoResult", "start", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveLiveChannelResult", "retrieveLiveRegionResult", "key", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveRegionResult", "retrieveVietlotDetail", "Lcom/veso/online/data/model/VietlotResultList;", "retrieveVietlotResultList", "asListString", "Lcom/google/gson/JsonElement;", "parseTraditionResult", "Lcom/veso/online/data/model/ResultTraditionLottery;", "Lcom/google/gson/JsonObject;", "channelId", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoRepository.kt */
public final class XosoRepository {
    public static final XosoRepository INSTANCE;
    private static int endpointIndex;
    private static final Lazy gson$delegate = LazyKt.lazy(XosoRepository$gson$2.INSTANCE);

    private XosoRepository() {
    }

    static {
        XosoRepository xosoRepository = new XosoRepository();
        INSTANCE = xosoRepository;
        endpointIndex = xosoRepository.randomIndex();
    }

    /* access modifiers changed from: private */
    public final Gson getGson() {
        return (Gson) gson$delegate.getValue();
    }

    public final Object retrieveRegionResult(String str, int i, String str2, Continuation<? super LotteryResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new XosoRepository$retrieveRegionResult$2(str, i, str2, (Continuation<? super XosoRepository$retrieveRegionResult$2>) null), continuation);
    }

    public final Object retrieveLiveRegionResult(String str, String str2, Continuation<? super LotteryResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new XosoRepository$retrieveLiveRegionResult$2(str, str2, (Continuation<? super XosoRepository$retrieveLiveRegionResult$2>) null), continuation);
    }

    public final Object retrieveChannelResult(String str, int i, String str2, Continuation<? super LotteryResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new XosoRepository$retrieveChannelResult$2(str, i, str2, (Continuation<? super XosoRepository$retrieveChannelResult$2>) null), continuation);
    }

    public final Object retrieveLiveChannelResult(String str, Continuation<? super LotteryResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new XosoRepository$retrieveLiveChannelResult$2(str, (Continuation<? super XosoRepository$retrieveLiveChannelResult$2>) null), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object retrieveVietlotResultList(java.lang.String r6, int r7, java.lang.String r8, kotlin.coroutines.Continuation<? super com.veso.online.data.model.VietlotResultList> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.veso.online.data.repo.XosoRepository$retrieveVietlotResultList$1
            if (r0 == 0) goto L_0x0014
            r0 = r9
            com.veso.online.data.repo.XosoRepository$retrieveVietlotResultList$1 r0 = (com.veso.online.data.repo.XosoRepository$retrieveVietlotResultList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L_0x0019
        L_0x0014:
            com.veso.online.data.repo.XosoRepository$retrieveVietlotResultList$1 r0 = new com.veso.online.data.repo.XosoRepository$retrieveVietlotResultList$1
            r0.<init>(r5, r9)
        L_0x0019:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x004c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
            com.veso.online.data.repo.XosoRepository$retrieveVietlotResultList$2 r2 = new com.veso.online.data.repo.XosoRepository$retrieveVietlotResultList$2
            r4 = 0
            r2.<init>(r7, r8, r6, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r2, r0)
            if (r9 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.lang.String r6 = "id: String, page: Int, d…st::class.java)\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.data.repo.XosoRepository.retrieveVietlotResultList(java.lang.String, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object retrieveVietlotDetail(java.lang.String r6, java.lang.String r7, kotlin.coroutines.Continuation<? super com.veso.online.data.model.VietlotResultList> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.veso.online.data.repo.XosoRepository$retrieveVietlotDetail$1
            if (r0 == 0) goto L_0x0014
            r0 = r8
            com.veso.online.data.repo.XosoRepository$retrieveVietlotDetail$1 r0 = (com.veso.online.data.repo.XosoRepository$retrieveVietlotDetail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            com.veso.online.data.repo.XosoRepository$retrieveVietlotDetail$1 r0 = new com.veso.online.data.repo.XosoRepository$retrieveVietlotDetail$1
            r0.<init>(r5, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            com.veso.online.data.repo.XosoRepository$retrieveVietlotDetail$2 r2 = new com.veso.online.data.repo.XosoRepository$retrieveVietlotDetail$2
            r4 = 0
            r2.<init>(r6, r7, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0)
            if (r8 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.lang.String r6 = "id: String, date: String…st::class.java)\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.data.repo.XosoRepository.retrieveVietlotDetail(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object retrieveDienToanMb$default(XosoRepository xosoRepository, int i, String str, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return xosoRepository.retrieveDienToanMb(i, str, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object retrieveDienToanMb(int r6, java.lang.String r7, kotlin.coroutines.Continuation<? super java.util.List<com.veso.online.data.model.XoSoDienToanResult>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.veso.online.data.repo.XosoRepository$retrieveDienToanMb$1
            if (r0 == 0) goto L_0x0014
            r0 = r8
            com.veso.online.data.repo.XosoRepository$retrieveDienToanMb$1 r0 = (com.veso.online.data.repo.XosoRepository$retrieveDienToanMb$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            com.veso.online.data.repo.XosoRepository$retrieveDienToanMb$1 r0 = new com.veso.online.data.repo.XosoRepository$retrieveDienToanMb$1
            r0.<init>(r5, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            com.veso.online.data.repo.XosoRepository$retrieveDienToanMb$2 r2 = new com.veso.online.data.repo.XosoRepository$retrieveDienToanMb$2
            r4 = 0
            r2.<init>(r6, r7, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0)
            if (r8 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.lang.String r6 = "page: Int, date: String?…Json(res, type)\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.data.repo.XosoRepository.retrieveDienToanMb(int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object retrieveKenoResult(java.lang.String r6, java.lang.Integer r7, kotlin.coroutines.Continuation<? super com.veso.online.data.model.KenoResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.veso.online.data.repo.XosoRepository$retrieveKenoResult$1
            if (r0 == 0) goto L_0x0014
            r0 = r8
            com.veso.online.data.repo.XosoRepository$retrieveKenoResult$1 r0 = (com.veso.online.data.repo.XosoRepository$retrieveKenoResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            com.veso.online.data.repo.XosoRepository$retrieveKenoResult$1 r0 = new com.veso.online.data.repo.XosoRepository$retrieveKenoResult$1
            r0.<init>(r5, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            com.veso.online.data.repo.XosoRepository$retrieveKenoResult$2 r2 = new com.veso.online.data.repo.XosoRepository$retrieveKenoResult$2
            r4 = 0
            r2.<init>(r6, r7, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0)
            if (r8 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.lang.String r6 = "date: String?, start: In…se::class.java)\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.data.repo.XosoRepository.retrieveKenoResult(java.lang.String, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object retrieveKenoDetail(java.lang.String r6, kotlin.coroutines.Continuation<? super com.veso.online.data.model.KenoResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.veso.online.data.repo.XosoRepository$retrieveKenoDetail$1
            if (r0 == 0) goto L_0x0014
            r0 = r7
            com.veso.online.data.repo.XosoRepository$retrieveKenoDetail$1 r0 = (com.veso.online.data.repo.XosoRepository$retrieveKenoDetail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            com.veso.online.data.repo.XosoRepository$retrieveKenoDetail$1 r0 = new com.veso.online.data.repo.XosoRepository$retrieveKenoDetail$1
            r0.<init>(r5, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            com.veso.online.data.repo.XosoRepository$retrieveKenoDetail$2 r2 = new com.veso.online.data.repo.XosoRepository$retrieveKenoDetail$2
            r4 = 0
            r2.<init>(r6, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.lang.String r6 = "period: String): KenoRes…se::class.java)\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.data.repo.XosoRepository.retrieveKenoDetail(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ String callToEndpoint$default(XosoRepository xosoRepository, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return xosoRepository.callToEndpoint(str, z);
    }

    private final String callToEndpoint(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("http://api");
        int i = endpointIndex;
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        sb.append(".xosohomnay.com");
        try {
            return callApi(Intrinsics.stringPlus(sb.toString(), str));
        } catch (Exception e) {
            if (z) {
                endpointIndex = randomIndex();
                return callToEndpoint(str, false);
            }
            throw e;
        }
    }

    static /* synthetic */ String callToLiveEndpoint$default(XosoRepository xosoRepository, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return xosoRepository.callToLiveEndpoint(str, z);
    }

    private final String callToLiveEndpoint(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("http://live");
        int i = endpointIndex;
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        sb.append(".xosohomnay.com");
        try {
            return callApi(Intrinsics.stringPlus(sb.toString(), str));
        } catch (Exception e) {
            if (z) {
                endpointIndex = randomIndex();
                return callToLiveEndpoint(str, false);
            }
            throw e;
        }
    }

    /* access modifiers changed from: private */
    public final String buildParam(String str, int i, String str2) {
        String str3;
        String str4 = "";
        if (str2 == null || (str3 = Intrinsics.stringPlus("&date=", str2)) == null) {
            str3 = str4;
        }
        if (i != 0) {
            str4 = Intrinsics.stringPlus("&page=", Integer.valueOf(i));
        }
        return "?id=" + str + str4 + str3;
    }

    /* access modifiers changed from: private */
    public final String buildRegionParam(String str, int i, String str2) {
        String str3;
        String str4 = "";
        Date parseDate = DateUtils.INSTANCE.parseDate(str2 == null ? str4 : str2);
        boolean z = true;
        if (parseDate != null && ((int) ((new Date().getTime() - parseDate.getTime()) / ((long) 86400000))) == i) {
            z = false;
        }
        if (str2 == null || (str3 = Intrinsics.stringPlus("&date=", str2)) == null) {
            str3 = str4;
        }
        String stringPlus = i != 0 ? Intrinsics.stringPlus("&page=", Integer.valueOf(i)) : str4;
        StringBuilder sb = new StringBuilder();
        sb.append("?id=");
        sb.append(str);
        if (z) {
            str4 = Intrinsics.stringPlus(stringPlus, str3);
        }
        sb.append(str4);
        return sb.toString();
    }

    private final String callApi(String str) {
        URL url = new URL(str);
        return new String(TextStreamsKt.readBytes(url), Charsets.UTF_8);
    }

    /* access modifiers changed from: private */
    public final LotteryResult parseRegionResult(String str, String str2) {
        JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
        ResultConfig resultConfig = (ResultConfig) getGson().fromJson(asJsonObject.get("cf"), ResultConfig.class);
        JsonObject asJsonObject2 = asJsonObject.get("kq").getAsJsonObject();
        Set<String> keySet = asJsonObject2.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "kq.keySet()");
        Collection arrayList = new ArrayList();
        for (String str3 : keySet) {
            XosoConfig xosoConfig = XosoConfig.Companion.getMapConfigIds().get(str3);
            ResultTraditionLottery resultTraditionLottery = null;
            if (xosoConfig != null) {
                if (xosoConfig.isTraditionLottery()) {
                    XosoRepository xosoRepository = INSTANCE;
                    JsonObject asJsonObject3 = asJsonObject2.get(str3).getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject3, "kq.get(key).asJsonObject");
                    resultTraditionLottery = xosoRepository.parseTraditionResult(asJsonObject3, xosoConfig.getType(), xosoConfig.getId());
                } else {
                    ResultTraditionLottery resultTraditionLottery2 = null;
                }
            }
            if (resultTraditionLottery != null) {
                arrayList.add(resultTraditionLottery);
            }
        }
        return new LotteryResult(resultConfig, (List) arrayList, str2);
    }

    private final List<String> asListString(JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            return CollectionsKt.listOf(jsonElement.getAsString());
        }
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        Intrinsics.checkNotNullExpressionValue(asJsonArray, "this.asJsonArray");
        Iterable<JsonElement> iterable = asJsonArray;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (JsonElement asString : iterable) {
            arrayList.add(asString.getAsString());
        }
        return (List) arrayList;
    }

    /* access modifiers changed from: private */
    public final ResultTraditionLottery parseTraditionResult(JsonObject jsonObject, String str, String str2) {
        Iterable<Number> until = Intrinsics.areEqual((Object) str, (Object) XosoConfig.REGION_ID_NORTH) ? RangesKt.until(0, 8) : RangesKt.downTo(8, 0);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        for (Number intValue : until) {
            int intValue2 = intValue.intValue();
            Integer valueOf = Integer.valueOf(intValue2);
            XosoRepository xosoRepository = INSTANCE;
            JsonElement jsonElement = jsonObject.get(String.valueOf(intValue2));
            Intrinsics.checkNotNullExpressionValue(jsonElement, "get(\"$prizePos\")");
            arrayList.add(new Pair(valueOf, xosoRepository.asListString(jsonElement)));
        }
        String asString = jsonObject.get(SlidableFragment.KEY_DATE).getAsString();
        Intrinsics.checkNotNullExpressionValue(asString, "get(\"date\").asString");
        int asInt = jsonObject.get("live").getAsInt();
        JsonElement jsonElement2 = jsonObject.get("lv");
        Intrinsics.checkNotNullExpressionValue(jsonElement2, "get(\"lv\")");
        return new ResultTraditionLottery((List) arrayList, asString, asInt, asListString(jsonElement2), str2, str);
    }

    private final int randomIndex() {
        return (int) (Math.random() * 3.9d);
    }
}
