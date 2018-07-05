package com.howell.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.howell.litenademo.R;
import com.howell.utils.Constant;
import com.huawei.iotplatform.client.NorthApiClient;
import com.huawei.iotplatform.client.NorthApiException;
import com.huawei.iotplatform.client.dto.AuthOutDTO;
import com.huawei.iotplatform.client.dto.ClientInfo;
import com.huawei.iotplatform.client.invokeapi.Authentication;



import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ApiActivity extends AppCompatActivity {

    NorthApiClient mClient = new NorthApiClient();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);
        ButterKnife.bind(this);
        ClientInfo info = new ClientInfo();
        info.setAppId(Constant.APPID);
        info.setSecret(Constant.SECRET);
        info.setPlatformIp(Constant.BASE_IP);
        info.setPlatformPort(Constant.BASE_PORT);
        try {
            mClient.setClientInfo(info);
            mClient.initSSLConfig();
        } catch (NorthApiException e) {
            e.printStackTrace();
        }
    }
    @OnClick(R.id.btn_api_login)
    void login(){
        try {
            Authentication auth = new Authentication(mClient);
            AuthOutDTO res = auth.getAuthToken();
        } catch (NorthApiException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.btn_api_test)
    void test(){
        try {
            initSSL();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnrecoverableKeyException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
    }

    private void initSSL() throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException {

        KeyStore selfCert = KeyStore.getInstance("PKCS12");
        selfCert.load(this.getResources().getAssets().open(Constant.SELFCERTPATH), Constant.SELFCERTPWD.toCharArray());
//        String kmfAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
//        KeyManagerFactory kmf = KeyManagerFactory.getInstance(kmfAlgorithm);
//        kmf.init(keyStore, pwd.toCharArray());
        KeyManagerFactory kmf = KeyManagerFactory.getInstance("x509");
        kmf.init(selfCert, Constant.SELFCERTPWD.toCharArray());

        // 2 Import the CA certificate of the server,
//        KeyStore caCert = KeyStore.getInstance("jks");
//        caCert.load(new FileInputStream(trustcapath), Constant.TRUSTCAPWD.toCharArray());
//        TrustManagerFactory tmf = TrustManagerFactory.getInstance("sunx509");
//        tmf.init(caCert);

        SSLContext sc = SSLContext.getInstance("TLS");
//        sc.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
        sc.init(kmf.getKeyManagers(), null, null);
        // 3 Set the domain name to not verify
        // (Non-commercial IoT platform, no use domain name access generally.)
        SSLConnectionSocketFactory sslsf  = new SSLConnectionSocketFactory(
                sc);

//
        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslsf)
                .build();

//          CloseableHttpClient httpClient = HttpClients.createDefault();

        try {
            Field f = mClient.getClass().getDeclaredField("httpClient");
            Log.i("123","f="+f);
            f.set(mClient,mClient);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }


}
