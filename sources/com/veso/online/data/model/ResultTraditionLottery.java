package com.veso.online.data.model;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.veso.online.features.result.SlidableFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BS\u0012\u001e\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ!\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003Jc\u0010\u001e\u001a\u00020\u00002 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0006\u0010$\u001a\u00020 J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060&J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006("}, d2 = {"Lcom/veso/online/data/model/ResultTraditionLottery;", "Lcom/veso/online/data/model/ResultDetail;", "prizes", "", "Lkotlin/Pair;", "", "", "date", "live", "lv", "id", "regionId", "(Ljava/util/List;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getId", "getLive", "()I", "getLv", "()Ljava/util/List;", "getPrizes", "getRegionId", "ticketType", "getTicketType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "isComplete", "lotoDauDuoi", "", "toString", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ResultTraditionLottery.kt */
public final class ResultTraditionLottery implements ResultDetail {
    private final String date;
    private final String id;
    private final int live;
    private final List<String> lv;
    private final List<Pair<Integer, List<String>>> prizes;
    private final String regionId;
    private final String ticketType;

    public static /* synthetic */ ResultTraditionLottery copy$default(ResultTraditionLottery resultTraditionLottery, List<Pair<Integer, List<String>>> list, String str, int i, List<String> list2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = resultTraditionLottery.prizes;
        }
        if ((i2 & 2) != 0) {
            str = resultTraditionLottery.date;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            i = resultTraditionLottery.live;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list2 = resultTraditionLottery.lv;
        }
        List<String> list3 = list2;
        if ((i2 & 16) != 0) {
            str2 = resultTraditionLottery.id;
        }
        String str5 = str2;
        if ((i2 & 32) != 0) {
            str3 = resultTraditionLottery.regionId;
        }
        return resultTraditionLottery.copy(list, str4, i3, list3, str5, str3);
    }

    public final List<Pair<Integer, List<String>>> component1() {
        return this.prizes;
    }

    public final String component2() {
        return this.date;
    }

    public final int component3() {
        return this.live;
    }

    public final List<String> component4() {
        return this.lv;
    }

    public final String component5() {
        return this.id;
    }

    public final String component6() {
        return this.regionId;
    }

    public final ResultTraditionLottery copy(List<? extends Pair<Integer, ? extends List<String>>> list, String str, int i, List<String> list2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(list, "prizes");
        Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(list2, "lv");
        Intrinsics.checkNotNullParameter(str2, FacebookMediationAdapter.KEY_ID);
        Intrinsics.checkNotNullParameter(str3, "regionId");
        return new ResultTraditionLottery(list, str, i, list2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTraditionLottery)) {
            return false;
        }
        ResultTraditionLottery resultTraditionLottery = (ResultTraditionLottery) obj;
        return Intrinsics.areEqual((Object) this.prizes, (Object) resultTraditionLottery.prizes) && Intrinsics.areEqual((Object) this.date, (Object) resultTraditionLottery.date) && this.live == resultTraditionLottery.live && Intrinsics.areEqual((Object) this.lv, (Object) resultTraditionLottery.lv) && Intrinsics.areEqual((Object) this.id, (Object) resultTraditionLottery.id) && Intrinsics.areEqual((Object) this.regionId, (Object) resultTraditionLottery.regionId);
    }

    public int hashCode() {
        return (((((((((this.prizes.hashCode() * 31) + this.date.hashCode()) * 31) + this.live) * 31) + this.lv.hashCode()) * 31) + this.id.hashCode()) * 31) + this.regionId.hashCode();
    }

    public String toString() {
        return "ResultTraditionLottery(prizes=" + this.prizes + ", date=" + this.date + ", live=" + this.live + ", lv=" + this.lv + ", id=" + this.id + ", regionId=" + this.regionId + ')';
    }

    public ResultTraditionLottery(List<? extends Pair<Integer, ? extends List<String>>> list, String str, int i, List<String> list2, String str2, String str3) {
        List<String> list3 = list2;
        String str4 = str3;
        Intrinsics.checkNotNullParameter(list, "prizes");
        Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(list2, "lv");
        Intrinsics.checkNotNullParameter(str2, FacebookMediationAdapter.KEY_ID);
        Intrinsics.checkNotNullParameter(str4, "regionId");
        this.prizes = list;
        this.date = str;
        this.live = i;
        this.lv = list3;
        this.id = str2;
        this.regionId = str4;
        this.ticketType = CollectionsKt.joinToString$default(list3, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public final List<Pair<Integer, List<String>>> getPrizes() {
        return this.prizes;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getLive() {
        return this.live;
    }

    public final List<String> getLv() {
        return this.lv;
    }

    public final String getId() {
        return this.id;
    }

    public final String getRegionId() {
        return this.regionId;
    }

    public final Map<Integer, String> lotoDauDuoi() {
        Collection arrayList = new ArrayList();
        for (Pair second : this.prizes) {
            CollectionsKt.addAll(arrayList, (List) second.getSecond());
        }
        Collection arrayList2 = new ArrayList();
        for (String str : (List) arrayList) {
            if (str.length() > 2) {
                str = str.substring(str.length() - 2);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
            }
            Integer intOrNull = StringsKt.toIntOrNull(str);
            if (intOrNull != null) {
                arrayList2.add(intOrNull);
            }
        }
        Map linkedHashMap = new LinkedHashMap();
        for (Object next : CollectionsKt.distinct((List) arrayList2)) {
            Integer valueOf = Integer.valueOf(((Number) next).intValue() / 10);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(next);
        }
        Map<Integer, String> linkedHashMap2 = new LinkedHashMap<>(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), CollectionsKt.joinToString$default((Iterable) entry.getValue(), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, ResultTraditionLottery$lotoDauDuoi$4$1.INSTANCE, 30, (Object) null));
        }
        return linkedHashMap2;
    }

    public final String getTicketType() {
        return this.ticketType;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isComplete() {
        /*
            r7 = this;
            java.util.List<kotlin.Pair<java.lang.Integer, java.util.List<java.lang.String>>> r0 = r7.prizes
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0015
        L_0x0013:
            r2 = r3
            goto L_0x0068
        L_0x0015:
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0013
            java.lang.Object r1 = r0.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r1 = r1.getSecond()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L_0x003a
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x003a
        L_0x0038:
            r1 = r3
            goto L_0x0066
        L_0x003a:
            java.util.Iterator r1 = r1.iterator()
        L_0x003e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0038
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = r2
        L_0x004d:
            int r6 = r4.length()
            if (r5 >= r6) goto L_0x0062
            char r6 = r4.charAt(r5)
            boolean r6 = java.lang.Character.isDigit(r6)
            if (r6 != 0) goto L_0x005f
            r4 = r2
            goto L_0x0063
        L_0x005f:
            int r5 = r5 + 1
            goto L_0x004d
        L_0x0062:
            r4 = r3
        L_0x0063:
            if (r4 != 0) goto L_0x003e
            r1 = r2
        L_0x0066:
            if (r1 != 0) goto L_0x0019
        L_0x0068:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.data.model.ResultTraditionLottery.isComplete():boolean");
    }
}
