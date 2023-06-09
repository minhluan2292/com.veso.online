package com.google.firebase.heartbeatinfo;

import java.util.List;
import java.util.Objects;

final class AutoValue_HeartBeatResult extends HeartBeatResult {
    private final List<String> usedDates;
    private final String userAgent;

    AutoValue_HeartBeatResult(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.userAgent = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.usedDates = list;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public List<String> getUsedDates() {
        return this.usedDates;
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.userAgent + ", usedDates=" + this.usedDates + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        if (!this.userAgent.equals(heartBeatResult.getUserAgent()) || !this.usedDates.equals(heartBeatResult.getUsedDates())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.userAgent.hashCode() ^ 1000003) * 1000003) ^ this.usedDates.hashCode();
    }
}
