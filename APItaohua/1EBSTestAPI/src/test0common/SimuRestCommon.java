package test0common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

//HttpClient:HttpClient是个很不错的开源框架，封装了访问http的请求头，参数，内容体，响应等等。 
//URLConnection:  HttpURLConnection是java的标准类，什么都没封装，用起来太原始，不方便。

//SOAP webService:SOAP协议属于复杂的、重量级的协议，
//RESTful webService:REST是一种轻量级的Web Service架构风格，其实现和操作比SOAP和XML-RPC更为简洁，可以完全通过HTTP协议实现，还可以利用缓存Cache来提高响应速度，性能、效率和易用性上都优于SOAP协议。 RESTful = Post + Get + Delete + Put

//PostMethod:POST把提交的数据则放置在是HTTP包的包体中。理论上POST没有限制，可传较大量的数据，
//GetMethod:GET请求的数据会附在URL之后（就是把数据放置在HTTP协议头中），以?分割URL和传输数据，参数之间以&相连，如：login.action?name=hyddd&password=idontknow&verify=%E4%BD%A0%E5%A5%BD。GET方式提交的数据最多只能是1024字节，

public class SimuRestCommon extends Simu {
	// 测试员姓名
	public String testerName;

	// 测试场次
	public String testId;

	public String sendPost(String url, String param) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(param);
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e1) {
			System.out.println("发送 POST请求出现异常！" + e1);
			e1.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	public String sendGet(String url, String param) {
		String result = "";
		BufferedReader in = null;
		try {
			URL realUrl = new URL(url + "?" + param);
			//this.print("入:" + realUrl);
			URLConnection connection = realUrl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 建立实际的连接
			connection.connect();
			// 定义 BufferedReader输入流来读取URL的响应
			InputStream is = connection.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			in = new BufferedReader(ir);
			// in = new BufferedReader(new
			// InputStreamReader(connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e1) {
			System.out.println("发送Get请求出现异常！" + e1);
			e1.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return this.getJsonValue(result, "ENCMSG");
	}


}
