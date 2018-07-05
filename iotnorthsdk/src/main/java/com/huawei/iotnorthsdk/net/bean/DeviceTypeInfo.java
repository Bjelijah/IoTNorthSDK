package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class DeviceTypeInfo {
    @SerializedName("manufacturerId")      String manufacturerId;
    @SerializedName("model")               String model;
    @SerializedName("deviceType")          String deviceType;
    @SerializedName("protocolType")        String protocolType;
    @SerializedName("path")                String path;

    @Override
    public String toString() {
        return "DeviceTypeInfo{" +
                "manufacturerId='" + manufacturerId + '\'' +
                ", model='" + model + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", protocolType='" + protocolType + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public DeviceTypeInfo() {

    }

    public DeviceTypeInfo(String manufacturerId, String model, String deviceType, String protocolType, String path) {

        this.manufacturerId = manufacturerId;
        this.model = model;
        this.deviceType = deviceType;
        this.protocolType = protocolType;
        this.path = path;
    }
}
