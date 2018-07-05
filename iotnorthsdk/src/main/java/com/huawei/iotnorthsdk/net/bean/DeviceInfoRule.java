package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class DeviceInfoRule {
    @SerializedName("deviceId")    String deviceId;
    @SerializedName("path")        String path;

    @Override
    public String toString() {
        return "DeviceInfoRule{" +
                "deviceId='" + deviceId + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public DeviceInfoRule() {

    }

    public DeviceInfoRule(String deviceId, String path) {

        this.deviceId = deviceId;
        this.path = path;
    }
}
