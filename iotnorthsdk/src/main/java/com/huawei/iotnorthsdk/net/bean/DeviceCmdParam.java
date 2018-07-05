package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DeviceCmdParam {
    @SerializedName("type")            String type;
    @SerializedName("deviceList")      ArrayList<String> deviceList;
    @SerializedName("deviceType")      String deviceType;
    @SerializedName("manufacturerId")  String manufacturerId;
    @SerializedName("model")           String model;
    @SerializedName("deviceLocation")  String deviceLocation;
    @SerializedName("groupList")       ArrayList<String> groupList;
    @SerializedName("command")         CommandDTOV1 command;

    @Override
    public String toString() {
        return "DeviceCmdParam{" +
                "type='" + type + '\'' +
                ", deviceList=" + deviceList +
                ", deviceType='" + deviceType + '\'' +
                ", manufacturerId='" + manufacturerId + '\'' +
                ", model='" + model + '\'' +
                ", deviceLocation='" + deviceLocation + '\'' +
                ", groupList=" + groupList +
                ", command=" + command +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(ArrayList<String> deviceList) {
        this.deviceList = deviceList;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public ArrayList<String> getGroupList() {
        return groupList;
    }

    public void setGroupList(ArrayList<String> groupList) {
        this.groupList = groupList;
    }

    public CommandDTOV1 getCommand() {
        return command;
    }

    public void setCommand(CommandDTOV1 command) {
        this.command = command;
    }

    public DeviceCmdParam() {

    }

    public DeviceCmdParam(String type, ArrayList<String> deviceList, String deviceType, String manufacturerId, String model, String deviceLocation, ArrayList<String> groupList, CommandDTOV1 command) {

        this.type = type;
        this.deviceList = deviceList;
        this.deviceType = deviceType;
        this.manufacturerId = manufacturerId;
        this.model = model;
        this.deviceLocation = deviceLocation;
        this.groupList = groupList;
        this.command = command;
    }
}
