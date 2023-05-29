package com.veso.online.utils;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.veso.online.R;
import com.veso.online.data.model.KenoResult;
import com.veso.online.data.model.LoadingState;
import com.veso.online.data.model.VietlotResultItem;
import com.veso.online.databinding.LayoutFragmentLoadingBinding;
import com.veso.online.databinding.LayoutMegaBallBinding;
import com.veso.online.databinding.LayoutSingleActionHeaderBinding;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u001a\u0010\n\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e\u001a\u001a\u0010\u000f\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u0011\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0001X\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u0002"}, d2 = {"NUM_OF_COL", "", "initState", "", "Lcom/veso/online/databinding/LayoutSingleActionHeaderBinding;", "titleRes", "populateKenoBalls", "Lcom/veso/online/data/model/KenoResult;", "ballHosted", "Landroid/widget/LinearLayout;", "populateMegaBalls", "Lcom/veso/online/data/model/VietlotResultItem;", "parent", "isPower655", "", "populateResultTable", "Landroidx/gridlayout/widget/GridLayout;", "setState", "Lcom/veso/online/databinding/LayoutFragmentLoadingBinding;", "state", "Lcom/veso/online/data/model/LoadingState;", "app_release", "powerBallSize", "powerBallTextSize", ""}, k = 2, mv = {1, 6, 0}, xi = 48)
/* compiled from: ViewBindingExt.kt */
public final class ViewBindingExtKt {
    private static final int NUM_OF_COL = 7;

