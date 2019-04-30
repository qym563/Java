package cn.itest_01;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println("s1:"+s1);
		System.out.println(s1.length());
		byte [] bys = {97,98,99,100,101};
		String s2 = new String(bys);
		System.out.println(s2);
		System.out.println(s2.length());
		String s3 = new String(bys,1,3);
		System.out.println(s3); 
		System.out.println(s3.length());
		char[] chs = {'a','b','c','d','e','°®'};  
		String s4 = new String(chs);
		System.out.println(s4);
		String s5 = new String(chs,1,4);
		System.out.println(s5);
		String s6 = new String("abcde");
		System.out.println(s6);
	}
}
