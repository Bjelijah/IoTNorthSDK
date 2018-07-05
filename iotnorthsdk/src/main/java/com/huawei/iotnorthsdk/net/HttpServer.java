package com.huawei.iotnorthsdk.net;

import android.util.ArraySet;
import android.util.Log;

import com.google.gson.Gson;
import com.huawei.iotnorthsdk.net.bean.NotifyBase;
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
import com.huawei.iotnorthsdk.net.bean.NotifyType;
import com.huawei.iotnorthsdk.net.bean.NotifyUri;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.security.auth.login.LoginException;

import fi.iki.elonen.NanoHTTPD;


public class HttpServer extends NanoHTTPD {
    private static final String TAG = HttpServer.class.getName();
    public enum Status implements NanoHTTPD.Response.IStatus{
        SWITCH_PROTOCOL(101, "Switching Protocols"),
        NOT_USE_POST(700, "not use post");

        private final int requestStatus;
        private final String description;

        Status(int requestStatus, String description) {
            this.requestStatus = requestStatus;
            this.description = description;
        }


        @Override
        public String getDescription() {
            return null;
        }

        @Override
        public int getRequestStatus() {
            return 0;
        }
    }

    public interface HttpServerListener{
        void onNotifyDeviceAdd(NotifyDeviceAdded msg);
        void onNotifyDeviceAdd(NotifyDeviceAddedEx msg);
        void onNotifyDeviceInfoChanged(NotifyDeviceInfoChanged msg);
        void onNotifyDeviceDataChanged(NotifyDeviceDataChanged msg);
        void onNotifyDeviceDeletedChanged(NotifyDeviceDeleted msg);
        void onNotifyMessageConfirm(NotifyMessageConfirm msg);
        void onNotifyCommandRsp(NotifyCommandRsp msg);
        void onNotifyDeviceEvent(NotifyDeviceEvent msg);
        void onNotifyServiceInfoChanged(NotifyServiceInfoChanged msg);
        void onNotifyRuleEvent(NotifyRuleEvent msg);
        void onNotifyBindDevice(NotifyBindDevice msg);
        void onNotifyDeviceDatasChanged(NotifyDeviceDatasChanged msg);
    }


    private HashSet<HttpServerListener> mListeners = new HashSet<>();

    public HttpServer registListener(HttpServerListener l){
        mListeners.add(l);
        return this;
    }

    public HttpServer unRegistListener(HttpServerListener l){
        mListeners.remove(l);
        return this;
    }

    private void sendNotifyDeviceAdd(NotifyDeviceAdded msg){
        for (HttpServerListener l:mListeners){
            l.onNotifyDeviceAdd(msg);
        }
    }

    private void sendNotifyDeviceAdd(NotifyDeviceAddedEx msg){
        for (HttpServerListener l:mListeners){
            l.onNotifyDeviceAdd(msg);
        }
    }

    private void sendNotifyDeviceInfoChanged(NotifyDeviceInfoChanged msg){
        for (HttpServerListener l:mListeners){
            l.onNotifyDeviceInfoChanged(msg);
        }
    }

    private void sendNotifyDeviceDataChanged(NotifyDeviceDataChanged msg){
        for (HttpServerListener l:mListeners){
            l.onNotifyDeviceDataChanged(msg);
        }
    }

    private void sendNotifyDeviceDeletedChanged(NotifyDeviceDeleted msg){
        for (HttpServerListener l:mListeners){
            l.onNotifyDeviceDeletedChanged(msg);
        }
    }

    private void sendNotifyMessageConfirm(NotifyMessageConfirm msg){
        for (HttpServerListener l:mListeners){
            l.onNotifyMessageConfirm(msg);
        }
    }

    private void sendNotifyCommandRsp(NotifyCommandRsp msg){
        for (HttpServerListener l:mListeners){
            l.onNotifyCommandRsp(msg);
        }
    }

    private void sendNotifyDeviceEvent(NotifyDeviceEvent msg){
        for (HttpServerListener l:mListeners){
            l.onNotifyDeviceEvent(msg);
        }
    }

    private void sendServerInfoChanged(NotifyServiceInfoChanged msg){
        for (HttpServerListener l:mListeners){
            l.onNotifyServiceInfoChanged(msg);
        }
    }

    private void sendRuleEvent(NotifyRuleEvent msg){
        for (HttpServerListener l:mListeners){
            l.onNotifyRuleEvent(msg);
        }
    }

    private void sendBindDevice(NotifyBindDevice msg){
        for (HttpServerListener l:mListeners){
            l.onNotifyBindDevice(msg);
        }
    }

    private void sendDeviceDatasChanged(NotifyDeviceDatasChanged msg){
        for (HttpServerListener l:mListeners){
            l.onNotifyDeviceDatasChanged(msg);
        }
    }


    public HttpServer(int port) {
        super(port);
    }

    public HttpServer(String hostname, int port) {
        super(hostname, port);
    }



