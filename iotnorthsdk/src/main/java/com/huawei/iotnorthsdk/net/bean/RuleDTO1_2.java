package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RuleDTO1_2 {
    @SerializedName("ruleId")         String ruleId;
    @SerializedName("appKey")         String appKey;
    @SerializedName("name")           String name;
    @SerializedName("description")    String description;
    @SerializedName("author")         String author;
    @SerializedName("conditions")     ArrayList<JsonObject> conditions;
    @SerializedName("logic")          String logic;
    @SerializedName("timeRange")      String timeRange;
    @SerializedName("actions")        ArrayList<JsonObject> actions;
    @SerializedName("matchNow")       String matchNow;
    @SerializedName("status")         String status;
    @SerializedName("groupExpress")   GroupExpress groupExpress;
    @SerializedName("timezoneID")     String timezoneId;
    @SerializedName("triggerSources") ArrayList<JsonObject> triggerSources;

    @Override
    public String toString() {
        return "RuleDTO1_2{" +
                "ruleId='" + ruleId + '\'' +
                ", appKey='" + appKey + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", conditions=" + conditions +
                ", logic='" + logic + '\'' +
                ", timeRange='" + timeRange + '\'' +
                ", actions=" + actions +
                ", matchNow='" + matchNow + '\'' +
                ", status='" + status + '\'' +
                ", groupExpress=" + groupExpress +
                ", timezoneId='" + timezoneId + '\'' +
                ", triggerSources=" + triggerSources +
                '}';
    }

    public RuleDTO1_2() {
    }

    public String getRuleId() {

        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<JsonObject> getConditions() {
        return conditions;
    }

    public void setConditions(ArrayList<JsonObject> conditions) {
        this.conditions = conditions;
    }

    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public ArrayList<JsonObject> getActions() {
        return actions;
    }

    public void setActions(ArrayList<JsonObject> actions) {
        this.actions = actions;
    }

    public String getMatchNow() {
        return matchNow;
    }

    public void setMatchNow(String matchNow) {
        this.matchNow = matchNow;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GroupExpress getGroupExpress() {
        return groupExpress;
    }

    public void setGroupExpress(GroupExpress groupExpress) {
        this.groupExpress = groupExpress;
    }

    public String getTimezoneId() {
        return timezoneId;
    }

    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
    }

    public ArrayList<JsonObject> getTriggerSources() {
        return triggerSources;
    }

    public void setTriggerSources(ArrayList<JsonObject> triggerSources) {
        this.triggerSources = triggerSources;
    }

    public RuleDTO1_2(String ruleId, String appKey, String name, String description, String author, ArrayList<JsonObject> conditions, String logic, String timeRange, ArrayList<JsonObject> actions, String matchNow, String status, GroupExpress groupExpress, String timezoneId, ArrayList<JsonObject> triggerSources) {

        this.ruleId = ruleId;
        this.appKey = appKey;
        this.name = name;
        this.description = description;
        this.author = author;
        this.conditions = conditions;
        this.logic = logic;
        this.timeRange = timeRange;
        this.actions = actions;
        this.matchNow = matchNow;
        this.status = status;
        this.groupExpress = groupExpress;
        this.timezoneId = timezoneId;
        this.triggerSources = triggerSources;
    }
}
