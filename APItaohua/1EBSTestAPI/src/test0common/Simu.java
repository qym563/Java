package test0common;

import java.io.IOException;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.codec.binary.Base64;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.UnsupportedEncodingException;   

//HttpClient:HttpClient是个很不错的开源框架，封装了访问http的请求头，参数，内容体，响应等等。 
//URLConnection:  HttpURLConnection是java的标准类，什么都没封装，用起来太原始，不方便。

//SOAP webService:SOAP协议属于复杂的、重量级的协议，
//RESTful webService:REST是一种轻量级的Web Service架构风格，其实现和操作比SOAP和XML-RPC更为简洁，可以完全通过HTTP协议实现，还可以利用缓存Cache来提高响应速度，性能、效率和易用性上都优于SOAP协议。 RESTful = Post + Get + Delete + Put

//PostMethod:POST把提交的数据则放置在是HTTP包的包体中。理论上POST没有限制，可传较大量的数据，
//GetMethod:GET请求的数据会附在URL之后（就是把数据放置在HTTP协议头中），以?分割URL和传输数据，参数之间以&相连，如：login.action?name=hyddd&password=idontknow&verify=%E4%BD%A0%E5%A5%BD。GET方式提交的数据最多只能是1024字节，

public class Simu{
	//加密
	public String encode(String str) {
		String str2 = this.encodeDirectely(str);
		return str2.replace("+", "_");
	}
	
	//直接加密	
	public String encodeDirectely(String str) {
		String str2 = null;
		byte[] encodeBase64;
		try {
			encodeBase64 = Base64.encodeBase64(str.getBytes("GBK"));
			str2 = new String(encodeBase64, "GBK");
			str2 = str2.replaceAll("\r", "");
			str2 = str2.replaceAll("\n", "");
			str2 = str2.replaceAll("\r\n", "");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str2;
	}

	//解密
	public String decode(String str) {
		String str2 = str.replace("_", "+");
		return this.decodeDirectely(str2);
	}

	//直接解密
	public String decodeDirectely(String str){
		String str2 = null;
		byte[] decodeBase64;
		try {
			decodeBase64 = Base64.decodeBase64(str.getBytes("GBK"));
			str2 = new String(decodeBase64,"GBK");
			str2 = str2.replaceAll("\r", "");
			str2 = str2.replaceAll("\n", "");
			str2 = str2.replaceAll("\r\n", "");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str2;		
	}

	//访问被测系统的mysql数据库
	public ResultSet selectBySqlUseMySql(String sql) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myxxfp2", "root", "root");
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		return rs;
	}

	//访问被测系统的mysql数据库
	public boolean executeBySqlUseMySql(String sql) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myxxfp2", "root", "root");
		Statement stm = con.createStatement();
		return stm.execute(sql);
	}
	
	//访问被测系统的SQLite数据库
	public ResultSet selectBySqlUseSQLite(String strSql) {
		ResultSet rs = null;
		{
			try { // 连接SQLite的JDBC
				Class.forName("org.sqlite.JDBC"); // 建立一个数据库名zieckey.db的连接，如果不存在就在当前目录下创建之
				Connection conn = DriverManager.getConnection("jdbc:sqlite:CNPCGrabber.db");
				Statement stat = conn.createStatement();
				rs = stat.executeQuery("select * from FPKJ;");
				while (rs.next()) { // 将查询到的数据打印出来
					System.out.print("name = " + rs.getString("name") + " ");
					System.out.println("salary = " + rs.getString("salary"));
				}
				rs.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rs;
	}

	//写log
	public void log(String testNumber) {
		System.out.println("祝贺你! " + testNumber + " 测完了!");
	}

	//输出
	public void print(String message) {
		System.out.println(message);
	}
	
	//解析Xml
	public String[] getXmlValuesFromFile(String fileName, String[] fieldNames) throws SAXException, IOException, ParserConfigurationException {
		String[] result = new String[fieldNames.length];
		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = db.parse(fileName);// 传入文件名可以是相对路径也可以是绝对路径
		for(int i = 0; i< fieldNames.length; i++) {
			result[i] = doc.getElementsByTagName(fieldNames[i]).item(0).getTextContent();
		}
		return result;
	}

	//解析Xml
	public String[] getXmlValues(String xmlStr, String[] fieldNames) throws SAXException, IOException, ParserConfigurationException {
		String[] result = new String[fieldNames.length];
		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		InputSource is = new InputSource(new StringReader(xmlStr));
		Document doc = db.parse(is);
		for(int i =0; i< fieldNames.length; i++) {
			result[i] = doc.getElementsByTagName(fieldNames[i]).item(0).getTextContent();
		}
		return result;
	}
	
	//解析Xml
	public String getXmlValue(String xmlStr, String fieldName) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		InputSource is = new InputSource(new StringReader(xmlStr));
		Document doc = db.parse(is);// 传入文件名可以是相对路径也可以是绝对路径
		//NodeList nodeList = doc.getElementsByTagName(fieldName);
		String str = doc.getElementsByTagName(fieldName).item(0).getTextContent();
		return str;
	}
	
	//解析Json
	public String getJsonValue(String jsonStr, String keyName) {
		JSONObject obj = JSONObject.fromObject(jsonStr);
		return obj.getString(keyName);
	}
	
	//解析Json
	public JSONArray getJsonArray(String jsonStr) {
		return JSONArray.fromObject(jsonStr);
	}
	
	//解析Json
	public String[] getJsonValues(String jsonStr, String[] keyNames) {
		String[] result = new String[keyNames.length];
		JSONObject obj = JSONObject.fromObject(jsonStr);
		for(int i=0; i< keyNames.length; i++) {
			result[i] = obj.getString(keyNames[i]);
		}
		return result;
	}

}
