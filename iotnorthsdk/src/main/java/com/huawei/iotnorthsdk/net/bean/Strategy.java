package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class Strategy {
    @SerializedName("trigger")     String trigger;
    @SerializedName("eValidTime")  Integer eValidTime;

    @Override
    public String toString() {
        return "Strategy{" +
                "trigger='" + trigger + '\'' +
                ", eValidTime=" + eValidTime +
                '}';
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public Integer geteValidTime() {
        return eValidTime;
    }

    public void seteValidTime(Integer eValidTime) {
        this.eValidTime = eValidTime;
    }

    public Strategy() {

    }

    public Strategy(String trigger, Integer eValidTime) {

        this.trigger = trigger;
        this.eValidTime = eValidTime;
    }
}
