package com.huawei.iotnorthsdk.api;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.huawei.iotnorthsdk.net.bean.AuthRes;
import com.huawei.iotnorthsdk.net.bean.CarEncryptReq;
import com.huawei.iotnorthsdk.net.bean.CommandDTONA2Cloud;
import com.huawei.iotnorthsdk.net.bean.CreateDeviceCommandCancelTaskReq;
import com.huawei.iotnorthsdk.net.bean.NotifyDeviceAdded;
import com.huawei.iotnorthsdk.net.bean.RulesStatusUpdateReq;
import com.huawei.iotnorthsdk.net.bean.RulesRes;
import com.huawei.iotnorthsdk.net.bean.CreateTasksReq;
import com.huawei.iotnorthsdk.net.bean.CreateTasksRes;
import com.huawei.iotnorthsdk.net.bean.DeviceCommandCancelTaskResp;
import com.huawei.iotnorthsdk.net.bean.DeviceCommandResp;
import com.huawei.iotnorthsdk.net.bean.GetDeviceRspDTO;
import com.huawei.iotnorthsdk.net.bean.HistoryRes;
import com.huawei.iotnorthsdk.net.bean.LogoutReq;
import com.huawei.iotnorthsdk.net.bean.PostDeviceCommandReq;
import com.huawei.iotnorthsdk.net.bean.QueryDeviceCapabilitiesRes;
import com.huawei.iotnorthsdk.net.bean.QueryDeviceCommandCancelTaskRes;
import com.huawei.iotnorthsdk.net.bean.QueryDeviceCommandsRes;
import com.huawei.iotnorthsdk.net.bean.QueryDeviceRes;
import com.huawei.iotnorthsdk.net.bean.QueryTaskDetailsRes;
import com.huawei.iotnorthsdk.net.bean.QueryTasksRes;
import com.huawei.iotnorthsdk.net.bean.RefreshTokenReq;
import com.huawei.iotnorthsdk.net.bean.RefreshTokenRes;
import com.huawei.iotnorthsdk.net.bean.RegReq;
import com.huawei.iotnorthsdk.net.bean.RegRes;
import com.huawei.iotnorthsdk.net.bean.RegStatusRes;
import com.huawei.iotnorthsdk.net.bean.RegUpdateReq;
import com.huawei.iotnorthsdk.net.bean.RegUpdateRes;
import com.huawei.iotnorthsdk.net.bean.RuleDTO1_2;
import com.huawei.iotnorthsdk.net.bean.RulesStatusUpdateRes;
import com.huawei.iotnorthsdk.net.bean.SignaltransRes;
import com.huawei.iotnorthsdk.net.bean.SubscribeReq;
import com.huawei.iotnorthsdk.net.bean.UpdateDeviceCommandReq;
import com.huawei.iotnorthsdk.net.bean.UpdateDeviceInfoReqDTO;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface HWIoTApi {
    /**
     * 2.1.1
     * 鉴权
     */
    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded")
    @POST("iocm/app/sec/v1.1.0/login")
    Observable<AuthRes> Auth(
            @Field("appId")          @NonNull String appId,
            @Field("secret")         @NonNull String secret);

    /**
     * 2.1.2
     * 刷新token
     */
    @Headers("Content-Type:application/json")
    @POST("iocm/app/sec/v1.1.0/refreshToken")
    Observable<RefreshTokenRes> refreshToken(
            @Body                    @NonNull RefreshTokenReq req);

    /**
     * 2.1.3
     * 注销
     */
    @Headers("Content-Type:application/json")
    @POST("iocm/app/sec/v1.1.0/logout")
    Observable<Response<Void>> logout(
            @Body                    @NonNull LogoutReq req);

    /********************************************
     * 2.2 设备管理   na -> c
     **********************************************/
    /**
     * 2.2.1
     * 注册直连设备
     */
    @Headers("Content-Type:application/json")
    @POST("iocm/app/reg/v1.2.0/devices")
    Observable<RegRes> regist(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Query("appId")          @Nullable String appId,
            @Body                    @NonNull  RegReq req);

    /**
     * 2.2.2
     * 发现非直连设备
     */
    @Headers("Content-Type:application/json")
    @POST("iocm/app/signaltrans/v1.1.0/devices/{deviceId}/services/{serviceId}/sendCommand")
    Observable<SignaltransRes> signaltrans(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Path("deviceId")        @NonNull  String deviceId,
            @Path("serviceId")       @NonNull  String serviceId,
            @Query("appId")          @Nullable String appId,
            @Body                    @NonNull  CommandDTONA2Cloud req);

    /**
     * 2.2.3
     * 查询设备激活状态
     */
    @Headers("Content-Type:application/json")
    @GET("iocm/app/reg/v1.1.0/devices/{deviceId}")
    Observable<RegStatusRes> regStatus(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Path("deviceId")        @NonNull  String deviceId,
            @Query("appId")          @Nullable String appId);

    /**
     * 2.2.4
     * 删除直连设备
     */
    @Headers("Content-Type:application/json")
    @DELETE("iocm/app/dm/v1.1.0/devices/{deviceId}")
    Observable<Response<Void>> delDevice(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Path("deviceId")        @NonNull  String deviceId,
            @Query("appId")          @Nullable String appId,
            @Query("cascade")        @Nullable String cascade);

    //2.2.5  -> 2.2.2
    //2.2.6 FIXME

    /**
     * 2.2.6
     * 修改设备信息
     */
    @Headers("Content-Type:application/json")
    @PUT("iocm/app/dm/v1.2.0/devices/{deviceId}")
    Observable<Response<Void>> updateDeviceInfo(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Path("deviceId")        @NonNull  String deviceId,
            @Query("appId")          @Nullable String appId,
            @Body                    @Nullable UpdateDeviceInfoReqDTO req);

    //2.2.7

    /**
     * 2.2.7
     * 刷新设备秘银
     */
    @Headers("Content-Type:application/json")
    @PUT("iocm/app/reg/v1.1.0/devices/{deviceId}")
    Observable<RegUpdateRes> regUpdate(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Path("deviceId")        @NonNull  String deviceId,
            @Query("appId")          @Nullable String appId,
            @Body                    @Nullable RegUpdateReq req);

    /**
     * 2.2.8
     * 设置加密
     */
    @Headers("Content-Type:application/json")
    @PUT("iocm/app/dm/v1.1.0/devices/{deviceId}/services/{serviceType}")
    Observable<Response<Void>> setCarEncrypt(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Path("deviceId")        @NonNull  String deviceId,
            @Path("serviceType")     @NonNull  String serviceType,
            @Body                    @Nullable CarEncryptReq req);

    /**
     * 2.3 数据采集
     */
    /**
     * 2.3.1
     * 批量查询
     */
    //2.3.1
    @Headers("Content-Type:application/json")
    @GET("iocm/app/dm/v1.3.0/devices")
    Observable<QueryDeviceRes> queryDevices(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Query("appId")          @Nullable String appId,
            @Query("gatewayId")      @Nullable String gatewayId,
            @Query("nodeType")       @Nullable String nodeType,
            @Query("deviceType")     @Nullable String deviceType,
            @Query("protocolType")   @Nullable String protocolType,
            @Query("pageNo")         @Nullable Integer pageNo,
            @Query("pageSize")       @Nullable Integer pageSize,
            @Query("status")         @Nullable String status,
            @Query("startTime")      @Nullable String startTime,
            @Query("endTime")        @Nullable String endTime,
            @Query("sort")           @Nullable String sort);

    /**
     * 2.3.2
     * 查询单个信息
     */
    @Headers("Content-Type:application/json")
    @GET("iocm/app/dm/v1.3.0/devices/{deviceId}")
    Observable<GetDeviceRspDTO> queryDevice(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Path("deviceId")        @NonNull  String deviceId,
            @Query("appId")          @Nullable String appId);

    /**
     * 2.3.3
     * 订阅
     */
    @Headers("Content-Type:application/json")
    @POST("iocm/app/sub/v1.2.0/subscribe")
    Observable<Response<Void>> subscribe(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Body                    @NonNull  SubscribeReq req);

    /**
     * 2.3.4
     * 查询历史
     */
    @Headers("Content-Type:application/json")
    @GET("iocm/app/data/v1.1.0/deviceDataHistory")
    Observable<HistoryRes> queryHistory(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Query("appId")          @Nullable String appId,
            @Query("deviceId")       @NonNull  String deviceId,
            @Query("gatewayId")      @NonNull  String gatewayId,
            @Query("serviceId")      @Nullable String serviceId,
            @Query("property")       @Nullable String property,
            @Query("pageNo")         @Nullable Integer pageNo,
            @Query("pageSize")       @Nullable Integer pageSize,
            @Query("startTime")      @Nullable String startTime,
            @Query("endTime")        @Nullable String endTime);

    /**
     * 2.3.5
     * 查询能力
     */
    @Headers("Content-Type:application/json")
    @GET("iocm/app/data/v1.1.0/deviceCapabilities")
    Observable<QueryDeviceCapabilitiesRes> queryDeviceCapabilities(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Query("appId")          @Nullable String appId,
            @Query("deviceId")       @NonNull  String deviceId,
            @Query("gatewayId")      @Nullable String gatewayId);

    /*************************************************************
     * 2.4 信令传送   na->cloud
     **************************************************************/
    /**
     * 2.4.1
     * 创建设备
     */
    @Headers("Content-Type:application/json")
    @POST("iocm/app/cmd/v1.4.0/deviceCommands")
    Observable<DeviceCommandResp> createDeviceCommands(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Query("appId")          @Nullable String appId,
            @Body                    @NonNull PostDeviceCommandReq req);

    /**
     * 2.4.2
     * 查询设备命令
     */
    @Headers("Content-Type:application/json")
    @GET("iocm/app/cmd/v1.4.0/deviceCommands")
    Observable<QueryDeviceCommandsRes> queryDeviceCommands(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Query("appId")          @Nullable String appId,
            @Query("pageNo")         @Nullable Integer pageNo,
            @Query("pageSize")       @Nullable Integer pageSize,
            @Query("deviceid")       @Nullable String deviceId,
            @Query("startTime")      @Nullable String startTime,
            @Query("endTime")        @Nullable String endTime);

    /**
     * 2.4.3
     * 修改设备命令
     */
    @Headers("Content-Type:application/json")
    @PUT("iocm/app/cmd/v1.4.0/deviceCommands/{deviceCommandId}")
    Observable<DeviceCommandResp> updateDeviceCommands(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Path("deviceCommandId") @NonNull  String deviceCommandId,
            @Query("appId")          @Nullable String appId,
            @Body                    @NonNull UpdateDeviceCommandReq req);

    //2.4.4

    /**
     * 2.4.4
     * 创建设备命令撤销任务
     */
    @Headers("Content-Type:application/json")
    @POST("iocm/app/cmd/v1.4.0/deviceCommandCancelTasks")
    Observable<DeviceCommandCancelTaskResp> createDeviceCommandCancel(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Query("appId")          @Nullable String appId,
            @Body                    @NonNull CreateDeviceCommandCancelTaskReq req);

    /**
     * 2.4.5
     * 查询设备命令撤销任务
     */
    @Headers("Content-Type:application/json")
    @GET("iocm/app/cmd/v1.4.0/deviceCommandCancelTasks")
    Observable<QueryDeviceCommandCancelTaskRes> queryDeviceCommandCancelTask(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Query("appId")          @Nullable String appId,
            @Query("pageNo")         @Nullable Integer pageNo,
            @Query("pageSize")       @Nullable Integer pageSize,
            @Query("taskId")         @Nullable String taskId,
            @Query("deviceId")       @Nullable String deviceId,
            @Query("status")         @Nullable String status,
            @Query("startTime")      @Nullable String startTime,
            @Query("endTime")        @Nullable String endTime);

    /*********************************************
     * 2.5  设备服务调用   na -> cloud
     **************************************/
    /**
     * 2.5.1
     * 设备服务调用
     */
    //FIXME agent/agentLite
    @Headers("Content-Type:application/json")
    @POST("iocm/app/signaltrans/v1.1.0/devices/{deviceId}/services/{serviceId}/sendCommand")
    Observable<SignaltransRes> signaltransSendCommand(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Path("deviceId")        @NonNull  String deviceId,
            @Path("serviceId")       @NonNull  String serviceId,
            @Query("appId")          @Nullable String appId,
            @Body                    @NonNull  CommandDTONA2Cloud req);

    /************************************************************
     * 2.6 批量处理    na -> cloud
     ****************************************/
    /**
     * 2.6.1
     * 创建批量任务
     */
    @Headers("Content-Type:application/json")
    @POST("iocm/app/batchtask/v1.1.0/tasks")
    Observable<CreateTasksRes> createTasks(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Body                    @NonNull CreateTasksReq req);

    /**
     * 2.6.2
     * 查询单个任务信息
     */
    @Headers("Content-Type:application/json")
    @GET("iocm/app/batchtask/v1.1.0/tasks/{taskId}")
    Observable<QueryTasksRes> queryTasks(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Path("taskId")          @NonNull  String taskId,
            @Query("appId")          @Nullable String appId);

    /**
     * 2.6.3
     * 查询任务详细信息
     */
    @Headers("Content-Type:application/json")
    @GET("iocm/app/batchtask/v1.1.0/taskDetails")
    Observable<QueryTaskDetailsRes> queryTaskDetails(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Query("appId")          @Nullable String appId,
            @Query("taskId")         @NonNull  String taskId,
            @Query("status")         @Nullable String status,
            @Query("pageNo")         @Nullable Integer pageNo,
            @Query("pageSize")       @Nullable Integer pageSize,
            @Query("index")          @Nullable Integer index,
            @Query("nodeId")         @Nullable String nodeId,
            @Query("deviceId")       @Nullable String deviceId,
            @Query("commandId")      @Nullable String commandId);

    /***************************************************************
     * 2.7     na -> cloud
     ****************************************************************/
    /**
     * 2.7.1
     * 创建规则
     */
    @Headers("Content-Type:application/json")
    @POST("iocm/app/rule/v1.2.0/rules")
    Observable<RulesRes> createRules(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Body                    @NonNull  RuleDTO1_2 req);

    /**
     * 2.7.2
     * 更新规则
     */
    @Headers("Content-Type:application/json")
    @PUT("iocm/app/rule/v1.2.0/rules")
    Observable<RulesRes> updateRules(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Body                    @NonNull  RuleDTO1_2 req);

    /**
     * 2.7.3
     * 修改规则状态  //fixme
     */
    @Headers("Content-Type:application/json")
    @PUT("iocm/app/rule/v1.2.0/rules/{ruleId}/status/{status}")
    Observable<Response<Void>> updateRulesStatus(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Path("ruleId")          @NonNull  String ruleId,
            @Path("status")          @NonNull  String status);

    /**
     * 2.7.4
     * 删除规则
     */
    @Headers("Content-Type:application/json")
    @DELETE("iocm/app/rule/v1.2.0/rules/{ruleId}")
    Observable<Response<Void>> delRules(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Path("ruleId")          @NonNull  String ruleId);

    /**
     * 2.7.5
     * 查找规则
     */
    @Headers("Content-Type:application/json")
    @GET("iocm/app/rule/v1.2.0/rules")
    Observable<RuleDTO1_2> queryRules(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Query("author")         @NonNull  String author,
            @Query("name")           @Nullable String name);

    /**
     * 2.7.6
     * 批量修改规则状态
     */
    @Headers("Content-Type:application/json")
    @PUT("iocm/app/rule/v1.2.0/rules/status")
    Observable<RulesStatusUpdateRes> updateRulesStatus(
            @Header("app_key")       @NonNull  String appKey,
            @Header("Authorization") @NonNull  String Bearer_accessToken,
            @Body                    @NonNull  RulesStatusUpdateReq req);

    /*********************************************************
     * 2.8消息推送  cloud -> na 假装有一个推送过来了
     *******************************************************/
    /**
     * 2.8.1
     * 注册直连设备的通知
     * {@link 2.3.3}
     */
    @Headers("Content-Type:application/json")
    @POST("{CallbackUrl}")
    Observable<Response<Void>> deviceAddedNotify(
            @Path("CallbackUrl")     @NonNull  String url,
            @Body                    @NonNull  NotifyDeviceAdded req);







}
