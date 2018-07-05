package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ServiceCommandPara {
    @SerializedName("paraName")  String paraName;
    @SerializedName("dataType")  String dataType;
    @SerializedName("required")  Boolean required;
    @SerializedName("min")       Integer min;
    @SerializedName("max")       Integer max;
    @SerializedName("step")      Double step;
    @SerializedName("maxLength") Integer maxLength;
    @SerializedName("unit")      String unit;
    @SerializedName("enumList")  ArrayList<String> enumList;

    @Override
    public String toString() {
        return "ServiceCommandPara{" +
                "paraName='" + paraName + '\'' +
                ", dataType='" + dataType + '\'' +
                ", required=" + required +
                ", min=" + min +
                ", max=" + max +
                ", step=" + step +
                ", maxLength=" + maxLength +
                ", unit='" + unit + '\'' +
                ", enumList=" + enumList +
                '}';
    }

    public String getParaName() {
        return paraName;
    }

    public void setParaName(String paraName) {
        this.paraName = paraName;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<String> getEnumList() {
        return enumList;
    }

    public void setEnumList(ArrayList<String> enumList) {
        this.enumList = enumList;
    }

    public ServiceCommandPara() {

    }

    public ServiceCommandPara(String paraName, String dataType, Boolean required, Integer min, Integer max, Double step, Integer maxLength, String unit, ArrayList<String> enumList) {

        this.paraName = paraName;
        this.dataType = dataType;
        this.required = required;
        this.min = min;
        this.max = max;
        this.step = step;
        this.maxLength = maxLength;
        this.unit = unit;
        this.enumList = enumList;
    }
}
