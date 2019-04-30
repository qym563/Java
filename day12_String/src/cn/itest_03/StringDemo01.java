package cn.itest_03;
/*
 *  模拟登录，给三次机会，并提示还有几次； 
 *  分析：
 *  A:定义用户和密码，已存在的；
 *  B:键盘录入用户名和密码;
 *  C:比较用户名和密码。
 *  	如果都相同，则登录成功
 *  	如果有一个不同，则登录失败
 *  D:给三次机会，用循环改进，最好用for循环
 *
 */
import java.util.Scanner;
public class StringDemo01 {
	public static void main(String[] args) {
		String name = "qym";
		String passwd = "123456";

		for(int x=0;x<3;x++) { 
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名:");
			String n = sc.nextLine();
			String nameinput = new String(n);
			System.out.println("请输入密码:");
			String p = sc.nextLine();
			String passwdinput = p;
			if(name.equals(nameinput) & passwd.equals(passwdinput)) {
				System.out.println("成功登录");
				break;
			}else {
				//2,1,0
				if(2-x==0){
					System.out.println("账号被锁");
				}else {
				System.out.println("登录失败,你还有"+(2-x)+"次机会");
				}
			}
		}
	}
}

