package com.howell.action;

import android.content.Context;
import android.util.Log;

import com.huawei.iotnorthsdk.api.ApiManager;
import com.huawei.iotnorthsdk.net.bean.AuthRes;
import com.huawei.iotnorthsdk.net.bean.CommandDTONA2Cloud;
import com.huawei.iotnorthsdk.net.bean.CommandNA2CloudHeader;
import com.huawei.iotnorthsdk.net.bean.DeviceInfo;
import com.huawei.iotnorthsdk.net.bean.GetDeviceRspDTO;
import com.huawei.iotnorthsdk.net.bean.HistoryRes;
import com.huawei.iotnorthsdk.net.bean.LogoutReq;
import com.huawei.iotnorthsdk.net.bean.NotifyDeviceAdded;
import com.huawei.iotnorthsdk.net.bean.NotifyType;
import com.huawei.iotnorthsdk.net.bean.NotifyUri;
import com.huawei.iotnorthsdk.net.bean.QueryDeviceCapabilitiesRes;
import com.huawei.iotnorthsdk.net.bean.QueryDeviceCommandCancelTaskRes;
import com.huawei.iotnorthsdk.net.bean.QueryDeviceCommandsRes;
import com.huawei.iotnorthsdk.net.bean.QueryDeviceRes;
import com.huawei.iotnorthsdk.net.bean.RefreshTokenReq;
import com.huawei.iotnorthsdk.net.bean.RefreshTokenRes;
import com.huawei.iotnorthsdk.net.bean.RegStatusRes;
import com.huawei.iotnorthsdk.net.bean.SignaltransRes;
import com.huawei.iotnorthsdk.net.bean.SubscribeReq;

