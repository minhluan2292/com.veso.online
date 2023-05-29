package com.ironsource.mediationsdk.adunit.b;

import java.util.HashMap;

public final class g extends f {
    public g(d dVar) {
        super(dVar);
    }

    public final void a() {
        a(b.INIT_STARTED);
    }

    public final void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        a(b.INIT_ENDED, hashMap);
    }
}
