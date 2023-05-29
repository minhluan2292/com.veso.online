package com.veso.online.features.result.detail;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.data.model.LoadingState;
import com.veso.online.data.model.XosoConfig;
import com.veso.online.databinding.FragmentResultDetailBinding;
import com.veso.online.databinding.LayoutFragmentLoadingBinding;
import com.veso.online.features.main.ReadResultDelegate;
import com.veso.online.features.result.SlidableFragment;
import com.veso.online.utils.ViewBindingExtKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/veso/online/features/result/detail/ResultDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/veso/online/databinding/FragmentResultDetailBinding;", "lotteryAdapter", "Lcom/veso/online/features/result/detail/LotteryResultAdapter;", "readingStateObserver", "Landroidx/lifecycle/Observer;", "", "viewModel", "Lcom/veso/online/features/result/detail/ResultDetailViewModel;", "getViewModel", "()Lcom/veso/online/features/result/detail/ResultDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeData", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ResultDetailFragment.kt */
public final class ResultDetailFragment extends Fragment {
    public static final String CHANNEL_ID = "channel_id";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DETAIL_TYPE = "detail_type";
    private static final String EXTRA_DATA = "extra_data";
    private static final String PAGE_INDEX = "page_index";
    private static final String PAGE_POSITION = "page_position";
    public static final String REGION_ID = "region_id";
    public static final String RESULT_DATE = "result_date";
    private static final String START_DATE = "start_date";
    public static final int TYPE_PROVINCE = 1;
    public static final int TYPE_REGION = 0;
    private FragmentResultDetailBinding binding;
    private final LotteryResultAdapter lotteryAdapter = new LotteryResultAdapter(new ResultDetailFragment$lotteryAdapter$1(this));
    private final Observer<Boolean> readingStateObserver = new ResultDetailFragment$$ExternalSyntheticLambda1(this);
    private final Lazy viewModel$delegate = LazyKt.lazy(new ResultDetailFragment$viewModel$2(this));

