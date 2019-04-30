package testaction;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import testaction.DXPAction;
import org.junit.Assert;

import com.dtdream.dtp.apirunner.common.DtConstants;

public class GateAction extends DXPAction {
    public GateAction() {
    }

	//包装接口
    public String getGates() throws Exception {
        String result = this.send(projectUrl + "/gates/", DtConstants.HTTP_REQ_METHOD_GET, "", contentType, accept);
        return result;
    }

    public String getGate(String gateId) throws Exception {
        String result = this.send(this.projectUrl + "/gates/" + gateId, "GET", "", this.contentType, this.accept);
        return result;
    }

	//增加API
    public String createGate(String name, String host, String port) throws Exception {
        JSONObject object = new JSONObject();
        object.put("name", name);
        object.put("host", host);
        object.put("port", port);
        String result = this.send(this.projectUrl + "/gates/", "POST", object.toJSONString(), this.contentType, this.accept);
        return result;
    }
	//删除API
    public String deleteGate(String gateId) throws Exception {
        String result = this.send(this.projectUrl + "/gates/" + gateId, "DELETE", "", this.contentType, this.accept);
        return result;
    }

    //修改API
    public String updateGate(String oldGate, String name) throws Exception {
        JSONObject object = JSON.parseObject(oldGate);
        String gateId = object.getString("gateuuid");
        String port = object.getString("port");
        object.put("name", name);
        object.put("gateId", gateId);
        object.put("port", port);
        String result = this.send(this.projectUrl + "/gates/", "PUT", object.toJSONString(), this.contentType, this.accept);
        return result;
    }

    //查询API数量
    public int getCount() throws Exception {
        String resultGates = this.getGates();
        return JSONObject.parseObject(resultGates).getJSONObject("data").getJSONArray("gates").size();
    }

   //检查所创建的是否成功
/*    public String checkGateInfo(String gateId, String name, String host) throws Exception {
        String resultGetGateInfo = this.getGate(gateId);
        System.out.println("resultGetGateInfo" + resultGetGateInfo);
        JSONObject readInfo = JSONObject.parseObject(resultGetGateInfo);
        Assert.assertEquals("Success", readInfo.getString("code"));
        JSONObject gate = readInfo.getJSONObject("data").getJSONObject("gate");
        Assert.assertEquals(name, gate.getString("name"));
        Assert.assertEquals(host, gate.getString("host"));
        return gate.toString();
    }*/


    //检查所创建的是否成功，//新增port端口的检查
    public String checkGateInfo(String gateId, String name, String host, String port) throws Exception {
        String resultGetGateInfo = this.getGate(gateId);
        System.out.println("resultGetGateInfo" + resultGetGateInfo);
        Assert.assertEquals("Success", this.getJsonValue(resultGetGateInfo, "code"));
        String dataStr = this.getJsonValue(resultGetGateInfo,"data");
        String gateStr = this.getJsonValue(dataStr,"gate");
        Assert.assertEquals(name, this.getJsonValue(gateStr, "name"));
        Assert.assertEquals(host, this.getJsonValue(gateStr, "host"));
        Assert.assertEquals(port, this.getJsonValue(gateStr, "port"));
        return gateStr.toString();
    }


    //六步验证
    public void testOneGate(String name, String host, String port) throws Exception {
		//打印新建的网关的名称和ip
        System.out.println("**************************");
        System.out.println(" name = " + name + " host = " + host + " port = " + port);
        System.out.println("**************************");
		//请求网关返回结果
        String resultCreateGate = this.createGate(name, host, port);
        System.out.println("resultCreateGate = " + resultCreateGate);
        //1 增加一条
        JSONObject createInfo = JSONObject.parseObject(resultCreateGate);
        Assert.assertEquals("Success", createInfo.getString("code"));
        String gateId = createInfo.getJSONObject("data").getString("id");
        //2 检查能查询到该条
        String gate = this.checkGateInfo(gateId,name,host,port);

        //3 修改该条
        String resultUpdateGate = this.updateGate(gate, "update_gate");
        System.out.println("resultUpdateGate" + resultUpdateGate);
        JSONObject updateInfo = JSONObject.parseObject(resultUpdateGate);
        Assert.assertEquals("Success", updateInfo.getString("code"));//需要追加检查

        //4 检查能正确查询到修改后
        this.checkGateInfo(gateId, "update_gate", host, port);//新增port端口的检查

        //5 删除该条
        String resultDeletePool = this.deleteGate(gateId);
        System.out.println("resultDeletePool" + resultDeletePool);
	    JSONObject delInfo = JSONObject.parseObject(resultCreateGate);
        Assert.assertEquals("Success", delInfo.getString("code"));//需要追加检查


        //6 检查查询不到该条
        String resultGetGateError = this.getGate(gateId);
        JSONObject delGetGateInfo = JSONObject.parseObject(resultGetGateError);
        Assert.assertEquals("NotFound", delGetGateInfo.getString("code"));
    }
}