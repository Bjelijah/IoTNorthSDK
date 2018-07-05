package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class QueryTaskDetailsRes {
    @SerializedName("pageNo")      Integer pageNo;
    @SerializedName("pageSize")    Integer pageSize;
    @SerializedName("totalCount")  Integer totalCount;
    @SerializedName("taskDetails") ArrayList<QueryTaskDetailDTOCloud2NA> taskDetails;

    @Override
    public String toString() {
        return "QueryTaskDetailsRes{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", taskDetails=" + taskDetails +
                '}';
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ArrayList<QueryTaskDetailDTOCloud2NA> getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(ArrayList<QueryTaskDetailDTOCloud2NA> taskDetails) {
        this.taskDetails = taskDetails;
    }

    public QueryTaskDetailsRes() {

    }

    public QueryTaskDetailsRes(Integer pageNo, Integer pageSize, Integer totalCount, ArrayList<QueryTaskDetailDTOCloud2NA> taskDetails) {

        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.taskDetails = taskDetails;
    }
}
