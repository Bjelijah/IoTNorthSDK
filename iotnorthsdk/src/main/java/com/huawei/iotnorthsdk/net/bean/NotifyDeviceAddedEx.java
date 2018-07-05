package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class NotifyDeviceAddedEx extends NotifyBase {

    @SerializedName("deviceId")    String deviceId;
    @SerializedName("gatewayId")   String gatewayId;
    @SerializedName("nodeType")    String nodeType;
    @SerializedName("deviceInfo")  DeviceInfo deviceInfo;

    @Override
    public String toString() {
        return "NotifyDeviceAddedEx{" +
                "notifyType='" + notifyType + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", gatewayId='" + gatewayId + '\'' +
                ", nodeType='" + nodeType + '\'' +
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

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public NotifyDeviceAddedEx() {

    }

    public NotifyDeviceAddedEx(String notifyType, String deviceId, String gatewayId, String nodeType, DeviceInfo deviceInfo) {

        this.notifyType = notifyType;
        this.deviceId = deviceId;
        this.gatewayId = gatewayId;
        this.nodeType = nodeType;
        this.deviceInfo = deviceInfo;
    }
}
