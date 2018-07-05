package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ServiceProperty {
    @SerializedName("propertyName") String propertyName;
    @SerializedName("dataType")     String dataType;
    @SerializedName("required")     Boolean required;
    @SerializedName("min")          Integer min;
    @SerializedName("max")          Integer max;
    @SerializedName("step")         Double step;
    @SerializedName("maxLength")    Integer maxLength;
    @SerializedName("method")       String method;
    @SerializedName("unit")         String unit;
    @SerializedName("enumList")     ArrayList<String> enumList;

    @Override
    public String toString() {
        return "ServiceProperty{" +
                "propertyName='" + propertyName + '\'' +
                ", dataType='" + dataType + '\'' +
                ", required=" + required +
                ", min=" + min +
                ", max=" + max +
                ", step=" + step +
                ", maxLength=" + maxLength +
                ", method='" + method + '\'' +
                ", unit='" + unit + '\'' +
                ", enumList=" + enumList +
                '}';
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Double getStep() {
        return step;
    }

    public void setStep(Double step) {
        this.step = step;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ArrayList<String> getEnumList() {
        return enumList;
    }

    public void setEnumList(ArrayList<String> enumList) {
        this.enumList = enumList;
    }

    public ServiceProperty() {

    }

    public ServiceProperty(String propertyName, String dataType, Boolean required, Integer min, Integer max, Double step, Integer maxLength, String method, String unit, ArrayList<String> enumList) {

        this.propertyName = propertyName;
        this.dataType = dataType;
        this.required = required;
        this.min = min;
        this.max = max;
        this.step = step;
        this.maxLength = maxLength;
        this.method = method;
        this.unit = unit;
        this.enumList = enumList;
    }
}
