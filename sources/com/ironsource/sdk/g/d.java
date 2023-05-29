package com.ironsource.sdk.g;

import android.text.TextUtils;
import java.util.HashSet;

public class d {
    private boolean a = false;
    private HashSet<String> b = new HashSet<>();
    private String c;
    private String d;
    private boolean e = false;
    private int f;
    private boolean g = true;

    public enum a {
        ;
        
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;

        static {
            d = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[]) d.clone();
        }
    }

    public enum b {
        None,
        Loaded,
        Ready,
        Failed
    }

    public enum c {
        Web,
        Native,
        None
    }

    /* renamed from: com.ironsource.sdk.g.d$d  reason: collision with other inner class name */
    public enum C0014d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);
        
        public int d;

        private C0014d(int i) {
            this.d = i;
        }
    }

    public enum e {
        Banner,
        OfferWall,
        Interstitial,
        OfferWallCredits,
        RewardedVideo,
        None
    }

    public HashSet<String> a() {
        return this.b;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.b.add(str);
        }
    }

    public void a(boolean z) {
        this.a = z;
    }

    public void b(String str) {
        this.c = str;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public boolean b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public void c(String str) {
        this.d = str;
    }

    public void c(boolean z) {
        this.g = z;
    }

    public String d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }
}
