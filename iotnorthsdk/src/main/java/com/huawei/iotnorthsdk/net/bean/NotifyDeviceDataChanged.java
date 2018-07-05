package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class NotifyDeviceDataChanged extends NotifyBase {

    @SerializedName("requestId")      String requestId;
    @SerializedName("deviceId")       String deviceId;
    @SerializedName("gatewayId")      String gatewayId;
    @SerializedName("service")        DeviceServiceData service;

    @Override
    public String toString() {
        return "NotifyDeviceDataChanged{" +
                "notifyType='" + notifyType + '\'' +
                ", requestId='" + requestId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", gatewayId='" + gatewayId + '\'' +
                ", service=" + service +
                '}';
    }

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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

    public DeviceServiceData getService() {
        return service;
    }

    public void setService(DeviceServiceData service) {
        this.service = service;
    }

    public NotifyDeviceDataChanged() {

    }

    public NotifyDeviceDataChanged(String notifyType, String requestId, String deviceId, String gatewayId, DeviceServiceData service) {

        this.notifyType = notifyType;
        this.requestId = requestId;
        this.deviceId = deviceId;
        this.gatewayId = gatewayId;
        this.service = service;
    }
}
