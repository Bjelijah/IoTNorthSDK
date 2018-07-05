package com.howell.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.howell.action.ClientManager;
import com.howell.litenademo.R;
import com.howell.server.MyHttpServer;
import com.howell.utils.Constant;
import com.howell.utils.Utils;

import org.json.JSONException;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    ClientManager mMgr = ClientManager.getInstance();
    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        Intent intent = new Intent(this, MyHttpServer.class);
        bindService(intent,conn,BIND_AUTO_CREATE);

    }

    @OnClick(R.id.btn_login)
    void login(){
        mMgr.init(MainActivity.this,true,Constant.SELFCERTPATH,Constant.SELFCERTPWD,Constant.BASE_URL);
        mMgr.login(Constant.APPID,Constant.SECRET);
    }
    @OnClick(R.id.btn_query)
    void query(){
        mMgr.queryDevices(Constant.APPID);
    }

    @OnClick(R.id.btn_send)
    void sendTestMsg(){
        String myIp = Utils.getIpAddressString();
        mMgr.init(MainActivity.this,false,null,null,"http://"+myIp+":8080");
        mMgr.testNotify();
    }

    @OnClick(R.id.btn_scribe)
    void scribe(){
        mMgr.subcribeNotify(Constant.APPID);
    }

    @OnClick(R.id.btn_discovery)
    void discovery(){
        try {
            mMgr.discoveryDevice(Constant.APPID);
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }


    @OnClick(R.id.btn_test)
    void test(){
//        mMgr.queryDeviceStatus(Constant.APPID);
//        mMgr.queryDevice(Constant.APPID);
//        mMgr.queryHistory(Constant.APPID);
//        mMgr.queryCapability(Constant.APPID);
        mMgr.queryDeviceCmd(Constant.APPID);
    }

    @OnClick(R.id.btn_next)
    void nextPage(){
        startActivity(new Intent(this,ApiActivity.class));
    }

}
