package com.howell.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.howell.action.ClientApiAction;
import com.howell.litenademo.R;
import com.howell.utils.Constant;
import com.huawei.iotnorthsdk.net.bean.NotifyType;
import com.huawei.iotnorthsdk.net.bean.NotifyUri;
import com.huawei.iotplatform.client.NorthApiException;


import org.apache.http.entity.StringEntity;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ApiActivity extends AppCompatActivity {

    ClientApiAction mAction = ClientApiAction.getInstance();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);
        ButterKnife.bind(this);

        try {
            mAction.init(this,Constant.APPID,Constant.SECRET,Constant.SELFCERTPATH,Constant.SELFCERTPWD,Constant.BASE_IP,Constant.BASE_PORT);
        } catch (NorthApiException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (UnrecoverableKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @OnClick(R.id.btn_api_login)
    void login(){
        mAction.login();
    }

    @OnClick(R.id.btn_api_query)
    void query(){
        mAction.queryDevices();
    }

    @OnClick(R.id.btn_api_test)
    void test(){
        mAction.refreshToken(Constant.APPID,Constant.SECRET);
//        injectTest();

//        mAction.queryDevices();
//        mAction.queryDevice(Constant.APPID);
//        mAction.queryDeviceHistory(Constant.APPID);
//        mAction.subscribeNotify(NotifyType.DEVICE_ADDED.toString(),"http://192.168.18.169:8080");

    }

    private void injectTest(){
        Constructor<?>[] cs = StringEntity.class.getDeclaredConstructors();
        Log.i("123","c.size="+cs.length);
        for (Constructor c:cs){
            Log.i("123","c name="+c.getName());
        }




    }





}
