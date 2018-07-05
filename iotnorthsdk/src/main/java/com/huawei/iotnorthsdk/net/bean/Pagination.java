package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class Pagination {
    @SerializedName("pageNo")    Long pageNo;
    @SerializedName("pageSize")  Long pageSize;
    @SerializedName("totalSize") Long totalSize;

    @Override
    public String toString() {
        return "Pagination{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", totalSize=" + totalSize +
                '}';
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

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public Pagination() {

    }

    public Pagination(Long pageNo, Long pageSize, Long totalSize) {

        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalSize = totalSize;
    }
}
