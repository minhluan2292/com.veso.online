package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.util.Comparator;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CrashlyticsReportPersistence$$ExternalSyntheticLambda3 implements Comparator {
    public static final /* synthetic */ CrashlyticsReportPersistence$$ExternalSyntheticLambda3 INSTANCE = new CrashlyticsReportPersistence$$ExternalSyntheticLambda3();

    private /* synthetic */ CrashlyticsReportPersistence$$ExternalSyntheticLambda3() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
