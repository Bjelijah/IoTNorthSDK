package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RulesStatusUpdateReq {
    @SerializedName("requests") ArrayList<RuleStatusUpdateReqDTO> requests;

    @Override
    public String toString() {
        return "RulesStatusUpdateReq{" +
                "requests=" + requests +
                '}';
    }

    public ArrayList<RuleStatusUpdateReqDTO> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<RuleStatusUpdateReqDTO> requests) {
        this.requests = requests;
    }

    public RulesStatusUpdateReq() {

    }

    public RulesStatusUpdateReq(ArrayList<RuleStatusUpdateReqDTO> requests) {

        this.requests = requests;
    }
}
