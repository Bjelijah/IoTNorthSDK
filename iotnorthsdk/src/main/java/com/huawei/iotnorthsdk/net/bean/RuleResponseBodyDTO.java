package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class RuleResponseBodyDTO {

    @SerializedName("ruleId")            String ruleId;
    @SerializedName("response")          String exceptionMsg;

    @Override
    public String toString() {
        return "RuleResponseBodyDTO{" +
                "ruleId='" + ruleId + '\'' +
                ", exceptionMsg='" + exceptionMsg + '\'' +
                '}';
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public RuleResponseBodyDTO() {

    }

    public RuleResponseBodyDTO(String ruleId, String exceptionMsg) {

        this.ruleId = ruleId;
        this.exceptionMsg = exceptionMsg;
    }
}
