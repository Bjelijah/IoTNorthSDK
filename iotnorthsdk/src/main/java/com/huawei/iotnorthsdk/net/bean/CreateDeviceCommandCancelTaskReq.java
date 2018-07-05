package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class CreateDeviceCommandCancelTaskReq {
    @SerializedName("deviceId") String deviceId;

    @Override
    public String toString() {
        return "CreateDeviceCommandCancelTaskReq{" +
                "deviceId='" + deviceId + '\'' +
                '}';
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public CreateDeviceCommandCancelTaskReq() {

    }

    public CreateDeviceCommandCancelTaskReq(String deviceId) {

        this.deviceId = deviceId;
    }
}
