package com.howell.bean;

import com.google.gson.annotations.SerializedName;

public class HistoryData {
    @SerializedName("io")  Integer io;
    @SerializedName("battery")  Integer battery;
    @SerializedName("pic_seq")  Integer picSeq;
    @SerializedName("block_seq") Integer blockSeq;
    @SerializedName("block_end") Integer blockEnd;
    @SerializedName("pic_data") String picData;

    @Override
    public String toString() {
        return "HistoryData{" +
                "io=" + io +
                ", battery=" + battery +
                ", picSeq=" + picSeq +
                ", blockSeq=" + blockSeq +
                ", blockEnd=" + blockEnd +
                ", picData='" + picData + '\'' +
                '}';
    }

    public Integer getIo() {
        return io;
    }

    public void setIo(Integer io) {
        this.io = io;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public Integer getPicSeq() {
        return picSeq;
    }

    public void setPicSeq(Integer picSeq) {
        this.picSeq = picSeq;
    }

    public Integer getBlockSeq() {
        return blockSeq;
    }

    public void setBlockSeq(Integer blockSeq) {
        this.blockSeq = blockSeq;
    }

    public Integer getBlockEnd() {
        return blockEnd;
    }

    public void setBlockEnd(Integer blockEnd) {
        this.blockEnd = blockEnd;
    }

    public String getPicData() {
        return picData;
    }

    public void setPicData(String picData) {
        this.picData = picData;
    }

    public HistoryData() {

    }

    public HistoryData(Integer io, Integer battery, Integer picSeq, Integer blockSeq, Integer blockEnd, String picData) {

        this.io = io;
        this.battery = battery;
        this.picSeq = picSeq;
        this.blockSeq = blockSeq;
        this.blockEnd = blockEnd;
        this.picData = picData;
    }
}
