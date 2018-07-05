package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ServiceCommand {
    @SerializedName("commandName") String commandName;
    @SerializedName("paras")       ArrayList<ServiceCommandPara> paras;
}
