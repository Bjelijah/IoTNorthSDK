package com.huawei.iotnorthsdk.net.bean;

//use string from demo
public class NotifyUri {
    public static final String DEVICE_ADDED_DIRECT_URI    = "na/iocm/devNotify/v1.1.0/addDeviceDirect";
    public static final String DEVICE_ADDED_INDIRECT_URI  = "na/iocm/devNotify/v1.1.0/addDeviceIndirect";
    public static final String DEVICE_INFO_CHANGED_URI    = "na/iocm/devNotify/v1.1.0/updateDeviceInfo";
    public static final String DEVICE_DATA_CHANGED_URI    = "na/iocm/devNotify/v1.1.0/updateDeviceData";
    public static final String DEVICE_DELETED_URI         = "na/iocm/devNotify/v1.1.0/deletedDevice";
    public static final String DEVICE_EVENT_URI           = "na/iocm/devNotify/v1.1.0/deviceEvent";
    public static final String MESSAGE_CONFIRM_URI        = "na/iocm/devNotify/v1.1.0/commandConfirmData";
    public static final String COMMAND_RSP_URI            = "na/iocm/devNotify/v1.1.0/commandRspData";
    public static final String SERVICE_INFO_CHANGED_URI   = "na/iocm/devNotify/v1.1.0/updateServiceInfo";
    public static final String RULE_EVENT_URI             = "na/iocm/devNotify/v1.1.0/rulEevent";
    public static final String BIND_DEVICE_URI            = "na/iocm/devNotify/v1.1.0/bindDevice";
    public static final String DEVICE_DATAS_CHANGED_URI   = "na/iocm/devNotify/v1.1.0/updateDeviceDatas";

    public static final String [] CALLBACK_URI = {
            DEVICE_ADDED_DIRECT_URI,
//            DEVICE_ADDED_INDIRECT_URI,
            DEVICE_INFO_CHANGED_URI,
            DEVICE_DATA_CHANGED_URI,
            DEVICE_DELETED_URI,
            DEVICE_EVENT_URI,
            MESSAGE_CONFIRM_URI,
            COMMAND_RSP_URI,
            SERVICE_INFO_CHANGED_URI,
            RULE_EVENT_URI,
            BIND_DEVICE_URI,
            DEVICE_DATAS_CHANGED_URI
    };


}
