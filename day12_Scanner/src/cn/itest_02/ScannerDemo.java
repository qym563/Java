package cn.itest_02;
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
		int x = sc.nextInt();
		System.out.println("x"+x);
	}
}
