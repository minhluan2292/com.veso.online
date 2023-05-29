package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class FcmBroadcastProcessor$$ExternalSyntheticLambda0 implements Continuation {
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ Intent f$1;

    public /* synthetic */ FcmBroadcastProcessor$$ExternalSyntheticLambda0(Context context, Intent intent) {
        this.f$0 = context;
        this.f$1 = intent;
    }

    public final Object then(Task task) {
        return FcmBroadcastProcessor.lambda$startMessagingService$2(this.f$0, this.f$1, task);
    }
}
