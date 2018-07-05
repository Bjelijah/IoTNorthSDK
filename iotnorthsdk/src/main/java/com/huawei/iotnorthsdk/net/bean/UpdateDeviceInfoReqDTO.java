package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class UpdateDeviceInfoReqDTO {
    @SerializedName("name")             String name;
    @SerializedName("endUser")          String endUser;
    @SerializedName("mute")             String mute;
    @SerializedName("manufacturerId")   String manufacturerId;
    @SerializedName("manufacturerName") String manufacturerName;
    @SerializedName("deviceType")       String deviceType;
    @SerializedName("model")            String model;
    @SerializedName("protocolType")     String protocolType;
    @SerializedName("deviceConfig")     DeviceConfigDTO deviceConfig;
    @SerializedName("region")           String region;
    @SerializedName("location")         String location;
    @SerializedName("organization")     String organization;
    @SerializedName("timezone")         String timezone;

    @Override
    public String toString() {
        return "UpdateDeviceInfoReqDTO{" +
                "name='" + name + '\'' +
                ", endUser='" + endUser + '\'' +
                ", mute='" + mute + '\'' +
                ", manufacturerId='" + manufacturerId + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", model='" + model + '\'' +
                ", protocolType='" + protocolType + '\'' +
                ", deviceConfig=" + deviceConfig +
                ", region='" + region + '\'' +
                ", location='" + location + '\'' +
                ", organization='" + organization + '\'' +
                ", timezone='" + timezone + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndUser() {
        return endUser;
    }

    public void setEndUser(String endUser) {
        this.endUser = endUser;
    }

    public String getMute() {
        return mute;
    }

    public void setMute(String mute) {
        this.mute = mute;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public DeviceConfigDTO getDeviceConfig() {
        return deviceConfig;
    }

    public void setDeviceConfig(DeviceConfigDTO deviceConfig) {
        this.deviceConfig = deviceConfig;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public UpdateDeviceInfoReqDTO() {

    }

    public UpdateDeviceInfoReqDTO(String name, String endUser, String mute, String manufacturerId, String manufacturerName, String deviceType, String model, String protocolType, DeviceConfigDTO deviceConfig, String region, String location, String organization, String timezone) {

        this.name = name;
        this.endUser = endUser;
        this.mute = mute;
        this.manufacturerId = manufacturerId;
        this.manufacturerName = manufacturerName;
        this.deviceType = deviceType;
        this.model = model;
        this.protocolType = protocolType;
        this.deviceConfig = deviceConfig;
        this.region = region;
        this.location = location;
        this.organization = organization;
        this.timezone = timezone;
    }
}
