package cn.itest_01;
/*
 * ������ʽ
 * ��ָ����ƥ�����ƥ��һϵ�з���ĳ����䷨����ַ���
 */
import java.util.Scanner;
public class RegexDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��QQ��");
		String qq = sc.nextLine();
		
	}
	public static boolean checkQQ(String qq) {
		String regex = "[1-9][0-9][4,14]";
		boolean flag = qq.matches(regex);
		return flag;
	}
}
