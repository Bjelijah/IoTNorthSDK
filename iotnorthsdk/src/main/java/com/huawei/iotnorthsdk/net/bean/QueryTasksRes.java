package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class QueryTasksRes {
    @SerializedName("taskId")       String taskId;
    @SerializedName("taskName")     String taskName;
    @SerializedName("appId")        String appId;
    @SerializedName("operator")     String operator;
    @SerializedName("taskFrom")     String taskFrom;
    @SerializedName("taskType")     String taskType;
    @SerializedName("status")       String status;
    @SerializedName("startTime")    String startTime;
    @SerializedName("timeout")      Integer timeout;
    @SerializedName("progress")     Integer progress;
    @SerializedName("totalCnt")     Integer totalCnt;
    @SerializedName("successCnt")   Integer successCnt;
    @SerializedName("failCnt")      Integer failCnt;
    @SerializedName("timeoutCnt")   Integer timeoutCnt;
    @SerializedName("expiredCnt")   Integer expiredCnt;
    @SerializedName("completeCnt")  Integer completeCnt;
    @SerializedName("successRate")  Integer successRate;
    @SerializedName("param")        DeviceCmdParamGet param;

    @Override
    public String toString() {
        return "QueryTasksRes{" +
                "taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", appId='" + appId + '\'' +
                ", operator='" + operator + '\'' +
                ", taskFrom='" + taskFrom + '\'' +
                ", taskType='" + taskType + '\'' +
                ", status='" + status + '\'' +
                ", startTime='" + startTime + '\'' +
                ", timeout=" + timeout +
                ", progress=" + progress +
                ", totalCnt=" + totalCnt +
                ", successCnt=" + successCnt +
                ", failCnt=" + failCnt +
                ", timeoutCnt=" + timeoutCnt +
                ", expiredCnt=" + expiredCnt +
                ", completeCnt=" + completeCnt +
                ", successRate=" + successRate +
                ", param=" + param +
                '}';
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getTaskFrom() {
        return taskFrom;
    }

    public void setTaskFrom(String taskFrom) {
        this.taskFrom = taskFrom;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }

    public Integer getSuccessCnt() {
        return successCnt;
    }

    public void setSuccessCnt(Integer successCnt) {
        this.successCnt = successCnt;
    }

    public Integer getFailCnt() {
        return failCnt;
    }

    public void setFailCnt(Integer failCnt) {
        this.failCnt = failCnt;
    }

    public Integer getTimeoutCnt() {
        return timeoutCnt;
    }

    public void setTimeoutCnt(Integer timeoutCnt) {
        this.timeoutCnt = timeoutCnt;
    }

    public Integer getExpiredCnt() {
        return expiredCnt;
    }

    public void setExpiredCnt(Integer expiredCnt) {
        this.expiredCnt = expiredCnt;
    }

    public Integer getCompleteCnt() {
        return completeCnt;
    }

    public void setCompleteCnt(Integer completeCnt) {
        this.completeCnt = completeCnt;
    }

    public Integer getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Integer successRate) {
        this.successRate = successRate;
    }

    public DeviceCmdParamGet getParam() {
        return param;
    }

    public void setParam(DeviceCmdParamGet param) {
        this.param = param;
    }

    public QueryTasksRes() {

    }

    public QueryTasksRes(String taskId, String taskName, String appId, String operator, String taskFrom, String taskType, String status, String startTime, Integer timeout, Integer progress, Integer totalCnt, Integer successCnt, Integer failCnt, Integer timeoutCnt, Integer expiredCnt, Integer completeCnt, Integer successRate, DeviceCmdParamGet param) {

        this.taskId = taskId;
        this.taskName = taskName;
        this.appId = appId;
        this.operator = operator;
        this.taskFrom = taskFrom;
        this.taskType = taskType;
        this.status = status;
        this.startTime = startTime;
        this.timeout = timeout;
        this.progress = progress;
        this.totalCnt = totalCnt;
        this.successCnt = successCnt;
        this.failCnt = failCnt;
        this.timeoutCnt = timeoutCnt;
        this.expiredCnt = expiredCnt;
        this.completeCnt = completeCnt;
        this.successRate = successRate;
        this.param = param;
    }
}
