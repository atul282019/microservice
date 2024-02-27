/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.npci.client;

import java.net.InetAddress;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import com.gov.nha.bis.security.exception.BisException;


public class HttpClient {
	private static final Log logger = LogFactory.getLog(HttpClient.class);

	public static String post(String url, String data, String reqMedium, String accessToken) throws BisException {
		String responseBody = "";
        try {
            HttpPost httppost = new HttpPost(url);
    		org.apache.http.client.HttpClient httpclient = new DefaultHttpClient();
//     		int timeout = 30; // seconds
//    		HttpParams httpParams = httpclient.getParams();
//    		httpParams.setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, timeout * 1000);
//    		httpParams.setParameter(CoreConnectionPNames.SO_TIMEOUT, timeout * 1000);
//   
			httpclient.getParams().setParameter("http.socket.timeout", new Integer(30*1000));
    		httppost.setEntity(new StringEntity(data, "UTF-8"));
    		httppost.addHeader("REMOTE_ADDR", InetAddress.getLocalHost().getHostAddress());
    			
    		if(accessToken!=null){
    			httppost.addHeader("Authorization", "Bearer "+accessToken);
    		}
    		if(reqMedium != null) {
    			httppost.addHeader("REQUEST_MEDIUM",reqMedium.toString());
    		}
    		httppost.setHeader("Content-type", "application/xml");
			// Create a response handler and print the response
	        ResponseHandler<String> responseHandler = new BasicResponseHandler();
	        
	        responseBody = httpclient.execute(httppost, responseHandler);
		} catch (Exception e) {
			logger.error("Error while executing HTTP POST to URL:'" + url + "'", e);
			throw new BisException("Error while executing HTTP POST to URL:'" + url + "'", e);
		}
     
		return responseBody;
	}
	
}
