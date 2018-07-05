package com.huawei.iotnorthsdk.net.bean;


import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class NotifyMessageConfirm extends NotifyBase {

    @SerializedName("header")         MessageConfirmHeader header;
    @SerializedName("body")           JSONObject bodyJsonObj;

    @Override
    public String toString() {
        return "NotifyMessageConfirm{" +
                "notifyType='" + notifyType + '\'' +
                ", header=" + header +
                ", bodyJsonObj=" + bodyJsonObj +
                '}';
    }

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public MessageConfirmHeader getHeader() {
        return header;
    }

    public void setHeader(MessageConfirmHeader header) {
        this.header = header;
    }

    public JSONObject getBodyJsonObj() {
        return bodyJsonObj;
    }

    public void setBodyJsonObj(JSONObject bodyJsonObj) {
        this.bodyJsonObj = bodyJsonObj;
    }

    public NotifyMessageConfirm() {

    }

    public NotifyMessageConfirm(String notifyType, MessageConfirmHeader header, JSONObject bodyJsonObj) {

        this.notifyType = notifyType;
        this.header = header;
        this.bodyJsonObj = bodyJsonObj;
    }
}
