package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class DeviceService {
    @SerializedName("serviceType") String serviceType;
    @SerializedName("serviceId")   String serviceId;
    @SerializedName("data")        JSONObject dataJsonObj;
    @SerializedName("eventTime")   String eventTime;
    @SerializedName("serviceInfo") String serviceInfo;

    @Override
    public String toString() {
        return "DeviceService{" +
                "serviceType='" + serviceType + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", dataJsonStr='" + dataJsonObj + '\'' +
                ", eventTime='" + eventTime + '\'' +
                ", serviceInfo='" + serviceInfo + '\'' +
                '}';
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public JSONObject getDataJsonStr() {
        return dataJsonObj;
    }

    public void setDataJsonObj(JSONObject dataJsonObj) {
        this.dataJsonObj = dataJsonObj;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(String serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public DeviceService() {

    }

    public DeviceService(String serviceType, String serviceId, JSONObject dataJsonObj, String eventTime, String serviceInfo) {

        this.serviceType = serviceType;
        this.serviceId = serviceId;
        this.dataJsonObj = dataJsonObj;
        this.eventTime = eventTime;
        this.serviceInfo = serviceInfo;
    }
}
