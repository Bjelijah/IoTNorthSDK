package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class Condition_DeviceTypeData {
    @SerializedName("type")           String type;
    @SerializedName("id")             String id;
    @SerializedName("deviceTypeInfo") DeviceTypeInfo deviceTypeInfo;
    @SerializedName("operator")       String operator;
    @SerializedName("value")          String value;
    @SerializedName("transInfo")      JSONObject transInfoJsonObj;
    @SerializedName("duration")       Integer duration;
    @SerializedName("strategy")       Strategy strategy;

    @Override
    public String toString() {
        return "Condition_DeviceTypeData{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", deviceTypeInfo=" + deviceTypeInfo +
                ", operator='" + operator + '\'' +
                ", value='" + value + '\'' +
                ", transInfoJsonObj=" + transInfoJsonObj +
                ", duration=" + duration +
                ", strategy=" + strategy +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeviceTypeInfo getDeviceTypeInfo() {
        return deviceTypeInfo;
    }

    public void setDeviceTypeInfo(DeviceTypeInfo deviceTypeInfo) {
        this.deviceTypeInfo = deviceTypeInfo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public JSONObject getTransInfoJsonObj() {
        return transInfoJsonObj;
    }

    public void setTransInfoJsonObj(JSONObject transInfoJsonObj) {
        this.transInfoJsonObj = transInfoJsonObj;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Condition_DeviceTypeData() {

    }

    public Condition_DeviceTypeData(String type, String id, DeviceTypeInfo deviceTypeInfo, String operator, String value, JSONObject transInfoJsonObj, Integer duration, Strategy strategy) {

        this.type = type;
        this.id = id;
        this.deviceTypeInfo = deviceTypeInfo;
        this.operator = operator;
        this.value = value;
        this.transInfoJsonObj = transInfoJsonObj;
        this.duration = duration;
        this.strategy = strategy;
    }
}
