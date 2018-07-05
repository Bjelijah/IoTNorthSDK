package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class QueryTaskDetailDTOCloud2NA {
    @SerializedName("status")   String status;
    @SerializedName("output")   DeviceCmdDetailsOutput output;
    @SerializedName("error")    String error;
    @SerializedName("param")    DeviceCmdDetailsParam param;

    @Override
    public String toString() {
        return "QueryTaskDetailDTOCloud2NA{" +
                "status='" + status + '\'' +
                ", output=" + output +
                ", error='" + error + '\'' +
                ", param=" + param +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeviceCmdDetailsOutput getOutput() {
        return output;
    }

    public void setOutput(DeviceCmdDetailsOutput output) {
        this.output = output;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public DeviceCmdDetailsParam getParam() {
        return param;
    }

    public void setParam(DeviceCmdDetailsParam param) {
        this.param = param;
    }

    public QueryTaskDetailDTOCloud2NA() {

    }

    public QueryTaskDetailDTOCloud2NA(String status, DeviceCmdDetailsOutput output, String error, DeviceCmdDetailsParam param) {

        this.status = status;
        this.output = output;
        this.error = error;
        this.param = param;
    }
}
