/*
 * �ַ�����ת
 * ����������¼�� "a,b,c"
 * ��������"c,b,a"
 * 
 * 
 */
package cn.test_07;
import java.util.Scanner;

public class StringDemo03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�:");
		String s = sc.nextLine();
		String result = "";
		char [] line = s.toCharArray();
		for(int x=s.length()-1;x>=0;x--) {
			result+=line[x];
		}
		System.out.println(result);
	}
}
