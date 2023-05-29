package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class P {
    ConcurrentHashMap<String, CopyOnWriteArrayList<N>> a = new ConcurrentHashMap<>();
    String b = "";
    N c;
    ConcurrentHashMap<String, AdInfo> d = new ConcurrentHashMap<>();
    private String e = "";
    private final List<String> f;
    private final int g;
    private final Timer h = new Timer();

    public P(List<String> list, int i) {
        this.f = list;
        this.g = i;
    }

    private synchronized boolean c() {
        N n;
        n = this.c;
        return n != null && n.b.equals(this.e);
    }

    private void d() {
        Iterator<N> it = a().iterator();
        while (it.hasNext()) {
            ac next = it.next();
            if (!next.equals(this.c)) {
                next.d();
            }
        }
    }

    public final AdInfo a(String str) {
        if (this.d.containsKey(str)) {
            return this.d.get(str);
        }
        return null;
    }

    public final CopyOnWriteArrayList<N> a() {
        CopyOnWriteArrayList<N> copyOnWriteArrayList = this.a.get(this.b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final synchronized void a(N n) {
        IronLog.INTERNAL.verbose("");
        N n2 = this.c;
        if (n2 != null && !n2.equals(n)) {
            this.c.d();
        }
        this.c = n;
    }

    public final void a(String str, ImpressionData impressionData) {
        if (!TextUtils.isEmpty(str) && impressionData != null) {
            this.d.put(str, new AdInfo(impressionData));
        }
    }

    public final void a(CopyOnWriteArrayList<N> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        d();
        this.a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.e)) {
            if (c()) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("ad from previous waterfall " + this.e + " is still showing - the current waterfall " + this.b + " will be deleted instead");
                String str2 = this.b;
                this.b = this.e;
                this.e = str2;
            }
            final String str3 = this.e;
            this.h.schedule(new TimerTask() {
                public final void run() {
                    try {
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.verbose("removing waterfall with id " + str3 + " from memory");
                        P.this.a.remove(str3);
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.verbose("waterfall size is currently " + P.this.a.size());
                        IronLog ironLog3 = IronLog.INTERNAL;
                        ironLog3.verbose("removing adInfo with id " + str3 + " from memory");
                        P.this.d.remove(str3);
                        IronLog ironLog4 = IronLog.INTERNAL;
                        ironLog4.verbose("adInfo size is currently " + P.this.d.size());
                    } finally {
                        cancel();
                    }
                }
            }, (long) this.g);
        }
        this.e = this.b;
        this.b = str;
    }

    public final boolean b() {
        return this.a.size() > 5;
    }

    public final synchronized boolean b(N n) {
        boolean z;
        IronLog.INTERNAL.verbose("");
        if (n != null) {
            if (this.c != null) {
                if (n.c() != LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK || !this.c.l().equals(n.l())) {
                    if ((n.c() == LoadWhileShowSupportState.NONE || this.f.contains(n.m())) && this.c.m().equals(n.m())) {
                    }
                }
            }
            z = false;
            if (z && n != null) {
                IronLog.INTERNAL.verbose(n.l() + " does not support load while show and will not be added to the auction request");
            }
        }
        z = true;
        IronLog.INTERNAL.verbose(n.l() + " does not support load while show and will not be added to the auction request");
        return !z;
    }
}
