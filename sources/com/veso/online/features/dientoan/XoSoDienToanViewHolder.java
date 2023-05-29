package com.veso.online.features.dientoan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.veso.online.R;
import com.veso.online.data.model.XoSoDienToan;
import com.veso.online.data.model.XoSoDienToanResult;
import com.veso.online.databinding.LayoutDienToanItemBinding;
import com.veso.online.databinding.LayoutMegaBallBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0016\u0010\u0011\u001a\u00020\u0006*\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/veso/online/features/dientoan/XoSoDienToanViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/veso/online/databinding/LayoutDienToanItemBinding;", "(Lcom/veso/online/databinding/LayoutDienToanItemBinding;)V", "bindData", "", "data", "Lcom/veso/online/data/model/XoSoDienToanResult;", "selectCharRes", "", "index", "show123", "result", "Lcom/veso/online/data/model/XoSoDienToan;", "show636", "showThanTai", "addSketchView", "Landroid/widget/LinearLayout;", "weight", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XoSoDienToanAdapter.kt */
public final class XoSoDienToanViewHolder extends RecyclerView.ViewHolder {
    private final LayoutDienToanItemBinding binding;

    private final int selectCharRes(int i) {
        return i != 0 ? i != 1 ? i != 2 ? R.drawable.ic_ball_pink : R.drawable.ic_ball_green : R.drawable.ic_ball_blue : R.drawable.ic_ball_yellow;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XoSoDienToanViewHolder(LayoutDienToanItemBinding layoutDienToanItemBinding) {
        super(layoutDienToanItemBinding.getRoot());
        Intrinsics.checkNotNullParameter(layoutDienToanItemBinding, "binding");
        this.binding = layoutDienToanItemBinding;
    }

    public final void bindData(XoSoDienToanResult xoSoDienToanResult) {
        Intrinsics.checkNotNullParameter(xoSoDienToanResult, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.binding.tvDienToanDate.setText(xoSoDienToanResult.getDate());
        show123(xoSoDienToanResult.getDienToanMb().getDienToan123());
        show636(xoSoDienToanResult.getDienToanMb().getDienToan636());
        showThanTai(xoSoDienToanResult.getDienToanMb().getThanTai());
    }

    private final void show123(XoSoDienToan xoSoDienToan) {
        TextView textView = this.binding.tvDienToan123;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvDienToan123");
        int i = 8;
        textView.setVisibility(xoSoDienToan != null ? 0 : 8);
        LinearLayout linearLayout = this.binding.llDienToan123;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llDienToan123");
        View view = linearLayout;
        if (xoSoDienToan != null) {
            i = 0;
        }
        view.setVisibility(i);
        List<String> results = xoSoDienToan == null ? null : xoSoDienToan.results();
        if (results != null) {
            LinearLayout linearLayout2 = this.binding.llDienToan123;
            linearLayout2.removeAllViews();
            LayoutInflater from = LayoutInflater.from(linearLayout2.getContext());
            int dimensionPixelSize = linearLayout2.getResources().getDimensionPixelSize(R.dimen.layout_padding_small);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            addSketchView$default(this, linearLayout2, 0.0f, 1, (Object) null);
            int i2 = 0;
            for (Object next : results) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) next;
                if (i2 > 0) {
                    addSketchView(linearLayout2, 2.0f);
                }
                CharSequence charSequence = str;
                int i4 = 0;
                int i5 = 0;
                while (i4 < charSequence.length()) {
                    char charAt = charSequence.charAt(i4);
                    int i6 = i5 + 1;
                    TextView root = LayoutMegaBallBinding.inflate(from, linearLayout2, true).getRoot();
                    root.setText(String.valueOf(charAt));
                    root.setBackgroundResource(selectCharRes(i2));
                    if (i5 > 0) {
                        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMarginStart(dimensionPixelSize);
                        }
                    }
                    i4++;
                    i5 = i6;
                }
                i2 = i3;
            }
            addSketchView$default(this, linearLayout2, 0.0f, 1, (Object) null);
        }
    }

    private final void show636(XoSoDienToan xoSoDienToan) {
        TextView textView = this.binding.tvDienToan636;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvDienToan636");
        int i = 0;
        int i2 = 8;
        textView.setVisibility(xoSoDienToan != null ? 0 : 8);
        LinearLayout linearLayout = this.binding.llDienToan636;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llDienToan636");
        View view = linearLayout;
        if (xoSoDienToan != null) {
            i2 = 0;
        }
        view.setVisibility(i2);
        List<String> results = xoSoDienToan == null ? null : xoSoDienToan.results();
        if (results != null) {
            LinearLayout linearLayout2 = this.binding.llDienToan636;
            linearLayout2.removeAllViews();
            int dimensionPixelSize = linearLayout2.getResources().getDimensionPixelSize(R.dimen.layout_padding_small);
            LayoutInflater from = LayoutInflater.from(linearLayout2.getContext());
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            addSketchView$default(this, linearLayout2, 0.0f, 1, (Object) null);
            for (Object next : results) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                TextView root = LayoutMegaBallBinding.inflate(from, linearLayout2, true).getRoot();
                root.setText((String) next);
                root.setBackgroundResource(R.drawable.ic_ball_pink);
                if (i > 0) {
                    ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMarginStart(dimensionPixelSize);
                    }
                }
                i = i3;
            }
            addSketchView$default(this, linearLayout2, 0.0f, 1, (Object) null);
        }
    }

    private final void showThanTai(XoSoDienToan xoSoDienToan) {
        TextView textView = this.binding.tvDienToanThanTai;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvDienToanThanTai");
        int i = 8;
        textView.setVisibility(xoSoDienToan != null ? 0 : 8);
        LinearLayout linearLayout = this.binding.llDienToanThanTai;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llDienToanThanTai");
        View view = linearLayout;
        if (xoSoDienToan != null) {
            i = 0;
        }
        view.setVisibility(i);
        List<String> results = xoSoDienToan == null ? null : xoSoDienToan.results();
        if (results != null) {
            LinearLayout linearLayout2 = this.binding.llDienToanThanTai;
            linearLayout2.removeAllViews();
            LayoutInflater from = LayoutInflater.from(linearLayout2.getContext());
            int dimensionPixelSize = linearLayout2.getResources().getDimensionPixelSize(R.dimen.layout_padding_small);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            addSketchView$default(this, linearLayout2, 0.0f, 1, (Object) null);
            int i2 = 0;
            for (Object next : results) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) next;
                if (i2 > 0) {
                    addSketchView(linearLayout2, 2.0f);
                }
                CharSequence charSequence = str;
                int i4 = 0;
                int i5 = 0;
                while (i4 < charSequence.length()) {
                    char charAt = charSequence.charAt(i4);
                    int i6 = i5 + 1;
                    TextView root = LayoutMegaBallBinding.inflate(from, linearLayout2, true).getRoot();
                    root.setText(String.valueOf(charAt));
                    root.setBackgroundResource(selectCharRes(i5));
                    if (i5 > 0) {
                        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMarginStart(dimensionPixelSize);
                        }
                    }
                    i4++;
                    i5 = i6;
                }
                i2 = i3;
            }
            addSketchView$default(this, linearLayout2, 0.0f, 1, (Object) null);
        }
    }

    static /* synthetic */ void addSketchView$default(XoSoDienToanViewHolder xoSoDienToanViewHolder, LinearLayout linearLayout, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        xoSoDienToanViewHolder.addSketchView(linearLayout, f);
    }

    private final void addSketchView(LinearLayout linearLayout, float f) {
        linearLayout.addView(new View(linearLayout.getContext()), new LinearLayout.LayoutParams(0, 1, f));
    }
}
