package cn.itest_03;

public class IntegerDemo {
	public static void main(String[] args) {
		int number = 100;
		//int ->String
		String s1 = ""+number;
		System.out.println(s1);
		String s2 = "100";
		String s3 = String.valueOf(number);
		System.out.println(s3);
		//String ->int
		//String->Integer->int
		String s = "100";
		Integer i = new Integer(s);
		int x = i.intValue();
		System.out.println(x);
		int y = Integer.parseInt(s);
		System.out.println(y);
	}
}
