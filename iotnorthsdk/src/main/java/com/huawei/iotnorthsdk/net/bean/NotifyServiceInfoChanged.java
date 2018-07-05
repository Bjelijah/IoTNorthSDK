package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class NotifyServiceInfoChanged extends NotifyBase {

    @SerializedName("deviceId")    String deviceId;
    @SerializedName("gatewayId")   String gatewayId;
    @SerializedName("serviceId")   String serviceId;
    @SerializedName("serviceType") String serviceType;
    @SerializedName("serviceInfo") ServiceInfo serviceInfo;

    @Override
    public String toString() {
        return "NotifyServiceInfoChanged{" +
                "notifyType='" + notifyType + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", gatewayId='" + gatewayId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", serviceInfo=" + serviceInfo +
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

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public NotifyServiceInfoChanged() {

    }

    public NotifyServiceInfoChanged(String notifyType, String deviceId, String gatewayId, String serviceId, String serviceType, ServiceInfo serviceInfo) {

        this.notifyType = notifyType;
        this.deviceId = deviceId;
        this.gatewayId = gatewayId;
        this.serviceId = serviceId;
        this.serviceType = serviceType;
        this.serviceInfo = serviceInfo;
    }
}
