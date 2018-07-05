package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class UpdateDeviceCommandReq {
    @SerializedName("status")  String status;

    @Override
    public String toString() {
        return "UpdateDeviceCommandReq{" +
                "status='" + status + '\'' +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateDeviceCommandReq() {

    }

    public UpdateDeviceCommandReq(String status) {

        this.status = status;
    }
}
