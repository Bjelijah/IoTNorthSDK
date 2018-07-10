package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class ActionResult {
    @SerializedName("type")      String type;
    @SerializedName("id")        String id;
    @SerializedName("exception") String exception;
    @SerializedName("result")    JsonObject resultJsonObj;
    @SerializedName("info")      JsonObject infoJsonObj;
    @SerializedName("transInfo") JsonObject transInfoJsonObj;

    @Override
    public String toString() {
        return "ActionResult{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", exception='" + exception + '\'' +
                ", resultJsonObj=" + resultJsonObj +
                ", infoJsonObj=" + infoJsonObj +
                ", transInfoJsonObj=" + transInfoJsonObj +
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

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public JsonObject getResultJsonObj() {
        return resultJsonObj;
    }

    public void setResultJsonObj(JsonObject resultJsonObj) {
        this.resultJsonObj = resultJsonObj;
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

    public ActionResult() {

    }

    public ActionResult(String type, String id, String exception, JsonObject resultJsonObj, JsonObject infoJsonObj, JsonObject transInfoJsonObj) {

        this.type = type;
        this.id = id;
        this.exception = exception;
        this.resultJsonObj = resultJsonObj;
        this.infoJsonObj = infoJsonObj;
        this.transInfoJsonObj = transInfoJsonObj;
    }
}
