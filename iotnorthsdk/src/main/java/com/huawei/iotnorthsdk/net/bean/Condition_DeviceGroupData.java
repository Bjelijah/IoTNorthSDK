package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class Condition_DeviceGroupData {
    @SerializedName("type")            String type;
    @SerializedName("id")              String id;
    @SerializedName("deviceGroupInfo") DeviceGroupInfo deviceGroupInfo;
    @SerializedName("operator")        String operator;
    @SerializedName("value")           String value;
    @SerializedName("transInfo")       JSONObject transInfoJsonObj;
    @SerializedName("duration")        Integer duration;
    @SerializedName("strategy")        Strategy strategyJsonObj;

    @Override
    public String toString() {
        return "Condition_DeviceGroupData{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", deviceGroupInfo=" + deviceGroupInfo +
                ", operator='" + operator + '\'' +
                ", value='" + value + '\'' +
                ", transInfoJsonObj=" + transInfoJsonObj +
                ", duration=" + duration +
                ", strategyJsonObj=" + strategyJsonObj +
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

    public DeviceGroupInfo getDeviceGroupInfo() {
        return deviceGroupInfo;
    }

    public void setDeviceGroupInfo(DeviceGroupInfo deviceGroupInfo) {
        this.deviceGroupInfo = deviceGroupInfo;
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

    public Strategy getStrategyJsonObj() {
        return strategyJsonObj;
    }

    public void setStrategyJsonObj(Strategy strategy) {
        this.strategyJsonObj = strategy;
    }

    public Condition_DeviceGroupData() {

    }

    public Condition_DeviceGroupData(String type, String id, DeviceGroupInfo deviceGroupInfo, String operator, String value, JSONObject transInfoJsonObj, Integer duration, Strategy strategyJsonObj) {

        this.type = type;
        this.id = id;
        this.deviceGroupInfo = deviceGroupInfo;
        this.operator = operator;
        this.value = value;
        this.transInfoJsonObj = transInfoJsonObj;
        this.duration = duration;
        this.strategyJsonObj = strategyJsonObj;
    }
}
