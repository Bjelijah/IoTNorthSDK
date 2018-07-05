package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class QueryDeviceCommandsRes {
    @SerializedName("pagination") Pagination pagination;
    @SerializedName("data") ArrayList<DeviceCommandResp> deviceCommandResps;

    @Override
    public String toString() {
        return "QueryDeviceCommandsRes{" +
                "pagination=" + pagination +
                ", deviceCommandResps=" + deviceCommandResps +
                '}';
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public ArrayList<DeviceCommandResp> getDeviceCommandResps() {
        return deviceCommandResps;
    }

    public void setDeviceCommandResps(ArrayList<DeviceCommandResp> deviceCommandResps) {
        this.deviceCommandResps = deviceCommandResps;
    }

    public QueryDeviceCommandsRes() {

    }

    public QueryDeviceCommandsRes(Pagination pagination, ArrayList<DeviceCommandResp> deviceCommandResps) {

        this.pagination = pagination;
        this.deviceCommandResps = deviceCommandResps;
    }
}
