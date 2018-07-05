package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class RegUpdateReq {
    @SerializedName("verifyCode")  String verifyCode;
    @SerializedName("nodeId")      String nodeId;
    @SerializedName("timeout")     Integer timeout;

    @Override
    public String toString() {
        return "RegUpdateReq{" +
                "verifyCode='" + verifyCode + '\'' +
                ", nodeId='" + nodeId + '\'' +
                ", timeout=" + timeout +
                '}';
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

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public RegUpdateReq() {

    }

    public RegUpdateReq(String verifyCode, String nodeId, Integer timeout) {

        this.verifyCode = verifyCode;
        this.nodeId = nodeId;
        this.timeout = timeout;
    }
}
