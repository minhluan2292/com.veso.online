package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CrashlyticsReportPersistence$$ExternalSyntheticLambda1 implements FilenameFilter {
    public static final /* synthetic */ CrashlyticsReportPersistence$$ExternalSyntheticLambda1 INSTANCE = new CrashlyticsReportPersistence$$ExternalSyntheticLambda1();

    private /* synthetic */ CrashlyticsReportPersistence$$ExternalSyntheticLambda1() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("event");
    }
}
