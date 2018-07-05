package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class ActionResult {
    @SerializedName("type")      String type;
    @SerializedName("id")        String id;
    @SerializedName("exception") String exception;
    @SerializedName("result")    JSONObject resultJsonObj;
    @SerializedName("info")      JSONObject infoJsonObj;
    @SerializedName("transInfo") JSONObject transInfoJsonObj;

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

    public JSONObject getResultJsonObj() {
        return resultJsonObj;
    }

    public void setResultJsonObj(JSONObject resultJsonObj) {
        this.resultJsonObj = resultJsonObj;
    }

    public JSONObject getInfoJsonObj() {
        return infoJsonObj;
    }

    public void setInfoJsonObj(JSONObject infoJsonObj) {
        this.infoJsonObj = infoJsonObj;
    }

    public JSONObject getTransInfoJsonObj() {
        return transInfoJsonObj;
    }

    public void setTransInfoJsonObj(JSONObject transInfoJsonObj) {
        this.transInfoJsonObj = transInfoJsonObj;
    }

    public ActionResult() {

    }

    public ActionResult(String type, String id, String exception, JSONObject resultJsonObj, JSONObject infoJsonObj, JSONObject transInfoJsonObj) {

        this.type = type;
        this.id = id;
        this.exception = exception;
        this.resultJsonObj = resultJsonObj;
        this.infoJsonObj = infoJsonObj;
        this.transInfoJsonObj = transInfoJsonObj;
    }
}
