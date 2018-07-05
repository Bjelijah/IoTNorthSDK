package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class DeviceCmdDetailsOutput {
    @SerializedName("requestId")     String requestId;
    @SerializedName("commandResult") String commandResult;

    @Override
    public String toString() {
        return "DeviceCmdDetailsOutput{" +
                "requestId='" + requestId + '\'' +
                ", commandResult='" + commandResult + '\'' +
                '}';
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCommandResult() {
        return commandResult;
    }

    public void setCommandResult(String commandResult) {
        this.commandResult = commandResult;
    }

    public DeviceCmdDetailsOutput() {

    }

    public DeviceCmdDetailsOutput(String requestId, String commandResult) {

        this.requestId = requestId;
        this.commandResult = commandResult;
    }
}
