package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RulesStatusUpdateRes {
    @SerializedName("result")     RuleResultBodyDTO result;
    @SerializedName("responses")  ArrayList<RuleResponseBodyDTO> responses;

    @Override
    public String toString() {
        return "RulesStatusUpdateRes{" +
                "result=" + result +
                ", responses=" + responses +
                '}';
    }

    public RuleResultBodyDTO getResult() {
        return result;
    }

    public void setResult(RuleResultBodyDTO result) {
        this.result = result;
    }

    public ArrayList<RuleResponseBodyDTO> getResponses() {
        return responses;
    }

    public void setResponses(ArrayList<RuleResponseBodyDTO> responses) {
        this.responses = responses;
    }

    public RulesStatusUpdateRes() {

    }

    public RulesStatusUpdateRes(RuleResultBodyDTO result, ArrayList<RuleResponseBodyDTO> responses) {

        this.result = result;
        this.responses = responses;
    }
}
