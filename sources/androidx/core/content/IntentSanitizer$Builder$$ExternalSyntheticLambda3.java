package androidx.core.content;

import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class IntentSanitizer$Builder$$ExternalSyntheticLambda3 implements Predicate {
    public static final /* synthetic */ IntentSanitizer$Builder$$ExternalSyntheticLambda3 INSTANCE = new IntentSanitizer$Builder$$ExternalSyntheticLambda3();

    private /* synthetic */ IntentSanitizer$Builder$$ExternalSyntheticLambda3() {
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return IntentSanitizer.Builder.lambda$new$6((Uri) obj);
    }
}
