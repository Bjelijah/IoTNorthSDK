package com.howell.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.howell.utils.Utils;
import com.huawei.iotnorthsdk.api.ApiManager;
import com.huawei.iotnorthsdk.net.HttpServer;
import com.huawei.iotnorthsdk.net.bean.NotifyBindDevice;
import com.huawei.iotnorthsdk.net.bean.NotifyCommandRsp;
import com.huawei.iotnorthsdk.net.bean.NotifyDeviceAdded;
import com.huawei.iotnorthsdk.net.bean.NotifyDeviceAddedEx;
import com.huawei.iotnorthsdk.net.bean.NotifyDeviceDataChanged;
import com.huawei.iotnorthsdk.net.bean.NotifyDeviceDatasChanged;
import com.huawei.iotnorthsdk.net.bean.NotifyDeviceDeleted;
import com.huawei.iotnorthsdk.net.bean.NotifyDeviceEvent;
import com.huawei.iotnorthsdk.net.bean.NotifyDeviceInfoChanged;
import com.huawei.iotnorthsdk.net.bean.NotifyMessageConfirm;
import com.huawei.iotnorthsdk.net.bean.NotifyRuleEvent;
import com.huawei.iotnorthsdk.net.bean.NotifyServiceInfoChanged;

import java.io.IOException;

public class MyHttpServer extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("123","onBind");
        String myIp = Utils.getIpAddressString();
        HttpServer s = ApiManager.getInstance().initHttpServer(this,null,8743,false,null,null).getHttpServer();
        s.registListener(new HttpServer.HttpServerListener() {
            @Override
            public void onNotifyDeviceAdd(NotifyDeviceAdded msg) {
                Log.i("123","we get notify  msg="+msg);
            }

            @Override
            public void onNotifyDeviceAdd(NotifyDeviceAddedEx msg) {
                Log.i("123","we get notify  msg="+msg);
            }

            @Override
            public void onNotifyDeviceInfoChanged(NotifyDeviceInfoChanged msg) {
                Log.i("123","we get notify  msg="+msg);
            }

            @Override
            public void onNotifyDeviceDataChanged(NotifyDeviceDataChanged msg) {
                Log.i("123","we get notify  msg="+msg);
            }

            @Override
            public void onNotifyDeviceDeletedChanged(NotifyDeviceDeleted msg) {
                Log.i("123","we get notify  msg="+msg);
            }

            @Override
            public void onNotifyMessageConfirm(NotifyMessageConfirm msg) {
                Log.i("123","we get notify  msg="+msg);
            }

            @Override
            public void onNotifyCommandRsp(NotifyCommandRsp msg) {
                Log.i("123","we get notify  msg="+msg);
            }

            @Override
            public void onNotifyDeviceEvent(NotifyDeviceEvent msg) {
                Log.i("123","we get notify  msg="+msg);
            }

            @Override
            public void onNotifyServiceInfoChanged(NotifyServiceInfoChanged msg) {
                Log.i("123","we get notify  msg="+msg);
            }

            @Override
            public void onNotifyRuleEvent(NotifyRuleEvent msg) {
                Log.i("123","we get notify  msg="+msg);
            }

            @Override
            public void onNotifyBindDevice(NotifyBindDevice msg) {
                Log.i("123","we get notify  msg="+msg);
            }

            @Override
            public void onNotifyDeviceDatasChanged(NotifyDeviceDatasChanged msg) {
                Log.i("123","we get notify  msg="+msg);
            }
        });
        try {
            s.start();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i("123","onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        Log.i("123","onDestroy");
        super.onDestroy();
    }

    @Override
    public void onCreate() {
        Log.i("123","onCreate");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }


}
