package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class DeviceConfigDTO {
    @SerializedName("dataConfig")   DataConfigDTO dataConfig;

    @Override
    public String toString() {
        return "DeviceConfigDTO{" +
                "dataConfig=" + dataConfig +
                '}';
    }

    public DataConfigDTO getDataConfig() {
        return dataConfig;
    }

    public void setDataConfig(DataConfigDTO dataConfig) {
        this.dataConfig = dataConfig;
    }

    public DeviceConfigDTO(DataConfigDTO dataConfig) {

        this.dataConfig = dataConfig;
    }
}
