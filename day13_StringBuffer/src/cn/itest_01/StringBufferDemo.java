package cn.itest_01;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		StringBuffer sb2 = new StringBuffer(5);
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length()); 
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println(sb3);
		System.out.println(sb3.capacity());
		System.out.println(sb3.length()); 
	}
}
