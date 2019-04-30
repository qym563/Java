package cn.itest_01;
/**
 * 
 * Scanner:用于接收键盘录入数据
 *
 */
		
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
		int x = sc.nextInt();
		System.out.println("x"+x);
		}else {
			System.out.println("您输入的数据有误");
		}
	}
}
