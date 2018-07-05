package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ServiceCommandResponse {
    @SerializedName("responseName")  String responseName;
    @SerializedName("paras")         ArrayList<ServiceCommandPara> paras;

    @Override
    public String toString() {
        return "ServiceCommandResponse{" +
                "responseName='" + responseName + '\'' +
                ", paras=" + paras +
                '}';
    }

    public String getResponseName() {
        return responseName;
    }

    public void setResponseName(String responseName) {
        this.responseName = responseName;
    }

    public ArrayList<ServiceCommandPara> getParas() {
        return paras;
    }

    public void setParas(ArrayList<ServiceCommandPara> paras) {
        this.paras = paras;
    }

    public ServiceCommandResponse() {

    }

    public ServiceCommandResponse(String responseName, ArrayList<ServiceCommandPara> paras) {

        this.responseName = responseName;
        this.paras = paras;
    }
}
