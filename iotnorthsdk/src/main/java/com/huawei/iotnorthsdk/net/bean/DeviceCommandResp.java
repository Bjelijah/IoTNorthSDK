package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class DeviceCommandResp {
    @SerializedName("commandId")     String commandId;
    @SerializedName("appId")         String appId;
    @SerializedName("deviceId")      String deviceId;
    @SerializedName("command")       CommandDTOV4 command;
    @SerializedName("callbackUrl")   String callbackUrl;
    @SerializedName("expireTime")    Integer expireTime;
    @SerializedName("status")        String status;
    @SerializedName("result")        String resultJsonStr;
    @SerializedName("creationTime")  String createTime;
    @SerializedName("executeTime")   String executeTime;
    @SerializedName("platformIssuedTime") String platformIssuedTime;
    @SerializedName("deliveredTime") String deliveredTime;
    @SerializedName("issuedTimes")   Integer issuedTimes;

    @Override
    public String toString() {
        return "DeviceCommandResp{" +
                "commandId='" + commandId + '\'' +
                ", appId='" + appId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", command=" + command +
                ", callbackUrl='" + callbackUrl + '\'' +
                ", expireTime=" + expireTime +
                ", status='" + status + '\'' +
                ", resultJsonStr='" + resultJsonStr + '\'' +
                ", createTime='" + createTime + '\'' +
                ", executeTime='" + executeTime + '\'' +
                ", platformIssuedTime='" + platformIssuedTime + '\'' +
                ", deliveredTime='" + deliveredTime + '\'' +
                ", issuedTimes=" + issuedTimes +
                '}';
    }

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public CommandDTOV4 getCommand() {
        return command;
    }

    public void setCommand(CommandDTOV4 command) {
        this.command = command;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResultJsonStr() {
        return resultJsonStr;
    }

    public void setResultJsonStr(String resultJsonStr) {
        this.resultJsonStr = resultJsonStr;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
    }

    public String getPlatformIssuedTime() {
        return platformIssuedTime;
    }

    public void setPlatformIssuedTime(String platformIssuedTime) {
        this.platformIssuedTime = platformIssuedTime;
    }

    public String getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(String deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    public Integer getIssuedTimes() {
        return issuedTimes;
    }

    public void setIssuedTimes(Integer issuedTimes) {
        this.issuedTimes = issuedTimes;
    }

    public DeviceCommandResp() {

    }

    public DeviceCommandResp(String commandId, String appId, String deviceId, CommandDTOV4 command, String callbackUrl, Integer expireTime, String status, String resultJsonStr, String createTime, String executeTime, String platformIssuedTime, String deliveredTime, Integer issuedTimes) {

        this.commandId = commandId;
        this.appId = appId;
        this.deviceId = deviceId;
        this.command = command;
        this.callbackUrl = callbackUrl;
        this.expireTime = expireTime;
        this.status = status;
        this.resultJsonStr = resultJsonStr;
        this.createTime = createTime;
        this.executeTime = executeTime;
        this.platformIssuedTime = platformIssuedTime;
        this.deliveredTime = deliveredTime;
        this.issuedTimes = issuedTimes;
    }
}
