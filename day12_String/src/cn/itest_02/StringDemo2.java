package cn.itest_02;

public class StringDemo2 {
	public static void main(String[] args) {
		String s2 = new String("hello");
		String s1 = "hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
