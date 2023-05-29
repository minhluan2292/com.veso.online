package com.ironsource.mediationsdk.model;

public class InterstitialPlacement {
    private int a;
    private String b;
    private boolean c;
    private l d;

    public InterstitialPlacement(int i, String str, boolean z, l lVar) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = lVar;
    }

    public l getPlacementAvailabilitySettings() {
        return this.d;
    }

    public int getPlacementId() {
        return this.a;
    }

    public String getPlacementName() {
        return this.b;
    }

    public boolean isDefault() {
        return this.c;
    }

    public String toString() {
        return "placement name: " + this.b;
    }
}
