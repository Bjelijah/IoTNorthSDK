package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class Action_email {
    @SerializedName("type")      String type;
    @SerializedName("id")        String id;
    @SerializedName("email")     String email;
    @SerializedName("content")   String content;
    @SerializedName("subject")   String subject;
    @SerializedName("title")     String title;
    @SerializedName("accountId") String accountId;

    @Override
    public String toString() {
        return "Action_email{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Action_email() {

    }

    public Action_email(String type, String id, String email, String content, String subject, String title, String accountId) {

        this.type = type;
        this.id = id;
        this.email = email;
        this.content = content;
        this.subject = subject;
        this.title = title;
        this.accountId = accountId;
    }
}
