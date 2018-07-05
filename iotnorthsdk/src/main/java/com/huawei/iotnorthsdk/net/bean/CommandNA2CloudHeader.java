package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class CommandNA2CloudHeader {
    @SerializedName("requestId")   String requestId;
    @SerializedName("mode")        String mode;
    @SerializedName("from")        String from;
    @SerializedName("to")          String to;
    @SerializedName("toType")      String toType;
    @SerializedName("method")      String method;
    @SerializedName("callbackURL") String callbackURL;

    @Override
    public String toString() {
        return "CommandNA2CloudHeader{" +
                "requestId='" + requestId + '\'' +
                ", mode='" + mode + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", toType='" + toType + '\'' +
                ", method='" + method + '\'' +
                ", callbackURL='" + callbackURL + '\'' +
                '}';
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
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

    public String getToType() {
        return toType;
    }

    public void setToType(String toType) {
        this.toType = toType;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getCallbackURL() {
        return callbackURL;
    }

    public void setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
    }

    public CommandNA2CloudHeader() {

    }

    public CommandNA2CloudHeader(String requestId, String mode, String from, String to, String toType, String method, String callbackURL) {

        this.requestId = requestId;
        this.mode = mode;
        this.from = from;
        this.to = to;
        this.toType = toType;
        this.method = method;
        this.callbackURL = callbackURL;
    }
}
