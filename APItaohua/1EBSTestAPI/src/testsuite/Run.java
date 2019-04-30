//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package testsuite;

import java.util.Iterator;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Run {
    public Run() {
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(new Class[]{DXPBvtSuite.class});
        Iterator var2 = result.getFailures().iterator();

        while(var2.hasNext()) {
            Failure fail = (Failure)var2.next();
            System.out.println("失败数量 : " + result.getFailureCount());
            System.out.println(fail.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("All tests run successfully...");
            System.out.println("执行结果 : " + result.wasSuccessful());
            System.out.println("执行时间 : " + result.getRunTime() / 1000L + " 秒");
            System.out.println("执行数量 : " + result.getRunCount());
            System.out.println("忽略数量 : " + result.getIgnoreCount());
        }

    }
}
