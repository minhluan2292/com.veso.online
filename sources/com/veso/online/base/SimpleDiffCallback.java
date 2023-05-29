package com.veso.online.base;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/veso/online/base/SimpleDiffCallback;", "T", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areItemsTheSame", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: SimpleDiffCallback.kt */
public final class SimpleDiffCallback<T> extends DiffUtil.ItemCallback<T> {
    public boolean areItemsTheSame(T t, T t2) {
        return Intrinsics.areEqual((Object) t, (Object) t2);
    }

    public boolean areContentsTheSame(T t, T t2) {
        return Intrinsics.areEqual((Object) t, (Object) t2);
    }
}
