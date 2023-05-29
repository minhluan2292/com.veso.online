package com.veso.online.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.veso.online.R;
import com.veso.online.data.model.PrizeDisplayType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\n\u001a\u0002H\u000b\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\b¢\u0006\u0002\u0010\u000f\u001a\n\u0010\u0010\u001a\u00020\u000e*\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u000e*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0011\u001a(\u0010\u0018\u001a\u0004\u0018\u0001H\u000b\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u0019*\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eH\b¢\u0006\u0002\u0010\u001b\u001a(\u0010\u0018\u001a\u0004\u0018\u0001H\u000b\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u0019*\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000eH\b¢\u0006\u0002\u0010\u001d\u001a)\u0010\u001e\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\u001f\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u0019*\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eH\b\u001a)\u0010\u001e\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\u001f\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u0019*\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000eH\b\u001a(\u0010 \u001a\u0004\u0018\u0001H\u000b\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020!*\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eH\b¢\u0006\u0002\u0010\"\u001a(\u0010 \u001a\u0004\u0018\u0001H\u000b\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020!*\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000eH\b¢\u0006\u0002\u0010#\u001a/\u0010$\u001a\u00020%\"\u0004\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u0002H\u000b2\b\b\u0002\u0010'\u001a\u00020\u0017¢\u0006\u0002\u0010(\u001a\n\u0010)\u001a\u00020%*\u00020\u0001\u001a\u001a\u0010*\u001a\u00020%*\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u000e\u001a\u001a\u0010/\u001a\u00020%*\u00020\u00012\u0006\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u000e\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u00062"}, d2 = {"context", "Landroid/content/Context;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getContext", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/content/Context;", "screenWidth", "", "Landroid/app/Activity;", "getScreenWidth", "(Landroid/app/Activity;)I", "get", "T", "Landroid/content/SharedPreferences;", "key", "", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/Object;", "getDateOfWeek", "Ljava/util/Date;", "getDisplayText", "Lcom/veso/online/data/model/PrizeDisplayType;", "data", "", "isToday", "", "parcelable", "Landroid/os/Parcelable;", "Landroid/content/Intent;", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "parcelableArrayList", "Ljava/util/ArrayList;", "serializable", "Ljava/io/Serializable;", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/io/Serializable;", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "set", "", "value", "commitNow", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;Z)V", "shareApp", "showAllowingStateLoss", "Landroidx/fragment/app/DialogFragment;", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "trackScreen", "screenName", "screenClass", "app_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* compiled from: Extensions.kt */
public final class ExtensionsKt {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* compiled from: Extensions.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrizeDisplayType.values().length];
            iArr[PrizeDisplayType.TWO_NUM.ordinal()] = 1;
            iArr[PrizeDisplayType.THREE_NUM.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getDateOfWeek(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(date.getTime());
        int i = instance.get(7);
        if (i == 1) {
            return "CN";
        }
        return Intrinsics.stringPlus(RequestConfiguration.MAX_AD_CONTENT_RATING_T, Integer.valueOf(i));
    }

    public static final Context getContext(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "<this>");
        Context context = viewHolder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
        return context;
    }

    public static final String getDisplayText(PrizeDisplayType prizeDisplayType, Object obj) {
        Intrinsics.checkNotNullParameter(prizeDisplayType, "<this>");
        Intrinsics.checkNotNullParameter(obj, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        String obj2 = obj.toString();
        int i = WhenMappings.$EnumSwitchMapping$0[prizeDisplayType.ordinal()];
        int i2 = 2;
        if (i != 1) {
            i2 = i != 2 ? Integer.MAX_VALUE : 3;
        }
        if (obj2.length() <= i2) {
            return obj2;
        }
        String substring = obj2.substring(obj2.length() - i2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final boolean isToday(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(date.getTime());
        if (instance2.get(1) == instance.get(1) && instance2.get(6) == instance.get(6)) {
            return true;
        }
        return false;
    }

    public static final void shareApp(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", context.getString(R.string.share_app_message, new Object[]{context.getPackageName()}));
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, (CharSequence) null));
    }

    public static final void trackScreen(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "screenClass");
        FirebaseAnalytics.getInstance(context).logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, BundleKt.bundleOf(TuplesKt.to(FirebaseAnalytics.Param.SCREEN_NAME, str), TuplesKt.to(FirebaseAnalytics.Param.SCREEN_CLASS, str2)));
    }

    public static final /* synthetic */ <T extends Parcelable> T parcelable(Intent intent, String str) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            return intent.getParcelableExtra(str);
        }
        T parcelableExtra = intent.getParcelableExtra(str);
        Intrinsics.reifiedOperationMarker(2, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Parcelable parcelable = (Parcelable) parcelableExtra;
        Parcelable parcelable2 = (Parcelable) parcelableExtra;
        return parcelableExtra;
    }

    public static final /* synthetic */ <T extends Parcelable> T parcelable(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            return bundle.getParcelable(str);
        }
        T parcelable = bundle.getParcelable(str);
        Intrinsics.reifiedOperationMarker(2, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Parcelable parcelable2 = (Parcelable) parcelable;
        Parcelable parcelable3 = (Parcelable) parcelable;
        return parcelable;
    }

    public static final /* synthetic */ <T extends Parcelable> ArrayList<T> parcelableArrayList(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            return bundle.getParcelableArrayList(str);
        }
        return bundle.getParcelableArrayList(str);
    }

    public static final /* synthetic */ <T extends Parcelable> ArrayList<T> parcelableArrayList(Intent intent, String str) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            return intent.getParcelableArrayListExtra(str);
        }
        return intent.getParcelableArrayListExtra(str);
    }

    public static final /* synthetic */ <T extends Serializable> T serializable(Intent intent, String str) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            T serializableExtra = intent.getSerializableExtra(str);
            Intrinsics.reifiedOperationMarker(2, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            Serializable serializable = (Serializable) serializableExtra;
            Serializable serializable2 = (Serializable) serializableExtra;
            return serializableExtra;
        }
        T serializableExtra2 = intent.getSerializableExtra(str);
        Intrinsics.reifiedOperationMarker(2, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Serializable serializable3 = (Serializable) serializableExtra2;
        Serializable serializable4 = (Serializable) serializableExtra2;
        return serializableExtra2;
    }

    public static final /* synthetic */ <T extends Serializable> T serializable(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            T serializable = bundle.getSerializable(str);
            Intrinsics.reifiedOperationMarker(2, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            Serializable serializable2 = (Serializable) serializable;
            Serializable serializable3 = (Serializable) serializable;
            return serializable;
        }
        T serializable4 = bundle.getSerializable(str);
        Intrinsics.reifiedOperationMarker(2, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Serializable serializable5 = (Serializable) serializable4;
        Serializable serializable6 = (Serializable) serializable4;
        return serializable4;
    }

    public static final void showAllowingStateLoss(DialogFragment dialogFragment, FragmentManager fragmentManager, String str) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(fragmentManager, "manager");
        Intrinsics.checkNotNullParameter(str, "tag");
        fragmentManager.beginTransaction().add((Fragment) dialogFragment, str).commitAllowingStateLoss();
    }

    public static /* synthetic */ void set$default(SharedPreferences sharedPreferences, String str, Object obj, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = false;
        }
        set(sharedPreferences, str, obj, z);
    }

    public static final /* synthetic */ <T> T get(SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(String.class))) {
            T string = sharedPreferences.getString(str, "");
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return (Object) string;
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            T valueOf = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return (Object) valueOf;
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(Float.TYPE))) {
            T valueOf2 = Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return (Object) valueOf2;
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            T valueOf3 = Integer.valueOf(sharedPreferences.getInt(str, 0));
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return (Object) valueOf3;
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            T valueOf4 = Long.valueOf(sharedPreferences.getLong(str, 0));
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return (Object) valueOf4;
        } else {
            T string2 = sharedPreferences.getString(str, "");
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return (Object) string2;
        }
    }

    public static final int getScreenWidth(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            return activity.getResources().getDisplayMetrics().widthPixels;
        }
        WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "this.windowManager.currentWindowMetrics");
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "windowMetrics.windowInse…Insets.Type.systemBars())");
        return (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
    }

    public static final <T> void set(SharedPreferences sharedPreferences, String str, T t, boolean z) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "editor");
        if (t instanceof String) {
            edit.putString(str, (String) t);
        } else if (t instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Float) {
            edit.putFloat(str, ((Number) t).floatValue());
        } else if (t instanceof Integer) {
            edit.putInt(str, ((Number) t).intValue());
        } else if (t instanceof Long) {
            edit.putLong(str, ((Number) t).longValue());
        }
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
