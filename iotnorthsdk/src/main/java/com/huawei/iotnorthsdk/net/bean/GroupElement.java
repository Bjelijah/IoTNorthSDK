package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

import java.util.ArrayList;

public class GroupElement {
    @SerializedName("operator")    String operator;
    @SerializedName("elements")    ArrayList<JsonObject> elements;

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

    public ArrayList<JsonObject> getElements() {
        return elements;
    }

    public void setElements(ArrayList<JsonObject> elements) {
        this.elements = elements;
    }

    public GroupElement() {

    }

    public GroupElement(String operator, ArrayList<JsonObject> elements) {

        this.operator = operator;
        this.elements = elements;
    }
}
