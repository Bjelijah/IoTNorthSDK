package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class SubscribeReq {
    @SerializedName("notifyType")  String notifyType;
    @SerializedName("callbackurl") String callbackurl;

    @Override
    public String toString() {
        return "SubscribeReq{" +
                "notifyType='" + notifyType + '\'' +
                ", callbackurl='" + callbackurl + '\'' +
                '}';
    }

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public String getCallbackurl() {
        return callbackurl;
    }

    public void setCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
    }

    public SubscribeReq() {

    }

    public SubscribeReq(String notifyType, String callbackurl) {

        this.notifyType = notifyType;
        this.callbackurl = callbackurl;
    }
}
