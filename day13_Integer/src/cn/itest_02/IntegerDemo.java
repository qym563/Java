package cn.itest_02;

public class IntegerDemo {
	public static void main(String[] args) {
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println(ii);
		//String s = "100";
		String s = "abc";
		Integer iii = new Integer(s);
		System.out.println(iii);
	}
}
