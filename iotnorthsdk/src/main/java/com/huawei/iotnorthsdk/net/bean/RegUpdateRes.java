package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class RegUpdateRes {
    @SerializedName("verifyCode")   String verifyCode;
    @SerializedName("timeout")      Integer timeout;

    @Override
    public String toString() {
        return "RegUpdateRes{" +
                "verifyCode='" + verifyCode + '\'' +
                ", timeout=" + timeout +
                '}';
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

    public RegUpdateRes() {

    }

    public RegUpdateRes(String verifyCode, Integer timeout) {

        this.verifyCode = verifyCode;
        this.timeout = timeout;
    }
}
