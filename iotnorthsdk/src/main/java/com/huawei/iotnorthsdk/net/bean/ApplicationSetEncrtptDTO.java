package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class ApplicationSetEncrtptDTO {
    @SerializedName("flag") Integer flag;
    @SerializedName("iv")   String iv;
    @SerializedName("key")  String key;

    @Override
    public String toString() {
        return "ApplicationSetEncrtptDTO{" +
                "flag=" + flag +
                ", iv='" + iv + '\'' +
                ", key='" + key + '\'' +
                '}';
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getIv() {
        return iv;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ApplicationSetEncrtptDTO() {

    }

    public ApplicationSetEncrtptDTO(Integer flag, String iv, String key) {

        this.flag = flag;
        this.iv = iv;
        this.key = key;
    }
}
