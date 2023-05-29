package com.ironsource.mediationsdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u0013\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010<\u001a\u00020\u001d2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u000202HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010#\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\u0004¨\u0006@"}, d2 = {"Lcom/ironsource/mediationsdk/AuctionParams;", "", "adUnit", "", "(Ljava/lang/String;)V", "getAdUnit", "()Ljava/lang/String;", "auctionHistory", "Lcom/ironsource/mediationsdk/AuctionHistory;", "getAuctionHistory", "()Lcom/ironsource/mediationsdk/AuctionHistory;", "setAuctionHistory", "(Lcom/ironsource/mediationsdk/AuctionHistory;)V", "bannerSize", "Lcom/ironsource/mediationsdk/ISBannerSize;", "getBannerSize", "()Lcom/ironsource/mediationsdk/ISBannerSize;", "setBannerSize", "(Lcom/ironsource/mediationsdk/ISBannerSize;)V", "bidders", "", "getBidders", "()Ljava/util/Map;", "setBidders", "(Ljava/util/Map;)V", "instanceId", "getInstanceId", "setInstanceId", "isDemandOnly", "", "()Z", "setDemandOnly", "(Z)V", "isEncryptedResponse", "setEncryptedResponse", "isOneFlow", "setOneFlow", "nonBidders", "", "getNonBidders", "()Ljava/util/List;", "setNonBidders", "(Ljava/util/List;)V", "segment", "Lcom/ironsource/mediationsdk/IronSourceSegment;", "getSegment", "()Lcom/ironsource/mediationsdk/IronSourceSegment;", "setSegment", "(Lcom/ironsource/mediationsdk/IronSourceSegment;)V", "sessionDepth", "", "getSessionDepth", "()I", "setSessionDepth", "(I)V", "waterfallString", "getWaterfallString", "setWaterfallString", "component1", "copy", "equals", "other", "hashCode", "toString", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.ironsource.mediationsdk.k  reason: case insensitive filesystem */
public final class C0026k {
    final String a;
    boolean b;
    boolean c;
    Map<String, Object> d = new HashMap();
    List<String> e = new ArrayList();
    int f = -1;
    ISBannerSize g;
    boolean h;
    private String i = "";
    private String j = "";

    public C0026k(String str) {
        Intrinsics.checkNotNullParameter(str, "adUnit");
        this.a = str;
    }

    public final String a() {
        return this.j;
    }

    public final void a(ISBannerSize iSBannerSize) {
        this.g = iSBannerSize;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.i = str;
    }

    public final void a(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.e = list;
    }

    public final void a(boolean z) {
        this.b = true;
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.j = str;
    }

    public final void b(boolean z) {
        this.c = z;
    }

    public final void c(boolean z) {
        this.h = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0026k) && Intrinsics.areEqual((Object) this.a, (Object) ((C0026k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AuctionParams(adUnit=" + this.a + ')';
    }
}
