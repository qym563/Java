package cn.itest_05;

public class StringDemo02 {
	public static void main(String[] args) {
		String a = "HellowoRlD";
		String b = a.substring(0,1);
		String c= a.substring(1);
		System.out.println(b+":"+c);
		String d = b.toUpperCase();
		String e = c.toLowerCase();
		System.out.println(d.concat(e));
		String resule = a.substring(0,1).toUpperCase().concat(a.substring(1).toLowerCase());
		System.out.println(resule);
	}
}