    /* access modifiers changed from: private */
    public final ResultDetailViewModel getViewModel() {
        return (ResultDetailViewModel) this.viewModel$delegate.getValue();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int i = 0;
        FragmentResultDetailBinding inflate = FragmentResultDetailBinding.inflate(getLayoutInflater(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater, container, false)");
        this.binding = inflate;
        FragmentResultDetailBinding fragmentResultDetailBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        inflate.rcvDetail.setAdapter(this.lotteryAdapter);
        FragmentResultDetailBinding fragmentResultDetailBinding2 = this.binding;
        if (fragmentResultDetailBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentResultDetailBinding2 = null;
        }
        fragmentResultDetailBinding2.rcvDetail.setLayoutManager(new LinearLayoutManager(getContext()));
        FragmentResultDetailBinding fragmentResultDetailBinding3 = this.binding;
        if (fragmentResultDetailBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentResultDetailBinding3 = null;
        }
        fragmentResultDetailBinding3.rcvDetail.setItemAnimator((RecyclerView.ItemAnimator) null);
        observeData();
        Bundle arguments = getArguments();
        Bundle bundle2 = arguments == null ? null : arguments.getBundle(EXTRA_DATA);
        if (bundle2 == null) {
            bundle2 = Companion.argsForRegion$default(Companion, XosoConfig.REGION_ID_SOUTH, (String) null, 2, (Object) null);
        }
        Intrinsics.checkNotNullExpressionValue(bundle2, "arguments?.getBundle(EXT…TA) ?: argsForRegion(\"1\")");
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt(PAGE_INDEX);
        }
        String string = bundle2.getString(RESULT_DATE);
        int i2 = bundle2.getInt(DETAIL_TYPE);
        if (i2 == 0) {
            ResultDetailViewModel viewModel = getViewModel();
            String string2 = bundle2.getString(REGION_ID, XosoConfig.REGION_ID_SOUTH);
            Intrinsics.checkNotNullExpressionValue(string2, "extraData.getString(REGION_ID, \"1\")");
            viewModel.fetchRegionData(string2, i, string);
        } else if (i2 == 1) {
            ResultDetailViewModel viewModel2 = getViewModel();
            String string3 = bundle2.getString(CHANNEL_ID, XosoConfig.REGION_ID_SOUTH);
            Intrinsics.checkNotNullExpressionValue(string3, "extraData.getString(CHANNEL_ID, \"1\")");
            viewModel2.fetchChannelData(string3, i, string);
        }
        FragmentResultDetailBinding fragmentResultDetailBinding4 = this.binding;
        if (fragmentResultDetailBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentResultDetailBinding = fragmentResultDetailBinding4;
        }
        LinearLayout root = fragmentResultDetailBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    public void onDestroyView() {
        LiveData<Boolean> readingLiveData;
        Context context = getContext();
        ReadResultDelegate readResultDelegate = context instanceof ReadResultDelegate ? (ReadResultDelegate) context : null;
        if (!(readResultDelegate == null || (readingLiveData = readResultDelegate.getReadingLiveData()) == null)) {
            readingLiveData.removeObserver(this.readingStateObserver);
        }
        super.onDestroyView();
    }

    private final void observeData() {
        LiveData<Boolean> readingLiveData;
        getViewModel().getDetailData().observe(getViewLifecycleOwner(), new ResultDetailFragment$$ExternalSyntheticLambda3(this));
        getViewModel().getDate().observe(getViewLifecycleOwner(), new ResultDetailFragment$$ExternalSyntheticLambda2(this));
        getViewModel().getLoadingState().observe(getViewLifecycleOwner(), new ResultDetailFragment$$ExternalSyntheticLambda0(this));
        Context context = getContext();
        ReadResultDelegate readResultDelegate = context instanceof ReadResultDelegate ? (ReadResultDelegate) context : null;
        if (readResultDelegate != null && (readingLiveData = readResultDelegate.getReadingLiveData()) != null) {
            readingLiveData.observe(getViewLifecycleOwner(), this.readingStateObserver);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m576observeData$lambda0(ResultDetailFragment resultDetailFragment, List list) {
        Intrinsics.checkNotNullParameter(resultDetailFragment, "this$0");
        resultDetailFragment.lotteryAdapter.submitList(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m577observeData$lambda1(ResultDetailFragment resultDetailFragment, String str) {
        Intrinsics.checkNotNullParameter(resultDetailFragment, "this$0");
        Fragment fragment = resultDetailFragment;
        Pair[] pairArr = new Pair[2];
        int i = 0;
        pairArr[0] = TuplesKt.to(SlidableFragment.KEY_DATE, str);
        Bundle arguments = resultDetailFragment.getArguments();
        if (arguments != null) {
            i = arguments.getInt(PAGE_POSITION);
        }
        pairArr[1] = TuplesKt.to(SlidableFragment.KEY_POSITION, Integer.valueOf(i));
        FragmentKt.setFragmentResult(fragment, SlidableFragment.KEY_DATE_CHANGE, BundleKt.bundleOf(pairArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m578observeData$lambda2(ResultDetailFragment resultDetailFragment, LoadingState loadingState) {
        Intrinsics.checkNotNullParameter(resultDetailFragment, "this$0");
        FragmentResultDetailBinding fragmentResultDetailBinding = resultDetailFragment.binding;
        if (fragmentResultDetailBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentResultDetailBinding = null;
        }
        LayoutFragmentLoadingBinding layoutFragmentLoadingBinding = fragmentResultDetailBinding.fragmentLoading;
        Intrinsics.checkNotNullExpressionValue(layoutFragmentLoadingBinding, "binding.fragmentLoading");
        Intrinsics.checkNotNullExpressionValue(loadingState, "it");
        ViewBindingExtKt.setState(layoutFragmentLoadingBinding, loadingState);
    }

    /* access modifiers changed from: private */
    /* renamed from: readingStateObserver$lambda-3  reason: not valid java name */
    public static final void m579readingStateObserver$lambda3(ResultDetailFragment resultDetailFragment, Boolean bool) {
        Intrinsics.checkNotNullParameter(resultDetailFragment, "this$0");
        ResultDetailViewModel viewModel = resultDetailFragment.getViewModel();
        Intrinsics.checkNotNullExpressionValue(bool, "it");
        viewModel.setReadingResult(bool.booleanValue());
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004J\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rXT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/veso/online/features/result/detail/ResultDetailFragment$Companion;", "", "()V", "CHANNEL_ID", "", "DETAIL_TYPE", "EXTRA_DATA", "PAGE_INDEX", "PAGE_POSITION", "REGION_ID", "RESULT_DATE", "START_DATE", "TYPE_PROVINCE", "", "TYPE_REGION", "argsForChannel", "Landroid/os/Bundle;", "channelId", "argsForRegion", "regionId", "date", "newInstance", "Lcom/veso/online/features/result/detail/ResultDetailFragment;", "pageIndex", "position", "extraData", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: ResultDetailFragment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Bundle argsForRegion$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.argsForRegion(str, str2);
        }

        public final Bundle argsForRegion(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "regionId");
            return BundleKt.bundleOf(TuplesKt.to(ResultDetailFragment.REGION_ID, str), TuplesKt.to(ResultDetailFragment.DETAIL_TYPE, 0), TuplesKt.to(ResultDetailFragment.RESULT_DATE, str2));
        }

        public final Bundle argsForChannel(String str) {
            Intrinsics.checkNotNullParameter(str, "channelId");
            return BundleKt.bundleOf(TuplesKt.to(ResultDetailFragment.CHANNEL_ID, str), TuplesKt.to(ResultDetailFragment.DETAIL_TYPE, 1));
        }

        public static /* synthetic */ ResultDetailFragment newInstance$default(Companion companion, int i, int i2, String str, Bundle bundle, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                str = "";
            }
            return companion.newInstance(i, i2, str, bundle);
        }

        public final ResultDetailFragment newInstance(int i, int i2, String str, Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, SlidableFragment.KEY_DATE);
            Intrinsics.checkNotNullParameter(bundle, "extraData");
            ResultDetailFragment resultDetailFragment = new ResultDetailFragment();
            resultDetailFragment.setArguments(BundleKt.bundleOf(TuplesKt.to(ResultDetailFragment.PAGE_INDEX, Integer.valueOf(i)), TuplesKt.to(ResultDetailFragment.PAGE_POSITION, Integer.valueOf(i2)), TuplesKt.to("start_date", str), TuplesKt.to(ResultDetailFragment.EXTRA_DATA, bundle)));
            return resultDetailFragment;
        }
    }
}
