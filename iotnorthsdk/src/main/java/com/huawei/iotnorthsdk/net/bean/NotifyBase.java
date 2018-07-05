package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class NotifyBase {
    @SerializedName("notifyType") protected String notifyType;

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    @Override
    public String toString() {
        return "NotifyBase{" +
                "notifyType='" + notifyType + '\'' +
                '}';
    }
}
