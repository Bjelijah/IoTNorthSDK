package com.huawei.iotnorthsdk.net.bean;

public enum NotifyType {
    DEVICE_ADDED("deviceAdded"),
    DEVICE_INFO_CHANGED("deviceInfoChanged"),
    DEVICE_DATA_CHANGED("deviceDataChanged"),
    DEVICE_DELETED("deviceDeleted"),
    DEVICE_EVENT("deviceEvent"),
    MESSAGE_CONFIRM("messageConfirm"),
    COMMAND_RSP("commandRsp"),
    SERVICE_INFO_CHANGED("serviceInfoChanged"),
    RULE_EVENT("ruleEvent"),
    BIND_DEVICE("bindDevice"),
    DEVICE_DATAS_CHANGED("deviceDatasChanged")
    ;
    private final String val;
    NotifyType(String str){
        val = str;
    }

    @Override
    public String toString() {
        return val;
    }
}
