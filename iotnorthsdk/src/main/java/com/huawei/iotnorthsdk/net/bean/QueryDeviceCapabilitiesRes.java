package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class QueryDeviceCapabilitiesRes {
    @SerializedName("deviceCapabilities")
    ArrayList<DeviceCapabilityDTO> deviceCapabilityS;

    @Override
    public String toString() {
        return "QueryDeviceCapabilitiesRes{" +
                "deviceCapabilityS=" + deviceCapabilityS +
                '}';
    }

    public ArrayList<DeviceCapabilityDTO> getDeviceCapabilityS() {
        return deviceCapabilityS;
    }

    public void setDeviceCapabilityS(ArrayList<DeviceCapabilityDTO> deviceCapabilityS) {
        this.deviceCapabilityS = deviceCapabilityS;
    }

    public QueryDeviceCapabilitiesRes() {

    }

    public QueryDeviceCapabilitiesRes(ArrayList<DeviceCapabilityDTO> deviceCapabilityS) {

        this.deviceCapabilityS = deviceCapabilityS;
    }
}
