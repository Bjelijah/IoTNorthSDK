package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class CommandDTONA2Cloud {
    @SerializedName("header")  CommandNA2CloudHeader header;
    @SerializedName("body")    JSONObject bodyJsonObj;

    @Override
    public String toString() {
        return "CommandDTONA2Cloud{" +
                "header=" + header +
                ", bodyJsonObj=" + bodyJsonObj +
                '}';
    }

    public CommandNA2CloudHeader getHeader() {
        return header;
    }

    public void setHeader(CommandNA2CloudHeader header) {
        this.header = header;
    }

    public JSONObject getBodyJsonObj() {
        return bodyJsonObj;
    }

    public void setBodyJsonObj(JSONObject bodyJsonObj) {
        this.bodyJsonObj = bodyJsonObj;
    }

    public CommandDTONA2Cloud() {

    }

    public CommandDTONA2Cloud(CommandNA2CloudHeader header, JSONObject bodyJsonObj) {

        this.header = header;
        this.bodyJsonObj = bodyJsonObj;
    }
}
