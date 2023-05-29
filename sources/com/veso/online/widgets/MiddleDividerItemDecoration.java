package com.veso.online.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J(\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\nJ\u000e\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/veso/online/widgets/MiddleDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "orientation", "", "(Landroid/content/Context;I)V", "mBounds", "Landroid/graphics/Rect;", "mDivider", "Landroid/graphics/drawable/Drawable;", "mOrientation", "drawHorizontal", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "drawVertical", "getItemOffsets", "outRect", "view", "Landroid/view/View;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", "c", "setDividerColor", "color", "setDrawable", "drawable", "setOrientation", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: MiddleDividerItemDecoration.kt */
public final class MiddleDividerItemDecoration extends RecyclerView.ItemDecoration {
    /* access modifiers changed from: private */
    public static final int ALL = 2;
    private static final int[] ATTRS = {16843284};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int HORIZONTAL = 0;
    private static final String TAG = "DividerItem";
    /* access modifiers changed from: private */
    public static final int VERTICAL = 1;
    private final Rect mBounds = new Rect();
    private Drawable mDivider;
    private int mOrientation;

    public MiddleDividerItemDecoration(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttributes(ATTRS)");
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.mDivider = drawable;
        if (drawable == null) {
            Log.w(TAG, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        setOrientation(i);
    }

    public final void setDividerColor(int i) {
        Drawable drawable = this.mDivider;
        Intrinsics.checkNotNull(drawable);
        drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
    }

    public final void setOrientation(int i) {
        if (i == HORIZONTAL || i == VERTICAL || i == ALL) {
            this.mOrientation = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public final void setDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.mDivider = drawable;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (recyclerView.getLayoutManager() != null && this.mDivider != null) {
            int i = this.mOrientation;
            if (i == ALL) {
                drawVertical(canvas, recyclerView);
                drawHorizontal(canvas, recyclerView);
            } else if (i == VERTICAL) {
                drawVertical(canvas, recyclerView);
            } else {
                drawHorizontal(canvas, recyclerView);
            }
        }
    }

    private final void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        int i3 = 0;
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int spanCount = childCount % ((GridLayoutManager) layoutManager).getSpanCount();
            if (spanCount == 0) {
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                Objects.requireNonNull(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                spanCount = ((GridLayoutManager) layoutManager2).getSpanCount();
            }
            childCount -= spanCount;
        }
        int i4 = childCount - 1;
        while (i3 < i4) {
            int i5 = i3 + 1;
            View childAt = recyclerView.getChildAt(i3);
            if (childAt != null) {
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.mBounds);
                int round = this.mBounds.bottom + Math.round(childAt.getTranslationY());
                Drawable drawable = this.mDivider;
                Intrinsics.checkNotNull(drawable);
                Drawable drawable2 = this.mDivider;
                Intrinsics.checkNotNull(drawable2);
                drawable2.setBounds(i2, round - drawable.getIntrinsicHeight(), i, round);
                Drawable drawable3 = this.mDivider;
                Intrinsics.checkNotNull(drawable3);
                drawable3.draw(canvas);
                i3 = i5;
            } else {
                return;
            }
        }
        canvas.restore();
    }

    private final void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        int i3 = 0;
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            childCount = ((GridLayoutManager) layoutManager).getSpanCount();
        }
        int i4 = childCount - 1;
        while (i3 < i4) {
            int i5 = i3 + 1;
            View childAt = recyclerView.getChildAt(i3);
            if (childAt != null) {
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager2);
                layoutManager2.getDecoratedBoundsWithMargins(childAt, this.mBounds);
                int round = this.mBounds.right + Math.round(childAt.getTranslationX());
                Drawable drawable = this.mDivider;
                Intrinsics.checkNotNull(drawable);
                Drawable drawable2 = this.mDivider;
                Intrinsics.checkNotNull(drawable2);
                drawable2.setBounds(round - drawable.getIntrinsicWidth(), i2, round, i);
                Drawable drawable3 = this.mDivider;
                Intrinsics.checkNotNull(drawable3);
                drawable3.draw(canvas);
                i3 = i5;
            } else {
                return;
            }
        }
        canvas.restore();
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Drawable drawable = this.mDivider;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.mOrientation == VERTICAL) {
            Intrinsics.checkNotNull(drawable);
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            Intrinsics.checkNotNull(drawable);
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/veso/online/widgets/MiddleDividerItemDecoration$Companion;", "", "()V", "ALL", "", "getALL", "()I", "ATTRS", "", "HORIZONTAL", "getHORIZONTAL", "TAG", "", "VERTICAL", "getVERTICAL", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: MiddleDividerItemDecoration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getHORIZONTAL() {
            return MiddleDividerItemDecoration.HORIZONTAL;
        }

        public final int getVERTICAL() {
            return MiddleDividerItemDecoration.VERTICAL;
        }

        public final int getALL() {
            return MiddleDividerItemDecoration.ALL;
        }
    }
}
