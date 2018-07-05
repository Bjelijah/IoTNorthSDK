package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class Info_DEVICE_DATA {
    @SerializedName("realValue")   String realValue;

    @Override
    public String toString() {
        return "Info_DEVICE_DATA{" +
                "realValue='" + realValue + '\'' +
                '}';
    }

    public String getRealValue() {
        return realValue;
    }

    public void setRealValue(String realValue) {
        this.realValue = realValue;
    }

    public Info_DEVICE_DATA() {

    }

    public Info_DEVICE_DATA(String realValue) {

        this.realValue = realValue;
    }
}
