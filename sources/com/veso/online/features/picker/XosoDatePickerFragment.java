package com.veso.online.features.picker;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.veso.online.R;
import com.veso.online.data.model.MenuAction;
import com.veso.online.data.model.XoSoTimeRange;
import com.veso.online.data.model.XosoConfig;
import com.veso.online.databinding.FragmentDatePickerBinding;
import com.veso.online.features.main.OnMenuItemSelected;
import com.veso.online.features.result.detail.ResultDetailFragment;
import com.veso.online.utils.DateUtils;
import com.veso.online.utils.ExtensionsKt;
import com.veso.online.widgets.MiddleDividerItemDecoration;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/veso/online/features/picker/XosoDatePickerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/veso/online/databinding/FragmentDatePickerBinding;", "getRegionTitle", "", "regionId", "handleItemSelected", "", "item", "Lcom/veso/online/features/picker/DateItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoDatePickerFragment.kt */
public final class XosoDatePickerFragment extends Fragment {
    private FragmentDatePickerBinding binding;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        FragmentDatePickerBinding inflate = FragmentDatePickerBinding.inflate(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        List listOf = CollectionsKt.listOf(XosoConfig.REGION_ID_NORTH, XosoConfig.REGION_ID_MIDDLE, XosoConfig.REGION_ID_SOUTH);
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", new Locale("vi"));
        Iterable intRange = new IntRange(0, 7);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator it = intRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            if (nextInt > 0) {
                instance.set(7, nextInt);
                str = simpleDateFormat.format(instance.getTime());
            } else {
                str = "";
            }
            Iterable<String> iterable = listOf;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (String str2 : iterable) {
                String regionTitle = nextInt > 0 ? str : getRegionTitle(str2);
                Intrinsics.checkNotNullExpressionValue(regionTitle, "if (dayOfWeek > 0) dayTi…e else getRegionTitle(it)");
                arrayList2.add(new DateItem(regionTitle, nextInt, str2));
            }
            arrayList.add((List) arrayList2);
        }
        List flatten = CollectionsKt.flatten((List) arrayList);
        FragmentDatePickerBinding fragmentDatePickerBinding = this.binding;
        FragmentDatePickerBinding fragmentDatePickerBinding2 = null;
        if (fragmentDatePickerBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding = null;
        }
        RecyclerView recyclerView = fragmentDatePickerBinding.rcvDatePicker;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        MiddleDividerItemDecoration middleDividerItemDecoration = new MiddleDividerItemDecoration(context, MiddleDividerItemDecoration.Companion.getALL());
        middleDividerItemDecoration.setDrawable(new ColorDrawable(ContextCompat.getColor(recyclerView.getContext(), R.color.divider)));
        recyclerView.addItemDecoration(middleDividerItemDecoration);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3));
        XosoDateAdapter xosoDateAdapter = new XosoDateAdapter(new XosoDatePickerFragment$onCreateView$1$1(this));
        xosoDateAdapter.submitList(flatten);
        recyclerView.setAdapter(xosoDateAdapter);
        FragmentDatePickerBinding fragmentDatePickerBinding3 = this.binding;
        if (fragmentDatePickerBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding3 = null;
        }
        fragmentDatePickerBinding3.ibClose.setOnClickListener(new XosoDatePickerFragment$$ExternalSyntheticLambda0(this));
        FragmentDatePickerBinding fragmentDatePickerBinding4 = this.binding;
        if (fragmentDatePickerBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentDatePickerBinding2 = fragmentDatePickerBinding4;
        }
        LinearLayout root = fragmentDatePickerBinding2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-5  reason: not valid java name */
    public static final void m562onCreateView$lambda5(XosoDatePickerFragment xosoDatePickerFragment, View view) {
        Intrinsics.checkNotNullParameter(xosoDatePickerFragment, "this$0");
        FragmentActivity activity = xosoDatePickerFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
            ExtensionsKt.trackScreen(context, "XosoDatePicker", simpleName);
        }
    }

    /* access modifiers changed from: private */
    public final void handleItemSelected(DateItem dateItem) {
        if (dateItem.getDayOfWeek() > 0) {
            Calendar instance = Calendar.getInstance();
            long timeInMillis = instance.getTimeInMillis();
            instance.set(7, dateItem.getDayOfWeek());
            if (instance.getTimeInMillis() > timeInMillis || (timeInMillis == instance.getTimeInMillis() && instance.get(11) < XoSoTimeRange.Companion.getTimeRange(dateItem.getRegionId()).getStartHour())) {
                instance.setTimeInMillis(instance.getTimeInMillis() - ((long) 604800000));
            }
            Context context = getContext();
            OnMenuItemSelected onMenuItemSelected = context instanceof OnMenuItemSelected ? (OnMenuItemSelected) context : null;
            if (onMenuItemSelected != null) {
                MenuAction menuAction = MenuAction.XOSO_RESULT;
                ResultDetailFragment.Companion companion = ResultDetailFragment.Companion;
                String regionId = dateItem.getRegionId();
                DateUtils dateUtils = DateUtils.INSTANCE;
                Date time = instance.getTime();
                Intrinsics.checkNotNullExpressionValue(time, "cal.time");
                OnMenuItemSelected.DefaultImpls.onMenuSelected$default(onMenuItemSelected, menuAction, companion.argsForRegion(regionId, dateUtils.format(time)), false, 4, (Object) null);
            }
        }
    }

    private final String getRegionTitle(String str) {
        int i;
        if (Intrinsics.areEqual((Object) str, (Object) XosoConfig.REGION_ID_NORTH)) {
            i = R.string.region_north;
        } else {
            i = Intrinsics.areEqual((Object) str, (Object) XosoConfig.REGION_ID_MIDDLE) ? R.string.region_middle : R.string.region_south;
        }
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "when (regionId) {\n      …  getString(it)\n        }");
        return string;
    }
}
