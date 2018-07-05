package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class NotifyDeviceInfoChanged extends NotifyBase {

    @SerializedName("deviceId")     String deviceId;
    @SerializedName("gatewayId")    String gatewayId;
    @SerializedName("deviceInfo")   DeviceInfo deviceInfo;

    @Override
    public String toString() {
        return "NotifyDeviceInfoChanged{" +
                "notifyType='" + notifyType + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", gatewayId='" + gatewayId + '\'' +
                ", deviceInfo=" + deviceInfo +
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

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public NotifyDeviceInfoChanged() {

    }

    public NotifyDeviceInfoChanged(String notifyType, String deviceId, String gatewayId, DeviceInfo deviceInfo) {

        this.notifyType = notifyType;
        this.deviceId = deviceId;
        this.gatewayId = gatewayId;
        this.deviceInfo = deviceInfo;
    }
}
