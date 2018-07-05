package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class RegReq {
    @SerializedName("appId")      String appId;
    @SerializedName("verifyCode") String verifyCode;
    @SerializedName("nodeId")     String nodeId;
    @SerializedName("endUserId")  String endUserId;
    @SerializedName("psk")        String psk;
    @SerializedName("timeout")    Integer timeout;

    @Override
    public String toString() {
        return "RegReq{" +
                "appId='" + appId + '\'' +
                ", verifyCode='" + verifyCode + '\'' +
                ", nodeId='" + nodeId + '\'' +
                ", endUserId='" + endUserId + '\'' +
                ", psk='" + psk + '\'' +
                ", timeout=" + timeout +
                '}';
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getEndUserId() {
        return endUserId;
    }

    public void setEndUserId(String endUserId) {
        this.endUserId = endUserId;
    }

    public String getPsk() {
        return psk;
    }

    public void setPsk(String psk) {
        this.psk = psk;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public RegReq() {

    }

    public RegReq(String appId, String verifyCode, String nodeId, String endUserId, String psk, Integer timeout) {
        this.appId = appId;
        this.verifyCode = verifyCode;
        this.nodeId = nodeId;
        this.endUserId = endUserId;
        this.psk = psk;
        this.timeout = timeout;
    }
}
