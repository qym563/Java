package test0common;

import com.dtdream.dtp.apirunner.ApiRunner;

import com.dtdream.dtp.apirunner.common.DtConstants;
import com.dtdream.dtp.apirunner.common.DtParaType;
import com.dtdream.dtp.apirunner.internal.DtApiRequest;
import com.dtdream.dtp.apirunner.internal.DtApiResponse;
import com.dtdream.dtp.apirunner.internal.DtApiRunner;

import java.text.SimpleDateFormat;
import java.util.*;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dtdream.uim.utils.SignatureHelper;
import com.taobao.api.ApiException;

//HttpClient:HttpClient是个很不错的开源框架，封装了访问http的请求头，参数，内容体，响应等等。 
//URLConnection:  HttpURLConnection是java的标准类，什么都没封装，用起来太原始，不方便。

//SOAP webService:SOAP协议属于复杂的、重量级的协议，
//RESTful webService:REST是一种轻量级的Web Service架构风格，其实现和操作比SOAP和XML-RPC更为简洁，可以完全通过HTTP协议实现，还可以利用缓存Cache来提高响应速度，性能、效率和易用性上都优于SOAP协议。 RESTful = Post + Get + Delete + Put

//PostMethod:POST把提交的数据则放置在是HTTP包的包体中。理论上POST没有限制，可传较大量的数据，
//GetMethod:GET请求的数据会附在URL之后（就是把数据放置在HTTP协议头中），以?分割URL和传输数据，参数之间以&相连，如：login.action?name=hyddd&password=idontknow&verify=%E4%BD%A0%E5%A5%BD。GET方式提交的数据最多只能是1024字节，

public class ApiRunnerCommon extends Simu {
	
		// 记录日志
		//protected org.slf4j.Logger logger = CaseLogger.getLogger(this.getClass());
	
	   public String send(String url, String httpMethod, String jsonStr,  
			                   String contentType,
			                   String accept) throws Exception {

		   String AUTHORIZEPRIEFIX = "DXT ";
		   String DXTACCESSSECRET = "dxtsecret";
		   String APPNAME = "DXT";
		   String USER = "admin";

		   // 1 define
		    ApiRunner api = new DtApiRunner(url);
		    DtApiRequest request = new DtApiRequest();
			DtApiResponse response = new DtApiResponse();

		   if (null == api) {
			   return null;
		   }

			// 2 method & result
			request.setHttpMethod(httpMethod);
		   request.addHttpHeader("Content-Type", contentType);
		   request.addHttpHeader("Accept", accept);

		   String dateStr=getDateString();

		   Map<String,String> headerMap=(new HashMap<String,String>());

		   headerMap.put("Content-Type",contentType);
		   headerMap.put("Date",dateStr);

		   String signature = SignatureHelper.simpleSignRequest(
				   request.getHttpMethod(),
				   headerMap,
				   DXTACCESSSECRET
		   );

		   String authStr=AUTHORIZEPRIEFIX+APPNAME+":"+USER+":"+signature;

		   //auth header
		   request.addHttpHeader("Authorization",authStr);
		   request.addHttpHeader("Date",dateStr);

		   if (jsonStr != "") {
			   if (httpMethod.equals(DtConstants.HTTP_REQ_METHOD_POST ) || httpMethod.equals(DtConstants.HTTP_REQ_METHOD_PUT)) {
				   request.addCustomRequestData("application/json", jsonStr);
			   } else {
				   JSONObject jsonObject = JSON.parseObject(jsonStr);
				   for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
					   request.addCustomPara(entry.getKey(), entry.getValue().toString(), DtParaType.STRING, DtConstants.URL_PARA);
				   }
			   }
		   }

		   // 4 execute
		   try {
			   api.execute(request,response);
			   request.printRequest();
		   } catch (ApiException e){
			   e.printStackTrace();
		   }

		   return response.getResponseContent();
	   }

	private static String getDateString(){

		Calendar cd = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("EEE d MMM yyyy HH:mm:ss 'GMT'", Locale.US);

		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		String date = sdf.format(cd.getTime());

		return date;
	}
}
