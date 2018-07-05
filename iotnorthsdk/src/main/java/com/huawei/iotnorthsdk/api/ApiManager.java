package com.huawei.iotnorthsdk.api;

import android.content.Context;
import android.support.annotation.Nullable;

import com.huawei.iotnorthsdk.net.HttpServer;
import com.huawei.iotnorthsdk.net.utils.CustomInterceptor;
import com.huawei.iotnorthsdk.net.utils.NullOnEmptyConverterFactory;
import com.huawei.iotnorthsdk.net.utils.SSLConection;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;

import fi.iki.elonen.NanoHTTPD;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiManager {
    private static volatile ApiManager mInstance;
    public static ApiManager getInstance(){
        if (null==mInstance){
            synchronized (ApiManager.class){
                if (null==mInstance){
                    mInstance = new ApiManager();
                }
            }
        }
        return mInstance;
    }
    private ApiManager(){}
    private OkHttpClient mClient=null;
    private HWIoTApi     mHWHttpApi=null;
    private HttpServer   mHttpServer=null;
    public ApiManager initHttpClient(Context context, boolean isSSL, @Nullable String keyPath,@Nullable String pwd){

        try {
            mClient = (isSSL? SSLConection.getOKSSLBuild(context,keyPath,pwd):new OkHttpClient.Builder())
                    .addInterceptor(new CustomInterceptor())
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(10,TimeUnit.SECONDS)
                    .build();
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



        return this;
    }

    public HWIoTApi getHWHttpClient(String url){
        Retrofit retrofit = new Retrofit.Builder()
                .client(mClient)
                .baseUrl(url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(new NullOnEmptyConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mHWHttpApi = retrofit.create(HWIoTApi.class);
        return mHWHttpApi;
    }
    public HWIoTApi getHWHttpClient(){
        if (mHWHttpApi==null) throw new NullPointerException();
        return mHWHttpApi;
    }

    public  ApiManager initHttpServer(Context context,String hostname,int port,boolean isSSL,@Nullable String keyPath,@Nullable String pwd){
        if (hostname!=null) {
            mHttpServer = new HttpServer(hostname, port);
        }else{
            mHttpServer = new HttpServer(port);
        }
//        mHttpServer = new HttpServer(port);
        if (isSSL){
            try {
                mHttpServer.makeSecure(NanoHTTPD.makeSSLSocketFactory(keyPath,pwd.toCharArray()),null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return this;
    }

    public HttpServer getHttpServer() {
        if (mHttpServer==null)throw new NullPointerException();
        return mHttpServer;
    }
}
