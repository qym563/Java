package testaction;

import com.jayway.jsonpath.internal.JsonFormatter;
import test0common.ApiRunnerCommon;

public class DXPAction extends ApiRunnerCommon {
	public String projectUrl = "http://192.168.135.239:7374/api/v2";
	public String contentType = "application/json;charset=UTF-8";
	public String accept = "application/json";

	public DXPAction() {
	}

	public String formatPrint(String result) {
		return JsonFormatter.prettyPrint(result);
	}
}
