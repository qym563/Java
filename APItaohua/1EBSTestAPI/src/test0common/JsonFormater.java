package test0common;
  
public class JsonFormater {
  
  public static String format(String str) throws Exception {
    
	  //json 字符串
      int level = 0;
      //存放格式化的json字符串
      StringBuffer jsonForMatStr = new StringBuffer();
      for(int index=0; index<str.length();index++)//将字符串中的字符逐个按行输出
      {
          //获取s中的每个字符
          char c = str.charAt(index);
          //System.out.println(s.charAt(index));
           
          //level大于0并且jsonForMatStr中的最后一个字符为\n,jsonForMatStr加入\t
          if (level > 0 && '\n' == jsonForMatStr.charAt(jsonForMatStr.length() - 1)) {
              jsonForMatStr.append(getLevelStr(level));
              //System.out.println("123"+jsonForMatStr);
          }
          //遇到"{"和"["要增加空格和换行，遇到"}"和"]"要减少空格，以对应，遇到","要换行
          switch (c) {
          case '{':
          case '[':
              jsonForMatStr.append(c + "\n");
              level++;
              break;
          case ',':
              jsonForMatStr.append(c + "\n");            
              break;
          case '}':
          case ']':
              jsonForMatStr.append("\n");
              level--;
              jsonForMatStr.append(getLevelStr(level));
              jsonForMatStr.append(c);
              break;
          default:
              jsonForMatStr.append(c);
              break;
          }
      }
      return jsonForMatStr.toString();
  }
  
  private static String getLevelStr(int level) {
      StringBuffer levelStr = new StringBuffer();
      for (int levelI = 0; levelI < level; levelI++) {
          levelStr.append("\t");
      }
      return levelStr.toString();
  }
  
  public static void main(String[] args) throws Exception {
    //String str = "<RequestData><HeadData><UserCode>sh1_admin</UserCode><UserName>sh1_admin</UserName><UserCompanyCode>3107</UserCompanyCode><UserCompanyName>上海分公司一部</UserCompanyName><RequestType>03</RequestType></HeadData><BodyData><ReportId>113100000033</ReportId><Insurant>a5rfg87</Insurant><NumberPlate>沪E78612</NumberPlate><EngineModel></EngineModel><CarVin></CarVin><AccidentDate>2011-02-25 15:07:00</AccidentDate><ReportDate>2011-02-25 15:07:00</ReportDate><Province>310000</Province><City>310100</City><District></District><AccidentPlace>1</AccidentPlace><AccidentLongitude></AccidentLongitude><AccidentLatitude></AccidentLatitude><SurveyLongitude></SurveyLongitude><SurveyLatitude></SurveyLatitude><SceneReportFlag></SceneReportFlag><Reporter></Reporter><ReporterTel></ReporterTel><SurveyPlace></SurveyPlace><OperatorId>3525</OperatorId><OperatorName>sh_admin</OperatorName><ReportDealId>30000800</ReportDealId><ReportDealName>江苏分公司</ReportDealName><CompanyName></CompanyName><CustomerTypeCode></CustomerTypeCode><ForcePolicyId>a5rfg87a5rfg87a5rfg87</ForcePolicyId><BizPolicyId></BizPolicyId><Index>0</Index><FieldName>5</FieldName></BodyData></RequestData>";
    String str = "{\"code\":10000,\"msg\":null,\"data\":{\"id\":\"7aa0eb56-1026-4497-a42e-4c39f5e3dcf1\",\"topicId\":\"0876ab84-a478-417b-91bc-849843c191a5\",\"title\":null,\"commentId\":null,\"content\":\"" +
            "开发者平台自动化测试：针对帖子发表评论" +
            "\",\"images\":\"\",\"time\":\"2017-10-15 18:09:56\",\"userId\":\"61028f94-de92-4c65-aad3-2fc8614e1d34\",\"userName\":\"devautotest\",\"commentNum\":0,\"status\":0}}";
    
    //System.out.println(str);
    String str2 = format(str);
    System.out.println(str2);
  }
  
}
