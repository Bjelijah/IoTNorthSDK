package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class CarEncryptReq {
    @SerializedName("data") ApplicationSetEncrtptDTO app;
    @SerializedName("data") PutCarInfoData data;

    public CarEncryptReq(PutCarInfoData data) {
        this.data = data;
        this.app = null;
    }

    public CarEncryptReq(ApplicationSetEncrtptDTO app) {
        this.data = null;
        this.app = app;
    }

    @Override
    public String toString() {
        return "CarEncryptReq{" +
                "app=" + app +
                ", data=" + data +
                '}';
    }

    public ApplicationSetEncrtptDTO getApp() {
        return app;
    }

    public void setApp(ApplicationSetEncrtptDTO app) {
        this.app = app;
    }

    public PutCarInfoData getData() {
        return data;
    }

    public void setData(PutCarInfoData data) {
        this.data = data;
    }

}
