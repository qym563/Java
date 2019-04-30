//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package testcase;

import org.junit.Test;
import testaction.GateAction;

public class GateBvtCase extends GateAction {

    @Test
    public void test01() throws Exception {
        String name = "gate241";
        String host = "192.168.135.241";
        String port = "8443";
        this.testOneGate(name, host, port);
    }
}
