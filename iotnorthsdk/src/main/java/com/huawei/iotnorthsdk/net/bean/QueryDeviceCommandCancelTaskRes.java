package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class QueryDeviceCommandCancelTaskRes {
    @SerializedName("pagination")   Pagination pagination;
    @SerializedName("data")         ArrayList<DeviceCommandCancelTaskResp> datas;

    @Override
    public String toString() {
        return "QueryDeviceCommandCancelTaskRes{" +
                "pagination=" + pagination +
                ", datas=" + datas +
                '}';
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public ArrayList<DeviceCommandCancelTaskResp> getDatas() {
        return datas;
    }

    public void setDatas(ArrayList<DeviceCommandCancelTaskResp> datas) {
        this.datas = datas;
    }

    public QueryDeviceCommandCancelTaskRes() {

    }

    public QueryDeviceCommandCancelTaskRes(Pagination pagination, ArrayList<DeviceCommandCancelTaskResp> datas) {

        this.pagination = pagination;
        this.datas = datas;
    }
}
