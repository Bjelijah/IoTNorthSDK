package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class DeviceGroupInfo {
    @SerializedName("groupId")      String groupId;
    @SerializedName("path")         String path;

    @Override
    public String toString() {
        return "DeviceGroupInfo{" +
                "groupId='" + groupId + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public DeviceGroupInfo() {

    }

    public DeviceGroupInfo(String groupId, String path) {

        this.groupId = groupId;
        this.path = path;
    }
}
