package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class CMD {
    @SerializedName("messageType")   String messageType;
    @SerializedName("messageBody")   JSONObject messageBody;
    @SerializedName("serviceId")     String serviceId;

    @Override
    public String toString() {
        return "CMD{" +
                "messageType='" + messageType + '\'' +
                ", messageBody=" + messageBody +
                ", serviceId='" + serviceId + '\'' +
                '}';
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public JSONObject getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(JSONObject messageBody) {
        this.messageBody = messageBody;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public CMD() {

    }

    public CMD(String messageType, JSONObject messageBody, String serviceId) {

        this.messageType = messageType;
        this.messageBody = messageBody;
        this.serviceId = serviceId;
    }
}
