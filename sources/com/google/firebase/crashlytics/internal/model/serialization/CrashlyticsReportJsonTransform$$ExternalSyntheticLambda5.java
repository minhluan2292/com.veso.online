package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CrashlyticsReportJsonTransform$$ExternalSyntheticLambda5 implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ CrashlyticsReportJsonTransform$$ExternalSyntheticLambda5 INSTANCE = new CrashlyticsReportJsonTransform$$ExternalSyntheticLambda5();

    private /* synthetic */ CrashlyticsReportJsonTransform$$ExternalSyntheticLambda5() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseCustomAttribute(jsonReader);
    }
}
