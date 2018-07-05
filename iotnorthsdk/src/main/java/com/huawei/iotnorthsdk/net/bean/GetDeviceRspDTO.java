package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

import java.util.ArrayList;

public class GetDeviceRspDTO {
    @SerializedName("deviceId")         String deviceId;
    @SerializedName("gatewayId")        String gatewayId;
    @SerializedName("nodeType")         String nodeType;
    @SerializedName("createTime")       String createTime;
    @SerializedName("lastModifiedTime") String lastModifiedTime;
    @SerializedName("deviceInfo")       DeviceInfo deviceInfo;
    @SerializedName("services")         ArrayList<DeviceService> services;
    @SerializedName("connectionInfo")   JSONObject connectionInfo;
    @SerializedName("location")         String location;
    @SerializedName("devGroupIds")      ArrayList<String> devGroupIds;

    @Override
    public String toString() {
        return "GetDeviceRspDTO{" +
                "deviceId='" + deviceId + '\'' +
                ", gatewayId='" + gatewayId + '\'' +
                ", nodeType='" + nodeType + '\'' +
                ", createTime='" + createTime + '\'' +
                ", lastModifiedTime='" + lastModifiedTime + '\'' +
                ", deviceInfo=" + deviceInfo +
                ", services=" + services +
                ", connectionInfo=" + connectionInfo +
                ", location='" + location + '\'' +
                ", devGroupIds=" + devGroupIds +
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

    public JSONObject getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(JSONObject connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<String> getDevGroupIds() {
        return devGroupIds;
    }

    public void setDevGroupIds(ArrayList<String> devGroupIds) {
        this.devGroupIds = devGroupIds;
    }

    public GetDeviceRspDTO() {

    }

    public GetDeviceRspDTO(String deviceId, String gatewayId, String nodeType, String createTime, String lastModifiedTime, DeviceInfo deviceInfo, ArrayList<DeviceService> services, JSONObject connectionInfo, String location, ArrayList<String> devGroupIds) {

        this.deviceId = deviceId;
        this.gatewayId = gatewayId;
        this.nodeType = nodeType;
        this.createTime = createTime;
        this.lastModifiedTime = lastModifiedTime;
        this.deviceInfo = deviceInfo;
        this.services = services;
        this.connectionInfo = connectionInfo;
        this.location = location;
        this.devGroupIds = devGroupIds;
    }
}
