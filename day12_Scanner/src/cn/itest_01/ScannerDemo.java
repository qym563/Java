package cn.itest_01;
/**
 * 
 * Scanner:���ڽ��ռ���¼������
 *
 */
		
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
		int x = sc.nextInt();
		System.out.println("x"+x);
		}else {
			System.out.println("���������������");
		}
	}
}
