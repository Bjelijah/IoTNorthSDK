package com.huawei.iotnorthsdk.net.utils;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.OkHttpClient;

public class SSLConection {
	private static final String TAG = SSLConection.class.getName();
	private static TrustManager[] trustManagers;
	private static SSLContext mSSLContext=null;
	private static OkHttpClient.Builder okHttpClientBuilder = null;
	public static class _FakeX509TrustManager implements X509TrustManager {
		private static final X509Certificate[] _AcceptedIssuers = new X509Certificate[]{};
		@Override
		public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {

			if(null != chain){
				for(int k=0; k < chain.length; k++){
					X509Certificate cer = chain[k];
					print(cer);
				}
			}
		}

		@Override
		public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			// TODO Auto-generated method stub
			if(null != chain){
				for(int k=0; k < chain.length; k++){
					X509Certificate cer = chain[k];
					print(cer);
				}
			}
		}

		public boolean isClientTrusted(X509Certificate[] chain) {
			return true;
		}

		public boolean isServerTrusted(X509Certificate[] chain) {
			return true;
		}

		@Override
		public X509Certificate[] getAcceptedIssuers() {
			// TODO Auto-generated method stub
			return _AcceptedIssuers;
		}

		private void print(X509Certificate cer){

			int version = cer.getVersion();
			String sinname = cer.getSigAlgName();
			String type = cer.getType();
			String algorname = cer.getPublicKey().getAlgorithm();
			BigInteger serialnum = cer.getSerialNumber();
			Principal principal = cer.getIssuerDN();
			String principalname = principal.getName();
			Log.i(TAG,"[print]: "+"version="+version+", sinname="+sinname+", type="+type+", algorname="+algorname+", serialnum="+serialnum+", principalname="+principalname);

		}

	}

	private static SSLContext contextSSL(Context context) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException {
		if(trustManagers == null){
			trustManagers = new TrustManager[]{new _FakeX509TrustManager()};
		}
		KeyStore keyStore = KeyStore.getInstance("PKCS12");
		keyStore.load(context.getResources().getAssets().open(Constant.SELFCERTPATH),
				Constant.SELFCERTPWD.toCharArray());
		String kmfAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(kmfAlgorithm);
		kmf.init(keyStore, Constant.SELFCERTPWD.toCharArray());
		SSLContext sslContext = SSLContext.getInstance("TLS");
		sslContext.init(kmf.getKeyManagers(), trustManagers, new SecureRandom());
		return sslContext;
	}

	private static SSLContext contextSSL(Context context,String keyPath,String pwd) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException {
		if(trustManagers == null){
			trustManagers = new TrustManager[]{new _FakeX509TrustManager()};
		}
		KeyStore keyStore = KeyStore.getInstance("PKCS12");
		keyStore.load(context.getResources().getAssets().open(keyPath),
				pwd.toCharArray());
		String kmfAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(kmfAlgorithm);
		kmf.init(keyStore, pwd.toCharArray());
		SSLContext sslContext = SSLContext.getInstance("TLS");
		sslContext.init(kmf.getKeyManagers(), trustManagers, new SecureRandom());
		return sslContext;
	}

	public static OkHttpClient.Builder getOKSSLBuild(Context context) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException {
		if (mSSLContext==null) mSSLContext = contextSSL(context);
		return new OkHttpClient.Builder()
				.sslSocketFactory(mSSLContext.getSocketFactory(),new _FakeX509TrustManager())
				.hostnameVerifier(new HostnameVerifier() {
					@Override
					public boolean verify(String hostname, SSLSession session) {
						return true;
					}
				});
	}

	public static OkHttpClient.Builder getOKSSLBuild(Context context,String keyPath,String pwd) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException {
		if (mSSLContext==null) mSSLContext = contextSSL(context,keyPath,pwd);
		return new OkHttpClient.Builder()
				.sslSocketFactory(mSSLContext.getSocketFactory(),new _FakeX509TrustManager())
				.hostnameVerifier(new HostnameVerifier() {
					@Override
					public boolean verify(String hostname, SSLSession session) {
						return true;
					}
				});
	}

	public static void allowSSL(Context context) throws CertificateException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IOException {
		if (mSSLContext==null) mSSLContext = contextSSL(context);
		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
			@Override
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		});
		HttpsURLConnection.setDefaultSSLSocketFactory(mSSLContext.getSocketFactory());

	}


}
