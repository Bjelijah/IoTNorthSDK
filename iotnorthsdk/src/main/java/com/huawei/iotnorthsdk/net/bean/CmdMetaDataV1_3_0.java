package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class CmdMetaDataV1_3_0 {
    @SerializedName("requestId")   String requestId;
    @SerializedName("callbackUrl") String callbackUrl;
    @SerializedName("expireTime")  Integer expireTime;

    @Override
    public String toString() {
        return "CmdMetaDataV1_3_0{" +
                "requestId='" + requestId + '\'' +
                ", callbackUrl='" + callbackUrl + '\'' +
                ", expireTime=" + expireTime +
                '}';
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public CmdMetaDataV1_3_0() {

    }

    public CmdMetaDataV1_3_0(String requestId, String callbackUrl, Integer expireTime) {

        this.requestId = requestId;
        this.callbackUrl = callbackUrl;
        this.expireTime = expireTime;
    }
}
