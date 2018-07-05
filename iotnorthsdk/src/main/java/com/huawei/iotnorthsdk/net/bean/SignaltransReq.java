package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

@Deprecated
/**
 * @Link{CommandDTONA2Cloud}
 */
public class SignaltransReq {
    @SerializedName("appId") String appId;
    @SerializedName("message") CommandDTONA2Cloud message;

    @Override
    public String toString() {
        return "SignaltransReq{" +
                "appId='" + appId + '\'' +
                ", message=" + message +
                '}';
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CommandDTONA2Cloud getMessage() {
        return message;
    }

    public void setMessage(CommandDTONA2Cloud message) {
        this.message = message;
    }

    public SignaltransReq() {

    }

    public SignaltransReq(String appId, CommandDTONA2Cloud message) {

        this.appId = appId;
        this.message = message;
    }
}
