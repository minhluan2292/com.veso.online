package com.ironsource.mediationsdk.model;

public final class l {
    public boolean a;
    public boolean b;
    public boolean c;
    public m d;
    public int e;
    public int f;

    public static class a {
        public boolean a = true;
        private boolean b = false;
        private boolean c = false;
        private m d = null;
        private int e = 0;
        private int f = 0;

        public final a a(boolean z, int i) {
            this.c = z;
            this.f = i;
            return this;
        }

        public final a a(boolean z, m mVar, int i) {
            this.b = z;
            if (mVar == null) {
                mVar = m.PER_DAY;
            }
            this.d = mVar;
            this.e = i;
            return this;
        }

        public final l a() {
            return new l(this.a, this.b, this.c, this.d, this.e, this.f, (byte) 0);
        }
    }

    private l(boolean z, boolean z2, boolean z3, m mVar, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = mVar;
        this.e = i;
        this.f = i2;
    }

    /* synthetic */ l(boolean z, boolean z2, boolean z3, m mVar, int i, int i2, byte b2) {
        this(z, z2, z3, mVar, i, i2);
    }
}
