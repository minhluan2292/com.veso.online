package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Comparator;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SessionReportingCoordinator$$ExternalSyntheticLambda1 implements Comparator {
    public static final /* synthetic */ SessionReportingCoordinator$$ExternalSyntheticLambda1 INSTANCE = new SessionReportingCoordinator$$ExternalSyntheticLambda1();

    private /* synthetic */ SessionReportingCoordinator$$ExternalSyntheticLambda1() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((CrashlyticsReport.CustomAttribute) obj).getKey().compareTo(((CrashlyticsReport.CustomAttribute) obj2).getKey());
    }
}