    @Override
    public Response serve(IHTTPSession session) {
        Log.i(TAG,"serve         session= "+session.getMethod()+" "+session.getHeaders()+"   "+session.getQueryParameterString());
        Log.i(TAG,"uri="+session.getUri());
        if (Method.POST.equals(session.getMethod())){
            Map<String, String> files = new HashMap<String, String>();
            /*获取header信息，NanoHttp的header不仅仅是HTTP的header，还包括其他信息。*/
            Map<String, String> header = session.getHeaders();
            String uri = session.getUri();
            Log.i(TAG,"header : " + header);
            try {

                /*这句尤为重要就是将将body的数据写入files中，大家可以看看parseBody具体实现，倒现在我也不明白为啥这样写。*/
                session.parseBody(files);
                String jsonStr = files.get("postData");
                Log.i(TAG,"json="+jsonStr);
                handleMsg(uri,jsonStr);





                /*看就是这里，POST请教的body数据可以完整读出*/
//                String body = session.getQueryParameterString();

//                Log.i("123","body : " + body);
                /*这里是从header里面获取客户端的IP地址。NanoHttpd的header包含的东西不止是HTTP heaer的内容*/


            } catch (IOException e) {
                e.printStackTrace();
            } catch (ResponseException e) {
                e.printStackTrace();
            }
            /*这里就是为客户端返回的信息了。我这里返回了一个200和一个HelloWorld*/
            return newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/html", "HelloWorld");
        }else {
            return newFixedLengthResponse(Status.NOT_USE_POST, "text/html", "use post");
        }

    }

    private void handleMsg(String uri,String jsonStr){
        Gson gson = new Gson();
        switch (uri){
            case "/"+NotifyUri.DEVICE_ADDED_DIRECT_URI:
                Log.e(TAG,"DEVICE_ADDED_DIRECT");
                sendNotifyDeviceAdd(gson.fromJson(jsonStr,NotifyDeviceAdded.class));
                break;
            case "/"+NotifyUri.DEVICE_ADDED_INDIRECT_URI:
                Log.e(TAG,"DEVICE_ADDED_INDIRECT");
                sendNotifyDeviceAdd(gson.fromJson(jsonStr,NotifyDeviceAddedEx.class));
                break;
            case "/"+NotifyUri.DEVICE_INFO_CHANGED_URI:
                Log.e(TAG,"DEVICE_INFO_CHANGED");
                sendNotifyDeviceInfoChanged(gson.fromJson(jsonStr,NotifyDeviceInfoChanged.class));
                break;
            case "/"+NotifyUri.DEVICE_DATA_CHANGED_URI:
                Log.e(TAG,"DEVICE_DATA_CHANGED");
                sendNotifyDeviceDataChanged(gson.fromJson(jsonStr,NotifyDeviceDataChanged.class));
                break;
            case "/"+NotifyUri.DEVICE_DELETED_URI:
                Log.e(TAG,"DEVICE_DELETED");
                sendNotifyDeviceDeletedChanged(gson.fromJson(jsonStr,NotifyDeviceDeleted.class));
                break;
            case "/"+NotifyUri.DEVICE_EVENT_URI:
                Log.e(TAG,"DEVICE_EVENT");
                sendNotifyDeviceEvent(gson.fromJson(jsonStr,NotifyDeviceEvent.class));
                break;
            case "/"+NotifyUri.MESSAGE_CONFIRM_URI:
                Log.e(TAG,"MESSAGE_CONFIRM");
                sendNotifyMessageConfirm(gson.fromJson(jsonStr,NotifyMessageConfirm.class));
                break;
            case "/"+NotifyUri.COMMAND_RSP_URI:
                Log.e(TAG,"COMMAND_RSP");
                sendNotifyCommandRsp(gson.fromJson(jsonStr,NotifyCommandRsp.class));
                break;
            case "/"+NotifyUri.SERVICE_INFO_CHANGED_URI:
                Log.e(TAG,"SERVICE_INFO_CHANGED");
                sendServerInfoChanged(gson.fromJson(jsonStr,NotifyServiceInfoChanged.class));
                break;
            case "/"+NotifyUri.RULE_EVENT_URI:
                Log.e(TAG,"RULE_EVENT");
                sendRuleEvent(gson.fromJson(jsonStr,NotifyRuleEvent.class));
                break;
            case "/"+NotifyUri.BIND_DEVICE_URI:
                Log.e(TAG,"BIND_DEVICE");
                sendBindDevice(gson.fromJson(jsonStr,NotifyBindDevice.class));
                break;
            case "/"+NotifyUri.DEVICE_DATAS_CHANGED_URI:
                Log.e(TAG,"DEVICE_DATAS_CHANGED");
                sendDeviceDatasChanged(gson.fromJson(jsonStr,NotifyDeviceDatasChanged.class));
                break;
                default:
                Log.e(TAG,"error");
                    break;
        }


    }
}
