package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class Action_SMS {
    @SerializedName("type")      String type;
    @SerializedName("id")        String id;
    @SerializedName("msisdn")    String msisdn;
    @SerializedName("content")   String content;
    @SerializedName("subject")   String subject;
    @SerializedName("title")     String title;
    @SerializedName("accountId") String accountId;

    @Override
    public String toString() {
        return "Action_SMS{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", content='" + content + '\'' +
                ", subject='" + subject + '\'' +
                ", title='" + title + '\'' +
                ", accountId='" + accountId + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Action_SMS() {

    }

    public Action_SMS(String type, String id, String msisdn, String content, String subject, String title, String accountId) {

        this.type = type;
        this.id = id;
        this.msisdn = msisdn;
        this.content = content;
        this.subject = subject;
        this.title = title;
        this.accountId = accountId;
    }
}
