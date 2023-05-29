package com.veso.online.features.mega.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.gridlayout.widget.GridLayout;
import androidx.lifecycle.ViewModelLazy;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.veso.online.R;
import com.veso.online.data.model.VietlotResultItem;
import com.veso.online.data.model.XosoConfig;
import com.veso.online.databinding.ActivityJackpotDetailBinding;
import com.veso.online.databinding.LayoutSingleActionHeaderBinding;
import com.veso.online.utils.ViewBindingExtKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/veso/online/features/mega/detail/JackpotDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/veso/online/databinding/ActivityJackpotDetailBinding;", "isPower655", "", "originResult", "Lcom/veso/online/data/model/VietlotResultItem;", "viewModel", "Lcom/veso/online/features/mega/detail/JackpotDetailViewModel;", "getViewModel", "()Lcom/veso/online/features/mega/detail/JackpotDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "applyPower655Style", "", "bindingData", "result", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: JackpotDetailActivity.kt */
public final class JackpotDetailActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String KEY_IS_POWER_655 = "KEY_IS_POWER_655";
    private static final String KEY_ORIGIN_RESULT = "KEY_ORIGIN_RESULT";
    private ActivityJackpotDetailBinding binding;
    private boolean isPower655;
    private VietlotResultItem originResult;
    private final Lazy viewModel$delegate;

    public JackpotDetailActivity() {
        ComponentActivity componentActivity = this;
        this.viewModel$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(JackpotDetailViewModel.class), new JackpotDetailActivity$special$$inlined$viewModels$default$2(componentActivity), new JackpotDetailActivity$special$$inlined$viewModels$default$1(componentActivity), new JackpotDetailActivity$special$$inlined$viewModels$default$3((Function0) null, componentActivity));
    }

    private final JackpotDetailViewModel getViewModel() {
        return (JackpotDetailViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        VietlotResultItem vietlotResultItem = (VietlotResultItem) getIntent().getParcelableExtra(KEY_ORIGIN_RESULT);
        if (vietlotResultItem == null) {
            JackpotDetailActivity jackpotDetailActivity = this;
            finish();
            return;
        }
        this.originResult = vietlotResultItem;
        this.isPower655 = getIntent().getBooleanExtra(KEY_IS_POWER_655, false);
        ActivityJackpotDetailBinding inflate = ActivityJackpotDetailBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        VietlotResultItem vietlotResultItem2 = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView((View) inflate.getRoot());
        ActivityJackpotDetailBinding activityJackpotDetailBinding = this.binding;
        if (activityJackpotDetailBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityJackpotDetailBinding = null;
        }
        LayoutSingleActionHeaderBinding layoutSingleActionHeaderBinding = activityJackpotDetailBinding.layoutHeader;
        Intrinsics.checkNotNullExpressionValue(layoutSingleActionHeaderBinding, "binding.layoutHeader");
        ViewBindingExtKt.initState(layoutSingleActionHeaderBinding, this.isPower655 ? R.string.app_title_power : R.string.app_title_mega);
        if (this.isPower655) {
            applyPower655Style();
        }
        getViewModel().getResult().observe(this, new JackpotDetailActivity$$ExternalSyntheticLambda0(this));
        JackpotDetailViewModel viewModel = getViewModel();
        String str = this.isPower655 ? XosoConfig.POWER_ID : XosoConfig.MEGA_ID;
        VietlotResultItem vietlotResultItem3 = this.originResult;
        if (vietlotResultItem3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originResult");
        } else {
            vietlotResultItem2 = vietlotResultItem3;
        }
        viewModel.fetchJackpotDetail(str, vietlotResultItem2);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m551onCreate$lambda1(JackpotDetailActivity jackpotDetailActivity, VietlotResultItem vietlotResultItem) {
        Intrinsics.checkNotNullParameter(jackpotDetailActivity, "this$0");
        Intrinsics.checkNotNullExpressionValue(vietlotResultItem, "it");
        jackpotDetailActivity.bindingData(vietlotResultItem);
    }

    private final void bindingData(VietlotResultItem vietlotResultItem) {
        ActivityJackpotDetailBinding activityJackpotDetailBinding = this.binding;
        if (activityJackpotDetailBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityJackpotDetailBinding = null;
        }
        activityJackpotDetailBinding.tvDate.setText(vietlotResultItem.getDate());
        activityJackpotDetailBinding.tvPeriod.setText(getString(R.string.ky_xo, new Object[]{vietlotResultItem.getLv()}));
        LinearLayout linearLayout = activityJackpotDetailBinding.llJackpotResult;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llJackpotResult");
        ViewBindingExtKt.populateMegaBalls(vietlotResultItem, linearLayout, this.isPower655);
        activityJackpotDetailBinding.tvJackpotPrize.setText(vietlotResultItem.getJackpot());
        activityJackpotDetailBinding.tvJackpot2Prize.setText(vietlotResultItem.getJackpot2());
        GridLayout gridLayout = activityJackpotDetailBinding.table;
        Intrinsics.checkNotNullExpressionValue(gridLayout, "table");
        ViewBindingExtKt.populateResultTable(vietlotResultItem, gridLayout, this.isPower655);
    }

    private final void applyPower655Style() {
        ActivityJackpotDetailBinding activityJackpotDetailBinding = this.binding;
        if (activityJackpotDetailBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityJackpotDetailBinding = null;
        }
        activityJackpotDetailBinding.getRoot().setBackgroundColor(ContextCompat.getColor(this, R.color.bg_power));
        activityJackpotDetailBinding.ivLogo.setImageResource(R.drawable.logo_power_655);
        activityJackpotDetailBinding.tvJackpotPrize.setBackgroundResource(R.drawable.bg_text_power_jackpot);
        activityJackpotDetailBinding.tvJackpotPrize.setTextColor(-1);
        activityJackpotDetailBinding.tvJackpot2Subtitle.setVisibility(0);
        activityJackpotDetailBinding.tvJackpot2Prize.setVisibility(0);
        activityJackpotDetailBinding.table.setBackgroundResource(R.drawable.bg_power_item);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/veso/online/features/mega/detail/JackpotDetailActivity$Companion;", "", "()V", "KEY_IS_POWER_655", "", "KEY_ORIGIN_RESULT", "startScreen", "", "context", "Landroid/content/Context;", "result", "Lcom/veso/online/data/model/VietlotResultItem;", "isPower655", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: JackpotDetailActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void startScreen(Context context, VietlotResultItem vietlotResultItem, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vietlotResultItem, IronSourceConstants.EVENTS_RESULT);
            Intent intent = new Intent(context, JackpotDetailActivity.class);
            intent.putExtra(JackpotDetailActivity.KEY_ORIGIN_RESULT, vietlotResultItem);
            intent.putExtra(JackpotDetailActivity.KEY_IS_POWER_655, z);
            context.startActivity(intent);
        }
    }
}
