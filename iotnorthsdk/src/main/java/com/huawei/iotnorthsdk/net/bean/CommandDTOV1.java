package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class CommandDTOV1 {
    @SerializedName("serviceId") String serviceId;
    @SerializedName("method")    String method;
    @SerializedName("paras")     JSONObject parasJsonObj;

    @Override
    public String toString() {
        return "CommandDTOV1{" +
                "serviceId='" + serviceId + '\'' +
                ", method='" + method + '\'' +
                ", parasJsonObj=" + parasJsonObj +
                '}';
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public JSONObject getParasJsonObj() {
        return parasJsonObj;
    }

    public void setParasJsonObj(JSONObject parasJsonObj) {
        this.parasJsonObj = parasJsonObj;
    }

    public CommandDTOV1() {

    }

    public CommandDTOV1(String serviceId, String method, JSONObject parasJsonObj) {

        this.serviceId = serviceId;
        this.method = method;
        this.parasJsonObj = parasJsonObj;
    }
}
