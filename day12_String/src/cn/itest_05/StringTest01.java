package cn.itest_05;
/*
 * ���ַ���������ĸתΪ��д����Сд
 */
public class StringTest01 {
	public static void main(String[] args) {
		String s = "heLLoWorld";
		String a = s.toLowerCase();
		//System.out.println(a);
		char b = a.charAt(0);
		//System.out.println(b);
		String c = String.valueOf(b);
		String e = c.toUpperCase();
		String d = a.substring(1);
		System.out.println(e.concat(d));
	}
}
