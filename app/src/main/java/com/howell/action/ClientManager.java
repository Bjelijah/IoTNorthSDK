package com.howell.action;

import android.content.Context;
import android.util.Log;

import com.huawei.iotnorthsdk.api.ApiManager;
import com.huawei.iotnorthsdk.net.bean.AuthRes;
import com.huawei.iotnorthsdk.net.bean.DeviceInfo;
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
import com.huawei.iotnorthsdk.net.bean.SubscribeReq;

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


    public void init(Context context,boolean isSSL,String keyPath,String pwd, String url){
        ApiManager.getInstance().initHttpClient(context,isSSL,keyPath,pwd).getHWHttpClient(url);
    }

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
                        queryDevices(name,authRes.getAccessToken());
//                        logout(authRes.getAccessToken());
//                        subcribeNotify(name,authRes.getAccessToken());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });



    }

    public void refreshToken(String name,String pwd,String refreshToken){
        ApiManager.getInstance().getHWHttpClient()
                .refreshToken(new RefreshTokenReq().setAppId(name).setSecret(pwd).setRefreshToken(refreshToken))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<RefreshTokenRes>() {
                    @Override
                    public void accept(RefreshTokenRes refreshTokenRes) throws Exception {
                        Log.i("123","res="+refreshTokenRes);
                        logout(refreshTokenRes.getAccessToken());

                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }

    public void logout(String accessToken){//error
        ApiManager.getInstance().getHWHttpClient()
                .logout(new LogoutReq(accessToken))
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

    public void queryDevices(final String appId, final String accessToken){
        ApiManager.getInstance().getHWHttpClient()
                .queryDevices(appId,BEARER_+accessToken,null,null,null,
                        null,null,0,10,null,null,null,null)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<QueryDeviceRes>() {
                    @Override
                    public void accept(QueryDeviceRes queryDeviceRes) throws Exception {
                        Log.i("123",queryDeviceRes.toString());
//                        queryHistory(appId,accessToken,queryDeviceRes.getDevices().get(0).getDeviceId(),
//                                queryDeviceRes.getDevices().get(0).getGatewayId());

//                        queryCapability(appId,accessToken,queryDeviceRes.getDevices().get(0).getDeviceId());
//                        queryDeviceCmd(appId,accessToken);
                        queryDeviceCommandCancelTask(appId,accessToken);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                });
    }
    //2.3.3
    public void subcribeNotify(String appId,String accessToken){
        SubscribeReq req = new SubscribeReq(NotifyType.DEVICE_INFO_CHANGED.toString(),"http://192.168.18.169:8888");
        ApiManager.getInstance().getHWHttpClient()
                .subscribe(appId,BEARER_+accessToken,req)
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
    //2.3.4
    public void queryHistory(String appId,String accessToken,String deviceId,String gatewayId){
        ApiManager.getInstance().getHWHttpClient()
                .queryHistory(appId,BEARER_+accessToken,null,
                        deviceId,gatewayId,null,null,null,null,null,null)
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

    //2.3.5
    public void queryCapability(String appId,String accessToken,String deviceId){
        ApiManager.getInstance().getHWHttpClient()
                .queryDeviceCapabilities(appId,BEARER_+accessToken,null,deviceId,null)
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

    //2.4.2
    public void queryDeviceCmd(String appId,String accessToken){
        ApiManager.getInstance().getHWHttpClient()
                .queryDeviceCommands(appId,BEARER_+accessToken,null,null,null,null,null,null)
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
    public void queryDeviceCommandCancelTask(String appId,String accessToken){
        ApiManager.getInstance().getHWHttpClient()
                .queryDeviceCommandCancelTask(appId,BEARER_+accessToken,
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
