package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class HistoryRes {
    @SerializedName("totalCount")   Long totalCount;
    @SerializedName("pageNo")       Long pageNo;
    @SerializedName("pageSize")     Long pageSize;
    @SerializedName("list")         ArrayList<DeviceDataHistoryDTO> historys;

    @Override
    public String toString() {
        return "HistoryRes{" +
                "totalCount=" + totalCount +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", historys=" + historys +
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

    public ArrayList<DeviceDataHistoryDTO> getHistorys() {
        return historys;
    }

    public void setHistorys(ArrayList<DeviceDataHistoryDTO> historys) {
        this.historys = historys;
    }

    public HistoryRes() {

    }

    public HistoryRes(Long totalCount, Long pageNo, Long pageSize, ArrayList<DeviceDataHistoryDTO> historys) {

        this.totalCount = totalCount;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.historys = historys;
    }
}
