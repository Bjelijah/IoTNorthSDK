package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class RefreshTokenReq {
    @SerializedName("appId")        String appId;
    @SerializedName("secret")       String secret;
    @SerializedName("refreshToken") String refreshToken;




    @Override
    public String toString() {
        return "RefreshTokenReq{" +
                "appId='" + appId + '\'' +
                ", secret='" + secret + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }

    public RefreshTokenReq(String appId, String secret, String refreshToken) {
        this.appId = appId;
        this.secret = secret;
        this.refreshToken = refreshToken;
    }

    public RefreshTokenReq() {
    }

    public String getAppId() {
        return appId;
    }

    public RefreshTokenReq setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public RefreshTokenReq setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public RefreshTokenReq setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
}
