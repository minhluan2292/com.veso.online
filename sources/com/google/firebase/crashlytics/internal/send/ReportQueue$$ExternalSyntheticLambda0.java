package com.google.firebase.crashlytics.internal.send;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ReportQueue$$ExternalSyntheticLambda0 implements TransportScheduleCallback {
    public final /* synthetic */ TaskCompletionSource f$0;
    public final /* synthetic */ CrashlyticsReportWithSessionId f$1;

    public /* synthetic */ ReportQueue$$ExternalSyntheticLambda0(TaskCompletionSource taskCompletionSource, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        this.f$0 = taskCompletionSource;
        this.f$1 = crashlyticsReportWithSessionId;
    }

    public final void onSchedule(Exception exc) {
        ReportQueue.lambda$sendReport$0(this.f$0, this.f$1, exc);
    }
}
