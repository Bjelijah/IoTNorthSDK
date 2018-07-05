package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class DeviceCmdParamGet {
    @SerializedName("commandType")     String commandType;
    @SerializedName("deviceType")      String deviceType;
    @SerializedName("manufacturerId")  String manufacturerId;
    @SerializedName("model")           String model;
    @SerializedName("serviceId")       String serviceId;
    @SerializedName("method")          String method;

    @Override
    public String toString() {
        return "DeviceCmdParamGet{" +
                "commandType='" + commandType + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", manufacturerId='" + manufacturerId + '\'' +
                ", model='" + model + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", method='" + method + '\'' +
                '}';
    }

    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
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

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public DeviceCmdParamGet() {

    }

    public DeviceCmdParamGet(String commandType, String deviceType, String manufacturerId, String model, String serviceId, String method) {

        this.commandType = commandType;
        this.deviceType = deviceType;
        this.manufacturerId = manufacturerId;
        this.model = model;
        this.serviceId = serviceId;
        this.method = method;
    }
}
