package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class RegRes {
    @SerializedName("deviceId")     String devcieId;
    @SerializedName("verifyCode")   String verifyCode;
    @SerializedName("timeout")      Integer timeout;
    @SerializedName("psk")          String psk;

    @Override
    public String toString() {
        return "RegRes{" +
                "devcieId='" + devcieId + '\'' +
                ", verifyCode='" + verifyCode + '\'' +
                ", timeout=" + timeout +
                ", psk='" + psk + '\'' +
                '}';
    }

    public String getDevcieId() {
        return devcieId;
    }

    public void setDevcieId(String devcieId) {
        this.devcieId = devcieId;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getPsk() {
        return psk;
    }

    public void setPsk(String psk) {
        this.psk = psk;
    }

    public RegRes() {

    }

    public RegRes(String devcieId, String verifyCode, Integer timeout, String psk) {

        this.devcieId = devcieId;
        this.verifyCode = verifyCode;
        this.timeout = timeout;
        this.psk = psk;
    }
}
