package cn.itest_01;
import java.util.Scanner;
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄãµÄQQºÅÂë");
		String qq = sc.nextLine();
		boolean a = checkQQ(qq);
		System.out.println(a);
	}
	public static boolean checkQQ(String qq) {
		boolean flag =true;
		if(qq.length()>=5 && qq.length()<=15) {
			if(!qq.startsWith("0")) {
				char [] chs=qq.toCharArray();
				for (int x=0;x<chs.length;x++) {
					char ch = chs[x];
					if(!Character.isDigit(ch)) {
						flag = false;
						break;
					}
				}
		}else {
			flag = false;
		}
		}
		return flag;
	} 
}
