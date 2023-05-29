package com.veso.online.features.result;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.veso.online.data.model.XoSoTimeRange;
import com.veso.online.data.model.XosoConfig;
import com.veso.online.databinding.FragmentSlidableBinding;
import com.veso.online.features.main.DateChangeConsumer;
import com.veso.online.features.main.DatePickerDelegate;
import com.veso.online.features.main.ReadResultDelegate;
import com.veso.online.features.result.detail.ResultDetailFragment;
import com.veso.online.utils.DateUtils;
import com.veso.online.utils.ExtensionsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/veso/online/features/result/SlidableFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/veso/online/features/main/DateChangeConsumer;", "()V", "adapter", "Lcom/veso/online/features/result/XosoResultFragmentAdapter;", "binding", "Lcom/veso/online/databinding/FragmentSlidableBinding;", "date", "", "", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDateChanged", "Ljava/util/Date;", "onDestroyView", "onResume", "setUpPageAdapter", "showDate", "position", "updateButtonStatus", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: SlidableFragment.kt */
public final class SlidableFragment extends Fragment implements DateChangeConsumer {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String KEY_DATE = "date";
    public static final String KEY_DATE_CHANGE = "date_changed";
    public static final String KEY_POSITION = "position";
    private XosoResultFragmentAdapter adapter;
    private FragmentSlidableBinding binding;
    private final Map<Integer, String> date = new LinkedHashMap();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getChildFragmentManager().setFragmentResultListener(KEY_DATE_CHANGE, this, new SlidableFragment$$ExternalSyntheticLambda3(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m570onCreate$lambda1(SlidableFragment slidableFragment, String str, Bundle bundle) {
        String string;
        Intrinsics.checkNotNullParameter(slidableFragment, "this$0");
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (str.hashCode() == 1424911139 && str.equals(KEY_DATE_CHANGE) && (string = bundle.getString(KEY_DATE)) != null) {
            slidableFragment.date.put(Integer.valueOf(bundle.getInt(KEY_POSITION)), string);
            FragmentSlidableBinding fragmentSlidableBinding = slidableFragment.binding;
            if (fragmentSlidableBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentSlidableBinding = null;
            }
            slidableFragment.showDate(fragmentSlidableBinding.viewpager.getCurrentItem());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        FragmentSlidableBinding inflate = FragmentSlidableBinding.inflate(getLayoutInflater(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater, container, false)");
        this.binding = inflate;
        setUpPageAdapter();
        FragmentSlidableBinding fragmentSlidableBinding = this.binding;
        FragmentSlidableBinding fragmentSlidableBinding2 = null;
        if (fragmentSlidableBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSlidableBinding = null;
        }
        fragmentSlidableBinding.viewpager.registerOnPageChangeCallback(new SlidableFragment$onCreateView$1(this));
        FragmentSlidableBinding fragmentSlidableBinding3 = this.binding;
        if (fragmentSlidableBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSlidableBinding3 = null;
        }
        fragmentSlidableBinding3.tvNext.setOnClickListener(new SlidableFragment$$ExternalSyntheticLambda1(this));
        FragmentSlidableBinding fragmentSlidableBinding4 = this.binding;
        if (fragmentSlidableBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSlidableBinding4 = null;
        }
        fragmentSlidableBinding4.tvPrevious.setOnClickListener(new SlidableFragment$$ExternalSyntheticLambda0(this));
        FragmentSlidableBinding fragmentSlidableBinding5 = this.binding;
        if (fragmentSlidableBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSlidableBinding5 = null;
        }
        fragmentSlidableBinding5.tvSelectDate.setOnClickListener(new SlidableFragment$$ExternalSyntheticLambda2(this));
        updateButtonStatus();
        FragmentSlidableBinding fragmentSlidableBinding6 = this.binding;
        if (fragmentSlidableBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSlidableBinding2 = fragmentSlidableBinding6;
        }
        LinearLayout root = fragmentSlidableBinding2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-2  reason: not valid java name */
    public static final void m571onCreateView$lambda2(SlidableFragment slidableFragment, View view) {
        Intrinsics.checkNotNullParameter(slidableFragment, "this$0");
        FragmentSlidableBinding fragmentSlidableBinding = slidableFragment.binding;
        if (fragmentSlidableBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSlidableBinding = null;
        }
        ViewPager2 viewPager2 = fragmentSlidableBinding.viewpager;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-3  reason: not valid java name */
    public static final void m572onCreateView$lambda3(SlidableFragment slidableFragment, View view) {
        Intrinsics.checkNotNullParameter(slidableFragment, "this$0");
        FragmentSlidableBinding fragmentSlidableBinding = slidableFragment.binding;
        if (fragmentSlidableBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSlidableBinding = null;
        }
        ViewPager2 viewPager2 = fragmentSlidableBinding.viewpager;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-4  reason: not valid java name */
    public static final void m573onCreateView$lambda4(SlidableFragment slidableFragment, View view) {
        Intrinsics.checkNotNullParameter(slidableFragment, "this$0");
        Context context = slidableFragment.getContext();
        FragmentSlidableBinding fragmentSlidableBinding = null;
        DatePickerDelegate datePickerDelegate = context instanceof DatePickerDelegate ? (DatePickerDelegate) context : null;
        if (datePickerDelegate != null) {
            Map<Integer, String> map = slidableFragment.date;
            FragmentSlidableBinding fragmentSlidableBinding2 = slidableFragment.binding;
            if (fragmentSlidableBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentSlidableBinding = fragmentSlidableBinding2;
            }
            datePickerDelegate.selectDate(map.get(Integer.valueOf(fragmentSlidableBinding.viewpager.getCurrentItem())));
        }
    }

    public void onResume() {
        Context context;
        super.onResume();
        Bundle arguments = getArguments();
        String str = null;
        Integer valueOf = arguments == null ? null : Integer.valueOf(arguments.getInt(ResultDetailFragment.DETAIL_TYPE));
        if (valueOf != null && valueOf.intValue() == 0) {
            str = "KqxsTheoMien";
        } else if (valueOf != null && valueOf.intValue() == 1) {
            str = "KqxsTheoTinh";
        }
        if (str != null && (context = getContext()) != null) {
            ExtensionsKt.trackScreen(context, str, "ResultDetailFragment");
        }
    }

    public void onDestroyView() {
        Context context = getContext();
        ReadResultDelegate readResultDelegate = context instanceof ReadResultDelegate ? (ReadResultDelegate) context : null;
        if (readResultDelegate != null) {
            readResultDelegate.stopReading();
        }
        super.onDestroyView();
    }

    public void onDateChanged(Date date2) {
        Intrinsics.checkNotNullParameter(date2, KEY_DATE);
        if (ExtensionsKt.isToday(date2)) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.remove(ResultDetailFragment.RESULT_DATE);
            }
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.putString(ResultDetailFragment.RESULT_DATE, DateUtils.INSTANCE.format(date2));
            }
        }
        setUpPageAdapter();
    }

    /* access modifiers changed from: private */
    public final void updateButtonStatus() {
        FragmentSlidableBinding fragmentSlidableBinding = this.binding;
        XosoResultFragmentAdapter xosoResultFragmentAdapter = null;
        if (fragmentSlidableBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSlidableBinding = null;
        }
        int currentItem = fragmentSlidableBinding.viewpager.getCurrentItem();
        FragmentSlidableBinding fragmentSlidableBinding2 = this.binding;
        if (fragmentSlidableBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSlidableBinding2 = null;
        }
        TextView textView = fragmentSlidableBinding2.tvPrevious;
        boolean z = false;
        textView.setEnabled(currentItem > 0);
        float f = 1.0f;
        textView.setAlpha(textView.isEnabled() ? 1.0f : 0.5f);
        FragmentSlidableBinding fragmentSlidableBinding3 = this.binding;
        if (fragmentSlidableBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSlidableBinding3 = null;
        }
        TextView textView2 = fragmentSlidableBinding3.tvNext;
        XosoResultFragmentAdapter xosoResultFragmentAdapter2 = this.adapter;
        if (xosoResultFragmentAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            xosoResultFragmentAdapter = xosoResultFragmentAdapter2;
        }
        if (currentItem < xosoResultFragmentAdapter.getItemCount() - 1) {
            z = true;
        }
        textView2.setEnabled(z);
        if (!textView2.isEnabled()) {
            f = 0.5f;
        }
        textView2.setAlpha(f);
    }

    /* access modifiers changed from: private */
    public final void showDate(int i) {
        FragmentSlidableBinding fragmentSlidableBinding = this.binding;
        if (fragmentSlidableBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSlidableBinding = null;
        }
        fragmentSlidableBinding.tvSelectDate.setText(this.date.get(Integer.valueOf(i)));
    }

    private final void setUpPageAdapter() {
        FragmentSlidableBinding fragmentSlidableBinding;
        XosoConfig xosoConfig;
        int i;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = ResultDetailFragment.Companion.argsForRegion$default(ResultDetailFragment.Companion, XosoConfig.REGION_ID_SOUTH, (String) null, 2, (Object) null);
        }
        Intrinsics.checkNotNullExpressionValue(arguments, "arguments ?: ResultDetai…agment.argsForRegion(\"1\")");
        String string = arguments.getString(ResultDetailFragment.RESULT_DATE);
        Date parseDate = string == null ? null : DateUtils.INSTANCE.parseDate(string);
        int i2 = 99;
        if (parseDate != null) {
            Calendar instance = Calendar.getInstance();
            int time = (int) ((new Date().getTime() - parseDate.getTime()) / ((long) 86400000));
            int i3 = arguments.getInt(ResultDetailFragment.DETAIL_TYPE);
            int i4 = 1;
            if (i3 == 0) {
                if (instance.get(11) < XoSoTimeRange.Companion.getTimeRange(arguments.getString(ResultDetailFragment.REGION_ID)).getStartHour()) {
                    i4 = 0;
                }
                i2 = Math.max(50, (100 - time) - i4);
            } else if (i3 == 1 && (xosoConfig = XosoConfig.Companion.getMapConfigIds().get(arguments.getString(ResultDetailFragment.CHANNEL_ID))) != null) {
                Calendar instance2 = Calendar.getInstance();
                instance2.setTimeInMillis(parseDate.getTime());
                Iterable<String> split$default = StringsKt.split$default((CharSequence) xosoConfig.getDate(), new String[]{","}, false, 0, 6, (Object) null);
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
                for (String parseInt : split$default) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
                }
                List list = (List) arrayList;
                int i5 = time / 7;
                int i6 = instance.get(7);
                Iterable intRange = new IntRange(i6 - (time % 7), i6);
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
                Iterator it = intRange.iterator();
                while (it.hasNext()) {
                    int nextInt = ((IntIterator) it).nextInt();
                    if (nextInt <= 0) {
                        nextInt += 7;
                    }
                    arrayList2.add(Integer.valueOf(nextInt));
                }
                Iterable<Number> iterable = (List) arrayList2;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    i = 0;
                    for (Number intValue : iterable) {
                        if (list.contains(Integer.valueOf(intValue.intValue())) && (i = i + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                } else {
                    i = 0;
                }
                XoSoTimeRange timeRange = XoSoTimeRange.Companion.getTimeRange(xosoConfig.getType());
                if (list.contains(Integer.valueOf(instance2.get(7))) || (list.contains(Integer.valueOf(i6)) && instance.get(11) < timeRange.getStartHour())) {
                    i4 = 0;
                }
                i2 = Math.max(50, ((100 - (i5 * list.size())) - i) - i4);
            }
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "lifecycle");
        this.adapter = new XosoResultFragmentAdapter(childFragmentManager, lifecycle, arguments, i2);
        FragmentSlidableBinding fragmentSlidableBinding2 = this.binding;
        if (fragmentSlidableBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSlidableBinding2 = null;
        }
        ViewPager2 viewPager2 = fragmentSlidableBinding2.viewpager;
        XosoResultFragmentAdapter xosoResultFragmentAdapter = this.adapter;
        if (xosoResultFragmentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            xosoResultFragmentAdapter = null;
        }
        viewPager2.setAdapter(xosoResultFragmentAdapter);
        FragmentSlidableBinding fragmentSlidableBinding3 = this.binding;
        if (fragmentSlidableBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSlidableBinding = null;
        } else {
            fragmentSlidableBinding = fragmentSlidableBinding3;
        }
        fragmentSlidableBinding.viewpager.setCurrentItem(i2, false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/veso/online/features/result/SlidableFragment$Companion;", "", "()V", "KEY_DATE", "", "KEY_DATE_CHANGE", "KEY_POSITION", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: SlidableFragment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
