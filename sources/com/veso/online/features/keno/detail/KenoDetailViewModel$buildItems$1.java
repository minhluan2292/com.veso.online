package com.veso.online.features.keno.detail;

import com.google.gson.JsonObject;
import com.veso.online.data.model.KenoAdsItem;
import com.veso.online.data.model.KenoPrizeRow;
import com.veso.online.data.model.KenoPrizeSection;
import com.veso.online.data.model.KenoPrizeTableHeader;
import com.veso.online.data.model.KenoPrizeTableLoading;
import com.veso.online.data.model.KenoResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.veso.online.features.keno.detail.KenoDetailViewModel$buildItems$1", f = "KenoDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: KenoDetailViewModel.kt */
final class KenoDetailViewModel$buildItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ KenoResult $data;
    int label;
    final /* synthetic */ KenoDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KenoDetailViewModel$buildItems$1(KenoResult kenoResult, KenoDetailViewModel kenoDetailViewModel, Continuation<? super KenoDetailViewModel$buildItems$1> continuation) {
        super(2, continuation);
        this.$data = kenoResult;
        this.this$0 = kenoDetailViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KenoDetailViewModel$buildItems$1(this.$data, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KenoDetailViewModel$buildItems$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List arrayList = new ArrayList();
            arrayList.add(this.$data);
            arrayList.add(new KenoAdsItem());
            arrayList.add(new KenoPrizeTableHeader());
            if (this.$data.getSltrung() == null) {
                arrayList.add(new KenoPrizeTableLoading());
            } else {
                JsonObject sltrung = this.$data.getSltrung();
                try {
                    Set<String> keySet = sltrung.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "prizes.keySet()");
                    KenoDetailViewModel kenoDetailViewModel = this.this$0;
                    for (String str : CollectionsKt.sortedWith(CollectionsKt.toList(keySet), new KenoDetailViewModel$buildItems$1$invokeSuspend$$inlined$sortedByDescending$1())) {
                        Intrinsics.checkNotNullExpressionValue(str, "key");
                        arrayList.add(new KenoPrizeSection(Integer.parseInt(StringsKt.replace$default(str, "c", "", false, 4, (Object) null))));
                        JsonObject asJsonObject = kenoDetailViewModel.getPrizeSchema().getAsJsonObject(str);
                        JsonObject asJsonObject2 = sltrung.getAsJsonObject(str);
                        Set<String> keySet2 = asJsonObject2.keySet();
                        Intrinsics.checkNotNullExpressionValue(keySet2, "sectionPrize.keySet()");
                        for (String str2 : CollectionsKt.sortedWith(keySet2, new KenoDetailViewModel$buildItems$1$invokeSuspend$lambda3$$inlined$sortedByDescending$1())) {
                            Intrinsics.checkNotNullExpressionValue(str2, "keySame");
                            int parseInt = Integer.parseInt(StringsKt.replace$default(str2, "t", "", false, 4, (Object) null));
                            int asInt = asJsonObject2.get(str2).getAsInt();
                            String asString = asJsonObject.get(str2).getAsString();
                            Intrinsics.checkNotNullExpressionValue(asString, "sectionSchema.get(keySame).asString");
                            arrayList.add(new KenoPrizeRow(parseInt, asInt, asString));
                        }
                    }
                } catch (Exception unused) {
                    arrayList.add(new KenoPrizeTableLoading());
                }
            }
            this.this$0._kenoItems.postValue(arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
