package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GroupExpress {
    @SerializedName("operator")       String operator;
    @SerializedName("groupElements")  ArrayList<GroupElement> groupElements;

    @Override
    public String toString() {
        return "GroupExpress{" +
                "operator='" + operator + '\'' +
                ", groupElements=" + groupElements +
                '}';
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ArrayList<GroupElement> getGroupElements() {
        return groupElements;
    }

    public void setGroupElements(ArrayList<GroupElement> groupElements) {
        this.groupElements = groupElements;
    }

    public GroupExpress() {

    }

    public GroupExpress(String operator, ArrayList<GroupElement> groupElements) {

        this.operator = operator;
        this.groupElements = groupElements;
    }
}
