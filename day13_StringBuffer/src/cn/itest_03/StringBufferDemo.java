package cn.itest_03;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("java");
		//sb.deleteCharAt(1);
		//System.out.println(sb);
		//sb.delete(5,10);
		sb.delete(0,sb.length());
		System.out.println(sb);
	}
}
