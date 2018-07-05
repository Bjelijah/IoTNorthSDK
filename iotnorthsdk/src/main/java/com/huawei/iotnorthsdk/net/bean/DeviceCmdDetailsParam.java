package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class DeviceCmdDetailsParam {
    @SerializedName("deviceId")   String deviceId;
    @SerializedName("commandId")  String commandId;

    @Override
    public String toString() {
        return "DeviceCmdDetailsParam{" +
                "deviceId='" + deviceId + '\'' +
                ", commandId='" + commandId + '\'' +
                '}';
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public DeviceCmdDetailsParam() {

    }

    public DeviceCmdDetailsParam(String deviceId, String commandId) {

        this.deviceId = deviceId;
        this.commandId = commandId;
    }
}
