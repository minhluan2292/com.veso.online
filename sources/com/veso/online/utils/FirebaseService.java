package com.veso.online.utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.veso.online.R;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\u0010"}, d2 = {"Lcom/veso/online/utils/FirebaseService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "createNotificationChannel", "", "notificationManager", "Landroid/app/NotificationManager;", "channelId", "", "handleNotificationAndroidO", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "sendRegistrationToServer", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: FirebaseService.kt */
public final class FirebaseService extends FirebaseMessagingService {
    private final void sendRegistrationToServer(String str) {
    }

    public void onNewToken(String str) {
        Intrinsics.checkNotNullParameter(str, IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY);
        sendRegistrationToServer(str);
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        Object systemService = getSystemService("notification");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        String string = getString(R.string.project_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.project_id)");
        if (Build.VERSION.SDK_INT >= 26) {
            handleNotificationAndroidO(notificationManager, string);
        }
        Context context = this;
        NotificationCompat.Builder contentTitle = new NotificationCompat.Builder(context, string).setAutoCancel(true).setColor(ContextCompat.getColor(context, R.color.bg_screen)).setContentTitle(getString(R.string.app_name));
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        Notification build = contentTitle.setContentText(notification == null ? null : notification.getBody()).setDefaults(-1).setWhen(System.currentTimeMillis()).setSmallIcon((int) R.mipmap.ic_launcher).setAutoCancel(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(this, channelId)…rue)\n            .build()");
        notificationManager.notify(1000, build);
    }

    private final void handleNotificationAndroidO(NotificationManager notificationManager, String str) {
        createNotificationChannel(notificationManager, str);
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            notificationChannel.canBypassDnd();
        }
    }

    private final void createNotificationChannel(NotificationManager notificationManager, String str) {
        notificationManager.createNotificationChannel(new NotificationChannel(str, getString(R.string.app_name), 4));
    }
}
