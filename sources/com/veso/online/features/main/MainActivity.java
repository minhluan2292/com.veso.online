package com.veso.online.features.main;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.gson.JsonObject;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.veso.online.BuildConfig;
import com.veso.online.R;
import com.veso.online.data.model.Constants;
import com.veso.online.data.model.MenuAction;
import com.veso.online.data.model.ResultTraditionLottery;
import com.veso.online.data.model.VietlotType;
import com.veso.online.data.model.XosoConfig;
import com.veso.online.databinding.ActivityMainBinding;
import com.veso.online.features.main.DatePickerDelegate;
import com.veso.online.features.mega.JackpotLotteryListFragment;
import com.veso.online.features.rate.IntroDialogFragment;
import com.veso.online.features.rate.RatingDialogFragment;
import com.veso.online.features.result.SlidableFragment;
import com.veso.online.features.result.detail.ResultDetailFragment;
import com.veso.online.utils.DateUtils;
import com.veso.online.utils.ExtensionsKt;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0016\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001JB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001cH\u0002J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000201H\u0002J\u0012\u00103\u001a\u0002012\b\u00104\u001a\u0004\u0018\u00010\u001eH\u0014J \u00105\u001a\u0002012\u0006\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u001dH\u0016J\b\u00109\u001a\u000201H\u0014J\b\u0010:\u001a\u000201H\u0014J\u0010\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020=H\u0016J&\u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020=0CH\u0016J\u0012\u0010D\u001a\u0002012\b\u0010E\u001a\u0004\u0018\u00010@H\u0016J\b\u0010F\u001a\u000201H\u0002J\b\u0010G\u001a\u000201H\u0002J\u0010\u0010H\u001a\u0002012\u0006\u0010/\u001a\u00020\u001cH\u0002J\b\u0010I\u001a\u000201H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0%X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R#\u0010(\u001a\n **\u0004\u0018\u00010)0)8BX\u0002¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\b+\u0010,¨\u0006K"}, d2 = {"Lcom/veso/online/features/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/veso/online/features/main/OnMenuItemSelected;", "Lcom/veso/online/features/main/ReadResultDelegate;", "Lcom/veso/online/features/main/DatePickerDelegate;", "()V", "appConfig", "Lcom/google/gson/JsonObject;", "getAppConfig", "()Lcom/google/gson/JsonObject;", "appConfig$delegate", "Lkotlin/Lazy;", "binding", "Lcom/veso/online/databinding/ActivityMainBinding;", "dateChangeConsumer", "Lcom/veso/online/features/main/DateChangeConsumer;", "drawerListener", "Landroidx/drawerlayout/widget/DrawerLayout$DrawerListener;", "getDrawerListener", "()Landroidx/drawerlayout/widget/DrawerLayout$DrawerListener;", "drawerListener$delegate", "interstitialListener", "com/veso/online/features/main/MainActivity$interstitialListener$1", "Lcom/veso/online/features/main/MainActivity$interstitialListener$1;", "numOfActions", "", "pendingAction", "Lkotlin/Triple;", "Lcom/veso/online/data/model/MenuAction;", "", "Landroid/os/Bundle;", "readingEngine", "Lcom/veso/online/features/main/ReadResultEngine;", "getReadingEngine", "()Lcom/veso/online/features/main/ReadResultEngine;", "readingEngine$delegate", "readingLiveData", "Landroidx/lifecycle/LiveData;", "getReadingLiveData", "()Landroidx/lifecycle/LiveData;", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "checkAndShowInterstitialAds", "action", "checkToShowRatingDialog", "", "initIronSource", "onCreate", "savedInstanceState", "onMenuSelected", "menuAction", "extraData", "fromLeftMenu", "onPause", "onResume", "readChannelResult", "result", "Lcom/veso/online/data/model/ResultTraditionLottery;", "readRegionResult", "regionId", "", "date", "results", "", "selectDate", "selectedDate", "showRatingDialog", "showReview", "showStatistic", "stopReading", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity extends AppCompatActivity implements OnMenuItemSelected, ReadResultDelegate, DatePickerDelegate {
    private static final List<MenuAction> ACTION_TO_SHOW_ADS = CollectionsKt.listOf(MenuAction.XOSO_NORTH, MenuAction.XOSO_MIDDLE, MenuAction.XOSO_SOUTH, MenuAction.XOSO_PROVINCE, MenuAction.XOSO_DATE, MenuAction.XOSO_DIEN_TOAN, MenuAction.XOSO_RESULT, MenuAction.XOSO_VIETLOT_MEGA, MenuAction.XOSO_VIETLOT_POWER, MenuAction.XOSO_MAX_3D, MenuAction.XOSO_MAX_3D_PRO, MenuAction.XOSO_KENO);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int NUM_OF_TIME_TO_SHOW_ADS = 1;
    private final Lazy appConfig$delegate = LazyKt.lazy(new MainActivity$appConfig$2(this));
    /* access modifiers changed from: private */
    public ActivityMainBinding binding;
    private DateChangeConsumer dateChangeConsumer;
    private final Lazy drawerListener$delegate = LazyKt.lazy(new MainActivity$drawerListener$2(this));
    private final MainActivity$interstitialListener$1 interstitialListener = new MainActivity$interstitialListener$1(this);
    private int numOfActions;
    private Triple<? extends MenuAction, Boolean, Bundle> pendingAction;
    private final Lazy readingEngine$delegate = LazyKt.lazy(new MainActivity$readingEngine$2(this));
    private final LiveData<Boolean> readingLiveData = new MutableLiveData();
    private final Lazy sharedPreferences$delegate = LazyKt.lazy(new MainActivity$sharedPreferences$2(this));

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* compiled from: MainActivity.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuAction.values().length];
            iArr[MenuAction.XOSO_NORTH.ordinal()] = 1;
            iArr[MenuAction.XOSO_MIDDLE.ordinal()] = 2;
            iArr[MenuAction.XOSO_SOUTH.ordinal()] = 3;
            iArr[MenuAction.XOSO_PROVINCE.ordinal()] = 4;
            iArr[MenuAction.XOSO_DATE.ordinal()] = 5;
            iArr[MenuAction.XOSO_DIEN_TOAN.ordinal()] = 6;
            iArr[MenuAction.XOSO_RESULT.ordinal()] = 7;
            iArr[MenuAction.XOSO_VIETLOT_MEGA.ordinal()] = 8;
            iArr[MenuAction.XOSO_VIETLOT_POWER.ordinal()] = 9;
            iArr[MenuAction.XOSO_MAX_3D.ordinal()] = 10;
            iArr[MenuAction.XOSO_MAX_3D_PRO.ordinal()] = 11;
            iArr[MenuAction.XOSO_KENO.ordinal()] = 12;
            iArr[MenuAction.STATISTIC_GAN.ordinal()] = 13;
            iArr[MenuAction.STATISTIC_MAX.ordinal()] = 14;
            iArr[MenuAction.STATISTIC_FREQ.ordinal()] = 15;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showReview$lambda-14$lambda-12  reason: not valid java name */
    public static final void m540showReview$lambda14$lambda12(Task task) {
        Intrinsics.checkNotNullParameter(task, "$noName_0");
    }

    private final SharedPreferences getSharedPreferences() {
        return (SharedPreferences) this.sharedPreferences$delegate.getValue();
    }

    public LiveData<Boolean> getReadingLiveData() {
        return this.readingLiveData;
    }

    private final JsonObject getAppConfig() {
        Object value = this.appConfig$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-appConfig>(...)");
        return (JsonObject) value;
    }

    private final DrawerLayout.DrawerListener getDrawerListener() {
        return (DrawerLayout.DrawerListener) this.drawerListener$delegate.getValue();
    }

    private final ReadResultEngine getReadingEngine() {
        return (ReadResultEngine) this.readingEngine$delegate.getValue();
    }

    /* JADX WARNING: type inference failed for: r4v22, types: [androidx.fragment.app.Fragment] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.view.LayoutInflater r4 = r3.getLayoutInflater()
            com.veso.online.databinding.ActivityMainBinding r4 = com.veso.online.databinding.ActivityMainBinding.inflate(r4)
            java.lang.String r0 = "inflate(layoutInflater)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            r3.binding = r4
            java.lang.String r0 = "binding"
            r1 = 0
            if (r4 != 0) goto L_0x001b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r4 = r1
        L_0x001b:
            androidx.drawerlayout.widget.DrawerLayout r4 = r4.getRoot()
            android.view.View r4 = (android.view.View) r4
            r3.setContentView((android.view.View) r4)
            com.veso.online.databinding.ActivityMainBinding r4 = r3.binding
            if (r4 != 0) goto L_0x002c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r4 = r1
        L_0x002c:
            androidx.drawerlayout.widget.DrawerLayout r4 = r4.drawerLayout
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r2 = r3.getDrawerListener()
            r4.addDrawerListener(r2)
            com.veso.online.databinding.ActivityMainBinding r4 = r3.binding
            if (r4 != 0) goto L_0x003d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r4 = r1
        L_0x003d:
            androidx.drawerlayout.widget.DrawerLayout r4 = r4.drawerLayout
            r2 = 0
            r4.setScrimColor(r2)
            com.veso.online.databinding.ActivityMainBinding r4 = r3.binding
            if (r4 != 0) goto L_0x004b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r4 = r1
        L_0x004b:
            android.widget.ImageButton r4 = r4.ibMenu
            com.veso.online.features.main.MainActivity$$ExternalSyntheticLambda2 r2 = new com.veso.online.features.main.MainActivity$$ExternalSyntheticLambda2
            r2.<init>(r3)
            r4.setOnClickListener(r2)
            com.veso.online.databinding.ActivityMainBinding r4 = r3.binding
            if (r4 != 0) goto L_0x005d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r4 = r1
        L_0x005d:
            android.widget.ImageButton r4 = r4.ibSelectDate
            com.veso.online.features.main.MainActivity$$ExternalSyntheticLambda1 r2 = new com.veso.online.features.main.MainActivity$$ExternalSyntheticLambda1
            r2.<init>(r3)
            r4.setOnClickListener(r2)
            com.veso.online.databinding.ActivityMainBinding r4 = r3.binding
            if (r4 != 0) goto L_0x006f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r4 = r1
        L_0x006f:
            android.widget.ImageButton r4 = r4.ibShare
            com.veso.online.features.main.MainActivity$$ExternalSyntheticLambda3 r0 = new com.veso.online.features.main.MainActivity$$ExternalSyntheticLambda3
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            androidx.fragment.app.FragmentManager r4 = r3.getSupportFragmentManager()
            r0 = 2131231085(0x7f08016d, float:1.8078241E38)
            androidx.fragment.app.Fragment r4 = r4.findFragmentById(r0)
            boolean r0 = r4 instanceof androidx.navigation.fragment.NavHostFragment
            if (r0 == 0) goto L_0x008b
            r1 = r4
            androidx.navigation.fragment.NavHostFragment r1 = (androidx.navigation.fragment.NavHostFragment) r1
        L_0x008b:
            if (r1 != 0) goto L_0x008e
            goto L_0x009a
        L_0x008e:
            androidx.fragment.app.FragmentManager r4 = r1.getChildFragmentManager()
            com.veso.online.features.main.MainActivity$$ExternalSyntheticLambda4 r0 = new com.veso.online.features.main.MainActivity$$ExternalSyntheticLambda4
            r0.<init>(r1, r3)
            r4.addOnBackStackChangedListener(r0)
        L_0x009a:
            r3.initIronSource()
            r3.checkToShowRatingDialog()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veso.online.features.main.MainActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m534onCreate$lambda0(MainActivity mainActivity, View view) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        ActivityMainBinding activityMainBinding = mainActivity.binding;
        ActivityMainBinding activityMainBinding2 = null;
        if (activityMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding = null;
        }
        if (activityMainBinding.drawerLayout.isDrawerOpen((int) GravityCompat.START)) {
            ActivityMainBinding activityMainBinding3 = mainActivity.binding;
            if (activityMainBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityMainBinding2 = activityMainBinding3;
            }
            activityMainBinding2.drawerLayout.closeDrawer((int) GravityCompat.START);
            return;
        }
        ActivityMainBinding activityMainBinding4 = mainActivity.binding;
        if (activityMainBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMainBinding2 = activityMainBinding4;
        }
        activityMainBinding2.drawerLayout.openDrawer((int) GravityCompat.START);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m535onCreate$lambda1(MainActivity mainActivity, View view) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        DatePickerDelegate.DefaultImpls.selectDate$default(mainActivity, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-2  reason: not valid java name */
    public static final void m536onCreate$lambda2(MainActivity mainActivity, View view) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        ExtensionsKt.shareApp(mainActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-4$lambda-3  reason: not valid java name */
    public static final void m537onCreate$lambda4$lambda3(NavHostFragment navHostFragment, MainActivity mainActivity) {
        Intrinsics.checkNotNullParameter(navHostFragment, "$navHostFragment");
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        List<Fragment> fragments = navHostFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "navHostFragment.childFragmentManager.fragments");
        Fragment fragment = (Fragment) CollectionsKt.lastOrNull(fragments);
        ActivityMainBinding activityMainBinding = null;
        mainActivity.dateChangeConsumer = fragment instanceof DateChangeConsumer ? (DateChangeConsumer) fragment : null;
        ActivityMainBinding activityMainBinding2 = mainActivity.binding;
        if (activityMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding2 = null;
        }
        ImageButton imageButton = activityMainBinding2.ibSelectDate;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.ibSelectDate");
        View view = imageButton;
        int i = 0;
        if (!(mainActivity.dateChangeConsumer != null)) {
            i = 8;
        }
        view.setVisibility(i);
        AppTitleDelegate appTitleDelegate = fragment instanceof AppTitleDelegate ? (AppTitleDelegate) fragment : null;
        int titleRes = appTitleDelegate == null ? R.string.app_title : appTitleDelegate.getTitleRes();
        ActivityMainBinding activityMainBinding3 = mainActivity.binding;
        if (activityMainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMainBinding = activityMainBinding3;
        }
        activityMainBinding.tvAppTitle.setText(titleRes);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        IronSource.onResume(this);
        Triple<? extends MenuAction, Boolean, Bundle> triple = this.pendingAction;
        if (triple != null) {
            onMenuSelected((MenuAction) triple.getFirst(), triple.getThird(), triple.getSecond().booleanValue());
            this.pendingAction = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        IronSource.onPause(this);
    }

    public void onMenuSelected(MenuAction menuAction, Bundle bundle, boolean z) {
        VietlotType vietlotType;
        Intrinsics.checkNotNullParameter(menuAction, "menuAction");
        Intrinsics.checkNotNullParameter(bundle, "extraData");
        if (this.pendingAction != null || !checkAndShowInterstitialAds(menuAction)) {
            NavController findNavController = ActivityKt.findNavController(this, R.id.nav_host_fragment);
            findNavController.popBackStack((int) R.id.menuFragment, false);
            if (z) {
                ActivityMainBinding activityMainBinding = this.binding;
                if (activityMainBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMainBinding = null;
                }
                activityMainBinding.drawerLayout.closeDrawer((int) GravityCompat.START);
            }
            switch (WhenMappings.$EnumSwitchMapping$0[menuAction.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    int i = WhenMappings.$EnumSwitchMapping$0[menuAction.ordinal()];
                    findNavController.navigate((int) R.id.action_menuFragment_to_slidableFragment, ResultDetailFragment.Companion.argsForRegion$default(ResultDetailFragment.Companion, i != 1 ? i != 2 ? XosoConfig.REGION_ID_SOUTH : XosoConfig.REGION_ID_MIDDLE : XosoConfig.REGION_ID_NORTH, (String) null, 2, (Object) null));
                    return;
                case 4:
                    findNavController.navigate((int) R.id.action_menuFragment_to_xosoProvincePickerFragment);
                    return;
                case 5:
                    findNavController.navigate((int) R.id.action_menuFragment_to_xosoDatePickerFragment);
                    return;
                case 6:
                    findNavController.navigate((int) R.id.action_menuFragment_to_xosoDienToanMBFragment);
                    return;
                case 7:
                    findNavController.navigate((int) R.id.action_menuFragment_to_slidableFragment, bundle);
                    return;
                case 8:
                case 9:
                case 10:
                case 11:
                    switch (WhenMappings.$EnumSwitchMapping$0[menuAction.ordinal()]) {
                        case 9:
                            vietlotType = VietlotType.POWER;
                            break;
                        case 10:
                            vietlotType = VietlotType.MAX3D;
                            break;
                        case 11:
                            vietlotType = VietlotType.MAX3DPRO;
                            break;
                        default:
                            vietlotType = VietlotType.MEGA;
                            break;
                    }
                    findNavController.navigate((int) R.id.action_menuFragment_to_megaLotteryListFragment, JackpotLotteryListFragment.Companion.args(vietlotType));
                    return;
                case 12:
                    findNavController.navigate((int) R.id.action_menuFragment_to_kenoResultListFragment);
                    return;
                case 13:
                case 14:
                case 15:
                    showStatistic(menuAction);
                    return;
                default:
                    return;
            }
        } else {
            this.pendingAction = new Triple<>(menuAction, Boolean.valueOf(z), bundle);
        }
    }

    public void readRegionResult(String str, String str2, List<ResultTraditionLottery> list) {
        Intrinsics.checkNotNullParameter(str, "regionId");
        Intrinsics.checkNotNullParameter(str2, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(list, "results");
        getReadingEngine().readRegionResult(str, str2, list);
    }

    public void readChannelResult(ResultTraditionLottery resultTraditionLottery) {
        Intrinsics.checkNotNullParameter(resultTraditionLottery, IronSourceConstants.EVENTS_RESULT);
        getReadingEngine().readChannelResult(resultTraditionLottery);
    }

    public void stopReading() {
        getReadingEngine().stopReading();
    }

    public void selectDate(String str) {
        Date parseDate;
        Calendar instance = Calendar.getInstance();
        if (!(str == null || (parseDate = DateUtils.INSTANCE.parseDate(str)) == null)) {
            instance.setTimeInMillis(parseDate.getTime());
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new MainActivity$$ExternalSyntheticLambda0(instance, this), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.show();
        datePickerDialog.getDatePicker().setMaxDate(Calendar.getInstance().getTimeInMillis());
    }

    /* access modifiers changed from: private */
    /* renamed from: selectDate$lambda-9  reason: not valid java name */
    public static final void m538selectDate$lambda9(Calendar calendar, MainActivity mainActivity, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        calendar.set(1, i);
        calendar.set(2, i2);
        calendar.set(5, i3);
        DateChangeConsumer dateChangeConsumer2 = mainActivity.dateChangeConsumer;
        if (dateChangeConsumer2 != null) {
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "cal.time");
            dateChangeConsumer2.onDateChanged(time);
        }
    }

    private final void checkToShowRatingDialog() {
        Integer num;
        Boolean bool;
        SharedPreferences sharedPreferences = getSharedPreferences();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Integer.class);
        if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(String.class))) {
            String string = sharedPreferences.getString(Constants.SharePrefKeys.OPEN_TIMES, "");
            Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.Int");
            num = (Integer) string;
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            num = (Integer) Boolean.valueOf(sharedPreferences.getBoolean(Constants.SharePrefKeys.OPEN_TIMES, false));
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(Float.TYPE))) {
            num = (Integer) Float.valueOf(sharedPreferences.getFloat(Constants.SharePrefKeys.OPEN_TIMES, 0.0f));
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            num = Integer.valueOf(sharedPreferences.getInt(Constants.SharePrefKeys.OPEN_TIMES, 0));
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            num = (Integer) Long.valueOf(sharedPreferences.getLong(Constants.SharePrefKeys.OPEN_TIMES, 0));
        } else {
            String string2 = sharedPreferences.getString(Constants.SharePrefKeys.OPEN_TIMES, "");
            Objects.requireNonNull(string2, "null cannot be cast to non-null type kotlin.Int");
            num = (Integer) string2;
        }
        int intValue = num.intValue();
        SharedPreferences sharedPreferences2 = getSharedPreferences();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "sharedPreferences");
        ExtensionsKt.set$default(sharedPreferences2, Constants.SharePrefKeys.OPEN_TIMES, Integer.valueOf(intValue + 1), false, 4, (Object) null);
        if (intValue == 0) {
            IntroDialogFragment introDialogFragment = new IntroDialogFragment();
            introDialogFragment.setListener(new MainActivity$checkToShowRatingDialog$1$1(this));
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            ExtensionsKt.showAllowingStateLoss(introDialogFragment, supportFragmentManager, "");
            return;
        }
        if (CollectionsKt.arrayListOf(3, 6, 9).contains(Integer.valueOf(intValue))) {
            SharedPreferences sharedPreferences3 = getSharedPreferences();
            Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "sharedPreferences");
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Boolean.class);
            if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(String.class))) {
                String string3 = sharedPreferences3.getString(Constants.SharePrefKeys.IS_USER_RATED, "");
                Objects.requireNonNull(string3, "null cannot be cast to non-null type kotlin.Boolean");
                bool = (Boolean) string3;
            } else if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                bool = Boolean.valueOf(sharedPreferences3.getBoolean(Constants.SharePrefKeys.IS_USER_RATED, false));
            } else if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                bool = (Boolean) Float.valueOf(sharedPreferences3.getFloat(Constants.SharePrefKeys.IS_USER_RATED, 0.0f));
            } else if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                bool = (Boolean) Integer.valueOf(sharedPreferences3.getInt(Constants.SharePrefKeys.IS_USER_RATED, 0));
            } else if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                bool = (Boolean) Long.valueOf(sharedPreferences3.getLong(Constants.SharePrefKeys.IS_USER_RATED, 0));
            } else {
                String string4 = sharedPreferences3.getString(Constants.SharePrefKeys.IS_USER_RATED, "");
                Objects.requireNonNull(string4, "null cannot be cast to non-null type kotlin.Boolean");
                bool = (Boolean) string4;
            }
            if (!bool.booleanValue()) {
                showRatingDialog();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void showReview() {
        ReviewManager create = ReviewManagerFactory.create(this);
        Intrinsics.checkNotNullExpressionValue(create, "create(this)");
        Task<ReviewInfo> requestReviewFlow = create.requestReviewFlow();
        Intrinsics.checkNotNullExpressionValue(requestReviewFlow, "manager.requestReviewFlow()");
        requestReviewFlow.addOnCompleteListener(new MainActivity$$ExternalSyntheticLambda5(create, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: showReview$lambda-14  reason: not valid java name */
    public static final void m539showReview$lambda14(ReviewManager reviewManager, MainActivity mainActivity, Task task) {
        Intrinsics.checkNotNullParameter(reviewManager, "$manager");
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Task<Void> launchReviewFlow = reviewManager.launchReviewFlow(mainActivity, (ReviewInfo) task.getResult());
            Intrinsics.checkNotNullExpressionValue(launchReviewFlow, "manager.launchReviewFlow…MainActivity, reviewInfo)");
            SharedPreferences sharedPreferences = mainActivity.getSharedPreferences();
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
            ExtensionsKt.set$default(sharedPreferences, Constants.SharePrefKeys.IS_USER_RATED, true, false, 4, (Object) null);
            launchReviewFlow.addOnCompleteListener(MainActivity$$ExternalSyntheticLambda6.INSTANCE);
            launchReviewFlow.addOnFailureListener(MainActivity$$ExternalSyntheticLambda7.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showReview$lambda-14$lambda-13  reason: not valid java name */
    public static final void m541showReview$lambda14$lambda13(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "it");
        exc.printStackTrace();
    }

    /* access modifiers changed from: private */
    public final void showRatingDialog() {
        RatingDialogFragment ratingDialogFragment = new RatingDialogFragment();
        ratingDialogFragment.setListener(new MainActivity$showRatingDialog$1$1(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        ExtensionsKt.showAllowingStateLoss(ratingDialogFragment, supportFragmentManager, "");
    }

    private final void showStatistic(MenuAction menuAction) {
        int i = WhenMappings.$EnumSwitchMapping$0[menuAction.ordinal()];
        String asString = getAppConfig().get(i != 13 ? i != 14 ? "url_freq" : "url_loto_roi" : "url_loto_gan").getAsString();
        Context context = this;
        CustomTabColorSchemeParams build = new CustomTabColorSchemeParams.Builder().setToolbarColor(ContextCompat.getColor(context, R.color.primary)).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ry))\n            .build()");
        new CustomTabsIntent.Builder().setDefaultColorSchemeParams(build).setShowTitle(true).build().launchUrl(context, Uri.parse(asString));
    }

    private final void initIronSource() {
        IronSource.setInterstitialListener(this.interstitialListener);
        IronSource.init(this, BuildConfig.IRON_SOURCE_APP_ID, MainActivity$$ExternalSyntheticLambda8.INSTANCE, IronSource.AD_UNIT.INTERSTITIAL);
    }

    /* access modifiers changed from: private */
    /* renamed from: initIronSource$lambda-17  reason: not valid java name */
    public static final void m533initIronSource$lambda17() {
        IronSource.loadInterstitial();
    }

    private final boolean checkAndShowInterstitialAds(MenuAction menuAction) {
        if (ACTION_TO_SHOW_ADS.contains(menuAction)) {
            int i = this.numOfActions + 1;
            this.numOfActions = i;
            if (i >= 1 && IronSource.isInterstitialReady()) {
                IronSource.showInterstitial();
                this.numOfActions = 0;
                return true;
            }
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/veso/online/features/main/MainActivity$Companion;", "", "()V", "ACTION_TO_SHOW_ADS", "", "Lcom/veso/online/data/model/MenuAction;", "NUM_OF_TIME_TO_SHOW_ADS", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: MainActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
