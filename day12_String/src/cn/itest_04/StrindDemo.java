package cn.itest_04;

public class StrindDemo {
	public static void main(String[] args) {
		String s = "helloworld";
		System.out.println(s.length());
		System.out.println(s.charAt(7));
		System.out.println(s.indexOf('l'));
		System.out.println(s.indexOf("owo"));
		System.out.println(s.indexOf('l',4));
		System.out.println(s.indexOf('l',40));
		System.out.println(s.indexOf("rl",2));
		System.out.println(s.substring(5));
		System.out.println(s.substring(5, 7));
	}
}
