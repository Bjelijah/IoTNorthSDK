package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class RuleStatusUpdateReqDTO {
    @SerializedName("ruleId")      String ruleId;
    @SerializedName("status")      String status;

    @Override
    public String toString() {
        return "RuleStatusUpdateReqDTO{" +
                "ruleId='" + ruleId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RuleStatusUpdateReqDTO() {

    }

    public RuleStatusUpdateReqDTO(String ruleId, String status) {

        this.ruleId = ruleId;
        this.status = status;
    }
}
