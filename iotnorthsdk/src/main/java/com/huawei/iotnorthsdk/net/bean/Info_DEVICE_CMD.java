package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class Info_DEVICE_CMD {
    @SerializedName("requestId")   String requestId;

    @Override
    public String toString() {
        return "Info_DEVICE_CMD{" +
                "requestId='" + requestId + '\'' +
                '}';
    }

    public Info_DEVICE_CMD() {
    }

    public String getRequestId() {

        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Info_DEVICE_CMD(String requestId) {

        this.requestId = requestId;
    }
}
