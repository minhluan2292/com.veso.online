package com.veso.online.features.main;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.os.Handler;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.veso.online.data.model.ResultTraditionLottery;
import com.veso.online.features.result.SlidableFragment;
import com.veso.online.utils.DateUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 22\u00020\u0001:\u00012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#2\u0006\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020!H\u0002J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0#2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\fH\u0002J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020!H\u0002J\b\u0010+\u001a\u00020\u0013H\u0002J\u000e\u0010,\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'J$\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020!2\f\u00100\u001a\b\u0012\u0004\u0012\u00020'0#J\u0006\u00101\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/veso/online/features/main/ReadResultEngine;", "", "asset", "Landroid/content/res/AssetManager;", "(Landroid/content/res/AssetManager;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "value", "", "isReading", "()Z", "setReading", "(Z)V", "onStateChangedCallback", "Lkotlin/Function1;", "", "getOnStateChangedCallback", "()Lkotlin/jvm/functions/Function1;", "setOnStateChangedCallback", "(Lkotlin/jvm/functions/Function1;)V", "player", "Landroid/media/MediaPlayer;", "getPlayer", "()Landroid/media/MediaPlayer;", "player$delegate", "playingTracks", "", "Lcom/veso/online/features/main/Track;", "voice", "", "buildDateTrack", "", "dateStr", "buildResultTrack", "result", "Lcom/veso/online/data/model/ResultTraditionLottery;", "isRegion", "playMedia", "src", "playNextTrack", "readChannelResult", "readRegionResult", "regionId", "date", "results", "stopReading", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ReadResultEngine.kt */
public final class ReadResultEngine {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String VOICE_MAN = "man";
    private static final String VOICE_WOMEN = "women";
    private final AssetManager asset;
    private final Lazy handler$delegate = LazyKt.lazy(ReadResultEngine$handler$2.INSTANCE);
    private boolean isReading;
    private Function1<? super Boolean, Unit> onStateChangedCallback;
    private final Lazy player$delegate = LazyKt.lazy(new ReadResultEngine$player$2(this));
    private List<Track> playingTracks = new ArrayList();
    private String voice = VOICE_MAN;

