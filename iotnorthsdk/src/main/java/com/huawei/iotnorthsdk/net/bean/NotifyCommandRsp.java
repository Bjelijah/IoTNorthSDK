package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class NotifyCommandRsp extends NotifyBase {
    @SerializedName("notifyType")  String notifyType;
    @SerializedName("header")      CommandRspHeader header;
    @SerializedName("body")        JsonObject bodyJsonObj;

    @Override
    public String toString() {
        return "NotifyCommandRsp{" +
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

    public CommandRspHeader getHeader() {
        return header;
    }

    public void setHeader(CommandRspHeader header) {
        this.header = header;
    }

    public JsonObject getBodyJsonObj() {
        return bodyJsonObj;
    }

    public void setBodyJsonObj(JsonObject bodyJsonObj) {
        this.bodyJsonObj = bodyJsonObj;
    }

    public NotifyCommandRsp() {

    }

    public NotifyCommandRsp(String notifyType, CommandRspHeader header, JsonObject bodyJsonObj) {

        this.notifyType = notifyType;
        this.header = header;
        this.bodyJsonObj = bodyJsonObj;
    }
}
