package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class PutCarInfoData {
    @SerializedName("engineModel")  String engineModel;
    @SerializedName("vin")          String vin;
    @SerializedName("plateNumber")  String plateNumber;
    @SerializedName("simNumber")    String simNumber;
    @SerializedName("carModel")     String carModel;
    @SerializedName("terminalID")   String terminalID;
    @SerializedName("iccid")        String iccid;
    @SerializedName("imei")         String imei;
    @SerializedName("encryptFlag")  Integer encryptFlag;
    @SerializedName("encryptIv")    String encryptIv;
    @SerializedName("encryptKey")   String encryptKey;

    @Override
    public String toString() {
        return "PutCarInfoData{" +
                "engineModel='" + engineModel + '\'' +
                ", vin='" + vin + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", simNumber='" + simNumber + '\'' +
                ", carModel='" + carModel + '\'' +
                ", terminalID='" + terminalID + '\'' +
                ", iccid='" + iccid + '\'' +
                ", imei='" + imei + '\'' +
                ", encryptFlag=" + encryptFlag +
                ", encryptIv='" + encryptIv + '\'' +
                ", encryptKey='" + encryptKey + '\'' +
                '}';
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Integer getEncryptFlag() {
        return encryptFlag;
    }

    public void setEncryptFlag(Integer encryptFlag) {
        this.encryptFlag = encryptFlag;
    }

    public String getEncryptIv() {
        return encryptIv;
    }

    public void setEncryptIv(String encryptIv) {
        this.encryptIv = encryptIv;
    }

    public String getEncryptKey() {
        return encryptKey;
    }

    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
    }

    public PutCarInfoData() {

    }

    public PutCarInfoData(String engineModel, String vin, String plateNumber, String simNumber, String carModel, String terminalID, String iccid, String imei, Integer encryptFlag, String encryptIv, String encryptKey) {

        this.engineModel = engineModel;
        this.vin = vin;
        this.plateNumber = plateNumber;
        this.simNumber = simNumber;
        this.carModel = carModel;
        this.terminalID = terminalID;
        this.iccid = iccid;
        this.imei = imei;
        this.encryptFlag = encryptFlag;
        this.encryptIv = encryptIv;
        this.encryptKey = encryptKey;
    }
}
