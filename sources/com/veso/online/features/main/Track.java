package com.veso.online.features.main;

import com.veso.online.data.model.ResultConfig$$ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/veso/online/features/main/Track;", "", "fileName", "", "delay", "", "(Ljava/lang/String;J)V", "getDelay", "()J", "getFileName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ReadResultEngine.kt */
public final class Track {
    private final long delay;
    private final String fileName;

    public static /* synthetic */ Track copy$default(Track track, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = track.fileName;
        }
        if ((i & 2) != 0) {
            j = track.delay;
        }
        return track.copy(str, j);
    }

    public final String component1() {
        return this.fileName;
    }

    public final long component2() {
        return this.delay;
    }

    public final Track copy(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "fileName");
        return new Track(str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track track = (Track) obj;
        return Intrinsics.areEqual((Object) this.fileName, (Object) track.fileName) && this.delay == track.delay;
    }

    public int hashCode() {
        return (this.fileName.hashCode() * 31) + ResultConfig$$ExternalSyntheticBackport0.m(this.delay);
    }

    public String toString() {
        return "Track(fileName=" + this.fileName + ", delay=" + this.delay + ')';
    }

    public Track(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "fileName");
        this.fileName = str;
        this.delay = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Track(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0 : j);
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getDelay() {
        return this.delay;
    }
}
