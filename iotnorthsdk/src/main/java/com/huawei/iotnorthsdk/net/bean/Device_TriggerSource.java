package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class Device_TriggerSource {
    @SerializedName("type")       String type;
    @SerializedName("deviceId")   String deviceId;
    @SerializedName("serviceId")  String serviceId;

    @Override
    public String toString() {
        return "Device_TriggerSource{" +
                "type='" + type + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Device_TriggerSource() {

    }

    public Device_TriggerSource(String type, String deviceId, String serviceId) {

        this.type = type;
        this.deviceId = deviceId;
        this.serviceId = serviceId;
    }
}
