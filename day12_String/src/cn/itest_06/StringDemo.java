package cn.itest_06;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		
		String s2 = s1.replace('l','k');
		String s3 = s1.replace("he","qym");
		System.out.println(s2);
		System.out.println(s3);
		String s4 = " hello ";

		System.out.println(s4.trim());
		String s5 ="abc";
		String s6 ="abc";
		System.out.println(s5.compareTo(s6));
		
	}
}
