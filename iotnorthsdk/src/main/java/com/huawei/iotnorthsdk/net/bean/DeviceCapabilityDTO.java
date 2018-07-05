package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DeviceCapabilityDTO {
    @SerializedName("deviceId")  String deviceId;
    @SerializedName("serviceCapabilities") ArrayList<ServiceCapabilityDTO>  serviceCapabilities;

    @Override
    public String toString() {
        return "DeviceCapabilityDTO{" +
                "deviceId='" + deviceId + '\'' +
                ", serviceCapabilities=" + serviceCapabilities +
                '}';
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ArrayList<ServiceCapabilityDTO> getServiceCapabilities() {
        return serviceCapabilities;
    }

    public void setServiceCapabilities(ArrayList<ServiceCapabilityDTO> serviceCapabilities) {
        this.serviceCapabilities = serviceCapabilities;
    }

    public DeviceCapabilityDTO() {

    }

    public DeviceCapabilityDTO(String deviceId, ArrayList<ServiceCapabilityDTO> serviceCapabilities) {

        this.deviceId = deviceId;
        this.serviceCapabilities = serviceCapabilities;
    }
}
