package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class DeviceEventHeader {
    @SerializedName("eventType")   String eventType;
    @SerializedName("from")        String from;
    @SerializedName("to")          String to;
    @SerializedName("timestamp")   String timestamp;
    @SerializedName("eventTime")   String eventTime;
    @SerializedName("serviceType") String serviceType;

    @Override
    public String toString() {
        return "DeviceEventHeader{" +
                "eventType='" + eventType + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", eventTime='" + eventTime + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
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

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public DeviceEventHeader() {

    }

    public DeviceEventHeader(String eventType, String from, String to, String timestamp, String eventTime, String serviceType) {

        this.eventType = eventType;
        this.from = from;
        this.to = to;
        this.timestamp = timestamp;
        this.eventTime = eventTime;
        this.serviceType = serviceType;
    }
}
