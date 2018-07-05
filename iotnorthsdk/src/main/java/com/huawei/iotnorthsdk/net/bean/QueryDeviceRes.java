package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class QueryDeviceRes {
    @SerializedName("totalCount") Long totalCount;
    @SerializedName("pageNo")     Long pageNo;
    @SerializedName("pageSize")   Long pageSize;
    @SerializedName("devices")    ArrayList<GetDeviceRspDTO> devices;

    @Override
    public String toString() {
        return "QueryDeviceRes{" +
                "totalCount=" + totalCount +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", devices=" + devices +
                '}';
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getPageNo() {
        return pageNo;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public ArrayList<GetDeviceRspDTO> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<GetDeviceRspDTO> devices) {
        this.devices = devices;
    }

    public QueryDeviceRes() {

    }

    public QueryDeviceRes(Long totalCount, Long pageNo, Long pageSize, ArrayList<GetDeviceRspDTO> devices) {

        this.totalCount = totalCount;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.devices = devices;
    }
}
