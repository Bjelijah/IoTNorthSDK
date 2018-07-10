package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class DeviceDataHistoryDTO {
    @SerializedName("serviceId")  String serviceId;
    @SerializedName("deviceId")   String deviceId;
    @SerializedName("gatewayId")  String gatewayId;
    @SerializedName("appId")      String appId;
    @SerializedName("data")       JsonObject data;
    @SerializedName("timestamp")  String timestamp;

    @Override
    public String toString() {
        return "DeviceDataHistoryDTO{" +
                "serviceId='" + serviceId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", gatewayId='" + gatewayId + '\'' +
                ", appId='" + appId + '\'' +
                ", data=" + data.toString() +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public JsonObject getData() {
        return data;
    }

    public void setData(JsonObject data) {
        this.data = data;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public DeviceDataHistoryDTO() {

    }

    public DeviceDataHistoryDTO(String serviceId, String deviceId, String gatewayId, String appId, JsonObject data, String timestamp) {

        this.serviceId = serviceId;
        this.deviceId = deviceId;
        this.gatewayId = gatewayId;
        this.appId = appId;
        this.data = data;
        this.timestamp = timestamp;
    }
}
