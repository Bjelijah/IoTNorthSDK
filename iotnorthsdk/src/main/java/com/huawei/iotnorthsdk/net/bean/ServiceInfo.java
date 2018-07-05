package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ServiceInfo {
    @SerializedName("muteCmds")
    ArrayList<String> muteCmds;

    @Override
    public String toString() {
        return "ServiceInfo{" +
                "muteCmds=" + muteCmds +
                '}';
    }

    public ArrayList<String> getMuteCmds() {
        return muteCmds;
    }

    public void setMuteCmds(ArrayList<String> muteCmds) {
        this.muteCmds = muteCmds;
    }

    public ServiceInfo() {

    }

    public ServiceInfo(ArrayList<String> muteCmds) {

        this.muteCmds = muteCmds;
    }
}
