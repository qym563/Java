/*
 * �ַ�����ת
 * ����������¼�� "a,b,c"
 * ��������"c,b,a"
 * 
 * 
 */
package cn.test_07;
import java.util.Scanner;

public class StringTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�:");
		String line = sc.nextLine();
		String s1 = getNum(line);
		System.out.println(s1);
	}
		public static String getNum(String line) { 
		String result = "";
		char [] ch = line.toCharArray();
		for(int x=ch.length-1;x>=0;x--) {
			result+=ch[x];
			}
		return result;
		}
		

}
