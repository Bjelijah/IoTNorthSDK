package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class Timer_TriggerSource {
    @SerializedName("type")     String type;

    @Override
    public String toString() {
        return "Timer_TriggerSource{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timer_TriggerSource() {

    }

    public Timer_TriggerSource(String type) {

        this.type = type;
    }
}
