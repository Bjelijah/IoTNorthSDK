package com.huawei.iotnorthsdk.net.bean;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

public class DeviceInfo {
    @SerializedName("nodeId")           String nodeId;
    @SerializedName("name")             String name;
    @SerializedName("description")      String description;
    @SerializedName("manufactureId")    String manufactureId;
    @SerializedName("manufactureName")  String manufactureName;
    @SerializedName("mac")              String mac;
    @SerializedName("location")         String location;
    @SerializedName("deviceType")       String deviceType;
    @SerializedName("model")            String model;
    @SerializedName("swVersion")        String swVersion;
    @SerializedName("fwVersion")        String fwVersion;
    @SerializedName("hwVersion")        String hwVersion;
    @SerializedName("protocolType")     String protocolType;
    @SerializedName("signalStrength")   String signalStrength;
    @SerializedName("bridgeId")         String bridgeId;
    @SerializedName("supportedSecurity")String supportedSecurity;
    @SerializedName("isSecurity")       String isSecurity;
    @SerializedName("sigVersion")       String sigVersion;
    @SerializedName("runningStatus")    String runningStatus;
    @SerializedName("status")           String status;
    @SerializedName("statusDetail")     String statusDetail;
    @SerializedName("mute")             String mute;

    @Override
    public String toString() {
        return "DeviceInfo{" +
                "nodeId='" + nodeId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", manufactureId='" + manufactureId + '\'' +
                ", manufactureName='" + manufactureName + '\'' +
                ", mac='" + mac + '\'' +
                ", location='" + location + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", model='" + model + '\'' +
                ", swVersion='" + swVersion + '\'' +
                ", fwVersion='" + fwVersion + '\'' +
                ", hwVersion='" + hwVersion + '\'' +
                ", protocolType='" + protocolType + '\'' +
                ", signalStrength='" + signalStrength + '\'' +
                ", bridgeId='" + bridgeId + '\'' +
                ", supportedSecurity='" + supportedSecurity + '\'' +
                ", isSecurity='" + isSecurity + '\'' +
                ", sigVersion='" + sigVersion + '\'' +
                ", runningStatus='" + runningStatus + '\'' +
                ", status='" + status + '\'' +
                ", statusDetail='" + statusDetail + '\'' +
                ", mute='" + mute + '\'' +
                '}';
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufactureId() {
        return manufactureId;
    }

    public void setManufactureId(String manufactureId) {
        this.manufactureId = manufactureId;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSwVersion() {
        return swVersion;
    }

    public void setSwVersion(String swVersion) {
        this.swVersion = swVersion;
    }

    public String getFwVersion() {
        return fwVersion;
    }

    public void setFwVersion(String fwVersion) {
        this.fwVersion = fwVersion;
    }

    public String getHwVersion() {
        return hwVersion;
    }

    public void setHwVersion(String hwVersion) {
        this.hwVersion = hwVersion;
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public String getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(String signalStrength) {
        this.signalStrength = signalStrength;
    }

    public String getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
    }

    public String getSupportedSecurity() {
        return supportedSecurity;
    }

    public void setSupportedSecurity(String supportedSecurity) {
        this.supportedSecurity = supportedSecurity;
    }

    public String getIsSecurity() {
        return isSecurity;
    }

    public void setIsSecurity(String isSecurity) {
        this.isSecurity = isSecurity;
    }

    public String getSigVersion() {
        return sigVersion;
    }

    public void setSigVersion(String sigVersion) {
        this.sigVersion = sigVersion;
    }

    public String getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public String getMute() {
        return mute;
    }

    public void setMute(String mute) {
        this.mute = mute;
    }

    public DeviceInfo(String nodeId, String name, String description, String manufactureId, String manufactureName, String mac, String location, String deviceType, String model, String swVersion, String fwVersion, String hwVersion, String protocolType, String signalStrength, String bridgeId, String supportedSecurity, String isSecurity, String sigVersion, String runningStatus, String status, String statusDetail, String mute) {

        this.nodeId = nodeId;
        this.name = name;
        this.description = description;
        this.manufactureId = manufactureId;
        this.manufactureName = manufactureName;
        this.mac = mac;
        this.location = location;
        this.deviceType = deviceType;
        this.model = model;
        this.swVersion = swVersion;
        this.fwVersion = fwVersion;
        this.hwVersion = hwVersion;
        this.protocolType = protocolType;
        this.signalStrength = signalStrength;
        this.bridgeId = bridgeId;
        this.supportedSecurity = supportedSecurity;
        this.isSecurity = isSecurity;
        this.sigVersion = sigVersion;
        this.runningStatus = runningStatus;
        this.status = status;
        this.statusDetail = statusDetail;
        this.mute = mute;
    }

    public DeviceInfo() {
    }
}
