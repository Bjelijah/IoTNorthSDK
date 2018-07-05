package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class NotifyRuleEvent extends NotifyBase {

    @SerializedName("author")          String author;
    @SerializedName("ruleId")          String ruleId;
    @SerializedName("ruleName")        String ruleName;
    @SerializedName("logic")           String logic;
    @SerializedName("reasons")         ArrayList<Reason> reasons;
    @SerializedName("triggerTime")     String triggerTime;
    @SerializedName("actionsResults")  ArrayList<ActionResult> actionResults;

    @Override
    public String toString() {
        return "NotifyRuleEvent{" +
                "notifyType='" + notifyType + '\'' +
                ", author='" + author + '\'' +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", logic='" + logic + '\'' +
                ", reasons=" + reasons +
                ", triggerTime='" + triggerTime + '\'' +
                ", actionResults=" + actionResults +
                '}';
    }

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public ArrayList<Reason> getReasons() {
        return reasons;
    }

    public void setReasons(ArrayList<Reason> reasons) {
        this.reasons = reasons;
    }

    public String getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
    }

    public ArrayList<ActionResult> getActionResults() {
        return actionResults;
    }

    public void setActionResults(ArrayList<ActionResult> actionResults) {
        this.actionResults = actionResults;
    }

    public NotifyRuleEvent() {

    }

    public NotifyRuleEvent(String notifyType, String author, String ruleId, String ruleName, String logic, ArrayList<Reason> reasons, String triggerTime, ArrayList<ActionResult> actionResults) {

        this.notifyType = notifyType;
        this.author = author;
        this.ruleId = ruleId;
        this.ruleName = ruleName;
        this.logic = logic;
        this.reasons = reasons;
        this.triggerTime = triggerTime;
        this.actionResults = actionResults;
    }
}
