package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class MessageConfirmHeader {
    @SerializedName("requestId")      String requestId;
    @SerializedName("from")           String from;
    @SerializedName("to")             String to;
    @SerializedName("status")         String status;
    @SerializedName("timestamp")      String timestamp;

    @Override
    public String toString() {
        return "MessageConfirmHeader{" +
                "requestId='" + requestId + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", status='" + status + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

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

    public MessageConfirmHeader() {

    }

    public MessageConfirmHeader(String requestId, String from, String to, String status, String timestamp) {

        this.requestId = requestId;
        this.from = from;
        this.to = to;
        this.status = status;
        this.timestamp = timestamp;
    }
}
