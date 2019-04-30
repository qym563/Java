package cn.itest_06;

public class IntegerDemo {
	public static void main(String[] args) {
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1.equals(i2));
		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		Integer i5 = 127;
		Integer i6 = 127;
		System.out.println(i5==i6);
		System.out.println(i5.equals(i6));
		
	}
}