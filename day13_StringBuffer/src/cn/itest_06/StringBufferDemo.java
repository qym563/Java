package cn.itest_06;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("java");
		String s = sb.substring(5);
		System.out.println(s);
		System.out.println(sb);
	}
}
