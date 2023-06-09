package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.d.c;
import com.iab.omid.library.ironsrc.d.e;
import com.veso.online.features.result.SlidableFragment;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {
    private final boolean a;
    private final Float b;
    private final boolean c;
    private final Position d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        e.a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        e.a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.a);
            if (this.a) {
                jSONObject.put("skipOffset", this.b);
            }
            jSONObject.put("autoPlay", this.c);
            jSONObject.put(SlidableFragment.KEY_POSITION, this.d);
        } catch (JSONException e) {
            c.a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.d;
    }

    public final Float getSkipOffset() {
        return this.b;
    }

    public final boolean isAutoPlay() {
        return this.c;
    }

    public final boolean isSkippable() {
        return this.a;
    }
}
