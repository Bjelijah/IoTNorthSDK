package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class CommandDTOV4 {
    @SerializedName("serviceId")  String serviceId;
    @SerializedName("method")     String method;
    @SerializedName("paras")      String paras;

    @Override
    public String toString() {
        return "CommandDTOV4{" +
                "serviceId='" + serviceId + '\'' +
                ", method='" + method + '\'' +
                ", paras='" + paras + '\'' +
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

    public String getParas() {
        return paras;
    }

    public void setParas(String paras) {
        this.paras = paras;
    }

    public CommandDTOV4() {

    }

    public CommandDTOV4(String serviceId, String method, String paras) {

        this.serviceId = serviceId;
        this.method = method;
        this.paras = paras;
    }
}
