package com.veso.online.features.main;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/veso/online/features/main/DatePickerDelegate;", "", "selectDate", "", "selectedDate", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: DatePickerDelegate.kt */
public interface DatePickerDelegate {
    void selectDate(String str);

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* compiled from: DatePickerDelegate.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void selectDate$default(DatePickerDelegate datePickerDelegate, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                datePickerDelegate.selectDate(str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectDate");
        }
    }
}
