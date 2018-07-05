package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class RegStatusRes {
    @SerializedName("deviceId")   String deviceId;
    @SerializedName("activated")  Boolean activated;
    @SerializedName("name")       String name;

    @Override
    public String toString() {
        return "RegStatusRes{" +
                "deviceId='" + deviceId + '\'' +
                ", activated=" + activated +
                ", name='" + name + '\'' +
                '}';
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RegStatusRes() {

    }

    public RegStatusRes(String deviceId, Boolean activated, String name) {

        this.deviceId = deviceId;
        this.activated = activated;
        this.name = name;
    }
}
