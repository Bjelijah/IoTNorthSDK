package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class CommandRspHeader {
    @SerializedName("requestId")   String requestId;
    @SerializedName("from")        String from;
    @SerializedName("to")          String to;
    @SerializedName("timestamp")   String timestamp;
    @SerializedName("deviceId")    String deviceId;
    @SerializedName("serviceType") String serviceType;
    @SerializedName("method")      String method;



    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public CommandRspHeader() {

    }

    @Override
    public String toString() {
        return "CommandRspHeader{" +
                "requestId='" + requestId + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", method='" + method + '\'' +
                '}';
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public CommandRspHeader(String requestId, String from, String to, String timestamp, String deviceId, String serviceType, String method) {

        this.requestId = requestId;
        this.from = from;
        this.to = to;
        this.timestamp = timestamp;
        this.deviceId = deviceId;
        this.serviceType = serviceType;
        this.method = method;
    }
}