    public static final void setState(LayoutFragmentLoadingBinding layoutFragmentLoadingBinding, LoadingState loadingState) {
        Intrinsics.checkNotNullParameter(layoutFragmentLoadingBinding, "<this>");
        Intrinsics.checkNotNullParameter(loadingState, "state");
        LinearLayout root = layoutFragmentLoadingBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "root");
        boolean z = true;
        int i = 0;
        root.setVisibility(loadingState == LoadingState.LOADING || loadingState == LoadingState.ERROR ? 0 : 8);
        ProgressBar progressBar = layoutFragmentLoadingBinding.pbLoading;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        View view = progressBar;
        if (loadingState != LoadingState.LOADING) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        layoutFragmentLoadingBinding.tvInfo.setText(loadingState == LoadingState.ERROR ? R.string.error_and_retry : R.string.fetching_data);
    }

    public static final void initState(LayoutSingleActionHeaderBinding layoutSingleActionHeaderBinding, int i) {
        Intrinsics.checkNotNullParameter(layoutSingleActionHeaderBinding, "<this>");
        layoutSingleActionHeaderBinding.ibBack.setOnClickListener(new ViewBindingExtKt$$ExternalSyntheticLambda0(layoutSingleActionHeaderBinding));
        layoutSingleActionHeaderBinding.tvHeaderTitle.setText(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: initState$lambda-1  reason: not valid java name */
    public static final void m589initState$lambda1(LayoutSingleActionHeaderBinding layoutSingleActionHeaderBinding, View view) {
        Intrinsics.checkNotNullParameter(layoutSingleActionHeaderBinding, "$this_initState");
        Context context = layoutSingleActionHeaderBinding.ibBack.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static final void populateMegaBalls(VietlotResultItem vietlotResultItem, LinearLayout linearLayout, boolean z) {
        Intrinsics.checkNotNullParameter(vietlotResultItem, "<this>");
        Intrinsics.checkNotNullParameter(linearLayout, "parent");
        Context context = linearLayout.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        linearLayout.removeAllViews();
        Lazy lazy = LazyKt.lazy(new ViewBindingExtKt$populateMegaBalls$powerBallSize$2(context));
        Lazy lazy2 = LazyKt.lazy(new ViewBindingExtKt$populateMegaBalls$powerBallTextSize$2(context));
        List<String> result = vietlotResultItem.result();
        int i = 0;
        for (Object next : result) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) next;
            if (i > 0) {
                linearLayout.addView(new View(context), new LinearLayout.LayoutParams(0, 1, 1.0f));
            }
            LayoutMegaBallBinding inflate = LayoutMegaBallBinding.inflate(from, linearLayout, true);
            inflate.getRoot().setText(str);
            if (z) {
                ViewGroup.LayoutParams layoutParams = inflate.getRoot().getLayoutParams();
                layoutParams.width = m590populateMegaBalls$lambda2(lazy);
                layoutParams.height = m590populateMegaBalls$lambda2(lazy);
                inflate.getRoot().setTextSize(0, m591populateMegaBalls$lambda3(lazy2));
                inflate.getRoot().setBackgroundResource(i < result.size() - 1 ? R.drawable.ic_power_ball : R.drawable.ic_power_ball_last);
            }
            i = i2;
        }
    }

    /* renamed from: populateMegaBalls$lambda-2  reason: not valid java name */
    private static final int m590populateMegaBalls$lambda2(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    /* renamed from: populateMegaBalls$lambda-3  reason: not valid java name */
    private static final float m591populateMegaBalls$lambda3(Lazy<Float> lazy) {
        return lazy.getValue().floatValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005e, code lost:
        r8 = r0.getString((r8 = r4.getTextRes()).intValue());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void populateResultTable(com.veso.online.data.model.VietlotResultItem r10, androidx.gridlayout.widget.GridLayout r11, boolean r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 4
            r11.setColumnCount(r0)
            r11.removeAllViews()
            android.content.Context r0 = r11.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            java.util.List r10 = r10.buildTableData(r12)
            r12 = r10
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
            r2 = 0
            r3 = r2
        L_0x0026:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x00ca
            java.lang.Object r4 = r12.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L_0x0037
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x0037:
            com.veso.online.data.model.TextCell r4 = (com.veso.online.data.model.TextCell) r4
            int r3 = r3 % 4
            java.lang.Object r3 = r10.get(r3)
            com.veso.online.data.model.TextCell r3 = (com.veso.online.data.model.TextCell) r3
            r6 = r11
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r7 = 1
            com.veso.online.databinding.TextCellBinding r6 = com.veso.online.databinding.TextCellBinding.inflate(r1, r6, r7)
            android.widget.TextView r7 = r6.getRoot()
            java.lang.String r8 = r4.getText()
            if (r8 != 0) goto L_0x006b
            java.lang.Integer r8 = r4.getTextRes()
            java.lang.String r9 = "0"
            if (r8 != 0) goto L_0x005e
        L_0x005b:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            goto L_0x006e
        L_0x005e:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.String r8 = r0.getString(r8)
            if (r8 != 0) goto L_0x006b
            goto L_0x005b
        L_0x006b:
            r9 = r8
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
        L_0x006e:
            r7.setText(r9)
            boolean r7 = r4.isBold()
            if (r7 == 0) goto L_0x0080
            android.widget.TextView r7 = r6.getRoot()
            android.graphics.Typeface r8 = android.graphics.Typeface.DEFAULT_BOLD
            r7.setTypeface(r8)
        L_0x0080:
            java.lang.Integer r4 = r4.getTextSizeRes()
            if (r4 != 0) goto L_0x0087
            goto L_0x009d
        L_0x0087:
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            android.widget.TextView r7 = r6.getRoot()
            android.content.res.Resources r8 = r0.getResources()
            int r4 = r8.getDimensionPixelSize(r4)
            float r4 = (float) r4
            r7.setTextSize(r2, r4)
        L_0x009d:
            android.widget.TextView r4 = r6.getRoot()
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r6 = r4 instanceof androidx.gridlayout.widget.GridLayout.LayoutParams
            if (r6 == 0) goto L_0x00ac
            androidx.gridlayout.widget.GridLayout$LayoutParams r4 = (androidx.gridlayout.widget.GridLayout.LayoutParams) r4
            goto L_0x00ad
        L_0x00ac:
            r4 = 0
        L_0x00ad:
            if (r4 != 0) goto L_0x00b0
            goto L_0x00c7
        L_0x00b0:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            androidx.gridlayout.widget.GridLayout$Alignment r7 = androidx.gridlayout.widget.GridLayout.CENTER
            java.lang.Float r3 = r3.getColWeight()
            if (r3 != 0) goto L_0x00bd
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c1
        L_0x00bd:
            float r3 = r3.floatValue()
        L_0x00c1:
            androidx.gridlayout.widget.GridLayout$Spec r3 = androidx.gridlayout.widget.GridLayout.spec((int) r6, (androidx.gridlayout.widget.GridLayout.Alignment) r7, (float) r3)
            r4.columnSpec = r3
        L_0x00c7:
            r3 = r5
            goto L_0x0026
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.utils.ViewBindingExtKt.populateResultTable(com.veso.online.data.model.VietlotResultItem, androidx.gridlayout.widget.GridLayout, boolean):void");
    }

    public static final void populateKenoBalls(KenoResult kenoResult, LinearLayout linearLayout) {
        LinearLayout linearLayout2 = linearLayout;
        Intrinsics.checkNotNullParameter(kenoResult, "<this>");
        Intrinsics.checkNotNullParameter(linearLayout2, "ballHosted");
        Context context = linearLayout.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.power_ball_text_size);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.power_ball_size);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.keno_row_spacing);
        List split$default = StringsKt.split$default((CharSequence) kenoResult.getDaySo(), new String[]{","}, false, 0, 6, (Object) null);
        Iterator it = new IntRange(0, 20).iterator();
        LinearLayout linearLayout3 = null;
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            int i = nextInt % 7;
            if (i == 0) {
                int i2 = nextInt / 7;
                if (linearLayout.getChildCount() > i2) {
                    View childAt = linearLayout2.getChildAt(i2);
                    Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
                    linearLayout3 = (LinearLayout) childAt;
                } else {
                    linearLayout3 = new LinearLayout(context);
                    linearLayout2.addView(linearLayout3, -1, -2);
                    ViewGroup.LayoutParams layoutParams = linearLayout3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = dimensionPixelSize3;
                    }
                }
            }
            int i3 = i * 2;
            Intrinsics.checkNotNull(linearLayout3);
            if (linearLayout3.getChildCount() > i3) {
                View childAt2 = linearLayout3.getChildAt(i3);
                TextView textView = childAt2 instanceof TextView ? (TextView) childAt2 : null;
                if (textView != null) {
                    textView.setText((CharSequence) CollectionsKt.getOrNull(split$default, nextInt));
                }
            } else {
                TextView root = LayoutMegaBallBinding.inflate(from, linearLayout3, true).getRoot();
                String str = (String) CollectionsKt.getOrNull(split$default, nextInt);
                root.setText(str);
                root.getLayoutParams().width = dimensionPixelSize2;
                root.getLayoutParams().height = dimensionPixelSize2;
                root.setTextSize(0, dimensionPixelSize);
                root.setBackgroundResource(R.drawable.ic_keno_ball);
                if (str == null) {
                    root.setVisibility(4);
                }
            }
            if (i < 6 && linearLayout3.getChildCount() <= i3 + 1) {
                linearLayout3.addView(new View(context), new LinearLayout.LayoutParams(0, 1, 1.0f));
            }
        }
    }
}
