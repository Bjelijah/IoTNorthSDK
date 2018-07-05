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

public class MainActivity extends AppCompatActivity {

    Button btn,btn2;
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



        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mMgr.init(MainActivity.this,true,Constant.SELFCERTPATH,Constant.SELFCERTPWD,Constant.BASE_URL);
                    mMgr.login(Constant.APPID,Constant.SECRET);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myIp = Utils.getIpAddressString();
                Log.i("123","ip="+myIp);
                mMgr.init(MainActivity.this,false,null,null,"http://"+myIp+":8080");
                mMgr.testNotify();
            }
        });



        Intent intent = new Intent(this, MyHttpServer.class);
        bindService(intent,conn,BIND_AUTO_CREATE);

    }

}
