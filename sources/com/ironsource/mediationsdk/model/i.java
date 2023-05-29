package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.c;
import java.util.ArrayList;
import java.util.Iterator;

public final class i {
    public ArrayList<InterstitialPlacement> a;
    public c b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public String g;
    public String h;
    public c i;
    public InterstitialPlacement j;

    public i() {
        this.a = new ArrayList<>();
        this.b = new c();
    }

    public i(int i2, boolean z, int i3, c cVar, c cVar2, int i4) {
        this.a = new ArrayList<>();
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.b = cVar;
        this.i = cVar2;
        this.f = i4;
    }

    public final InterstitialPlacement a() {
        Iterator<InterstitialPlacement> it = this.a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.j;
    }
}
