package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class NotifyDeviceEvent extends NotifyBase {

    @SerializedName("header")     DeviceEventHeader header;
    @SerializedName("body")
    JsonObject bodyJsonObj;

    @Override
    public String toString() {
        return "NotifyDeviceEvent{" +
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

    public DeviceEventHeader getHeader() {
        return header;
    }

    public void setHeader(DeviceEventHeader header) {
        this.header = header;
    }

    public JsonObject getBodyJsonObj() {
        return bodyJsonObj;
    }

    public void setBodyJsonObj(JsonObject bodyJsonObj) {
        this.bodyJsonObj = bodyJsonObj;
    }

    public NotifyDeviceEvent() {

    }

    public NotifyDeviceEvent(String notifyType, DeviceEventHeader header, JsonObject bodyJsonObj) {

        this.notifyType = notifyType;
        this.header = header;
        this.bodyJsonObj = bodyJsonObj;
    }
}
