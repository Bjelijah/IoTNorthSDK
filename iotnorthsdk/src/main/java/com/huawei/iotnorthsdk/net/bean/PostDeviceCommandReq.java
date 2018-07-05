package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class PostDeviceCommandReq {
    @SerializedName("deviceId")    String deviceId;
    @SerializedName("command")     CommandDTOV4 command;
    @SerializedName("callbackUrl") String callbackUrl;
    @SerializedName("expireTime")  Integer expireTime;

    @Override
    public String toString() {
        return "PostDeviceCommandReq{" +
                "deviceId='" + deviceId + '\'' +
                ", command=" + command +
                ", callbackUrl='" + callbackUrl + '\'' +
                ", expireTime=" + expireTime +
                '}';
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public CommandDTOV4 getCommand() {
        return command;
    }

    public void setCommand(CommandDTOV4 command) {
        this.command = command;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public PostDeviceCommandReq() {

    }

    public PostDeviceCommandReq(String deviceId, CommandDTOV4 command, String callbackUrl, Integer expireTime) {

        this.deviceId = deviceId;
        this.command = command;
        this.callbackUrl = callbackUrl;
        this.expireTime = expireTime;
    }
}
