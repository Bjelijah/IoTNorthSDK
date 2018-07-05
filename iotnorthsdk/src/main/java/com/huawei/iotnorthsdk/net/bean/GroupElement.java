package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

import java.util.ArrayList;

public class GroupElement {
    @SerializedName("operator")    String operator;
    @SerializedName("elements")    ArrayList<JSONObject> elements;

    @Override
    public String toString() {
        return "GroupElement{" +
                "operator='" + operator + '\'' +
                ", elements=" + elements +
                '}';
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ArrayList<JSONObject> getElements() {
        return elements;
    }

    public void setElements(ArrayList<JSONObject> elements) {
        this.elements = elements;
    }

    public GroupElement() {

    }

    public GroupElement(String operator, ArrayList<JSONObject> elements) {

        this.operator = operator;
        this.elements = elements;
    }
}
