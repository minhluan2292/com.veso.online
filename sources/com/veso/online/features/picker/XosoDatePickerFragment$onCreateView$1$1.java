package com.veso.online.features.picker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/veso/online/features/picker/DateItem;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoDatePickerFragment.kt */
final class XosoDatePickerFragment$onCreateView$1$1 extends Lambda implements Function1<DateItem, Unit> {
    final /* synthetic */ XosoDatePickerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XosoDatePickerFragment$onCreateView$1$1(XosoDatePickerFragment xosoDatePickerFragment) {
        super(1);
        this.this$0 = xosoDatePickerFragment;
    }

    public final void invoke(DateItem dateItem) {
        Intrinsics.checkNotNullParameter(dateItem, "it");
        this.this$0.handleItemSelected(dateItem);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DateItem) obj);
        return Unit.INSTANCE;
    }
}
