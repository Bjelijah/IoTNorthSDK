package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class QueryDeviceDTOCloudNA {
    @SerializedName("deviceId")         String deviceId;
    @SerializedName("gatewayId")        String gatewayId;
    @SerializedName("nodeType")         String nodeType;
    @SerializedName("createTime")       String createTime;
    @SerializedName("lastModifiedTime") String lastModifiedTime;
    @SerializedName("deviceInfo")       DeviceInfo deviceInfo;
    @SerializedName("services")         ArrayList<DeviceService> services;

    @Override
    public String toString() {
        return "QueryDeviceDTOCloudNA{" +
                "deviceId='" + deviceId + '\'' +
                ", gatewayId='" + gatewayId + '\'' +
                ", nodeType='" + nodeType + '\'' +
                ", createTime='" + createTime + '\'' +
                ", lastModifiedTime='" + lastModifiedTime + '\'' +
                ", deviceInfo=" + deviceInfo +
                ", services=" + services +
                '}';
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public ArrayList<DeviceService> getServices() {
        return services;
    }

    public void setServices(ArrayList<DeviceService> services) {
        this.services = services;
    }

    public QueryDeviceDTOCloudNA() {

    }

    public QueryDeviceDTOCloudNA(String deviceId, String gatewayId, String nodeType, String createTime, String lastModifiedTime, DeviceInfo deviceInfo, ArrayList<DeviceService> services) {

        this.deviceId = deviceId;
        this.gatewayId = gatewayId;
        this.nodeType = nodeType;
        this.createTime = createTime;
        this.lastModifiedTime = lastModifiedTime;
        this.deviceInfo = deviceInfo;
        this.services = services;
    }
}
