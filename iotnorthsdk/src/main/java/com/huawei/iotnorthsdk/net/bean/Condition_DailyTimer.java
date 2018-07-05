package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class Condition_DailyTimer {
    @SerializedName("type")       String type;
    @SerializedName("id")         String id;
    @SerializedName("time")       String time;
    @SerializedName("daysOfWeek") String daysOfWeek;

    @Override
    public String toString() {
        return "Condition_DailyTimer{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", time='" + time + '\'' +
                ", daysOfWeek='" + daysOfWeek + '\'' +
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public Condition_DailyTimer() {

    }

    public Condition_DailyTimer(String type, String id, String time, String daysOfWeek) {

        this.type = type;
        this.id = id;
        this.time = time;
        this.daysOfWeek = daysOfWeek;
    }
}
