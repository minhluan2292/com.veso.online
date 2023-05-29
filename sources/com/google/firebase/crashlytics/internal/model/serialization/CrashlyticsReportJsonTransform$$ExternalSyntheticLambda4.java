package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CrashlyticsReportJsonTransform$$ExternalSyntheticLambda4 implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ CrashlyticsReportJsonTransform$$ExternalSyntheticLambda4 INSTANCE = new CrashlyticsReportJsonTransform$$ExternalSyntheticLambda4();

    private /* synthetic */ CrashlyticsReportJsonTransform$$ExternalSyntheticLambda4() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventBinaryImage(jsonReader);
    }
}
