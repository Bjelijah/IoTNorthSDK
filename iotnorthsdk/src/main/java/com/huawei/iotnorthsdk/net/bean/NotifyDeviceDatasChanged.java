package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class NotifyDeviceDatasChanged extends NotifyBase {

    @SerializedName("requestId")    String requestId;
    @SerializedName("deviceId")     String deviceId;
    @SerializedName("gatewayId")    String gatewayId;
    @SerializedName("services")     ArrayList<DeviceServiceData> services;

    @Override
    public String toString() {
        return "NotifyDeviceDatasChanged{" +
                "notifyType='" + notifyType + '\'' +
                ", requestId='" + requestId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", gatewayId='" + gatewayId + '\'' +
                ", services=" + services +
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

    public ArrayList<DeviceServiceData> getServices() {
        return services;
    }

    public void setServices(ArrayList<DeviceServiceData> services) {
        this.services = services;
    }

    public NotifyDeviceDatasChanged() {

    }

    public NotifyDeviceDatasChanged(String notifyType, String requestId, String deviceId, String gatewayId, ArrayList<DeviceServiceData> services) {

        this.notifyType = notifyType;
        this.requestId = requestId;
        this.deviceId = deviceId;
        this.gatewayId = gatewayId;
        this.services = services;
    }
}
