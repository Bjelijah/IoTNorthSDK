package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class Action_DeviceCMD {
    @SerializedName("type")        String type;
    @SerializedName("id")          String id;
    @SerializedName("appKey")      String appKey;
    @SerializedName("deviceId")    String deviceId;
    @SerializedName("cmd")         CMD cmd;
    @SerializedName("cmdVersion")  String cmdVersion;//v1.3.0
    @SerializedName("cmdMetaData") CmdMetaDataV1_3_0 cmdMetaData;
    @SerializedName("transInfo")   JSONObject transInfo;

    @Override
    public String toString() {
        return "Action_DeviceCMD{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", appKey='" + appKey + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", cmd=" + cmd +
                ", cmdVersion='" + cmdVersion + '\'' +
                ", cmdMetaData=" + cmdMetaData +
                ", transInfo=" + transInfo +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public CMD getCmd() {
        return cmd;
    }

    public void setCmd(CMD cmd) {
        this.cmd = cmd;
    }

    public String getCmdVersion() {
        return cmdVersion;
    }

    public void setCmdVersion(String cmdVersion) {
        this.cmdVersion = cmdVersion;
    }

    public CmdMetaDataV1_3_0 getCmdMetaData() {
        return cmdMetaData;
    }

    public void setCmdMetaData(CmdMetaDataV1_3_0 cmdMetaData) {
        this.cmdMetaData = cmdMetaData;
    }

    public JSONObject getTransInfo() {
        return transInfo;
    }

    public void setTransInfo(JSONObject transInfo) {
        this.transInfo = transInfo;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Action_DeviceCMD() {

    }

    public Action_DeviceCMD(String type, String id, String appKey, String deviceId, CMD cmd, String cmdVersion, CmdMetaDataV1_3_0 cmdMetaData, JSONObject transInfo) {

        this.type = type;
        this.id = id;
        this.appKey = appKey;
        this.deviceId = deviceId;
        this.cmd = cmd;
        this.cmdVersion = cmdVersion;
        this.cmdMetaData = cmdMetaData;
        this.transInfo = transInfo;
    }
}
