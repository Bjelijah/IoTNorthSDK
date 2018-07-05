package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class DataConfigDTO {
    @SerializedName("dataAgingTime") Integer dataAgingTime;

    @Override
    public String toString() {
        return "DataConfigDTO{" +
                "dataAgingTime=" + dataAgingTime +
                '}';
    }

    public Integer getDataAgingTime() {
        return dataAgingTime;
    }

    public void setDataAgingTime(Integer dataAgingTime) {
        this.dataAgingTime = dataAgingTime;
    }

    public DataConfigDTO(Integer dataAgingTime) {

        this.dataAgingTime = dataAgingTime;
    }
}
