package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class AuthRes {
    @SerializedName("scope")        String scope;
    @SerializedName("tokenType")    String tokenType;
    @SerializedName("accessToken")  String accessToken;
    @SerializedName("refreshToken") String refreshToken;

    @Override
    public String toString() {
        return "AuthRes{" +
                "scope='" + scope + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
