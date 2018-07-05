package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class RulesRes {
    @SerializedName("ruleId")  String ruleId;

    public RulesRes() {
    }

    @Override
    public String toString() {
        return "RulesRes{" +
                "ruleId='" + ruleId + '\'' +
                '}';
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public RulesRes(String ruleId) {

        this.ruleId = ruleId;
    }
}
