package com.veso.online.features.keno.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.veso.online.R;
import com.veso.online.data.model.KenoInfo;
import com.veso.online.data.model.KenoResult;
import com.veso.online.data.model.SimpleKenoResult;
import com.veso.online.databinding.ActivityKenoDetailBinding;
import com.veso.online.databinding.LayoutSingleActionHeaderBinding;
import com.veso.online.utils.ViewBindingExtKt;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/veso/online/features/keno/detail/KenoDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/veso/online/databinding/ActivityKenoDetailBinding;", "viewModel", "Lcom/veso/online/features/keno/detail/KenoDetailViewModel;", "getViewModel", "()Lcom/veso/online/features/keno/detail/KenoDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoDetailActivity.kt */
public final class KenoDetailActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String KEY_KENO_RESULT = "KEY_KENO_RESULT";
    private ActivityKenoDetailBinding binding;
    private final Lazy viewModel$delegate;

    public KenoDetailActivity() {
        ComponentActivity componentActivity = this;
        this.viewModel$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(KenoDetailViewModel.class), new KenoDetailActivity$special$$inlined$viewModels$default$2(componentActivity), new KenoDetailActivity$special$$inlined$viewModels$default$1(componentActivity), new KenoDetailActivity$special$$inlined$viewModels$default$3((Function0) null, componentActivity));
    }

    private final KenoDetailViewModel getViewModel() {
        return (KenoDetailViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        KenoResult kenoResult;
        super.onCreate(bundle);
        SimpleKenoResult simpleKenoResult = (SimpleKenoResult) getIntent().getParcelableExtra(KEY_KENO_RESULT);
        if (simpleKenoResult == null) {
            kenoResult = null;
        } else {
            kenoResult = new KenoResult(simpleKenoResult.getDate(), simpleKenoResult.getTime(), simpleKenoResult.getLv(), simpleKenoResult.getDaySo(), (KenoInfo) null, (JsonObject) null, 48, (DefaultConstructorMarker) null);
        }
        if (kenoResult == null) {
            KenoDetailActivity kenoDetailActivity = this;
            finish();
            return;
        }
        ActivityKenoDetailBinding inflate = ActivityKenoDetailBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView((View) inflate.getRoot());
        ActivityKenoDetailBinding activityKenoDetailBinding = this.binding;
        if (activityKenoDetailBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityKenoDetailBinding = null;
        }
        LayoutSingleActionHeaderBinding layoutSingleActionHeaderBinding = activityKenoDetailBinding.layoutHeader;
        Intrinsics.checkNotNullExpressionValue(layoutSingleActionHeaderBinding, "binding.layoutHeader");
        ViewBindingExtKt.initState(layoutSingleActionHeaderBinding, R.string.app_title_keno);
        ActivityKenoDetailBinding activityKenoDetailBinding2 = this.binding;
        if (activityKenoDetailBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityKenoDetailBinding2 = null;
        }
        RecyclerView recyclerView = activityKenoDetailBinding2.rcvKenoDetail;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new KenoDetailAdapter());
        recyclerView.setItemAnimator((RecyclerView.ItemAnimator) null);
        getViewModel().getKenoItems().observe(this, new KenoDetailActivity$$ExternalSyntheticLambda0(this));
        KenoDetailViewModel viewModel = getViewModel();
        InputStream open = getAssets().open("keno_prize_schema.json");
        Intrinsics.checkNotNullExpressionValue(open, "assets.open(\"keno_prize_schema.json\")");
        JsonObject asJsonObject = JsonParser.parseString(new String(ByteStreamsKt.readBytes(open), Charsets.UTF_8)).getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "assets.open(\"keno_prize_…sJsonObject\n            }");
        viewModel.setPrizeSchema(asJsonObject);
        getViewModel().fetchDetail(kenoResult);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: onCreate$lambda-3  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m524onCreate$lambda3(com.veso.online.features.keno.detail.KenoDetailActivity r2, java.util.List r3) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.veso.online.databinding.ActivityKenoDetailBinding r2 = r2.binding
            r0 = 0
            if (r2 != 0) goto L_0x0010
            java.lang.String r2 = "binding"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r2 = r0
        L_0x0010:
            androidx.recyclerview.widget.RecyclerView r2 = r2.rcvKenoDetail
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r2.getAdapter()
            boolean r1 = r2 instanceof com.veso.online.features.keno.detail.KenoDetailAdapter
            if (r1 == 0) goto L_0x001d
            r0 = r2
            com.veso.online.features.keno.detail.KenoDetailAdapter r0 = (com.veso.online.features.keno.detail.KenoDetailAdapter) r0
        L_0x001d:
            if (r0 != 0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            r0.submitList(r3)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.features.keno.detail.KenoDetailActivity.m524onCreate$lambda3(com.veso.online.features.keno.detail.KenoDetailActivity, java.util.List):void");
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/veso/online/features/keno/detail/KenoDetailActivity$Companion;", "", "()V", "KEY_KENO_RESULT", "", "startScreen", "", "context", "Landroid/content/Context;", "kenoResult", "Lcom/veso/online/data/model/KenoResult;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: KenoDetailActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void startScreen(Context context, KenoResult kenoResult) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(kenoResult, "kenoResult");
            Intent intent = new Intent(context, KenoDetailActivity.class);
            intent.putExtra(KenoDetailActivity.KEY_KENO_RESULT, new SimpleKenoResult(kenoResult.getDate(), kenoResult.getTime(), kenoResult.getLv(), kenoResult.getDaySo()));
            context.startActivity(intent);
        }
    }
}
