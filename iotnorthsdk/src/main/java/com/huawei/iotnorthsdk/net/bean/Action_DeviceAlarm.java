package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class Action_DeviceAlarm {
    @SerializedName("type")        String type;
    @SerializedName("id")          String id;
    @SerializedName("name")        String name;
    @SerializedName("status")      String status;
    @SerializedName("severity")    String severity;
    @SerializedName("description") String description;

    @Override
    public String toString() {
        return "Action_DeviceAlarm{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", severity='" + severity + '\'' +
                ", description='" + description + '\'' +
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Action_DeviceAlarm() {

    }

    public Action_DeviceAlarm(String type, String id, String name, String status, String severity, String description) {

        this.type = type;
        this.id = id;
        this.name = name;
        this.status = status;
        this.severity = severity;
        this.description = description;
    }
}
