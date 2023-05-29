package com.ironsource.mediationsdk.model;

import com.ironsource.sdk.c.d;

public enum m {
    PER_DAY(d.a),
    PER_HOUR("h");
    
    public String c;

    private m(String str) {
        this.c = str;
    }

    public final String toString() {
        return this.c;
    }
}
