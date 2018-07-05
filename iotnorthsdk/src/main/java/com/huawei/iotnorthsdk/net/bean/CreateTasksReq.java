package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class CreateTasksReq {
    @SerializedName("appId")    String appId;
    @SerializedName("timeout")  Integer timeout;
    @SerializedName("taskName") String taskName;
    @SerializedName("taskType") String taskType;
    @SerializedName("param")    DeviceCmdParam param;

    @Override
    public String toString() {
        return "CreateTasksReq{" +
                "appId='" + appId + '\'' +
                ", timeout=" + timeout +
                ", taskName='" + taskName + '\'' +
                ", taskType='" + taskType + '\'' +
                ", param=" + param +
                '}';
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public DeviceCmdParam getParam() {
        return param;
    }

    public void setParam(DeviceCmdParam param) {
        this.param = param;
    }

    public CreateTasksReq() {

    }

    public CreateTasksReq(String appId, Integer timeout, String taskName, String taskType, DeviceCmdParam param) {

        this.appId = appId;
        this.timeout = timeout;
        this.taskName = taskName;
        this.taskType = taskType;
        this.param = param;
    }
}
