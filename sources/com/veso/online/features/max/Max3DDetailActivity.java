package com.veso.online.features.max;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelLazy;
import com.veso.online.R;
import com.veso.online.data.model.Max3DPrizeRow;
import com.veso.online.data.model.VietlotResultItem;
import com.veso.online.data.model.VietlotType;
import com.veso.online.databinding.ActivityMax3DdetailBinding;
import com.veso.online.databinding.LayoutMax3dItemBinding;
import com.veso.online.databinding.LayoutMax3dPrizeRowBinding;
import com.veso.online.databinding.LayoutSingleActionHeaderBinding;
import com.veso.online.features.mega.JackpotResultAdapterKt;
import com.veso.online.utils.ViewBindingExtKt;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J%\u0010\u0015\u001a\u00020\f*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/veso/online/features/max/Max3DDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/veso/online/databinding/ActivityMax3DdetailBinding;", "viewModel", "Lcom/veso/online/features/max/Max3DDetailViewModel;", "getViewModel", "()Lcom/veso/online/features/max/Max3DDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addPrizeQuantityRow", "", "row", "Lcom/veso/online/data/model/Max3DPrizeRow;", "parent", "Landroid/widget/LinearLayout;", "addRowDivider", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "applyStyle", "Landroid/widget/TextView;", "sizeRes", "", "colorRes", "(Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: Max3DDetailActivity.kt */
public final class Max3DDetailActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String KEY_ORIGIN_RESULT = "KEY_ORIGIN_RESULT";
    private static final String KEY_VIETLOT_TYPE = "KEY_VIETLOT_TYPE";
    private ActivityMax3DdetailBinding binding;
    private final Lazy viewModel$delegate;

    public Max3DDetailActivity() {
        ComponentActivity componentActivity = this;
        this.viewModel$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(Max3DDetailViewModel.class), new Max3DDetailActivity$special$$inlined$viewModels$default$2(componentActivity), new Max3DDetailActivity$special$$inlined$viewModels$default$1(componentActivity), new Max3DDetailActivity$special$$inlined$viewModels$default$3((Function0) null, componentActivity));
    }

    private final Max3DDetailViewModel getViewModel() {
        return (Max3DDetailViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        VietlotResultItem vietlotResultItem = (VietlotResultItem) getIntent().getParcelableExtra(KEY_ORIGIN_RESULT);
        if (vietlotResultItem == null) {
            Max3DDetailActivity max3DDetailActivity = this;
            finish();
            return;
        }
        Serializable serializableExtra = getIntent().getSerializableExtra(KEY_VIETLOT_TYPE);
        ActivityMax3DdetailBinding activityMax3DdetailBinding = null;
        VietlotType vietlotType = serializableExtra instanceof VietlotType ? (VietlotType) serializableExtra : null;
        if (vietlotType == null) {
            vietlotType = VietlotType.MAX3D;
        }
        ActivityMax3DdetailBinding inflate = ActivityMax3DdetailBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView((View) inflate.getRoot());
        ActivityMax3DdetailBinding activityMax3DdetailBinding2 = this.binding;
        if (activityMax3DdetailBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMax3DdetailBinding = activityMax3DdetailBinding2;
        }
        LayoutSingleActionHeaderBinding layoutSingleActionHeaderBinding = activityMax3DdetailBinding.layoutHeader;
        Intrinsics.checkNotNullExpressionValue(layoutSingleActionHeaderBinding, "binding.layoutHeader");
        ViewBindingExtKt.initState(layoutSingleActionHeaderBinding, vietlotType == VietlotType.MAX3DPRO ? R.string.app_title_max_3d_pro : R.string.app_title_max_3d);
        getViewModel().getResult().observe(this, new Max3DDetailActivity$$ExternalSyntheticLambda0(this, vietlotType));
        getViewModel().loadData(vietlotResultItem, vietlotType);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-3  reason: not valid java name */
    public static final void m546onCreate$lambda3(Max3DDetailActivity max3DDetailActivity, VietlotType vietlotType, VietlotResultItem vietlotResultItem) {
        List<Max3DPrizeRow> list;
        Intrinsics.checkNotNullParameter(max3DDetailActivity, "this$0");
        Intrinsics.checkNotNullParameter(vietlotType, "$type");
        ActivityMax3DdetailBinding activityMax3DdetailBinding = max3DDetailActivity.binding;
        if (activityMax3DdetailBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMax3DdetailBinding = null;
        }
        activityMax3DdetailBinding.tvDate.setText(vietlotResultItem.getDate());
        activityMax3DdetailBinding.tvPeriod.setText(vietlotResultItem.getLv());
        LayoutMax3dItemBinding layoutMax3dItemBinding = activityMax3DdetailBinding.layoutMax3dResult;
        Intrinsics.checkNotNullExpressionValue(layoutMax3dItemBinding, "layoutMax3dResult");
        Intrinsics.checkNotNullExpressionValue(vietlotResultItem, "it");
        JackpotResultAdapterKt.bindData(layoutMax3dItemBinding, vietlotResultItem);
        activityMax3DdetailBinding.llPrizeQuantity.removeAllViews();
        if (vietlotType == VietlotType.MAX3DPRO) {
            list = vietlotResultItem.buildMax3DProPrizeRow(max3DDetailActivity);
        } else {
            list = vietlotResultItem.buildMax3DPrizeRow(max3DDetailActivity);
        }
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Max3DPrizeRow max3DPrizeRow = (Max3DPrizeRow) next;
            if (i > 0) {
                LinearLayout linearLayout = activityMax3DdetailBinding.llPrizeQuantity;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "llPrizeQuantity");
                max3DDetailActivity.addRowDivider(linearLayout);
            }
            LinearLayout linearLayout2 = activityMax3DdetailBinding.llPrizeQuantity;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llPrizeQuantity");
            max3DDetailActivity.addPrizeQuantityRow(max3DPrizeRow, linearLayout2);
            i = i2;
        }
        if (vietlotType == VietlotType.MAX3DPRO) {
            activityMax3DdetailBinding.ivLogo.setImageResource(R.drawable.logo_max_3d_pro);
        }
    }

    private final void addPrizeQuantityRow(Max3DPrizeRow max3DPrizeRow, LinearLayout linearLayout) {
        LayoutMax3dPrizeRowBinding inflate = LayoutMax3dPrizeRowBinding.inflate(getLayoutInflater(), linearLayout, true);
        inflate.tv1Col.setText(max3DPrizeRow.getPrizeText());
        inflate.tv2Col.setText(max3DPrizeRow.getQuantity());
        inflate.tv3Col.setText(max3DPrizeRow.getPrizeValue());
        TextView textView = inflate.tv1Col;
        Intrinsics.checkNotNullExpressionValue(textView, "tv1Col");
        applyStyle(textView, max3DPrizeRow.getTextSizeRes(), max3DPrizeRow.getTextColorRes());
        TextView textView2 = inflate.tv2Col;
        Intrinsics.checkNotNullExpressionValue(textView2, "tv2Col");
        applyStyle(textView2, max3DPrizeRow.getTextSizeRes(), max3DPrizeRow.getTextColorRes());
        TextView textView3 = inflate.tv3Col;
        Intrinsics.checkNotNullExpressionValue(textView3, "tv3Col");
        applyStyle(textView3, max3DPrizeRow.getTextSizeRes(), max3DPrizeRow.getTextColorRes());
    }

    private final void addRowDivider(LinearLayout linearLayout) {
        View view = new View(linearLayout.getContext());
        view.setBackgroundColor(-1);
        linearLayout.addView(view, -1, 1);
    }

    private final void applyStyle(TextView textView, Integer num, Integer num2) {
        if (num != null) {
            textView.setTextSize(0, (float) textView.getResources().getDimensionPixelSize(num.intValue()));
        }
        if (num2 != null) {
            num2.intValue();
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), num2.intValue()));
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/veso/online/features/max/Max3DDetailActivity$Companion;", "", "()V", "KEY_ORIGIN_RESULT", "", "KEY_VIETLOT_TYPE", "startScreen", "", "context", "Landroid/content/Context;", "origin", "Lcom/veso/online/data/model/VietlotResultItem;", "type", "Lcom/veso/online/data/model/VietlotType;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: Max3DDetailActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void startScreen(Context context, VietlotResultItem vietlotResultItem, VietlotType vietlotType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vietlotResultItem, "origin");
            Intrinsics.checkNotNullParameter(vietlotType, "type");
            Intent intent = new Intent(context, Max3DDetailActivity.class);
            intent.putExtra(Max3DDetailActivity.KEY_ORIGIN_RESULT, vietlotResultItem);
            intent.putExtra(Max3DDetailActivity.KEY_VIETLOT_TYPE, vietlotType);
            context.startActivity(intent);
        }
    }
}
