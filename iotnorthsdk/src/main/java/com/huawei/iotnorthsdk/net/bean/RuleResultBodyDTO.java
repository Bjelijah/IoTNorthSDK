package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class RuleResultBodyDTO {
    @SerializedName("result_code")  String result_code;
    @SerializedName("result_desc")  String result_desc;

    @Override
    public String toString() {
        return "RuleResultBodyDTO{" +
                "result_code='" + result_code + '\'' +
                ", result_desc='" + result_desc + '\'' +
                '}';
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getResult_desc() {
        return result_desc;
    }

    public void setResult_desc(String result_desc) {
        this.result_desc = result_desc;
    }

    public RuleResultBodyDTO() {

    }

    public RuleResultBodyDTO(String result_code, String result_desc) {

        this.result_code = result_code;
        this.result_desc = result_desc;
    }
}