import org.json.JSONException;
import org.json.JSONObject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ClientManager {
    private static ClientManager mInstance = null;
    private ClientManager(){}
    public static ClientManager getInstance(){
        synchronized (ClientManager.class){
            if (mInstance==null){
                mInstance = new ClientManager();
            }
        }
        return mInstance;
    }

    private static String BEARER_ = "Bearer ";


    private String mAccessToken = null;
    private String mRefreshToken = null;
    private String mDeviceId = null;
    private String mGatewayId = null;


    public void init(Context context,boolean isSSL,String keyPath,String pwd, String url){
        ApiManager.getInstance().initHttpClient(context,isSSL,keyPath,pwd).getHWHttpClient(url);
    }
    //2.1.1 ok
    public void login(final String name, final String pwd){
        ApiManager.getInstance().getHWHttpClient()
                .Auth(name,pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<AuthRes>() {
                    @Override
                    public void accept(AuthRes authRes) throws Exception {
                        Log.i("123","authRes="+authRes);
//                        refreshToken(name,pwd,authRes.getRefreshToken());
//                        queryDevices(name,authRes.getAccessToken());
//                        logout(authRes.getAccessToken());

                        mAccessToken = authRes.getAccessToken();
                        mRefreshToken = authRes.getRefreshToken();
//                        subcribeNotify(name,authRes.getAccessToken());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }
    //2.1.2 ok
    public void refreshToken(String name,String pwd){
        ApiManager.getInstance().getHWHttpClient()
                .refreshToken(new RefreshTokenReq().setAppId(name).setSecret(pwd).setRefreshToken(mRefreshToken))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<RefreshTokenRes>() {
                    @Override
                    public void accept(RefreshTokenRes refreshTokenRes) throws Exception {
                        Log.i("123","res="+refreshTokenRes);
                        mAccessToken = refreshTokenRes.getAccessToken();

                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }
    //2.1.3 ok
    public void logout(){
        ApiManager.getInstance().getHWHttpClient()
                .logout(new LogoutReq(mAccessToken))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Response<Void>>() {
                    @Override
                    public void accept(Response<Void> voidResponse) throws Exception {
                        Log.i("123","res="+voidResponse.code());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }

    //2.2.1
    public void createDirectDevice(){

    }

    //2.2.2
    public void discoveryDevice(String appId) throws JSONException {
        CommandDTONA2Cloud req = new CommandDTONA2Cloud();
        CommandNA2CloudHeader header = new CommandNA2CloudHeader();
        header.setMode("ACK");
        header.setToType("GATEWAY");
        header.setMethod("DISCOVERY");
        header.setCallbackURL("http://192.168.18.169:8080/"+NotifyUri.MESSAGE_CONFIRM_URI);
        req.setBodyJsonObj(new JSONObject().put("cmdBody","discover indirect device cmd body content."));

        req.setHeader(header);
        ApiManager.getInstance().getHWHttpClient()
                .signaltrans(appId,BEARER_+mAccessToken,mDeviceId,"Discovery",null,req)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<SignaltransRes>() {
                    @Override
                    public void accept(SignaltransRes signaltransRes) throws Exception {
                        Log.i("123", "res-=" + signaltransRes);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });

    }
    //2.2.3  ok
    public void queryDeviceStatus(final String appId){
        ApiManager.getInstance().getHWHttpClient()
                .regStatus(appId,BEARER_+mAccessToken,mDeviceId,null)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<RegStatusRes>() {
                    @Override
                    public void accept(RegStatusRes regStatusRes) throws Exception {
                        Log.i("123","res="+regStatusRes);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }

    //2.3.1  ok
    public void queryDevices(final String appId){
        ApiManager.getInstance().getHWHttpClient()
                .queryDevices(appId,BEARER_+mAccessToken,null,null,null,
                        null,null,0,10,null,null,null,null)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<QueryDeviceRes>() {
                    @Override
                    public void accept(QueryDeviceRes queryDeviceRes) throws Exception {
                        Log.i("123",queryDeviceRes.toString());
                        mDeviceId = queryDeviceRes.getDevices().get(0).getDeviceId();
                        mGatewayId = queryDeviceRes.getDevices().get(0).getGatewayId();
//                        queryHistory(appId,accessToken,queryDeviceRes.getDevices().get(0).getDeviceId(),
//                                queryDeviceRes.getDevices().get(0).getGatewayId());

//                        queryCapability(appId,accessToken,queryDeviceRes.getDevices().get(0).getDeviceId());
//                        queryDeviceCmd(appId,accessToken);
//                        queryDeviceCommandCancelTask(appId,mAccessToken);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }
    //2.3.2 ok
    public void queryDevice(String appId){
        ApiManager.getInstance().getHWHttpClient()
                .queryDevice(appId,BEARER_+mAccessToken,mDeviceId,null)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GetDeviceRspDTO>() {
                    @Override
                    public void accept(GetDeviceRspDTO getDeviceRspDTO) throws Exception {
                        Log.i("123","res="+getDeviceRspDTO);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }

    //2.3.3 ok
    public void subcribeNotify(String appId){
        SubscribeReq req = new SubscribeReq(NotifyType.DEVICE_ADDED.toString(),"http://192.168.18.169:8080");
        ApiManager.getInstance().getHWHttpClient()
                .subscribe(appId,BEARER_+mAccessToken,req)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Response<Void>>() {
                    @Override
                    public void accept(Response<Void> voidResponse) throws Exception {
                        Log.i("123","voidResponse="+voidResponse+"  code="+voidResponse.code());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.e("123", "throwable  error");
                        throwable.printStackTrace();
                    }
                });
    }
    //2.3.4 ok
    public void queryHistory(String appId){
        ApiManager.getInstance().getHWHttpClient()
                .queryHistory(appId,BEARER_+mAccessToken,null,
                        mDeviceId,mGatewayId,null,null,null,null,null,null)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HistoryRes>() {
                    @Override
                    public void accept(HistoryRes historyRes) throws Exception {
                        Log.i("123", "history=" + historyRes);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }

    //2.3.5 ok
    public void queryCapability(String appId){
        ApiManager.getInstance().getHWHttpClient()
                .queryDeviceCapabilities(appId,BEARER_+mAccessToken,null,mDeviceId,null)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<QueryDeviceCapabilitiesRes>() {
                    @Override
                    public void accept(QueryDeviceCapabilitiesRes queryDeviceCapabilitiesRes) throws Exception {
                        Log.i("123","res="+queryDeviceCapabilitiesRes);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }

    //2.4.2 ok
    public void queryDeviceCmd(String appId){
        ApiManager.getInstance().getHWHttpClient()
                .queryDeviceCommands(appId,BEARER_+mAccessToken,null,null,null,null,null,null)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<QueryDeviceCommandsRes>() {
                    @Override
                    public void accept(QueryDeviceCommandsRes queryDeviceCommandsRes) throws Exception {
                        Log.i("123","res="+queryDeviceCommandsRes);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }
    //2.4.5
    public void queryDeviceCommandCancelTask(String appId){
        ApiManager.getInstance().getHWHttpClient()
                .queryDeviceCommandCancelTask(appId,BEARER_+mAccessToken,
                        null,null,null,null,null,null,null,null)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<QueryDeviceCommandCancelTaskRes>() {
                    @Override
                    public void accept(QueryDeviceCommandCancelTaskRes queryDeviceCommandCancelTaskRes) throws Exception {
                        Log.i("123","res="+queryDeviceCommandCancelTaskRes);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }


    public void testNotify(){
        NotifyDeviceAdded add = new NotifyDeviceAdded();
        add.setDeviceId("123123");
        add.setNotifyType("deviceAdded");
        add.setResultCode("200");
        add.setDeviceInfo(new DeviceInfo());
        ApiManager.getInstance().getHWHttpClient()
                .deviceAddedNotify(NotifyUri.DEVICE_ADDED_DIRECT_URI,add)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Response<Void>>() {
                    @Override
                    public void accept(Response<Void> voidResponse) throws Exception {
                        Log.i("123","test notify res="+voidResponse.code());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }


}
