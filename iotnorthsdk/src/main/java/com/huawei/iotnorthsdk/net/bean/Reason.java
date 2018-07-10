package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class Reason {
    @SerializedName("satisfactionTime")   String satisfactionTime;
    @SerializedName("type")               String type;
    @SerializedName("id")                 String id;
    @SerializedName("info")               JsonObject infoJsonObj;
    @SerializedName("transInfo")          JsonObject transInfoJsonObj;

    @Override
    public String toString() {
        return "Reason{" +
                "satisfactionTime='" + satisfactionTime + '\'' +
                ", type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", infoJsonObj=" + infoJsonObj +
                ", transInfoJsonObj=" + transInfoJsonObj +
                '}';
    }

    public String getSatisfactionTime() {
        return satisfactionTime;
    }

    public void setSatisfactionTime(String satisfactionTime) {
        this.satisfactionTime = satisfactionTime;
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

    public JsonObject getInfoJsonObj() {
        return infoJsonObj;
    }

    public void setInfoJsonObj(JsonObject infoJsonObj) {
        this.infoJsonObj = infoJsonObj;
    }

    public JsonObject getTransInfoJsonObj() {
        return transInfoJsonObj;
    }

    public void setTransInfoJsonObj(JsonObject transInfoJsonObj) {
        this.transInfoJsonObj = transInfoJsonObj;
    }

    public Reason() {

    }

    public Reason(String satisfactionTime, String type, String id, JsonObject infoJsonObj, JsonObject transInfoJsonObj) {

        this.satisfactionTime = satisfactionTime;
        this.type = type;
        this.id = id;
        this.infoJsonObj = infoJsonObj;
        this.transInfoJsonObj = transInfoJsonObj;
    }
}
