package com.ironsource.mediationsdk.adunit.c.b;

public final class a {
    public C0009a a;
    public long b;
    public long c;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.b.a$a  reason: collision with other inner class name */
    public enum C0009a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public a(C0009a aVar, long j, long j2) {
        this.a = aVar;
        this.b = j;
        this.c = j2;
    }

    public final boolean a() {
        return this.a == C0009a.MANUAL || this.a == C0009a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }

    public final boolean b() {
        return this.a == C0009a.AUTOMATIC_LOAD_AFTER_CLOSE || this.a == C0009a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}
