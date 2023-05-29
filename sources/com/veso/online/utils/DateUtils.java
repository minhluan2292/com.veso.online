package com.veso.online.utils;

import com.veso.online.features.result.SlidableFragment;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/veso/online/utils/DateUtils;", "", "()V", "dateFormat", "Ljava/text/SimpleDateFormat;", "format", "", "kotlin.jvm.PlatformType", "date", "Ljava/util/Date;", "parseDate", "dateStr", "secondToDate", "second", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: DateUtils.kt */
public final class DateUtils {
    public static final DateUtils INSTANCE = new DateUtils();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    private DateUtils() {
    }

    public final Date parseDate(String str) {
        Intrinsics.checkNotNullParameter(str, "dateStr");
        try {
            return dateFormat.parse(str);
        } catch (Exception unused) {
            Date date = null;
            return null;
        }
    }

    public final Date secondToDate(long j) {
        return new Date(j * ((long) 1000));
    }

    public final String format(Date date) {
        Intrinsics.checkNotNullParameter(date, SlidableFragment.KEY_DATE);
        return dateFormat.format(date);
    }
}
