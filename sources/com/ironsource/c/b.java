package com.ironsource.c;

import com.ironsource.sdk.e.a.a;
import com.ironsource.sdk.utils.SDKUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"Lcom/ironsource/isadplayer/ISAdPlayerInfo;", "", "()V", "omidLibVersion", "", "omidPartnerVersion", "playerVersion", "isadplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class b {
    public static String a() {
        String sDKVersion = SDKUtils.getSDKVersion();
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }

    public static String b() {
        String str = a.a;
        Intrinsics.checkNotNullExpressionValue(str, "OMID_LIB_VERSION");
        return str;
    }

    public static String c() {
        return "7";
    }
}
