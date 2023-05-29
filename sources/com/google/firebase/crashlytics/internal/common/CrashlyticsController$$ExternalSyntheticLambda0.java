package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CrashlyticsController$$ExternalSyntheticLambda0 implements FilenameFilter {
    public static final /* synthetic */ CrashlyticsController$$ExternalSyntheticLambda0 INSTANCE = new CrashlyticsController$$ExternalSyntheticLambda0();

    private /* synthetic */ CrashlyticsController$$ExternalSyntheticLambda0() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(CrashlyticsController.APP_EXCEPTION_MARKER_PREFIX);
    }
}
