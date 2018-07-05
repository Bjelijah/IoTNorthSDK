package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class Condition_CycleTimer {
    @SerializedName("type")         String type;
    @SerializedName("id")           String id;
    @SerializedName("timeRange")    String timeRange;
    @SerializedName("interval")     Integer interval;

    @Override
    public String toString() {
        return "Condition_CycleTimer{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", timeRange='" + timeRange + '\'' +
                ", interval=" + interval +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Condition_CycleTimer() {

    }

    public Condition_CycleTimer(String type, String id, String timeRange, Integer interval) {

        this.type = type;
        this.id = id;
        this.timeRange = timeRange;
        this.interval = interval;
    }
}
