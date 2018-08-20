package com.howell.action;

import android.content.Context;
import android.util.Log;

import com.howell.utils.Constant;
import com.howell.utils.RxUtil;
import com.huawei.iotplatform.client.NorthApiClient;
import com.huawei.iotplatform.client.NorthApiException;
import com.huawei.iotplatform.client.dto.AuthOutDTO;
import com.huawei.iotplatform.client.dto.AuthRefreshInDTO;
import com.huawei.iotplatform.client.dto.AuthRefreshOutDTO;
import com.huawei.iotplatform.client.dto.ClientInfo;
import com.huawei.iotplatform.client.dto.QueryDataHistoryInDTO;
import com.huawei.iotplatform.client.dto.QueryDataHistoryOutDTO;
import com.huawei.iotplatform.client.dto.QueryDeviceDataOutDTO;
import com.huawei.iotplatform.client.dto.QueryDevicesInDTO;
import com.huawei.iotplatform.client.dto.QueryDevicesOutDTO;
import com.huawei.iotplatform.client.dto.SubscribeInDTO;
import com.huawei.iotplatform.client.invokeapi.Authentication;
import com.huawei.iotplatform.client.invokeapi.DataCollection;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.lang.reflect.Field;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * 根据官方提供 api-client-1.0.0.jar库 测试
 * 已知bug 查询历史返回数据为空
 * {@link <华为北向API SDK说明文档>}
 */
public class ClientApiAction {
    public static ClientApiAction mInstance = null;
    public static ClientApiAction getInstance(){
        if (mInstance==null){
            mInstance = new ClientApiAction();
        }
        return mInstance;
    }
    private ClientApiAction(){}

    NorthApiClient mClient = null;
    String mAccessToken    = null;
    String mRefreshToken   = null;
    String mDeviceid       = null;
    String mGatewayId      = null;

    private void initSSL(Context context,String path,String pwd) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException {

        KeyStore selfCert = KeyStore.getInstance("PKCS12");
        selfCert.load(context.getResources().getAssets().open(path), pwd.toCharArray());
        String kmfAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
        KeyManagerFactory kmf = KeyManagerFactory.getInstance(kmfAlgorithm);
        kmf.init(selfCert, pwd.toCharArray());
        // 2 Import the CA certificate of the server,
//        KeyStore caCert = KeyStore.getInstance("jks");
//        caCert.load(new FileInputStream(trustcapath), Constant.TRUSTCAPWD.toCharArray());
//        TrustManagerFactory tmf = TrustManagerFactory.getInstance("sunx509");
//        tmf.init(caCert);
        SSLContext sc = SSLContext.getInstance("TLS");
        sc.init(kmf.getKeyManagers(), new TrustManager[]{new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {

            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {

            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }}, null);
        // 3 Set the domain name to not verify
        // (Non-commercial IoT platform, no use domain name access generally.)
        SSLConnectionSocketFactory sslsf  = new SSLConnectionSocketFactory(
                sc, new X509HostnameVerifier() {
            @Override
            public boolean verify(String host, SSLSession session) {
                return true;
            }

            @Override
            public void verify(String host, SSLSocket ssl) throws IOException {

            }

            @Override
            public void verify(String host, X509Certificate cert) throws SSLException {

            }

            @Override
            public void verify(String host, String[] cns, String[] subjectAlts) throws SSLException {

            }
        });

        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslsf)
                .build();

        Log.i("123","httpClient="+httpClient.hashCode());
        try {
            Field f = mClient.getClass().getDeclaredField("httpClient");
            f.setAccessible(true);
            Log.i("123","f="+f);
            f.set(mClient,httpClient);
            Log.i("123","objHashCode="+f.get(mClient).hashCode());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void init(Context context, String appId,String secret , String keyPath, String pwd, String ip,String port) throws NorthApiException, CertificateException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IOException {
        mClient = new NorthApiClient();
        ClientInfo info = new ClientInfo();
        info.setAppId(appId);
        info.setSecret(secret);
        info.setPlatformIp(ip);
        info.setPlatformPort(port);
        mClient.setClientInfo(info);
        initSSL(context,keyPath,pwd);
    }


    public void login(){
        RxUtil.doRxTask(new RxUtil.CommonTask<Void>() {
            AuthOutDTO res = null;
            @Override
            public void doInIOThread() {
                try {
                    Authentication auth = new Authentication(mClient);
                    res = auth.getAuthToken();
                } catch (NorthApiException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void doInUIThread() {
                Log.i("123","res="+res);
                mAccessToken  = res.getAccessToken();
                mRefreshToken = res.getRefreshToken();
            }
        });
    }
    public void refreshToken(final String appId,final String secret){
        RxUtil.doRxTask(new RxUtil.CommonTask<Void>() {
            AuthRefreshOutDTO res;
            @Override
            public void doInIOThread() {
                Authentication auth = new Authentication(mClient);
                AuthRefreshInDTO req = new AuthRefreshInDTO();
                req.setAppId(appId);
                req.setRefreshToken(mRefreshToken);
                req.setSecret(secret);
                try {
                    res = auth.refreshAuthToken(req);
                } catch (NorthApiException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void doInUIThread() {
                Log.i("123","res="+res);
            }
        });
    }
    //4.3
    public void queryDevices(){
        RxUtil.doRxTask(new RxUtil.CommonTask<Void>() {
            QueryDevicesOutDTO res;
            @Override
            public void doInIOThread() {
                DataCollection dc = new DataCollection(mClient);
                QueryDevicesInDTO req = new QueryDevicesInDTO();
                req.setPageNo(0);
                try {
                    res = dc.queryDevices(req,null,mAccessToken);
                } catch (NorthApiException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void doInUIThread() {
                Log.i("123","res="+res);
                mDeviceid = res.getDevices().get(0).getDeviceId();
                mGatewayId = res.getDevices().get(0).getGatewayId();
            }
        });
    }

    public void queryDevice(final String appId){
        RxUtil.doRxTask(new RxUtil.CommonTask<Void>() {
            QueryDeviceDataOutDTO res;
            @Override
            public void doInIOThread() {
                DataCollection dc = new DataCollection(mClient);
                try {
                    res = dc.queryDeviceData(mDeviceid,appId,mAccessToken);
                } catch (NorthApiException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void doInUIThread() {
                Log.i("123","res="+res);
            }
        });
    }

    public void queryDeviceHistory(final String appId){
        RxUtil.doRxTask(new RxUtil.CommonTask<Void>() {
            QueryDataHistoryOutDTO res;
            @Override
            public void doInIOThread() {
                DataCollection dc = new DataCollection(mClient);
                QueryDataHistoryInDTO req = new QueryDataHistoryInDTO();
                req.setGatewayId(mGatewayId);
                req.setPageNo(0);
                try {
                    res = dc.queryDataHistory(req,appId,mAccessToken);
                } catch (NorthApiException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void doInUIThread() {
                Log.i("123","res="+res);
            }
        });
    }
    public void subscribeNotify(final String type,final String url){
        RxUtil.doRxTask(new RxUtil.CommonTask<Void>() {
            @Override
            public void doInIOThread() {
                DataCollection dc = new DataCollection(mClient);
                SubscribeInDTO req = new SubscribeInDTO();
                req.setNotifyType(type);
                req.setCallbackurl(url);
                try {
                    dc.subscribeNotify(req,mAccessToken);
                } catch (NorthApiException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void doInUIThread() {

            }
        });
    }

}
