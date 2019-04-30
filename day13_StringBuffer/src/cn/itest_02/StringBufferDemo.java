package cn.itest_02;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		//StringBuffer sb2 = sb.append("hello");
		//System.out.println(sb+":"+sb2); 
		sb.append("hello").append(true).append(12).append("w");
		System.out.println(sb);
		sb.insert(6,"world");
		System.out.println(sb);
	}
}
