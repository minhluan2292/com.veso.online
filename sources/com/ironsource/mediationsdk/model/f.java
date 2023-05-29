package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.c;
import java.util.ArrayList;
import java.util.Iterator;

public final class f {
    public c a;
    public long b;
    public ArrayList<g> c;
    public g d;
    public int e;
    public int f;
    public c g;
    public boolean h;
    private int i;

    public f() {
        this.a = new c();
        this.c = new ArrayList<>();
    }

    public f(int i2, long j, c cVar, int i3, c cVar2, int i4, boolean z) {
        this.c = new ArrayList<>();
        this.i = i2;
        this.b = j;
        this.a = cVar;
        this.e = i3;
        this.f = i4;
        this.g = cVar2;
        this.h = z;
    }

    public final g a() {
        Iterator<g> it = this.c.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.d;
    }

    public final g a(String str) {
        Iterator<g> it = this.c.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
