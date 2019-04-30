package cn.itest_01;
/*
 * 正则表达式
 * 是指用来匹配或者匹配一系列符合某个语句法则的字符串
 */
import java.util.Scanner;
public class RegexDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个QQ号");
		String qq = sc.nextLine();
		
	}
	public static boolean checkQQ(String qq) {
		String regex = "[1-9][0-9][4,14]";
		boolean flag = qq.matches(regex);
		return flag;
	}
}