    public ReadResultEngine(AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "asset");
        this.asset = assetManager;
    }

    private final MediaPlayer getPlayer() {
        return (MediaPlayer) this.player$delegate.getValue();
    }

    private final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    public final Function1<Boolean, Unit> getOnStateChangedCallback() {
        return this.onStateChangedCallback;
    }

    public final void setOnStateChangedCallback(Function1<? super Boolean, Unit> function1) {
        this.onStateChangedCallback = function1;
    }

    public final boolean isReading() {
        return this.isReading;
    }

    private final void setReading(boolean z) {
        Function1<? super Boolean, Unit> function1;
        if (!(this.isReading == z || (function1 = this.onStateChangedCallback) == null)) {
            function1.invoke(Boolean.valueOf(z));
        }
        this.isReading = z;
    }

    public final void readRegionResult(String str, String str2, List<ResultTraditionLottery> list) {
        Intrinsics.checkNotNullParameter(str, "regionId");
        Intrinsics.checkNotNullParameter(str2, SlidableFragment.KEY_DATE);
        Intrinsics.checkNotNullParameter(list, "results");
        stopReading();
        this.voice = Math.random() > 0.5d ? VOICE_MAN : VOICE_WOMEN;
        List arrayList = new ArrayList();
        arrayList.add(new Track(this.voice + "/kq_mien" + str + ".mp3", 0, 2, (DefaultConstructorMarker) null));
        arrayList.addAll(buildDateTrack(str2, this.voice));
        for (ResultTraditionLottery buildResultTrack : list) {
            arrayList.addAll(buildResultTrack(buildResultTrack, true));
        }
        this.playingTracks = CollectionsKt.toMutableList(arrayList);
        playNextTrack();
    }

    public final void readChannelResult(ResultTraditionLottery resultTraditionLottery) {
        Intrinsics.checkNotNullParameter(resultTraditionLottery, IronSourceConstants.EVENTS_RESULT);
        stopReading();
        this.voice = Math.random() > 0.5d ? VOICE_MAN : VOICE_WOMEN;
        List arrayList = new ArrayList();
        arrayList.add(new Track(this.voice + "/kq_tinh" + resultTraditionLottery.getId() + ".mp3", 0, 2, (DefaultConstructorMarker) null));
        arrayList.addAll(buildDateTrack(resultTraditionLottery.getDate(), this.voice));
        arrayList.addAll(buildResultTrack(resultTraditionLottery, false));
        this.playingTracks = CollectionsKt.toMutableList(arrayList);
        playNextTrack();
    }

    public final void stopReading() {
        setReading(false);
        getHandler().removeCallbacksAndMessages((Object) null);
        if (getPlayer().isPlaying()) {
            getPlayer().stop();
            getPlayer().reset();
        }
    }

    /* access modifiers changed from: private */
    public final void playNextTrack() {
        if (this.playingTracks.isEmpty()) {
            setReading(false);
            return;
        }
        setReading(true);
        Track track = (Track) CollectionsKt.removeFirst(this.playingTracks);
        if (track.getDelay() > 0) {
            getHandler().postDelayed(new ReadResultEngine$$ExternalSyntheticLambda0(this, track), track.getDelay());
        } else {
            playMedia(track.getFileName());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: playNextTrack$lambda-1  reason: not valid java name */
    public static final void m543playNextTrack$lambda1(ReadResultEngine readResultEngine, Track track) {
        Intrinsics.checkNotNullParameter(readResultEngine, "this$0");
        Intrinsics.checkNotNullParameter(track, "$track");
        readResultEngine.playMedia(track.getFileName());
    }

    private final void playMedia(String str) {
        try {
            AssetFileDescriptor openFd = this.asset.openFd(str);
            Intrinsics.checkNotNullExpressionValue(openFd, "asset.openFd(src)");
            getPlayer().reset();
            getPlayer().setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            getPlayer().prepare();
            getPlayer().start();
        } catch (Exception e) {
            e.printStackTrace();
            playNextTrack();
        }
    }

    private final List<Track> buildDateTrack(String str, String str2) {
        Date parseDate = DateUtils.INSTANCE.parseDate(str);
        if (parseDate == null) {
            return CollectionsKt.emptyList();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(parseDate.getTime());
        return CollectionsKt.listOf(new Track(str2 + "/thu" + instance.get(7) + ".mp3", 700), new Track(str2 + "/ngay" + instance.get(5) + ".mp3", 200), new Track(str2 + "/thang" + (instance.get(2) + 1) + ".mp3", 200), new Track(str2 + "/nam" + instance.get(1) + ".mp3", 200));
    }

    private final List<Track> buildResultTrack(ResultTraditionLottery resultTraditionLottery, boolean z) {
        List<Track> arrayList = new ArrayList<>();
        if (z) {
            arrayList.add(new Track(this.voice + "/tinh" + resultTraditionLottery.getId() + ".mp3", 500));
        }
        for (Pair pair : CollectionsKt.sortedWith(resultTraditionLottery.getPrizes(), new ReadResultEngine$buildResultTrack$$inlined$sortedByDescending$1())) {
            if (((Number) pair.getFirst()).intValue() > 0) {
                arrayList.add(new Track(this.voice + "/g" + ((Number) pair.getFirst()).intValue() + "_tc.mp3", 700));
            } else {
                arrayList.add(new Track(this.voice + "/g" + ((Number) pair.getFirst()).intValue() + "_s.mp3", 700));
            }
            for (CharSequence charSequence : (Iterable) pair.getSecond()) {
                int i = 0;
                int i2 = 0;
                while (i < charSequence.length()) {
                    int i3 = i2 + 1;
                    arrayList.add(new Track(this.voice + '/' + charSequence.charAt(i) + ".mp3", i2 == 0 ? 500 : 20));
                    i++;
                    i2 = i3;
                }
            }
            this.voice = Companion.switchVoice(this.voice);
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/veso/online/features/main/ReadResultEngine$Companion;", "", "()V", "VOICE_MAN", "", "VOICE_WOMEN", "switchVoice", "voice", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: ReadResultEngine.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final String switchVoice(String str) {
            return Intrinsics.areEqual((Object) str, (Object) ReadResultEngine.VOICE_MAN) ? ReadResultEngine.VOICE_WOMEN : ReadResultEngine.VOICE_MAN;
        }
    }
}
