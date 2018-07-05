package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class SignaltransRes {
    @SerializedName("status")    String status;
    @SerializedName("timestamp") String timestamp;
    @SerializedName("requestId") String requestId;

    @Override
    public String toString() {
        return "SignaltransRes{" +
                "status='" + status + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", requestId='" + requestId + '\'' +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public SignaltransRes() {

    }

    public SignaltransRes(String status, String timestamp, String requestId) {

        this.status = status;
        this.timestamp = timestamp;
        this.requestId = requestId;
    }
}
