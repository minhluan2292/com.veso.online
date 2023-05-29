package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CrashlyticsReportPersistence$$ExternalSyntheticLambda0 implements FilenameFilter {
    public static final /* synthetic */ CrashlyticsReportPersistence$$ExternalSyntheticLambda0 INSTANCE = new CrashlyticsReportPersistence$$ExternalSyntheticLambda0();

    private /* synthetic */ CrashlyticsReportPersistence$$ExternalSyntheticLambda0() {
    }

    public final boolean accept(File file, String str) {
        return CrashlyticsReportPersistence.isNormalPriorityEventFile(file, str);
    }
}
