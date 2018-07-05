package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class NotifyDeviceDeleted extends NotifyBase {

    @SerializedName("deviceId")          String deviceId;
    @SerializedName("gatewayId")         String gatewayId;

    @Override
    public String toString() {
        return "NotifyDeviceDeleted{" +
                "notifyType='" + notifyType + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", gatewayId='" + gatewayId + '\'' +
                '}';
    }

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public NotifyDeviceDeleted() {

    }

    public NotifyDeviceDeleted(String notifyType, String deviceId, String gatewayId) {

        this.notifyType = notifyType;
        this.deviceId = deviceId;
        this.gatewayId = gatewayId;
    }
}
