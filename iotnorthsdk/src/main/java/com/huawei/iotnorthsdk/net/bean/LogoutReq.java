package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class LogoutReq {
    @SerializedName("accessToken") String accessToken;

    @Override
    public String toString() {
        return "LogoutReq{" +
                "accessToken='" + accessToken + '\'' +
                '}';
    }

    public LogoutReq() {
    }

    public LogoutReq(String accessToken) {

        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public LogoutReq setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
}
