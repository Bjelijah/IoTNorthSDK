package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class CreateTasksRes {
    @SerializedName("taskID")  String taskID;

    @Override
    public String toString() {
        return "CreateTasksRes{" +
                "taskID='" + taskID + '\'' +
                '}';
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public CreateTasksRes(String taskID) {

        this.taskID = taskID;
    }
}
