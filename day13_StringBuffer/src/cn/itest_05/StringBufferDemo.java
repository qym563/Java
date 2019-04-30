package cn.itest_05;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("œº«‡¡÷∞ÆŒ“");
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
}
