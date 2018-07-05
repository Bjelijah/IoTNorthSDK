package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DeviceCommandCancelTaskResp {
    @SerializedName("taskId")         String taskId;
    @SerializedName("appId")          String appId;
    @SerializedName("deviceId")       String deviceId;
    @SerializedName("status")         String status;
    @SerializedName("totalCount")     Integer totalCount;
    @SerializedName("deviceCommands") ArrayList<DeviceCommandResp> deviceCommands;

    @Override
    public String toString() {
        return "DeviceCommandCancelTaskResp{" +
                "taskId='" + taskId + '\'' +
                ", appId='" + appId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", status='" + status + '\'' +
                ", totalCount=" + totalCount +
                ", deviceCommands=" + deviceCommands +
                '}';
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ArrayList<DeviceCommandResp> getDeviceCommands() {
        return deviceCommands;
    }

    public void setDeviceCommands(ArrayList<DeviceCommandResp> deviceCommands) {
        this.deviceCommands = deviceCommands;
    }

    public DeviceCommandCancelTaskResp() {

    }

    public DeviceCommandCancelTaskResp(String taskId, String appId, String deviceId, String status, Integer totalCount, ArrayList<DeviceCommandResp> deviceCommands) {

        this.taskId = taskId;
        this.appId = appId;
        this.deviceId = deviceId;
        this.status = status;
        this.totalCount = totalCount;
        this.deviceCommands = deviceCommands;
    }
}
