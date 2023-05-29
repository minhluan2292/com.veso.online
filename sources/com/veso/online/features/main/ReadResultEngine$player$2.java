package com.veso.online.features.main;

import android.media.MediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/MediaPlayer;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: ReadResultEngine.kt */
final class ReadResultEngine$player$2 extends Lambda implements Function0<MediaPlayer> {
    final /* synthetic */ ReadResultEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReadResultEngine$player$2(ReadResultEngine readResultEngine) {
        super(0);
        this.this$0 = readResultEngine;
    }

    public final MediaPlayer invoke() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(new ReadResultEngine$player$2$$ExternalSyntheticLambda0(this.this$0));
        return mediaPlayer;
    }

    /* access modifiers changed from: private */
    /* renamed from: invoke$lambda-1$lambda-0  reason: not valid java name */
    public static final void m544invoke$lambda1$lambda0(ReadResultEngine readResultEngine, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(readResultEngine, "this$0");
        readResultEngine.playNextTrack();
    }
}
